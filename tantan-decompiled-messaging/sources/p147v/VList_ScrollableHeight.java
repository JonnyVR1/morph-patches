package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p149l.ffx;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
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
        int iM121201d = (ffx.m121201d(i2) - getPaddingBottom()) - getPaddingTop();
        int iM186890d = iM121201d / t100.m186890d(48.0f);
        if (iM186890d >= getAdapter().getCount()) {
            super.onMeasure(i, i2);
            return;
        }
        int iM186890d2 = iM121201d % t100.m186890d(48.0f);
        if (iM186890d < getAdapter().getCount() - 1 && iM186890d2 >= t100.m186890d(36.0f)) {
            iM121201d -= t100.m186890d(30.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iM121201d + getPaddingBottom() + getPaddingTop(), View.MeasureSpec.getMode(i2)));
    }

    public VList_ScrollableHeight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VList_ScrollableHeight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
