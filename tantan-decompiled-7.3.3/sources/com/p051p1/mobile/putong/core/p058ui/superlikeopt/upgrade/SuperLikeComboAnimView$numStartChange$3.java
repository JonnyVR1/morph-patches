package com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, ""}, m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$numStartChange$3", m88263f = "SuperLikeComboAnimView.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
public final class SuperLikeComboAnimView$numStartChange$3 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$numStartChange$3(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$numStartChange$3> continuation) {
        super(2, continuation);
        this.this$0 = superLikeComboAnimView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SuperLikeComboAnimView$numStartChange$3 superLikeComboAnimView$numStartChange$3 = new SuperLikeComboAnimView$numStartChange$3(this.this$0, continuation);
        superLikeComboAnimView$numStartChange$3.I$0 = ((Number) obj).intValue();
        return superLikeComboAnimView$numStartChange$3;
    }

    public final Object invoke(int i, Continuation<? super Boolean> continuation) {
        return ((SuperLikeComboAnimView$numStartChange$3) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.I$0;
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        boolean z = true;
        if (this.this$0.getGuideCard() && i > 3) {
            z = false;
        }
        return Boxing.m88259a(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
        return invoke(num.intValue(), continuation);
    }
}
