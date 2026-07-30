package p149l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class hux0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f109598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mzx0 f109599b;

    public hux0(mzx0 mzx0Var, Task task) {
        this.f109599b = mzx0Var;
        this.f109598a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f109599b.f136450b) {
            try {
                mzx0 mzx0Var = this.f109599b;
                if (mzx0Var.f136451c != null) {
                    mzx0Var.f136451c.onFailure((Exception) Preconditions.checkNotNull(this.f109598a.mo15372k()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
