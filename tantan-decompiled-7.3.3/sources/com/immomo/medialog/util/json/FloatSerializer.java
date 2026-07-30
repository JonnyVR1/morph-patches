package com.immomo.medialog.util.json;

import android.util.Log;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class FloatSerializer implements JsonDeserializer<Float> {
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Float fValueOf = Float.valueOf(0.0f);
        if (jsonElement == null) {
            return fValueOf;
        }
        try {
            return Float.valueOf(jsonElement.getAsFloat());
        } catch (Exception unused) {
            Log.e("weijiangnan", "FloatSerializer:" + type.toString());
            return fValueOf;
        }
    }
}
