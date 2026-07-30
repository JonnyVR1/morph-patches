package com.immomo.molive.foundation.util.safegson.factory;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorHandleTypeAdapter;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SafeArrayTypeAdapter<E> extends SafeErrorHandleTypeAdapter<Object> {

    /* JADX INFO: renamed from: f */
    public static final SafeErrorTypeAdapterFactory f13821f = new SafeErrorTypeAdapterFactory() { // from class: com.immomo.molive.foundation.util.safegson.factory.SafeArrayTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type arrayComponentType = C$Gson$Types.getArrayComponentType(type);
            SafeArrayTypeAdapter safeArrayTypeAdapter = new SafeArrayTypeAdapter(gson, gson.getAdapter(TypeToken.get(arrayComponentType)), C$Gson$Types.getRawType(arrayComponentType));
            safeArrayTypeAdapter.mo19602a(m19604c());
            return safeArrayTypeAdapter;
        }
    };

    /* JADX INFO: renamed from: b */
    private final Class<E> f13822b;

    /* JADX INFO: renamed from: c */
    private final TypeAdapter<E> f13823c;

    /* JADX INFO: renamed from: d */
    private TypeToken<?> f13824d;

    /* JADX INFO: renamed from: e */
    private String f13825e;

    public SafeArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f13823c = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f13822b = cls;
    }

    /* JADX INFO: renamed from: c */
    public void m19585c(TypeToken<?> typeToken, String str) {
        this.f13824d = typeToken;
        this.f13825e = str;
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public Object read2(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        if (jsonTokenPeek != JsonToken.BEGIN_ARRAY) {
            jsonReader.skipValue();
            mo19603b(jsonReader, TypeToken.get(List.class), this.f13825e, jsonTokenPeek);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f13823c.read2(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f13822b, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f13823c.write(jsonWriter, (E) Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
