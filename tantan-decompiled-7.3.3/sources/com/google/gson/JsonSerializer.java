package com.google.gson;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public interface JsonSerializer<T> {
    JsonElement serialize(T t, Type type, JsonSerializationContext jsonSerializationContext);
}
