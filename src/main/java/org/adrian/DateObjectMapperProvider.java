package org.adrian;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaMapper;

@Provider
public class DateObjectMapperProvider implements ContextResolver<ObjectMapper> {
    private final static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    

    @Override
    public ObjectMapper getContext(Class<?> type) {
        dateFormat.setLenient(false);
        final ObjectMapper result = new JodaMapper();
        result.setDateFormat(dateFormat);
        return result;
    }

}