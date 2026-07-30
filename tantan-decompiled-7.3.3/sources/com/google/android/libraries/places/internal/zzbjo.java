package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
final class zzbjo implements Runnable {
    final /* synthetic */ List zza;
    final /* synthetic */ zzbkd zzb;

    public zzbjo(zzbkd zzbkdVar, List list) {
        this.zza = list;
        this.zzb = zzbkdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbml zzbmlVar;
        SocketAddress socketAddressZzb = this.zzb.zzl.zzb();
        this.zzb.zzl.zze(this.zza);
        this.zzb.zzm = this.zza;
        zzaze zzazeVarZza = this.zzb.zzv.zza();
        zzaze zzazeVar = zzaze.READY;
        if ((zzazeVarZza == zzazeVar || this.zzb.zzv.zza() == zzaze.CONNECTING) && !this.zzb.zzl.zzh(socketAddressZzb)) {
            zzaze zzazeVarZza2 = this.zzb.zzv.zza();
            zzbkd zzbkdVar = this.zzb;
            if (zzazeVarZza2 == zzazeVar) {
                zzbmlVar = zzbkdVar.zzu;
                zzbkdVar.zzu = null;
                this.zzb.zzl.zzd();
                zzbkd.zzA(this.zzb, zzaze.IDLE);
            } else {
                zzbkdVar.zzt.zzd(zzbdo.zzp.zzg("InternalSubchannel closed pending transport due to address change"));
                this.zzb.zzt = null;
                this.zzb.zzl.zzd();
                zzbkd.zzE(this.zzb);
                zzbmlVar = null;
            }
        } else {
            zzbmlVar = null;
        }
        if (zzbmlVar != null) {
            zzbkd zzbkdVar2 = this.zzb;
            if (zzbkdVar2.zzp != null) {
                zzbkdVar2.zzq.zzd(zzbdo.zzp.zzg("InternalSubchannel closed transport early due to address change"));
                this.zzb.zzp.zza();
                this.zzb.zzp = null;
                this.zzb.zzq = null;
            }
            this.zzb.zzq = zzbmlVar;
            zzbkd zzbkdVar3 = this.zzb;
            zzbkdVar3.zzp = zzbkdVar3.zzk.zza(new zzbjn(this), 5L, TimeUnit.SECONDS, zzbkdVar3.zze);
        }
    }
}
