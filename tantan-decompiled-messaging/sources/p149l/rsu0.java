package p149l;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class rsu0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f160898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cpv0 f160899b;

    public rsu0(cpv0 cpv0Var, Task task) {
        this.f160899b = cpv0Var;
        this.f160898a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.f160899b.f82000b.then(this.f160898a);
            cpv0 cpv0Var = this.f160899b;
            if (task == null) {
                cpv0Var.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = bfi0.f75321b;
            task.mo15366e(executor, cpv0Var);
            task.mo15364c(executor, this.f160899b);
            task.mo15362a(executor, this.f160899b);
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            cpv0 cpv0Var2 = this.f160899b;
            if (z) {
                cpv0Var2.f82001c.m127859s((Exception) e.getCause());
            } else {
                cpv0Var2.f82001c.m127859s(e);
            }
        } catch (Exception e2) {
            this.f160899b.f82001c.m127859s(e2);
        }
    }
}
