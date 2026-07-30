package com.immomo.molive.foundation.util.safegson.factory;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes7.dex */
public class SafeTypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: a */
    private final Gson f13846a;

    /* JADX INFO: renamed from: b */
    private final TypeAdapter<T> f13847b;

    /* JADX INFO: renamed from: c */
    private final Type f13848c;

    public SafeTypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f13846a = gson;
        this.f13847b = typeAdapter;
        this.f13848c = type;
    }

    private Type getRuntimeTypeIfMoreSpecific(Type type, Object obj) {
        return (obj == null || !(type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) ? type : obj.getClass();
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public T read2(JsonReader jsonReader) throws IOException {
        return this.f13847b.read2(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        TypeAdapter<T> adapter = this.f13847b;
        Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.f13848c, t);
        if (runtimeTypeIfMoreSpecific != this.f13848c) {
            adapter = this.f13846a.getAdapter(TypeToken.get(runtimeTypeIfMoreSpecific));
            if (adapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter = this.f13847b;
                if (!(typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    adapter = typeAdapter;
                }
            }
        }
        adapter.write(jsonWriter, t);
    }
}
