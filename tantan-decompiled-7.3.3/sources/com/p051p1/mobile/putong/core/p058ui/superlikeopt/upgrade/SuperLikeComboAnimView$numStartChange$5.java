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
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"Ll/bui;", "", "", "cause", "", "<anonymous>", "(Ll/bui;Ljava/lang/Throwable;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
@DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$numStartChange$5", m88263f = "SuperLikeComboAnimView.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
public final class SuperLikeComboAnimView$numStartChange$5 extends SuspendLambda implements Function3<bui<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
    int label;

    public SuperLikeComboAnimView$numStartChange$5(Continuation<? super SuperLikeComboAnimView$numStartChange$5> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(bui<? super Integer> buiVar, Throwable th, Continuation<? super Unit> continuation) {
        return new SuperLikeComboAnimView$numStartChange$5(continuation).invokeSuspend(Unit.INSTANCE);
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
