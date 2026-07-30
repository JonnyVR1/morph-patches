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
import p153l.drb;
import p153l.h1c;
import p153l.tq60;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inbox.InboxDeleteCoordinator$retryPending$1", m88263f = "InboxDeleteCoordinator.kt", m88264l = {71}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class InboxDeleteCoordinator$retryPending$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
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
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((InboxDeleteCoordinator$retryPending$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            ((h1c) this.this$0.dbAdapterProvider.invoke()).m133292K(this.$userId, this.this$0.clock.mo166827c());
            List<tq60> listM133285A = ((h1c) this.this$0.dbAdapterProvider.invoke()).m133285A(this.$userId);
            if (listM133285A.isEmpty()) {
                return Unit.INSTANCE;
            }
            this.this$0.logger.verbose("InboxV2", "retryPending: " + listM133285A.size() + " pending delete row(s) for user");
            List<tq60> list = listM133285A;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (tq60 tq60Var : list) {
                JSONObject jSONObjectPut = new JSONObject().put("id", tq60Var.getMessageId());
                JSONObject jSONObject = tq60Var.getCom.clevertap.android.sdk.Constants.KEY_WZRK_PARAMS java.lang.String();
                if (jSONObject != null) {
                    jSONObjectPut.put(Constants.KEY_WZRK_PARAMS, jSONObject);
                }
                arrayList.add(new CTInboxMessage(jSONObjectPut));
            }
            InboxDeleteCoordinator inboxDeleteCoordinator = this.this$0;
            String str = this.$userId;
            this.label = 1;
            if (inboxDeleteCoordinator.m6778f(arrayList, str, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}
