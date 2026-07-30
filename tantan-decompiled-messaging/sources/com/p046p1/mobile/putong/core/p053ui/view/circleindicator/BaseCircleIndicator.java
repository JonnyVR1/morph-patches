package com.p046p1.mobile.putong.core.p053ui.view.circleindicator;

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
import p149l.d3c0;
import p149l.e16;
import p149l.gbl0;
import p149l.j9c0;
import p149l.kbe;
import p149l.nu5;
import p149l.yzb0;

/* JADX INFO: loaded from: classes9.dex */
class BaseCircleIndicator extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f36920a;

    /* JADX INFO: renamed from: b */
    public int f36921b;

    /* JADX INFO: renamed from: c */
    public int f36922c;

    /* JADX INFO: renamed from: d */
    public int f36923d;

    /* JADX INFO: renamed from: e */
    public int f36924e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f36925f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f36926g;

    /* JADX INFO: renamed from: h */
    public Animator f36927h;

    /* JADX INFO: renamed from: i */
    public Animator f36928i;

    /* JADX INFO: renamed from: j */
    public Animator f36929j;

    /* JADX INFO: renamed from: k */
    public Animator f36930k;

    /* JADX INFO: renamed from: l */
    public int f36931l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.BaseCircleIndicator$a */
    public interface InterfaceC8936a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.BaseCircleIndicator$b */
    public static class InterpolatorC8937b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return Math.abs(1.0f - f);
        }
    }

    public BaseCircleIndicator(Context context) {
        super(context);
        this.f36920a = -1;
        this.f36921b = -1;
        this.f36922c = -1;
        this.f36931l = -1;
        m56206i(context, null);
    }

    /* JADX INFO: renamed from: a */
    public void m56198a(int i) {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = this.f36921b;
        layoutParamsGenerateDefaultLayoutParams.height = this.f36922c;
        int i2 = this.f36920a;
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
    public void mo56199b(int i) {
        View childAt;
        if (this.f36931l == i) {
            return;
        }
        if (this.f36928i.isRunning()) {
            this.f36928i.end();
            this.f36928i.cancel();
        }
        if (this.f36927h.isRunning()) {
            this.f36927h.end();
            this.f36927h.cancel();
        }
        int i2 = this.f36931l;
        if (i2 >= 0 && (childAt = getChildAt(i2)) != null) {
            m56200c(childAt, this.f36924e, this.f36926g);
            this.f36928i.setTarget(childAt);
            this.f36928i.start();
        }
        View childAt2 = getChildAt(i);
        if (childAt2 != null) {
            m56200c(childAt2, this.f36923d, this.f36925f);
            this.f36927h.setTarget(childAt2);
            this.f36927h.start();
        }
        this.f36931l = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m56200c(View view, @DrawableRes int i, @Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            view.setBackgroundResource(i);
            return;
        }
        Drawable drawableM145284r = kbe.m145284r(e16.m114377e(getContext(), i).mutate());
        kbe.m145281o(drawableM145284r, colorStateList);
        gbl0.m125207m0(view, drawableM145284r);
    }

    /* JADX INFO: renamed from: d */
    public void m56201d() {
        int childCount = getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (i == this.f36931l) {
                m56200c(childAt, this.f36923d, this.f36925f);
            } else {
                m56200c(childAt, this.f36924e, this.f36926g);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public Animator m56202e(nu5 nu5Var) {
        if (nu5Var.f140572e != 0) {
            return AnimatorInflater.loadAnimator(getContext(), nu5Var.f140572e);
        }
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), nu5Var.f140571d);
        animatorLoadAnimator.setInterpolator(new InterpolatorC8937b());
        return animatorLoadAnimator;
    }

    /* JADX INFO: renamed from: f */
    public Animator m56203f(nu5 nu5Var) {
        return AnimatorInflater.loadAnimator(getContext(), nu5Var.f140571d);
    }

    /* JADX INFO: renamed from: g */
    public void mo56204g(int i, int i2) {
        if (this.f36929j.isRunning()) {
            this.f36929j.end();
            this.f36929j.cancel();
        }
        if (this.f36930k.isRunning()) {
            this.f36930k.end();
            this.f36930k.cancel();
        }
        int childCount = getChildCount();
        if (i < childCount) {
            removeViews(i, childCount - i);
        } else if (i > childCount) {
            int i3 = i - childCount;
            int orientation = getOrientation();
            for (int i4 = 0; i4 < i3; i4++) {
                m56198a(orientation);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            View childAt = getChildAt(i5);
            if (i2 == i5) {
                m56200c(childAt, this.f36923d, this.f36925f);
                this.f36929j.setTarget(childAt);
                this.f36929j.start();
                this.f36929j.end();
            } else {
                m56200c(childAt, this.f36924e, this.f36926g);
                this.f36930k.setTarget(childAt);
                this.f36930k.start();
                this.f36930k.end();
            }
        }
        this.f36931l = i2;
    }

    /* JADX INFO: renamed from: h */
    public final nu5 m56205h(Context context, AttributeSet attributeSet) {
        nu5 nu5Var = new nu5();
        if (attributeSet == null) {
            return nu5Var;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j9c0.f116878b);
        nu5Var.f140568a = typedArrayObtainStyledAttributes.getDimensionPixelSize(j9c0.f116887k, -1);
        nu5Var.f140569b = typedArrayObtainStyledAttributes.getDimensionPixelSize(j9c0.f116884h, -1);
        nu5Var.f140570c = typedArrayObtainStyledAttributes.getDimensionPixelSize(j9c0.f116885i, -1);
        nu5Var.f140571d = typedArrayObtainStyledAttributes.getResourceId(j9c0.f116879c, yzb0.f200857a);
        nu5Var.f140572e = typedArrayObtainStyledAttributes.getResourceId(j9c0.f116880d, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(j9c0.f116881e, d3c0.f84161wb);
        nu5Var.f140573f = resourceId;
        nu5Var.f140574g = typedArrayObtainStyledAttributes.getResourceId(j9c0.f116882f, resourceId);
        nu5Var.f140575h = typedArrayObtainStyledAttributes.getInt(j9c0.f116886j, -1);
        nu5Var.f140576i = typedArrayObtainStyledAttributes.getInt(j9c0.f116883g, -1);
        typedArrayObtainStyledAttributes.recycle();
        return nu5Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m56206i(Context context, AttributeSet attributeSet) {
        mo56207j(m56205h(context, attributeSet));
        if (isInEditMode()) {
            mo56204g(3, 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo56207j(nu5 nu5Var) {
        int iApplyDimension = (int) (TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()) + 0.5f);
        int i = nu5Var.f140568a;
        if (i < 0) {
            i = iApplyDimension;
        }
        this.f36921b = i;
        int i2 = nu5Var.f140569b;
        if (i2 < 0) {
            i2 = iApplyDimension;
        }
        this.f36922c = i2;
        int i3 = nu5Var.f140570c;
        if (i3 >= 0) {
            iApplyDimension = i3;
        }
        this.f36920a = iApplyDimension;
        this.f36927h = m56203f(nu5Var);
        Animator animatorM56203f = m56203f(nu5Var);
        this.f36929j = animatorM56203f;
        animatorM56203f.setDuration(0L);
        this.f36928i = m56202e(nu5Var);
        Animator animatorM56202e = m56202e(nu5Var);
        this.f36930k = animatorM56202e;
        animatorM56202e.setDuration(0L);
        int i4 = nu5Var.f140573f;
        this.f36923d = i4 == 0 ? d3c0.f84161wb : i4;
        int i5 = nu5Var.f140574g;
        if (i5 != 0) {
            i4 = i5;
        }
        this.f36924e = i4;
        setOrientation(nu5Var.f140575h != 1 ? 0 : 1);
        int i6 = nu5Var.f140576i;
        if (i6 < 0) {
            i6 = 17;
        }
        setGravity(i6);
    }

    /* JADX INFO: renamed from: k */
    public void mo56208k(@ColorInt int i, @ColorInt int i2) {
        this.f36925f = ColorStateList.valueOf(i);
        this.f36926g = ColorStateList.valueOf(i2);
        m56201d();
    }

    public void setIndicatorCreatedListener(@Nullable InterfaceC8936a interfaceC8936a) {
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36920a = -1;
        this.f36921b = -1;
        this.f36922c = -1;
        this.f36931l = -1;
        m56206i(context, attributeSet);
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36920a = -1;
        this.f36921b = -1;
        this.f36922c = -1;
        this.f36931l = -1;
        m56206i(context, attributeSet);
    }

    @TargetApi(21)
    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f36920a = -1;
        this.f36921b = -1;
        this.f36922c = -1;
        this.f36931l = -1;
        m56206i(context, attributeSet);
    }
}
