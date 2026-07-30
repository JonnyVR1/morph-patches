package com.immomo.molive.foundation.util.safegson.factory;

import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.immomo.molive.foundation.util.safegson.adapter.JsonIllegalTypeException;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorHandleTypeAdapter;
import java.io.IOException;
import java.util.Map;
import p149l.anc0;
import p149l.y9g0;

/* JADX INFO: loaded from: classes7.dex */
public class SafeReflectiveTypeAdapter<T> extends SafeErrorHandleTypeAdapter<T> {

    /* JADX INFO: renamed from: b */
    private final ObjectConstructor<T> f13145b;

    /* JADX INFO: renamed from: c */
    private final Map<String, anc0> f13146c;

    /* JADX INFO: renamed from: d */
    private TypeToken<?> f13147d;

    /* JADX INFO: renamed from: e */
    private String f13148e;

    public SafeReflectiveTypeAdapter(ObjectConstructor<T> objectConstructor, Map<String, anc0> map) {
        this.f13145b = objectConstructor;
        this.f13146c = map;
    }

    /* JADX INFO: renamed from: c */
    public void m18609c(TypeToken<?> typeToken, String str) {
        this.f13147d = typeToken;
        this.f13148e = str;
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public T read2(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        if (jsonTokenPeek != JsonToken.BEGIN_OBJECT) {
            jsonReader.skipValue();
            mo18623b(jsonReader, TypeToken.get(Object.class), this.f13148e, jsonTokenPeek);
            return null;
        }
        T tConstruct = this.f13145b.construct();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            anc0 anc0Var = this.f13146c.get(strNextName);
            if (anc0Var == null || !anc0Var.m97748c()) {
                jsonReader.skipValue();
            } else {
                try {
                    anc0Var.mo18619e(jsonReader, tConstruct);
                } catch (JsonIllegalTypeException e) {
                    mo18623b(jsonReader, anc0Var.m97747b(), strNextName, e.getIllegalType());
                } catch (IllegalAccessException e2) {
                    y9g0.m213537a(e2);
                    return null;
                } catch (IllegalStateException e3) {
                    throw new JsonSyntaxException(e3);
                }
            }
        }
        jsonReader.endObject();
        return tConstruct;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        if (t == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        for (anc0 anc0Var : this.f13146c.values()) {
            try {
                if (anc0Var.mo18621g(t)) {
                    jsonWriter.name(anc0Var.m97746a());
                    anc0Var.mo18620f(jsonWriter, t);
                }
            } catch (IllegalAccessException e) {
                y9g0.m213537a(e);
                return;
            }
        }
        jsonWriter.endObject();
    }
}
