package p153l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hsr0 {
    /* JADX INFO: renamed from: a */
    public static Iterator<ewr0> m137035a(Map<String, ewr0> map) {
        return new vqr0(map.keySet().iterator());
    }

    /* JADX INFO: renamed from: b */
    public static ewr0 m137036b(eor0 eor0Var, ewr0 ewr0Var, gix0 gix0Var, List<ewr0> list) {
        if (eor0Var.zzc(ewr0Var.zzf())) {
            ewr0 ewr0VarZza = eor0Var.zza(ewr0Var.zzf());
            if (ewr0VarZza instanceof mpr0) {
                return ((mpr0) ewr0VarZza).mo107102d(gix0Var, list);
            }
            gzi0.m133102a("%s is not a function", new Object[]{ewr0Var.zzf()});
            return null;
        }
        if ("hasOwnProperty".equals(ewr0Var.zzf())) {
            tqw0.m192373g("hasOwnProperty", 1, list);
            return eor0Var.zzc(gix0Var.m130395c(list.get(0)).zzf()) ? ewr0.f96184B0 : ewr0.f96185C0;
        }
        gzi0.m133102a("Object has no function %s", new Object[]{ewr0Var.zzf()});
        return null;
    }
}
