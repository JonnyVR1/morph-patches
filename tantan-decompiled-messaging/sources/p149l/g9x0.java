package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class g9x0 implements rhy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f101608a;

    /* JADX INFO: renamed from: b */
    public final Object f101609b = new Object();

    /* JADX INFO: renamed from: c */
    public hd50 f101610c;

    public g9x0(@NonNull Executor executor, @NonNull hd50 hd50Var) {
        this.f101608a = executor;
        this.f101610c = hd50Var;
    }

    @Override // p149l.rhy0
    /* JADX INFO: renamed from: a */
    public final void mo101617a(@NonNull Task task) {
        if (task.mo15375n()) {
            synchronized (this.f101609b) {
                try {
                    if (this.f101610c == null) {
                        return;
                    }
                    this.f101608a.execute(new uhw0(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
