package p149l;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class hbu {

    /* JADX INFO: renamed from: l.hbu$a */
    public static class ThreadFactoryC17266a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public String f106961a;

        /* JADX INFO: renamed from: b */
        public int f106962b;

        public ThreadFactoryC17266a(@NotNull String str) {
            if (TextUtils.isEmpty(str)) {
                this.f106961a = "live_thread_default_name";
            } else {
                this.f106961a = str;
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f106961a);
            sb.append("-");
            int i = this.f106962b;
            this.f106962b = i + 1;
            sb.append(i);
            return new Thread(runnable, sb.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m130335a(@NotNull String str) {
        return Executors.newCachedThreadPool(new ThreadFactoryC17266a(str));
    }

    /* JADX INFO: renamed from: b */
    public static ExecutorService m130336b(@NotNull String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC17266a(str));
    }
}
