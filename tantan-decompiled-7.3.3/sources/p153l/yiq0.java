package p153l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class yiq0 implements zni0 {

    /* JADX INFO: renamed from: a */
    public final uqe0 f200232a;

    /* JADX INFO: renamed from: b */
    public final CoroutineDispatcher f200233b;

    /* JADX INFO: renamed from: c */
    public final Handler f200234c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final Executor f200235d = new ExecutorC21611a();

    /* JADX INFO: renamed from: l.yiq0$a */
    public class ExecutorC21611a implements Executor {
        public ExecutorC21611a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            yiq0.this.f200234c.post(runnable);
        }
    }

    public yiq0(@NonNull Executor executor) {
        uqe0 uqe0Var = new uqe0(executor);
        this.f200232a = uqe0Var;
        this.f200233b = f7f.m124439b(uqe0Var);
    }

    @Override // p153l.zni0
    @NonNull
    /* JADX INFO: renamed from: a */
    public CoroutineDispatcher mo216344a() {
        return this.f200233b;
    }

    @Override // p153l.zni0
    @NonNull
    /* JADX INFO: renamed from: c */
    public Executor mo216345c() {
        return this.f200235d;
    }

    @Override // p153l.zni0
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public uqe0 mo216346d() {
        return this.f200232a;
    }
}
