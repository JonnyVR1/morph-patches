package com.hellogroup.p036mk.business.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p153l.ai20;
import p153l.bi20;
import p153l.c55;
import p153l.ei20;
import p153l.fi20;
import p153l.gpr;
import p153l.j26;
import p153l.jzv;
import p153l.kkl0;

/* JADX INFO: loaded from: classes7.dex */
public class MKSwipeRefreshLayout extends ViewGroup implements ei20, ai20 {

    /* JADX INFO: renamed from: P */
    private static final String f12350P = "MKSwipeRefreshLayout";

    /* JADX INFO: renamed from: Q */
    private static final int[] f12351Q = {R.attr.enabled};

    /* JADX INFO: renamed from: A */
    int f12352A;

    /* JADX INFO: renamed from: B */
    int f12353B;

    /* JADX INFO: renamed from: C */
    c55 f12354C;

    /* JADX INFO: renamed from: D */
    private Animation f12355D;

    /* JADX INFO: renamed from: E */
    private Animation f12356E;

    /* JADX INFO: renamed from: F */
    private Animation f12357F;

    /* JADX INFO: renamed from: G */
    private Animation f12358G;

    /* JADX INFO: renamed from: H */
    private Animation f12359H;

    /* JADX INFO: renamed from: I */
    boolean f12360I;

    /* JADX INFO: renamed from: J */
    private int f12361J;

    /* JADX INFO: renamed from: K */
    boolean f12362K;

    /* JADX INFO: renamed from: L */
    private Boolean f12363L;

    /* JADX INFO: renamed from: M */
    private Animation.AnimationListener f12364M;

    /* JADX INFO: renamed from: N */
    private final Animation f12365N;

    /* JADX INFO: renamed from: O */
    private final Animation f12366O;

    /* JADX INFO: renamed from: a */
    private View f12367a;

    /* JADX INFO: renamed from: b */
    InterfaceC3584j f12368b;

    /* JADX INFO: renamed from: c */
    boolean f12369c;

    /* JADX INFO: renamed from: d */
    private int f12370d;

    /* JADX INFO: renamed from: e */
    private float f12371e;

    /* JADX INFO: renamed from: f */
    private float f12372f;

    /* JADX INFO: renamed from: g */
    private final fi20 f12373g;

    /* JADX INFO: renamed from: h */
    private final bi20 f12374h;

    /* JADX INFO: renamed from: i */
    private final int[] f12375i;

    /* JADX INFO: renamed from: j */
    private final int[] f12376j;

    /* JADX INFO: renamed from: k */
    private boolean f12377k;

    /* JADX INFO: renamed from: l */
    private int f12378l;

    /* JADX INFO: renamed from: m */
    int f12379m;

    /* JADX INFO: renamed from: n */
    private float f12380n;

    /* JADX INFO: renamed from: o */
    private float f12381o;

    /* JADX INFO: renamed from: p */
    private float f12382p;

    /* JADX INFO: renamed from: q */
    private boolean f12383q;

    /* JADX INFO: renamed from: r */
    private int f12384r;

    /* JADX INFO: renamed from: s */
    boolean f12385s;

    /* JADX INFO: renamed from: t */
    private boolean f12386t;

    /* JADX INFO: renamed from: u */
    private final DecelerateInterpolator f12387u;

    /* JADX INFO: renamed from: v */
    MKCircleImageView f12388v;

    /* JADX INFO: renamed from: w */
    private int f12389w;

    /* JADX INFO: renamed from: x */
    protected int f12390x;

    /* JADX INFO: renamed from: y */
    float f12391y;

