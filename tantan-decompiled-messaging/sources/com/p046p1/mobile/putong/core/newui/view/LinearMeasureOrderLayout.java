package com.p046p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import p149l.g9c0;

/* JADX INFO: loaded from: classes11.dex */
public class LinearMeasureOrderLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f26927a;

    /* JADX INFO: renamed from: b */
    public int f26928b;

    public LinearMeasureOrderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26927a = false;
        this.f26928b = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g9c0.f101556a);
        this.f26927a = typedArrayObtainStyledAttributes.getBoolean(g9c0.f101558c, false);
        int i2 = typedArrayObtainStyledAttributes.getInt(g9c0.f101557b, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final View m43718a(int i) {
        return !this.f26927a ? getChildAt(i) : getChildAt((getChildCount() - 1) - i);
    }

    /* JADX INFO: renamed from: b */
    public final void m43719b(int i, int i2) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int i4 = paddingLeft + layoutParams.leftMargin;
                int i5 = layoutParams.gravity;
                if (i5 == -1) {
                    i5 = BadgeDrawable.TOP_START;
                }
                int i6 = i5 & 112;
                int measuredHeight = i6 != 16 ? i6 != 80 ? layoutParams.topMargin : (i2 - childAt.getMeasuredHeight()) - layoutParams.bottomMargin : (i2 - childAt.getMeasuredHeight()) / 2;
                childAt.layout(i4, measuredHeight, childAt.getMeasuredWidth() + i4, childAt.getMeasuredHeight() + measuredHeight);
                paddingLeft = i4 + childAt.getMeasuredWidth() + layoutParams.rightMargin;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m43720c(int i, int i2) {
        int childCount = getChildCount();
        int paddingTop = getPaddingTop();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int i4 = paddingTop + layoutParams.topMargin;
                int i5 = layoutParams.gravity;
                if (i5 == -1) {
                    i5 = BadgeDrawable.TOP_START;
                }
                int i6 = i5 & 7;
                int measuredWidth = i6 != 1 ? i6 != 5 ? layoutParams.leftMargin : (i - layoutParams.rightMargin) - childAt.getMeasuredWidth() : (i - childAt.getMeasuredWidth()) / 2;
                childAt.layout(measuredWidth, i4, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + i4);
                paddingTop = i4 + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m43721d(int i, int i2) {
        LinearMeasureOrderLayout linearMeasureOrderLayout;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int iMax = 0;
        while (i5 < childCount) {
            View viewM43718a = this.m43718a(i5);
            if (viewM43718a.getVisibility() == 8) {
                linearMeasureOrderLayout = this;
                i3 = i;
                i4 = i2;
            } else {
                linearMeasureOrderLayout = this;
                i3 = i;
                i4 = i2;
                linearMeasureOrderLayout.measureChildWithMargins(viewM43718a, i3, i6, i4, 0);
                int measuredWidth = i6 + viewM43718a.getMeasuredWidth();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM43718a.getLayoutParams();
                i6 = measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                iMax = Math.max(iMax, viewM43718a.getMeasuredHeight());
            }
            i5++;
            this = linearMeasureOrderLayout;
            i = i3;
            i2 = i4;
        }
        LinearMeasureOrderLayout linearMeasureOrderLayout2 = this;
        int paddingLeft = i6 + linearMeasureOrderLayout2.getPaddingLeft() + linearMeasureOrderLayout2.getPaddingRight();
        linearMeasureOrderLayout2.m43723f(i, i2, Math.max(iMax + linearMeasureOrderLayout2.getPaddingTop() + linearMeasureOrderLayout2.getPaddingBottom(), linearMeasureOrderLayout2.getSuggestedMinimumHeight()), Math.max(paddingLeft, linearMeasureOrderLayout2.getSuggestedMinimumWidth()));
    }

    /* JADX INFO: renamed from: e */
    public final void m43722e(int i, int i2) {
        LinearMeasureOrderLayout linearMeasureOrderLayout;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        int iMax = 0;
        int i6 = 0;
        while (i5 < childCount) {
            View viewM43718a = this.m43718a(i5);
            if (viewM43718a.getVisibility() == 8) {
                linearMeasureOrderLayout = this;
                i3 = i;
                i4 = i2;
            } else {
                linearMeasureOrderLayout = this;
                i3 = i;
                i4 = i2;
                linearMeasureOrderLayout.measureChildWithMargins(viewM43718a, i3, 0, i4, i6);
                int measuredHeight = i6 + viewM43718a.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM43718a.getLayoutParams();
                i6 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                iMax = Math.max(iMax, viewM43718a.getMeasuredWidth());
            }
            i5++;
            this = linearMeasureOrderLayout;
            i = i3;
            i2 = i4;
        }
        LinearMeasureOrderLayout linearMeasureOrderLayout2 = this;
        int paddingLeft = iMax + linearMeasureOrderLayout2.getPaddingLeft() + linearMeasureOrderLayout2.getPaddingRight();
        linearMeasureOrderLayout2.m43723f(i, i2, Math.max(i6 + linearMeasureOrderLayout2.getPaddingTop() + linearMeasureOrderLayout2.getPaddingBottom(), linearMeasureOrderLayout2.getSuggestedMinimumHeight()), Math.max(paddingLeft, linearMeasureOrderLayout2.getSuggestedMinimumWidth()));
    }

    /* JADX INFO: renamed from: f */
    public final void m43723f(int i, int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            i4 = Math.min(size, i4);
        } else if (mode != 0) {
            i4 = mode != 1073741824 ? 0 : size;
        }
        if (mode2 == Integer.MIN_VALUE) {
            i3 = Math.min(size2, i3);
        } else if (mode2 != 0) {
            i3 = mode2 != 1073741824 ? 0 : size2;
        }
        setMeasuredDimension(i4, i3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f26928b == 1) {
            m43720c(i3 - i, i4 - i2);
        } else {
            m43719b(i3 - i, i4 - i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f26928b == 1) {
            m43722e(i, i2);
        } else {
            m43721d(i, i2);
        }
    }

    public void setOrientation(int i) {
        if (this.f26928b != i) {
            this.f26928b = i;
            requestLayout();
        }
    }

    public LinearMeasureOrderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearMeasureOrderLayout(Context context) {
        this(context, null);
    }
}
