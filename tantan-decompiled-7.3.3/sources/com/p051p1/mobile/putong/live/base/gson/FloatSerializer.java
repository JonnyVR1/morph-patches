package com.p051p1.mobile.putong.live.base.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public class FloatSerializer implements JsonDeserializer<Float> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Float deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Float fValueOf = Float.valueOf(0.0f);
        if (jsonElement == null) {
            return fValueOf;
        }
        try {
            return Float.valueOf(jsonElement.getAsFloat());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return fValueOf;
        }
    }
}
