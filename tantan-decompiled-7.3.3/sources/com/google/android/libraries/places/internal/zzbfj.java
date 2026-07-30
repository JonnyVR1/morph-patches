package com.google.android.libraries.places.internal;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
final class zzbfj implements Runnable, zzazg {
    final /* synthetic */ zzbfq zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private volatile ScheduledFuture zze;
    private volatile boolean zzf;

    public zzbfj(zzbfq zzbfqVar, zzazn zzaznVar, boolean z) {
        long jZzb;
        this.zza = zzbfqVar;
        this.zzb = z;
        if (zzaznVar == null) {
            this.zzc = false;
            jZzb = 0;
        } else {
            this.zzc = true;
            jZzb = zzaznVar.zzb(TimeUnit.NANOSECONDS);
        }
        this.zzd = jZzb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzm.zzh(zzb());
    }

    public final zzbdo zzb() {
        long jAbs = Math.abs(this.zzd) / 1000000000;
        long jAbs2 = Math.abs(this.zzd) % 1000000000;
        StringBuilder sb = new StringBuilder();
        sb.append(true != this.zzb ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (this.zzd < 0) {
            sb.append('-');
        }
        sb.append(jAbs);
        Locale locale = Locale.US;
        sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
        sb.append("s. ");
        Long l2 = (Long) this.zza.zzl.zzl(zzayx.zza);
        sb.append(String.format(locale, "Name resolution delay %.9f seconds.", Double.valueOf(l2 == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : l2.longValue() / zzbfq.zzc)));
        if (this.zza.zzm != null) {
            zzbjj zzbjjVar = new zzbjj();
            this.zza.zzm.zzg(zzbjjVar);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(zzbjjVar);
        }
        return zzbdo.zze.zzg(sb.toString());
    }

    public final void zzc() {
        if (this.zzf) {
            return;
        }
        if (this.zzc && !this.zzb) {
            zzbfq zzbfqVar = this.zza;
            if (zzbfqVar.zzq != null) {
                this.zze = zzbfqVar.zzq.schedule(new zzbki(this), this.zzd, TimeUnit.NANOSECONDS);
            }
        }
        this.zza.zzi.zzd(this, zzakb.zza());
        if (this.zzf) {
            zzd();
        }
    }

    public final void zzd() {
        this.zzf = true;
        ScheduledFuture scheduledFuture = this.zze;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