    /* JADX INFO: renamed from: z */
    protected int f12392z;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKSwipeRefreshLayout$a */
    public class AnimationAnimationListenerC3575a implements Animation.AnimationListener {
        public AnimationAnimationListenerC3575a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC3584j interfaceC3584j;
            MKSwipeRefreshLayout mKSwipeRefreshLayout = MKSwipeRefreshLayout.this;
            if (!mKSwipeRefreshLayout.f12369c) {
                mKSwipeRefreshLayout.m18289m();
                return;
            }
            mKSwipeRefreshLayout.f12354C.setAlpha(255);
            MKSwipeRefreshLayout.this.f12354C.start();
            MKSwipeRefreshLayout mKSwipeRefreshLayout2 = MKSwipeRefreshLayout.this;
            if (mKSwipeRefreshLayout2.f12360I && (interfaceC3584j = mKSwipeRefreshLayout2.f12368b) != null) {
                interfaceC3584j.mo18128p();
            }
            MKSwipeRefreshLayout mKSwipeRefreshLayout3 = MKSwipeRefreshLayout.this;
            mKSwipeRefreshLayout3.f12379m = mKSwipeRefreshLayout3.f12388v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKSwipeRefreshLayout$b */
    public class C3576b extends Animation {
        public C3576b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            MKSwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKSwipeRefreshLayout$c */
    public class C3577c extends Animation {
        public C3577c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            MKSwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKSwipeRefreshLayout$d */
    public class C3578d extends Animation {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f12396a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f12397b;

