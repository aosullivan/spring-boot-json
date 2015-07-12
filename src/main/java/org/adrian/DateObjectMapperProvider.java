package org.adrian;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaMapper;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class DateObjectMapperProvider implements ContextResolver<ObjectMapper> {
	public final static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	private ObjectMapper objectMapper;  
	
	public DateObjectMapperProvider() throws Exception {
		dateFormat.setLenient(false);
		
        //objectMapper.getSerializationConfig().withSerializationInclusion(JsonInclude.Include.NON_NULL);

		objectMapper = new JodaMapper();
		
		objectMapper.setDateFormat(dateFormat);
		
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
	}

	@Override
	public ObjectMapper getContext(Class<?> arg0) {
		return objectMapper;
	}

}