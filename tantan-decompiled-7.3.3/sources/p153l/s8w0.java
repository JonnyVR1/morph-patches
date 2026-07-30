package p153l;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes6.dex */
public final class s8w0 {

    /* JADX INFO: renamed from: a */
    public final Deque f166865a = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: b */
    public final Callable f166866b;

    /* JADX INFO: renamed from: c */
    public final xvw0 f166867c;

    public s8w0(Callable callable, xvw0 xvw0Var) {
        this.f166866b = callable;
        this.f166867c = xvw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized hpr m185112a() {
        m185114c(1);
        return (hpr) this.f166865a.poll();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m185113b(hpr hprVar) {
        this.f166865a.addFirst(hprVar);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m185114c(int i) {
        int size = i - this.f166865a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f166865a.add(this.f166867c.mo155969R(this.f166866b));
        }
    }
}
