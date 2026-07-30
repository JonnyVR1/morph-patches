package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes6.dex */
public class JsonGenerationException extends JsonProcessingException {
    private static final long serialVersionUID = 123;

    public JsonGenerationException(String str) {
        super(str, (JsonLocation) null);
    }

    public JsonGenerationException(Throwable th) {
        super(th);
    }

    public JsonGenerationException(String str, Throwable th) {
        super(str, null, th);
    }
}
