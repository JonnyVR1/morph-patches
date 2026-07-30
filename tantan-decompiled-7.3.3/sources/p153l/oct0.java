package p153l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.C2283u3;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class oct0 {

    /* JADX INFO: renamed from: a */
    public static final xvw0 f146733a;

    /* JADX INFO: renamed from: b */
    public static final xvw0 f146734b;

    /* JADX INFO: renamed from: c */
    public static final xvw0 f146735c;

    /* JADX INFO: renamed from: d */
    public static final ScheduledExecutorService f146736d;

    /* JADX INFO: renamed from: e */
    public static final xvw0 f146737e;

    /* JADX INFO: renamed from: f */
    public static final xvw0 f146738f;

    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorServiceMo176973b;
        ExecutorService executorServiceMo176972a;
        if (ClientLibraryUtils.isPackageSide()) {
            tkw0.m191601a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new kct0(LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default)));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Api.BaseClientBuilder.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new kct0(LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default));
        }
        mct0 mct0Var = null;
        f146733a = new nct0(threadPoolExecutor, mct0Var);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceMo176973b = tkw0.m191601a().mo176973b(5, new kct0("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new kct0("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executorServiceMo176973b = threadPoolExecutor2;
        }
        f146734b = new nct0(executorServiceMo176973b, mct0Var);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceMo176972a = tkw0.m191601a().mo176972a(new kct0("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new kct0("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceMo176972a = threadPoolExecutor3;
        }
        f146735c = new nct0(executorServiceMo176972a, mct0Var);
        f146736d = new jct0(3, new kct0("Schedule"));
        f146737e = new nct0(new lct0(), mct0Var);
        f146738f = new nct0(C2283u3.m13395b(), mct0Var);
    }
}
