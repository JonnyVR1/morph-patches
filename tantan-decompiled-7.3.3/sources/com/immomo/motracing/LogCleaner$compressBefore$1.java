package com.immomo.motracing;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@"}, m88121d2 = {"compressBefore", "", "logPath", "", "storePrefix", "beforeTime", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m88122k = 3, m88123mv = {1, 1, 16})
@DebugMetadata(m88262c = "com.immomo.motracing.LogCleaner", m88263f = "LogCleaner.kt", m88264l = {134}, m88265m = "compressBefore")
public final class LogCleaner$compressBefore$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LogCleaner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogCleaner$compressBefore$1(LogCleaner logCleaner, Continuation continuation) {
        super(continuation);
        this.this$0 = logCleaner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m20330d(null, null, 0L, this);
    }
}
