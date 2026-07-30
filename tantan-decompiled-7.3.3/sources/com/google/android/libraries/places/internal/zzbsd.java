package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes7.dex */
final class zzbsd implements Runnable {
    final /* synthetic */ zzbsf zza;

    public zzbsd(zzbsf zzbsfVar) {
        this.zza = zzbsfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbsf zzbsfVar = this.zza;
        zzbsfVar.zzs.execute(zzbsfVar.zzx);
        synchronized (this.zza.zzo) {
            this.zza.zzH = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.zza.zzad();
        }
    }
}
