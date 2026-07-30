package p149l;

import android.os.SystemClock;
import android.util.Pair;
import com.xiaomi.push.service.AbstractC14843an;
import com.xiaomi.push.service.C14842am;
import com.xiaomi.push.service.XMPushService;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class osq0 {

    /* JADX INFO: renamed from: r */
    private static final AtomicInteger f145485r = new AtomicInteger(0);

    /* JADX INFO: renamed from: s */
    public static boolean f145486s;

    /* JADX INFO: renamed from: n */
    protected psq0 f145500n;

    /* JADX INFO: renamed from: o */
    protected XMPushService f145501o;

    /* JADX INFO: renamed from: a */
    protected int f145487a = 0;

    /* JADX INFO: renamed from: b */
    protected long f145488b = -1;

    /* JADX INFO: renamed from: c */
    protected volatile long f145489c = 0;

    /* JADX INFO: renamed from: d */
    protected volatile long f145490d = 0;

    /* JADX INFO: renamed from: e */
    private LinkedList<Pair<Integer, Long>> f145491e = new LinkedList<>();

    /* JADX INFO: renamed from: f */
    private final Collection<rsq0> f145492f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    protected final Map<tsq0, C19027a> f145493g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    protected final Map<tsq0, C19027a> f145494h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    protected wsq0 f145495i = null;

    /* JADX INFO: renamed from: j */
    protected String f145496j = "";

    /* JADX INFO: renamed from: k */
    protected String f145497k = "";

    /* JADX INFO: renamed from: l */
    private int f145498l = 2;

    /* JADX INFO: renamed from: m */
    protected final int f145499m = f145485r.getAndIncrement();

    /* JADX INFO: renamed from: p */
    private long f145502p = 0;

    /* JADX INFO: renamed from: q */
    protected long f145503q = 0;

    /* JADX INFO: renamed from: l.osq0$a */
    public static class C19027a {

        /* JADX INFO: renamed from: a */
        private tsq0 f145504a;

        /* JADX INFO: renamed from: b */
        private xsq0 f145505b;

        public C19027a(tsq0 tsq0Var, xsq0 xsq0Var) {
            this.f145504a = tsq0Var;
            this.f145505b = xsq0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m165906a(qrq0 qrq0Var) {
            this.f145504a.mo86364a(qrq0Var);
        }

        /* JADX INFO: renamed from: b */
        public void m165907b(atq0 atq0Var) {
            xsq0 xsq0Var = this.f145505b;
            if (xsq0Var == null || xsq0Var.mo86368a(atq0Var)) {
                this.f145504a.mo86363a(atq0Var);
            }
        }
    }

    static {
        f145486s = false;
        try {
            f145486s = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        usq0.m195229c();
    }

    public osq0(XMPushService xMPushService, psq0 psq0Var) {
        this.f145500n = psq0Var;
        this.f145501o = xMPushService;
        m165900u();
    }

    /* JADX INFO: renamed from: d */
    private String m165875d(int i) {
        if (i == 1) {
            return "connected";
        }
        if (i == 0) {
            return "connecting";
        }
        return i == 2 ? "disconnected" : "unknown";
    }

    /* JADX INFO: renamed from: g */
    private void m165876g(int i) {
        synchronized (this.f145491e) {
            LinkedList<Pair<Integer, Long>> linkedList = this.f145491e;
            try {
                if (i == 1) {
                    linkedList.clear();
                } else {
                    linkedList.add(new Pair<>(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                    if (this.f145491e.size() > 6) {
                        this.f145491e.remove(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo165877A(boolean z);

    /* JADX INFO: renamed from: B */
    public boolean m165878B() {
        return this.f145498l == 0;
    }

    /* JADX INFO: renamed from: C */
    public synchronized void m165879C() {
        this.f145502p = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: D */
    public boolean m165880D() {
        return this.f145498l == 1;
    }

    /* JADX INFO: renamed from: E */
    public void m165881E() {
        synchronized (this.f145491e) {
            this.f145491e.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m165882a() {
        return this.f145487a;
    }

    /* JADX INFO: renamed from: b */
    public long m165883b() {
        return this.f145490d;
    }

    /* JADX INFO: renamed from: c */
    public String mo165884c() {
        return this.f145500n.m171246c();
    }

    /* JADX INFO: renamed from: e */
    public Map<tsq0, C19027a> m165885e() {
        return this.f145493g;
    }

    /* JADX INFO: renamed from: f */
    public psq0 m165886f() {
        return this.f145500n;
    }

    /* JADX INFO: renamed from: h */
    public void m165887h(int i, int i2, Exception exc) {
        int i3 = this.f145498l;
        if (i != i3) {
            ilq0.m137040m(String.format("update the connection status. %1$s -> %2$s : %3$s ", m165875d(i3), m165875d(i), AbstractC14843an.m86536a(i2)));
        }
        if (gkq0.m126691t(this.f145501o)) {
            m165876g(i);
        }
        if (i == 1) {
            this.f145501o.m86343a(10);
            if (this.f145498l != 0) {
                ilq0.m137040m("try set connected while not connecting.");
            }
            this.f145498l = i;
            Iterator<rsq0> it = this.f145492f.iterator();
            while (it.hasNext()) {
                it.next().mo85573b(this);
            }
            return;
        }
        if (i == 0) {
            if (this.f145498l != 2) {
                ilq0.m137040m("try set connecting while not disconnected.");
            }
            this.f145498l = i;
            Iterator<rsq0> it2 = this.f145492f.iterator();
            while (it2.hasNext()) {
                it2.next().mo85569a(this);
            }
            return;
        }
        if (i == 2) {
            this.f145501o.m86343a(10);
            int i4 = this.f145498l;
            if (i4 == 0) {
                Iterator<rsq0> it3 = this.f145492f.iterator();
                while (it3.hasNext()) {
                    it3.next().mo85571a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i4 == 1) {
                Iterator<rsq0> it4 = this.f145492f.iterator();
                while (it4.hasNext()) {
                    it4.next().mo85570a(this, i2, exc);
                }
            }
            this.f145498l = i;
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo165888i(C14842am.b bVar);

    /* JADX INFO: renamed from: j */
    public synchronized void m165889j(String str) {
        try {
            if (this.f145498l == 0) {
                ilq0.m137040m("setChallenge hash = ".concat(tlq0.m189623b(str).substring(0, 8)));
                this.f145496j = str;
                m165887h(1, 0, null);
            } else {
                ilq0.m137040m("ignore setChallenge because connection was disconnected");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo165890k(String str, String str2);

    /* JADX INFO: renamed from: l */
    public void m165891l(rsq0 rsq0Var) {
        if (rsq0Var == null || this.f145492f.contains(rsq0Var)) {
            return;
        }
        this.f145492f.add(rsq0Var);
    }

    /* JADX INFO: renamed from: m */
    public void m165892m(tsq0 tsq0Var) {
        this.f145493g.remove(tsq0Var);
    }

    /* JADX INFO: renamed from: n */
    public void m165893n(tsq0 tsq0Var, xsq0 xsq0Var) {
        if (tsq0Var == null) {
            jfd0.m141176a("Packet listener is null.");
        } else {
            this.f145493g.put(tsq0Var, new C19027a(tsq0Var, xsq0Var));
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo165894o(atq0 atq0Var);

    /* JADX INFO: renamed from: p */
    public abstract void mo165895p(qrq0[] qrq0VarArr);

    /* JADX INFO: renamed from: q */
    public boolean mo165896q() {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public synchronized boolean m165897r(long j) {
        return this.f145502p >= j;
    }

    /* JADX INFO: renamed from: s */
    public int m165898s() {
        return this.f145498l;
    }

    /* JADX INFO: renamed from: t */
    public String m165899t() {
        return this.f145500n.m171244b();
    }

    /* JADX INFO: renamed from: u */
    public void m165900u() {
        String property;
        if (this.f145500n.m171243a() && this.f145495i == null) {
            Class<?> cls = null;
            try {
                property = System.getProperty("smack.debuggerClass");
            } catch (Throwable unused) {
                property = null;
            }
            if (property != null) {
                try {
                    cls = Class.forName(property);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (cls == null) {
                this.f145495i = new yrq0(this);
                return;
            }
            try {
                this.f145495i = (wsq0) cls.getConstructor(osq0.class, Writer.class, Reader.class).newInstance(this);
            } catch (Exception e2) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e2);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo165901v(int i, Exception exc);

    /* JADX INFO: renamed from: w */
    public abstract void mo165902w(qrq0 qrq0Var);

    /* JADX INFO: renamed from: x */
    public void m165903x(rsq0 rsq0Var) {
        this.f145492f.remove(rsq0Var);
    }

    /* JADX INFO: renamed from: y */
    public void m165904y(tsq0 tsq0Var) {
        this.f145494h.remove(tsq0Var);
    }

    /* JADX INFO: renamed from: z */
    public void m165905z(tsq0 tsq0Var, xsq0 xsq0Var) {
        if (tsq0Var == null) {
            jfd0.m141176a("Packet listener is null.");
        } else {
            this.f145494h.put(tsq0Var, new C19027a(tsq0Var, xsq0Var));
        }
    }
}
