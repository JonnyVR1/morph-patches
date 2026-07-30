package com.google.android.gms.internal.mlkit_common;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
enum zzau implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
