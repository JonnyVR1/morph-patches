package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.inapp.delay.InAppScheduler;
import io.agora.rtc2.internal.RtcEngineEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inapp.InAppController$cancelAllScheduledInApps$1", m88263f = "InAppController.kt", m88264l = {RtcEngineEvent.EvtType.EVT_JOIN_PUBLISHER, RtcEngineEvent.EvtType.EVT_STOP_PUBLISHER}, m88265m = "invokeSuspend")
public final class InAppController$cancelAllScheduledInApps$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InAppController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppController$cancelAllScheduledInApps$1(InAppController inAppController, Continuation<? super InAppController$cancelAllScheduledInApps$1> continuation) {
        super(2, continuation);
        this.this$0 = inAppController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InAppController$cancelAllScheduledInApps$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((InAppController$cancelAllScheduledInApps$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r5.m6383b(r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            InAppScheduler inAppScheduler = this.this$0.inAppDelayManager;
            this.label = 1;
            if (inAppScheduler.m6383b(this) != objM198688e) {
            }
            return objM198688e;
        }
        if (i == 1) {
            ResultKt.m88128b(obj);
        } else {
            if (i != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        this.this$0.logger.verbose(this.this$0.defaultLogTag, "[InAppController]: Cancelled all in-action in-apps");
        return Unit.INSTANCE;
        this.this$0.logger.verbose(this.this$0.defaultLogTag, "[InAppController]: Cancelled all delayed in-apps");
        InAppScheduler inAppScheduler2 = this.this$0.inAppInActionManager;
        this.label = 2;
    }
}
