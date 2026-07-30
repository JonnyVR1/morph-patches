package com.immomo.medialog.util.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class BooleanSerializer implements JsonDeserializer<Boolean> {
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        try {
            try {
                return Boolean.valueOf(jsonElement.getAsInt() != 0);
            } catch (Exception unused) {
                return Boolean.valueOf(jsonElement.getAsBoolean());
            }
        } catch (Exception unused2) {
            return Boolean.FALSE;
        }
    }
}
