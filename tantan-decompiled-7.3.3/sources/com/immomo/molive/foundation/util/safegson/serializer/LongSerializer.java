package com.immomo.molive.foundation.util.safegson.serializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class LongSerializer implements JsonDeserializer<Long> {
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        long j = 0L;
        if (jsonElement == null) {
            return j;
        }
        try {
            return Long.valueOf(jsonElement.getAsLong());
        } catch (Exception unused) {
            return j;
        }
    }
}
