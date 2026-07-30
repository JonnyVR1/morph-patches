package com.p051p1.mobile.putong.core.p058ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p151v.VPagerNoPage;
import p153l.fdc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class VPagerInPurchaseDialog extends VPagerNoPage {

    /* JADX INFO: renamed from: M0 */
    public final int f37721M0;

    /* JADX INFO: renamed from: N0 */
    public final int f37722N0;

    /* JADX INFO: renamed from: O0 */
    public final int f37723O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f37724P0;

    public VPagerInPurchaseDialog(Context context) {
        super(context);
        this.f37721M0 = qa00.m175859d(255.0f);
        this.f37722N0 = qa00.m175859d(180.0f);
        this.f37723O0 = qa00.m175859d(120.0f);
        this.f37724P0 = false;
    }

    public int getComponentsHeight() {
        return this.f37721M0 + this.f37722N0 + this.f37723O0;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > getComponentsHeight()) {
            setMeasuredDimension(getMeasuredWidth(), getComponentsHeight());
            if (this.f37724P0) {
                return;
            }
            this.f37724P0 = true;
            LinearLayout linearLayout = (LinearLayout) findViewById(fdc0.f98411i0);
            if (linearLayout != null) {
                linearLayout.setMinimumHeight(getComponentsHeight());
            }
        }
    }

    public VPagerInPurchaseDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37721M0 = qa00.m175859d(255.0f);
        this.f37722N0 = qa00.m175859d(180.0f);
        this.f37723O0 = qa00.m175859d(120.0f);
        this.f37724P0 = false;
    }
}
