package com.p051p1.mobile.putong.live.livingroom.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VFrame;
import p153l.bnl0;
import p153l.e6m;
import p153l.l4g0;
import p153l.qa00;
import p153l.ykl0;

/* JADX INFO: loaded from: classes5.dex */
public class RightSideViewGroup extends VFrame {

    /* JADX INFO: renamed from: a */
    public ykl0 f52914a;

    /* JADX INFO: renamed from: b */
    public View f52915b;

    /* JADX INFO: renamed from: c */
    public View f52916c;

    /* JADX INFO: renamed from: d */
    public int f52917d;

    /* JADX INFO: renamed from: e */
    public float f52918e;

    /* JADX INFO: renamed from: f */
    public float f52919f;

    /* JADX INFO: renamed from: g */
    public List<InterfaceC13102c> f52920g;

    /* JADX INFO: renamed from: h */
    public l4g0 f52921h;

    /* JADX INFO: renamed from: i */
    public final C13103d f52922i;

    /* JADX INFO: renamed from: j */
    public boolean f52923j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup$a */
    public class C13100a extends ykl0.AbstractC21619c {
        public C13100a() {
        }

        @Override // p153l.ykl0.AbstractC21619c
        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            if (RightSideViewGroup.this.f52922i.f52930e == -1) {
                if ((i2 <= 0 || RightSideViewGroup.this.f52922i.f52928c || RightSideViewGroup.this.getContentViewState()) && (i2 >= 0 || !RightSideViewGroup.this.getContentViewState())) {
                    RightSideViewGroup.this.f52922i.f52930e = 0;
                } else {
                    RightSideViewGroup.this.f52922i.f52930e = 1;
                }
            }
            if (!RightSideViewGroup.this.m77799K()) {
                RightSideViewGroup.this.f52922i.f52930e = 0;
            }
            int i3 = RightSideViewGroup.this.f52922i.f52930e;
            RightSideViewGroup rightSideViewGroup = RightSideViewGroup.this;
            if (i3 == 1) {
                rightSideViewGroup.m77803O(i);
            } else if (rightSideViewGroup.f52922i.f52930e == 0 && RightSideViewGroup.this.f52922i.f52929d) {
                float translationX = RightSideViewGroup.this.f52916c.getTranslationX() + i;
                if (translationX > 0.0f) {
                    RightSideViewGroup.this.f52916c.setTranslationX(0.0f);
                } else {
                    float fAbs = Math.abs(translationX);
                    float f = RightSideViewGroup.this.f52917d;
                    RightSideViewGroup rightSideViewGroup2 = RightSideViewGroup.this;
                    if (fAbs < f) {
                        rightSideViewGroup2.f52916c.setTranslationX(translationX);
                    } else {
                        rightSideViewGroup2.f52916c.setTranslationX(RightSideViewGroup.this.f52917d * (-1));
                    }
                }
            }
            return 0;
        }

