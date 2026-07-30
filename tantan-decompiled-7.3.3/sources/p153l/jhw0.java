package p153l;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class jhw0 {

    /* JADX INFO: renamed from: a */
    public final BlockingQueue f121016a;

    /* JADX INFO: renamed from: b */
    public final ThreadPoolExecutor f121017b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f121018c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public ihw0 f121019d = null;

    public jhw0() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f121016a = linkedBlockingQueue;
        this.f121017b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* JADX INFO: renamed from: a */
    public final void m144938a(ihw0 ihw0Var) {
        this.f121019d = null;
        m144940c();
    }

    /* JADX INFO: renamed from: b */
    public final void m144939b(ihw0 ihw0Var) {
        ihw0Var.m140042b(this);
        this.f121018c.add(ihw0Var);
        if (this.f121019d == null) {
            m144940c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m144940c() {
        ihw0 ihw0Var = (ihw0) this.f121018c.poll();
        this.f121019d = ihw0Var;
        if (ihw0Var != null) {
            ihw0Var.executeOnExecutor(this.f121017b, new Object[0]);
        }
    }
}
