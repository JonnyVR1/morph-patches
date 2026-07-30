package com.google.android.gms.internal.play_billing;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2430r extends AbstractC2418l implements Runnable {

    /* JADX INFO: renamed from: h */
    public final Runnable f10407h;

    public RunnableC2430r(Runnable runnable) {
        runnable.getClass();
        this.f10407h = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2424o
    /* JADX INFO: renamed from: g */
    public final String mo14947g() {
        return "task=[" + this.f10407h.toString() + Constants.AES_SUFFIX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10407h.run();
        } catch (Throwable th) {
            m14951o(th);
            throw th;
        }
    }
}
