package p153l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zqs0 extends g6s0 {
    public zqs0() {
        this.f102479a.add(zzbv.ADD);
        this.f102479a.add(zzbv.DIVIDE);
        this.f102479a.add(zzbv.MODULUS);
        this.f102479a.add(zzbv.MULTIPLY);
        this.f102479a.add(zzbv.NEGATE);
        this.f102479a.add(zzbv.POST_DECREMENT);
        this.f102479a.add(zzbv.POST_INCREMENT);
        this.f102479a.add(zzbv.PRE_DECREMENT);
        this.f102479a.add(zzbv.PRE_INCREMENT);
        this.f102479a.add(zzbv.SUBTRACT);
    }

    @Override // p153l.g6s0
    /* JADX INFO: renamed from: b */
    public final ewr0 mo110282b(String str, gix0 gix0Var, List<ewr0> list) {
        switch (nus0.f143740a[tqw0.m192369c(str).ordinal()]) {
            case 1:
                tqw0.m192372f(zzbv.ADD, 2, list);
                ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(0));
                ewr0 ewr0VarM130395c2 = gix0Var.m130395c(list.get(1));
                if (!(ewr0VarM130395c instanceof eor0) && !(ewr0VarM130395c instanceof vyr0) && !(ewr0VarM130395c2 instanceof eor0) && !(ewr0VarM130395c2 instanceof vyr0)) {
                    return new glr0(Double.valueOf(ewr0VarM130395c.zze().doubleValue() + ewr0VarM130395c2.zze().doubleValue()));
                }
                return new vyr0(ewr0VarM130395c.zzf() + ewr0VarM130395c2.zzf());
            case 2:
                tqw0.m192372f(zzbv.DIVIDE, 2, list);
                return new glr0(Double.valueOf(gix0Var.m130395c(list.get(0)).zze().doubleValue() / gix0Var.m130395c(list.get(1)).zze().doubleValue()));
            case 3:
                tqw0.m192372f(zzbv.MODULUS, 2, list);
                return new glr0(Double.valueOf(gix0Var.m130395c(list.get(0)).zze().doubleValue() % gix0Var.m130395c(list.get(1)).zze().doubleValue()));
            case 4:
                tqw0.m192372f(zzbv.MULTIPLY, 2, list);
                return new glr0(Double.valueOf(gix0Var.m130395c(list.get(0)).zze().doubleValue() * gix0Var.m130395c(list.get(1)).zze().doubleValue()));
            case 5:
                tqw0.m192372f(zzbv.NEGATE, 1, list);
                return new glr0(Double.valueOf(gix0Var.m130395c(list.get(0)).zze().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                tqw0.m192373g(str, 2, list);
                ewr0 ewr0VarM130395c3 = gix0Var.m130395c(list.get(0));
                gix0Var.m130395c(list.get(1));
                return ewr0VarM130395c3;
            case 8:
            case 9:
                tqw0.m192373g(str, 1, list);
                return gix0Var.m130395c(list.get(0));
            case 10:
                tqw0.m192372f(zzbv.SUBTRACT, 2, list);
                return new glr0(Double.valueOf(gix0Var.m130395c(list.get(0)).zze().doubleValue() + new glr0(Double.valueOf(gix0Var.m130395c(list.get(1)).zze().doubleValue() * (-1.0d))).zze().doubleValue()));
            default:
                return super.m129267a(str);
        }
    }
}
