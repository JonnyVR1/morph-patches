package com.google.android.libraries.places.internal;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes7.dex */
final class zzbli implements Runnable {
    final /* synthetic */ zzbct zza;
    final /* synthetic */ zzblj zzb;

    public zzbli(zzblj zzbljVar, zzbct zzbctVar) {
        this.zza = zzbctVar;
        this.zzb = zzbljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbmj zzbmjVar;
        zzblj zzbljVar = this.zzb;
        zzbma zzbmaVar = zzbljVar.zzc;
        if (zzbmaVar.zzE != zzbljVar.zzb) {
            return;
        }
        zzbct zzbctVar = this.zza;
        List listZze = zzbctVar.zze();
        zzbmaVar.zzW.zzb(1, "Resolved address: {0}, config={1}", listZze, zzbctVar.zza());
        zzbma zzbmaVar2 = this.zzb.zzc;
        if (zzbmaVar2.zzak != 2) {
            zzbmaVar2.zzW.zzb(2, "Address resolved: {0}", listZze);
            this.zzb.zzc.zzak = 2;
        }
        zzbct zzbctVar2 = this.zza;
        zzbcp zzbcpVarZzb = zzbctVar2.zzb();
        zzbps zzbpsVar = (zzbps) zzbctVar2.zza().zzc(zzbpv.zza);
        zzbam zzbamVar = (zzbam) this.zza.zza().zzc(zzbam.zza);
        zzbmj zzbmjVar2 = (zzbcpVarZzb == null || zzbcpVarZzb.zzd() == null) ? null : (zzbmj) zzbcpVarZzb.zzd();
        zzbdo zzbdoVarZzc = zzbcpVarZzb != null ? zzbcpVarZzb.zzc() : null;
        zzbma zzbmaVar3 = this.zzb.zzc;
        if (zzbmaVar3.zzab) {
            if (zzbmjVar2 != null) {
                if (zzbamVar != null) {
                    zzbmaVar3.zzY.zzg(zzbamVar);
                    if (zzbmjVar2.zza() != null) {
                        this.zzb.zzc.zzW.zza(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    zzbmaVar3.zzY.zzg(zzbmjVar2.zza());
                }
            } else if (zzbdoVarZzc == null) {
                zzbmjVar2 = zzbma.zzh;
                zzbmaVar3.zzY.zzg(null);
            } else {
                if (!zzbmaVar3.zzaa) {
                    zzbmaVar3.zzW.zza(2, "Fallback to error due to invalid first service config without default config");
                    this.zzb.zza(zzbcpVarZzb.zzc());
                    if (zzbpsVar != null) {
                        zzbpsVar.zza(zzbcpVarZzb.zzc());
                        return;
                    }
                    return;
                }
                zzbmjVar2 = zzbmaVar3.zzZ;
            }
            if (!zzbmjVar2.equals(this.zzb.zzc.zzZ)) {
                this.zzb.zzc.zzW.zzb(2, "Service config changed{0}", zzbmjVar2 == zzbma.zzh ? " to empty" : "");
                this.zzb.zzc.zzZ = zzbmjVar2;
                this.zzb.zzc.zzai.zza = zzbmjVar2.zzc();
            }
            try {
                this.zzb.zzc.zzaa = true;
            } catch (RuntimeException e) {
                zzbma zzbmaVar4 = this.zzb.zzc;
                zzbma.zza.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NamesResolved", "run", "[" + String.valueOf(zzbmaVar4.zzc()) + "] Unexpected exception from parsing service config", (Throwable) e);
            }
            zzbmjVar = zzbmjVar2;
        } else {
            if (zzbmjVar2 != null) {
                zzbmaVar3.zzW.zza(2, "Service config from name resolver discarded by channel settings");
            }
            zzblj zzbljVar2 = this.zzb;
            zzbmjVar = zzbma.zzh;
            if (zzbamVar != null) {
                zzbljVar2.zzc.zzW.zza(2, "Config selector from name resolver discarded by channel settings");
            }
            this.zzb.zzc.zzY.zzg(zzbmjVar.zza());
        }
        zzbct zzbctVar3 = this.zza;
        zzblj zzbljVar3 = this.zzb;
        zzbma zzbmaVar5 = zzbljVar3.zzc;
        zzaye zzayeVarZza = zzbctVar3.zza();
        if (zzbljVar3.zza == zzbmaVar5.zzG) {
            zzayb zzaybVarZzb = zzayeVarZza.zzb();
            zzaybVarZzb.zza(zzbam.zza);
            Map mapZze = zzbmjVar.zze();
            if (mapZze != null) {
                zzaybVarZzb.zzb(zzbbm.zza, mapZze);
                zzaybVarZzb.zzc();
            }
            zzaye zzayeVarZzc = zzaybVarZzb.zzc();
            zzbeq zzbeqVar = this.zzb.zza.zza;
            zzbbg zzbbgVarZzb = zzbbi.zzb();
            zzbbgVarZzb.zza(listZze);
            zzbbgVarZzb.zzb(zzayeVarZzc);
            zzbbgVarZzb.zzc(zzbmjVar.zzd());
            zzbdo zzbdoVarZzb = zzbeqVar.zzb(zzbbgVarZzb.zzd());
            if (zzbpsVar != null) {
                zzbpsVar.zza(zzbdoVarZzb);
            }
        }
    }
}
