package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p149l.k250;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzoa implements Map, Serializable {
    private transient zzob zza;
    private transient zzob zzb;
    private transient zznt zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public static zzoa zzc(Iterable iterable) {
        zznz zznzVar = new zznz(iterable instanceof Collection ? iterable.size() : 4);
        zznzVar.zzb(iterable);
        return zznzVar.zzc();
    }

    public static zzoa zzd() {
        return zzor.zza;
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
        return zzot.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzob zzobVar = this.zzb;
        if (zzobVar != null) {
            return zzobVar;
        }
        zzob zzobVarZzf = zzf();
        this.zzb = zzobVarZzf;
        return zzobVarZzf;
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
            k250.m144273a("size cannot be negative but was: ", size);
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

    public abstract zznt zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zznt values() {
        zznt zzntVar = this.zzc;
        if (zzntVar != null) {
            return zzntVar;
        }
        zznt zzntVarZza = zza();
        this.zzc = zzntVarZza;
        return zzntVarZza;
    }

    public abstract zzob zze();

    public abstract zzob zzf();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzob entrySet() {
        zzob zzobVar = this.zza;
        if (zzobVar != null) {
            return zzobVar;
        }
        zzob zzobVarZze = zze();
        this.zza = zzobVarZze;
        return zzobVarZze;
    }
}
