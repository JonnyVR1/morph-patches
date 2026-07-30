package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zzaur extends zzaut {
    public /* synthetic */ zzaur(zzauq zzauqVar) {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzaut
    public final List zza(Object obj, long j) {
        zzauc zzaucVar = (zzauc) zzawx.zzf(obj, j);
        if (zzaucVar.zzc()) {
            return zzaucVar;
        }
        int size = zzaucVar.size();
        zzauc zzaucVarZzd = zzaucVar.zzd(size == 0 ? 10 : size + size);
        zzawx.zzs(obj, j, zzaucVarZzd);
        return zzaucVarZzd;
    }

    @Override // com.google.android.libraries.places.internal.zzaut
    public final void zzb(Object obj, long j) {
        ((zzauc) zzawx.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzaut
    public final void zzc(Object obj, Object obj2, long j) {
        zzauc zzaucVarZzd = (zzauc) zzawx.zzf(obj, j);
        zzauc zzaucVar = (zzauc) zzawx.zzf(obj2, j);
        int size = zzaucVarZzd.size();
        int size2 = zzaucVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzaucVarZzd.zzc()) {
                zzaucVarZzd = zzaucVarZzd.zzd(size2 + size);
            }
            zzaucVarZzd.addAll(zzaucVar);
        }
        if (size > 0) {
            zzaucVar = zzaucVarZzd;
        }
        zzawx.zzs(obj, j, zzaucVar);
    }

    private zzaur() {
        throw null;
    }
}
