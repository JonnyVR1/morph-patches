package com.google.android.exoplayer2;

import android.util.Pair;
import p153l.n8f0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1820a extends AbstractC1857c0 {

    /* JADX INFO: renamed from: f */
    public final int f7058f;

    /* JADX INFO: renamed from: g */
    public final n8f0 f7059g;

    /* JADX INFO: renamed from: h */
    public final boolean f7060h;

    public AbstractC1820a(boolean z, n8f0 n8f0Var) {
        this.f7060h = z;
        this.f7059g = n8f0Var;
        this.f7058f = n8f0Var.getLength();
    }

    /* JADX INFO: renamed from: A */
    public static Object m9440A(Object obj) {
        return ((Pair) obj).first;
    }

    /* JADX INFO: renamed from: C */
    public static Object m9441C(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* JADX INFO: renamed from: z */
    public static Object m9442z(Object obj) {
        return ((Pair) obj).second;
    }

    /* JADX INFO: renamed from: B */
    public abstract Object mo9443B(int i);

    /* JADX INFO: renamed from: D */
    public abstract int mo9444D(int i);

    /* JADX INFO: renamed from: E */
    public abstract int mo9445E(int i);

    /* JADX INFO: renamed from: F */
    public final int m9446F(int i, boolean z) {
        if (z) {
            return this.f7059g.mo161914b(i);
        }
        if (i < this.f7058f - 1) {
            return i + 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: G */
    public final int m9447G(int i, boolean z) {
        if (z) {
            return this.f7059g.mo161913a(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public abstract AbstractC1857c0 mo9448H(int i);

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: e */
    public int mo9449e(boolean z) {
        if (this.f7058f == 0) {
            return -1;
        }
        if (this.f7060h) {
            z = false;
        }
        int iMo161917e = z ? this.f7059g.mo161917e() : 0;
        while (mo9448H(iMo161917e).m9776u()) {
            iMo161917e = m9446F(iMo161917e, z);
            if (iMo161917e == -1) {
                return -1;
            }
        }
        return mo9445E(iMo161917e) + mo9448H(iMo161917e).mo9449e(z);
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: f */
    public final int mo9450f(Object obj) {
        int iMo9450f;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objM9440A = m9440A(obj);
        Object objM9442z = m9442z(obj);
        int iMo9458w = mo9458w(objM9440A);
        if (iMo9458w == -1 || (iMo9450f = mo9448H(iMo9458w).mo9450f(objM9442z)) == -1) {
            return -1;
        }
        return mo9444D(iMo9458w) + iMo9450f;
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: g */
    public int mo9451g(boolean z) {
        int i = this.f7058f;
        if (i == 0) {
            return -1;
        }
        if (this.f7060h) {
            z = false;
        }
        int iMo161915c = z ? this.f7059g.mo161915c() : i - 1;
        while (mo9448H(iMo161915c).m9776u()) {
            iMo161915c = m9447G(iMo161915c, z);
            if (iMo161915c == -1) {
                return -1;
            }
        }
        return mo9445E(iMo161915c) + mo9448H(iMo161915c).mo9451g(z);
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: i */
    public int mo9452i(int i, int i2, boolean z) {
        if (this.f7060h) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo9460y = mo9460y(i);
        int iMo9445E = mo9445E(iMo9460y);
        int iMo9452i = mo9448H(iMo9460y).mo9452i(i - iMo9445E, i2 != 2 ? i2 : 0, z);
        if (iMo9452i != -1) {
            return iMo9445E + iMo9452i;
        }
        int iM9446F = m9446F(iMo9460y, z);
        while (iM9446F != -1 && mo9448H(iM9446F).m9776u()) {
            iM9446F = m9446F(iM9446F, z);
        }
        if (iM9446F != -1) {
            return mo9445E(iM9446F) + mo9448H(iM9446F).mo9449e(z);
        }
        if (i2 == 2) {
            return mo9449e(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: k */
    public final AbstractC1857c0.b mo9453k(int i, AbstractC1857c0.b bVar, boolean z) {
        int iMo9459x = mo9459x(i);
        int iMo9445E = mo9445E(iMo9459x);
        mo9448H(iMo9459x).mo9453k(i - mo9444D(iMo9459x), bVar, z);
        bVar.f7339c += iMo9445E;
        if (z) {
            bVar.f7338b = m9441C(mo9443B(iMo9459x), w11.m204369e(bVar.f7338b));
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: l */
    public final AbstractC1857c0.b mo9454l(Object obj, AbstractC1857c0.b bVar) {
        Object objM9440A = m9440A(obj);
        Object objM9442z = m9442z(obj);
        int iMo9458w = mo9458w(objM9440A);
        int iMo9445E = mo9445E(iMo9458w);
        mo9448H(iMo9458w).mo9454l(objM9442z, bVar);
        bVar.f7339c += iMo9445E;
        bVar.f7338b = obj;
        return bVar;
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: p */
    public int mo9455p(int i, int i2, boolean z) {
        if (this.f7060h) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo9460y = mo9460y(i);
        int iMo9445E = mo9445E(iMo9460y);
        int iMo9455p = mo9448H(iMo9460y).mo9455p(i - iMo9445E, i2 != 2 ? i2 : 0, z);
        if (iMo9455p != -1) {
            return iMo9445E + iMo9455p;
        }
        int iM9447G = m9447G(iMo9460y, z);
        while (iM9447G != -1 && mo9448H(iM9447G).m9776u()) {
            iM9447G = m9447G(iM9447G, z);
        }
        if (iM9447G != -1) {
            return mo9445E(iM9447G) + mo9448H(iM9447G).mo9451g(z);
        }
        if (i2 == 2) {
            return mo9451g(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: q */
    public final Object mo9456q(int i) {
        int iMo9459x = mo9459x(i);
        return m9441C(mo9443B(iMo9459x), mo9448H(iMo9459x).mo9456q(i - mo9444D(iMo9459x)));
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: s */
    public final AbstractC1857c0.d mo9457s(int i, AbstractC1857c0.d dVar, long j) {
        int iMo9460y = mo9460y(i);
        int iMo9445E = mo9445E(iMo9460y);
        int iMo9444D = mo9444D(iMo9460y);
        mo9448H(iMo9460y).mo9457s(i - iMo9445E, dVar, j);
        Object objMo9443B = mo9443B(iMo9460y);
        if (!AbstractC1857c0.d.f7356r.equals(dVar.f7365a)) {
            objMo9443B = m9441C(objMo9443B, dVar.f7365a);
        }
        dVar.f7365a = objMo9443B;
        dVar.f7379o += iMo9444D;
        dVar.f7380p += iMo9444D;
        return dVar;
    }

    /* JADX INFO: renamed from: w */
    public abstract int mo9458w(Object obj);

    /* JADX INFO: renamed from: x */
    public abstract int mo9459x(int i);

    /* JADX INFO: renamed from: y */
    public abstract int mo9460y(int i);
}
