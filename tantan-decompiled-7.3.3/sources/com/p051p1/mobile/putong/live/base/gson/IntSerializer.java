package com.p051p1.mobile.putong.live.base.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public class IntSerializer implements JsonDeserializer<Integer> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Integer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        int i = 0;
        if (jsonElement == null) {
            return i;
        }
        try {
            return Integer.valueOf(jsonElement.getAsInt());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return i;
        }
    }
}
