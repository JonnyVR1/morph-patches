package com.p051p1.mobile.putong.core.newui.home;

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
import com.p051p1.mobile.putong.core.newui.home.VipUndoTip;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.sunshine.engine.base.InterpolatorType;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p153l.gt0;
import p153l.jxd0;
import p153l.qa00;
import p153l.zwl0;

/* JADX INFO: loaded from: classes11.dex */
public class VipUndoTip extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f22593a;

    /* JADX INFO: renamed from: b */
    public jxd0 f22594b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f22595c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f22596d;

    /* JADX INFO: renamed from: e */
    public boolean f22597e;

    /* JADX INFO: renamed from: f */
    public boolean f22598f;

    /* JADX INFO: renamed from: g */
    public boolean f22599g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.VipUndoTip$a */
    public class C8015a extends gt0.C17308j {
        public C8015a() {
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (VipUndoTip.this.f22599g) {
                return;
            }
            VipUndoTip.this.setAlpha(1.0f);
            VipUndoTip.this.setScaleX(1.0f);
            VipUndoTip.this.setScaleY(1.0f);
        }
    }

    public VipUndoTip(Context context) {
        super(context);
        this.f22594b = new jxd0("has_show_undo_tip_in_card", Boolean.FALSE);
        this.f22595c = null;
        this.f22596d = null;
        this.f22597e = false;
        this.f22598f = false;
        this.f22599g = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ float m37985b(float f) {
        if (f <= 0.67d) {
            return 0.0f;
        }
        float f2 = (f - 0.67f) * 3.0f;
        return ((float) Math.pow(1.0f - f2, 2.0d)) * ((float) Math.sin(((double) f2) * 25.132741228718345d));
    }

    /* JADX INFO: renamed from: d */
    public final void m37987d(View view) {
        zwl0.m221943a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m37988e() {
        if (NullChecker.m82486a(this.f22595c)) {
            this.f22595c.cancel();
            this.f22595c = null;
        }
        if (NullChecker.m82486a(this.f22596d)) {
            this.f22596d.cancel();
            this.f22596d = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m37989f(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setAlpha(fFloatValue);
        setScaleX(fFloatValue);
        setScaleY(fFloatValue);
    }

    /* JADX INFO: renamed from: g */
    public final void m37990g() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f22593a, BLiveGiftItem.TYPE_ROTATION, 0.0f, 30.0f);
        this.f22596d = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new Interpolator() { // from class: l.ywl0
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return VipUndoTip.m37985b(f);
            }
        });
        this.f22596d.setDuration(1500L);
        this.f22596d.setRepeatCount(-1);
        this.f22596d.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37987d(this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f22599g) {
            return;
        }
        if (i != 0) {
            this.f22598f = false;
            m37988e();
            return;
        }
        if (getVisibility() != 0) {
            return;
        }
        m37988e();
        if (this.f22598f) {
            setAlpha(0.0f);
            setPivotX(qa00.m175859d(25.0f));
            setPivotY(0.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f22595c = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(500L);
            this.f22595c.setInterpolator(InterpolatorType.overshoot.obtain());
            this.f22595c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xwl0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f196512a.m37989f(valueAnimator);
                }
            });
            this.f22595c.addListener(new C8015a());
            this.f22595c.setStartDelay(300L);
            this.f22595c.start();
        }
        m37990g();
    }

    public VipUndoTip(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22594b = new jxd0("has_show_undo_tip_in_card", Boolean.FALSE);
        this.f22595c = null;
        this.f22596d = null;
        this.f22597e = false;
        this.f22598f = false;
        this.f22599g = false;
    }

    public VipUndoTip(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22594b = new jxd0("has_show_undo_tip_in_card", Boolean.FALSE);
        this.f22595c = null;
        this.f22596d = null;
        this.f22597e = false;
        this.f22598f = false;
        this.f22599g = false;
    }
}
