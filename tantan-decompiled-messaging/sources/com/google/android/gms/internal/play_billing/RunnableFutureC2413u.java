package com.google.android.gms.internal.play_billing;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableFutureC2413u extends C2405q implements RunnableFuture {

    /* JADX INFO: renamed from: h */
    public volatile zzes f10374h;

    public RunnableFutureC2413u(Callable callable) {
        this.f10374h = new zzfg(this, callable);
    }

    /* JADX INFO: renamed from: A */
    public static RunnableFutureC2413u m14943A(Runnable runnable, Object obj) {
        return new RunnableFutureC2413u(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2401o
    /* JADX INFO: renamed from: g */
    public final String mo14893g() {
        zzes zzesVar = this.f10374h;
        if (zzesVar == null) {
            return super.mo14893g();
        }
        return "task=[" + zzesVar.toString() + Constants.AES_SUFFIX;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2401o
    /* JADX INFO: renamed from: m */
    public final void mo14895m() {
        zzes zzesVar;
        if (m14899q() && (zzesVar = this.f10374h) != null) {
            zzesVar.zze();
        }
        this.f10374h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzes zzesVar = this.f10374h;
        if (zzesVar != null) {
            zzesVar.run();
        }
        this.f10374h = null;
    }
}
