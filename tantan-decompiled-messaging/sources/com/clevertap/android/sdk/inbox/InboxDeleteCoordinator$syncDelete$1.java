package com.clevertap.android.sdk.inbox;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "com.clevertap.android.sdk.inbox.InboxDeleteCoordinator$syncDelete$1", m87374f = "InboxDeleteCoordinator.kt", m87375l = {50}, m87376m = "invokeSuspend")
final class InboxDeleteCoordinator$syncDelete$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
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
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((InboxDeleteCoordinator$syncDelete$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            InboxDeleteCoordinator inboxDeleteCoordinator = this.this$0;
            List<CTInboxMessage> list = this.$messages;
            String str = this.$userId;
            this.label = 1;
            if (inboxDeleteCoordinator.m6724f(list, str, this) == objM196133e) {
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
