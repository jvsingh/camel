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
package org.apache.camel.processor;

import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spi.DataType;
import org.apache.camel.spi.Transformer;

public class TransformDataTypeProcessorTest extends TransformViaDSLTest {

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                transformer().name("myDataType").withJava(MyDataTypeTransformer.class);
                // START SNIPPET: example
                from("direct:start").transform(new DataType("myDataType")).to("mock:result");
                // END SNIPPET: example
            }
        };
    }

    public static class MyDataTypeTransformer extends Transformer {

        @Override
        public void transform(Message message, DataType from, DataType to) {
            message.setBody(message.getBody(String.class) + " World!");
        }
    }
}
