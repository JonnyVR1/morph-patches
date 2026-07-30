package com.clevertap.android.sdk.network.fetch;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.p118io.CloseableKt;
import org.json.JSONObject;
import p149l.fxc0;
import p149l.ppb;
import p149l.qkq0;
import p149l.u4f;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Ll/ppb;", "Lcom/clevertap/android/sdk/network/fetch/a;", "", "<anonymous>", "(Ll/ppb;)Lcom/clevertap/android/sdk/network/fetch/a;"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "com.clevertap.android.sdk.network.fetch.InboxDeleteCall$execute$2", m87374f = "InboxDeleteCall.kt", m87375l = {}, m87376m = "invokeSuspend")
public final class InboxDeleteCall$execute$2 extends SuspendLambda implements Function2<ppb, Continuation<? super AbstractC1298a<? extends Unit>>, Object> {
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
    public final Object invoke2(ppb ppbVar, Continuation<? super AbstractC1298a<Unit>> continuation) {
        return ((InboxDeleteCall$execute$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object cVar;
        uwp.m196133e();
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        if (this.this$0.messages.isEmpty()) {
            return new AbstractC1298a.c(Unit.INSTANCE);
        }
        try {
            JSONObject jSONObjectM112886s = this.this$0.queueHeaderBuilder.m112886s(null);
            if (jSONObjectM112886s == null) {
                return new AbstractC1298a.b(new IOException("header build failed"));
            }
            InboxDeleteCall inboxDeleteCall = this.this$0;
            String strM191730a = new u4f(jSONObjectM112886s, inboxDeleteCall.m6859g(inboxDeleteCall.messages)).m191730a();
            this.this$0.logger.debug("InboxV2", "Send delete (n=" + this.this$0.messages.size() + "): " + strM191730a);
            try {
                fxc0 fxc0VarM147538o = this.this$0.ctApi.m147538o(strM191730a);
                InboxDeleteCall inboxDeleteCall2 = this.this$0;
                try {
                    if (fxc0VarM147538o.getCode() == 200) {
                        inboxDeleteCall2.logger.verbose("InboxV2", "delete sent successfully (n=" + inboxDeleteCall2.messages.size() + ')');
                        cVar = new AbstractC1298a.c(Unit.INSTANCE);
                    } else {
                        inboxDeleteCall2.logger.info("InboxV2", "delete HTTP " + fxc0VarM147538o.getCode() + " — V2 inbox disabled for session");
                        cVar = AbstractC1298a.a.INSTANCE;
                    }
                    CloseableKt.m87404a(fxc0VarM147538o, null);
                    return cVar;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.m87404a(fxc0VarM147538o, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                this.this$0.logger.verbose("InboxV2", "delete failed: " + e);
                return new AbstractC1298a.b(e);
            }
        } catch (Exception e2) {
            return new AbstractC1298a.b(e2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ppb ppbVar, Continuation<? super AbstractC1298a<? extends Unit>> continuation) {
        return invoke2(ppbVar, (Continuation<? super AbstractC1298a<Unit>>) continuation);
    }
}
