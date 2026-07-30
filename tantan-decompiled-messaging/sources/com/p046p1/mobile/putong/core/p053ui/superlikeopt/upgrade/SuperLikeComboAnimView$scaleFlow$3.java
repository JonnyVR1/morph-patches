package com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p149l.bt0;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m87232d2 = {"<anonymous>", "", Careers.f38732it}, m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$scaleFlow$3", m87374f = "SuperLikeComboAnimView.kt", m87375l = {}, m87376m = "invokeSuspend", m87377v = 1)
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
        Animator animatorM103753z;
        uwp.m196133e();
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        float scaleX = this.this$0.get_star_layout().getScaleX();
        float scaleY = this.this$0.get_star_layout().getScaleY();
        this.this$0.get_star_layout().setPivotY(this.this$0.get_star_layout().getHeight());
        this.this$0.get_star_layout().setPivotX(this.this$0.get_star_layout().getWidth() / 2.0f);
        this.this$0.get_superlike_layout().setPivotY(0.0f);
        this.this$0.get_superlike_layout().setPivotX(this.this$0.get_superlike_layout().getWidth() / 2.0f);
        boolean zM55824l = C8910a.INSTANCE.m55824l(this.this$0.getSuperLikeCount());
        SuperLikeComboAnimView superLikeComboAnimView = this.this$0;
        if (zM55824l) {
            animatorM103753z = bt0.m103753z(bt0.m103739l(superLikeComboAnimView.get_star_layout(), FrameLayout.SCALE_X, 0L, 300L, null, scaleX, 1.45f, 0.98f), bt0.m103739l(this.this$0.get_star_layout(), FrameLayout.SCALE_Y, 0L, 300L, null, scaleY, 1.45f, 0.98f));
            animatorM103753z.getClass();
        } else {
            animatorM103753z = bt0.m103753z(bt0.m103739l(superLikeComboAnimView.get_star_layout(), FrameLayout.SCALE_X, 0L, 300L, null, scaleX, 1.13f, 1.0f), bt0.m103739l(this.this$0.get_star_layout(), FrameLayout.SCALE_Y, 0L, 300L, null, scaleY, 1.13f, 1.0f));
            animatorM103753z.getClass();
        }
        bt0.m103753z(animatorM103753z, bt0.m103739l(this.this$0.get_superlike_layout(), FrameLayout.SCALE_X, 0L, 300L, null, 1.0f, 1.13f, 1.0f), bt0.m103739l(this.this$0.get_superlike_layout(), FrameLayout.SCALE_Y, 0L, 300L, null, 1.0f, 1.13f, 1.0f)).start();
        return Unit.INSTANCE;
    }
}
