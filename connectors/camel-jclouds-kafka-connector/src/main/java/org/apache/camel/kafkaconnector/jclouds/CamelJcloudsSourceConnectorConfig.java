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
package org.apache.camel.kafkaconnector.jclouds;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelJcloudsSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_JCLOUDS_PATH_COMMAND_CONF = "camel.source.path.command";
    public static final String CAMEL_SOURCE_JCLOUDS_PATH_COMMAND_DOC = "What command to execute such as blobstore or compute. One of: [blobstore] [compute]";
    public static final String CAMEL_SOURCE_JCLOUDS_PATH_COMMAND_DEFAULT = null;
    public static final String CAMEL_SOURCE_JCLOUDS_PATH_PROVIDER_ID_CONF = "camel.source.path.providerId";
    public static final String CAMEL_SOURCE_JCLOUDS_PATH_PROVIDER_ID_DOC = "The name of the cloud provider that provides the target service (e.g. aws-s3 or aws_ec2).";
    public static final String CAMEL_SOURCE_JCLOUDS_PATH_PROVIDER_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_JCLOUDS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_JCLOUDS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_JCLOUDS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_CONTAINER_CONF = "camel.source.endpoint.container";
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_CONTAINER_DOC = "The name of the blob container.";
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_CONTAINER_DEFAULT = null;
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_DIRECTORY_CONF = "camel.source.endpoint.directory";
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_DIRECTORY_DOC = "An optional directory name to use";
    public static final String CAMEL_SOURCE_JCLOUDS_ENDPOINT_DIRECTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_JCLOUDS_COMPONENT_BLOB_STORES_CONF = "camel.component.jclouds.blobStores";
    public static final String CAMEL_SOURCE_JCLOUDS_COMPONENT_BLOB_STORES_DOC = "To use the given BlobStore which must be configured when using blobstore.";
    public static final String CAMEL_SOURCE_JCLOUDS_COMPONENT_BLOB_STORES_DEFAULT = null;
    public static final String CAMEL_SOURCE_JCLOUDS_COMPONENT_COMPUTE_SERVICES_CONF = "camel.component.jclouds.computeServices";
    public static final String CAMEL_SOURCE_JCLOUDS_COMPONENT_COMPUTE_SERVICES_DOC = "To use the given ComputeService which must be configured when use compute.";
    public static final String CAMEL_SOURCE_JCLOUDS_COMPONENT_COMPUTE_SERVICES_DEFAULT = null;
    public static final String CAMEL_SOURCE_JCLOUDS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.jclouds.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_JCLOUDS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_JCLOUDS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_JCLOUDS_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.jclouds.basicPropertyBinding";
    public static final String CAMEL_SOURCE_JCLOUDS_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_JCLOUDS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelJcloudsSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelJcloudsSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_JCLOUDS_PATH_COMMAND_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_JCLOUDS_PATH_COMMAND_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_JCLOUDS_PATH_COMMAND_DOC);
        conf.define(CAMEL_SOURCE_JCLOUDS_PATH_PROVIDER_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_JCLOUDS_PATH_PROVIDER_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_JCLOUDS_PATH_PROVIDER_ID_DOC);
        conf.define(CAMEL_SOURCE_JCLOUDS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_JCLOUDS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_JCLOUDS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_JCLOUDS_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_JCLOUDS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_JCLOUDS_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_JCLOUDS_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_JCLOUDS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_JCLOUDS_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_JCLOUDS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_JCLOUDS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_JCLOUDS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_JCLOUDS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_JCLOUDS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_JCLOUDS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_JCLOUDS_ENDPOINT_CONTAINER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_JCLOUDS_ENDPOINT_CONTAINER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_JCLOUDS_ENDPOINT_CONTAINER_DOC);
        conf.define(CAMEL_SOURCE_JCLOUDS_ENDPOINT_DIRECTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_JCLOUDS_ENDPOINT_DIRECTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_JCLOUDS_ENDPOINT_DIRECTORY_DOC);
        conf.define(CAMEL_SOURCE_JCLOUDS_COMPONENT_BLOB_STORES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_JCLOUDS_COMPONENT_BLOB_STORES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_JCLOUDS_COMPONENT_BLOB_STORES_DOC);
        conf.define(CAMEL_SOURCE_JCLOUDS_COMPONENT_COMPUTE_SERVICES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_JCLOUDS_COMPONENT_COMPUTE_SERVICES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_JCLOUDS_COMPONENT_COMPUTE_SERVICES_DOC);
        conf.define(CAMEL_SOURCE_JCLOUDS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_JCLOUDS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_JCLOUDS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_JCLOUDS_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_JCLOUDS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_JCLOUDS_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}