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
import p149l.C17055gc;
import p149l.C17974kb;
import p149l.e16;
import p149l.gbl0;
import p149l.qkq0;
import p149l.ubl0;

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
    public final ubl0 f3086o;

    /* JADX INFO: renamed from: p */
    public boolean f3087p;

    /* JADX INFO: renamed from: q */
    public boolean f3088q;

    /* JADX INFO: renamed from: r */
    public final Rect f3089r;

    /* JADX INFO: renamed from: s */
    public final ArrayList<RunnableC0680b> f3090s;

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    public class C0679a extends C17974kb {

        /* JADX INFO: renamed from: a */
        public final Rect f3091a = new Rect();

        public C0679a() {
        }

        /* JADX INFO: renamed from: a */
        private void m4047a(C17055gc c17055gc, C17055gc c17055gc2) {
            Rect rect = this.f3091a;
            c17055gc2.m125422m(rect);
            c17055gc.m125417j0(rect);
            c17055gc2.m125424n(rect);
            c17055gc.m125419k0(rect);
            c17055gc.m125392R0(c17055gc2.m125401Z());
            c17055gc.m125364D0(c17055gc2.m125447z());
            c17055gc.m125427o0(c17055gc2.m125430q());
            c17055gc.m125434s0(c17055gc2.m125435t());
            c17055gc.m125440v0(c17055gc2.m125385O());
            c17055gc.m125429p0(c17055gc2.m125381M());
            c17055gc.m125444x0(c17055gc2.m125387P());
            c17055gc.m125446y0(c17055gc2.m125389Q());
            c17055gc.m125414h0(c17055gc2.m125375J());
            c17055gc.m125380L0(c17055gc2.m125398W());
            c17055gc.m125360B0(c17055gc2.m125395T());
            c17055gc.m125402a(c17055gc2.m125418k());
            c17055gc.m125362C0(c17055gc2.m125443x());
        }

        /* JADX INFO: renamed from: b */
        public boolean m4048b(View view) {
            return SlidingPaneLayout.this.m4033h(view);
        }

        @Override // p149l.C17974kb
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // p149l.C17974kb
        public void onInitializeAccessibilityNodeInfo(View view, C17055gc c17055gc) {
            C17055gc c17055gcM125354c0 = C17055gc.m125354c0(c17055gc);
            super.onInitializeAccessibilityNodeInfo(view, c17055gcM125354c0);
            m4047a(c17055gc, c17055gcM125354c0);
            c17055gcM125354c0.m125408e0();
            c17055gc.m125427o0(SlidingPaneLayout.class.getName());
            c17055gc.m125384N0(view);
            Object objM125151C = gbl0.m125151C(view);
            if (objM125151C instanceof View) {
                c17055gc.m125368F0((View) objM125151C);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!m4048b(childAt) && childAt.getVisibility() == 0) {
                    gbl0.m125221t0(childAt, 1);
                    c17055gc.m125404c(childAt);
                }
            }
        }

        @Override // p149l.C17974kb
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (m4048b(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    public class RunnableC0680b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final View f3093a;

        public RunnableC0680b(View view) {
            this.f3093a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3093a.getParent() == SlidingPaneLayout.this) {
                this.f3093a.setLayerType(0, null);
                SlidingPaneLayout.this.m4032g(this.f3093a);
            }
            SlidingPaneLayout.this.f3090s.remove(this);
        }
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    public class C0681c extends ubl0.AbstractC20403c {
        public C0681c() {
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            C0682d c0682d = (C0682d) SlidingPaneLayout.this.f3078g.getLayoutParams();
            boolean zM4034i = SlidingPaneLayout.this.m4034i();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (zM4034i) {
                int width = slidingPaneLayout.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0682d).rightMargin) + SlidingPaneLayout.this.f3078g.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f3081j);
            }
            int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0682d).leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f3081j + paddingLeft);
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.f3081j;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onEdgeDragStarted(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f3086o.m192857c(slidingPaneLayout.f3078g, i2);
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewCaptured(View view, int i) {
            SlidingPaneLayout.this.m4041p();
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewDragStateChanged(int i) {
            if (SlidingPaneLayout.this.f3086o.m192837A() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f3079h != 0.0f) {
                    slidingPaneLayout.m4030e(slidingPaneLayout.f3078g);
                    SlidingPaneLayout.this.f3087p = true;
                } else {
                    slidingPaneLayout.m4043r(slidingPaneLayout.f3078g);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.m4029d(slidingPaneLayout2.f3078g);
                    SlidingPaneLayout.this.f3087p = false;
                }
            }
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.m4037l(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewReleased(View view, float f, float f2) {
            int paddingLeft;
            C0682d c0682d = (C0682d) view.getLayoutParams();
            boolean zM4034i = SlidingPaneLayout.this.m4034i();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (zM4034i) {
                int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0682d).rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f3079h > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f3081j;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f3078g.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) c0682d).leftMargin + slidingPaneLayout.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.f3079h > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f3081j;
                }
            }
            SlidingPaneLayout.this.f3086o.m192851O(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // p149l.ubl0.AbstractC20403c
        public boolean tryCaptureView(View view, int i) {
            if (SlidingPaneLayout.this.f3082k) {
                return false;
            }
            return ((C0682d) view.getLayoutParams()).f3098b;
        }
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$e */
    public interface InterfaceC0683e {
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
        gbl0.m125201j0(this, new C0679a());
        gbl0.m125221t0(this, 1);
        ubl0 ubl0VarM192835o = ubl0.m192835o(this, 0.5f, new C0681c());
        this.f3086o = ubl0VarM192835o;
        ubl0VarM192835o.m192850N(f * 400.0f);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m4025s(View view) {
        return view.isOpaque();
    }

    /* JADX INFO: renamed from: a */
    public boolean m4026a() {
        return m4027b(this.f3078g, 0);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4027b(View view, int i) {
        if (!this.f3088q && !m4042q(0.0f, i)) {
            return false;
        }
        this.f3087p = false;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4028c(View view, float f, int i) {
        C0682d c0682d = (C0682d) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (i & 16777215);
            if (c0682d.f3100d == null) {
                c0682d.f3100d = new Paint();
            }
            c0682d.f3100d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, c0682d.f3100d);
            }
            m4032g(view);
            return;
        }
        if (view.getLayerType() != 0) {
            Paint paint = c0682d.f3100d;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            RunnableC0680b runnableC0680b = new RunnableC0680b(view);
            this.f3090s.add(runnableC0680b);
            gbl0.m125185b0(this, runnableC0680b);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0682d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f3086o.m192868n(true)) {
            if (this.f3077f) {
                gbl0.m125183a0(this);
            } else {
                this.f3086o.m192855a();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4029d(View view) {
        sendAccessibilityEvent(32);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int right;
        super.draw(canvas);
        Drawable drawable = m4034i() ? this.f3075d : this.f3074c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (m4034i()) {
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
        C0682d c0682d = (C0682d) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f3077f && !c0682d.f3098b && this.f3078g != null) {
            canvas.getClipBounds(this.f3089r);
            boolean zM4034i = m4034i();
            Rect rect = this.f3089r;
            if (zM4034i) {
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
    public void m4030e(View view) {
        sendAccessibilityEvent(32);
    }

    /* JADX INFO: renamed from: f */
    public void m4031f(View view) {
    }

    /* JADX INFO: renamed from: g */
    public void m4032g(View view) {
        gbl0.m125227w0(view, ((C0682d) view.getLayoutParams()).f3100d);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0682d();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0682d((ViewGroup.MarginLayoutParams) layoutParams) : new C0682d(layoutParams);
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
    public boolean m4033h(View view) {
        if (view == null) {
            return false;
        }
        return this.f3077f && ((C0682d) view.getLayoutParams()).f3099c && this.f3079h > 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m4034i() {
        return gbl0.m125228x(this) == 1;
    }

    /* JADX INFO: renamed from: j */
    public boolean m4035j() {
        return !this.f3077f || this.f3079h == 1.0f;
    }

    /* JADX INFO: renamed from: k */
    public boolean m4036k() {
        return this.f3077f;
    }

    /* JADX INFO: renamed from: l */
    public void m4037l(int i) {
        if (this.f3078g == null) {
            this.f3079h = 0.0f;
            return;
        }
        boolean zM4034i = m4034i();
        C0682d c0682d = (C0682d) this.f3078g.getLayoutParams();
        int width = this.f3078g.getWidth();
        if (zM4034i) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = (i - ((zM4034i ? getPaddingRight() : getPaddingLeft()) + (zM4034i ? ((ViewGroup.MarginLayoutParams) c0682d).rightMargin : ((ViewGroup.MarginLayoutParams) c0682d).leftMargin))) / this.f3081j;
        this.f3079h = paddingRight;
        if (this.f3083l != 0) {
            m4040o(paddingRight);
        }
        if (c0682d.f3099c) {
            m4028c(this.f3078g, this.f3079h, this.f3072a);
        }
        m4031f(this.f3078g);
    }

    /* JADX INFO: renamed from: m */
    public boolean m4038m() {
        return m4039n(this.f3078g, 0);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4039n(View view, int i) {
        if (!this.f3088q && !m4042q(1.0f, i)) {
            return false;
        }
        this.f3087p = true;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: o */
    public final void m4040o(float f) {
        boolean z;
        boolean zM4034i = m4034i();
        C0682d c0682d = (C0682d) this.f3078g.getLayoutParams();
        if (!c0682d.f3099c) {
            z = false;
        } else if ((zM4034i ? ((ViewGroup.MarginLayoutParams) c0682d).rightMargin : ((ViewGroup.MarginLayoutParams) c0682d).leftMargin) <= 0) {
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
                if (zM4034i) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
                if (z) {
                    float f3 = this.f3080i;
                    m4028c(childAt, zM4034i ? f3 - 1.0f : 1.0f - f3, this.f3073b);
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
            ArrayList<RunnableC0680b> arrayList = this.f3090s;
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
            this.f3087p = !this.f3086o.m192842F(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f3077f || (this.f3082k && actionMasked != 0)) {
            this.f3086o.m192856b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f3086o.m192856b();
            return false;
        }
        if (actionMasked == 0) {
            this.f3082k = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f3084m = x;
            this.f3085n = y;
            if (this.f3086o.m192842F(this.f3078g, (int) x, (int) y) && m4033h(this.f3078g)) {
                z = true;
            }
            return !this.f3086o.m192852P(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float fAbs = Math.abs(x2 - this.f3084m);
            float fAbs2 = Math.abs(y2 - this.f3085n);
            if (fAbs > this.f3086o.m192878z() && fAbs2 > fAbs) {
                this.f3086o.m192856b();
                this.f3082k = true;
                return false;
            }
        }
        z = false;
        if (this.f3086o.m192852P(motionEvent)) {
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
        boolean zM4034i = m4034i();
        ubl0 ubl0Var = this.f3086o;
        if (zM4034i) {
            ubl0Var.m192849M(2);
        } else {
            ubl0Var.m192849M(1);
        }
        int i9 = i3 - i;
        int paddingRight = zM4034i ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM4034i ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f3088q) {
            this.f3079h = (this.f3077f && this.f3087p) ? 1.0f : 0.0f;
        }
        int i10 = paddingRight;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0682d c0682d = (C0682d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (c0682d.f3098b) {
                    int i12 = i9 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i12 - this.f3076e) - i10) - (((ViewGroup.MarginLayoutParams) c0682d).leftMargin + ((ViewGroup.MarginLayoutParams) c0682d).rightMargin);
                    this.f3081j = iMin;
                    int i13 = zM4034i ? ((ViewGroup.MarginLayoutParams) c0682d).rightMargin : ((ViewGroup.MarginLayoutParams) c0682d).leftMargin;
                    c0682d.f3099c = ((i10 + i13) + iMin) + (measuredWidth / 2) > i12;
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
                    if (zM4034i) {
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
                if (zM4034i) {
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
                    m4040o(this.f3079h);
                }
                if (((C0682d) this.f3078g.getLayoutParams()).f3099c) {
                    m4028c(this.f3078g, this.f3079h, this.f3072a);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    m4028c(getChildAt(i15), 0.0f, this.f3072a);
                }
            }
            m4043r(this.f3078g);
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
                qkq0.m175383a("Width must have an exact value or MATCH_PARENT");
                return;
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                qkq0.m175383a("Height must not be UNSPECIFIED");
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
            C0682d c0682d = (C0682d) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                c0682d.f3099c = z;
            } else {
                float f2 = c0682d.f3097a;
                if (f2 > 0.0f) {
                    f += f2;
                    if (((ViewGroup.MarginLayoutParams) c0682d).width == 0) {
                    }
                    i8++;
                    paddingLeft = i7;
                    z = false;
                }
                int i10 = ((ViewGroup.MarginLayoutParams) c0682d).leftMargin + ((ViewGroup.MarginLayoutParams) c0682d).rightMargin;
                int i11 = ((ViewGroup.MarginLayoutParams) c0682d).width;
                if (i11 == -2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i10, Integer.MIN_VALUE);
                    i6 = Integer.MIN_VALUE;
                } else {
                    i6 = Integer.MIN_VALUE;
                    iMakeMeasureSpec3 = i11 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingLeft - i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                }
                int i12 = ((ViewGroup.MarginLayoutParams) c0682d).height;
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
                c0682d.f3098b = z3;
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
                    C0682d c0682d2 = (C0682d) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i3) {
                        boolean z4 = ((ViewGroup.MarginLayoutParams) c0682d2).width == 0 && c0682d2.f3097a > 0.0f;
                        int measuredWidth2 = z4 ? 0 : childAt2.getMeasuredWidth();
                        if (!z2 || childAt2 == this.f3078g) {
                            if (c0682d2.f3097a > 0.0f) {
                                if (((ViewGroup.MarginLayoutParams) c0682d2).width == 0) {
                                    int i16 = ((ViewGroup.MarginLayoutParams) c0682d2).height;
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
                                    int i17 = i13 - (((ViewGroup.MarginLayoutParams) c0682d2).leftMargin + ((ViewGroup.MarginLayoutParams) c0682d2).rightMargin);
                                    int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i17, i4);
                                    if (measuredWidth2 != i17) {
                                        childAt2.measure(iMakeMeasureSpec5, iMakeMeasureSpec);
                                    }
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2 + ((int) ((c0682d2.f3097a * Math.max(0, i9)) / f)), 1073741824), iMakeMeasureSpec);
                                }
                            }
                        } else if (((ViewGroup.MarginLayoutParams) c0682d2).width < 0 && (measuredWidth2 > i14 || c0682d2.f3097a > 0.0f)) {
                            if (z4) {
                                int i18 = ((ViewGroup.MarginLayoutParams) c0682d2).height;
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
        if (this.f3086o.m192837A() == 0 || z2) {
            return;
        }
        this.f3086o.m192855a();
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
            m4038m();
        } else {
            m4026a();
        }
        this.f3087p = savedState.isOpen;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.isOpen = m4036k() ? m4035j() : this.f3087p;
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
        this.f3086o.m192843G(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f3084m = x;
            this.f3085n = y;
            return true;
        }
        if (actionMasked == 1 && m4033h(this.f3078g)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f3084m;
            float f2 = y2 - this.f3085n;
            int iM192878z = this.f3086o.m192878z();
            if ((f * f) + (f2 * f2) < iM192878z * iM192878z && this.f3086o.m192842F(this.f3078g, (int) x2, (int) y2)) {
                m4027b(this.f3078g, 0);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m4041p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m4042q(float f, int i) {
        int paddingLeft;
        if (!this.f3077f) {
            return false;
        }
        boolean zM4034i = m4034i();
        C0682d c0682d = (C0682d) this.f3078g.getLayoutParams();
        if (zM4034i) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0682d).rightMargin) + (f * this.f3081j)) + this.f3078g.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0682d).leftMargin + (f * this.f3081j));
        }
        ubl0 ubl0Var = this.f3086o;
        View view = this.f3078g;
        if (!ubl0Var.m192853Q(view, paddingLeft, view.getTop())) {
            return false;
        }
        m4041p();
        gbl0.m125183a0(this);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m4043r(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View view2 = view;
        boolean zM4034i = m4034i();
        int width = zM4034i ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM4034i ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m4025s(view2)) {
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
                childAt.setVisibility((Math.max(zM4034i ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zM4034i ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zM4034i = zM4034i;
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

    public void setPanelSlideListener(@Nullable InterfaceC0683e interfaceC0683e) {
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
        setShadowDrawableLeft(e16.m114377e(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(e16.m114377e(getContext(), i));
    }

    public void setSliderFadeColor(@ColorInt int i) {
        this.f3072a = i;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0678a();
        boolean isOpen;

        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        public static class C0678a implements Parcelable.ClassLoaderCreator<SavedState> {
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
        return new C0682d(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public static class C0682d extends ViewGroup.MarginLayoutParams {

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

        public C0682d(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3097a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3096e);
            this.f3097a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0682d(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3097a = 0.0f;
        }

        public C0682d(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3097a = 0.0f;
        }

        public C0682d() {
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
