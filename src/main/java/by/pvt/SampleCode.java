package by.pvt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleCode {

	public String add1(String string) {
		return string.concat("1");
	}

	public String toJson(Object toJson) throws JsonProcessingException {

		return new ObjectMapper().writeValueAsString(toJson);

	}

}
