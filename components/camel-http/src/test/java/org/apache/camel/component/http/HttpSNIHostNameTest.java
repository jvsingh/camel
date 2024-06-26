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
package org.apache.camel.component.http;

import org.apache.camel.CamelExecutionException;
import org.apache.camel.http.base.HttpOperationFailedException;
import org.apache.camel.test.spring.junit5.CamelSpringTestSupport;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Disabled("Ignored test because of external dependency.")
public class HttpSNIHostNameTest extends CamelSpringTestSupport {

    @Test
    public void testMnotDotNetDoesNotReturnStatusCode421() {
        String result = template.requestBody("direct:goodSNI", null, String.class);
        assertNotNull(result);
    }

    @Test
    public void testMnotDotNetNoSniDoesReturnStatusCode403() {
        try {
            template.requestBody("direct:noSNI", null, String.class);
        } catch (CamelExecutionException e) {
            HttpOperationFailedException cause = (HttpOperationFailedException) e.getCause();
            assertEquals(403, cause.getStatusCode());
        }
    }

    @Test
    public void testMnotDotNetWrongSniDoesReturnStatusCode421() {
        try {
            template.requestBody("direct:wrongSNI", null, String.class);
        } catch (CamelExecutionException e) {
            HttpOperationFailedException cause = (HttpOperationFailedException) e.getCause();
            assertEquals(421, cause.getStatusCode());
        }
    }

    @Override
    protected AbstractApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext(new String[] { "org/apache/camel/component/http/CamelHttpContext.xml" });
    }
}
