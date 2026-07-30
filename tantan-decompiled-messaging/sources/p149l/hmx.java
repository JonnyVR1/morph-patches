package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class hmx implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    private zmx f108482a;

    /* JADX INFO: renamed from: b */
    private volatile xgf0 f108483b;

    /* JADX INFO: renamed from: c */
    private volatile su10 f108484c;

    /* JADX INFO: renamed from: d */
    private int f108485d;

    /* JADX INFO: renamed from: f */
    private int f108487f;

    /* JADX INFO: renamed from: h */
    private volatile HandlerThread f108489h;

    /* JADX INFO: renamed from: i */
    private volatile Handler f108490i;

    /* JADX INFO: renamed from: j */
    private volatile InterfaceC17343b f108491j;

    /* JADX INFO: renamed from: o */
    private long f108496o;

    /* JADX INFO: renamed from: e */
    private int f108486e = 10000;

    /* JADX INFO: renamed from: g */
    private volatile boolean f108488g = false;

    /* JADX INFO: renamed from: k */
    private Object f108492k = new Object();

    /* JADX INFO: renamed from: l */
    private int f108493l = 1;

    /* JADX INFO: renamed from: m */
    private final ArrayList<String> f108494m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    private final ArrayList<String> f108495n = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    private long f108497p = -1;

    /* JADX INFO: renamed from: l.hmx$a */
    public class C17342a {

        /* JADX INFO: renamed from: a */
        String f108498a;

        /* JADX INFO: renamed from: b */
        String f108499b;

        /* JADX INFO: renamed from: c */
        String f108500c;

        /* JADX INFO: renamed from: d */
        String f108501d;

        /* JADX INFO: renamed from: e */
        String f108502e;

        /* JADX INFO: renamed from: f */
        String f108503f;

        public C17342a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f108498a = str;
            this.f108499b = str2;
            this.f108500c = str3;
            this.f108501d = str4;
            this.f108502e = str5;
            this.f108503f = str6;
        }
    }

    /* JADX INFO: renamed from: l.hmx$b */
    public interface InterfaceC17343b {
        /* JADX INFO: renamed from: d1 */
        void mo19734d1();
    }

    public hmx(zmx zmxVar) {
        this.f108485d = 5000;
        this.f108487f = 6;
        this.f108482a = zmxVar;
        if (this.f108489h == null) {
            this.f108489h = new HandlerThread("MediaLogsReporters");
            this.f108489h.start();
            this.f108490i = new Handler(this.f108489h.getLooper(), this);
            this.f108490i.sendEmptyMessage(258);
            this.f108485d = fjx.m121638R().m121729d0();
            this.f108487f = fjx.m121638R().m121733e0();
            this.f108490i.sendEmptyMessageDelayed(513, this.f108486e);
        }
    }

    /* JADX INFO: renamed from: P */
    private void m131760P(String str, String str2) {
        try {
            hjx.m131418a("MediaLogsReporters", " [" + this.f108482a.f203785B0 + "], [" + str + "], [" + this.f108482a.f203888s + "] " + str2);
            C17342a c17342a = new C17342a(this.f108482a.f203785B0, str, str2, String.valueOf(this.f108482a.f203888s), String.valueOf(this.f108482a.f203890t), this.f108482a.f203892u);
            synchronized (this.f108492k) {
                try {
                    if (this.f108490i != null && this.f108489h != null) {
                        this.f108490i.obtainMessage(256, c17342a).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    private void m131761g() {
        StringBuilder sb;
        synchronized (this.f108495n) {
            try {
                if (this.f108495n.size() > 0) {
                    sb = new StringBuilder();
                    for (int i = 0; i < this.f108495n.size(); i++) {
                        String str = this.f108495n.get(i);
                        if (sb.length() + str.length() > 32768) {
                            break;
                        }
                        sb.append(str);
                    }
                    this.f108495n.clear();
                } else {
                    sb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sb == null || sb.length() <= 0) {
            return;
        }
        m131760P("v2.mediaLogs", imx.m137116w(Long.valueOf(System.currentTimeMillis()), "mediaLog", "[" + sb.toString().replace(Constants.AES_SUFFIX, ")") + Constants.AES_SUFFIX));
    }

    /* JADX INFO: renamed from: h */
    private void m131762h(boolean z, String str) {
        StringBuilder sb;
        ArrayList<String> arrayList;
        synchronized (this.f108494m) {
            try {
                if (this.f108494m.size() >= this.f108487f || z) {
                    sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        int size = this.f108494m.size();
                        arrayList = this.f108494m;
                        if (i >= size) {
                            break;
                        }
                        sb.append(arrayList.get(i));
                        i++;
                    }
                    arrayList.clear();
                } else {
                    sb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sb == null || sb.length() <= 0) {
            return;
        }
        m131760P(str, sb.toString());
        m131760P("v3.imWatch", m131784i());
    }

    /* JADX INFO: renamed from: A */
    public void m131763A(boolean z, long j, long j2, long j3, long j4, String str, long j5, long j6, long j7, long j8, long j9, long j10, int i, int i2, int i3, int i4, String str2, String str3) {
        m131760P(z ? "v3.pushLevelChange" : "v2.pushLevelChange", imx.m137116w(Long.valueOf(System.currentTimeMillis()), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), str, Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, str3));
    }

    /* JADX INFO: renamed from: B */
    public void m131764B(String str, String str2) {
        m131760P("v2.pushRestart", imx.m137116w(Long.valueOf(System.currentTimeMillis()), str, str2));
    }

    /* JADX INFO: renamed from: C */
    public void m131765C() {
        m131760P("v2.pushStart", imx.m137100g(this.f108482a, new jmx()));
        m131787l("fpsRange", xxx.m211572F().m211614i());
        m131787l("cameraPreviewSizes", xxx.m211572F().m211616j());
        m131787l("cameraSize", xxx.m211572F().m211618k());
        m131787l("selectFps", xxx.m211572F().m211578G());
        m131787l("startPrewView", Boolean.valueOf(xxx.m211572F().m211575C()));
    }

    /* JADX INFO: renamed from: D */
    public void m131766D() {
        m131760P("v3.pushStart", imx.m137106m(this.f108482a, new pmx()));
        m131787l("fpsRange", xxx.m211572F().m211614i());
        m131787l("cameraPreviewSizes", xxx.m211572F().m211616j());
        m131787l("cameraSize", xxx.m211572F().m211618k());
        m131787l("startPrewView", Boolean.valueOf(xxx.m211572F().m211575C()));
    }

    /* JADX INFO: renamed from: E */
    public void m131767E() {
        m131761g();
        m131762h(true, "v2.pushWatch");
        m131760P("v2.pushStop", imx.m137101h(this.f108482a, new kmx()));
    }

    /* JADX INFO: renamed from: F */
    public void m131768F() {
        m131761g();
        m131762h(true, "v3.pushWatch");
        m131760P("v3.pushStop", imx.m137107n(this.f108482a, new qmx()));
    }

    /* JADX INFO: renamed from: G */
    public void m131769G() {
        String strM137102i = imx.m137102i(this.f108482a, new lmx());
        hjx.m131421d("MediaLogsReporters", strM137102i);
        synchronized (this.f108494m) {
            this.f108494m.add(strM137102i);
        }
        m131762h(false, "v2.pushWatch");
        m131760P("v3.detailData", this.f108482a.f203885r);
    }

    /* JADX INFO: renamed from: H */
    public void m131770H() {
        String strM137108o = imx.m137108o(this.f108482a, new rmx());
        hjx.m131421d("MediaLogsReporters", strM137108o);
        synchronized (this.f108494m) {
            this.f108494m.add(strM137108o);
        }
        m131762h(false, "v3.pushWatch");
        m131760P("v3.detailData", this.f108482a.f203885r);
    }

    /* JADX INFO: renamed from: I */
    public void m131771I(int i) {
        this.f108493l = i;
    }

    /* JADX INFO: renamed from: J */
    public final void m131772J(su10 su10Var) {
        this.f108484c = su10Var;
    }

    /* JADX INFO: renamed from: K */
    public void m131773K(int i) {
        if (i > 0) {
            this.f108485d = i;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m131774L(int i) {
        if (i > 0) {
            this.f108487f = i;
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m131775M(int i, int i2, xgf0 xgf0Var) {
        hjx.m131421d("MediaLogsReporters", "int " + i + " cnt " + i2 + " cb " + xgf0Var);
        if (this.f108484c == null) {
            this.f108485d = i;
            this.f108487f = i2;
        }
        if (xgf0Var != null) {
            this.f108483b = xgf0Var;
        }
        if (xgf0Var != null || i != 0 || i2 != 0) {
            this.f108488g = true;
            return;
        }
        this.f108488g = false;
        m131761g();
        if (this.f108490i == null || this.f108489h == null) {
            return;
        }
        this.f108490i.sendEmptyMessage(512);
    }

    /* JADX INFO: renamed from: N */
    public void m131776N(InterfaceC17343b interfaceC17343b) {
        this.f108491j = interfaceC17343b;
    }

    /* JADX INFO: renamed from: O */
    public void m131777O() {
        if (this.f108490i == null || this.f108489h == null || !m131785j()) {
            return;
        }
        this.f108490i.removeMessages(260);
        this.f108490i.sendEmptyMessageDelayed(260, this.f108485d);
        this.f108482a.f203800J = xxx.m211572F().m211620l();
        xxx.m211572F().m211591T();
    }

    /* JADX INFO: renamed from: a */
    public void m131778a() {
        if (this.f108489h == null && this.f108490i == null) {
            this.f108489h = new HandlerThread("MediaLogsReporters");
            this.f108489h.start();
            this.f108490i = new Handler(this.f108489h.getLooper(), this);
            this.f108490i.sendEmptyMessage(258);
            this.f108485d = fjx.m121638R().m121729d0();
            this.f108487f = fjx.m121638R().m121733e0();
            this.f108490i.sendEmptyMessageDelayed(513, this.f108486e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m131779b(int i, long j, long j2, long j3, long j4) {
        m131760P("v3.confAudioRenderStart", imx.m137116w(Long.valueOf(System.currentTimeMillis()), i == 1 ? "M" : j6f.LATITUDE_SOUTH, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)));
    }

    /* JADX INFO: renamed from: c */
    public void m131780c(boolean z, int i, long j, long j2, long j3, long j4) {
        m131760P(z ? "v3.confRenderStart" : "v2.confRenderStart", imx.m137116w(Long.valueOf(System.currentTimeMillis()), i == 1 ? "M" : j6f.LATITUDE_SOUTH, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)));
    }

    /* JADX INFO: renamed from: d */
    public void m131781d(boolean z, int i, long j, int i2) {
        m131760P(z ? "v3.confRenderStop" : "v2.confRenderStop", imx.m137116w(Long.valueOf(System.currentTimeMillis()), i == 1 ? "M" : j6f.LATITUDE_SOUTH, Long.valueOf(j), Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: e */
    public void m131782e(boolean z, int i, long j, long j2, long j3) {
        m131760P(z ? "v3.conferenceStart" : "v2.conferenceStart", imx.m137116w(Long.valueOf(System.currentTimeMillis()), i == 1 ? "M" : j6f.LATITUDE_SOUTH, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
    }

    /* JADX INFO: renamed from: f */
    public void m131783f(boolean z, int i, long j, long j2, long j3, int i2) {
        m131760P(z ? "v3.conferenceStop" : "v2.conferenceStop", imx.m137116w(Long.valueOf(System.currentTimeMillis()), i == 1 ? "M" : j6f.LATITUDE_SOUTH, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i2), Long.valueOf(j3)));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 256) {
            C17342a c17342a = (C17342a) message.obj;
            if (c17342a == null || c17342a.f108498a == null || c17342a.f108500c == null) {
                return false;
            }
            hjx.m131418a("MediaLogsReporters", "SEND_LOGS [" + c17342a.f108498a + "], [" + c17342a.f108499b + "] -->");
            if (this.f108483b != null) {
                boolean zEquals = "v3.detailData".equals(c17342a.f108499b);
                xgf0 xgf0Var = this.f108483b;
                if (zEquals) {
                    xgf0Var.m208672c(c17342a.f108498a, c17342a.f108499b, c17342a.f108500c);
                } else {
                    xgf0Var.mo19169a(c17342a.f108498a, c17342a.f108499b, c17342a.f108500c);
                }
            }
            if (this.f108484c == null) {
                return false;
            }
            this.f108484c.m185990l(c17342a.f108498a, c17342a.f108499b, c17342a.f108500c, c17342a.f108501d, c17342a.f108502e, c17342a.f108503f);
            return false;
        }
        if (i == 258) {
            this.f108482a.f203783A0 = imx.m137109p();
            return false;
        }
        if (i == 260) {
            if (this.f108491j == null) {
                return false;
            }
            this.f108491j.mo19734d1();
            if (!m131785j() || this.f108490i == null || this.f108489h == null || this.f108485d <= 0) {
                return false;
            }
            this.f108490i.sendEmptyMessageDelayed(260, this.f108485d);
            return false;
        }
        if (i != 512) {
            if (i != 513) {
                return false;
            }
            m131761g();
            if (!m131785j() || this.f108490i == null || this.f108489h == null) {
                return false;
            }
            this.f108490i.sendEmptyMessageDelayed(513, 10000L);
            return false;
        }
        synchronized (this.f108492k) {
            try {
                if (this.f108490i != null && this.f108489h != null) {
                    this.f108490i.removeCallbacksAndMessages(null);
                    this.f108489h.quit();
                    this.f108490i = null;
                    this.f108489h = null;
                    this.f108491j = null;
                    this.f108484c = null;
                    hjx.m131418a("MediaLogsReporters", "STOP_LOGS handlerThread.quit()");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public String m131784i() {
        long j = this.f108482a.f203784B;
        long j2 = j - this.f108496o;
        this.f108496o = j;
        StringBuilder sb = new StringBuilder("");
        if (j2 <= 0) {
            j2 = 0;
        }
        sb.append(j2);
        sb.append("|");
        zmx zmxVar = this.f108482a;
        sb.append(zmxVar.f203812P + zmxVar.f203810O);
        sb.append("|");
        sb.append(this.f108482a.f203901y0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public boolean m131785j() {
        return this.f108488g || this.f108484c != null;
    }

    /* JADX INFO: renamed from: k */
    public void m131786k(String str, String str2) {
        if (this.f108493l == 1) {
            m131760P("v2.mediaLogs", imx.m137116w(Long.valueOf(System.currentTimeMillis()), str, str2));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m131787l(Object... objArr) {
        if ((this.f108490i == null && this.f108489h == null) || this.f108493l == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{" + new SimpleDateFormat("HH:mm:ss.SSS", Locale.CHINA).format(Long.valueOf(System.currentTimeMillis())) + Constants.SEPARATOR_COMMA);
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.append(objArr[i]);
            }
        }
        sb.append("}");
        synchronized (this.f108495n) {
            try {
                if (this.f108495n.size() < 300) {
                    this.f108495n.add(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m131788m(String str) {
        m131760P("v3.momoRtcPullWatch", str);
    }

    /* JADX INFO: renamed from: n */
    public void m131789n(String str) {
        m131760P("v3.momoRtcPushStart", str);
    }

    /* JADX INFO: renamed from: o */
    public void m131790o(String str) {
        m131760P("v3.momoRtcPushStop", str);
    }

    /* JADX INFO: renamed from: p */
    public void m131791p(String str) {
        m131760P("v3.momoRtcPushWatch", str);
    }

    /* JADX INFO: renamed from: q */
    public void m131792q(String str) {
        m131760P("v3.momoRtcReconnect", str);
    }

    /* JADX INFO: renamed from: r */
    public void m131793r(String str, String str2) {
        m131760P(str, str2);
    }

    /* JADX INFO: renamed from: s */
    public void m131794s() {
        m131760P("v3.pullStart", imx.m137103j(this.f108482a, new mmx()));
    }

    /* JADX INFO: renamed from: t */
    public void m131795t() {
        m131761g();
        m131762h(true, "v3.pullWatch");
        m131760P("v3.pullStop", imx.m137104k(this.f108482a, new nmx()));
    }

    /* JADX INFO: renamed from: u */
    public void m131796u() {
        String strM137105l = imx.m137105l(this.f108482a, new omx());
        hjx.m131421d("MediaLogsReporters", strM137105l);
        synchronized (this.f108494m) {
            this.f108494m.add(strM137105l);
        }
        m131762h(false, "v3.pullWatch");
        m131760P("v3.detailData", this.f108482a.f203885r);
    }

    /* JADX INFO: renamed from: v */
    public void m131797v(long j, long j2, long j3, long j4) {
        m131760P("v2.pushBufferDrop", imx.m137116w(Long.valueOf(System.currentTimeMillis()), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)));
    }

    /* JADX INFO: renamed from: w */
    public void m131798w(long j) {
        this.f108497p = System.currentTimeMillis();
        m131760P("v2.pushBufferStart", imx.m137116w(Long.valueOf(System.currentTimeMillis()), Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: x */
    public void m131799x(long j) {
        long jCurrentTimeMillis = this.f108497p != -1 ? System.currentTimeMillis() - this.f108497p : 0L;
        this.f108497p = -1L;
        m131760P("v2.pushBufferStop", imx.m137116w(Long.valueOf(System.currentTimeMillis()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: y */
    public void m131800y(long j, long j2, long j3, long j4) {
        m131760P("v2.pushDropStart", imx.m137116w(Long.valueOf(System.currentTimeMillis()), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)));
    }

    /* JADX INFO: renamed from: z */
    public void m131801z(long j, long j2, long j3, long j4, long j5) {
        m131760P("v2.pushDropStop", imx.m137116w(Long.valueOf(System.currentTimeMillis()), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5)));
    }
}
