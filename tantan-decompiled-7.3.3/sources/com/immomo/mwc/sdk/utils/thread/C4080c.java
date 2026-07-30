package com.immomo.mwc.sdk.utils.thread;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.immomo.mwc.sdk.utils.thread.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/immomo/mwc/sdk/utils/thread/c;", "Ljava/lang/Thread;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runnable", "", "threadName", "<init>", "(Ljava/lang/Runnable;Ljava/lang/String;)V", "mwc_release"}, m88122k = 1, m88123mv = {1, 4, 0})
final class C4080c extends Thread {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4080c(@Nullable Runnable runnable, @NotNull String str) {
        super(runnable, str);
        str.getClass();
    }
}
