package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import p153l.azk0;
import p153l.cf60;
import p153l.v5w;

/* JADX INFO: loaded from: classes13.dex */
public class LoopViewPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public int f45613M0;

    /* JADX INFO: renamed from: N0 */
    public int f45614N0;

    /* JADX INFO: renamed from: O0 */
    public int f45615O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f45616P0;

    /* JADX INFO: renamed from: Q0 */
    public InterfaceC12642b f45617Q0;

    /* JADX INFO: renamed from: R0 */
    public InterfaceC12643c f45618R0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LoopViewPager$a */
    public class C12641a implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public float f45619a;

        public C12641a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            int count;
            LoopViewPager loopViewPager = LoopViewPager.this;
            loopViewPager.f45614N0 = loopViewPager.f45615O0;
            LoopViewPager.this.f45615O0 = i;
            v5w v5wVarM69990o0 = LoopViewPager.this.m69990o0();
            if (v5wVarM69990o0 != null && i == 0 && (count = v5wVarM69990o0.getCount()) >= 2) {
                int currentItem = LoopViewPager.this.getCurrentItem();
                if (currentItem == 0) {
                    LoopViewPager.this.m4178T(count - 2, false);
                } else if (currentItem == count - 1) {
                    LoopViewPager.this.m4178T(1, false);
                }
                if (LoopViewPager.this.f45617Q0 != null) {
                    LoopViewPager.this.f45617Q0.mo69991a(LoopViewPager.this.getIndicatorPosition());
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
            if (LoopViewPager.this.f45617Q0 == null) {
                return;
            }
            float f2 = i;
            LoopViewPager.this.f45616P0 = f2 + f >= this.f45619a;
            if (f == 0.0f) {
                this.f45619a = f2;
            }
            LoopViewPager loopViewPager = LoopViewPager.this;
            int iM69988m0 = loopViewPager.m69988m0(loopViewPager.f45616P0);
            if (LoopViewPager.this.f45615O0 == 1) {
                LoopViewPager.this.f45617Q0.mo69991a(iM69988m0);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            LoopViewPager.this.f45613M0 = i;
            if (LoopViewPager.this.f45617Q0 != null) {
                LoopViewPager.this.f45617Q0.mo69992b(LoopViewPager.this.getIndicatorPosition());
            }
            if (LoopViewPager.this.f45618R0 != null) {
                LoopViewPager.this.f45618R0.mo68586j(LoopViewPager.this.getIndicatorPosition());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LoopViewPager$b */
    public interface InterfaceC12642b {
        /* JADX INFO: renamed from: a */
        void mo69991a(int i);

        /* JADX INFO: renamed from: b */
        void mo69992b(int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LoopViewPager$c */
    public interface InterfaceC12643c {
        /* JADX INFO: renamed from: j */
        void mo68586j(int i);
    }

    public LoopViewPager(Context context) {
        super(context);
        this.f45613M0 = 0;
        this.f45614N0 = 0;
        this.f45615O0 = 0;
        this.f45616P0 = true;
        m69989n0();
    }

    public int getIndicatorCount() {
        v5w v5wVarM69990o0 = m69990o0();
        if (v5wVarM69990o0 == null) {
            return 0;
        }
        return v5wVarM69990o0.m199946k();
    }

    public int getIndicatorPosition() {
        int iM199946k;
        v5w v5wVarM69990o0 = m69990o0();
        int i = this.f45613M0;
        if (v5wVarM69990o0 == null) {
            return i;
        }
        if (i == 0) {
            iM199946k = v5wVarM69990o0.m199946k();
        } else {
            if (i == v5wVarM69990o0.m199948m() + 1) {
                return 0;
            }
            iM199946k = this.f45613M0;
        }
        return iM199946k - 1;
    }

    /* JADX INFO: renamed from: l0 */
    public void m69987l0(int i) {
        v5w v5wVarM69990o0 = m69990o0();
        if (v5wVarM69990o0 == null) {
            return;
        }
        setCurrentItem(v5wVarM69990o0.m199949n(i));
    }

    /* JADX INFO: renamed from: m0 */
    public final int m69988m0(boolean z) {
        int iM199948m;
        int i = this.f45615O0;
        if (i == 2 || i == 0 || (this.f45614N0 == 2 && i == 1)) {
            return getIndicatorPosition();
        }
        int i2 = z ? 1 : -1;
        v5w v5wVarM69990o0 = m69990o0();
        int i3 = this.f45613M0;
        if (v5wVarM69990o0 == null) {
            return i3 + i2;
        }
        if (i3 == 1 && !z) {
            iM199948m = v5wVarM69990o0.m199948m();
        } else {
            if (i3 == v5wVarM69990o0.m199948m() && z) {
                return 0;
            }
            iM199948m = this.f45613M0 + i2;
        }
        return iM199948m - 1;
    }

    /* JADX INFO: renamed from: n0 */
    public void m69989n0() {
        m4187d(new C12641a());
        m4178T(1, true);
    }

    @Nullable
    /* JADX INFO: renamed from: o0 */
    public final v5w m69990o0() {
        if (getAdapter() instanceof v5w) {
            return (v5w) getAdapter();
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
    public void setAdapter(cf60 cf60Var) {
        if (cf60Var != null && !(cf60Var instanceof v5w)) {
            azk0.m101074a("LoopViewPager must use LoopPagerAdapter or its subClass");
            return;
        }
        if (cf60Var == null || cf60Var != getAdapter()) {
            this.f45613M0 = 0;
            this.f45616P0 = true;
            this.f45614N0 = 0;
            this.f45615O0 = 0;
        }
        super.setAdapter(cf60Var);
    }

    public void setIndicatorPageChangeListener(InterfaceC12642b interfaceC12642b) {
        this.f45617Q0 = interfaceC12642b;
    }

    public void setPageShowListener(InterfaceC12643c interfaceC12643c) {
        this.f45618R0 = interfaceC12643c;
    }

    public LoopViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45613M0 = 0;
        this.f45614N0 = 0;
        this.f45615O0 = 0;
        this.f45616P0 = true;
        m69989n0();
    }
}
