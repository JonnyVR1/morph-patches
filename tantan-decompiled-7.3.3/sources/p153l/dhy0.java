package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class dhy0 implements xqy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f88569a;

    /* JADX INFO: renamed from: b */
    public final Object f88570b = new Object();

    /* JADX INFO: renamed from: c */
    public to50 f88571c;

    public dhy0(@NonNull Executor executor, @NonNull to50 to50Var) {
        this.f88569a = executor;
        this.f88571c = to50Var;
    }

    @Override // p153l.xqy0
    /* JADX INFO: renamed from: a */
    public final void mo115836a(@NonNull Task task) {
        if (task.mo15431p()) {
            synchronized (this.f88570b) {
                try {
                    if (this.f88571c == null) {
                        return;
                    }
                    this.f88569a.execute(new sdy0(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
