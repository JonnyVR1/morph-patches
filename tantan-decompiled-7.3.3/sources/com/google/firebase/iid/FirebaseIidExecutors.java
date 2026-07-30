package com.google.firebase.iid;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
class FirebaseIidExecutors {
    private static final Executor DIRECT_EXECUTOR = FirebaseIidExecutors$$Lambda$0.$instance;

    public static Executor directExecutor() {
        return DIRECT_EXECUTOR;
    }

    public static ExecutorService newCachedSingleThreadExecutor() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    }
}