        public C3578d(int i, int i2) {
            this.f12396a = i;
            this.f12397b = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            c55 c55Var = MKSwipeRefreshLayout.this.f12354C;
            int i = this.f12396a;
            c55Var.setAlpha((int) (i + ((this.f12397b - i) * f)));
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKSwipeRefreshLayout$e */
    public class AnimationAnimationListenerC3579e implements Animation.AnimationListener {
        public AnimationAnimationListenerC3579e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MKSwipeRefreshLayout mKSwipeRefreshLayout = MKSwipeRefreshLayout.this;
            if (mKSwipeRefreshLayout.f12385s) {
                return;
            }
            mKSwipeRefreshLayout.m18291t(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKSwipeRefreshLayout$f */
    public class C3580f extends Animation {
        public C3580f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            MKSwipeRefreshLayout mKSwipeRefreshLayout = MKSwipeRefreshLayout.this;
            int iAbs = !mKSwipeRefreshLayout.f12362K ? mKSwipeRefreshLayout.f12352A - Math.abs(mKSwipeRefreshLayout.f12392z) : mKSwipeRefreshLayout.f12352A;
            MKSwipeRefreshLayout mKSwipeRefreshLayout2 = MKSwipeRefreshLayout.this;
            int i = mKSwipeRefreshLayout2.f12390x;
            MKSwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - mKSwipeRefreshLayout2.f12388v.getTop());
            MKSwipeRefreshLayout.this.f12354C.m107983e(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKSwipeRefreshLayout$g */
    public class C3581g extends Animation {
        public C3581g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            MKSwipeRefreshLayout.this.m18288k(f);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKSwipeRefreshLayout$h */
    public class C3582h extends Animation {
        public C3582h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            MKSwipeRefreshLayout mKSwipeRefreshLayout = MKSwipeRefreshLayout.this;
            float f2 = mKSwipeRefreshLayout.f12391y;
            mKSwipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            MKSwipeRefreshLayout.this.m18288k(f);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKSwipeRefreshLayout$i */
    public interface InterfaceC3583i {
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKSwipeRefreshLayout$j */
    public interface InterfaceC3584j {
        /* JADX INFO: renamed from: p */
        void mo18128p();
    }

    public MKSwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12369c = false;
        this.f12371e = -1.0f;
        this.f12375i = new int[2];
        this.f12376j = new int[2];
        this.f12384r = -1;
        this.f12389w = -1;
        this.f12363L = Boolean.FALSE;
        this.f12364M = new AnimationAnimationListenerC3575a();
        this.f12365N = new C3580f();
        this.f12366O = new C3581g();
        this.f12370d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f12378l = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f12387u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f12361J = (int) (displayMetrics.density * 40.0f);
        m18272e();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f12352A = i;
        this.f12371e = i;
        this.f12373g = new fi20(this);
        this.f12374h = new bi20(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f12361J;
        this.f12379m = i2;
        this.f12392z = i2;
        m18288k(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12351Q);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private void m18270a(int i, Animation.AnimationListener animationListener) {
        this.f12390x = i;
        this.f12365N.reset();
        this.f12365N.setDuration(200L);
        this.f12365N.setInterpolator(this.f12387u);
        if (animationListener != null) {
            this.f12388v.setAnimationListener(animationListener);
        }
        this.f12388v.clearAnimation();
        this.f12388v.startAnimation(this.f12365N);
    }

    /* JADX INFO: renamed from: b */
    private void m18271b(int i, Animation.AnimationListener animationListener) {
        if (this.f12385s) {
            m18283u(i, animationListener);
            return;
        }
        this.f12390x = i;
        this.f12366O.reset();
        this.f12366O.setDuration(200L);
        this.f12366O.setInterpolator(this.f12387u);
        if (animationListener != null) {
            this.f12388v.setAnimationListener(animationListener);
        }
        this.f12388v.clearAnimation();
        this.f12388v.startAnimation(this.f12366O);
    }

    /* JADX INFO: renamed from: e */
    private void m18272e() {
        this.f12388v = new MKCircleImageView(getContext(), -328966);
        c55 c55Var = new c55(getContext());
        this.f12354C = c55Var;
        c55Var.m107990l(1);
        this.f12388v.setImageDrawable(this.f12354C);
        this.f12388v.setVisibility(8);
        addView(this.f12388v);
    }

    /* JADX INFO: renamed from: f */
    private void m18273f() {
        if (this.f12367a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f12388v)) {
                    this.f12367a = childAt;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m18274g(float f) {
        if (f > this.f12371e) {
            m18278o(true, true);
            return;
        }
        this.f12369c = false;
        this.f12354C.m107988j(0.0f, 0.0f);
        m18271b(this.f12379m, !this.f12385s ? new AnimationAnimationListenerC3579e() : null);
        this.f12354C.m107982d(false);
    }

    /* JADX INFO: renamed from: h */
    private boolean m18275h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    private void m18276j(float f) {
        float f2;
        this.f12354C.m107982d(true);
        float fMin = Math.min(1.0f, Math.abs(f / this.f12371e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f12371e;
        int i = this.f12353B;
        if (i > 0) {
            f2 = i;
        } else {
            boolean z = this.f12362K;
            int i2 = this.f12352A;
            if (z) {
                i2 -= this.f12392z;
            }
            f2 = i2;
        }
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i3 = this.f12392z + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.f12388v.getVisibility() != 0) {
            this.f12388v.setVisibility(0);
        }
        if (!this.f12385s) {
            this.f12388v.setScaleX(1.0f);
            this.f12388v.setScaleY(1.0f);
        }
        if (this.f12385s) {
            setAnimationProgress(Math.min(1.0f, f / this.f12371e));
        }
        float f3 = this.f12371e;
        c55 c55Var = this.f12354C;
        if (f < f3) {
            if (c55Var.getAlpha() > 76 && !m18275h(this.f12357F)) {
                m18282s();
            }
        } else if (c55Var.getAlpha() < 255 && !m18275h(this.f12358G)) {
            m18281r();
        }
        this.f12354C.m107988j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f12354C.m107983e(Math.min(1.0f, fMax));
        this.f12354C.m107985g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i3 - this.f12379m);
    }

    /* JADX INFO: renamed from: l */
    private void m18277l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f12384r) {
            this.f12384r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m18278o(boolean z, boolean z2) {
        if (this.f12369c != z) {
            this.f12360I = z2;
            m18273f();
            this.f12369c = z;
            if (z) {
                m18270a(this.f12379m, this.f12364M);
            } else {
                m18291t(this.f12364M);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private Animation m18279p(int i, int i2) {
        C3578d c3578d = new C3578d(i, i2);
        c3578d.setDuration(300L);
        this.f12388v.setAnimationListener(null);
        this.f12388v.clearAnimation();
        this.f12388v.startAnimation(c3578d);
        return c3578d;
    }

    /* JADX INFO: renamed from: q */
    private void m18280q(float f) {
        float f2 = this.f12381o;
        float f3 = f - f2;
        int i = this.f12370d;
        if (f3 <= i || this.f12383q) {
            return;
        }
        this.f12380n = f2 + i;
        this.f12383q = true;
        this.f12354C.setAlpha(76);
    }

    /* JADX INFO: renamed from: r */
    private void m18281r() {
        this.f12358G = m18279p(this.f12354C.getAlpha(), 255);
    }

    /* JADX INFO: renamed from: s */
    private void m18282s() {
        this.f12357F = m18279p(this.f12354C.getAlpha(), 76);
    }

    private void setColorViewAlpha(int i) {
        this.f12388v.getBackground().setAlpha(i);
        this.f12354C.setAlpha(i);
    }

    /* JADX INFO: renamed from: u */
    private void m18283u(int i, Animation.AnimationListener animationListener) {
        this.f12390x = i;
        this.f12391y = this.f12388v.getScaleX();
        C3582h c3582h = new C3582h();
        this.f12359H = c3582h;
        c3582h.setDuration(150L);
        if (animationListener != null) {
            this.f12388v.setAnimationListener(animationListener);
        }
        this.f12388v.clearAnimation();
        this.f12388v.startAnimation(this.f12359H);
    }

    /* JADX INFO: renamed from: v */
    private void m18284v(Animation.AnimationListener animationListener) {
        this.f12388v.setVisibility(0);
        this.f12354C.setAlpha(255);
        C3576b c3576b = new C3576b();
        this.f12355D = c3576b;
        c3576b.setDuration(this.f12378l);
        if (animationListener != null) {
            this.f12388v.setAnimationListener(animationListener);
        }
        this.f12388v.clearAnimation();
        this.f12388v.startAnimation(this.f12355D);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        m18286d();
        super.addView(view);
    }

    /* JADX INFO: renamed from: c */
    public boolean m18285c() {
        View view = this.f12367a;
        return view instanceof ListView ? gpr.m131283a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: d */
    public void m18286d() {
        this.f12367a = null;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f12374h.m104391a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f12374h.m104392b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f12374h.m104393c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f12374h.m104396f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f12389w;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f12373g.m125663a();
    }

    public int getProgressCircleDiameter() {
        return this.f12361J;
    }

    public int getProgressViewEndOffset() {
        return this.f12352A;
    }

    public int getProgressViewStartOffset() {
        return this.f12392z;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f12374h.m104401k();
    }

    /* JADX INFO: renamed from: i */
    public boolean m18287i() {
        return this.f12369c;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f12374h.m104403m();
    }

    /* JADX INFO: renamed from: k */
    public void m18288k(float f) {
        int i = this.f12390x;
        setTargetOffsetTopAndBottom((i + ((int) ((this.f12392z - i) * f))) - this.f12388v.getTop());
    }

    /* JADX INFO: renamed from: m */
    public void m18289m() {
        this.f12388v.clearAnimation();
        this.f12354C.stop();
        this.f12388v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f12385s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f12392z - this.f12379m);
        }
        this.f12379m = this.f12388v.getTop();
    }

    /* JADX INFO: renamed from: n */
    public void m18290n(boolean z, int i) {
        this.f12352A = i;
        this.f12385s = z;
        this.f12388v.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m18289m();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m18273f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12386t && actionMasked == 0) {
            this.f12386t = false;
        }
        if (!isEnabled() || this.f12386t || m18285c() || this.f12369c || this.f12377k) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f12363L = Boolean.FALSE;
            } else if (actionMasked == 2) {
                int i = this.f12384r;
                if (i == -1) {
                    jzv.m147729b(f12350P, "Got ACTION_MOVE event but don't have an active pointer id.");
                    return false;
                }
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                if (iFindPointerIndex < 0 || this.f12363L.booleanValue()) {
                    return false;
                }
                float y = motionEvent.getY(iFindPointerIndex);
                float fAbs = Math.abs(motionEvent.getX(iFindPointerIndex) - this.f12382p);
                float fAbs2 = Math.abs(y - this.f12381o);
                if (fAbs > this.f12370d && fAbs > fAbs2) {
                    this.f12363L = Boolean.TRUE;
                    return false;
                }
                m18280q(y);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    m18277l(motionEvent);
                }
            }
            this.f12383q = false;
            this.f12363L = Boolean.FALSE;
            this.f12384r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f12392z - this.f12388v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f12384r = pointerId;
            this.f12383q = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            this.f12381o = motionEvent.getY(iFindPointerIndex2);
            this.f12382p = motionEvent.getX(iFindPointerIndex2);
        }
        return this.f12383q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f12367a == null) {
            m18273f();
        }
        View view = this.f12367a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f12388v.getMeasuredWidth();
        int measuredHeight2 = this.f12388v.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f12379m;
        this.f12388v.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f12367a == null) {
            m18273f();
        }
        View view = this.f12367a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f12388v.measure(View.MeasureSpec.makeMeasureSpec(this.f12361J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f12361J, 1073741824));
        this.f12389w = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f12388v) {
                this.f12389w = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f12372f;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f12372f = 0.0f;
                } else {
                    this.f12372f = f - f2;
                    iArr[1] = i2;
                }
                m18276j(this.f12372f);
            }
        }
        if (this.f12362K && i2 > 0 && this.f12372f == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f12388v.setVisibility(8);
        }
        int[] iArr2 = this.f12375i;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f12376j);
        int i5 = i4 + this.f12376j[1];
        if (i5 >= 0 || m18285c()) {
            return;
        }
        float fAbs = this.f12372f + Math.abs(i5);
        this.f12372f = fAbs;
        m18276j(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f12373g.m125664b(view, view2, i);
        startNestedScroll(i & 2);
        this.f12372f = 0.0f;
        this.f12377k = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f12386t || this.f12369c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f12373g.m125666d(view);
        this.f12377k = false;
        float f = this.f12372f;
        if (f > 0.0f) {
            m18274g(f);
            this.f12372f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12386t && actionMasked == 0) {
            this.f12386t = false;
        }
        if (!isEnabled() || this.f12386t || m18285c() || this.f12369c || this.f12377k) {
            return false;
        }
        if (actionMasked == 0) {
            this.f12384r = motionEvent.getPointerId(0);
            this.f12383q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f12384r);
                if (iFindPointerIndex < 0) {
                    jzv.m147729b(f12350P, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f12383q) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.f12380n) * 0.5f;
                    this.f12383q = false;
                    m18274g(y);
                }
                this.f12384r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f12384r);
                if (iFindPointerIndex2 < 0) {
                    jzv.m147729b(f12350P, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                m18280q(y2);
                if (this.f12383q) {
                    float f = (y2 - this.f12380n) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    m18276j(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        jzv.m147729b(f12350P, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f12384r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m18277l(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.f12367a;
        if (view == null || kkl0.m150135Q(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAnimationProgress(float f) {
        this.f12388v.setScaleX(f);
        this.f12388v.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        m18273f();
        this.f12354C.m107984f(iArr);
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = j26.m143190c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f12371e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m18289m();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f12374h.m104404n(z);
    }

    public void setOnChildScrollUpCallback(@Nullable InterfaceC3583i interfaceC3583i) {
    }

    public void setOnRefreshListener(@Nullable InterfaceC3584j interfaceC3584j) {
        this.f12368b = interfaceC3584j;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i) {
        this.f12388v.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i) {
        setProgressBackgroundColorSchemeColor(j26.m143190c(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f12369c == z) {
            m18278o(z, false);
            return;
        }
        this.f12369c = z;
        boolean z2 = this.f12362K;
        int i = this.f12352A;
        if (!z2) {
            i += this.f12392z;
        }
        setTargetOffsetTopAndBottom(i - this.f12379m);
        this.f12360I = false;
        m18284v(this.f12364M);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f12361J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f12361J = (int) (displayMetrics.density * 40.0f);
            }
            this.f12388v.setImageDrawable(null);
            this.f12354C.m107990l(i);
            this.f12388v.setImageDrawable(this.f12354C);
        }
    }

    public void setSlingshotDistance(@Px int i) {
        this.f12353B = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f12388v.bringToFront();
        kkl0.m150140V(this.f12388v, i);
        this.f12379m = this.f12388v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f12374h.m104406p(i);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f12374h.m104408r();
    }

    /* JADX INFO: renamed from: t */
    public void m18291t(Animation.AnimationListener animationListener) {
        C3577c c3577c = new C3577c();
        this.f12356E = c3577c;
        c3577c.setDuration(150L);
        this.f12388v.setAnimationListener(animationListener);
        this.f12388v.clearAnimation();
        this.f12388v.startAnimation(this.f12356E);
    }

    public MKSwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }
}
