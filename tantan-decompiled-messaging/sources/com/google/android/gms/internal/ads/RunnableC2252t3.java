package com.google.android.gms.internal.ads;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t3 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2252t3 extends AbstractC2180k3 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final Runnable f10066h;

    public RunnableC2252t3(Runnable runnable) {
        runnable.getClass();
        this.f10066h = runnable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    /* JADX INFO: renamed from: c */
    public final String mo13019c() {
        return "task=[" + this.f10066h.toString() + Constants.AES_SUFFIX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10066h.run();
        } catch (Throwable th) {
            mo13022f(th);
            throw th;
        }
    }
}
