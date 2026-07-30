package com.immomo.mmutil.task;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p153l.c2e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"com/immomo/mmutil/task/Executors$ExecutorInfo", "", "", "executorName", "", "executorType", "<init>", "(Ljava/lang/String;I)V", "a", "Lkotlin/Lazy;", "getThreadExecutor", "()Ljava/lang/Object;", "threadExecutor", "b", "Ljava/lang/String;", "c", "I", "mm-util_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class Executors$ExecutorInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy threadExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String executorName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int executorType;

    public Executors$ExecutorInfo(@NotNull String str, int i) {
        str.getClass();
        this.executorName = str;
        this.executorType = i;
        this.threadExecutor = LazyKt__LazyJVMKt.m88118b(new Function0<c2e0>() { // from class: com.immomo.mmutil.task.Executors$ExecutorInfo$threadExecutor$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final c2e0 invoke() {
                return new c2e0(this.this$0.executorType);
            }
        });
    }
}
