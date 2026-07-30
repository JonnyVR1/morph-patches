package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class mix0 implements xqy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f137036a;

    /* JADX INFO: renamed from: b */
    public final Object f137037b = new Object();

    /* JADX INFO: renamed from: c */
    public ol50 f137038c;

    public mix0(@NonNull Executor executor, @NonNull ol50 ol50Var) {
        this.f137036a = executor;
        this.f137038c = ol50Var;
    }

    @Override // p153l.xqy0
    /* JADX INFO: renamed from: a */
    public final void mo115836a(@NonNull Task task) {
        if (task.mo15429n()) {
            synchronized (this.f137037b) {
                try {
                    if (this.f137038c == null) {
                        return;
                    }
                    this.f137036a.execute(new arw0(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
