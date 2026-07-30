package com.immomo.molive.foundation.util.safegson.handler;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import p149l.n2m;
import p149l.o2m;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SafeErrorTypeAdapterFactory implements TypeAdapterFactory, n2m {

    /* JADX INFO: renamed from: a */
    private o2m f13167a;

    @Override // p149l.n2m
    /* JADX INFO: renamed from: a */
    public void mo18622a(o2m o2mVar) {
        this.f13167a = o2mVar;
    }

    @Override // p149l.o2m
    /* JADX INFO: renamed from: b */
    public void mo18623b(JsonReader jsonReader, TypeToken<?> typeToken, String str, JsonToken jsonToken) {
        o2m o2mVar = this.f13167a;
        if (o2mVar != null) {
            o2mVar.mo18623b(jsonReader, typeToken, str, jsonToken);
        }
    }

    /* JADX INFO: renamed from: c */
    public o2m m18624c() {
        return this.f13167a;
    }
}
