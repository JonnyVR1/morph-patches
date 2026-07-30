package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p153l.dox;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear_TwoChildBottomMeasureFirst extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f210067a;

    public VLinear_TwoChildBottomMeasureFirst(Context context) {
        super(context);
        setChildrenDrawingOrderEnabled(true);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m224318a() {
        return this.f210067a;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (m224318a()) {
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
        getChildAt(0).measure(dox.m117363a(paddingLeft), dox.m117363a(paddingTop - measuredHeight));
        if (getLayoutParams().height == -1) {
            measuredHeight = paddingTop - getChildAt(0).getMeasuredHeight();
        }
        if (getChildAt(1).getLayoutParams().width == -1) {
            getChildAt(1).measure(dox.m117364b(paddingLeft), dox.m117364b(measuredHeight));
        } else {
            getChildAt(1).measure(dox.m117363a(paddingLeft), dox.m117364b(measuredHeight));
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
