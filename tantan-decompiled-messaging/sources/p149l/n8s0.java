package p149l;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class n8s0 implements Comparator<ymr0> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ggr0 f137683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a9x0 f137684b;

    public n8s0(ggr0 ggr0Var, a9x0 a9x0Var) {
        this.f137683a = ggr0Var;
        this.f137684b = a9x0Var;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ymr0 ymr0Var, ymr0 ymr0Var2) {
        ymr0 ymr0Var3 = ymr0Var;
        ymr0 ymr0Var4 = ymr0Var2;
        ggr0 ggr0Var = this.f137683a;
        a9x0 a9x0Var = this.f137684b;
        if (ymr0Var3 instanceof qvr0) {
            return !(ymr0Var4 instanceof qvr0) ? 1 : 0;
        }
        if (ymr0Var4 instanceof qvr0) {
            return -1;
        }
        return ggr0Var == null ? ymr0Var3.zzf().compareTo(ymr0Var4.zzf()) : (int) nhw0.m159464a(ggr0Var.mo108642d(a9x0Var, Arrays.asList(ymr0Var3, ymr0Var4)).zze().doubleValue());
    }
}
