package com.p046p1.mobile.putong.live.base.gson;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public class SafeJsonUtil {
    private static SafeJsonUtil instance = new SafeJsonUtil();
    private Gson gson;

    private SafeJsonUtil() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Boolean.class, new BooleanSerializer());
        gsonBuilder.registerTypeAdapter(Boolean.TYPE, new BooleanSerializer());
        gsonBuilder.registerTypeAdapter(Double.class, new DoubleSerializer());
        gsonBuilder.registerTypeAdapter(Double.TYPE, new DoubleSerializer());
        gsonBuilder.registerTypeAdapter(Float.class, new FloatSerializer());
        gsonBuilder.registerTypeAdapter(Float.TYPE, new FloatSerializer());
        gsonBuilder.registerTypeAdapter(Integer.class, new IntSerializer());
        gsonBuilder.registerTypeAdapter(Integer.TYPE, new IntSerializer());
        gsonBuilder.registerTypeAdapter(Long.class, new LongSerializer());
        gsonBuilder.registerTypeAdapter(Long.TYPE, new LongSerializer());
        gsonBuilder.registerTypeAdapter(Short.class, new ShortSerializer());
        gsonBuilder.registerTypeAdapter(Short.TYPE, new ShortSerializer());
        gsonBuilder.serializeNulls();
        this.gson = gsonBuilder.create();
    }

    public static Gson buildInGson() {
        return getInstance().gson;
    }

    public static SafeJsonUtil getInstance() {
        return instance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return cls.equals(String.class) ? str : (T) this.gson.fromJson(str, (Class) cls);
    }

    public String toJson(Object obj) {
        return this.gson.toJson(obj);
    }

    public <T> T fromJson(JsonElement jsonElement, Class<T> cls) throws JsonSyntaxException {
        if (jsonElement == null) {
            return null;
        }
        return (T) this.gson.fromJson(jsonElement, (Class) cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T fromJson(String str, Type type) throws JsonSyntaxException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return type.equals(String.class) ? str : (T) this.gson.fromJson(str, type);
    }

    public <T> T fromJson(JsonElement jsonElement, Type type) throws JsonSyntaxException {
        return (T) this.gson.fromJson(jsonElement, type);
    }
}
