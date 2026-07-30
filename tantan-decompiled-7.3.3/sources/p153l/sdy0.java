package p153l;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class sdy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f167477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dhy0 f167478b;

    public sdy0(dhy0 dhy0Var, Task task) {
        this.f167478b = dhy0Var;
        this.f167477a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f167478b.f88570b) {
            try {
                dhy0 dhy0Var = this.f167478b;
                if (dhy0Var.f88571c != null) {
                    dhy0Var.f88571c.onSuccess(this.f167477a.mo15427l());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
