package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wey0 extends ggr0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jby0 f185995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wey0(i4y0 i4y0Var, String str, jby0 jby0Var) {
        super(str);
        this.f185995c = jby0Var;
    }

    @Override // p149l.ggr0
    /* JADX INFO: renamed from: d */
    public final ymr0 mo108642d(a9x0 a9x0Var, List<ymr0> list) {
        nhw0.m159470g("getValue", 2, list);
        ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(0));
        ymr0 ymr0VarM95462c2 = a9x0Var.m95462c(list.get(1));
        String strZza = this.f185995c.zza(ymr0VarM95462c.zzf());
        return strZza != null ? new ppr0(strZza) : ymr0VarM95462c2;
    }
}
