package com.google.android.gms.internal.ads;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import p153l.wuw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y3 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableFutureC2315y3 extends C2259r3 implements RunnableFuture {

    /* JADX INFO: renamed from: h */
    public volatile zzgew f10144h;

    public RunnableFutureC2315y3(wuw0 wuw0Var) {
        this.f10144h = new zzgfl(this, wuw0Var);
    }

    /* JADX INFO: renamed from: D */
    public static RunnableFutureC2315y3 m13540D(Runnable runnable, Object obj) {
        return new RunnableFutureC2315y3(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    /* JADX INFO: renamed from: c */
    public final String mo13073c() {
        zzgew zzgewVar = this.f10144h;
        if (zzgewVar == null) {
            return super.mo13073c();
        }
        return "task=[" + zzgewVar.toString() + Constants.AES_SUFFIX;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    /* JADX INFO: renamed from: d */
    public final void mo13074d() {
        zzgew zzgewVar;
        if (m13080v() && (zzgewVar = this.f10144h) != null) {
            zzgewVar.zzh();
        }
        this.f10144h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgew zzgewVar = this.f10144h;
        if (zzgewVar != null) {
            zzgewVar.run();
        }
        this.f10144h = null;
    }

    public RunnableFutureC2315y3(Callable callable) {
        this.f10144h = new zzgfm(this, callable);
    }
}
