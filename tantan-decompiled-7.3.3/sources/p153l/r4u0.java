package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class r4u0 implements xqy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f161243a;

    /* JADX INFO: renamed from: b */
    public final s26 f161244b;

    /* JADX INFO: renamed from: c */
    public final m1z0 f161245c;

    public r4u0(@NonNull Executor executor, @NonNull s26 s26Var, @NonNull m1z0 m1z0Var) {
        this.f161243a = executor;
        this.f161244b = s26Var;
        this.f161245c = m1z0Var;
    }

    @Override // p153l.xqy0
    /* JADX INFO: renamed from: a */
    public final void mo115836a(@NonNull Task task) {
        this.f161243a.execute(new f6t0(this, task));
    }
}
