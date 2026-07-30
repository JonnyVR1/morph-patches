package p149l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class qpy0 {

    /* JADX INFO: renamed from: a */
    public final c6r0 f155838a;

    /* JADX INFO: renamed from: b */
    public final Map f155839b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Set f155840c = new HashSet();

    /* JADX INFO: renamed from: d */
    public final Map f155841d = new HashMap();

    /* JADX INFO: renamed from: e */
    public e4x0 f155842e;

    public qpy0(c6r0 c6r0Var) {
        this.f155838a = c6r0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m175868a(e4x0 e4x0Var) {
        if (e4x0Var != this.f155842e) {
            this.f155842e = e4x0Var;
            this.f155839b.clear();
            this.f155841d.clear();
        }
    }
}
