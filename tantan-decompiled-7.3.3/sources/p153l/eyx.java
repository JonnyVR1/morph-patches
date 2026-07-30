package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1951q;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2090y;
import com.google.android.exoplayer2.source.C1958b;
import com.google.android.exoplayer2.source.InterfaceC1976h;
import com.google.android.exoplayer2.source.InterfaceC1988i;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class eyx {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1976h f96522a;

    /* JADX INFO: renamed from: b */
    public final Object f96523b;

    /* JADX INFO: renamed from: c */
    public final xwd0[] f96524c;

    /* JADX INFO: renamed from: d */
    public boolean f96525d;

    /* JADX INFO: renamed from: e */
    public boolean f96526e;

    /* JADX INFO: renamed from: f */
    public gyx f96527f;

    /* JADX INFO: renamed from: g */
    public boolean f96528g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f96529h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2090y[] f96530i;

    /* JADX INFO: renamed from: j */
    public final cgj0 f96531j;

    /* JADX INFO: renamed from: k */
    public final C1951q f96532k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public eyx f96533l;

    /* JADX INFO: renamed from: m */
    public ffj0 f96534m;

    /* JADX INFO: renamed from: n */
    public dgj0 f96535n;

    /* JADX INFO: renamed from: o */
    public long f96536o;

    public eyx(InterfaceC2090y[] interfaceC2090yArr, long j, cgj0 cgj0Var, oj0 oj0Var, C1951q c1951q, gyx gyxVar, dgj0 dgj0Var) {
        this.f96530i = interfaceC2090yArr;
        this.f96536o = j;
        this.f96531j = cgj0Var;
        this.f96532k = c1951q;
        InterfaceC1988i.b bVar = gyxVar.f107120a;
        this.f96523b = bVar.f101422a;
        this.f96527f = gyxVar;
        this.f96534m = ffj0.f98782d;
        this.f96535n = dgj0Var;
        this.f96524c = new xwd0[interfaceC2090yArr.length];
        this.f96529h = new boolean[interfaceC2090yArr.length];
        this.f96522a = m123273e(bVar, c1951q, oj0Var, gyxVar.f107121b, gyxVar.f107123d);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC1976h m123273e(InterfaceC1988i.b bVar, C1951q c1951q, oj0 oj0Var, long j, long j2) {
        InterfaceC1976h interfaceC1976hM10914h = c1951q.m10914h(bVar, oj0Var, j);
        return j2 != -9223372036854775807L ? new C1958b(interfaceC1976hM10914h, true, 0L, j2) : interfaceC1976hM10914h;
    }

    /* JADX INFO: renamed from: u */
    public static void m123274u(C1951q c1951q, InterfaceC1976h interfaceC1976h) {
        try {
            if (interfaceC1976h instanceof C1958b) {
                c1951q.m10927z(((C1958b) interfaceC1976h).f8320a);
            } else {
                c1951q.m10927z(interfaceC1976h);
            }
        } catch (RuntimeException e) {
            kyv.m152146d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m123275A() {
        InterfaceC1976h interfaceC1976h = this.f96522a;
        if (interfaceC1976h instanceof C1958b) {
            long j = this.f96527f.f107123d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((C1958b) interfaceC1976h).m10992v(0L, j);
        }
    }

    /* JADX INFO: renamed from: a */
    public long m123276a(dgj0 dgj0Var, long j, boolean z) {
        return m123277b(dgj0Var, j, z, new boolean[this.f96530i.length]);
    }

    /* JADX INFO: renamed from: b */
    public long m123277b(dgj0 dgj0Var, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= dgj0Var.f88310a) {
                break;
            }
            boolean[] zArr2 = this.f96529h;
            if (z || !dgj0Var.m115653b(this.f96535n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        m123281g(this.f96524c);
        m123280f();
        this.f96535n = dgj0Var;
        m123282h();
        long jMo10989r = this.f96522a.mo10989r(dgj0Var.f88312c, this.f96529h, this.f96524c, zArr, j);
        m123278c(this.f96524c);
        this.f96526e = false;
        int i2 = 0;
        while (true) {
            xwd0[] xwd0VarArr = this.f96524c;
            if (i2 >= xwd0VarArr.length) {
                return jMo10989r;
            }
            if (xwd0VarArr[i2] != null) {
                w11.m204371g(dgj0Var.m115654c(i2));
                if (this.f96530i[i2].getTrackType() != -2) {
                    this.f96526e = true;
                }
            } else {
                w11.m204371g(dgj0Var.f88312c[i2] == null);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m123278c(xwd0[] xwd0VarArr) {
        int i = 0;
        while (true) {
            InterfaceC2090y[] interfaceC2090yArr = this.f96530i;
            if (i >= interfaceC2090yArr.length) {
                return;
            }
            if (interfaceC2090yArr[i].getTrackType() == -2 && this.f96535n.m115654c(i)) {
                xwd0VarArr[i] = new e0f();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m123279d(long j) {
        w11.m204371g(m123292r());
        this.f96522a.mo10977c(m123298y(j));
    }

    /* JADX INFO: renamed from: f */
    public final void m123280f() {
        if (!m123292r()) {
            return;
        }
        int i = 0;
        while (true) {
            dgj0 dgj0Var = this.f96535n;
            if (i >= dgj0Var.f88310a) {
                return;
            }
            boolean zM115654c = dgj0Var.m115654c(i);
            u9f u9fVar = this.f96535n.f88312c[i];
            if (zM115654c && u9fVar != null) {
                u9fVar.disable();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m123281g(xwd0[] xwd0VarArr) {
        int i = 0;
        while (true) {
            InterfaceC2090y[] interfaceC2090yArr = this.f96530i;
            if (i >= interfaceC2090yArr.length) {
                return;
            }
            if (interfaceC2090yArr[i].getTrackType() == -2) {
                xwd0VarArr[i] = null;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m123282h() {
        if (!m123292r()) {
            return;
        }
        int i = 0;
        while (true) {
            dgj0 dgj0Var = this.f96535n;
            if (i >= dgj0Var.f88310a) {
                return;
            }
            boolean zM115654c = dgj0Var.m115654c(i);
            u9f u9fVar = this.f96535n.f88312c[i];
            if (zM115654c && u9fVar != null) {
                u9fVar.enable();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: i */
    public long m123283i() {
        if (!this.f96525d) {
            return this.f96527f.f107121b;
        }
        long jMo10978d = this.f96526e ? this.f96522a.mo10978d() : Long.MIN_VALUE;
        return jMo10978d == Long.MIN_VALUE ? this.f96527f.f107124e : jMo10978d;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public eyx m123284j() {
        return this.f96533l;
    }

    /* JADX INFO: renamed from: k */
    public long m123285k() {
        if (this.f96525d) {
            return this.f96522a.mo10980f();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: l */
    public long m123286l() {
        return this.f96536o;
    }

    /* JADX INFO: renamed from: m */
    public long m123287m() {
        return this.f96527f.f107121b + this.f96536o;
    }

    /* JADX INFO: renamed from: n */
    public ffj0 m123288n() {
        return this.f96534m;
    }

    /* JADX INFO: renamed from: o */
    public dgj0 m123289o() {
        return this.f96535n;
    }

    /* JADX INFO: renamed from: p */
    public void m123290p(float f, AbstractC1857c0 abstractC1857c0) throws ExoPlaybackException {
        this.f96525d = true;
        this.f96534m = this.f96522a.mo10984m();
        dgj0 dgj0VarM123295v = m123295v(f, abstractC1857c0);
        gyx gyxVar = this.f96527f;
        long jMax = gyxVar.f107121b;
        long j = gyxVar.f107124e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jM123276a = m123276a(dgj0VarM123295v, jMax, false);
        long j2 = this.f96536o;
        gyx gyxVar2 = this.f96527f;
        this.f96536o = j2 + (gyxVar2.f107121b - jM123276a);
        this.f96527f = gyxVar2.m133032b(jM123276a);
    }

    /* JADX INFO: renamed from: q */
    public boolean m123291q() {
        if (this.f96525d) {
            return !this.f96526e || this.f96522a.mo10978d() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m123292r() {
        return this.f96533l == null;
    }

    /* JADX INFO: renamed from: s */
    public void m123293s(long j) {
        w11.m204371g(m123292r());
        if (this.f96525d) {
            this.f96522a.mo10979e(m123298y(j));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m123294t() {
        m123280f();
        m123274u(this.f96532k, this.f96522a);
    }

    /* JADX INFO: renamed from: v */
    public dgj0 m123295v(float f, AbstractC1857c0 abstractC1857c0) throws ExoPlaybackException {
        dgj0 dgj0VarMo109696k = this.f96531j.mo109696k(this.f96530i, m123288n(), this.f96527f.f107120a, abstractC1857c0);
        for (u9f u9fVar : dgj0VarMo109696k.f88312c) {
            if (u9fVar != null) {
                u9fVar.mo11367n(f);
            }
        }
        return dgj0VarMo109696k;
    }

    /* JADX INFO: renamed from: w */
    public void m123296w(@Nullable eyx eyxVar) {
        if (eyxVar == this.f96533l) {
            return;
        }
        m123280f();
        this.f96533l = eyxVar;
        m123282h();
    }

    /* JADX INFO: renamed from: x */
    public void m123297x(long j) {
        this.f96536o = j;
    }

    /* JADX INFO: renamed from: y */
    public long m123298y(long j) {
        return j - m123286l();
    }

    /* JADX INFO: renamed from: z */
    public long m123299z(long j) {
        return j + m123286l();
    }
}
