package com.p000p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import l.b9c0;
import l.ffx;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedLinearFillerMeasure extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f4865a;

    public FeedLinearFillerMeasure(Context context) {
        super(context);
        m7519a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m7519a(Context context, AttributeSet attributeSet, int i) {
        this.f4865a = -1;
        if (NullChecker.a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.P3, i, 0);
            this.f4865a = typedArrayObtainStyledAttributes.getInt(b9c0.Q3, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7520b(View view, LinearLayout.LayoutParams layoutParams, int i, int i2) {
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
    public int m7521c(int i, int i2, int i3) {
        int iA = 0;
        if (getChildAt(i).getVisibility() == 8) {
            return 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i).getLayoutParams();
        int i4 = layoutParams.width;
        int iA2 = (i4 <= 0 || i4 >= i2) ? ffx.a(i2) : ffx.b(i4);
        int i5 = layoutParams.height;
        if (i5 > 0) {
            iA = ffx.b(i5);
        } else if (i5 == -1) {
            iA = ffx.b(i3);
        } else if (i3 > 0) {
            iA = ffx.a(i3);
        }
        getChildAt(i).measure(iA2, iA);
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
                m7520b(childAt, layoutParams, paddingLeft, childAt.getMeasuredWidth() + paddingLeft);
                paddingLeft += childAt.getMeasuredWidth();
            }
            i5++;
        }
        for (int childCount = getChildCount() - 1; childCount >= i5; childCount--) {
            View childAt2 = getChildAt(childCount);
            if (childAt2.getVisibility() != 8) {
                m7520b(childAt2, (LinearLayout.LayoutParams) childAt2.getLayoutParams(), measuredWidth - childAt2.getMeasuredWidth(), measuredWidth);
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
        int iD = (ffx.d(i) - getPaddingLeft()) - getPaddingRight();
        int iD2 = (ffx.d(i2) - getPaddingBottom()) - getPaddingTop();
        int iM7521c = 0;
        if (iD2 > 0 && getLayoutParams().height != -2) {
            if (this.f4865a != -1) {
                int i5 = 0;
                while (true) {
                    int childCount = getChildCount();
                    i4 = this.f4865a;
                    if (iM7521c >= childCount) {
                        break;
                    }
                    if (iM7521c != i4) {
                        int iM7521c2 = m7521c(iM7521c, iD, iD2);
                        iD -= iM7521c2;
                        i5 += iM7521c2;
                    }
                    iM7521c++;
                }
                iM7521c = i5 + m7521c(i4, iD, iD2);
                getChildAt(this.f4865a).getMeasuredHeight();
            }
            if (iM7521c <= 0 || getLayoutParams().width != -2) {
                setMeasuredDimension(ffx.d(i), ffx.d(i2));
                return;
            } else {
                setMeasuredDimension(iM7521c + getPaddingLeft() + getPaddingRight(), ffx.d(i2));
                return;
            }
        }
        if (this.f4865a != -1) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int childCount2 = getChildCount();
                i3 = this.f4865a;
                if (i6 >= childCount2) {
                    break;
                }
                if (i6 != i3) {
                    int iM7521c3 = m7521c(i6, iD, 0);
                    iD -= iM7521c3;
                    i7 += iM7521c3;
                    int measuredHeight2 = getChildAt(i6).getMeasuredHeight();
                    if (measuredHeight2 > i8) {
                        i8 = measuredHeight2;
                    }
                }
                i6++;
            }
            iM7521c = i7 + m7521c(i3, iD, t100.d(100.0f));
            measuredHeight = getChildAt(this.f4865a).getMeasuredHeight();
            if (measuredHeight <= i8) {
                measuredHeight = i8;
            }
        } else {
            measuredHeight = 0;
        }
        if (iM7521c <= 0 || getLayoutParams().width != -2) {
            setMeasuredDimension(ffx.d(i), measuredHeight + getPaddingTop() + getPaddingBottom());
        } else {
            setMeasuredDimension(iM7521c + getPaddingLeft() + getPaddingRight(), measuredHeight + getPaddingTop() + getPaddingBottom());
        }
    }

    public FeedLinearFillerMeasure(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7519a(context, attributeSet, 0);
    }

    public FeedLinearFillerMeasure(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7519a(context, attributeSet, i);
    }
}
