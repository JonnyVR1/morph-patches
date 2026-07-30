package com.immomo.mmutil.task;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.immomo.mmutil.task.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m87232d2 = {"Lcom/immomo/mmutil/task/a;", "Ljava/util/concurrent/ThreadFactory;", "<init>", "()V", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Companion", "a", "mm-util_release"}, m87233k = 1, m87234mv = {1, 4, 0})
final class ThreadFactoryC3802a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f12992a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@Nullable Runnable r) {
        C3803b c3803b = new C3803b(r, "MMIsolated #" + f12992a.getAndIncrement());
        c3803b.setPriority(10);
        return c3803b;
    }
}
