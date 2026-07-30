package com.google.android.libraries.places.internal;

import java.util.concurrent.ExecutionException;
import p149l.jf4;
import p149l.sei0;

/* JADX INFO: loaded from: classes7.dex */
final class zzec implements zzajv {
    final /* synthetic */ sei0 zza;
    final /* synthetic */ zzaka zzb;
    final /* synthetic */ jf4 zzc;

    public zzec(sei0 sei0Var, zzaka zzakaVar, jf4 jf4Var) {
        this.zza = sei0Var;
        this.zzb = zzakaVar;
        this.zzc = jf4Var;
    }

    @Override // com.google.android.libraries.places.internal.zzajv
    public final void zza(Throwable th) {
        if (this.zzb.isCancelled()) {
            this.zzc.m141172a();
            return;
        }
        boolean z = th instanceof Exception;
        sei0 sei0Var = this.zza;
        if (z) {
            sei0Var.m183658b((Exception) th);
        } else {
            sei0Var.m183658b(new ExecutionException(th));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzajv
    public final void zzb(Object obj) {
        this.zza.m183659c(obj);
    }
}
