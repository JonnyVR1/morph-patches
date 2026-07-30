package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbhf extends zzbhy {
    final /* synthetic */ zzbhg zza;
    private final zzbbf zzb;
    private final zzazj zzc = zzazj.zzb();
    private final zzayx[] zzd;

    public /* synthetic */ zzbhf(zzbhg zzbhgVar, zzbbf zzbbfVar, zzayx[] zzayxVarArr, zzbhe zzbheVar) {
        this.zza = zzbhgVar;
        this.zzb = zzbbfVar;
        this.zzd = zzayxVarArr;
    }

    public static /* bridge */ /* synthetic */ Runnable zzb(zzbhf zzbhfVar, zzbfu zzbfuVar) {
        zzazj zzazjVarZza = zzbhfVar.zzc.zza();
        try {
            zzbbf zzbbfVar = zzbhfVar.zzb;
            zzbfr zzbfrVarZza = zzbfuVar.zza(zzbbfVar.zzc(), zzbbfVar.zzb(), zzbbfVar.zza(), zzbhfVar.zzd);
            return zzbhfVar.zze(zzbfrVarZza);
        } finally {
            zzbhfVar.zzc.zze(zzazjVarZza);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbhy
    public final void zzc(zzbdo zzbdoVar) {
        int i = 0;
        while (true) {
            zzayx[] zzayxVarArr = this.zzd;
            if (i >= zzayxVarArr.length) {
                return;
            }
            zzayx zzayxVar = zzayxVarArr[i];
            i++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbhy, com.google.android.libraries.places.internal.zzbfr
    public final void zzg(zzbjj zzbjjVar) {
        if (this.zzb.zza().zzo()) {
            zzbjjVar.zza("wait_for_ready");
        }
        super.zzg(zzbjjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbhy, com.google.android.libraries.places.internal.zzbfr
    public final void zzh(zzbdo zzbdoVar) {
        super.zzh(zzbdoVar);
        synchronized (this.zza.zzb) {
            try {
                zzbhg zzbhgVar = this.zza;
                if (zzbhgVar.zzg != null) {
                    boolean zRemove = zzbhgVar.zzi.remove(this);
                    if (!this.zza.zzn() && zRemove) {
                        zzbhg zzbhgVar2 = this.zza;
                        zzbhgVar2.zzd.zzc(zzbhgVar2.zzf);
                        zzbhg zzbhgVar3 = this.zza;
                        if (zzbhgVar3.zzj != null) {
                            zzbhgVar3.zzd.zzc(zzbhgVar3.zzg);
                            this.zza.zzg = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zza.zzd.zzb();
    }
}
