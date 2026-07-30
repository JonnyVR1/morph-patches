package p153l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class gix0 {

    /* JADX INFO: renamed from: a */
    public final gix0 f104534a;

    /* JADX INFO: renamed from: b */
    public mbs0 f104535b;

    /* JADX INFO: renamed from: c */
    public Map<String, ewr0> f104536c = new HashMap();

    /* JADX INFO: renamed from: d */
    public Map<String, Boolean> f104537d = new HashMap();

    public gix0(gix0 gix0Var, mbs0 mbs0Var) {
        this.f104534a = gix0Var;
        this.f104535b = mbs0Var;
    }

    /* JADX INFO: renamed from: a */
    public final ewr0 m130393a(String str) {
        while (!this.f104536c.containsKey(str)) {
            this = this.f104534a;
            if (this == null) {
                gzi0.m133102a("%s is not defined", new Object[]{str});
                return null;
            }
        }
        return this.f104536c.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final ewr0 m130394b(bir0 bir0Var) {
        ewr0 ewr0VarM157884a = ewr0.f96187w0;
        Iterator<Integer> itM104506s = bir0Var.m104506s();
        while (itM104506s.hasNext()) {
            ewr0VarM157884a = this.f104535b.m157884a(this, bir0Var.m104498g(itM104506s.next().intValue()));
            if (ewr0VarM157884a instanceof rmr0) {
                break;
            }
        }
        return ewr0VarM157884a;
    }

    /* JADX INFO: renamed from: c */
    public final ewr0 m130395c(ewr0 ewr0Var) {
        return this.f104535b.m157884a(this, ewr0Var);
    }

    /* JADX INFO: renamed from: d */
    public final gix0 m130396d() {
        return new gix0(this, this.f104535b);
    }

    /* JADX INFO: renamed from: e */
    public final void m130397e(String str, ewr0 ewr0Var) {
        if (this.f104537d.containsKey(str)) {
            return;
        }
        Map<String, ewr0> map = this.f104536c;
        if (ewr0Var == null) {
            map.remove(str);
        } else {
            map.put(str, ewr0Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m130398f(String str, ewr0 ewr0Var) {
        m130397e(str, ewr0Var);
        this.f104537d.put(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m130399g(String str) {
        while (!this.f104536c.containsKey(str)) {
            this = this.f104534a;
            if (this == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m130400h(String str, ewr0 ewr0Var) {
        gix0 gix0Var;
        while (!this.f104536c.containsKey(str) && (gix0Var = this.f104534a) != null && gix0Var.m130399g(str)) {
            this = this.f104534a;
        }
        if (this.f104537d.containsKey(str)) {
            return;
        }
        Map<String, ewr0> map = this.f104536c;
        if (ewr0Var == null) {
            map.remove(str);
        } else {
            map.put(str, ewr0Var);
        }
    }
}
