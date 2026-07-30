package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.ffx;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VLinear_SimpleNegativeMargin extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int[] f12768a;

    public VLinear_SimpleNegativeMargin(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public View m11551a(int i) {
        int[] iArr = this.f12768a;
        return iArr == null ? getChildAt(i) : getChildAt(iArr[i]);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View viewM11551a = m11551a(i5);
            if (viewM11551a.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM11551a.getLayoutParams();
                viewM11551a.layout(0, marginLayoutParams.topMargin + measuredHeight, i3, viewM11551a.getMeasuredHeight() + measuredHeight + marginLayoutParams.topMargin);
                measuredHeight += marginLayoutParams.topMargin + viewM11551a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iD = ffx.d(i);
        int measuredHeight = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View viewM11551a = m11551a(i3);
            if (viewM11551a.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM11551a.getLayoutParams();
                if (i3 == getChildCount() - 1 && marginLayoutParams.height == -2) {
                    m11551a(i3).setMinimumHeight(ffx.d(i2) - measuredHeight);
                }
                int i4 = marginLayoutParams.height;
                viewM11551a.measure(ffx.b(iD), i4 != -2 ? ffx.b(ffx.d(i4)) : ffx.a(t100.d(1000000.0f)));
                measuredHeight += marginLayoutParams.topMargin + viewM11551a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            }
        }
        setMeasuredDimension(iD, measuredHeight);
    }

    public VLinear_SimpleNegativeMargin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VLinear_SimpleNegativeMargin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
