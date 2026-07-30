package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmName
public final class AFd1qSDK {
    @NotNull
    public static final ExecutorService getRevenue() {
        return new AFd1sSDK(0, 5, 60L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
    }
}
