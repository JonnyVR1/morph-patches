package com.p046p1.mobile.putong.live.base.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public class ShortSerializer implements JsonDeserializer<Short> {
    @Override // com.google.gson.JsonDeserializer
    public Short deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        short s = 0;
        if (jsonElement == null) {
            return s;
        }
        try {
            return Short.valueOf(jsonElement.getAsShort());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return s;
        }
    }
}
