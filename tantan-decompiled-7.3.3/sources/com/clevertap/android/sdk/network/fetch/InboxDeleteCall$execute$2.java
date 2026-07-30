package com.clevertap.android.sdk.network.fetch;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.p122io.CloseableKt;
import org.json.JSONObject;
import p153l.drb;
import p153l.j5d0;
import p153l.uyp;
import p153l.wtq0;
import p153l.y5f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/drb;", "Lcom/clevertap/android/sdk/network/fetch/a;", "", "<anonymous>", "(Ll/drb;)Lcom/clevertap/android/sdk/network/fetch/a;"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "com.clevertap.android.sdk.network.fetch.InboxDeleteCall$execute$2", m88263f = "InboxDeleteCall.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class InboxDeleteCall$execute$2 extends SuspendLambda implements Function2<drb, Continuation<? super AbstractC1321a<? extends Unit>>, Object> {
    int label;
    final /* synthetic */ InboxDeleteCall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxDeleteCall$execute$2(InboxDeleteCall inboxDeleteCall, Continuation<? super InboxDeleteCall$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = inboxDeleteCall;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InboxDeleteCall$execute$2(this.this$0, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(drb drbVar, Continuation<? super AbstractC1321a<Unit>> continuation) {
        return ((InboxDeleteCall$execute$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object cVar;
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        if (this.this$0.messages.isEmpty()) {
            return new AbstractC1321a.c(Unit.INSTANCE);
        }
        try {
            JSONObject jSONObjectM137579s = this.this$0.queueHeaderBuilder.m137579s(null);
            if (jSONObjectM137579s == null) {
                return new AbstractC1321a.b(new IOException("header build failed"));
            }
            InboxDeleteCall inboxDeleteCall = this.this$0;
            String strM214295a = new y5f(jSONObjectM137579s, inboxDeleteCall.m6913g(inboxDeleteCall.messages)).m214295a();
            this.this$0.logger.debug("InboxV2", "Send delete (n=" + this.this$0.messages.size() + "): " + strM214295a);
            try {
                j5d0 j5d0VarM217704o = this.this$0.ctApi.m217704o(strM214295a);
                InboxDeleteCall inboxDeleteCall2 = this.this$0;
                try {
                    if (j5d0VarM217704o.getCode() == 200) {
                        inboxDeleteCall2.logger.verbose("InboxV2", "delete sent successfully (n=" + inboxDeleteCall2.messages.size() + ')');
                        cVar = new AbstractC1321a.c(Unit.INSTANCE);
                    } else {
                        inboxDeleteCall2.logger.info("InboxV2", "delete HTTP " + j5d0VarM217704o.getCode() + " — V2 inbox disabled for session");
                        cVar = AbstractC1321a.a.INSTANCE;
                    }
                    CloseableKt.m88293a(j5d0VarM217704o, null);
                    return cVar;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.m88293a(j5d0VarM217704o, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                this.this$0.logger.verbose("InboxV2", "delete failed: " + e);
                return new AbstractC1321a.b(e);
            }
        } catch (Exception e2) {
            return new AbstractC1321a.b(e2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(drb drbVar, Continuation<? super AbstractC1321a<? extends Unit>> continuation) {
        return invoke2(drbVar, (Continuation<? super AbstractC1321a<Unit>>) continuation);
    }
}
