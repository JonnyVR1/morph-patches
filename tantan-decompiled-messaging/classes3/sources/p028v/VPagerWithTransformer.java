package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VPagerWithTransformer extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public ViewPager.k f12879M0;

    public VPagerWithTransformer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: X */
    public void m11628X(boolean z, ViewPager.k kVar) {
        super.X(z, kVar);
        this.f12879M0 = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f12879M0 != null) {
            int scrollX = getScrollX();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getLayoutParams().a) {
                    this.f12879M0.a(childAt, (childAt.getLeft() - scrollX) / ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()));
                }
            }
        }
    }
}
