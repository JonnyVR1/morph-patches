package com.google.android.libraries.places.internal;

import p149l.r2j;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbeq {
    final /* synthetic */ zzbey zza;
    private final zzbbd zzb;
    private zzbbm zzc;
    private zzbbo zzd;

    public zzbeq(zzbey zzbeyVar, zzbbd zzbbdVar) {
        this.zza = zzbeyVar;
        this.zzb = zzbbdVar;
        zzbbo zzbboVarZza = zzbeyVar.zza.zza(zzbeyVar.zzb);
        this.zzd = zzbboVarZza;
        if (zzbboVarZza != null) {
            this.zzc = zzbboVarZza.zza(zzbbdVar);
        } else {
            r2j.m177608a("Could not find policy '", zzbeyVar.zzb, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
            throw null;
        }
    }

    public final zzbbm zza() {
        return this.zzc;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Multi-variable type inference failed */
    public final zzbdo zzb(zzbbi zzbbiVar) {
        zzbqg zzbqgVar = (zzbqg) zzbbiVar.zzd();
        zzber zzberVar = null;
        Object[] objArr = 0;
        if (zzbqgVar == null) {
            try {
                zzbey zzbeyVar = this.zza;
                zzbqgVar = new zzbqg(zzbey.zza(zzbeyVar, zzbeyVar.zzb, "using default policy"), null);
            } catch (zzbex e) {
                this.zzb.zze(zzaze.TRANSIENT_FAILURE, new zzbet(zzbdo.zzo.zzg(e.getMessage())));
                this.zzc.zze();
                this.zzd = null;
                this.zzc = new zzbev(objArr == true ? 1 : 0);
                return zzbdo.zza;
            }
        }
        zzbbo zzbboVar = this.zzd;
        if (zzbboVar != null) {
            zzbbo zzbboVar2 = zzbqgVar.zza;
            if (!zzbboVar2.zzd().equals(zzbboVar.zzd())) {
                this.zzb.zze(zzaze.CONNECTING, new zzbes(zzberVar));
                this.zzc.zze();
                zzbbo zzbboVar3 = zzbqgVar.zza;
                this.zzd = zzbboVar3;
                zzbbm zzbbmVar = this.zzc;
                this.zzc = zzbboVar3.zza(this.zzb);
                ((zzblg) this.zzb).zzb.zzW.zzb(2, "Load balancer changed from {0} to {1}", zzbbmVar.getClass().getSimpleName(), this.zzc.getClass().getSimpleName());
            }
        } else {
            this.zzb.zze(zzaze.CONNECTING, new zzbes(zzberVar));
            this.zzc.zze();
            zzbbo zzbboVar4 = zzbqgVar.zza;
            this.zzd = zzbboVar4;
            zzbbm zzbbmVar2 = this.zzc;
            this.zzc = zzbboVar4.zza(this.zzb);
            ((zzblg) this.zzb).zzb.zzW.zzb(2, "Load balancer changed from {0} to {1}", zzbbmVar2.getClass().getSimpleName(), this.zzc.getClass().getSimpleName());
        }
        Object obj = zzbqgVar.zzb;
        if (obj != null) {
            ((zzblg) this.zzb).zzb.zzW.zzb(1, "Load-balancing config: {0}", obj);
        }
        zzbbm zzbbmVar3 = this.zzc;
        zzbbg zzbbgVarZzb = zzbbi.zzb();
        zzbbgVarZzb.zza(zzbbiVar.zze());
        zzbbgVarZzb.zzb(zzbbiVar.zza());
        zzbbgVarZzb.zzc(obj);
        return zzbbmVar3.zza(zzbbgVarZzb.zzd());
    }

    public final void zzc() {
        this.zzc.zze();
        this.zzc = null;
    }
}
