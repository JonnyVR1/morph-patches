package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class t9q0 implements zei0 {

    /* JADX INFO: renamed from: a */
    public final pie0 f169048a;

    /* JADX INFO: renamed from: b */
    public final CoroutineDispatcher f169049b;

    /* JADX INFO: renamed from: c */
    public final Handler f169050c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final Executor f169051d = new ExecutorC20132a();

    /* JADX INFO: renamed from: l.t9q0$a */
    public class ExecutorC20132a implements Executor {
        public ExecutorC20132a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            t9q0.this.f169050c.post(runnable);
        }
    }

    public t9q0(@NonNull Executor executor) {
        pie0 pie0Var = new pie0(executor);
        this.f169048a = pie0Var;
        this.f169049b = z5f.m217297b(pie0Var);
    }

    @Override // p149l.zei0
    @NonNull
    /* JADX INFO: renamed from: a */
    public CoroutineDispatcher mo187636a() {
        return this.f169049b;
    }

    @Override // p149l.zei0
    @NonNull
    /* JADX INFO: renamed from: c */
    public Executor mo187637c() {
        return this.f169051d;
    }

    @Override // p149l.zei0
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public pie0 mo187638d() {
        return this.f169048a;
    }
}
