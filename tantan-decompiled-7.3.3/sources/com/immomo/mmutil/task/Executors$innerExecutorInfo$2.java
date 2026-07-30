package com.immomo.mmutil.task;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "Lcom/immomo/mmutil/task/Executors$ExecutorInfo;", "invoke"}, m88122k = 3, m88123mv = {1, 1, 16})
final class Executors$innerExecutorInfo$2 extends Lambda implements Function0<Executors$ExecutorInfo> {
    public static final Executors$innerExecutorInfo$2 INSTANCE = new Executors$innerExecutorInfo$2();

    public Executors$innerExecutorInfo$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Executors$ExecutorInfo invoke() {
        return new Executors$ExecutorInfo("TYPE_INNER", 1);
    }
}
