package com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt;

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
import p149l.coi0;
import p149l.jf50;
import p149l.upk0;
import p149l.v000;
import p149l.vwb;
import p149l.x4i0;
import p149l.xmr;

/* JADX INFO: loaded from: classes4.dex */
public class TantanListView extends ViewGroup implements ChoreographerFrameCallbackC8582e.a {

    /* JADX INFO: renamed from: u */
    public static float f32199u = 2.0f;

    /* JADX INFO: renamed from: v */
    public static final Property<View, Integer> f32200v = new C8577a(Integer.TYPE, "innerPaddingBottom");

    /* JADX INFO: renamed from: a */
    public v000 f32201a;

    /* JADX INFO: renamed from: b */
    public x4i0 f32202b;

    /* JADX INFO: renamed from: c */
    public final int f32203c;

    /* JADX INFO: renamed from: d */
    public int f32204d;

    /* JADX INFO: renamed from: e */
    public int f32205e;

    /* JADX INFO: renamed from: f */
    public int f32206f;

    /* JADX INFO: renamed from: g */
    public int f32207g;

    /* JADX INFO: renamed from: h */
    public int f32208h;

    /* JADX INFO: renamed from: i */
    public boolean f32209i;

    /* JADX INFO: renamed from: j */
    public int f32210j;

    /* JADX INFO: renamed from: k */
    public int f32211k;

    /* JADX INFO: renamed from: l */
    public int f32212l;

    /* JADX INFO: renamed from: m */
    public int f32213m;

    /* JADX INFO: renamed from: n */
    public int f32214n;

    /* JADX INFO: renamed from: o */
    public int f32215o;

    /* JADX INFO: renamed from: p */
    public boolean f32216p;

    /* JADX INFO: renamed from: q */
    public VelocityTracker f32217q;

    /* JADX INFO: renamed from: r */
    public boolean f32218r;

    /* JADX INFO: renamed from: s */
    public boolean f32219s;

    /* JADX INFO: renamed from: t */
    public ArrayList<jf50> f32220t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.TantanListView$a */
    public class C8577a extends Property<View, Integer> {
        public C8577a(Class cls, String str) {
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
        this.f32203c = 10000;
        this.f32209i = false;
        this.f32210j = 0;
        this.f32211k = -1;
        this.f32214n = 0;
        this.f32215o = 0;
        this.f32216p = false;
        this.f32218r = false;
        this.f32219s = false;
        this.f32220t = new ArrayList<>();
        m49624o();
    }

