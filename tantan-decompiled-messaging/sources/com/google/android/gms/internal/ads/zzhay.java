package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p149l.aax0;
import p149l.bz00;
import p149l.r8x0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzhay extends LinkedHashMap {
    private static final zzhay zza;
    private boolean zzb;

    static {
        zzhay zzhayVar = new zzhay();
        zza = zzhayVar;
        zzhayVar.zzb = false;
    }

    private zzhay() {
        this.zzb = true;
    }

    public static zzhay zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof r8x0)) {
                return obj.hashCode();
            }
            bz00.m104536a();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iM95574b = aax0.m95574b(length, bArr, 0, length);
        if (iM95574b == 0) {
            return 1;
        }
        return iM95574b;
    }

    private final void zzg() {
        if (this.zzb) {
            return;
        }
        bz00.m104536a();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iZzf = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iZzf += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return iZzf;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zzg();
        Charset charset = aax0.f68607a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzg();
        for (Object obj : map.keySet()) {
            Charset charset = aax0.f68607a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzhay zzb() {
        return isEmpty() ? new zzhay() : new zzhay(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzhay zzhayVar) {
        zzg();
        if (zzhayVar.isEmpty()) {
            return;
        }
        putAll(zzhayVar);
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzhay(Map map) {
        super(map);
        this.zzb = true;
    }
}
