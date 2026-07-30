package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import com.google.android.exoplayer2.drm.InterfaceC1878c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.C1993n;
import com.google.android.exoplayer2.upstream.C2070a;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p153l.bmk0;
import p153l.bsf;
import p153l.dfj0;
import p153l.e6c;
import p153l.ffj0;
import p153l.g6c;
import p153l.ig60;
import p153l.kb00;
import p153l.ktx;
import p153l.ll80;
import p153l.m6c;
import p153l.mke0;
import p153l.mtv;
import p153l.nke0;
import p153l.oj0;
import p153l.p1j;
import p153l.p4g0;
import p153l.qfj0;
import p153l.u9f;
import p153l.w11;
import p153l.wt5;
import p153l.xwd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.n */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1993n implements InterfaceC1976h, bsf, Loader.InterfaceC2064b<a>, Loader.InterfaceC2068f, C1996q.d {

    /* JADX INFO: renamed from: M */
    public static final Map<String, String> f8707M = m11390K();

    /* JADX INFO: renamed from: N */
    public static final C1894k f8708N = new C1894k.b().m10388U("icy").m10400g0("application/x-icy").m10374G();

    /* JADX INFO: renamed from: A */
    public boolean f8709A;

    /* JADX INFO: renamed from: C */
    public boolean f8711C;

    /* JADX INFO: renamed from: D */
    public boolean f8712D;

    /* JADX INFO: renamed from: E */
    public int f8713E;

    /* JADX INFO: renamed from: F */
    public boolean f8714F;

    /* JADX INFO: renamed from: G */
    public long f8715G;

    /* JADX INFO: renamed from: I */
    public boolean f8717I;

    /* JADX INFO: renamed from: J */
    public int f8718J;

    /* JADX INFO: renamed from: K */
    public boolean f8719K;

    /* JADX INFO: renamed from: L */
    public boolean f8720L;

    /* JADX INFO: renamed from: a */
    public final Uri f8721a;

    /* JADX INFO: renamed from: b */
    public final g6c f8722b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1878c f8723c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2072c f8724d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1989j.a f8725e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1877b.a f8726f;

    /* JADX INFO: renamed from: g */
    public final b f8727g;

    /* JADX INFO: renamed from: h */
    public final oj0 f8728h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f8729i;

    /* JADX INFO: renamed from: j */
    public final long f8730j;

    /* JADX INFO: renamed from: l */
    public final InterfaceC1992m f8732l;

    /* JADX INFO: renamed from: q */
    @Nullable
    public InterfaceC1976h.a f8737q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public IcyHeaders f8738r;

    /* JADX INFO: renamed from: u */
    public boolean f8741u;

    /* JADX INFO: renamed from: v */
    public boolean f8742v;

    /* JADX INFO: renamed from: w */
    public boolean f8743w;

    /* JADX INFO: renamed from: x */
    public e f8744x;

    /* JADX INFO: renamed from: y */
    public mke0 f8745y;

    /* JADX INFO: renamed from: k */
    public final Loader f8731k = new Loader("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: m */
    public final wt5 f8733m = new wt5();

    /* JADX INFO: renamed from: n */
    public final Runnable f8734n = new Runnable() { // from class: l.v4b0
        @Override // java.lang.Runnable
        public final void run() {
            this.f182345a.m11404Q();
        }
    };

    /* JADX INFO: renamed from: o */
    public final Runnable f8735o = new Runnable() { // from class: l.w4b0
        @Override // java.lang.Runnable
        public final void run() {
            C1993n.m11394w(this.f187364a);
        }
    };

    /* JADX INFO: renamed from: p */
    public final Handler f8736p = bmk0.m105174w();

    /* JADX INFO: renamed from: t */
    public d[] f8740t = new d[0];

    /* JADX INFO: renamed from: s */
    public C1996q[] f8739s = new C1996q[0];

    /* JADX INFO: renamed from: H */
    public long f8716H = -9223372036854775807L;

    /* JADX INFO: renamed from: z */
    public long f8746z = -9223372036854775807L;

    /* JADX INFO: renamed from: B */
    public int f8710B = 1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$a */
    public final class a implements Loader.InterfaceC2067e, C1973e.a {

        /* JADX INFO: renamed from: b */
        public final Uri f8748b;

        /* JADX INFO: renamed from: c */
        public final p4g0 f8749c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC1992m f8750d;

        /* JADX INFO: renamed from: e */
        public final bsf f8751e;

        /* JADX INFO: renamed from: f */
        public final wt5 f8752f;

        /* JADX INFO: renamed from: h */
        public volatile boolean f8754h;

        /* JADX INFO: renamed from: j */
        public long f8756j;

        /* JADX INFO: renamed from: l */
        @Nullable
        public qfj0 f8758l;

        /* JADX INFO: renamed from: m */
        public boolean f8759m;

        /* JADX INFO: renamed from: g */
        public final ll80 f8753g = new ll80();

        /* JADX INFO: renamed from: i */
        public boolean f8755i = true;

        /* JADX INFO: renamed from: a */
        public final long f8747a = mtv.m160053a();

        /* JADX INFO: renamed from: k */
        public C2070a f8757k = m11433i(0);

        public a(Uri uri, g6c g6cVar, InterfaceC1992m interfaceC1992m, bsf bsfVar, wt5 wt5Var) {
            this.f8748b = uri;
            this.f8749c = new p4g0(g6cVar);
            this.f8750d = interfaceC1992m;
            this.f8751e = bsfVar;
            this.f8752f = wt5Var;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
        /* JADX INFO: renamed from: a */
        public void mo11431a() throws IOException {
            int iMo11378c = 0;
            while (iMo11378c == 0 && !this.f8754h) {
                try {
                    long j = this.f8753g.f132534a;
                    C2070a c2070aM11433i = m11433i(j);
                    this.f8757k = c2070aM11433i;
                    long jMo11179n = this.f8749c.mo11179n(c2070aM11433i);
                    if (jMo11179n != -1) {
                        jMo11179n += j;
                        C1993n.this.m11409V();
                    }
                    long j2 = jMo11179n;
                    C1993n.this.f8738r = IcyHeaders.m10608a(this.f8749c.mo11175a());
                    e6c c1973e = this.f8749c;
                    if (C1993n.this.f8738r != null && C1993n.this.f8738r.metadataInterval != -1) {
                        c1973e = new C1973e(this.f8749c, C1993n.this.f8738r.metadataInterval, this);
                        qfj0 qfj0VarM11402N = C1993n.this.m11402N();
                        this.f8758l = qfj0VarM11402N;
                        qfj0VarM11402N.mo11164b(C1993n.f8708N);
                    }
                    this.f8750d.mo11380e(c1973e, this.f8748b, this.f8749c.mo11175a(), j, j2, this.f8751e);
                    if (C1993n.this.f8738r != null) {
                        this.f8750d.mo11379d();
                    }
                    if (this.f8755i) {
                        this.f8750d.mo11376a(j, this.f8756j);
                        this.f8755i = false;
                    }
                    while (iMo11378c == 0 && !this.f8754h) {
                        try {
                            this.f8752f.m207817a();
                            iMo11378c = this.f8750d.mo11378c(this.f8753g);
                            long jMo11377b = this.f8750d.mo11377b();
                            if (jMo11377b > C1993n.this.f8730j + j) {
                                this.f8752f.m207819c();
                                C1993n.this.f8736p.post(C1993n.this.f8735o);
                                j = jMo11377b;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iMo11378c == 1) {
                        iMo11378c = 0;
                    } else if (this.f8750d.mo11377b() != -1) {
                        this.f8753g.f132534a = this.f8750d.mo11377b();
                    }
                    m6c.m157209a(this.f8749c);
                } catch (Throwable th) {
                    if (iMo11378c != 1 && this.f8750d.mo11377b() != -1) {
                        this.f8753g.f132534a = this.f8750d.mo11377b();
                    }
                    m6c.m157209a(this.f8749c);
                    throw th;
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.C1973e.a
        /* JADX INFO: renamed from: b */
        public void mo11180b(ig60 ig60Var) {
            long jMax = !this.f8759m ? this.f8756j : Math.max(C1993n.this.m11401M(true), this.f8756j);
            int iM139811a = ig60Var.m139811a();
            qfj0 qfj0Var = (qfj0) w11.m204369e(this.f8758l);
            qfj0Var.m176370d(ig60Var, iM139811a);
            qfj0Var.mo11163a(jMax, 1, iM139811a, 0, null);
            this.f8759m = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
        /* JADX INFO: renamed from: c */
        public void mo11432c() {
            this.f8754h = true;
        }

        /* JADX INFO: renamed from: i */
        public final C2070a m11433i(long j) {
            return new C2070a.b().m12170i(this.f8748b).m12169h(j).m12167f(C1993n.this.f8729i).m12163b(6).m12166e(C1993n.f8707M).m12162a();
        }

        /* JADX INFO: renamed from: j */
        public final void m11434j(long j, long j2) {
            this.f8753g.f132534a = j;
            this.f8756j = j2;
            this.f8755i = true;
            this.f8759m = false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo11435a(long j, boolean z, boolean z2);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$c */
    public final class c implements xwd0 {

        /* JADX INFO: renamed from: a */
        public final int f8761a;

        public c(int i) {
            this.f8761a = i;
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: a */
        public void mo10993a() throws IOException {
            C1993n.this.m11408U(this.f8761a);
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: b */
        public boolean mo10994b() {
            return C1993n.this.m11403P(this.f8761a);
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: k */
        public int mo10996k(long j) {
            return C1993n.this.m11420e0(this.f8761a, j);
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: l */
        public int mo10997l(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i) {
            return C1993n.this.m11415a0(this.f8761a, p1jVar, decoderInputBuffer, i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final int f8763a;

        /* JADX INFO: renamed from: b */
        public final boolean f8764b;

        public d(int i, boolean z) {
            this.f8763a = i;
            this.f8764b = z;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f8763a == dVar.f8763a && this.f8764b == dVar.f8764b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f8763a * 31) + (this.f8764b ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final ffj0 f8765a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f8766b;

        /* JADX INFO: renamed from: c */
        public final boolean[] f8767c;

        /* JADX INFO: renamed from: d */
        public final boolean[] f8768d;

        public e(ffj0 ffj0Var, boolean[] zArr) {
            this.f8765a = ffj0Var;
            this.f8766b = zArr;
            int i = ffj0Var.f98785a;
            this.f8767c = new boolean[i];
            this.f8768d = new boolean[i];
        }
    }

    public C1993n(Uri uri, g6c g6cVar, InterfaceC1992m interfaceC1992m, InterfaceC1878c interfaceC1878c, InterfaceC1877b.a aVar, InterfaceC2072c interfaceC2072c, InterfaceC1989j.a aVar2, b bVar, oj0 oj0Var, @Nullable String str, int i) {
        this.f8721a = uri;
        this.f8722b = g6cVar;
        this.f8723c = interfaceC1878c;
        this.f8726f = aVar;
        this.f8724d = interfaceC2072c;
        this.f8725e = aVar2;
        this.f8727g = bVar;
        this.f8728h = oj0Var;
        this.f8729i = str;
        this.f8730j = i;
        this.f8732l = interfaceC1992m;
    }

    /* JADX INFO: renamed from: K */
    public static Map<String, String> m11390K() {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: O */
    private boolean m11391O() {
        return this.f8716H != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m11394w(C1993n c1993n) {
        if (c1993n.f8720L) {
            return;
        }
        ((InterfaceC1976h.a) w11.m204369e(c1993n.f8737q)).mo10270j(c1993n);
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* JADX INFO: renamed from: I */
    public final void m11398I() {
        w11.m204371g(this.f8742v);
        w11.m204369e(this.f8744x);
        w11.m204369e(this.f8745y);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m11399J(a aVar, int i) {
        mke0 mke0Var;
        if (this.f8714F || !((mke0Var = this.f8745y) == null || mke0Var.mo107793i() == -9223372036854775807L)) {
            this.f8718J = i;
            return true;
        }
        if (this.f8742v && !m11422g0()) {
            this.f8717I = true;
            return false;
        }
        this.f8712D = this.f8742v;
        this.f8715G = 0L;
        this.f8718J = 0;
        for (C1996q c1996q : this.f8739s) {
            c1996q.m11487U();
        }
        aVar.m11434j(0L, 0L);
        return true;
    }

    /* JADX INFO: renamed from: L */
    public final int m11400L() {
        int iM11473G = 0;
        for (C1996q c1996q : this.f8739s) {
            iM11473G += c1996q.m11473G();
        }
        return iM11473G;
    }

    /* JADX INFO: renamed from: M */
    public final long m11401M(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.f8739s.length; i++) {
            if (z || ((e) w11.m204369e(this.f8744x)).f8767c[i]) {
                jMax = Math.max(jMax, this.f8739s[i].m11515z());
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: N */
    public qfj0 m11402N() {
        return m11413Z(new d(0, true));
    }

    /* JADX INFO: renamed from: P */
    public boolean m11403P(int i) {
        return !m11422g0() && this.f8739s[i].m11477K(this.f8719K);
    }

    /* JADX INFO: renamed from: Q */
    public final void m11404Q() {
        if (this.f8720L || this.f8742v || !this.f8741u || this.f8745y == null) {
            return;
        }
        for (C1996q c1996q : this.f8739s) {
            if (c1996q.m11472F() == null) {
                return;
            }
        }
        this.f8733m.m207819c();
        int length = this.f8739s.length;
        dfj0[] dfj0VarArr = new dfj0[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            C1894k c1894kM10374G = (C1894k) w11.m204369e(this.f8739s[i].m11472F());
            String str = c1894kM10374G.f7785l;
            boolean zM149014o = kb00.m149014o(str);
            boolean z = zM149014o || kb00.m149018s(str);
            zArr[i] = z;
            this.f8743w = z | this.f8743w;
            IcyHeaders icyHeaders = this.f8738r;
            if (icyHeaders != null) {
                if (zM149014o || this.f8740t[i].f8764b) {
                    Metadata metadata = c1894kM10374G.f7783j;
                    c1894kM10374G = c1894kM10374G.m10336b().m10393Z(metadata == null ? new Metadata(icyHeaders) : metadata.m10583a(icyHeaders)).m10374G();
                }
                if (zM149014o && c1894kM10374G.f7779f == -1 && c1894kM10374G.f7780g == -1 && icyHeaders.bitrate != -1) {
                    c1894kM10374G = c1894kM10374G.m10336b().m10376I(icyHeaders.bitrate).m10374G();
                }
            }
            dfj0VarArr[i] = new dfj0(Integer.toString(i), c1894kM10374G.m10337c(this.f8723c.mo9930c(c1894kM10374G)));
        }
        this.f8744x = new e(new ffj0(dfj0VarArr), zArr);
        this.f8742v = true;
        ((InterfaceC1976h.a) w11.m204369e(this.f8737q)).mo10275l(this);
    }

    /* JADX INFO: renamed from: R */
    public final void m11405R(int i) {
        m11398I();
        e eVar = this.f8744x;
        boolean[] zArr = eVar.f8768d;
        if (zArr[i]) {
            return;
        }
        C1894k c1894kM115519c = eVar.f8765a.m125387b(i).m115519c(0);
        this.f8725e.m11332h(kb00.m149010k(c1894kM115519c.f7785l), c1894kM115519c, 0, null, this.f8715G);
        zArr[i] = true;
    }

    /* JADX INFO: renamed from: S */
    public final void m11406S(int i) {
        m11398I();
        boolean[] zArr = this.f8744x.f8766b;
        if (this.f8717I && zArr[i]) {
            if (this.f8739s[i].m11477K(false)) {
                return;
            }
            this.f8716H = 0L;
            this.f8717I = false;
            this.f8712D = true;
            this.f8715G = 0L;
            this.f8718J = 0;
            for (C1996q c1996q : this.f8739s) {
                c1996q.m11487U();
            }
            ((InterfaceC1976h.a) w11.m204369e(this.f8737q)).mo10270j(this);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m11407T() throws IOException {
        this.f8731k.m12143k(this.f8724d.mo12174d(this.f8710B));
    }

    /* JADX INFO: renamed from: U */
    public void m11408U(int i) throws IOException {
        this.f8739s[i].m11479M();
        m11407T();
    }

    /* JADX INFO: renamed from: V */
    public final void m11409V() {
        this.f8736p.post(new Runnable() { // from class: l.x4b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f192361a.f8714F = true;
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo11078n(a aVar, long j, long j2, boolean z) {
        p4g0 p4g0Var = aVar.f8749c;
        mtv mtvVar = new mtv(aVar.f8747a, aVar.f8757k, p4g0Var.m170566q(), p4g0Var.m170567r(), j, j2, p4g0Var.m170565j());
        this.f8724d.m12176c(aVar.f8747a);
        this.f8725e.m11335k(mtvVar, 1, -1, null, 0, null, aVar.f8756j, this.f8746z);
        if (z) {
            return;
        }
        for (C1996q c1996q : this.f8739s) {
            c1996q.m11487U();
        }
        if (this.f8713E > 0) {
            ((InterfaceC1976h.a) w11.m204369e(this.f8737q)).mo10270j(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo11079o(a aVar, long j, long j2) {
        mke0 mke0Var;
        if (this.f8746z == -9223372036854775807L && (mke0Var = this.f8745y) != null) {
            boolean zMo107792e = mke0Var.mo107792e();
            long jM11401M = m11401M(true);
            long j3 = jM11401M == Long.MIN_VALUE ? 0L : jM11401M + 10000;
            this.f8746z = j3;
            this.f8727g.mo11435a(j3, zMo107792e, this.f8709A);
        }
        p4g0 p4g0Var = aVar.f8749c;
        mtv mtvVar = new mtv(aVar.f8747a, aVar.f8757k, p4g0Var.m170566q(), p4g0Var.m170567r(), j, j2, p4g0Var.m170565j());
        this.f8724d.m12176c(aVar.f8747a);
        this.f8725e.m11338n(mtvVar, 1, -1, null, 0, null, aVar.f8756j, this.f8746z);
        this.f8719K = true;
        ((InterfaceC1976h.a) w11.m204369e(this.f8737q)).mo10270j(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Loader.C2065c mo11080q(a aVar, long j, long j2, IOException iOException, int i) {
        a aVar2;
        Loader.C2065c c2065cM12138h;
        p4g0 p4g0Var = aVar.f8749c;
        mtv mtvVar = new mtv(aVar.f8747a, aVar.f8757k, p4g0Var.m170566q(), p4g0Var.m170567r(), j, j2, p4g0Var.m170565j());
        long jMo12172a = this.f8724d.mo12172a(new InterfaceC2072c.c(mtvVar, new ktx(1, -1, null, 0, null, bmk0.m105152l1(aVar.f8756j), bmk0.m105152l1(this.f8746z)), iOException, i));
        if (jMo12172a == -9223372036854775807L) {
            c2065cM12138h = Loader.f9496g;
            aVar2 = aVar;
        } else {
            int iM11400L = m11400L();
            aVar2 = aVar;
            c2065cM12138h = m11399J(aVar2, iM11400L) ? Loader.m12138h(iM11400L > this.f8718J, jMo12172a) : Loader.f9495f;
        }
        boolean zM12149c = c2065cM12138h.m12149c();
        this.f8725e.m11340p(mtvVar, 1, -1, null, 0, null, aVar2.f8756j, this.f8746z, iOException, !zM12149c);
        if (!zM12149c) {
            this.f8724d.m12176c(aVar2.f8747a);
        }
        return c2065cM12138h;
    }

    /* JADX INFO: renamed from: Z */
    public final qfj0 m11413Z(d dVar) {
        int length = this.f8739s.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.f8740t[i])) {
                return this.f8739s[i];
            }
        }
        C1996q c1996qM11465k = C1996q.m11465k(this.f8728h, this.f8723c, this.f8726f);
        c1996qM11465k.m11495c0(this);
        int i2 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f8740t, i2);
        dVarArr[length] = dVar;
        this.f8740t = (d[]) bmk0.m105147k(dVarArr);
        C1996q[] c1996qArr = (C1996q[]) Arrays.copyOf(this.f8739s, i2);
        c1996qArr[length] = c1996qM11465k;
        this.f8739s = (C1996q[]) bmk0.m105147k(c1996qArr);
        return c1996qM11465k;
    }

    @Override // com.google.android.exoplayer2.source.C1996q.d
    /* JADX INFO: renamed from: a */
    public void mo11414a(C1894k c1894k) {
        this.f8736p.post(this.f8734n);
    }

    /* JADX INFO: renamed from: a0 */
    public int m11415a0(int i, p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (m11422g0()) {
            return -3;
        }
        m11405R(i);
        int iM11484R = this.f8739s[i].m11484R(p1jVar, decoderInputBuffer, i2, this.f8719K);
        if (iM11484R == -3) {
            m11406S(i);
        }
        return iM11484R;
    }

    @Override // p153l.bsf
    /* JADX INFO: renamed from: b */
    public qfj0 mo11416b(int i, int i2) {
        return m11413Z(new d(i, false));
    }

    /* JADX INFO: renamed from: b0 */
    public void m11417b0() {
        if (this.f8742v) {
            for (C1996q c1996q : this.f8739s) {
                c1996q.m11483Q();
            }
        }
        this.f8731k.m12145m(this);
        this.f8736p.removeCallbacksAndMessages(null);
        this.f8737q = null;
        this.f8720L = true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    public boolean mo10977c(long j) {
        if (this.f8719K || this.f8731k.m12141i() || this.f8717I) {
            return false;
        }
        if (this.f8742v && this.f8713E == 0) {
            return false;
        }
        boolean zM207821e = this.f8733m.m207821e();
        if (this.f8731k.m12142j()) {
            return zM207821e;
        }
        m11421f0();
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m11418c0(boolean[] zArr, long j) {
        int length = this.f8739s.length;
        for (int i = 0; i < length; i++) {
            if (!this.f8739s[i].m11491Y(j, false) && (zArr[i] || !this.f8743w)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    public long mo10978d() {
        long jM11401M;
        m11398I();
        if (this.f8719K || this.f8713E == 0) {
            return Long.MIN_VALUE;
        }
        if (m11391O()) {
            return this.f8716H;
        }
        if (this.f8743w) {
            int length = this.f8739s.length;
            jM11401M = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                e eVar = this.f8744x;
                if (eVar.f8766b[i] && eVar.f8767c[i] && !this.f8739s[i].m11476J()) {
                    jM11401M = Math.min(jM11401M, this.f8739s[i].m11515z());
                }
            }
        } else {
            jM11401M = Long.MAX_VALUE;
        }
        if (jM11401M == Long.MAX_VALUE) {
            jM11401M = m11401M(false);
        }
        return jM11401M == Long.MIN_VALUE ? this.f8715G : jM11401M;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m11419d0(mke0 mke0Var) {
        this.f8745y = this.f8738r == null ? mke0Var : new mke0.C18641b(-9223372036854775807L);
        this.f8746z = mke0Var.mo107793i();
        boolean z = !this.f8714F && mke0Var.mo107793i() == -9223372036854775807L;
        this.f8709A = z;
        this.f8710B = z ? 7 : 1;
        this.f8727g.mo11435a(this.f8746z, mke0Var.mo107792e(), this.f8709A);
        if (this.f8742v) {
            return;
        }
        m11404Q();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    public void mo10979e(long j) {
    }

    /* JADX INFO: renamed from: e0 */
    public int m11420e0(int i, long j) throws Throwable {
        if (m11422g0()) {
            return 0;
        }
        m11405R(i);
        C1996q c1996q = this.f8739s[i];
        int iM11471E = c1996q.m11471E(j, this.f8719K);
        c1996q.m11496d0(iM11471E);
        if (iM11471E == 0) {
            m11406S(i);
        }
        return iM11471E;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    public long mo10980f() {
        return mo10978d();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m11421f0() {
        a aVar = new a(this.f8721a, this.f8722b, this.f8732l, this, this.f8733m);
        if (this.f8742v) {
            w11.m204371g(m11391O());
            long j = this.f8746z;
            if (j != -9223372036854775807L && this.f8716H > j) {
                this.f8719K = true;
                this.f8716H = -9223372036854775807L;
                return;
            }
            aVar.m11434j(((mke0) w11.m204369e(this.f8745y)).mo107791d(this.f8716H).f137283a.f147752b, this.f8716H);
            for (C1996q c1996q : this.f8739s) {
                c1996q.m11493a0(this.f8716H);
            }
            this.f8716H = -9223372036854775807L;
        }
        this.f8718J = m11400L();
        this.f8725e.m11344t(new mtv(aVar.f8747a, aVar.f8757k, this.f8731k.m12146n(aVar, this, this.f8724d.mo12174d(this.f8710B))), 1, -1, null, 0, null, aVar.f8756j, this.f8746z);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: g */
    public long mo10981g(long j, nke0 nke0Var) {
        m11398I();
        if (!this.f8745y.mo107792e()) {
            return 0L;
        }
        mke0.C18640a c18640aMo107791d = this.f8745y.mo107791d(j);
        return nke0Var.m163601a(j, c18640aMo107791d.f137283a.f147751a, c18640aMo107791d.f137284b.f147751a);
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m11422g0() {
        return this.f8712D || m11391O();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: h */
    public long mo10982h(long j) {
        m11398I();
        boolean[] zArr = this.f8744x.f8766b;
        if (!this.f8745y.mo107792e()) {
            j = 0;
        }
        int i = 0;
        this.f8712D = false;
        this.f8715G = j;
        if (m11391O()) {
            this.f8716H = j;
            return j;
        }
        if (this.f8710B == 7 || !m11418c0(zArr, j)) {
            this.f8717I = false;
            this.f8716H = j;
            this.f8719K = false;
            if (this.f8731k.m12142j()) {
                C1996q[] c1996qArr = this.f8739s;
                int length = c1996qArr.length;
                while (i < length) {
                    c1996qArr[i].m11507r();
                    i++;
                }
                this.f8731k.m12139f();
                return j;
            }
            this.f8731k.m12140g();
            C1996q[] c1996qArr2 = this.f8739s;
            int length2 = c1996qArr2.length;
            while (i < length2) {
                c1996qArr2[i].m11487U();
                i++;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: i */
    public long mo10983i() {
        if (!this.f8712D) {
            return -9223372036854775807L;
        }
        if (!this.f8719K && m11400L() <= this.f8718J) {
            return -9223372036854775807L;
        }
        this.f8712D = false;
        return this.f8715G;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    public boolean isLoading() {
        return this.f8731k.m12142j() && this.f8733m.m207820d();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2068f
    /* JADX INFO: renamed from: j */
    public void mo11423j() {
        for (C1996q c1996q : this.f8739s) {
            c1996q.m11485S();
        }
        this.f8732l.release();
    }

    @Override // p153l.bsf
    /* JADX INFO: renamed from: k */
    public void mo11424k(final mke0 mke0Var) {
        this.f8736p.post(new Runnable() { // from class: l.y4b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f197444a.m11419d0(mke0Var);
            }
        });
    }

    @Override // p153l.bsf
    /* JADX INFO: renamed from: l */
    public void mo11425l() {
        this.f8741u = true;
        this.f8736p.post(this.f8734n);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: m */
    public ffj0 mo10984m() {
        m11398I();
        return this.f8744x.f8765a;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: p */
    public void mo10987p(InterfaceC1976h.a aVar, long j) {
        this.f8737q = aVar;
        this.f8733m.m207821e();
        m11421f0();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: r */
    public long mo10989r(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr, boolean[] zArr2, long j) {
        u9f u9fVar;
        m11398I();
        e eVar = this.f8744x;
        ffj0 ffj0Var = eVar.f8765a;
        boolean[] zArr3 = eVar.f8767c;
        int i = this.f8713E;
        int i2 = 0;
        for (int i3 = 0; i3 < u9fVarArr.length; i3++) {
            xwd0 xwd0Var = xwd0VarArr[i3];
            if (xwd0Var != null && (u9fVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((c) xwd0Var).f8761a;
                w11.m204371g(zArr3[i4]);
                this.f8713E--;
                zArr3[i4] = false;
                xwd0VarArr[i3] = null;
            }
        }
        boolean z = !this.f8711C ? j == 0 : i != 0;
        for (int i5 = 0; i5 < u9fVarArr.length; i5++) {
            if (xwd0VarArr[i5] == null && (u9fVar = u9fVarArr[i5]) != null) {
                w11.m204371g(u9fVar.length() == 1);
                w11.m204371g(u9fVar.mo11356c(0) == 0);
                int iM125388c = ffj0Var.m125388c(u9fVar.mo11361h());
                w11.m204371g(!zArr3[iM125388c]);
                this.f8713E++;
                zArr3[iM125388c] = true;
                xwd0VarArr[i5] = new c(iM125388c);
                zArr2[i5] = true;
                if (!z) {
                    C1996q c1996q = this.f8739s[iM125388c];
                    z = (c1996q.m11491Y(j, true) || c1996q.m11469C() == 0) ? false : true;
                }
            }
        }
        if (this.f8713E == 0) {
            this.f8717I = false;
            this.f8712D = false;
            boolean zM12142j = this.f8731k.m12142j();
            C1996q[] c1996qArr = this.f8739s;
            if (zM12142j) {
                int length = c1996qArr.length;
                while (i2 < length) {
                    c1996qArr[i2].m11507r();
                    i2++;
                }
                this.f8731k.m12139f();
            } else {
                int length2 = c1996qArr.length;
                while (i2 < length2) {
                    c1996qArr[i2].m11487U();
                    i2++;
                }
            }
        } else if (z) {
            j = mo10982h(j);
            while (i2 < xwd0VarArr.length) {
                if (xwd0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f8711C = true;
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: s */
    public void mo10990s() throws IOException {
        m11407T();
        if (this.f8719K && !this.f8742v) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: t */
    public void mo10991t(long j, boolean z) {
        m11398I();
        if (m11391O()) {
            return;
        }
        boolean[] zArr = this.f8744x.f8767c;
        int length = this.f8739s.length;
        for (int i = 0; i < length; i++) {
            this.f8739s[i].m11506q(j, z, zArr[i]);
        }
    }
}
