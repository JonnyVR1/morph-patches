package p153l;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class b53 {
    private static final b53 INSTANCE = new b53();

    /* JADX INFO: renamed from: a */
    private final ExecutorService f75015a;

    /* JADX INFO: renamed from: b */
    private final ScheduledExecutorService f75016b;

    /* JADX INFO: renamed from: c */
    private final Executor f75017c;

    /* JADX INFO: renamed from: l.b53$b */
    public static class ExecutorC15930b implements Executor {

        /* JADX INFO: renamed from: a */
        private ThreadLocal<Integer> f75018a;

        private ExecutorC15930b() {
            this.f75018a = new ThreadLocal<>();
        }

        /* JADX INFO: renamed from: b */
        private int m102551b() {
            Integer num = this.f75018a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            ThreadLocal<Integer> threadLocal = this.f75018a;
            if (iIntValue == 0) {
                threadLocal.remove();
                return iIntValue;
            }
            threadLocal.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        /* JADX INFO: renamed from: c */
        private int m102552c() {
            Integer num = this.f75018a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f75018a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (m102552c() <= 15) {
                    runnable.run();
                } else {
                    b53.m102548a().execute(runnable);
                }
                m102551b();
            } catch (Throwable th) {
                m102551b();
                throw th;
            }
        }
    }

    private b53() {
        this.f75015a = !m102550c() ? Executors.newCachedThreadPool() : vn0.m201896b();
        this.f75016b = Executors.newSingleThreadScheduledExecutor();
        this.f75017c = new ExecutorC15930b();
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m102548a() {
        return INSTANCE.f75015a;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m102549b() {
        return INSTANCE.f75017c;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m102550c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
