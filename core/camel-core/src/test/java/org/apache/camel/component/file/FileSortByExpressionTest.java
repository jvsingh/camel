/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.file;

import java.util.concurrent.TimeUnit;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

/**
 * Unit test for the file sort by expression
 */
public class FileSortByExpressionTest extends ContextTestSupport {

    private void prepareFolder(String folder) {
        template.sendBodyAndHeader(fileUri(folder), "Hello Paris", Exchange.FILE_NAME, "paris.dat");

        template.sendBodyAndHeader(fileUri(folder), "Hello London", Exchange.FILE_NAME, "london.txt");

        template.sendBodyAndHeader(fileUri(folder), "Hello Copenhagen", Exchange.FILE_NAME,
                "copenhagen.xml");
    }

    @Test
    public void testSortFiles() throws Exception {
        prepareFolder("a");

        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() {
                from(fileUri("a/?initialDelay=0&delay=10&sortBy=file:ext")).to("mock:result");
            }
        });

        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Hello Paris", "Hello London", "Hello Copenhagen");

        // wait a bit for the file processing to complete
        assertMockEndpointsSatisfied(1, TimeUnit.SECONDS);
    }

    @Test
    public void testSortFilesReverse() throws Exception {
        prepareFolder("b");

        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() {
                from(fileUri("b/?initialDelay=0&delay=10&sortBy=reverse:file:ext")).convertBodyTo(String.class)
                        .to("mock:reverse");
            }
        });

        MockEndpoint reverse = getMockEndpoint("mock:reverse");
        reverse.expectedBodiesReceived("Hello Copenhagen", "Hello London", "Hello Paris");

        // wait a bit for the file processing to complete
        assertMockEndpointsSatisfied(1, TimeUnit.SECONDS);
    }

}
