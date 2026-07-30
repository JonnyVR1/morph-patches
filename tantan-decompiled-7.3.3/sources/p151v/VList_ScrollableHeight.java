package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p153l.dox;
import p153l.qa00;

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
        int iM117366d = (dox.m117366d(i2) - getPaddingBottom()) - getPaddingTop();
        int iM175859d = iM117366d / qa00.m175859d(48.0f);
        if (iM175859d >= getAdapter().getCount()) {
            super.onMeasure(i, i2);
            return;
        }
        int iM175859d2 = iM117366d % qa00.m175859d(48.0f);
        if (iM175859d < getAdapter().getCount() - 1 && iM175859d2 >= qa00.m175859d(36.0f)) {
            iM117366d -= qa00.m175859d(30.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iM117366d + getPaddingBottom() + getPaddingTop(), View.MeasureSpec.getMode(i2)));
    }

    public VList_ScrollableHeight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VList_ScrollableHeight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
