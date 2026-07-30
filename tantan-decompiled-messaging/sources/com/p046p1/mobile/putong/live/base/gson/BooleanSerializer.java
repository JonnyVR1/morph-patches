package com.p046p1.mobile.putong.live.base.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public class BooleanSerializer implements JsonDeserializer<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Boolean deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        try {
            try {
                return Boolean.valueOf(jsonElement.getAsInt() != 0);
            } catch (Exception unused) {
                return Boolean.valueOf(jsonElement.getAsBoolean());
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return Boolean.FALSE;
        }
    }
}
