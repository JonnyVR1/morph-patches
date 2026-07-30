package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class x7y0 implements rhy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f191418a;

    /* JADX INFO: renamed from: b */
    public final Object f191419b = new Object();

    /* JADX INFO: renamed from: c */
    public ng50 f191420c;

    public x7y0(@NonNull Executor executor, @NonNull ng50 ng50Var) {
        this.f191418a = executor;
        this.f191420c = ng50Var;
    }

    @Override // p149l.rhy0
    /* JADX INFO: renamed from: a */
    public final void mo101617a(@NonNull Task task) {
        if (task.mo15377p()) {
            synchronized (this.f191419b) {
                try {
                    if (this.f191420c == null) {
                        return;
                    }
                    this.f191418a.execute(new m4y0(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
