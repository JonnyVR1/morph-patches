package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.acr0;
import p149l.bar0;
import p149l.ig3;
import p149l.ppr0;
import p149l.qkq0;
import p149l.rqr0;
import p149l.ulr0;
import p149l.v8r0;
import p149l.ymr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2343r0 {
    /* JADX INFO: renamed from: a */
    public static ymr0 m14278a(zzgd$zzd zzgd_zzd) {
        if (zzgd_zzd == null) {
            return ymr0.f199051w0;
        }
        int i = C2335n0.f10248a[zzgd_zzd.m14623C().ordinal()];
        if (i == 1) {
            return zzgd_zzd.m14630N() ? new ppr0(zzgd_zzd.m14625G()) : ymr0.f199050D0;
        }
        if (i == 2) {
            return zzgd_zzd.m14629M() ? new acr0(Double.valueOf(zzgd_zzd.m14622B())) : new acr0(null);
        }
        if (i == 3) {
            return zzgd_zzd.m14628L() ? new bar0(Boolean.valueOf(zzgd_zzd.m14627K())) : new bar0(null);
        }
        if (i != 4) {
            if (i != 5) {
                qkq0.m175383a("Invalid entity: ".concat(String.valueOf(zzgd_zzd)));
                return null;
            }
            ig3.m135964a("Unknown type found. Cannot convert entity");
            return null;
        }
        List<zzgd$zzd> listM14626I = zzgd_zzd.m14626I();
        ArrayList arrayList = new ArrayList();
        Iterator<zzgd$zzd> it = listM14626I.iterator();
        while (it.hasNext()) {
            arrayList.add(m14278a(it.next()));
        }
        return new rqr0(zzgd_zzd.m14624E(), arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static ymr0 m14279b(Object obj) {
        if (obj == null) {
            return ymr0.f199052x0;
        }
        if (obj instanceof String) {
            return new ppr0((String) obj);
        }
        if (obj instanceof Double) {
            return new acr0((Double) obj);
        }
        if (obj instanceof Long) {
            return new acr0(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new acr0(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new bar0((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                ig3.m135964a("Invalid value type");
                return null;
            }
            v8r0 v8r0Var = new v8r0();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                v8r0Var.m197496i(m14279b(it.next()));
            }
            return v8r0Var;
        }
        ulr0 ulr0Var = new ulr0();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            ymr0 ymr0VarM14279b = m14279b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                ulr0Var.mo126000a((String) string, ymr0VarM14279b);
            }
        }
        return ulr0Var;
    }
}
