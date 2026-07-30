package com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.Iterator;
import p153l.azk0;
import p153l.dxi0;
import p153l.idi0;
import p153l.jyb;
import p153l.pn50;
import p153l.s900;
import p153l.yor;

/* JADX INFO: loaded from: classes4.dex */
public class TantanListView extends ViewGroup implements ChoreographerFrameCallbackC8745e.a {

    /* JADX INFO: renamed from: u */
    public static float f33047u = 2.0f;

    /* JADX INFO: renamed from: v */
    public static final Property<View, Integer> f33048v = new C8740a(Integer.TYPE, "innerPaddingBottom");

    /* JADX INFO: renamed from: a */
    public s900 f33049a;

    /* JADX INFO: renamed from: b */
    public idi0 f33050b;

    /* JADX INFO: renamed from: c */
    public final int f33051c;

    /* JADX INFO: renamed from: d */
    public int f33052d;

    /* JADX INFO: renamed from: e */
    public int f33053e;

    /* JADX INFO: renamed from: f */
    public int f33054f;

    /* JADX INFO: renamed from: g */
    public int f33055g;

    /* JADX INFO: renamed from: h */
    public int f33056h;

    /* JADX INFO: renamed from: i */
    public boolean f33057i;

    /* JADX INFO: renamed from: j */
    public int f33058j;

    /* JADX INFO: renamed from: k */
    public int f33059k;

    /* JADX INFO: renamed from: l */
    public int f33060l;

    /* JADX INFO: renamed from: m */
    public int f33061m;

    /* JADX INFO: renamed from: n */
    public int f33062n;

    /* JADX INFO: renamed from: o */
    public int f33063o;

    /* JADX INFO: renamed from: p */
    public boolean f33064p;

    /* JADX INFO: renamed from: q */
    public VelocityTracker f33065q;

    /* JADX INFO: renamed from: r */
    public boolean f33066r;

    /* JADX INFO: renamed from: s */
    public boolean f33067s;

    /* JADX INFO: renamed from: t */
    public ArrayList<pn50> f33068t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.TantanListView$a */
    public class C8740a extends Property<View, Integer> {
        public C8740a(Class cls, String str) {
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
        this.f33051c = 10000;
        this.f33057i = false;
        this.f33058j = 0;
        this.f33059k = -1;
        this.f33062n = 0;
        this.f33063o = 0;
        this.f33064p = false;
        this.f33066r = false;
        this.f33067s = false;
        this.f33068t = new ArrayList<>();
        m50807o();
    }

