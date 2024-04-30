/* Generated by camel build tools - do NOT edit this file! */
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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform queries and other operations on Elasticsearch or OpenSearch (uses
 * low-level client).
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ElasticsearchRestClientEndpointBuilderFactory {

    /**
     * Builder for endpoint for the Elasticsearch Low level Rest Client component.
     */
    public interface ElasticsearchRestClientEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedElasticsearchRestClientEndpointBuilder advanced() {
            return (AdvancedElasticsearchRestClientEndpointBuilder) this;
        }

        /**
         * Connection timeout.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 30000
         * Group: producer
         * 
         * @param connectionTimeout the value to set
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder connectionTimeout(int connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Connection timeout.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 30000
         * Group: producer
         * 
         * @param connectionTimeout the value to set
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder connectionTimeout(String connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * List of host Addresses, multiple hosts can be separated by comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param hostAddressesList the value to set
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder hostAddressesList(String hostAddressesList) {
            doSetProperty("hostAddressesList", hostAddressesList);
            return this;
        }
        /**
         * Index Name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param indexName the value to set
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder indexName(String indexName) {
            doSetProperty("indexName", indexName);
            return this;
        }
        /**
         * Operation.
         * 
         * The option is a:
         * <code>org.apache.camel.component.elasticsearch.rest.client.ElasticsearchRestClientOperation</code> type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder operation(org.apache.camel.component.elasticsearch.rest.client.ElasticsearchRestClientOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Operation.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.elasticsearch.rest.client.ElasticsearchRestClientOperation</code> type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Socket timeout.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 30000
         * Group: producer
         * 
         * @param socketTimeout the value to set
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder socketTimeout(int socketTimeout) {
            doSetProperty("socketTimeout", socketTimeout);
            return this;
        }
        /**
         * Socket timeout.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 30000
         * Group: producer
         * 
         * @param socketTimeout the value to set
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder socketTimeout(String socketTimeout) {
            doSetProperty("socketTimeout", socketTimeout);
            return this;
        }
        /**
         * Certificate Path.
         * 
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param certificatePath the value to set
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder certificatePath(String certificatePath) {
            doSetProperty("certificatePath", certificatePath);
            return this;
        }
        /**
         * Password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param user the value to set
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder user(String user) {
            doSetProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Elasticsearch Low level Rest Client component.
     */
    public interface AdvancedElasticsearchRestClientEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ElasticsearchRestClientEndpointBuilder basic() {
            return (ElasticsearchRestClientEndpointBuilder) this;
        }

        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedElasticsearchRestClientEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedElasticsearchRestClientEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Enabling Sniffer.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param enableSniffer the value to set
         * @return the dsl builder
         */
        default AdvancedElasticsearchRestClientEndpointBuilder enableSniffer(boolean enableSniffer) {
            doSetProperty("enableSniffer", enableSniffer);
            return this;
        }
        /**
         * Enabling Sniffer.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param enableSniffer the value to set
         * @return the dsl builder
         */
        default AdvancedElasticsearchRestClientEndpointBuilder enableSniffer(String enableSniffer) {
            doSetProperty("enableSniffer", enableSniffer);
            return this;
        }
        /**
         * Rest Client of type org.elasticsearch.client.RestClient. This is only
         * for advanced usage.
         * 
         * The option is a: <code>org.elasticsearch.client.RestClient</code>
         * type.
         * 
         * Group: advanced
         * 
         * @param restClient the value to set
         * @return the dsl builder
         */
        default AdvancedElasticsearchRestClientEndpointBuilder restClient(org.elasticsearch.client.RestClient restClient) {
            doSetProperty("restClient", restClient);
            return this;
        }
        /**
         * Rest Client of type org.elasticsearch.client.RestClient. This is only
         * for advanced usage.
         * 
         * The option will be converted to a
         * <code>org.elasticsearch.client.RestClient</code> type.
         * 
         * Group: advanced
         * 
         * @param restClient the value to set
         * @return the dsl builder
         */
        default AdvancedElasticsearchRestClientEndpointBuilder restClient(String restClient) {
            doSetProperty("restClient", restClient);
            return this;
        }
        /**
         * Sniffer after failure delay (in millis).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 60000
         * Group: advanced
         * 
         * @param sniffAfterFailureDelay the value to set
         * @return the dsl builder
         */
        default AdvancedElasticsearchRestClientEndpointBuilder sniffAfterFailureDelay(int sniffAfterFailureDelay) {
            doSetProperty("sniffAfterFailureDelay", sniffAfterFailureDelay);
            return this;
        }
        /**
         * Sniffer after failure delay (in millis).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 60000
         * Group: advanced
         * 
         * @param sniffAfterFailureDelay the value to set
         * @return the dsl builder
         */
        default AdvancedElasticsearchRestClientEndpointBuilder sniffAfterFailureDelay(String sniffAfterFailureDelay) {
            doSetProperty("sniffAfterFailureDelay", sniffAfterFailureDelay);
            return this;
        }
        /**
         * Sniffer interval (in millis).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 60000
         * Group: advanced
         * 
         * @param snifferInterval the value to set
         * @return the dsl builder
         */
        default AdvancedElasticsearchRestClientEndpointBuilder snifferInterval(int snifferInterval) {
            doSetProperty("snifferInterval", snifferInterval);
            return this;
        }
        /**
         * Sniffer interval (in millis).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 60000
         * Group: advanced
         * 
         * @param snifferInterval the value to set
         * @return the dsl builder
         */
        default AdvancedElasticsearchRestClientEndpointBuilder snifferInterval(String snifferInterval) {
            doSetProperty("snifferInterval", snifferInterval);
            return this;
        }
    }

    public interface ElasticsearchRestClientBuilders {
        /**
         * Elasticsearch Low level Rest Client (camel-elasticsearch-rest-client)
         * Perform queries and other operations on Elasticsearch or OpenSearch
         * (uses low-level client).
         * 
         * Category: search
         * Since: 4.3
         * Maven coordinates: org.apache.camel:camel-elasticsearch-rest-client
         * 
         * Syntax: <code>elasticsearch-rest-client:clusterName</code>
         * 
         * Path parameter: clusterName (required)
         * Cluster Name
         * 
         * @param path clusterName
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder elasticsearchRestClient(String path) {
            return ElasticsearchRestClientEndpointBuilderFactory.endpointBuilder("elasticsearch-rest-client", path);
        }
        /**
         * Elasticsearch Low level Rest Client (camel-elasticsearch-rest-client)
         * Perform queries and other operations on Elasticsearch or OpenSearch
         * (uses low-level client).
         * 
         * Category: search
         * Since: 4.3
         * Maven coordinates: org.apache.camel:camel-elasticsearch-rest-client
         * 
         * Syntax: <code>elasticsearch-rest-client:clusterName</code>
         * 
         * Path parameter: clusterName (required)
         * Cluster Name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path clusterName
         * @return the dsl builder
         */
        default ElasticsearchRestClientEndpointBuilder elasticsearchRestClient(String componentName, String path) {
            return ElasticsearchRestClientEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    static ElasticsearchRestClientEndpointBuilder endpointBuilder(String componentName, String path) {
        class ElasticsearchRestClientEndpointBuilderImpl extends AbstractEndpointBuilder implements ElasticsearchRestClientEndpointBuilder, AdvancedElasticsearchRestClientEndpointBuilder {
            public ElasticsearchRestClientEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ElasticsearchRestClientEndpointBuilderImpl(path);
    }
}