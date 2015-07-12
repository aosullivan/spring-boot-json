package org.adrian;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;


@Provider
public class MyJacksonJsonProvider extends JacksonJsonProvider {

	@Override
	public void writeTo(Object value, Class<?> type, Type genericType, Annotation[] annotations, 
            MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) 
            throws IOException 
		{
			ObjectMapper mapper = locateMapper( type, mediaType);

	        //mapper.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
			DateObjectMapperProvider.dateFormat.setLenient(false);
			
	        mapper.setDateFormat(DateObjectMapperProvider.dateFormat);  
	        mapper.configure(Feature.WRITE_DATES_AS_TIMESTAMPS, false);

	        super.writeTo(value, type, genericType, annotations, mediaType, httpHeaders, entityStream);
	    }

	
}