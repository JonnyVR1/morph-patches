package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.avr0;
import p153l.bir0;
import p153l.ewr0;
import p153l.glr0;
import p153l.hjr0;
import p153l.vyr0;
import p153l.wg3;
import p153l.wtq0;
import p153l.xzr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2366r0 {
    /* JADX INFO: renamed from: a */
    public static ewr0 m14332a(zzgd$zzd zzgd_zzd) {
        if (zzgd_zzd == null) {
            return ewr0.f96187w0;
        }
        int i = C2358n0.f10285a[zzgd_zzd.m14677C().ordinal()];
        if (i == 1) {
            return zzgd_zzd.m14684N() ? new vyr0(zzgd_zzd.m14679G()) : ewr0.f96186D0;
        }
        if (i == 2) {
            return zzgd_zzd.m14683M() ? new glr0(Double.valueOf(zzgd_zzd.m14676B())) : new glr0(null);
        }
        if (i == 3) {
            return zzgd_zzd.m14682L() ? new hjr0(Boolean.valueOf(zzgd_zzd.m14681K())) : new hjr0(null);
        }
        if (i != 4) {
            if (i != 5) {
                wtq0.m207906a("Invalid entity: ".concat(String.valueOf(zzgd_zzd)));
                return null;
            }
            wg3.m206174a("Unknown type found. Cannot convert entity");
            return null;
        }
        List<zzgd$zzd> listM14680I = zzgd_zzd.m14680I();
        ArrayList arrayList = new ArrayList();
        Iterator<zzgd$zzd> it = listM14680I.iterator();
        while (it.hasNext()) {
            arrayList.add(m14332a(it.next()));
        }
        return new xzr0(zzgd_zzd.m14678E(), arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static ewr0 m14333b(Object obj) {
        if (obj == null) {
            return ewr0.f96188x0;
        }
        if (obj instanceof String) {
            return new vyr0((String) obj);
        }
        if (obj instanceof Double) {
            return new glr0((Double) obj);
        }
        if (obj instanceof Long) {
            return new glr0(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new glr0(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new hjr0((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                wg3.m206174a("Invalid value type");
                return null;
            }
            bir0 bir0Var = new bir0();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                bir0Var.m104500i(m14333b(it.next()));
            }
            return bir0Var;
        }
        avr0 avr0Var = new avr0();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            ewr0 ewr0VarM14333b = m14333b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                avr0Var.mo100512a((String) string, ewr0VarM14333b);
            }
        }
        return avr0Var;
    }
}
