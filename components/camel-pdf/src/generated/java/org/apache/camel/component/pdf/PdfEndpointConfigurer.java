/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.pdf;

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
public class PdfEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        PdfEndpoint target = (PdfEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "font": target.getPdfConfiguration().setFont(property(camelContext, java.lang.String.class, value)); return true;
        case "fontsize":
        case "fontSize": target.getPdfConfiguration().setFontSize(property(camelContext, float.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "marginbottom":
        case "marginBottom": target.getPdfConfiguration().setMarginBottom(property(camelContext, int.class, value)); return true;
        case "marginleft":
        case "marginLeft": target.getPdfConfiguration().setMarginLeft(property(camelContext, int.class, value)); return true;
        case "marginright":
        case "marginRight": target.getPdfConfiguration().setMarginRight(property(camelContext, int.class, value)); return true;
        case "margintop":
        case "marginTop": target.getPdfConfiguration().setMarginTop(property(camelContext, int.class, value)); return true;
        case "pagesize":
        case "pageSize": target.getPdfConfiguration().setPageSize(property(camelContext, java.lang.String.class, value)); return true;
        case "textprocessingfactory":
        case "textProcessingFactory": target.getPdfConfiguration().setTextProcessingFactory(property(camelContext, org.apache.camel.component.pdf.TextProcessingFactory.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "font": return java.lang.String.class;
        case "fontsize":
        case "fontSize": return float.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "marginbottom":
        case "marginBottom": return int.class;
        case "marginleft":
        case "marginLeft": return int.class;
        case "marginright":
        case "marginRight": return int.class;
        case "margintop":
        case "marginTop": return int.class;
        case "pagesize":
        case "pageSize": return java.lang.String.class;
        case "textprocessingfactory":
        case "textProcessingFactory": return org.apache.camel.component.pdf.TextProcessingFactory.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        PdfEndpoint target = (PdfEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "font": return target.getPdfConfiguration().getFont();
        case "fontsize":
        case "fontSize": return target.getPdfConfiguration().getFontSize();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "marginbottom":
        case "marginBottom": return target.getPdfConfiguration().getMarginBottom();
        case "marginleft":
        case "marginLeft": return target.getPdfConfiguration().getMarginLeft();
        case "marginright":
        case "marginRight": return target.getPdfConfiguration().getMarginRight();
        case "margintop":
        case "marginTop": return target.getPdfConfiguration().getMarginTop();
        case "pagesize":
        case "pageSize": return target.getPdfConfiguration().getPageSize();
        case "textprocessingfactory":
        case "textProcessingFactory": return target.getPdfConfiguration().getTextProcessingFactory();
        default: return null;
        }
    }
}

