package p153l;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class x1v0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f192100a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iyv0 f192101b;

    public x1v0(iyv0 iyv0Var, Task task) {
        this.f192101b = iyv0Var;
        this.f192100a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.f192101b.f117642b.then(this.f192100a);
            iyv0 iyv0Var = this.f192101b;
            if (task == null) {
                iyv0Var.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = boi0.f77687b;
            task.mo15420e(executor, iyv0Var);
            task.mo15418c(executor, this.f192101b);
            task.mo15416a(executor, this.f192101b);
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            iyv0 iyv0Var2 = this.f192101b;
            if (z) {
                iyv0Var2.f117643c.m156729s((Exception) e.getCause());
            } else {
                iyv0Var2.f117643c.m156729s(e);
            }
        } catch (Exception e2) {
            this.f192101b.f117643c.m156729s(e2);
        }
    }
}
