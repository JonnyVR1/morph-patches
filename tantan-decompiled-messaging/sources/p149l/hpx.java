package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1928q;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2067y;
import com.google.android.exoplayer2.source.C1935b;
import com.google.android.exoplayer2.source.InterfaceC1953h;
import com.google.android.exoplayer2.source.InterfaceC1965i;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class hpx {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1953h f108972a;

    /* JADX INFO: renamed from: b */
    public final Object f108973b;

    /* JADX INFO: renamed from: c */
    public final vod0[] f108974c;

    /* JADX INFO: renamed from: d */
    public boolean f108975d;

    /* JADX INFO: renamed from: e */
    public boolean f108976e;

    /* JADX INFO: renamed from: f */
    public jpx f108977f;

    /* JADX INFO: renamed from: g */
    public boolean f108978g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f108979h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2067y[] f108980i;

    /* JADX INFO: renamed from: j */
    public final y6j0 f108981j;

    /* JADX INFO: renamed from: k */
    public final C1928q f108982k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public hpx f108983l;

    /* JADX INFO: renamed from: m */
    public b6j0 f108984m;

    /* JADX INFO: renamed from: n */
    public z6j0 f108985n;

    /* JADX INFO: renamed from: o */
    public long f108986o;

    public hpx(InterfaceC2067y[] interfaceC2067yArr, long j, y6j0 y6j0Var, sj0 sj0Var, C1928q c1928q, jpx jpxVar, z6j0 z6j0Var) {
        this.f108980i = interfaceC2067yArr;
        this.f108986o = j;
        this.f108981j = y6j0Var;
        this.f108982k = c1928q;
        InterfaceC1965i.b bVar = jpxVar.f119232a;
        this.f108973b = bVar.f114355a;
        this.f108977f = jpxVar;
        this.f108984m = b6j0.f73823d;
        this.f108985n = z6j0Var;
        this.f108974c = new vod0[interfaceC2067yArr.length];
        this.f108979h = new boolean[interfaceC2067yArr.length];
        this.f108972a = m132391e(bVar, c1928q, sj0Var, jpxVar.f119233b, jpxVar.f119235d);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC1953h m132391e(InterfaceC1965i.b bVar, C1928q c1928q, sj0 sj0Var, long j, long j2) {
        InterfaceC1953h interfaceC1953hM10860h = c1928q.m10860h(bVar, sj0Var, j);
        return j2 != -9223372036854775807L ? new C1935b(interfaceC1953hM10860h, true, 0L, j2) : interfaceC1953hM10860h;
    }

    /* JADX INFO: renamed from: u */
    public static void m132392u(C1928q c1928q, InterfaceC1953h interfaceC1953h) {
        try {
            if (interfaceC1953h instanceof C1935b) {
                c1928q.m10873z(((C1935b) interfaceC1953h).f8283a);
            } else {
                c1928q.m10873z(interfaceC1953h);
            }
        } catch (RuntimeException e) {
            jwv.m143684d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m132393A() {
        InterfaceC1953h interfaceC1953h = this.f108972a;
        if (interfaceC1953h instanceof C1935b) {
            long j = this.f108977f.f119235d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((C1935b) interfaceC1953h).m10938v(0L, j);
        }
    }

    /* JADX INFO: renamed from: a */
    public long m132394a(z6j0 z6j0Var, long j, boolean z) {
        return m132395b(z6j0Var, j, z, new boolean[this.f108980i.length]);
    }

    /* JADX INFO: renamed from: b */
    public long m132395b(z6j0 z6j0Var, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= z6j0Var.f201928a) {
                break;
            }
            boolean[] zArr2 = this.f108979h;
            if (z || !z6j0Var.m217396b(this.f108985n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        m132399g(this.f108974c);
        m132398f();
        this.f108985n = z6j0Var;
        m132400h();
        long jMo10935r = this.f108972a.mo10935r(z6j0Var.f201930c, this.f108979h, this.f108974c, zArr, j);
        m132396c(this.f108974c);
        this.f108976e = false;
        int i2 = 0;
        while (true) {
            vod0[] vod0VarArr = this.f108974c;
            if (i2 >= vod0VarArr.length) {
                return jMo10935r;
            }
            if (vod0VarArr[i2] != null) {
                p11.m167013g(z6j0Var.m217397c(i2));
                if (this.f108980i[i2].getTrackType() != -2) {
                    this.f108976e = true;
                }
            } else {
                p11.m167013g(z6j0Var.f201930c[i2] == null);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m132396c(vod0[] vod0VarArr) {
        int i = 0;
        while (true) {
            InterfaceC2067y[] interfaceC2067yArr = this.f108980i;
            if (i >= interfaceC2067yArr.length) {
                return;
            }
            if (interfaceC2067yArr[i].getTrackType() == -2 && this.f108985n.m217397c(i)) {
                vod0VarArr[i] = new aze();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m132397d(long j) {
        p11.m167013g(m132410r());
        this.f108972a.mo10923c(m132416y(j));
    }

    /* JADX INFO: renamed from: f */
    public final void m132398f() {
        if (!m132410r()) {
            return;
        }
        int i = 0;
        while (true) {
            z6j0 z6j0Var = this.f108985n;
            if (i >= z6j0Var.f201928a) {
                return;
            }
            boolean zM217397c = z6j0Var.m217397c(i);
            o8f o8fVar = this.f108985n.f201930c[i];
            if (zM217397c && o8fVar != null) {
                o8fVar.disable();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m132399g(vod0[] vod0VarArr) {
        int i = 0;
        while (true) {
            InterfaceC2067y[] interfaceC2067yArr = this.f108980i;
            if (i >= interfaceC2067yArr.length) {
                return;
            }
            if (interfaceC2067yArr[i].getTrackType() == -2) {
                vod0VarArr[i] = null;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m132400h() {
        if (!m132410r()) {
            return;
        }
        int i = 0;
        while (true) {
            z6j0 z6j0Var = this.f108985n;
            if (i >= z6j0Var.f201928a) {
                return;
            }
            boolean zM217397c = z6j0Var.m217397c(i);
            o8f o8fVar = this.f108985n.f201930c[i];
            if (zM217397c && o8fVar != null) {
                o8fVar.enable();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: i */
    public long m132401i() {
        if (!this.f108975d) {
            return this.f108977f.f119233b;
        }
        long jMo10924d = this.f108976e ? this.f108972a.mo10924d() : Long.MIN_VALUE;
        return jMo10924d == Long.MIN_VALUE ? this.f108977f.f119236e : jMo10924d;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public hpx m132402j() {
        return this.f108983l;
    }

    /* JADX INFO: renamed from: k */
    public long m132403k() {
        if (this.f108975d) {
            return this.f108972a.mo10926f();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: l */
    public long m132404l() {
        return this.f108986o;
    }

    /* JADX INFO: renamed from: m */
    public long m132405m() {
        return this.f108977f.f119233b + this.f108986o;
    }

    /* JADX INFO: renamed from: n */
    public b6j0 m132406n() {
        return this.f108984m;
    }

    /* JADX INFO: renamed from: o */
    public z6j0 m132407o() {
        return this.f108985n;
    }

    /* JADX INFO: renamed from: p */
    public void m132408p(float f, AbstractC1834c0 abstractC1834c0) throws ExoPlaybackException {
        this.f108975d = true;
        this.f108984m = this.f108972a.mo10930m();
        z6j0 z6j0VarM132413v = m132413v(f, abstractC1834c0);
        jpx jpxVar = this.f108977f;
        long jMax = jpxVar.f119233b;
        long j = jpxVar.f119236e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jM132394a = m132394a(z6j0VarM132413v, jMax, false);
        long j2 = this.f108986o;
        jpx jpxVar2 = this.f108977f;
        this.f108986o = j2 + (jpxVar2.f119233b - jM132394a);
        this.f108977f = jpxVar2.m142767b(jM132394a);
    }

    /* JADX INFO: renamed from: q */
    public boolean m132409q() {
        if (this.f108975d) {
            return !this.f108976e || this.f108972a.mo10924d() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m132410r() {
        return this.f108983l == null;
    }

    /* JADX INFO: renamed from: s */
    public void m132411s(long j) {
        p11.m167013g(m132410r());
        if (this.f108975d) {
            this.f108972a.mo10925e(m132416y(j));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m132412t() {
        m132398f();
        m132392u(this.f108982k, this.f108972a);
    }

    /* JADX INFO: renamed from: v */
    public z6j0 m132413v(float f, AbstractC1834c0 abstractC1834c0) throws ExoPlaybackException {
        z6j0 z6j0VarMo166137k = this.f108981j.mo166137k(this.f108980i, m132406n(), this.f108977f.f119232a, abstractC1834c0);
        for (o8f o8fVar : z6j0VarMo166137k.f201930c) {
            if (o8fVar != null) {
                o8fVar.mo11313n(f);
            }
        }
        return z6j0VarMo166137k;
    }

    /* JADX INFO: renamed from: w */
    public void m132414w(@Nullable hpx hpxVar) {
        if (hpxVar == this.f108983l) {
            return;
        }
        m132398f();
        this.f108983l = hpxVar;
        m132400h();
    }

    /* JADX INFO: renamed from: x */
    public void m132415x(long j) {
        this.f108986o = j;
    }

    /* JADX INFO: renamed from: y */
    public long m132416y(long j) {
        return j - m132404l();
    }

    /* JADX INFO: renamed from: z */
    public long m132417z(long j) {
        return j + m132404l();
    }
}
