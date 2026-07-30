package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import l.ffx;
import l.ikh0;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VPager_SquaredRefactor extends VPager {

    /* JADX INFO: renamed from: P0 */
    public float f2081P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f2082Q0;

    /* JADX INFO: renamed from: R0 */
    public float f2083R0;

    /* JADX INFO: renamed from: S0 */
    public float f2084S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f2085T0;

    /* JADX INFO: renamed from: U0 */
    public final int f2086U0;

    public VPager_SquaredRefactor(Context context) {
        super(context);
        this.f2081P0 = 0.8f;
        this.f2082Q0 = false;
        this.f2085T0 = false;
        this.f2086U0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public final void m3605d0(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f2082Q0) {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f2083R0 = motionEvent.getX();
                this.f2084S0 = motionEvent.getY();
                this.f2085T0 = false;
                m3605d0(true);
            } else if (action == 1) {
                this.f2085T0 = false;
                m3605d0(false);
            } else if (action != 2) {
                if (action == 3) {
                    this.f2085T0 = false;
                    m3605d0(false);
                }
            } else if (!this.f2085T0) {
                float fAbs = Math.abs(motionEvent.getX() - this.f2083R0);
                float fAbs2 = Math.abs(motionEvent.getY() - this.f2084S0);
                int i = this.f2086U0;
                if (fAbs >= i || fAbs2 >= i) {
                    this.f2085T0 = true;
                    if (fAbs > fAbs2) {
                        m3605d0(true);
                    } else {
                        m3605d0(false);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getCurrentWidthHeightRate() {
        return this.f2081P0;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        int iA = ikh0.a(i, i2);
        float f = this.f2081P0;
        if (f <= 0.0f || f >= 1.0f) {
            super.onMeasure(iA, iA);
            return;
        }
        int iD = ffx.d(i);
        super.onMeasure(ffx.b(iD), ffx.b((int) (iD / this.f2081P0)));
    }

    public void setPreferVPagerOnHorizontalConflict(boolean z) {
        this.f2082Q0 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWidthHeightRate(float f) {
        boolean z = f != this.f2081P0;
        this.f2081P0 = f;
        if (z) {
            invalidate();
        }
    }

    public VPager_SquaredRefactor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2081P0 = 0.8f;
        this.f2082Q0 = false;
        this.f2085T0 = false;
        this.f2086U0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
