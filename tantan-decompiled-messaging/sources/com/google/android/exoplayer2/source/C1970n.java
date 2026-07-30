package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import com.google.android.exoplayer2.drm.InterfaceC1855c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.C1970n;
import com.google.android.exoplayer2.upstream.C2047a;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p149l.a5c;
import p149l.b6j0;
import p149l.d860;
import p149l.fd80;
import p149l.g5c;
import p149l.gwf0;
import p149l.hce0;
import p149l.ice0;
import p149l.lrv;
import p149l.m6j0;
import p149l.n200;
import p149l.nkx;
import p149l.o8f;
import p149l.p11;
import p149l.sj0;
import p149l.ss5;
import p149l.uqf;
import p149l.uyi;
import p149l.vck0;
import p149l.vod0;
import p149l.w4c;
import p149l.z5j0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.n */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1970n implements InterfaceC1953h, uqf, Loader.InterfaceC2041b<a>, Loader.InterfaceC2045f, C1973q.d {

    /* JADX INFO: renamed from: M */
    public static final Map<String, String> f8670M = m11336K();

    /* JADX INFO: renamed from: N */
    public static final C1871k f8671N = new C1871k.b().m10334U("icy").m10346g0("application/x-icy").m10320G();

    /* JADX INFO: renamed from: A */
    public boolean f8672A;

    /* JADX INFO: renamed from: C */
    public boolean f8674C;

    /* JADX INFO: renamed from: D */
    public boolean f8675D;

    /* JADX INFO: renamed from: E */
    public int f8676E;

    /* JADX INFO: renamed from: F */
    public boolean f8677F;

    /* JADX INFO: renamed from: G */
    public long f8678G;

    /* JADX INFO: renamed from: I */
    public boolean f8680I;

    /* JADX INFO: renamed from: J */
    public int f8681J;

    /* JADX INFO: renamed from: K */
    public boolean f8682K;

    /* JADX INFO: renamed from: L */
    public boolean f8683L;

    /* JADX INFO: renamed from: a */
    public final Uri f8684a;

    /* JADX INFO: renamed from: b */
    public final a5c f8685b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1855c f8686c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2049c f8687d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1966j.a f8688e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1854b.a f8689f;

    /* JADX INFO: renamed from: g */
    public final b f8690g;

    /* JADX INFO: renamed from: h */
    public final sj0 f8691h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f8692i;

    /* JADX INFO: renamed from: j */
    public final long f8693j;

    /* JADX INFO: renamed from: l */
    public final InterfaceC1969m f8695l;

    /* JADX INFO: renamed from: q */
    @Nullable
    public InterfaceC1953h.a f8700q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public IcyHeaders f8701r;

    /* JADX INFO: renamed from: u */
    public boolean f8704u;

    /* JADX INFO: renamed from: v */
    public boolean f8705v;

    /* JADX INFO: renamed from: w */
    public boolean f8706w;

    /* JADX INFO: renamed from: x */
    public e f8707x;

    /* JADX INFO: renamed from: y */
    public hce0 f8708y;

    /* JADX INFO: renamed from: k */
    public final Loader f8694k = new Loader("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: m */
    public final ss5 f8696m = new ss5();

    /* JADX INFO: renamed from: n */
    public final Runnable f8697n = new Runnable() { // from class: l.rwa0
        @Override // java.lang.Runnable
        public final void run() {
            this.f161323a.m11350Q();
        }
    };

    /* JADX INFO: renamed from: o */
    public final Runnable f8698o = new Runnable() { // from class: l.swa0
        @Override // java.lang.Runnable
        public final void run() {
            C1970n.m11340w(this.f166643a);
        }
    };

    /* JADX INFO: renamed from: p */
    public final Handler f8699p = vck0.m197896w();

    /* JADX INFO: renamed from: t */
    public d[] f8703t = new d[0];

    /* JADX INFO: renamed from: s */
    public C1973q[] f8702s = new C1973q[0];

    /* JADX INFO: renamed from: H */
    public long f8679H = -9223372036854775807L;

    /* JADX INFO: renamed from: z */
    public long f8709z = -9223372036854775807L;

    /* JADX INFO: renamed from: B */
    public int f8673B = 1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$a */
    public final class a implements Loader.InterfaceC2044e, C1950e.a {

        /* JADX INFO: renamed from: b */
        public final Uri f8711b;

        /* JADX INFO: renamed from: c */
        public final gwf0 f8712c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC1969m f8713d;

        /* JADX INFO: renamed from: e */
        public final uqf f8714e;

        /* JADX INFO: renamed from: f */
        public final ss5 f8715f;

        /* JADX INFO: renamed from: h */
        public volatile boolean f8717h;

        /* JADX INFO: renamed from: j */
        public long f8719j;

        /* JADX INFO: renamed from: l */
        @Nullable
        public m6j0 f8721l;

        /* JADX INFO: renamed from: m */
        public boolean f8722m;

        /* JADX INFO: renamed from: g */
        public final fd80 f8716g = new fd80();

        /* JADX INFO: renamed from: i */
        public boolean f8718i = true;

        /* JADX INFO: renamed from: a */
        public final long f8710a = lrv.m151512a();

        /* JADX INFO: renamed from: k */
        public C2047a f8720k = m11379i(0);

        public a(Uri uri, a5c a5cVar, InterfaceC1969m interfaceC1969m, uqf uqfVar, ss5 ss5Var) {
            this.f8711b = uri;
            this.f8712c = new gwf0(a5cVar);
            this.f8713d = interfaceC1969m;
            this.f8714e = uqfVar;
            this.f8715f = ss5Var;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
        /* JADX INFO: renamed from: a */
        public void mo11377a() throws IOException {
            int iMo11324c = 0;
            while (iMo11324c == 0 && !this.f8717h) {
                try {
                    long j = this.f8716g.f97018a;
                    C2047a c2047aM11379i = m11379i(j);
                    this.f8720k = c2047aM11379i;
                    long jMo11125n = this.f8712c.mo11125n(c2047aM11379i);
                    if (jMo11125n != -1) {
                        jMo11125n += j;
                        C1970n.this.m11355V();
                    }
                    long j2 = jMo11125n;
                    C1970n.this.f8701r = IcyHeaders.m10554a(this.f8712c.mo11122b());
                    w4c c1950e = this.f8712c;
                    if (C1970n.this.f8701r != null && C1970n.this.f8701r.metadataInterval != -1) {
                        c1950e = new C1950e(this.f8712c, C1970n.this.f8701r.metadataInterval, this);
                        m6j0 m6j0VarM11348N = C1970n.this.m11348N();
                        this.f8721l = m6j0VarM11348N;
                        m6j0VarM11348N.mo11110b(C1970n.f8671N);
                    }
                    this.f8713d.mo11326e(c1950e, this.f8711b, this.f8712c.mo11122b(), j, j2, this.f8714e);
                    if (C1970n.this.f8701r != null) {
                        this.f8713d.mo11325d();
                    }
                    if (this.f8718i) {
                        this.f8713d.mo11322a(j, this.f8719j);
                        this.f8718i = false;
                    }
                    while (iMo11324c == 0 && !this.f8717h) {
                        try {
                            this.f8715f.m185710a();
                            iMo11324c = this.f8713d.mo11324c(this.f8716g);
                            long jMo11323b = this.f8713d.mo11323b();
                            if (jMo11323b > C1970n.this.f8693j + j) {
                                this.f8715f.m185712c();
                                C1970n.this.f8699p.post(C1970n.this.f8698o);
                                j = jMo11323b;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iMo11324c == 1) {
                        iMo11324c = 0;
                    } else if (this.f8713d.mo11323b() != -1) {
                        this.f8716g.f97018a = this.f8713d.mo11323b();
                    }
                    g5c.m124484a(this.f8712c);
                } catch (Throwable th) {
                    if (iMo11324c != 1 && this.f8713d.mo11323b() != -1) {
                        this.f8716g.f97018a = this.f8713d.mo11323b();
                    }
                    g5c.m124484a(this.f8712c);
                    throw th;
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.C1950e.a
        /* JADX INFO: renamed from: b */
        public void mo11126b(d860 d860Var) {
            long jMax = !this.f8722m ? this.f8719j : Math.max(C1970n.this.m11347M(true), this.f8719j);
            int iM110295a = d860Var.m110295a();
            m6j0 m6j0Var = (m6j0) p11.m167011e(this.f8721l);
            m6j0Var.m153238d(d860Var, iM110295a);
            m6j0Var.mo11109a(jMax, 1, iM110295a, 0, null);
            this.f8722m = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
        /* JADX INFO: renamed from: c */
        public void mo11378c() {
            this.f8717h = true;
        }

        /* JADX INFO: renamed from: i */
        public final C2047a m11379i(long j) {
            return new C2047a.b().m12116i(this.f8711b).m12115h(j).m12113f(C1970n.this.f8692i).m12109b(6).m12112e(C1970n.f8670M).m12108a();
        }

        /* JADX INFO: renamed from: j */
        public final void m11380j(long j, long j2) {
            this.f8716g.f97018a = j;
            this.f8719j = j2;
            this.f8718i = true;
            this.f8722m = false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo11381a(long j, boolean z, boolean z2);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$c */
    public final class c implements vod0 {

        /* JADX INFO: renamed from: a */
        public final int f8724a;

        public c(int i) {
            this.f8724a = i;
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: a */
        public void mo10939a() throws IOException {
            C1970n.this.m11354U(this.f8724a);
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: b */
        public boolean mo10940b() {
            return C1970n.this.m11349P(this.f8724a);
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: k */
        public int mo10942k(long j) {
            return C1970n.this.m11366e0(this.f8724a, j);
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: l */
        public int mo10943l(uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i) {
            return C1970n.this.m11361a0(this.f8724a, uyiVar, decoderInputBuffer, i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final int f8726a;

        /* JADX INFO: renamed from: b */
        public final boolean f8727b;

        public d(int i, boolean z) {
            this.f8726a = i;
            this.f8727b = z;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f8726a == dVar.f8726a && this.f8727b == dVar.f8727b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f8726a * 31) + (this.f8727b ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final b6j0 f8728a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f8729b;

        /* JADX INFO: renamed from: c */
        public final boolean[] f8730c;

        /* JADX INFO: renamed from: d */
        public final boolean[] f8731d;

        public e(b6j0 b6j0Var, boolean[] zArr) {
            this.f8728a = b6j0Var;
            this.f8729b = zArr;
            int i = b6j0Var.f73826a;
            this.f8730c = new boolean[i];
            this.f8731d = new boolean[i];
        }
    }

    public C1970n(Uri uri, a5c a5cVar, InterfaceC1969m interfaceC1969m, InterfaceC1855c interfaceC1855c, InterfaceC1854b.a aVar, InterfaceC2049c interfaceC2049c, InterfaceC1966j.a aVar2, b bVar, sj0 sj0Var, @Nullable String str, int i) {
        this.f8684a = uri;
        this.f8685b = a5cVar;
        this.f8686c = interfaceC1855c;
        this.f8689f = aVar;
        this.f8687d = interfaceC2049c;
        this.f8688e = aVar2;
        this.f8690g = bVar;
        this.f8691h = sj0Var;
        this.f8692i = str;
        this.f8693j = i;
        this.f8695l = interfaceC1969m;
    }

    /* JADX INFO: renamed from: K */
    public static Map<String, String> m11336K() {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: O */
    private boolean m11337O() {
        return this.f8679H != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m11340w(C1970n c1970n) {
        if (c1970n.f8683L) {
            return;
        }
        ((InterfaceC1953h.a) p11.m167011e(c1970n.f8700q)).mo10216j(c1970n);
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* JADX INFO: renamed from: I */
    public final void m11344I() {
        p11.m167013g(this.f8705v);
        p11.m167011e(this.f8707x);
        p11.m167011e(this.f8708y);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m11345J(a aVar, int i) {
        hce0 hce0Var;
        if (this.f8677F || !((hce0Var = this.f8708y) == null || hce0Var.mo98123i() == -9223372036854775807L)) {
            this.f8681J = i;
            return true;
        }
        if (this.f8705v && !m11368g0()) {
            this.f8680I = true;
            return false;
        }
        this.f8675D = this.f8705v;
        this.f8678G = 0L;
        this.f8681J = 0;
        for (C1973q c1973q : this.f8702s) {
            c1973q.m11433U();
        }
        aVar.m11380j(0L, 0L);
        return true;
    }

    /* JADX INFO: renamed from: L */
    public final int m11346L() {
        int iM11419G = 0;
        for (C1973q c1973q : this.f8702s) {
            iM11419G += c1973q.m11419G();
        }
        return iM11419G;
    }

    /* JADX INFO: renamed from: M */
    public final long m11347M(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.f8702s.length; i++) {
            if (z || ((e) p11.m167011e(this.f8707x)).f8730c[i]) {
                jMax = Math.max(jMax, this.f8702s[i].m11461z());
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: N */
    public m6j0 m11348N() {
        return m11359Z(new d(0, true));
    }

    /* JADX INFO: renamed from: P */
    public boolean m11349P(int i) {
        return !m11368g0() && this.f8702s[i].m11423K(this.f8682K);
    }

    /* JADX INFO: renamed from: Q */
    public final void m11350Q() {
        if (this.f8683L || this.f8705v || !this.f8704u || this.f8708y == null) {
            return;
        }
        for (C1973q c1973q : this.f8702s) {
            if (c1973q.m11418F() == null) {
                return;
            }
        }
        this.f8696m.m185712c();
        int length = this.f8702s.length;
        z5j0[] z5j0VarArr = new z5j0[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            C1871k c1871kM10320G = (C1871k) p11.m167011e(this.f8702s[i].m11418F());
            String str = c1871kM10320G.f7748l;
            boolean zM157533o = n200.m157533o(str);
            boolean z = zM157533o || n200.m157537s(str);
            zArr[i] = z;
            this.f8706w = z | this.f8706w;
            IcyHeaders icyHeaders = this.f8701r;
            if (icyHeaders != null) {
                if (zM157533o || this.f8703t[i].f8727b) {
                    Metadata metadata = c1871kM10320G.f7746j;
                    c1871kM10320G = c1871kM10320G.m10282b().m10339Z(metadata == null ? new Metadata(icyHeaders) : metadata.m10529a(icyHeaders)).m10320G();
                }
                if (zM157533o && c1871kM10320G.f7742f == -1 && c1871kM10320G.f7743g == -1 && icyHeaders.bitrate != -1) {
                    c1871kM10320G = c1871kM10320G.m10282b().m10322I(icyHeaders.bitrate).m10320G();
                }
            }
            z5j0VarArr[i] = new z5j0(Integer.toString(i), c1871kM10320G.m10283c(this.f8686c.mo9876c(c1871kM10320G)));
        }
        this.f8707x = new e(new b6j0(z5j0VarArr), zArr);
        this.f8705v = true;
        ((InterfaceC1953h.a) p11.m167011e(this.f8700q)).mo10221l(this);
    }

    /* JADX INFO: renamed from: R */
    public final void m11351R(int i) {
        m11344I();
        e eVar = this.f8707x;
        boolean[] zArr = eVar.f8731d;
        if (zArr[i]) {
            return;
        }
        C1871k c1871kM217358c = eVar.f8728a.m100410b(i).m217358c(0);
        this.f8688e.m11278h(n200.m157529k(c1871kM217358c.f7748l), c1871kM217358c, 0, null, this.f8678G);
        zArr[i] = true;
    }

    /* JADX INFO: renamed from: S */
    public final void m11352S(int i) {
        m11344I();
        boolean[] zArr = this.f8707x.f8729b;
        if (this.f8680I && zArr[i]) {
            if (this.f8702s[i].m11423K(false)) {
                return;
            }
            this.f8679H = 0L;
            this.f8680I = false;
            this.f8675D = true;
            this.f8678G = 0L;
            this.f8681J = 0;
            for (C1973q c1973q : this.f8702s) {
                c1973q.m11433U();
            }
            ((InterfaceC1953h.a) p11.m167011e(this.f8700q)).mo10216j(this);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m11353T() throws IOException {
        this.f8694k.m12089k(this.f8687d.mo12120d(this.f8673B));
    }

    /* JADX INFO: renamed from: U */
    public void m11354U(int i) throws IOException {
        this.f8702s[i].m11425M();
        m11353T();
    }

    /* JADX INFO: renamed from: V */
    public final void m11355V() {
        this.f8699p.post(new Runnable() { // from class: l.twa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f172384a.f8677F = true;
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo11024n(a aVar, long j, long j2, boolean z) {
        gwf0 gwf0Var = aVar.f8712c;
        lrv lrvVar = new lrv(aVar.f8710a, aVar.f8720k, gwf0Var.m128403q(), gwf0Var.m128404r(), j, j2, gwf0Var.m128402j());
        this.f8687d.m12122c(aVar.f8710a);
        this.f8688e.m11281k(lrvVar, 1, -1, null, 0, null, aVar.f8719j, this.f8709z);
        if (z) {
            return;
        }
        for (C1973q c1973q : this.f8702s) {
            c1973q.m11433U();
        }
        if (this.f8676E > 0) {
            ((InterfaceC1953h.a) p11.m167011e(this.f8700q)).mo10216j(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo11025o(a aVar, long j, long j2) {
        hce0 hce0Var;
        if (this.f8709z == -9223372036854775807L && (hce0Var = this.f8708y) != null) {
            boolean zMo98122e = hce0Var.mo98122e();
            long jM11347M = m11347M(true);
            long j3 = jM11347M == Long.MIN_VALUE ? 0L : jM11347M + 10000;
            this.f8709z = j3;
            this.f8690g.mo11381a(j3, zMo98122e, this.f8672A);
        }
        gwf0 gwf0Var = aVar.f8712c;
        lrv lrvVar = new lrv(aVar.f8710a, aVar.f8720k, gwf0Var.m128403q(), gwf0Var.m128404r(), j, j2, gwf0Var.m128402j());
        this.f8687d.m12122c(aVar.f8710a);
        this.f8688e.m11284n(lrvVar, 1, -1, null, 0, null, aVar.f8719j, this.f8709z);
        this.f8682K = true;
        ((InterfaceC1953h.a) p11.m167011e(this.f8700q)).mo10216j(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Loader.C2042c mo11026q(a aVar, long j, long j2, IOException iOException, int i) {
        a aVar2;
        Loader.C2042c c2042cM12084h;
        gwf0 gwf0Var = aVar.f8712c;
        lrv lrvVar = new lrv(aVar.f8710a, aVar.f8720k, gwf0Var.m128403q(), gwf0Var.m128404r(), j, j2, gwf0Var.m128402j());
        long jMo12118a = this.f8687d.mo12118a(new InterfaceC2049c.c(lrvVar, new nkx(1, -1, null, 0, null, vck0.m197874l1(aVar.f8719j), vck0.m197874l1(this.f8709z)), iOException, i));
        if (jMo12118a == -9223372036854775807L) {
            c2042cM12084h = Loader.f9459g;
            aVar2 = aVar;
        } else {
            int iM11346L = m11346L();
            aVar2 = aVar;
            c2042cM12084h = m11345J(aVar2, iM11346L) ? Loader.m12084h(iM11346L > this.f8681J, jMo12118a) : Loader.f9458f;
        }
        boolean zM12095c = c2042cM12084h.m12095c();
        this.f8688e.m11286p(lrvVar, 1, -1, null, 0, null, aVar2.f8719j, this.f8709z, iOException, !zM12095c);
        if (!zM12095c) {
            this.f8687d.m12122c(aVar2.f8710a);
        }
        return c2042cM12084h;
    }

    /* JADX INFO: renamed from: Z */
    public final m6j0 m11359Z(d dVar) {
        int length = this.f8702s.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.f8703t[i])) {
                return this.f8702s[i];
            }
        }
        C1973q c1973qM11411k = C1973q.m11411k(this.f8691h, this.f8686c, this.f8689f);
        c1973qM11411k.m11441c0(this);
        int i2 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f8703t, i2);
        dVarArr[length] = dVar;
        this.f8703t = (d[]) vck0.m197869k(dVarArr);
        C1973q[] c1973qArr = (C1973q[]) Arrays.copyOf(this.f8702s, i2);
        c1973qArr[length] = c1973qM11411k;
        this.f8702s = (C1973q[]) vck0.m197869k(c1973qArr);
        return c1973qM11411k;
    }

    @Override // com.google.android.exoplayer2.source.C1973q.d
    /* JADX INFO: renamed from: a */
    public void mo11360a(C1871k c1871k) {
        this.f8699p.post(this.f8697n);
    }

    /* JADX INFO: renamed from: a0 */
    public int m11361a0(int i, uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (m11368g0()) {
            return -3;
        }
        m11351R(i);
        int iM11430R = this.f8702s[i].m11430R(uyiVar, decoderInputBuffer, i2, this.f8682K);
        if (iM11430R == -3) {
            m11352S(i);
        }
        return iM11430R;
    }

    @Override // p149l.uqf
    /* JADX INFO: renamed from: b */
    public m6j0 mo11362b(int i, int i2) {
        return m11359Z(new d(i, false));
    }

    /* JADX INFO: renamed from: b0 */
    public void m11363b0() {
        if (this.f8705v) {
            for (C1973q c1973q : this.f8702s) {
                c1973q.m11429Q();
            }
        }
        this.f8694k.m12091m(this);
        this.f8699p.removeCallbacksAndMessages(null);
        this.f8700q = null;
        this.f8683L = true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: c */
    public boolean mo10923c(long j) {
        if (this.f8682K || this.f8694k.m12087i() || this.f8680I) {
            return false;
        }
        if (this.f8705v && this.f8676E == 0) {
            return false;
        }
        boolean zM185714e = this.f8696m.m185714e();
        if (this.f8694k.m12088j()) {
            return zM185714e;
        }
        m11367f0();
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m11364c0(boolean[] zArr, long j) {
        int length = this.f8702s.length;
        for (int i = 0; i < length; i++) {
            if (!this.f8702s[i].m11437Y(j, false) && (zArr[i] || !this.f8706w)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: d */
    public long mo10924d() {
        long jM11347M;
        m11344I();
        if (this.f8682K || this.f8676E == 0) {
            return Long.MIN_VALUE;
        }
        if (m11337O()) {
            return this.f8679H;
        }
        if (this.f8706w) {
            int length = this.f8702s.length;
            jM11347M = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                e eVar = this.f8707x;
                if (eVar.f8729b[i] && eVar.f8730c[i] && !this.f8702s[i].m11422J()) {
                    jM11347M = Math.min(jM11347M, this.f8702s[i].m11461z());
                }
            }
        } else {
            jM11347M = Long.MAX_VALUE;
        }
        if (jM11347M == Long.MAX_VALUE) {
            jM11347M = m11347M(false);
        }
        return jM11347M == Long.MIN_VALUE ? this.f8678G : jM11347M;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m11365d0(hce0 hce0Var) {
        this.f8708y = this.f8701r == null ? hce0Var : new hce0.C17275b(-9223372036854775807L);
        this.f8709z = hce0Var.mo98123i();
        boolean z = !this.f8677F && hce0Var.mo98123i() == -9223372036854775807L;
        this.f8672A = z;
        this.f8673B = z ? 7 : 1;
        this.f8690g.mo11381a(this.f8709z, hce0Var.mo98122e(), this.f8672A);
        if (this.f8705v) {
            return;
        }
        m11350Q();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: e */
    public void mo10925e(long j) {
    }

    /* JADX INFO: renamed from: e0 */
    public int m11366e0(int i, long j) throws Throwable {
        if (m11368g0()) {
            return 0;
        }
        m11351R(i);
        C1973q c1973q = this.f8702s[i];
        int iM11417E = c1973q.m11417E(j, this.f8682K);
        c1973q.m11442d0(iM11417E);
        if (iM11417E == 0) {
            m11352S(i);
        }
        return iM11417E;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: f */
    public long mo10926f() {
        return mo10924d();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m11367f0() {
        a aVar = new a(this.f8684a, this.f8685b, this.f8695l, this, this.f8696m);
        if (this.f8705v) {
            p11.m167013g(m11337O());
            long j = this.f8709z;
            if (j != -9223372036854775807L && this.f8679H > j) {
                this.f8682K = true;
                this.f8679H = -9223372036854775807L;
                return;
            }
            aVar.m11380j(((hce0) p11.m167011e(this.f8708y)).mo98121d(this.f8679H).f107040a.f117296b, this.f8679H);
            for (C1973q c1973q : this.f8702s) {
                c1973q.m11439a0(this.f8679H);
            }
            this.f8679H = -9223372036854775807L;
        }
        this.f8681J = m11346L();
        this.f8688e.m11290t(new lrv(aVar.f8710a, aVar.f8720k, this.f8694k.m12092n(aVar, this, this.f8687d.mo12120d(this.f8673B))), 1, -1, null, 0, null, aVar.f8719j, this.f8709z);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: g */
    public long mo10927g(long j, ice0 ice0Var) {
        m11344I();
        if (!this.f8708y.mo98122e()) {
            return 0L;
        }
        hce0.C17274a c17274aMo98121d = this.f8708y.mo98121d(j);
        return ice0Var.m135351a(j, c17274aMo98121d.f107040a.f117295a, c17274aMo98121d.f107041b.f117295a);
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m11368g0() {
        return this.f8675D || m11337O();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: h */
    public long mo10928h(long j) {
        m11344I();
        boolean[] zArr = this.f8707x.f8729b;
        if (!this.f8708y.mo98122e()) {
            j = 0;
        }
        int i = 0;
        this.f8675D = false;
        this.f8678G = j;
        if (m11337O()) {
            this.f8679H = j;
            return j;
        }
        if (this.f8673B == 7 || !m11364c0(zArr, j)) {
            this.f8680I = false;
            this.f8679H = j;
            this.f8682K = false;
            if (this.f8694k.m12088j()) {
                C1973q[] c1973qArr = this.f8702s;
                int length = c1973qArr.length;
                while (i < length) {
                    c1973qArr[i].m11453r();
                    i++;
                }
                this.f8694k.m12085f();
                return j;
            }
            this.f8694k.m12086g();
            C1973q[] c1973qArr2 = this.f8702s;
            int length2 = c1973qArr2.length;
            while (i < length2) {
                c1973qArr2[i].m11433U();
                i++;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: i */
    public long mo10929i() {
        if (!this.f8675D) {
            return -9223372036854775807L;
        }
        if (!this.f8682K && m11346L() <= this.f8681J) {
            return -9223372036854775807L;
        }
        this.f8675D = false;
        return this.f8678G;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    public boolean isLoading() {
        return this.f8694k.m12088j() && this.f8696m.m185713d();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2045f
    /* JADX INFO: renamed from: j */
    public void mo11369j() {
        for (C1973q c1973q : this.f8702s) {
            c1973q.m11431S();
        }
        this.f8695l.release();
    }

    @Override // p149l.uqf
    /* JADX INFO: renamed from: k */
    public void mo11370k(final hce0 hce0Var) {
        this.f8699p.post(new Runnable() { // from class: l.uwa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f178634a.m11365d0(hce0Var);
            }
        });
    }

    @Override // p149l.uqf
    /* JADX INFO: renamed from: l */
    public void mo11371l() {
        this.f8704u = true;
        this.f8699p.post(this.f8697n);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: m */
    public b6j0 mo10930m() {
        m11344I();
        return this.f8707x.f8728a;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: p */
    public void mo10933p(InterfaceC1953h.a aVar, long j) {
        this.f8700q = aVar;
        this.f8696m.m185714e();
        m11367f0();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: r */
    public long mo10935r(o8f[] o8fVarArr, boolean[] zArr, vod0[] vod0VarArr, boolean[] zArr2, long j) {
        o8f o8fVar;
        m11344I();
        e eVar = this.f8707x;
        b6j0 b6j0Var = eVar.f8728a;
        boolean[] zArr3 = eVar.f8730c;
        int i = this.f8676E;
        int i2 = 0;
        for (int i3 = 0; i3 < o8fVarArr.length; i3++) {
            vod0 vod0Var = vod0VarArr[i3];
            if (vod0Var != null && (o8fVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((c) vod0Var).f8724a;
                p11.m167013g(zArr3[i4]);
                this.f8676E--;
                zArr3[i4] = false;
                vod0VarArr[i3] = null;
            }
        }
        boolean z = !this.f8674C ? j == 0 : i != 0;
        for (int i5 = 0; i5 < o8fVarArr.length; i5++) {
            if (vod0VarArr[i5] == null && (o8fVar = o8fVarArr[i5]) != null) {
                p11.m167013g(o8fVar.length() == 1);
                p11.m167013g(o8fVar.mo11302c(0) == 0);
                int iM100411c = b6j0Var.m100411c(o8fVar.mo11307h());
                p11.m167013g(!zArr3[iM100411c]);
                this.f8676E++;
                zArr3[iM100411c] = true;
                vod0VarArr[i5] = new c(iM100411c);
                zArr2[i5] = true;
                if (!z) {
                    C1973q c1973q = this.f8702s[iM100411c];
                    z = (c1973q.m11437Y(j, true) || c1973q.m11415C() == 0) ? false : true;
                }
            }
        }
        if (this.f8676E == 0) {
            this.f8680I = false;
            this.f8675D = false;
            boolean zM12088j = this.f8694k.m12088j();
            C1973q[] c1973qArr = this.f8702s;
            if (zM12088j) {
                int length = c1973qArr.length;
                while (i2 < length) {
                    c1973qArr[i2].m11453r();
                    i2++;
                }
                this.f8694k.m12085f();
            } else {
                int length2 = c1973qArr.length;
                while (i2 < length2) {
                    c1973qArr[i2].m11433U();
                    i2++;
                }
            }
        } else if (z) {
            j = mo10928h(j);
            while (i2 < vod0VarArr.length) {
                if (vod0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f8674C = true;
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: s */
    public void mo10936s() throws IOException {
        m11353T();
        if (this.f8682K && !this.f8705v) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: t */
    public void mo10937t(long j, boolean z) {
        m11344I();
        if (m11337O()) {
            return;
        }
        boolean[] zArr = this.f8707x.f8730c;
        int length = this.f8702s.length;
        for (int i = 0; i < length; i++) {
            this.f8702s[i].m11452q(j, z, zArr[i]);
        }
    }
}
