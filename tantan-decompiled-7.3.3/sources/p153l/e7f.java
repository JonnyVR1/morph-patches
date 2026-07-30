package p153l;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e7f {

    /* JADX INFO: renamed from: a */
    private static final Executor f92425a = new ExecutorC16725a();

    /* JADX INFO: renamed from: b */
    private static final Executor f92426b = new ExecutorC16726b();

    /* JADX INFO: renamed from: l.e7f$a */
    public class ExecutorC16725a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            ylk0.m216598v(runnable);
        }
    }

    /* JADX INFO: renamed from: l.e7f$b */
    public class ExecutorC16726b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m119706a() {
        return f92426b;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m119707b() {
        return f92425a;
    }
}
