package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p151v.VPager;
import p153l.dox;
import p153l.psh0;

/* JADX INFO: loaded from: classes4.dex */
public class VPager_SquaredRefactor extends VPager {

    /* JADX INFO: renamed from: P0 */
    public float f35107P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f35108Q0;

    /* JADX INFO: renamed from: R0 */
    public float f35109R0;

    /* JADX INFO: renamed from: S0 */
    public float f35110S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f35111T0;

    /* JADX INFO: renamed from: U0 */
    public final int f35112U0;

    public VPager_SquaredRefactor(Context context) {
        super(context);
        this.f35107P0 = 0.8f;
        this.f35108Q0 = false;
        this.f35111T0 = false;
        this.f35112U0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m54230d0(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    @Override // p151v.VPager, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f35108Q0) {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f35109R0 = motionEvent.getX();
                this.f35110S0 = motionEvent.getY();
                this.f35111T0 = false;
                m54230d0(true);
            } else if (action == 1) {
                this.f35111T0 = false;
                m54230d0(false);
            } else if (action != 2) {
                if (action == 3) {
                    this.f35111T0 = false;
                    m54230d0(false);
                }
            } else if (!this.f35111T0) {
                float fAbs = Math.abs(motionEvent.getX() - this.f35109R0);
                float fAbs2 = Math.abs(motionEvent.getY() - this.f35110S0);
                int i = this.f35112U0;
                if (fAbs >= i || fAbs2 >= i) {
                    this.f35111T0 = true;
                    if (fAbs > fAbs2) {
                        m54230d0(true);
                    } else {
                        m54230d0(false);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getCurrentWidthHeightRate() {
        return this.f35107P0;
    }

    @Override // p151v.VPager, androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            int size = View.MeasureSpec.getSize(i);
            if (size > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (size * 0.8f), 1073741824));
                return;
            } else {
                super.onMeasure(i, i2);
                return;
            }
        }
        int iM173642a = psh0.m173642a(i, i2);
        float f = this.f35107P0;
        if (f <= 0.0f || f >= 1.0f) {
            super.onMeasure(iM173642a, iM173642a);
            return;
        }
        int iM117366d = dox.m117366d(i);
        super.onMeasure(dox.m117364b(iM117366d), dox.m117364b((int) (iM117366d / this.f35107P0)));
    }

    public void setPreferVPagerOnHorizontalConflict(boolean z) {
        this.f35108Q0 = z;
    }

    public void setWidthHeightRate(float f) {
        boolean z = f != this.f35107P0;
        this.f35107P0 = f;
        if (z) {
            invalidate();
        }
    }

    public VPager_SquaredRefactor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35107P0 = 0.8f;
        this.f35108Q0 = false;
        this.f35111T0 = false;
        this.f35112U0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
