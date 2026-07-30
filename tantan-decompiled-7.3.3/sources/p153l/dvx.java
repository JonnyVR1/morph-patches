package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class dvx implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    private HandlerThread f90957a;

    /* JADX INFO: renamed from: b */
    private Handler f90958b;

    /* JADX INFO: renamed from: c */
    private InterfaceC16640b f90959c;

    /* JADX INFO: renamed from: d */
    private volatile vvx f90960d;

    /* JADX INFO: renamed from: e */
    private volatile fpf0 f90961e;

    /* JADX INFO: renamed from: f */
    private volatile a320 f90962f;

    /* JADX INFO: renamed from: g */
    private int f90963g;

    /* JADX INFO: renamed from: h */
    private int f90964h;

    /* JADX INFO: renamed from: i */
    private volatile boolean f90965i = false;

    /* JADX INFO: renamed from: j */
    private volatile boolean f90966j = false;

    /* JADX INFO: renamed from: k */
    private final ArrayList<String> f90967k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    private final ArrayList<String> f90968l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    private final ArrayList<String> f90969m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    private volatile boolean f90970n = false;

    /* JADX INFO: renamed from: o */
    private String f90971o = "";

    /* JADX INFO: renamed from: p */
    private String f90972p = "";

    /* JADX INFO: renamed from: q */
    private int f90973q = 0;

    /* JADX INFO: renamed from: r */
    private long f90974r = 20000;

    /* JADX INFO: renamed from: s */
    private long f90975s = 10000;

    /* JADX INFO: renamed from: t */
    private final ArrayList<String> f90976t = new ArrayList<>();

    /* JADX INFO: renamed from: u */
    private int f90977u = 1;

    /* JADX INFO: renamed from: v */
    private volatile boolean f90978v = false;

    /* JADX INFO: renamed from: l.dvx$a */
    public class C16639a {

        /* JADX INFO: renamed from: a */
        String f90979a;

        /* JADX INFO: renamed from: b */
        String f90980b;

        /* JADX INFO: renamed from: c */
        String f90981c;

        public C16639a(String str, String str2, String str3) {
            this.f90979a = str;
            this.f90980b = str2;
            this.f90981c = str3;
        }
    }

    /* JADX INFO: renamed from: l.dvx$b */
    public interface InterfaceC16640b {
        void messageFromMediaLogV2(int i, int i2, int i3, Object obj);
    }

    public dvx() {
        this.f90963g = HuiYanResultSender.TIMEOUT_MS;
        this.f90964h = 6;
        esx.m122399d("MediaLogPullV2", "");
        if (this.f90957a == null) {
            HandlerThread handlerThread = new HandlerThread("MediaLogPullV2");
            this.f90957a = handlerThread;
            handlerThread.start();
            this.f90958b = new Handler(this.f90957a.getLooper(), this);
            this.f90963g = csx.m112235R().m112310Z();
            this.f90964h = csx.m112235R().m112314a0();
        }
    }

    /* JADX INFO: renamed from: F */
    private void m118314F(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        C16639a c16639a = new C16639a("nonConf", str, str2);
        Handler handler = this.f90958b;
        if (handler == null || this.f90957a == null) {
            return;
        }
        handler.obtainMessage(204, c16639a).sendToTarget();
    }

    /* JADX INFO: renamed from: d */
    private void m118315d(boolean z) {
        StringBuilder sb;
        ArrayList<String> arrayList;
        synchronized (this.f90967k) {
            try {
                if (this.f90967k.size() >= this.f90964h || z) {
                    sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        int size = this.f90967k.size();
                        arrayList = this.f90967k;
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
        m118314F("v2.pullWatch", sb.toString());
    }

    /* JADX INFO: renamed from: e */
    private void m118316e(boolean z, ArrayList<String> arrayList, String str) {
        StringBuilder sb;
        synchronized (arrayList) {
            try {
                if (arrayList.size() >= this.f90964h || z) {
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
        m118314F(str, sb.toString());
    }

    /* JADX INFO: renamed from: r */
    private void m118317r() {
        String strM127720f = fvx.m127720f(this.f90960d, new uvx());
        synchronized (this.f90967k) {
            this.f90967k.add(strM127720f);
        }
        m118315d(false);
    }

    /* JADX INFO: renamed from: t */
    private void m118318t(int i, int i2, int i3, Object obj) {
        InterfaceC16640b interfaceC16640b = this.f90959c;
        if (interfaceC16640b != null) {
            interfaceC16640b.messageFromMediaLogV2(i, i2, i3, obj);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m118319A(int i) {
        if (i > 0) {
            this.f90964h = i;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m118320B(InterfaceC16640b interfaceC16640b) {
        this.f90959c = interfaceC16640b;
    }

    /* JADX INFO: renamed from: C */
    public void m118321C(long j) {
        this.f90975s = j;
    }

    /* JADX INFO: renamed from: D */
    public void m118322D(int i) {
        if (i != 0) {
            this.f90973q = i;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m118323E(int i, int i2, fpf0 fpf0Var) {
        esx.m122399d("MediaLogPullV2", "Interval " + i + " / " + i2);
        this.f90970n = true;
        this.f90963g = i;
        this.f90964h = i2;
        Handler handler = this.f90958b;
        if (handler == null || this.f90957a == null) {
            return;
        }
        handler.obtainMessage(205, fpf0Var).sendToTarget();
    }

    /* JADX INFO: renamed from: G */
    public void m118324G(String str, String str2) {
        m118314F(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m118325a() {
        esx.m122399d("MediaLogPullV2", "");
        Handler handler = this.f90958b;
        if (handler != null && this.f90957a != null) {
            handler.sendEmptyMessageDelayed(101, this.f90974r);
        }
        String strM127715a = fvx.m127715a(this.f90960d, new pvx());
        this.f90978v = true;
        m118314F("v2.bufferStart", strM127715a);
    }

    /* JADX INFO: renamed from: b */
    public void m118326b() {
        if (this.f90978v) {
            esx.m122399d("MediaLogPullV2", "");
            this.f90978v = false;
            Handler handler = this.f90958b;
            if (handler != null && this.f90957a != null) {
                handler.removeMessages(101);
            }
            m118314F("v2.bufferStop", fvx.m127716b(this.f90960d, new qvx()));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m118327c() {
        StringBuilder sb;
        ArrayList<String> arrayList;
        synchronized (this.f90976t) {
            try {
                if (this.f90976t.size() > 0) {
                    sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        int size = this.f90976t.size();
                        arrayList = this.f90976t;
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
        m118314F("v2.mediaLogs", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), "pullMediaLog", "[" + sb.toString().replace(Constants.AES_SUFFIX, ")") + Constants.AES_SUFFIX));
    }

    /* JADX INFO: renamed from: f */
    public int m118328f() {
        return this.f90977u;
    }

    /* JADX INFO: renamed from: g */
    public boolean m118329g() {
        return this.f90970n || this.f90962f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m118330h() {
        return this.f90966j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 201) {
            this.f90959c = null;
            this.f90960d = null;
            this.f90961e = null;
            Handler handler = this.f90958b;
            if (handler != null && this.f90957a != null) {
                handler.removeCallbacksAndMessages(null);
                this.f90957a.quit();
                this.f90958b = null;
                this.f90957a = null;
            }
        } else if (i == 202) {
            m118317r();
        } else if (i == 204) {
            C16639a c16639a = (C16639a) message.obj;
            if (c16639a != null && c16639a.f90981c != null) {
                if (this.f90961e != null) {
                    this.f90961e.mo95755b("nonConf", c16639a.f90980b, c16639a.f90981c, this.f90971o, String.valueOf(this.f90960d == null ? 0L : this.f90960d.f186005O), String.valueOf(this.f90973q));
                }
                if (this.f90960d != null && this.f90960d.f186014X && this.f90962f != null) {
                    this.f90962f.mo95755b("nonConf", c16639a.f90980b, c16639a.f90981c, this.f90971o, String.valueOf(this.f90960d != null ? this.f90960d.f186005O : 0L), String.valueOf(this.f90973q));
                }
            }
        } else if (i != 205) {
            switch (i) {
                case 100:
                    m118318t(100, 0, 1, null);
                    break;
                case 101:
                    m118318t(100, 0, 6, null);
                    break;
                case 102:
                    m118318t(200, 1000, 0, null);
                    Handler handler2 = this.f90958b;
                    if (handler2 != null && this.f90957a != null) {
                        handler2.sendEmptyMessageDelayed(102, this.f90963g);
                    }
                    break;
                case 103:
                    if (this.f90960d != null) {
                        this.f90960d.f186040p = fvx.m127730p();
                    }
                    break;
                case 104:
                    esx.m122396a("buffercheckcount", "pullBufferCheck");
                    m118318t(200, 1001, 0, null);
                    Handler handler3 = this.f90958b;
                    if (handler3 != null && this.f90957a != null) {
                        handler3.sendEmptyMessageDelayed(104, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    }
                    break;
            }
        } else {
            this.f90961e = (fpf0) message.obj;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m118331i(String str, String str2) {
        if (str.equals("v2.livePullStop")) {
            synchronized (this.f90968l) {
                this.f90968l.add(str2);
            }
        } else if (str.equals("v2.livePullStart")) {
            synchronized (this.f90969m) {
                this.f90969m.add(str2);
            }
        }
        m118316e(false, this.f90969m, "v2.livePullStart");
        m118316e(false, this.f90968l, "v2.livePullStop");
    }

    /* JADX INFO: renamed from: j */
    public void m118332j(String str, String str2) {
        m118314F("v2.mediaLogs", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), str, str2).replace(Constants.AES_SUFFIX, ")"));
    }

    /* JADX INFO: renamed from: k */
    public void m118333k(Object... objArr) {
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
        synchronized (this.f90976t) {
            this.f90976t.add(sb.toString());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m118334l() {
        esx.m122399d("MediaLogPullV2", "");
        m118314F("v2.pullBufferDrop", fvx.m127717c(this.f90960d, new rvx()));
    }

    /* JADX INFO: renamed from: m */
    public void m118335m() {
        if (this.f90966j) {
            return;
        }
        this.f90966j = true;
        if (this.f90960d == null || this.f90960d.f186019b == null) {
            return;
        }
        m118314F("v2.pullDetect", this.f90960d.f186019b);
    }

    /* JADX INFO: renamed from: n */
    public void m118336n() {
        esx.m122399d("MediaLogPullV2", "Interval " + this.f90963g + " / " + this.f90964h);
        esx.m122399d("MediaLogPullV2", "myHttpMediaLogsUpload " + this.f90962f + " / " + this.f90961e);
        Handler handler = this.f90958b;
        if (handler == null || this.f90957a == null) {
            return;
        }
        handler.sendEmptyMessage(103);
        this.f90958b.sendEmptyMessageDelayed(100, this.f90975s);
        this.f90958b.sendEmptyMessageDelayed(102, this.f90963g);
        this.f90958b.sendEmptyMessageDelayed(104, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: o */
    public void m118337o() {
        esx.m122399d("MediaLogPullV2", "");
        Handler handler = this.f90958b;
        if (handler != null && this.f90957a != null) {
            handler.removeMessages(100);
        }
        m118335m();
        m118314F("v2.pullStart", fvx.m127718d(this.f90960d, new svx()));
    }

    /* JADX INFO: renamed from: p */
    public void m118338p() {
        esx.m122399d("MediaLogPullV2", "");
        if (this.f90965i) {
            return;
        }
        this.f90965i = true;
        m118335m();
        if (this.f90960d.f186013W == 0) {
            m118317r();
        }
        m118315d(true);
        m118316e(true, this.f90968l, "v2.livePullStop");
        m118316e(true, this.f90969m, "v2.livePullStart");
        m118326b();
        m118314F("v2.pullStop", fvx.m127719e(this.f90960d, new tvx()));
    }

    /* JADX INFO: renamed from: q */
    public void m118339q() {
        esx.m122399d("MediaLogPullV2", "");
        Handler handler = this.f90958b;
        if (handler == null || this.f90957a == null) {
            return;
        }
        handler.sendEmptyMessage(202);
    }

    /* JADX INFO: renamed from: s */
    public void m118340s() {
        Handler handler = this.f90958b;
        if (handler == null || this.f90957a == null) {
            return;
        }
        handler.sendEmptyMessage(201);
    }

    /* JADX INFO: renamed from: u */
    public void m118341u(long j) {
        this.f90974r = j;
    }

    /* JADX INFO: renamed from: v */
    public void m118342v(int i) {
        this.f90977u = i;
    }

    /* JADX INFO: renamed from: w */
    public final void m118343w(a320 a320Var) {
        this.f90962f = a320Var;
    }

    /* JADX INFO: renamed from: x */
    public void m118344x(int i) {
        if (i > 1000) {
            this.f90963g = i;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m118345y(String str, String str2, int i) {
        this.f90971o = str;
        this.f90972p = str2;
        if (i != 0) {
            this.f90973q = i;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m118346z(vvx vvxVar) {
        this.f90960d = vvxVar;
    }
}
