package com.immomo.mwc.sdk.utils.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p153l.m510;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\t\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m88121d2 = {"", "executorType", "Ljava/util/concurrent/ScheduledExecutorService;", "c", "(I)Ljava/util/concurrent/ScheduledExecutorService;", "a", "Lkotlin/Lazy;", "b", "()Ljava/util/concurrent/ScheduledExecutorService;", "ISOLATED_EXECUTOR", "mwc_release"}, m88122k = 2, m88123mv = {1, 4, 0})
public final class MThreadUtilsKt {

    /* JADX INFO: renamed from: a */
    private static final Lazy f14730a = LazyKt__LazyJVMKt.m88118b(new Function0<m510>() { // from class: com.immomo.mwc.sdk.utils.thread.MThreadUtilsKt$ISOLATED_EXECUTOR$2

        /* JADX INFO: renamed from: com.immomo.mwc.sdk.utils.thread.MThreadUtilsKt$ISOLATED_EXECUTOR$2$a */
        @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m88121d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Ljava/util/concurrent/ThreadPoolExecutor;", "rejectedExecution"}, m88122k = 3, m88123mv = {1, 1, 16})
        public static final class RejectedExecutionHandlerC4074a implements RejectedExecutionHandler {
            public static final RejectedExecutionHandlerC4074a INSTANCE = new RejectedExecutionHandlerC4074a();

            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final m510 invoke() {
            m510 m510Var = new m510("MMEIsolate", 0, 2, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4078a(), RejectedExecutionHandlerC4074a.INSTANCE);
            m510Var.allowCoreThreadTimeOut(true);
            return m510Var;
        }
    });

    /* JADX INFO: renamed from: b */
    private static final ScheduledExecutorService m20437b() {
        return (ScheduledExecutorService) f14730a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final ScheduledExecutorService m20438c(int i) {
        if (i == -1) {
            return m20437b();
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM20447a = C4079b.m20447a(i);
        scheduledThreadPoolExecutorM20447a.getClass();
        return scheduledThreadPoolExecutorM20447a;
    }
}
