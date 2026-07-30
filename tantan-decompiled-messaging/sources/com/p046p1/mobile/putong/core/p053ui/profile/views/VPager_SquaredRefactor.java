package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p147v.VPager;
import p149l.ffx;
import p149l.ikh0;

/* JADX INFO: loaded from: classes4.dex */
public class VPager_SquaredRefactor extends VPager {

    /* JADX INFO: renamed from: P0 */
    public float f34259P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f34260Q0;

    /* JADX INFO: renamed from: R0 */
    public float f34261R0;

    /* JADX INFO: renamed from: S0 */
    public float f34262S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f34263T0;

    /* JADX INFO: renamed from: U0 */
    public final int f34264U0;

    public VPager_SquaredRefactor(Context context) {
        super(context);
        this.f34259P0 = 0.8f;
        this.f34260Q0 = false;
        this.f34263T0 = false;
        this.f34264U0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m53047d0(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    @Override // p147v.VPager, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f34260Q0) {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f34261R0 = motionEvent.getX();
                this.f34262S0 = motionEvent.getY();
                this.f34263T0 = false;
                m53047d0(true);
            } else if (action == 1) {
                this.f34263T0 = false;
                m53047d0(false);
            } else if (action != 2) {
                if (action == 3) {
                    this.f34263T0 = false;
                    m53047d0(false);
                }
            } else if (!this.f34263T0) {
                float fAbs = Math.abs(motionEvent.getX() - this.f34261R0);
                float fAbs2 = Math.abs(motionEvent.getY() - this.f34262S0);
                int i = this.f34264U0;
                if (fAbs >= i || fAbs2 >= i) {
                    this.f34263T0 = true;
                    if (fAbs > fAbs2) {
                        m53047d0(true);
                    } else {
                        m53047d0(false);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getCurrentWidthHeightRate() {
        return this.f34259P0;
    }

    @Override // p147v.VPager, androidx.viewpager.widget.ViewPager, android.view.View
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
        int iM136799a = ikh0.m136799a(i, i2);
        float f = this.f34259P0;
        if (f <= 0.0f || f >= 1.0f) {
            super.onMeasure(iM136799a, iM136799a);
            return;
        }
        int iM121201d = ffx.m121201d(i);
        super.onMeasure(ffx.m121199b(iM121201d), ffx.m121199b((int) (iM121201d / this.f34259P0)));
    }

    public void setPreferVPagerOnHorizontalConflict(boolean z) {
        this.f34260Q0 = z;
    }

    public void setWidthHeightRate(float f) {
        boolean z = f != this.f34259P0;
        this.f34259P0 = f;
        if (z) {
            invalidate();
        }
    }

    public VPager_SquaredRefactor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34259P0 = 0.8f;
        this.f34260Q0 = false;
        this.f34263T0 = false;
        this.f34264U0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
