package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zjs0 extends axr0 {
    @Override // p149l.axr0
    /* JADX INFO: renamed from: b */
    public final ymr0 mo99519b(String str, a9x0 a9x0Var, List<ymr0> list) {
        if (str == null || str.isEmpty() || !a9x0Var.m95466g(str)) {
            dqi0.m113073a("Command not found: %s", new Object[]{str});
            return null;
        }
        ymr0 ymr0VarM95460a = a9x0Var.m95460a(str);
        if (ymr0VarM95460a instanceof ggr0) {
            return ((ggr0) ymr0VarM95460a).mo108642d(a9x0Var, list);
        }
        dqi0.m113073a("Function %s is not defined", new Object[]{str});
        return null;
    }
}
