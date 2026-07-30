package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.InterfaceC1953h;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.common.collect.ImmutableList;
import p149l.cvk;
import p149l.hk0;
import p149l.hpx;
import p149l.jpx;
import p149l.p11;
import p149l.sj0;
import p149l.y6j0;
import p149l.z580;
import p149l.z6j0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.p */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1927p {

    /* JADX INFO: renamed from: a */
    public final AbstractC1834c0.b f8209a = new AbstractC1834c0.b();

    /* JADX INFO: renamed from: b */
    public final AbstractC1834c0.d f8210b = new AbstractC1834c0.d();

    /* JADX INFO: renamed from: c */
    public final hk0 f8211c;

    /* JADX INFO: renamed from: d */
    public final cvk f8212d;

    /* JADX INFO: renamed from: e */
    public long f8213e;

    /* JADX INFO: renamed from: f */
    public int f8214f;

    /* JADX INFO: renamed from: g */
    public boolean f8215g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public hpx f8216h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public hpx f8217i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public hpx f8218j;

    /* JADX INFO: renamed from: k */
    public int f8219k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Object f8220l;

    /* JADX INFO: renamed from: m */
    public long f8221m;

    public C1927p(hk0 hk0Var, cvk cvkVar) {
        this.f8211c = hk0Var;
        this.f8212d = cvkVar;
    }

    /* JADX INFO: renamed from: D */
    public static InterfaceC1965i.b m10807D(AbstractC1834c0 abstractC1834c0, Object obj, long j, long j2, AbstractC1834c0.d dVar, AbstractC1834c0.b bVar) {
        abstractC1834c0.mo9400l(obj, bVar);
        abstractC1834c0.m9720r(bVar.f7302c, dVar);
        for (int iMo9396f = abstractC1834c0.mo9396f(obj); m10809z(bVar) && iMo9396f <= dVar.f7343p; iMo9396f++) {
            abstractC1834c0.mo9399k(iMo9396f, bVar, true);
            obj = p11.m167011e(bVar.f7301b);
        }
        abstractC1834c0.mo9400l(obj, bVar);
        int iM9731h = bVar.m9731h(j);
        return iM9731h == -1 ? new InterfaceC1965i.b(obj, j2, bVar.m9730g(j)) : new InterfaceC1965i.b(obj, iM9731h, bVar.m9737n(iM9731h), j2);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m10809z(AbstractC1834c0.b bVar) {
        int iM9729f = bVar.m9729f();
        if (iM9729f != 0 && ((iM9729f != 1 || !bVar.m9743t(0)) && bVar.m9744u(bVar.m9741r()))) {
            long jM9735l = 0;
            if (bVar.m9731h(0L) == -1) {
                if (bVar.f7303d == 0) {
                    return true;
                }
                int i = iM9729f - (bVar.m9743t(iM9729f + (-1)) ? 2 : 1);
                for (int i2 = 0; i2 <= i; i2++) {
                    jM9735l += bVar.m9735l(i2);
                }
                if (bVar.f7303d <= jM9735l) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m10810A() {
        final ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
        for (hpx hpxVarM132402j = this.f8216h; hpxVarM132402j != null; hpxVarM132402j = hpxVarM132402j.m132402j()) {
            c2781aBuilder.mo15683a(hpxVarM132402j.f108977f.f119232a);
        }
        hpx hpxVar = this.f8217i;
        final InterfaceC1965i.b bVar = hpxVar == null ? null : hpxVar.f108977f.f119232a;
        this.f8212d.mo108865a(new Runnable() { // from class: l.kpx
            @Override // java.lang.Runnable
            public final void run() {
                this.f124200a.f8211c.mo131440m0(c2781aBuilder.m15702m(), bVar);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m10811B(long j) {
        hpx hpxVar = this.f8218j;
        if (hpxVar != null) {
            hpxVar.m132411s(j);
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m10812C(hpx hpxVar) {
        boolean z = false;
        p11.m167013g(hpxVar != null);
        if (hpxVar.equals(this.f8218j)) {
            return false;
        }
        this.f8218j = hpxVar;
        while (hpxVar.m132402j() != null) {
            hpxVar = hpxVar.m132402j();
            if (hpxVar == this.f8217i) {
                this.f8217i = this.f8216h;
                z = true;
            }
            hpxVar.m132412t();
            this.f8219k--;
        }
        this.f8218j.m132414w(null);
        m10810A();
        return z;
    }

    /* JADX INFO: renamed from: E */
    public InterfaceC1965i.b m10813E(AbstractC1834c0 abstractC1834c0, Object obj, long j) {
        long jM10814F = m10814F(abstractC1834c0, obj);
        abstractC1834c0.mo9400l(obj, this.f8209a);
        abstractC1834c0.m9720r(this.f8209a.f7302c, this.f8210b);
        boolean z = false;
        for (int iMo9396f = abstractC1834c0.mo9396f(obj); iMo9396f >= this.f8210b.f7342o; iMo9396f--) {
            abstractC1834c0.mo9399k(iMo9396f, this.f8209a, true);
            boolean z2 = this.f8209a.m9729f() > 0;
            z |= z2;
            AbstractC1834c0.b bVar = this.f8209a;
            if (bVar.m9731h(bVar.f7303d) != -1) {
                obj = p11.m167011e(this.f8209a.f7301b);
            }
            if (z && (!z2 || this.f8209a.f7303d != 0)) {
                break;
            }
        }
        return m10807D(abstractC1834c0, obj, j, jM10814F, this.f8210b, this.f8209a);
    }

    /* JADX INFO: renamed from: F */
    public final long m10814F(AbstractC1834c0 abstractC1834c0, Object obj) {
        int iMo9396f;
        int i = abstractC1834c0.mo9400l(obj, this.f8209a).f7302c;
        Object obj2 = this.f8220l;
        if (obj2 != null && (iMo9396f = abstractC1834c0.mo9396f(obj2)) != -1 && abstractC1834c0.m9716j(iMo9396f, this.f8209a).f7302c == i) {
            return this.f8221m;
        }
        for (hpx hpxVarM132402j = this.f8216h; hpxVarM132402j != null; hpxVarM132402j = hpxVarM132402j.m132402j()) {
            if (hpxVarM132402j.f108973b.equals(obj)) {
                return hpxVarM132402j.f108977f.f119232a.f114358d;
            }
        }
        for (hpx hpxVarM132402j2 = this.f8216h; hpxVarM132402j2 != null; hpxVarM132402j2 = hpxVarM132402j2.m132402j()) {
            int iMo9396f2 = abstractC1834c0.mo9396f(hpxVarM132402j2.f108973b);
            if (iMo9396f2 != -1 && abstractC1834c0.m9716j(iMo9396f2, this.f8209a).f7302c == i) {
                return hpxVarM132402j2.f108977f.f119232a.f114358d;
            }
        }
        long j = this.f8213e;
        this.f8213e = 1 + j;
        if (this.f8216h == null) {
            this.f8220l = obj;
            this.f8221m = j;
        }
        return j;
    }

    /* JADX INFO: renamed from: G */
    public boolean m10815G() {
        hpx hpxVar = this.f8218j;
        if (hpxVar != null) {
            return !hpxVar.f108977f.f119240i && hpxVar.m132409q() && this.f8218j.f108977f.f119236e != -9223372036854775807L && this.f8219k < 100;
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m10816H(AbstractC1834c0 abstractC1834c0) {
        AbstractC1834c0 abstractC1834c1;
        hpx hpxVarM132402j = this.f8216h;
        if (hpxVarM132402j == null) {
            return true;
        }
        int iMo9396f = abstractC1834c0.mo9396f(hpxVarM132402j.f108973b);
        while (true) {
            abstractC1834c1 = abstractC1834c0;
            iMo9396f = abstractC1834c1.m9715h(iMo9396f, this.f8209a, this.f8210b, this.f8214f, this.f8215g);
            while (hpxVarM132402j.m132402j() != null && !hpxVarM132402j.f108977f.f119238g) {
                hpxVarM132402j = hpxVarM132402j.m132402j();
            }
            hpx hpxVarM132402j2 = hpxVarM132402j.m132402j();
            if (iMo9396f == -1 || hpxVarM132402j2 == null || abstractC1834c1.mo9396f(hpxVarM132402j2.f108973b) != iMo9396f) {
                break;
            }
            hpxVarM132402j = hpxVarM132402j2;
            abstractC1834c0 = abstractC1834c1;
        }
        boolean zM10812C = m10812C(hpxVarM132402j);
        hpxVarM132402j.f108977f = m10838t(abstractC1834c1, hpxVarM132402j.f108977f);
        return !zM10812C;
    }

    /* JADX INFO: renamed from: I */
    public boolean m10817I(AbstractC1834c0 abstractC1834c0, long j, long j2) {
        boolean zM10812C;
        jpx jpxVarM10838t;
        hpx hpxVarM132402j = this.f8216h;
        hpx hpxVar = null;
        while (hpxVarM132402j != null) {
            jpx jpxVar = hpxVarM132402j.f108977f;
            if (hpxVar != null) {
                jpx jpxVarM10828j = m10828j(abstractC1834c0, hpxVar, j);
                if (jpxVarM10828j == null) {
                    zM10812C = m10812C(hpxVar);
                } else if (m10823e(jpxVar, jpxVarM10828j)) {
                    jpxVarM10838t = jpxVarM10828j;
                } else {
                    zM10812C = m10812C(hpxVar);
                }
                return !zM10812C;
            }
            jpxVarM10838t = m10838t(abstractC1834c0, jpxVar);
            hpxVarM132402j.f108977f = jpxVarM10838t.m142766a(jpxVar.f119234c);
            if (!m10822d(jpxVar.f119236e, jpxVarM10838t.f119236e)) {
                hpxVarM132402j.m132393A();
                long j3 = jpxVarM10838t.f119236e;
                return (m10812C(hpxVarM132402j) || (hpxVarM132402j == this.f8217i && !hpxVarM132402j.f108977f.f119237f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : hpxVarM132402j.m132417z(j3)) ? 1 : (j2 == ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : hpxVarM132402j.m132417z(j3)) ? 0 : -1)) >= 0))) ? false : true;
            }
            hpxVar = hpxVarM132402j;
            hpxVarM132402j = hpxVarM132402j.m132402j();
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean m10818J(AbstractC1834c0 abstractC1834c0, int i) {
        this.f8214f = i;
        return m10816H(abstractC1834c0);
    }

    /* JADX INFO: renamed from: K */
    public boolean m10819K(AbstractC1834c0 abstractC1834c0, boolean z) {
        this.f8215g = z;
        return m10816H(abstractC1834c0);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public hpx m10820b() {
        hpx hpxVar = this.f8216h;
        if (hpxVar == null) {
            return null;
        }
        if (hpxVar == this.f8217i) {
            this.f8217i = hpxVar.m132402j();
        }
        this.f8216h.m132412t();
        int i = this.f8219k - 1;
        this.f8219k = i;
        if (i == 0) {
            this.f8218j = null;
            hpx hpxVar2 = this.f8216h;
            this.f8220l = hpxVar2.f108973b;
            this.f8221m = hpxVar2.f108977f.f119232a.f114358d;
        }
        this.f8216h = this.f8216h.m132402j();
        m10810A();
        return this.f8216h;
    }

    /* JADX INFO: renamed from: c */
    public hpx m10821c() {
        hpx hpxVar = this.f8217i;
        p11.m167013g((hpxVar == null || hpxVar.m132402j() == null) ? false : true);
        this.f8217i = this.f8217i.m132402j();
        m10810A();
        return this.f8217i;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10822d(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10823e(jpx jpxVar, jpx jpxVar2) {
        return jpxVar.f119233b == jpxVar2.f119233b && jpxVar.f119232a.equals(jpxVar2.f119232a);
    }

    /* JADX INFO: renamed from: f */
    public void m10824f() {
        if (this.f8219k == 0) {
            return;
        }
        hpx hpxVarM132402j = (hpx) p11.m167015i(this.f8216h);
        this.f8220l = hpxVarM132402j.f108973b;
        this.f8221m = hpxVarM132402j.f108977f.f119232a.f114358d;
        while (hpxVarM132402j != null) {
            hpxVarM132402j.m132412t();
            hpxVarM132402j = hpxVarM132402j.m132402j();
        }
        this.f8216h = null;
        this.f8218j = null;
        this.f8217i = null;
        this.f8219k = 0;
        m10810A();
    }

    /* JADX INFO: renamed from: g */
    public hpx m10825g(InterfaceC2067y[] interfaceC2067yArr, y6j0 y6j0Var, sj0 sj0Var, C1928q c1928q, jpx jpxVar, z6j0 z6j0Var) {
        jpx jpxVar2;
        long jM132404l;
        hpx hpxVar = this.f8218j;
        if (hpxVar == null) {
            jM132404l = 1000000000000L;
            jpxVar2 = jpxVar;
        } else {
            jpxVar2 = jpxVar;
            jM132404l = (hpxVar.m132404l() + this.f8218j.f108977f.f119236e) - jpxVar2.f119233b;
        }
        hpx hpxVar2 = new hpx(interfaceC2067yArr, jM132404l, y6j0Var, sj0Var, c1928q, jpxVar2, z6j0Var);
        hpx hpxVar3 = this.f8218j;
        if (hpxVar3 != null) {
            hpxVar3.m132414w(hpxVar2);
        } else {
            this.f8216h = hpxVar2;
            this.f8217i = hpxVar2;
        }
        this.f8220l = null;
        this.f8218j = hpxVar2;
        this.f8219k++;
        m10810A();
        return hpxVar2;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final jpx m10826h(z580 z580Var) {
        return m10831m(z580Var.f201766a, z580Var.f201767b, z580Var.f201768c, z580Var.f201783r);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final jpx m10827i(AbstractC1834c0 abstractC1834c0, hpx hpxVar, long j) {
        Object obj;
        long j2;
        jpx jpxVar = hpxVar.f108977f;
        int iM9715h = abstractC1834c0.m9715h(abstractC1834c0.mo9396f(jpxVar.f119232a.f114355a), this.f8209a, this.f8210b, this.f8214f, this.f8215g);
        if (iM9715h == -1) {
            return null;
        }
        int i = abstractC1834c0.mo9399k(iM9715h, this.f8209a, true).f7302c;
        Object objM167011e = p11.m167011e(this.f8209a.f7301b);
        long j3 = jpxVar.f119232a.f114358d;
        long j4 = 0;
        if (abstractC1834c0.m9720r(i, this.f8210b).f7342o == iM9715h) {
            Pair<Object, Long> pairM9719o = abstractC1834c0.m9719o(this.f8210b, this.f8209a, i, -9223372036854775807L, Math.max(0L, j));
            if (pairM9719o == null) {
                return null;
            }
            Object obj2 = pairM9719o.first;
            long jLongValue = ((Long) pairM9719o.second).longValue();
            hpx hpxVarM132402j = hpxVar.m132402j();
            if (hpxVarM132402j == null || !hpxVarM132402j.f108973b.equals(obj2)) {
                j3 = this.f8213e;
                this.f8213e = 1 + j3;
            } else {
                j3 = hpxVarM132402j.f108977f.f119232a.f114358d;
            }
            obj = obj2;
            j2 = jLongValue;
            j4 = -9223372036854775807L;
        } else {
            obj = objM167011e;
            j2 = 0;
        }
        InterfaceC1965i.b bVarM10807D = m10807D(abstractC1834c0, obj, j2, j3, this.f8210b, this.f8209a);
        if (j4 != -9223372036854775807L && jpxVar.f119234c != -9223372036854775807L) {
            boolean zM10839u = m10839u(jpxVar.f119232a.f114355a, abstractC1834c0);
            if (bVarM10807D.m137607b() && zM10839u) {
                j4 = jpxVar.f119234c;
            } else if (zM10839u) {
                j2 = jpxVar.f119234c;
            }
        }
        return m10831m(abstractC1834c0, bVarM10807D, j4, j2);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final jpx m10828j(AbstractC1834c0 abstractC1834c0, hpx hpxVar, long j) {
        jpx jpxVar = hpxVar.f108977f;
        long jM132404l = (hpxVar.m132404l() + jpxVar.f119236e) - j;
        return jpxVar.f119238g ? m10827i(abstractC1834c0, hpxVar, jM132404l) : m10829k(abstractC1834c0, hpxVar, jM132404l);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final jpx m10829k(AbstractC1834c0 abstractC1834c0, hpx hpxVar, long j) {
        jpx jpxVar = hpxVar.f108977f;
        InterfaceC1965i.b bVar = jpxVar.f119232a;
        abstractC1834c0.mo9400l(bVar.f114355a, this.f8209a);
        if (!bVar.m137607b()) {
            int i = bVar.f114359e;
            if (i != -1 && this.f8209a.m9743t(i)) {
                return m10827i(abstractC1834c0, hpxVar, j);
            }
            int iM9737n = this.f8209a.m9737n(bVar.f114359e);
            boolean z = this.f8209a.m9744u(bVar.f114359e) && this.f8209a.m9734k(bVar.f114359e, iM9737n) == 3;
            if (iM9737n == this.f8209a.m9727d(bVar.f114359e) || z) {
                return m10833o(abstractC1834c0, bVar.f114355a, m10834p(abstractC1834c0, bVar.f114355a, bVar.f114359e), jpxVar.f119236e, bVar.f114358d);
            }
            return m10832n(abstractC1834c0, bVar.f114355a, bVar.f114359e, iM9737n, jpxVar.f119236e, bVar.f114358d);
        }
        int i2 = bVar.f114356b;
        int iM9727d = this.f8209a.m9727d(i2);
        if (iM9727d == -1) {
            return null;
        }
        int iM9738o = this.f8209a.m9738o(i2, bVar.f114357c);
        if (iM9738o < iM9727d) {
            return m10832n(abstractC1834c0, bVar.f114355a, i2, iM9738o, jpxVar.f119234c, bVar.f114358d);
        }
        long jLongValue = jpxVar.f119234c;
        if (jLongValue == -9223372036854775807L) {
            AbstractC1834c0.d dVar = this.f8210b;
            AbstractC1834c0.b bVar2 = this.f8209a;
            Pair<Object, Long> pairM9719o = abstractC1834c0.m9719o(dVar, bVar2, bVar2.f7302c, -9223372036854775807L, Math.max(0L, j));
            if (pairM9719o == null) {
                return null;
            }
            jLongValue = ((Long) pairM9719o.second).longValue();
        }
        return m10833o(abstractC1834c0, bVar.f114355a, Math.max(m10834p(abstractC1834c0, bVar.f114355a, bVar.f114356b), jLongValue), jpxVar.f119234c, bVar.f114358d);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public hpx m10830l() {
        return this.f8218j;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final jpx m10831m(AbstractC1834c0 abstractC1834c0, InterfaceC1965i.b bVar, long j, long j2) {
        abstractC1834c0.mo9400l(bVar.f114355a, this.f8209a);
        boolean zM137607b = bVar.m137607b();
        Object obj = bVar.f114355a;
        return zM137607b ? m10832n(abstractC1834c0, obj, bVar.f114356b, bVar.f114357c, j, bVar.f114358d) : m10833o(abstractC1834c0, obj, j2, j, bVar.f114358d);
    }

    /* JADX INFO: renamed from: n */
    public final jpx m10832n(AbstractC1834c0 abstractC1834c0, Object obj, int i, int i2, long j, long j2) {
        InterfaceC1965i.b bVar = new InterfaceC1965i.b(obj, i, i2, j2);
        long jM9728e = abstractC1834c0.mo9400l(bVar.f114355a, this.f8209a).m9728e(bVar.f114356b, bVar.f114357c);
        long jM9733j = i2 == this.f8209a.m9737n(i) ? this.f8209a.m9733j() : 0L;
        boolean zM9744u = this.f8209a.m9744u(bVar.f114356b);
        if (jM9728e != -9223372036854775807L && jM9733j >= jM9728e) {
            jM9733j = Math.max(0L, jM9728e - 1);
        }
        return new jpx(bVar, jM9733j, j, -9223372036854775807L, jM9728e, zM9744u, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX INFO: renamed from: o */
    public final jpx m10833o(AbstractC1834c0 abstractC1834c0, Object obj, long j, long j2, long j3) {
        boolean z;
        long j4;
        long jM9732i;
        long j5;
        long jMax;
        abstractC1834c0.mo9400l(obj, this.f8209a);
        int iM9730g = this.f8209a.m9730g(j);
        boolean z2 = iM9730g != -1 && this.f8209a.m9743t(iM9730g);
        AbstractC1834c0.b bVar = this.f8209a;
        if (iM9730g == -1) {
            if (bVar.m9729f() > 0) {
                AbstractC1834c0.b bVar2 = this.f8209a;
                if (bVar2.m9744u(bVar2.m9741r())) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else if (bVar.m9744u(iM9730g)) {
            long jM9732i2 = this.f8209a.m9732i(iM9730g);
            AbstractC1834c0.b bVar3 = this.f8209a;
            if (jM9732i2 == bVar3.f7303d && bVar3.m9742s(iM9730g)) {
                z = true;
                iM9730g = -1;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        InterfaceC1965i.b bVar4 = new InterfaceC1965i.b(obj, j3, iM9730g);
        boolean zM10840v = m10840v(bVar4);
        boolean zM10842x = m10842x(abstractC1834c0, bVar4);
        boolean zM10841w = m10841w(abstractC1834c0, bVar4, zM10840v);
        boolean z3 = (iM9730g == -1 || !this.f8209a.m9744u(iM9730g) || z2) ? false : true;
        if (iM9730g == -1 || z2) {
            if (z) {
                jM9732i = this.f8209a.f7303d;
            } else {
                j4 = -9223372036854775807L;
            }
            if (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) {
                j5 = this.f8209a.f7303d;
            } else {
                j5 = j4;
            }
            if (j5 != -9223372036854775807L || j < j5) {
                jMax = j;
            } else {
                jMax = Math.max(0L, j5 - ((long) ((zM10841w || !z) ? 1 : 0)));
            }
            return new jpx(bVar4, jMax, j2, j4, j5, z3, zM10840v, zM10842x, zM10841w);
        }
        jM9732i = this.f8209a.m9732i(iM9730g);
        j4 = jM9732i;
        if (j4 != -9223372036854775807L) {
            j5 = this.f8209a.f7303d;
        } else {
            j5 = this.f8209a.f7303d;
        }
        if (j5 != -9223372036854775807L) {
            jMax = j;
        } else {
            jMax = j;
        }
        return new jpx(bVar4, jMax, j2, j4, j5, z3, zM10840v, zM10842x, zM10841w);
    }

    /* JADX INFO: renamed from: p */
    public final long m10834p(AbstractC1834c0 abstractC1834c0, Object obj, int i) {
        abstractC1834c0.mo9400l(obj, this.f8209a);
        long jM9732i = this.f8209a.m9732i(i);
        AbstractC1834c0.b bVar = this.f8209a;
        return jM9732i == Long.MIN_VALUE ? bVar.f7303d : jM9732i + bVar.m9735l(i);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public jpx m10835q(long j, z580 z580Var) {
        hpx hpxVar = this.f8218j;
        return hpxVar == null ? m10826h(z580Var) : m10828j(z580Var.f201766a, hpxVar, j);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public hpx m10836r() {
        return this.f8216h;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public hpx m10837s() {
        return this.f8217i;
    }

    /* JADX INFO: renamed from: t */
    public jpx m10838t(AbstractC1834c0 abstractC1834c0, jpx jpxVar) {
        long jM9736m;
        boolean zM9744u;
        int i;
        InterfaceC1965i.b bVar = jpxVar.f119232a;
        boolean zM10840v = m10840v(bVar);
        boolean zM10842x = m10842x(abstractC1834c0, bVar);
        boolean zM10841w = m10841w(abstractC1834c0, bVar, zM10840v);
        abstractC1834c0.mo9400l(jpxVar.f119232a.f114355a, this.f8209a);
        long jM9732i = (bVar.m137607b() || (i = bVar.f114359e) == -1) ? -9223372036854775807L : this.f8209a.m9732i(i);
        if (bVar.m137607b()) {
            jM9736m = this.f8209a.m9728e(bVar.f114356b, bVar.f114357c);
        } else {
            jM9736m = (jM9732i == -9223372036854775807L || jM9732i == Long.MIN_VALUE) ? this.f8209a.m9736m() : jM9732i;
        }
        if (bVar.m137607b()) {
            zM9744u = this.f8209a.m9744u(bVar.f114356b);
        } else {
            int i2 = bVar.f114359e;
            zM9744u = i2 != -1 && this.f8209a.m9744u(i2);
        }
        return new jpx(bVar, jpxVar.f119233b, jpxVar.f119234c, jM9732i, jM9736m, zM9744u, zM10840v, zM10842x, zM10841w);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10839u(Object obj, AbstractC1834c0 abstractC1834c0) {
        int iM9729f = abstractC1834c0.mo9400l(obj, this.f8209a).m9729f();
        int iM9741r = this.f8209a.m9741r();
        if (iM9729f <= 0 || !this.f8209a.m9744u(iM9741r)) {
            return false;
        }
        return iM9729f > 1 || this.f8209a.m9732i(iM9741r) != Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10840v(InterfaceC1965i.b bVar) {
        return !bVar.m137607b() && bVar.f114359e == -1;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m10841w(AbstractC1834c0 abstractC1834c0, InterfaceC1965i.b bVar, boolean z) {
        int iMo9396f = abstractC1834c0.mo9396f(bVar.f114355a);
        return !abstractC1834c0.m9720r(abstractC1834c0.m9716j(iMo9396f, this.f8209a).f7302c, this.f8210b).f7336i && abstractC1834c0.m9723v(iMo9396f, this.f8209a, this.f8210b, this.f8214f, this.f8215g) && z;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10842x(AbstractC1834c0 abstractC1834c0, InterfaceC1965i.b bVar) {
        if (m10840v(bVar)) {
            return abstractC1834c0.m9720r(abstractC1834c0.mo9400l(bVar.f114355a, this.f8209a).f7302c, this.f8210b).f7343p == abstractC1834c0.mo9396f(bVar.f114355a);
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public boolean m10843y(InterfaceC1953h interfaceC1953h) {
        hpx hpxVar = this.f8218j;
        return hpxVar != null && hpxVar.f108972a == interfaceC1953h;
    }
}
