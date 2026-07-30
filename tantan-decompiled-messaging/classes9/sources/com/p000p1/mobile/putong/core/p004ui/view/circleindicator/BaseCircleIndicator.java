package com.p000p1.mobile.putong.core.p004ui.view.circleindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import l.d3c0;
import l.e16;
import l.gbl0;
import l.j9c0;
import l.kbe;
import l.yzb0;
import p006l.nu5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
class BaseCircleIndicator extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f6701a;

    /* JADX INFO: renamed from: b */
    public int f6702b;

    /* JADX INFO: renamed from: c */
    public int f6703c;

    /* JADX INFO: renamed from: d */
    public int f6704d;

    /* JADX INFO: renamed from: e */
    public int f6705e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f6706f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f6707g;

    /* JADX INFO: renamed from: h */
    public Animator f6708h;

    /* JADX INFO: renamed from: i */
    public Animator f6709i;

    /* JADX INFO: renamed from: j */
    public Animator f6710j;

    /* JADX INFO: renamed from: k */
    public Animator f6711k;

    /* JADX INFO: renamed from: l */
    public int f6712l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.BaseCircleIndicator$a */
    public interface InterfaceC0372a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.BaseCircleIndicator$b */
    public static class InterpolatorC0373b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return Math.abs(1.0f - f);
        }
    }

    public BaseCircleIndicator(Context context) {
        super(context);
        this.f6701a = -1;
        this.f6702b = -1;
        this.f6703c = -1;
        this.f6712l = -1;
        m9639i(context, null);
    }

    /* JADX INFO: renamed from: a */
    public void m9631a(int i) {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = this.f6702b;
        layoutParamsGenerateDefaultLayoutParams.height = this.f6703c;
        int i2 = this.f6701a;
        if (i == 0) {
            layoutParamsGenerateDefaultLayoutParams.leftMargin = i2;
            layoutParamsGenerateDefaultLayoutParams.rightMargin = i2;
        } else {
            layoutParamsGenerateDefaultLayoutParams.topMargin = i2;
            layoutParamsGenerateDefaultLayoutParams.bottomMargin = i2;
        }
        addView(view, layoutParamsGenerateDefaultLayoutParams);
    }

    /* JADX INFO: renamed from: b */
    public void mo9632b(int i) {
        View childAt;
        if (this.f6712l == i) {
            return;
        }
        if (this.f6709i.isRunning()) {
            this.f6709i.end();
            this.f6709i.cancel();
        }
        if (this.f6708h.isRunning()) {
            this.f6708h.end();
            this.f6708h.cancel();
        }
        int i2 = this.f6712l;
        if (i2 >= 0 && (childAt = getChildAt(i2)) != null) {
            m9633c(childAt, this.f6705e, this.f6707g);
            this.f6709i.setTarget(childAt);
            this.f6709i.start();
        }
        View childAt2 = getChildAt(i);
        if (childAt2 != null) {
            m9633c(childAt2, this.f6704d, this.f6706f);
            this.f6708h.setTarget(childAt2);
            this.f6708h.start();
        }
        this.f6712l = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m9633c(View view, @DrawableRes int i, @Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            view.setBackgroundResource(i);
            return;
        }
        Drawable drawableR = kbe.r(e16.e(getContext(), i).mutate());
        kbe.o(drawableR, colorStateList);
        gbl0.m0(view, drawableR);
    }

    /* JADX INFO: renamed from: d */
    public void m9634d() {
        int childCount = getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (i == this.f6712l) {
                m9633c(childAt, this.f6704d, this.f6706f);
            } else {
                m9633c(childAt, this.f6705e, this.f6707g);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public Animator m9635e(nu5 nu5Var) {
        if (nu5Var.f17856e != 0) {
            return AnimatorInflater.loadAnimator(getContext(), nu5Var.f17856e);
        }
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), nu5Var.f17855d);
        animatorLoadAnimator.setInterpolator(new InterpolatorC0373b());
        return animatorLoadAnimator;
    }

    /* JADX INFO: renamed from: f */
    public Animator m9636f(nu5 nu5Var) {
        return AnimatorInflater.loadAnimator(getContext(), nu5Var.f17855d);
    }

    /* JADX INFO: renamed from: g */
    public void mo9637g(int i, int i2) {
        if (this.f6710j.isRunning()) {
            this.f6710j.end();
            this.f6710j.cancel();
        }
        if (this.f6711k.isRunning()) {
            this.f6711k.end();
            this.f6711k.cancel();
        }
        int childCount = getChildCount();
        if (i < childCount) {
            removeViews(i, childCount - i);
        } else if (i > childCount) {
            int i3 = i - childCount;
            int orientation = getOrientation();
            for (int i4 = 0; i4 < i3; i4++) {
                m9631a(orientation);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            View childAt = getChildAt(i5);
            if (i2 == i5) {
                m9633c(childAt, this.f6704d, this.f6706f);
                this.f6710j.setTarget(childAt);
                this.f6710j.start();
                this.f6710j.end();
            } else {
                m9633c(childAt, this.f6705e, this.f6707g);
                this.f6711k.setTarget(childAt);
                this.f6711k.start();
                this.f6711k.end();
            }
        }
        this.f6712l = i2;
    }

    /* JADX INFO: renamed from: h */
    public final nu5 m9638h(Context context, AttributeSet attributeSet) {
        nu5 nu5Var = new nu5();
        if (attributeSet == null) {
            return nu5Var;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j9c0.b);
        nu5Var.f17852a = typedArrayObtainStyledAttributes.getDimensionPixelSize(j9c0.k, -1);
        nu5Var.f17853b = typedArrayObtainStyledAttributes.getDimensionPixelSize(j9c0.h, -1);
        nu5Var.f17854c = typedArrayObtainStyledAttributes.getDimensionPixelSize(j9c0.i, -1);
        nu5Var.f17855d = typedArrayObtainStyledAttributes.getResourceId(j9c0.c, yzb0.a);
        nu5Var.f17856e = typedArrayObtainStyledAttributes.getResourceId(j9c0.d, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(j9c0.e, d3c0.wb);
        nu5Var.f17857f = resourceId;
        nu5Var.f17858g = typedArrayObtainStyledAttributes.getResourceId(j9c0.f, resourceId);
        nu5Var.f17859h = typedArrayObtainStyledAttributes.getInt(j9c0.j, -1);
        nu5Var.f17860i = typedArrayObtainStyledAttributes.getInt(j9c0.g, -1);
        typedArrayObtainStyledAttributes.recycle();
        return nu5Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m9639i(Context context, AttributeSet attributeSet) {
        mo9640j(m9638h(context, attributeSet));
        if (isInEditMode()) {
            mo9637g(3, 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo9640j(nu5 nu5Var) {
        int iApplyDimension = (int) (TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()) + 0.5f);
        int i = nu5Var.f17852a;
        if (i < 0) {
            i = iApplyDimension;
        }
        this.f6702b = i;
        int i2 = nu5Var.f17853b;
        if (i2 < 0) {
            i2 = iApplyDimension;
        }
        this.f6703c = i2;
        int i3 = nu5Var.f17854c;
        if (i3 >= 0) {
            iApplyDimension = i3;
        }
        this.f6701a = iApplyDimension;
        this.f6708h = m9636f(nu5Var);
        Animator animatorM9636f = m9636f(nu5Var);
        this.f6710j = animatorM9636f;
        animatorM9636f.setDuration(0L);
        this.f6709i = m9635e(nu5Var);
        Animator animatorM9635e = m9635e(nu5Var);
        this.f6711k = animatorM9635e;
        animatorM9635e.setDuration(0L);
        int i4 = nu5Var.f17857f;
        this.f6704d = i4 == 0 ? d3c0.wb : i4;
        int i5 = nu5Var.f17858g;
        if (i5 != 0) {
            i4 = i5;
        }
        this.f6705e = i4;
        setOrientation(nu5Var.f17859h != 1 ? 0 : 1);
        int i6 = nu5Var.f17860i;
        if (i6 < 0) {
            i6 = 17;
        }
        setGravity(i6);
    }

    /* JADX INFO: renamed from: k */
    public void mo9641k(@ColorInt int i, @ColorInt int i2) {
        this.f6706f = ColorStateList.valueOf(i);
        this.f6707g = ColorStateList.valueOf(i2);
        m9634d();
    }

    public void setIndicatorCreatedListener(@Nullable InterfaceC0372a interfaceC0372a) {
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6701a = -1;
        this.f6702b = -1;
        this.f6703c = -1;
        this.f6712l = -1;
        m9639i(context, attributeSet);
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6701a = -1;
        this.f6702b = -1;
        this.f6703c = -1;
        this.f6712l = -1;
        m9639i(context, attributeSet);
    }

    @TargetApi(21)
    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6701a = -1;
        this.f6702b = -1;
        this.f6703c = -1;
        this.f6712l = -1;
        m9639i(context, attributeSet);
    }
}
