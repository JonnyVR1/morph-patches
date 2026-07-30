package com.clevertap.android.sdk.inbox;

import java.util.List;
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
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inbox.InboxDeleteCoordinator$syncDelete$1", m88263f = "InboxDeleteCoordinator.kt", m88264l = {50}, m88265m = "invokeSuspend")
final class InboxDeleteCoordinator$syncDelete$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<CTInboxMessage> $messages;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ InboxDeleteCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InboxDeleteCoordinator$syncDelete$1(InboxDeleteCoordinator inboxDeleteCoordinator, List<? extends CTInboxMessage> list, String str, Continuation<? super InboxDeleteCoordinator$syncDelete$1> continuation) {
        super(2, continuation);
        this.this$0 = inboxDeleteCoordinator;
        this.$messages = list;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InboxDeleteCoordinator$syncDelete$1(this.this$0, this.$messages, this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((InboxDeleteCoordinator$syncDelete$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            InboxDeleteCoordinator inboxDeleteCoordinator = this.this$0;
            List<CTInboxMessage> list = this.$messages;
            String str = this.$userId;
            this.label = 1;
            if (inboxDeleteCoordinator.m6778f(list, str, this) == objM198688e) {
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
