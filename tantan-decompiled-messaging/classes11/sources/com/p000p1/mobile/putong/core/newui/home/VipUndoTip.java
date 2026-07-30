package com.p000p1.mobile.putong.core.newui.home;

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
import com.p000p1.mobile.putong.core.newui.home.VipUndoTip;
import com.sunshine.engine.base.InterpolatorType;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.hpd0;
import l.t100;
import l.vnl0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VipUndoTip extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f629a;

    /* JADX INFO: renamed from: b */
    public hpd0 f630b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f631c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f632d;

    /* JADX INFO: renamed from: e */
    public boolean f633e;

    /* JADX INFO: renamed from: f */
    public boolean f634f;

    /* JADX INFO: renamed from: g */
    public boolean f635g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.VipUndoTip$a */
    public class C0028a extends bt0.j {
        public C0028a() {
        }

        public void onAnimationCancel(Animator animator) {
            if (VipUndoTip.this.f635g) {
                return;
            }
            VipUndoTip.this.setAlpha(1.0f);
            VipUndoTip.this.setScaleX(1.0f);
            VipUndoTip.this.setScaleY(1.0f);
        }
    }

    public VipUndoTip(Context context) {
        super(context);
        this.f630b = new hpd0("has_show_undo_tip_in_card", Boolean.FALSE);
        this.f631c = null;
        this.f632d = null;
        this.f633e = false;
        this.f634f = false;
        this.f635g = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ float m949b(float f) {
        if (f <= 0.67d) {
            return 0.0f;
        }
        float f2 = (f - 0.67f) * 3.0f;
        return ((float) Math.pow(1.0f - f2, 2.0d)) * ((float) Math.sin(((double) f2) * 25.132741228718345d));
    }

    /* JADX INFO: renamed from: d */
    public final void m951d(View view) {
        vnl0.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m952e() {
        if (NullChecker.a(this.f631c)) {
            this.f631c.cancel();
            this.f631c = null;
        }
        if (NullChecker.a(this.f632d)) {
            this.f632d.cancel();
            this.f632d = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m953f(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setAlpha(fFloatValue);
        setScaleX(fFloatValue);
        setScaleY(fFloatValue);
    }

    /* JADX INFO: renamed from: g */
    public final void m954g() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f629a, "rotation", 0.0f, 30.0f);
        this.f632d = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new Interpolator() { // from class: l.unl0
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return VipUndoTip.m949b(f);
            }
        });
        this.f632d.setDuration(1500L);
        this.f632d.setRepeatCount(-1);
        this.f632d.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m951d(this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f635g) {
            return;
        }
        if (i != 0) {
            this.f634f = false;
            m952e();
            return;
        }
        if (getVisibility() != 0) {
            return;
        }
        m952e();
        if (this.f634f) {
            setAlpha(0.0f);
            setPivotX(t100.d(25.0f));
            setPivotY(0.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f631c = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(500L);
            this.f631c.setInterpolator(InterpolatorType.overshoot.obtain());
            this.f631c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tnl0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f20782a.m953f(valueAnimator);
                }
            });
            this.f631c.addListener(new C0028a());
            this.f631c.setStartDelay(300L);
            this.f631c.start();
        }
        m954g();
    }

    public VipUndoTip(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f630b = new hpd0("has_show_undo_tip_in_card", Boolean.FALSE);
        this.f631c = null;
        this.f632d = null;
        this.f633e = false;
        this.f634f = false;
        this.f635g = false;
    }

    public VipUndoTip(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f630b = new hpd0("has_show_undo_tip_in_card", Boolean.FALSE);
        this.f631c = null;
        this.f632d = null;
        this.f633e = false;
        this.f634f = false;
        this.f635g = false;
    }
}