    /* JADX INFO: renamed from: k */
    private void m50806k() {
        if (this.f33065q == null) {
            this.f33065q = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: o */
    private void m50807o() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f33052d = viewConfiguration.getScaledPagingTouchSlop();
        this.f33053e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f33054f = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: D */
    public void m50808D() {
        yor.m216992c("requestInner call");
        super.requestLayout();
    }

    /* JADX INFO: renamed from: E */
    public void m50809E(String str) {
        yor.m216992c("safeLayout: from " + str + " state :" + this.f33064p);
        if (this.f33064p) {
            m50808D();
        } else {
            this.f33050b.m50850W(str);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m50810F(int i, int i2) {
        int i3 = this.f33059k;
        if (i3 == -1.0f) {
            this.f33058j = 0;
        } else {
            this.f33058j += i - i3;
            m50820w(0, i - i3);
            this.f33050b.m50857d0(i - this.f33059k, 0);
        }
        this.f33059k = i;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.ChoreographerFrameCallbackC8745e.a
    /* JADX INFO: renamed from: a */
    public void mo50811a() {
        m50819t(ChoreographerFrameCallbackC8745e.f33094r);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        m50818r(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.ChoreographerFrameCallbackC8745e.a
    /* JADX INFO: renamed from: b */
    public void mo50812b(boolean z) {
        if (z) {
            return;
        }
        m50819t(ChoreographerFrameCallbackC8745e.f33092p);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.ChoreographerFrameCallbackC8745e.a
    /* JADX INFO: renamed from: c */
    public void mo50813c(int i, float f, int i2, int i3, boolean z) {
        m50820w(0, i2);
    }

    @Override // android.view.ViewGroup
    public void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f33050b.m50890t0()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void forceLayout() {
        super.forceLayout();
        this.f33064p = true;
    }

    /* JADX INFO: renamed from: g */
    public void m50814g(pn50 pn50Var) {
        this.f33068t.add(pn50Var);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public int getInnerPaddingBottom() {
        return this.f33063o;
    }

    public int getRealHeight() {
        return this.f33060l;
    }

    public int getRealWidth() {
        return this.f33061m;
    }

    public int getRenderContentHeight() {
        return this.f33060l - this.f33063o;
    }

    /* JADX INFO: renamed from: h */
    public final void m50815h() {
        if (jyb.m147479J(this.f33068t)) {
            return;
        }
        Iterator<pn50> it = this.f33068t.iterator();
        while (it.hasNext()) {
            if (it.next().f153259a) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m50816i(int i) {
        this.f33050b.m50876B0(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yor.m216991b("TantanListView", "从窗口中移出了");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            this.f33066r = false;
            this.f33055g = x;
            this.f33056h = y;
            if (this.f33050b.m50891u0()) {
                this.f33050b.m50881k0();
                m50819t(ChoreographerFrameCallbackC8745e.f33092p);
            }
        } else if (action == 2 && !this.f33066r) {
            int i = y - this.f33056h;
            if (Math.abs(i) > this.f33052d) {
                this.f33057i = true;
                this.f33055g = i;
                this.f33056h = y;
                m50819t(ChoreographerFrameCallbackC8745e.f33093q);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        yor.m216992c("onLayout");
        idi0 idi0Var = this.f33050b;
        if (idi0Var != null) {
            idi0Var.m50842O(z, i, i2, i3, i4);
        }
        this.f33064p = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        yor.m216992c("onMeasure: " + size + "*" + size2);
        setMeasuredDimension(size, size2);
        idi0 idi0Var = this.f33050b;
        if (idi0Var == null || (i3 = this.f33060l) == size2 || size2 <= 0) {
            if (this.f33064p) {
                idi0Var.m50849V();
                return;
            }
            return;
        }
        boolean z = i3 == 0;
        this.f33060l = size2;
        this.f33061m = size;
        yor.m216992c("onMeasure: calculateItemInfoNecessary" + size + "*" + size2);
        this.f33050b.m139535E0(z);
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
        m50806k();
        this.f33065q.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            this.f33057i = false;
            this.f33066r = false;
            this.f33055g = x;
            this.f33056h = y;
        } else if (action == 1) {
            this.f33059k = -1;
            if (this.f33057i) {
                VelocityTracker velocityTracker = this.f33065q;
                velocityTracker.computeCurrentVelocity(1000);
                yVelocity = (int) (velocityTracker.getYVelocity() / f33047u);
                yor.m216991b("TantanListView", "滚动的速度为：  ====》" + yVelocity);
                if (Math.abs(yVelocity) > this.f33054f) {
                    i = 2500;
                } else if (Math.abs(yVelocity) > this.f33053e) {
                    i = 1400;
                } else {
                    i = 300;
                }
                i2 = 10000;
                if (yVelocity >= 10000) {
                    yVelocity = i2;
                } else {
                    i2 = ShareConstants.ERROR_LOAD_GET_INTENT_FAIL;
                    if (yVelocity <= -10000) {
                        yVelocity = i2;
                    }
                }
                this.f33050b.m50877C0(yVelocity, 0, i);
            }
        } else if (action == 2) {
            this.f33066r = true;
            int i3 = y - this.f33056h;
            if (Math.abs(i3) > this.f33052d && !this.f33057i) {
                this.f33057i = true;
                this.f33055g = i3;
                this.f33056h = y;
                m50819t(ChoreographerFrameCallbackC8745e.f33093q);
            }
            if (this.f33057i) {
                m50810F(y, this.f33056h);
            }
        } else if (action == 3) {
            this.f33059k = -1;
            if (this.f33057i) {
                VelocityTracker velocityTracker2 = this.f33065q;
                velocityTracker2.computeCurrentVelocity(1000);
                yVelocity = (int) (velocityTracker2.getYVelocity() / f33047u);
                yor.m216991b("TantanListView", "滚动的速度为：  ====》" + yVelocity);
                if (Math.abs(yVelocity) > this.f33054f) {
                    i = 2500;
                } else if (Math.abs(yVelocity) > this.f33053e) {
                    i = 1400;
                } else {
                    i = 300;
                }
                i2 = 10000;
                if (yVelocity >= 10000) {
                    yVelocity = i2;
                } else {
                    i2 = ShareConstants.ERROR_LOAD_GET_INTENT_FAIL;
                    if (yVelocity <= -10000) {
                        yVelocity = i2;
                    }
                }
                this.f33050b.m50877C0(yVelocity, 0, i);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m50817q() {
        return this.f33050b.m50890t0();
    }

    /* JADX INFO: renamed from: r */
    public final void m50818r(View view) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        yor.m216992c("requestLayout");
        idi0 idi0Var = this.f33050b;
        if (idi0Var != null) {
            idi0Var.mo50848U();
        } else {
            super.requestLayout();
        }
    }

    public void setAdapter(dxi0 dxi0Var) {
        if (this.f33050b != null) {
            return;
        }
        azk0.m101074a("请设置正确的LayoutManager");
    }

    public void setDebugMove(int i) {
        scrollBy(0, i);
    }

    public void setInnerPaddingBottom(int i) {
        if (this.f33063o != i) {
            this.f33063o = i;
            this.f33050b.m139535E0(false);
            this.f33050b.m50852Y("setInnerPaddingBottom", true);
        }
    }

    public void setLayoutManager(idi0 idi0Var) {
        this.f33050b = idi0Var;
        idi0Var.m50875A0(this);
        idi0Var.m50856c0(this);
    }

    /* JADX INFO: renamed from: t */
    public void m50819t(int i) {
        if (jyb.m147479J(this.f33068t)) {
            return;
        }
        this.f33067s = true;
        Iterator<pn50> it = this.f33068t.iterator();
        while (it.hasNext()) {
            it.next().mo173031a(i);
        }
        m50815h();
        this.f33067s = false;
    }

    /* JADX INFO: renamed from: w */
    public void m50820w(int i, int i2) {
        if (jyb.m147479J(this.f33068t)) {
            return;
        }
        this.f33067s = true;
        Iterator<pn50> it = this.f33068t.iterator();
        while (it.hasNext()) {
            it.next().mo49560b(i, i2);
        }
        m50815h();
        this.f33067s = false;
    }

    /* JADX INFO: renamed from: y */
    public void m50821y(View view) {
        removeDetachedView(view, false);
    }

    /* JADX INFO: renamed from: z */
    public void m50822z(pn50 pn50Var) {
        if (this.f33067s) {
            pn50Var.f153259a = true;
        } else {
            this.f33068t.remove(pn50Var);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        super.addView(view, i);
        m50818r(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m50818r(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        super.addView(view, i, i2);
        m50818r(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        m50818r(view);
    }

    public TantanListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TantanListView(Context context) {
        this(context, null);
    }
}
