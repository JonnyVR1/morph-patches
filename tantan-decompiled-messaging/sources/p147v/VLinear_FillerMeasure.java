package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p149l.b9c0;
import p149l.ffx;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear_FillerMeasure extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f209139a;

    public VLinear_FillerMeasure(Context context) {
        super(context);
        m223067a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    private void m223067a(Context context, AttributeSet attributeSet, int i) {
        this.f209139a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74323P3, i, 0);
            this.f209139a = typedArrayObtainStyledAttributes.getInt(b9c0.f74329Q3, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m223068b(View view, LinearLayout.LayoutParams layoutParams, int i, int i2) {
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
    public int m223069c(int i, int i2, int i3) {
        int iM121198a = 0;
        if (getChildAt(i).getVisibility() == 8) {
            return 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i).getLayoutParams();
        int i4 = (i2 - layoutParams.leftMargin) - layoutParams.rightMargin;
        int i5 = layoutParams.width;
        int iM121198a2 = (i5 <= 0 || i5 >= i4) ? ffx.m121198a(i4) : ffx.m121199b(i5);
        int i6 = layoutParams.height;
        if (i6 > 0) {
            iM121198a = ffx.m121199b(i6);
        } else if (i6 == -1) {
            iM121198a = ffx.m121199b(i3);
        } else if (i3 > 0) {
            iM121198a = ffx.m121198a(i3);
        }
        getChildAt(i).measure(iM121198a2, iM121198a);
        return getChildAt(i).getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
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
                int i6 = layoutParams.leftMargin;
                m223068b(childAt, layoutParams, paddingLeft + i6, i6 + paddingLeft + childAt.getMeasuredWidth());
                paddingLeft += childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            }
            i5++;
        }
        for (int childCount = getChildCount() - 1; childCount >= i5; childCount--) {
            View childAt2 = getChildAt(childCount);
            if (childAt2.getVisibility() != 8) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                int measuredWidth2 = measuredWidth - childAt2.getMeasuredWidth();
                int i7 = layoutParams2.rightMargin;
                m223068b(childAt2, layoutParams2, measuredWidth2 - i7, measuredWidth - i7);
                measuredWidth -= (childAt2.getMeasuredWidth() + layoutParams2.leftMargin) + layoutParams2.rightMargin;
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
        int iM223069c = 0;
        if (iM121201d2 > 0 && getLayoutParams().height != -2) {
            if (this.f209139a != -1) {
                int i5 = 0;
                while (true) {
                    int childCount = getChildCount();
                    i4 = this.f209139a;
                    if (iM223069c >= childCount) {
                        break;
                    }
                    if (iM223069c != i4) {
                        int iM223069c2 = m223069c(iM223069c, iM121201d, iM121201d2);
                        iM121201d -= iM223069c2;
                        i5 += iM223069c2;
                    }
                    iM223069c++;
                }
                iM223069c = i5 + m223069c(i4, iM121201d, iM121201d2);
                getChildAt(this.f209139a).getMeasuredHeight();
            }
            if (iM223069c <= 0 || getLayoutParams().width != -2) {
                setMeasuredDimension(ffx.m121201d(i), ffx.m121201d(i2));
                return;
            } else {
                setMeasuredDimension(iM223069c + getPaddingLeft() + getPaddingRight(), ffx.m121201d(i2));
                return;
            }
        }
        if (this.f209139a != -1) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int childCount2 = getChildCount();
                i3 = this.f209139a;
                if (i6 >= childCount2) {
                    break;
                }
                if (i6 != i3) {
                    int iM223069c3 = m223069c(i6, iM121201d, 0);
                    iM121201d -= iM223069c3;
                    i7 += iM223069c3;
                    int measuredHeight2 = getChildAt(i6).getMeasuredHeight();
                    if (measuredHeight2 > i8) {
                        i8 = measuredHeight2;
                    }
                }
                i6++;
            }
            iM223069c = i7 + m223069c(i3, iM121201d, t100.m186890d(100.0f));
            measuredHeight = getChildAt(this.f209139a).getMeasuredHeight();
            if (measuredHeight <= i8) {
                measuredHeight = i8;
            }
        } else {
            measuredHeight = 0;
        }
        if (iM223069c <= 0 || getLayoutParams().width != -2) {
            setMeasuredDimension(ffx.m121201d(i), measuredHeight + getPaddingTop() + getPaddingBottom());
        } else {
            setMeasuredDimension(iM223069c + getPaddingLeft() + getPaddingRight(), measuredHeight + getPaddingTop() + getPaddingBottom());
        }
    }

    public VLinear_FillerMeasure(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223067a(context, attributeSet, 0);
    }

    public VLinear_FillerMeasure(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223067a(context, attributeSet, i);
    }
}
