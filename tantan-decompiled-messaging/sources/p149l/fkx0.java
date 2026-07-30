package p149l;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class fkx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f98110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ epx0 f98111b;

    public fkx0(epx0 epx0Var, Task task) {
        this.f98111b = epx0Var;
        this.f98110a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f98111b.f92724b) {
            try {
                epx0 epx0Var = this.f98111b;
                if (epx0Var.f92725c != null) {
                    epx0Var.f92725c.onComplete(this.f98110a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
