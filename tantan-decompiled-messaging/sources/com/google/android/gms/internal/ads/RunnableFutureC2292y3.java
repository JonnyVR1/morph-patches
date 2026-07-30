package com.google.android.gms.internal.ads;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import p149l.qlw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y3 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableFutureC2292y3 extends C2236r3 implements RunnableFuture {

    /* JADX INFO: renamed from: h */
    public volatile zzgew f10107h;

    public RunnableFutureC2292y3(qlw0 qlw0Var) {
        this.f10107h = new zzgfl(this, qlw0Var);
    }

    /* JADX INFO: renamed from: D */
    public static RunnableFutureC2292y3 m13486D(Runnable runnable, Object obj) {
        return new RunnableFutureC2292y3(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    /* JADX INFO: renamed from: c */
    public final String mo13019c() {
        zzgew zzgewVar = this.f10107h;
        if (zzgewVar == null) {
            return super.mo13019c();
        }
        return "task=[" + zzgewVar.toString() + Constants.AES_SUFFIX;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    /* JADX INFO: renamed from: d */
    public final void mo13020d() {
        zzgew zzgewVar;
        if (m13026v() && (zzgewVar = this.f10107h) != null) {
            zzgewVar.zzh();
        }
        this.f10107h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgew zzgewVar = this.f10107h;
        if (zzgewVar != null) {
            zzgewVar.run();
        }
        this.f10107h = null;
    }

    public RunnableFutureC2292y3(Callable callable) {
        this.f10107h = new zzgfm(this, callable);
    }
}
