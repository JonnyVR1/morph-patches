package com.p051p1.mobile.putong.live.livingroom.view;

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
import com.p051p1.mobile.putong.live.livingroom.archi.frag.LiveScrollViewContainer;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.bnl0;
import p153l.dkt;
import p153l.gt0;
import p153l.l51;
import p153l.ner;
import p153l.pcj;
import p153l.pol;
import p153l.psd0;
import p153l.qcj;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class LiveScrollView extends FrameLayout implements pol {

    /* JADX INFO: renamed from: t */
    public static final int f52867t = ViewConfiguration.get(zrv.f205803e).getScaledTouchSlop();

    /* JADX INFO: renamed from: a */
    public LiveScrollViewContainer f52868a;

    /* JADX INFO: renamed from: b */
    public LiveScrollViewContainer f52869b;

    /* JADX INFO: renamed from: c */
    public View f52870c;

    /* JADX INFO: renamed from: d */
    public float f52871d;

    /* JADX INFO: renamed from: e */
    public float f52872e;

    /* JADX INFO: renamed from: f */
    public float f52873f;

    /* JADX INFO: renamed from: g */
    public float f52874g;

    /* JADX INFO: renamed from: h */
    public final float f52875h;

    /* JADX INFO: renamed from: i */
    public long f52876i;

    /* JADX INFO: renamed from: j */
    public InterfaceC13095b f52877j;

    /* JADX INFO: renamed from: k */
    public InterfaceC13096c f52878k;

    /* JADX INFO: renamed from: l */
    public View f52879l;

    /* JADX INFO: renamed from: m */
    public VelocityTracker f52880m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f52881n;

    /* JADX INFO: renamed from: o */
    public boolean f52882o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f52883p;

    /* JADX INFO: renamed from: q */
    public boolean f52884q;

    /* JADX INFO: renamed from: r */
    public int f52885r;

    /* JADX INFO: renamed from: s */
    public C22508b<View> f52886s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveScrollView$a */
    public class C13094a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f52887a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f52888b;

        public C13094a(boolean z, boolean z2) {
            this.f52887a = z;
            this.f52888b = z2;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m77751b(boolean z, boolean z2) {
            LiveScrollView.this.m77744L(z, z2);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Context context = LiveScrollView.this.getContext();
            final boolean z = this.f52887a;
            final boolean z2 = this.f52888b;
            l51.m152886F(context, new Runnable() { // from class: l.kkt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f127287a.m77751b(z, z2);
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
    public interface InterfaceC13095b {
        /* JADX INFO: renamed from: a */
        void mo77752a(boolean z);

        /* JADX INFO: renamed from: b */
        void mo77753b();

        /* JADX INFO: renamed from: c */
        boolean mo77754c(boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveScrollView$c */
    public interface InterfaceC13096c {
        /* JADX INFO: renamed from: a */
        void mo77755a(boolean z, LiveScrollViewContainer liveScrollViewContainer, boolean z2, JumpRoomData jumpRoomData);

        /* JADX INFO: renamed from: b */
        boolean mo77756b();

        /* JADX INFO: renamed from: c */
        void mo77757c();

        /* JADX INFO: renamed from: d */
        boolean mo77758d(boolean z);

        /* JADX INFO: renamed from: e */
        void mo77759e(boolean z);

        /* JADX INFO: renamed from: f */
        boolean mo77760f();

        /* JADX INFO: renamed from: g */
        void mo77761g();

        /* JADX INFO: renamed from: h */
        void mo77762h(LiveScrollViewContainer liveScrollViewContainer, boolean z);

        /* JADX INFO: renamed from: i */
        void mo77763i();
    }

    public LiveScrollView(@NonNull Context context) {
        super(context);
        this.f52875h = bnl0.m105588w0() / 5;
        this.f52876i = 0L;
        this.f52885r = 0;
        this.f52886s = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C22421c m77731p(C22421c c22421c) {
        return c22421c;
    }

    private void setBackUpViewTransY(float f) {
        float height = f > 0.0f ? f - getHeight() : f + getHeight();
        View view = this.f52870c;
        if (view != null) {
            view.setTranslationY(height);
        }
        getBackupView().setTranslationY(height);
    }

    /* JADX INFO: renamed from: A */
    public void m77733A() {
        LiveScrollViewContainer liveScrollViewContainer = new LiveScrollViewContainer(getContext(), true);
        int i = bnl0.f77544e;
        addView(liveScrollViewContainer, 0, new FrameLayout.LayoutParams(i, i));
        this.f52868a = liveScrollViewContainer;
        liveScrollViewContainer.setVisibility(0);
        this.f52879l = this.f52868a;
        LiveScrollViewContainer liveScrollViewContainer2 = new LiveScrollViewContainer(getContext(), false);
        int i2 = bnl0.f77544e;
        addView(liveScrollViewContainer2, 1, new FrameLayout.LayoutParams(i2, i2));
        this.f52869b = liveScrollViewContainer2;
        liveScrollViewContainer2.setVisibility(8);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m77734B(ValueAnimator valueAnimator) {
        this.f52868a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setBackUpViewTransY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m77735C() {
        InterfaceC13096c interfaceC13096c = this.f52878k;
        if (interfaceC13096c != null) {
            interfaceC13096c.mo77763i();
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m77736D(ValueAnimator valueAnimator) {
        this.f52868a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setBackUpViewTransY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m77737E(ValueAnimator valueAnimator) {
        this.f52868a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setBackUpViewTransY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: F */
    public final void m77738F(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        this.f52883p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(dkt.m116676b(f));
        this.f52883p.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f52883p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fkt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f99565a.m77734B(valueAnimator);
            }
        });
        gt0.m132160f(this.f52883p, new Runnable() { // from class: l.gkt
            @Override // java.lang.Runnable
            public final void run() {
                this.f104768a.m77735C();
            }
        });
        this.f52883p.start();
    }

    /* JADX INFO: renamed from: G */
    public final void m77739G(float f, boolean z) {
        boolean z2 = f < 0.0f;
        InterfaceC13095b interfaceC13095b = this.f52877j;
        if (interfaceC13095b != null) {
            interfaceC13095b.mo77752a(z2);
        }
        bnl0.m105524M(this.f52870c, false);
        int height = getHeight();
        if (z2) {
            height = -height;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, height);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ekt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f94433a.m77736D(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C13094a(z2, z));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: H */
    public final void m77740H(MotionEvent motionEvent) {
        this.f52882o = this.f52878k.mo77756b();
        this.f52871d = motionEvent.getY();
        this.f52873f = motionEvent.getX();
        VelocityTracker velocityTracker = this.f52880m;
        if (velocityTracker == null) {
            this.f52880m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        this.f52880m.addMovement(motionEvent);
        ValueAnimator valueAnimator = this.f52883p;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f52883p = null;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m77741I(JumpRoomData jumpRoomData) {
        m77745M(true, true, jumpRoomData);
    }

    /* JADX INFO: renamed from: J */
    public void m77742J(float f) {
        InterfaceC13095b interfaceC13095b = this.f52877j;
        if (interfaceC13095b != null) {
            interfaceC13095b.mo77752a(true);
        }
        this.f52870c.setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, m77748y(f), 0.0f);
        this.f52881n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1300L);
        this.f52881n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jkt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f121446a.m77737E(valueAnimator);
            }
        });
        this.f52881n.start();
    }

    /* JADX INFO: renamed from: K */
    public void m77743K() {
        ValueAnimator valueAnimator = this.f52881n;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        InterfaceC13095b interfaceC13095b = this.f52877j;
        if (interfaceC13095b != null) {
            interfaceC13095b.mo77753b();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m77744L(boolean z, boolean z2) {
        m77745M(z, z2, null);
    }

    /* JADX INFO: renamed from: M */
    public final void m77745M(boolean z, boolean z2, JumpRoomData jumpRoomData) {
        this.f52870c.setVisibility(8);
        this.f52868a.setVisibility(8);
        this.f52868a.setTranslationY(0.0f);
        this.f52870c.setTranslationY(0.0f);
        LiveScrollViewContainer liveScrollViewContainer = this.f52868a;
        LiveScrollViewContainer backupView = getBackupView();
        this.f52868a = backupView;
        this.f52869b = liveScrollViewContainer;
        this.f52879l = backupView;
        InterfaceC13096c interfaceC13096c = this.f52878k;
        if (interfaceC13096c != null) {
            interfaceC13096c.mo77762h(getBackupView(), z2);
        }
        this.f52886s.onNext(getBackupView());
        InterfaceC13096c interfaceC13096c2 = this.f52878k;
        if (interfaceC13096c2 != null) {
            interfaceC13096c2.mo77755a(z, this.f52868a, z2, jumpRoomData);
            this.f52876i = SystemClock.elapsedRealtime();
        }
        InterfaceC13095b interfaceC13095b = this.f52877j;
        if (interfaceC13095b != null) {
            interfaceC13095b.mo77753b();
        }
        this.f52868a.setTranslationY(0.0f);
        this.f52868a.setVisibility(0);
        this.f52870c.setTranslationY(0.0f);
    }

    @Override // p153l.pol
    /* JADX INFO: renamed from: c */
    public <V> C22421c<V> mo68557c(ner nerVar, C22421c<V> c22421c) {
        return mo68561g(nerVar, c22421c, true);
    }

    @Override // p153l.pol
    /* JADX INFO: renamed from: g */
    public <V> C22421c<V> mo68561g(ner nerVar, final C22421c<V> c22421c, boolean z) {
        final View view = this.f52879l;
        return psd0.m173593D(new pcj() { // from class: l.ikt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return LiveScrollView.m77731p(c22421c);
            }
        }, nerVar.lifecycle().compose(psd0.m173594E()).takeUntil(this.f52886s.filter(new qcj() { // from class: l.hkt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    public LiveScrollViewContainer getBackupView() {
        return this.f52869b;
    }

    public LiveScrollViewContainer getCurrentView() {
        return this.f52868a;
    }

    public View getIndicatorView() {
        return this.f52870c;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f52878k.mo77760f()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 2) {
            if (Math.abs(motionEvent.getY() - this.f52871d) > f52867t) {
                return true;
            }
        } else if (motionEvent.getAction() == 0) {
            m77740H(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zMo77754c;
        if (this.f52868a != null) {
            if (motionEvent.getPointerCount() <= 1) {
                if (this.f52878k.mo77760f()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (SystemClock.elapsedRealtime() - this.f52876i < 400.0f) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() != 2) {
                    this.f52885r = 0;
                }
                if (motionEvent.getAction() == 0) {
                    m77740H(motionEvent);
                    return true;
                }
                if (motionEvent.getAction() == 2) {
                    this.f52872e = motionEvent.getY() - this.f52871d;
                    this.f52874g = motionEvent.getX() - this.f52873f;
                    if (this.f52885r == 0) {
                        float f = this.f52872e;
                        if (f > 0.0f) {
                            this.f52885r = 1;
                        } else if (f < 0.0f) {
                            this.f52885r = 2;
                        }
                    }
                    int i = this.f52885r;
                    if (i == 1) {
                        this.f52872e = Math.max(this.f52872e, 0.0f);
                    } else if (i == 2) {
                        this.f52872e = Math.min(this.f52872e, 0.0f);
                    }
                    float fAbs = Math.abs(this.f52872e) / Math.abs(this.f52874g);
                    float fAbs2 = Math.abs(this.f52874g) / Math.abs(this.f52872e);
                    float fAbs3 = Math.abs(this.f52872e);
                    int i2 = f52867t;
                    boolean z = fAbs3 >= ((float) i2) && fAbs > 2.0f;
                    boolean z2 = Math.abs(this.f52874g) >= ((float) i2) && fAbs2 > 3.0f;
                    if (z) {
                        requestDisallowInterceptTouchEvent(z);
                    } else {
                        if (!z2) {
                            return true;
                        }
                        requestDisallowInterceptTouchEvent(!z2);
                    }
                    float fM77748y = m77748y(this.f52872e);
                    if (this.f52885r == 0) {
                        if (fM77748y > 0.0f) {
                            this.f52885r = 1;
                        } else if (fM77748y < 0.0f) {
                            this.f52885r = 2;
                        }
                    }
                    int i3 = this.f52885r;
                    if (i3 == 1) {
                        fM77748y = Math.max(fM77748y, 0.0f);
                    } else if (i3 == 2) {
                        fM77748y = Math.min(fM77748y, 0.0f);
                    }
                    if (!this.f52882o) {
                        if (motionEvent.getX() - this.f52873f > 50.0f && !this.f52884q) {
                            this.f52884q = true;
                            this.f52878k.mo77757c();
                        } else if (Math.abs(fM77748y) > 50.0f && !this.f52884q) {
                            this.f52884q = true;
                            this.f52878k.mo77761g();
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f52880m.addMovement(motionEvent);
                    this.f52868a.setTranslationY(fM77748y);
                    InterfaceC13095b interfaceC13095b = this.f52877j;
                    if (interfaceC13095b != null) {
                        zMo77754c = interfaceC13095b.mo77754c(fM77748y < 0.0f);
                    } else {
                        zMo77754c = true;
                    }
                    this.f52870c.setVisibility(0);
                    bnl0.m105524M(getBackupView(), zMo77754c);
                    setBackUpViewTransY(fM77748y);
                    if (this.f52878k != null && Math.abs(fM77748y) > 50.0f) {
                        this.f52878k.mo77759e(fM77748y < 0.0f);
                    }
                } else {
                    if (this.f52868a.getTranslationY() == 0.0f) {
                        m77747w();
                        InterfaceC13096c interfaceC13096c = this.f52878k;
                        if (interfaceC13096c != null) {
                            interfaceC13096c.mo77763i();
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f52880m.computeCurrentVelocity(1000);
                    float fM77748y2 = m77748y(this.f52872e);
                    if (this.f52882o) {
                        if ((Math.abs(fM77748y2) > this.f52875h || (Math.abs(this.f52880m.getYVelocity()) > 4000.0f && Math.abs(fM77748y2) > 50.0f)) && m77746t(fM77748y2)) {
                            m77739G(fM77748y2, false);
                        } else {
                            m77738F(fM77748y2);
                        }
                    }
                    m77747w();
                }
                return super.onTouchEvent(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setIndicatorView(View view) {
        this.f52870c = view;
        int i = bnl0.f77544e;
        addView(view, new FrameLayout.LayoutParams(i, i));
        this.f52870c.setVisibility(8);
    }

    public void setOnLiveScrollListener(InterfaceC13095b interfaceC13095b) {
        this.f52877j = interfaceC13095b;
    }

    public void setOnViewListener(InterfaceC13096c interfaceC13096c) {
        this.f52878k = interfaceC13096c;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m77746t(float f) {
        InterfaceC13096c interfaceC13096c = this.f52878k;
        if (interfaceC13096c == null) {
            return true;
        }
        return interfaceC13096c.mo77758d(f < 0.0f);
    }

    /* JADX INFO: renamed from: w */
    public final void m77747w() {
        this.f52871d = 0.0f;
        this.f52872e = 0.0f;
        this.f52884q = false;
    }

    /* JADX INFO: renamed from: y */
    public final float m77748y(float f) {
        boolean z = f > 0.0f;
        float fAbs = (int) (Math.abs(f) - ((float) Math.pow(Math.abs(f) / ((int) Math.sqrt(1600.0d)), 1.7400000059604646d)));
        return z ? fAbs : -fAbs;
    }

    /* JADX INFO: renamed from: z */
    public void m77749z(y20<LiveScrollViewContainer> y20Var) {
        LiveScrollViewContainer liveScrollViewContainer = this.f52868a;
        if (liveScrollViewContainer != null) {
            y20Var.call(liveScrollViewContainer);
        }
        LiveScrollViewContainer liveScrollViewContainer2 = this.f52869b;
        if (liveScrollViewContainer2 != null) {
            y20Var.call(liveScrollViewContainer2);
        }
    }

    public LiveScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52875h = bnl0.m105588w0() / 5;
        this.f52876i = 0L;
        this.f52885r = 0;
        this.f52886s = C22508b.m222767b();
    }

    public LiveScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52875h = bnl0.m105588w0() / 5;
        this.f52876i = 0L;
        this.f52885r = 0;
        this.f52886s = C22508b.m222767b();
    }
}
