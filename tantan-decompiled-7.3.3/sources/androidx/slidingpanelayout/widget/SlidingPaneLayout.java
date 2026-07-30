package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import p153l.C15967bc;
import p153l.C16932fb;
import p153l.j26;
import p153l.kkl0;
import p153l.wtq0;
import p153l.ykl0;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f3072a;

    /* JADX INFO: renamed from: b */
    public int f3073b;

    /* JADX INFO: renamed from: c */
    public Drawable f3074c;

    /* JADX INFO: renamed from: d */
    public Drawable f3075d;

    /* JADX INFO: renamed from: e */
    public final int f3076e;

    /* JADX INFO: renamed from: f */
    public boolean f3077f;

    /* JADX INFO: renamed from: g */
    public View f3078g;

    /* JADX INFO: renamed from: h */
    public float f3079h;

    /* JADX INFO: renamed from: i */
    public float f3080i;

    /* JADX INFO: renamed from: j */
    public int f3081j;

    /* JADX INFO: renamed from: k */
    public boolean f3082k;

    /* JADX INFO: renamed from: l */
    public int f3083l;

    /* JADX INFO: renamed from: m */
    public float f3084m;

    /* JADX INFO: renamed from: n */
    public float f3085n;

    /* JADX INFO: renamed from: o */
    public final ykl0 f3086o;

    /* JADX INFO: renamed from: p */
    public boolean f3087p;

    /* JADX INFO: renamed from: q */
    public boolean f3088q;

    /* JADX INFO: renamed from: r */
    public final Rect f3089r;

    /* JADX INFO: renamed from: s */
    public final ArrayList<RunnableC0682b> f3090s;

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    public class C0681a extends C16932fb {

        /* JADX INFO: renamed from: a */
        public final Rect f3091a = new Rect();

        public C0681a() {
        }

        /* JADX INFO: renamed from: a */
        private void m4049a(C15967bc c15967bc, C15967bc c15967bc2) {
            Rect rect = this.f3091a;
            c15967bc2.m103426m(rect);
            c15967bc.m103421j0(rect);
            c15967bc2.m103428n(rect);
            c15967bc.m103423k0(rect);
            c15967bc.m103396R0(c15967bc2.m103405Z());
            c15967bc.m103368D0(c15967bc2.m103451z());
            c15967bc.m103431o0(c15967bc2.m103434q());
            c15967bc.m103438s0(c15967bc2.m103439t());
            c15967bc.m103444v0(c15967bc2.m103389O());
            c15967bc.m103433p0(c15967bc2.m103385M());
            c15967bc.m103448x0(c15967bc2.m103391P());
            c15967bc.m103450y0(c15967bc2.m103393Q());
            c15967bc.m103418h0(c15967bc2.m103379J());
            c15967bc.m103384L0(c15967bc2.m103402W());
            c15967bc.m103364B0(c15967bc2.m103399T());
            c15967bc.m103406a(c15967bc2.m103422k());
            c15967bc.m103366C0(c15967bc2.m103447x());
        }

        /* JADX INFO: renamed from: b */
        public boolean m4050b(View view) {
            return SlidingPaneLayout.this.m4035h(view);
        }

        @Override // p153l.C16932fb
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // p153l.C16932fb
        public void onInitializeAccessibilityNodeInfo(View view, C15967bc c15967bc) {
            C15967bc c15967bcM103358c0 = C15967bc.m103358c0(c15967bc);
            super.onInitializeAccessibilityNodeInfo(view, c15967bcM103358c0);
            m4049a(c15967bc, c15967bcM103358c0);
            c15967bcM103358c0.m103412e0();
            c15967bc.m103431o0(SlidingPaneLayout.class.getName());
            c15967bc.m103388N0(view);
            Object objM150114C = kkl0.m150114C(view);
            if (objM150114C instanceof View) {
                c15967bc.m103372F0((View) objM150114C);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!m4050b(childAt) && childAt.getVisibility() == 0) {
                    kkl0.m150184t0(childAt, 1);
                    c15967bc.m103408c(childAt);
                }
            }
        }

        @Override // p153l.C16932fb
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (m4050b(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    public class RunnableC0682b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final View f3093a;

        public RunnableC0682b(View view) {
            this.f3093a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3093a.getParent() == SlidingPaneLayout.this) {
                this.f3093a.setLayerType(0, null);
                SlidingPaneLayout.this.m4034g(this.f3093a);
            }
            SlidingPaneLayout.this.f3090s.remove(this);
        }
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    public class C0683c extends ykl0.AbstractC21619c {
        public C0683c() {
        }

        @Override // p153l.ykl0.AbstractC21619c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            C0684d c0684d = (C0684d) SlidingPaneLayout.this.f3078g.getLayoutParams();
            boolean zM4036i = SlidingPaneLayout.this.m4036i();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (zM4036i) {
                int width = slidingPaneLayout.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0684d).rightMargin) + SlidingPaneLayout.this.f3078g.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f3081j);
            }
            int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0684d).leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f3081j + paddingLeft);
        }

        @Override // p153l.ykl0.AbstractC21619c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p153l.ykl0.AbstractC21619c
        public int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.f3081j;
        }

        @Override // p153l.ykl0.AbstractC21619c
        public void onEdgeDragStarted(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f3086o.m216505c(slidingPaneLayout.f3078g, i2);
        }

        @Override // p153l.ykl0.AbstractC21619c
        public void onViewCaptured(View view, int i) {
            SlidingPaneLayout.this.m4043p();
        }

        @Override // p153l.ykl0.AbstractC21619c
        public void onViewDragStateChanged(int i) {
            if (SlidingPaneLayout.this.f3086o.m216485A() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f3079h != 0.0f) {
                    slidingPaneLayout.m4032e(slidingPaneLayout.f3078g);
                    SlidingPaneLayout.this.f3087p = true;
                } else {
                    slidingPaneLayout.m4045r(slidingPaneLayout.f3078g);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.m4031d(slidingPaneLayout2.f3078g);
                    SlidingPaneLayout.this.f3087p = false;
                }
            }
        }

        @Override // p153l.ykl0.AbstractC21619c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.m4039l(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // p153l.ykl0.AbstractC21619c
        public void onViewReleased(View view, float f, float f2) {
            int paddingLeft;
            C0684d c0684d = (C0684d) view.getLayoutParams();
            boolean zM4036i = SlidingPaneLayout.this.m4036i();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (zM4036i) {
                int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0684d).rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f3079h > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f3081j;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f3078g.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) c0684d).leftMargin + slidingPaneLayout.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.f3079h > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f3081j;
                }
            }
            SlidingPaneLayout.this.f3086o.m216499O(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // p153l.ykl0.AbstractC21619c
        public boolean tryCaptureView(View view, int i) {
            if (SlidingPaneLayout.this.f3082k) {
                return false;
            }
            return ((C0684d) view.getLayoutParams()).f3098b;
        }
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$e */
    public interface InterfaceC0685e {
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3072a = -858993460;
        this.f3088q = true;
        this.f3089r = new Rect();
        this.f3090s = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f3076e = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        kkl0.m150164j0(this, new C0681a());
        kkl0.m150184t0(this, 1);
        ykl0 ykl0VarM216483o = ykl0.m216483o(this, 0.5f, new C0683c());
        this.f3086o = ykl0VarM216483o;
        ykl0VarM216483o.m216498N(f * 400.0f);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m4027s(View view) {
        return view.isOpaque();
    }

    /* JADX INFO: renamed from: a */
    public boolean m4028a() {
        return m4029b(this.f3078g, 0);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4029b(View view, int i) {
        if (!this.f3088q && !m4044q(0.0f, i)) {
            return false;
        }
        this.f3087p = false;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4030c(View view, float f, int i) {
        C0684d c0684d = (C0684d) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (i & 16777215);
            if (c0684d.f3100d == null) {
                c0684d.f3100d = new Paint();
            }
            c0684d.f3100d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, c0684d.f3100d);
            }
            m4034g(view);
            return;
        }
        if (view.getLayerType() != 0) {
            Paint paint = c0684d.f3100d;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            RunnableC0682b runnableC0682b = new RunnableC0682b(view);
            this.f3090s.add(runnableC0682b);
            kkl0.m150148b0(this, runnableC0682b);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0684d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f3086o.m216516n(true)) {
            if (this.f3077f) {
                kkl0.m150146a0(this);
            } else {
                this.f3086o.m216503a();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4031d(View view) {
        sendAccessibilityEvent(32);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int right;
        super.draw(canvas);
        Drawable drawable = m4036i() ? this.f3075d : this.f3074c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (m4036i()) {
            right = childAt.getRight();
            i = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i2 = left - intrinsicWidth;
            i = left;
            right = i2;
        }
        drawable.setBounds(right, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0684d c0684d = (C0684d) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f3077f && !c0684d.f3098b && this.f3078g != null) {
            canvas.getClipBounds(this.f3089r);
            boolean zM4036i = m4036i();
            Rect rect = this.f3089r;
            if (zM4036i) {
                rect.left = Math.max(rect.left, this.f3078g.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f3078g.getLeft());
            }
            canvas.clipRect(this.f3089r);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    /* JADX INFO: renamed from: e */
    public void m4032e(View view) {
        sendAccessibilityEvent(32);
    }

    /* JADX INFO: renamed from: f */
    public void m4033f(View view) {
    }

    /* JADX INFO: renamed from: g */
    public void m4034g(View view) {
        kkl0.m150190w0(view, ((C0684d) view.getLayoutParams()).f3100d);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0684d();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0684d((ViewGroup.MarginLayoutParams) layoutParams) : new C0684d(layoutParams);
    }

    @ColorInt
    public int getCoveredFadeColor() {
        return this.f3073b;
    }

    @Px
    public int getParallaxDistance() {
        return this.f3083l;
    }

    @ColorInt
    public int getSliderFadeColor() {
        return this.f3072a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m4035h(View view) {
        if (view == null) {
            return false;
        }
        return this.f3077f && ((C0684d) view.getLayoutParams()).f3099c && this.f3079h > 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m4036i() {
        return kkl0.m150191x(this) == 1;
    }

    /* JADX INFO: renamed from: j */
    public boolean m4037j() {
        return !this.f3077f || this.f3079h == 1.0f;
    }

    /* JADX INFO: renamed from: k */
    public boolean m4038k() {
        return this.f3077f;
    }

    /* JADX INFO: renamed from: l */
    public void m4039l(int i) {
        if (this.f3078g == null) {
            this.f3079h = 0.0f;
            return;
        }
        boolean zM4036i = m4036i();
        C0684d c0684d = (C0684d) this.f3078g.getLayoutParams();
        int width = this.f3078g.getWidth();
        if (zM4036i) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = (i - ((zM4036i ? getPaddingRight() : getPaddingLeft()) + (zM4036i ? ((ViewGroup.MarginLayoutParams) c0684d).rightMargin : ((ViewGroup.MarginLayoutParams) c0684d).leftMargin))) / this.f3081j;
        this.f3079h = paddingRight;
        if (this.f3083l != 0) {
            m4042o(paddingRight);
        }
        if (c0684d.f3099c) {
            m4030c(this.f3078g, this.f3079h, this.f3072a);
        }
        m4033f(this.f3078g);
    }

    /* JADX INFO: renamed from: m */
    public boolean m4040m() {
        return m4041n(this.f3078g, 0);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4041n(View view, int i) {
        if (!this.f3088q && !m4044q(1.0f, i)) {
            return false;
        }
        this.f3087p = true;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: o */
    public final void m4042o(float f) {
        boolean z;
        boolean zM4036i = m4036i();
        C0684d c0684d = (C0684d) this.f3078g.getLayoutParams();
        if (!c0684d.f3099c) {
            z = false;
        } else if ((zM4036i ? ((ViewGroup.MarginLayoutParams) c0684d).rightMargin : ((ViewGroup.MarginLayoutParams) c0684d).leftMargin) <= 0) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f3078g) {
                float f2 = 1.0f - this.f3080i;
                int i2 = this.f3083l;
                this.f3080i = f;
                int i3 = ((int) (f2 * i2)) - ((int) ((1.0f - f) * i2));
                if (zM4036i) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
                if (z) {
                    float f3 = this.f3080i;
                    m4030c(childAt, zM4036i ? f3 - 1.0f : 1.0f - f3, this.f3073b);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3088q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3088q = true;
        int size = this.f3090s.size();
        int i = 0;
        while (true) {
            ArrayList<RunnableC0682b> arrayList = this.f3090s;
            if (i >= size) {
                arrayList.clear();
                return;
            } else {
                arrayList.get(i).run();
                i++;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f3077f && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f3087p = !this.f3086o.m216490F(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f3077f || (this.f3082k && actionMasked != 0)) {
            this.f3086o.m216504b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f3086o.m216504b();
            return false;
        }
        if (actionMasked == 0) {
            this.f3082k = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f3084m = x;
            this.f3085n = y;
            if (this.f3086o.m216490F(this.f3078g, (int) x, (int) y) && m4035h(this.f3078g)) {
                z = true;
            }
            return !this.f3086o.m216500P(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float fAbs = Math.abs(x2 - this.f3084m);
            float fAbs2 = Math.abs(y2 - this.f3085n);
            if (fAbs > this.f3086o.m216526z() && fAbs2 > fAbs) {
                this.f3086o.m216504b();
                this.f3082k = true;
                return false;
            }
        }
        z = false;
        if (this.f3086o.m216500P(motionEvent)) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean zM4036i = m4036i();
        ykl0 ykl0Var = this.f3086o;
        if (zM4036i) {
            ykl0Var.m216497M(2);
        } else {
            ykl0Var.m216497M(1);
        }
        int i9 = i3 - i;
        int paddingRight = zM4036i ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM4036i ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f3088q) {
            this.f3079h = (this.f3077f && this.f3087p) ? 1.0f : 0.0f;
        }
        int i10 = paddingRight;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0684d c0684d = (C0684d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (c0684d.f3098b) {
                    int i12 = i9 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i12 - this.f3076e) - i10) - (((ViewGroup.MarginLayoutParams) c0684d).leftMargin + ((ViewGroup.MarginLayoutParams) c0684d).rightMargin);
                    this.f3081j = iMin;
                    int i13 = zM4036i ? ((ViewGroup.MarginLayoutParams) c0684d).rightMargin : ((ViewGroup.MarginLayoutParams) c0684d).leftMargin;
                    c0684d.f3099c = ((i10 + i13) + iMin) + (measuredWidth / 2) > i12;
                    int i14 = (int) (iMin * this.f3079h);
                    i10 += i13 + i14;
                    this.f3079h = i14 / iMin;
                } else {
                    if (!this.f3077f || (i5 = this.f3083l) == 0) {
                        i10 = paddingRight;
                    } else {
                        i6 = (int) ((1.0f - this.f3079h) * i5);
                        i10 = paddingRight;
                    }
                    if (zM4036i) {
                        i8 = (i9 - i10) + i6;
                        i7 = i8 - measuredWidth;
                    } else {
                        i7 = i10 - i6;
                        i8 = i7 + measuredWidth;
                    }
                    childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                    paddingRight += childAt.getWidth();
                }
                i6 = 0;
                if (zM4036i) {
                    i8 = (i9 - i10) + i6;
                    i7 = i8 - measuredWidth;
                } else {
                    i7 = i10 - i6;
                    i8 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.f3088q) {
            if (this.f3077f) {
                if (this.f3083l != 0) {
                    m4042o(this.f3079h);
                }
                if (((C0684d) this.f3078g.getLayoutParams()).f3099c) {
                    m4030c(this.f3078g, this.f3079h, this.f3072a);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    m4030c(getChildAt(i15), 0.0f, this.f3072a);
                }
            }
            m4045r(this.f3078g);
        }
        this.f3088q = false;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x013a  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int i4;
        int iMakeMeasureSpec;
        int i5;
        int iMakeMeasureSpec2;
        int i6;
        int iMakeMeasureSpec3;
        int i7;
        int iMakeMeasureSpec4;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                wtq0.m207906a("Width must have an exact value or MATCH_PARENT");
                return;
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                wtq0.m207906a("Height must not be UNSPECIFIED");
                return;
            } else if (mode2 == 0) {
                size2 = 300;
                mode2 = Integer.MIN_VALUE;
            }
        }
        boolean z = false;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f3078g = null;
        int i8 = 0;
        boolean z2 = false;
        int i9 = paddingLeft;
        float f = 0.0f;
        while (true) {
            i3 = 8;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            C0684d c0684d = (C0684d) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                c0684d.f3099c = z;
            } else {
                float f2 = c0684d.f3097a;
                if (f2 > 0.0f) {
                    f += f2;
                    if (((ViewGroup.MarginLayoutParams) c0684d).width == 0) {
                    }
                    i8++;
                    paddingLeft = i7;
                    z = false;
                }
                int i10 = ((ViewGroup.MarginLayoutParams) c0684d).leftMargin + ((ViewGroup.MarginLayoutParams) c0684d).rightMargin;
                int i11 = ((ViewGroup.MarginLayoutParams) c0684d).width;
                if (i11 == -2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i10, Integer.MIN_VALUE);
                    i6 = Integer.MIN_VALUE;
                } else {
                    i6 = Integer.MIN_VALUE;
                    iMakeMeasureSpec3 = i11 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingLeft - i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                }
                int i12 = ((ViewGroup.MarginLayoutParams) c0684d).height;
                i7 = paddingLeft;
                if (i12 == -2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, i6);
                } else {
                    iMakeMeasureSpec4 = i12 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                }
                childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i6 && measuredHeight > iMin) {
                    iMin = Math.min(measuredHeight, paddingTop);
                }
                i9 -= measuredWidth;
                boolean z3 = i9 < 0;
                c0684d.f3098b = z3;
                z2 |= z3;
                if (z3) {
                    this.f3078g = childAt;
                }
                i8++;
                paddingLeft = i7;
                z = false;
            }
            i7 = paddingLeft;
            i8++;
            paddingLeft = i7;
            z = false;
        }
        int i13 = paddingLeft;
        if (z2 || f > 0.0f) {
            int i14 = i13 - this.f3076e;
            int i15 = 0;
            while (i15 < childCount) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() != i3) {
                    C0684d c0684d2 = (C0684d) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i3) {
                        boolean z4 = ((ViewGroup.MarginLayoutParams) c0684d2).width == 0 && c0684d2.f3097a > 0.0f;
                        int measuredWidth2 = z4 ? 0 : childAt2.getMeasuredWidth();
                        if (!z2 || childAt2 == this.f3078g) {
                            if (c0684d2.f3097a > 0.0f) {
                                if (((ViewGroup.MarginLayoutParams) c0684d2).width == 0) {
                                    int i16 = ((ViewGroup.MarginLayoutParams) c0684d2).height;
                                    if (i16 == -2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                        i4 = 1073741824;
                                    } else if (i16 == -1) {
                                        i4 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                    } else {
                                        i4 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                    }
                                } else {
                                    i4 = 1073741824;
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z2) {
                                    int i17 = i13 - (((ViewGroup.MarginLayoutParams) c0684d2).leftMargin + ((ViewGroup.MarginLayoutParams) c0684d2).rightMargin);
                                    int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i17, i4);
                                    if (measuredWidth2 != i17) {
                                        childAt2.measure(iMakeMeasureSpec5, iMakeMeasureSpec);
                                    }
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2 + ((int) ((c0684d2.f3097a * Math.max(0, i9)) / f)), 1073741824), iMakeMeasureSpec);
                                }
                            }
                        } else if (((ViewGroup.MarginLayoutParams) c0684d2).width < 0 && (measuredWidth2 > i14 || c0684d2.f3097a > 0.0f)) {
                            if (z4) {
                                int i18 = ((ViewGroup.MarginLayoutParams) c0684d2).height;
                                if (i18 == -2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    i5 = 1073741824;
                                } else if (i18 == -1) {
                                    i5 = 1073741824;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    i5 = 1073741824;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                                }
                            } else {
                                i5 = 1073741824;
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, i5), iMakeMeasureSpec2);
                        }
                    }
                }
                i15++;
                i3 = 8;
            }
        }
        setMeasuredDimension(size, iMin + getPaddingTop() + getPaddingBottom());
        this.f3077f = z2;
        if (this.f3086o.m216485A() == 0 || z2) {
            return;
        }
        this.f3086o.m216503a();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.isOpen) {
            m4040m();
        } else {
            m4028a();
        }
        this.f3087p = savedState.isOpen;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.isOpen = m4038k() ? m4037j() : this.f3087p;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f3088q = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3077f) {
            return super.onTouchEvent(motionEvent);
        }
        this.f3086o.m216491G(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f3084m = x;
            this.f3085n = y;
            return true;
        }
        if (actionMasked == 1 && m4035h(this.f3078g)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f3084m;
            float f2 = y2 - this.f3085n;
            int iM216526z = this.f3086o.m216526z();
            if ((f * f) + (f2 * f2) < iM216526z * iM216526z && this.f3086o.m216490F(this.f3078g, (int) x2, (int) y2)) {
                m4029b(this.f3078g, 0);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m4043p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m4044q(float f, int i) {
        int paddingLeft;
        if (!this.f3077f) {
            return false;
        }
        boolean zM4036i = m4036i();
        C0684d c0684d = (C0684d) this.f3078g.getLayoutParams();
        if (zM4036i) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0684d).rightMargin) + (f * this.f3081j)) + this.f3078g.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0684d).leftMargin + (f * this.f3081j));
        }
        ykl0 ykl0Var = this.f3086o;
        View view = this.f3078g;
        if (!ykl0Var.m216501Q(view, paddingLeft, view.getTop())) {
            return false;
        }
        m4043p();
        kkl0.m150146a0(this);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m4045r(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View view2 = view;
        boolean zM4036i = m4036i();
        int width = zM4036i ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM4036i ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m4027s(view2)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt == view2) {
                return;
            }
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zM4036i ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zM4036i ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zM4036i = zM4036i;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f3077f) {
            return;
        }
        this.f3087p = view == this.f3078g;
    }

    public void setCoveredFadeColor(@ColorInt int i) {
        this.f3073b = i;
    }

    public void setPanelSlideListener(@Nullable InterfaceC0685e interfaceC0685e) {
    }

    public void setParallaxDistance(@Px int i) {
        this.f3083l = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.f3074c = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.f3075d = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(j26.m143192e(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(j26.m143192e(getContext(), i));
    }

    public void setSliderFadeColor(@ColorInt int i) {
        this.f3072a = i;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0680a();
        boolean isOpen;

        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        public static class C0680a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isOpen = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.isOpen ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0684d(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public static class C0684d extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: e */
        public static final int[] f3096e = {R.attr.layout_weight};

        /* JADX INFO: renamed from: a */
        public float f3097a;

        /* JADX INFO: renamed from: b */
        public boolean f3098b;

        /* JADX INFO: renamed from: c */
        public boolean f3099c;

        /* JADX INFO: renamed from: d */
        public Paint f3100d;

        public C0684d(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3097a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3096e);
            this.f3097a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0684d(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3097a = 0.0f;
        }

        public C0684d(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3097a = 0.0f;
        }

        public C0684d() {
            super(-1, -1);
            this.f3097a = 0.0f;
        }
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, null);
    }
}
