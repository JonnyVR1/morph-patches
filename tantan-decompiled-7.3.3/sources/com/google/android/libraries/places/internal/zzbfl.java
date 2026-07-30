package com.google.android.libraries.places.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
final class zzbfl extends zzbgi {
    final /* synthetic */ zzbvq zza;
    final /* synthetic */ zzbqq zzb;
    final /* synthetic */ zzbfo zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbfl(zzbfo zzbfoVar, zzbvq zzbvqVar, zzbqq zzbqqVar) {
        super(zzbfoVar.zza.zzi);
        this.zza = zzbvqVar;
        this.zzb = zzbqqVar;
        this.zzc = zzbfoVar;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0029 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return;
     */
    @Override // com.google.android.libraries.places.internal.zzbgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza() {
        int i = zzbvr.zza;
        if (this.zzc.zzc != null) {
            zzbjd.zzh(this.zzb);
            return;
        }
        while (true) {
            InputStream inputStreamZza = this.zzb.zza();
            if (inputStreamZza == null) {
                return;
            }
            try {
                zzbfo zzbfoVar = this.zzc;
                zzbfoVar.zzb.zzc(zzbfoVar.zza.zzd.zzd(inputStreamZza));
                inputStreamZza.close();
            } catch (Throwable th) {
                zzbjd.zzi(inputStreamZza);
                throw th;
            }
        }
    }
}
