package p153l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class n3y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f140047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s8y0 f140048b;

    public n3y0(s8y0 s8y0Var, Task task) {
        this.f140048b = s8y0Var;
        this.f140047a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f140048b.f166871b) {
            try {
                s8y0 s8y0Var = this.f140048b;
                if (s8y0Var.f166872c != null) {
                    s8y0Var.f166872c.onFailure((Exception) Preconditions.checkNotNull(this.f140047a.mo15426k()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
