package p149l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bw00 implements dxl {

    /* JADX INFO: renamed from: l */
    protected String f77565l;

    /* JADX INFO: renamed from: m */
    protected InterfaceC15993b f77566m;

    /* JADX INFO: renamed from: n */
    protected Thread f77567n;

    /* JADX INFO: renamed from: q */
    protected tnl f77570q;

    /* JADX INFO: renamed from: r */
    protected ewl f77571r;

    /* JADX INFO: renamed from: s */
    protected sol f77572s;

    /* JADX INFO: renamed from: a */
    protected String f77554a = "v2.pushWatch";

    /* JADX INFO: renamed from: b */
    protected String f77555b = "v2.pullWatch";

    /* JADX INFO: renamed from: c */
    protected String f77556c = "v2.pushStart";

    /* JADX INFO: renamed from: d */
    protected String f77557d = "v2.pushStop";

    /* JADX INFO: renamed from: e */
    protected String f77558e = "v2.pushBitrateChange";

    /* JADX INFO: renamed from: f */
    protected String f77559f = "v2.pushNetworkWarning";

    /* JADX INFO: renamed from: g */
    protected String f77560g = "v2.pushFocus";

    /* JADX INFO: renamed from: h */
    protected int f77561h = 5;

    /* JADX INFO: renamed from: i */
    private int f77562i = 30;

    /* JADX INFO: renamed from: j */
    protected ArrayList<String> f77563j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    protected int f77564k = 0;

    /* JADX INFO: renamed from: o */
    private volatile boolean f77568o = false;

    /* JADX INFO: renamed from: p */
    private final Object f77569p = new Object();

    /* JADX INFO: renamed from: t */
    private volatile boolean f77573t = false;

    /* JADX INFO: renamed from: l.bw00$a */
    public class RunnableC15992a implements Runnable {
        public RunnableC15992a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            while (bw00.this.f77568o && !z) {
                try {
                    synchronized (bw00.this.f77569p) {
                        try {
                            bw00.this.f77569p.wait(bw00.this.f77561h);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bw00 bw00Var = bw00.this;
                bw00Var.f77563j.add(bw00Var.mo99222o(bw00Var.f77571r));
                bw00.this.m104116h();
                bw00 bw00Var2 = bw00.this;
                z = bw00Var2.mo99217g(bw00Var2.f77571r, 100) != 0;
                ewl ewlVar = bw00.this.f77571r;
                if (ewlVar != null && !z) {
                    z = ewlVar.mo20019j1(4129, 0, null) == 1;
                    if (z) {
                        n8c.m158488f("", "exit wathc base . needStopOrMeetErrcode14 " + z);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.bw00$b */
    public interface InterfaceC15993b {
        /* JADX INFO: renamed from: a */
        void mo18369a(String str, String str2);
    }

    public bw00(String str) {
        this.f77565l = str;
    }

    /* JADX INFO: renamed from: f */
    private synchronized void m104115f() {
        ArrayList<String> arrayList;
        try {
            if (this.f77563j.size() == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (this.f77563j.size() != 0) {
                int i = 0;
                while (true) {
                    int size = this.f77563j.size();
                    arrayList = this.f77563j;
                    if (i >= size) {
                        break;
                    }
                    sb.append(arrayList.get(i));
                    i++;
                }
                arrayList.clear();
                if (this.f77568o) {
                    m104121k(this.f77554a, sb.toString());
                }
                sb.delete(0, sb.length());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m104116h() {
        if (this.f77563j.size() < this.f77562i) {
            return;
        }
        m104115f();
    }

    @Override // p149l.dxl
    /* JADX INFO: renamed from: A1 */
    public void mo104117A1(tnl tnlVar) {
        this.f77570q = tnlVar;
    }

    @Override // p149l.dxl
    /* JADX INFO: renamed from: G1 */
    public void mo99215G1(ewl ewlVar) {
        this.f77571r = ewlVar;
        ewlVar.mo19922E0(this);
        this.f77564k = (int) ewlVar.mo20019j1(4122, 0, null);
    }

    @Override // p149l.dxl
    /* JADX INFO: renamed from: U */
    public void mo104118U(sol solVar) {
        this.f77572s = solVar;
    }

    /* JADX INFO: renamed from: a */
    public void mo99216a(int i, int i2, Object obj) {
        if (i == 12292) {
            n8c.m158483a("jzheng", "onInfo " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2 + " [" + obj + Constants.AES_SUFFIX);
            if (this.f77565l.equals(obj.toString())) {
                m104121k(this.f77556c, mo99220l(obj));
            }
        }
        if (i == 12303) {
            m104121k(this.f77559f, mo99218i(obj));
            return;
        }
        if (i == 12304) {
            m104121k(this.f77560g, mo99219j(obj, i));
        } else if (i == 12306) {
            m104121k("v2.mediaLogs", mo99219j(obj, i));
        } else {
            if (i != 12308) {
                return;
            }
            m104121k("v2.pushRestart", mo99219j(obj, i));
        }
    }

    @Override // p149l.hu00.InterfaceC17395d
    /* JADX INFO: renamed from: d0 */
    public void mo19733d0(Object obj) {
        if (this.f77564k == 1 && this.f77565l.equals(obj.toString()) && (obj instanceof ewl)) {
            m104121k(this.f77556c, mo99220l(obj));
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m104119e(Object obj) {
        return obj != null;
    }

    @Override // p149l.dxl
    /* JADX INFO: renamed from: f1 */
    public void mo104120f1(InterfaceC15993b interfaceC15993b) {
        this.f77566m = interfaceC15993b;
    }

    /* JADX INFO: renamed from: g */
    public abstract long mo99217g(Object obj, int i);

    /* JADX INFO: renamed from: i */
    public abstract String mo99218i(Object obj);

    /* JADX INFO: renamed from: j */
    public abstract String mo99219j(Object obj, int i);

    @Override // p149l.hu00.InterfaceC17395d
    /* JADX INFO: renamed from: j0 */
    public void mo19741j0(Object obj) {
        m104115f();
        if (this.f77572s != null && this.f77565l.equals(obj.toString())) {
            int iMo18365a = m104119e(this.f77572s) ? this.f77572s.mo18365a() : 0;
            if (!this.f77573t) {
                this.f77573t = true;
                if (obj instanceof ewl) {
                    m104121k(this.f77557d, mo99221m(this.f77571r, iMo18365a));
                }
            }
        }
        if (this.f77568o) {
            return;
        }
        this.f77572s = null;
    }

    /* JADX INFO: renamed from: k */
    public void m104121k(String str, String str2) {
        ewl ewlVar = this.f77571r;
        if (ewlVar == null || ewlVar.mo20019j1(4129, 0, null) != 1) {
            InterfaceC15993b interfaceC15993b = this.f77566m;
            if (interfaceC15993b != null) {
                if ((str != null) & (str2 != null)) {
                    interfaceC15993b.mo18369a(str, str2);
                }
            }
            if ("v3.pullWatch".equals(str) || "v3.pushWatch".equals(str)) {
                n8c.m158483a("v3logs", "[" + str + Constants.AES_SUFFIX);
                return;
            }
            n8c.m158483a("v3logs", "[" + str + "] - " + str2);
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract String mo99220l(Object obj);

    /* JADX INFO: renamed from: m */
    public abstract String mo99221m(Object obj, int i);

    @Override // p149l.dxl
    /* JADX INFO: renamed from: n */
    public void mo104122n(int i) {
        if (i <= 0) {
            return;
        }
        this.f77562i = i;
    }

    /* JADX INFO: renamed from: o */
    public abstract String mo99222o(Object obj);

    @Override // p149l.dxl
    public void start() {
        if (this.f77568o) {
            return;
        }
        this.f77568o = true;
        Thread thread = new Thread(new RunnableC15992a(), "live-media-WLoThread");
        this.f77567n = thread;
        thread.start();
    }

    @Override // p149l.dxl
    public void stop() {
        m104115f();
        int iMo18365a = m104119e(this.f77572s) ? this.f77572s.mo18365a() : 0;
        this.f77568o = false;
        synchronized (this.f77569p) {
            this.f77569p.notifyAll();
        }
        Thread thread = this.f77567n;
        if (thread != null) {
            thread.interrupt();
            try {
                this.f77567n.join(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f77567n = null;
        }
        if (!this.f77573t) {
            this.f77573t = true;
            ewl ewlVar = this.f77571r;
            if (ewlVar != null) {
                m104121k(this.f77557d, mo99221m(ewlVar, iMo18365a));
            }
        }
        this.f77570q = null;
        this.f77571r = null;
    }

    @Override // p149l.dxl
    /* JADX INFO: renamed from: t */
    public void mo104123t(int i) {
        this.f77561h = i;
    }

    @Override // p149l.dxl
    /* JADX INFO: renamed from: t0 */
    public void mo104124t0(int i) {
        keb0 keb0Var = new keb0();
        keb0Var.m156461a(keb0.f122694c, System.currentTimeMillis() + "");
        keb0Var.m156461a(keb0.f122695d, i + "");
        m104121k(this.f77558e, keb0Var.toString());
    }
}
