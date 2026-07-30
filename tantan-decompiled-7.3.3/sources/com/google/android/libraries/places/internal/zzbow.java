package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbow extends zzayx {
    long zzb;
    final /* synthetic */ zzbpo zzc;
    private final zzbpm zzd;

    public zzbow(zzbpo zzbpoVar, zzbpm zzbpmVar) {
        this.zzc = zzbpoVar;
        this.zzd = zzbpmVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbdr
    public final void zza(long j) {
        if (this.zzc.zzs.zzf != null) {
            return;
        }
        synchronized (this.zzc.zzm) {
            try {
                if (this.zzc.zzs.zzf == null) {
                    zzbpm zzbpmVar = this.zzd;
                    if (!zzbpmVar.zzb) {
                        long j2 = this.zzb + j;
                        this.zzb = j2;
                        zzbpo zzbpoVar = this.zzc;
                        if (j2 <= zzbpoVar.zzx) {
                            return;
                        }
                        if (j2 > zzbpoVar.zzo) {
                            zzbpmVar.zzc = true;
                        } else {
                            long jZza = zzbpoVar.zzn.zza(j2 - zzbpoVar.zzx);
                            this.zzc.zzx = this.zzb;
                            if (jZza > this.zzc.zzp) {
                                this.zzd.zzc = true;
                            }
                        }
                        zzbpm zzbpmVar2 = this.zzd;
                        Runnable runnableZzag = zzbpmVar2.zzc ? this.zzc.zzag(zzbpmVar2) : null;
                        if (runnableZzag != null) {
                            runnableZzag.run();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
