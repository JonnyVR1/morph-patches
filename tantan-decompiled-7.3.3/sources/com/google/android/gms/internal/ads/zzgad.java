package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p153l.btw0;
import p153l.dsw0;
import p153l.tpw0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzgad implements Map, Serializable {
    private transient zzgaf zza;
    private transient zzgaf zzb;
    private transient zzfzv zzc;

    public static zzgad zzc(Map map) {
        Set setEntrySet = map.entrySet();
        C2298w2 c2298w2 = new C2298w2(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        c2298w2.m13474b(setEntrySet);
        return c2298w2.m13475c();
    }

    public static zzgad zzd() {
        return zzgbp.zza;
    }

    public static zzgad zze(Object obj, Object obj2) {
        tpw0.m192214b("dialog_not_shown_reason", obj2);
        return zzgbp.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
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
        return dsw0.m117780b(this, obj);
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
        return btw0.m106403a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
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
        tpw0.m192213a(size, "size");
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

    public abstract zzfzv zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfzv values() {
        zzfzv zzfzvVar = this.zzc;
        if (zzfzvVar != null) {
            return zzfzvVar;
        }
        zzfzv zzfzvVarZza = zza();
        this.zzc = zzfzvVarZza;
        return zzfzvVarZza;
    }

    public abstract zzgaf zzf();

    public abstract zzgaf zzg();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgaf entrySet() {
        zzgaf zzgafVar = this.zza;
        if (zzgafVar != null) {
            return zzgafVar;
        }
        zzgaf zzgafVarZzf = zzf();
        this.zza = zzgafVarZzf;
        return zzgafVarZzf;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzgaf keySet() {
        zzgaf zzgafVar = this.zzb;
        if (zzgafVar != null) {
            return zzgafVar;
        }
        zzgaf zzgafVarZzg = zzg();
        this.zzb = zzgafVarZzg;
        return zzgafVarZzg;
    }
}
