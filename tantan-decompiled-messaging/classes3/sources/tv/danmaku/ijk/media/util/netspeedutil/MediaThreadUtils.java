package tv.danmaku.ijk.media.util.netspeedutil;

import androidx.annotation.NonNull;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.bx00;
import l.tkw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MediaThreadUtils {

    /* JADX INFO: renamed from: a */
    static bx00 f12549a;

    public static class MmlRejectedExecutionHandler implements RejectedExecutionHandler {
        private MmlRejectedExecutionHandler() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    public static class MmlThreadFactory implements ThreadFactory {

        /* JADX INFO: renamed from: b */
        private static int f12550b;

        /* JADX INFO: renamed from: a */
        String f12551a;

        public MmlThreadFactory(String str) {
            this.f12551a = str;
        }

        /* JADX INFO: renamed from: a */
        private static synchronized int m11346a() {
            int i;
            i = f12550b;
            f12550b = i + 1;
            return i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return tkw.a(this.f12551a + "-" + m11346a(), runnable);
        }
    }

    static {
        bx00 bx00Var = new bx00("live-media-normal", 2, 2, 30000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new MmlThreadFactory("live-media-normal"), new MmlRejectedExecutionHandler());
        f12549a = bx00Var;
        bx00Var.allowCoreThreadTimeOut(true);
    }
}
