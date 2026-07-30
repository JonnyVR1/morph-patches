package p149l;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes6.dex */
public final class mzv0 {

    /* JADX INFO: renamed from: a */
    public final Deque f136442a = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: b */
    public final Callable f136443b;

    /* JADX INFO: renamed from: c */
    public final rmw0 f136444c;

    public mzv0(Callable callable, rmw0 rmw0Var) {
        this.f136443b = callable;
        this.f136444c = rmw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized gnr m157171a() {
        m157173c(1);
        return (gnr) this.f136442a.poll();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m157172b(gnr gnrVar) {
        this.f136442a.addFirst(gnrVar);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m157173c(int i) {
        int size = i - this.f136442a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f136442a.add(this.f136444c.mo122102R(this.f136443b));
        }
    }
}
