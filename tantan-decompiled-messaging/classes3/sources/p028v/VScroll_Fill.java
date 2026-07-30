package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VScroll_Fill extends VScroll {
    public VScroll_Fill(Context context) {
        super(context);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getMeasuredHeight() < getMeasuredHeight()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public VScroll_Fill(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VScroll_Fill(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
