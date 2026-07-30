package com.hellogroup.fep.config.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@"}, m88121d2 = {"waitForDataLoaded", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m88122k = 3, m88123mv = {1, 1, 16})
@DebugMetadata(m88262c = "com.hellogroup.fep.config.core.FepConfigManager", m88263f = "FepConfigManager.kt", m88264l = {110}, m88265m = "waitForDataLoaded")
public final class FepConfigManager$waitForDataLoaded$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FepConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepConfigManager$waitForDataLoaded$1(FepConfigManager fepConfigManager, Continuation continuation) {
        super(continuation);
        this.this$0 = fepConfigManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m17632t(this);
    }
}
