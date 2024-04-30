/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ical;

import javax.annotation.processing.Generated;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.DeferredContextBinding;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.TypeConverterLoaderGeneratorMojo")
@SuppressWarnings("unchecked")
@DeferredContextBinding
public final class ICalConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public ICalConverterLoader() {
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, java.io.ByteArrayInputStream.class, net.fortuna.ical4j.model.Calendar.class, false,
            (type, exchange, value) -> org.apache.camel.component.ical.ICalConverter.toStream((net.fortuna.ical4j.model.Calendar) value, exchange));
        addTypeConverter(registry, java.util.Date.class, net.fortuna.ical4j.model.property.DateProperty.class, false,
            (type, exchange, value) -> org.apache.camel.component.ical.ICalConverter.toDate((net.fortuna.ical4j.model.property.DateProperty) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) {
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }
}
