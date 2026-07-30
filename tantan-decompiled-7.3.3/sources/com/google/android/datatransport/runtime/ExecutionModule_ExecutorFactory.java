package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    public static final class InstanceHolder {
        private static final ExecutionModule_ExecutorFactory INSTANCE = new ExecutionModule_ExecutorFactory();

        private InstanceHolder() {
        }
    }

    public static ExecutionModule_ExecutorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Executor executor() {
        return (Executor) Preconditions.checkNotNullFromProvides(ExecutionModule.executor());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public Executor get() {
        return executor();
    }
}
