package p153l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class mgs0 extends g6s0 {
    public mgs0() {
        this.f102479a.add(zzbv.AND);
        this.f102479a.add(zzbv.NOT);
        this.f102479a.add(zzbv.OR);
    }

    @Override // p153l.g6s0
    /* JADX INFO: renamed from: b */
    public final ewr0 mo110282b(String str, gix0 gix0Var, List<ewr0> list) {
        int i = kks0.f127286a[tqw0.m192369c(str).ordinal()];
        if (i == 1) {
            tqw0.m192372f(zzbv.AND, 2, list);
            ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(0));
            return !ewr0VarM130395c.zzd().booleanValue() ? ewr0VarM130395c : gix0Var.m130395c(list.get(1));
        }
        if (i == 2) {
            tqw0.m192372f(zzbv.NOT, 1, list);
            return new hjr0(Boolean.valueOf(!gix0Var.m130395c(list.get(0)).zzd().booleanValue()));
        }
        if (i != 3) {
            return super.m129267a(str);
        }
        tqw0.m192372f(zzbv.OR, 2, list);
        ewr0 ewr0VarM130395c2 = gix0Var.m130395c(list.get(0));
        return ewr0VarM130395c2.zzd().booleanValue() ? ewr0VarM130395c2 : gix0Var.m130395c(list.get(1));
    }
}
