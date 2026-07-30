package p153l;

import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Size;
import androidx.annotation.RequiresApi;
import com.bef.effectsdk.RequirementDefine;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class u6y {

    /* JADX INFO: renamed from: A */
    private String f177814A;

    /* JADX INFO: renamed from: B */
    private int f177815B;

    /* JADX INFO: renamed from: C */
    private double f177816C;

    /* JADX INFO: renamed from: D */
    private double f177817D;

    /* JADX INFO: renamed from: E */
    private C20508b f177818E;

    /* JADX INFO: renamed from: F */
    private C20508b f177819F;

    /* JADX INFO: renamed from: G */
    private C20508b f177820G;

    /* JADX INFO: renamed from: H */
    private C20508b f177821H;

    /* JADX INFO: renamed from: I */
    private C20508b f177822I;

    /* JADX INFO: renamed from: J */
    private C20508b f177823J;

    /* JADX INFO: renamed from: K */
    private C20508b f177824K;

    /* JADX INFO: renamed from: L */
    private C20509c f177825L;

    /* JADX INFO: renamed from: M */
    private String f177826M;

    /* JADX INFO: renamed from: N */
    private String f177827N;

    /* JADX INFO: renamed from: O */
    private String f177828O;

    /* JADX INFO: renamed from: P */
    private String f177829P;

    /* JADX INFO: renamed from: Q */
    private String f177830Q;

    /* JADX INFO: renamed from: R */
    private int f177831R;

    /* JADX INFO: renamed from: S */
    private String f177832S;

    /* JADX INFO: renamed from: a */
    private long f177833a;

    /* JADX INFO: renamed from: b */
    private float f177834b;

    /* JADX INFO: renamed from: c */
    private float f177835c;

    /* JADX INFO: renamed from: d */
    private float f177836d;

    /* JADX INFO: renamed from: e */
    private float f177837e;

    /* JADX INFO: renamed from: f */
    private int f177838f;

    /* JADX INFO: renamed from: g */
    private volatile boolean f177839g;

    /* JADX INFO: renamed from: h */
    private int f177840h;

    /* JADX INFO: renamed from: i */
    private String f177841i;

    /* JADX INFO: renamed from: j */
    private String f177842j;

    /* JADX INFO: renamed from: k */
    private String f177843k;

    /* JADX INFO: renamed from: l */
    private String f177844l;

    /* JADX INFO: renamed from: m */
    public boolean f177845m;

    /* JADX INFO: renamed from: n */
    public boolean f177846n;

    /* JADX INFO: renamed from: o */
    public int f177847o;

    /* JADX INFO: renamed from: p */
    public int f177848p;

    /* JADX INFO: renamed from: q */
    public int f177849q;

    /* JADX INFO: renamed from: r */
    public int f177850r;

    /* JADX INFO: renamed from: s */
    public int f177851s;

    /* JADX INFO: renamed from: t */
    public int f177852t;

    /* JADX INFO: renamed from: u */
    public int f177853u;

    /* JADX INFO: renamed from: v */
    public int f177854v;

    /* JADX INFO: renamed from: w */
    public int f177855w;

    /* JADX INFO: renamed from: x */
    public int f177856x;

    /* JADX INFO: renamed from: y */
    private int f177857y;

    /* JADX INFO: renamed from: z */
    private int f177858z;

    /* JADX INFO: renamed from: l.u6y$b */
    public class C20508b {

        /* JADX INFO: renamed from: a */
        private String f177859a;

        /* JADX INFO: renamed from: e */
        private final Object f177863e = new Object();

        /* JADX INFO: renamed from: b */
        private long f177860b = -1;

        /* JADX INFO: renamed from: c */
        private long f177861c = 0;

        /* JADX INFO: renamed from: d */
        private long f177862d = 0;

        public C20508b(String str) {
            this.f177859a = str;
        }

        /* JADX INFO: renamed from: a */
        public long m194792a() {
            return this.f177862d;
        }

        /* JADX INFO: renamed from: b */
        public long m194793b() {
            return this.f177861c;
        }

        /* JADX INFO: renamed from: c */
        public void m194794c() {
            this.f177860b = SystemClock.elapsedRealtime();
            this.f177861c = 0L;
            this.f177862d = 0L;
        }

        /* JADX INFO: renamed from: d */
        public void m194795d() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f177860b;
            long j2 = jElapsedRealtime - j;
            if (j == -1) {
                j2 = 0;
            }
            esx.m122396a("FeaturesCost", "[" + this.f177859a + "] (" + j2 + Constants.SEPARATOR_COMMA + this.f177861c + Constants.SEPARATOR_COMMA + this.f177862d + ")");
        }

        /* JADX INFO: renamed from: e */
        public void m194796e(long j) {
            synchronized (this.f177863e) {
                try {
                    if (this.f177860b == -1) {
                        this.f177860b = SystemClock.elapsedRealtime();
                    }
                    this.f177862d += j;
                    this.f177861c++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.u6y$c */
    public class C20509c {

        /* JADX INFO: renamed from: a */
        private String f177865a;

        /* JADX INFO: renamed from: b */
        private StringBuffer f177866b = new StringBuffer();

        /* JADX INFO: renamed from: c */
        private AtomicInteger f177867c;

        public C20509c(String str) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f177867c = atomicInteger;
            this.f177865a = str;
            atomicInteger.set(0);
            this.f177866b.setLength(0);
        }

        /* JADX INFO: renamed from: a */
        public String m194797a() {
            return "[(" + this.f177866b.toString() + ")]";
        }

        /* JADX INFO: renamed from: b */
        public void m194798b() {
            this.f177867c.set(0);
            this.f177866b.setLength(0);
        }

        /* JADX INFO: renamed from: c */
        public void m194799c(String str, long j, long j2) {
            if (this.f177867c.get() >= 10) {
                m194798b();
            }
            if (this.f177866b.length() > 0) {
                this.f177866b.append(Constants.SEPARATOR_COMMA);
            }
            StringBuffer stringBuffer = this.f177866b;
            stringBuffer.append(j);
            stringBuffer.append(Constants.SEPARATOR_COMMA);
            stringBuffer.append(j2);
            stringBuffer.append(Constants.SEPARATOR_COMMA);
            stringBuffer.append(str);
            this.f177867c.getAndIncrement();
        }
    }

    /* JADX INFO: renamed from: l.u6y$d */
    public static class C20510d {

        /* JADX INFO: renamed from: a */
        private static u6y f177869a = new u6y();
    }

    private u6y() {
        this.f177841i = "";
        this.f177842j = "";
        this.f177843k = "";
        this.f177844l = "";
        this.f177845m = false;
        this.f177846n = false;
        this.f177847o = 0;
        this.f177848p = 0;
        this.f177849q = 0;
        this.f177850r = 0;
        this.f177851s = 0;
        this.f177852t = 0;
        this.f177853u = 0;
        this.f177854v = 0;
        this.f177855w = 0;
        this.f177856x = 0;
        this.f177858z = 0;
        this.f177814A = "wifi";
        this.f177815B = -1;
        this.f177816C = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f177817D = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f177818E = new C20508b("faceDetectCost");
        this.f177819F = new C20508b("adjustFilterCost");
        this.f177820G = new C20508b(RequirementDefine.REQUIREMENT_BODY_DETECT_TAG);
        this.f177821H = new C20508b("expressDetect");
        this.f177822I = new C20508b("gestureDetect");
        this.f177823J = new C20508b("imageSegCost");
        this.f177824K = new C20508b("cpuProcessCost");
        this.f177825L = new C20509c("gestureInfo");
        this.f177832S = "无";
    }

    /* JADX INFO: renamed from: F */
    public static u6y m194722F() {
        return C20510d.f177869a;
    }

    /* JADX INFO: renamed from: A */
    public long m194723A() {
        return this.f177822I.m194792a();
    }

    /* JADX INFO: renamed from: B */
    public String m194724B() {
        return this.f177825L.m194797a();
    }

    /* JADX INFO: renamed from: C */
    public boolean m194725C() {
        return this.f177845m;
    }

    /* JADX INFO: renamed from: D */
    public boolean m194726D() {
        return this.f177839g;
    }

    /* JADX INFO: renamed from: E */
    public long m194727E() {
        return this.f177823J.m194792a();
    }

    /* JADX INFO: renamed from: G */
    public String m194728G() {
        return this.f177841i;
    }

    /* JADX INFO: renamed from: H */
    public int m194729H() {
        return this.f177857y;
    }

    /* JADX INFO: renamed from: I */
    public float m194730I() {
        return this.f177837e;
    }

    /* JADX INFO: renamed from: J */
    public int m194731J() {
        return this.f177840h;
    }

    /* JADX INFO: renamed from: K */
    public int m194732K() {
        return this.f177838f;
    }

    /* JADX INFO: renamed from: L */
    public String m194733L() {
        return this.f177814A;
    }

    /* JADX INFO: renamed from: M */
    public void m194734M() {
        this.f177852t++;
    }

    /* JADX INFO: renamed from: N */
    public void m194735N() {
        this.f177833a++;
    }

    /* JADX INFO: renamed from: O */
    public void m194736O() {
        this.f177854v++;
    }

    /* JADX INFO: renamed from: P */
    public void m194737P() {
        this.f177853u++;
    }

    /* JADX INFO: renamed from: Q */
    public void m194738Q() {
        this.f177855w++;
    }

    /* JADX INFO: renamed from: R */
    public void m194739R() {
        this.f177856x++;
    }

    /* JADX INFO: renamed from: S */
    public void m194740S() {
        this.f177818E.m194795d();
        this.f177819F.m194795d();
        this.f177820G.m194795d();
        this.f177821H.m194795d();
        this.f177822I.m194795d();
        this.f177823J.m194795d();
        this.f177824K.m194795d();
        esx.m122396a("FeaturesCost", "===");
    }

    /* JADX INFO: renamed from: T */
    public void m194741T() {
        this.f177818E.m194794c();
        this.f177819F.m194794c();
        this.f177820G.m194794c();
        this.f177821H.m194794c();
        this.f177822I.m194794c();
        this.f177823J.m194794c();
        this.f177824K.m194794c();
        this.f177825L.m194798b();
        this.f177827N = null;
        this.f177828O = null;
        this.f177829P = null;
    }

    /* JADX INFO: renamed from: U */
    public void m194742U(int i, int i2) {
        this.f177848p = i2;
        this.f177847o = i;
    }

    /* JADX INFO: renamed from: V */
    public void m194743V(long j) {
        this.f177820G.m194796e(j);
    }

    /* JADX INFO: renamed from: W */
    public void m194744W(float f, float f2) {
        this.f177828O = "(x:" + (Math.round(f * 100.0f) / 100.0f) + " y:" + (Math.round(f2 * 100.0f) / 100.0f) + ")";
    }

    /* JADX INFO: renamed from: X */
    public void m194745X(int i) {
        this.f177831R = i;
    }

    /* JADX INFO: renamed from: Y */
    public void m194746Y(List<int[]> list) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int[] iArr : list) {
            stringBuffer.append("(" + iArr[0] + Constants.SEPARATOR_COMMA + iArr[1] + ")");
        }
        this.f177842j = "setCameraPrevewFps" + stringBuffer.toString();
    }

    /* JADX INFO: renamed from: Z */
    public void m194747Z(int i, int i2) {
        this.f177844l = "(" + i + BaseSei.f14624X + i2 + ")";
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: a */
    public Size m194748a() {
        return new Size(this.f177847o, this.f177848p);
    }

    /* JADX INFO: renamed from: a0 */
    public void m194749a0(List<Camera.Size> list) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Camera.Size size : list) {
            stringBuffer.append("(" + size.width + Constants.SEPARATOR_COMMA + size.height + ")");
        }
        this.f177843k = "previewsSizes:" + stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public int m194750b() {
        return this.f177815B;
    }

    /* JADX INFO: renamed from: b0 */
    public void m194751b0(long j) {
        this.f177824K.m194796e(j);
    }

    /* JADX INFO: renamed from: c */
    public float m194752c() {
        return this.f177836d;
    }

    /* JADX INFO: renamed from: c0 */
    public void m194753c0(int i) {
        this.f177849q = i;
    }

    /* JADX INFO: renamed from: d */
    public long m194754d() {
        return this.f177820G.m194792a();
    }

    /* JADX INFO: renamed from: d0 */
    public void m194755d0(long j) {
        this.f177821H.m194796e(j);
    }

    /* JADX INFO: renamed from: e */
    public String m194756e() {
        return this.f177828O;
    }

    /* JADX INFO: renamed from: e0 */
    public void m194757e0(long j) {
        this.f177818E.m194796e(j);
    }

    /* JADX INFO: renamed from: f */
    public String m194758f() {
        return this.f177827N;
    }

    /* JADX INFO: renamed from: f0 */
    public void m194759f0(float f, float f2, float f3) {
        this.f177830Q = "(roll:" + f + " yaw:" + f2 + " pitch: " + f3 + ")";
    }

    /* JADX INFO: renamed from: g */
    public String m194760g() {
        return this.f177826M;
    }

    /* JADX INFO: renamed from: g0 */
    public void m194761g0(float f, float f2, float f3, float f4) {
        this.f177829P = "(x:" + (Math.round(f * 100.0f) / 100.0f) + " y:" + (Math.round(f2 * 100.0f) / 100.0f) + " w:" + (Math.round(f3 * 100.0f) / 100.0f) + " h:" + (Math.round(f4 * 100.0f) / 100.0f) + ")";
    }

    /* JADX INFO: renamed from: h */
    public int m194762h() {
        return this.f177831R;
    }

    /* JADX INFO: renamed from: h0 */
    public void m194763h0(long j) {
        this.f177819F.m194796e(j);
    }

    /* JADX INFO: renamed from: i */
    public String m194764i() {
        return this.f177842j;
    }

    /* JADX INFO: renamed from: i0 */
    public void m194765i0(long j) {
        this.f177822I.m194796e(j);
    }

    /* JADX INFO: renamed from: j */
    public String m194766j() {
        return this.f177843k;
    }

    /* JADX INFO: renamed from: j0 */
    public void m194767j0(String str, long j, long j2) {
        this.f177825L.m194799c(str, j2, j);
    }

    /* JADX INFO: renamed from: k */
    public String m194768k() {
        return this.f177844l;
    }

    /* JADX INFO: renamed from: k0 */
    public void m194769k0(boolean z) {
        this.f177845m = z;
    }

    /* JADX INFO: renamed from: l */
    public long m194770l() {
        return this.f177833a;
    }

    /* JADX INFO: renamed from: l0 */
    public void m194771l0(boolean z) {
        this.f177839g = z;
    }

    /* JADX INFO: renamed from: m */
    public long m194772m() {
        return this.f177824K.m194792a();
    }

    /* JADX INFO: renamed from: m0 */
    public void m194773m0(long j) {
        this.f177823J.m194796e(j);
    }

    /* JADX INFO: renamed from: n */
    public long m194774n() {
        return this.f177824K.m194793b();
    }

    /* JADX INFO: renamed from: n0 */
    public void m194775n0(int i, int i2) {
        this.f177850r = i;
        this.f177851s = i2;
    }

    /* JADX INFO: renamed from: o */
    public int m194776o() {
        int i = this.f177858z;
        this.f177858z = 0;
        return i;
    }

    /* JADX INFO: renamed from: o0 */
    public void m194777o0(int i, int i2) {
        this.f177841i = i + "-" + i2;
    }

    /* JADX INFO: renamed from: p */
    public long m194778p() {
        return this.f177821H.m194792a();
    }

    /* JADX INFO: renamed from: p0 */
    public void m194779p0(int i) {
        this.f177857y = i;
    }

    /* JADX INFO: renamed from: q */
    public long m194780q() {
        return this.f177818E.m194792a();
    }

    /* JADX INFO: renamed from: q0 */
    public void m194781q0(int i) {
        this.f177840h = i;
    }

    /* JADX INFO: renamed from: r */
    public long m194782r() {
        return this.f177818E.m194793b();
    }

    /* JADX INFO: renamed from: r0 */
    public void m194783r0(String str) {
        this.f177814A = str;
    }

    /* JADX INFO: renamed from: s */
    public String m194784s() {
        return this.f177830Q;
    }

    /* JADX INFO: renamed from: t */
    public float m194785t() {
        return this.f177834b;
    }

    /* JADX INFO: renamed from: u */
    public String m194786u() {
        return this.f177829P;
    }

    /* JADX INFO: renamed from: v */
    public float m194787v() {
        return this.f177835c;
    }

    /* JADX INFO: renamed from: w */
    public String m194788w() {
        StringBuilder sb = new StringBuilder("(");
        sb.append("pWH:" + m194722F().m194768k());
        sb.append("-aW:" + this.f177847o + "-aH:" + this.f177848p);
        sb.append("-eW:" + this.f177850r + "-eH:" + this.f177851s);
        sb.append("-dm:".concat(this.f177849q == 1 ? "center" : "normal"));
        sb.append("-renderToAgora:" + this.f177852t);
        sb.append("-renderToMerge:" + this.f177853u);
        sb.append("-renderToEndPoint:" + this.f177854v);
        sb.append("-surfaceRender:" + this.f177855w);
        sb.append("-frameNotAvail:" + this.f177856x);
        this.f177852t = 0;
        this.f177853u = 0;
        this.f177854v = 0;
        this.f177855w = 0;
        this.f177856x = 0;
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public long m194789x() {
        return this.f177819F.m194792a();
    }

    /* JADX INFO: renamed from: y */
    public long m194790y() {
        return this.f177819F.m194793b();
    }

    /* JADX INFO: renamed from: z */
    public String m194791z() {
        return this.f177832S;
    }
}
