package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
@Module
abstract class ExecutionModule {
    @Provides
    @SuppressLint({"ThreadPoolCreation"})
    public static Executor executor() {
        return new SafeLoggingExecutor(Executors.newSingleThreadExecutor());
    }
}
