package p149l;

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
public class xxx {

    /* JADX INFO: renamed from: A */
    private String f194922A;

    /* JADX INFO: renamed from: B */
    private int f194923B;

    /* JADX INFO: renamed from: C */
    private double f194924C;

    /* JADX INFO: renamed from: D */
    private double f194925D;

    /* JADX INFO: renamed from: E */
    private C21254b f194926E;

    /* JADX INFO: renamed from: F */
    private C21254b f194927F;

    /* JADX INFO: renamed from: G */
    private C21254b f194928G;

    /* JADX INFO: renamed from: H */
    private C21254b f194929H;

    /* JADX INFO: renamed from: I */
    private C21254b f194930I;

    /* JADX INFO: renamed from: J */
    private C21254b f194931J;

    /* JADX INFO: renamed from: K */
    private C21254b f194932K;

    /* JADX INFO: renamed from: L */
    private C21255c f194933L;

    /* JADX INFO: renamed from: M */
    private String f194934M;

    /* JADX INFO: renamed from: N */
    private String f194935N;

    /* JADX INFO: renamed from: O */
    private String f194936O;

    /* JADX INFO: renamed from: P */
    private String f194937P;

    /* JADX INFO: renamed from: Q */
    private String f194938Q;

    /* JADX INFO: renamed from: R */
    private int f194939R;

    /* JADX INFO: renamed from: S */
    private String f194940S;

    /* JADX INFO: renamed from: a */
    private long f194941a;

    /* JADX INFO: renamed from: b */
    private float f194942b;

    /* JADX INFO: renamed from: c */
    private float f194943c;

    /* JADX INFO: renamed from: d */
    private float f194944d;

    /* JADX INFO: renamed from: e */
    private float f194945e;

    /* JADX INFO: renamed from: f */
    private int f194946f;

    /* JADX INFO: renamed from: g */
    private volatile boolean f194947g;

    /* JADX INFO: renamed from: h */
    private int f194948h;

    /* JADX INFO: renamed from: i */
    private String f194949i;

    /* JADX INFO: renamed from: j */
    private String f194950j;

    /* JADX INFO: renamed from: k */
    private String f194951k;

    /* JADX INFO: renamed from: l */
    private String f194952l;

    /* JADX INFO: renamed from: m */
    public boolean f194953m;

    /* JADX INFO: renamed from: n */
    public boolean f194954n;

    /* JADX INFO: renamed from: o */
    public int f194955o;

    /* JADX INFO: renamed from: p */
    public int f194956p;

    /* JADX INFO: renamed from: q */
    public int f194957q;

    /* JADX INFO: renamed from: r */
    public int f194958r;

    /* JADX INFO: renamed from: s */
    public int f194959s;

    /* JADX INFO: renamed from: t */
    public int f194960t;

    /* JADX INFO: renamed from: u */
    public int f194961u;

    /* JADX INFO: renamed from: v */
    public int f194962v;

    /* JADX INFO: renamed from: w */
    public int f194963w;

    /* JADX INFO: renamed from: x */
    public int f194964x;

    /* JADX INFO: renamed from: y */
    private int f194965y;

    /* JADX INFO: renamed from: z */
    private int f194966z;

    /* JADX INFO: renamed from: l.xxx$b */
    public class C21254b {

        /* JADX INFO: renamed from: a */
        private String f194967a;

        /* JADX INFO: renamed from: e */
        private final Object f194971e = new Object();

        /* JADX INFO: renamed from: b */
        private long f194968b = -1;

        /* JADX INFO: renamed from: c */
        private long f194969c = 0;

        /* JADX INFO: renamed from: d */
        private long f194970d = 0;

        public C21254b(String str) {
            this.f194967a = str;
        }

        /* JADX INFO: renamed from: a */
        public long m211642a() {
            return this.f194970d;
        }

        /* JADX INFO: renamed from: b */
        public long m211643b() {
            return this.f194969c;
        }

        /* JADX INFO: renamed from: c */
        public void m211644c() {
            this.f194968b = SystemClock.elapsedRealtime();
            this.f194969c = 0L;
            this.f194970d = 0L;
        }

        /* JADX INFO: renamed from: d */
        public void m211645d() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f194968b;
            long j2 = jElapsedRealtime - j;
            if (j == -1) {
                j2 = 0;
            }
            hjx.m131418a("FeaturesCost", "[" + this.f194967a + "] (" + j2 + Constants.SEPARATOR_COMMA + this.f194969c + Constants.SEPARATOR_COMMA + this.f194970d + ")");
        }

