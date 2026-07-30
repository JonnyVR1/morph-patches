package p153l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j410 implements wzl {

    /* JADX INFO: renamed from: l */
    protected String f118246l;

    /* JADX INFO: renamed from: m */
    protected InterfaceC17870b f118247m;

    /* JADX INFO: renamed from: n */
    protected Thread f118248n;

    /* JADX INFO: renamed from: q */
    protected eql f118251q;

    /* JADX INFO: renamed from: r */
    protected wyl f118252r;

    /* JADX INFO: renamed from: s */
    protected drl f118253s;

    /* JADX INFO: renamed from: a */
    protected String f118235a = "v2.pushWatch";

    /* JADX INFO: renamed from: b */
    protected String f118236b = "v2.pullWatch";

    /* JADX INFO: renamed from: c */
    protected String f118237c = "v2.pushStart";

    /* JADX INFO: renamed from: d */
    protected String f118238d = "v2.pushStop";

    /* JADX INFO: renamed from: e */
    protected String f118239e = "v2.pushBitrateChange";

    /* JADX INFO: renamed from: f */
    protected String f118240f = "v2.pushNetworkWarning";

    /* JADX INFO: renamed from: g */
    protected String f118241g = "v2.pushFocus";

    /* JADX INFO: renamed from: h */
    protected int f118242h = 5;

    /* JADX INFO: renamed from: i */
    private int f118243i = 30;

    /* JADX INFO: renamed from: j */
    protected ArrayList<String> f118244j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    protected int f118245k = 0;

    /* JADX INFO: renamed from: o */
    private volatile boolean f118249o = false;

    /* JADX INFO: renamed from: p */
    private final Object f118250p = new Object();

    /* JADX INFO: renamed from: t */
    private volatile boolean f118254t = false;

    /* JADX INFO: renamed from: l.j410$a */
    public class RunnableC17869a implements Runnable {
        public RunnableC17869a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            while (j410.this.f118249o && !z) {
                try {
                    synchronized (j410.this.f118250p) {
                        try {
                            j410.this.f118250p.wait(j410.this.f118242h);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                j410 j410Var = j410.this;
                j410Var.f118244j.add(j410Var.mo138385o(j410Var.f118252r));
                j410.this.m143390h();
                j410 j410Var2 = j410.this;
                z = j410Var2.mo138380g(j410Var2.f118252r, 100) != 0;
                wyl wylVar = j410.this.f118252r;
                if (wylVar != null && !z) {
                    z = wylVar.mo21018j1(4129, 0, null) == 1;
                    if (z) {
                        t9c.m189748f("", "exit wathc base . needStopOrMeetErrcode14 " + z);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.j410$b */
    public interface InterfaceC17870b {
        /* JADX INFO: renamed from: a */
        void mo19378a(String str, String str2);
    }

    public j410(String str) {
        this.f118246l = str;
    }

    /* JADX INFO: renamed from: f */
    private synchronized void m143389f() {
        ArrayList<String> arrayList;
        try {
            if (this.f118244j.size() == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (this.f118244j.size() != 0) {
                int i = 0;
                while (true) {
                    int size = this.f118244j.size();
                    arrayList = this.f118244j;
                    if (i >= size) {
                        break;
                    }
                    sb.append(arrayList.get(i));
                    i++;
                }
                arrayList.clear();
                if (this.f118249o) {
                    m143395k(this.f118235a, sb.toString());
                }
                sb.delete(0, sb.length());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m143390h() {
        if (this.f118244j.size() < this.f118243i) {
            return;
        }
        m143389f();
    }

    @Override // p153l.wzl
    /* JADX INFO: renamed from: A1 */
    public void mo143391A1(eql eqlVar) {
        this.f118251q = eqlVar;
    }

    @Override // p153l.wzl
    /* JADX INFO: renamed from: G1 */
    public void mo138379G1(wyl wylVar) {
        this.f118252r = wylVar;
        wylVar.mo20921E0(this);
        this.f118245k = (int) wylVar.mo21018j1(4122, 0, null);
    }

    @Override // p153l.wzl
    /* JADX INFO: renamed from: U */
    public void mo143392U(drl drlVar) {
        this.f118253s = drlVar;
    }

    /* JADX INFO: renamed from: a */
    public void mo133538a(int i, int i2, Object obj) {
        if (i == 12292) {
            t9c.m189743a("jzheng", "onInfo " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2 + " [" + obj + Constants.AES_SUFFIX);
            if (this.f118246l.equals(obj.toString())) {
                m143395k(this.f118237c, mo138383l(obj));
            }
        }
        if (i == 12303) {
            m143395k(this.f118240f, mo138381i(obj));
            return;
        }
        if (i == 12304) {
            m143395k(this.f118241g, mo138382j(obj, i));
        } else if (i == 12306) {
            m143395k("v2.mediaLogs", mo138382j(obj, i));
        } else {
            if (i != 12308) {
                return;
            }
            m143395k("v2.pushRestart", mo138382j(obj, i));
        }
    }

    @Override // p153l.q210.InterfaceC19503d
    /* JADX INFO: renamed from: d0 */
    public void mo20732d0(Object obj) {
        if (this.f118245k == 1 && this.f118246l.equals(obj.toString()) && (obj instanceof wyl)) {
            m143395k(this.f118237c, mo138383l(obj));
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m143393e(Object obj) {
        return obj != null;
    }

    @Override // p153l.wzl
    /* JADX INFO: renamed from: f1 */
    public void mo143394f1(InterfaceC17870b interfaceC17870b) {
        this.f118247m = interfaceC17870b;
    }

    /* JADX INFO: renamed from: g */
    public abstract long mo138380g(Object obj, int i);

    /* JADX INFO: renamed from: i */
    public abstract String mo138381i(Object obj);

    /* JADX INFO: renamed from: j */
    public abstract String mo138382j(Object obj, int i);

    @Override // p153l.q210.InterfaceC19503d
    /* JADX INFO: renamed from: j0 */
    public void mo20740j0(Object obj) {
        m143389f();
        if (this.f118253s != null && this.f118246l.equals(obj.toString())) {
            int iMo19374a = m143393e(this.f118253s) ? this.f118253s.mo19374a() : 0;
            if (!this.f118254t) {
                this.f118254t = true;
                if (obj instanceof wyl) {
                    m143395k(this.f118238d, mo138384m(this.f118252r, iMo19374a));
                }
            }
        }
        if (this.f118249o) {
            return;
        }
        this.f118253s = null;
    }

    /* JADX INFO: renamed from: k */
    public void m143395k(String str, String str2) {
        wyl wylVar = this.f118252r;
        if (wylVar == null || wylVar.mo21018j1(4129, 0, null) != 1) {
            InterfaceC17870b interfaceC17870b = this.f118247m;
            if (interfaceC17870b != null) {
                if ((str != null) & (str2 != null)) {
                    interfaceC17870b.mo19378a(str, str2);
                }
            }
            if ("v3.pullWatch".equals(str) || "v3.pushWatch".equals(str)) {
                t9c.m189743a("v3logs", "[" + str + Constants.AES_SUFFIX);
                return;
            }
            t9c.m189743a("v3logs", "[" + str + "] - " + str2);
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract String mo138383l(Object obj);

    /* JADX INFO: renamed from: m */
    public abstract String mo138384m(Object obj, int i);

    @Override // p153l.wzl
    /* JADX INFO: renamed from: n */
    public void mo143396n(int i) {
        if (i <= 0) {
            return;
        }
        this.f118243i = i;
    }

    /* JADX INFO: renamed from: o */
    public abstract String mo138385o(Object obj);

    @Override // p153l.wzl
    public void start() {
        if (this.f118249o) {
            return;
        }
        this.f118249o = true;
        Thread thread = new Thread(new RunnableC17869a(), "live-media-WLoThread");
        this.f118248n = thread;
        thread.start();
    }

    @Override // p153l.wzl
    public void stop() {
        m143389f();
        int iMo19374a = m143393e(this.f118253s) ? this.f118253s.mo19374a() : 0;
        this.f118249o = false;
        synchronized (this.f118250p) {
            this.f118250p.notifyAll();
        }
        Thread thread = this.f118248n;
        if (thread != null) {
            thread.interrupt();
            try {
                this.f118248n.join(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f118248n = null;
        }
        if (!this.f118254t) {
            this.f118254t = true;
            wyl wylVar = this.f118252r;
            if (wylVar != null) {
                m143395k(this.f118238d, mo138384m(wylVar, iMo19374a));
            }
        }
        this.f118251q = null;
        this.f118252r = null;
    }

    @Override // p153l.wzl
    /* JADX INFO: renamed from: t */
    public void mo143397t(int i) {
        this.f118242h = i;
    }

    @Override // p153l.wzl
    /* JADX INFO: renamed from: t0 */
    public void mo143398t0(int i) {
        omb0 omb0Var = new omb0();
        omb0Var.m199181a(omb0.f147919c, System.currentTimeMillis() + "");
        omb0Var.m199181a(omb0.f147920d, i + "");
        m143395k(this.f118239e, omb0Var.toString());
    }
}
