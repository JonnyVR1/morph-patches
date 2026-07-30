package com.immomo.molive.foundation.util.safegson.handler;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import p153l.g5m;
import p153l.h5m;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SafeErrorTypeAdapterFactory implements TypeAdapterFactory, g5m {

    /* JADX INFO: renamed from: a */
    private h5m f13861a;

    @Override // p153l.g5m
    /* JADX INFO: renamed from: a */
    public void mo19602a(h5m h5mVar) {
        this.f13861a = h5mVar;
    }

    @Override // p153l.h5m
    /* JADX INFO: renamed from: b */
    public void mo19603b(JsonReader jsonReader, TypeToken<?> typeToken, String str, JsonToken jsonToken) {
        h5m h5mVar = this.f13861a;
        if (h5mVar != null) {
            h5mVar.mo19603b(jsonReader, typeToken, str, jsonToken);
        }
    }

    /* JADX INFO: renamed from: c */
    public h5m m19604c() {
        return this.f13861a;
    }
}