        /* JADX INFO: renamed from: e */
        public void m211646e(long j) {
            synchronized (this.f194971e) {
                try {
                    if (this.f194968b == -1) {
                        this.f194968b = SystemClock.elapsedRealtime();
                    }
                    this.f194970d += j;
                    this.f194969c++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.xxx$c */
    public class C21255c {

        /* JADX INFO: renamed from: a */
        private String f194973a;

        /* JADX INFO: renamed from: b */
        private StringBuffer f194974b = new StringBuffer();

        /* JADX INFO: renamed from: c */
        private AtomicInteger f194975c;

        public C21255c(String str) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f194975c = atomicInteger;
            this.f194973a = str;
            atomicInteger.set(0);
            this.f194974b.setLength(0);
        }

        /* JADX INFO: renamed from: a */
        public String m211647a() {
            return "[(" + this.f194974b.toString() + ")]";
        }

        /* JADX INFO: renamed from: b */
        public void m211648b() {
            this.f194975c.set(0);
            this.f194974b.setLength(0);
        }

        /* JADX INFO: renamed from: c */
        public void m211649c(String str, long j, long j2) {
            if (this.f194975c.get() >= 10) {
                m211648b();
            }
            if (this.f194974b.length() > 0) {
                this.f194974b.append(Constants.SEPARATOR_COMMA);
            }
            StringBuffer stringBuffer = this.f194974b;
            stringBuffer.append(j);
            stringBuffer.append(Constants.SEPARATOR_COMMA);
            stringBuffer.append(j2);
            stringBuffer.append(Constants.SEPARATOR_COMMA);
            stringBuffer.append(str);
            this.f194975c.getAndIncrement();
        }
    }

    /* JADX INFO: renamed from: l.xxx$d */
    public static class C21256d {

        /* JADX INFO: renamed from: a */
        private static xxx f194977a = new xxx();
    }

    private xxx() {
        this.f194949i = "";
        this.f194950j = "";
        this.f194951k = "";
        this.f194952l = "";
        this.f194953m = false;
        this.f194954n = false;
        this.f194955o = 0;
        this.f194956p = 0;
        this.f194957q = 0;
        this.f194958r = 0;
        this.f194959s = 0;
        this.f194960t = 0;
        this.f194961u = 0;
        this.f194962v = 0;
        this.f194963w = 0;
        this.f194964x = 0;
        this.f194966z = 0;
        this.f194922A = "wifi";
        this.f194923B = -1;
        this.f194924C = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f194925D = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f194926E = new C21254b("faceDetectCost");
        this.f194927F = new C21254b("adjustFilterCost");
        this.f194928G = new C21254b(RequirementDefine.REQUIREMENT_BODY_DETECT_TAG);
        this.f194929H = new C21254b("expressDetect");
        this.f194930I = new C21254b("gestureDetect");
        this.f194931J = new C21254b("imageSegCost");
        this.f194932K = new C21254b("cpuProcessCost");
        this.f194933L = new C21255c("gestureInfo");
        this.f194940S = "无";
    }

    /* JADX INFO: renamed from: F */
    public static xxx m211572F() {
        return C21256d.f194977a;
    }

    /* JADX INFO: renamed from: A */
    public long m211573A() {
        return this.f194930I.m211642a();
    }

    /* JADX INFO: renamed from: B */
    public String m211574B() {
        return this.f194933L.m211647a();
    }

    /* JADX INFO: renamed from: C */
    public boolean m211575C() {
        return this.f194953m;
    }

    /* JADX INFO: renamed from: D */
    public boolean m211576D() {
        return this.f194947g;
    }

    /* JADX INFO: renamed from: E */
    public long m211577E() {
        return this.f194931J.m211642a();
    }

    /* JADX INFO: renamed from: G */
    public String m211578G() {
        return this.f194949i;
    }

    /* JADX INFO: renamed from: H */
    public int m211579H() {
        return this.f194965y;
    }

    /* JADX INFO: renamed from: I */
    public float m211580I() {
        return this.f194945e;
    }

    /* JADX INFO: renamed from: J */
    public int m211581J() {
        return this.f194948h;
    }

    /* JADX INFO: renamed from: K */
    public int m211582K() {
        return this.f194946f;
    }

    /* JADX INFO: renamed from: L */
    public String m211583L() {
        return this.f194922A;
    }

    /* JADX INFO: renamed from: M */
    public void m211584M() {
        this.f194960t++;
    }

    /* JADX INFO: renamed from: N */
    public void m211585N() {
        this.f194941a++;
    }

    /* JADX INFO: renamed from: O */
    public void m211586O() {
        this.f194962v++;
    }

    /* JADX INFO: renamed from: P */
    public void m211587P() {
        this.f194961u++;
    }

    /* JADX INFO: renamed from: Q */
    public void m211588Q() {
        this.f194963w++;
    }

    /* JADX INFO: renamed from: R */
    public void m211589R() {
        this.f194964x++;
    }

    /* JADX INFO: renamed from: S */
    public void m211590S() {
        this.f194926E.m211645d();
        this.f194927F.m211645d();
        this.f194928G.m211645d();
        this.f194929H.m211645d();
        this.f194930I.m211645d();
        this.f194931J.m211645d();
        this.f194932K.m211645d();
        hjx.m131418a("FeaturesCost", "===");
    }

    /* JADX INFO: renamed from: T */
    public void m211591T() {
        this.f194926E.m211644c();
        this.f194927F.m211644c();
        this.f194928G.m211644c();
        this.f194929H.m211644c();
        this.f194930I.m211644c();
        this.f194931J.m211644c();
        this.f194932K.m211644c();
        this.f194933L.m211648b();
        this.f194935N = null;
        this.f194936O = null;
        this.f194937P = null;
    }

    /* JADX INFO: renamed from: U */
    public void m211592U(int i, int i2) {
        this.f194956p = i2;
        this.f194955o = i;
    }

    /* JADX INFO: renamed from: V */
    public void m211593V(long j) {
        this.f194928G.m211646e(j);
    }

    /* JADX INFO: renamed from: W */
    public void m211594W(float f, float f2) {
        this.f194936O = "(x:" + (Math.round(f * 100.0f) / 100.0f) + " y:" + (Math.round(f2 * 100.0f) / 100.0f) + ")";
    }

    /* JADX INFO: renamed from: X */
    public void m211595X(int i) {
        this.f194939R = i;
    }

    /* JADX INFO: renamed from: Y */
    public void m211596Y(List<int[]> list) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int[] iArr : list) {
            stringBuffer.append("(" + iArr[0] + Constants.SEPARATOR_COMMA + iArr[1] + ")");
        }
        this.f194950j = "setCameraPrevewFps" + stringBuffer.toString();
    }

