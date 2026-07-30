package p153l;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class mwr0 {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f139143a;

    /* JADX INFO: renamed from: b */
    public final Set f139144b;

    /* JADX INFO: renamed from: c */
    public final PriorityBlockingQueue f139145c;

    /* JADX INFO: renamed from: d */
    public final PriorityBlockingQueue f139146d;

    /* JADX INFO: renamed from: e */
    public final lvr0 f139147e;

    /* JADX INFO: renamed from: f */
    public final tvr0 f139148f;

    /* JADX INFO: renamed from: g */
    public final uvr0[] f139149g;

    /* JADX INFO: renamed from: h */
    public nvr0 f139150h;

    /* JADX INFO: renamed from: i */
    public final List f139151i;

    /* JADX INFO: renamed from: j */
    public final List f139152j;

    /* JADX INFO: renamed from: k */
    public final rvr0 f139153k;

    public mwr0(lvr0 lvr0Var, tvr0 tvr0Var, int i) {
        rvr0 rvr0Var = new rvr0(new Handler(Looper.getMainLooper()));
        this.f139143a = new AtomicInteger();
        this.f139144b = new HashSet();
        this.f139145c = new PriorityBlockingQueue();
        this.f139146d = new PriorityBlockingQueue();
        this.f139151i = new ArrayList();
        this.f139152j = new ArrayList();
        this.f139147e = lvr0Var;
        this.f139148f = tvr0Var;
        this.f139149g = new uvr0[4];
        this.f139153k = rvr0Var;
    }

    /* JADX INFO: renamed from: a */
    public final jwr0 m160591a(jwr0 jwr0Var) {
        jwr0Var.m147198h(this);
        synchronized (this.f139144b) {
            this.f139144b.add(jwr0Var);
        }
        jwr0Var.m147199i(this.f139143a.incrementAndGet());
        jwr0Var.m147204q("add-to-queue");
        m160593c(jwr0Var, 0);
        this.f139145c.add(jwr0Var);
        return jwr0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m160592b(jwr0 jwr0Var) {
        synchronized (this.f139144b) {
            this.f139144b.remove(jwr0Var);
        }
        synchronized (this.f139151i) {
            try {
                Iterator it = this.f139151i.iterator();
                while (it.hasNext()) {
                    ((lwr0) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m160593c(jwr0Var, 5);
    }

    /* JADX INFO: renamed from: c */
    public final void m160593c(jwr0 jwr0Var, int i) {
        synchronized (this.f139152j) {
            try {
                Iterator it = this.f139152j.iterator();
                while (it.hasNext()) {
                    ((kwr0) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m160594d() {
        nvr0 nvr0Var = this.f139150h;
        if (nvr0Var != null) {
            nvr0Var.m164926b();
        }
        uvr0[] uvr0VarArr = this.f139149g;
        for (int i = 0; i < 4; i++) {
            uvr0 uvr0Var = uvr0VarArr[i];
            if (uvr0Var != null) {
                uvr0Var.m198305a();
            }
        }
        nvr0 nvr0Var2 = new nvr0(this.f139145c, this.f139146d, this.f139147e, this.f139153k);
        this.f139150h = nvr0Var2;
        nvr0Var2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            uvr0 uvr0Var2 = new uvr0(this.f139146d, this.f139148f, this.f139147e, this.f139153k);
            this.f139149g[i2] = uvr0Var2;
            uvr0Var2.start();
        }
    }
}
