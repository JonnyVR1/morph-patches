package p149l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class iur0 extends axr0 {
    public iur0() {
        this.f72232a.add(zzbv.BITWISE_AND);
        this.f72232a.add(zzbv.BITWISE_LEFT_SHIFT);
        this.f72232a.add(zzbv.BITWISE_NOT);
        this.f72232a.add(zzbv.BITWISE_OR);
        this.f72232a.add(zzbv.BITWISE_RIGHT_SHIFT);
        this.f72232a.add(zzbv.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f72232a.add(zzbv.BITWISE_XOR);
    }

    @Override // p149l.axr0
    /* JADX INFO: renamed from: b */
    public final ymr0 mo99519b(String str, a9x0 a9x0Var, List<ymr0> list) {
        switch (fyr0.f99896a[nhw0.m159466c(str).ordinal()]) {
            case 1:
                nhw0.m159469f(zzbv.BITWISE_AND, 2, list);
                return new acr0(Double.valueOf(nhw0.m159472i(a9x0Var.m95462c(list.get(0)).zze().doubleValue()) & nhw0.m159472i(a9x0Var.m95462c(list.get(1)).zze().doubleValue())));
            case 2:
                nhw0.m159469f(zzbv.BITWISE_LEFT_SHIFT, 2, list);
                return new acr0(Double.valueOf(nhw0.m159472i(a9x0Var.m95462c(list.get(0)).zze().doubleValue()) << ((int) (nhw0.m159476m(a9x0Var.m95462c(list.get(1)).zze().doubleValue()) & 31))));
            case 3:
                nhw0.m159469f(zzbv.BITWISE_NOT, 1, list);
                return new acr0(Double.valueOf(~nhw0.m159472i(a9x0Var.m95462c(list.get(0)).zze().doubleValue())));
            case 4:
                nhw0.m159469f(zzbv.BITWISE_OR, 2, list);
                return new acr0(Double.valueOf(nhw0.m159472i(a9x0Var.m95462c(list.get(0)).zze().doubleValue()) | nhw0.m159472i(a9x0Var.m95462c(list.get(1)).zze().doubleValue())));
            case 5:
                nhw0.m159469f(zzbv.BITWISE_RIGHT_SHIFT, 2, list);
                return new acr0(Double.valueOf(nhw0.m159472i(a9x0Var.m95462c(list.get(0)).zze().doubleValue()) >> ((int) (nhw0.m159476m(a9x0Var.m95462c(list.get(1)).zze().doubleValue()) & 31))));
            case 6:
                nhw0.m159469f(zzbv.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new acr0(Double.valueOf(nhw0.m159476m(a9x0Var.m95462c(list.get(0)).zze().doubleValue()) >>> ((int) (nhw0.m159476m(a9x0Var.m95462c(list.get(1)).zze().doubleValue()) & 31))));
            case 7:
                nhw0.m159469f(zzbv.BITWISE_XOR, 2, list);
                return new acr0(Double.valueOf(nhw0.m159472i(a9x0Var.m95462c(list.get(0)).zze().doubleValue()) ^ nhw0.m159472i(a9x0Var.m95462c(list.get(1)).zze().doubleValue())));
            default:
                return super.m99518a(str);
        }
    }
}
