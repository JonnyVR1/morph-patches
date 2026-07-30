package com.tantanapp.sharelib.workmanager;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m87232d2 = {"com/tantanapp/sharelib/workmanager/Configuration$Companion$createDefaultThreadFactory$1", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "mThreadCount", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class Configuration$Companion$createDefaultThreadFactory$1 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger mThreadCount;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f56212b;

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@NotNull Runnable runnable) {
        runnable.getClass();
        return new Thread(runnable, (this.f56212b ? "WM.task-" : "androidx.work-") + this.mThreadCount.incrementAndGet());
    }
}
