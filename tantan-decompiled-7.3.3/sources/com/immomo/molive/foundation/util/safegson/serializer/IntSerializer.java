package com.immomo.molive.foundation.util.safegson.serializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class IntSerializer implements JsonDeserializer<Integer> {
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        int i = 0;
        if (jsonElement == null) {
            return i;
        }
        try {
            return Integer.valueOf(jsonElement.getAsInt());
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }
}
