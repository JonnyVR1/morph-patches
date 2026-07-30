package org.spongycastle.util;

/* JADX INFO: loaded from: classes3.dex */
public class StreamParsingException extends Exception {

    /* JADX INFO: renamed from: _e */
    Throwable f207938_e;

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this.f207938_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f207938_e;
    }
}
