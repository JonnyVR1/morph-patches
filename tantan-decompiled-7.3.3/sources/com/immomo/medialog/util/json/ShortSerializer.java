package com.immomo.medialog.util.json;

import android.util.Log;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class ShortSerializer implements JsonDeserializer<Short> {
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        short s = 0;
        if (jsonElement == null) {
            return s;
        }
        try {
            return Short.valueOf(jsonElement.getAsShort());
        } catch (Exception unused) {
            Log.e("weijiangnan", "ShortSerializer:" + type.toString());
            return s;
        }
    }
}
