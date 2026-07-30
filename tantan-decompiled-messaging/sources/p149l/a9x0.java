package p149l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class a9x0 {

    /* JADX INFO: renamed from: a */
    public final a9x0 f68217a;

    /* JADX INFO: renamed from: b */
    public g2s0 f68218b;

    /* JADX INFO: renamed from: c */
    public Map<String, ymr0> f68219c = new HashMap();

    /* JADX INFO: renamed from: d */
    public Map<String, Boolean> f68220d = new HashMap();

    public a9x0(a9x0 a9x0Var, g2s0 g2s0Var) {
        this.f68217a = a9x0Var;
        this.f68218b = g2s0Var;
    }

    /* JADX INFO: renamed from: a */
    public final ymr0 m95460a(String str) {
        while (!this.f68219c.containsKey(str)) {
            this = this.f68217a;
            if (this == null) {
                dqi0.m113073a("%s is not defined", new Object[]{str});
                return null;
            }
        }
        return this.f68219c.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final ymr0 m95461b(v8r0 v8r0Var) {
        ymr0 ymr0VarM124174a = ymr0.f199051w0;
        Iterator<Integer> itM197502s = v8r0Var.m197502s();
        while (itM197502s.hasNext()) {
            ymr0VarM124174a = this.f68218b.m124174a(this, v8r0Var.m197494g(itM197502s.next().intValue()));
            if (ymr0VarM124174a instanceof ldr0) {
                break;
            }
        }
        return ymr0VarM124174a;
    }

    /* JADX INFO: renamed from: c */
    public final ymr0 m95462c(ymr0 ymr0Var) {
        return this.f68218b.m124174a(this, ymr0Var);
    }

    /* JADX INFO: renamed from: d */
    public final a9x0 m95463d() {
        return new a9x0(this, this.f68218b);
    }

    /* JADX INFO: renamed from: e */
    public final void m95464e(String str, ymr0 ymr0Var) {
        if (this.f68220d.containsKey(str)) {
            return;
        }
        Map<String, ymr0> map = this.f68219c;
        if (ymr0Var == null) {
            map.remove(str);
        } else {
            map.put(str, ymr0Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m95465f(String str, ymr0 ymr0Var) {
        m95464e(str, ymr0Var);
        this.f68220d.put(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m95466g(String str) {
        while (!this.f68219c.containsKey(str)) {
            this = this.f68217a;
            if (this == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m95467h(String str, ymr0 ymr0Var) {
        a9x0 a9x0Var;
        while (!this.f68219c.containsKey(str) && (a9x0Var = this.f68217a) != null && a9x0Var.m95466g(str)) {
            this = this.f68217a;
        }
        if (this.f68220d.containsKey(str)) {
            return;
        }
        Map<String, ymr0> map = this.f68219c;
        if (ymr0Var == null) {
            map.remove(str);
        } else {
            map.put(str, ymr0Var);
        }
    }
}
