package com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import l.upk0;
import l.vwb;
import p002l.coi0;
import p002l.jf50;
import p002l.v000;
import p002l.x4i0;
import p002l.xmr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TantanListView extends ViewGroup implements ChoreographerFrameCallbackC0007e.a {

    /* JADX INFO: renamed from: u */
    public static float f21u = 2.0f;

    /* JADX INFO: renamed from: v */
    public static final Property<View, Integer> f22v = new C0002a(Integer.TYPE, "innerPaddingBottom");

    /* JADX INFO: renamed from: a */
    public v000 f23a;

    /* JADX INFO: renamed from: b */
    public x4i0 f24b;

    /* JADX INFO: renamed from: c */
    public final int f25c;

    /* JADX INFO: renamed from: d */
    public int f26d;

    /* JADX INFO: renamed from: e */
    public int f27e;

    /* JADX INFO: renamed from: f */
    public int f28f;

    /* JADX INFO: renamed from: g */
    public int f29g;

    /* JADX INFO: renamed from: h */
    public int f30h;

    /* JADX INFO: renamed from: i */
    public boolean f31i;

    /* JADX INFO: renamed from: j */
    public int f32j;

    /* JADX INFO: renamed from: k */
    public int f33k;

    /* JADX INFO: renamed from: l */
    public int f34l;

    /* JADX INFO: renamed from: m */
    public int f35m;

    /* JADX INFO: renamed from: n */
    public int f36n;

    /* JADX INFO: renamed from: o */
    public int f37o;

    /* JADX INFO: renamed from: p */
    public boolean f38p;

    /* JADX INFO: renamed from: q */
    public VelocityTracker f39q;

    /* JADX INFO: renamed from: r */
    public boolean f40r;

    /* JADX INFO: renamed from: s */
    public boolean f41s;

    /* JADX INFO: renamed from: t */
    public ArrayList<jf50> f42t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.TantanListView$a */
    public class C0002a extends Property<View, Integer> {
        public C0002a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(((TantanListView) view).getInnerPaddingBottom());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ((TantanListView) view).setInnerPaddingBottom(num.intValue());
        }
    }

    public TantanListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25c = 10000;
        this.f31i = false;
        this.f32j = 0;
        this.f33k = -1;
        this.f36n = 0;
        this.f37o = 0;
        this.f38p = false;
        this.f40r = false;
        this.f41s = false;
        this.f42t = new ArrayList<>();
        m38o();
    }

    /* JADX INFO: renamed from: k */
    private void m37k() {
        if (this.f39q == null) {
            this.f39q = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: o */
    private void m38o() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f26d = viewConfiguration.getScaledPagingTouchSlop();
        this.f27e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f28f = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: D */
    public void m39D() {
        xmr.m26036c("requestInner call");
        super.requestLayout();
    }

    /* JADX INFO: renamed from: E */
    public void m40E(String str) {
        xmr.m26036c("safeLayout: from " + str + " state :" + this.f38p);
        if (this.f38p) {
            m39D();
        } else {
            this.f24b.m81W(str);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m41F(int i, int i2) {
        int i3 = this.f33k;
        if (i3 == -1.0f) {
            this.f32j = 0;
        } else {
            this.f32j += i - i3;
            m51w(0, i - i3);
            this.f24b.m88d0(i - this.f33k, 0);
        }
        this.f33k = i;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.ChoreographerFrameCallbackC0007e.a
    /* JADX INFO: renamed from: a */
    public void mo42a() {
        m50t(ChoreographerFrameCallbackC0007e.f68r);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        m49r(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.ChoreographerFrameCallbackC0007e.a
    /* JADX INFO: renamed from: b */
    public void mo43b(boolean z) {
        if (z) {
            return;
        }
        m50t(ChoreographerFrameCallbackC0007e.f66p);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.ChoreographerFrameCallbackC0007e.a
    /* JADX INFO: renamed from: c */
    public void mo44c(int i, float f, int i2, int i3, boolean z) {
        m51w(0, i2);
    }

    @Override // android.view.ViewGroup
    public void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f24b.m121t0()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void forceLayout() {
        super.forceLayout();
        this.f38p = true;
    }

    /* JADX INFO: renamed from: g */
    public void m45g(jf50 jf50Var) {
        this.f42t.add(jf50Var);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public int getInnerPaddingBottom() {
        return this.f37o;
    }

    public int getRealHeight() {
        return this.f34l;
    }

    public int getRealWidth() {
        return this.f35m;
    }

    public int getRenderContentHeight() {
        return this.f34l - this.f37o;
    }

    /* JADX INFO: renamed from: h */
    public final void m46h() {
        if (vwb.J(this.f42t)) {
            return;
        }
        Iterator<jf50> it = this.f42t.iterator();
        while (it.hasNext()) {
            if (it.next().f13721a) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m47i(int i) {
        this.f24b.m107B0(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xmr.m26035b("TantanListView", "从窗口中移出了");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            this.f40r = false;
            this.f29g = x;
            this.f30h = y;
            if (this.f24b.m122u0()) {
                this.f24b.m112k0();
                m50t(ChoreographerFrameCallbackC0007e.f66p);
            }
        } else if (action == 2 && !this.f40r) {
            int i = y - this.f30h;
            if (Math.abs(i) > this.f26d) {
                this.f31i = true;
                this.f29g = i;
                this.f30h = y;
                m50t(ChoreographerFrameCallbackC0007e.f67q);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        xmr.m26036c("onLayout");
        x4i0 x4i0Var = this.f24b;
        if (x4i0Var != null) {
            x4i0Var.m73O(z, i, i2, i3, i4);
        }
        this.f38p = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        xmr.m26036c("onMeasure: " + size + "*" + size2);
        setMeasuredDimension(size, size2);
        x4i0 x4i0Var = this.f24b;
        if (x4i0Var == null || (i3 = this.f34l) == size2 || size2 <= 0) {
            if (this.f38p) {
                x4i0Var.m80V();
                return;
            }
            return;
        }
        boolean z = i3 == 0;
        this.f34l = size2;
        this.f35m = size;
        xmr.m26036c("onMeasure: calculateItemInfoNecessary" + size + "*" + size2);
        this.f24b.m25681E0(z);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092 A[PHI: r1
      0x0092: PHI (r1v8 int) = (r1v6 int), (r1v7 int) binds: [B:28:0x0090, B:31:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0054, please report this as an issue */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int yVelocity;
        int i;
        int i2;
        m37k();
        this.f39q.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            this.f31i = false;
            this.f40r = false;
            this.f29g = x;
            this.f30h = y;
        } else if (action == 1) {
            this.f33k = -1;
            if (this.f31i) {
                VelocityTracker velocityTracker = this.f39q;
                velocityTracker.computeCurrentVelocity(1000);
                yVelocity = (int) (velocityTracker.getYVelocity() / f21u);
                xmr.m26035b("TantanListView", "滚动的速度为：  ====》" + yVelocity);
                if (Math.abs(yVelocity) > this.f28f) {
                    i = 2500;
                } else if (Math.abs(yVelocity) > this.f27e) {
                    i = 1400;
                } else {
                    i = 300;
                }
                i2 = 10000;
                if (yVelocity >= 10000) {
                    yVelocity = i2;
                } else {
                    i2 = -10000;
                    if (yVelocity <= -10000) {
                        yVelocity = i2;
                    }
                }
                this.f24b.m108C0(yVelocity, 0, i);
            }
        } else if (action == 2) {
            this.f40r = true;
            int i3 = y - this.f30h;
            if (Math.abs(i3) > this.f26d && !this.f31i) {
                this.f31i = true;
                this.f29g = i3;
                this.f30h = y;
                m50t(ChoreographerFrameCallbackC0007e.f67q);
            }
            if (this.f31i) {
                m41F(y, this.f30h);
            }
        } else if (action == 3) {
            this.f33k = -1;
            if (this.f31i) {
                VelocityTracker velocityTracker2 = this.f39q;
                velocityTracker2.computeCurrentVelocity(1000);
                yVelocity = (int) (velocityTracker2.getYVelocity() / f21u);
                xmr.m26035b("TantanListView", "滚动的速度为：  ====》" + yVelocity);
                if (Math.abs(yVelocity) > this.f28f) {
                    i = 2500;
                } else if (Math.abs(yVelocity) > this.f27e) {
                    i = 1400;
                } else {
                    i = 300;
                }
                i2 = 10000;
                if (yVelocity >= 10000) {
                    yVelocity = i2;
                } else {
                    i2 = -10000;
                    if (yVelocity <= -10000) {
                        yVelocity = i2;
                    }
                }
                this.f24b.m108C0(yVelocity, 0, i);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m48q() {
        return this.f24b.m121t0();
    }

    /* JADX INFO: renamed from: r */
    public final void m49r(View view) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        xmr.m26036c("requestLayout");
        x4i0 x4i0Var = this.f24b;
        if (x4i0Var != null) {
            x4i0Var.mo79U();
        } else {
            super.requestLayout();
        }
    }

    public void setAdapter(coi0 coi0Var) {
        if (this.f24b != null) {
            return;
        }
        upk0.a("请设置正确的LayoutManager");
    }

    public void setDebugMove(int i) {
        scrollBy(0, i);
    }

    public void setInnerPaddingBottom(int i) {
        if (this.f37o != i) {
            this.f37o = i;
            this.f24b.m25681E0(false);
            this.f24b.m83Y("setInnerPaddingBottom", true);
        }
    }

    public void setLayoutManager(x4i0 x4i0Var) {
        this.f24b = x4i0Var;
        x4i0Var.m106A0(this);
        x4i0Var.m87c0(this);
    }

    /* JADX INFO: renamed from: t */
    public void m50t(int i) {
        if (vwb.J(this.f42t)) {
            return;
        }
        this.f41s = true;
        Iterator<jf50> it = this.f42t.iterator();
        while (it.hasNext()) {
            it.next().m15879a(i);
        }
        m46h();
        this.f41s = false;
    }

    /* JADX INFO: renamed from: w */
    public void m51w(int i, int i2) {
        if (vwb.J(this.f42t)) {
            return;
        }
        this.f41s = true;
        Iterator<jf50> it = this.f42t.iterator();
        while (it.hasNext()) {
            it.next().m15880b(i, i2);
        }
        m46h();
        this.f41s = false;
    }

    /* JADX INFO: renamed from: y */
    public void m52y(View view) {
        removeDetachedView(view, false);
    }

    /* JADX INFO: renamed from: z */
    public void m53z(jf50 jf50Var) {
        if (this.f41s) {
            jf50Var.f13721a = true;
        } else {
            this.f42t.remove(jf50Var);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        super.addView(view, i);
        m49r(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m49r(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        super.addView(view, i, i2);
        m49r(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        m49r(view);
    }

    public TantanListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TantanListView(Context context) {
        this(context, null);
    }
}
