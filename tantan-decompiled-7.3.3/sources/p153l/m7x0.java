package p153l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class m7x0 {

    /* JADX INFO: renamed from: a */
    public final Map f135133a;

    /* JADX INFO: renamed from: b */
    public final Map f135134b;

    /* JADX INFO: renamed from: c */
    public final Map f135135c;

    /* JADX INFO: renamed from: d */
    public final Map f135136d;

    public m7x0(s7x0 s7x0Var) {
        this.f135133a = new HashMap(s7x0Var.f166717a);
        this.f135134b = new HashMap(s7x0Var.f166718b);
        this.f135135c = new HashMap(s7x0Var.f166719c);
        this.f135136d = new HashMap(s7x0Var.f166720d);
    }

    /* JADX INFO: renamed from: a */
    public final m7x0 m157339a(j5x0 j5x0Var) throws GeneralSecurityException {
        o7x0 o7x0Var = new o7x0(j5x0Var.m143598d(), j5x0Var.m143597c(), null);
        boolean zContainsKey = this.f135134b.containsKey(o7x0Var);
        Map map = this.f135134b;
        if (!zContainsKey) {
            map.put(o7x0Var, j5x0Var);
            return this;
        }
        j5x0 j5x0Var2 = (j5x0) map.get(o7x0Var);
        if (j5x0Var2.equals(j5x0Var) && j5x0Var.equals(j5x0Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(o7x0Var.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final m7x0 m157340b(n5x0 n5x0Var) throws GeneralSecurityException {
        q7x0 q7x0Var = new q7x0(n5x0Var.m161735c(), n5x0Var.m161736d(), null);
        boolean zContainsKey = this.f135133a.containsKey(q7x0Var);
        Map map = this.f135133a;
        if (!zContainsKey) {
            map.put(q7x0Var, n5x0Var);
            return this;
        }
        n5x0 n5x0Var2 = (n5x0) map.get(q7x0Var);
        if (n5x0Var2.equals(n5x0Var) && n5x0Var.equals(n5x0Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(q7x0Var.toString()));
    }

    /* JADX INFO: renamed from: c */
    public final m7x0 m157341c(n6x0 n6x0Var) throws GeneralSecurityException {
        o7x0 o7x0Var = new o7x0(n6x0Var.m161812d(), n6x0Var.m161811c(), null);
        boolean zContainsKey = this.f135136d.containsKey(o7x0Var);
        Map map = this.f135136d;
        if (!zContainsKey) {
            map.put(o7x0Var, n6x0Var);
            return this;
        }
        n6x0 n6x0Var2 = (n6x0) map.get(o7x0Var);
        if (n6x0Var2.equals(n6x0Var) && n6x0Var.equals(n6x0Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(o7x0Var.toString()));
    }

    /* JADX INFO: renamed from: d */
    public final m7x0 m157342d(r6x0 r6x0Var) throws GeneralSecurityException {
        q7x0 q7x0Var = new q7x0(r6x0Var.m180057c(), r6x0Var.m180058d(), null);
        boolean zContainsKey = this.f135135c.containsKey(q7x0Var);
        Map map = this.f135135c;
        if (!zContainsKey) {
            map.put(q7x0Var, r6x0Var);
            return this;
        }
        r6x0 r6x0Var2 = (r6x0) map.get(q7x0Var);
        if (r6x0Var2.equals(r6x0Var) && r6x0Var.equals(r6x0Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(q7x0Var.toString()));
    }

    public m7x0() {
        this.f135133a = new HashMap();
        this.f135134b = new HashMap();
        this.f135135c = new HashMap();
        this.f135136d = new HashMap();
    }
}
