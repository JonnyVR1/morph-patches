package com.immomo.mmutil.task;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.immomo.mmutil.task.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m88121d2 = {"Lcom/immomo/mmutil/task/a;", "Ljava/util/concurrent/ThreadFactory;", "<init>", "()V", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Companion", "a", "mm-util_release"}, m88122k = 1, m88123mv = {1, 4, 0})
final class ThreadFactoryC3947a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f13686a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@Nullable Runnable r) {
        C3948b c3948b = new C3948b(r, "MMIsolated #" + f13686a.getAndIncrement());
        c3948b.setPriority(10);
        return c3948b;
    }
}
