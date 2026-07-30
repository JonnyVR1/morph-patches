package com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, ""}, m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$numStartChange$4", m88263f = "SuperLikeComboAnimView.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
public final class SuperLikeComboAnimView$numStartChange$4 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needShadow;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$numStartChange$4(SuperLikeComboAnimView superLikeComboAnimView, boolean z, Continuation<? super SuperLikeComboAnimView$numStartChange$4> continuation) {
        super(2, continuation);
        this.this$0 = superLikeComboAnimView;
        this.$needShadow = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuperLikeComboAnimView$numStartChange$4(this.this$0, this.$needShadow, continuation);
    }

    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((SuperLikeComboAnimView$numStartChange$4) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        this.this$0.m56965l();
        this.this$0.m56968o(this.$needShadow);
        this.this$0.m56966m();
        this.this$0.m56969p();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }
}
