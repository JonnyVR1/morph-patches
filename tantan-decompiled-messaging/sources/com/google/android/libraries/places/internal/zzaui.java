package com.google.android.libraries.places.internal;

import java.util.Map;
import p149l.ig3;

/* JADX INFO: loaded from: classes7.dex */
final class zzaui implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzauk) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzavf) {
            return ((zzauk) this.zza.getValue()).zzc((zzavf) obj);
        }
        ig3.m135964a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        return null;
    }

    public final zzauk zza() {
        return (zzauk) this.zza.getValue();
    }
}
