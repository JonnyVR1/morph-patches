package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.C1996q;
import com.google.android.exoplayer2.source.InterfaceC1976h;
import com.google.android.exoplayer2.source.rtsp.C2005f;
import com.google.android.exoplayer2.source.rtsp.InterfaceC2000a;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.SocketFactory;
import p153l.bmk0;
import p153l.bsf;
import p153l.dfj0;
import p153l.ffj0;
import p153l.lqd0;
import p153l.mke0;
import p153l.nke0;
import p153l.oj0;
import p153l.p1j;
import p153l.qfj0;
import p153l.sqd0;
import p153l.tqd0;
import p153l.u9f;
import p153l.w11;
import p153l.wpg0;
import p153l.xwd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2005f implements InterfaceC1976h {

    /* JADX INFO: renamed from: a */
    public final oj0 f8901a;

    /* JADX INFO: renamed from: b */
    public final Handler f8902b = bmk0.m105174w();

    /* JADX INFO: renamed from: c */
    public final b f8903c;

    /* JADX INFO: renamed from: d */
    public final C2003d f8904d;

    /* JADX INFO: renamed from: e */
    public final List<e> f8905e;

    /* JADX INFO: renamed from: f */
    public final List<d> f8906f;

    /* JADX INFO: renamed from: g */
    public final c f8907g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2000a.a f8908h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1976h.a f8909i;

    /* JADX INFO: renamed from: j */
    public ImmutableList<dfj0> f8910j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public IOException f8911k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public RtspMediaSource.RtspPlaybackException f8912l;

    /* JADX INFO: renamed from: m */
    public long f8913m;

    /* JADX INFO: renamed from: n */
    public long f8914n;

    /* JADX INFO: renamed from: o */
    public long f8915o;

    /* JADX INFO: renamed from: p */
    public boolean f8916p;

    /* JADX INFO: renamed from: q */
    public boolean f8917q;

    /* JADX INFO: renamed from: r */
    public boolean f8918r;

    /* JADX INFO: renamed from: s */
    public boolean f8919s;

    /* JADX INFO: renamed from: t */
    public boolean f8920t;

    /* JADX INFO: renamed from: u */
    public int f8921u;

    /* JADX INFO: renamed from: v */
    public boolean f8922v;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        default void mo11525a() {
        }

        /* JADX INFO: renamed from: b */
        void mo11526b(sqd0 sqd0Var);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$d */
    public final class d {

        /* JADX INFO: renamed from: a */
        public final lqd0 f8924a;

        /* JADX INFO: renamed from: b */
        public final C2001b f8925b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public String f8926c;

        public d(lqd0 lqd0Var, int i, InterfaceC2000a.a aVar) {
            this.f8924a = lqd0Var;
            this.f8925b = new C2001b(i, lqd0Var, new C2001b.a() { // from class: l.kqd0
                @Override // com.google.android.exoplayer2.source.rtsp.C2001b.a
                /* JADX INFO: renamed from: a */
                public final void mo11536a(String str, InterfaceC2000a interfaceC2000a) {
                    C2005f.d.m11666a(this.f128213a, str, interfaceC2000a);
                }
            }, C2005f.this.f8903c, aVar);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m11666a(d dVar, String str, InterfaceC2000a interfaceC2000a) {
            dVar.f8926c = str;
            C2006g.b bVarMo11528l = interfaceC2000a.mo11528l();
            if (bVarMo11528l != null) {
                C2005f.this.f8904d.m11576o0(interfaceC2000a.getLocalPort(), bVarMo11528l);
                C2005f.this.f8922v = true;
            }
            C2005f.this.m11655T();
        }

        /* JADX INFO: renamed from: c */
        public Uri m11668c() {
            return this.f8925b.f8855b.f133192b;
        }

        /* JADX INFO: renamed from: d */
        public String m11669d() {
            w11.m204373i(this.f8926c);
            return this.f8926c;
        }

        /* JADX INFO: renamed from: e */
        public boolean m11670e() {
            return this.f8926c != null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$e */
    public final class e {

        /* JADX INFO: renamed from: a */
        public final d f8928a;

        /* JADX INFO: renamed from: b */
        public final Loader f8929b;

        /* JADX INFO: renamed from: c */
        public final C1996q f8930c;

        /* JADX INFO: renamed from: d */
        public boolean f8931d;

        /* JADX INFO: renamed from: e */
        public boolean f8932e;

        public e(lqd0 lqd0Var, int i, InterfaceC2000a.a aVar) {
            this.f8928a = C2005f.this.new d(lqd0Var, i, aVar);
            this.f8929b = new Loader("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i);
            C1996q c1996qM11466l = C1996q.m11466l(C2005f.this.f8901a);
            this.f8930c = c1996qM11466l;
            c1996qM11466l.m11495c0(C2005f.this.f8903c);
        }

        /* JADX INFO: renamed from: c */
        public void m11673c() {
            if (this.f8931d) {
                return;
            }
            this.f8928a.f8925b.mo11432c();
            this.f8931d = true;
            C2005f.this.m11660a0();
        }

        /* JADX INFO: renamed from: d */
        public long m11674d() {
            return this.f8930c.m11515z();
        }

        /* JADX INFO: renamed from: e */
        public boolean m11675e() {
            return this.f8930c.m11477K(this.f8931d);
        }

        /* JADX INFO: renamed from: f */
        public int m11676f(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i) {
            return this.f8930c.m11484R(p1jVar, decoderInputBuffer, i, this.f8931d);
        }

        /* JADX INFO: renamed from: g */
        public void m11677g() {
            if (this.f8932e) {
                return;
            }
            this.f8929b.m12144l();
            this.f8930c.m11485S();
            this.f8932e = true;
        }

        /* JADX INFO: renamed from: h */
        public void m11678h() {
            w11.m204371g(this.f8931d);
            this.f8931d = false;
            C2005f.this.m11660a0();
            m11681k();
        }

        /* JADX INFO: renamed from: i */
        public void m11679i(long j) {
            if (this.f8931d) {
                return;
            }
            this.f8928a.f8925b.m11532d();
            this.f8930c.m11487U();
            this.f8930c.m11493a0(j);
        }

        /* JADX INFO: renamed from: j */
        public int m11680j(long j) throws Throwable {
            int iM11471E = this.f8930c.m11471E(j, this.f8931d);
            this.f8930c.m11496d0(iM11471E);
            return iM11471E;
        }

        /* JADX INFO: renamed from: k */
        public void m11681k() {
            this.f8929b.m12146n(this.f8928a.f8925b, C2005f.this.f8903c, 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$f */
    public final class f implements xwd0 {

        /* JADX INFO: renamed from: a */
        public final int f8934a;

        public f(int i) {
            this.f8934a = i;
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: a */
        public void mo10993a() throws RtspMediaSource.RtspPlaybackException {
            if (C2005f.this.f8912l != null) {
                throw C2005f.this.f8912l;
            }
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: b */
        public boolean mo10994b() {
            return C2005f.this.m11653Q(this.f8934a);
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: k */
        public int mo10996k(long j) {
            return C2005f.this.m11659Y(this.f8934a, j);
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: l */
        public int mo10997l(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i) {
            return C2005f.this.m11656U(this.f8934a, p1jVar, decoderInputBuffer, i);
        }
    }

    public C2005f(oj0 oj0Var, InterfaceC2000a.a aVar, Uri uri, c cVar, String str, SocketFactory socketFactory, boolean z) {
        this.f8901a = oj0Var;
        this.f8908h = aVar;
        this.f8907g = cVar;
        b bVar = new b();
        this.f8903c = bVar;
        this.f8904d = new C2003d(bVar, bVar, str, uri, socketFactory, z);
        this.f8905e = new ArrayList();
        this.f8906f = new ArrayList();
        this.f8914n = -9223372036854775807L;
        this.f8913m = -9223372036854775807L;
        this.f8915o = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: O */
    public static ImmutableList<dfj0> m11634O(ImmutableList<e> immutableList) {
        ImmutableList.C2804a c2804a = new ImmutableList.C2804a();
        for (int i = 0; i < immutableList.size(); i++) {
            c2804a.mo15737a(new dfj0(Integer.toString(i), (C1894k) w11.m204369e(immutableList.get(i).f8930c.m11472F())));
        }
        return c2804a.m15756m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m11635S() {
        if (this.f8918r || this.f8919s) {
            return;
        }
        for (int i = 0; i < this.f8905e.size(); i++) {
            if (this.f8905e.get(i).f8930c.m11472F() == null) {
                return;
            }
        }
        this.f8919s = true;
        this.f8910j = m11634O(ImmutableList.copyOf((Collection) this.f8905e));
        ((InterfaceC1976h.a) w11.m204369e(this.f8909i)).mo10275l(this);
    }

    /* JADX INFO: renamed from: X */
    private boolean m11636X(long j) {
        for (int i = 0; i < this.f8905e.size(); i++) {
            if (!this.f8905e.get(i).f8930c.m11491Y(j, false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Z */
    private boolean m11637Z() {
        return this.f8917q;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m11639b(C2005f c2005f) {
        int i = c2005f.f8921u;
        c2005f.f8921u = i + 1;
        return i;
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public final C2001b m11652P(Uri uri) {
        for (int i = 0; i < this.f8905e.size(); i++) {
            if (!this.f8905e.get(i).f8931d) {
                d dVar = this.f8905e.get(i).f8928a;
                if (dVar.m11668c().equals(uri)) {
                    return dVar.f8925b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m11653Q(int i) {
        return !m11637Z() && this.f8905e.get(i).m11675e();
    }

    /* JADX INFO: renamed from: R */
    public final boolean m11654R() {
        return this.f8914n != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: T */
    public final void m11655T() {
        boolean zM11670e = true;
        for (int i = 0; i < this.f8906f.size(); i++) {
            zM11670e &= this.f8906f.get(i).m11670e();
        }
        if (zM11670e && this.f8920t) {
            this.f8904d.m11579s0(this.f8906f);
        }
    }

    /* JADX INFO: renamed from: U */
    public int m11656U(int i, p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (m11637Z()) {
            return -3;
        }
        return this.f8905e.get(i).m11676f(p1jVar, decoderInputBuffer, i2);
    }

    /* JADX INFO: renamed from: V */
    public void m11657V() {
        for (int i = 0; i < this.f8905e.size(); i++) {
            this.f8905e.get(i).m11677g();
        }
        bmk0.m105156n(this.f8904d);
        this.f8918r = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public final void m11658W() {
        List<e> list;
        this.f8922v = true;
        this.f8904d.m11577p0();
        InterfaceC2000a.a aVarMo11529a = this.f8908h.mo11529a();
        if (aVarMo11529a == null) {
            this.f8912l = new RtspMediaSource.RtspPlaybackException("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f8905e.size());
        ArrayList arrayList2 = new ArrayList(this.f8906f.size());
        int i = 0;
        while (true) {
            int size = this.f8905e.size();
            list = this.f8905e;
            if (i >= size) {
                break;
            }
            e eVar = list.get(i);
            if (eVar.f8931d) {
                arrayList.add(eVar);
            } else {
                e eVar2 = new e(eVar.f8928a.f8924a, i, aVarMo11529a);
                arrayList.add(eVar2);
                eVar2.m11681k();
                if (this.f8906f.contains(eVar.f8928a)) {
                    arrayList2.add(eVar2.f8928a);
                }
            }
            i++;
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) list);
        this.f8905e.clear();
        this.f8905e.addAll(arrayList);
        this.f8906f.clear();
        this.f8906f.addAll(arrayList2);
        for (int i2 = 0; i2 < immutableListCopyOf.size(); i2++) {
            ((e) immutableListCopyOf.get(i2)).m11673c();
        }
    }

    /* JADX INFO: renamed from: Y */
    public int m11659Y(int i, long j) {
        if (m11637Z()) {
            return -3;
        }
        return this.f8905e.get(i).m11680j(j);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m11660a0() {
        this.f8916p = true;
        for (int i = 0; i < this.f8905e.size(); i++) {
            this.f8916p &= this.f8905e.get(i).f8931d;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    public boolean mo10977c(long j) {
        return isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    public long mo10978d() {
        if (this.f8916p || this.f8905e.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j = this.f8913m;
        if (j != -9223372036854775807L) {
            return j;
        }
        boolean z = true;
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.f8905e.size(); i++) {
            e eVar = this.f8905e.get(i);
            if (!eVar.f8931d) {
                jMin = Math.min(jMin, eVar.m11674d());
                z = false;
            }
        }
        if (z || jMin == Long.MIN_VALUE) {
            return 0L;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    public void mo10979e(long j) {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    public long mo10980f() {
        return mo10978d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: h */
    public long mo10982h(long j) {
        if (mo10978d() == 0 && !this.f8922v) {
            this.f8915o = j;
            return j;
        }
        mo10991t(j, false);
        this.f8913m = j;
        if (m11654R()) {
            int iM11574m0 = this.f8904d.m11574m0();
            if (iM11574m0 != 1) {
                if (iM11574m0 != 2) {
                    wpg0.m207458a();
                    return 0L;
                }
                this.f8914n = j;
                this.f8904d.m11578q0(j);
                return j;
            }
        } else if (!m11636X(j)) {
            this.f8914n = j;
            if (this.f8916p) {
                for (int i = 0; i < this.f8905e.size(); i++) {
                    this.f8905e.get(i).m11678h();
                }
                boolean z = this.f8922v;
                C2003d c2003d = this.f8904d;
                if (z) {
                    c2003d.m11582v0(bmk0.m105152l1(j));
                } else {
                    c2003d.m11578q0(j);
                }
            } else {
                this.f8904d.m11578q0(j);
            }
            for (int i2 = 0; i2 < this.f8905e.size(); i2++) {
                this.f8905e.get(i2).m11679i(j);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: i */
    public long mo10983i() {
        if (!this.f8917q) {
            return -9223372036854775807L;
        }
        this.f8917q = false;
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    public boolean isLoading() {
        return !this.f8916p;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: m */
    public ffj0 mo10984m() {
        w11.m204371g(this.f8919s);
        return new ffj0((dfj0[]) ((ImmutableList) w11.m204369e(this.f8910j)).toArray(new dfj0[0]));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: p */
    public void mo10987p(InterfaceC1976h.a aVar, long j) {
        this.f8909i = aVar;
        try {
            this.f8904d.m11581u0();
        } catch (IOException e2) {
            this.f8911k = e2;
            bmk0.m105156n(this.f8904d);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: r */
    public long mo10989r(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < u9fVarArr.length; i++) {
            if (xwd0VarArr[i] != null && (u9fVarArr[i] == null || !zArr[i])) {
                xwd0VarArr[i] = null;
            }
        }
        this.f8906f.clear();
        for (int i2 = 0; i2 < u9fVarArr.length; i2++) {
            u9f u9fVar = u9fVarArr[i2];
            if (u9fVar != null) {
                dfj0 dfj0VarMo11361h = u9fVar.mo11361h();
                int iIndexOf = ((ImmutableList) w11.m204369e(this.f8910j)).indexOf(dfj0VarMo11361h);
                this.f8906f.add(((e) w11.m204369e(this.f8905e.get(iIndexOf))).f8928a);
                if (this.f8910j.contains(dfj0VarMo11361h) && xwd0VarArr[i2] == null) {
                    xwd0VarArr[i2] = new f(iIndexOf);
                    zArr2[i2] = true;
                }
            }
        }
        for (int i3 = 0; i3 < this.f8905e.size(); i3++) {
            e eVar = this.f8905e.get(i3);
            if (!this.f8906f.contains(eVar.f8928a)) {
                eVar.m11673c();
            }
        }
        this.f8920t = true;
        if (j != 0) {
            this.f8913m = j;
            this.f8914n = j;
            this.f8915o = j;
        }
        m11655T();
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: s */
    public void mo10990s() throws IOException {
        IOException iOException = this.f8911k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: t */
    public void mo10991t(long j, boolean z) {
        if (m11654R()) {
            return;
        }
        for (int i = 0; i < this.f8905e.size(); i++) {
            e eVar = this.f8905e.get(i);
            if (!eVar.f8931d) {
                eVar.f8930c.m11506q(j, z, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$b */
    public final class b implements bsf, Loader.InterfaceC2064b<C2001b>, C1996q.d, C2003d.f, C2003d.e {
        public b() {
        }

        @Override // com.google.android.exoplayer2.source.C1996q.d
        /* JADX INFO: renamed from: a */
        public void mo11414a(C1894k c1894k) {
            Handler handler = C2005f.this.f8902b;
            final C2005f c2005f = C2005f.this;
            handler.post(new Runnable() { // from class: l.jqd0
                @Override // java.lang.Runnable
                public final void run() {
                    c2005f.m11635S();
                }
            });
        }

        @Override // p153l.bsf
        /* JADX INFO: renamed from: b */
        public qfj0 mo11416b(int i, int i2) {
            return ((e) w11.m204369e((e) C2005f.this.f8905e.get(i))).f8930c;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C2003d.f
        /* JADX INFO: renamed from: c */
        public void mo11608c(String str, @Nullable Throwable th) {
            C2005f.this.f8911k = th == null ? new IOException(str) : new IOException(str, th);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C2003d.e
        /* JADX INFO: renamed from: d */
        public void mo11605d() {
            long jM105152l1;
            long j = C2005f.this.f8914n;
            C2005f c2005f = C2005f.this;
            if (j != -9223372036854775807L) {
                jM105152l1 = bmk0.m105152l1(c2005f.f8914n);
            } else {
                jM105152l1 = c2005f.f8915o != -9223372036854775807L ? bmk0.m105152l1(C2005f.this.f8915o) : 0L;
            }
            C2005f.this.f8904d.m11582v0(jM105152l1);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C2003d.e
        /* JADX INFO: renamed from: e */
        public void mo11606e(long j, ImmutableList<tqd0> immutableList) {
            ArrayList arrayList = new ArrayList(immutableList.size());
            for (int i = 0; i < immutableList.size(); i++) {
                arrayList.add((String) w11.m204369e(immutableList.get(i).f175703c.getPath()));
            }
            for (int i2 = 0; i2 < C2005f.this.f8906f.size(); i2++) {
                if (!arrayList.contains(((d) C2005f.this.f8906f.get(i2)).m11668c().getPath())) {
                    C2005f.this.f8907g.mo11525a();
                    if (C2005f.this.m11654R()) {
                        C2005f.this.f8917q = true;
                        C2005f.this.f8914n = -9223372036854775807L;
                        C2005f.this.f8913m = -9223372036854775807L;
                        C2005f.this.f8915o = -9223372036854775807L;
                    }
                }
            }
            for (int i3 = 0; i3 < immutableList.size(); i3++) {
                tqd0 tqd0Var = immutableList.get(i3);
                C2001b c2001bM11652P = C2005f.this.m11652P(tqd0Var.f175703c);
                if (c2001bM11652P != null) {
                    c2001bM11652P.m11535g(tqd0Var.f175701a);
                    c2001bM11652P.m11534f(tqd0Var.f175702b);
                    if (C2005f.this.m11654R() && C2005f.this.f8914n == C2005f.this.f8913m) {
                        c2001bM11652P.m11533e(j, tqd0Var.f175701a);
                    }
                }
            }
            boolean zM11654R = C2005f.this.m11654R();
            C2005f c2005f = C2005f.this;
            if (!zM11654R) {
                if (c2005f.f8915o == -9223372036854775807L || !C2005f.this.f8922v) {
                    return;
                }
                C2005f c2005f2 = C2005f.this;
                c2005f2.mo10982h(c2005f2.f8915o);
                C2005f.this.f8915o = -9223372036854775807L;
                return;
            }
            long j2 = c2005f.f8914n;
            long j3 = C2005f.this.f8913m;
            C2005f c2005f3 = C2005f.this;
            if (j2 == j3) {
                c2005f3.f8914n = -9223372036854775807L;
                C2005f.this.f8913m = -9223372036854775807L;
            } else {
                c2005f3.f8914n = -9223372036854775807L;
                C2005f c2005f4 = C2005f.this;
                c2005f4.mo10982h(c2005f4.f8913m);
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C2003d.f
        /* JADX INFO: renamed from: f */
        public void mo11609f(sqd0 sqd0Var, ImmutableList<lqd0> immutableList) {
            for (int i = 0; i < immutableList.size(); i++) {
                lqd0 lqd0Var = immutableList.get(i);
                C2005f c2005f = C2005f.this;
                e eVar = c2005f.new e(lqd0Var, i, c2005f.f8908h);
                C2005f.this.f8905e.add(eVar);
                eVar.m11681k();
            }
            C2005f.this.f8907g.mo11526b(sqd0Var);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C2003d.e
        /* JADX INFO: renamed from: g */
        public void mo11607g(RtspMediaSource.RtspPlaybackException rtspPlaybackException) {
            if (!(rtspPlaybackException instanceof RtspMediaSource.RtspUdpUnsupportedTransportException) || C2005f.this.f8922v) {
                C2005f.this.f8912l = rtspPlaybackException;
            } else {
                C2005f.this.m11658W();
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo11078n(C2001b c2001b, long j, long j2, boolean z) {
        }

        @Override // p153l.bsf
        /* JADX INFO: renamed from: l */
        public void mo11425l() {
            Handler handler = C2005f.this.f8902b;
            final C2005f c2005f = C2005f.this;
            handler.post(new Runnable() { // from class: l.iqd0
                @Override // java.lang.Runnable
                public final void run() {
                    c2005f.m11635S();
                }
            });
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo11079o(C2001b c2001b, long j, long j2) {
            if (C2005f.this.mo10978d() == 0) {
                if (C2005f.this.f8922v) {
                    return;
                }
                C2005f.this.m11658W();
                return;
            }
            for (int i = 0; i < C2005f.this.f8905e.size(); i++) {
                e eVar = (e) C2005f.this.f8905e.get(i);
                if (eVar.f8928a.f8925b == c2001b) {
                    eVar.m11673c();
                    break;
                }
            }
            C2005f.this.f8904d.m11580t0();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Loader.C2065c mo11080q(C2001b c2001b, long j, long j2, IOException iOException, int i) {
            if (C2005f.this.f8919s) {
                boolean z = iOException.getCause() instanceof BindException;
                C2005f c2005f = C2005f.this;
                if (!z) {
                    c2005f.f8912l = new RtspMediaSource.RtspPlaybackException(c2001b.f8855b.f133192b.toString(), iOException);
                } else if (C2005f.m11639b(c2005f) < 3) {
                    return Loader.f9493d;
                }
            } else {
                C2005f.this.f8911k = iOException;
            }
            return Loader.f9495f;
        }

        @Override // p153l.bsf
        /* JADX INFO: renamed from: k */
        public void mo11424k(mke0 mke0Var) {
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: g */
    public long mo10981g(long j, nke0 nke0Var) {
        return j;
    }
}
