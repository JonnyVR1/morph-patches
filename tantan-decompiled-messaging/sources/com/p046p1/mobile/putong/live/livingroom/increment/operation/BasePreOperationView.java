package com.p046p1.mobile.putong.live.livingroom.increment.operation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.tantanapp.common.utils.NullChecker;
import p149l.bsm;
import p149l.bt0;
import p149l.h4t;
import p149l.ku50;
import p149l.s7m;
import p149l.tt50;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasePreOperationView<P extends h4t> extends ConstraintLayout implements s7m<P> {

    /* JADX INFO: renamed from: d */
    public P f50792d;

    /* JADX INFO: renamed from: e */
    public BLiveOperationItem f50793e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView$a */
    public class AnimationAnimationListenerC12862a implements Animation.AnimationListener {
        public AnimationAnimationListenerC12862a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(160L);
            scaleAnimation.setFillAfter(true);
            BasePreOperationView.this.startAnimation(scaleAnimation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public BasePreOperationView(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Nullable
    public P getPresenter() {
        return this.f50792d;
    }

    public xdl0.C21104g getTargetPos() {
        return (xdl0.C21104g) ((Pair) this.f50792d.m129297F3(new tt50(8100).m190598f(NullChecker.m81303a(this.f50793e) ? this.f50793e.type : ""))).second;
    }

    /* JADX INFO: renamed from: i0 */
    public void mo74986i0(PreOperationAnimView preOperationAnimView) {
        preOperationAnimView.addView(this);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(P p) {
        this.f50792d = p;
    }

    /* JADX INFO: renamed from: k0 */
    public void mo74988k0(xdl0.C21104g c21104g) {
        bt0.m103733f(bt0.m103746s(bt0.m103739l(this, bt0.f77162i, 0L, 160L, new LinearInterpolator(), 1.0f, 1.2f), bt0.m103751x(320L, bt0.m103739l(this, bt0.f77162i, 0L, -1L, new LinearInterpolator(), 1.2f, 0.1f), m74995r0(c21104g), bt0.m103743p(this, "alpha", 0L, -1L, new LinearInterpolator(), 1.0f, 0.0f))), new Runnable() { // from class: l.cq2
            @Override // java.lang.Runnable
            public final void run() {
                this.f82016a.mo74990m0();
            }
        }).start();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m74989l0(PathMeasure pathMeasure, ValueAnimator valueAnimator) {
        float[] fArr = new float[2];
        pathMeasure.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), fArr, null);
        setTranslationX(fArr[0]);
        setTranslationY(fArr[1]);
    }

    /* JADX INFO: renamed from: m0 */
    public void mo74990m0() {
        this.f50792d.m206028F2().OperationsEvent.boostStartEnd().mo172463j(new ku50.C18083a(8100).m147259d(this.f50793e).m147256a());
    }

    /* JADX INFO: renamed from: n0 */
    public abstract /* synthetic */ h4t mo74991n0(bsm bsmVar);

    /* JADX INFO: renamed from: p0 */
    public void mo74993p0() {
        if (getParent() instanceof PreOperationAnimView) {
            ((PreOperationAnimView) getParent()).m75104c(17);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void mo74994q0(xdl0.C21104g c21104g) {
        xdl0.m208345M0(this, true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(320L);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new AnimationAnimationListenerC12862a());
        startAnimation(animationSet);
    }

    /* JADX INFO: renamed from: r0 */
    public ValueAnimator m74995r0(xdl0.C21104g c21104g) {
        xdl0.C21104g targetPos = getTargetPos();
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        int i = targetPos.f192418a;
        int i2 = c21104g.f192418a;
        int i3 = targetPos.f192419b;
        int i4 = c21104g.f192419b;
        path.quadTo((i - i2) / 2.0f, (i3 - i4) / 2.0f, ((i - i2) - (c21104g.f192420c / 2.0f)) + targetPos.f192420c, (i3 - i4) - (targetPos.f192421d * 1.5f));
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dq2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f87379a.m74989l0(pathMeasure, valueAnimator);
            }
        });
        bt0.m103733f(valueAnimatorOfFloat, new Runnable() { // from class: l.eq2
            @Override // java.lang.Runnable
            public final void run() {
                this.f92751a.destroy();
            }
        });
        return valueAnimatorOfFloat;
    }

    public void setOperationPlace(BLiveOperationItem bLiveOperationItem) {
        this.f50793e = bLiveOperationItem;
    }

    public BasePreOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @CallSuper
    /* JADX INFO: renamed from: o0 */
    public void mo74992o0(ku50 ku50Var) {
    }
}
