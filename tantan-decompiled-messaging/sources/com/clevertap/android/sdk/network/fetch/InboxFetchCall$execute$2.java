package com.clevertap.android.sdk.network.fetch;

import com.clevertap.android.sdk.Constants;
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
import p149l.brm;
import p149l.fxc0;
import p149l.ppb;
import p149l.qkq0;
import p149l.u4f;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Ll/ppb;", "Lcom/clevertap/android/sdk/network/fetch/a;", "Lorg/json/JSONObject;", "<anonymous>", "(Ll/ppb;)Lcom/clevertap/android/sdk/network/fetch/a;"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "com.clevertap.android.sdk.network.fetch.InboxFetchCall$execute$2", m87374f = "InboxFetchCall.kt", m87375l = {}, m87376m = "invokeSuspend")
public final class InboxFetchCall$execute$2 extends SuspendLambda implements Function2<ppb, Continuation<? super AbstractC1298a<? extends JSONObject>>, Object> {
    int label;
    final /* synthetic */ InboxFetchCall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxFetchCall$execute$2(InboxFetchCall inboxFetchCall, Continuation<? super InboxFetchCall$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = inboxFetchCall;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InboxFetchCall$execute$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super AbstractC1298a<? extends JSONObject>> continuation) {
        return ((InboxFetchCall$execute$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        try {
            JSONObject jSONObjectM112886s = this.this$0.queueHeaderBuilder.m112886s(null);
            if (jSONObjectM112886s == null) {
                return new AbstractC1298a.b(new IOException("header build failed"));
            }
            JSONObject jSONObjectPut = new JSONObject().put(Constants.KEY_T, 7);
            jSONObjectPut.getClass();
            String strM191730a = new u4f(jSONObjectM112886s, brm.m103557a(Constants.WZRK_FETCH, jSONObjectPut, this.this$0.coreMetaData, this.this$0.clock, this.this$0.packageName)).m191730a();
            this.this$0.logger.debug("InboxV2", "Send fetch (t=7): " + strM191730a);
            try {
                fxc0 fxc0VarM147539p = this.this$0.ctApi.m147539p(strM191730a);
                InboxFetchCall inboxFetchCall = this.this$0;
                try {
                    if (fxc0VarM147539p.getCode() == 200) {
                        String strM123627q = fxc0VarM147539p.m123627q();
                        if (strM123627q == null) {
                            cVar = new AbstractC1298a.b(new IOException("empty body"));
                        } else {
                            inboxFetchCall.logger.verbose("InboxV2", "fetch sent successfully (HTTP 200, " + strM123627q.length() + " bytes)");
                            cVar = new AbstractC1298a.c(new JSONObject(strM123627q));
                        }
                    } else {
                        inboxFetchCall.logger.info("InboxV2", "HTTP " + fxc0VarM147539p.getCode() + " — V2 inbox disabled for session");
                        cVar = AbstractC1298a.a.INSTANCE;
                    }
                    CloseableKt.m87404a(fxc0VarM147539p, null);
                    return cVar;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.m87404a(fxc0VarM147539p, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                this.this$0.logger.verbose("InboxV2", "fetch failed: " + e);
                return new AbstractC1298a.b(e);
            }
        } catch (Exception e2) {
            return new AbstractC1298a.b(e2);
        }
    }
}
