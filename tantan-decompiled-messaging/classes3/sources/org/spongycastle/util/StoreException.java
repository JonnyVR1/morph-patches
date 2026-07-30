package org.spongycastle.util;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class StoreException extends RuntimeException {

    /* JADX INFO: renamed from: _e */
    private Throwable f10640_e;

    public StoreException(String str, Throwable th) {
        super(str);
        this.f10640_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f10640_e;
    }
}
