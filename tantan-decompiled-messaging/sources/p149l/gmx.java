package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class gmx implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    private HandlerThread f103525a;

    /* JADX INFO: renamed from: b */
    private Handler f103526b;

    /* JADX INFO: renamed from: c */
    private InterfaceC17126b f103527c;

    /* JADX INFO: renamed from: d */
    private volatile ymx f103528d;

    /* JADX INFO: renamed from: e */
    private volatile xgf0 f103529e;

    /* JADX INFO: renamed from: f */
    private volatile su10 f103530f;

    /* JADX INFO: renamed from: g */
    private int f103531g;

    /* JADX INFO: renamed from: h */
    private int f103532h;

    /* JADX INFO: renamed from: i */
    private volatile boolean f103533i = false;

    /* JADX INFO: renamed from: j */
    private volatile boolean f103534j = false;

    /* JADX INFO: renamed from: k */
    private final ArrayList<String> f103535k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    private final ArrayList<String> f103536l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    private final ArrayList<String> f103537m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    private volatile boolean f103538n = false;

    /* JADX INFO: renamed from: o */
    private String f103539o = "";

    /* JADX INFO: renamed from: p */
    private String f103540p = "";

    /* JADX INFO: renamed from: q */
    private int f103541q = 0;

    /* JADX INFO: renamed from: r */
    private long f103542r = 20000;

    /* JADX INFO: renamed from: s */
    private long f103543s = 10000;

    /* JADX INFO: renamed from: t */
    private final ArrayList<String> f103544t = new ArrayList<>();

    /* JADX INFO: renamed from: u */
    private int f103545u = 1;

    /* JADX INFO: renamed from: v */
    private volatile boolean f103546v = false;

    /* JADX INFO: renamed from: l.gmx$a */
    public class C17125a {

        /* JADX INFO: renamed from: a */
        String f103547a;

        /* JADX INFO: renamed from: b */
        String f103548b;

        /* JADX INFO: renamed from: c */
        String f103549c;

        public C17125a(String str, String str2, String str3) {
            this.f103547a = str;
            this.f103548b = str2;
            this.f103549c = str3;
        }
    }

    /* JADX INFO: renamed from: l.gmx$b */
    public interface InterfaceC17126b {
        void messageFromMediaLogV2(int i, int i2, int i3, Object obj);
    }

    public gmx() {
        this.f103531g = HuiYanResultSender.TIMEOUT_MS;
        this.f103532h = 6;
        hjx.m131421d("MediaLogPullV2", "");
        if (this.f103525a == null) {
            HandlerThread handlerThread = new HandlerThread("MediaLogPullV2");
            this.f103525a = handlerThread;
            handlerThread.start();
            this.f103526b = new Handler(this.f103525a.getLooper(), this);
            this.f103531g = fjx.m121638R().m121713Z();
            this.f103532h = fjx.m121638R().m121717a0();
        }
    }

    /* JADX INFO: renamed from: F */
    private void m127055F(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        C17125a c17125a = new C17125a("nonConf", str, str2);
        Handler handler = this.f103526b;
        if (handler == null || this.f103525a == null) {
            return;
        }
        handler.obtainMessage(204, c17125a).sendToTarget();
    }

    /* JADX INFO: renamed from: d */
    private void m127056d(boolean z) {
        StringBuilder sb;
        ArrayList<String> arrayList;
        synchronized (this.f103535k) {
            try {
                if (this.f103535k.size() >= this.f103532h || z) {
                    sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        int size = this.f103535k.size();
                        arrayList = this.f103535k;
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
        m127055F("v2.pullWatch", sb.toString());
    }

    /* JADX INFO: renamed from: e */
    private void m127057e(boolean z, ArrayList<String> arrayList, String str) {
        StringBuilder sb;
        synchronized (arrayList) {
            try {
                if (arrayList.size() >= this.f103532h || z) {
                    sb = new StringBuilder();
                    for (int i = 0; i < arrayList.size(); i++) {
                        sb.append(arrayList.get(i));
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
        m127055F(str, sb.toString());
    }

    /* JADX INFO: renamed from: r */
    private void m127058r() {
        String strM137099f = imx.m137099f(this.f103528d, new xmx());
        synchronized (this.f103535k) {
            this.f103535k.add(strM137099f);
        }
        m127056d(false);
    }

    /* JADX INFO: renamed from: t */
    private void m127059t(int i, int i2, int i3, Object obj) {
        InterfaceC17126b interfaceC17126b = this.f103527c;
        if (interfaceC17126b != null) {
            interfaceC17126b.messageFromMediaLogV2(i, i2, i3, obj);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m127060A(int i) {
        if (i > 0) {
            this.f103532h = i;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m127061B(InterfaceC17126b interfaceC17126b) {
        this.f103527c = interfaceC17126b;
    }

    /* JADX INFO: renamed from: C */
    public void m127062C(long j) {
        this.f103543s = j;
    }

    /* JADX INFO: renamed from: D */
    public void m127063D(int i) {
        if (i != 0) {
            this.f103541q = i;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m127064E(int i, int i2, xgf0 xgf0Var) {
        hjx.m131421d("MediaLogPullV2", "Interval " + i + " / " + i2);
        this.f103538n = true;
        this.f103531g = i;
        this.f103532h = i2;
        Handler handler = this.f103526b;
        if (handler == null || this.f103525a == null) {
            return;
        }
        handler.obtainMessage(205, xgf0Var).sendToTarget();
    }

    /* JADX INFO: renamed from: G */
    public void m127065G(String str, String str2) {
        m127055F(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m127066a() {
        hjx.m131421d("MediaLogPullV2", "");
        Handler handler = this.f103526b;
        if (handler != null && this.f103525a != null) {
            handler.sendEmptyMessageDelayed(101, this.f103542r);
        }
        String strM137094a = imx.m137094a(this.f103528d, new smx());
        this.f103546v = true;
        m127055F("v2.bufferStart", strM137094a);
    }

    /* JADX INFO: renamed from: b */
    public void m127067b() {
        if (this.f103546v) {
            hjx.m131421d("MediaLogPullV2", "");
            this.f103546v = false;
            Handler handler = this.f103526b;
            if (handler != null && this.f103525a != null) {
                handler.removeMessages(101);
            }
            m127055F("v2.bufferStop", imx.m137095b(this.f103528d, new tmx()));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m127068c() {
        StringBuilder sb;
        ArrayList<String> arrayList;
        synchronized (this.f103544t) {
            try {
                if (this.f103544t.size() > 0) {
                    sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        int size = this.f103544t.size();
                        arrayList = this.f103544t;
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
        m127055F("v2.mediaLogs", imx.m137116w(Long.valueOf(System.currentTimeMillis()), "pullMediaLog", "[" + sb.toString().replace(Constants.AES_SUFFIX, ")") + Constants.AES_SUFFIX));
    }

    /* JADX INFO: renamed from: f */
    public int m127069f() {
        return this.f103545u;
    }

    /* JADX INFO: renamed from: g */
    public boolean m127070g() {
        return this.f103538n || this.f103530f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m127071h() {
        return this.f103534j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 201) {
            this.f103527c = null;
            this.f103528d = null;
            this.f103529e = null;
            Handler handler = this.f103526b;
            if (handler != null && this.f103525a != null) {
                handler.removeCallbacksAndMessages(null);
                this.f103525a.quit();
                this.f103526b = null;
                this.f103525a = null;
            }
        } else if (i == 202) {
            m127058r();
        } else if (i == 204) {
            C17125a c17125a = (C17125a) message.obj;
            if (c17125a != null && c17125a.f103549c != null) {
                if (this.f103529e != null) {
                    this.f103529e.mo185981b("nonConf", c17125a.f103548b, c17125a.f103549c, this.f103539o, String.valueOf(this.f103528d == null ? 0L : this.f103528d.f199080O), String.valueOf(this.f103541q));
                }
                if (this.f103528d != null && this.f103528d.f199089X && this.f103530f != null) {
                    this.f103530f.mo185981b("nonConf", c17125a.f103548b, c17125a.f103549c, this.f103539o, String.valueOf(this.f103528d != null ? this.f103528d.f199080O : 0L), String.valueOf(this.f103541q));
                }
            }
        } else if (i != 205) {
            switch (i) {
                case 100:
                    m127059t(100, 0, 1, null);
                    break;
                case 101:
                    m127059t(100, 0, 6, null);
                    break;
                case 102:
                    m127059t(200, 1000, 0, null);
                    Handler handler2 = this.f103526b;
                    if (handler2 != null && this.f103525a != null) {
                        handler2.sendEmptyMessageDelayed(102, this.f103531g);
                    }
                    break;
                case 103:
                    if (this.f103528d != null) {
                        this.f103528d.f199115p = imx.m137109p();
                    }
                    break;
                case 104:
                    hjx.m131418a("buffercheckcount", "pullBufferCheck");
                    m127059t(200, 1001, 0, null);
                    Handler handler3 = this.f103526b;
                    if (handler3 != null && this.f103525a != null) {
                        handler3.sendEmptyMessageDelayed(104, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    }
                    break;
            }
        } else {
            this.f103529e = (xgf0) message.obj;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m127072i(String str, String str2) {
        if (str.equals("v2.livePullStop")) {
            synchronized (this.f103536l) {
                this.f103536l.add(str2);
            }
        } else if (str.equals("v2.livePullStart")) {
            synchronized (this.f103537m) {
                this.f103537m.add(str2);
            }
        }
        m127057e(false, this.f103537m, "v2.livePullStart");
        m127057e(false, this.f103536l, "v2.livePullStop");
    }

    /* JADX INFO: renamed from: j */
    public void m127073j(String str, String str2) {
        m127055F("v2.mediaLogs", imx.m137116w(Long.valueOf(System.currentTimeMillis()), str, str2).replace(Constants.AES_SUFFIX, ")"));
    }

    /* JADX INFO: renamed from: k */
    public void m127074k(Object... objArr) {
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
        synchronized (this.f103544t) {
            this.f103544t.add(sb.toString());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m127075l() {
        hjx.m131421d("MediaLogPullV2", "");
        m127055F("v2.pullBufferDrop", imx.m137096c(this.f103528d, new umx()));
    }

    /* JADX INFO: renamed from: m */
    public void m127076m() {
        if (this.f103534j) {
            return;
        }
        this.f103534j = true;
        if (this.f103528d == null || this.f103528d.f199094b == null) {
            return;
        }
        m127055F("v2.pullDetect", this.f103528d.f199094b);
    }

    /* JADX INFO: renamed from: n */
    public void m127077n() {
        hjx.m131421d("MediaLogPullV2", "Interval " + this.f103531g + " / " + this.f103532h);
        hjx.m131421d("MediaLogPullV2", "myHttpMediaLogsUpload " + this.f103530f + " / " + this.f103529e);
        Handler handler = this.f103526b;
        if (handler == null || this.f103525a == null) {
            return;
        }
        handler.sendEmptyMessage(103);
        this.f103526b.sendEmptyMessageDelayed(100, this.f103543s);
        this.f103526b.sendEmptyMessageDelayed(102, this.f103531g);
        this.f103526b.sendEmptyMessageDelayed(104, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: o */
    public void m127078o() {
        hjx.m131421d("MediaLogPullV2", "");
        Handler handler = this.f103526b;
        if (handler != null && this.f103525a != null) {
            handler.removeMessages(100);
        }
        m127076m();
        m127055F("v2.pullStart", imx.m137097d(this.f103528d, new vmx()));
    }

    /* JADX INFO: renamed from: p */
    public void m127079p() {
        hjx.m131421d("MediaLogPullV2", "");
        if (this.f103533i) {
            return;
        }
        this.f103533i = true;
        m127076m();
        if (this.f103528d.f199088W == 0) {
            m127058r();
        }
        m127056d(true);
        m127057e(true, this.f103536l, "v2.livePullStop");
        m127057e(true, this.f103537m, "v2.livePullStart");
        m127067b();
        m127055F("v2.pullStop", imx.m137098e(this.f103528d, new wmx()));
    }

    /* JADX INFO: renamed from: q */
    public void m127080q() {
        hjx.m131421d("MediaLogPullV2", "");
        Handler handler = this.f103526b;
        if (handler == null || this.f103525a == null) {
            return;
        }
        handler.sendEmptyMessage(202);
    }

    /* JADX INFO: renamed from: s */
    public void m127081s() {
        Handler handler = this.f103526b;
        if (handler == null || this.f103525a == null) {
            return;
        }
        handler.sendEmptyMessage(201);
    }

    /* JADX INFO: renamed from: u */
    public void m127082u(long j) {
        this.f103542r = j;
    }

    /* JADX INFO: renamed from: v */
    public void m127083v(int i) {
        this.f103545u = i;
    }

    /* JADX INFO: renamed from: w */
    public final void m127084w(su10 su10Var) {
        this.f103530f = su10Var;
    }

    /* JADX INFO: renamed from: x */
    public void m127085x(int i) {
        if (i > 1000) {
            this.f103531g = i;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m127086y(String str, String str2, int i) {
        this.f103539o = str;
        this.f103540p = str2;
        if (i != 0) {
            this.f103541q = i;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m127087z(ymx ymxVar) {
        this.f103528d = ymxVar;
    }
}
