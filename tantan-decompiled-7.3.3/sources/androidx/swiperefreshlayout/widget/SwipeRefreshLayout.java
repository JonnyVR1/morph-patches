package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
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
import p153l.ci20;
import p153l.di20;
import p153l.ei20;
import p153l.fi20;
import p153l.gpr;
import p153l.j26;
import p153l.kkl0;
import p153l.zh20;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements di20, ci20, zh20, ei20, ai20 {

    /* JADX INFO: renamed from: Q */
    public static final String f3127Q = "SwipeRefreshLayout";

    /* JADX INFO: renamed from: R */
    public static final int[] f3128R = {R.attr.enabled};

    /* JADX INFO: renamed from: A */
    public int f3129A;

    /* JADX INFO: renamed from: B */
    public int f3130B;

    /* JADX INFO: renamed from: C */
    public c55 f3131C;

    /* JADX INFO: renamed from: D */
    public Animation f3132D;

    /* JADX INFO: renamed from: E */
    public Animation f3133E;

    /* JADX INFO: renamed from: F */
    public Animation f3134F;

    /* JADX INFO: renamed from: G */
    public Animation f3135G;

    /* JADX INFO: renamed from: H */
    public Animation f3136H;

    /* JADX INFO: renamed from: I */
    public boolean f3137I;

    /* JADX INFO: renamed from: J */
    public int f3138J;

    /* JADX INFO: renamed from: K */
    public boolean f3139K;

    /* JADX INFO: renamed from: L */
    public InterfaceC0701i f3140L;

    /* JADX INFO: renamed from: M */
    public boolean f3141M;

    /* JADX INFO: renamed from: N */
    public Animation.AnimationListener f3142N;

    /* JADX INFO: renamed from: O */
    public final Animation f3143O;

    /* JADX INFO: renamed from: P */
    public final Animation f3144P;

    /* JADX INFO: renamed from: a */
    public View f3145a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0702j f3146b;

    /* JADX INFO: renamed from: c */
    public boolean f3147c;

    /* JADX INFO: renamed from: d */
    public int f3148d;

    /* JADX INFO: renamed from: e */
    public float f3149e;

    /* JADX INFO: renamed from: f */
    public float f3150f;

    /* JADX INFO: renamed from: g */
    public final fi20 f3151g;

    /* JADX INFO: renamed from: h */
    public final bi20 f3152h;

    /* JADX INFO: renamed from: i */
    public final int[] f3153i;

    /* JADX INFO: renamed from: j */
    public final int[] f3154j;

    /* JADX INFO: renamed from: k */
    public final int[] f3155k;

    /* JADX INFO: renamed from: l */
    public boolean f3156l;

    /* JADX INFO: renamed from: m */
    public int f3157m;

    /* JADX INFO: renamed from: n */
    public int f3158n;

    /* JADX INFO: renamed from: o */
    public float f3159o;

    /* JADX INFO: renamed from: p */
    public float f3160p;

    /* JADX INFO: renamed from: q */
    public boolean f3161q;

    /* JADX INFO: renamed from: r */
    public int f3162r;

    /* JADX INFO: renamed from: s */
    public boolean f3163s;

    /* JADX INFO: renamed from: t */
    public boolean f3164t;

    /* JADX INFO: renamed from: u */
    public final DecelerateInterpolator f3165u;

    /* JADX INFO: renamed from: v */
    public CircleImageView f3166v;

    /* JADX INFO: renamed from: w */
    public int f3167w;

    /* JADX INFO: renamed from: x */
    public int f3168x;

    /* JADX INFO: renamed from: y */
    public float f3169y;

    /* JADX INFO: renamed from: z */
    public int f3170z;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    public class AnimationAnimationListenerC0693a implements Animation.AnimationListener {
        public AnimationAnimationListenerC0693a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC0702j interfaceC0702j;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f3147c) {
                swipeRefreshLayout.m4084m();
                return;
            }
            swipeRefreshLayout.f3131C.setAlpha(255);
            SwipeRefreshLayout.this.f3131C.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f3137I && (interfaceC0702j = swipeRefreshLayout2.f3146b) != null) {
                interfaceC0702j.mo4096p();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f3158n = swipeRefreshLayout3.f3166v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    public class C0694b extends Animation {
        public C0694b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    public class C0695c extends Animation {
        public C0695c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    public class C0696d extends Animation {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f3174a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f3175b;

        public C0696d(int i, int i2) {
            this.f3174a = i;
            this.f3175b = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            c55 c55Var = SwipeRefreshLayout.this.f3131C;
            int i = this.f3174a;
            c55Var.setAlpha((int) (i + ((this.f3175b - i) * f)));
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    public class AnimationAnimationListenerC0697e implements Animation.AnimationListener {
        public AnimationAnimationListenerC0697e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f3163s) {
                return;
            }
            swipeRefreshLayout.m4090t(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    public class C0698f extends Animation {
        public C0698f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.f3139K ? swipeRefreshLayout.f3129A - Math.abs(swipeRefreshLayout.f3170z) : swipeRefreshLayout.f3129A;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i = swipeRefreshLayout2.f3168x;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout2.f3166v.getTop());
            SwipeRefreshLayout.this.f3131C.m107983e(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    public class C0699g extends Animation {
        public C0699g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.m4083k(f);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    public class C0700h extends Animation {
        public C0700h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f3169y;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.m4083k(f);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface InterfaceC0701i {
        /* JADX INFO: renamed from: a */
        boolean mo4095a(@NonNull SwipeRefreshLayout swipeRefreshLayout, @Nullable View view);
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface InterfaceC0702j {
        /* JADX INFO: renamed from: p */
        void mo4096p();
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3147c = false;
        this.f3149e = -1.0f;
        this.f3153i = new int[2];
        this.f3154j = new int[2];
        this.f3155k = new int[2];
        this.f3162r = -1;
        this.f3167w = -1;
        this.f3142N = new AnimationAnimationListenerC0693a();
        this.f3143O = new C0698f();
        this.f3144P = new C0699g();
        this.f3148d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f3157m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f3165u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f3138J = (int) (displayMetrics.density * 40.0f);
        m4076d();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f3129A = i;
        this.f3149e = i;
        this.f3151g = new fi20(this);
        this.f3152h = new bi20(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f3138J;
        this.f3158n = i2;
        this.f3170z = i2;
        m4083k(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3128R);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: l */
    private void m4072l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3162r) {
            this.f3162r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i) {
        this.f3166v.getBackground().setAlpha(i);
        this.f3131C.setAlpha(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m4073a(int i, Animation.AnimationListener animationListener) {
        this.f3168x = i;
        this.f3143O.reset();
        this.f3143O.setDuration(200L);
        this.f3143O.setInterpolator(this.f3165u);
        if (animationListener != null) {
            this.f3166v.m4070b(animationListener);
        }
        this.f3166v.clearAnimation();
        this.f3166v.startAnimation(this.f3143O);
    }

    /* JADX INFO: renamed from: b */
    public final void m4074b(int i, Animation.AnimationListener animationListener) {
        if (this.f3163s) {
            m4091u(i, animationListener);
            return;
        }
        this.f3168x = i;
        this.f3144P.reset();
        this.f3144P.setDuration(200L);
        this.f3144P.setInterpolator(this.f3165u);
        if (animationListener != null) {
            this.f3166v.m4070b(animationListener);
        }
        this.f3166v.clearAnimation();
        this.f3166v.startAnimation(this.f3144P);
    }

    /* JADX INFO: renamed from: c */
    public boolean m4075c() {
        InterfaceC0701i interfaceC0701i = this.f3140L;
        View view = this.f3145a;
        if (interfaceC0701i != null) {
            return interfaceC0701i.mo4095a(this, view);
        }
        return view instanceof ListView ? gpr.m131283a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: d */
    public final void m4076d() {
        this.f3166v = new CircleImageView(getContext());
        c55 c55Var = new c55(getContext());
        this.f3131C = c55Var;
        c55Var.m107990l(1);
        this.f3166v.setImageDrawable(this.f3131C);
        this.f3166v.setVisibility(8);
        addView(this.f3166v);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3152h.m104391a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3152h.m104392b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f3152h.m104393c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3152h.m104396f(i, i2, i3, i4, iArr);
    }

    /* JADX INFO: renamed from: e */
    public void m4077e(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @NonNull int[] iArr2) {
        if (i5 == 0) {
            this.f3152h.m104395e(i, i2, i3, i4, iArr, i5, iArr2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4078f() {
        if (this.f3145a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f3166v)) {
                    this.f3145a = childAt;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4079g(float f) {
        if (f > this.f3149e) {
            m4085n(true, true);
            return;
        }
        this.f3147c = false;
        this.f3131C.m107988j(0.0f, 0.0f);
        m4074b(this.f3158n, !this.f3163s ? new AnimationAnimationListenerC0697e() : null);
        this.f3131C.m107982d(false);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f3167w;
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
        return this.f3151g.m125663a();
    }

    public int getProgressCircleDiameter() {
        return this.f3138J;
    }

    public int getProgressViewEndOffset() {
        return this.f3129A;
    }

    public int getProgressViewStartOffset() {
        return this.f3170z;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4080h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f3152h.m104401k();
    }

    /* JADX INFO: renamed from: i */
    public boolean m4081i() {
        return this.f3147c;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3152h.m104403m();
    }

    /* JADX INFO: renamed from: j */
    public final void m4082j(float f) {
        float f2;
        this.f3131C.m107982d(true);
        float fMin = Math.min(1.0f, Math.abs(f / this.f3149e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f3149e;
        int i = this.f3130B;
        if (i > 0) {
            f2 = i;
        } else {
            boolean z = this.f3139K;
            int i2 = this.f3129A;
            if (z) {
                i2 -= this.f3170z;
            }
            f2 = i2;
        }
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i3 = this.f3170z + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.f3166v.getVisibility() != 0) {
            this.f3166v.setVisibility(0);
        }
        if (!this.f3163s) {
            this.f3166v.setScaleX(1.0f);
            this.f3166v.setScaleY(1.0f);
        }
        if (this.f3163s) {
            setAnimationProgress(Math.min(1.0f, f / this.f3149e));
        }
        float f3 = this.f3149e;
        c55 c55Var = this.f3131C;
        if (f < f3) {
            if (c55Var.getAlpha() > 76 && !m4080h(this.f3134F)) {
                m4089s();
            }
        } else if (c55Var.getAlpha() < 255 && !m4080h(this.f3135G)) {
            m4088r();
        }
        this.f3131C.m107988j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f3131C.m107983e(Math.min(1.0f, fMax));
        this.f3131C.m107985g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i3 - this.f3158n);
    }

    /* JADX INFO: renamed from: k */
    public void m4083k(float f) {
        int i = this.f3168x;
        setTargetOffsetTopAndBottom((i + ((int) ((this.f3170z - i) * f))) - this.f3166v.getTop());
    }

    /* JADX INFO: renamed from: m */
    public void m4084m() {
        this.f3166v.clearAnimation();
        this.f3131C.stop();
        this.f3166v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f3163s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f3170z - this.f3158n);
        }
        this.f3158n = this.f3166v.getTop();
    }

    /* JADX INFO: renamed from: n */
    public final void m4085n(boolean z, boolean z2) {
        if (this.f3147c != z) {
            this.f3137I = z2;
            m4078f();
            this.f3147c = z;
            if (z) {
                m4073a(this.f3158n, this.f3142N);
            } else {
                m4090t(this.f3142N);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final Animation m4086o(int i, int i2) {
        C0696d c0696d = new C0696d(i, i2);
        c0696d.setDuration(300L);
        this.f3166v.m4070b(null);
        this.f3166v.clearAnimation();
        this.f3166v.startAnimation(c0696d);
        return c0696d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4084m();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m4078f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3164t && actionMasked == 0) {
            this.f3164t = false;
        }
        if (!isEnabled() || this.f3164t || m4075c() || this.f3147c || this.f3156l) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f3170z - this.f3166v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f3162r = pointerId;
            this.f3161q = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f3160p = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f3161q = false;
            this.f3162r = -1;
        } else if (actionMasked == 2) {
            int i = this.f3162r;
            if (i == -1) {
                Log.e(f3127Q, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            m4087q(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f3161q = false;
            this.f3162r = -1;
        } else if (actionMasked == 6) {
            m4072l(motionEvent);
        }
        return this.f3161q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f3145a == null) {
            m4078f();
        }
        View view = this.f3145a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f3166v.getMeasuredWidth();
        int measuredHeight2 = this.f3166v.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f3158n;
        this.f3166v.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3145a == null) {
            m4078f();
        }
        View view = this.f3145a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f3166v.measure(View.MeasureSpec.makeMeasureSpec(this.f3138J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f3138J, 1073741824));
        this.f3167w = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f3166v) {
                this.f3167w = i3;
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
            float f = this.f3150f;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f3150f = 0.0f;
                } else {
                    this.f3150f = f - f2;
                    iArr[1] = i2;
                }
                m4082j(this.f3150f);
            }
        }
        if (this.f3139K && i2 > 0 && this.f3150f == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f3166v.setVisibility(8);
        }
        int[] iArr2 = this.f3153i;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // p153l.di20
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        m4077e(i, i2, i3, i4, this.f3154j, i5, iArr);
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? i4 + this.f3154j[1] : i7;
        if (i8 >= 0 || m4075c()) {
            return;
        }
        float fAbs = this.f3150f + Math.abs(i8);
        this.f3150f = fAbs;
        m4082j(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f3151g.m125664b(view, view2, i);
        startNestedScroll(i & 2);
        this.f3150f = 0.0f;
        this.f3156l = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.mRefreshing);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f3147c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f3164t || this.f3147c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f3151g.m125666d(view);
        this.f3156l = false;
        float f = this.f3150f;
        if (f > 0.0f) {
            m4079g(f);
            this.f3150f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3164t && actionMasked == 0) {
            this.f3164t = false;
        }
        if (!isEnabled() || this.f3164t || m4075c() || this.f3147c || this.f3156l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f3162r = motionEvent.getPointerId(0);
            this.f3161q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3162r);
                if (iFindPointerIndex < 0) {
                    Log.e(f3127Q, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f3161q) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.f3159o) * 0.5f;
                    this.f3161q = false;
                    m4079g(y);
                }
                this.f3162r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f3162r);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f3127Q, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                m4087q(y2);
                if (this.f3161q) {
                    float f = (y2 - this.f3159o) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m4082j(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f3127Q, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f3162r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m4072l(motionEvent);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m4087q(float f) {
        float f2 = this.f3160p;
        float f3 = f - f2;
        int i = this.f3148d;
        if (f3 <= i || this.f3161q) {
            return;
        }
        this.f3159o = f2 + i;
        this.f3161q = true;
        this.f3131C.setAlpha(76);
    }

    /* JADX INFO: renamed from: r */
    public final void m4088r() {
        this.f3135G = m4086o(this.f3131C.getAlpha(), 255);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.f3145a;
        if (view == null || kkl0.m150135Q(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        } else {
            if (this.f3141M || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4089s() {
        this.f3134F = m4086o(this.f3131C.getAlpha(), 76);
    }

    public void setAnimationProgress(float f) {
        this.f3166v.setScaleX(f);
        this.f3166v.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        m4078f();
        this.f3131C.m107984f(iArr);
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
        this.f3149e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m4084m();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f3141M = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f3152h.m104404n(z);
    }

    public void setOnChildScrollUpCallback(@Nullable InterfaceC0701i interfaceC0701i) {
        this.f3140L = interfaceC0701i;
    }

    public void setOnRefreshListener(@Nullable InterfaceC0702j interfaceC0702j) {
        this.f3146b = interfaceC0702j;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i) {
        this.f3166v.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i) {
        setProgressBackgroundColorSchemeColor(j26.m143190c(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f3147c == z) {
            m4085n(z, false);
            return;
        }
        this.f3147c = z;
        boolean z2 = this.f3139K;
        int i = this.f3129A;
        if (!z2) {
            i += this.f3170z;
        }
        setTargetOffsetTopAndBottom(i - this.f3158n);
        this.f3137I = false;
        m4092v(this.f3142N);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f3138J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f3138J = (int) (displayMetrics.density * 40.0f);
            }
            this.f3166v.setImageDrawable(null);
            this.f3131C.m107990l(i);
            this.f3166v.setImageDrawable(this.f3131C);
        }
    }

    public void setSlingshotDistance(@Px int i) {
        this.f3130B = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f3166v.bringToFront();
        kkl0.m150140V(this.f3166v, i);
        this.f3158n = this.f3166v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f3152h.m104406p(i);
    }

    @Override // p153l.zh20
    public void stopNestedScroll(int i) {
        if (i == 0) {
            stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m4090t(Animation.AnimationListener animationListener) {
        C0695c c0695c = new C0695c();
        this.f3133E = c0695c;
        c0695c.setDuration(150L);
        this.f3166v.m4070b(animationListener);
        this.f3166v.clearAnimation();
        this.f3166v.startAnimation(this.f3133E);
    }

    /* JADX INFO: renamed from: u */
    public final void m4091u(int i, Animation.AnimationListener animationListener) {
        this.f3168x = i;
        this.f3169y = this.f3166v.getScaleX();
        C0700h c0700h = new C0700h();
        this.f3136H = c0700h;
        c0700h.setDuration(150L);
        if (animationListener != null) {
            this.f3166v.m4070b(animationListener);
        }
        this.f3166v.clearAnimation();
        this.f3166v.startAnimation(this.f3136H);
    }

    /* JADX INFO: renamed from: v */
    public final void m4092v(Animation.AnimationListener animationListener) {
        this.f3166v.setVisibility(0);
        this.f3131C.setAlpha(255);
        C0694b c0694b = new C0694b();
        this.f3132D = c0694b;
        c0694b.setDuration(this.f3157m);
        if (animationListener != null) {
            this.f3166v.m4070b(animationListener);
        }
        this.f3166v.clearAnimation();
        this.f3166v.startAnimation(this.f3132D);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f3152h.m104408r();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0692a();
        final boolean mRefreshing;

        /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState$a */
        public class C0692a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mRefreshing = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.mRefreshing ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.mRefreshing = z;
        }
    }

    @Override // p153l.ci20
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p153l.ci20
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // p153l.ci20
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p153l.ci20
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.f3155k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f3155k);
    }

    @Override // p153l.ci20
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public SwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }
}
