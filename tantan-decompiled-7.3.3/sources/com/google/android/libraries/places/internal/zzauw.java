package com.google.android.libraries.places.internal;

import p153l.pr3;

/* JADX INFO: loaded from: classes7.dex */
final class zzauw implements zzavd {
    private final zzavd[] zza;

    public zzauw(zzavd... zzavdVarArr) {
        this.zza = zzavdVarArr;
    }

    @Override // com.google.android.libraries.places.internal.zzavd
    public final zzavc zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzavd zzavdVar = this.zza[i];
            if (zzavdVar.zzc(cls)) {
                return zzavdVar.zzb(cls);
            }
        }
        pr3.m173429a("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzavd
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
