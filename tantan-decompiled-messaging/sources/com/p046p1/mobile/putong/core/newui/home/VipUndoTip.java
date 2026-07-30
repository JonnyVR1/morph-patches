package com.p046p1.mobile.putong.core.newui.home;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.newui.home.VipUndoTip;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.sunshine.engine.base.InterpolatorType;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p149l.bt0;
import p149l.hpd0;
import p149l.t100;
import p149l.vnl0;

/* JADX INFO: loaded from: classes11.dex */
public class VipUndoTip extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f21851a;

    /* JADX INFO: renamed from: b */
    public hpd0 f21852b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f21853c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f21854d;

    /* JADX INFO: renamed from: e */
    public boolean f21855e;

    /* JADX INFO: renamed from: f */
    public boolean f21856f;

    /* JADX INFO: renamed from: g */
    public boolean f21857g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.VipUndoTip$a */
    public class C7864a extends bt0.C15966j {
        public C7864a() {
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (VipUndoTip.this.f21857g) {
                return;
            }
            VipUndoTip.this.setAlpha(1.0f);
            VipUndoTip.this.setScaleX(1.0f);
            VipUndoTip.this.setScaleY(1.0f);
        }
    }

    public VipUndoTip(Context context) {
        super(context);
        this.f21852b = new hpd0("has_show_undo_tip_in_card", Boolean.FALSE);
        this.f21853c = null;
        this.f21854d = null;
        this.f21855e = false;
        this.f21856f = false;
        this.f21857g = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ float m36982b(float f) {
        if (f <= 0.67d) {
            return 0.0f;
        }
        float f2 = (f - 0.67f) * 3.0f;
        return ((float) Math.pow(1.0f - f2, 2.0d)) * ((float) Math.sin(((double) f2) * 25.132741228718345d));
    }

    /* JADX INFO: renamed from: d */
    public final void m36984d(View view) {
        vnl0.m199033a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m36985e() {
        if (NullChecker.m81303a(this.f21853c)) {
            this.f21853c.cancel();
            this.f21853c = null;
        }
        if (NullChecker.m81303a(this.f21854d)) {
            this.f21854d.cancel();
            this.f21854d = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m36986f(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setAlpha(fFloatValue);
        setScaleX(fFloatValue);
        setScaleY(fFloatValue);
    }

    /* JADX INFO: renamed from: g */
    public final void m36987g() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f21851a, BLiveGiftItem.TYPE_ROTATION, 0.0f, 30.0f);
        this.f21854d = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new Interpolator() { // from class: l.unl0
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return VipUndoTip.m36982b(f);
            }
        });
        this.f21854d.setDuration(1500L);
        this.f21854d.setRepeatCount(-1);
        this.f21854d.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36984d(this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f21857g) {
            return;
        }
        if (i != 0) {
            this.f21856f = false;
            m36985e();
            return;
        }
        if (getVisibility() != 0) {
            return;
        }
        m36985e();
        if (this.f21856f) {
            setAlpha(0.0f);
            setPivotX(t100.m186890d(25.0f));
            setPivotY(0.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f21853c = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(500L);
            this.f21853c.setInterpolator(InterpolatorType.overshoot.obtain());
            this.f21853c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tnl0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f171255a.m36986f(valueAnimator);
                }
            });
            this.f21853c.addListener(new C7864a());
            this.f21853c.setStartDelay(300L);
            this.f21853c.start();
        }
        m36987g();
    }

    public VipUndoTip(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21852b = new hpd0("has_show_undo_tip_in_card", Boolean.FALSE);
        this.f21853c = null;
        this.f21854d = null;
        this.f21855e = false;
        this.f21856f = false;
        this.f21857g = false;
    }

    public VipUndoTip(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21852b = new hpd0("has_show_undo_tip_in_card", Boolean.FALSE);
        this.f21853c = null;
        this.f21854d = null;
        this.f21855e = false;
        this.f21856f = false;
        this.f21857g = false;
    }
}