    /* JADX INFO: renamed from: Z */
    public void m211597Z(int i, int i2) {
        this.f194952l = "(" + i + BaseSei.f13930X + i2 + ")";
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: a */
    public Size m211598a() {
        return new Size(this.f194955o, this.f194956p);
    }

    /* JADX INFO: renamed from: a0 */
    public void m211599a0(List<Camera.Size> list) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Camera.Size size : list) {
            stringBuffer.append("(" + size.width + Constants.SEPARATOR_COMMA + size.height + ")");
        }
        this.f194951k = "previewsSizes:" + stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public int m211600b() {
        return this.f194923B;
    }

    /* JADX INFO: renamed from: b0 */
    public void m211601b0(long j) {
        this.f194932K.m211646e(j);
    }

    /* JADX INFO: renamed from: c */
    public float m211602c() {
        return this.f194944d;
    }

    /* JADX INFO: renamed from: c0 */
    public void m211603c0(int i) {
        this.f194957q = i;
    }

    /* JADX INFO: renamed from: d */
    public long m211604d() {
        return this.f194928G.m211642a();
    }

    /* JADX INFO: renamed from: d0 */
    public void m211605d0(long j) {
        this.f194929H.m211646e(j);
    }

    /* JADX INFO: renamed from: e */
    public String m211606e() {
        return this.f194936O;
    }

    /* JADX INFO: renamed from: e0 */
    public void m211607e0(long j) {
        this.f194926E.m211646e(j);
    }

    /* JADX INFO: renamed from: f */
    public String m211608f() {
        return this.f194935N;
    }

    /* JADX INFO: renamed from: f0 */
    public void m211609f0(float f, float f2, float f3) {
        this.f194938Q = "(roll:" + f + " yaw:" + f2 + " pitch: " + f3 + ")";
    }

    /* JADX INFO: renamed from: g */
    public String m211610g() {
        return this.f194934M;
    }

    /* JADX INFO: renamed from: g0 */
    public void m211611g0(float f, float f2, float f3, float f4) {
        this.f194937P = "(x:" + (Math.round(f * 100.0f) / 100.0f) + " y:" + (Math.round(f2 * 100.0f) / 100.0f) + " w:" + (Math.round(f3 * 100.0f) / 100.0f) + " h:" + (Math.round(f4 * 100.0f) / 100.0f) + ")";
    }

