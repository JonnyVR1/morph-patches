package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p153l.dox;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear_SimpleNegativeMargin extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int[] f210065a;

    public VLinear_SimpleNegativeMargin(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public View m224317a(int i) {
        int[] iArr = this.f210065a;
        return iArr == null ? getChildAt(i) : getChildAt(iArr[i]);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View viewM224317a = m224317a(i5);
            if (viewM224317a.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM224317a.getLayoutParams();
                viewM224317a.layout(0, marginLayoutParams.topMargin + measuredHeight, i3, viewM224317a.getMeasuredHeight() + measuredHeight + marginLayoutParams.topMargin);
                measuredHeight += marginLayoutParams.topMargin + viewM224317a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM117366d = dox.m117366d(i);
        int measuredHeight = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View viewM224317a = m224317a(i3);
            if (viewM224317a.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM224317a.getLayoutParams();
                if (i3 == getChildCount() - 1 && marginLayoutParams.height == -2) {
                    m224317a(i3).setMinimumHeight(dox.m117366d(i2) - measuredHeight);
                }
                int i4 = marginLayoutParams.height;
                viewM224317a.measure(dox.m117364b(iM117366d), i4 != -2 ? dox.m117364b(dox.m117366d(i4)) : dox.m117363a(qa00.m175859d(1000000.0f)));
                measuredHeight += marginLayoutParams.topMargin + viewM224317a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            }
        }
        setMeasuredDimension(iM117366d, measuredHeight);
    }

    public VLinear_SimpleNegativeMargin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VLinear_SimpleNegativeMargin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
