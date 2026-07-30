package com.clevertap.android.sdk.inapp;

import io.agora.rtc2.internal.RtcEngineEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p149l.ppb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "com.clevertap.android.sdk.inapp.InAppController$cancelAllScheduledInApps$1", m87374f = "InAppController.kt", m87375l = {RtcEngineEvent.EvtType.EVT_JOIN_PUBLISHER, RtcEngineEvent.EvtType.EVT_STOP_PUBLISHER}, m87376m = "invokeSuspend")
public final class InAppController$cancelAllScheduledInApps$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
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
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((InAppController$cancelAllScheduledInApps$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r5.m6329b(r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            kotlin.ResultKt.m87239b(r5)
            goto L4f
        L12:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r4)
            r4 = 0
            return r4
        L19:
            kotlin.ResultKt.m87239b(r5)
            goto L2f
        L1d:
            kotlin.ResultKt.m87239b(r5)
            com.clevertap.android.sdk.inapp.InAppController r5 = r4.this$0
            com.clevertap.android.sdk.inapp.delay.InAppScheduler r5 = com.clevertap.android.sdk.inapp.InAppController.m6247p(r5)
            r4.label = r3
            java.lang.Object r5 = r5.m6329b(r4)
            if (r5 != r0) goto L2f
            goto L4e
        L2f:
            com.clevertap.android.sdk.inapp.InAppController r5 = r4.this$0
            com.clevertap.android.sdk.Logger r5 = com.clevertap.android.sdk.inapp.InAppController.m6249r(r5)
            com.clevertap.android.sdk.inapp.InAppController r1 = r4.this$0
            java.lang.String r1 = com.clevertap.android.sdk.inapp.InAppController.m6246o(r1)
            java.lang.String r3 = "[InAppController]: Cancelled all delayed in-apps"
            r5.verbose(r1, r3)
            com.clevertap.android.sdk.inapp.InAppController r5 = r4.this$0
            com.clevertap.android.sdk.inapp.delay.InAppScheduler r5 = com.clevertap.android.sdk.inapp.InAppController.m6248q(r5)
            r4.label = r2
            java.lang.Object r5 = r5.m6329b(r4)
            if (r5 != r0) goto L4f
        L4e:
            return r0
        L4f:
            com.clevertap.android.sdk.inapp.InAppController r5 = r4.this$0
            com.clevertap.android.sdk.Logger r5 = com.clevertap.android.sdk.inapp.InAppController.m6249r(r5)
            com.clevertap.android.sdk.inapp.InAppController r4 = r4.this$0
            java.lang.String r4 = com.clevertap.android.sdk.inapp.InAppController.m6246o(r4)
            java.lang.String r0 = "[InAppController]: Cancelled all in-action in-apps"
            r5.verbose(r4, r0)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.inapp.InAppController$cancelAllScheduledInApps$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
