package p149l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ths0 extends axr0 {
    public ths0() {
        this.f72232a.add(zzbv.ADD);
        this.f72232a.add(zzbv.DIVIDE);
        this.f72232a.add(zzbv.MODULUS);
        this.f72232a.add(zzbv.MULTIPLY);
        this.f72232a.add(zzbv.NEGATE);
        this.f72232a.add(zzbv.POST_DECREMENT);
        this.f72232a.add(zzbv.POST_INCREMENT);
        this.f72232a.add(zzbv.PRE_DECREMENT);
        this.f72232a.add(zzbv.PRE_INCREMENT);
        this.f72232a.add(zzbv.SUBTRACT);
    }

    @Override // p149l.axr0
    /* JADX INFO: renamed from: b */
    public final ymr0 mo99519b(String str, a9x0 a9x0Var, List<ymr0> list) {
        switch (hls0.f108372a[nhw0.m159466c(str).ordinal()]) {
            case 1:
                nhw0.m159469f(zzbv.ADD, 2, list);
                ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(0));
                ymr0 ymr0VarM95462c2 = a9x0Var.m95462c(list.get(1));
                if (!(ymr0VarM95462c instanceof yer0) && !(ymr0VarM95462c instanceof ppr0) && !(ymr0VarM95462c2 instanceof yer0) && !(ymr0VarM95462c2 instanceof ppr0)) {
                    return new acr0(Double.valueOf(ymr0VarM95462c.zze().doubleValue() + ymr0VarM95462c2.zze().doubleValue()));
                }
                return new ppr0(ymr0VarM95462c.zzf() + ymr0VarM95462c2.zzf());
            case 2:
                nhw0.m159469f(zzbv.DIVIDE, 2, list);
                return new acr0(Double.valueOf(a9x0Var.m95462c(list.get(0)).zze().doubleValue() / a9x0Var.m95462c(list.get(1)).zze().doubleValue()));
            case 3:
                nhw0.m159469f(zzbv.MODULUS, 2, list);
                return new acr0(Double.valueOf(a9x0Var.m95462c(list.get(0)).zze().doubleValue() % a9x0Var.m95462c(list.get(1)).zze().doubleValue()));
            case 4:
                nhw0.m159469f(zzbv.MULTIPLY, 2, list);
                return new acr0(Double.valueOf(a9x0Var.m95462c(list.get(0)).zze().doubleValue() * a9x0Var.m95462c(list.get(1)).zze().doubleValue()));
            case 5:
                nhw0.m159469f(zzbv.NEGATE, 1, list);
                return new acr0(Double.valueOf(a9x0Var.m95462c(list.get(0)).zze().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                nhw0.m159470g(str, 2, list);
                ymr0 ymr0VarM95462c3 = a9x0Var.m95462c(list.get(0));
                a9x0Var.m95462c(list.get(1));
                return ymr0VarM95462c3;
            case 8:
            case 9:
                nhw0.m159470g(str, 1, list);
                return a9x0Var.m95462c(list.get(0));
            case 10:
                nhw0.m159469f(zzbv.SUBTRACT, 2, list);
                return new acr0(Double.valueOf(a9x0Var.m95462c(list.get(0)).zze().doubleValue() + new acr0(Double.valueOf(a9x0Var.m95462c(list.get(1)).zze().doubleValue() * (-1.0d))).zze().doubleValue()));
            default:
                return super.m99518a(str);
        }
    }
}
