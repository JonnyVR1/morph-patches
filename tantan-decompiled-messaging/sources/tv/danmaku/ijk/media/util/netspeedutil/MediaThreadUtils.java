package tv.danmaku.ijk.media.util.netspeedutil;

import androidx.annotation.NonNull;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p149l.bx00;
import p149l.tkw;

/* JADX INFO: loaded from: classes3.dex */
public class MediaThreadUtils {

    /* JADX INFO: renamed from: a */
    static bx00 f208924a;

    public static class MmlRejectedExecutionHandler implements RejectedExecutionHandler {
        private MmlRejectedExecutionHandler() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    public static class MmlThreadFactory implements ThreadFactory {

        /* JADX INFO: renamed from: b */
        private static int f208925b;

        /* JADX INFO: renamed from: a */
        String f208926a;

        public MmlThreadFactory(String str) {
            this.f208926a = str;
        }

        /* JADX INFO: renamed from: a */
        private static synchronized int m222875a() {
            int i;
            i = f208925b;
            f208925b = i + 1;
            return i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return tkw.m189539a(this.f208926a + "-" + m222875a(), runnable);
        }
    }

    static {
        bx00 bx00Var = new bx00("live-media-normal", 2, 2, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new MmlThreadFactory("live-media-normal"), new MmlRejectedExecutionHandler());
        f208924a = bx00Var;
        bx00Var.allowCoreThreadTimeOut(true);
    }
}
