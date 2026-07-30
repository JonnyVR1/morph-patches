package p149l;

import androidx.annotation.Nullable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class kpi0 {

    /* JADX INFO: renamed from: a */
    private static final ThreadPoolExecutor f124164a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 10L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(10), new ThreadPoolExecutor.DiscardPolicy());
        f124164a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m146869a(@Nullable Runnable runnable) {
        if (runnable != null) {
            f124164a.execute(runnable);
        } else {
            ig3.m135964a(sgw.m184137a(new byte[]{83, 9, 92, 90, 0, 8, 84, 70, 88, 68, 65, 8, 69, 10, 93}));
        }
    }
}
