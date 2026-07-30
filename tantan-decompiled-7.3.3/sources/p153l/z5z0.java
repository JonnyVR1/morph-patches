package p153l;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class z5z0 {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f203096a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public final void m218753a(Handler handler, a6z0 a6z0Var) {
        m218755c(a6z0Var);
        this.f203096a.add(new y5z0(handler, a6z0Var));
    }

    /* JADX INFO: renamed from: b */
    public final void m218754b(final int i, final long j, final long j2) {
        for (final y5z0 y5z0Var : this.f203096a) {
            if (!y5z0Var.f197610c) {
                y5z0Var.f197608a.post(new Runnable() { // from class: l.x5z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        y5z0Var.f197609b.mo96351p(i, j, j2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m218755c(a6z0 a6z0Var) {
        for (y5z0 y5z0Var : this.f203096a) {
            if (y5z0Var.f197609b == a6z0Var) {
                y5z0Var.m214342c();
                this.f203096a.remove(y5z0Var);
            }
        }
    }
}
