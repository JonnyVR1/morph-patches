package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.C1876a;
import com.google.android.exoplayer2.drm.InterfaceC1878c;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.AbstractC1957a;
import com.google.android.exoplayer2.source.InterfaceC1976h;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.android.exoplayer2.source.InterfaceC1989j;
import com.google.android.exoplayer2.source.InterfaceC1990k;
import com.google.android.exoplayer2.upstream.C2071b;
import com.google.android.exoplayer2.upstream.C2073d;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.math.LongMath;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import p153l.bmk0;
import p153l.et4;
import p153l.et5;
import p153l.g6c;
import p153l.h4c;
import p153l.hs2;
import p153l.i4c;
import p153l.ktx;
import p153l.kyv;
import p153l.l4c;
import p153l.llk0;
import p153l.mr60;
import p153l.mre0;
import p153l.mtv;
import p153l.nni;
import p153l.oj0;
import p153l.pgj0;
import p153l.snd;
import p153l.t1d0;
import p153l.t9f;
import p153l.vtv;
import p153l.w11;
import p153l.y70;
import p153l.ysf0;
import p153l.zb5;
import p153l.zde;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class DashMediaSource extends AbstractC1957a {

    /* JADX INFO: renamed from: A */
    public Uri f8359A;

    /* JADX INFO: renamed from: B */
    public h4c f8360B;

    /* JADX INFO: renamed from: C */
    public boolean f8361C;

    /* JADX INFO: renamed from: D */
    public long f8362D;

    /* JADX INFO: renamed from: E */
    public long f8363E;

    /* JADX INFO: renamed from: F */
    public long f8364F;

    /* JADX INFO: renamed from: G */
    public int f8365G;

    /* JADX INFO: renamed from: H */
    public long f8366H;

    /* JADX INFO: renamed from: I */
    public int f8367I;

    /* JADX INFO: renamed from: a */
    public final C1944n f8368a;

    /* JADX INFO: renamed from: b */
    public final boolean f8369b;

    /* JADX INFO: renamed from: c */
    public final g6c.InterfaceC17163a f8370c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1969a.a f8371d;

    /* JADX INFO: renamed from: e */
    public final et5 f8372e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1878c f8373f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2072c f8374g;

    /* JADX INFO: renamed from: h */
    public final hs2 f8375h;

    /* JADX INFO: renamed from: i */
    public final long f8376i;

    /* JADX INFO: renamed from: j */
    public final long f8377j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1989j.a f8378k;

    /* JADX INFO: renamed from: l */
    public final C2073d.a<? extends h4c> f8379l;

    /* JADX INFO: renamed from: m */
    public final C1965e f8380m;

    /* JADX INFO: renamed from: n */
    public final Object f8381n;

    /* JADX INFO: renamed from: o */
    public final SparseArray<C1970b> f8382o;

    /* JADX INFO: renamed from: p */
    public final Runnable f8383p;

    /* JADX INFO: renamed from: q */
    public final Runnable f8384q;

    /* JADX INFO: renamed from: r */
    public final C1972d.b f8385r;

    /* JADX INFO: renamed from: s */
    public final vtv f8386s;

    /* JADX INFO: renamed from: t */
    public g6c f8387t;

    /* JADX INFO: renamed from: u */
    public Loader f8388u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public pgj0 f8389v;

    /* JADX INFO: renamed from: w */
    public IOException f8390w;

    /* JADX INFO: renamed from: x */
    public Handler f8391x;

    /* JADX INFO: renamed from: y */
    public C1944n.g f8392y;

    /* JADX INFO: renamed from: z */
    public Uri f8393z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$a */
    public class C1961a implements ysf0.InterfaceC21673b {
        public C1961a() {
        }

        @Override // p153l.ysf0.InterfaceC21673b
        /* JADX INFO: renamed from: a */
        public void mo11067a() {
            DashMediaSource.this.m11062z(ysf0.m217247h());
        }

        @Override // p153l.ysf0.InterfaceC21673b
        /* JADX INFO: renamed from: b */
        public void mo11068b(IOException iOException) {
            DashMediaSource.this.m11061y(iOException);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$b */
    public static final class C1962b extends AbstractC1857c0 {

        /* JADX INFO: renamed from: f */
        public final long f8405f;

        /* JADX INFO: renamed from: g */
        public final long f8406g;

        /* JADX INFO: renamed from: h */
        public final long f8407h;

        /* JADX INFO: renamed from: i */
        public final int f8408i;

        /* JADX INFO: renamed from: j */
        public final long f8409j;

        /* JADX INFO: renamed from: k */
        public final long f8410k;

        /* JADX INFO: renamed from: l */
        public final long f8411l;

        /* JADX INFO: renamed from: m */
        public final h4c f8412m;

        /* JADX INFO: renamed from: n */
        public final C1944n f8413n;

        /* JADX INFO: renamed from: o */
        @Nullable
        public final C1944n.g f8414o;

        public C1962b(long j, long j2, long j3, int i, long j4, long j5, long j6, h4c h4cVar, C1944n c1944n, @Nullable C1944n.g gVar) {
            w11.m204371g(h4cVar.f107779d == (gVar != null));
            this.f8405f = j;
            this.f8406g = j2;
            this.f8407h = j3;
            this.f8408i = i;
            this.f8409j = j4;
            this.f8410k = j5;
            this.f8411l = j6;
            this.f8412m = h4cVar;
            this.f8413n = c1944n;
            this.f8414o = gVar;
        }

        /* JADX INFO: renamed from: x */
        public static boolean m11069x(h4c h4cVar) {
            return h4cVar.f107779d && h4cVar.f107780e != -9223372036854775807L && h4cVar.f107777b == -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: f */
        public int mo9450f(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f8408i) >= 0 && iIntValue < mo9771m()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: k */
        public AbstractC1857c0.b mo9453k(int i, AbstractC1857c0.b bVar, boolean z) {
            w11.m204367c(i, 0, mo9771m());
            return bVar.m9799v(z ? this.f8412m.m133557d(i).f138300a : null, z ? Integer.valueOf(this.f8408i + i) : null, 0, this.f8412m.m133560g(i), bmk0.m105084J0(this.f8412m.m133557d(i).f138301b - this.f8412m.m133557d(0).f138301b) - this.f8409j);
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: m */
        public int mo9771m() {
            return this.f8412m.m133558e();
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: q */
        public Object mo9456q(int i) {
            w11.m204367c(i, 0, mo9771m());
            return Integer.valueOf(this.f8408i + i);
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: s */
        public AbstractC1857c0.d mo9457s(int i, AbstractC1857c0.d dVar, long j) {
            w11.m204367c(i, 0, 1);
            long jM11070w = m11070w(j);
            Object obj = AbstractC1857c0.d.f7356r;
            C1944n c1944n = this.f8413n;
            h4c h4cVar = this.f8412m;
            return dVar.m9809i(obj, c1944n, h4cVar, this.f8405f, this.f8406g, this.f8407h, true, m11069x(h4cVar), this.f8414o, jM11070w, this.f8410k, 0, mo9771m() - 1, this.f8409j);
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: t */
        public int mo9775t() {
            return 1;
        }

        /* JADX INFO: renamed from: w */
        public final long m11070w(long j) {
            l4c l4cVarMo188900b;
            long j2 = this.f8411l;
            if (!m11069x(this.f8412m)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.f8410k) {
                    return -9223372036854775807L;
                }
            }
            long j3 = this.f8409j + j2;
            long jM133560g = this.f8412m.m133560g(0);
            int i = 0;
            while (i < this.f8412m.m133558e() - 1 && j3 >= jM133560g) {
                j3 -= jM133560g;
                i++;
                jM133560g = this.f8412m.m133560g(i);
            }
            mr60 mr60VarM133557d = this.f8412m.m133557d(i);
            int iM159622a = mr60VarM133557d.m159622a(2);
            return (iM159622a == -1 || (l4cVarMo188900b = mr60VarM133557d.f138302c.get(iM159622a).f197729c.get(0).mo188900b()) == null || l4cVarMo188900b.mo152756h(jM133560g) == 0) ? j2 : (j2 + l4cVarMo188900b.mo152751c(l4cVarMo188900b.mo152755g(j3, jM133560g))) - j3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$d */
    public static final class C1964d implements C2073d.a<Long> {

        /* JADX INFO: renamed from: a */
        public static final Pattern f8416a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // com.google.android.exoplayer2.upstream.C2073d.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo11073a(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, et4.f95689c)).readLine();
            try {
                Matcher matcher = f8416a.matcher(line);
                if (!matcher.matches()) {
                    throw ParserException.createForMalformedManifest("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = Marker.ANY_NON_NULL_MARKER.equals(matcher.group(4)) ? 1L : -1L;
                    long j2 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j * (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * Constants.ONE_MIN_IN_MILLIS);
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw ParserException.createForMalformedManifest(null, e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$f */
    public final class C1966f implements vtv {
        public C1966f() {
        }

        @Override // p153l.vtv
        /* JADX INFO: renamed from: a */
        public void mo11081a() throws IOException {
            DashMediaSource.this.f8388u.mo11081a();
            m11082b();
        }

        /* JADX INFO: renamed from: b */
        public final void m11082b() throws IOException {
            if (DashMediaSource.this.f8390w != null) {
                throw DashMediaSource.this.f8390w;
            }
        }
    }

    static {
        t9f.m189752a("goog.exo.dash");
    }

    public DashMediaSource(C1944n c1944n, @Nullable h4c h4cVar, @Nullable g6c.InterfaceC17163a interfaceC17163a, @Nullable C2073d.a<? extends h4c> aVar, InterfaceC1969a.a aVar2, et5 et5Var, @Nullable zb5 zb5Var, InterfaceC1878c interfaceC1878c, InterfaceC2072c interfaceC2072c, long j, long j2) {
        this.f8368a = c1944n;
        this.f8392y = c1944n.f7999d;
        this.f8393z = ((C1944n.h) w11.m204369e(c1944n.f7997b)).f8094a;
        this.f8359A = c1944n.f7997b.f8094a;
        this.f8360B = h4cVar;
        this.f8370c = interfaceC17163a;
        this.f8379l = aVar;
        this.f8371d = aVar2;
        this.f8373f = interfaceC1878c;
        this.f8374g = interfaceC2072c;
        this.f8376i = j;
        this.f8377j = j2;
        this.f8372e = et5Var;
        this.f8375h = new hs2();
        boolean z = h4cVar != null;
        this.f8369b = z;
        C1961a c1961a = null;
        this.f8378k = createEventDispatcher(null);
        this.f8381n = new Object();
        this.f8382o = new SparseArray<>();
        this.f8385r = new C1963c(this, c1961a);
        this.f8366H = -9223372036854775807L;
        this.f8364F = -9223372036854775807L;
        if (!z) {
            this.f8380m = new C1965e(this, c1961a);
            this.f8386s = new C1966f();
            this.f8383p = new Runnable() { // from class: l.j4c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f118283a.m11033G();
                }
            };
            this.f8384q = new Runnable() { // from class: l.k4c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123879a.m11045A(false);
                }
            };
            return;
        }
        w11.m204371g(true ^ h4cVar.f107779d);
        this.f8380m = null;
        this.f8383p = null;
        this.f8384q = null;
        this.f8386s = new vtv.C20933a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m11033G() {
        Uri uri;
        this.f8391x.removeCallbacks(this.f8383p);
        if (this.f8388u.m12141i()) {
            return;
        }
        if (this.f8388u.m12142j()) {
            this.f8361C = true;
            return;
        }
        synchronized (this.f8381n) {
            uri = this.f8393z;
        }
        this.f8361C = false;
        m11050F(new C2073d(this.f8387t, uri, 4, this.f8379l), this.f8380m, this.f8374g.mo12174d(4));
    }

    /* JADX INFO: renamed from: h */
    public static long m11040h(mr60 mr60Var, long j, long j2) {
        long jM105084J0 = bmk0.m105084J0(mr60Var.f138301b);
        boolean zM11043l = m11043l(mr60Var);
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < mr60Var.f138302c.size(); i++) {
            y70 y70Var = mr60Var.f138302c.get(i);
            List<t1d0> list = y70Var.f197729c;
            int i2 = y70Var.f197728b;
            boolean z = (i2 == 1 || i2 == 2) ? false : true;
            if ((!zM11043l || !z) && !list.isEmpty()) {
                l4c l4cVarMo188900b = list.get(0).mo188900b();
                if (l4cVarMo188900b == null) {
                    return jM105084J0 + j;
                }
                long jMo152760l = l4cVarMo188900b.mo152760l(j, j2);
                if (jMo152760l == 0) {
                    return jM105084J0;
                }
                long jMo152753e = (l4cVarMo188900b.mo152753e(j, j2) + jMo152760l) - 1;
                jMin = Math.min(jMin, l4cVarMo188900b.mo152752d(jMo152753e, j) + l4cVarMo188900b.mo152751c(jMo152753e) + jM105084J0);
            }
        }
        return jMin;
    }

    /* JADX INFO: renamed from: i */
    public static long m11041i(mr60 mr60Var, long j, long j2) {
        long jM105084J0 = bmk0.m105084J0(mr60Var.f138301b);
        boolean zM11043l = m11043l(mr60Var);
        long jMax = jM105084J0;
        for (int i = 0; i < mr60Var.f138302c.size(); i++) {
            y70 y70Var = mr60Var.f138302c.get(i);
            List<t1d0> list = y70Var.f197729c;
            int i2 = y70Var.f197728b;
            boolean z = (i2 == 1 || i2 == 2) ? false : true;
            if ((!zM11043l || !z) && !list.isEmpty()) {
                l4c l4cVarMo188900b = list.get(0).mo188900b();
                if (l4cVarMo188900b == null || l4cVarMo188900b.mo152760l(j, j2) == 0) {
                    return jM105084J0;
                }
                jMax = Math.max(jMax, l4cVarMo188900b.mo152751c(l4cVarMo188900b.mo152753e(j, j2)) + jM105084J0);
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: j */
    public static long m11042j(h4c h4cVar, long j) {
        l4c l4cVarMo188900b;
        int iM133558e = h4cVar.m133558e() - 1;
        mr60 mr60VarM133557d = h4cVar.m133557d(iM133558e);
        long jM105084J0 = bmk0.m105084J0(mr60VarM133557d.f138301b);
        long jM133560g = h4cVar.m133560g(iM133558e);
        long jM105084J1 = bmk0.m105084J0(j);
        long jM105084J2 = bmk0.m105084J0(h4cVar.f107776a);
        long jM105084J3 = bmk0.m105084J0(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        for (int i = 0; i < mr60VarM133557d.f138302c.size(); i++) {
            List<t1d0> list = mr60VarM133557d.f138302c.get(i).f197729c;
            if (!list.isEmpty() && (l4cVarMo188900b = list.get(0).mo188900b()) != null) {
                long jMo152754f = ((jM105084J2 + jM105084J0) + l4cVarMo188900b.mo152754f(jM133560g, jM105084J1)) - jM105084J1;
                if (jMo152754f < jM105084J3 - 100000 || (jMo152754f > jM105084J3 && jMo152754f < jM105084J3 + 100000)) {
                    jM105084J3 = jMo152754f;
                }
            }
        }
        return LongMath.m16423b(jM105084J3, 1000L, RoundingMode.CEILING);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m11043l(mr60 mr60Var) {
        for (int i = 0; i < mr60Var.f138302c.size(); i++) {
            int i2 = mr60Var.f138302c.get(i).f197728b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m11044m(mr60 mr60Var) {
        for (int i = 0; i < mr60Var.f138302c.size(); i++) {
            l4c l4cVarMo188900b = mr60Var.f138302c.get(i).f197729c.get(0).mo188900b();
            if (l4cVarMo188900b == null || l4cVarMo188900b.mo152759k()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m11045A(boolean z) {
        long j;
        long j2;
        long j3;
        for (int i = 0; i < this.f8382o.size(); i++) {
            int iKeyAt = this.f8382o.keyAt(i);
            if (iKeyAt >= this.f8367I) {
                this.f8382o.valueAt(i).m11109L(this.f8360B, iKeyAt - this.f8367I);
            }
        }
        mr60 mr60VarM133557d = this.f8360B.m133557d(0);
        int iM133558e = this.f8360B.m133558e() - 1;
        mr60 mr60VarM133557d2 = this.f8360B.m133557d(iM133558e);
        long jM133560g = this.f8360B.m133560g(iM133558e);
        long jM105084J0 = bmk0.m105084J0(bmk0.m105130e0(this.f8364F));
        long jM11041i = m11041i(mr60VarM133557d, this.f8360B.m133560g(0), jM105084J0);
        long jM11040h = m11040h(mr60VarM133557d2, jM133560g, jM105084J0);
        boolean z2 = this.f8360B.f107779d && !m11044m(mr60VarM133557d2);
        if (z2) {
            long j4 = this.f8360B.f107781f;
            if (j4 != -9223372036854775807L) {
                jM11041i = Math.max(jM11041i, jM11040h - bmk0.m105084J0(j4));
            }
        }
        long j5 = jM11040h - jM11041i;
        h4c h4cVar = this.f8360B;
        if (h4cVar.f107779d) {
            w11.m204371g(h4cVar.f107776a != -9223372036854775807L);
            long jM105084J1 = (jM105084J0 - bmk0.m105084J0(this.f8360B.f107776a)) - jM11041i;
            m11051H(jM105084J1, j5);
            long jM105152l1 = this.f8360B.f107776a + bmk0.m105152l1(jM11041i);
            long jM105084J2 = jM105084J1 - bmk0.m105084J0(this.f8392y.f8076a);
            j = 0;
            long jMin = Math.min(this.f8377j, j5 / 2);
            j2 = jM105152l1;
            j3 = jM105084J2 < jMin ? jMin : jM105084J2;
        } else {
            j = 0;
            j2 = -9223372036854775807L;
            j3 = 0;
        }
        long jM105084J3 = jM11041i - bmk0.m105084J0(mr60VarM133557d.f138301b);
        h4c h4cVar2 = this.f8360B;
        refreshSourceInfo(new C1962b(h4cVar2.f107776a, j2, this.f8364F, this.f8367I, jM105084J3, j5, j3, h4cVar2, this.f8368a, h4cVar2.f107779d ? this.f8392y : null));
        if (this.f8369b) {
            return;
        }
        this.f8391x.removeCallbacks(this.f8384q);
        if (z2) {
            this.f8391x.postDelayed(this.f8384q, m11042j(this.f8360B, bmk0.m105130e0(this.f8364F)));
        }
        if (this.f8361C) {
            m11033G();
            return;
        }
        if (z) {
            h4c h4cVar3 = this.f8360B;
            if (h4cVar3.f107779d) {
                long j6 = h4cVar3.f107780e;
                if (j6 != -9223372036854775807L) {
                    if (j6 == j) {
                        j6 = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
                    }
                    m11049E(Math.max(j, (this.f8362D + j6) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m11046B(llk0 llk0Var) {
        String str = llk0Var.f132567a;
        if (bmk0.m105123c(str, "urn:mpeg:dash:utc:direct:2014") || bmk0.m105123c(str, "urn:mpeg:dash:utc:direct:2012")) {
            m11047C(llk0Var);
            return;
        }
        if (bmk0.m105123c(str, "urn:mpeg:dash:utc:http-iso:2014") || bmk0.m105123c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            m11048D(llk0Var, new C1964d());
            return;
        }
        if (bmk0.m105123c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || bmk0.m105123c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            m11048D(llk0Var, new C1968h(null));
        } else if (bmk0.m105123c(str, "urn:mpeg:dash:utc:ntp:2014") || bmk0.m105123c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            m11053p();
        } else {
            m11061y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m11047C(llk0 llk0Var) {
        try {
            m11062z(bmk0.m105098Q0(llk0Var.f132568b) - this.f8363E);
        } catch (ParserException e) {
            m11061y(e);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m11048D(llk0 llk0Var, C2073d.a<Long> aVar) {
        m11050F(new C2073d(this.f8387t, Uri.parse(llk0Var.f132568b), 5, aVar), new C1967g(this, null), 1);
    }

    /* JADX INFO: renamed from: E */
    public final void m11049E(long j) {
        this.f8391x.postDelayed(this.f8383p, j);
    }

    /* JADX INFO: renamed from: F */
    public final <T> void m11050F(C2073d<T> c2073d, Loader.InterfaceC2064b<C2073d<T>> interfaceC2064b, int i) {
        this.f8378k.m11343s(new mtv(c2073d.f9561a, c2073d.f9562b, this.f8388u.m12146n(c2073d, interfaceC2064b, i)), c2073d.f9563c);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX INFO: renamed from: H */
    public final void m11051H(long j, long j2) {
        long j3;
        long jMin;
        long jM105152l1;
        long j4;
        long jM105164r;
        long j5;
        mre0 mre0Var;
        long j6;
        long j7;
        long j8;
        long jM105164r2;
        float f;
        float f2;
        mre0 mre0Var2;
        mre0 mre0Var3;
        mre0 mre0Var4;
        h4c h4cVar;
        mre0 mre0Var5;
        long j9;
        long jM105152l2 = bmk0.m105152l1(j);
        long j10 = this.f8368a.f7999d.f8078c;
        if (j10 == -9223372036854775807L) {
            mre0 mre0Var6 = this.f8360B.f107785j;
            if (mre0Var6 != null) {
                long j11 = mre0Var6.f138360c;
                if (j11 != -9223372036854775807L) {
                    jMin = Math.min(jM105152l2, j11);
                }
                jM105152l1 = bmk0.m105152l1(j - j2);
                if (jM105152l1 < 0 && j3 > 0) {
                    jM105152l1 = 0;
                }
                j4 = this.f8360B.f107778c;
                if (j4 != -9223372036854775807L) {
                    jM105152l1 = Math.min(jM105152l1 + j4, jM105152l2);
                }
                jM105164r = jM105152l1;
                j5 = this.f8368a.f7999d.f8077b;
                if (j5 != -9223372036854775807L) {
                    jM105164r = bmk0.m105164r(j5, jM105164r, jM105152l2);
                } else {
                    mre0Var = this.f8360B.f107785j;
                    if (mre0Var != null) {
                        j6 = mre0Var.f138359b;
                        if (j6 != -9223372036854775807L) {
                            jM105164r = bmk0.m105164r(j6, jM105164r, jM105152l2);
                        }
                    }
                }
                j7 = jM105164r;
                if (j7 > j3) {
                    j8 = j7;
                } else {
                    j8 = j3;
                }
                jM105164r2 = this.f8392y.f8076a;
                if (jM105164r2 == -9223372036854775807L) {
                    h4cVar = this.f8360B;
                    mre0Var5 = h4cVar.f107785j;
                    if (mre0Var5 != null) {
                        j9 = mre0Var5.f138358a;
                        if (j9 != -9223372036854775807L) {
                            jM105164r2 = j9;
                        } else {
                            jM105164r2 = h4cVar.f107782g;
                            if (jM105164r2 == -9223372036854775807L) {
                                jM105164r2 = this.f8376i;
                            }
                        }
                    } else {
                        jM105164r2 = h4cVar.f107782g;
                        if (jM105164r2 == -9223372036854775807L) {
                            jM105164r2 = this.f8376i;
                        }
                    }
                }
                if (jM105164r2 < j7) {
                    jM105164r2 = j7;
                }
                if (jM105164r2 > j8) {
                    jM105164r2 = bmk0.m105164r(bmk0.m105152l1(j - Math.min(this.f8377j, j2 / 2)), j7, j8);
                }
                long j12 = j8;
                C1944n.g gVar = this.f8368a.f7999d;
                f = gVar.f8079d;
                if (f == -3.4028235E38f) {
                    mre0Var4 = this.f8360B.f107785j;
                    if (mre0Var4 != null) {
                        f = mre0Var4.f138361d;
                    } else {
                        f = -3.4028235E38f;
                    }
                }
                f2 = gVar.f8080e;
                if (f2 == -3.4028235E38f) {
                    mre0Var3 = this.f8360B.f107785j;
                    if (mre0Var3 != null) {
                        f2 = mre0Var3.f138362e;
                    } else {
                        f2 = -3.4028235E38f;
                    }
                }
                if (f == -3.4028235E38f && f2 == -3.4028235E38f && ((mre0Var2 = this.f8360B.f107785j) == null || mre0Var2.f138358a == -9223372036854775807L)) {
                    f = 1.0f;
                    f2 = 1.0f;
                }
                this.f8392y = new C1944n.g.a().m10741k(jM105164r2).m10739i(j7).m10737g(j12).m10740j(f).m10738h(f2).m10736f();
            }
            j3 = jM105152l2;
            jM105152l1 = bmk0.m105152l1(j - j2);
            if (jM105152l1 < 0) {
                jM105152l1 = 0;
            }
            j4 = this.f8360B.f107778c;
            if (j4 != -9223372036854775807L) {
                jM105152l1 = Math.min(jM105152l1 + j4, jM105152l2);
            }
            jM105164r = jM105152l1;
            j5 = this.f8368a.f7999d.f8077b;
            if (j5 != -9223372036854775807L) {
                jM105164r = bmk0.m105164r(j5, jM105164r, jM105152l2);
            } else {
                mre0Var = this.f8360B.f107785j;
                if (mre0Var != null) {
                    j6 = mre0Var.f138359b;
                    if (j6 != -9223372036854775807L) {
                        jM105164r = bmk0.m105164r(j6, jM105164r, jM105152l2);
                    }
                }
            }
            j7 = jM105164r;
            if (j7 > j3) {
                j8 = j7;
            } else {
                j8 = j3;
            }
            jM105164r2 = this.f8392y.f8076a;
            if (jM105164r2 == -9223372036854775807L) {
                h4cVar = this.f8360B;
                mre0Var5 = h4cVar.f107785j;
                if (mre0Var5 != null) {
                    j9 = mre0Var5.f138358a;
                    if (j9 != -9223372036854775807L) {
                        jM105164r2 = j9;
                    } else {
                        jM105164r2 = h4cVar.f107782g;
                        if (jM105164r2 == -9223372036854775807L) {
                            jM105164r2 = this.f8376i;
                        }
                    }
                } else {
                    jM105164r2 = h4cVar.f107782g;
                    if (jM105164r2 == -9223372036854775807L) {
                        jM105164r2 = this.f8376i;
                    }
                }
            }
            if (jM105164r2 < j7) {
                jM105164r2 = j7;
            }
            if (jM105164r2 > j8) {
                jM105164r2 = bmk0.m105164r(bmk0.m105152l1(j - Math.min(this.f8377j, j2 / 2)), j7, j8);
            }
            long j13 = j8;
            C1944n.g gVar2 = this.f8368a.f7999d;
            f = gVar2.f8079d;
            if (f == -3.4028235E38f) {
                mre0Var4 = this.f8360B.f107785j;
                if (mre0Var4 != null) {
                    f = mre0Var4.f138361d;
                } else {
                    f = -3.4028235E38f;
                }
            }
            f2 = gVar2.f8080e;
            if (f2 == -3.4028235E38f) {
                mre0Var3 = this.f8360B.f107785j;
                if (mre0Var3 != null) {
                    f2 = mre0Var3.f138362e;
                } else {
                    f2 = -3.4028235E38f;
                }
            }
            if (f == -3.4028235E38f) {
                f = 1.0f;
                f2 = 1.0f;
            }
            this.f8392y = new C1944n.g.a().m10741k(jM105164r2).m10739i(j7).m10737g(j13).m10740j(f).m10738h(f2).m10736f();
        }
        jMin = Math.min(jM105152l2, j10);
        j3 = jMin;
        jM105152l1 = bmk0.m105152l1(j - j2);
        if (jM105152l1 < 0) {
            jM105152l1 = 0;
        }
        j4 = this.f8360B.f107778c;
        if (j4 != -9223372036854775807L) {
            jM105152l1 = Math.min(jM105152l1 + j4, jM105152l2);
        }
        jM105164r = jM105152l1;
        j5 = this.f8368a.f7999d.f8077b;
        if (j5 != -9223372036854775807L) {
            jM105164r = bmk0.m105164r(j5, jM105164r, jM105152l2);
        } else {
            mre0Var = this.f8360B.f107785j;
            if (mre0Var != null) {
                j6 = mre0Var.f138359b;
                if (j6 != -9223372036854775807L) {
                    jM105164r = bmk0.m105164r(j6, jM105164r, jM105152l2);
                }
            }
        }
        j7 = jM105164r;
        if (j7 > j3) {
            j8 = j7;
        } else {
            j8 = j3;
        }
        jM105164r2 = this.f8392y.f8076a;
        if (jM105164r2 == -9223372036854775807L) {
            h4cVar = this.f8360B;
            mre0Var5 = h4cVar.f107785j;
            if (mre0Var5 != null) {
                j9 = mre0Var5.f138358a;
                if (j9 != -9223372036854775807L) {
                    jM105164r2 = j9;
                } else {
                    jM105164r2 = h4cVar.f107782g;
                    if (jM105164r2 == -9223372036854775807L) {
                        jM105164r2 = this.f8376i;
                    }
                }
            } else {
                jM105164r2 = h4cVar.f107782g;
                if (jM105164r2 == -9223372036854775807L) {
                    jM105164r2 = this.f8376i;
                }
            }
        }
        if (jM105164r2 < j7) {
            jM105164r2 = j7;
        }
        if (jM105164r2 > j8) {
            jM105164r2 = bmk0.m105164r(bmk0.m105152l1(j - Math.min(this.f8377j, j2 / 2)), j7, j8);
        }
        long j14 = j8;
        C1944n.g gVar3 = this.f8368a.f7999d;
        f = gVar3.f8079d;
        if (f == -3.4028235E38f) {
            mre0Var4 = this.f8360B.f107785j;
            if (mre0Var4 != null) {
                f = mre0Var4.f138361d;
            } else {
                f = -3.4028235E38f;
            }
        }
        f2 = gVar3.f8080e;
        if (f2 == -3.4028235E38f) {
            mre0Var3 = this.f8360B.f107785j;
            if (mre0Var3 != null) {
                f2 = mre0Var3.f138362e;
            } else {
                f2 = -3.4028235E38f;
            }
        }
        if (f == -3.4028235E38f) {
            f = 1.0f;
            f2 = 1.0f;
        }
        this.f8392y = new C1944n.g.a().m10741k(jM105164r2).m10739i(j7).m10737g(j14).m10740j(f).m10738h(f2).m10736f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public InterfaceC1976h createPeriod(InterfaceC1988i.b bVar, oj0 oj0Var, long j) {
        int iIntValue = ((Integer) bVar.f101422a).intValue() - this.f8367I;
        InterfaceC1989j.a aVarCreateEventDispatcher = createEventDispatcher(bVar);
        C1970b c1970b = new C1970b(this.f8367I + iIntValue, this.f8360B, this.f8375h, iIntValue, this.f8371d, this.f8389v, null, this.f8373f, createDrmEventDispatcher(bVar), this.f8374g, aVarCreateEventDispatcher, this.f8364F, this.f8386s, oj0Var, this.f8372e, this.f8385r, getPlayerId());
        this.f8382o.put(c1970b.f8422a, c1970b);
        return c1970b;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public C1944n getMediaItem() {
        return this.f8368a;
    }

    /* JADX INFO: renamed from: k */
    public final long m11052k() {
        return Math.min((this.f8365G - 1) * 1000, 5000);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f8386s.mo11081a();
    }

    /* JADX INFO: renamed from: p */
    public final void m11053p() {
        ysf0.m217249j(this.f8388u, new C1961a());
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    public void prepareSourceInternal(@Nullable pgj0 pgj0Var) {
        this.f8389v = pgj0Var;
        this.f8373f.mo9931d(Looper.myLooper(), getPlayerId());
        this.f8373f.prepare();
        if (this.f8369b) {
            m11045A(false);
            return;
        }
        this.f8387t = this.f8370c.mo129219a();
        this.f8388u = new Loader("DashMediaSource");
        this.f8391x = bmk0.m105174w();
        m11033G();
    }

    /* JADX INFO: renamed from: r */
    public void m11054r(long j) {
        long j2 = this.f8366H;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.f8366H = j;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void releasePeriod(InterfaceC1976h interfaceC1976h) {
        C1970b c1970b = (C1970b) interfaceC1976h;
        c1970b.m11105H();
        this.f8382o.remove(c1970b.f8422a);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    public void releaseSourceInternal() {
        this.f8361C = false;
        this.f8387t = null;
        Loader loader = this.f8388u;
        if (loader != null) {
            loader.m12144l();
            this.f8388u = null;
        }
        this.f8362D = 0L;
        this.f8363E = 0L;
        this.f8360B = this.f8369b ? this.f8360B : null;
        this.f8393z = this.f8359A;
        this.f8390w = null;
        Handler handler = this.f8391x;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f8391x = null;
        }
        this.f8364F = -9223372036854775807L;
        this.f8365G = 0;
        this.f8366H = -9223372036854775807L;
        this.f8382o.clear();
        this.f8375h.m136945i();
        this.f8373f.release();
    }

    /* JADX INFO: renamed from: s */
    public void m11055s() {
        this.f8391x.removeCallbacks(this.f8384q);
        m11033G();
    }

    /* JADX INFO: renamed from: t */
    public void m11056t(C2073d<?> c2073d, long j, long j2) {
        mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
        this.f8374g.m12176c(c2073d.f9561a);
        this.f8378k.m11334j(mtvVar, c2073d.f9563c);
    }

    /* JADX INFO: renamed from: u */
    public void m11057u(C2073d<h4c> c2073d, long j, long j2) {
        mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
        this.f8374g.m12176c(c2073d.f9561a);
        this.f8378k.m11337m(mtvVar, c2073d.f9563c);
        h4c h4cVarM12180e = c2073d.m12180e();
        h4c h4cVar = this.f8360B;
        int iM133558e = h4cVar == null ? 0 : h4cVar.m133558e();
        long j3 = h4cVarM12180e.m133557d(0).f138301b;
        int i = 0;
        while (i < iM133558e && this.f8360B.m133557d(i).f138301b < j3) {
            i++;
        }
        if (h4cVarM12180e.f107779d) {
            if (iM133558e - i > h4cVarM12180e.m133558e()) {
                kyv.m152151i("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j4 = this.f8366H;
                if (j4 == -9223372036854775807L || h4cVarM12180e.f107783h * 1000 > j4) {
                    this.f8365G = 0;
                } else {
                    kyv.m152151i("DashMediaSource", "Loaded stale dynamic manifest: " + h4cVarM12180e.f107783h + ", " + this.f8366H);
                }
            }
            int i2 = this.f8365G;
            this.f8365G = i2 + 1;
            if (i2 < this.f8374g.mo12174d(c2073d.f9563c)) {
                m11049E(m11052k());
                return;
            } else {
                this.f8390w = new DashManifestStaleException();
                return;
            }
        }
        this.f8360B = h4cVarM12180e;
        this.f8361C = h4cVarM12180e.f107779d & this.f8361C;
        this.f8362D = j - j2;
        this.f8363E = j;
        synchronized (this.f8381n) {
            try {
                if (c2073d.f9562b.f9529a == this.f8393z) {
                    Uri uriM12181f = this.f8360B.f107786k;
                    if (uriM12181f == null) {
                        uriM12181f = c2073d.m12181f();
                    }
                    this.f8393z = uriM12181f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iM133558e != 0) {
            this.f8367I += i;
            m11045A(true);
            return;
        }
        h4c h4cVar2 = this.f8360B;
        if (!h4cVar2.f107779d) {
            m11045A(true);
            return;
        }
        llk0 llk0Var = h4cVar2.f107784i;
        if (llk0Var != null) {
            m11046B(llk0Var);
        } else {
            m11053p();
        }
    }

    /* JADX INFO: renamed from: v */
    public Loader.C2065c m11058v(C2073d<h4c> c2073d, long j, long j2, IOException iOException, int i) {
        mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
        long jMo12172a = this.f8374g.mo12172a(new InterfaceC2072c.c(mtvVar, new ktx(c2073d.f9563c), iOException, i));
        Loader.C2065c c2065cM12138h = jMo12172a == -9223372036854775807L ? Loader.f9496g : Loader.m12138h(false, jMo12172a);
        boolean zM12149c = c2065cM12138h.m12149c();
        this.f8378k.m11341q(mtvVar, c2073d.f9563c, iOException, !zM12149c);
        if (!zM12149c) {
            this.f8374g.m12176c(c2073d.f9561a);
        }
        return c2065cM12138h;
    }

    /* JADX INFO: renamed from: w */
    public void m11059w(C2073d<Long> c2073d, long j, long j2) {
        mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
        this.f8374g.m12176c(c2073d.f9561a);
        this.f8378k.m11337m(mtvVar, c2073d.f9563c);
        m11062z(c2073d.m12180e().longValue() - j);
    }

    /* JADX INFO: renamed from: x */
    public Loader.C2065c m11060x(C2073d<Long> c2073d, long j, long j2, IOException iOException) {
        this.f8378k.m11341q(new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b()), c2073d.f9563c, iOException, true);
        this.f8374g.m12176c(c2073d.f9561a);
        m11061y(iOException);
        return Loader.f9495f;
    }

    /* JADX INFO: renamed from: y */
    public final void m11061y(IOException iOException) {
        kyv.m152146d("DashMediaSource", "Failed to resolve time offset.", iOException);
        m11045A(true);
    }

    /* JADX INFO: renamed from: z */
    public final void m11062z(long j) {
        this.f8364F = j;
        m11045A(true);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$h */
    public static final class C1968h implements C2073d.a<Long> {
        public C1968h() {
        }

        @Override // com.google.android.exoplayer2.upstream.C2073d.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo11073a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(bmk0.m105098Q0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public /* synthetic */ C1968h(C1961a c1961a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$c */
    public final class C1963c implements C1972d.b {
        public C1963c() {
        }

        @Override // com.google.android.exoplayer2.source.dash.C1972d.b
        /* JADX INFO: renamed from: a */
        public void mo11071a(long j) {
            DashMediaSource.this.m11054r(j);
        }

        @Override // com.google.android.exoplayer2.source.dash.C1972d.b
        /* JADX INFO: renamed from: b */
        public void mo11072b() {
            DashMediaSource.this.m11055s();
        }

        public /* synthetic */ C1963c(DashMediaSource dashMediaSource, C1961a c1961a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$e */
    public final class C1965e implements Loader.InterfaceC2064b<C2073d<h4c>> {
        public C1965e() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo11078n(C2073d<h4c> c2073d, long j, long j2, boolean z) {
            DashMediaSource.this.m11056t(c2073d, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo11079o(C2073d<h4c> c2073d, long j, long j2) {
            DashMediaSource.this.m11057u(c2073d, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.C2065c mo11080q(C2073d<h4c> c2073d, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.m11058v(c2073d, j, j2, iOException, i);
        }

        public /* synthetic */ C1965e(DashMediaSource dashMediaSource, C1961a c1961a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$g */
    public final class C1967g implements Loader.InterfaceC2064b<C2073d<Long>> {
        public C1967g() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo11078n(C2073d<Long> c2073d, long j, long j2, boolean z) {
            DashMediaSource.this.m11056t(c2073d, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo11079o(C2073d<Long> c2073d, long j, long j2) {
            DashMediaSource.this.m11059w(c2073d, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.C2065c mo11080q(C2073d<Long> c2073d, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.m11060x(c2073d, j, j2, iOException);
        }

        public /* synthetic */ C1967g(DashMediaSource dashMediaSource, C1961a c1961a) {
            this();
        }
    }

    public static final class Factory implements InterfaceC1990k {

        /* JADX INFO: renamed from: l */
        public static final /* synthetic */ int f8394l = 0;

        /* JADX INFO: renamed from: c */
        public final InterfaceC1969a.a f8395c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final g6c.InterfaceC17163a f8396d;

        /* JADX INFO: renamed from: e */
        public zb5.InterfaceC21789a f8397e;

        /* JADX INFO: renamed from: f */
        public zde f8398f;

        /* JADX INFO: renamed from: g */
        public et5 f8399g;

        /* JADX INFO: renamed from: h */
        public InterfaceC2072c f8400h;

        /* JADX INFO: renamed from: i */
        public long f8401i;

        /* JADX INFO: renamed from: j */
        public long f8402j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public C2073d.a<? extends h4c> f8403k;

        public Factory(InterfaceC1969a.a aVar, @Nullable g6c.InterfaceC17163a interfaceC17163a) {
            this.f8395c = (InterfaceC1969a.a) w11.m204369e(aVar);
            this.f8396d = interfaceC17163a;
            this.f8398f = new C1876a();
            this.f8400h = new C2071b();
            this.f8401i = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
            this.f8402j = 5000000L;
            this.f8399g = new snd();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public DashMediaSource mo11012c(C1944n c1944n) {
            w11.m204369e(c1944n.f7997b);
            C2073d.a i4cVar = this.f8403k;
            if (i4cVar == null) {
                i4cVar = new i4c();
            }
            List<StreamKey> list = c1944n.f7997b.f8098e;
            C2073d.a nniVar = !list.isEmpty() ? new nni(i4cVar, list) : i4cVar;
            zb5.InterfaceC21789a interfaceC21789a = this.f8397e;
            if (interfaceC21789a != null) {
                interfaceC21789a.m219186a(c1944n);
            }
            return new DashMediaSource(c1944n, null, this.f8396d, nniVar, this.f8395c, this.f8399g, null, this.f8398f.mo9964a(c1944n), this.f8400h, this.f8401i, this.f8402j, null);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory mo11013d(zb5.InterfaceC21789a interfaceC21789a) {
            this.f8397e = (zb5.InterfaceC21789a) w11.m204369e(interfaceC21789a);
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo11010a(zde zdeVar) {
            this.f8398f = (zde) w11.m204370f(zdeVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory mo11011b(InterfaceC2072c interfaceC2072c) {
            this.f8400h = (InterfaceC2072c) w11.m204370f(interfaceC2072c, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(g6c.InterfaceC17163a interfaceC17163a) {
            this(new C1971c.a(interfaceC17163a), interfaceC17163a);
        }
    }

    public /* synthetic */ DashMediaSource(C1944n c1944n, h4c h4cVar, g6c.InterfaceC17163a interfaceC17163a, C2073d.a aVar, InterfaceC1969a.a aVar2, et5 et5Var, zb5 zb5Var, InterfaceC1878c interfaceC1878c, InterfaceC2072c interfaceC2072c, long j, long j2, C1961a c1961a) {
        this(c1944n, h4cVar, interfaceC17163a, aVar, aVar2, et5Var, zb5Var, interfaceC1878c, interfaceC2072c, j, j2);
    }
}
