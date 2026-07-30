package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class kyx0 implements xqy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f129369a;

    /* JADX INFO: renamed from: b */
    public final Object f129370b = new Object();

    /* JADX INFO: renamed from: c */
    public OnCompleteListener f129371c;

    public kyx0(@NonNull Executor executor, @NonNull OnCompleteListener onCompleteListener) {
        this.f129369a = executor;
        this.f129371c = onCompleteListener;
    }

    @Override // p153l.xqy0
    /* JADX INFO: renamed from: a */
    public final void mo115836a(@NonNull Task task) {
        synchronized (this.f129370b) {
            try {
                if (this.f129371c == null) {
                    return;
                }
                this.f129369a.execute(new ltx0(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
