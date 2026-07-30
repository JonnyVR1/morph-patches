package com.core.glcore.util;

import android.content.Context;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class JsonUtil {
    private static JsonUtil instance = new JsonUtil();
    private GsonBuilder builder;
    private Gson gson;

    private JsonUtil() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Integer.TYPE, new IntSerializer());
        gsonBuilder.registerTypeAdapter(Integer.class, new IntSerializer());
        gsonBuilder.registerTypeAdapter(Date.class, new DateSerializer());
        gsonBuilder.serializeNulls();
        this.gson = gsonBuilder.create();
    }

    public static Gson buildInGson() {
        return getInstance().gson;
    }

    public static JsonUtil getInstance() {
        return instance;
    }

    public static void registerAdapter(Type type, JsonDeserializer jsonDeserializer) {
        try {
            getInstance().registerTypeAdapter(type, jsonDeserializer);
        } catch (Exception e) {
            MDLog.m7392e("json util", "registerAdapter", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return cls.equals(String.class) ? str : (T) this.gson.fromJson(str, (Class) cls);
    }

    public <T> T jsonObjectFromFilePath(Context context, String str, Type type) throws JsonSyntaxException {
        return (T) fromJson(FileUtil.readString(str), type);
    }

    public <T> T jsonObjectFromRawFile(Context context, int i, Class<T> cls) throws JsonSyntaxException {
        return (T) fromJson(jsonStringFromRawFile(context, i), (Class) cls);
    }

    public String jsonStringFromFile(Context context, String str) throws JsonSyntaxException {
        return FileUtil.readString(str);
    }

    public String jsonStringFromRawFile(Context context, int i) throws JsonSyntaxException {
        return FileUtil.readString(context.getResources().openRawResource(i), "UTF-8");
    }

    public void registerTypeAdapter(Type type, Object obj) {
        this.builder.registerTypeAdapter(type, obj);
        this.gson = this.builder.create();
    }

    public String toJson(Object obj) {
        return this.gson.toJson(obj);
    }

    public String jsonStringFromFile(String str) throws JsonSyntaxException {
        return FileUtil.readString(str);
    }

    public <T> T jsonObjectFromRawFile(Context context, int i, Type type) throws JsonSyntaxException {
        return (T) fromJson(jsonStringFromRawFile(context, i), type);
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

    public <T> T fromJson(Reader reader, Class<T> cls) {
        return (T) this.gson.fromJson(reader, (Class) cls);
    }
}
