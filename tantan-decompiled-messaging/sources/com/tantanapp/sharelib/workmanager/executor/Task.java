package com.tantanapp.sharelib.workmanager.executor;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/executor/Task;", "Ljava/lang/Runnable;", "Lcom/tantanapp/sharelib/workmanager/executor/SerialExecutor;", "innerExecutor", "runnable", "<init>", "(Lcom/tantanapp/sharelib/workmanager/executor/SerialExecutor;Ljava/lang/Runnable;)V", "", "run", "()V", "a", "Lcom/tantanapp/sharelib/workmanager/executor/SerialExecutor;", "b", "Ljava/lang/Runnable;", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class Task implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SerialExecutor innerExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Runnable runnable;

    public Task(@NotNull SerialExecutor serialExecutor, @Nullable Runnable runnable) {
        serialExecutor.getClass();
        this.innerExecutor = serialExecutor;
        this.runnable = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Runnable runnable = this.runnable;
            if (runnable != null) {
                runnable.run();
            }
        } finally {
            this.innerExecutor.m81563c();
        }
    }
}
