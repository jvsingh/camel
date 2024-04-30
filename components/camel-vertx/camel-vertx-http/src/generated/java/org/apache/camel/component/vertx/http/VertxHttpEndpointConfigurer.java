/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vertx.http;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class VertxHttpEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        VertxHttpEndpoint target = (VertxHttpEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicauthpassword":
        case "basicAuthPassword": target.getConfiguration().setBasicAuthPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "basicauthusername":
        case "basicAuthUsername": target.getConfiguration().setBasicAuthUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "bearertoken":
        case "bearerToken": target.getConfiguration().setBearerToken(property(camelContext, java.lang.String.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": target.getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "cookiestore":
        case "cookieStore": target.getConfiguration().setCookieStore(property(camelContext, io.vertx.ext.web.client.spi.CookieStore.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.getConfiguration().setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "httpmethod":
        case "httpMethod": target.getConfiguration().setHttpMethod(property(camelContext, io.vertx.core.http.HttpMethod.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "okstatuscoderange":
        case "okStatusCodeRange": target.getConfiguration().setOkStatusCodeRange(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxypassword":
        case "proxyPassword": target.getConfiguration().setProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxytype":
        case "proxyType": target.getConfiguration().setProxyType(property(camelContext, io.vertx.core.net.ProxyType.class, value)); return true;
        case "proxyusername":
        case "proxyUsername": target.getConfiguration().setProxyUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "responsepayloadasbytearray":
        case "responsePayloadAsByteArray": target.getConfiguration().setResponsePayloadAsByteArray(property(camelContext, boolean.class, value)); return true;
        case "sessionmanagement":
        case "sessionManagement": target.getConfiguration().setSessionManagement(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": target.getConfiguration().setThrowExceptionOnFailure(property(camelContext, boolean.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, long.class, value)); return true;
        case "transferexception":
        case "transferException": target.getConfiguration().setTransferException(property(camelContext, boolean.class, value)); return true;
        case "usecompression":
        case "useCompression": target.getConfiguration().setUseCompression(property(camelContext, boolean.class, value)); return true;
        case "vertxhttpbinding":
        case "vertxHttpBinding": target.getConfiguration().setVertxHttpBinding(property(camelContext, org.apache.camel.component.vertx.http.VertxHttpBinding.class, value)); return true;
        case "webclientoptions":
        case "webClientOptions": target.getConfiguration().setWebClientOptions(property(camelContext, io.vertx.ext.web.client.WebClientOptions.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicauthpassword":
        case "basicAuthPassword": return java.lang.String.class;
        case "basicauthusername":
        case "basicAuthUsername": return java.lang.String.class;
        case "bearertoken":
        case "bearerToken": return java.lang.String.class;
        case "connecttimeout":
        case "connectTimeout": return int.class;
        case "cookiestore":
        case "cookieStore": return io.vertx.ext.web.client.spi.CookieStore.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "httpmethod":
        case "httpMethod": return io.vertx.core.http.HttpMethod.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "okstatuscoderange":
        case "okStatusCodeRange": return java.lang.String.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxypassword":
        case "proxyPassword": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxytype":
        case "proxyType": return io.vertx.core.net.ProxyType.class;
        case "proxyusername":
        case "proxyUsername": return java.lang.String.class;
        case "responsepayloadasbytearray":
        case "responsePayloadAsByteArray": return boolean.class;
        case "sessionmanagement":
        case "sessionManagement": return boolean.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": return boolean.class;
        case "timeout": return long.class;
        case "transferexception":
        case "transferException": return boolean.class;
        case "usecompression":
        case "useCompression": return boolean.class;
        case "vertxhttpbinding":
        case "vertxHttpBinding": return org.apache.camel.component.vertx.http.VertxHttpBinding.class;
        case "webclientoptions":
        case "webClientOptions": return io.vertx.ext.web.client.WebClientOptions.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        VertxHttpEndpoint target = (VertxHttpEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicauthpassword":
        case "basicAuthPassword": return target.getConfiguration().getBasicAuthPassword();
        case "basicauthusername":
        case "basicAuthUsername": return target.getConfiguration().getBasicAuthUsername();
        case "bearertoken":
        case "bearerToken": return target.getConfiguration().getBearerToken();
        case "connecttimeout":
        case "connectTimeout": return target.getConfiguration().getConnectTimeout();
        case "cookiestore":
        case "cookieStore": return target.getConfiguration().getCookieStore();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getConfiguration().getHeaderFilterStrategy();
        case "httpmethod":
        case "httpMethod": return target.getConfiguration().getHttpMethod();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "okstatuscoderange":
        case "okStatusCodeRange": return target.getConfiguration().getOkStatusCodeRange();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxypassword":
        case "proxyPassword": return target.getConfiguration().getProxyPassword();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "proxytype":
        case "proxyType": return target.getConfiguration().getProxyType();
        case "proxyusername":
        case "proxyUsername": return target.getConfiguration().getProxyUsername();
        case "responsepayloadasbytearray":
        case "responsePayloadAsByteArray": return target.getConfiguration().isResponsePayloadAsByteArray();
        case "sessionmanagement":
        case "sessionManagement": return target.getConfiguration().isSessionManagement();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": return target.getConfiguration().isThrowExceptionOnFailure();
        case "timeout": return target.getConfiguration().getTimeout();
        case "transferexception":
        case "transferException": return target.getConfiguration().isTransferException();
        case "usecompression":
        case "useCompression": return target.getConfiguration().isUseCompression();
        case "vertxhttpbinding":
        case "vertxHttpBinding": return target.getConfiguration().getVertxHttpBinding();
        case "webclientoptions":
        case "webClientOptions": return target.getConfiguration().getWebClientOptions();
        default: return null;
        }
    }
}

