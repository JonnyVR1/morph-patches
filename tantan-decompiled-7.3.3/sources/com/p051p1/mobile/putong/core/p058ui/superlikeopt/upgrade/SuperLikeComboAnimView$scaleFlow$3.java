package com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p153l.gt0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m88121d2 = {"<anonymous>", "", Careers.f39580it}, m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$scaleFlow$3", m88263f = "SuperLikeComboAnimView.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
public final class SuperLikeComboAnimView$scaleFlow$3 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$scaleFlow$3(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$scaleFlow$3> continuation) {
        super(2, continuation);
        this.this$0 = superLikeComboAnimView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuperLikeComboAnimView$scaleFlow$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((SuperLikeComboAnimView$scaleFlow$3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Animator animatorM132180z;
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        float scaleX = this.this$0.get_star_layout().getScaleX();
        float scaleY = this.this$0.get_star_layout().getScaleY();
        this.this$0.get_star_layout().setPivotY(this.this$0.get_star_layout().getHeight());
        this.this$0.get_star_layout().setPivotX(this.this$0.get_star_layout().getWidth() / 2.0f);
        this.this$0.get_superlike_layout().setPivotY(0.0f);
        this.this$0.get_superlike_layout().setPivotX(this.this$0.get_superlike_layout().getWidth() / 2.0f);
        boolean zM57007l = C9073a.INSTANCE.m57007l(this.this$0.getSuperLikeCount());
        SuperLikeComboAnimView superLikeComboAnimView = this.this$0;
        if (zM57007l) {
            animatorM132180z = gt0.m132180z(gt0.m132166l(superLikeComboAnimView.get_star_layout(), FrameLayout.SCALE_X, 0L, 300L, null, scaleX, 1.45f, 0.98f), gt0.m132166l(this.this$0.get_star_layout(), FrameLayout.SCALE_Y, 0L, 300L, null, scaleY, 1.45f, 0.98f));
            animatorM132180z.getClass();
        } else {
            animatorM132180z = gt0.m132180z(gt0.m132166l(superLikeComboAnimView.get_star_layout(), FrameLayout.SCALE_X, 0L, 300L, null, scaleX, 1.13f, 1.0f), gt0.m132166l(this.this$0.get_star_layout(), FrameLayout.SCALE_Y, 0L, 300L, null, scaleY, 1.13f, 1.0f));
            animatorM132180z.getClass();
        }
        gt0.m132180z(animatorM132180z, gt0.m132166l(this.this$0.get_superlike_layout(), FrameLayout.SCALE_X, 0L, 300L, null, 1.0f, 1.13f, 1.0f), gt0.m132166l(this.this$0.get_superlike_layout(), FrameLayout.SCALE_Y, 0L, 300L, null, 1.0f, 1.13f, 1.0f)).start();
        return Unit.INSTANCE;
    }
}
