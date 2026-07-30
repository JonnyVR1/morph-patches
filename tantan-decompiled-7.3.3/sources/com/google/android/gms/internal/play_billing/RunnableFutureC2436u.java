package com.google.android.gms.internal.play_billing;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableFutureC2436u extends C2428q implements RunnableFuture {

    /* JADX INFO: renamed from: h */
    public volatile zzes f10411h;

    public RunnableFutureC2436u(Callable callable) {
        this.f10411h = new zzfg(this, callable);
    }

    /* JADX INFO: renamed from: A */
    public static RunnableFutureC2436u m14997A(Runnable runnable, Object obj) {
        return new RunnableFutureC2436u(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2424o
    /* JADX INFO: renamed from: g */
    public final String mo14947g() {
        zzes zzesVar = this.f10411h;
        if (zzesVar == null) {
            return super.mo14947g();
        }
        return "task=[" + zzesVar.toString() + Constants.AES_SUFFIX;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2424o
    /* JADX INFO: renamed from: m */
    public final void mo14949m() {
        zzes zzesVar;
        if (m14953q() && (zzesVar = this.f10411h) != null) {
            zzesVar.zze();
        }
        this.f10411h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzes zzesVar = this.f10411h;
        if (zzesVar != null) {
            zzesVar.run();
        }
        this.f10411h = null;
    }
}
