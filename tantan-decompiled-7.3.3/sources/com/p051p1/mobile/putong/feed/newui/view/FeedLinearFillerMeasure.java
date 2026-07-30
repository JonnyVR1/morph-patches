package com.p051p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import p153l.dox;
import p153l.hhc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class FeedLinearFillerMeasure extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f44252a;

    public FeedLinearFillerMeasure(Context context) {
        super(context);
        m67537a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m67537a(Context context, AttributeSet attributeSet, int i) {
        this.f44252a = -1;
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109632P3, i, 0);
            this.f44252a = typedArrayObtainStyledAttributes.getInt(hhc0.f109638Q3, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m67538b(View view, LinearLayout.LayoutParams layoutParams, int i, int i2) {
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
    public int m67539c(int i, int i2, int i3) {
        int iM117363a = 0;
        if (getChildAt(i).getVisibility() == 8) {
            return 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i).getLayoutParams();
        int i4 = layoutParams.width;
        int iM117363a2 = (i4 <= 0 || i4 >= i2) ? dox.m117363a(i2) : dox.m117364b(i4);
        int i5 = layoutParams.height;
        if (i5 > 0) {
            iM117363a = dox.m117364b(i5);
        } else if (i5 == -1) {
            iM117363a = dox.m117364b(i3);
        } else if (i3 > 0) {
            iM117363a = dox.m117363a(i3);
        }
        getChildAt(i).measure(iM117363a2, iM117363a);
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
                m67538b(childAt, layoutParams, paddingLeft, childAt.getMeasuredWidth() + paddingLeft);
                paddingLeft += childAt.getMeasuredWidth();
            }
            i5++;
        }
        for (int childCount = getChildCount() - 1; childCount >= i5; childCount--) {
            View childAt2 = getChildAt(childCount);
            if (childAt2.getVisibility() != 8) {
                m67538b(childAt2, (LinearLayout.LayoutParams) childAt2.getLayoutParams(), measuredWidth - childAt2.getMeasuredWidth(), measuredWidth);
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
        int iM117366d = (dox.m117366d(i) - getPaddingLeft()) - getPaddingRight();
        int iM117366d2 = (dox.m117366d(i2) - getPaddingBottom()) - getPaddingTop();
        int iM67539c = 0;
        if (iM117366d2 > 0 && getLayoutParams().height != -2) {
            if (this.f44252a != -1) {
                int i5 = 0;
                while (true) {
                    int childCount = getChildCount();
                    i4 = this.f44252a;
                    if (iM67539c >= childCount) {
                        break;
                    }
                    if (iM67539c != i4) {
                        int iM67539c2 = m67539c(iM67539c, iM117366d, iM117366d2);
                        iM117366d -= iM67539c2;
                        i5 += iM67539c2;
                    }
                    iM67539c++;
                }
                iM67539c = i5 + m67539c(i4, iM117366d, iM117366d2);
                getChildAt(this.f44252a).getMeasuredHeight();
            }
            if (iM67539c <= 0 || getLayoutParams().width != -2) {
                setMeasuredDimension(dox.m117366d(i), dox.m117366d(i2));
                return;
            } else {
                setMeasuredDimension(iM67539c + getPaddingLeft() + getPaddingRight(), dox.m117366d(i2));
                return;
            }
        }
        if (this.f44252a != -1) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int childCount2 = getChildCount();
                i3 = this.f44252a;
                if (i6 >= childCount2) {
                    break;
                }
                if (i6 != i3) {
                    int iM67539c3 = m67539c(i6, iM117366d, 0);
                    iM117366d -= iM67539c3;
                    i7 += iM67539c3;
                    int measuredHeight2 = getChildAt(i6).getMeasuredHeight();
                    if (measuredHeight2 > i8) {
                        i8 = measuredHeight2;
                    }
                }
                i6++;
            }
            iM67539c = i7 + m67539c(i3, iM117366d, qa00.m175859d(100.0f));
            measuredHeight = getChildAt(this.f44252a).getMeasuredHeight();
            if (measuredHeight <= i8) {
                measuredHeight = i8;
            }
        } else {
            measuredHeight = 0;
        }
        if (iM67539c <= 0 || getLayoutParams().width != -2) {
            setMeasuredDimension(dox.m117366d(i), measuredHeight + getPaddingTop() + getPaddingBottom());
        } else {
            setMeasuredDimension(iM67539c + getPaddingLeft() + getPaddingRight(), measuredHeight + getPaddingTop() + getPaddingBottom());
        }
    }

    public FeedLinearFillerMeasure(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m67537a(context, attributeSet, 0);
    }

    public FeedLinearFillerMeasure(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67537a(context, attributeSet, i);
    }
}
