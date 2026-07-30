package com.google.android.gms.internal.play_billing;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2407r extends AbstractC2395l implements Runnable {

    /* JADX INFO: renamed from: h */
    public final Runnable f10370h;

    public RunnableC2407r(Runnable runnable) {
        runnable.getClass();
        this.f10370h = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2401o
    /* JADX INFO: renamed from: g */
    public final String mo14893g() {
        return "task=[" + this.f10370h.toString() + Constants.AES_SUFFIX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10370h.run();
        } catch (Throwable th) {
            m14897o(th);
            throw th;
        }
    }
}
