package com.p051p1.mobile.putong.core.p058ui.view.circleindicator;

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
import p153l.d8c0;
import p153l.j26;
import p153l.jbc0;
import p153l.kkl0;
import p153l.oce;
import p153l.phc0;
import p153l.rv5;

/* JADX INFO: loaded from: classes12.dex */
class BaseCircleIndicator extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f37768a;

    /* JADX INFO: renamed from: b */
    public int f37769b;

    /* JADX INFO: renamed from: c */
    public int f37770c;

    /* JADX INFO: renamed from: d */
    public int f37771d;

    /* JADX INFO: renamed from: e */
    public int f37772e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f37773f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f37774g;

    /* JADX INFO: renamed from: h */
    public Animator f37775h;

    /* JADX INFO: renamed from: i */
    public Animator f37776i;

    /* JADX INFO: renamed from: j */
    public Animator f37777j;

    /* JADX INFO: renamed from: k */
    public Animator f37778k;

    /* JADX INFO: renamed from: l */
    public int f37779l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.BaseCircleIndicator$a */
    public interface InterfaceC9099a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.BaseCircleIndicator$b */
    public static class InterpolatorC9100b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return Math.abs(1.0f - f);
        }
    }

    public BaseCircleIndicator(Context context) {
        super(context);
        this.f37768a = -1;
        this.f37769b = -1;
        this.f37770c = -1;
        this.f37779l = -1;
        m57389i(context, null);
    }

    /* JADX INFO: renamed from: a */
    public void m57381a(int i) {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = this.f37769b;
        layoutParamsGenerateDefaultLayoutParams.height = this.f37770c;
        int i2 = this.f37768a;
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
    public void mo57382b(int i) {
        View childAt;
        if (this.f37779l == i) {
            return;
        }
        if (this.f37776i.isRunning()) {
            this.f37776i.end();
            this.f37776i.cancel();
        }
        if (this.f37775h.isRunning()) {
            this.f37775h.end();
            this.f37775h.cancel();
        }
        int i2 = this.f37779l;
        if (i2 >= 0 && (childAt = getChildAt(i2)) != null) {
            m57383c(childAt, this.f37772e, this.f37774g);
            this.f37776i.setTarget(childAt);
            this.f37776i.start();
        }
        View childAt2 = getChildAt(i);
        if (childAt2 != null) {
            m57383c(childAt2, this.f37771d, this.f37773f);
            this.f37775h.setTarget(childAt2);
            this.f37775h.start();
        }
        this.f37779l = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m57383c(View view, @DrawableRes int i, @Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            view.setBackgroundResource(i);
            return;
        }
        Drawable drawableM167178r = oce.m167178r(j26.m143192e(getContext(), i).mutate());
        oce.m167175o(drawableM167178r, colorStateList);
        kkl0.m150170m0(view, drawableM167178r);
    }

    /* JADX INFO: renamed from: d */
    public void m57384d() {
        int childCount = getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (i == this.f37779l) {
                m57383c(childAt, this.f37771d, this.f37773f);
            } else {
                m57383c(childAt, this.f37772e, this.f37774g);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public Animator m57385e(rv5 rv5Var) {
        if (rv5Var.f164980e != 0) {
            return AnimatorInflater.loadAnimator(getContext(), rv5Var.f164980e);
        }
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), rv5Var.f164979d);
        animatorLoadAnimator.setInterpolator(new InterpolatorC9100b());
        return animatorLoadAnimator;
    }

    /* JADX INFO: renamed from: f */
    public Animator m57386f(rv5 rv5Var) {
        return AnimatorInflater.loadAnimator(getContext(), rv5Var.f164979d);
    }

    /* JADX INFO: renamed from: g */
    public void mo57387g(int i, int i2) {
        if (this.f37777j.isRunning()) {
            this.f37777j.end();
            this.f37777j.cancel();
        }
        if (this.f37778k.isRunning()) {
            this.f37778k.end();
            this.f37778k.cancel();
        }
        int childCount = getChildCount();
        if (i < childCount) {
            removeViews(i, childCount - i);
        } else if (i > childCount) {
            int i3 = i - childCount;
            int orientation = getOrientation();
            for (int i4 = 0; i4 < i3; i4++) {
                m57381a(orientation);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            View childAt = getChildAt(i5);
            if (i2 == i5) {
                m57383c(childAt, this.f37771d, this.f37773f);
                this.f37777j.setTarget(childAt);
                this.f37777j.start();
                this.f37777j.end();
            } else {
                m57383c(childAt, this.f37772e, this.f37774g);
                this.f37778k.setTarget(childAt);
                this.f37778k.start();
                this.f37778k.end();
            }
        }
        this.f37779l = i2;
    }

    /* JADX INFO: renamed from: h */
    public final rv5 m57388h(Context context, AttributeSet attributeSet) {
        rv5 rv5Var = new rv5();
        if (attributeSet == null) {
            return rv5Var;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, phc0.f152414b);
        rv5Var.f164976a = typedArrayObtainStyledAttributes.getDimensionPixelSize(phc0.f152423k, -1);
        rv5Var.f164977b = typedArrayObtainStyledAttributes.getDimensionPixelSize(phc0.f152420h, -1);
        rv5Var.f164978c = typedArrayObtainStyledAttributes.getDimensionPixelSize(phc0.f152421i, -1);
        rv5Var.f164979d = typedArrayObtainStyledAttributes.getResourceId(phc0.f152415c, d8c0.f85593a);
        rv5Var.f164980e = typedArrayObtainStyledAttributes.getResourceId(phc0.f152416d, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(phc0.f152417e, jbc0.f119816wb);
        rv5Var.f164981f = resourceId;
        rv5Var.f164982g = typedArrayObtainStyledAttributes.getResourceId(phc0.f152418f, resourceId);
        rv5Var.f164983h = typedArrayObtainStyledAttributes.getInt(phc0.f152422j, -1);
        rv5Var.f164984i = typedArrayObtainStyledAttributes.getInt(phc0.f152419g, -1);
        typedArrayObtainStyledAttributes.recycle();
        return rv5Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m57389i(Context context, AttributeSet attributeSet) {
        mo57390j(m57388h(context, attributeSet));
        if (isInEditMode()) {
            mo57387g(3, 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo57390j(rv5 rv5Var) {
        int iApplyDimension = (int) (TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()) + 0.5f);
        int i = rv5Var.f164976a;
        if (i < 0) {
            i = iApplyDimension;
        }
        this.f37769b = i;
        int i2 = rv5Var.f164977b;
        if (i2 < 0) {
            i2 = iApplyDimension;
        }
        this.f37770c = i2;
        int i3 = rv5Var.f164978c;
        if (i3 >= 0) {
            iApplyDimension = i3;
        }
        this.f37768a = iApplyDimension;
        this.f37775h = m57386f(rv5Var);
        Animator animatorM57386f = m57386f(rv5Var);
        this.f37777j = animatorM57386f;
        animatorM57386f.setDuration(0L);
        this.f37776i = m57385e(rv5Var);
        Animator animatorM57385e = m57385e(rv5Var);
        this.f37778k = animatorM57385e;
        animatorM57385e.setDuration(0L);
        int i4 = rv5Var.f164981f;
        this.f37771d = i4 == 0 ? jbc0.f119816wb : i4;
        int i5 = rv5Var.f164982g;
        if (i5 != 0) {
            i4 = i5;
        }
        this.f37772e = i4;
        setOrientation(rv5Var.f164983h != 1 ? 0 : 1);
        int i6 = rv5Var.f164984i;
        if (i6 < 0) {
            i6 = 17;
        }
        setGravity(i6);
    }

    /* JADX INFO: renamed from: k */
    public void mo57391k(@ColorInt int i, @ColorInt int i2) {
        this.f37773f = ColorStateList.valueOf(i);
        this.f37774g = ColorStateList.valueOf(i2);
        m57384d();
    }

    public void setIndicatorCreatedListener(@Nullable InterfaceC9099a interfaceC9099a) {
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37768a = -1;
        this.f37769b = -1;
        this.f37770c = -1;
        this.f37779l = -1;
        m57389i(context, attributeSet);
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37768a = -1;
        this.f37769b = -1;
        this.f37770c = -1;
        this.f37779l = -1;
        m57389i(context, attributeSet);
    }

    @TargetApi(21)
    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f37768a = -1;
        this.f37769b = -1;
        this.f37770c = -1;
        this.f37779l = -1;
        m57389i(context, attributeSet);
    }
}
