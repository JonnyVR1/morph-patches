package com.immomo.molive.foundation.util.safegson.serializer;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class DoubleSerializer implements JsonDeserializer<Double> {
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Double dValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        if (jsonElement == null) {
            return dValueOf;
        }
        try {
            return Double.valueOf(jsonElement.getAsDouble());
        } catch (Exception unused) {
            return dValueOf;
        }
    }
}
