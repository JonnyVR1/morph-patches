package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zzaup extends zzaut {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ zzaup(zzauo zzauoVar) {
        super(null);
    }

    private static List zzf(Object obj, long j, int i) {
        List listZzd;
        List list = (List) zzawx.zzf(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzaun) {
                listZzd = new zzaum(i);
            } else {
                listZzd = ((list instanceof zzavo) && (list instanceof zzauc)) ? ((zzauc) list).zzd(i) : new ArrayList(i);
            }
            zzawx.zzs(obj, j, listZzd);
            return listZzd;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzawx.zzs(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof zzaws) {
            zzaum zzaumVar = new zzaum(list.size() + i);
            zzaumVar.addAll(zzaumVar.size(), (zzaws) list);
            zzawx.zzs(obj, j, zzaumVar);
            return zzaumVar;
        }
        if ((list instanceof zzavo) && (list instanceof zzauc)) {
            zzauc zzaucVar = (zzauc) list;
            if (!zzaucVar.zzc()) {
                zzauc zzaucVarZzd = zzaucVar.zzd(list.size() + i);
                zzawx.zzs(obj, j, zzaucVarZzd);
                return zzaucVarZzd;
            }
        }
        return list;
    }

    @Override // com.google.android.libraries.places.internal.zzaut
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.libraries.places.internal.zzaut
    public final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzawx.zzf(obj, j);
        if (list instanceof zzaun) {
            objUnmodifiableList = ((zzaun) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzavo) && (list instanceof zzauc)) {
                zzauc zzaucVar = (zzauc) list;
                if (zzaucVar.zzc()) {
                    zzaucVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzawx.zzs(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.libraries.places.internal.zzaut
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzawx.zzf(obj2, j);
        List listZzf = zzf(obj, j, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzawx.zzs(obj, j, list);
    }

    private zzaup() {
        throw null;
    }
}
