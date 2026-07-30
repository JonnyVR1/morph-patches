package p149l;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class oby0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f142992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bfy0 f142993b;

    public oby0(bfy0 bfy0Var, Task task) {
        this.f142993b = bfy0Var;
        this.f142992a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.f142993b.f75389b.then(this.f142992a.mo15373l());
            bfy0 bfy0Var = this.f142993b;
            if (taskThen == null) {
                bfy0Var.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = bfi0.f75321b;
            taskThen.mo15366e(executor, bfy0Var);
            taskThen.mo15364c(executor, this.f142993b);
            taskThen.mo15362a(executor, this.f142993b);
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            bfy0 bfy0Var2 = this.f142993b;
            if (z) {
                bfy0Var2.onFailure((Exception) e.getCause());
            } else {
                bfy0Var2.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f142993b.onCanceled();
        } catch (Exception e2) {
            this.f142993b.onFailure(e2);
        }
    }
}
