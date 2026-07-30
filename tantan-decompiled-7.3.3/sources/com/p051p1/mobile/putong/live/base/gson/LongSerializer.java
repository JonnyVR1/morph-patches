package com.p051p1.mobile.putong.live.base.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public class LongSerializer implements JsonDeserializer<Long> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Long deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        long j = 0L;
        if (jsonElement == null) {
            return j;
        }
        try {
            return Long.valueOf(jsonElement.getAsLong());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return j;
        }
    }
}