    /* JADX INFO: renamed from: k */
    private void m49623k() {
        if (this.f32217q == null) {
            this.f32217q = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: o */
    private void m49624o() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f32204d = viewConfiguration.getScaledPagingTouchSlop();
        this.f32205e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f32206f = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: D */
    public void m49625D() {
        xmr.m210147c("requestInner call");
        super.requestLayout();
    }

    /* JADX INFO: renamed from: E */
    public void m49626E(String str) {
        xmr.m210147c("safeLayout: from " + str + " state :" + this.f32216p);
        if (this.f32216p) {
            m49625D();
        } else {
            this.f32202b.m49667W(str);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m49627F(int i, int i2) {
        int i3 = this.f32211k;
        if (i3 == -1.0f) {
            this.f32210j = 0;
        } else {
            this.f32210j += i - i3;
            m49637w(0, i - i3);
            this.f32202b.m49674d0(i - this.f32211k, 0);
        }
        this.f32211k = i;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.ChoreographerFrameCallbackC8582e.a
    /* JADX INFO: renamed from: a */
    public void mo49628a() {
        m49636t(ChoreographerFrameCallbackC8582e.f32246r);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        m49635r(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.ChoreographerFrameCallbackC8582e.a
    /* JADX INFO: renamed from: b */
    public void mo49629b(boolean z) {
        if (z) {
            return;
        }
        m49636t(ChoreographerFrameCallbackC8582e.f32244p);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.ChoreographerFrameCallbackC8582e.a
    /* JADX INFO: renamed from: c */
    public void mo49630c(int i, float f, int i2, int i3, boolean z) {
        m49637w(0, i2);
    }

    @Override // android.view.ViewGroup
    public void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f32202b.m49707t0()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void forceLayout() {
        super.forceLayout();
        this.f32216p = true;
    }

    /* JADX INFO: renamed from: g */
    public void m49631g(jf50 jf50Var) {
        this.f32220t.add(jf50Var);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public int getInnerPaddingBottom() {
        return this.f32215o;
    }

    public int getRealHeight() {
        return this.f32212l;
    }

    public int getRealWidth() {
        return this.f32213m;
    }

    public int getRenderContentHeight() {
        return this.f32212l - this.f32215o;
    }

    /* JADX INFO: renamed from: h */
    public final void m49632h() {
        if (vwb.m200296J(this.f32220t)) {
            return;
        }
        Iterator<jf50> it = this.f32220t.iterator();
        while (it.hasNext()) {
            if (it.next().f117635a) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m49633i(int i) {
        this.f32202b.m49693B0(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xmr.m210146b("TantanListView", "从窗口中移出了");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            this.f32218r = false;
            this.f32207g = x;
            this.f32208h = y;
            if (this.f32202b.m49708u0()) {
                this.f32202b.m49698k0();
                m49636t(ChoreographerFrameCallbackC8582e.f32244p);
            }
        } else if (action == 2 && !this.f32218r) {
            int i = y - this.f32208h;
            if (Math.abs(i) > this.f32204d) {
                this.f32209i = true;
                this.f32207g = i;
                this.f32208h = y;
                m49636t(ChoreographerFrameCallbackC8582e.f32245q);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        xmr.m210147c("onLayout");
        x4i0 x4i0Var = this.f32202b;
        if (x4i0Var != null) {
            x4i0Var.m49659O(z, i, i2, i3, i4);
        }
        this.f32216p = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        xmr.m210147c("onMeasure: " + size + "*" + size2);
        setMeasuredDimension(size, size2);
        x4i0 x4i0Var = this.f32202b;
        if (x4i0Var == null || (i3 = this.f32212l) == size2 || size2 <= 0) {
            if (this.f32216p) {
                x4i0Var.m49666V();
                return;
            }
            return;
        }
        boolean z = i3 == 0;
        this.f32212l = size2;
        this.f32213m = size;
        xmr.m210147c("onMeasure: calculateItemInfoNecessary" + size + "*" + size2);
        this.f32202b.m206983E0(z);
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
        m49623k();
        this.f32217q.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            this.f32209i = false;
            this.f32218r = false;
            this.f32207g = x;
            this.f32208h = y;
        } else if (action == 1) {
            this.f32211k = -1;
            if (this.f32209i) {
                VelocityTracker velocityTracker = this.f32217q;
                velocityTracker.computeCurrentVelocity(1000);
                yVelocity = (int) (velocityTracker.getYVelocity() / f32199u);
                xmr.m210146b("TantanListView", "滚动的速度为：  ====》" + yVelocity);
                if (Math.abs(yVelocity) > this.f32206f) {
                    i = 2500;
                } else if (Math.abs(yVelocity) > this.f32205e) {
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
                this.f32202b.m49694C0(yVelocity, 0, i);
            }
        } else if (action == 2) {
            this.f32218r = true;
            int i3 = y - this.f32208h;
            if (Math.abs(i3) > this.f32204d && !this.f32209i) {
                this.f32209i = true;
                this.f32207g = i3;
                this.f32208h = y;
                m49636t(ChoreographerFrameCallbackC8582e.f32245q);
            }
            if (this.f32209i) {
                m49627F(y, this.f32208h);
            }
        } else if (action == 3) {
            this.f32211k = -1;
            if (this.f32209i) {
                VelocityTracker velocityTracker2 = this.f32217q;
                velocityTracker2.computeCurrentVelocity(1000);
                yVelocity = (int) (velocityTracker2.getYVelocity() / f32199u);
                xmr.m210146b("TantanListView", "滚动的速度为：  ====》" + yVelocity);
                if (Math.abs(yVelocity) > this.f32206f) {
                    i = 2500;
                } else if (Math.abs(yVelocity) > this.f32205e) {
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
                this.f32202b.m49694C0(yVelocity, 0, i);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m49634q() {
        return this.f32202b.m49707t0();
    }

    /* JADX INFO: renamed from: r */
    public final void m49635r(View view) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        xmr.m210147c("requestLayout");
        x4i0 x4i0Var = this.f32202b;
        if (x4i0Var != null) {
            x4i0Var.mo49665U();
        } else {
            super.requestLayout();
        }
    }

    public void setAdapter(coi0 coi0Var) {
        if (this.f32202b != null) {
            return;
        }
        upk0.m194883a("请设置正确的LayoutManager");
    }

    public void setDebugMove(int i) {
        scrollBy(0, i);
    }

    public void setInnerPaddingBottom(int i) {
        if (this.f32215o != i) {
            this.f32215o = i;
            this.f32202b.m206983E0(false);
            this.f32202b.m49669Y("setInnerPaddingBottom", true);
        }
    }

    public void setLayoutManager(x4i0 x4i0Var) {
        this.f32202b = x4i0Var;
        x4i0Var.m49692A0(this);
        x4i0Var.m49673c0(this);
    }

    /* JADX INFO: renamed from: t */
    public void m49636t(int i) {
        if (vwb.m200296J(this.f32220t)) {
            return;
        }
        this.f32219s = true;
        Iterator<jf50> it = this.f32220t.iterator();
        while (it.hasNext()) {
            it.next().mo141174a(i);
        }
        m49632h();
        this.f32219s = false;
    }

    /* JADX INFO: renamed from: w */
    public void m49637w(int i, int i2) {
        if (vwb.m200296J(this.f32220t)) {
            return;
        }
        this.f32219s = true;
        Iterator<jf50> it = this.f32220t.iterator();
        while (it.hasNext()) {
            it.next().mo48377b(i, i2);
        }
        m49632h();
        this.f32219s = false;
    }

    /* JADX INFO: renamed from: y */
    public void m49638y(View view) {
        removeDetachedView(view, false);
    }

    /* JADX INFO: renamed from: z */
    public void m49639z(jf50 jf50Var) {
        if (this.f32219s) {
            jf50Var.f117635a = true;
        } else {
            this.f32220t.remove(jf50Var);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        super.addView(view, i);
        m49635r(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m49635r(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        super.addView(view, i, i2);
        m49635r(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        m49635r(view);
    }

    public TantanListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TantanListView(Context context) {
        this(context, null);
    }
}
