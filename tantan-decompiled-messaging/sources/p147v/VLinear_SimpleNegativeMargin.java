package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p149l.ffx;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear_SimpleNegativeMargin extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int[] f209143a;

    public VLinear_SimpleNegativeMargin(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public View m223071a(int i) {
        int[] iArr = this.f209143a;
        return iArr == null ? getChildAt(i) : getChildAt(iArr[i]);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View viewM223071a = m223071a(i5);
            if (viewM223071a.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM223071a.getLayoutParams();
                viewM223071a.layout(0, marginLayoutParams.topMargin + measuredHeight, i3, viewM223071a.getMeasuredHeight() + measuredHeight + marginLayoutParams.topMargin);
                measuredHeight += marginLayoutParams.topMargin + viewM223071a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM121201d = ffx.m121201d(i);
        int measuredHeight = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View viewM223071a = m223071a(i3);
            if (viewM223071a.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM223071a.getLayoutParams();
                if (i3 == getChildCount() - 1 && marginLayoutParams.height == -2) {
                    m223071a(i3).setMinimumHeight(ffx.m121201d(i2) - measuredHeight);
                }
                int i4 = marginLayoutParams.height;
                viewM223071a.measure(ffx.m121199b(iM121201d), i4 != -2 ? ffx.m121199b(ffx.m121201d(i4)) : ffx.m121198a(t100.m186890d(1000000.0f)));
                measuredHeight += marginLayoutParams.topMargin + viewM223071a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            }
        }
        setMeasuredDimension(iM121201d, measuredHeight);
    }

    public VLinear_SimpleNegativeMargin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VLinear_SimpleNegativeMargin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
