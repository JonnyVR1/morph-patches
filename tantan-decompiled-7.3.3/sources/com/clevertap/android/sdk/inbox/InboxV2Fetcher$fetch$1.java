package com.clevertap.android.sdk.inbox;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inbox.InboxV2Fetcher", m88263f = "InboxV2Fetcher.kt", m88264l = {63}, m88265m = RemoteConfigComponent.FETCH_FILE_NAME)
public final class InboxV2Fetcher$fetch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InboxV2Fetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxV2Fetcher$fetch$1(InboxV2Fetcher inboxV2Fetcher, Continuation<? super InboxV2Fetcher$fetch$1> continuation) {
        super(continuation);
        this.this$0 = inboxV2Fetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m6785a(null, this);
    }
}
