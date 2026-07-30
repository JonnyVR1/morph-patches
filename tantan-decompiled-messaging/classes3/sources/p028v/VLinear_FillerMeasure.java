package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import l.b9c0;
import l.ffx;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VLinear_FillerMeasure extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f12764a;

    public VLinear_FillerMeasure(Context context) {
        super(context);
        m11547a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    private void m11547a(Context context, AttributeSet attributeSet, int i) {
        this.f12764a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.P3, i, 0);
            this.f12764a = typedArrayObtainStyledAttributes.getInt(b9c0.Q3, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11548b(View view, LinearLayout.LayoutParams layoutParams, int i, int i2) {
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
    public int m11549c(int i, int i2, int i3) {
        int iA = 0;
        if (getChildAt(i).getVisibility() == 8) {
            return 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i).getLayoutParams();
        int i4 = (i2 - layoutParams.leftMargin) - layoutParams.rightMargin;
        int i5 = layoutParams.width;
        int iA2 = (i5 <= 0 || i5 >= i4) ? ffx.a(i4) : ffx.b(i5);
        int i6 = layoutParams.height;
        if (i6 > 0) {
            iA = ffx.b(i6);
        } else if (i6 == -1) {
            iA = ffx.b(i3);
        } else if (i3 > 0) {
            iA = ffx.a(i3);
        }
        getChildAt(i).measure(iA2, iA);
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
                m11548b(childAt, layoutParams, paddingLeft + i6, i6 + paddingLeft + childAt.getMeasuredWidth());
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
                m11548b(childAt2, layoutParams2, measuredWidth2 - i7, measuredWidth - i7);
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
        int iD = (ffx.d(i) - getPaddingLeft()) - getPaddingRight();
        int iD2 = (ffx.d(i2) - getPaddingBottom()) - getPaddingTop();
        int iM11549c = 0;
        if (iD2 > 0 && getLayoutParams().height != -2) {
            if (this.f12764a != -1) {
                int i5 = 0;
                while (true) {
                    int childCount = getChildCount();
                    i4 = this.f12764a;
                    if (iM11549c >= childCount) {
                        break;
                    }
                    if (iM11549c != i4) {
                        int iM11549c2 = m11549c(iM11549c, iD, iD2);
                        iD -= iM11549c2;
                        i5 += iM11549c2;
                    }
                    iM11549c++;
                }
                iM11549c = i5 + m11549c(i4, iD, iD2);
                getChildAt(this.f12764a).getMeasuredHeight();
            }
            if (iM11549c <= 0 || getLayoutParams().width != -2) {
                setMeasuredDimension(ffx.d(i), ffx.d(i2));
                return;
            } else {
                setMeasuredDimension(iM11549c + getPaddingLeft() + getPaddingRight(), ffx.d(i2));
                return;
            }
        }
        if (this.f12764a != -1) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int childCount2 = getChildCount();
                i3 = this.f12764a;
                if (i6 >= childCount2) {
                    break;
                }
                if (i6 != i3) {
                    int iM11549c3 = m11549c(i6, iD, 0);
                    iD -= iM11549c3;
                    i7 += iM11549c3;
                    int measuredHeight2 = getChildAt(i6).getMeasuredHeight();
                    if (measuredHeight2 > i8) {
                        i8 = measuredHeight2;
                    }
                }
                i6++;
            }
            iM11549c = i7 + m11549c(i3, iD, t100.d(100.0f));
            measuredHeight = getChildAt(this.f12764a).getMeasuredHeight();
            if (measuredHeight <= i8) {
                measuredHeight = i8;
            }
        } else {
            measuredHeight = 0;
        }
        if (iM11549c <= 0 || getLayoutParams().width != -2) {
            setMeasuredDimension(ffx.d(i), measuredHeight + getPaddingTop() + getPaddingBottom());
        } else {
            setMeasuredDimension(iM11549c + getPaddingLeft() + getPaddingRight(), measuredHeight + getPaddingTop() + getPaddingBottom());
        }
    }

    public VLinear_FillerMeasure(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11547a(context, attributeSet, 0);
    }

    public VLinear_FillerMeasure(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11547a(context, attributeSet, i);
    }
}
