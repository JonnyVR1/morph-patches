package p149l;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jxy0 extends ggr0 {

    /* JADX INFO: renamed from: c */
    public final hzx0 f120270c;

    /* JADX INFO: renamed from: d */
    public final Map<String, ggr0> f120271d;

    public jxy0(hzx0 hzx0Var) {
        super("require");
        this.f120271d = new HashMap();
        this.f120270c = hzx0Var;
    }

    @Override // p149l.ggr0
    /* JADX INFO: renamed from: d */
    public final ymr0 mo108642d(a9x0 a9x0Var, List<ymr0> list) {
        nhw0.m159470g("require", 1, list);
        String strZzf = a9x0Var.m95462c(list.get(0)).zzf();
        if (this.f120271d.containsKey(strZzf)) {
            return this.f120271d.get(strZzf);
        }
        ymr0 ymr0VarM133724a = this.f120270c.m133724a(strZzf);
        if (ymr0VarM133724a instanceof ggr0) {
            this.f120271d.put(strZzf, (ggr0) ymr0VarM133724a);
        }
        return ymr0VarM133724a;
    }
}
