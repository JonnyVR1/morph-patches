package tv.danmaku.ijk.media.util.netspeedutil;

import androidx.annotation.NonNull;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p153l.k510;
import p153l.snw;

/* JADX INFO: loaded from: classes3.dex */
public class MediaThreadUtils {

    /* JADX INFO: renamed from: a */
    static k510 f209846a;

    public static class MmlRejectedExecutionHandler implements RejectedExecutionHandler {
        private MmlRejectedExecutionHandler() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    public static class MmlThreadFactory implements ThreadFactory {

        /* JADX INFO: renamed from: b */
        private static int f209847b;

        /* JADX INFO: renamed from: a */
        String f209848a;

        public MmlThreadFactory(String str) {
            this.f209848a = str;
        }

        /* JADX INFO: renamed from: a */
        private static synchronized int m224121a() {
            int i;
            i = f209847b;
            f209847b = i + 1;
            return i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return snw.m187004a(this.f209848a + "-" + m224121a(), runnable);
        }
    }

    static {
        k510 k510Var = new k510("live-media-normal", 2, 2, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new MmlThreadFactory("live-media-normal"), new MmlRejectedExecutionHandler());
        f209846a = k510Var;
        k510Var.allowCoreThreadTimeOut(true);
    }
}
