package org.spongycastle.util;

/* JADX INFO: loaded from: classes3.dex */
public class StoreException extends RuntimeException {

    /* JADX INFO: renamed from: _e */
    private Throwable f207015_e;

    public StoreException(String str, Throwable th) {
        super(str);
        this.f207015_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f207015_e;
    }
}
