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
import kotlin.p122io.CloseableKt;
import org.json.JSONObject;
import p153l.drb;
import p153l.dtm;
import p153l.j5d0;
import p153l.uyp;
import p153l.wtq0;
import p153l.y5f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/drb;", "Lcom/clevertap/android/sdk/network/fetch/a;", "Lorg/json/JSONObject;", "<anonymous>", "(Ll/drb;)Lcom/clevertap/android/sdk/network/fetch/a;"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "com.clevertap.android.sdk.network.fetch.InboxFetchCall$execute$2", m88263f = "InboxFetchCall.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class InboxFetchCall$execute$2 extends SuspendLambda implements Function2<drb, Continuation<? super AbstractC1321a<? extends JSONObject>>, Object> {
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
    public final Object invoke(drb drbVar, Continuation<? super AbstractC1321a<? extends JSONObject>> continuation) {
        return ((InboxFetchCall$execute$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        try {
            JSONObject jSONObjectM137579s = this.this$0.queueHeaderBuilder.m137579s(null);
            if (jSONObjectM137579s == null) {
                return new AbstractC1321a.b(new IOException("header build failed"));
            }
            JSONObject jSONObjectPut = new JSONObject().put(Constants.KEY_T, 7);
            jSONObjectPut.getClass();
            String strM214295a = new y5f(jSONObjectM137579s, dtm.m117883a(Constants.WZRK_FETCH, jSONObjectPut, this.this$0.coreMetaData, this.this$0.clock, this.this$0.packageName)).m214295a();
            this.this$0.logger.debug("InboxV2", "Send fetch (t=7): " + strM214295a);
            try {
                j5d0 j5d0VarM217705p = this.this$0.ctApi.m217705p(strM214295a);
                InboxFetchCall inboxFetchCall = this.this$0;
                try {
                    if (j5d0VarM217705p.getCode() == 200) {
                        String strM143520q = j5d0VarM217705p.m143520q();
                        if (strM143520q == null) {
                            cVar = new AbstractC1321a.b(new IOException("empty body"));
                        } else {
                            inboxFetchCall.logger.verbose("InboxV2", "fetch sent successfully (HTTP 200, " + strM143520q.length() + " bytes)");
                            cVar = new AbstractC1321a.c(new JSONObject(strM143520q));
                        }
                    } else {
                        inboxFetchCall.logger.info("InboxV2", "HTTP " + j5d0VarM217705p.getCode() + " — V2 inbox disabled for session");
                        cVar = AbstractC1321a.a.INSTANCE;
                    }
                    CloseableKt.m88293a(j5d0VarM217705p, null);
                    return cVar;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.m88293a(j5d0VarM217705p, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                this.this$0.logger.verbose("InboxV2", "fetch failed: " + e);
                return new AbstractC1321a.b(e);
            }
        } catch (Exception e2) {
            return new AbstractC1321a.b(e2);
        }
    }
}
