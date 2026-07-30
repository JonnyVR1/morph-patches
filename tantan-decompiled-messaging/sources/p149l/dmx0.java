package p149l;

import android.util.Pair;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dmx0 extends xqt0 {

    /* JADX INFO: renamed from: f */
    public final int f87005f;

    /* JADX INFO: renamed from: g */
    public final cty0 f87006g;

    public dmx0(boolean z, cty0 cty0Var) {
        this.f87006g = cty0Var;
        this.f87005f = cty0Var.m108712c();
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: a */
    public final int mo112550a(Object obj) {
        int iMo112550a;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iMo112559p = mo112559p(obj2);
            if (iMo112559p != -1 && (iMo112550a = mo112564u(iMo112559p).mo112550a(obj3)) != -1) {
                return mo112562s(iMo112559p) + iMo112550a;
            }
        }
        return -1;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: d */
    public final bnt0 mo112551d(int i, bnt0 bnt0Var, boolean z) {
        int iMo112560q = mo112560q(i);
        int iMo112563t = mo112563t(iMo112560q);
        mo112564u(iMo112560q).mo112551d(i - mo112562s(iMo112560q), bnt0Var, z);
        bnt0Var.f76445c += iMo112563t;
        if (z) {
            Object objMo112565v = mo112565v(iMo112560q);
            Object obj = bnt0Var.f76444b;
            obj.getClass();
            bnt0Var.f76444b = Pair.create(objMo112565v, obj);
        }
        return bnt0Var;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: e */
    public final qpt0 mo112552e(int i, qpt0 qpt0Var, long j) {
        int iMo112561r = mo112561r(i);
        int iMo112563t = mo112563t(iMo112561r);
        int iMo112562s = mo112562s(iMo112561r);
        mo112564u(iMo112561r).mo112552e(i - iMo112563t, qpt0Var, j);
        Object objMo112565v = mo112565v(iMo112561r);
        if (!qpt0.f155803p.equals(qpt0Var.f155814a)) {
            objMo112565v = Pair.create(objMo112565v, qpt0Var.f155814a);
        }
        qpt0Var.f155814a = objMo112565v;
        qpt0Var.f155827n += iMo112562s;
        qpt0Var.f155828o += iMo112562s;
        return qpt0Var;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: f */
    public final Object mo112553f(int i) {
        int iMo112560q = mo112560q(i);
        return Pair.create(mo112565v(iMo112560q), mo112564u(iMo112560q).mo112553f(i - mo112562s(iMo112560q)));
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: g */
    public final int mo112554g(boolean z) {
        if (this.f87005f != 0) {
            int iM108710a = z ? this.f87006g.m108710a() : 0;
            while (mo112564u(iM108710a).m210615o()) {
                iM108710a = m112566w(iM108710a, z);
                if (iM108710a == -1) {
                }
            }
            return mo112563t(iM108710a) + mo112564u(iM108710a).mo112554g(z);
        }
        return -1;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: h */
    public final int mo112555h(boolean z) {
        int i = this.f87005f;
        if (i != 0) {
            int iM108711b = z ? this.f87006g.m108711b() : i - 1;
            while (mo112564u(iM108711b).m210615o()) {
                iM108711b = m112567x(iM108711b, z);
                if (iM108711b == -1) {
                }
            }
            return mo112563t(iM108711b) + mo112564u(iM108711b).mo112555h(z);
        }
        return -1;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: j */
    public final int mo112556j(int i, int i2, boolean z) {
        int iMo112561r = mo112561r(i);
        int iMo112563t = mo112563t(iMo112561r);
        int iMo112556j = mo112564u(iMo112561r).mo112556j(i - iMo112563t, i2 == 2 ? 0 : i2, z);
        if (iMo112556j != -1) {
            return iMo112563t + iMo112556j;
        }
        int iM112566w = m112566w(iMo112561r, z);
        while (iM112566w != -1 && mo112564u(iM112566w).m210615o()) {
            iM112566w = m112566w(iM112566w, z);
        }
        if (iM112566w != -1) {
            return mo112563t(iM112566w) + mo112564u(iM112566w).mo112554g(z);
        }
        if (i2 == 2) {
            return mo112554g(z);
        }
        return -1;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: k */
    public final int mo112557k(int i, int i2, boolean z) {
        int iMo112561r = mo112561r(i);
        int iMo112563t = mo112563t(iMo112561r);
        int iMo112557k = mo112564u(iMo112561r).mo112557k(i - iMo112563t, 0, false);
        if (iMo112557k != -1) {
            return iMo112563t + iMo112557k;
        }
        int iM112567x = m112567x(iMo112561r, false);
        while (iM112567x != -1 && mo112564u(iM112567x).m210615o()) {
            iM112567x = m112567x(iM112567x, false);
        }
        if (iM112567x != -1) {
            return mo112563t(iM112567x) + mo112564u(iM112567x).mo112555h(false);
        }
        return -1;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: n */
    public final bnt0 mo112558n(Object obj, bnt0 bnt0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo112559p = mo112559p(obj2);
        int iMo112563t = mo112563t(iMo112559p);
        mo112564u(iMo112559p).mo112558n(obj3, bnt0Var);
        bnt0Var.f76445c += iMo112563t;
        bnt0Var.f76444b = obj;
        return bnt0Var;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo112559p(Object obj);

    /* JADX INFO: renamed from: q */
    public abstract int mo112560q(int i);

    /* JADX INFO: renamed from: r */
    public abstract int mo112561r(int i);

    /* JADX INFO: renamed from: s */
    public abstract int mo112562s(int i);

    /* JADX INFO: renamed from: t */
    public abstract int mo112563t(int i);

    /* JADX INFO: renamed from: u */
    public abstract xqt0 mo112564u(int i);

    /* JADX INFO: renamed from: v */
    public abstract Object mo112565v(int i);

    /* JADX INFO: renamed from: w */
    public final int m112566w(int i, boolean z) {
        if (z) {
            return this.f87006g.m108713d(i);
        }
        if (i >= this.f87005f - 1) {
            return -1;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: x */
    public final int m112567x(int i, boolean z) {
        if (z) {
            return this.f87006g.m108714e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }
}
