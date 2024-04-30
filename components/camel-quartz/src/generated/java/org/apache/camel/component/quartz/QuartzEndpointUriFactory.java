/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.quartz;

import javax.annotation.processing.Generated;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateEndpointUriFactoryMojo")
public class QuartzEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":groupName/triggerName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(19);
        props.add("autoStartScheduler");
        props.add("bridgeErrorHandler");
        props.add("cron");
        props.add("customCalendar");
        props.add("deleteJob");
        props.add("durableJob");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("groupName");
        props.add("ignoreExpiredNextFireTime");
        props.add("jobParameters");
        props.add("pauseJob");
        props.add("prefixJobNameWithEndpointId");
        props.add("recoverableJob");
        props.add("stateful");
        props.add("triggerName");
        props.add("triggerParameters");
        props.add("triggerStartDelay");
        props.add("usingFixedCamelContextName");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        Set<String> prefixes = new HashSet<>(2);
        prefixes.add("job.");
        prefixes.add("trigger.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "quartz".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "groupName", "Camel", false, copy);
        uri = buildPathParameter(syntax, uri, "triggerName", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

