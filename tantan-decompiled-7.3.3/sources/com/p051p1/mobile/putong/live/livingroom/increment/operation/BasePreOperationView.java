package com.p051p1.mobile.putong.live.livingroom.increment.operation;

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
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.dum;
import p153l.gt0;
import p153l.i6t;
import p153l.iam;
import p153l.q260;
import p153l.z160;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasePreOperationView<P extends i6t> extends ConstraintLayout implements iam<P> {

    /* JADX INFO: renamed from: d */
    public P f51640d;

    /* JADX INFO: renamed from: e */
    public BLiveOperationItem f51641e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView$a */
    public class AnimationAnimationListenerC13025a implements Animation.AnimationListener {
        public AnimationAnimationListenerC13025a() {
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

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Nullable
    public P getPresenter() {
        return this.f51640d;
    }

    public bnl0.C16067g getTargetPos() {
        return (bnl0.C16067g) ((Pair) this.f51640d.m138856F3(new z160(8100).m218281f(NullChecker.m82486a(this.f51641e) ? this.f51641e.type : ""))).second;
    }

    /* JADX INFO: renamed from: i0 */
    public void mo76169i0(PreOperationAnimView preOperationAnimView) {
        preOperationAnimView.addView(this);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(P p) {
        this.f51640d = p;
    }

    /* JADX INFO: renamed from: k0 */
    public void mo76171k0(bnl0.C16067g c16067g) {
        gt0.m132160f(gt0.m132173s(gt0.m132166l(this, gt0.f106354i, 0L, 160L, new LinearInterpolator(), 1.0f, 1.2f), gt0.m132178x(320L, gt0.m132166l(this, gt0.f106354i, 0L, -1L, new LinearInterpolator(), 1.2f, 0.1f), m76178r0(c16067g), gt0.m132170p(this, "alpha", 0L, -1L, new LinearInterpolator(), 1.0f, 0.0f))), new Runnable() { // from class: l.tq2
            @Override // java.lang.Runnable
            public final void run() {
                this.f175671a.mo76173m0();
            }
        }).start();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m76172l0(PathMeasure pathMeasure, ValueAnimator valueAnimator) {
        float[] fArr = new float[2];
        pathMeasure.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), fArr, null);
        setTranslationX(fArr[0]);
        setTranslationY(fArr[1]);
    }

    /* JADX INFO: renamed from: m0 */
    public void mo76173m0() {
        this.f51640d.m213811F2().OperationsEvent.boostStartEnd().mo199273j(new q260.C19505a(8100).m175005d(this.f51641e).m175002a());
    }

    /* JADX INFO: renamed from: n0 */
    public abstract /* synthetic */ i6t mo76174n0(dum dumVar);

    /* JADX INFO: renamed from: p0 */
    public void mo76176p0() {
        if (getParent() instanceof PreOperationAnimView) {
            ((PreOperationAnimView) getParent()).m76287c(17);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void mo76177q0(bnl0.C16067g c16067g) {
        bnl0.m105525M0(this, true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(320L);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new AnimationAnimationListenerC13025a());
        startAnimation(animationSet);
    }

    /* JADX INFO: renamed from: r0 */
    public ValueAnimator m76178r0(bnl0.C16067g c16067g) {
        bnl0.C16067g targetPos = getTargetPos();
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        int i = targetPos.f77559a;
        int i2 = c16067g.f77559a;
        int i3 = targetPos.f77560b;
        int i4 = c16067g.f77560b;
        path.quadTo((i - i2) / 2.0f, (i3 - i4) / 2.0f, ((i - i2) - (c16067g.f77561c / 2.0f)) + targetPos.f77561c, (i3 - i4) - (targetPos.f77562d * 1.5f));
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.uq2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f180342a.m76172l0(pathMeasure, valueAnimator);
            }
        });
        gt0.m132160f(valueAnimatorOfFloat, new Runnable() { // from class: l.vq2
            @Override // java.lang.Runnable
            public final void run() {
                this.f185318a.destroy();
            }
        });
        return valueAnimatorOfFloat;
    }

    public void setOperationPlace(BLiveOperationItem bLiveOperationItem) {
        this.f51641e = bLiveOperationItem;
    }

    public BasePreOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @CallSuper
    /* JADX INFO: renamed from: o0 */
    public void mo76175o0(q260 q260Var) {
    }
}
