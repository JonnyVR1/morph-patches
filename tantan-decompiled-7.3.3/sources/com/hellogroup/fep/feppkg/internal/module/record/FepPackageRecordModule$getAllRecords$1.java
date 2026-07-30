package com.hellogroup.fep.feppkg.internal.module.record;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007"}, m88121d2 = {"Lkotlin/coroutines/Continuation;", "", "", "Ll/lhi;", "continuation", "", "getAllRecords", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.fep.feppkg.internal.module.record.FepPackageRecordModule", m88263f = "FepPackageRecordModule.kt", m88264l = {730}, m88265m = "getAllRecords")
public final class FepPackageRecordModule$getAllRecords$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FepPackageRecordModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepPackageRecordModule$getAllRecords$1(FepPackageRecordModule fepPackageRecordModule, Continuation continuation) {
        super(continuation);
        this.this$0 = fepPackageRecordModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m17728s(this);
    }
}
