package p153l;

import androidx.annotation.Nullable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class nyi0 {

    /* JADX INFO: renamed from: a */
    private static final ThreadPoolExecutor f144323a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 10L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(10), new ThreadPoolExecutor.DiscardPolicy());
        f144323a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m165328a(@Nullable Runnable runnable) {
        if (runnable != null) {
            f144323a.execute(runnable);
        } else {
            wg3.m206174a(riw.m181611a(new byte[]{83, 9, 92, 90, 0, 8, 84, 70, 88, 68, 65, 8, 69, 10, 93}));
        }
    }
}
