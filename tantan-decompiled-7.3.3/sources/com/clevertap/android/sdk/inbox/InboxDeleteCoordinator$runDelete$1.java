package com.clevertap.android.sdk.inbox;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inbox.InboxDeleteCoordinator", m88263f = "InboxDeleteCoordinator.kt", m88264l = {EACTags.TRACK1_APPLICATION}, m88265m = "runDelete")
public final class InboxDeleteCoordinator$runDelete$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InboxDeleteCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxDeleteCoordinator$runDelete$1(InboxDeleteCoordinator inboxDeleteCoordinator, Continuation<? super InboxDeleteCoordinator$runDelete$1> continuation) {
        super(continuation);
        this.this$0 = inboxDeleteCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m6778f(null, null, this);
    }
}
