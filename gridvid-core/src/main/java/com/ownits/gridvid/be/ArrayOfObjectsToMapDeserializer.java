package com.ownits.gridvid.be;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * 
 * @author gumatias
 *
 */
public class ArrayOfObjectsToMapDeserializer implements JsonDeserializer<Map<String, String>> {

	public Map<String, String> deserialize(JsonElement pJson, Type pTypeOfT, JsonDeserializationContext pContext) throws JsonParseException {
		Map<String, String> oResult = new HashMap<String, String>();

		JsonArray oArray = pJson.getAsJsonArray();
		for (JsonElement oElement : oArray) {
			JsonObject oObject = oElement.getAsJsonObject();
			// This does not check if the objects only have one property, so JSON
			// like [{a:b,c:d}{e:f}] will become a Map like {a:b,c:d,e:f} as well.
			for (Entry<String, JsonElement> oEntry : oObject.entrySet()) {
				String oKey = oEntry.getKey();
				String oValue = oEntry.getValue().getAsString();
				oResult.put(oKey, oValue);
			}
		}
		return oResult;
	}
}