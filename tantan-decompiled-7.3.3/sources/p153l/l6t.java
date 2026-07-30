package p153l;

import androidx.annotation.CallSuper;
import java.util.HashMap;
import java.util.Map;
import p153l.iam;

/* JADX INFO: loaded from: classes13.dex */
public class l6t<V extends iam> extends cyr<V> implements uwl {

    /* JADX INFO: renamed from: a */
    public int f130284a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, uwl> f130285b;

    /* JADX INFO: renamed from: c */
    public l6t f130286c;

    /* JADX INFO: renamed from: d */
    public String f130287d;

    public l6t(ner nerVar) {
        super(nerVar);
        this.f130287d = null;
        this.f130284a = 0;
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m153094q2(HashMap map, Map.Entry entry) {
        if (entry.getValue() instanceof c6m) {
            map.put((String) entry.getKey(), (uwl) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m153095A2(String str) {
        this.f130287d = str;
    }

    /* JADX INFO: renamed from: B2 */
    public final void m153096B2(l6t l6tVar) {
        this.f130286c = l6tVar;
    }

    @Override // p153l.cyr, p153l.k3m
    /* JADX INFO: renamed from: C */
    public void mo52715C(V v2) {
        super.mo52715C(v2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C2 */
    public void m153097C2(l6t l6tVar) {
        HashMap<String, uwl> map;
        m153098r2();
        if (l6tVar == 0 || (map = this.f130285b) == null || map.get(l6tVar.m153100v2()) == null) {
            return;
        }
        l6tVar.mo70300n();
        if (l6tVar instanceof c6m) {
            ((c6m) l6tVar).mo108170m1();
        }
        this.f130285b.remove(l6tVar.m153100v2());
    }

    @CallSuper
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        this.f130284a = 1;
        xre0.m212825h(this.f130285b);
    }

    @Override // p153l.cyr, p153l.k3m
    public final void destroy() {
        super.destroy();
    }

    @CallSuper
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.destroy();
        if (this.viewModel != null) {
            this.viewModel.destroy();
        }
        this.f130284a = -1;
        xre0.m212823f(this.f130285b);
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        map.size();
        final HashMap map2 = new HashMap();
        jyb.m147537z(this.f130285b.entrySet(), new y20() { // from class: l.k6t
            @Override // p153l.y20
            public final void call(Object obj) {
                l6t.m153094q2(map2, (Map.Entry) obj);
            }
        });
        m153098r2();
        this.f130285b.clear();
        this.f130285b.putAll(map2);
        this.f130285b.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s2 */
    public void mo120629s2() {
        m153098r2();
        xre0.m212824g(this.f130285b);
        if (this instanceof c6m) {
            ((c6m) this).mo108170m1();
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        this.f130284a = 2;
        xre0.m212826i(this.f130285b);
    }

    /* JADX INFO: renamed from: u2 */
    public final String m153099u2(l6t l6tVar) {
        String strM153100v2 = l6tVar.m153100v2();
        if (strM153100v2 != null) {
            return strM153100v2;
        }
        String strValueOf = String.valueOf((l6tVar.hashCode() * 1000) + ((int) (System.currentTimeMillis() % 1000)));
        l6tVar.m153095A2(strValueOf);
        return strValueOf;
    }

    /* JADX INFO: renamed from: v2 */
    public String m153100v2() {
        return this.f130287d;
    }

    /* JADX INFO: renamed from: w2 */
    public l6t m153101w2() {
        return this.f130286c;
    }

    /* JADX INFO: renamed from: y2 */
    public int m153102y2() {
        return this.f130284a;
    }

    /* JADX INFO: renamed from: z2 */
    public <T extends l6t> T m153103z2(T t) {
        m153098r2();
        if (rf00.m181160a(this, t, this.f130285b)) {
            return t;
        }
        if (this.f130285b == null) {
            this.f130285b = new HashMap<>();
        }
        t.m153096B2(this);
        this.f130285b.put(m153099u2(t), t);
        if (this.f130284a >= 1) {
            t.mo71381T();
        }
        if (this.f130284a == 2) {
            t.mo73648t();
        }
        return t;
    }

    /* JADX INFO: renamed from: r2 */
    public final void m153098r2() {
    }
}
