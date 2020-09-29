package by.pvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

public class SampleTest {

	@Test
	public void testSampleCode() {

		SampleCode sample = new SampleCode();

		assertEquals("string1", sample.add1("string"));

	}

	@Test
	public void testSampleToJson() throws JsonProcessingException {

		SampleCode sample = new SampleCode();

		SampleDataObject sampleDataObject = new SampleDataObject("test", 1);

		String json = sample.toJson(sampleDataObject);

		assertEquals("{\"name\":\"test\",\"number\":1}", json);

	}

}
