package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class zzatp extends zzarv {
    private final zzatu zza;

    public zzatp(zzatu zzatuVar) {
        this.zza = zzatuVar;
    }

    @Override // com.google.android.libraries.places.internal.zzavn
    public final /* synthetic */ Object zzb(zzasq zzasqVar, zzatf zzatfVar) throws zzauf {
        int i = zzatu.zzd;
        zzatu zzatuVarZzat = this.zza.zzat();
        try {
            zzavt zzavtVarZzb = zzavp.zza().zzb(zzatuVarZzat.getClass());
            zzavtVarZzb.zzf(zzatuVarZzat, zzasr.zzq(zzasqVar), zzatfVar);
            zzavtVarZzb.zzd(zzatuVarZzat);
            return zzatuVarZzat;
        } catch (zzauf e) {
            e = e;
            if (e.zzl()) {
                e = new zzauf(e);
            }
            e.zzh(zzatuVarZzat);
            throw e;
        } catch (zzawm e2) {
            zzauf zzaufVarZza = e2.zza();
            zzaufVarZza.zzh(zzatuVarZzat);
            throw zzaufVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzauf) {
                throw ((zzauf) e3.getCause());
            }
            zzauf zzaufVar = new zzauf(e3);
            zzaufVar.zzh(zzatuVarZzat);
            throw zzaufVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzauf) {
                throw ((zzauf) e4.getCause());
            }
            throw e4;
        }
    }
}
