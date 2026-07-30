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
public class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: a */
    private final Gson f13155a;

    /* JADX INFO: renamed from: b */
    private final TypeAdapter<T> f13156b;

    /* JADX INFO: renamed from: c */
    private final Type f13157c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f13155a = gson;
        this.f13156b = typeAdapter;
        this.f13157c = type;
    }

    private Type getRuntimeTypeIfMoreSpecific(Type type, Object obj) {
        return (obj == null || !(type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) ? type : obj.getClass();
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public T read2(JsonReader jsonReader) throws IOException {
        return this.f13156b.read2(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        TypeAdapter<T> adapter = this.f13156b;
        Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.f13157c, t);
        if (runtimeTypeIfMoreSpecific != this.f13157c) {
            adapter = this.f13155a.getAdapter(TypeToken.get(runtimeTypeIfMoreSpecific));
            if (adapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter = this.f13156b;
                if (!(typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    adapter = typeAdapter;
                }
            }
        }
        adapter.write(jsonWriter, t);
    }
}
