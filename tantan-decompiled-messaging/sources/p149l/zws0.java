package p149l;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class zws0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f205259a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lvt0 f205260b;

    public zws0(lvt0 lvt0Var, Task task) {
        this.f205260b = lvt0Var;
        this.f205259a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zMo15375n = this.f205259a.mo15375n();
        lvt0 lvt0Var = this.f205260b;
        if (zMo15375n) {
            lvt0Var.f130197c.m127861u();
            return;
        }
        try {
            this.f205260b.f130197c.m127860t(lvt0Var.f130196b.then(this.f205259a));
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            lvt0 lvt0Var2 = this.f205260b;
            if (z) {
                lvt0Var2.f130197c.m127859s((Exception) e.getCause());
            } else {
                lvt0Var2.f130197c.m127859s(e);
            }
        } catch (Exception e2) {
            this.f205260b.f130197c.m127859s(e2);
        }
    }
}
