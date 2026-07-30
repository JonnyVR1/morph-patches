package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import p149l.upk0;
import p149l.w660;
import p149l.x3w;

/* JADX INFO: loaded from: classes13.dex */
public class LoopViewPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public int f44765M0;

    /* JADX INFO: renamed from: N0 */
    public int f44766N0;

    /* JADX INFO: renamed from: O0 */
    public int f44767O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f44768P0;

    /* JADX INFO: renamed from: Q0 */
    public InterfaceC12479b f44769Q0;

    /* JADX INFO: renamed from: R0 */
    public InterfaceC12480c f44770R0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LoopViewPager$a */
    public class C12478a implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public float f44771a;

        public C12478a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            int count;
            LoopViewPager loopViewPager = LoopViewPager.this;
            loopViewPager.f44766N0 = loopViewPager.f44767O0;
            LoopViewPager.this.f44767O0 = i;
            x3w x3wVarM68807o0 = LoopViewPager.this.m68807o0();
            if (x3wVarM68807o0 != null && i == 0 && (count = x3wVarM68807o0.getCount()) >= 2) {
                int currentItem = LoopViewPager.this.getCurrentItem();
                if (currentItem == 0) {
                    LoopViewPager.this.m4176T(count - 2, false);
                } else if (currentItem == count - 1) {
                    LoopViewPager.this.m4176T(1, false);
                }
                if (LoopViewPager.this.f44769Q0 != null) {
                    LoopViewPager.this.f44769Q0.mo68808a(LoopViewPager.this.getIndicatorPosition());
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
            if (LoopViewPager.this.f44769Q0 == null) {
                return;
            }
            float f2 = i;
            LoopViewPager.this.f44768P0 = f2 + f >= this.f44771a;
            if (f == 0.0f) {
                this.f44771a = f2;
            }
            LoopViewPager loopViewPager = LoopViewPager.this;
            int iM68805m0 = loopViewPager.m68805m0(loopViewPager.f44768P0);
            if (LoopViewPager.this.f44767O0 == 1) {
                LoopViewPager.this.f44769Q0.mo68808a(iM68805m0);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            LoopViewPager.this.f44765M0 = i;
            if (LoopViewPager.this.f44769Q0 != null) {
                LoopViewPager.this.f44769Q0.mo68809b(LoopViewPager.this.getIndicatorPosition());
            }
            if (LoopViewPager.this.f44770R0 != null) {
                LoopViewPager.this.f44770R0.mo67403j(LoopViewPager.this.getIndicatorPosition());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LoopViewPager$b */
    public interface InterfaceC12479b {
        /* JADX INFO: renamed from: a */
        void mo68808a(int i);

        /* JADX INFO: renamed from: b */
        void mo68809b(int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LoopViewPager$c */
    public interface InterfaceC12480c {
        /* JADX INFO: renamed from: j */
        void mo67403j(int i);
    }

    public LoopViewPager(Context context) {
        super(context);
        this.f44765M0 = 0;
        this.f44766N0 = 0;
        this.f44767O0 = 0;
        this.f44768P0 = true;
        m68806n0();
    }

    public int getIndicatorCount() {
        x3w x3wVarM68807o0 = m68807o0();
        if (x3wVarM68807o0 == null) {
            return 0;
        }
        return x3wVarM68807o0.m206949k();
    }

    public int getIndicatorPosition() {
        int iM206949k;
        x3w x3wVarM68807o0 = m68807o0();
        int i = this.f44765M0;
        if (x3wVarM68807o0 == null) {
            return i;
        }
        if (i == 0) {
            iM206949k = x3wVarM68807o0.m206949k();
        } else {
            if (i == x3wVarM68807o0.m206951m() + 1) {
                return 0;
            }
            iM206949k = this.f44765M0;
        }
        return iM206949k - 1;
    }

    /* JADX INFO: renamed from: l0 */
    public void m68804l0(int i) {
        x3w x3wVarM68807o0 = m68807o0();
        if (x3wVarM68807o0 == null) {
            return;
        }
        setCurrentItem(x3wVarM68807o0.m206952n(i));
    }

    /* JADX INFO: renamed from: m0 */
    public final int m68805m0(boolean z) {
        int iM206951m;
        int i = this.f44767O0;
        if (i == 2 || i == 0 || (this.f44766N0 == 2 && i == 1)) {
            return getIndicatorPosition();
        }
        int i2 = z ? 1 : -1;
        x3w x3wVarM68807o0 = m68807o0();
        int i3 = this.f44765M0;
        if (x3wVarM68807o0 == null) {
            return i3 + i2;
        }
        if (i3 == 1 && !z) {
            iM206951m = x3wVarM68807o0.m206951m();
        } else {
            if (i3 == x3wVarM68807o0.m206951m() && z) {
                return 0;
            }
            iM206951m = this.f44765M0 + i2;
        }
        return iM206951m - 1;
    }

    /* JADX INFO: renamed from: n0 */
    public void m68806n0() {
        m4185d(new C12478a());
        m4176T(1, true);
    }

    @Nullable
    /* JADX INFO: renamed from: o0 */
    public final x3w m68807o0() {
        if (getAdapter() instanceof x3w) {
            return (x3w) getAdapter();
        }
        return null;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getCurrentItem() == 0 && getChildCount() == 0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCurrentItem() == 0 && getChildCount() == 0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(w660 w660Var) {
        if (w660Var != null && !(w660Var instanceof x3w)) {
            upk0.m194883a("LoopViewPager must use LoopPagerAdapter or its subClass");
            return;
        }
        if (w660Var == null || w660Var != getAdapter()) {
            this.f44765M0 = 0;
            this.f44768P0 = true;
            this.f44766N0 = 0;
            this.f44767O0 = 0;
        }
        super.setAdapter(w660Var);
    }

    public void setIndicatorPageChangeListener(InterfaceC12479b interfaceC12479b) {
        this.f44769Q0 = interfaceC12479b;
    }

    public void setPageShowListener(InterfaceC12480c interfaceC12480c) {
        this.f44770R0 = interfaceC12480c;
    }

    public LoopViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44765M0 = 0;
        this.f44766N0 = 0;
        this.f44767O0 = 0;
        this.f44768P0 = true;
        m68806n0();
    }
}
