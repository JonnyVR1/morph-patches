package com.google.android.gms.internal.ads;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t3 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2275t3 extends AbstractC2203k3 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final Runnable f10103h;

    public RunnableC2275t3(Runnable runnable) {
        runnable.getClass();
        this.f10103h = runnable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    /* JADX INFO: renamed from: c */
    public final String mo13073c() {
        return "task=[" + this.f10103h.toString() + Constants.AES_SUFFIX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10103h.run();
        } catch (Throwable th) {
            mo13076f(th);
            throw th;
        }
    }
}
