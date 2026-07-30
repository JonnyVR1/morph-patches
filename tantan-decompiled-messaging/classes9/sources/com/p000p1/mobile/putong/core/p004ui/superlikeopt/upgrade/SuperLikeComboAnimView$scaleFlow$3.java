package com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade;

import android.animation.Animator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import l.bt0;
import l.qkq0;
import l.uwp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$scaleFlow$3", f = "SuperLikeComboAnimView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class SuperLikeComboAnimView$scaleFlow$3 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$scaleFlow$3(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$scaleFlow$3> continuation) {
        super(2, continuation);
        this.this$0 = superLikeComboAnimView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuperLikeComboAnimView$scaleFlow$3(this.this$0, continuation);
    }

    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Animator animatorZ;
        uwp.e();
        if (this.label != 0) {
            qkq0.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.b(obj);
        float scaleX = this.this$0.get_star_layout().getScaleX();
        float scaleY = this.this$0.get_star_layout().getScaleY();
        this.this$0.get_star_layout().setPivotY(this.this$0.get_star_layout().getHeight());
        this.this$0.get_star_layout().setPivotX(this.this$0.get_star_layout().getWidth() / 2.0f);
        this.this$0.get_superlike_layout().setPivotY(0.0f);
        this.this$0.get_superlike_layout().setPivotX(this.this$0.get_superlike_layout().getWidth() / 2.0f);
        boolean zM9222l = C0346a.INSTANCE.m9222l(this.this$0.getSuperLikeCount());
        SuperLikeComboAnimView superLikeComboAnimView = this.this$0;
        if (zM9222l) {
            animatorZ = bt0.z(new Animator[]{bt0.l(superLikeComboAnimView.get_star_layout(), FrameLayout.SCALE_X, 0L, 300L, (Interpolator) null, new float[]{scaleX, 1.45f, 0.98f}), bt0.l(this.this$0.get_star_layout(), FrameLayout.SCALE_Y, 0L, 300L, (Interpolator) null, new float[]{scaleY, 1.45f, 0.98f})});
            animatorZ.getClass();
        } else {
            animatorZ = bt0.z(new Animator[]{bt0.l(superLikeComboAnimView.get_star_layout(), FrameLayout.SCALE_X, 0L, 300L, (Interpolator) null, new float[]{scaleX, 1.13f, 1.0f}), bt0.l(this.this$0.get_star_layout(), FrameLayout.SCALE_Y, 0L, 300L, (Interpolator) null, new float[]{scaleY, 1.13f, 1.0f})});
            animatorZ.getClass();
        }
        bt0.z(new Animator[]{animatorZ, bt0.l(this.this$0.get_superlike_layout(), FrameLayout.SCALE_X, 0L, 300L, (Interpolator) null, new float[]{1.0f, 1.13f, 1.0f}), bt0.l(this.this$0.get_superlike_layout(), FrameLayout.SCALE_Y, 0L, 300L, (Interpolator) null, new float[]{1.0f, 1.13f, 1.0f})}).start();
        return Unit.INSTANCE;
    }
}
