package org.sms.core.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonUtils {
	private static ObjectMapper mapper = null;

	private static ObjectMapper getObjectMapper() {
		if (JsonUtils.mapper == null) {
			mapper = new ObjectMapper();
		}
		return JsonUtils.mapper;
	}

	public static String serialize(Object value) {

		String json = null;
		try {
			json = getObjectMapper().writeValueAsString(value);
		} catch (IOException e) {
			return null;
		}
		return json;

	}

	public static <T> T deserialize(String json, Class<T> valueType) {

		if (json == null)
			return null;

		getObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		T object = null;
		try {
			object = getObjectMapper().readValue(json, valueType);
		} catch (IOException e) {
		} catch (IllegalArgumentException e) {
			return null;
		}
		return object;

	}

	public static <T> T deserialize(String json, TypeReference<T> valueTypeRef) {

		if (json == null)
			return null;

		getObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		T object = null;
		try {
			object = getObjectMapper().readValue(json, valueTypeRef);
		} catch (IOException e) {
			return null;
		}
		return object;

	}

	public static List<HashMap<String, Object>> makeJsonArrayByByte(byte[] data) {
		TypeReference<List<HashMap<String, Object>>> reference = new TypeReference<List<HashMap<String, Object>>>() {
		};
		try {
			return getObjectMapper().readValue(data, reference);
		} catch (JsonParseException e) {
		} catch (JsonMappingException e) {
		} catch (IOException e) {
		}
		return null;
	}

	public static HashMap<String, Object> makeJsonByByte(byte[] data) {
		TypeReference<HashMap<String, Object>> reference = new TypeReference<HashMap<String, Object>>() {
		};
		try {
			return getObjectMapper().readValue(data, reference);
		} catch (JsonParseException e) {
		} catch (JsonMappingException e) {
		} catch (IOException e) {
		}
		return null;
	}
}
