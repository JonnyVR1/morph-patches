package com.p046p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import p149l.b9c0;
import p149l.ffx;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class FeedLinearFillerMeasure extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f43404a;

    public FeedLinearFillerMeasure(Context context) {
        super(context);
        m66354a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m66354a(Context context, AttributeSet attributeSet, int i) {
        this.f43404a = -1;
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74323P3, i, 0);
            this.f43404a = typedArrayObtainStyledAttributes.getInt(b9c0.f74329Q3, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m66355b(View view, LinearLayout.LayoutParams layoutParams, int i, int i2) {
        int paddingTop;
        int measuredHeight;
        int i3 = layoutParams.gravity;
        if ((i3 & 112) == 16) {
            int paddingTop2 = ((getPaddingTop() + getMeasuredHeight()) - getPaddingBottom()) / 2;
            paddingTop = paddingTop2 - (view.getMeasuredHeight() / 2);
            measuredHeight = paddingTop2 + (view.getMeasuredHeight() / 2);
        } else if ((i3 & 112) == 80) {
            measuredHeight = getMeasuredHeight() - getPaddingBottom();
            paddingTop = measuredHeight - view.getMeasuredHeight();
        } else {
            paddingTop = getPaddingTop();
            measuredHeight = view.getMeasuredHeight() + paddingTop;
        }
        view.layout(i, paddingTop, i2, measuredHeight);
    }

    /* JADX INFO: renamed from: c */
    public int m66356c(int i, int i2, int i3) {
        int iM121198a = 0;
        if (getChildAt(i).getVisibility() == 8) {
            return 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i).getLayoutParams();
        int i4 = layoutParams.width;
        int iM121198a2 = (i4 <= 0 || i4 >= i2) ? ffx.m121198a(i2) : ffx.m121199b(i4);
        int i5 = layoutParams.height;
        if (i5 > 0) {
            iM121198a = ffx.m121199b(i5);
        } else if (i5 == -1) {
            iM121198a = ffx.m121199b(i3);
        } else if (i3 > 0) {
            iM121198a = ffx.m121198a(i3);
        }
        getChildAt(i).measure(iM121198a2, iM121198a);
        return getChildAt(i).getMeasuredWidth();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i5 = 0;
        while (i5 < getChildCount()) {
            View childAt = getChildAt(i5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if ((layoutParams.gravity & 7) != 3) {
                break;
            }
            if (childAt.getVisibility() != 8) {
                m66355b(childAt, layoutParams, paddingLeft, childAt.getMeasuredWidth() + paddingLeft);
                paddingLeft += childAt.getMeasuredWidth();
            }
            i5++;
        }
        for (int childCount = getChildCount() - 1; childCount >= i5; childCount--) {
            View childAt2 = getChildAt(childCount);
            if (childAt2.getVisibility() != 8) {
                m66355b(childAt2, (LinearLayout.LayoutParams) childAt2.getLayoutParams(), measuredWidth - childAt2.getMeasuredWidth(), measuredWidth);
                measuredWidth -= childAt2.getMeasuredWidth();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        int i4;
        if (isInEditMode()) {
            super.onMeasure(i, i2);
            return;
        }
        int iM121201d = (ffx.m121201d(i) - getPaddingLeft()) - getPaddingRight();
        int iM121201d2 = (ffx.m121201d(i2) - getPaddingBottom()) - getPaddingTop();
        int iM66356c = 0;
        if (iM121201d2 > 0 && getLayoutParams().height != -2) {
            if (this.f43404a != -1) {
                int i5 = 0;
                while (true) {
                    int childCount = getChildCount();
                    i4 = this.f43404a;
                    if (iM66356c >= childCount) {
                        break;
                    }
                    if (iM66356c != i4) {
                        int iM66356c2 = m66356c(iM66356c, iM121201d, iM121201d2);
                        iM121201d -= iM66356c2;
                        i5 += iM66356c2;
                    }
                    iM66356c++;
                }
                iM66356c = i5 + m66356c(i4, iM121201d, iM121201d2);
                getChildAt(this.f43404a).getMeasuredHeight();
            }
            if (iM66356c <= 0 || getLayoutParams().width != -2) {
                setMeasuredDimension(ffx.m121201d(i), ffx.m121201d(i2));
                return;
            } else {
                setMeasuredDimension(iM66356c + getPaddingLeft() + getPaddingRight(), ffx.m121201d(i2));
                return;
            }
        }
        if (this.f43404a != -1) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int childCount2 = getChildCount();
                i3 = this.f43404a;
                if (i6 >= childCount2) {
                    break;
                }
                if (i6 != i3) {
                    int iM66356c3 = m66356c(i6, iM121201d, 0);
                    iM121201d -= iM66356c3;
                    i7 += iM66356c3;
                    int measuredHeight2 = getChildAt(i6).getMeasuredHeight();
                    if (measuredHeight2 > i8) {
                        i8 = measuredHeight2;
                    }
                }
                i6++;
            }
            iM66356c = i7 + m66356c(i3, iM121201d, t100.m186890d(100.0f));
            measuredHeight = getChildAt(this.f43404a).getMeasuredHeight();
            if (measuredHeight <= i8) {
                measuredHeight = i8;
            }
        } else {
            measuredHeight = 0;
        }
        if (iM66356c <= 0 || getLayoutParams().width != -2) {
            setMeasuredDimension(ffx.m121201d(i), measuredHeight + getPaddingTop() + getPaddingBottom());
        } else {
            setMeasuredDimension(iM66356c + getPaddingLeft() + getPaddingRight(), measuredHeight + getPaddingTop() + getPaddingBottom());
        }
    }

    public FeedLinearFillerMeasure(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66354a(context, attributeSet, 0);
    }

    public FeedLinearFillerMeasure(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66354a(context, attributeSet, i);
    }
}
