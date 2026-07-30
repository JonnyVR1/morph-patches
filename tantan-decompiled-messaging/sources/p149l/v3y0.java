package p149l;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class v3y0 {

    /* JADX INFO: renamed from: a */
    public final pfy0 f179859a;

    /* JADX INFO: renamed from: e */
    public final s3y0 f179863e;

    /* JADX INFO: renamed from: h */
    public final q6y0 f179866h;

    /* JADX INFO: renamed from: i */
    public final ojv0 f179867i;

    /* JADX INFO: renamed from: j */
    public boolean f179868j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public vjx0 f179869k;

    /* JADX INFO: renamed from: l */
    public cty0 f179870l = new cty0(0);

    /* JADX INFO: renamed from: c */
    public final IdentityHashMap f179861c = new IdentityHashMap();

    /* JADX INFO: renamed from: d */
    public final Map f179862d = new HashMap();

    /* JADX INFO: renamed from: b */
    public final List f179860b = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final HashMap f179864f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Set f179865g = new HashSet();

    public v3y0(s3y0 s3y0Var, q6y0 q6y0Var, ojv0 ojv0Var, pfy0 pfy0Var) {
        this.f179859a = pfy0Var;
        this.f179863e = s3y0Var;
        this.f179866h = q6y0Var;
        this.f179867i = ojv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m196877a() {
        return this.f179860b.size();
    }

    /* JADX INFO: renamed from: b */
    public final xqt0 m196878b() {
        if (this.f179860b.isEmpty()) {
            return xqt0.f194042a;
        }
        int i = 0;
        int iMo113618c = 0;
        while (true) {
            int size = this.f179860b.size();
            List list = this.f179860b;
            if (i >= size) {
                return new j5y0(list, this.f179870l);
            }
            o3y0 o3y0Var = (o3y0) list.get(i);
            o3y0Var.f141721d = iMo113618c;
            iMo113618c += o3y0Var.f141718a.m219810J().mo113618c();
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final xqt0 m196879c(int i, int i2, List list) {
        f5v0.m119533d(i >= 0 && i <= i2 && i2 <= m196877a());
        f5v0.m119533d(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((o3y0) this.f179860b.get(i3)).f141718a.mo98645m((nis0) list.get(i3 - i));
        }
        return m196878b();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m196880f(gqy0 gqy0Var, xqt0 xqt0Var) {
        this.f179863e.zzh();
    }

    /* JADX INFO: renamed from: g */
    public final void m196881g(@Nullable vjx0 vjx0Var) {
        f5v0.m119535f(!this.f179868j);
        this.f179869k = vjx0Var;
        for (int i = 0; i < this.f179860b.size(); i++) {
            o3y0 o3y0Var = (o3y0) this.f179860b.get(i);
            m196896v(o3y0Var);
            this.f179865g.add(o3y0Var);
        }
        this.f179868j = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m196882h() {
        for (l3y0 l3y0Var : this.f179864f.values()) {
            try {
                l3y0Var.f125953a.mo127641h(l3y0Var.f125954b);
            } catch (RuntimeException e) {
                svv0.m186109d("MediaSourceList", "Failed to release child source.", e);
            }
            l3y0Var.f125953a.mo127638e(l3y0Var.f125955c);
            l3y0Var.f125953a.mo127636a(l3y0Var.f125955c);
        }
        this.f179864f.clear();
        this.f179865g.clear();
        this.f179868j = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m196883i(cqy0 cqy0Var) {
        o3y0 o3y0Var = (o3y0) this.f179861c.remove(cqy0Var);
        o3y0Var.getClass();
        o3y0Var.f141718a.mo98644k(cqy0Var);
        o3y0Var.f141720c.remove(((wpy0) cqy0Var).f187589a);
        if (!this.f179861c.isEmpty()) {
            m196894t();
        }
        m196895u(o3y0Var);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m196884j() {
        return this.f179868j;
    }

    /* JADX INFO: renamed from: k */
    public final xqt0 m196885k(int i, List list, cty0 cty0Var) {
        if (!list.isEmpty()) {
            this.f179870l = cty0Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                o3y0 o3y0Var = (o3y0) list.get(i2 - i);
                if (i2 > 0) {
                    o3y0 o3y0Var2 = (o3y0) this.f179860b.get(i2 - 1);
                    o3y0Var.m162499a(o3y0Var2.f141721d + o3y0Var2.f141718a.m219810J().mo113618c());
                } else {
                    o3y0Var.m162499a(0);
                }
                m196892r(i2, o3y0Var.f141718a.m219810J().mo113618c());
                this.f179860b.add(i2, o3y0Var);
                this.f179862d.put(o3y0Var.f141719b, o3y0Var);
                if (this.f179868j) {
                    m196896v(o3y0Var);
                    if (this.f179861c.isEmpty()) {
                        this.f179865g.add(o3y0Var);
                    } else {
                        m196893s(o3y0Var);
                    }
                }
            }
        }
        return m196878b();
    }

    /* JADX INFO: renamed from: l */
    public final xqt0 m196886l(int i, int i2, int i3, cty0 cty0Var) {
        f5v0.m119533d(m196877a() >= 0);
        this.f179870l = null;
        return m196878b();
    }

    /* JADX INFO: renamed from: m */
    public final xqt0 m196887m(int i, int i2, cty0 cty0Var) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= m196877a()) {
            z = true;
        }
        f5v0.m119533d(z);
        this.f179870l = cty0Var;
        m196897w(i, i2);
        return m196878b();
    }

    /* JADX INFO: renamed from: n */
    public final xqt0 m196888n(List list, cty0 cty0Var) {
        m196897w(0, this.f179860b.size());
        return m196885k(this.f179860b.size(), list, cty0Var);
    }

    /* JADX INFO: renamed from: o */
    public final xqt0 m196889o(cty0 cty0Var) {
        int iM196877a = m196877a();
        if (cty0Var.m108712c() != iM196877a) {
            cty0Var = cty0Var.m108715f().m108716g(0, iM196877a);
        }
        this.f179870l = cty0Var;
        return m196878b();
    }

    /* JADX INFO: renamed from: p */
    public final cqy0 m196890p(eqy0 eqy0Var, wwy0 wwy0Var, long j) {
        int i = j5y0.f116362o;
        Object obj = eqy0Var.f92867a;
        Object obj2 = ((Pair) obj).first;
        eqy0 eqy0VarM117806a = eqy0Var.m117806a(((Pair) obj).second);
        o3y0 o3y0Var = (o3y0) this.f179862d.get(obj2);
        o3y0Var.getClass();
        this.f179865g.add(o3y0Var);
        l3y0 l3y0Var = (l3y0) this.f179864f.get(o3y0Var);
        if (l3y0Var != null) {
            l3y0Var.f125953a.mo127644n(l3y0Var.f125954b);
        }
        o3y0Var.f141720c.add(eqy0VarM117806a);
        wpy0 wpy0VarM219811K = o3y0Var.f141718a.mo98643i(eqy0VarM117806a, wwy0Var, j);
        this.f179861c.put(wpy0VarM219811K, o3y0Var);
        m196894t();
        return wpy0VarM219811K;
    }

    /* JADX INFO: renamed from: q */
    public final cty0 m196891q() {
        return this.f179870l;
    }

    /* JADX INFO: renamed from: r */
    public final void m196892r(int i, int i2) {
        while (i < this.f179860b.size()) {
            ((o3y0) this.f179860b.get(i)).f141721d += i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m196893s(o3y0 o3y0Var) {
        l3y0 l3y0Var = (l3y0) this.f179864f.get(o3y0Var);
        if (l3y0Var != null) {
            l3y0Var.f125953a.mo127643l(l3y0Var.f125954b);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m196894t() {
        Iterator it = this.f179865g.iterator();
        while (it.hasNext()) {
            o3y0 o3y0Var = (o3y0) it.next();
            if (o3y0Var.f141720c.isEmpty()) {
                m196893s(o3y0Var);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m196895u(o3y0 o3y0Var) {
        if (o3y0Var.f141722e && o3y0Var.f141720c.isEmpty()) {
            l3y0 l3y0Var = (l3y0) this.f179864f.remove(o3y0Var);
            l3y0Var.getClass();
            l3y0Var.f125953a.mo127641h(l3y0Var.f125954b);
            l3y0Var.f125953a.mo127638e(l3y0Var.f125955c);
            l3y0Var.f125953a.mo127636a(l3y0Var.f125955c);
            this.f179865g.remove(o3y0Var);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m196896v(o3y0 o3y0Var) {
        zpy0 zpy0Var = o3y0Var.f141718a;
        fqy0 fqy0Var = new fqy0() { // from class: l.e2y0
            @Override // p149l.fqy0
            /* JADX INFO: renamed from: a */
            public final void mo114572a(gqy0 gqy0Var, xqt0 xqt0Var) {
                this.f88982a.m196880f(gqy0Var, xqt0Var);
            }
        };
        h3y0 h3y0Var = new h3y0(this, o3y0Var);
        this.f179864f.put(o3y0Var, new l3y0(zpy0Var, fqy0Var, h3y0Var));
        zpy0Var.mo127639f(new Handler(ggw0.m126056M(), null), h3y0Var);
        zpy0Var.mo127642j(new Handler(ggw0.m126056M(), null), h3y0Var);
        zpy0Var.mo127640g(fqy0Var, this.f179869k, this.f179859a);
    }

    /* JADX INFO: renamed from: w */
    public final void m196897w(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            o3y0 o3y0Var = (o3y0) this.f179860b.remove(i2);
            this.f179862d.remove(o3y0Var.f141719b);
            m196892r(i2, -o3y0Var.f141718a.m219810J().mo113618c());
            o3y0Var.f141722e = true;
            if (this.f179868j) {
                m196895u(o3y0Var);
            }
        }
    }
}
