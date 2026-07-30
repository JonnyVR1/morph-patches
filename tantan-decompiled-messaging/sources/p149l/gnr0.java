package p149l;

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
public final class gnr0 {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f103615a;

    /* JADX INFO: renamed from: b */
    public final Set f103616b;

    /* JADX INFO: renamed from: c */
    public final PriorityBlockingQueue f103617c;

    /* JADX INFO: renamed from: d */
    public final PriorityBlockingQueue f103618d;

    /* JADX INFO: renamed from: e */
    public final fmr0 f103619e;

    /* JADX INFO: renamed from: f */
    public final nmr0 f103620f;

    /* JADX INFO: renamed from: g */
    public final omr0[] f103621g;

    /* JADX INFO: renamed from: h */
    public hmr0 f103622h;

    /* JADX INFO: renamed from: i */
    public final List f103623i;

    /* JADX INFO: renamed from: j */
    public final List f103624j;

    /* JADX INFO: renamed from: k */
    public final lmr0 f103625k;

    public gnr0(fmr0 fmr0Var, nmr0 nmr0Var, int i) {
        lmr0 lmr0Var = new lmr0(new Handler(Looper.getMainLooper()));
        this.f103615a = new AtomicInteger();
        this.f103616b = new HashSet();
        this.f103617c = new PriorityBlockingQueue();
        this.f103618d = new PriorityBlockingQueue();
        this.f103623i = new ArrayList();
        this.f103624j = new ArrayList();
        this.f103619e = fmr0Var;
        this.f103620f = nmr0Var;
        this.f103621g = new omr0[4];
        this.f103625k = lmr0Var;
    }

    /* JADX INFO: renamed from: a */
    public final dnr0 m127181a(dnr0 dnr0Var) {
        dnr0Var.m112660h(this);
        synchronized (this.f103616b) {
            this.f103616b.add(dnr0Var);
        }
        dnr0Var.m112661i(this.f103615a.incrementAndGet());
        dnr0Var.m112666q("add-to-queue");
        m127183c(dnr0Var, 0);
        this.f103617c.add(dnr0Var);
        return dnr0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m127182b(dnr0 dnr0Var) {
        synchronized (this.f103616b) {
            this.f103616b.remove(dnr0Var);
        }
        synchronized (this.f103623i) {
            try {
                Iterator it = this.f103623i.iterator();
                while (it.hasNext()) {
                    ((fnr0) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m127183c(dnr0Var, 5);
    }

    /* JADX INFO: renamed from: c */
    public final void m127183c(dnr0 dnr0Var, int i) {
        synchronized (this.f103624j) {
            try {
                Iterator it = this.f103624j.iterator();
                while (it.hasNext()) {
                    ((enr0) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m127184d() {
        hmr0 hmr0Var = this.f103622h;
        if (hmr0Var != null) {
            hmr0Var.m131755b();
        }
        omr0[] omr0VarArr = this.f103621g;
        for (int i = 0; i < 4; i++) {
            omr0 omr0Var = omr0VarArr[i];
            if (omr0Var != null) {
                omr0Var.m165149a();
            }
        }
        hmr0 hmr0Var2 = new hmr0(this.f103617c, this.f103618d, this.f103619e, this.f103625k);
        this.f103622h = hmr0Var2;
        hmr0Var2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            omr0 omr0Var2 = new omr0(this.f103618d, this.f103620f, this.f103619e, this.f103625k);
            this.f103621g[i2] = omr0Var2;
            omr0Var2.start();
        }
    }
}
