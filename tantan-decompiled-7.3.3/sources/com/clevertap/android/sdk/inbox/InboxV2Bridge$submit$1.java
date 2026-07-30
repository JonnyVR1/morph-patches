package com.clevertap.android.sdk.inbox;

import com.clevertap.android.sdk.network.fetch.AbstractC1321a;
import com.clevertap.android.sdk.network.fetch.FetchTrigger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p153l.drb;
import p153l.uhi;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inbox.InboxV2Bridge$submit$1", m88263f = "InboxV2Bridge.kt", m88264l = {31}, m88265m = "invokeSuspend")
public final class InboxV2Bridge$submit$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ uhi $callback;
    final /* synthetic */ FetchTrigger $trigger;
    int label;
    final /* synthetic */ InboxV2Bridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxV2Bridge$submit$1(InboxV2Bridge inboxV2Bridge, FetchTrigger fetchTrigger, uhi uhiVar, Continuation<? super InboxV2Bridge$submit$1> continuation) {
        super(2, continuation);
        this.this$0 = inboxV2Bridge;
        this.$trigger = fetchTrigger;
        this.$callback = uhiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InboxV2Bridge$submit$1(this.this$0, this.$trigger, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((InboxV2Bridge$submit$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            InboxV2Fetcher inboxV2Fetcher = this.this$0.fetcher;
            FetchTrigger fetchTrigger = this.$trigger;
            this.label = 1;
            obj = inboxV2Fetcher.m6785a(fetchTrigger, this);
            if (obj == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        AbstractC1321a abstractC1321a = (AbstractC1321a) obj;
        uhi uhiVar = this.$callback;
        if (uhiVar != null) {
            uhiVar.mo142368a(abstractC1321a instanceof AbstractC1321a.c);
        }
        return Unit.INSTANCE;
    }
}
