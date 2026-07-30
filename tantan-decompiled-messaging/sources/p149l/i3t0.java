package p149l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.C2260u3;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class i3t0 {

    /* JADX INFO: renamed from: a */
    public static final rmw0 f111372a;

    /* JADX INFO: renamed from: b */
    public static final rmw0 f111373b;

    /* JADX INFO: renamed from: c */
    public static final rmw0 f111374c;

    /* JADX INFO: renamed from: d */
    public static final ScheduledExecutorService f111375d;

    /* JADX INFO: renamed from: e */
    public static final rmw0 f111376e;

    /* JADX INFO: renamed from: f */
    public static final rmw0 f111377f;

    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorServiceMo145327b;
        ExecutorService executorServiceMo145326a;
        if (ClientLibraryUtils.isPackageSide()) {
            nbw0.m158842a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new e3t0(LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default)));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Api.BaseClientBuilder.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new e3t0(LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default));
        }
        g3t0 g3t0Var = null;
        f111372a = new h3t0(threadPoolExecutor, g3t0Var);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceMo145327b = nbw0.m158842a().mo145327b(5, new e3t0("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e3t0("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executorServiceMo145327b = threadPoolExecutor2;
        }
        f111373b = new h3t0(executorServiceMo145327b, g3t0Var);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceMo145326a = nbw0.m158842a().mo145326a(new e3t0("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e3t0("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceMo145326a = threadPoolExecutor3;
        }
        f111374c = new h3t0(executorServiceMo145326a, g3t0Var);
        f111375d = new d3t0(3, new e3t0("Schedule"));
        f111376e = new h3t0(new f3t0(), g3t0Var);
        f111377f = new h3t0(C2260u3.m13341b(), g3t0Var);
    }
}
