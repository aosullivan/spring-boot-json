package sample.jersey1;

import java.text.DateFormat;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.datatype.joda.JodaMapper;

@Provider
public class MyObjectMapperProvider implements ContextResolver<ObjectMapper> {
    private final static DateFormat dateFormat = new ISO8601DateFormat();

    @Override
    public ObjectMapper getContext(Class<?> type) {
        final ObjectMapper result = new JodaMapper();
        result.setDateFormat(dateFormat);
        return result;
    }

}