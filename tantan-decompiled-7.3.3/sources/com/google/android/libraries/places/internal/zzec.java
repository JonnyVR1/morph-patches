package com.google.android.libraries.places.internal;

import java.util.concurrent.ExecutionException;
import p153l.ig4;
import p153l.sni0;

/* JADX INFO: loaded from: classes7.dex */
final class zzec implements zzajv {
    final /* synthetic */ sni0 zza;
    final /* synthetic */ zzaka zzb;
    final /* synthetic */ ig4 zzc;

    public zzec(sni0 sni0Var, zzaka zzakaVar, ig4 ig4Var) {
        this.zza = sni0Var;
        this.zzb = zzakaVar;
        this.zzc = ig4Var;
    }

    @Override // com.google.android.libraries.places.internal.zzajv
    public final void zza(Throwable th) {
        if (this.zzb.isCancelled()) {
            this.zzc.m139763a();
            return;
        }
        boolean z = th instanceof Exception;
        sni0 sni0Var = this.zza;
        if (z) {
            sni0Var.m186940b((Exception) th);
        } else {
            sni0Var.m186940b(new ExecutionException(th));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzajv
    public final void zzb(Object obj) {
        this.zza.m186941c(obj);
    }
}
