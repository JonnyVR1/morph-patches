package p149l;

import androidx.annotation.CallSuper;
import java.util.HashMap;
import java.util.Map;
import p149l.s7m;

/* JADX INFO: loaded from: classes13.dex */
public class k4t<V extends s7m> extends bwr<V> implements gul {

    /* JADX INFO: renamed from: a */
    public int f121121a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, gul> f121122b;

    /* JADX INFO: renamed from: c */
    public k4t f121123c;

    /* JADX INFO: renamed from: d */
    public String f121124d;

    public k4t(mcr mcrVar) {
        super(mcrVar);
        this.f121124d = null;
        this.f121121a = 0;
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m144503q2(HashMap map, Map.Entry entry) {
        if (entry.getValue() instanceof l3m) {
            map.put((String) entry.getKey(), (gul) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m144504A2(String str) {
        this.f121124d = str;
    }

    /* JADX INFO: renamed from: B2 */
    public final void m144505B2(k4t k4tVar) {
        this.f121123c = k4tVar;
    }

    @Override // p149l.bwr, p149l.q0m
    /* JADX INFO: renamed from: C */
    public void mo51532C(V v2) {
        super.mo51532C(v2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C2 */
    public void m144506C2(k4t k4tVar) {
        HashMap<String, gul> map;
        m144507r2();
        if (k4tVar == 0 || (map = this.f121122b) == null || map.get(k4tVar.m144509v2()) == null) {
            return;
        }
        k4tVar.mo69117n();
        if (k4tVar instanceof l3m) {
            ((l3m) k4tVar).mo105734m1();
        }
        this.f121122b.remove(k4tVar.m144509v2());
    }

    @CallSuper
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        this.f121121a = 1;
        sje0.m184490h(this.f121122b);
    }

    @Override // p149l.bwr, p149l.q0m
    public final void destroy() {
        super.destroy();
    }

    @CallSuper
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.destroy();
        if (this.viewModel != null) {
            this.viewModel.destroy();
        }
        this.f121121a = -1;
        sje0.m184488f(this.f121122b);
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        map.size();
        final HashMap map2 = new HashMap();
        vwb.m200354z(this.f121122b.entrySet(), new e30() { // from class: l.j4t
            @Override // p149l.e30
            public final void call(Object obj) {
                k4t.m144503q2(map2, (Map.Entry) obj);
            }
        });
        m144507r2();
        this.f121122b.clear();
        this.f121122b.putAll(map2);
        this.f121122b.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s2 */
    public void mo111727s2() {
        m144507r2();
        sje0.m184489g(this.f121122b);
        if (this instanceof l3m) {
            ((l3m) this).mo105734m1();
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        this.f121121a = 2;
        sje0.m184491i(this.f121122b);
    }

    /* JADX INFO: renamed from: u2 */
    public final String m144508u2(k4t k4tVar) {
        String strM144509v2 = k4tVar.m144509v2();
        if (strM144509v2 != null) {
            return strM144509v2;
        }
        String strValueOf = String.valueOf((k4tVar.hashCode() * 1000) + ((int) (System.currentTimeMillis() % 1000)));
        k4tVar.m144504A2(strValueOf);
        return strValueOf;
    }

    /* JADX INFO: renamed from: v2 */
    public String m144509v2() {
        return this.f121124d;
    }

    /* JADX INFO: renamed from: w2 */
    public k4t m144510w2() {
        return this.f121123c;
    }

    /* JADX INFO: renamed from: y2 */
    public int m144511y2() {
        return this.f121121a;
    }

    /* JADX INFO: renamed from: z2 */
    public <T extends k4t> T m144512z2(T t) {
        m144507r2();
        if (i700.m134719a(this, t, this.f121122b)) {
            return t;
        }
        if (this.f121122b == null) {
            this.f121122b = new HashMap<>();
        }
        t.m144505B2(this);
        this.f121122b.put(m144508u2(t), t);
        if (this.f121121a >= 1) {
            t.mo70198T();
        }
        if (this.f121121a == 2) {
            t.mo72465t();
        }
        return t;
    }

    /* JADX INFO: renamed from: r2 */
    public final void m144507r2() {
    }
}
