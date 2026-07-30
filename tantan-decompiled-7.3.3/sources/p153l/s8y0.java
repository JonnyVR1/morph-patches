package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class s8y0 implements xqy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f166870a;

    /* JADX INFO: renamed from: b */
    public final Object f166871b = new Object();

    /* JADX INFO: renamed from: c */
    public fm50 f166872c;

    public s8y0(@NonNull Executor executor, @NonNull fm50 fm50Var) {
        this.f166870a = executor;
        this.f166872c = fm50Var;
    }

    @Override // p153l.xqy0
    /* JADX INFO: renamed from: a */
    public final void mo115836a(@NonNull Task task) {
        if (task.mo15431p() || task.mo15429n()) {
            return;
        }
        synchronized (this.f166871b) {
            try {
                if (this.f166872c == null) {
                    return;
                }
                this.f166870a.execute(new n3y0(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
