package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p149l.a5c;
import p149l.ab5;
import p149l.c3c;
import p149l.c80;
import p149l.d3c;
import p149l.dif0;
import p149l.e3c;
import p149l.esm;
import p149l.fcc0;
import p149l.fix;
import p149l.gix;
import p149l.ice0;
import p149l.l7j0;
import p149l.mp2;
import p149l.n35;
import p149l.o35;
import p149l.o8f;
import p149l.otc0;
import p149l.p35;
import p149l.pr2;
import p149l.q06;
import p149l.q35;
import p149l.qi3;
import p149l.rr2;
import p149l.urv;
import p149l.v680;
import p149l.vck0;
import p149l.y2c;
import p149l.za5;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C1948c implements InterfaceC1946a {

    /* JADX INFO: renamed from: a */
    public final urv f8416a;

    /* JADX INFO: renamed from: b */
    public final rr2 f8417b;

    /* JADX INFO: renamed from: c */
    public final int[] f8418c;

    /* JADX INFO: renamed from: d */
    public final int f8419d;

    /* JADX INFO: renamed from: e */
    public final a5c f8420e;

    /* JADX INFO: renamed from: f */
    public final long f8421f;

    /* JADX INFO: renamed from: g */
    public final int f8422g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final C1949d.c f8423h;

    /* JADX INFO: renamed from: i */
    public final b[] f8424i;

    /* JADX INFO: renamed from: j */
    public o8f f8425j;

    /* JADX INFO: renamed from: k */
    public y2c f8426k;

    /* JADX INFO: renamed from: l */
    public int f8427l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public IOException f8428m;

    /* JADX INFO: renamed from: n */
    public boolean f8429n;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final o35 f8433a;

        /* JADX INFO: renamed from: b */
        public final otc0 f8434b;

        /* JADX INFO: renamed from: c */
        public final pr2 f8435c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final c3c f8436d;

        /* JADX INFO: renamed from: e */
        public final long f8437e;

        /* JADX INFO: renamed from: f */
        public final long f8438f;

        public b(long j, otc0 otc0Var, pr2 pr2Var, @Nullable o35 o35Var, long j2, @Nullable c3c c3cVar) {
            this.f8437e = j;
            this.f8434b = otc0Var;
            this.f8435c = pr2Var;
            this.f8438f = j2;
            this.f8433a = o35Var;
            this.f8436d = c3cVar;
        }

        @CheckResult
        /* JADX INFO: renamed from: b */
        public b m11078b(long j, otc0 otc0Var) throws BehindLiveWindowException {
            long jMo104997g;
            long jMo104997g2;
            c3c c3cVarMo165937b = this.f8434b.mo165937b();
            c3c c3cVarMo165937b2 = otc0Var.mo165937b();
            if (c3cVarMo165937b == null) {
                return new b(j, otc0Var, this.f8435c, this.f8433a, this.f8438f, c3cVarMo165937b);
            }
            if (!c3cVarMo165937b.mo105001k()) {
                return new b(j, otc0Var, this.f8435c, this.f8433a, this.f8438f, c3cVarMo165937b2);
            }
            long jMo104998h = c3cVarMo165937b.mo104998h(j);
            if (jMo104998h == 0) {
                return new b(j, otc0Var, this.f8435c, this.f8433a, this.f8438f, c3cVarMo165937b2);
            }
            long jMo104999i = c3cVarMo165937b.mo104999i();
            long jMo104993c = c3cVarMo165937b.mo104993c(jMo104999i);
            long j2 = jMo104998h + jMo104999i;
            long j3 = j2 - 1;
            long jMo104993c2 = c3cVarMo165937b.mo104993c(j3) + c3cVarMo165937b.mo104994d(j3, j);
            long jMo104999i2 = c3cVarMo165937b2.mo104999i();
            long jMo104993c3 = c3cVarMo165937b2.mo104993c(jMo104999i2);
            long j4 = this.f8438f;
            if (jMo104993c2 != jMo104993c3) {
                if (jMo104993c2 < jMo104993c3) {
                    throw new BehindLiveWindowException();
                }
                if (jMo104993c3 < jMo104993c) {
                    jMo104997g2 = j4 - (c3cVarMo165937b2.mo104997g(jMo104993c, j) - jMo104999i);
                } else {
                    jMo104997g = c3cVarMo165937b.mo104997g(jMo104993c3, j) - jMo104999i2;
                }
                return new b(j, otc0Var, this.f8435c, this.f8433a, jMo104997g2, c3cVarMo165937b2);
            }
            jMo104997g = j2 - jMo104999i2;
            jMo104997g2 = j4 + jMo104997g;
            return new b(j, otc0Var, this.f8435c, this.f8433a, jMo104997g2, c3cVarMo165937b2);
        }

        @CheckResult
        /* JADX INFO: renamed from: c */
        public b m11079c(c3c c3cVar) {
            return new b(this.f8437e, this.f8434b, this.f8435c, this.f8433a, this.f8438f, c3cVar);
        }

        @CheckResult
        /* JADX INFO: renamed from: d */
        public b m11080d(pr2 pr2Var) {
            return new b(this.f8437e, this.f8434b, pr2Var, this.f8433a, this.f8438f, this.f8436d);
        }

        /* JADX INFO: renamed from: e */
        public long m11081e(long j) {
            return this.f8436d.mo104995e(this.f8437e, j) + this.f8438f;
        }

        /* JADX INFO: renamed from: f */
        public long m11082f() {
            return this.f8436d.mo104999i() + this.f8438f;
        }

        /* JADX INFO: renamed from: g */
        public long m11083g(long j) {
            return (m11081e(j) + this.f8436d.mo105002l(this.f8437e, j)) - 1;
        }

        /* JADX INFO: renamed from: h */
        public long m11084h() {
            return this.f8436d.mo104998h(this.f8437e);
        }

        /* JADX INFO: renamed from: i */
        public long m11085i(long j) {
            return m11087k(j) + this.f8436d.mo104994d(j - this.f8438f, this.f8437e);
        }

        /* JADX INFO: renamed from: j */
        public long m11086j(long j) {
            return this.f8436d.mo104997g(j, this.f8437e) + this.f8438f;
        }

        /* JADX INFO: renamed from: k */
        public long m11087k(long j) {
            return this.f8436d.mo104993c(j - this.f8438f);
        }

        /* JADX INFO: renamed from: l */
        public fcc0 m11088l(long j) {
            return this.f8436d.mo105000j(j - this.f8438f);
        }

        /* JADX INFO: renamed from: m */
        public boolean m11089m(long j, long j2) {
            return this.f8436d.mo105001k() || j2 == -9223372036854775807L || m11085i(j) <= j2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.c$c */
    public static final class c extends mp2 {

        /* JADX INFO: renamed from: e */
        public final b f8439e;

        /* JADX INFO: renamed from: f */
        public final long f8440f;

        public c(b bVar, long j, long j2, long j3) {
            super(j, j2);
            this.f8439e = bVar;
            this.f8440f = j3;
        }

        @Override // p149l.gix
        /* JADX INFO: renamed from: a */
        public long mo11090a() {
            m155761c();
            return this.f8439e.m11085i(m155762d());
        }

        @Override // p149l.gix
        /* JADX INFO: renamed from: b */
        public long mo11091b() {
            m155761c();
            return this.f8439e.m11087k(m155762d());
        }
    }

    public C1948c(o35.InterfaceC18829a interfaceC18829a, urv urvVar, y2c y2cVar, rr2 rr2Var, int i, int[] iArr, o8f o8fVar, int i2, a5c a5cVar, long j, int i3, boolean z, List<C1871k> list, @Nullable C1949d.c cVar, v680 v680Var, @Nullable za5 za5Var) {
        this.f8416a = urvVar;
        this.f8426k = y2cVar;
        this.f8417b = rr2Var;
        this.f8418c = iArr;
        this.f8425j = o8fVar;
        int i4 = i2;
        this.f8419d = i4;
        this.f8420e = a5cVar;
        this.f8427l = i;
        this.f8421f = j;
        this.f8422g = i3;
        C1949d.c cVar2 = cVar;
        this.f8423h = cVar2;
        long jM212363g = y2cVar.m212363g(i);
        ArrayList<otc0> arrayListM11072n = m11072n();
        this.f8424i = new b[o8fVar.length()];
        int i5 = 0;
        while (i5 < this.f8424i.length) {
            otc0 otc0Var = arrayListM11072n.get(o8fVar.mo11302c(i5));
            pr2 pr2VarM180520j = rr2Var.m180520j(otc0Var.f145563c);
            b[] bVarArr = this.f8424i;
            pr2 pr2Var = pr2VarM180520j == null ? otc0Var.f145563c.get(0) : pr2VarM180520j;
            o35 o35VarMo162410a = interfaceC18829a.mo162410a(i4, otc0Var.f145562b, z, list, cVar2, v680Var);
            long j2 = jM212363g;
            bVarArr[i5] = new b(j2, otc0Var, pr2Var, o35VarMo162410a, 0L, otc0Var.mo165937b());
            i5++;
            cVar2 = cVar;
            jM212363g = j2;
            i4 = i2;
        }
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: a */
    public void mo11062a() throws IOException {
        IOException iOException = this.f8428m;
        if (iOException != null) {
            throw iOException;
        }
        this.f8416a.mo11027a();
    }

    @Override // com.google.android.exoplayer2.source.dash.InterfaceC1946a
    /* JADX INFO: renamed from: b */
    public void mo11033b(o8f o8fVar) {
        this.f8425j = o8fVar;
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: c */
    public boolean mo11063c(long j, n35 n35Var, List<? extends fix> list) {
        if (this.f8428m != null) {
            return false;
        }
        return this.f8425j.mo11315p(j, n35Var, list);
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: d */
    public int mo11064d(long j, List<? extends fix> list) {
        return (this.f8428m != null || this.f8425j.length() < 2) ? list.size() : this.f8425j.mo11308i(j, list);
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: e */
    public boolean mo11065e(n35 n35Var, boolean z, InterfaceC2049c.c cVar, InterfaceC2049c interfaceC2049c) {
        InterfaceC2049c.b bVarMo12119b;
        if (!z) {
            return false;
        }
        C1949d.c cVar2 = this.f8423h;
        if (cVar2 != null && cVar2.m11116j(n35Var)) {
            return true;
        }
        if (!this.f8426k.f195510d && (n35Var instanceof fix)) {
            IOException iOException = cVar.f9522c;
            if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode == 404) {
                b bVar = this.f8424i[this.f8425j.mo11317r(n35Var.f136914d)];
                long jM11084h = bVar.m11084h();
                if (jM11084h != -1 && jM11084h != 0) {
                    if (((fix) n35Var).mo121564g() > (bVar.m11082f() + jM11084h) - 1) {
                        this.f8429n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f8424i[this.f8425j.mo11317r(n35Var.f136914d)];
        pr2 pr2VarM180520j = this.f8417b.m180520j(bVar2.f8434b.f145563c);
        if (pr2VarM180520j != null && !bVar2.f8435c.equals(pr2VarM180520j)) {
            return true;
        }
        InterfaceC2049c.a aVarM11069k = m11069k(this.f8425j, bVar2.f8434b.f145563c);
        if ((aVarM11069k.m12123a(2) || aVarM11069k.m12123a(1)) && (bVarMo12119b = interfaceC2049c.mo12119b(aVarM11069k, cVar)) != null && aVarM11069k.m12123a(bVarMo12119b.f9518a)) {
            int i = bVarMo12119b.f9518a;
            if (i == 2) {
                o8f o8fVar = this.f8425j;
                return o8fVar.mo11303d(o8fVar.mo11317r(n35Var.f136914d), bVarMo12119b.f9519b);
            }
            if (i == 1) {
                this.f8417b.m180517e(bVar2.f8435c, bVarMo12119b.f9519b);
                return true;
            }
        }
        return false;
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: g */
    public long mo11066g(long j, ice0 ice0Var) {
        b[] bVarArr = this.f8424i;
        int length = bVarArr.length;
        int i = 0;
        while (i < length) {
            b bVar = bVarArr[i];
            if (bVar.f8436d != null) {
                long jM11084h = bVar.m11084h();
                if (jM11084h != 0) {
                    long jM11086j = bVar.m11086j(j);
                    long jM11087k = bVar.m11087k(jM11086j);
                    return ice0Var.m135351a(j, jM11087k, (jM11087k >= j || (jM11084h != -1 && jM11086j >= (bVar.m11082f() + jM11084h) - 1)) ? jM11087k : bVar.m11087k(jM11086j + 1));
                }
            }
            i++;
            ice0Var = ice0Var;
            j = j;
        }
        return j;
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: h */
    public void mo11067h(long j, long j2, List<? extends fix> list, p35 p35Var) {
        boolean z;
        gix[] gixVarArr;
        long j3;
        int i;
        int i2;
        C1948c c1948c;
        fix fixVar;
        C1948c c1948c2 = this;
        if (c1948c2.f8428m != null) {
            return;
        }
        long j4 = j2 - j;
        long jM197806J0 = vck0.m197806J0(c1948c2.f8426k.f195507a) + vck0.m197806J0(c1948c2.f8426k.m212360d(c1948c2.f8427l).f108037b) + j2;
        C1949d.c cVar = c1948c2.f8423h;
        if (cVar == null || !cVar.m11114h(jM197806J0)) {
            long jM197806J1 = vck0.m197806J0(vck0.m197852e0(c1948c2.f8421f));
            long jM11071m = c1948c2.m11071m(jM197806J1);
            boolean z2 = true;
            fix fixVar2 = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = c1948c2.f8425j.length();
            gix[] gixVarArr2 = new gix[length];
            int i3 = 0;
            while (i3 < length) {
                b bVar = c1948c2.f8424i[i3];
                if (bVar.f8436d == null) {
                    gixVarArr2[i3] = gix.f102980a;
                    c1948c = c1948c2;
                    fixVar = fixVar2;
                    z = z2;
                    gixVarArr = gixVarArr2;
                    j3 = j4;
                    i2 = length;
                    i = i3;
                } else {
                    gix[] gixVarArr3 = gixVarArr2;
                    long jM11081e = bVar.m11081e(jM197806J1);
                    z = z2;
                    gixVarArr = gixVarArr3;
                    fix fixVar3 = fixVar2;
                    long jM11083g = bVar.m11083g(jM197806J1);
                    j3 = j4;
                    i = i3;
                    i2 = length;
                    long jM11073o = c1948c2.m11073o(bVar, fixVar3, j2, jM11081e, jM11083g);
                    c1948c = c1948c2;
                    fixVar = fixVar3;
                    if (jM11073o < jM11081e) {
                        gixVarArr[i] = gix.f102980a;
                    } else {
                        gixVarArr[i] = new c(c1948c.m11076r(i), jM11073o, jM11083g, jM11071m);
                    }
                }
                i3 = i + 1;
                c1948c2 = c1948c;
                length = i2;
                fixVar2 = fixVar;
                gixVarArr2 = gixVarArr;
                z2 = z;
                j4 = j3;
            }
            C1948c c1948c3 = c1948c2;
            fix fixVar4 = fixVar2;
            boolean z3 = z2;
            c1948c3.f8425j.mo11306g(j, j4, c1948c3.m11070l(jM197806J1, j), list, gixVarArr2);
            b bVarM11076r = c1948c3.m11076r(c1948c3.f8425j.mo11301b());
            o35 o35Var = bVarM11076r.f8433a;
            if (o35Var != null) {
                otc0 otc0Var = bVarM11076r.f8434b;
                fcc0 fcc0VarM165939n = o35Var.mo162409e() == null ? otc0Var.m165939n() : null;
                fcc0 fcc0VarMo165938m = bVarM11076r.f8436d == null ? otc0Var.mo165938m() : null;
                if (fcc0VarM165939n != null || fcc0VarMo165938m != null) {
                    p35Var.f146960a = c1948c3.m11074p(bVarM11076r, c1948c3.f8420e, c1948c3.f8425j.mo11310k(), c1948c3.f8425j.mo11318s(), c1948c3.f8425j.mo11314o(), fcc0VarM165939n, fcc0VarMo165938m, null);
                    return;
                }
            }
            long j5 = bVarM11076r.f8437e;
            y2c y2cVar = c1948c3.f8426k;
            boolean z4 = (y2cVar.f195510d && c1948c3.f8427l == y2cVar.m212361e() + (-1)) ? z3 : false;
            boolean z5 = (z4 && j5 == -9223372036854775807L) ? false : z3;
            if (bVarM11076r.m11084h() == 0) {
                p35Var.f146961b = z5;
                return;
            }
            long jM11081e2 = bVarM11076r.m11081e(jM197806J1);
            long jM11083g2 = bVarM11076r.m11083g(jM197806J1);
            if (z4) {
                long jM11085i = bVarM11076r.m11085i(jM11083g2);
                z5 &= jM11085i + (jM11085i - bVarM11076r.m11087k(jM11083g2)) >= j5 ? z3 : false;
            }
            boolean z6 = z5;
            long jM11073o2 = c1948c3.m11073o(bVarM11076r, fixVar4, j2, jM11081e2, jM11083g2);
            if (jM11073o2 < jM11081e2) {
                c1948c3.f8428m = new BehindLiveWindowException();
                return;
            }
            if (jM11073o2 > jM11083g2 || (c1948c3.f8429n && jM11073o2 >= jM11083g2)) {
                p35Var.f146961b = z6;
                return;
            }
            if (z6 && bVarM11076r.m11087k(jM11073o2) >= j5) {
                p35Var.f146961b = z3;
                return;
            }
            int iMin = (int) Math.min(c1948c3.f8422g, (jM11083g2 - jM11073o2) + 1);
            if (j5 != -9223372036854775807L) {
                while (iMin > 1 && bVarM11076r.m11087k((((long) iMin) + jM11073o2) - 1) >= j5) {
                    iMin--;
                }
            }
            p35Var.f146960a = c1948c3.m11075q(bVarM11076r, c1948c3.f8420e, c1948c3.f8419d, c1948c3.f8425j.mo11310k(), c1948c3.f8425j.mo11318s(), c1948c3.f8425j.mo11314o(), jM11073o2, iMin, list.isEmpty() ? j2 : -9223372036854775807L, jM11071m, null);
        }
    }

    @Override // com.google.android.exoplayer2.source.dash.InterfaceC1946a
    /* JADX INFO: renamed from: i */
    public void mo11034i(y2c y2cVar, int i) {
        try {
            this.f8426k = y2cVar;
            this.f8427l = i;
            long jM212363g = y2cVar.m212363g(i);
            ArrayList<otc0> arrayListM11072n = m11072n();
            for (int i2 = 0; i2 < this.f8424i.length; i2++) {
                otc0 otc0Var = arrayListM11072n.get(this.f8425j.mo11302c(i2));
                b[] bVarArr = this.f8424i;
                bVarArr[i2] = bVarArr[i2].m11078b(jM212363g, otc0Var);
            }
        } catch (BehindLiveWindowException e) {
            this.f8428m = e;
        }
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: j */
    public void mo11068j(n35 n35Var) {
        q35 q35VarMo162408d;
        if (n35Var instanceof esm) {
            int iMo11317r = this.f8425j.mo11317r(((esm) n35Var).f136914d);
            b bVar = this.f8424i[iMo11317r];
            if (bVar.f8436d == null && (q35VarMo162408d = bVar.f8433a.mo162408d()) != null) {
                this.f8424i[iMo11317r] = bVar.m11079c(new e3c(q35VarMo162408d, bVar.f8434b.f145564d));
            }
        }
        C1949d.c cVar = this.f8423h;
        if (cVar != null) {
            cVar.m11115i(n35Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC2049c.a m11069k(o8f o8fVar, List<pr2> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = o8fVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (o8fVar.mo11300a(i2, jElapsedRealtime)) {
                i++;
            }
        }
        int iM180514f = rr2.m180514f(list);
        return new InterfaceC2049c.a(iM180514f, iM180514f - this.f8417b.m180518g(list), length, i);
    }

    /* JADX INFO: renamed from: l */
    public final long m11070l(long j, long j2) {
        if (!this.f8426k.f195510d || this.f8424i[0].m11084h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m11071m(j), this.f8424i[0].m11085i(this.f8424i[0].m11083g(j))) - j2);
    }

    /* JADX INFO: renamed from: m */
    public final long m11071m(long j) {
        y2c y2cVar = this.f8426k;
        long j2 = y2cVar.f195507a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - vck0.m197806J0(j2 + y2cVar.m212360d(this.f8427l).f108037b);
    }

    /* JADX INFO: renamed from: n */
    public final ArrayList<otc0> m11072n() {
        List<c80> list = this.f8426k.m212360d(this.f8427l).f108038c;
        ArrayList<otc0> arrayList = new ArrayList<>();
        for (int i : this.f8418c) {
            arrayList.addAll(list.get(i).f79672c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final long m11073o(b bVar, @Nullable fix fixVar, long j, long j2, long j3) {
        return fixVar != null ? fixVar.mo121564g() : vck0.m197886r(bVar.m11086j(j), j2, j3);
    }

    /* JADX INFO: renamed from: p */
    public n35 m11074p(b bVar, a5c a5cVar, C1871k c1871k, int i, @Nullable Object obj, @Nullable fcc0 fcc0Var, @Nullable fcc0 fcc0Var2, @Nullable ab5 ab5Var) {
        fcc0 fcc0Var3 = fcc0Var;
        otc0 otc0Var = bVar.f8434b;
        if (fcc0Var3 != null) {
            fcc0 fcc0VarM120421a = fcc0Var3.m120421a(fcc0Var2, bVar.f8435c.f150850a);
            if (fcc0VarM120421a != null) {
                fcc0Var3 = fcc0VarM120421a;
            }
        } else {
            fcc0Var3 = fcc0Var2;
        }
        return new esm(a5cVar, d3c.m109903a(otc0Var, bVar.f8435c.f150850a, fcc0Var3, 0, ImmutableMap.m15715of()), c1871k, i, obj, bVar.f8433a);
    }

    /* JADX INFO: renamed from: q */
    public n35 m11075q(b bVar, a5c a5cVar, int i, C1871k c1871k, int i2, Object obj, long j, int i3, long j2, long j3, @Nullable ab5 ab5Var) {
        otc0 otc0Var = bVar.f8434b;
        long jM11087k = bVar.m11087k(j);
        fcc0 fcc0VarM11088l = bVar.m11088l(j);
        if (bVar.f8433a == null) {
            int i4 = 8;
            long jM11085i = bVar.m11085i(j);
            if (bVar.m11089m(j, j3)) {
                i4 = 0;
            }
            return new dif0(a5cVar, d3c.m109903a(otc0Var, bVar.f8435c.f150850a, fcc0VarM11088l, i4, ImmutableMap.m15715of()), c1871k, i2, obj, jM11087k, jM11085i, j, i, c1871k);
        }
        int i5 = 8;
        int i6 = 1;
        int i7 = 1;
        while (i6 < i3) {
            fcc0 fcc0VarM120421a = fcc0VarM11088l.m120421a(bVar.m11088l(j + ((long) i6)), bVar.f8435c.f150850a);
            if (fcc0VarM120421a == null) {
                break;
            }
            i7++;
            i6++;
            fcc0VarM11088l = fcc0VarM120421a;
        }
        long j4 = (j + ((long) i7)) - 1;
        int i8 = i7;
        long jM11085i2 = bVar.m11085i(j4);
        long j5 = bVar.f8437e;
        if (j5 == -9223372036854775807L || j5 > jM11085i2) {
            j5 = -9223372036854775807L;
        }
        if (bVar.m11089m(j4, j3)) {
            i5 = 0;
        }
        return new q06(a5cVar, d3c.m109903a(otc0Var, bVar.f8435c.f150850a, fcc0VarM11088l, i5, ImmutableMap.m15715of()), c1871k, i2, obj, jM11087k, jM11085i2, j2, j5, j, i8, -otc0Var.f145564d, bVar.f8433a);
    }

    /* JADX INFO: renamed from: r */
    public final b m11076r(int i) {
        b bVar = this.f8424i[i];
        pr2 pr2VarM180520j = this.f8417b.m180520j(bVar.f8434b.f145563c);
        if (pr2VarM180520j == null || pr2VarM180520j.equals(bVar.f8435c)) {
            return bVar;
        }
        b bVarM11080d = bVar.m11080d(pr2VarM180520j);
        this.f8424i[i] = bVarM11080d;
        return bVarM11080d;
    }

    @Override // p149l.t35
    public void release() {
        for (b bVar : this.f8424i) {
            o35 o35Var = bVar.f8433a;
            if (o35Var != null) {
                o35Var.release();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.c$a */
    public static final class a implements InterfaceC1946a.a {

        /* JADX INFO: renamed from: a */
        public final a5c.InterfaceC15531a f8430a;

        /* JADX INFO: renamed from: b */
        public final int f8431b;

        /* JADX INFO: renamed from: c */
        public final o35.InterfaceC18829a f8432c;

        public a(o35.InterfaceC18829a interfaceC18829a, a5c.InterfaceC15531a interfaceC15531a, int i) {
            this.f8432c = interfaceC18829a;
            this.f8430a = interfaceC15531a;
            this.f8431b = i;
        }

        @Override // com.google.android.exoplayer2.source.dash.InterfaceC1946a.a
        /* JADX INFO: renamed from: a */
        public InterfaceC1946a mo11035a(urv urvVar, y2c y2cVar, rr2 rr2Var, int i, int[] iArr, o8f o8fVar, int i2, long j, boolean z, List<C1871k> list, @Nullable C1949d.c cVar, @Nullable l7j0 l7j0Var, v680 v680Var, @Nullable za5 za5Var) {
            a5c a5cVarMo95019a = this.f8430a.mo95019a();
            if (l7j0Var != null) {
                a5cVarMo95019a.mo11123e(l7j0Var);
            }
            return new C1948c(this.f8432c, urvVar, y2cVar, rr2Var, i, iArr, o8fVar, i2, a5cVarMo95019a, j, this.f8431b, z, list, cVar, v680Var, za5Var);
        }

        public a(a5c.InterfaceC15531a interfaceC15531a, int i) {
            this(qi3.f154648j, interfaceC15531a, i);
        }

        public a(a5c.InterfaceC15531a interfaceC15531a) {
            this(interfaceC15531a, 1);
        }
    }
}
