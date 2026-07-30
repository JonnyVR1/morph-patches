package com.immomo.molive.foundation.util.safegson.handler;

import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import p153l.g5m;
import p153l.h5m;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SafeErrorHandleTypeAdapter<T> extends TypeAdapter<T> implements g5m {

    /* JADX INFO: renamed from: a */
    private h5m f13860a;

    @Override // p153l.g5m
    /* JADX INFO: renamed from: a */
    public void mo19602a(h5m h5mVar) {
        this.f13860a = h5mVar;
    }

    @Override // p153l.h5m
    /* JADX INFO: renamed from: b */
    public void mo19603b(JsonReader jsonReader, TypeToken<?> typeToken, String str, JsonToken jsonToken) {
        h5m h5mVar = this.f13860a;
        if (h5mVar != null) {
            h5mVar.mo19603b(jsonReader, typeToken, str, jsonToken);
        }
    }
}
