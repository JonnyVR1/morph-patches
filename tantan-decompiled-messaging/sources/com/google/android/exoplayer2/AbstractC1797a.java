package com.google.android.exoplayer2;

import android.util.Pair;
import p149l.g0f0;
import p149l.p11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1797a extends AbstractC1834c0 {

    /* JADX INFO: renamed from: f */
    public final int f7021f;

    /* JADX INFO: renamed from: g */
    public final g0f0 f7022g;

    /* JADX INFO: renamed from: h */
    public final boolean f7023h;

    public AbstractC1797a(boolean z, g0f0 g0f0Var) {
        this.f7023h = z;
        this.f7022g = g0f0Var;
        this.f7021f = g0f0Var.getLength();
    }

    /* JADX INFO: renamed from: A */
    public static Object m9386A(Object obj) {
        return ((Pair) obj).first;
    }

    /* JADX INFO: renamed from: C */
    public static Object m9387C(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* JADX INFO: renamed from: z */
    public static Object m9388z(Object obj) {
        return ((Pair) obj).second;
    }

    /* JADX INFO: renamed from: B */
    public abstract Object mo9389B(int i);

    /* JADX INFO: renamed from: D */
    public abstract int mo9390D(int i);

    /* JADX INFO: renamed from: E */
    public abstract int mo9391E(int i);

    /* JADX INFO: renamed from: F */
    public final int m9392F(int i, boolean z) {
        if (z) {
            return this.f7022g.mo123963b(i);
        }
        if (i < this.f7021f - 1) {
            return i + 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: G */
    public final int m9393G(int i, boolean z) {
        if (z) {
            return this.f7022g.mo123962a(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public abstract AbstractC1834c0 mo9394H(int i);

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: e */
    public int mo9395e(boolean z) {
        if (this.f7021f == 0) {
            return -1;
        }
        if (this.f7023h) {
            z = false;
        }
        int iMo123966e = z ? this.f7022g.mo123966e() : 0;
        while (mo9394H(iMo123966e).m9722u()) {
            iMo123966e = m9392F(iMo123966e, z);
            if (iMo123966e == -1) {
                return -1;
            }
        }
        return mo9391E(iMo123966e) + mo9394H(iMo123966e).mo9395e(z);
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: f */
    public final int mo9396f(Object obj) {
        int iMo9396f;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objM9386A = m9386A(obj);
        Object objM9388z = m9388z(obj);
        int iMo9404w = mo9404w(objM9386A);
        if (iMo9404w == -1 || (iMo9396f = mo9394H(iMo9404w).mo9396f(objM9388z)) == -1) {
            return -1;
        }
        return mo9390D(iMo9404w) + iMo9396f;
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: g */
    public int mo9397g(boolean z) {
        int i = this.f7021f;
        if (i == 0) {
            return -1;
        }
        if (this.f7023h) {
            z = false;
        }
        int iMo123964c = z ? this.f7022g.mo123964c() : i - 1;
        while (mo9394H(iMo123964c).m9722u()) {
            iMo123964c = m9393G(iMo123964c, z);
            if (iMo123964c == -1) {
                return -1;
            }
        }
        return mo9391E(iMo123964c) + mo9394H(iMo123964c).mo9397g(z);
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: i */
    public int mo9398i(int i, int i2, boolean z) {
        if (this.f7023h) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo9406y = mo9406y(i);
        int iMo9391E = mo9391E(iMo9406y);
        int iMo9398i = mo9394H(iMo9406y).mo9398i(i - iMo9391E, i2 != 2 ? i2 : 0, z);
        if (iMo9398i != -1) {
            return iMo9391E + iMo9398i;
        }
        int iM9392F = m9392F(iMo9406y, z);
        while (iM9392F != -1 && mo9394H(iM9392F).m9722u()) {
            iM9392F = m9392F(iM9392F, z);
        }
        if (iM9392F != -1) {
            return mo9391E(iM9392F) + mo9394H(iM9392F).mo9395e(z);
        }
        if (i2 == 2) {
            return mo9395e(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: k */
    public final AbstractC1834c0.b mo9399k(int i, AbstractC1834c0.b bVar, boolean z) {
        int iMo9405x = mo9405x(i);
        int iMo9391E = mo9391E(iMo9405x);
        mo9394H(iMo9405x).mo9399k(i - mo9390D(iMo9405x), bVar, z);
        bVar.f7302c += iMo9391E;
        if (z) {
            bVar.f7301b = m9387C(mo9389B(iMo9405x), p11.m167011e(bVar.f7301b));
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: l */
    public final AbstractC1834c0.b mo9400l(Object obj, AbstractC1834c0.b bVar) {
        Object objM9386A = m9386A(obj);
        Object objM9388z = m9388z(obj);
        int iMo9404w = mo9404w(objM9386A);
        int iMo9391E = mo9391E(iMo9404w);
        mo9394H(iMo9404w).mo9400l(objM9388z, bVar);
        bVar.f7302c += iMo9391E;
        bVar.f7301b = obj;
        return bVar;
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: p */
    public int mo9401p(int i, int i2, boolean z) {
        if (this.f7023h) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo9406y = mo9406y(i);
        int iMo9391E = mo9391E(iMo9406y);
        int iMo9401p = mo9394H(iMo9406y).mo9401p(i - iMo9391E, i2 != 2 ? i2 : 0, z);
        if (iMo9401p != -1) {
            return iMo9391E + iMo9401p;
        }
        int iM9393G = m9393G(iMo9406y, z);
        while (iM9393G != -1 && mo9394H(iM9393G).m9722u()) {
            iM9393G = m9393G(iM9393G, z);
        }
        if (iM9393G != -1) {
            return mo9391E(iM9393G) + mo9394H(iM9393G).mo9397g(z);
        }
        if (i2 == 2) {
            return mo9397g(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: q */
    public final Object mo9402q(int i) {
        int iMo9405x = mo9405x(i);
        return m9387C(mo9389B(iMo9405x), mo9394H(iMo9405x).mo9402q(i - mo9390D(iMo9405x)));
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: s */
    public final AbstractC1834c0.d mo9403s(int i, AbstractC1834c0.d dVar, long j) {
        int iMo9406y = mo9406y(i);
        int iMo9391E = mo9391E(iMo9406y);
        int iMo9390D = mo9390D(iMo9406y);
        mo9394H(iMo9406y).mo9403s(i - iMo9391E, dVar, j);
        Object objMo9389B = mo9389B(iMo9406y);
        if (!AbstractC1834c0.d.f7319r.equals(dVar.f7328a)) {
            objMo9389B = m9387C(objMo9389B, dVar.f7328a);
        }
        dVar.f7328a = objMo9389B;
        dVar.f7342o += iMo9390D;
        dVar.f7343p += iMo9390D;
        return dVar;
    }

    /* JADX INFO: renamed from: w */
    public abstract int mo9404w(Object obj);

    /* JADX INFO: renamed from: x */
    public abstract int mo9405x(int i);

    /* JADX INFO: renamed from: y */
    public abstract int mo9406y(int i);
}
