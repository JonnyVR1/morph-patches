package com.p046p1.mobile.putong.live.livingroom.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.LiveScrollViewContainer;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.bt0;
import p149l.cit;
import p149l.dml;
import p149l.e30;
import p149l.e51;
import p149l.mcr;
import p149l.mkd0;
import p149l.v9j;
import p149l.w9j;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class LiveScrollView extends FrameLayout implements dml {

    /* JADX INFO: renamed from: t */
    public static final int f52019t = ViewConfiguration.get(ypv.f199497e).getScaledTouchSlop();

    /* JADX INFO: renamed from: a */
    public LiveScrollViewContainer f52020a;

    /* JADX INFO: renamed from: b */
    public LiveScrollViewContainer f52021b;

    /* JADX INFO: renamed from: c */
    public View f52022c;

    /* JADX INFO: renamed from: d */
    public float f52023d;

    /* JADX INFO: renamed from: e */
    public float f52024e;

    /* JADX INFO: renamed from: f */
    public float f52025f;

    /* JADX INFO: renamed from: g */
    public float f52026g;

    /* JADX INFO: renamed from: h */
    public final float f52027h;

    /* JADX INFO: renamed from: i */
    public long f52028i;

    /* JADX INFO: renamed from: j */
    public InterfaceC12932b f52029j;

    /* JADX INFO: renamed from: k */
    public InterfaceC12933c f52030k;

    /* JADX INFO: renamed from: l */
    public View f52031l;

    /* JADX INFO: renamed from: m */
    public VelocityTracker f52032m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f52033n;

    /* JADX INFO: renamed from: o */
    public boolean f52034o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f52035p;

    /* JADX INFO: renamed from: q */
    public boolean f52036q;

    /* JADX INFO: renamed from: r */
    public int f52037r;

    /* JADX INFO: renamed from: s */
    public C22393b<View> f52038s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveScrollView$a */
    public class C12931a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f52039a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f52040b;

        public C12931a(boolean z, boolean z2) {
            this.f52039a = z;
            this.f52040b = z2;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m76568b(boolean z, boolean z2) {
            LiveScrollView.this.m76561L(z, z2);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Context context = LiveScrollView.this.getContext();
            final boolean z = this.f52039a;
            final boolean z2 = this.f52040b;
            e51.m114741F(context, new Runnable() { // from class: l.jit
                @Override // java.lang.Runnable
                public final void run() {
                    this.f118130a.m76568b(z, z2);
                }
            });
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveScrollView$b */
    public interface InterfaceC12932b {
        /* JADX INFO: renamed from: a */
        void mo76569a(boolean z);

        /* JADX INFO: renamed from: b */
        void mo76570b();

        /* JADX INFO: renamed from: c */
        boolean mo76571c(boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveScrollView$c */
    public interface InterfaceC12933c {
        /* JADX INFO: renamed from: a */
        void mo76572a(boolean z, LiveScrollViewContainer liveScrollViewContainer, boolean z2, JumpRoomData jumpRoomData);

        /* JADX INFO: renamed from: b */
        boolean mo76573b();

        /* JADX INFO: renamed from: c */
        void mo76574c();

        /* JADX INFO: renamed from: d */
        boolean mo76575d(boolean z);

        /* JADX INFO: renamed from: e */
        void mo76576e(boolean z);

        /* JADX INFO: renamed from: f */
        boolean mo76577f();

        /* JADX INFO: renamed from: g */
        void mo76578g();

        /* JADX INFO: renamed from: h */
        void mo76579h(LiveScrollViewContainer liveScrollViewContainer, boolean z);

        /* JADX INFO: renamed from: i */
        void mo76580i();
    }

    public LiveScrollView(@NonNull Context context) {
        super(context);
        this.f52027h = xdl0.m208408w0() / 5;
        this.f52028i = 0L;
        this.f52037r = 0;
        this.f52038s = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C22306c m76548p(C22306c c22306c) {
        return c22306c;
    }

    private void setBackUpViewTransY(float f) {
        float height = f > 0.0f ? f - getHeight() : f + getHeight();
        View view = this.f52022c;
        if (view != null) {
            view.setTranslationY(height);
        }
        getBackupView().setTranslationY(height);
    }

    /* JADX INFO: renamed from: A */
    public void m76550A() {
        LiveScrollViewContainer liveScrollViewContainer = new LiveScrollViewContainer(getContext(), true);
        int i = xdl0.f192403e;
        addView(liveScrollViewContainer, 0, new FrameLayout.LayoutParams(i, i));
        this.f52020a = liveScrollViewContainer;
        liveScrollViewContainer.setVisibility(0);
        this.f52031l = this.f52020a;
        LiveScrollViewContainer liveScrollViewContainer2 = new LiveScrollViewContainer(getContext(), false);
        int i2 = xdl0.f192403e;
        addView(liveScrollViewContainer2, 1, new FrameLayout.LayoutParams(i2, i2));
        this.f52021b = liveScrollViewContainer2;
        liveScrollViewContainer2.setVisibility(8);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m76551B(ValueAnimator valueAnimator) {
        this.f52020a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setBackUpViewTransY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m76552C() {
        InterfaceC12933c interfaceC12933c = this.f52030k;
        if (interfaceC12933c != null) {
            interfaceC12933c.mo76580i();
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m76553D(ValueAnimator valueAnimator) {
        this.f52020a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setBackUpViewTransY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m76554E(ValueAnimator valueAnimator) {
        this.f52020a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setBackUpViewTransY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: F */
    public final void m76555F(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        this.f52035p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(cit.m107099b(f));
        this.f52035p.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f52035p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.eit
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f91633a.m76551B(valueAnimator);
            }
        });
        bt0.m103733f(this.f52035p, new Runnable() { // from class: l.fit
            @Override // java.lang.Runnable
            public final void run() {
                this.f97719a.m76552C();
            }
        });
        this.f52035p.start();
    }

    /* JADX INFO: renamed from: G */
    public final void m76556G(float f, boolean z) {
        boolean z2 = f < 0.0f;
        InterfaceC12932b interfaceC12932b = this.f52029j;
        if (interfaceC12932b != null) {
            interfaceC12932b.mo76569a(z2);
        }
        xdl0.m208344M(this.f52022c, false);
        int height = getHeight();
        if (z2) {
            height = -height;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, height);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dit
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f86425a.m76553D(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12931a(z2, z));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: H */
    public final void m76557H(MotionEvent motionEvent) {
        this.f52034o = this.f52030k.mo76573b();
        this.f52023d = motionEvent.getY();
        this.f52025f = motionEvent.getX();
        VelocityTracker velocityTracker = this.f52032m;
        if (velocityTracker == null) {
            this.f52032m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        this.f52032m.addMovement(motionEvent);
        ValueAnimator valueAnimator = this.f52035p;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f52035p = null;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m76558I(JumpRoomData jumpRoomData) {
        m76562M(true, true, jumpRoomData);
    }

    /* JADX INFO: renamed from: J */
    public void m76559J(float f) {
        InterfaceC12932b interfaceC12932b = this.f52029j;
        if (interfaceC12932b != null) {
            interfaceC12932b.mo76569a(true);
        }
        this.f52022c.setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, m76565y(f), 0.0f);
        this.f52033n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1300L);
        this.f52033n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.iit
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f113440a.m76554E(valueAnimator);
            }
        });
        this.f52033n.start();
    }

    /* JADX INFO: renamed from: K */
    public void m76560K() {
        ValueAnimator valueAnimator = this.f52033n;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        InterfaceC12932b interfaceC12932b = this.f52029j;
        if (interfaceC12932b != null) {
            interfaceC12932b.mo76570b();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m76561L(boolean z, boolean z2) {
        m76562M(z, z2, null);
    }

    /* JADX INFO: renamed from: M */
    public final void m76562M(boolean z, boolean z2, JumpRoomData jumpRoomData) {
        this.f52022c.setVisibility(8);
        this.f52020a.setVisibility(8);
        this.f52020a.setTranslationY(0.0f);
        this.f52022c.setTranslationY(0.0f);
        LiveScrollViewContainer liveScrollViewContainer = this.f52020a;
        LiveScrollViewContainer backupView = getBackupView();
        this.f52020a = backupView;
        this.f52021b = liveScrollViewContainer;
        this.f52031l = backupView;
        InterfaceC12933c interfaceC12933c = this.f52030k;
        if (interfaceC12933c != null) {
            interfaceC12933c.mo76579h(getBackupView(), z2);
        }
        this.f52038s.onNext(getBackupView());
        InterfaceC12933c interfaceC12933c2 = this.f52030k;
        if (interfaceC12933c2 != null) {
            interfaceC12933c2.mo76572a(z, this.f52020a, z2, jumpRoomData);
            this.f52028i = SystemClock.elapsedRealtime();
        }
        InterfaceC12932b interfaceC12932b = this.f52029j;
        if (interfaceC12932b != null) {
            interfaceC12932b.mo76570b();
        }
        this.f52020a.setTranslationY(0.0f);
        this.f52020a.setVisibility(0);
        this.f52022c.setTranslationY(0.0f);
    }

    @Override // p149l.dml
    /* JADX INFO: renamed from: c */
    public <V> C22306c<V> mo67374c(mcr mcrVar, C22306c<V> c22306c) {
        return mo67378g(mcrVar, c22306c, true);
    }

    @Override // p149l.dml
    /* JADX INFO: renamed from: g */
    public <V> C22306c<V> mo67378g(mcr mcrVar, final C22306c<V> c22306c, boolean z) {
        final View view = this.f52031l;
        return mkd0.m154952D(new v9j() { // from class: l.hit
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return LiveScrollView.m76548p(c22306c);
            }
        }, mcrVar.lifecycle().compose(mkd0.m154953E()).takeUntil(this.f52038s.filter(new w9j() { // from class: l.git
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    public LiveScrollViewContainer getBackupView() {
        return this.f52021b;
    }

    public LiveScrollViewContainer getCurrentView() {
        return this.f52020a;
    }

    public View getIndicatorView() {
        return this.f52022c;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f52030k.mo76577f()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 2) {
            if (Math.abs(motionEvent.getY() - this.f52023d) > f52019t) {
                return true;
            }
        } else if (motionEvent.getAction() == 0) {
            m76557H(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zMo76571c;
        if (this.f52020a != null) {
            if (motionEvent.getPointerCount() <= 1) {
                if (this.f52030k.mo76577f()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (SystemClock.elapsedRealtime() - this.f52028i < 400.0f) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() != 2) {
                    this.f52037r = 0;
                }
                if (motionEvent.getAction() == 0) {
                    m76557H(motionEvent);
                    return true;
                }
                if (motionEvent.getAction() == 2) {
                    this.f52024e = motionEvent.getY() - this.f52023d;
                    this.f52026g = motionEvent.getX() - this.f52025f;
                    if (this.f52037r == 0) {
                        float f = this.f52024e;
                        if (f > 0.0f) {
                            this.f52037r = 1;
                        } else if (f < 0.0f) {
                            this.f52037r = 2;
                        }
                    }
                    int i = this.f52037r;
                    if (i == 1) {
                        this.f52024e = Math.max(this.f52024e, 0.0f);
                    } else if (i == 2) {
                        this.f52024e = Math.min(this.f52024e, 0.0f);
                    }
                    float fAbs = Math.abs(this.f52024e) / Math.abs(this.f52026g);
                    float fAbs2 = Math.abs(this.f52026g) / Math.abs(this.f52024e);
                    float fAbs3 = Math.abs(this.f52024e);
                    int i2 = f52019t;
                    boolean z = fAbs3 >= ((float) i2) && fAbs > 2.0f;
                    boolean z2 = Math.abs(this.f52026g) >= ((float) i2) && fAbs2 > 3.0f;
                    if (z) {
                        requestDisallowInterceptTouchEvent(z);
                    } else {
                        if (!z2) {
                            return true;
                        }
                        requestDisallowInterceptTouchEvent(!z2);
                    }
                    float fM76565y = m76565y(this.f52024e);
                    if (this.f52037r == 0) {
                        if (fM76565y > 0.0f) {
                            this.f52037r = 1;
                        } else if (fM76565y < 0.0f) {
                            this.f52037r = 2;
                        }
                    }
                    int i3 = this.f52037r;
                    if (i3 == 1) {
                        fM76565y = Math.max(fM76565y, 0.0f);
                    } else if (i3 == 2) {
                        fM76565y = Math.min(fM76565y, 0.0f);
                    }
                    if (!this.f52034o) {
                        if (motionEvent.getX() - this.f52025f > 50.0f && !this.f52036q) {
                            this.f52036q = true;
                            this.f52030k.mo76574c();
                        } else if (Math.abs(fM76565y) > 50.0f && !this.f52036q) {
                            this.f52036q = true;
                            this.f52030k.mo76578g();
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f52032m.addMovement(motionEvent);
                    this.f52020a.setTranslationY(fM76565y);
                    InterfaceC12932b interfaceC12932b = this.f52029j;
                    if (interfaceC12932b != null) {
                        zMo76571c = interfaceC12932b.mo76571c(fM76565y < 0.0f);
                    } else {
                        zMo76571c = true;
                    }
                    this.f52022c.setVisibility(0);
                    xdl0.m208344M(getBackupView(), zMo76571c);
                    setBackUpViewTransY(fM76565y);
                    if (this.f52030k != null && Math.abs(fM76565y) > 50.0f) {
                        this.f52030k.mo76576e(fM76565y < 0.0f);
                    }
                } else {
                    if (this.f52020a.getTranslationY() == 0.0f) {
                        m76564w();
                        InterfaceC12933c interfaceC12933c = this.f52030k;
                        if (interfaceC12933c != null) {
                            interfaceC12933c.mo76580i();
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f52032m.computeCurrentVelocity(1000);
                    float fM76565y2 = m76565y(this.f52024e);
                    if (this.f52034o) {
                        if ((Math.abs(fM76565y2) > this.f52027h || (Math.abs(this.f52032m.getYVelocity()) > 4000.0f && Math.abs(fM76565y2) > 50.0f)) && m76563t(fM76565y2)) {
                            m76556G(fM76565y2, false);
                        } else {
                            m76555F(fM76565y2);
                        }
                    }
                    m76564w();
                }
                return super.onTouchEvent(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setIndicatorView(View view) {
        this.f52022c = view;
        int i = xdl0.f192403e;
        addView(view, new FrameLayout.LayoutParams(i, i));
        this.f52022c.setVisibility(8);
    }

    public void setOnLiveScrollListener(InterfaceC12932b interfaceC12932b) {
        this.f52029j = interfaceC12932b;
    }

    public void setOnViewListener(InterfaceC12933c interfaceC12933c) {
        this.f52030k = interfaceC12933c;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m76563t(float f) {
        InterfaceC12933c interfaceC12933c = this.f52030k;
        if (interfaceC12933c == null) {
            return true;
        }
        return interfaceC12933c.mo76575d(f < 0.0f);
    }

    /* JADX INFO: renamed from: w */
    public final void m76564w() {
        this.f52023d = 0.0f;
        this.f52024e = 0.0f;
        this.f52036q = false;
    }

    /* JADX INFO: renamed from: y */
    public final float m76565y(float f) {
        boolean z = f > 0.0f;
        float fAbs = (int) (Math.abs(f) - ((float) Math.pow(Math.abs(f) / ((int) Math.sqrt(1600.0d)), 1.7400000059604646d)));
        return z ? fAbs : -fAbs;
    }

    /* JADX INFO: renamed from: z */
    public void m76566z(e30<LiveScrollViewContainer> e30Var) {
        LiveScrollViewContainer liveScrollViewContainer = this.f52020a;
        if (liveScrollViewContainer != null) {
            e30Var.call(liveScrollViewContainer);
        }
        LiveScrollViewContainer liveScrollViewContainer2 = this.f52021b;
        if (liveScrollViewContainer2 != null) {
            e30Var.call(liveScrollViewContainer2);
        }
    }

    public LiveScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52027h = xdl0.m208408w0() / 5;
        this.f52028i = 0L;
        this.f52037r = 0;
        this.f52038s = C22393b.m221521b();
    }

    public LiveScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52027h = xdl0.m208408w0() / 5;
        this.f52028i = 0L;
        this.f52037r = 0;
        this.f52038s = C22393b.m221521b();
    }
}
