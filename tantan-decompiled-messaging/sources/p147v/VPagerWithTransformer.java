package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes3.dex */
public class VPagerWithTransformer extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public ViewPager.InterfaceC0717k f209254M0;

    public VPagerWithTransformer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    /* JADX INFO: renamed from: X */
    public void mo4180X(boolean z, ViewPager.InterfaceC0717k interfaceC0717k) {
        super.mo4180X(z, interfaceC0717k);
        this.f209254M0 = interfaceC0717k;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f209254M0 != null) {
            int scrollX = getScrollX();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!((ViewPager.C0713g) childAt.getLayoutParams()).f3297a) {
                    this.f209254M0.mo4203a(childAt, (childAt.getLeft() - scrollX) / ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()));
                }
            }
        }
    }
}
