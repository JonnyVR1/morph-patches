package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.ffx;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VList_ScrollableHeight extends VList {
    public VList_ScrollableHeight(Context context) {
        super(context);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (getAdapter() == null || getAdapter().getCount() <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int iD = (ffx.d(i2) - getPaddingBottom()) - getPaddingTop();
        int iD2 = iD / t100.d(48.0f);
        if (iD2 >= getAdapter().getCount()) {
            super.onMeasure(i, i2);
            return;
        }
        int iD3 = iD % t100.d(48.0f);
        if (iD2 < getAdapter().getCount() - 1 && iD3 >= t100.d(36.0f)) {
            iD -= t100.d(30.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iD + getPaddingBottom() + getPaddingTop(), View.MeasureSpec.getMode(i2)));
    }

    public VList_ScrollableHeight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VList_ScrollableHeight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
