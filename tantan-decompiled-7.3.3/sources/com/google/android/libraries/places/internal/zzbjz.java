package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbjz implements Runnable {
    final /* synthetic */ zzbdo zza;
    final /* synthetic */ zzbkb zzb;

    public zzbjz(zzbkb zzbkbVar, zzbdo zzbdoVar) {
        this.zza = zzbdoVar;
        this.zzb = zzbkbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb.zzc.zzv.zza() == zzaze.SHUTDOWN) {
            return;
        }
        zzbkb zzbkbVar = this.zzb;
        zzbml zzbmlVar = zzbkbVar.zzc.zzu;
        zzbgf zzbgfVar = zzbkbVar.zza;
        zzbkb zzbkbVar2 = this.zzb;
        if (zzbmlVar == zzbgfVar) {
            zzbkbVar2.zzc.zzu = null;
            this.zzb.zzc.zzl.zzd();
            zzbkd.zzA(this.zzb.zzc, zzaze.IDLE);
            return;
        }
        zzbkd zzbkdVar = zzbkbVar2.zzc;
        if (zzbkdVar.zzt == zzbkbVar2.zza) {
            zzmt.zzr(zzbkdVar.zzv.zza() == zzaze.CONNECTING, "Expected state is CONNECTING, actual state is %s", this.zzb.zzc.zzv.zza());
            this.zzb.zzc.zzl.zzc();
            boolean zZzg = this.zzb.zzc.zzl.zzg();
            zzbkb zzbkbVar3 = this.zzb;
            if (zZzg) {
                zzbkd.zzE(zzbkbVar3.zzc);
                return;
            }
            zzbkbVar3.zzc.zzt = null;
            this.zzb.zzc.zzl.zzd();
            zzbkd.zzD(this.zzb.zzc, this.zza);
        }
    }
}
