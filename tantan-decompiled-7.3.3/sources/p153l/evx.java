package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class evx implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    private wvx f96032a;

    /* JADX INFO: renamed from: b */
    private volatile fpf0 f96033b;

    /* JADX INFO: renamed from: c */
    private volatile a320 f96034c;

    /* JADX INFO: renamed from: d */
    private int f96035d;

    /* JADX INFO: renamed from: f */
    private int f96037f;

    /* JADX INFO: renamed from: h */
    private volatile HandlerThread f96039h;

    /* JADX INFO: renamed from: i */
    private volatile Handler f96040i;

    /* JADX INFO: renamed from: j */
    private volatile InterfaceC16844b f96041j;

    /* JADX INFO: renamed from: o */
    private long f96046o;

    /* JADX INFO: renamed from: e */
    private int f96036e = 10000;

    /* JADX INFO: renamed from: g */
    private volatile boolean f96038g = false;

    /* JADX INFO: renamed from: k */
    private Object f96042k = new Object();

    /* JADX INFO: renamed from: l */
    private int f96043l = 1;

    /* JADX INFO: renamed from: m */
    private final ArrayList<String> f96044m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    private final ArrayList<String> f96045n = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    private long f96047p = -1;

    /* JADX INFO: renamed from: l.evx$a */
    public class C16843a {

        /* JADX INFO: renamed from: a */
        String f96048a;

        /* JADX INFO: renamed from: b */
        String f96049b;

        /* JADX INFO: renamed from: c */
        String f96050c;

        /* JADX INFO: renamed from: d */
        String f96051d;

        /* JADX INFO: renamed from: e */
        String f96052e;

        /* JADX INFO: renamed from: f */
        String f96053f;

        public C16843a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f96048a = str;
            this.f96049b = str2;
            this.f96050c = str3;
            this.f96051d = str4;
            this.f96052e = str5;
            this.f96053f = str6;
        }
    }

    /* JADX INFO: renamed from: l.evx$b */
    public interface InterfaceC16844b {
        /* JADX INFO: renamed from: d1 */
        void mo20733d1();
    }

    public evx(wvx wvxVar) {
        this.f96035d = 5000;
        this.f96037f = 6;
        this.f96032a = wvxVar;
        if (this.f96039h == null) {
            this.f96039h = new HandlerThread("MediaLogsReporters");
            this.f96039h.start();
            this.f96040i = new Handler(this.f96039h.getLooper(), this);
            this.f96040i.sendEmptyMessage(258);
            this.f96035d = csx.m112235R().m112326d0();
            this.f96037f = csx.m112235R().m112330e0();
            this.f96040i.sendEmptyMessageDelayed(513, this.f96036e);
        }
    }

    /* JADX INFO: renamed from: P */
    private void m122816P(String str, String str2) {
        try {
            esx.m122396a("MediaLogsReporters", " [" + this.f96032a.f191001B0 + "], [" + str + "], [" + this.f96032a.f191104s + "] " + str2);
            C16843a c16843a = new C16843a(this.f96032a.f191001B0, str, str2, String.valueOf(this.f96032a.f191104s), String.valueOf(this.f96032a.f191106t), this.f96032a.f191108u);
            synchronized (this.f96042k) {
                try {
                    if (this.f96040i != null && this.f96039h != null) {
                        this.f96040i.obtainMessage(256, c16843a).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    private void m122817g() {
        StringBuilder sb;
        synchronized (this.f96045n) {
            try {
                if (this.f96045n.size() > 0) {
                    sb = new StringBuilder();
                    for (int i = 0; i < this.f96045n.size(); i++) {
                        String str = this.f96045n.get(i);
                        if (sb.length() + str.length() > 32768) {
                            break;
                        }
                        sb.append(str);
                    }
                    this.f96045n.clear();
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
        m122816P("v2.mediaLogs", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), "mediaLog", "[" + sb.toString().replace(Constants.AES_SUFFIX, ")") + Constants.AES_SUFFIX));
    }

    /* JADX INFO: renamed from: h */
    private void m122818h(boolean z, String str) {
        StringBuilder sb;
        ArrayList<String> arrayList;
        synchronized (this.f96044m) {
            try {
                if (this.f96044m.size() >= this.f96037f || z) {
                    sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        int size = this.f96044m.size();
                        arrayList = this.f96044m;
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
        m122816P(str, sb.toString());
        m122816P("v3.imWatch", m122840i());
    }

    /* JADX INFO: renamed from: A */
    public void m122819A(boolean z, long j, long j2, long j3, long j4, String str, long j5, long j6, long j7, long j8, long j9, long j10, int i, int i2, int i3, int i4, String str2, String str3) {
        m122816P(z ? "v3.pushLevelChange" : "v2.pushLevelChange", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), str, Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, str3));
    }

    /* JADX INFO: renamed from: B */
    public void m122820B(String str, String str2) {
        m122816P("v2.pushRestart", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), str, str2));
    }

    /* JADX INFO: renamed from: C */
    public void m122821C() {
        m122816P("v2.pushStart", fvx.m127721g(this.f96032a, new gvx()));
        m122843l("fpsRange", u6y.m194722F().m194764i());
        m122843l("cameraPreviewSizes", u6y.m194722F().m194766j());
        m122843l("cameraSize", u6y.m194722F().m194768k());
        m122843l("selectFps", u6y.m194722F().m194728G());
        m122843l("startPrewView", Boolean.valueOf(u6y.m194722F().m194725C()));
    }

    /* JADX INFO: renamed from: D */
    public void m122822D() {
        m122816P("v3.pushStart", fvx.m127727m(this.f96032a, new mvx()));
        m122843l("fpsRange", u6y.m194722F().m194764i());
        m122843l("cameraPreviewSizes", u6y.m194722F().m194766j());
        m122843l("cameraSize", u6y.m194722F().m194768k());
        m122843l("startPrewView", Boolean.valueOf(u6y.m194722F().m194725C()));
    }

    /* JADX INFO: renamed from: E */
    public void m122823E() {
        m122817g();
        m122818h(true, "v2.pushWatch");
        m122816P("v2.pushStop", fvx.m127722h(this.f96032a, new hvx()));
    }

    /* JADX INFO: renamed from: F */
    public void m122824F() {
        m122817g();
        m122818h(true, "v3.pushWatch");
        m122816P("v3.pushStop", fvx.m127728n(this.f96032a, new nvx()));
    }

    /* JADX INFO: renamed from: G */
    public void m122825G() {
        String strM127723i = fvx.m127723i(this.f96032a, new ivx());
        esx.m122399d("MediaLogsReporters", strM127723i);
        synchronized (this.f96044m) {
            this.f96044m.add(strM127723i);
        }
        m122818h(false, "v2.pushWatch");
        m122816P("v3.detailData", this.f96032a.f191101r);
    }

    /* JADX INFO: renamed from: H */
    public void m122826H() {
        String strM127729o = fvx.m127729o(this.f96032a, new ovx());
        esx.m122399d("MediaLogsReporters", strM127729o);
        synchronized (this.f96044m) {
            this.f96044m.add(strM127729o);
        }
        m122818h(false, "v3.pushWatch");
        m122816P("v3.detailData", this.f96032a.f191101r);
    }

    /* JADX INFO: renamed from: I */
    public void m122827I(int i) {
        this.f96043l = i;
    }

    /* JADX INFO: renamed from: J */
    public final void m122828J(a320 a320Var) {
        this.f96034c = a320Var;
    }

    /* JADX INFO: renamed from: K */
    public void m122829K(int i) {
        if (i > 0) {
            this.f96035d = i;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m122830L(int i) {
        if (i > 0) {
            this.f96037f = i;
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m122831M(int i, int i2, fpf0 fpf0Var) {
        esx.m122399d("MediaLogsReporters", "int " + i + " cnt " + i2 + " cb " + fpf0Var);
        if (this.f96034c == null) {
            this.f96035d = i;
            this.f96037f = i2;
        }
        if (fpf0Var != null) {
            this.f96033b = fpf0Var;
        }
        if (fpf0Var != null || i != 0 || i2 != 0) {
            this.f96038g = true;
            return;
        }
        this.f96038g = false;
        m122817g();
        if (this.f96040i == null || this.f96039h == null) {
            return;
        }
        this.f96040i.sendEmptyMessage(512);
    }

    /* JADX INFO: renamed from: N */
    public void m122832N(InterfaceC16844b interfaceC16844b) {
        this.f96041j = interfaceC16844b;
    }

    /* JADX INFO: renamed from: O */
    public void m122833O() {
        if (this.f96040i == null || this.f96039h == null || !m122841j()) {
            return;
        }
        this.f96040i.removeMessages(260);
        this.f96040i.sendEmptyMessageDelayed(260, this.f96035d);
        this.f96032a.f191016J = u6y.m194722F().m194770l();
        u6y.m194722F().m194741T();
    }

    /* JADX INFO: renamed from: a */
    public void m122834a() {
        if (this.f96039h == null && this.f96040i == null) {
            this.f96039h = new HandlerThread("MediaLogsReporters");
            this.f96039h.start();
            this.f96040i = new Handler(this.f96039h.getLooper(), this);
            this.f96040i.sendEmptyMessage(258);
            this.f96035d = csx.m112235R().m112326d0();
            this.f96037f = csx.m112235R().m112330e0();
            this.f96040i.sendEmptyMessageDelayed(513, this.f96036e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m122835b(int i, long j, long j2, long j3, long j4) {
        m122816P("v3.confAudioRenderStart", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), i == 1 ? "M" : p7f.LATITUDE_SOUTH, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)));
    }

    /* JADX INFO: renamed from: c */
    public void m122836c(boolean z, int i, long j, long j2, long j3, long j4) {
        m122816P(z ? "v3.confRenderStart" : "v2.confRenderStart", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), i == 1 ? "M" : p7f.LATITUDE_SOUTH, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)));
    }

    /* JADX INFO: renamed from: d */
    public void m122837d(boolean z, int i, long j, int i2) {
        m122816P(z ? "v3.confRenderStop" : "v2.confRenderStop", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), i == 1 ? "M" : p7f.LATITUDE_SOUTH, Long.valueOf(j), Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: e */
    public void m122838e(boolean z, int i, long j, long j2, long j3) {
        m122816P(z ? "v3.conferenceStart" : "v2.conferenceStart", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), i == 1 ? "M" : p7f.LATITUDE_SOUTH, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
    }

    /* JADX INFO: renamed from: f */
    public void m122839f(boolean z, int i, long j, long j2, long j3, int i2) {
        m122816P(z ? "v3.conferenceStop" : "v2.conferenceStop", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), i == 1 ? "M" : p7f.LATITUDE_SOUTH, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i2), Long.valueOf(j3)));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 256) {
            C16843a c16843a = (C16843a) message.obj;
            if (c16843a == null || c16843a.f96048a == null || c16843a.f96050c == null) {
                return false;
            }
            esx.m122396a("MediaLogsReporters", "SEND_LOGS [" + c16843a.f96048a + "], [" + c16843a.f96049b + "] -->");
            if (this.f96033b != null) {
                boolean zEquals = "v3.detailData".equals(c16843a.f96049b);
                fpf0 fpf0Var = this.f96033b;
                if (zEquals) {
                    fpf0Var.m126587c(c16843a.f96048a, c16843a.f96049b, c16843a.f96050c);
                } else {
                    fpf0Var.mo20149a(c16843a.f96048a, c16843a.f96049b, c16843a.f96050c);
                }
            }
            if (this.f96034c == null) {
                return false;
            }
            this.f96034c.m95764l(c16843a.f96048a, c16843a.f96049b, c16843a.f96050c, c16843a.f96051d, c16843a.f96052e, c16843a.f96053f);
            return false;
        }
        if (i == 258) {
            this.f96032a.f190999A0 = fvx.m127730p();
            return false;
        }
        if (i == 260) {
            if (this.f96041j == null) {
                return false;
            }
            this.f96041j.mo20733d1();
            if (!m122841j() || this.f96040i == null || this.f96039h == null || this.f96035d <= 0) {
                return false;
            }
            this.f96040i.sendEmptyMessageDelayed(260, this.f96035d);
            return false;
        }
        if (i != 512) {
            if (i != 513) {
                return false;
            }
            m122817g();
            if (!m122841j() || this.f96040i == null || this.f96039h == null) {
                return false;
            }
            this.f96040i.sendEmptyMessageDelayed(513, 10000L);
            return false;
        }
        synchronized (this.f96042k) {
            try {
                if (this.f96040i != null && this.f96039h != null) {
                    this.f96040i.removeCallbacksAndMessages(null);
                    this.f96039h.quit();
                    this.f96040i = null;
                    this.f96039h = null;
                    this.f96041j = null;
                    this.f96034c = null;
                    esx.m122396a("MediaLogsReporters", "STOP_LOGS handlerThread.quit()");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public String m122840i() {
        long j = this.f96032a.f191000B;
        long j2 = j - this.f96046o;
        this.f96046o = j;
        StringBuilder sb = new StringBuilder("");
        if (j2 <= 0) {
            j2 = 0;
        }
        sb.append(j2);
        sb.append("|");
        wvx wvxVar = this.f96032a;
        sb.append(wvxVar.f191028P + wvxVar.f191026O);
        sb.append("|");
        sb.append(this.f96032a.f191117y0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public boolean m122841j() {
        return this.f96038g || this.f96034c != null;
    }

    /* JADX INFO: renamed from: k */
    public void m122842k(String str, String str2) {
        if (this.f96043l == 1) {
            m122816P("v2.mediaLogs", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), str, str2));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m122843l(Object... objArr) {
        if ((this.f96040i == null && this.f96039h == null) || this.f96043l == 0) {
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
        synchronized (this.f96045n) {
            try {
                if (this.f96045n.size() < 300) {
                    this.f96045n.add(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m122844m(String str) {
        m122816P("v3.momoRtcPullWatch", str);
    }

    /* JADX INFO: renamed from: n */
    public void m122845n(String str) {
        m122816P("v3.momoRtcPushStart", str);
    }

    /* JADX INFO: renamed from: o */
    public void m122846o(String str) {
        m122816P("v3.momoRtcPushStop", str);
    }

    /* JADX INFO: renamed from: p */
    public void m122847p(String str) {
        m122816P("v3.momoRtcPushWatch", str);
    }

    /* JADX INFO: renamed from: q */
    public void m122848q(String str) {
        m122816P("v3.momoRtcReconnect", str);
    }

    /* JADX INFO: renamed from: r */
    public void m122849r(String str, String str2) {
        m122816P(str, str2);
    }

    /* JADX INFO: renamed from: s */
    public void m122850s() {
        m122816P("v3.pullStart", fvx.m127724j(this.f96032a, new jvx()));
    }

    /* JADX INFO: renamed from: t */
    public void m122851t() {
        m122817g();
        m122818h(true, "v3.pullWatch");
        m122816P("v3.pullStop", fvx.m127725k(this.f96032a, new kvx()));
    }

    /* JADX INFO: renamed from: u */
    public void m122852u() {
        String strM127726l = fvx.m127726l(this.f96032a, new lvx());
        esx.m122399d("MediaLogsReporters", strM127726l);
        synchronized (this.f96044m) {
            this.f96044m.add(strM127726l);
        }
        m122818h(false, "v3.pullWatch");
        m122816P("v3.detailData", this.f96032a.f191101r);
    }

    /* JADX INFO: renamed from: v */
    public void m122853v(long j, long j2, long j3, long j4) {
        m122816P("v2.pushBufferDrop", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)));
    }

    /* JADX INFO: renamed from: w */
    public void m122854w(long j) {
        this.f96047p = System.currentTimeMillis();
        m122816P("v2.pushBufferStart", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: x */
    public void m122855x(long j) {
        long jCurrentTimeMillis = this.f96047p != -1 ? System.currentTimeMillis() - this.f96047p : 0L;
        this.f96047p = -1L;
        m122816P("v2.pushBufferStop", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: y */
    public void m122856y(long j, long j2, long j3, long j4) {
        m122816P("v2.pushDropStart", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)));
    }

    /* JADX INFO: renamed from: z */
    public void m122857z(long j, long j2, long j3, long j4, long j5) {
        m122816P("v2.pushDropStop", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5)));
    }
}
