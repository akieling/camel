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

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The flink component can be used to send DataSet jobs to Apache Flink cluster.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FlinkEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Flink component.
     */
    public interface FlinkEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedFlinkEndpointBuilder advanced() {
            return (AdvancedFlinkEndpointBuilder) this;
        }
        /**
         * Indicates if results should be collected or counted.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default FlinkEndpointBuilder collect(boolean collect) {
            doSetProperty("collect", collect);
            return this;
        }
        /**
         * Indicates if results should be collected or counted.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default FlinkEndpointBuilder collect(String collect) {
            doSetProperty("collect", collect);
            return this;
        }
        /**
         * DataSet to compute against.
         * 
         * The option is a: <code>org.apache.flink.api.java.DataSet</code> type.
         * 
         * Group: producer
         */
        default FlinkEndpointBuilder dataSet(Object dataSet) {
            doSetProperty("dataSet", dataSet);
            return this;
        }
        /**
         * DataSet to compute against.
         * 
         * The option will be converted to a
         * <code>org.apache.flink.api.java.DataSet</code> type.
         * 
         * Group: producer
         */
        default FlinkEndpointBuilder dataSet(String dataSet) {
            doSetProperty("dataSet", dataSet);
            return this;
        }
        /**
         * Function performing action against a DataSet.
         * 
         * The option is a:
         * <code>org.apache.camel.component.flink.DataSetCallback</code> type.
         * 
         * Group: producer
         */
        default FlinkEndpointBuilder dataSetCallback(Object dataSetCallback) {
            doSetProperty("dataSetCallback", dataSetCallback);
            return this;
        }
        /**
         * Function performing action against a DataSet.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.flink.DataSetCallback</code> type.
         * 
         * Group: producer
         */
        default FlinkEndpointBuilder dataSetCallback(String dataSetCallback) {
            doSetProperty("dataSetCallback", dataSetCallback);
            return this;
        }
        /**
         * DataStream to compute against.
         * 
         * The option is a:
         * <code>org.apache.flink.streaming.api.datastream.DataStream</code>
         * type.
         * 
         * Group: producer
         */
        default FlinkEndpointBuilder dataStream(Object dataStream) {
            doSetProperty("dataStream", dataStream);
            return this;
        }
        /**
         * DataStream to compute against.
         * 
         * The option will be converted to a
         * <code>org.apache.flink.streaming.api.datastream.DataStream</code>
         * type.
         * 
         * Group: producer
         */
        default FlinkEndpointBuilder dataStream(String dataStream) {
            doSetProperty("dataStream", dataStream);
            return this;
        }
        /**
         * Function performing action against a DataStream.
         * 
         * The option is a:
         * <code>org.apache.camel.component.flink.DataStreamCallback</code>
         * type.
         * 
         * Group: producer
         */
        default FlinkEndpointBuilder dataStreamCallback(
                Object dataStreamCallback) {
            doSetProperty("dataStreamCallback", dataStreamCallback);
            return this;
        }
        /**
         * Function performing action against a DataStream.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.flink.DataStreamCallback</code>
         * type.
         * 
         * Group: producer
         */
        default FlinkEndpointBuilder dataStreamCallback(
                String dataStreamCallback) {
            doSetProperty("dataStreamCallback", dataStreamCallback);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Flink component.
     */
    public interface AdvancedFlinkEndpointBuilder
            extends
                EndpointProducerBuilder {
        default FlinkEndpointBuilder basic() {
            return (FlinkEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedFlinkEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedFlinkEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedFlinkEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedFlinkEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Flink (camel-flink)
     * The flink component can be used to send DataSet jobs to Apache Flink
     * cluster.
     * 
     * Category: hadoop
     * Available as of version: 2.18
     * Maven coordinates: org.apache.camel:camel-flink
     * 
     * Syntax: <code>flink:endpointType</code>
     * 
     * Path parameter: endpointType (required)
     * Type of the endpoint (dataset, datastream).
     * The value can be one of: dataset, datastream
     */
    default FlinkEndpointBuilder flink(String path) {
        class FlinkEndpointBuilderImpl extends AbstractEndpointBuilder implements FlinkEndpointBuilder, AdvancedFlinkEndpointBuilder {
            public FlinkEndpointBuilderImpl(String path) {
                super("flink", path);
            }
        }
        return new FlinkEndpointBuilderImpl(path);
    }
}