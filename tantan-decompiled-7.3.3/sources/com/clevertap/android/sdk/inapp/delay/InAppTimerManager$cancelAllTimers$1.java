package com.clevertap.android.sdk.inapp.delay;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inapp.delay.InAppTimerManager", m88263f = "InAppTimerManager.kt", m88264l = {140}, m88265m = "cancelAllTimers")
public final class InAppTimerManager$cancelAllTimers$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppTimerManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppTimerManager$cancelAllTimers$1(InAppTimerManager inAppTimerManager, Continuation<? super InAppTimerManager$cancelAllTimers$1> continuation) {
        super(continuation);
        this.this$0 = inAppTimerManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m6396j(this);
    }
}
