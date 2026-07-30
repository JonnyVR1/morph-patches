package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p153l.ac5;
import p153l.bf80;
import p153l.bmk0;
import p153l.crx;
import p153l.dq2;
import p153l.drx;
import p153l.ej3;
import p153l.fs2;
import p153l.g6c;
import p153l.gum;
import p153l.h4c;
import p153l.hs2;
import p153l.l4c;
import p153l.m4c;
import p153l.mkc0;
import p153l.mqf0;
import p153l.n4c;
import p153l.nke0;
import p153l.o45;
import p153l.p45;
import p153l.pgj0;
import p153l.q45;
import p153l.r45;
import p153l.t1d0;
import p153l.u9f;
import p153l.v16;
import p153l.vtv;
import p153l.y70;
import p153l.zb5;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C1971c implements InterfaceC1969a {

    /* JADX INFO: renamed from: a */
    public final vtv f8453a;

    /* JADX INFO: renamed from: b */
    public final hs2 f8454b;

    /* JADX INFO: renamed from: c */
    public final int[] f8455c;

    /* JADX INFO: renamed from: d */
    public final int f8456d;

    /* JADX INFO: renamed from: e */
    public final g6c f8457e;

    /* JADX INFO: renamed from: f */
    public final long f8458f;

    /* JADX INFO: renamed from: g */
    public final int f8459g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final C1972d.c f8460h;

    /* JADX INFO: renamed from: i */
    public final b[] f8461i;

    /* JADX INFO: renamed from: j */
    public u9f f8462j;

    /* JADX INFO: renamed from: k */
    public h4c f8463k;

    /* JADX INFO: renamed from: l */
    public int f8464l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public IOException f8465m;

    /* JADX INFO: renamed from: n */
    public boolean f8466n;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final p45 f8470a;

        /* JADX INFO: renamed from: b */
        public final t1d0 f8471b;

        /* JADX INFO: renamed from: c */
        public final fs2 f8472c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final l4c f8473d;

        /* JADX INFO: renamed from: e */
        public final long f8474e;

        /* JADX INFO: renamed from: f */
        public final long f8475f;

        public b(long j, t1d0 t1d0Var, fs2 fs2Var, @Nullable p45 p45Var, long j2, @Nullable l4c l4cVar) {
            this.f8474e = j;
            this.f8471b = t1d0Var;
            this.f8472c = fs2Var;
            this.f8475f = j2;
            this.f8470a = p45Var;
            this.f8473d = l4cVar;
        }

        @CheckResult
        /* JADX INFO: renamed from: b */
        public b m11132b(long j, t1d0 t1d0Var) throws BehindLiveWindowException {
            long jMo152755g;
            long jMo152755g2;
            l4c l4cVarMo188900b = this.f8471b.mo188900b();
            l4c l4cVarMo188900b2 = t1d0Var.mo188900b();
            if (l4cVarMo188900b == null) {
                return new b(j, t1d0Var, this.f8472c, this.f8470a, this.f8475f, l4cVarMo188900b);
            }
            if (!l4cVarMo188900b.mo152759k()) {
                return new b(j, t1d0Var, this.f8472c, this.f8470a, this.f8475f, l4cVarMo188900b2);
            }
            long jMo152756h = l4cVarMo188900b.mo152756h(j);
            if (jMo152756h == 0) {
                return new b(j, t1d0Var, this.f8472c, this.f8470a, this.f8475f, l4cVarMo188900b2);
            }
            long jMo152757i = l4cVarMo188900b.mo152757i();
            long jMo152751c = l4cVarMo188900b.mo152751c(jMo152757i);
            long j2 = jMo152756h + jMo152757i;
            long j3 = j2 - 1;
            long jMo152751c2 = l4cVarMo188900b.mo152751c(j3) + l4cVarMo188900b.mo152752d(j3, j);
            long jMo152757i2 = l4cVarMo188900b2.mo152757i();
            long jMo152751c3 = l4cVarMo188900b2.mo152751c(jMo152757i2);
            long j4 = this.f8475f;
            if (jMo152751c2 != jMo152751c3) {
                if (jMo152751c2 < jMo152751c3) {
                    throw new BehindLiveWindowException();
                }
                if (jMo152751c3 < jMo152751c) {
                    jMo152755g2 = j4 - (l4cVarMo188900b2.mo152755g(jMo152751c, j) - jMo152757i);
                } else {
                    jMo152755g = l4cVarMo188900b.mo152755g(jMo152751c3, j) - jMo152757i2;
                }
                return new b(j, t1d0Var, this.f8472c, this.f8470a, jMo152755g2, l4cVarMo188900b2);
            }
            jMo152755g = j2 - jMo152757i2;
            jMo152755g2 = j4 + jMo152755g;
            return new b(j, t1d0Var, this.f8472c, this.f8470a, jMo152755g2, l4cVarMo188900b2);
        }

        @CheckResult
        /* JADX INFO: renamed from: c */
        public b m11133c(l4c l4cVar) {
            return new b(this.f8474e, this.f8471b, this.f8472c, this.f8470a, this.f8475f, l4cVar);
        }

        @CheckResult
        /* JADX INFO: renamed from: d */
        public b m11134d(fs2 fs2Var) {
            return new b(this.f8474e, this.f8471b, fs2Var, this.f8470a, this.f8475f, this.f8473d);
        }

        /* JADX INFO: renamed from: e */
        public long m11135e(long j) {
            return this.f8473d.mo152753e(this.f8474e, j) + this.f8475f;
        }

        /* JADX INFO: renamed from: f */
        public long m11136f() {
            return this.f8473d.mo152757i() + this.f8475f;
        }

        /* JADX INFO: renamed from: g */
        public long m11137g(long j) {
            return (m11135e(j) + this.f8473d.mo152760l(this.f8474e, j)) - 1;
        }

        /* JADX INFO: renamed from: h */
        public long m11138h() {
            return this.f8473d.mo152756h(this.f8474e);
        }

        /* JADX INFO: renamed from: i */
        public long m11139i(long j) {
            return m11141k(j) + this.f8473d.mo152752d(j - this.f8475f, this.f8474e);
        }

        /* JADX INFO: renamed from: j */
        public long m11140j(long j) {
            return this.f8473d.mo152755g(j, this.f8474e) + this.f8475f;
        }

        /* JADX INFO: renamed from: k */
        public long m11141k(long j) {
            return this.f8473d.mo152751c(j - this.f8475f);
        }

        /* JADX INFO: renamed from: l */
        public mkc0 m11142l(long j) {
            return this.f8473d.mo152758j(j - this.f8475f);
        }

        /* JADX INFO: renamed from: m */
        public boolean m11143m(long j, long j2) {
            return this.f8473d.mo152759k() || j2 == -9223372036854775807L || m11139i(j) <= j2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.c$c */
    public static final class c extends dq2 {

        /* JADX INFO: renamed from: e */
        public final b f8476e;

        /* JADX INFO: renamed from: f */
        public final long f8477f;

        public c(b bVar, long j, long j2, long j3) {
            super(j, j2);
            this.f8476e = bVar;
            this.f8477f = j3;
        }

        @Override // p153l.drx
        /* JADX INFO: renamed from: a */
        public long mo11144a() {
            m117440c();
            return this.f8476e.m11139i(m117441d());
        }

        @Override // p153l.drx
        /* JADX INFO: renamed from: b */
        public long mo11145b() {
            m117440c();
            return this.f8476e.m11141k(m117441d());
        }
    }

    public C1971c(p45.InterfaceC19291a interfaceC19291a, vtv vtvVar, h4c h4cVar, hs2 hs2Var, int i, int[] iArr, u9f u9fVar, int i2, g6c g6cVar, long j, int i3, boolean z, List<C1894k> list, @Nullable C1972d.c cVar, bf80 bf80Var, @Nullable zb5 zb5Var) {
        this.f8453a = vtvVar;
        this.f8463k = h4cVar;
        this.f8454b = hs2Var;
        this.f8455c = iArr;
        this.f8462j = u9fVar;
        int i4 = i2;
        this.f8456d = i4;
        this.f8457e = g6cVar;
        this.f8464l = i;
        this.f8458f = j;
        this.f8459g = i3;
        C1972d.c cVar2 = cVar;
        this.f8460h = cVar2;
        long jM133560g = h4cVar.m133560g(i);
        ArrayList<t1d0> arrayListM11126n = m11126n();
        this.f8461i = new b[u9fVar.length()];
        int i5 = 0;
        while (i5 < this.f8461i.length) {
            t1d0 t1d0Var = arrayListM11126n.get(u9fVar.mo11356c(i5));
            fs2 fs2VarM136946j = hs2Var.m136946j(t1d0Var.f171646c);
            b[] bVarArr = this.f8461i;
            fs2 fs2Var = fs2VarM136946j == null ? t1d0Var.f171646c.get(0) : fs2VarM136946j;
            p45 p45VarMo116023a = interfaceC19291a.mo116023a(i4, t1d0Var.f171645b, z, list, cVar2, bf80Var);
            long j2 = jM133560g;
            bVarArr[i5] = new b(j2, t1d0Var, fs2Var, p45VarMo116023a, 0L, t1d0Var.mo188900b());
            i5++;
            cVar2 = cVar;
            jM133560g = j2;
            i4 = i2;
        }
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: a */
    public void mo11116a() throws IOException {
        IOException iOException = this.f8465m;
        if (iOException != null) {
            throw iOException;
        }
        this.f8453a.mo11081a();
    }

    @Override // com.google.android.exoplayer2.source.dash.InterfaceC1969a
    /* JADX INFO: renamed from: b */
    public void mo11087b(u9f u9fVar) {
        this.f8462j = u9fVar;
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: c */
    public boolean mo11117c(long j, o45 o45Var, List<? extends crx> list) {
        if (this.f8465m != null) {
            return false;
        }
        return this.f8462j.mo11369p(j, o45Var, list);
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: d */
    public int mo11118d(long j, List<? extends crx> list) {
        return (this.f8465m != null || this.f8462j.length() < 2) ? list.size() : this.f8462j.mo11362i(j, list);
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: e */
    public boolean mo11119e(o45 o45Var, boolean z, InterfaceC2072c.c cVar, InterfaceC2072c interfaceC2072c) {
        InterfaceC2072c.b bVarMo12173b;
        if (!z) {
            return false;
        }
        C1972d.c cVar2 = this.f8460h;
        if (cVar2 != null && cVar2.m11170j(o45Var)) {
            return true;
        }
        if (!this.f8463k.f107779d && (o45Var instanceof crx)) {
            IOException iOException = cVar.f9559c;
            if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode == 404) {
                b bVar = this.f8461i[this.f8462j.mo11371r(o45Var.f144929d)];
                long jM11138h = bVar.m11138h();
                if (jM11138h != -1 && jM11138h != 0) {
                    if (((crx) o45Var).mo112089g() > (bVar.m11136f() + jM11138h) - 1) {
                        this.f8466n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f8461i[this.f8462j.mo11371r(o45Var.f144929d)];
        fs2 fs2VarM136946j = this.f8454b.m136946j(bVar2.f8471b.f171646c);
        if (fs2VarM136946j != null && !bVar2.f8472c.equals(fs2VarM136946j)) {
            return true;
        }
        InterfaceC2072c.a aVarM11123k = m11123k(this.f8462j, bVar2.f8471b.f171646c);
        if ((aVarM11123k.m12177a(2) || aVarM11123k.m12177a(1)) && (bVarMo12173b = interfaceC2072c.mo12173b(aVarM11123k, cVar)) != null && aVarM11123k.m12177a(bVarMo12173b.f9555a)) {
            int i = bVarMo12173b.f9555a;
            if (i == 2) {
                u9f u9fVar = this.f8462j;
                return u9fVar.mo11357d(u9fVar.mo11371r(o45Var.f144929d), bVarMo12173b.f9556b);
            }
            if (i == 1) {
                this.f8454b.m136943e(bVar2.f8472c, bVarMo12173b.f9556b);
                return true;
            }
        }
        return false;
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: g */
    public long mo11120g(long j, nke0 nke0Var) {
        b[] bVarArr = this.f8461i;
        int length = bVarArr.length;
        int i = 0;
        while (i < length) {
            b bVar = bVarArr[i];
            if (bVar.f8473d != null) {
                long jM11138h = bVar.m11138h();
                if (jM11138h != 0) {
                    long jM11140j = bVar.m11140j(j);
                    long jM11141k = bVar.m11141k(jM11140j);
                    return nke0Var.m163601a(j, jM11141k, (jM11141k >= j || (jM11138h != -1 && jM11140j >= (bVar.m11136f() + jM11138h) - 1)) ? jM11141k : bVar.m11141k(jM11140j + 1));
                }
            }
            i++;
            nke0Var = nke0Var;
            j = j;
        }
        return j;
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: h */
    public void mo11121h(long j, long j2, List<? extends crx> list, q45 q45Var) {
        boolean z;
        drx[] drxVarArr;
        long j3;
        int i;
        int i2;
        C1971c c1971c;
        crx crxVar;
        C1971c c1971c2 = this;
        if (c1971c2.f8465m != null) {
            return;
        }
        long j4 = j2 - j;
        long jM105084J0 = bmk0.m105084J0(c1971c2.f8463k.f107776a) + bmk0.m105084J0(c1971c2.f8463k.m133557d(c1971c2.f8464l).f138301b) + j2;
        C1972d.c cVar = c1971c2.f8460h;
        if (cVar == null || !cVar.m11168h(jM105084J0)) {
            long jM105084J1 = bmk0.m105084J0(bmk0.m105130e0(c1971c2.f8458f));
            long jM11125m = c1971c2.m11125m(jM105084J1);
            boolean z2 = true;
            crx crxVar2 = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = c1971c2.f8462j.length();
            drx[] drxVarArr2 = new drx[length];
            int i3 = 0;
            while (i3 < length) {
                b bVar = c1971c2.f8461i[i3];
                if (bVar.f8473d == null) {
                    drxVarArr2[i3] = drx.f90441a;
                    c1971c = c1971c2;
                    crxVar = crxVar2;
                    z = z2;
                    drxVarArr = drxVarArr2;
                    j3 = j4;
                    i2 = length;
                    i = i3;
                } else {
                    drx[] drxVarArr3 = drxVarArr2;
                    long jM11135e = bVar.m11135e(jM105084J1);
                    z = z2;
                    drxVarArr = drxVarArr3;
                    crx crxVar3 = crxVar2;
                    long jM11137g = bVar.m11137g(jM105084J1);
                    j3 = j4;
                    i = i3;
                    i2 = length;
                    long jM11127o = c1971c2.m11127o(bVar, crxVar3, j2, jM11135e, jM11137g);
                    c1971c = c1971c2;
                    crxVar = crxVar3;
                    if (jM11127o < jM11135e) {
                        drxVarArr[i] = drx.f90441a;
                    } else {
                        drxVarArr[i] = new c(c1971c.m11130r(i), jM11127o, jM11137g, jM11125m);
                    }
                }
                i3 = i + 1;
                c1971c2 = c1971c;
                length = i2;
                crxVar2 = crxVar;
                drxVarArr2 = drxVarArr;
                z2 = z;
                j4 = j3;
            }
            C1971c c1971c3 = c1971c2;
            crx crxVar4 = crxVar2;
            boolean z3 = z2;
            c1971c3.f8462j.mo11360g(j, j4, c1971c3.m11124l(jM105084J1, j), list, drxVarArr2);
            b bVarM11130r = c1971c3.m11130r(c1971c3.f8462j.mo11355b());
            p45 p45Var = bVarM11130r.f8470a;
            if (p45Var != null) {
                t1d0 t1d0Var = bVarM11130r.f8471b;
                mkc0 mkc0VarM188902n = p45Var.mo120973e() == null ? t1d0Var.m188902n() : null;
                mkc0 mkc0VarMo188901m = bVarM11130r.f8473d == null ? t1d0Var.mo188901m() : null;
                if (mkc0VarM188902n != null || mkc0VarMo188901m != null) {
                    q45Var.f155520a = c1971c3.m11128p(bVarM11130r, c1971c3.f8457e, c1971c3.f8462j.mo11364k(), c1971c3.f8462j.mo11372s(), c1971c3.f8462j.mo11368o(), mkc0VarM188902n, mkc0VarMo188901m, null);
                    return;
                }
            }
            long j5 = bVarM11130r.f8474e;
            h4c h4cVar = c1971c3.f8463k;
            boolean z4 = (h4cVar.f107779d && c1971c3.f8464l == h4cVar.m133558e() + (-1)) ? z3 : false;
            boolean z5 = (z4 && j5 == -9223372036854775807L) ? false : z3;
            if (bVarM11130r.m11138h() == 0) {
                q45Var.f155521b = z5;
                return;
            }
            long jM11135e2 = bVarM11130r.m11135e(jM105084J1);
            long jM11137g2 = bVarM11130r.m11137g(jM105084J1);
            if (z4) {
                long jM11139i = bVarM11130r.m11139i(jM11137g2);
                z5 &= jM11139i + (jM11139i - bVarM11130r.m11141k(jM11137g2)) >= j5 ? z3 : false;
            }
            boolean z6 = z5;
            long jM11127o2 = c1971c3.m11127o(bVarM11130r, crxVar4, j2, jM11135e2, jM11137g2);
            if (jM11127o2 < jM11135e2) {
                c1971c3.f8465m = new BehindLiveWindowException();
                return;
            }
            if (jM11127o2 > jM11137g2 || (c1971c3.f8466n && jM11127o2 >= jM11137g2)) {
                q45Var.f155521b = z6;
                return;
            }
            if (z6 && bVarM11130r.m11141k(jM11127o2) >= j5) {
                q45Var.f155521b = z3;
                return;
            }
            int iMin = (int) Math.min(c1971c3.f8459g, (jM11137g2 - jM11127o2) + 1);
            if (j5 != -9223372036854775807L) {
                while (iMin > 1 && bVarM11130r.m11141k((((long) iMin) + jM11127o2) - 1) >= j5) {
                    iMin--;
                }
            }
            q45Var.f155520a = c1971c3.m11129q(bVarM11130r, c1971c3.f8457e, c1971c3.f8456d, c1971c3.f8462j.mo11364k(), c1971c3.f8462j.mo11372s(), c1971c3.f8462j.mo11368o(), jM11127o2, iMin, list.isEmpty() ? j2 : -9223372036854775807L, jM11125m, null);
        }
    }

    @Override // com.google.android.exoplayer2.source.dash.InterfaceC1969a
    /* JADX INFO: renamed from: i */
    public void mo11088i(h4c h4cVar, int i) {
        try {
            this.f8463k = h4cVar;
            this.f8464l = i;
            long jM133560g = h4cVar.m133560g(i);
            ArrayList<t1d0> arrayListM11126n = m11126n();
            for (int i2 = 0; i2 < this.f8461i.length; i2++) {
                t1d0 t1d0Var = arrayListM11126n.get(this.f8462j.mo11356c(i2));
                b[] bVarArr = this.f8461i;
                bVarArr[i2] = bVarArr[i2].m11132b(jM133560g, t1d0Var);
            }
        } catch (BehindLiveWindowException e) {
            this.f8465m = e;
        }
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: j */
    public void mo11122j(o45 o45Var) {
        r45 r45VarMo120972d;
        if (o45Var instanceof gum) {
            int iMo11371r = this.f8462j.mo11371r(((gum) o45Var).f144929d);
            b bVar = this.f8461i[iMo11371r];
            if (bVar.f8473d == null && (r45VarMo120972d = bVar.f8470a.mo120972d()) != null) {
                this.f8461i[iMo11371r] = bVar.m11133c(new n4c(r45VarMo120972d, bVar.f8471b.f171647d));
            }
        }
        C1972d.c cVar = this.f8460h;
        if (cVar != null) {
            cVar.m11169i(o45Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC2072c.a m11123k(u9f u9fVar, List<fs2> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = u9fVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (u9fVar.mo11354a(i2, jElapsedRealtime)) {
                i++;
            }
        }
        int iM136940f = hs2.m136940f(list);
        return new InterfaceC2072c.a(iM136940f, iM136940f - this.f8454b.m136944g(list), length, i);
    }

    /* JADX INFO: renamed from: l */
    public final long m11124l(long j, long j2) {
        if (!this.f8463k.f107779d || this.f8461i[0].m11138h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m11125m(j), this.f8461i[0].m11139i(this.f8461i[0].m11137g(j))) - j2);
    }

    /* JADX INFO: renamed from: m */
    public final long m11125m(long j) {
        h4c h4cVar = this.f8463k;
        long j2 = h4cVar.f107776a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - bmk0.m105084J0(j2 + h4cVar.m133557d(this.f8464l).f138301b);
    }

    /* JADX INFO: renamed from: n */
    public final ArrayList<t1d0> m11126n() {
        List<y70> list = this.f8463k.m133557d(this.f8464l).f138302c;
        ArrayList<t1d0> arrayList = new ArrayList<>();
        for (int i : this.f8455c) {
            arrayList.addAll(list.get(i).f197729c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final long m11127o(b bVar, @Nullable crx crxVar, long j, long j2, long j3) {
        return crxVar != null ? crxVar.mo112089g() : bmk0.m105164r(bVar.m11140j(j), j2, j3);
    }

    /* JADX INFO: renamed from: p */
    public o45 m11128p(b bVar, g6c g6cVar, C1894k c1894k, int i, @Nullable Object obj, @Nullable mkc0 mkc0Var, @Nullable mkc0 mkc0Var2, @Nullable ac5 ac5Var) {
        mkc0 mkc0Var3 = mkc0Var;
        t1d0 t1d0Var = bVar.f8471b;
        if (mkc0Var3 != null) {
            mkc0 mkc0VarM158752a = mkc0Var3.m158752a(mkc0Var2, bVar.f8472c.f100517a);
            if (mkc0VarM158752a != null) {
                mkc0Var3 = mkc0VarM158752a;
            }
        } else {
            mkc0Var3 = mkc0Var2;
        }
        return new gum(g6cVar, m4c.m156995a(t1d0Var, bVar.f8472c.f100517a, mkc0Var3, 0, ImmutableMap.m15769of()), c1894k, i, obj, bVar.f8470a);
    }

    /* JADX INFO: renamed from: q */
    public o45 m11129q(b bVar, g6c g6cVar, int i, C1894k c1894k, int i2, Object obj, long j, int i3, long j2, long j3, @Nullable ac5 ac5Var) {
        t1d0 t1d0Var = bVar.f8471b;
        long jM11141k = bVar.m11141k(j);
        mkc0 mkc0VarM11142l = bVar.m11142l(j);
        if (bVar.f8470a == null) {
            int i4 = 8;
            long jM11139i = bVar.m11139i(j);
            if (bVar.m11143m(j, j3)) {
                i4 = 0;
            }
            return new mqf0(g6cVar, m4c.m156995a(t1d0Var, bVar.f8472c.f100517a, mkc0VarM11142l, i4, ImmutableMap.m15769of()), c1894k, i2, obj, jM11141k, jM11139i, j, i, c1894k);
        }
        int i5 = 8;
        int i6 = 1;
        int i7 = 1;
        while (i6 < i3) {
            mkc0 mkc0VarM158752a = mkc0VarM11142l.m158752a(bVar.m11142l(j + ((long) i6)), bVar.f8472c.f100517a);
            if (mkc0VarM158752a == null) {
                break;
            }
            i7++;
            i6++;
            mkc0VarM11142l = mkc0VarM158752a;
        }
        long j4 = (j + ((long) i7)) - 1;
        int i8 = i7;
        long jM11139i2 = bVar.m11139i(j4);
        long j5 = bVar.f8474e;
        if (j5 == -9223372036854775807L || j5 > jM11139i2) {
            j5 = -9223372036854775807L;
        }
        if (bVar.m11143m(j4, j3)) {
            i5 = 0;
        }
        return new v16(g6cVar, m4c.m156995a(t1d0Var, bVar.f8472c.f100517a, mkc0VarM11142l, i5, ImmutableMap.m15769of()), c1894k, i2, obj, jM11141k, jM11139i2, j2, j5, j, i8, -t1d0Var.f171647d, bVar.f8470a);
    }

    /* JADX INFO: renamed from: r */
    public final b m11130r(int i) {
        b bVar = this.f8461i[i];
        fs2 fs2VarM136946j = this.f8454b.m136946j(bVar.f8471b.f171646c);
        if (fs2VarM136946j == null || fs2VarM136946j.equals(bVar.f8472c)) {
            return bVar;
        }
        b bVarM11134d = bVar.m11134d(fs2VarM136946j);
        this.f8461i[i] = bVarM11134d;
        return bVarM11134d;
    }

    @Override // p153l.u45
    public void release() {
        for (b bVar : this.f8461i) {
            p45 p45Var = bVar.f8470a;
            if (p45Var != null) {
                p45Var.release();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.c$a */
    public static final class a implements InterfaceC1969a.a {

        /* JADX INFO: renamed from: a */
        public final g6c.InterfaceC17163a f8467a;

        /* JADX INFO: renamed from: b */
        public final int f8468b;

        /* JADX INFO: renamed from: c */
        public final p45.InterfaceC19291a f8469c;

        public a(p45.InterfaceC19291a interfaceC19291a, g6c.InterfaceC17163a interfaceC17163a, int i) {
            this.f8469c = interfaceC19291a;
            this.f8467a = interfaceC17163a;
            this.f8468b = i;
        }

        @Override // com.google.android.exoplayer2.source.dash.InterfaceC1969a.a
        /* JADX INFO: renamed from: a */
        public InterfaceC1969a mo11089a(vtv vtvVar, h4c h4cVar, hs2 hs2Var, int i, int[] iArr, u9f u9fVar, int i2, long j, boolean z, List<C1894k> list, @Nullable C1972d.c cVar, @Nullable pgj0 pgj0Var, bf80 bf80Var, @Nullable zb5 zb5Var) {
            g6c g6cVarMo129219a = this.f8467a.mo129219a();
            if (pgj0Var != null) {
                g6cVarMo129219a.mo11177e(pgj0Var);
            }
            return new C1971c(this.f8469c, vtvVar, h4cVar, hs2Var, i, iArr, u9fVar, i2, g6cVarMo129219a, j, this.f8468b, z, list, cVar, bf80Var, zb5Var);
        }

        public a(g6c.InterfaceC17163a interfaceC17163a, int i) {
            this(ej3.f94248j, interfaceC17163a, i);
        }

        public a(g6c.InterfaceC17163a interfaceC17163a) {
            this(interfaceC17163a, 1);
        }
    }
}
