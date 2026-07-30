package com.p046p1.mobile.putong.live.base.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class JsonToMap {
    public static JsonObject parseJson(String str) {
        return new JsonParser().parse(str).getAsJsonObject();
    }

    public static List<Object> toList(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement jsonElement = jsonArray.get(i);
            if (jsonElement instanceof JsonArray) {
                arrayList.add(toList((JsonArray) jsonElement));
            } else if (jsonElement instanceof JsonObject) {
                arrayList.add(toMap((JsonObject) jsonElement));
            } else {
                arrayList.add(jsonElement);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> toMap(JsonObject jsonObject) {
        HashMap map = new HashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (value instanceof JsonArray) {
                map.put(key, toList((JsonArray) value));
            } else if (value instanceof JsonObject) {
                map.put(key, toMap((JsonObject) value));
            } else {
                map.put(key, value);
            }
        }
        return map;
    }

    public static Map<String, Object> toMap(String str) {
        return toMap(parseJson(str));
    }
}
