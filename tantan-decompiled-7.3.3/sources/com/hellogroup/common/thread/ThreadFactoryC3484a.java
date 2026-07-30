package com.hellogroup.common.thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.hellogroup.common.thread.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m88121d2 = {"Lcom/hellogroup/common/thread/a;", "Ljava/util/concurrent/ThreadFactory;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Companion", "a", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
final class ThreadFactoryC3484a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f11875a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@Nullable Runnable r) {
        C3485b c3485b = new C3485b(r, "MMIsolated #" + f11875a.getAndIncrement());
        c3485b.setPriority(10);
        return c3485b;
    }
}
