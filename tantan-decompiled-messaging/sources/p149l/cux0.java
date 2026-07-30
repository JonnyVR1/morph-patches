package p149l;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cux0 extends ggr0 {

    /* JADX INFO: renamed from: c */
    public final m4r0 f82606c;

    public cux0(m4r0 m4r0Var) {
        super("internal.eventLogger");
        this.f82606c = m4r0Var;
    }

    @Override // p149l.ggr0
    /* JADX INFO: renamed from: d */
    public final ymr0 mo108642d(a9x0 a9x0Var, List<ymr0> list) {
        nhw0.m159470g(this.f102530a, 3, list);
        String strZzf = a9x0Var.m95462c(list.get(0)).zzf();
        long jM159464a = (long) nhw0.m159464a(a9x0Var.m95462c(list.get(1)).zze().doubleValue());
        ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(2));
        this.f82606c.m153092b(strZzf, jM159464a, ymr0VarM95462c instanceof ulr0 ? nhw0.m159468e((ulr0) ymr0VarM95462c) : new HashMap<>());
        return ymr0.f199051w0;
    }
}
