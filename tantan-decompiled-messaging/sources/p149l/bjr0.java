package p149l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bjr0 {
    /* JADX INFO: renamed from: a */
    public static Iterator<ymr0> m102226a(Map<String, ymr0> map) {
        return new phr0(map.keySet().iterator());
    }

    /* JADX INFO: renamed from: b */
    public static ymr0 m102227b(yer0 yer0Var, ymr0 ymr0Var, a9x0 a9x0Var, List<ymr0> list) {
        if (yer0Var.zzc(ymr0Var.zzf())) {
            ymr0 ymr0VarZza = yer0Var.zza(ymr0Var.zzf());
            if (ymr0VarZza instanceof ggr0) {
                return ((ggr0) ymr0VarZza).mo108642d(a9x0Var, list);
            }
            dqi0.m113073a("%s is not a function", new Object[]{ymr0Var.zzf()});
            return null;
        }
        if ("hasOwnProperty".equals(ymr0Var.zzf())) {
            nhw0.m159470g("hasOwnProperty", 1, list);
            return yer0Var.zzc(a9x0Var.m95462c(list.get(0)).zzf()) ? ymr0.f199048B0 : ymr0.f199049C0;
        }
        dqi0.m113073a("Object has no function %s", new Object[]{ymr0Var.zzf()});
        return null;
    }
}
