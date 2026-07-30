package com.immomo.molive.foundation.util.safegson.factory;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorHandleTypeAdapter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SafeCollectionTypeAdapter<E> extends SafeErrorHandleTypeAdapter<Collection<E>> {

    /* JADX INFO: renamed from: b */
    private final TypeAdapter<E> f13826b;

    /* JADX INFO: renamed from: c */
    private final ObjectConstructor<? extends Collection<E>> f13827c;

    /* JADX INFO: renamed from: d */
    private TypeToken<?> f13828d;

    /* JADX INFO: renamed from: e */
    private String f13829e;

    public SafeCollectionTypeAdapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, ObjectConstructor<? extends Collection<E>> objectConstructor) {
        this.f13826b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
        this.f13827c = objectConstructor;
    }

    /* JADX INFO: renamed from: c */
    public void m19586c(TypeToken<?> typeToken, String str) {
        this.f13828d = typeToken;
        this.f13829e = str;
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public Collection<E> read2(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        if (jsonTokenPeek != JsonToken.BEGIN_ARRAY) {
            jsonReader.skipValue();
            mo19603b(jsonReader, TypeToken.get(List.class), this.f13829e, jsonTokenPeek);
            return null;
        }
        Collection<E> collectionConstruct = this.f13827c.construct();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            collectionConstruct.add(this.f13826b.read2(jsonReader));
        }
        jsonReader.endArray();
        return collectionConstruct;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
        if (collection == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            this.f13826b.write(jsonWriter, it.next());
        }
        jsonWriter.endArray();
    }
}
