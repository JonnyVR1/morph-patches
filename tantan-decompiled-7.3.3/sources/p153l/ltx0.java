package p153l;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class ltx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f133582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kyx0 f133583b;

    public ltx0(kyx0 kyx0Var, Task task) {
        this.f133583b = kyx0Var;
        this.f133582a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f133583b.f129370b) {
            try {
                kyx0 kyx0Var = this.f133583b;
                if (kyx0Var.f129371c != null) {
                    kyx0Var.f129371c.onComplete(this.f133582a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
