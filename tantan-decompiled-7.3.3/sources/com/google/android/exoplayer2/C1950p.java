package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.InterfaceC1976h;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.common.collect.ImmutableList;
import p153l.cgj0;
import p153l.dgj0;
import p153l.dk0;
import p153l.eyx;
import p153l.fe80;
import p153l.gyx;
import p153l.oj0;
import p153l.sxk;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.p */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1950p {

    /* JADX INFO: renamed from: a */
    public final AbstractC1857c0.b f8246a = new AbstractC1857c0.b();

    /* JADX INFO: renamed from: b */
    public final AbstractC1857c0.d f8247b = new AbstractC1857c0.d();

    /* JADX INFO: renamed from: c */
    public final dk0 f8248c;

    /* JADX INFO: renamed from: d */
    public final sxk f8249d;

    /* JADX INFO: renamed from: e */
    public long f8250e;

    /* JADX INFO: renamed from: f */
    public int f8251f;

    /* JADX INFO: renamed from: g */
    public boolean f8252g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public eyx f8253h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public eyx f8254i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public eyx f8255j;

    /* JADX INFO: renamed from: k */
    public int f8256k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Object f8257l;

    /* JADX INFO: renamed from: m */
    public long f8258m;

    public C1950p(dk0 dk0Var, sxk sxkVar) {
        this.f8248c = dk0Var;
        this.f8249d = sxkVar;
    }

    /* JADX INFO: renamed from: D */
    public static InterfaceC1988i.b m10861D(AbstractC1857c0 abstractC1857c0, Object obj, long j, long j2, AbstractC1857c0.d dVar, AbstractC1857c0.b bVar) {
        abstractC1857c0.mo9454l(obj, bVar);
        abstractC1857c0.m9774r(bVar.f7339c, dVar);
        for (int iMo9450f = abstractC1857c0.mo9450f(obj); m10863z(bVar) && iMo9450f <= dVar.f7380p; iMo9450f++) {
            abstractC1857c0.mo9453k(iMo9450f, bVar, true);
            obj = w11.m204369e(bVar.f7338b);
        }
        abstractC1857c0.mo9454l(obj, bVar);
        int iM9785h = bVar.m9785h(j);
        return iM9785h == -1 ? new InterfaceC1988i.b(obj, j2, bVar.m9784g(j)) : new InterfaceC1988i.b(obj, iM9785h, bVar.m9791n(iM9785h), j2);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m10863z(AbstractC1857c0.b bVar) {
        int iM9783f = bVar.m9783f();
        if (iM9783f != 0 && ((iM9783f != 1 || !bVar.m9797t(0)) && bVar.m9798u(bVar.m9795r()))) {
            long jM9789l = 0;
            if (bVar.m9785h(0L) == -1) {
                if (bVar.f7340d == 0) {
                    return true;
                }
                int i = iM9783f - (bVar.m9797t(iM9783f + (-1)) ? 2 : 1);
                for (int i2 = 0; i2 <= i; i2++) {
                    jM9789l += bVar.m9789l(i2);
                }
                if (bVar.f7340d <= jM9789l) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m10864A() {
        final ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
        for (eyx eyxVarM123284j = this.f8253h; eyxVarM123284j != null; eyxVarM123284j = eyxVarM123284j.m123284j()) {
            c2804aBuilder.mo15737a(eyxVarM123284j.f96527f.f107120a);
        }
        eyx eyxVar = this.f8254i;
        final InterfaceC1988i.b bVar = eyxVar == null ? null : eyxVar.f96527f.f107120a;
        this.f8249d.mo131271i(new Runnable() { // from class: l.hyx
            @Override // java.lang.Runnable
            public final void run() {
                this.f112172a.f8248c.mo116178m0(c2804aBuilder.m15756m(), bVar);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m10865B(long j) {
        eyx eyxVar = this.f8255j;
        if (eyxVar != null) {
            eyxVar.m123293s(j);
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m10866C(eyx eyxVar) {
        boolean z = false;
        w11.m204371g(eyxVar != null);
        if (eyxVar.equals(this.f8255j)) {
            return false;
        }
        this.f8255j = eyxVar;
        while (eyxVar.m123284j() != null) {
            eyxVar = eyxVar.m123284j();
            if (eyxVar == this.f8254i) {
                this.f8254i = this.f8253h;
                z = true;
            }
            eyxVar.m123294t();
            this.f8256k--;
        }
        this.f8255j.m123296w(null);
        m10864A();
        return z;
    }

    /* JADX INFO: renamed from: E */
    public InterfaceC1988i.b m10867E(AbstractC1857c0 abstractC1857c0, Object obj, long j) {
        long jM10868F = m10868F(abstractC1857c0, obj);
        abstractC1857c0.mo9454l(obj, this.f8246a);
        abstractC1857c0.m9774r(this.f8246a.f7339c, this.f8247b);
        boolean z = false;
        for (int iMo9450f = abstractC1857c0.mo9450f(obj); iMo9450f >= this.f8247b.f7379o; iMo9450f--) {
            abstractC1857c0.mo9453k(iMo9450f, this.f8246a, true);
            boolean z2 = this.f8246a.m9783f() > 0;
            z |= z2;
            AbstractC1857c0.b bVar = this.f8246a;
            if (bVar.m9785h(bVar.f7340d) != -1) {
                obj = w11.m204369e(this.f8246a.f7338b);
            }
            if (z && (!z2 || this.f8246a.f7340d != 0)) {
                break;
            }
        }
        return m10861D(abstractC1857c0, obj, j, jM10868F, this.f8247b, this.f8246a);
    }

    /* JADX INFO: renamed from: F */
    public final long m10868F(AbstractC1857c0 abstractC1857c0, Object obj) {
        int iMo9450f;
        int i = abstractC1857c0.mo9454l(obj, this.f8246a).f7339c;
        Object obj2 = this.f8257l;
        if (obj2 != null && (iMo9450f = abstractC1857c0.mo9450f(obj2)) != -1 && abstractC1857c0.m9770j(iMo9450f, this.f8246a).f7339c == i) {
            return this.f8258m;
        }
        for (eyx eyxVarM123284j = this.f8253h; eyxVarM123284j != null; eyxVarM123284j = eyxVarM123284j.m123284j()) {
            if (eyxVarM123284j.f96523b.equals(obj)) {
                return eyxVarM123284j.f96527f.f107120a.f101425d;
            }
        }
        for (eyx eyxVarM123284j2 = this.f8253h; eyxVarM123284j2 != null; eyxVarM123284j2 = eyxVarM123284j2.m123284j()) {
            int iMo9450f2 = abstractC1857c0.mo9450f(eyxVarM123284j2.f96523b);
            if (iMo9450f2 != -1 && abstractC1857c0.m9770j(iMo9450f2, this.f8246a).f7339c == i) {
                return eyxVarM123284j2.f96527f.f107120a.f101425d;
            }
        }
        long j = this.f8250e;
        this.f8250e = 1 + j;
        if (this.f8253h == null) {
            this.f8257l = obj;
            this.f8258m = j;
        }
        return j;
    }

    /* JADX INFO: renamed from: G */
    public boolean m10869G() {
        eyx eyxVar = this.f8255j;
        if (eyxVar != null) {
            return !eyxVar.f96527f.f107128i && eyxVar.m123291q() && this.f8255j.f96527f.f107124e != -9223372036854775807L && this.f8256k < 100;
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m10870H(AbstractC1857c0 abstractC1857c0) {
        AbstractC1857c0 abstractC1857c1;
        eyx eyxVarM123284j = this.f8253h;
        if (eyxVarM123284j == null) {
            return true;
        }
        int iMo9450f = abstractC1857c0.mo9450f(eyxVarM123284j.f96523b);
        while (true) {
            abstractC1857c1 = abstractC1857c0;
            iMo9450f = abstractC1857c1.m9769h(iMo9450f, this.f8246a, this.f8247b, this.f8251f, this.f8252g);
            while (eyxVarM123284j.m123284j() != null && !eyxVarM123284j.f96527f.f107126g) {
                eyxVarM123284j = eyxVarM123284j.m123284j();
            }
            eyx eyxVarM123284j2 = eyxVarM123284j.m123284j();
            if (iMo9450f == -1 || eyxVarM123284j2 == null || abstractC1857c1.mo9450f(eyxVarM123284j2.f96523b) != iMo9450f) {
                break;
            }
            eyxVarM123284j = eyxVarM123284j2;
            abstractC1857c0 = abstractC1857c1;
        }
        boolean zM10866C = m10866C(eyxVarM123284j);
        eyxVarM123284j.f96527f = m10892t(abstractC1857c1, eyxVarM123284j.f96527f);
        return !zM10866C;
    }

    /* JADX INFO: renamed from: I */
    public boolean m10871I(AbstractC1857c0 abstractC1857c0, long j, long j2) {
        boolean zM10866C;
        gyx gyxVarM10892t;
        eyx eyxVarM123284j = this.f8253h;
        eyx eyxVar = null;
        while (eyxVarM123284j != null) {
            gyx gyxVar = eyxVarM123284j.f96527f;
            if (eyxVar != null) {
                gyx gyxVarM10882j = m10882j(abstractC1857c0, eyxVar, j);
                if (gyxVarM10882j == null) {
                    zM10866C = m10866C(eyxVar);
                } else if (m10877e(gyxVar, gyxVarM10882j)) {
                    gyxVarM10892t = gyxVarM10882j;
                } else {
                    zM10866C = m10866C(eyxVar);
                }
                return !zM10866C;
            }
            gyxVarM10892t = m10892t(abstractC1857c0, gyxVar);
            eyxVarM123284j.f96527f = gyxVarM10892t.m133031a(gyxVar.f107122c);
            if (!m10876d(gyxVar.f107124e, gyxVarM10892t.f107124e)) {
                eyxVarM123284j.m123275A();
                long j3 = gyxVarM10892t.f107124e;
                return (m10866C(eyxVarM123284j) || (eyxVarM123284j == this.f8254i && !eyxVarM123284j.f96527f.f107125f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : eyxVarM123284j.m123299z(j3)) ? 1 : (j2 == ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : eyxVarM123284j.m123299z(j3)) ? 0 : -1)) >= 0))) ? false : true;
            }
            eyxVar = eyxVarM123284j;
            eyxVarM123284j = eyxVarM123284j.m123284j();
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean m10872J(AbstractC1857c0 abstractC1857c0, int i) {
        this.f8251f = i;
        return m10870H(abstractC1857c0);
    }

    /* JADX INFO: renamed from: K */
    public boolean m10873K(AbstractC1857c0 abstractC1857c0, boolean z) {
        this.f8252g = z;
        return m10870H(abstractC1857c0);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public eyx m10874b() {
        eyx eyxVar = this.f8253h;
        if (eyxVar == null) {
            return null;
        }
        if (eyxVar == this.f8254i) {
            this.f8254i = eyxVar.m123284j();
        }
        this.f8253h.m123294t();
        int i = this.f8256k - 1;
        this.f8256k = i;
        if (i == 0) {
            this.f8255j = null;
            eyx eyxVar2 = this.f8253h;
            this.f8257l = eyxVar2.f96523b;
            this.f8258m = eyxVar2.f96527f.f107120a.f101425d;
        }
        this.f8253h = this.f8253h.m123284j();
        m10864A();
        return this.f8253h;
    }

    /* JADX INFO: renamed from: c */
    public eyx m10875c() {
        eyx eyxVar = this.f8254i;
        w11.m204371g((eyxVar == null || eyxVar.m123284j() == null) ? false : true);
        this.f8254i = this.f8254i.m123284j();
        m10864A();
        return this.f8254i;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10876d(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10877e(gyx gyxVar, gyx gyxVar2) {
        return gyxVar.f107121b == gyxVar2.f107121b && gyxVar.f107120a.equals(gyxVar2.f107120a);
    }

    /* JADX INFO: renamed from: f */
    public void m10878f() {
        if (this.f8256k == 0) {
            return;
        }
        eyx eyxVarM123284j = (eyx) w11.m204373i(this.f8253h);
        this.f8257l = eyxVarM123284j.f96523b;
        this.f8258m = eyxVarM123284j.f96527f.f107120a.f101425d;
        while (eyxVarM123284j != null) {
            eyxVarM123284j.m123294t();
            eyxVarM123284j = eyxVarM123284j.m123284j();
        }
        this.f8253h = null;
        this.f8255j = null;
        this.f8254i = null;
        this.f8256k = 0;
        m10864A();
    }

    /* JADX INFO: renamed from: g */
    public eyx m10879g(InterfaceC2090y[] interfaceC2090yArr, cgj0 cgj0Var, oj0 oj0Var, C1951q c1951q, gyx gyxVar, dgj0 dgj0Var) {
        gyx gyxVar2;
        long jM123286l;
        eyx eyxVar = this.f8255j;
        if (eyxVar == null) {
            jM123286l = 1000000000000L;
            gyxVar2 = gyxVar;
        } else {
            gyxVar2 = gyxVar;
            jM123286l = (eyxVar.m123286l() + this.f8255j.f96527f.f107124e) - gyxVar2.f107121b;
        }
        eyx eyxVar2 = new eyx(interfaceC2090yArr, jM123286l, cgj0Var, oj0Var, c1951q, gyxVar2, dgj0Var);
        eyx eyxVar3 = this.f8255j;
        if (eyxVar3 != null) {
            eyxVar3.m123296w(eyxVar2);
        } else {
            this.f8253h = eyxVar2;
            this.f8254i = eyxVar2;
        }
        this.f8257l = null;
        this.f8255j = eyxVar2;
        this.f8256k++;
        m10864A();
        return eyxVar2;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final gyx m10880h(fe80 fe80Var) {
        return m10885m(fe80Var.f98629a, fe80Var.f98630b, fe80Var.f98631c, fe80Var.f98646r);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final gyx m10881i(AbstractC1857c0 abstractC1857c0, eyx eyxVar, long j) {
        Object obj;
        long j2;
        gyx gyxVar = eyxVar.f96527f;
        int iM9769h = abstractC1857c0.m9769h(abstractC1857c0.mo9450f(gyxVar.f107120a.f101422a), this.f8246a, this.f8247b, this.f8251f, this.f8252g);
        if (iM9769h == -1) {
            return null;
        }
        int i = abstractC1857c0.mo9453k(iM9769h, this.f8246a, true).f7339c;
        Object objM204369e = w11.m204369e(this.f8246a.f7338b);
        long j3 = gyxVar.f107120a.f101425d;
        long j4 = 0;
        if (abstractC1857c0.m9774r(i, this.f8247b).f7379o == iM9769h) {
            Pair<Object, Long> pairM9773o = abstractC1857c0.m9773o(this.f8247b, this.f8246a, i, -9223372036854775807L, Math.max(0L, j));
            if (pairM9773o == null) {
                return null;
            }
            Object obj2 = pairM9773o.first;
            long jLongValue = ((Long) pairM9773o.second).longValue();
            eyx eyxVarM123284j = eyxVar.m123284j();
            if (eyxVarM123284j == null || !eyxVarM123284j.f96523b.equals(obj2)) {
                j3 = this.f8250e;
                this.f8250e = 1 + j3;
            } else {
                j3 = eyxVarM123284j.f96527f.f107120a.f101425d;
            }
            obj = obj2;
            j2 = jLongValue;
            j4 = -9223372036854775807L;
        } else {
            obj = objM204369e;
            j2 = 0;
        }
        InterfaceC1988i.b bVarM10861D = m10861D(abstractC1857c0, obj, j2, j3, this.f8247b, this.f8246a);
        if (j4 != -9223372036854775807L && gyxVar.f107122c != -9223372036854775807L) {
            boolean zM10893u = m10893u(gyxVar.f107120a.f101422a, abstractC1857c0);
            if (bVarM10861D.m128142b() && zM10893u) {
                j4 = gyxVar.f107122c;
            } else if (zM10893u) {
                j2 = gyxVar.f107122c;
            }
        }
        return m10885m(abstractC1857c0, bVarM10861D, j4, j2);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final gyx m10882j(AbstractC1857c0 abstractC1857c0, eyx eyxVar, long j) {
        gyx gyxVar = eyxVar.f96527f;
        long jM123286l = (eyxVar.m123286l() + gyxVar.f107124e) - j;
        return gyxVar.f107126g ? m10881i(abstractC1857c0, eyxVar, jM123286l) : m10883k(abstractC1857c0, eyxVar, jM123286l);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final gyx m10883k(AbstractC1857c0 abstractC1857c0, eyx eyxVar, long j) {
        gyx gyxVar = eyxVar.f96527f;
        InterfaceC1988i.b bVar = gyxVar.f107120a;
        abstractC1857c0.mo9454l(bVar.f101422a, this.f8246a);
        if (!bVar.m128142b()) {
            int i = bVar.f101426e;
            if (i != -1 && this.f8246a.m9797t(i)) {
                return m10881i(abstractC1857c0, eyxVar, j);
            }
            int iM9791n = this.f8246a.m9791n(bVar.f101426e);
            boolean z = this.f8246a.m9798u(bVar.f101426e) && this.f8246a.m9788k(bVar.f101426e, iM9791n) == 3;
            if (iM9791n == this.f8246a.m9781d(bVar.f101426e) || z) {
                return m10887o(abstractC1857c0, bVar.f101422a, m10888p(abstractC1857c0, bVar.f101422a, bVar.f101426e), gyxVar.f107124e, bVar.f101425d);
            }
            return m10886n(abstractC1857c0, bVar.f101422a, bVar.f101426e, iM9791n, gyxVar.f107124e, bVar.f101425d);
        }
        int i2 = bVar.f101423b;
        int iM9781d = this.f8246a.m9781d(i2);
        if (iM9781d == -1) {
            return null;
        }
        int iM9792o = this.f8246a.m9792o(i2, bVar.f101424c);
        if (iM9792o < iM9781d) {
            return m10886n(abstractC1857c0, bVar.f101422a, i2, iM9792o, gyxVar.f107122c, bVar.f101425d);
        }
        long jLongValue = gyxVar.f107122c;
        if (jLongValue == -9223372036854775807L) {
            AbstractC1857c0.d dVar = this.f8247b;
            AbstractC1857c0.b bVar2 = this.f8246a;
            Pair<Object, Long> pairM9773o = abstractC1857c0.m9773o(dVar, bVar2, bVar2.f7339c, -9223372036854775807L, Math.max(0L, j));
            if (pairM9773o == null) {
                return null;
            }
            jLongValue = ((Long) pairM9773o.second).longValue();
        }
        return m10887o(abstractC1857c0, bVar.f101422a, Math.max(m10888p(abstractC1857c0, bVar.f101422a, bVar.f101423b), jLongValue), gyxVar.f107122c, bVar.f101425d);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public eyx m10884l() {
        return this.f8255j;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final gyx m10885m(AbstractC1857c0 abstractC1857c0, InterfaceC1988i.b bVar, long j, long j2) {
        abstractC1857c0.mo9454l(bVar.f101422a, this.f8246a);
        boolean zM128142b = bVar.m128142b();
        Object obj = bVar.f101422a;
        return zM128142b ? m10886n(abstractC1857c0, obj, bVar.f101423b, bVar.f101424c, j, bVar.f101425d) : m10887o(abstractC1857c0, obj, j2, j, bVar.f101425d);
    }

    /* JADX INFO: renamed from: n */
    public final gyx m10886n(AbstractC1857c0 abstractC1857c0, Object obj, int i, int i2, long j, long j2) {
        InterfaceC1988i.b bVar = new InterfaceC1988i.b(obj, i, i2, j2);
        long jM9782e = abstractC1857c0.mo9454l(bVar.f101422a, this.f8246a).m9782e(bVar.f101423b, bVar.f101424c);
        long jM9787j = i2 == this.f8246a.m9791n(i) ? this.f8246a.m9787j() : 0L;
        boolean zM9798u = this.f8246a.m9798u(bVar.f101423b);
        if (jM9782e != -9223372036854775807L && jM9787j >= jM9782e) {
            jM9787j = Math.max(0L, jM9782e - 1);
        }
        return new gyx(bVar, jM9787j, j, -9223372036854775807L, jM9782e, zM9798u, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX INFO: renamed from: o */
    public final gyx m10887o(AbstractC1857c0 abstractC1857c0, Object obj, long j, long j2, long j3) {
        boolean z;
        long j4;
        long jM9786i;
        long j5;
        long jMax;
        abstractC1857c0.mo9454l(obj, this.f8246a);
        int iM9784g = this.f8246a.m9784g(j);
        boolean z2 = iM9784g != -1 && this.f8246a.m9797t(iM9784g);
        AbstractC1857c0.b bVar = this.f8246a;
        if (iM9784g == -1) {
            if (bVar.m9783f() > 0) {
                AbstractC1857c0.b bVar2 = this.f8246a;
                if (bVar2.m9798u(bVar2.m9795r())) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else if (bVar.m9798u(iM9784g)) {
            long jM9786i2 = this.f8246a.m9786i(iM9784g);
            AbstractC1857c0.b bVar3 = this.f8246a;
            if (jM9786i2 == bVar3.f7340d && bVar3.m9796s(iM9784g)) {
                z = true;
                iM9784g = -1;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        InterfaceC1988i.b bVar4 = new InterfaceC1988i.b(obj, j3, iM9784g);
        boolean zM10894v = m10894v(bVar4);
        boolean zM10896x = m10896x(abstractC1857c0, bVar4);
        boolean zM10895w = m10895w(abstractC1857c0, bVar4, zM10894v);
        boolean z3 = (iM9784g == -1 || !this.f8246a.m9798u(iM9784g) || z2) ? false : true;
        if (iM9784g == -1 || z2) {
            if (z) {
                jM9786i = this.f8246a.f7340d;
            } else {
                j4 = -9223372036854775807L;
            }
            if (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) {
                j5 = this.f8246a.f7340d;
            } else {
                j5 = j4;
            }
            if (j5 != -9223372036854775807L || j < j5) {
                jMax = j;
            } else {
                jMax = Math.max(0L, j5 - ((long) ((zM10895w || !z) ? 1 : 0)));
            }
            return new gyx(bVar4, jMax, j2, j4, j5, z3, zM10894v, zM10896x, zM10895w);
        }
        jM9786i = this.f8246a.m9786i(iM9784g);
        j4 = jM9786i;
        if (j4 != -9223372036854775807L) {
            j5 = this.f8246a.f7340d;
        } else {
            j5 = this.f8246a.f7340d;
        }
        if (j5 != -9223372036854775807L) {
            jMax = j;
        } else {
            jMax = j;
        }
        return new gyx(bVar4, jMax, j2, j4, j5, z3, zM10894v, zM10896x, zM10895w);
    }

    /* JADX INFO: renamed from: p */
    public final long m10888p(AbstractC1857c0 abstractC1857c0, Object obj, int i) {
        abstractC1857c0.mo9454l(obj, this.f8246a);
        long jM9786i = this.f8246a.m9786i(i);
        AbstractC1857c0.b bVar = this.f8246a;
        return jM9786i == Long.MIN_VALUE ? bVar.f7340d : jM9786i + bVar.m9789l(i);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public gyx m10889q(long j, fe80 fe80Var) {
        eyx eyxVar = this.f8255j;
        return eyxVar == null ? m10880h(fe80Var) : m10882j(fe80Var.f98629a, eyxVar, j);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public eyx m10890r() {
        return this.f8253h;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public eyx m10891s() {
        return this.f8254i;
    }

    /* JADX INFO: renamed from: t */
    public gyx m10892t(AbstractC1857c0 abstractC1857c0, gyx gyxVar) {
        long jM9790m;
        boolean zM9798u;
        int i;
        InterfaceC1988i.b bVar = gyxVar.f107120a;
        boolean zM10894v = m10894v(bVar);
        boolean zM10896x = m10896x(abstractC1857c0, bVar);
        boolean zM10895w = m10895w(abstractC1857c0, bVar, zM10894v);
        abstractC1857c0.mo9454l(gyxVar.f107120a.f101422a, this.f8246a);
        long jM9786i = (bVar.m128142b() || (i = bVar.f101426e) == -1) ? -9223372036854775807L : this.f8246a.m9786i(i);
        if (bVar.m128142b()) {
            jM9790m = this.f8246a.m9782e(bVar.f101423b, bVar.f101424c);
        } else {
            jM9790m = (jM9786i == -9223372036854775807L || jM9786i == Long.MIN_VALUE) ? this.f8246a.m9790m() : jM9786i;
        }
        if (bVar.m128142b()) {
            zM9798u = this.f8246a.m9798u(bVar.f101423b);
        } else {
            int i2 = bVar.f101426e;
            zM9798u = i2 != -1 && this.f8246a.m9798u(i2);
        }
        return new gyx(bVar, gyxVar.f107121b, gyxVar.f107122c, jM9786i, jM9790m, zM9798u, zM10894v, zM10896x, zM10895w);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10893u(Object obj, AbstractC1857c0 abstractC1857c0) {
        int iM9783f = abstractC1857c0.mo9454l(obj, this.f8246a).m9783f();
        int iM9795r = this.f8246a.m9795r();
        if (iM9783f <= 0 || !this.f8246a.m9798u(iM9795r)) {
            return false;
        }
        return iM9783f > 1 || this.f8246a.m9786i(iM9795r) != Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10894v(InterfaceC1988i.b bVar) {
        return !bVar.m128142b() && bVar.f101426e == -1;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m10895w(AbstractC1857c0 abstractC1857c0, InterfaceC1988i.b bVar, boolean z) {
        int iMo9450f = abstractC1857c0.mo9450f(bVar.f101422a);
        return !abstractC1857c0.m9774r(abstractC1857c0.m9770j(iMo9450f, this.f8246a).f7339c, this.f8247b).f7373i && abstractC1857c0.m9777v(iMo9450f, this.f8246a, this.f8247b, this.f8251f, this.f8252g) && z;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10896x(AbstractC1857c0 abstractC1857c0, InterfaceC1988i.b bVar) {
        if (m10894v(bVar)) {
            return abstractC1857c0.m9774r(abstractC1857c0.mo9454l(bVar.f101422a, this.f8246a).f7339c, this.f8247b).f7380p == abstractC1857c0.mo9450f(bVar.f101422a);
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public boolean m10897y(InterfaceC1976h interfaceC1976h) {
        eyx eyxVar = this.f8255j;
        return eyxVar != null && eyxVar.f96522a == interfaceC1976h;
    }
}
