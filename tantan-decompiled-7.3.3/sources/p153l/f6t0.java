package p153l;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class f6t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f97445a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r4u0 f97446b;

    public f6t0(r4u0 r4u0Var, Task task) {
        this.f97446b = r4u0Var;
        this.f97445a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zMo15429n = this.f97445a.mo15429n();
        r4u0 r4u0Var = this.f97446b;
        if (zMo15429n) {
            r4u0Var.f161245c.m156731u();
            return;
        }
        try {
            this.f97446b.f161245c.m156730t(r4u0Var.f161244b.then(this.f97445a));
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            r4u0 r4u0Var2 = this.f97446b;
            if (z) {
                r4u0Var2.f161245c.m156729s((Exception) e.getCause());
            } else {
                r4u0Var2.f161245c.m156729s(e);
            }
        } catch (Exception e2) {
            this.f97446b.f161245c.m156729s(e2);
        }
    }
}
