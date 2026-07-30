package p153l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o3s0 extends g6s0 {
    public o3s0() {
        this.f102479a.add(zzbv.BITWISE_AND);
        this.f102479a.add(zzbv.BITWISE_LEFT_SHIFT);
        this.f102479a.add(zzbv.BITWISE_NOT);
        this.f102479a.add(zzbv.BITWISE_OR);
        this.f102479a.add(zzbv.BITWISE_RIGHT_SHIFT);
        this.f102479a.add(zzbv.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f102479a.add(zzbv.BITWISE_XOR);
    }

    @Override // p153l.g6s0
    /* JADX INFO: renamed from: b */
    public final ewr0 mo110282b(String str, gix0 gix0Var, List<ewr0> list) {
        switch (l7s0.f130375a[tqw0.m192369c(str).ordinal()]) {
            case 1:
                tqw0.m192372f(zzbv.BITWISE_AND, 2, list);
                return new glr0(Double.valueOf(tqw0.m192375i(gix0Var.m130395c(list.get(0)).zze().doubleValue()) & tqw0.m192375i(gix0Var.m130395c(list.get(1)).zze().doubleValue())));
            case 2:
                tqw0.m192372f(zzbv.BITWISE_LEFT_SHIFT, 2, list);
                return new glr0(Double.valueOf(tqw0.m192375i(gix0Var.m130395c(list.get(0)).zze().doubleValue()) << ((int) (tqw0.m192379m(gix0Var.m130395c(list.get(1)).zze().doubleValue()) & 31))));
            case 3:
                tqw0.m192372f(zzbv.BITWISE_NOT, 1, list);
                return new glr0(Double.valueOf(~tqw0.m192375i(gix0Var.m130395c(list.get(0)).zze().doubleValue())));
            case 4:
                tqw0.m192372f(zzbv.BITWISE_OR, 2, list);
                return new glr0(Double.valueOf(tqw0.m192375i(gix0Var.m130395c(list.get(0)).zze().doubleValue()) | tqw0.m192375i(gix0Var.m130395c(list.get(1)).zze().doubleValue())));
            case 5:
                tqw0.m192372f(zzbv.BITWISE_RIGHT_SHIFT, 2, list);
                return new glr0(Double.valueOf(tqw0.m192375i(gix0Var.m130395c(list.get(0)).zze().doubleValue()) >> ((int) (tqw0.m192379m(gix0Var.m130395c(list.get(1)).zze().doubleValue()) & 31))));
            case 6:
                tqw0.m192372f(zzbv.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new glr0(Double.valueOf(tqw0.m192379m(gix0Var.m130395c(list.get(0)).zze().doubleValue()) >>> ((int) (tqw0.m192379m(gix0Var.m130395c(list.get(1)).zze().doubleValue()) & 31))));
            case 7:
                tqw0.m192372f(zzbv.BITWISE_XOR, 2, list);
                return new glr0(Double.valueOf(tqw0.m192375i(gix0Var.m130395c(list.get(0)).zze().doubleValue()) ^ tqw0.m192375i(gix0Var.m130395c(list.get(1)).zze().doubleValue())));
            default:
                return super.m129267a(str);
        }
    }
}
