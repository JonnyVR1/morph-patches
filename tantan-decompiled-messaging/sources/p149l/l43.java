package p149l;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class l43 {
    private static final l43 INSTANCE = new l43();

    /* JADX INFO: renamed from: a */
    private final ExecutorService f125963a;

    /* JADX INFO: renamed from: b */
    private final ScheduledExecutorService f125964b;

    /* JADX INFO: renamed from: c */
    private final Executor f125965c;

    /* JADX INFO: renamed from: l.l43$b */
    public static class ExecutorC18147b implements Executor {

        /* JADX INFO: renamed from: a */
        private ThreadLocal<Integer> f125966a;

        private ExecutorC18147b() {
            this.f125966a = new ThreadLocal<>();
        }

        /* JADX INFO: renamed from: b */
        private int m148423b() {
            Integer num = this.f125966a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            ThreadLocal<Integer> threadLocal = this.f125966a;
            if (iIntValue == 0) {
                threadLocal.remove();
                return iIntValue;
            }
            threadLocal.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        /* JADX INFO: renamed from: c */
        private int m148424c() {
            Integer num = this.f125966a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f125966a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (m148424c() <= 15) {
                    runnable.run();
                } else {
                    l43.m148420a().execute(runnable);
                }
                m148423b();
            } catch (Throwable th) {
                m148423b();
                throw th;
            }
        }
    }

    private l43() {
        this.f125963a = !m148422c() ? Executors.newCachedThreadPool() : zn0.m219390b();
        this.f125964b = Executors.newSingleThreadScheduledExecutor();
        this.f125965c = new ExecutorC18147b();
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m148420a() {
        return INSTANCE.f125963a;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m148421b() {
        return INSTANCE.f125965c;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m148422c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
