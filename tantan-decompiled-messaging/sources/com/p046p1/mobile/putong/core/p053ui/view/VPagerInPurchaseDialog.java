package com.p046p1.mobile.putong.core.p053ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p147v.VPagerNoPage;
import p149l.t100;
import p149l.z4c0;

/* JADX INFO: loaded from: classes9.dex */
public class VPagerInPurchaseDialog extends VPagerNoPage {

    /* JADX INFO: renamed from: M0 */
    public final int f36873M0;

    /* JADX INFO: renamed from: N0 */
    public final int f36874N0;

    /* JADX INFO: renamed from: O0 */
    public final int f36875O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f36876P0;

    public VPagerInPurchaseDialog(Context context) {
        super(context);
        this.f36873M0 = t100.m186890d(255.0f);
        this.f36874N0 = t100.m186890d(180.0f);
        this.f36875O0 = t100.m186890d(120.0f);
        this.f36876P0 = false;
    }

    public int getComponentsHeight() {
        return this.f36873M0 + this.f36874N0 + this.f36875O0;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > getComponentsHeight()) {
            setMeasuredDimension(getMeasuredWidth(), getComponentsHeight());
            if (this.f36876P0) {
                return;
            }
            this.f36876P0 = true;
            LinearLayout linearLayout = (LinearLayout) findViewById(z4c0.f201535i0);
            if (linearLayout != null) {
                linearLayout.setMinimumHeight(getComponentsHeight());
            }
        }
    }

    public VPagerInPurchaseDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36873M0 = t100.m186890d(255.0f);
        this.f36874N0 = t100.m186890d(180.0f);
        this.f36875O0 = t100.m186890d(120.0f);
        this.f36876P0 = false;
    }
}
