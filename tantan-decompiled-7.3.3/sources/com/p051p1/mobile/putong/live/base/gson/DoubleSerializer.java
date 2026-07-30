package com.p051p1.mobile.putong.live.base.gson;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public class DoubleSerializer implements JsonDeserializer<Double> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Double deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Double dValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        if (jsonElement == null) {
            return dValueOf;
        }
        try {
            return Double.valueOf(jsonElement.getAsDouble());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return dValueOf;
        }
    }
}
