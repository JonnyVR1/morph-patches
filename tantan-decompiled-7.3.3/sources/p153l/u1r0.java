package p153l;

import android.os.SystemClock;
import android.util.Pair;
import com.xiaomi.push.service.AbstractC14991an;
import com.xiaomi.push.service.C14990am;
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
public abstract class u1r0 {

    /* JADX INFO: renamed from: r */
    private static final AtomicInteger f177110r = new AtomicInteger(0);

    /* JADX INFO: renamed from: s */
    public static boolean f177111s;

    /* JADX INFO: renamed from: n */
    protected v1r0 f177125n;

    /* JADX INFO: renamed from: o */
    protected XMPushService f177126o;

    /* JADX INFO: renamed from: a */
    protected int f177112a = 0;

    /* JADX INFO: renamed from: b */
    protected long f177113b = -1;

    /* JADX INFO: renamed from: c */
    protected volatile long f177114c = 0;

    /* JADX INFO: renamed from: d */
    protected volatile long f177115d = 0;

    /* JADX INFO: renamed from: e */
    private LinkedList<Pair<Integer, Long>> f177116e = new LinkedList<>();

    /* JADX INFO: renamed from: f */
    private final Collection<x1r0> f177117f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    protected final Map<z1r0, C20459a> f177118g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    protected final Map<z1r0, C20459a> f177119h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    protected c2r0 f177120i = null;

    /* JADX INFO: renamed from: j */
    protected String f177121j = "";

    /* JADX INFO: renamed from: k */
    protected String f177122k = "";

    /* JADX INFO: renamed from: l */
    private int f177123l = 2;

    /* JADX INFO: renamed from: m */
    protected final int f177124m = f177110r.getAndIncrement();

    /* JADX INFO: renamed from: p */
    private long f177127p = 0;

    /* JADX INFO: renamed from: q */
    protected long f177128q = 0;

    /* JADX INFO: renamed from: l.u1r0$a */
    public static class C20459a {

        /* JADX INFO: renamed from: a */
        private z1r0 f177129a;

        /* JADX INFO: renamed from: b */
        private d2r0 f177130b;

        public C20459a(z1r0 z1r0Var, d2r0 d2r0Var) {
            this.f177129a = z1r0Var;
            this.f177130b = d2r0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m194111a(w0r0 w0r0Var) {
            this.f177129a.mo87535a(w0r0Var);
        }

        /* JADX INFO: renamed from: b */
        public void m194112b(g2r0 g2r0Var) {
            d2r0 d2r0Var = this.f177130b;
            if (d2r0Var == null || d2r0Var.mo87539a(g2r0Var)) {
                this.f177129a.mo87534a(g2r0Var);
            }
        }
    }

