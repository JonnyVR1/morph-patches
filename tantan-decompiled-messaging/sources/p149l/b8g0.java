package p149l;

import Sudchar.Sudfor;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b8g0 implements Runnable {

    /* JADX INFO: renamed from: q */
    public static final ThreadPoolExecutor f74110q = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), new nfg0("OkDownload Cancel Block"));

    /* JADX INFO: renamed from: a */
    public final int f74111a;

    /* JADX INFO: renamed from: b */
    public final slg0 f74112b;

    /* JADX INFO: renamed from: c */
    public final tfg0 f74113c;

    /* JADX INFO: renamed from: d */
    public final apg0 f74114d;

    /* JADX INFO: renamed from: i */
    public long f74119i;

    /* JADX INFO: renamed from: j */
    public volatile jmg0 f74120j;

    /* JADX INFO: renamed from: k */
    public long f74121k;

    /* JADX INFO: renamed from: l */
    public volatile Thread f74122l;

    /* JADX INFO: renamed from: n */
    public final w8g0 f74124n;

    /* JADX INFO: renamed from: e */
    public final ArrayList f74115e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f74116f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f74117g = 0;

    /* JADX INFO: renamed from: h */
    public int f74118h = 0;

    /* JADX INFO: renamed from: o */
    public final AtomicBoolean f74125o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: p */
    public final i7g0 f74126p = new i7g0(this);

    /* JADX INFO: renamed from: m */
    public final vrg0 f74123m = bog0.m102944a().f76516b;

    public b8g0(int i, slg0 slg0Var, tfg0 tfg0Var, apg0 apg0Var, w8g0 w8g0Var) {
        this.f74111a = i;
        this.f74112b = slg0Var;
        this.f74114d = apg0Var;
        this.f74113c = tfg0Var;
        this.f74124n = w8g0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized ujg0 m100771a() {
        try {
            if (this.f74114d.m98119c()) {
                throw Sudfor.f210105Suddo;
            }
            if (this.f74120j == null) {
                String str = this.f74114d.f71037a;
                if (str == null) {
                    str = this.f74113c.f169976b;
                }
                this.f74120j = bog0.m102944a().f76518d.m130828a(str);
                this.f74120j.m142183b(this.f74112b.f165212x);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f74120j;
    }

    /* JADX INFO: renamed from: b */
    public final long m100772b() throws Sudfor {
        if (this.f74114d.m98119c()) {
            throw Sudfor.f210105Suddo;
        }
        ArrayList arrayList = this.f74116f;
        int i = this.f74118h;
        this.f74118h = i + 1;
        return ((rlg0) arrayList.get(i)).mo97895a(this);
    }

    /* JADX INFO: renamed from: c */
    public final ncg0 m100773c() {
        if (this.f74114d.m98119c()) {
            throw Sudfor.f210105Suddo;
        }
        ArrayList arrayList = this.f74115e;
        int i = this.f74117g;
        this.f74117g = i + 1;
        return ((ofg0) arrayList.get(i)).mo97896b(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m100774d() throws IOException {
        vrg0 vrg0Var = bog0.m102944a().f76516b;
        aog0 aog0Var = new aog0();
        mbg0 mbg0Var = new mbg0();
        this.f74115e.add(aog0Var);
        this.f74115e.add(mbg0Var);
        this.f74115e.add(new fjg0());
        this.f74115e.add(new ubg0());
        this.f74117g = 0;
        ncg0 ncg0VarM100773c = m100773c();
        if (this.f74114d.m98119c()) {
            throw Sudfor.f210105Suddo;
        }
        gqg0 gqg0Var = vrg0Var.f182721a;
        slg0 slg0Var = this.f74112b;
        int i = this.f74111a;
        long j = this.f74119i;
        gqg0Var.getClass();
        int i2 = slg0Var.f165190b;
        if (slg0Var.f165202n) {
            gqg0Var.f103937a.post(new hhg0(slg0Var, i, j));
        } else {
            slg0Var.f165204p.getClass();
        }
        int i3 = this.f74111a;
        exc0 exc0Var = ((jmg0) ncg0VarM100773c).f118635d;
        if (exc0Var == null) {
            rhg0.m179353a("Please invoke execute first!");
            return;
        }
        gxc0 gxc0VarM118606k = exc0Var.m118606k();
        if (gxc0VarM118606k == null) {
            rhg0.m179353a("no body found on response!");
            return;
        }
        xig0 xig0Var = new xig0(i3, gxc0VarM118606k.byteStream(), this.f74114d.m98117a(), this.f74112b);
        this.f74116f.add(aog0Var);
        this.f74116f.add(mbg0Var);
        this.f74116f.add(xig0Var);
        this.f74118h = 0;
        long jM100772b = m100772b();
        gqg0 gqg0Var2 = vrg0Var.f182721a;
        slg0 slg0Var2 = this.f74112b;
        int i4 = this.f74111a;
        gqg0Var2.getClass();
        int i5 = slg0Var2.f165190b;
        if (slg0Var2.f165202n) {
            gqg0Var2.f103937a.post(new iig0(slg0Var2, i4, jM100772b));
        } else {
            slg0Var2.f165204p.m140920e(slg0Var2, i4, jM100772b);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f74125o.get()) {
            throw new IllegalAccessError("The chain has been finished!");
        }
        this.f74122l = Thread.currentThread();
        try {
            m100774d();
        } catch (IOException unused) {
        } finally {
            this.f74125o.set(true);
            f74110q.execute(this.f74126p);
        }
    }
}
