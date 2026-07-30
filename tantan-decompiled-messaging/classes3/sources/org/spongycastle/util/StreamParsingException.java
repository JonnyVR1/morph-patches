package org.spongycastle.util;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class StreamParsingException extends Exception {

    /* JADX INFO: renamed from: _e */
    Throwable f10641_e;

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this.f10641_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f10641_e;
    }
}