        @Override // p153l.ykl0.AbstractC21619c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return 0;
        }

        @Override // p153l.ykl0.AbstractC21619c
        public void onViewReleased(@NonNull View view, float f, float f2) {
            int i = RightSideViewGroup.this.f52922i.f52930e;
            RightSideViewGroup rightSideViewGroup = RightSideViewGroup.this;
            if (i == 1) {
                rightSideViewGroup.m77804P(f);
            } else if (rightSideViewGroup.f52922i.f52929d) {
                float fAbs = Math.abs(RightSideViewGroup.this.f52916c.getTranslationX());
                if (RightSideViewGroup.this.f52922i.f52928c) {
                    RightSideViewGroup rightSideViewGroup2 = RightSideViewGroup.this;
                    if (f > 0.0f) {
                        rightSideViewGroup2.m77801M(f);
                    } else {
                        float f3 = rightSideViewGroup2.f52917d / 2;
                        RightSideViewGroup rightSideViewGroup3 = RightSideViewGroup.this;
                        if (fAbs > f3) {
                            rightSideViewGroup3.m77806R(f);
                        } else {
                            rightSideViewGroup3.m77801M(f);
                        }
                    }
                } else if (fAbs > RightSideViewGroup.this.f52917d / 2 || f < -2000.0f) {
                    RightSideViewGroup.this.m77806R(f);
                } else {
                    RightSideViewGroup.this.m77801M(f);
                }
            }
            RightSideViewGroup.this.f52922i.f52930e = -1;
        }

        @Override // p153l.ykl0.AbstractC21619c
        public boolean tryCaptureView(@NonNull View view, int i) {
            return view == RightSideViewGroup.this.f52915b;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup$b */
    public class C13101b implements e6m {
        public C13101b() {
        }

        @Override // p153l.e6m
        public boolean disableAutoPV() {
            return true;
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_live_right_recommend";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup$c */
    public interface InterfaceC13102c {
        /* JADX INFO: renamed from: a */
        default Boolean mo77809a() {
            return null;
        }

        /* JADX INFO: renamed from: b */
        default Boolean mo77810b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        default void mo77811c(float f) {
        }

        /* JADX INFO: renamed from: d */
        void mo77812d(boolean z);

        /* JADX INFO: renamed from: e */
        default void mo77813e(int i) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup$d */
    public static final class C13103d {

        /* JADX INFO: renamed from: a */
        public boolean f52926a = false;

        /* JADX INFO: renamed from: b */
        public boolean f52927b = false;

        /* JADX INFO: renamed from: c */
        public boolean f52928c = false;

        /* JADX INFO: renamed from: d */
        public boolean f52929d = true;

        /* JADX INFO: renamed from: e */
        public int f52930e = -1;

        /* JADX INFO: renamed from: i */
        public boolean m77822i() {
            return this.f52929d;
        }

        /* JADX INFO: renamed from: j */
        public boolean m77823j() {
            return this.f52926a;
        }

        /* JADX INFO: renamed from: k */
        public boolean m77824k() {
            return this.f52928c;
        }
    }

    public RightSideViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52922i = new C13103d();
        this.f52923j = false;
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getContentViewState() {
        for (InterfaceC13102c interfaceC13102c : this.f52920g) {
            if (interfaceC13102c.mo77809a() != null && interfaceC13102c.mo77809a().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private void init() {
        this.f52914a = ykl0.m216484p(this, new C13100a());
        this.f52920g = new ArrayList();
        this.f52921h = new l4g0(new C13101b());
    }

    /* JADX INFO: renamed from: G */
    public void m77798G(InterfaceC13102c interfaceC13102c) {
        this.f52920g.add(interfaceC13102c);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m77799K() {
        for (InterfaceC13102c interfaceC13102c : this.f52920g) {
            if (interfaceC13102c.mo77810b() != null && interfaceC13102c.mo77810b().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public void m77800L(boolean z) {
        if (this.f52922i.f52928c) {
            this.f52922i.f52928c = false;
            this.f52922i.f52927b = z;
            m77802N(this.f52916c.getTranslationX(), 0.0f, 0.0f);
            m77805Q(false);
            this.f52921h.m152776k();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m77801M(float f) {
        boolean z = this.f52922i.f52928c;
        View view = this.f52916c;
        if (!z) {
            float translationX = view.getTranslationX();
            if (Math.abs(translationX) != 0.0f) {
                m77802N(translationX, 0.0f, f);
                return;
            }
            return;
        }
        m77802N(view.getTranslationX(), 0.0f, f);
        this.f52922i.f52928c = false;
        this.f52922i.f52927b = true;
        m77805Q(false);
        this.f52921h.m152776k();
    }

    /* JADX INFO: renamed from: N */
    public final void m77802N(float f, float f2, float f3) {
        int iAbs = f3 == 0.0f ? 300 : (int) Math.abs((f2 - f) / f3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f52916c, "translationX", f, f2);
        objectAnimatorOfFloat.setDuration(iAbs);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: O */
    public final void m77803O(int i) {
        Iterator<InterfaceC13102c> it = this.f52920g.iterator();
        while (it.hasNext()) {
            it.next().mo77813e(i);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m77804P(float f) {
        Iterator<InterfaceC13102c> it = this.f52920g.iterator();
        while (it.hasNext()) {
            it.next().mo77811c(f);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m77805Q(boolean z) {
        Iterator<InterfaceC13102c> it = this.f52920g.iterator();
        while (it.hasNext()) {
            it.next().mo77812d(z);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m77806R(float f) {
        m77802N(this.f52916c.getTranslationX(), this.f52917d * (-1), f);
        this.f52922i.f52928c = true;
        this.f52922i.f52926a = true;
        m77805Q(true);
        this.f52921h.m152777l();
    }

    /* JADX INFO: renamed from: S */
    public void m77807S(InterfaceC13102c interfaceC13102c) {
        this.f52920g.remove(interfaceC13102c);
    }

    /* JADX INFO: renamed from: T */
    public void m77808T(boolean z) {
        if (!this.f52922i.f52929d || this.f52922i.f52928c || this.f52917d == 0) {
            return;
        }
        this.f52922i.f52928c = true;
        m77802N(0.0f, -this.f52917d, 0.0f);
        this.f52922i.f52926a = z;
        m77805Q(true);
        this.f52921h.m152777l();
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        ykl0 ykl0Var = this.f52914a;
        if (ykl0Var == null || !ykl0Var.m216516n(true)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    @Override // p151v.VFrame, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f52922i.f52928c) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f52923j = true;
                this.f52918e = motionEvent.getX();
                this.f52919f = motionEvent.getY();
            } else if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if ("samsung".equalsIgnoreCase(Build.BRAND)) {
                    String str = Build.MODEL;
                    if (str.toLowerCase().contains("G9200".toLowerCase()) || str.toLowerCase().contains("g7810".toLowerCase()) || str.toLowerCase().contains("s918u1".toLowerCase())) {
                        if (Math.abs(x - this.f52918e) >= qa00.m175859d(7.0f) || Math.abs(y - this.f52919f) >= qa00.m175859d(5.0f)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else if (x == this.f52918e || y != this.f52919f) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (this.f52923j && z && x < bnl0.m105592y0() - this.f52917d) {
                        m77800L(true);
                    }
                    this.f52923j = false;
                } else {
                    if (x == this.f52918e) {
                    }
                    z = false;
                    if (this.f52923j) {
                        m77800L(true);
                    }
                    this.f52923j = false;
                }
            } else if (action == 3) {
                this.f52923j = false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C13103d getViewStates() {
        return this.f52922i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52920g.clear();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52915b = getChildAt(0);
        this.f52916c = getChildAt(1);
    }

    @Override // p151v.VFrame, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f52918e = motionEvent.getX();
            this.f52919f = motionEvent.getY();
            if (m77799K()) {
                getParent().requestDisallowInterceptTouchEvent(this.f52922i.f52928c || !getContentViewState());
            } else {
                getParent().requestDisallowInterceptTouchEvent(this.f52922i.f52928c);
            }
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z = Math.abs(x - this.f52918e) > Math.abs(y - this.f52919f);
            if ("samsung".equalsIgnoreCase(Build.BRAND)) {
                String str = Build.MODEL;
                if (str.toLowerCase().contains("G9200".toLowerCase()) || str.toLowerCase().contains("g7810".toLowerCase()) || str.toLowerCase().contains("s918u1".toLowerCase())) {
                    z = z && Math.abs(x - this.f52918e) >= ((float) qa00.m175859d(7.0f)) && Math.abs(y - this.f52919f) >= ((float) qa00.m175859d(5.0f));
                }
            }
            if ((z && (Math.abs(y - this.f52919f) > ((float) LiveScrollView.f52867t) ? 1 : (Math.abs(y - this.f52919f) == ((float) LiveScrollView.f52867t) ? 0 : -1)) < 0) && this.f52914a.m216523w() == null) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f52914a.m216505c(this.f52915b, motionEvent.getPointerId(0));
            }
        }
        return this.f52914a.m216500P(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f52915b == null || (view = this.f52916c) == null) {
            return;
        }
        this.f52917d = view.getMeasuredWidth();
        this.f52916c.layout(getWidth(), 0, this.f52916c.getMeasuredWidth() + getWidth(), this.f52916c.getMeasuredHeight());
        View view2 = this.f52915b;
        view2.layout(0, 0, view2.getMeasuredWidth(), this.f52915b.getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f52914a.m216491G(motionEvent);
        return true;
    }

    public void setEnable(boolean z) {
        this.f52922i.f52929d = z;
    }

    public RightSideViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RightSideViewGroup(@NonNull Context context) {
        this(context, null);
    }
}
