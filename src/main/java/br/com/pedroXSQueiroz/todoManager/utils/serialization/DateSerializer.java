package br.com.pedroXSQueiroz.todoManager.utils.serialization;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class DateSerializer extends StdSerializer<Date> {

	public DateSerializer() {
		this(null);
	}
	
	public DateSerializer(Class<Date> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serialize(	Date value, 
							JsonGenerator jgen, 
							SerializerProvider provider) 
							throws IOException {
		// TODO Auto-generated method stub
		
		Locale languageTag = Locale.forLanguageTag("pt-BR");
		DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.DEFAULT, languageTag);
		String localeDateString = dateInstance.format(value);
		
		//jgen.writeStartObject();
		jgen.writeString(localeDateString);
		//jgen.writeEndObject();
	}

}
