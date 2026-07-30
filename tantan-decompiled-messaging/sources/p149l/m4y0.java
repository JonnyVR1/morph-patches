package p149l;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class m4y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f131344a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x7y0 f131345b;

    public m4y0(x7y0 x7y0Var, Task task) {
        this.f131345b = x7y0Var;
        this.f131344a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f131345b.f191419b) {
            try {
                x7y0 x7y0Var = this.f131345b;
                if (x7y0Var.f191420c != null) {
                    x7y0Var.f191420c.onSuccess(this.f131344a.mo15373l());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
