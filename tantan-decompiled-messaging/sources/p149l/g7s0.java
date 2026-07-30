package p149l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class g7s0 extends axr0 {
    public g7s0() {
        this.f72232a.add(zzbv.AND);
        this.f72232a.add(zzbv.NOT);
        this.f72232a.add(zzbv.OR);
    }

    @Override // p149l.axr0
    /* JADX INFO: renamed from: b */
    public final ymr0 mo99519b(String str, a9x0 a9x0Var, List<ymr0> list) {
        int i = ebs0.f90377a[nhw0.m159466c(str).ordinal()];
        if (i == 1) {
            nhw0.m159469f(zzbv.AND, 2, list);
            ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(0));
            return !ymr0VarM95462c.zzd().booleanValue() ? ymr0VarM95462c : a9x0Var.m95462c(list.get(1));
        }
        if (i == 2) {
            nhw0.m159469f(zzbv.NOT, 1, list);
            return new bar0(Boolean.valueOf(!a9x0Var.m95462c(list.get(0)).zzd().booleanValue()));
        }
        if (i != 3) {
            return super.m99518a(str);
        }
        nhw0.m159469f(zzbv.OR, 2, list);
        ymr0 ymr0VarM95462c2 = a9x0Var.m95462c(list.get(0));
        return ymr0VarM95462c2.zzd().booleanValue() ? ymr0VarM95462c2 : a9x0Var.m95462c(list.get(1));
    }
}
