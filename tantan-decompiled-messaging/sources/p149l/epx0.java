package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class epx0 implements rhy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f92723a;

    /* JADX INFO: renamed from: b */
    public final Object f92724b = new Object();

    /* JADX INFO: renamed from: c */
    public OnCompleteListener f92725c;

    public epx0(@NonNull Executor executor, @NonNull OnCompleteListener onCompleteListener) {
        this.f92723a = executor;
        this.f92725c = onCompleteListener;
    }

    @Override // p149l.rhy0
    /* JADX INFO: renamed from: a */
    public final void mo101617a(@NonNull Task task) {
        synchronized (this.f92724b) {
            try {
                if (this.f92725c == null) {
                    return;
                }
                this.f92723a.execute(new fkx0(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
