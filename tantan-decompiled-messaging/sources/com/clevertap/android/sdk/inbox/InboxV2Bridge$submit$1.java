package com.clevertap.android.sdk.inbox;

import com.clevertap.android.sdk.network.fetch.AbstractC1298a;
import com.clevertap.android.sdk.network.fetch.FetchTrigger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;
import p149l.yei;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "com.clevertap.android.sdk.inbox.InboxV2Bridge$submit$1", m87374f = "InboxV2Bridge.kt", m87375l = {31}, m87376m = "invokeSuspend")
public final class InboxV2Bridge$submit$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ yei $callback;
    final /* synthetic */ FetchTrigger $trigger;
    int label;
    final /* synthetic */ InboxV2Bridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxV2Bridge$submit$1(InboxV2Bridge inboxV2Bridge, FetchTrigger fetchTrigger, yei yeiVar, Continuation<? super InboxV2Bridge$submit$1> continuation) {
        super(2, continuation);
        this.this$0 = inboxV2Bridge;
        this.$trigger = fetchTrigger;
        this.$callback = yeiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InboxV2Bridge$submit$1(this.this$0, this.$trigger, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((InboxV2Bridge$submit$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            InboxV2Fetcher inboxV2Fetcher = this.this$0.fetcher;
            FetchTrigger fetchTrigger = this.$trigger;
            this.label = 1;
            obj = inboxV2Fetcher.m6731a(fetchTrigger, this);
            if (obj == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        AbstractC1298a abstractC1298a = (AbstractC1298a) obj;
        yei yeiVar = this.$callback;
        if (yeiVar != null) {
            yeiVar.mo143396a(abstractC1298a instanceof AbstractC1298a.c);
        }
        return Unit.INSTANCE;
    }
}
