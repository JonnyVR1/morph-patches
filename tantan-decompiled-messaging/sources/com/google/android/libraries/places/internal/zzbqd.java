package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbqd extends zzbpz {
    public /* synthetic */ zzbqd(zzbqc zzbqcVar) {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzbpz
    public final void zza(zzbqe zzbqeVar, int i) {
        synchronized (zzbqeVar) {
            zzbqeVar.zze = 0;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpz
    public final boolean zzb(zzbqe zzbqeVar, int i, int i2) {
        synchronized (zzbqeVar) {
            try {
                if (zzbqeVar.zze != 0) {
                    return false;
                }
                zzbqeVar.zze = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private zzbqd() {
        throw null;
    }
}
