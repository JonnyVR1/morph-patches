package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzblq extends zzbgz {
    final zzazj zza;
    final zzbcl zzb;
    final zzayj zzc;
    final /* synthetic */ zzbls zzd;
    private final long zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzblq(zzbls zzblsVar, zzazj zzazjVar, zzbcl zzbclVar, zzayj zzayjVar) {
        super(zzbma.zzJ(zzblsVar.zza, zzayjVar), zzblsVar.zza.zzs, zzayjVar.zzi());
        this.zzd = zzblsVar;
        this.zza = zzazjVar;
        this.zzb = zzbclVar;
        this.zzc = zzayjVar;
        this.zze = System.nanoTime();
    }

    @Override // com.google.android.libraries.places.internal.zzbgz
    public final void zzk() {
        zzblp zzblpVar = new zzblp(this);
        zzbdw zzbdwVar = this.zzd.zza.zzf;
        zzbdwVar.zzc(zzblpVar);
        zzbdwVar.zzb();
    }

    public final void zzl() {
        zzazj zzazjVarZza = this.zza.zza();
        try {
            zzayo zzayoVarZzh = this.zzd.zzh(this.zzb, this.zzc.zze(zzayx.zza, Long.valueOf(System.nanoTime() - this.zze)));
            this.zza.zze(zzazjVarZza);
            Runnable runnableZzh = zzh(zzayoVarZzh);
            zzbls zzblsVar = this.zzd;
            if (runnableZzh != null) {
                zzbma.zzJ(zzblsVar.zza, this.zzc).execute(new zzblo(this, runnableZzh));
            } else {
                zzblp zzblpVar = new zzblp(this);
                zzbdw zzbdwVar = zzblsVar.zza.zzf;
                zzbdwVar.zzc(zzblpVar);
                zzbdwVar.zzb();
            }
        } catch (Throwable th) {
            this.zza.zze(zzazjVarZza);
            throw th;
        }
    }
}
