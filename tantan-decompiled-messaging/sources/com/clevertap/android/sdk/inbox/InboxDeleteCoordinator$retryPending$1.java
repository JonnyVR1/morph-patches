package com.clevertap.android.sdk.inbox;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import p149l.oi60;
import p149l.ppb;
import p149l.qkq0;
import p149l.tzb;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "com.clevertap.android.sdk.inbox.InboxDeleteCoordinator$retryPending$1", m87374f = "InboxDeleteCoordinator.kt", m87375l = {71}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class InboxDeleteCoordinator$retryPending$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ InboxDeleteCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxDeleteCoordinator$retryPending$1(InboxDeleteCoordinator inboxDeleteCoordinator, String str, Continuation<? super InboxDeleteCoordinator$retryPending$1> continuation) {
        super(2, continuation);
        this.this$0 = inboxDeleteCoordinator;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InboxDeleteCoordinator$retryPending$1(this.this$0, this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((InboxDeleteCoordinator$retryPending$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            ((tzb) this.this$0.dbAdapterProvider.invoke()).m191160K(this.$userId, this.this$0.clock.mo158533c());
            List<oi60> listM191153A = ((tzb) this.this$0.dbAdapterProvider.invoke()).m191153A(this.$userId);
            if (listM191153A.isEmpty()) {
                return Unit.INSTANCE;
            }
            this.this$0.logger.verbose("InboxV2", "retryPending: " + listM191153A.size() + " pending delete row(s) for user");
            List<oi60> list = listM191153A;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (oi60 oi60Var : list) {
                JSONObject jSONObjectPut = new JSONObject().put("id", oi60Var.getMessageId());
                JSONObject jSONObject = oi60Var.getCom.clevertap.android.sdk.Constants.KEY_WZRK_PARAMS java.lang.String();
                if (jSONObject != null) {
                    jSONObjectPut.put(Constants.KEY_WZRK_PARAMS, jSONObject);
                }
                arrayList.add(new CTInboxMessage(jSONObjectPut));
            }
            InboxDeleteCoordinator inboxDeleteCoordinator = this.this$0;
            String str = this.$userId;
            this.label = 1;
            if (inboxDeleteCoordinator.m6724f(arrayList, str, this) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        return Unit.INSTANCE;
    }
}
