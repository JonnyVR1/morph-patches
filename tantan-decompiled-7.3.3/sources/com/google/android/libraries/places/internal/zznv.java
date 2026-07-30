package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zznv extends zzni {
    private final zznx zza;

    public zznv(zznx zznxVar, int i) {
        super(zznxVar.size(), i);
        this.zza = zznxVar;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
