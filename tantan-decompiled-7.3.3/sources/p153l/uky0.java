package p153l;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class uky0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f179465a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hoy0 f179466b;

    public uky0(hoy0 hoy0Var, Task task) {
        this.f179466b = hoy0Var;
        this.f179465a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.f179466b.f110968b.then(this.f179465a.mo15427l());
            hoy0 hoy0Var = this.f179466b;
            if (taskThen == null) {
                hoy0Var.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = boi0.f77687b;
            taskThen.mo15420e(executor, hoy0Var);
            taskThen.mo15418c(executor, this.f179466b);
            taskThen.mo15416a(executor, this.f179466b);
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            hoy0 hoy0Var2 = this.f179466b;
            if (z) {
                hoy0Var2.onFailure((Exception) e.getCause());
            } else {
                hoy0Var2.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f179466b.onCanceled();
        } catch (Exception e2) {
            this.f179466b.onFailure(e2);
        }
    }
}