    /* JADX INFO: renamed from: h */
    public int m211612h() {
        return this.f194939R;
    }

    /* JADX INFO: renamed from: h0 */
    public void m211613h0(long j) {
        this.f194927F.m211646e(j);
    }

    /* JADX INFO: renamed from: i */
    public String m211614i() {
        return this.f194950j;
    }

    /* JADX INFO: renamed from: i0 */
    public void m211615i0(long j) {
        this.f194930I.m211646e(j);
    }

    /* JADX INFO: renamed from: j */
    public String m211616j() {
        return this.f194951k;
    }

    /* JADX INFO: renamed from: j0 */
    public void m211617j0(String str, long j, long j2) {
        this.f194933L.m211649c(str, j2, j);
    }

    /* JADX INFO: renamed from: k */
    public String m211618k() {
        return this.f194952l;
    }

    /* JADX INFO: renamed from: k0 */
    public void m211619k0(boolean z) {
        this.f194953m = z;
    }

    /* JADX INFO: renamed from: l */
    public long m211620l() {
        return this.f194941a;
    }

    /* JADX INFO: renamed from: l0 */
    public void m211621l0(boolean z) {
        this.f194947g = z;
    }

    /* JADX INFO: renamed from: m */
    public long m211622m() {
        return this.f194932K.m211642a();
    }

    /* JADX INFO: renamed from: m0 */
    public void m211623m0(long j) {
        this.f194931J.m211646e(j);
    }

    /* JADX INFO: renamed from: n */
    public long m211624n() {
        return this.f194932K.m211643b();
    }

    /* JADX INFO: renamed from: n0 */
    public void m211625n0(int i, int i2) {
        this.f194958r = i;
        this.f194959s = i2;
    }

    /* JADX INFO: renamed from: o */
    public int m211626o() {
        int i = this.f194966z;
        this.f194966z = 0;
        return i;
    }

    /* JADX INFO: renamed from: o0 */
    public void m211627o0(int i, int i2) {
        this.f194949i = i + "-" + i2;
    }

    /* JADX INFO: renamed from: p */
    public long m211628p() {
        return this.f194929H.m211642a();
    }

    /* JADX INFO: renamed from: p0 */
    public void m211629p0(int i) {
        this.f194965y = i;
    }

    /* JADX INFO: renamed from: q */
    public long m211630q() {
        return this.f194926E.m211642a();
    }

    /* JADX INFO: renamed from: q0 */
    public void m211631q0(int i) {
        this.f194948h = i;
    }

    /* JADX INFO: renamed from: r */
    public long m211632r() {
        return this.f194926E.m211643b();
    }

    /* JADX INFO: renamed from: r0 */
    public void m211633r0(String str) {
        this.f194922A = str;
    }

    /* JADX INFO: renamed from: s */
    public String m211634s() {
        return this.f194938Q;
    }

    /* JADX INFO: renamed from: t */
    public float m211635t() {
        return this.f194942b;
    }

    /* JADX INFO: renamed from: u */
    public String m211636u() {
        return this.f194937P;
    }

    /* JADX INFO: renamed from: v */
    public float m211637v() {
        return this.f194943c;
    }

    /* JADX INFO: renamed from: w */
    public String m211638w() {
        StringBuilder sb = new StringBuilder("(");
        sb.append("pWH:" + m211572F().m211618k());
        sb.append("-aW:" + this.f194955o + "-aH:" + this.f194956p);
        sb.append("-eW:" + this.f194958r + "-eH:" + this.f194959s);
        sb.append("-dm:".concat(this.f194957q == 1 ? "center" : "normal"));
        sb.append("-renderToAgora:" + this.f194960t);
        sb.append("-renderToMerge:" + this.f194961u);
        sb.append("-renderToEndPoint:" + this.f194962v);
        sb.append("-surfaceRender:" + this.f194963w);
        sb.append("-frameNotAvail:" + this.f194964x);
        this.f194960t = 0;
        this.f194961u = 0;
        this.f194962v = 0;
        this.f194963w = 0;
        this.f194964x = 0;
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public long m211639x() {
        return this.f194927F.m211642a();
    }

    /* JADX INFO: renamed from: y */
    public long m211640y() {
        return this.f194927F.m211643b();
    }

    /* JADX INFO: renamed from: z */
    public String m211641z() {
        return this.f194940S;
    }
}
