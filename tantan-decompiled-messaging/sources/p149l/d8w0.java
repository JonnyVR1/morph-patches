package p149l;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class d8w0 {

    /* JADX INFO: renamed from: a */
    public final BlockingQueue f84907a;

    /* JADX INFO: renamed from: b */
    public final ThreadPoolExecutor f84908b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f84909c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public c8w0 f84910d = null;

    public d8w0() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f84907a = linkedBlockingQueue;
        this.f84908b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* JADX INFO: renamed from: a */
    public final void m110394a(c8w0 c8w0Var) {
        this.f84910d = null;
        m110396c();
    }

    /* JADX INFO: renamed from: b */
    public final void m110395b(c8w0 c8w0Var) {
        c8w0Var.m105824b(this);
        this.f84909c.add(c8w0Var);
        if (this.f84910d == null) {
            m110396c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m110396c() {
        c8w0 c8w0Var = (c8w0) this.f84909c.poll();
        this.f84910d = c8w0Var;
        if (c8w0Var != null) {
            c8w0Var.executeOnExecutor(this.f84908b, new Object[0]);
        }
    }
}
