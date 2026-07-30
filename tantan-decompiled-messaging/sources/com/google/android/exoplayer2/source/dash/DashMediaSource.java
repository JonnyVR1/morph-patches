package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.C1853a;
import com.google.android.exoplayer2.drm.InterfaceC1855c;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.AbstractC1934a;
import com.google.android.exoplayer2.source.InterfaceC1953h;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.android.exoplayer2.source.InterfaceC1966j;
import com.google.android.exoplayer2.source.InterfaceC1967k;
import com.google.android.exoplayer2.upstream.C2048b;
import com.google.android.exoplayer2.upstream.C2050d;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
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
import p149l.a5c;
import p149l.as5;
import p149l.c3c;
import p149l.c80;
import p149l.fck0;
import p149l.fs4;
import p149l.hj60;
import p149l.hje0;
import p149l.jwv;
import p149l.l7j0;
import p149l.lrv;
import p149l.mmd;
import p149l.n8f;
import p149l.nkx;
import p149l.otc0;
import p149l.p11;
import p149l.pkf0;
import p149l.rki;
import p149l.rr2;
import p149l.sj0;
import p149l.urv;
import p149l.vce;
import p149l.vck0;
import p149l.y2c;
import p149l.z2c;
import p149l.za5;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class DashMediaSource extends AbstractC1934a {

    /* JADX INFO: renamed from: A */
    public Uri f8322A;

    /* JADX INFO: renamed from: B */
    public y2c f8323B;

    /* JADX INFO: renamed from: C */
    public boolean f8324C;

    /* JADX INFO: renamed from: D */
    public long f8325D;

    /* JADX INFO: renamed from: E */
    public long f8326E;

    /* JADX INFO: renamed from: F */
    public long f8327F;

    /* JADX INFO: renamed from: G */
    public int f8328G;

    /* JADX INFO: renamed from: H */
    public long f8329H;

    /* JADX INFO: renamed from: I */
    public int f8330I;

    /* JADX INFO: renamed from: a */
    public final C1921n f8331a;

    /* JADX INFO: renamed from: b */
    public final boolean f8332b;

    /* JADX INFO: renamed from: c */
    public final a5c.InterfaceC15531a f8333c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1946a.a f8334d;

    /* JADX INFO: renamed from: e */
    public final as5 f8335e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1855c f8336f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2049c f8337g;

    /* JADX INFO: renamed from: h */
    public final rr2 f8338h;

    /* JADX INFO: renamed from: i */
    public final long f8339i;

    /* JADX INFO: renamed from: j */
    public final long f8340j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1966j.a f8341k;

    /* JADX INFO: renamed from: l */
    public final C2050d.a<? extends y2c> f8342l;

    /* JADX INFO: renamed from: m */
    public final C1942e f8343m;

    /* JADX INFO: renamed from: n */
    public final Object f8344n;

    /* JADX INFO: renamed from: o */
    public final SparseArray<C1947b> f8345o;

    /* JADX INFO: renamed from: p */
    public final Runnable f8346p;

    /* JADX INFO: renamed from: q */
    public final Runnable f8347q;

    /* JADX INFO: renamed from: r */
    public final C1949d.b f8348r;

    /* JADX INFO: renamed from: s */
    public final urv f8349s;

    /* JADX INFO: renamed from: t */
    public a5c f8350t;

    /* JADX INFO: renamed from: u */
    public Loader f8351u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public l7j0 f8352v;

    /* JADX INFO: renamed from: w */
    public IOException f8353w;

    /* JADX INFO: renamed from: x */
    public Handler f8354x;

    /* JADX INFO: renamed from: y */
    public C1921n.g f8355y;

    /* JADX INFO: renamed from: z */
    public Uri f8356z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$a */
    public class C1938a implements pkf0.InterfaceC19257b {
        public C1938a() {
        }

        @Override // p149l.pkf0.InterfaceC19257b
        /* JADX INFO: renamed from: a */
        public void mo11013a() {
            DashMediaSource.this.m11008z(pkf0.m170038h());
        }

        @Override // p149l.pkf0.InterfaceC19257b
        /* JADX INFO: renamed from: b */
        public void mo11014b(IOException iOException) {
            DashMediaSource.this.m11007y(iOException);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$b */
    public static final class C1939b extends AbstractC1834c0 {

        /* JADX INFO: renamed from: f */
        public final long f8368f;

        /* JADX INFO: renamed from: g */
        public final long f8369g;

        /* JADX INFO: renamed from: h */
        public final long f8370h;

        /* JADX INFO: renamed from: i */
        public final int f8371i;

        /* JADX INFO: renamed from: j */
        public final long f8372j;

        /* JADX INFO: renamed from: k */
        public final long f8373k;

        /* JADX INFO: renamed from: l */
        public final long f8374l;

        /* JADX INFO: renamed from: m */
        public final y2c f8375m;

        /* JADX INFO: renamed from: n */
        public final C1921n f8376n;

        /* JADX INFO: renamed from: o */
        @Nullable
        public final C1921n.g f8377o;

        public C1939b(long j, long j2, long j3, int i, long j4, long j5, long j6, y2c y2cVar, C1921n c1921n, @Nullable C1921n.g gVar) {
            p11.m167013g(y2cVar.f195510d == (gVar != null));
            this.f8368f = j;
            this.f8369g = j2;
            this.f8370h = j3;
            this.f8371i = i;
            this.f8372j = j4;
            this.f8373k = j5;
            this.f8374l = j6;
            this.f8375m = y2cVar;
            this.f8376n = c1921n;
            this.f8377o = gVar;
        }

        /* JADX INFO: renamed from: x */
        public static boolean m11015x(y2c y2cVar) {
            return y2cVar.f195510d && y2cVar.f195511e != -9223372036854775807L && y2cVar.f195508b == -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: f */
        public int mo9396f(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f8371i) >= 0 && iIntValue < mo9717m()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: k */
        public AbstractC1834c0.b mo9399k(int i, AbstractC1834c0.b bVar, boolean z) {
            p11.m167009c(i, 0, mo9717m());
            return bVar.m9745v(z ? this.f8375m.m212360d(i).f108036a : null, z ? Integer.valueOf(this.f8371i + i) : null, 0, this.f8375m.m212363g(i), vck0.m197806J0(this.f8375m.m212360d(i).f108037b - this.f8375m.m212360d(0).f108037b) - this.f8372j);
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: m */
        public int mo9717m() {
            return this.f8375m.m212361e();
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: q */
        public Object mo9402q(int i) {
            p11.m167009c(i, 0, mo9717m());
            return Integer.valueOf(this.f8371i + i);
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: s */
        public AbstractC1834c0.d mo9403s(int i, AbstractC1834c0.d dVar, long j) {
            p11.m167009c(i, 0, 1);
            long jM11016w = m11016w(j);
            Object obj = AbstractC1834c0.d.f7319r;
            C1921n c1921n = this.f8376n;
            y2c y2cVar = this.f8375m;
            return dVar.m9755i(obj, c1921n, y2cVar, this.f8368f, this.f8369g, this.f8370h, true, m11015x(y2cVar), this.f8377o, jM11016w, this.f8373k, 0, mo9717m() - 1, this.f8372j);
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: t */
        public int mo9721t() {
            return 1;
        }

        /* JADX INFO: renamed from: w */
        public final long m11016w(long j) {
            c3c c3cVarMo165937b;
            long j2 = this.f8374l;
            if (!m11015x(this.f8375m)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.f8373k) {
                    return -9223372036854775807L;
                }
            }
            long j3 = this.f8372j + j2;
            long jM212363g = this.f8375m.m212363g(0);
            int i = 0;
            while (i < this.f8375m.m212361e() - 1 && j3 >= jM212363g) {
                j3 -= jM212363g;
                i++;
                jM212363g = this.f8375m.m212363g(i);
            }
            hj60 hj60VarM212360d = this.f8375m.m212360d(i);
            int iM131354a = hj60VarM212360d.m131354a(2);
            return (iM131354a == -1 || (c3cVarMo165937b = hj60VarM212360d.f108038c.get(iM131354a).f79672c.get(0).mo165937b()) == null || c3cVarMo165937b.mo104998h(jM212363g) == 0) ? j2 : (j2 + c3cVarMo165937b.mo104993c(c3cVarMo165937b.mo104997g(j3, jM212363g))) - j3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$d */
    public static final class C1941d implements C2050d.a<Long> {

        /* JADX INFO: renamed from: a */
        public static final Pattern f8379a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // com.google.android.exoplayer2.upstream.C2050d.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo11019a(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, fs4.f99036c)).readLine();
            try {
                Matcher matcher = f8379a.matcher(line);
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
    public final class C1943f implements urv {
        public C1943f() {
        }

        @Override // p149l.urv
        /* JADX INFO: renamed from: a */
        public void mo11027a() throws IOException {
            DashMediaSource.this.f8351u.mo11027a();
            m11028b();
        }

        /* JADX INFO: renamed from: b */
        public final void m11028b() throws IOException {
            if (DashMediaSource.this.f8353w != null) {
                throw DashMediaSource.this.f8353w;
            }
        }
    }

    static {
        n8f.m158492a("goog.exo.dash");
    }

    public DashMediaSource(C1921n c1921n, @Nullable y2c y2cVar, @Nullable a5c.InterfaceC15531a interfaceC15531a, @Nullable C2050d.a<? extends y2c> aVar, InterfaceC1946a.a aVar2, as5 as5Var, @Nullable za5 za5Var, InterfaceC1855c interfaceC1855c, InterfaceC2049c interfaceC2049c, long j, long j2) {
        this.f8331a = c1921n;
        this.f8355y = c1921n.f7962d;
        this.f8356z = ((C1921n.h) p11.m167011e(c1921n.f7960b)).f8057a;
        this.f8322A = c1921n.f7960b.f8057a;
        this.f8323B = y2cVar;
        this.f8333c = interfaceC15531a;
        this.f8342l = aVar;
        this.f8334d = aVar2;
        this.f8336f = interfaceC1855c;
        this.f8337g = interfaceC2049c;
        this.f8339i = j;
        this.f8340j = j2;
        this.f8335e = as5Var;
        this.f8338h = new rr2();
        boolean z = y2cVar != null;
        this.f8332b = z;
        C1938a c1938a = null;
        this.f8341k = createEventDispatcher(null);
        this.f8344n = new Object();
        this.f8345o = new SparseArray<>();
        this.f8348r = new C1940c(this, c1938a);
        this.f8329H = -9223372036854775807L;
        this.f8327F = -9223372036854775807L;
        if (!z) {
            this.f8343m = new C1942e(this, c1938a);
            this.f8349s = new C1943f();
            this.f8346p = new Runnable() { // from class: l.a3c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67342a.m10979G();
                }
            };
            this.f8347q = new Runnable() { // from class: l.b3c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72819a.m10991A(false);
                }
            };
            return;
        }
        p11.m167013g(true ^ y2cVar.f195510d);
        this.f8343m = null;
        this.f8346p = null;
        this.f8347q = null;
        this.f8349s = new urv.C20495a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m10979G() {
        Uri uri;
        this.f8354x.removeCallbacks(this.f8346p);
        if (this.f8351u.m12087i()) {
            return;
        }
        if (this.f8351u.m12088j()) {
            this.f8324C = true;
            return;
        }
        synchronized (this.f8344n) {
            uri = this.f8356z;
        }
        this.f8324C = false;
        m10996F(new C2050d(this.f8350t, uri, 4, this.f8342l), this.f8343m, this.f8337g.mo12120d(4));
    }

    /* JADX INFO: renamed from: h */
    public static long m10986h(hj60 hj60Var, long j, long j2) {
        long jM197806J0 = vck0.m197806J0(hj60Var.f108037b);
        boolean zM10989l = m10989l(hj60Var);
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < hj60Var.f108038c.size(); i++) {
            c80 c80Var = hj60Var.f108038c.get(i);
            List<otc0> list = c80Var.f79672c;
            int i2 = c80Var.f79671b;
            boolean z = (i2 == 1 || i2 == 2) ? false : true;
            if ((!zM10989l || !z) && !list.isEmpty()) {
                c3c c3cVarMo165937b = list.get(0).mo165937b();
                if (c3cVarMo165937b == null) {
                    return jM197806J0 + j;
                }
                long jMo105002l = c3cVarMo165937b.mo105002l(j, j2);
                if (jMo105002l == 0) {
                    return jM197806J0;
                }
                long jMo104995e = (c3cVarMo165937b.mo104995e(j, j2) + jMo105002l) - 1;
                jMin = Math.min(jMin, c3cVarMo165937b.mo104994d(jMo104995e, j) + c3cVarMo165937b.mo104993c(jMo104995e) + jM197806J0);
            }
        }
        return jMin;
    }

    /* JADX INFO: renamed from: i */
    public static long m10987i(hj60 hj60Var, long j, long j2) {
        long jM197806J0 = vck0.m197806J0(hj60Var.f108037b);
        boolean zM10989l = m10989l(hj60Var);
        long jMax = jM197806J0;
        for (int i = 0; i < hj60Var.f108038c.size(); i++) {
            c80 c80Var = hj60Var.f108038c.get(i);
            List<otc0> list = c80Var.f79672c;
            int i2 = c80Var.f79671b;
            boolean z = (i2 == 1 || i2 == 2) ? false : true;
            if ((!zM10989l || !z) && !list.isEmpty()) {
                c3c c3cVarMo165937b = list.get(0).mo165937b();
                if (c3cVarMo165937b == null || c3cVarMo165937b.mo105002l(j, j2) == 0) {
                    return jM197806J0;
                }
                jMax = Math.max(jMax, c3cVarMo165937b.mo104993c(c3cVarMo165937b.mo104995e(j, j2)) + jM197806J0);
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: j */
    public static long m10988j(y2c y2cVar, long j) {
        c3c c3cVarMo165937b;
        int iM212361e = y2cVar.m212361e() - 1;
        hj60 hj60VarM212360d = y2cVar.m212360d(iM212361e);
        long jM197806J0 = vck0.m197806J0(hj60VarM212360d.f108037b);
        long jM212363g = y2cVar.m212363g(iM212361e);
        long jM197806J1 = vck0.m197806J0(j);
        long jM197806J2 = vck0.m197806J0(y2cVar.f195507a);
        long jM197806J3 = vck0.m197806J0(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        for (int i = 0; i < hj60VarM212360d.f108038c.size(); i++) {
            List<otc0> list = hj60VarM212360d.f108038c.get(i).f79672c;
            if (!list.isEmpty() && (c3cVarMo165937b = list.get(0).mo165937b()) != null) {
                long jMo104996f = ((jM197806J2 + jM197806J0) + c3cVarMo165937b.mo104996f(jM212363g, jM197806J1)) - jM197806J1;
                if (jMo104996f < jM197806J3 - 100000 || (jMo104996f > jM197806J3 && jMo104996f < jM197806J3 + 100000)) {
                    jM197806J3 = jMo104996f;
                }
            }
        }
        return LongMath.m16368b(jM197806J3, 1000L, RoundingMode.CEILING);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m10989l(hj60 hj60Var) {
        for (int i = 0; i < hj60Var.f108038c.size(); i++) {
            int i2 = hj60Var.f108038c.get(i).f79671b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m10990m(hj60 hj60Var) {
        for (int i = 0; i < hj60Var.f108038c.size(); i++) {
            c3c c3cVarMo165937b = hj60Var.f108038c.get(i).f79672c.get(0).mo165937b();
            if (c3cVarMo165937b == null || c3cVarMo165937b.mo105001k()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m10991A(boolean z) {
        long j;
        long j2;
        long j3;
        for (int i = 0; i < this.f8345o.size(); i++) {
            int iKeyAt = this.f8345o.keyAt(i);
            if (iKeyAt >= this.f8330I) {
                this.f8345o.valueAt(i).m11055L(this.f8323B, iKeyAt - this.f8330I);
            }
        }
        hj60 hj60VarM212360d = this.f8323B.m212360d(0);
        int iM212361e = this.f8323B.m212361e() - 1;
        hj60 hj60VarM212360d2 = this.f8323B.m212360d(iM212361e);
        long jM212363g = this.f8323B.m212363g(iM212361e);
        long jM197806J0 = vck0.m197806J0(vck0.m197852e0(this.f8327F));
        long jM10987i = m10987i(hj60VarM212360d, this.f8323B.m212363g(0), jM197806J0);
        long jM10986h = m10986h(hj60VarM212360d2, jM212363g, jM197806J0);
        boolean z2 = this.f8323B.f195510d && !m10990m(hj60VarM212360d2);
        if (z2) {
            long j4 = this.f8323B.f195512f;
            if (j4 != -9223372036854775807L) {
                jM10987i = Math.max(jM10987i, jM10986h - vck0.m197806J0(j4));
            }
        }
        long j5 = jM10986h - jM10987i;
        y2c y2cVar = this.f8323B;
        if (y2cVar.f195510d) {
            p11.m167013g(y2cVar.f195507a != -9223372036854775807L);
            long jM197806J1 = (jM197806J0 - vck0.m197806J0(this.f8323B.f195507a)) - jM10987i;
            m10997H(jM197806J1, j5);
            long jM197874l1 = this.f8323B.f195507a + vck0.m197874l1(jM10987i);
            long jM197806J2 = jM197806J1 - vck0.m197806J0(this.f8355y.f8039a);
            j = 0;
            long jMin = Math.min(this.f8340j, j5 / 2);
            j2 = jM197874l1;
            j3 = jM197806J2 < jMin ? jMin : jM197806J2;
        } else {
            j = 0;
            j2 = -9223372036854775807L;
            j3 = 0;
        }
        long jM197806J3 = jM10987i - vck0.m197806J0(hj60VarM212360d.f108037b);
        y2c y2cVar2 = this.f8323B;
        refreshSourceInfo(new C1939b(y2cVar2.f195507a, j2, this.f8327F, this.f8330I, jM197806J3, j5, j3, y2cVar2, this.f8331a, y2cVar2.f195510d ? this.f8355y : null));
        if (this.f8332b) {
            return;
        }
        this.f8354x.removeCallbacks(this.f8347q);
        if (z2) {
            this.f8354x.postDelayed(this.f8347q, m10988j(this.f8323B, vck0.m197852e0(this.f8327F)));
        }
        if (this.f8324C) {
            m10979G();
            return;
        }
        if (z) {
            y2c y2cVar3 = this.f8323B;
            if (y2cVar3.f195510d) {
                long j6 = y2cVar3.f195511e;
                if (j6 != -9223372036854775807L) {
                    if (j6 == j) {
                        j6 = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
                    }
                    m10995E(Math.max(j, (this.f8325D + j6) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m10992B(fck0 fck0Var) {
        String str = fck0Var.f96833a;
        if (vck0.m197845c(str, "urn:mpeg:dash:utc:direct:2014") || vck0.m197845c(str, "urn:mpeg:dash:utc:direct:2012")) {
            m10993C(fck0Var);
            return;
        }
        if (vck0.m197845c(str, "urn:mpeg:dash:utc:http-iso:2014") || vck0.m197845c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            m10994D(fck0Var, new C1941d());
            return;
        }
        if (vck0.m197845c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || vck0.m197845c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            m10994D(fck0Var, new C1945h(null));
        } else if (vck0.m197845c(str, "urn:mpeg:dash:utc:ntp:2014") || vck0.m197845c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            m10999p();
        } else {
            m11007y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m10993C(fck0 fck0Var) {
        try {
            m11008z(vck0.m197820Q0(fck0Var.f96834b) - this.f8326E);
        } catch (ParserException e) {
            m11007y(e);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m10994D(fck0 fck0Var, C2050d.a<Long> aVar) {
        m10996F(new C2050d(this.f8350t, Uri.parse(fck0Var.f96834b), 5, aVar), new C1944g(this, null), 1);
    }

    /* JADX INFO: renamed from: E */
    public final void m10995E(long j) {
        this.f8354x.postDelayed(this.f8346p, j);
    }

    /* JADX INFO: renamed from: F */
    public final <T> void m10996F(C2050d<T> c2050d, Loader.InterfaceC2041b<C2050d<T>> interfaceC2041b, int i) {
        this.f8341k.m11289s(new lrv(c2050d.f9524a, c2050d.f9525b, this.f8351u.m12092n(c2050d, interfaceC2041b, i)), c2050d.f9526c);
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
    public final void m10997H(long j, long j2) {
        long j3;
        long jMin;
        long jM197874l1;
        long j4;
        long jM197886r;
        long j5;
        hje0 hje0Var;
        long j6;
        long j7;
        long j8;
        long jM197886r2;
        float f;
        float f2;
        hje0 hje0Var2;
        hje0 hje0Var3;
        hje0 hje0Var4;
        y2c y2cVar;
        hje0 hje0Var5;
        long j9;
        long jM197874l2 = vck0.m197874l1(j);
        long j10 = this.f8331a.f7962d.f8041c;
        if (j10 == -9223372036854775807L) {
            hje0 hje0Var6 = this.f8323B.f195516j;
            if (hje0Var6 != null) {
                long j11 = hje0Var6.f108073c;
                if (j11 != -9223372036854775807L) {
                    jMin = Math.min(jM197874l2, j11);
                }
                jM197874l1 = vck0.m197874l1(j - j2);
                if (jM197874l1 < 0 && j3 > 0) {
                    jM197874l1 = 0;
                }
                j4 = this.f8323B.f195509c;
                if (j4 != -9223372036854775807L) {
                    jM197874l1 = Math.min(jM197874l1 + j4, jM197874l2);
                }
                jM197886r = jM197874l1;
                j5 = this.f8331a.f7962d.f8040b;
                if (j5 != -9223372036854775807L) {
                    jM197886r = vck0.m197886r(j5, jM197886r, jM197874l2);
                } else {
                    hje0Var = this.f8323B.f195516j;
                    if (hje0Var != null) {
                        j6 = hje0Var.f108072b;
                        if (j6 != -9223372036854775807L) {
                            jM197886r = vck0.m197886r(j6, jM197886r, jM197874l2);
                        }
                    }
                }
                j7 = jM197886r;
                if (j7 > j3) {
                    j8 = j7;
                } else {
                    j8 = j3;
                }
                jM197886r2 = this.f8355y.f8039a;
                if (jM197886r2 == -9223372036854775807L) {
                    y2cVar = this.f8323B;
                    hje0Var5 = y2cVar.f195516j;
                    if (hje0Var5 != null) {
                        j9 = hje0Var5.f108071a;
                        if (j9 != -9223372036854775807L) {
                            jM197886r2 = j9;
                        } else {
                            jM197886r2 = y2cVar.f195513g;
                            if (jM197886r2 == -9223372036854775807L) {
                                jM197886r2 = this.f8339i;
                            }
                        }
                    } else {
                        jM197886r2 = y2cVar.f195513g;
                        if (jM197886r2 == -9223372036854775807L) {
                            jM197886r2 = this.f8339i;
                        }
                    }
                }
                if (jM197886r2 < j7) {
                    jM197886r2 = j7;
                }
                if (jM197886r2 > j8) {
                    jM197886r2 = vck0.m197886r(vck0.m197874l1(j - Math.min(this.f8340j, j2 / 2)), j7, j8);
                }
                long j12 = j8;
                C1921n.g gVar = this.f8331a.f7962d;
                f = gVar.f8042d;
                if (f == -3.4028235E38f) {
                    hje0Var4 = this.f8323B.f195516j;
                    if (hje0Var4 != null) {
                        f = hje0Var4.f108074d;
                    } else {
                        f = -3.4028235E38f;
                    }
                }
                f2 = gVar.f8043e;
                if (f2 == -3.4028235E38f) {
                    hje0Var3 = this.f8323B.f195516j;
                    if (hje0Var3 != null) {
                        f2 = hje0Var3.f108075e;
                    } else {
                        f2 = -3.4028235E38f;
                    }
                }
                if (f == -3.4028235E38f && f2 == -3.4028235E38f && ((hje0Var2 = this.f8323B.f195516j) == null || hje0Var2.f108071a == -9223372036854775807L)) {
                    f = 1.0f;
                    f2 = 1.0f;
                }
                this.f8355y = new C1921n.g.a().m10687k(jM197886r2).m10685i(j7).m10683g(j12).m10686j(f).m10684h(f2).m10682f();
            }
            j3 = jM197874l2;
            jM197874l1 = vck0.m197874l1(j - j2);
            if (jM197874l1 < 0) {
                jM197874l1 = 0;
            }
            j4 = this.f8323B.f195509c;
            if (j4 != -9223372036854775807L) {
                jM197874l1 = Math.min(jM197874l1 + j4, jM197874l2);
            }
            jM197886r = jM197874l1;
            j5 = this.f8331a.f7962d.f8040b;
            if (j5 != -9223372036854775807L) {
                jM197886r = vck0.m197886r(j5, jM197886r, jM197874l2);
            } else {
                hje0Var = this.f8323B.f195516j;
                if (hje0Var != null) {
                    j6 = hje0Var.f108072b;
                    if (j6 != -9223372036854775807L) {
                        jM197886r = vck0.m197886r(j6, jM197886r, jM197874l2);
                    }
                }
            }
            j7 = jM197886r;
            if (j7 > j3) {
                j8 = j7;
            } else {
                j8 = j3;
            }
            jM197886r2 = this.f8355y.f8039a;
            if (jM197886r2 == -9223372036854775807L) {
                y2cVar = this.f8323B;
                hje0Var5 = y2cVar.f195516j;
                if (hje0Var5 != null) {
                    j9 = hje0Var5.f108071a;
                    if (j9 != -9223372036854775807L) {
                        jM197886r2 = j9;
                    } else {
                        jM197886r2 = y2cVar.f195513g;
                        if (jM197886r2 == -9223372036854775807L) {
                            jM197886r2 = this.f8339i;
                        }
                    }
                } else {
                    jM197886r2 = y2cVar.f195513g;
                    if (jM197886r2 == -9223372036854775807L) {
                        jM197886r2 = this.f8339i;
                    }
                }
            }
            if (jM197886r2 < j7) {
                jM197886r2 = j7;
            }
            if (jM197886r2 > j8) {
                jM197886r2 = vck0.m197886r(vck0.m197874l1(j - Math.min(this.f8340j, j2 / 2)), j7, j8);
            }
            long j13 = j8;
            C1921n.g gVar2 = this.f8331a.f7962d;
            f = gVar2.f8042d;
            if (f == -3.4028235E38f) {
                hje0Var4 = this.f8323B.f195516j;
                if (hje0Var4 != null) {
                    f = hje0Var4.f108074d;
                } else {
                    f = -3.4028235E38f;
                }
            }
            f2 = gVar2.f8043e;
            if (f2 == -3.4028235E38f) {
                hje0Var3 = this.f8323B.f195516j;
                if (hje0Var3 != null) {
                    f2 = hje0Var3.f108075e;
                } else {
                    f2 = -3.4028235E38f;
                }
            }
            if (f == -3.4028235E38f) {
                f = 1.0f;
                f2 = 1.0f;
            }
            this.f8355y = new C1921n.g.a().m10687k(jM197886r2).m10685i(j7).m10683g(j13).m10686j(f).m10684h(f2).m10682f();
        }
        jMin = Math.min(jM197874l2, j10);
        j3 = jMin;
        jM197874l1 = vck0.m197874l1(j - j2);
        if (jM197874l1 < 0) {
            jM197874l1 = 0;
        }
        j4 = this.f8323B.f195509c;
        if (j4 != -9223372036854775807L) {
            jM197874l1 = Math.min(jM197874l1 + j4, jM197874l2);
        }
        jM197886r = jM197874l1;
        j5 = this.f8331a.f7962d.f8040b;
        if (j5 != -9223372036854775807L) {
            jM197886r = vck0.m197886r(j5, jM197886r, jM197874l2);
        } else {
            hje0Var = this.f8323B.f195516j;
            if (hje0Var != null) {
                j6 = hje0Var.f108072b;
                if (j6 != -9223372036854775807L) {
                    jM197886r = vck0.m197886r(j6, jM197886r, jM197874l2);
                }
            }
        }
        j7 = jM197886r;
        if (j7 > j3) {
            j8 = j7;
        } else {
            j8 = j3;
        }
        jM197886r2 = this.f8355y.f8039a;
        if (jM197886r2 == -9223372036854775807L) {
            y2cVar = this.f8323B;
            hje0Var5 = y2cVar.f195516j;
            if (hje0Var5 != null) {
                j9 = hje0Var5.f108071a;
                if (j9 != -9223372036854775807L) {
                    jM197886r2 = j9;
                } else {
                    jM197886r2 = y2cVar.f195513g;
                    if (jM197886r2 == -9223372036854775807L) {
                        jM197886r2 = this.f8339i;
                    }
                }
            } else {
                jM197886r2 = y2cVar.f195513g;
                if (jM197886r2 == -9223372036854775807L) {
                    jM197886r2 = this.f8339i;
                }
            }
        }
        if (jM197886r2 < j7) {
            jM197886r2 = j7;
        }
        if (jM197886r2 > j8) {
            jM197886r2 = vck0.m197886r(vck0.m197874l1(j - Math.min(this.f8340j, j2 / 2)), j7, j8);
        }
        long j14 = j8;
        C1921n.g gVar3 = this.f8331a.f7962d;
        f = gVar3.f8042d;
        if (f == -3.4028235E38f) {
            hje0Var4 = this.f8323B.f195516j;
            if (hje0Var4 != null) {
                f = hje0Var4.f108074d;
            } else {
                f = -3.4028235E38f;
            }
        }
        f2 = gVar3.f8043e;
        if (f2 == -3.4028235E38f) {
            hje0Var3 = this.f8323B.f195516j;
            if (hje0Var3 != null) {
                f2 = hje0Var3.f108075e;
            } else {
                f2 = -3.4028235E38f;
            }
        }
        if (f == -3.4028235E38f) {
            f = 1.0f;
            f2 = 1.0f;
        }
        this.f8355y = new C1921n.g.a().m10687k(jM197886r2).m10685i(j7).m10683g(j14).m10686j(f).m10684h(f2).m10682f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public InterfaceC1953h createPeriod(InterfaceC1965i.b bVar, sj0 sj0Var, long j) {
        int iIntValue = ((Integer) bVar.f114355a).intValue() - this.f8330I;
        InterfaceC1966j.a aVarCreateEventDispatcher = createEventDispatcher(bVar);
        C1947b c1947b = new C1947b(this.f8330I + iIntValue, this.f8323B, this.f8338h, iIntValue, this.f8334d, this.f8352v, null, this.f8336f, createDrmEventDispatcher(bVar), this.f8337g, aVarCreateEventDispatcher, this.f8327F, this.f8349s, sj0Var, this.f8335e, this.f8348r, getPlayerId());
        this.f8345o.put(c1947b.f8385a, c1947b);
        return c1947b;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public C1921n getMediaItem() {
        return this.f8331a;
    }

    /* JADX INFO: renamed from: k */
    public final long m10998k() {
        return Math.min((this.f8328G - 1) * 1000, 5000);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f8349s.mo11027a();
    }

    /* JADX INFO: renamed from: p */
    public final void m10999p() {
        pkf0.m170040j(this.f8351u, new C1938a());
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    public void prepareSourceInternal(@Nullable l7j0 l7j0Var) {
        this.f8352v = l7j0Var;
        this.f8336f.mo9877d(Looper.myLooper(), getPlayerId());
        this.f8336f.prepare();
        if (this.f8332b) {
            m10991A(false);
            return;
        }
        this.f8350t = this.f8333c.mo95019a();
        this.f8351u = new Loader("DashMediaSource");
        this.f8354x = vck0.m197896w();
        m10979G();
    }

    /* JADX INFO: renamed from: r */
    public void m11000r(long j) {
        long j2 = this.f8329H;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.f8329H = j;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void releasePeriod(InterfaceC1953h interfaceC1953h) {
        C1947b c1947b = (C1947b) interfaceC1953h;
        c1947b.m11051H();
        this.f8345o.remove(c1947b.f8385a);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    public void releaseSourceInternal() {
        this.f8324C = false;
        this.f8350t = null;
        Loader loader = this.f8351u;
        if (loader != null) {
            loader.m12090l();
            this.f8351u = null;
        }
        this.f8325D = 0L;
        this.f8326E = 0L;
        this.f8323B = this.f8332b ? this.f8323B : null;
        this.f8356z = this.f8322A;
        this.f8353w = null;
        Handler handler = this.f8354x;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f8354x = null;
        }
        this.f8327F = -9223372036854775807L;
        this.f8328G = 0;
        this.f8329H = -9223372036854775807L;
        this.f8345o.clear();
        this.f8338h.m180519i();
        this.f8336f.release();
    }

    /* JADX INFO: renamed from: s */
    public void m11001s() {
        this.f8354x.removeCallbacks(this.f8347q);
        m10979G();
    }

    /* JADX INFO: renamed from: t */
    public void m11002t(C2050d<?> c2050d, long j, long j2) {
        lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
        this.f8337g.m12122c(c2050d.f9524a);
        this.f8341k.m11280j(lrvVar, c2050d.f9526c);
    }

    /* JADX INFO: renamed from: u */
    public void m11003u(C2050d<y2c> c2050d, long j, long j2) {
        lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
        this.f8337g.m12122c(c2050d.f9524a);
        this.f8341k.m11283m(lrvVar, c2050d.f9526c);
        y2c y2cVarM12126e = c2050d.m12126e();
        y2c y2cVar = this.f8323B;
        int iM212361e = y2cVar == null ? 0 : y2cVar.m212361e();
        long j3 = y2cVarM12126e.m212360d(0).f108037b;
        int i = 0;
        while (i < iM212361e && this.f8323B.m212360d(i).f108037b < j3) {
            i++;
        }
        if (y2cVarM12126e.f195510d) {
            if (iM212361e - i > y2cVarM12126e.m212361e()) {
                jwv.m143689i("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j4 = this.f8329H;
                if (j4 == -9223372036854775807L || y2cVarM12126e.f195514h * 1000 > j4) {
                    this.f8328G = 0;
                } else {
                    jwv.m143689i("DashMediaSource", "Loaded stale dynamic manifest: " + y2cVarM12126e.f195514h + ", " + this.f8329H);
                }
            }
            int i2 = this.f8328G;
            this.f8328G = i2 + 1;
            if (i2 < this.f8337g.mo12120d(c2050d.f9526c)) {
                m10995E(m10998k());
                return;
            } else {
                this.f8353w = new DashManifestStaleException();
                return;
            }
        }
        this.f8323B = y2cVarM12126e;
        this.f8324C = y2cVarM12126e.f195510d & this.f8324C;
        this.f8325D = j - j2;
        this.f8326E = j;
        synchronized (this.f8344n) {
            try {
                if (c2050d.f9525b.f9492a == this.f8356z) {
                    Uri uriM12127f = this.f8323B.f195517k;
                    if (uriM12127f == null) {
                        uriM12127f = c2050d.m12127f();
                    }
                    this.f8356z = uriM12127f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iM212361e != 0) {
            this.f8330I += i;
            m10991A(true);
            return;
        }
        y2c y2cVar2 = this.f8323B;
        if (!y2cVar2.f195510d) {
            m10991A(true);
            return;
        }
        fck0 fck0Var = y2cVar2.f195515i;
        if (fck0Var != null) {
            m10992B(fck0Var);
        } else {
            m10999p();
        }
    }

    /* JADX INFO: renamed from: v */
    public Loader.C2042c m11004v(C2050d<y2c> c2050d, long j, long j2, IOException iOException, int i) {
        lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
        long jMo12118a = this.f8337g.mo12118a(new InterfaceC2049c.c(lrvVar, new nkx(c2050d.f9526c), iOException, i));
        Loader.C2042c c2042cM12084h = jMo12118a == -9223372036854775807L ? Loader.f9459g : Loader.m12084h(false, jMo12118a);
        boolean zM12095c = c2042cM12084h.m12095c();
        this.f8341k.m11287q(lrvVar, c2050d.f9526c, iOException, !zM12095c);
        if (!zM12095c) {
            this.f8337g.m12122c(c2050d.f9524a);
        }
        return c2042cM12084h;
    }

    /* JADX INFO: renamed from: w */
    public void m11005w(C2050d<Long> c2050d, long j, long j2) {
        lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
        this.f8337g.m12122c(c2050d.f9524a);
        this.f8341k.m11283m(lrvVar, c2050d.f9526c);
        m11008z(c2050d.m12126e().longValue() - j);
    }

    /* JADX INFO: renamed from: x */
    public Loader.C2042c m11006x(C2050d<Long> c2050d, long j, long j2, IOException iOException) {
        this.f8341k.m11287q(new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b()), c2050d.f9526c, iOException, true);
        this.f8337g.m12122c(c2050d.f9524a);
        m11007y(iOException);
        return Loader.f9458f;
    }

    /* JADX INFO: renamed from: y */
    public final void m11007y(IOException iOException) {
        jwv.m143684d("DashMediaSource", "Failed to resolve time offset.", iOException);
        m10991A(true);
    }

    /* JADX INFO: renamed from: z */
    public final void m11008z(long j) {
        this.f8327F = j;
        m10991A(true);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$h */
    public static final class C1945h implements C2050d.a<Long> {
        public C1945h() {
        }

        @Override // com.google.android.exoplayer2.upstream.C2050d.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo11019a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(vck0.m197820Q0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public /* synthetic */ C1945h(C1938a c1938a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$c */
    public final class C1940c implements C1949d.b {
        public C1940c() {
        }

        @Override // com.google.android.exoplayer2.source.dash.C1949d.b
        /* JADX INFO: renamed from: a */
        public void mo11017a(long j) {
            DashMediaSource.this.m11000r(j);
        }

        @Override // com.google.android.exoplayer2.source.dash.C1949d.b
        /* JADX INFO: renamed from: b */
        public void mo11018b() {
            DashMediaSource.this.m11001s();
        }

        public /* synthetic */ C1940c(DashMediaSource dashMediaSource, C1938a c1938a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$e */
    public final class C1942e implements Loader.InterfaceC2041b<C2050d<y2c>> {
        public C1942e() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo11024n(C2050d<y2c> c2050d, long j, long j2, boolean z) {
            DashMediaSource.this.m11002t(c2050d, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo11025o(C2050d<y2c> c2050d, long j, long j2) {
            DashMediaSource.this.m11003u(c2050d, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.C2042c mo11026q(C2050d<y2c> c2050d, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.m11004v(c2050d, j, j2, iOException, i);
        }

        public /* synthetic */ C1942e(DashMediaSource dashMediaSource, C1938a c1938a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$g */
    public final class C1944g implements Loader.InterfaceC2041b<C2050d<Long>> {
        public C1944g() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo11024n(C2050d<Long> c2050d, long j, long j2, boolean z) {
            DashMediaSource.this.m11002t(c2050d, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo11025o(C2050d<Long> c2050d, long j, long j2) {
            DashMediaSource.this.m11005w(c2050d, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.C2042c mo11026q(C2050d<Long> c2050d, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.m11006x(c2050d, j, j2, iOException);
        }

        public /* synthetic */ C1944g(DashMediaSource dashMediaSource, C1938a c1938a) {
            this();
        }
    }

    public static final class Factory implements InterfaceC1967k {

        /* JADX INFO: renamed from: l */
        public static final /* synthetic */ int f8357l = 0;

        /* JADX INFO: renamed from: c */
        public final InterfaceC1946a.a f8358c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final a5c.InterfaceC15531a f8359d;

        /* JADX INFO: renamed from: e */
        public za5.InterfaceC21651a f8360e;

        /* JADX INFO: renamed from: f */
        public vce f8361f;

        /* JADX INFO: renamed from: g */
        public as5 f8362g;

        /* JADX INFO: renamed from: h */
        public InterfaceC2049c f8363h;

        /* JADX INFO: renamed from: i */
        public long f8364i;

        /* JADX INFO: renamed from: j */
        public long f8365j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public C2050d.a<? extends y2c> f8366k;

        public Factory(InterfaceC1946a.a aVar, @Nullable a5c.InterfaceC15531a interfaceC15531a) {
            this.f8358c = (InterfaceC1946a.a) p11.m167011e(aVar);
            this.f8359d = interfaceC15531a;
            this.f8361f = new C1853a();
            this.f8363h = new C2048b();
            this.f8364i = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
            this.f8365j = 5000000L;
            this.f8362g = new mmd();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public DashMediaSource mo10958c(C1921n c1921n) {
            p11.m167011e(c1921n.f7960b);
            C2050d.a z2cVar = this.f8366k;
            if (z2cVar == null) {
                z2cVar = new z2c();
            }
            List<StreamKey> list = c1921n.f7960b.f8061e;
            C2050d.a rkiVar = !list.isEmpty() ? new rki(z2cVar, list) : z2cVar;
            za5.InterfaceC21651a interfaceC21651a = this.f8360e;
            if (interfaceC21651a != null) {
                interfaceC21651a.m217721a(c1921n);
            }
            return new DashMediaSource(c1921n, null, this.f8359d, rkiVar, this.f8358c, this.f8362g, null, this.f8361f.mo9910a(c1921n), this.f8363h, this.f8364i, this.f8365j, null);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory mo10959d(za5.InterfaceC21651a interfaceC21651a) {
            this.f8360e = (za5.InterfaceC21651a) p11.m167011e(interfaceC21651a);
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo10956a(vce vceVar) {
            this.f8361f = (vce) p11.m167012f(vceVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory mo10957b(InterfaceC2049c interfaceC2049c) {
            this.f8363h = (InterfaceC2049c) p11.m167012f(interfaceC2049c, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(a5c.InterfaceC15531a interfaceC15531a) {
            this(new C1948c.a(interfaceC15531a), interfaceC15531a);
        }
    }

    public /* synthetic */ DashMediaSource(C1921n c1921n, y2c y2cVar, a5c.InterfaceC15531a interfaceC15531a, C2050d.a aVar, InterfaceC1946a.a aVar2, as5 as5Var, za5 za5Var, InterfaceC1855c interfaceC1855c, InterfaceC2049c interfaceC2049c, long j, long j2, C1938a c1938a) {
        this(c1921n, y2cVar, interfaceC15531a, aVar, aVar2, as5Var, za5Var, interfaceC1855c, interfaceC2049c, j, j2);
    }
}
