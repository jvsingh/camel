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
package org.apache.camel.component.mock;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.PredicateBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;

public class MockPredicateTest extends ContextTestSupport {

    @Test
    public void testMockPredicate() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:foo");
        mock.message(0).predicate().header("foo");

        mock.expectedMessageCount(1);

        template.sendBodyAndHeader("direct:start", "Hello World", "foo", "bar");

        assertMockEndpointsSatisfied();
    }

    @Test
    public void testMockPredicateAsParameter() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:foo");
        mock.message(0).predicate(PredicateBuilder.isNotNull(header("foo")));

        mock.expectedMessageCount(1);

        template.sendBodyAndHeader("direct:start", "Hello World", "foo", "bar");

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:start").to("mock:foo");
            }
        };
    }
}
