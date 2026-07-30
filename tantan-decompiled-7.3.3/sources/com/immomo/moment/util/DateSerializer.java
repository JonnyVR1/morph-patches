package com.immomo.moment.util;

import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class DateSerializer implements JsonSerializer<Date>, JsonDeserializer<Date> {
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (TextUtils.isEmpty(jsonElement.getAsString())) {
            return new Date();
        }
        if (jsonElement.getAsString().equals("NaN")) {
            return null;
        }
        return jsonElement.getAsString().length() < 7 ? new Date(jsonElement.getAsLong() * 1000) : new Date(jsonElement.getAsLong());
    }

    @Override // com.google.gson.JsonSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(Long.valueOf(date.getTime()));
    }
}
