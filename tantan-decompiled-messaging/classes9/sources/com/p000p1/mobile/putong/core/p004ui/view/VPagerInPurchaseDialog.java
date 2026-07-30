package com.p000p1.mobile.putong.core.p004ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import l.t100;
import l.z4c0;
import v.VPagerNoPage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VPagerInPurchaseDialog extends VPagerNoPage {

    /* JADX INFO: renamed from: M0 */
    public final int f6654M0;

    /* JADX INFO: renamed from: N0 */
    public final int f6655N0;

    /* JADX INFO: renamed from: O0 */
    public final int f6656O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f6657P0;

    public VPagerInPurchaseDialog(Context context) {
        super(context);
        this.f6654M0 = t100.d(255.0f);
        this.f6655N0 = t100.d(180.0f);
        this.f6656O0 = t100.d(120.0f);
        this.f6657P0 = false;
    }

    public int getComponentsHeight() {
        return this.f6654M0 + this.f6655N0 + this.f6656O0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*androidx.viewpager.widget.ViewPager*/.onMeasure(i, i2);
        if (getMeasuredHeight() > getComponentsHeight()) {
            setMeasuredDimension(getMeasuredWidth(), getComponentsHeight());
            if (this.f6657P0) {
                return;
            }
            this.f6657P0 = true;
            LinearLayout linearLayout = (LinearLayout) findViewById(z4c0.i0);
            if (linearLayout != null) {
                linearLayout.setMinimumHeight(getComponentsHeight());
            }
        }
    }

    public VPagerInPurchaseDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6654M0 = t100.d(255.0f);
        this.f6655N0 = t100.d(180.0f);
        this.f6656O0 = t100.d(120.0f);
        this.f6657P0 = false;
    }
}
