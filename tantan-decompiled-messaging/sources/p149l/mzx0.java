package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class mzx0 implements rhy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f136449a;

    /* JADX INFO: renamed from: b */
    public final Object f136450b = new Object();

    /* JADX INFO: renamed from: c */
    public yd50 f136451c;

    public mzx0(@NonNull Executor executor, @NonNull yd50 yd50Var) {
        this.f136449a = executor;
        this.f136451c = yd50Var;
    }

    @Override // p149l.rhy0
    /* JADX INFO: renamed from: a */
    public final void mo101617a(@NonNull Task task) {
        if (task.mo15377p() || task.mo15375n()) {
            return;
        }
        synchronized (this.f136450b) {
            try {
                if (this.f136451c == null) {
                    return;
                }
                this.f136449a.execute(new hux0(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
