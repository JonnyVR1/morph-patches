package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import l.ffx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VLinear_TwoChildBottomMeasureFirst extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f12770a;

    public VLinear_TwoChildBottomMeasureFirst(Context context) {
        super(context);
        setChildrenDrawingOrderEnabled(true);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11552a() {
        return this.f12770a;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (m11552a()) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = size - (getPaddingLeft() + getPaddingRight());
        int paddingTop = size2 - (getPaddingTop() + getPaddingBottom());
        int measuredHeight = getChildAt(1).getLayoutParams().height;
        if (getChildAt(1).getVisibility() == 8) {
            measuredHeight = 0;
        }
        getChildAt(0).measure(ffx.a(paddingLeft), ffx.a(paddingTop - measuredHeight));
        if (getLayoutParams().height == -1) {
            measuredHeight = paddingTop - getChildAt(0).getMeasuredHeight();
        }
        if (getChildAt(1).getLayoutParams().width == -1) {
            getChildAt(1).measure(ffx.b(paddingLeft), ffx.b(measuredHeight));
        } else {
            getChildAt(1).measure(ffx.a(paddingLeft), ffx.b(measuredHeight));
        }
        if (getLayoutParams().width == -1 && getLayoutParams().height == -1) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        } else {
            setMeasuredDimension(getChildAt(0).getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), getChildAt(0).getMeasuredHeight() + getChildAt(1).getMeasuredHeight() + getPaddingBottom() + getPaddingTop());
        }
    }

    public VLinear_TwoChildBottomMeasureFirst(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setChildrenDrawingOrderEnabled(true);
    }

    public VLinear_TwoChildBottomMeasureFirst(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setChildrenDrawingOrderEnabled(true);
    }
}
