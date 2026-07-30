package com.google.android.gms.common.internal;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p153l.eix0;

/* JADX INFO: loaded from: classes6.dex */
final class zzj {
    static final ExecutorService zza;

    static {
        eix0.m120949a();
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory("CallbackExecutor");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), namedThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
