/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.impl.console;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.impl.console.ThreadDevConsole;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class ThreadDevConsoleConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.impl.console.ThreadDevConsole target = (org.apache.camel.impl.console.ThreadDevConsole) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "camelcontext":
        case "camelContext": target.setCamelContext(property(camelContext, org.apache.camel.CamelContext.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "camelcontext":
        case "camelContext": return org.apache.camel.CamelContext.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.impl.console.ThreadDevConsole target = (org.apache.camel.impl.console.ThreadDevConsole) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "camelcontext":
        case "camelContext": return target.getCamelContext();
        default: return null;
        }
    }
}