    static {
        f177111s = false;
        try {
            f177111s = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        a2r0.m95728c();
    }

    public u1r0(XMPushService xMPushService, v1r0 v1r0Var) {
        this.f177125n = v1r0Var;
        this.f177126o = xMPushService;
        m194107u();
    }

    /* JADX INFO: renamed from: d */
    private String m194089d(int i) {
        if (i == 1) {
            return "connected";
        }
        if (i == 0) {
            return "connecting";
        }
        return i == 2 ? "disconnected" : "unknown";
    }

    /* JADX INFO: renamed from: g */
    private void m194090g(int i) {
        synchronized (this.f177116e) {
            LinkedList<Pair<Integer, Long>> linkedList = this.f177116e;
            try {
                if (i == 1) {
                    linkedList.clear();
                } else {
                    linkedList.add(new Pair<>(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                    if (this.f177116e.size() > 6) {
                        this.f177116e.remove(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo102223A(boolean z);

    /* JADX INFO: renamed from: B */
    public boolean m194091B() {
        return this.f177123l == 0;
    }

    /* JADX INFO: renamed from: C */
    public synchronized void m194092C() {
        this.f177127p = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: D */
    public boolean m194093D() {
        return this.f177123l == 1;
    }

    /* JADX INFO: renamed from: E */
    public void m194094E() {
        synchronized (this.f177116e) {
            this.f177116e.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m194095a() {
        return this.f177112a;
    }

    /* JADX INFO: renamed from: b */
    public long m194096b() {
        return this.f177115d;
    }

    /* JADX INFO: renamed from: c */
    public String mo102237c() {
        return this.f177125n.m199059c();
    }

    /* JADX INFO: renamed from: e */
    public Map<z1r0, C20459a> m194097e() {
        return this.f177118g;
    }

    /* JADX INFO: renamed from: f */
    public v1r0 m194098f() {
        return this.f177125n;
    }

    /* JADX INFO: renamed from: h */
    public void m194099h(int i, int i2, Exception exc) {
        int i3 = this.f177123l;
        if (i != i3) {
            ouq0.m169393m(String.format("update the connection status. %1$s -> %2$s : %3$s ", m194089d(i3), m194089d(i), AbstractC14991an.m87707a(i2)));
        }
        if (mtq0.m160044t(this.f177126o)) {
            m194090g(i);
        }
        if (i == 1) {
            this.f177126o.m87514a(10);
            if (this.f177123l != 0) {
                ouq0.m169393m("try set connected while not connecting.");
            }
            this.f177123l = i;
            Iterator<x1r0> it = this.f177117f.iterator();
            while (it.hasNext()) {
                it.next().mo86744b(this);
            }
            return;
        }
        if (i == 0) {
            if (this.f177123l != 2) {
                ouq0.m169393m("try set connecting while not disconnected.");
            }
            this.f177123l = i;
            Iterator<x1r0> it2 = this.f177117f.iterator();
            while (it2.hasNext()) {
                it2.next().mo86740a(this);
            }
            return;
        }
        if (i == 2) {
            this.f177126o.m87514a(10);
            int i4 = this.f177123l;
            if (i4 == 0) {
                Iterator<x1r0> it3 = this.f177117f.iterator();
                while (it3.hasNext()) {
                    it3.next().mo86742a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i4 == 1) {
                Iterator<x1r0> it4 = this.f177117f.iterator();
                while (it4.hasNext()) {
                    it4.next().mo86741a(this, i2, exc);
                }
            }
            this.f177123l = i;
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo113626i(C14990am.b bVar);

    /* JADX INFO: renamed from: j */
    public synchronized void m194100j(String str) {
        try {
            if (this.f177123l == 0) {
                ouq0.m169393m("setChallenge hash = ".concat(zuq0.m221701b(str).substring(0, 8)));
                this.f177121j = str;
                m194099h(1, 0, null);
            } else {
                ouq0.m169393m("ignore setChallenge because connection was disconnected");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo113627k(String str, String str2);

    /* JADX INFO: renamed from: l */
    public void m194101l(x1r0 x1r0Var) {
        if (x1r0Var == null || this.f177117f.contains(x1r0Var)) {
            return;
        }
        this.f177117f.add(x1r0Var);
    }

    /* JADX INFO: renamed from: m */
    public void m194102m(z1r0 z1r0Var) {
        this.f177118g.remove(z1r0Var);
    }

    /* JADX INFO: renamed from: n */
    public void m194103n(z1r0 z1r0Var, d2r0 d2r0Var) {
        if (z1r0Var == null) {
            mnd0.m159157a("Packet listener is null.");
        } else {
            this.f177118g.put(z1r0Var, new C20459a(z1r0Var, d2r0Var));
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo113628o(g2r0 g2r0Var);

    /* JADX INFO: renamed from: p */
    public abstract void mo113629p(w0r0[] w0r0VarArr);

    /* JADX INFO: renamed from: q */
    public boolean mo113630q() {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public synchronized boolean m194104r(long j) {
        return this.f177127p >= j;
    }

    /* JADX INFO: renamed from: s */
    public int m194105s() {
        return this.f177123l;
    }

    /* JADX INFO: renamed from: t */
    public String m194106t() {
        return this.f177125n.m199057b();
    }

    /* JADX INFO: renamed from: u */
    public void m194107u() {
        String property;
        if (this.f177125n.m199056a() && this.f177120i == null) {
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
                this.f177120i = new e1r0(this);
                return;
            }
            try {
                this.f177120i = (c2r0) cls.getConstructor(u1r0.class, Writer.class, Reader.class).newInstance(this);
            } catch (Exception e2) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e2);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo102238v(int i, Exception exc);

    /* JADX INFO: renamed from: w */
    public abstract void mo113631w(w0r0 w0r0Var);

    /* JADX INFO: renamed from: x */
    public void m194108x(x1r0 x1r0Var) {
        this.f177117f.remove(x1r0Var);
    }

    /* JADX INFO: renamed from: y */
    public void m194109y(z1r0 z1r0Var) {
        this.f177119h.remove(z1r0Var);
    }

    /* JADX INFO: renamed from: z */
    public void m194110z(z1r0 z1r0Var, d2r0 d2r0Var) {
        if (z1r0Var == null) {
            mnd0.m159157a("Packet listener is null.");
        } else {
            this.f177119h.put(z1r0Var, new C20459a(z1r0Var, d2r0Var));
        }
    }
}
