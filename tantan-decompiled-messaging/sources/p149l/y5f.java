package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y5f {

    /* JADX INFO: renamed from: a */
    private static final Executor f196430a = new ExecutorC21310a();

    /* JADX INFO: renamed from: b */
    private static final Executor f196431b = new ExecutorC21311b();

    /* JADX INFO: renamed from: l.y5f$a */
    public class ExecutorC21310a implements Executor {

        /* JADX INFO: renamed from: a */
        private final Handler f196432a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f196432a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: l.y5f$b */
    public class ExecutorC21311b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m212983a() {
        return f196431b;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m212984b() {
        return f196430a;
    }
}
