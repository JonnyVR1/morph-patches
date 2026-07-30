package com.p000p1.mobile.putong.live.livingroom.increment.operation;

import android.animation.Animator;
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
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.s7m;
import l.xdl0;
import p002l.bsm;
import p002l.h4t;
import p002l.ku50;
import p002l.tt50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class BasePreOperationView<P extends h4t> extends ConstraintLayout implements s7m<P> {

    /* JADX INFO: renamed from: d */
    public P f6834d;

    /* JADX INFO: renamed from: e */
    public BLiveOperationItem f6835e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView$a */
    public class AnimationAnimationListenerC0451a implements Animation.AnimationListener {
        public AnimationAnimationListenerC0451a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation scaleAnimation = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8592C0() {
        return getContext();
    }

    public void destroy() {
    }

    @Nullable
    public P getPresenter() {
        return this.f6834d;
    }

    public xdl0.g getTargetPos() {
        return (xdl0.g) ((Pair) this.f6834d.m14184F3(new tt50(8100).m23169f(NullChecker.a(this.f6835e) ? this.f6835e.type : ""))).second;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public void mo8593i0(PreOperationAnimView preOperationAnimView) {
        preOperationAnimView.addView(this);
    }

    @Override // 
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo8594i1(P p) {
        this.f6834d = p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public void mo8596k0(xdl0.g gVar) {
        bt0.f(bt0.s(new Animator[]{bt0.l(this, bt0.i, 0L, 160L, new LinearInterpolator(), new float[]{1.0f, 1.2f}), bt0.x(320L, new Animator[]{bt0.l(this, bt0.i, 0L, -1L, new LinearInterpolator(), new float[]{1.2f, 0.1f}), m8603r0(gVar), bt0.p(this, "alpha", 0L, -1L, new LinearInterpolator(), new float[]{1.0f, 0.0f})})}), new Runnable() { // from class: l.cq2
            @Override // java.lang.Runnable
            public final void run() {
                this.f8886a.mo8598m0();
            }
        }).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m8597l0(PathMeasure pathMeasure, ValueAnimator valueAnimator) {
        float[] fArr = new float[2];
        pathMeasure.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), fArr, null);
        setTranslationX(fArr[0]);
        setTranslationY(fArr[1]);
    }

    /* JADX INFO: renamed from: m0 */
    public void mo8598m0() {
        this.f6834d.m25548F2().OperationsEvent.boostStartEnd().j(new ku50.C0652a(8100).m16802d(this.f6835e).m16799a());
    }

    /* JADX INFO: renamed from: n0 */
    public abstract /* synthetic */ h4t mo8599n0(bsm bsmVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public void mo8601p0() {
        if (getParent() instanceof PreOperationAnimView) {
            ((PreOperationAnimView) getParent()).m8719c(17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public void mo8602q0(xdl0.g gVar) {
        xdl0.M0(this, true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(320L);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new AnimationAnimationListenerC0451a());
        startAnimation(animationSet);
    }

    /* JADX INFO: renamed from: r0 */
    public ValueAnimator m8603r0(xdl0.g gVar) {
        xdl0.g targetPos = getTargetPos();
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        int i = targetPos.a;
        int i2 = gVar.a;
        int i3 = targetPos.b;
        int i4 = gVar.b;
        path.quadTo((i - i2) / 2.0f, (i3 - i4) / 2.0f, ((i - i2) - (gVar.c / 2.0f)) + targetPos.c, (i3 - i4) - (targetPos.d * 1.5f));
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dq2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9384a.m8597l0(pathMeasure, valueAnimator);
            }
        });
        bt0.f(valueAnimatorOfFloat, new Runnable() { // from class: l.eq2
            @Override // java.lang.Runnable
            public final void run() {
                this.f9929a.destroy();
            }
        });
        return valueAnimatorOfFloat;
    }

    public void setOperationPlace(BLiveOperationItem bLiveOperationItem) {
        this.f6835e = bLiveOperationItem;
    }

    public BasePreOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @CallSuper
    /* JADX INFO: renamed from: o0 */
    public void mo8600o0(ku50 ku50Var) {
    }
}
