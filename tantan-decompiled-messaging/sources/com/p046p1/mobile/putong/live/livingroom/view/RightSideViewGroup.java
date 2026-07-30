package com.p046p1.mobile.putong.live.livingroom.view;

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
import p147v.VFrame;
import p149l.cwf0;
import p149l.n3m;
import p149l.t100;
import p149l.ubl0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class RightSideViewGroup extends VFrame {

    /* JADX INFO: renamed from: a */
    public ubl0 f52066a;

    /* JADX INFO: renamed from: b */
    public View f52067b;

    /* JADX INFO: renamed from: c */
    public View f52068c;

    /* JADX INFO: renamed from: d */
    public int f52069d;

    /* JADX INFO: renamed from: e */
    public float f52070e;

    /* JADX INFO: renamed from: f */
    public float f52071f;

    /* JADX INFO: renamed from: g */
    public List<InterfaceC12939c> f52072g;

    /* JADX INFO: renamed from: h */
    public cwf0 f52073h;

    /* JADX INFO: renamed from: i */
    public final C12940d f52074i;

    /* JADX INFO: renamed from: j */
    public boolean f52075j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup$a */
    public class C12937a extends ubl0.AbstractC20403c {
        public C12937a() {
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            if (RightSideViewGroup.this.f52074i.f52082e == -1) {
                if ((i2 <= 0 || RightSideViewGroup.this.f52074i.f52080c || RightSideViewGroup.this.getContentViewState()) && (i2 >= 0 || !RightSideViewGroup.this.getContentViewState())) {
                    RightSideViewGroup.this.f52074i.f52082e = 0;
                } else {
                    RightSideViewGroup.this.f52074i.f52082e = 1;
                }
            }
            if (!RightSideViewGroup.this.m76616K()) {
                RightSideViewGroup.this.f52074i.f52082e = 0;
            }
            int i3 = RightSideViewGroup.this.f52074i.f52082e;
            RightSideViewGroup rightSideViewGroup = RightSideViewGroup.this;
            if (i3 == 1) {
                rightSideViewGroup.m76620O(i);
            } else if (rightSideViewGroup.f52074i.f52082e == 0 && RightSideViewGroup.this.f52074i.f52081d) {
                float translationX = RightSideViewGroup.this.f52068c.getTranslationX() + i;
                if (translationX > 0.0f) {
                    RightSideViewGroup.this.f52068c.setTranslationX(0.0f);
                } else {
                    float fAbs = Math.abs(translationX);
                    float f = RightSideViewGroup.this.f52069d;
                    RightSideViewGroup rightSideViewGroup2 = RightSideViewGroup.this;
                    if (fAbs < f) {
                        rightSideViewGroup2.f52068c.setTranslationX(translationX);
                    } else {
                        rightSideViewGroup2.f52068c.setTranslationX(RightSideViewGroup.this.f52069d * (-1));
                    }
                }
            }
            return 0;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return 0;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewReleased(@NonNull View view, float f, float f2) {
            int i = RightSideViewGroup.this.f52074i.f52082e;
            RightSideViewGroup rightSideViewGroup = RightSideViewGroup.this;
            if (i == 1) {
                rightSideViewGroup.m76621P(f);
            } else if (rightSideViewGroup.f52074i.f52081d) {
                float fAbs = Math.abs(RightSideViewGroup.this.f52068c.getTranslationX());
                if (RightSideViewGroup.this.f52074i.f52080c) {
                    RightSideViewGroup rightSideViewGroup2 = RightSideViewGroup.this;
                    if (f > 0.0f) {
                        rightSideViewGroup2.m76618M(f);
                    } else {
                        float f3 = rightSideViewGroup2.f52069d / 2;
                        RightSideViewGroup rightSideViewGroup3 = RightSideViewGroup.this;
                        if (fAbs > f3) {
                            rightSideViewGroup3.m76623R(f);
                        } else {
                            rightSideViewGroup3.m76618M(f);
                        }
                    }
                } else if (fAbs > RightSideViewGroup.this.f52069d / 2 || f < -2000.0f) {
                    RightSideViewGroup.this.m76623R(f);
                } else {
                    RightSideViewGroup.this.m76618M(f);
                }
            }
            RightSideViewGroup.this.f52074i.f52082e = -1;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public boolean tryCaptureView(@NonNull View view, int i) {
            return view == RightSideViewGroup.this.f52067b;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup$b */
    public class C12938b implements n3m {
        public C12938b() {
        }

        @Override // p149l.n3m
        public boolean disableAutoPV() {
            return true;
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_live_right_recommend";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup$c */
    public interface InterfaceC12939c {
        /* JADX INFO: renamed from: a */
        default Boolean mo76626a() {
            return null;
        }

        /* JADX INFO: renamed from: b */
        default Boolean mo76627b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        default void mo76628c(float f) {
        }

        /* JADX INFO: renamed from: d */
        void mo76629d(boolean z);

        /* JADX INFO: renamed from: e */
        default void mo76630e(int i) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup$d */
    public static final class C12940d {

        /* JADX INFO: renamed from: a */
        public boolean f52078a = false;

        /* JADX INFO: renamed from: b */
        public boolean f52079b = false;

        /* JADX INFO: renamed from: c */
        public boolean f52080c = false;

        /* JADX INFO: renamed from: d */
        public boolean f52081d = true;

        /* JADX INFO: renamed from: e */
        public int f52082e = -1;

        /* JADX INFO: renamed from: i */
        public boolean m76639i() {
            return this.f52081d;
        }

        /* JADX INFO: renamed from: j */
        public boolean m76640j() {
            return this.f52078a;
        }

        /* JADX INFO: renamed from: k */
        public boolean m76641k() {
            return this.f52080c;
        }
    }

    public RightSideViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52074i = new C12940d();
        this.f52075j = false;
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getContentViewState() {
        for (InterfaceC12939c interfaceC12939c : this.f52072g) {
            if (interfaceC12939c.mo76626a() != null && interfaceC12939c.mo76626a().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private void init() {
        this.f52066a = ubl0.m192836p(this, new C12937a());
        this.f52072g = new ArrayList();
        this.f52073h = new cwf0(new C12938b());
    }

    /* JADX INFO: renamed from: G */
    public void m76615G(InterfaceC12939c interfaceC12939c) {
        this.f52072g.add(interfaceC12939c);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m76616K() {
        for (InterfaceC12939c interfaceC12939c : this.f52072g) {
            if (interfaceC12939c.mo76627b() != null && interfaceC12939c.mo76627b().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public void m76617L(boolean z) {
        if (this.f52074i.f52080c) {
            this.f52074i.f52080c = false;
            this.f52074i.f52079b = z;
            m76619N(this.f52068c.getTranslationX(), 0.0f, 0.0f);
            m76622Q(false);
            this.f52073h.m109035k();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m76618M(float f) {
        boolean z = this.f52074i.f52080c;
        View view = this.f52068c;
        if (!z) {
            float translationX = view.getTranslationX();
            if (Math.abs(translationX) != 0.0f) {
                m76619N(translationX, 0.0f, f);
                return;
            }
            return;
        }
        m76619N(view.getTranslationX(), 0.0f, f);
        this.f52074i.f52080c = false;
        this.f52074i.f52079b = true;
        m76622Q(false);
        this.f52073h.m109035k();
    }

    /* JADX INFO: renamed from: N */
    public final void m76619N(float f, float f2, float f3) {
        int iAbs = f3 == 0.0f ? 300 : (int) Math.abs((f2 - f) / f3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f52068c, "translationX", f, f2);
        objectAnimatorOfFloat.setDuration(iAbs);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: O */
    public final void m76620O(int i) {
        Iterator<InterfaceC12939c> it = this.f52072g.iterator();
        while (it.hasNext()) {
            it.next().mo76630e(i);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m76621P(float f) {
        Iterator<InterfaceC12939c> it = this.f52072g.iterator();
        while (it.hasNext()) {
            it.next().mo76628c(f);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m76622Q(boolean z) {
        Iterator<InterfaceC12939c> it = this.f52072g.iterator();
        while (it.hasNext()) {
            it.next().mo76629d(z);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m76623R(float f) {
        m76619N(this.f52068c.getTranslationX(), this.f52069d * (-1), f);
        this.f52074i.f52080c = true;
        this.f52074i.f52078a = true;
        m76622Q(true);
        this.f52073h.m109036l();
    }

    /* JADX INFO: renamed from: S */
    public void m76624S(InterfaceC12939c interfaceC12939c) {
        this.f52072g.remove(interfaceC12939c);
    }

    /* JADX INFO: renamed from: T */
    public void m76625T(boolean z) {
        if (!this.f52074i.f52081d || this.f52074i.f52080c || this.f52069d == 0) {
            return;
        }
        this.f52074i.f52080c = true;
        m76619N(0.0f, -this.f52069d, 0.0f);
        this.f52074i.f52078a = z;
        m76622Q(true);
        this.f52073h.m109036l();
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        ubl0 ubl0Var = this.f52066a;
        if (ubl0Var == null || !ubl0Var.m192868n(true)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    @Override // p147v.VFrame, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f52074i.f52080c) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f52075j = true;
                this.f52070e = motionEvent.getX();
                this.f52071f = motionEvent.getY();
            } else if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if ("samsung".equalsIgnoreCase(Build.BRAND)) {
                    String str = Build.MODEL;
                    if (str.toLowerCase().contains("G9200".toLowerCase()) || str.toLowerCase().contains("g7810".toLowerCase()) || str.toLowerCase().contains("s918u1".toLowerCase())) {
                        if (Math.abs(x - this.f52070e) >= t100.m186890d(7.0f) || Math.abs(y - this.f52071f) >= t100.m186890d(5.0f)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else if (x == this.f52070e || y != this.f52071f) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (this.f52075j && z && x < xdl0.m208412y0() - this.f52069d) {
                        m76617L(true);
                    }
                    this.f52075j = false;
                } else {
                    if (x == this.f52070e) {
                    }
                    z = false;
                    if (this.f52075j) {
                        m76617L(true);
                    }
                    this.f52075j = false;
                }
            } else if (action == 3) {
                this.f52075j = false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C12940d getViewStates() {
        return this.f52074i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52072g.clear();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52067b = getChildAt(0);
        this.f52068c = getChildAt(1);
    }

    @Override // p147v.VFrame, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f52070e = motionEvent.getX();
            this.f52071f = motionEvent.getY();
            if (m76616K()) {
                getParent().requestDisallowInterceptTouchEvent(this.f52074i.f52080c || !getContentViewState());
            } else {
                getParent().requestDisallowInterceptTouchEvent(this.f52074i.f52080c);
            }
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z = Math.abs(x - this.f52070e) > Math.abs(y - this.f52071f);
            if ("samsung".equalsIgnoreCase(Build.BRAND)) {
                String str = Build.MODEL;
                if (str.toLowerCase().contains("G9200".toLowerCase()) || str.toLowerCase().contains("g7810".toLowerCase()) || str.toLowerCase().contains("s918u1".toLowerCase())) {
                    z = z && Math.abs(x - this.f52070e) >= ((float) t100.m186890d(7.0f)) && Math.abs(y - this.f52071f) >= ((float) t100.m186890d(5.0f));
                }
            }
            if ((z && (Math.abs(y - this.f52071f) > ((float) LiveScrollView.f52019t) ? 1 : (Math.abs(y - this.f52071f) == ((float) LiveScrollView.f52019t) ? 0 : -1)) < 0) && this.f52066a.m192875w() == null) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f52066a.m192857c(this.f52067b, motionEvent.getPointerId(0));
            }
        }
        return this.f52066a.m192852P(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f52067b == null || (view = this.f52068c) == null) {
            return;
        }
        this.f52069d = view.getMeasuredWidth();
        this.f52068c.layout(getWidth(), 0, this.f52068c.getMeasuredWidth() + getWidth(), this.f52068c.getMeasuredHeight());
        View view2 = this.f52067b;
        view2.layout(0, 0, view2.getMeasuredWidth(), this.f52067b.getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f52066a.m192843G(motionEvent);
        return true;
    }

    public void setEnable(boolean z) {
        this.f52074i.f52081d = z;
    }

    public RightSideViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RightSideViewGroup(@NonNull Context context) {
        this(context, null);
    }
}
