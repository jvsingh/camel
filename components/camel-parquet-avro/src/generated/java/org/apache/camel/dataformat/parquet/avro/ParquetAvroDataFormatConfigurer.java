/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.dataformat.parquet.avro;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.PackageDataFormatMojo")
@SuppressWarnings("unchecked")
public class ParquetAvroDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        ParquetAvroDataFormat dataformat = (ParquetAvroDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "unmarshaltype":
        case "unmarshalType": dataformat.setUnmarshalType(property(camelContext, java.lang.Class.class, value)); return true;
        case "lazyload":
        case "lazyLoad": dataformat.setLazyLoad(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

