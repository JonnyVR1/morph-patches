package com.immomo.molive.foundation.util.safegson.adapter;

import com.google.gson.stream.JsonToken;

/* JADX INFO: loaded from: classes7.dex */
public class JsonIllegalTypeException extends RuntimeException {
    private JsonToken mExceptType;
    private JsonToken mIllegalType;

    public JsonIllegalTypeException(JsonToken jsonToken, JsonToken jsonToken2) {
        this.mExceptType = jsonToken;
        this.mIllegalType = jsonToken2;
    }

    public JsonToken getExceptType() {
        return this.mExceptType;
    }

    public JsonToken getIllegalType() {
        return this.mIllegalType;
    }
}
