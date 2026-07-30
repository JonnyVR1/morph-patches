package com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import p149l.fri;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"Ll/fri;", "", "", "cause", "<anonymous>", "(Ll/fri;Ljava/lang/Throwable;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
@DebugMetadata(m87373c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$scaleFlow$4", m87374f = "SuperLikeComboAnimView.kt", m87375l = {}, m87376m = "invokeSuspend", m87377v = 1)
public final class SuperLikeComboAnimView$scaleFlow$4 extends SuspendLambda implements Function3<fri<? super Unit>, Throwable, Continuation<? super Unit>, Object> {
    int label;

    public SuperLikeComboAnimView$scaleFlow$4(Continuation<? super SuperLikeComboAnimView$scaleFlow$4> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(fri<? super Unit> friVar, Throwable th, Continuation<? super Unit> continuation) {
        return new SuperLikeComboAnimView$scaleFlow$4(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        uwp.m196133e();
        if (this.label == 0) {
            ResultKt.m87239b(obj);
            return Unit.INSTANCE;
        }
        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
