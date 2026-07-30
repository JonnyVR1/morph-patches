package com.p051p1.mobile.putong.core.p058ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import p153l.ohc0;

/* JADX INFO: loaded from: classes12.dex */
public class ImLinearMeasureOrderLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f37618a;

    /* JADX INFO: renamed from: b */
    public int f37619b;

    public ImLinearMeasureOrderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37618a = false;
        this.f37619b = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ohc0.f147411o);
        this.f37618a = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147415q, false);
        int i2 = typedArrayObtainStyledAttributes.getInt(ohc0.f147413p, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final View m57301a(int i) {
        return !this.f37618a ? getChildAt(i) : getChildAt((getChildCount() - 1) - i);
    }

    /* JADX INFO: renamed from: b */
    public final void m57302b(int i, int i2) {
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
    public final void m57303c(int i, int i2) {
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
    public final void m57304d(int i, int i2) {
        ImLinearMeasureOrderLayout imLinearMeasureOrderLayout;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int iMax = 0;
        while (i5 < childCount) {
            View viewM57301a = this.m57301a(i5);
            if (viewM57301a.getVisibility() == 8) {
                imLinearMeasureOrderLayout = this;
                i3 = i;
                i4 = i2;
            } else {
                imLinearMeasureOrderLayout = this;
                i3 = i;
                i4 = i2;
                imLinearMeasureOrderLayout.measureChildWithMargins(viewM57301a, i3, i6, i4, 0);
                int measuredWidth = i6 + viewM57301a.getMeasuredWidth();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM57301a.getLayoutParams();
                i6 = measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                iMax = Math.max(iMax, viewM57301a.getMeasuredHeight());
            }
            i5++;
            this = imLinearMeasureOrderLayout;
            i = i3;
            i2 = i4;
        }
        ImLinearMeasureOrderLayout imLinearMeasureOrderLayout2 = this;
        int paddingLeft = i6 + imLinearMeasureOrderLayout2.getPaddingLeft() + imLinearMeasureOrderLayout2.getPaddingRight();
        imLinearMeasureOrderLayout2.m57306f(i, i2, Math.max(iMax + imLinearMeasureOrderLayout2.getPaddingTop() + imLinearMeasureOrderLayout2.getPaddingBottom(), imLinearMeasureOrderLayout2.getSuggestedMinimumHeight()), Math.max(paddingLeft, imLinearMeasureOrderLayout2.getSuggestedMinimumWidth()));
    }

    /* JADX INFO: renamed from: e */
    public final void m57305e(int i, int i2) {
        ImLinearMeasureOrderLayout imLinearMeasureOrderLayout;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        int iMax = 0;
        int i6 = 0;
        while (i5 < childCount) {
            View viewM57301a = this.m57301a(i5);
            if (viewM57301a.getVisibility() == 8) {
                imLinearMeasureOrderLayout = this;
                i3 = i;
                i4 = i2;
            } else {
                imLinearMeasureOrderLayout = this;
                i3 = i;
                i4 = i2;
                imLinearMeasureOrderLayout.measureChildWithMargins(viewM57301a, i3, 0, i4, i6);
                int measuredHeight = i6 + viewM57301a.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM57301a.getLayoutParams();
                i6 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                iMax = Math.max(iMax, viewM57301a.getMeasuredWidth());
            }
            i5++;
            this = imLinearMeasureOrderLayout;
            i = i3;
            i2 = i4;
        }
        ImLinearMeasureOrderLayout imLinearMeasureOrderLayout2 = this;
        int paddingLeft = iMax + imLinearMeasureOrderLayout2.getPaddingLeft() + imLinearMeasureOrderLayout2.getPaddingRight();
        imLinearMeasureOrderLayout2.m57306f(i, i2, Math.max(i6 + imLinearMeasureOrderLayout2.getPaddingTop() + imLinearMeasureOrderLayout2.getPaddingBottom(), imLinearMeasureOrderLayout2.getSuggestedMinimumHeight()), Math.max(paddingLeft, imLinearMeasureOrderLayout2.getSuggestedMinimumWidth()));
    }

    /* JADX INFO: renamed from: f */
    public final void m57306f(int i, int i2, int i3, int i4) {
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
        if (this.f37619b == 1) {
            m57303c(i3 - i, i4 - i2);
        } else {
            m57302b(i3 - i, i4 - i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f37619b == 1) {
            m57305e(i, i2);
        } else {
            m57304d(i, i2);
        }
    }

    public void setOrientation(int i) {
        if (this.f37619b != i) {
            this.f37619b = i;
            requestLayout();
        }
    }

    public ImLinearMeasureOrderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImLinearMeasureOrderLayout(Context context) {
        this(context, null);
    }
}
