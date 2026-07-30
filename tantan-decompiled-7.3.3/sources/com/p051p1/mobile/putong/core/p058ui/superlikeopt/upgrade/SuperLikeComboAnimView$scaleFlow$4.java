package com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import p153l.bui;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"Ll/bui;", "", "", "cause", "<anonymous>", "(Ll/bui;Ljava/lang/Throwable;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
@DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$scaleFlow$4", m88263f = "SuperLikeComboAnimView.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
public final class SuperLikeComboAnimView$scaleFlow$4 extends SuspendLambda implements Function3<bui<? super Unit>, Throwable, Continuation<? super Unit>, Object> {
    int label;

    public SuperLikeComboAnimView$scaleFlow$4(Continuation<? super SuperLikeComboAnimView$scaleFlow$4> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(bui<? super Unit> buiVar, Throwable th, Continuation<? super Unit> continuation) {
        return new SuperLikeComboAnimView$scaleFlow$4(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label == 0) {
            ResultKt.m88128b(obj);
            return Unit.INSTANCE;
        }
        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
