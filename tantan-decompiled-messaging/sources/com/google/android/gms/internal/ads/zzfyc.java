package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p149l.riw0;

/* JADX INFO: loaded from: classes6.dex */
class zzfyc extends zzfyt implements riw0 {
    public zzfyc(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzfyt
    public /* bridge */ /* synthetic */ Collection zza() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfyt
    public final Collection zzb(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzfyt
    public final Collection zzc(Object obj, Collection collection) {
        return zzh(obj, (List) collection, null);
    }
}
