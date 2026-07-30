package p153l;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class idu {

    /* JADX INFO: renamed from: l.idu$a */
    public static class ThreadFactoryC17707a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public String f114522a;

        /* JADX INFO: renamed from: b */
        public int f114523b;

        public ThreadFactoryC17707a(@NotNull String str) {
            if (TextUtils.isEmpty(str)) {
                this.f114522a = "live_thread_default_name";
            } else {
                this.f114522a = str;
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f114522a);
            sb.append("-");
            int i = this.f114523b;
            this.f114523b = i + 1;
            sb.append(i);
            return new Thread(runnable, sb.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m139544a(@NotNull String str) {
        return Executors.newCachedThreadPool(new ThreadFactoryC17707a(str));
    }

    /* JADX INFO: renamed from: b */
    public static ExecutorService m139545b(@NotNull String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC17707a(str));
    }
}
