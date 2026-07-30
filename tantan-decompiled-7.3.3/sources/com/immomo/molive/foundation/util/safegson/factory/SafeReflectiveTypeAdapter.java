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
import p153l.fvc0;
import p153l.gig0;

/* JADX INFO: loaded from: classes7.dex */
public class SafeReflectiveTypeAdapter<T> extends SafeErrorHandleTypeAdapter<T> {

    /* JADX INFO: renamed from: b */
    private final ObjectConstructor<T> f13839b;

    /* JADX INFO: renamed from: c */
    private final Map<String, fvc0> f13840c;

    /* JADX INFO: renamed from: d */
    private TypeToken<?> f13841d;

    /* JADX INFO: renamed from: e */
    private String f13842e;

    public SafeReflectiveTypeAdapter(ObjectConstructor<T> objectConstructor, Map<String, fvc0> map) {
        this.f13839b = objectConstructor;
        this.f13840c = map;
    }

    /* JADX INFO: renamed from: c */
    public void m19589c(TypeToken<?> typeToken, String str) {
        this.f13841d = typeToken;
        this.f13842e = str;
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
            mo19603b(jsonReader, TypeToken.get(Object.class), this.f13842e, jsonTokenPeek);
            return null;
        }
        T tConstruct = this.f13839b.construct();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            fvc0 fvc0Var = this.f13840c.get(strNextName);
            if (fvc0Var == null || !fvc0Var.m127606c()) {
                jsonReader.skipValue();
            } else {
                try {
                    fvc0Var.mo19599e(jsonReader, tConstruct);
                } catch (JsonIllegalTypeException e) {
                    mo19603b(jsonReader, fvc0Var.m127605b(), strNextName, e.getIllegalType());
                } catch (IllegalAccessException e2) {
                    gig0.m130323a(e2);
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
        for (fvc0 fvc0Var : this.f13840c.values()) {
            try {
                if (fvc0Var.mo19601g(t)) {
                    jsonWriter.name(fvc0Var.m127604a());
                    fvc0Var.mo19600f(jsonWriter, t);
                }
            } catch (IllegalAccessException e) {
                gig0.m130323a(e);
                return;
            }
        }
        jsonWriter.endObject();
    }
}
