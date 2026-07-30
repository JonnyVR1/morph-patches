package p153l;

import android.util.Pair;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jvx0 extends d0u0 {

    /* JADX INFO: renamed from: f */
    public final int f122855f;

    /* JADX INFO: renamed from: g */
    public final i2z0 f122856g;

    public jvx0(boolean z, i2z0 i2z0Var) {
        this.f122856g = i2z0Var;
        this.f122855f = i2z0Var.m138258c();
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: a */
    public final int mo113457a(Object obj) {
        int iMo113457a;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iMo147107p = mo147107p(obj2);
            if (iMo147107p != -1 && (iMo113457a = mo147112u(iMo147107p).mo113457a(obj3)) != -1) {
                return mo147110s(iMo147107p) + iMo113457a;
            }
        }
        return -1;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: d */
    public final hwt0 mo107662d(int i, hwt0 hwt0Var, boolean z) {
        int iMo147108q = mo147108q(i);
        int iMo147111t = mo147111t(iMo147108q);
        mo147112u(iMo147108q).mo107662d(i - mo147110s(iMo147108q), hwt0Var, z);
        hwt0Var.f111930c += iMo147111t;
        if (z) {
            Object objMo147113v = mo147113v(iMo147108q);
            Object obj = hwt0Var.f111929b;
            obj.getClass();
            hwt0Var.f111929b = Pair.create(objMo147113v, obj);
        }
        return hwt0Var;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: e */
    public final wyt0 mo107663e(int i, wyt0 wyt0Var, long j) {
        int iMo147109r = mo147109r(i);
        int iMo147111t = mo147111t(iMo147109r);
        int iMo147110s = mo147110s(iMo147109r);
        mo147112u(iMo147109r).mo107663e(i - iMo147111t, wyt0Var, j);
        Object objMo147113v = mo147113v(iMo147109r);
        if (!wyt0.f191680p.equals(wyt0Var.f191691a)) {
            objMo147113v = Pair.create(objMo147113v, wyt0Var.f191691a);
        }
        wyt0Var.f191691a = objMo147113v;
        wyt0Var.f191704n += iMo147110s;
        wyt0Var.f191705o += iMo147110s;
        return wyt0Var;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: f */
    public final Object mo113460f(int i) {
        int iMo147108q = mo147108q(i);
        return Pair.create(mo147113v(iMo147108q), mo147112u(iMo147108q).mo113460f(i - mo147110s(iMo147108q)));
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: g */
    public final int mo113461g(boolean z) {
        if (this.f122855f != 0) {
            int iM138256a = z ? this.f122856g.m138256a() : 0;
            while (mo147112u(iM138256a).m113469o()) {
                iM138256a = m147114w(iM138256a, z);
                if (iM138256a == -1) {
                }
            }
            return mo147111t(iM138256a) + mo147112u(iM138256a).mo113461g(z);
        }
        return -1;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: h */
    public final int mo113462h(boolean z) {
        int i = this.f122855f;
        if (i != 0) {
            int iM138257b = z ? this.f122856g.m138257b() : i - 1;
            while (mo147112u(iM138257b).m113469o()) {
                iM138257b = m147115x(iM138257b, z);
                if (iM138257b == -1) {
                }
            }
            return mo147111t(iM138257b) + mo147112u(iM138257b).mo113462h(z);
        }
        return -1;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: j */
    public final int mo113464j(int i, int i2, boolean z) {
        int iMo147109r = mo147109r(i);
        int iMo147111t = mo147111t(iMo147109r);
        int iMo113464j = mo147112u(iMo147109r).mo113464j(i - iMo147111t, i2 == 2 ? 0 : i2, z);
        if (iMo113464j != -1) {
            return iMo147111t + iMo113464j;
        }
        int iM147114w = m147114w(iMo147109r, z);
        while (iM147114w != -1 && mo147112u(iM147114w).m113469o()) {
            iM147114w = m147114w(iM147114w, z);
        }
        if (iM147114w != -1) {
            return mo147111t(iM147114w) + mo147112u(iM147114w).mo113461g(z);
        }
        if (i2 == 2) {
            return mo113461g(z);
        }
        return -1;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: k */
    public final int mo113465k(int i, int i2, boolean z) {
        int iMo147109r = mo147109r(i);
        int iMo147111t = mo147111t(iMo147109r);
        int iMo113465k = mo147112u(iMo147109r).mo113465k(i - iMo147111t, 0, false);
        if (iMo113465k != -1) {
            return iMo147111t + iMo113465k;
        }
        int iM147115x = m147115x(iMo147109r, false);
        while (iM147115x != -1 && mo147112u(iM147115x).m113469o()) {
            iM147115x = m147115x(iM147115x, false);
        }
        if (iM147115x != -1) {
            return mo147111t(iM147115x) + mo147112u(iM147115x).mo113462h(false);
        }
        return -1;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: n */
    public final hwt0 mo113468n(Object obj, hwt0 hwt0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo147107p = mo147107p(obj2);
        int iMo147111t = mo147111t(iMo147107p);
        mo147112u(iMo147107p).mo113468n(obj3, hwt0Var);
        hwt0Var.f111930c += iMo147111t;
        hwt0Var.f111929b = obj;
        return hwt0Var;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo147107p(Object obj);

    /* JADX INFO: renamed from: q */
    public abstract int mo147108q(int i);

    /* JADX INFO: renamed from: r */
    public abstract int mo147109r(int i);

    /* JADX INFO: renamed from: s */
    public abstract int mo147110s(int i);

    /* JADX INFO: renamed from: t */
    public abstract int mo147111t(int i);

    /* JADX INFO: renamed from: u */
    public abstract d0u0 mo147112u(int i);

    /* JADX INFO: renamed from: v */
    public abstract Object mo147113v(int i);

    /* JADX INFO: renamed from: w */
    public final int m147114w(int i, boolean z) {
        if (z) {
            return this.f122856g.m138259d(i);
        }
        if (i >= this.f122855f - 1) {
            return -1;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: x */
    public final int m147115x(int i, boolean z) {
        if (z) {
            return this.f122856g.m138260e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }
}
