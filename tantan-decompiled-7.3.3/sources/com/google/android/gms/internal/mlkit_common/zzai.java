package com.google.android.gms.internal.mlkit_common;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import p153l.j1z0;
import p153l.qxr0;
import p153l.za50;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzai implements Map, Serializable {
    private transient zzaj zza;
    private transient zzaj zzb;
    private transient zzab zzc;

    public static zzai zzc(Object obj, Object obj2) {
        j1z0.m143160a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return zzaq.zzg(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return qxr0.m178616a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzaj zzajVar = this.zzb;
        if (zzajVar != null) {
            return zzajVar;
        }
        zzaj zzajVarZze = zze();
        this.zzb = zzajVarZze;
        return zzajVarZze;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            za50.m219101a("size cannot be negative but was: ", size);
            return null;
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzab zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzab values() {
        zzab zzabVar = this.zzc;
        if (zzabVar != null) {
            return zzabVar;
        }
        zzab zzabVarZza = zza();
        this.zzc = zzabVarZza;
        return zzabVarZza;
    }

    public abstract zzaj zzd();

    public abstract zzaj zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzaj entrySet() {
        zzaj zzajVar = this.zza;
        if (zzajVar != null) {
            return zzajVar;
        }
        zzaj zzajVarZzd = zzd();
        this.zza = zzajVarZzd;
        return zzajVarZzd;
    }
}
