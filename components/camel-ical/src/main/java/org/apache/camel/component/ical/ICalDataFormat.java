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
package org.apache.camel.component.ical;

import java.io.InputStream;
import java.io.OutputStream;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.CalendarOutputter;
import net.fortuna.ical4j.model.Calendar;
import org.apache.camel.Exchange;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.spi.DataFormatName;
import org.apache.camel.spi.annotations.Dataformat;
import org.apache.camel.support.service.ServiceSupport;

/**
 * Bridge ICal data format to camel world.
 */
@Dataformat("ical")
public class ICalDataFormat extends ServiceSupport implements DataFormat, DataFormatName {

    private boolean validating;

    private CalendarOutputter outputer;
    private CalendarBuilder builder;

    @Override
    public String getDataFormatName() {
        return "ical";
    }

    @Override
    public void marshal(Exchange exchange, Object graph, OutputStream stream) throws Exception {
        Calendar calendar = exchange.getContext().getTypeConverter().convertTo(Calendar.class, graph);
        outputer.output(calendar, stream);
    }

    @Override
    public Object unmarshal(Exchange exchange, InputStream stream) throws Exception {
        return builder.build(stream);
    }

    @Override
    protected void doStart() throws Exception {
        outputer = new CalendarOutputter(validating);
        builder = new CalendarBuilder();
    }

    @Override
    protected void doStop() throws Exception {
        // noop
    }

    public void setValidating(boolean validating) {
        this.validating = validating;
    }

    public boolean isValidating() {
        return validating;
    }

}
