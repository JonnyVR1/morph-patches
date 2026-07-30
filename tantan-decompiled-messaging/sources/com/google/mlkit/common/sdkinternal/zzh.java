package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
enum zzh implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        C3363a.m16874a().f11500a.post(runnable);
    }
}
