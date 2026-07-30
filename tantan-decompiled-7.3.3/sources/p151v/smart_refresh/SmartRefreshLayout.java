package p151v.smart_refresh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p151v.smart_refresh.constant.RefreshState;
import p151v.smart_refresh.wrapper.RefreshFooterWrapper;
import p151v.smart_refresh.wrapper.RefreshHeaderWrapper;
import p153l.azk0;
import p153l.bi20;
import p153l.ei20;
import p153l.fi20;
import p153l.gvc0;
import p153l.hhc0;
import p153l.hvc0;
import p153l.ivc0;
import p153l.jn50;
import p153l.jvc0;
import p153l.kkl0;
import p153l.kn50;
import p153l.kvc0;
import p153l.lvc0;
import p153l.mvc0;
import p153l.o1j0;
import p153l.rsf0;
import p153l.srd;
import p153l.t2e;
import p153l.tm50;
import p153l.trd;
import p153l.urd;
import p153l.vcc0;
import p153l.wwf0;
import p153l.xde0;
import p153l.xm50;
import p153l.zzq0;

/* JADX INFO: loaded from: classes3.dex */
public class SmartRefreshLayout extends ViewGroup implements mvc0, ei20 {

    /* JADX INFO: renamed from: q1 */
    public static srd f210848q1;

    /* JADX INFO: renamed from: r1 */
    public static trd f210849r1;

    /* JADX INFO: renamed from: s1 */
    public static urd f210850s1;

    /* JADX INFO: renamed from: t1 */
    public static ViewGroup.MarginLayoutParams f210851t1 = new ViewGroup.MarginLayoutParams(-1, -1);

    /* JADX INFO: renamed from: A */
    public int[] f210852A;

    /* JADX INFO: renamed from: B */
    public boolean f210853B;

    /* JADX INFO: renamed from: C */
    public boolean f210854C;

    /* JADX INFO: renamed from: D */
    public boolean f210855D;

    /* JADX INFO: renamed from: E */
    public boolean f210856E;

    /* JADX INFO: renamed from: E0 */
    public tm50 f210857E0;

    /* JADX INFO: renamed from: F */
    public boolean f210858F;

    /* JADX INFO: renamed from: F0 */
    public xm50 f210859F0;

    /* JADX INFO: renamed from: G */
    public boolean f210860G;

    /* JADX INFO: renamed from: G0 */
    public xde0 f210861G0;

    /* JADX INFO: renamed from: H */
    public boolean f210862H;

    /* JADX INFO: renamed from: H0 */
    public int f210863H0;

    /* JADX INFO: renamed from: I */
    public boolean f210864I;

    /* JADX INFO: renamed from: I0 */
    public boolean f210865I0;

    /* JADX INFO: renamed from: J */
    public boolean f210866J;

    /* JADX INFO: renamed from: J0 */
    public int[] f210867J0;

    /* JADX INFO: renamed from: K */
    public boolean f210868K;

    /* JADX INFO: renamed from: K0 */
    public bi20 f210869K0;

    /* JADX INFO: renamed from: L */
    public boolean f210870L;

    /* JADX INFO: renamed from: L0 */
    public fi20 f210871L0;

    /* JADX INFO: renamed from: M */
    public boolean f210872M;

    /* JADX INFO: renamed from: M0 */
    public int f210873M0;

    /* JADX INFO: renamed from: N */
    public boolean f210874N;

    /* JADX INFO: renamed from: N0 */
    public t2e f210875N0;

    /* JADX INFO: renamed from: O */
    public boolean f210876O;

    /* JADX INFO: renamed from: O0 */
    public int f210877O0;

    /* JADX INFO: renamed from: P */
    public boolean f210878P;

    /* JADX INFO: renamed from: P0 */
    public t2e f210879P0;

    /* JADX INFO: renamed from: Q */
    public boolean f210880Q;

    /* JADX INFO: renamed from: Q0 */
    public int f210881Q0;

    /* JADX INFO: renamed from: R */
    public boolean f210882R;

    /* JADX INFO: renamed from: R0 */
    public int f210883R0;

    /* JADX INFO: renamed from: S */
    public boolean f210884S;

    /* JADX INFO: renamed from: S0 */
    public float f210885S0;

    /* JADX INFO: renamed from: T */
    public boolean f210886T;

    /* JADX INFO: renamed from: T0 */
    public float f210887T0;

    /* JADX INFO: renamed from: U */
    public boolean f210888U;

    /* JADX INFO: renamed from: U0 */
    public float f210889U0;

    /* JADX INFO: renamed from: V */
    public boolean f210890V;

    /* JADX INFO: renamed from: V0 */
    public float f210891V0;

    /* JADX INFO: renamed from: W */
    public boolean f210892W;

    /* JADX INFO: renamed from: W0 */
    public float f210893W0;

    /* JADX INFO: renamed from: X0 */
    public gvc0 f210894X0;

    /* JADX INFO: renamed from: Y0 */
    public gvc0 f210895Y0;

    /* JADX INFO: renamed from: Z0 */
    public hvc0 f210896Z0;

    /* JADX INFO: renamed from: a */
    public int f210897a;

    /* JADX INFO: renamed from: a1 */
    public Paint f210898a1;

    /* JADX INFO: renamed from: b */
    public int f210899b;

    /* JADX INFO: renamed from: b1 */
    public Handler f210900b1;

    /* JADX INFO: renamed from: c */
    public int f210901c;

    /* JADX INFO: renamed from: c1 */
    public lvc0 f210902c1;

    /* JADX INFO: renamed from: d */
    public int f210903d;

    /* JADX INFO: renamed from: d1 */
    public RefreshState f210904d1;

    /* JADX INFO: renamed from: e */
    public int f210905e;

    /* JADX INFO: renamed from: e1 */
    public RefreshState f210906e1;

    /* JADX INFO: renamed from: f */
    public int f210907f;

    /* JADX INFO: renamed from: f1 */
    public long f210908f1;

    /* JADX INFO: renamed from: g */
    public int f210909g;

    /* JADX INFO: renamed from: g1 */
    public int f210910g1;

    /* JADX INFO: renamed from: h */
    public float f210911h;

    /* JADX INFO: renamed from: h1 */
    public int f210912h1;

    /* JADX INFO: renamed from: i */
    public float f210913i;

    /* JADX INFO: renamed from: i1 */
    public boolean f210914i1;

    /* JADX INFO: renamed from: j */
    public float f210915j;

    /* JADX INFO: renamed from: j1 */
    public boolean f210916j1;

    /* JADX INFO: renamed from: k */
    public float f210917k;

    /* JADX INFO: renamed from: k0 */
    public boolean f210918k0;

    /* JADX INFO: renamed from: k1 */
    public boolean f210919k1;

    /* JADX INFO: renamed from: l */
    public float f210920l;

    /* JADX INFO: renamed from: l1 */
    public boolean f210921l1;

    /* JADX INFO: renamed from: m */
    public char f210922m;

    /* JADX INFO: renamed from: m1 */
    public boolean f210923m1;

    /* JADX INFO: renamed from: n */
    public boolean f210924n;

    /* JADX INFO: renamed from: n1 */
    public MotionEvent f210925n1;

    /* JADX INFO: renamed from: o */
    public boolean f210926o;

    /* JADX INFO: renamed from: o1 */
    public Runnable f210927o1;

    /* JADX INFO: renamed from: p */
    public boolean f210928p;

    /* JADX INFO: renamed from: p0 */
    public jn50 f210929p0;

    /* JADX INFO: renamed from: p1 */
    public ValueAnimator f210930p1;

    /* JADX INFO: renamed from: q */
    public int f210931q;

    /* JADX INFO: renamed from: r */
    public int f210932r;

    /* JADX INFO: renamed from: s */
    public int f210933s;

    /* JADX INFO: renamed from: t */
    public int f210934t;

    /* JADX INFO: renamed from: u */
    public int f210935u;

    /* JADX INFO: renamed from: v */
    public int f210936v;

    /* JADX INFO: renamed from: w */
    public int f210937w;

    /* JADX INFO: renamed from: x */
    public Scroller f210938x;

    /* JADX INFO: renamed from: y */
    public VelocityTracker f210939y;

    /* JADX INFO: renamed from: z */
    public Interpolator f210940z;

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$a */
    public static /* synthetic */ class C22751a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f210941a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f210941a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f210941a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f210941a[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f210941a[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f210941a[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f210941a[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f210941a[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f210941a[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f210941a[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f210941a[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f210941a[RefreshState.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f210941a[RefreshState.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$b */
    public class C22752b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f210942a;

        public C22752b(boolean z) {
            this.f210942a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.setStateDirectLoading(this.f210942a);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$c */
    public class C22753c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f210944a;

        public C22753c(boolean z) {
            this.f210944a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.f210908f1 = System.currentTimeMillis();
                SmartRefreshLayout.this.m224998D(RefreshState.Refreshing);
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                jn50 jn50Var = smartRefreshLayout.f210929p0;
                if (jn50Var != null) {
                    if (this.f210944a) {
                        jn50Var.mo59137w2(smartRefreshLayout);
                    }
                } else if (smartRefreshLayout.f210859F0 == null) {
                    smartRefreshLayout.m225022u(3000);
                }
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                gvc0 gvc0Var = smartRefreshLayout2.f210894X0;
                if (gvc0Var != null) {
                    float f = smartRefreshLayout2.f210885S0;
                    if (f < 10.0f) {
                        f *= smartRefreshLayout2.f210873M0;
                    }
                    gvc0Var.mo132529g(smartRefreshLayout2, smartRefreshLayout2.f210873M0, (int) f);
                }
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                xm50 xm50Var = smartRefreshLayout3.f210859F0;
                if (xm50Var == null || !(smartRefreshLayout3.f210894X0 instanceof kvc0)) {
                    return;
                }
                if (this.f210944a) {
                    xm50Var.mo59137w2(smartRefreshLayout3);
                }
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                float f2 = smartRefreshLayout4.f210885S0;
                if (f2 < 10.0f) {
                    f2 *= smartRefreshLayout4.f210873M0;
                }
                smartRefreshLayout4.f210859F0.mo141455A2((kvc0) smartRefreshLayout4.f210894X0, smartRefreshLayout4.f210873M0, (int) f2);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$d */
    public class C22754d extends AnimatorListenerAdapter {
        public C22754d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RefreshState refreshState;
            RefreshState refreshState2;
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.f210930p1 = null;
                if (smartRefreshLayout.f210899b == 0 && (refreshState = smartRefreshLayout.f210904d1) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
                    smartRefreshLayout.m224998D(refreshState2);
                    return;
                }
                RefreshState refreshState3 = smartRefreshLayout.f210904d1;
                if (refreshState3 != smartRefreshLayout.f210906e1) {
                    smartRefreshLayout.setViceState(refreshState3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$e */
    public class C22755e implements ValueAnimator.AnimatorUpdateListener {
        public C22755e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout.this.f210902c1.mo155987e(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$f */
    public class RunnableC22756f implements Runnable {
        public RunnableC22756f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            tm50 tm50Var = smartRefreshLayout.f210857E0;
            if (tm50Var != null) {
                tm50Var.mo79018a(smartRefreshLayout);
            } else if (smartRefreshLayout.f210859F0 == null) {
                smartRefreshLayout.m225017p(2000);
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            xm50 xm50Var = smartRefreshLayout2.f210859F0;
            if (xm50Var != null) {
                xm50Var.mo79018a(smartRefreshLayout2);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$g */
    public class RunnableC22757g implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f210949a = 0;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f210950b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Boolean f210951c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f210952d;

        public RunnableC22757g(int i, Boolean bool, boolean z) {
            this.f210950b = i;
            this.f210951c = bool;
            this.f210952d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f210949a;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (i == 0) {
                RefreshState refreshState = smartRefreshLayout.f210904d1;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.f210906e1 == RefreshState.Refreshing) {
                    smartRefreshLayout.f210906e1 = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.f210930p1;
                    if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.f210930p1.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.f210930p1 = null;
                        ValueAnimator valueAnimatorMo155983a = smartRefreshLayout2.f210902c1.mo155983a(0);
                        SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                        if (valueAnimatorMo155983a == null) {
                            smartRefreshLayout3.m224998D(refreshState2);
                        } else {
                            smartRefreshLayout3.m224998D(RefreshState.PullDownCanceled);
                        }
                    } else if (refreshState == RefreshState.Refreshing && smartRefreshLayout.f210894X0 != null && smartRefreshLayout.f210896Z0 != null) {
                        this.f210949a = i + 1;
                        smartRefreshLayout.f210900b1.postDelayed(this, this.f210950b);
                        SmartRefreshLayout.this.m224998D(RefreshState.RefreshFinish);
                        if (this.f210951c == Boolean.FALSE) {
                            SmartRefreshLayout.this.m225006L(false);
                        }
                    }
                }
                if (this.f210951c == Boolean.TRUE) {
                    SmartRefreshLayout.this.m225006L(true);
                    return;
                }
                return;
            }
            int iMo132530h = smartRefreshLayout.f210894X0.mo132530h(smartRefreshLayout, this.f210952d);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            xm50 xm50Var = smartRefreshLayout4.f210859F0;
            if (xm50Var != null) {
                gvc0 gvc0Var = smartRefreshLayout4.f210894X0;
                if (gvc0Var instanceof kvc0) {
                    xm50Var.mo141461x0((kvc0) gvc0Var, this.f210952d);
                }
            }
            if (iMo132530h < Integer.MAX_VALUE) {
                SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                if (smartRefreshLayout5.f210924n || smartRefreshLayout5.f210865I0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.f210924n) {
                        float f = smartRefreshLayout6.f210917k;
                        smartRefreshLayout6.f210913i = f;
                        smartRefreshLayout6.f210903d = 0;
                        smartRefreshLayout6.f210924n = false;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout6.f210915j, (f + smartRefreshLayout6.f210899b) - (smartRefreshLayout6.f210897a * 2), 0));
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout7.f210915j, smartRefreshLayout7.f210917k + smartRefreshLayout7.f210899b, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.f210865I0) {
                        smartRefreshLayout8.f210863H0 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout8.f210915j, smartRefreshLayout8.f210917k, 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        smartRefreshLayout9.f210865I0 = false;
                        smartRefreshLayout9.f210903d = 0;
                    }
                }
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                int i2 = smartRefreshLayout10.f210899b;
                if (i2 <= 0) {
                    if (i2 < 0) {
                        smartRefreshLayout10.m225009h(0, iMo132530h, smartRefreshLayout10.f210940z, smartRefreshLayout10.f210907f);
                        return;
                    } else {
                        smartRefreshLayout10.f210902c1.mo155987e(0, false);
                        SmartRefreshLayout.this.f210902c1.mo155988f(RefreshState.None);
                        return;
                    }
                }
                ValueAnimator valueAnimatorM225009h = smartRefreshLayout10.m225009h(0, iMo132530h, smartRefreshLayout10.f210940z, smartRefreshLayout10.f210907f);
                SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerMo137312c = smartRefreshLayout11.f210876O ? smartRefreshLayout11.f210896Z0.mo137312c(smartRefreshLayout11.f210899b) : null;
                if (valueAnimatorM225009h == null || animatorUpdateListenerMo137312c == null) {
                    return;
                }
                valueAnimatorM225009h.addUpdateListener(animatorUpdateListenerMo137312c);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$h */
    public class RunnableC22758h implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f210954a = 0;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f210955b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f210956c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f210957d;

        /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$h$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f210959a;

            /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$h$a$a, reason: collision with other inner class name */
            public class C22849a extends AnimatorListenerAdapter {
                public C22849a() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (animator == null || animator.getDuration() != 0) {
                        RunnableC22758h runnableC22758h = RunnableC22758h.this;
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        smartRefreshLayout.f210921l1 = false;
                        if (runnableC22758h.f210956c) {
                            smartRefreshLayout.m225006L(true);
                        }
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        if (smartRefreshLayout2.f210904d1 == RefreshState.LoadFinish) {
                            smartRefreshLayout2.m224998D(RefreshState.None);
                        }
                    }
                }
            }

            public a(int i) {
                this.f210959a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerMo137312c;
                ValueAnimator valueAnimatorMo155983a;
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (!smartRefreshLayout.f210874N || this.f210959a >= 0) {
                    animatorUpdateListenerMo137312c = null;
                } else {
                    animatorUpdateListenerMo137312c = smartRefreshLayout.f210896Z0.mo137312c(smartRefreshLayout.f210899b);
                    if (animatorUpdateListenerMo137312c != null) {
                        animatorUpdateListenerMo137312c.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                    }
                }
                C22849a c22849a = new C22849a();
                RunnableC22758h runnableC22758h = RunnableC22758h.this;
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i = smartRefreshLayout2.f210899b;
                if (i > 0) {
                    valueAnimatorMo155983a = smartRefreshLayout2.f210902c1.mo155983a(0);
                } else {
                    if (animatorUpdateListenerMo137312c != null || i == 0) {
                        ValueAnimator valueAnimator = smartRefreshLayout2.f210930p1;
                        if (valueAnimator != null) {
                            valueAnimator.setDuration(0L);
                            SmartRefreshLayout.this.f210930p1.cancel();
                            SmartRefreshLayout.this.f210930p1 = null;
                        }
                        SmartRefreshLayout.this.f210902c1.mo155987e(0, false);
                        SmartRefreshLayout.this.f210902c1.mo155988f(RefreshState.None);
                    } else if (runnableC22758h.f210956c && smartRefreshLayout2.f210862H) {
                        int i2 = smartRefreshLayout2.f210877O0;
                        if (i >= (-i2)) {
                            smartRefreshLayout2.m224998D(RefreshState.None);
                        } else {
                            valueAnimatorMo155983a = smartRefreshLayout2.f210902c1.mo155983a(-i2);
                        }
                    } else {
                        valueAnimatorMo155983a = smartRefreshLayout2.f210902c1.mo155983a(0);
                    }
                    valueAnimatorMo155983a = null;
                }
                if (valueAnimatorMo155983a != null) {
                    valueAnimatorMo155983a.addListener(c22849a);
                } else {
                    c22849a.onAnimationEnd(null);
                }
            }
        }

        public RunnableC22758h(int i, boolean z, boolean z2) {
            this.f210955b = i;
            this.f210956c = z;
            this.f210957d = z2;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            int i = this.f210954a;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (i == 0) {
                RefreshState refreshState = smartRefreshLayout.f210904d1;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.f210906e1 == RefreshState.Loading) {
                    smartRefreshLayout.f210906e1 = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.f210930p1;
                    if (valueAnimator != null && ((refreshState.isDragging || refreshState == RefreshState.LoadReleased) && refreshState.isFooter)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.f210930p1.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.f210930p1 = null;
                        ValueAnimator valueAnimatorMo155983a = smartRefreshLayout2.f210902c1.mo155983a(0);
                        SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                        if (valueAnimatorMo155983a == null) {
                            smartRefreshLayout3.m224998D(refreshState2);
                        } else {
                            smartRefreshLayout3.m224998D(RefreshState.PullUpCanceled);
                        }
                    } else if (refreshState == RefreshState.Loading && smartRefreshLayout.f210895Y0 != null && smartRefreshLayout.f210896Z0 != null) {
                        this.f210954a = i + 1;
                        smartRefreshLayout.f210900b1.postDelayed(this, this.f210955b);
                        SmartRefreshLayout.this.m224998D(RefreshState.LoadFinish);
                        return;
                    }
                }
                if (this.f210956c) {
                    SmartRefreshLayout.this.m225006L(true);
                    return;
                }
                return;
            }
            int iMo132530h = smartRefreshLayout.f210895Y0.mo132530h(smartRefreshLayout, this.f210957d);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            xm50 xm50Var = smartRefreshLayout4.f210859F0;
            if (xm50Var != null) {
                gvc0 gvc0Var = smartRefreshLayout4.f210895Y0;
                if (gvc0Var instanceof jvc0) {
                    xm50Var.mo141458j((jvc0) gvc0Var, this.f210957d);
                }
            }
            if (iMo132530h < Integer.MAX_VALUE) {
                if (this.f210956c) {
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    z = smartRefreshLayout5.f210862H && smartRefreshLayout5.f210899b < 0 && smartRefreshLayout5.f210896Z0.mo137316g();
                }
                SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                int i2 = smartRefreshLayout6.f210899b;
                int iMax = i2 - (z ? Math.max(i2, -smartRefreshLayout6.f210877O0) : 0);
                SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                if (smartRefreshLayout7.f210924n || smartRefreshLayout7.f210865I0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.f210924n) {
                        float f = smartRefreshLayout8.f210917k;
                        smartRefreshLayout8.f210913i = f;
                        smartRefreshLayout8.f210903d = smartRefreshLayout8.f210899b - iMax;
                        smartRefreshLayout8.f210924n = false;
                        float f2 = smartRefreshLayout8.f210860G ? iMax : 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout8.f210915j, f + f2 + (smartRefreshLayout8.f210897a * 2), 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout9.f210915j, smartRefreshLayout9.f210917k + f2, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                    if (smartRefreshLayout10.f210865I0) {
                        smartRefreshLayout10.f210863H0 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout10.f210915j, smartRefreshLayout10.f210917k, 0));
                        SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                        smartRefreshLayout11.f210865I0 = false;
                        smartRefreshLayout11.f210903d = 0;
                    }
                }
                SmartRefreshLayout.this.f210900b1.postDelayed(new a(iMax), SmartRefreshLayout.this.f210899b < 0 ? iMo132530h : 0L);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$i */
    public class RunnableC22759i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f210962a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f210963b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f210964c;

        /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$i$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.f210930p1 == null || smartRefreshLayout.f210894X0 == null) {
                    return;
                }
                smartRefreshLayout.f210902c1.mo155987e(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }

        /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$i$b */
        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.f210930p1 = null;
                    if (smartRefreshLayout.f210894X0 == null) {
                        smartRefreshLayout.f210902c1.mo155988f(RefreshState.None);
                        return;
                    }
                    RefreshState refreshState = smartRefreshLayout.f210904d1;
                    RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
                    if (refreshState != refreshState2) {
                        smartRefreshLayout.f210902c1.mo155988f(refreshState2);
                    }
                    RunnableC22759i runnableC22759i = RunnableC22759i.this;
                    SmartRefreshLayout.this.setStateRefreshing(!runnableC22759i.f210964c);
                }
            }
        }

        public RunnableC22759i(float f, int i, boolean z) {
            this.f210962a = f;
            this.f210963b = i;
            this.f210964c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f210906e1 != RefreshState.Refreshing) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.f210930p1;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.f210930p1.cancel();
                SmartRefreshLayout.this.f210930p1 = null;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.f210915j = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.f210902c1.mo155988f(RefreshState.PullDownToRefresh);
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int i = smartRefreshLayout3.f210873M0;
            float f = i == 0 ? smartRefreshLayout3.f210889U0 : i;
            float f2 = this.f210962a;
            if (f2 < 10.0f) {
                f2 *= f;
            }
            smartRefreshLayout3.f210930p1 = ValueAnimator.ofInt(smartRefreshLayout3.f210899b, (int) f2);
            SmartRefreshLayout.this.f210930p1.setDuration(this.f210963b);
            SmartRefreshLayout.this.f210930p1.setInterpolator(new rsf0(rsf0.f164661b));
            SmartRefreshLayout.this.f210930p1.addUpdateListener(new a());
            SmartRefreshLayout.this.f210930p1.addListener(new b());
            SmartRefreshLayout.this.f210930p1.start();
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$j */
    public class RunnableC22760j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f210968a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f210969b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f210970c;

        /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$j$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.f210930p1 == null || smartRefreshLayout.f210895Y0 == null) {
                    return;
                }
                smartRefreshLayout.f210902c1.mo155987e(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }

        /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$j$b */
        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.f210930p1 = null;
                    if (smartRefreshLayout.f210895Y0 == null) {
                        smartRefreshLayout.f210902c1.mo155988f(RefreshState.None);
                        return;
                    }
                    RefreshState refreshState = smartRefreshLayout.f210904d1;
                    RefreshState refreshState2 = RefreshState.ReleaseToLoad;
                    if (refreshState != refreshState2) {
                        smartRefreshLayout.f210902c1.mo155988f(refreshState2);
                    }
                    RunnableC22760j runnableC22760j = RunnableC22760j.this;
                    SmartRefreshLayout.this.setStateLoading(!runnableC22760j.f210970c);
                }
            }
        }

        public RunnableC22760j(float f, int i, boolean z) {
            this.f210968a = f;
            this.f210969b = i;
            this.f210970c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f210906e1 != RefreshState.Loading) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.f210930p1;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.f210930p1.cancel();
                SmartRefreshLayout.this.f210930p1 = null;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.f210915j = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.f210902c1.mo155988f(RefreshState.PullUpToLoad);
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int i = smartRefreshLayout3.f210877O0;
            float f = i == 0 ? smartRefreshLayout3.f210891V0 : i;
            float f2 = this.f210968a;
            if (f2 < 10.0f) {
                f2 *= f;
            }
            smartRefreshLayout3.f210930p1 = ValueAnimator.ofInt(smartRefreshLayout3.f210899b, -((int) f2));
            SmartRefreshLayout.this.f210930p1.setDuration(this.f210969b);
            SmartRefreshLayout.this.f210930p1.setInterpolator(new rsf0(rsf0.f164661b));
            SmartRefreshLayout.this.f210930p1.addUpdateListener(new a());
            SmartRefreshLayout.this.f210930p1.addListener(new b());
            SmartRefreshLayout.this.f210930p1.start();
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$k */
    public class RunnableC22761k implements Runnable {

        /* JADX INFO: renamed from: c */
        public int f210976c;

        /* JADX INFO: renamed from: f */
        public float f210979f;

        /* JADX INFO: renamed from: a */
        public int f210974a = 0;

        /* JADX INFO: renamed from: b */
        public int f210975b = 10;

        /* JADX INFO: renamed from: e */
        public float f210978e = 0.0f;

        /* JADX INFO: renamed from: d */
        public long f210977d = AnimationUtils.currentAnimationTimeMillis();

        public RunnableC22761k(float f, int i) {
            this.f210979f = f;
            this.f210976c = i;
            SmartRefreshLayout.this.f210900b1.postDelayed(this, this.f210975b);
            lvc0 lvc0Var = SmartRefreshLayout.this.f210902c1;
            if (f > 0.0f) {
                lvc0Var.mo155988f(RefreshState.PullDownToRefresh);
            } else {
                lvc0Var.mo155988f(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f210927o1 != this || smartRefreshLayout.f210904d1.isFinishing) {
                return;
            }
            if (Math.abs(smartRefreshLayout.f210899b) >= Math.abs(this.f210976c)) {
                int i = this.f210976c;
                float f = this.f210979f;
                if (i != 0) {
                    int i2 = this.f210974a + 1;
                    this.f210974a = i2;
                    this.f210979f = (float) (((double) f) * Math.pow(0.44999998807907104d, i2 * 2));
                } else {
                    int i3 = this.f210974a + 1;
                    this.f210974a = i3;
                    this.f210979f = (float) (((double) f) * Math.pow(0.8500000238418579d, i3 * 2));
                }
            } else {
                double d = this.f210979f;
                int i4 = this.f210974a + 1;
                this.f210974a = i4;
                this.f210979f = (float) (d * Math.pow(0.949999988079071d, i4 * 2));
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f2 = this.f210979f * (((jCurrentAnimationTimeMillis - this.f210977d) * 1.0f) / 1000.0f);
            if (Math.abs(f2) >= 1.0f) {
                this.f210977d = jCurrentAnimationTimeMillis;
                float f3 = this.f210978e + f2;
                this.f210978e = f3;
                SmartRefreshLayout.this.m224997C(f3);
                SmartRefreshLayout.this.f210900b1.postDelayed(this, this.f210975b);
                return;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState = smartRefreshLayout2.f210906e1;
            boolean z = refreshState.isDragging;
            if (z && refreshState.isHeader) {
                smartRefreshLayout2.f210902c1.mo155988f(RefreshState.PullDownCanceled);
            } else if (z && refreshState.isFooter) {
                smartRefreshLayout2.f210902c1.mo155988f(RefreshState.PullUpCanceled);
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.f210927o1 = null;
            if (Math.abs(smartRefreshLayout3.f210899b) >= Math.abs(this.f210976c)) {
                int iMin = Math.min(Math.max((int) rsf0.m182965i(Math.abs(SmartRefreshLayout.this.f210899b - this.f210976c)), 30), 100) * 10;
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                smartRefreshLayout4.m225009h(this.f210976c, 0, smartRefreshLayout4.f210940z, iMin);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$l */
    public class RunnableC22762l implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f210981a;

        /* JADX INFO: renamed from: d */
        public float f210984d;

        /* JADX INFO: renamed from: b */
        public int f210982b = 0;

        /* JADX INFO: renamed from: c */
        public int f210983c = 10;

        /* JADX INFO: renamed from: e */
        public float f210985e = 0.98f;

        /* JADX INFO: renamed from: f */
        public long f210986f = 0;

        /* JADX INFO: renamed from: g */
        public long f210987g = AnimationUtils.currentAnimationTimeMillis();

        public RunnableC22762l(float f) {
            this.f210984d = f;
            this.f210981a = SmartRefreshLayout.this.f210899b;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x004b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0059  */
        /* JADX WARN: Code duplicated, block: B:36:0x0065  */
        /* JADX WARN: Code duplicated, block: B:40:0x0093  */
        /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[LOOP:0: B:34:0x0061->B:48:0x00a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:52:0x008b A[SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        public Runnable m225028a() {
            SmartRefreshLayout smartRefreshLayout;
            int i;
            float fPow;
            int i2;
            int i3;
            float f;
            RefreshState refreshState;
            RefreshState refreshState2;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState3 = smartRefreshLayout2.f210904d1;
            if (refreshState3.isFinishing) {
                return null;
            }
            if (smartRefreshLayout2.f210899b != 0) {
                if (refreshState3.isOpening || (smartRefreshLayout2.f210886T && smartRefreshLayout2.f210862H && smartRefreshLayout2.f210888U && smartRefreshLayout2.m225027z(smartRefreshLayout2.f210854C))) {
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.f210904d1 == RefreshState.Loading || (smartRefreshLayout3.f210886T && smartRefreshLayout3.f210862H && smartRefreshLayout3.f210888U && smartRefreshLayout3.m225027z(smartRefreshLayout3.f210854C))) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        if (smartRefreshLayout4.f210899b >= (-smartRefreshLayout4.f210877O0)) {
                            smartRefreshLayout = SmartRefreshLayout.this;
                            if (smartRefreshLayout.f210904d1 == RefreshState.Refreshing && smartRefreshLayout.f210899b > smartRefreshLayout.f210873M0) {
                                i = SmartRefreshLayout.this.f210899b;
                                fPow = this.f210984d;
                                i2 = 0;
                                i3 = i;
                                while (i * i3 > 0) {
                                    i2++;
                                    fPow = (float) (((double) fPow) * Math.pow(this.f210985e, (this.f210983c * i2) / 10.0f));
                                    f = ((this.f210983c * 1.0f) / 1000.0f) * fPow;
                                    if (Math.abs(f) < 1.0f) {
                                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                                        refreshState = smartRefreshLayout5.f210904d1;
                                        if (!refreshState.isOpening && ((refreshState != (refreshState2 = RefreshState.Refreshing) || i3 <= smartRefreshLayout5.f210873M0) && (refreshState == refreshState2 || i3 >= (-smartRefreshLayout5.f210877O0)))) {
                                            break;
                                            break;
                                        }
                                        return null;
                                    }
                                    i3 = (int) (i3 + f);
                                }
                            }
                        } else {
                            i = SmartRefreshLayout.this.f210899b;
                            fPow = this.f210984d;
                            i2 = 0;
                            i3 = i;
                            while (i * i3 > 0) {
                                i2++;
                                fPow = (float) (((double) fPow) * Math.pow(this.f210985e, (this.f210983c * i2) / 10.0f));
                                f = ((this.f210983c * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout6.f210904d1;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i3 = (int) (i3 + f);
                            }
                        }
                    } else {
                        smartRefreshLayout = SmartRefreshLayout.this;
                        if (smartRefreshLayout.f210904d1 == RefreshState.Refreshing) {
                            i = SmartRefreshLayout.this.f210899b;
                            fPow = this.f210984d;
                            i2 = 0;
                            i3 = i;
                            while (i * i3 > 0) {
                                i2++;
                                fPow = (float) (((double) fPow) * Math.pow(this.f210985e, (this.f210983c * i2) / 10.0f));
                                f = ((this.f210983c * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout7.f210904d1;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i3 = (int) (i3 + f);
                            }
                        }
                    }
                } else {
                    i = SmartRefreshLayout.this.f210899b;
                    fPow = this.f210984d;
                    i2 = 0;
                    i3 = i;
                    while (i * i3 > 0) {
                        i2++;
                        fPow = (float) (((double) fPow) * Math.pow(this.f210985e, (this.f210983c * i2) / 10.0f));
                        f = ((this.f210983c * 1.0f) / 1000.0f) * fPow;
                        if (Math.abs(f) < 1.0f) {
                            SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                            refreshState = smartRefreshLayout8.f210904d1;
                            if (!refreshState.isOpening) {
                            }
                            return null;
                        }
                        i3 = (int) (i3 + f);
                    }
                }
            }
            this.f210986f = AnimationUtils.currentAnimationTimeMillis();
            SmartRefreshLayout.this.f210900b1.postDelayed(this, this.f210983c);
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f210927o1 != this || smartRefreshLayout.f210904d1.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = jCurrentAnimationTimeMillis - this.f210987g;
            float fPow = (float) (((double) this.f210984d) * Math.pow(this.f210985e, (jCurrentAnimationTimeMillis - this.f210986f) / (1000.0f / this.f210983c)));
            this.f210984d = fPow;
            float f = fPow * ((j * 1.0f) / 1000.0f);
            if (Math.abs(f) <= 1.0f) {
                SmartRefreshLayout.this.f210927o1 = null;
                return;
            }
            this.f210987g = jCurrentAnimationTimeMillis;
            int i = (int) (this.f210981a + f);
            this.f210981a = i;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.f210899b * i > 0) {
                smartRefreshLayout2.f210902c1.mo155987e(i, true);
                SmartRefreshLayout.this.f210900b1.postDelayed(this, this.f210983c);
                return;
            }
            smartRefreshLayout2.f210927o1 = null;
            smartRefreshLayout2.f210902c1.mo155987e(0, true);
            rsf0.m182960d(SmartRefreshLayout.this.f210896Z0.mo137317h(), (int) (-this.f210984d));
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            if (!smartRefreshLayout3.f210921l1 || f <= 0.0f) {
                return;
            }
            smartRefreshLayout3.f210921l1 = false;
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$n */
    public class C22764n implements lvc0 {
        public C22764n() {
        }

        @Override // p153l.lvc0
        /* JADX INFO: renamed from: a */
        public ValueAnimator mo155983a(int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.m225009h(i, 0, smartRefreshLayout.f210940z, smartRefreshLayout.f210907f);
        }

        @Override // p153l.lvc0
        /* JADX INFO: renamed from: b */
        public lvc0 mo155984b(@NonNull gvc0 gvc0Var, int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f210898a1 == null && i != 0) {
                smartRefreshLayout.f210898a1 = new Paint();
            }
            boolean zEquals = gvc0Var.equals(SmartRefreshLayout.this.f210894X0);
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (zEquals) {
                smartRefreshLayout2.f210910g1 = i;
                return this;
            }
            if (gvc0Var.equals(smartRefreshLayout2.f210895Y0)) {
                SmartRefreshLayout.this.f210912h1 = i;
            }
            return this;
        }

        @Override // p153l.lvc0
        @NonNull
        /* JADX INFO: renamed from: c */
        public mvc0 mo155985c() {
            return SmartRefreshLayout.this;
        }

        @Override // p153l.lvc0
        /* JADX INFO: renamed from: d */
        public lvc0 mo155986d() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f210904d1 == RefreshState.TwoLevel) {
                smartRefreshLayout.f210902c1.mo155988f(RefreshState.TwoLevelFinish);
                if (SmartRefreshLayout.this.f210899b == 0) {
                    mo155987e(0, false);
                    SmartRefreshLayout.this.m224998D(RefreshState.None);
                    return this;
                }
                mo155983a(0).setDuration(SmartRefreshLayout.this.f210905e);
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
        @Override // p153l.lvc0
        /* JADX INFO: renamed from: e */
        public lvc0 mo155987e(int i, boolean z) {
            xm50 xm50Var;
            int i2;
            int i3;
            int i4;
            xm50 xm50Var2;
            int i5;
            boolean z2;
            gvc0 gvc0Var;
            gvc0 gvc0Var2;
            gvc0 gvc0Var3;
            gvc0 gvc0Var4;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f210899b != i || (((gvc0Var3 = smartRefreshLayout.f210894X0) != null && gvc0Var3.mo132528e()) || ((gvc0Var4 = SmartRefreshLayout.this.f210895Y0) != null && gvc0Var4.mo132528e()))) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i6 = smartRefreshLayout2.f210899b;
                smartRefreshLayout2.f210899b = i;
                float f = 10.0f;
                if (z) {
                    RefreshState refreshState = smartRefreshLayout2.f210906e1;
                    if (refreshState.isDragging || refreshState.isOpening) {
                        float f2 = i;
                        float f3 = smartRefreshLayout2.f210889U0;
                        if (f3 < 10.0f) {
                            f3 *= smartRefreshLayout2.f210873M0;
                        }
                        if (f2 <= f3) {
                            float f4 = -i;
                            float f5 = smartRefreshLayout2.f210891V0;
                            if (f5 < 10.0f) {
                                f5 *= smartRefreshLayout2.f210877O0;
                            }
                            if (f4 > f5 && !smartRefreshLayout2.f210886T) {
                                smartRefreshLayout2.f210902c1.mo155988f(RefreshState.ReleaseToLoad);
                            } else if (i < 0 && !smartRefreshLayout2.f210886T) {
                                smartRefreshLayout2.f210902c1.mo155988f(RefreshState.PullUpToLoad);
                            } else if (i > 0) {
                                smartRefreshLayout2.f210902c1.mo155988f(RefreshState.PullDownToRefresh);
                            }
                        } else if (smartRefreshLayout2.f210904d1 != RefreshState.ReleaseToTwoLevel) {
                            smartRefreshLayout2.f210902c1.mo155988f(RefreshState.ReleaseToRefresh);
                        }
                    }
                }
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                if (smartRefreshLayout3.f210896Z0 != null) {
                    if (i < 0) {
                        i5 = 0;
                        z2 = false;
                    } else if (smartRefreshLayout3.m224995A(smartRefreshLayout3.f210858F, smartRefreshLayout3.f210894X0)) {
                        i5 = i;
                        z2 = true;
                    } else if (i6 < 0) {
                        z2 = true;
                        i5 = 0;
                    } else {
                        i5 = 0;
                        z2 = false;
                    }
                    if (i <= 0) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        if (smartRefreshLayout4.m224995A(smartRefreshLayout4.f210860G, smartRefreshLayout4.f210895Y0)) {
                            i5 = i;
                            z2 = true;
                        } else if (i6 > 0) {
                            z2 = true;
                            i5 = 0;
                        }
                    }
                    if (z2) {
                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                        smartRefreshLayout5.f210896Z0.mo137314e(i5, smartRefreshLayout5.f210933s, smartRefreshLayout5.f210934t);
                        SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                        if (smartRefreshLayout6.f210886T && smartRefreshLayout6.f210888U && smartRefreshLayout6.f210862H) {
                            gvc0 gvc0Var5 = smartRefreshLayout6.f210895Y0;
                            if ((gvc0Var5 instanceof jvc0) && gvc0Var5.getSpinnerStyle() == wwf0.f191267d) {
                                SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                                if (smartRefreshLayout7.m225027z(smartRefreshLayout7.f210854C)) {
                                    SmartRefreshLayout.this.f210895Y0.getView().setTranslationY(Math.max(0, i5));
                                }
                            }
                        }
                        SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                        boolean z3 = (smartRefreshLayout8.f210855D && (gvc0Var2 = smartRefreshLayout8.f210894X0) != null && gvc0Var2.getSpinnerStyle() == wwf0.f191269f) || SmartRefreshLayout.this.f210910g1 != 0;
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        boolean z4 = (smartRefreshLayout9.f210856E && (gvc0Var = smartRefreshLayout9.f210895Y0) != null && gvc0Var.getSpinnerStyle() == wwf0.f191269f) || SmartRefreshLayout.this.f210912h1 != 0;
                        if ((z3 && (i5 >= 0 || i6 > 0)) || (z4 && (i5 <= 0 || i6 < 0))) {
                            smartRefreshLayout2.invalidate();
                        }
                    }
                }
                float f6 = 1.0f;
                if ((i >= 0 || i6 > 0) && SmartRefreshLayout.this.f210894X0 != null) {
                    int iMax = Math.max(i, 0);
                    SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                    int i7 = smartRefreshLayout10.f210873M0;
                    float f7 = smartRefreshLayout10.f210885S0;
                    if (f7 < 10.0f) {
                        f7 *= i7;
                    }
                    int i8 = (int) f7;
                    float f8 = iMax * 1.0f;
                    float f9 = smartRefreshLayout10.f210889U0;
                    if (f9 < 10.0f) {
                        f9 *= i7;
                    }
                    float f10 = f8 / f9;
                    if (smartRefreshLayout10.m225027z(smartRefreshLayout10.f210853B) || (SmartRefreshLayout.this.f210904d1 == RefreshState.RefreshFinish && !z)) {
                        SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                        if (i6 != smartRefreshLayout11.f210899b) {
                            wwf0 spinnerStyle = smartRefreshLayout11.f210894X0.getSpinnerStyle();
                            wwf0 wwf0Var = wwf0.f191267d;
                            SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                            if (spinnerStyle == wwf0Var) {
                                smartRefreshLayout12.f210894X0.getView().setTranslationY(SmartRefreshLayout.this.f210899b);
                                SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                                if (smartRefreshLayout13.f210910g1 != 0 && smartRefreshLayout13.f210898a1 != null && !smartRefreshLayout13.m224995A(smartRefreshLayout13.f210858F, smartRefreshLayout13.f210894X0)) {
                                    smartRefreshLayout2.invalidate();
                                }
                            } else {
                                if (smartRefreshLayout12.f210894X0.getSpinnerStyle().f191275c) {
                                    View view = SmartRefreshLayout.this.f210894X0.getView();
                                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : SmartRefreshLayout.f210851t1;
                                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((SmartRefreshLayout.this.f210899b - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                                    int i9 = marginLayoutParams.leftMargin;
                                    int i10 = marginLayoutParams.topMargin + SmartRefreshLayout.this.f210881Q0;
                                    view.layout(i9, i10, view.getMeasuredWidth() + i9, view.getMeasuredHeight() + i10);
                                }
                                SmartRefreshLayout.this.f210894X0.mo132532l(z, f10, iMax, i7, i8);
                            }
                            SmartRefreshLayout.this.f210894X0.mo132532l(z, f10, iMax, i7, i8);
                        } else {
                            f = 10.0f;
                            f6 = 1.0f;
                        }
                        if (z && SmartRefreshLayout.this.f210894X0.mo132528e()) {
                            int i11 = (int) SmartRefreshLayout.this.f210915j;
                            int width = smartRefreshLayout2.getWidth();
                            SmartRefreshLayout smartRefreshLayout14 = SmartRefreshLayout.this;
                            smartRefreshLayout14.f210894X0.mo132527d(smartRefreshLayout14.f210915j / (width == 0 ? 1 : width), i11, width);
                        }
                    } else {
                        f = 10.0f;
                        f6 = 1.0f;
                    }
                    SmartRefreshLayout smartRefreshLayout15 = SmartRefreshLayout.this;
                    if (i6 != smartRefreshLayout15.f210899b && (xm50Var = smartRefreshLayout15.f210859F0) != null) {
                        gvc0 gvc0Var6 = smartRefreshLayout15.f210894X0;
                        if (gvc0Var6 instanceof kvc0) {
                            xm50Var.mo141454A0((kvc0) gvc0Var6, z, f10, iMax, i7, i8);
                        }
                    }
                } else {
                    f = 10.0f;
                    f6 = 1.0f;
                }
                if ((i <= 0 || i6 < 0) && SmartRefreshLayout.this.f210895Y0 != null) {
                    int i12 = -Math.min(i, 0);
                    SmartRefreshLayout smartRefreshLayout16 = SmartRefreshLayout.this;
                    int i13 = smartRefreshLayout16.f210877O0;
                    float f11 = smartRefreshLayout16.f210887T0;
                    if (f11 < f) {
                        f11 *= i13;
                    }
                    int i14 = (int) f11;
                    float f12 = i12 * f6;
                    float f13 = smartRefreshLayout16.f210891V0;
                    if (f13 < f) {
                        f13 *= i13;
                    }
                    float f14 = f12 / f13;
                    if (smartRefreshLayout16.m225027z(smartRefreshLayout16.f210854C) || (SmartRefreshLayout.this.f210904d1 == RefreshState.LoadFinish && !z)) {
                        SmartRefreshLayout smartRefreshLayout17 = SmartRefreshLayout.this;
                        if (i6 != smartRefreshLayout17.f210899b) {
                            wwf0 spinnerStyle2 = smartRefreshLayout17.f210895Y0.getSpinnerStyle();
                            wwf0 wwf0Var2 = wwf0.f191267d;
                            SmartRefreshLayout smartRefreshLayout18 = SmartRefreshLayout.this;
                            if (spinnerStyle2 == wwf0Var2) {
                                smartRefreshLayout18.f210895Y0.getView().setTranslationY(SmartRefreshLayout.this.f210899b);
                                SmartRefreshLayout smartRefreshLayout19 = SmartRefreshLayout.this;
                                if (smartRefreshLayout19.f210912h1 != 0 && smartRefreshLayout19.f210898a1 != null && !smartRefreshLayout19.m224995A(smartRefreshLayout19.f210860G, smartRefreshLayout19.f210895Y0)) {
                                    smartRefreshLayout2.invalidate();
                                }
                            } else if (smartRefreshLayout18.f210895Y0.getSpinnerStyle().f191275c) {
                                View view2 = SmartRefreshLayout.this.f210895Y0.getView();
                                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : SmartRefreshLayout.f210851t1;
                                view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(((-SmartRefreshLayout.this.f210899b) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), 1073741824));
                                int i15 = marginLayoutParams2.leftMargin;
                                int measuredHeight = (marginLayoutParams2.topMargin + smartRefreshLayout2.getMeasuredHeight()) - SmartRefreshLayout.this.f210883R0;
                                view2.layout(i15, measuredHeight - view2.getMeasuredHeight(), view2.getMeasuredWidth() + i15, measuredHeight);
                            }
                            i2 = i12;
                            i3 = i13;
                            i4 = i14;
                            SmartRefreshLayout.this.f210895Y0.mo132532l(z, f14, i2, i3, i4);
                        } else {
                            i2 = i12;
                            i3 = i13;
                            i4 = i14;
                        }
                        if (z && SmartRefreshLayout.this.f210895Y0.mo132528e()) {
                            int i16 = (int) SmartRefreshLayout.this.f210915j;
                            int width2 = smartRefreshLayout2.getWidth();
                            SmartRefreshLayout smartRefreshLayout20 = SmartRefreshLayout.this;
                            smartRefreshLayout20.f210895Y0.mo132527d(smartRefreshLayout20.f210915j / (width2 != 0 ? width2 : 1), i16, width2);
                        }
                    } else {
                        i2 = i12;
                        i3 = i13;
                        i4 = i14;
                    }
                    SmartRefreshLayout smartRefreshLayout21 = SmartRefreshLayout.this;
                    if (i6 != smartRefreshLayout21.f210899b && (xm50Var2 = smartRefreshLayout21.f210859F0) != null) {
                        gvc0 gvc0Var7 = smartRefreshLayout21.f210895Y0;
                        if (gvc0Var7 instanceof jvc0) {
                            xm50Var2.mo141459k((jvc0) gvc0Var7, z, f14, i2, i3, i4);
                        }
                    }
                }
            }
            return this;
        }

        @Override // p153l.lvc0
        /* JADX INFO: renamed from: f */
        public lvc0 mo155988f(@NonNull RefreshState refreshState) {
            switch (C22751a.f210941a[refreshState.ordinal()]) {
                case 1:
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    RefreshState refreshState2 = smartRefreshLayout.f210904d1;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.f210899b == 0) {
                        smartRefreshLayout.m224998D(refreshState3);
                    } else if (smartRefreshLayout.f210899b != 0) {
                        mo155983a(0);
                    }
                    break;
                case 2:
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout2.f210904d1.isOpening && smartRefreshLayout2.m225027z(smartRefreshLayout2.f210853B)) {
                        SmartRefreshLayout.this.m224998D(RefreshState.PullDownToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.m225027z(smartRefreshLayout3.f210854C)) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        RefreshState refreshState4 = smartRefreshLayout4.f210904d1;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!smartRefreshLayout4.f210886T || !smartRefreshLayout4.f210862H || !smartRefreshLayout4.f210888U)) {
                            smartRefreshLayout4.m224998D(RefreshState.PullUpToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout5.f210904d1.isOpening && smartRefreshLayout5.m225027z(smartRefreshLayout5.f210853B)) {
                        SmartRefreshLayout.this.m224998D(RefreshState.PullDownCanceled);
                        mo155988f(RefreshState.None);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.m225027z(smartRefreshLayout6.f210854C)) {
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        if (!smartRefreshLayout7.f210904d1.isOpening && (!smartRefreshLayout7.f210886T || !smartRefreshLayout7.f210862H || !smartRefreshLayout7.f210888U)) {
                            smartRefreshLayout7.m224998D(RefreshState.PullUpCanceled);
                            mo155988f(RefreshState.None);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpCanceled);
                    break;
                case 6:
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout8.f210904d1.isOpening && smartRefreshLayout8.m225027z(smartRefreshLayout8.f210853B)) {
                        SmartRefreshLayout.this.m224998D(RefreshState.ReleaseToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    if (smartRefreshLayout9.m225027z(smartRefreshLayout9.f210854C)) {
                        SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                        RefreshState refreshState5 = smartRefreshLayout10.f210904d1;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!smartRefreshLayout10.f210886T || !smartRefreshLayout10.f210862H || !smartRefreshLayout10.f210888U)) {
                            smartRefreshLayout10.m224998D(RefreshState.ReleaseToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout11.f210904d1.isOpening && smartRefreshLayout11.m225027z(smartRefreshLayout11.f210853B)) {
                        SmartRefreshLayout.this.m224998D(RefreshState.ReleaseToTwoLevel);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout12.f210904d1.isOpening && smartRefreshLayout12.m225027z(smartRefreshLayout12.f210853B)) {
                        SmartRefreshLayout.this.m224998D(RefreshState.RefreshReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout13.f210904d1.isOpening && smartRefreshLayout13.m225027z(smartRefreshLayout13.f210854C)) {
                        SmartRefreshLayout.this.m224998D(RefreshState.LoadReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.LoadReleased);
                    }
                    break;
                case 11:
                    SmartRefreshLayout.this.setStateRefreshing(true);
                    break;
                case 12:
                    SmartRefreshLayout.this.setStateLoading(true);
                    break;
                default:
                    SmartRefreshLayout.this.m224998D(refreshState);
                    break;
            }
            return null;
        }
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210905e = 300;
        this.f210907f = 300;
        this.f210920l = 0.5f;
        this.f210922m = 'n';
        this.f210931q = -1;
        this.f210932r = -1;
        this.f210933s = -1;
        this.f210934t = -1;
        this.f210853B = true;
        this.f210854C = false;
        this.f210855D = true;
        this.f210856E = true;
        this.f210858F = true;
        this.f210860G = true;
        this.f210862H = false;
        this.f210864I = true;
        this.f210866J = true;
        this.f210868K = false;
        this.f210870L = true;
        this.f210872M = false;
        this.f210874N = true;
        this.f210876O = true;
        this.f210878P = true;
        this.f210880Q = true;
        this.f210882R = false;
        this.f210884S = false;
        this.f210886T = false;
        this.f210888U = false;
        this.f210890V = false;
        this.f210892W = false;
        this.f210918k0 = false;
        this.f210867J0 = new int[2];
        this.f210869K0 = new bi20(this);
        this.f210871L0 = new fi20(this);
        t2e t2eVar = t2e.f171737c;
        this.f210875N0 = t2eVar;
        this.f210879P0 = t2eVar;
        this.f210885S0 = 2.5f;
        this.f210887T0 = 2.5f;
        this.f210889U0 = 1.0f;
        this.f210891V0 = 1.0f;
        this.f210893W0 = 0.16666667f;
        this.f210902c1 = new C22764n();
        RefreshState refreshState = RefreshState.None;
        this.f210904d1 = refreshState;
        this.f210906e1 = refreshState;
        this.f210908f1 = 0L;
        this.f210910g1 = 0;
        this.f210912h1 = 0;
        this.f210921l1 = false;
        this.f210923m1 = false;
        this.f210925n1 = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f210900b1 = new Handler(Looper.getMainLooper());
        this.f210938x = new Scroller(context);
        this.f210939y = VelocityTracker.obtain();
        this.f210909g = context.getResources().getDisplayMetrics().heightPixels;
        this.f210940z = new rsf0(rsf0.f164661b);
        this.f210897a = viewConfiguration.getScaledTouchSlop();
        this.f210935u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f210936v = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f210877O0 = rsf0.m182959c(60.0f);
        this.f210873M0 = rsf0.m182959c(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109759j1);
        if (!typedArrayObtainStyledAttributes.hasValue(hhc0.f109773l1)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(hhc0.f109766k1)) {
            super.setClipChildren(false);
        }
        urd urdVar = f210850s1;
        if (urdVar != null) {
            urdVar.mo197503a(context, this);
        }
        this.f210920l = typedArrayObtainStyledAttributes.getFloat(hhc0.f109801p1, this.f210920l);
        this.f210885S0 = typedArrayObtainStyledAttributes.getFloat(hhc0.f109636Q1, this.f210885S0);
        this.f210887T0 = typedArrayObtainStyledAttributes.getFloat(hhc0.f109606L1, this.f210887T0);
        this.f210889U0 = typedArrayObtainStyledAttributes.getFloat(hhc0.f109648S1, this.f210889U0);
        this.f210891V0 = typedArrayObtainStyledAttributes.getFloat(hhc0.f109618N1, this.f210891V0);
        this.f210853B = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109558E1, this.f210853B);
        this.f210907f = typedArrayObtainStyledAttributes.getInt(hhc0.f109660U1, this.f210907f);
        this.f210854C = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109857x1, this.f210854C);
        this.f210873M0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(hhc0.f109624O1, this.f210873M0);
        this.f210877O0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(hhc0.f109593J1, this.f210877O0);
        this.f210881Q0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(hhc0.f109630P1, this.f210881Q0);
        this.f210883R0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(hhc0.f109600K1, this.f210883R0);
        this.f210882R = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109794o1, this.f210882R);
        this.f210884S = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109787n1, this.f210884S);
        this.f210858F = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109850w1, this.f210858F);
        this.f210860G = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109843v1, this.f210860G);
        this.f210864I = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109544C1, this.f210864I);
        this.f210870L = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109808q1, this.f210870L);
        this.f210866J = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109530A1, this.f210866J);
        this.f210872M = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109551D1, this.f210872M);
        this.f210874N = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109565F1, this.f210874N);
        this.f210876O = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109572G1, this.f210876O);
        this.f210878P = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109864y1, this.f210878P);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109829t1, this.f210862H);
        this.f210862H = z;
        this.f210862H = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109836u1, z);
        this.f210855D = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109822s1, this.f210855D);
        this.f210856E = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109815r1, this.f210856E);
        this.f210868K = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109537B1, this.f210868K);
        this.f210931q = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109586I1, this.f210931q);
        this.f210932r = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109579H1, this.f210932r);
        this.f210933s = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109642R1, this.f210933s);
        this.f210934t = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109612M1, this.f210934t);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109871z1, this.f210880Q);
        this.f210880Q = z2;
        this.f210869K0.m104404n(z2);
        this.f210890V = this.f210890V || typedArrayObtainStyledAttributes.hasValue(hhc0.f109857x1);
        this.f210892W = this.f210892W || typedArrayObtainStyledAttributes.hasValue(hhc0.f109850w1);
        this.f210918k0 = this.f210918k0 || typedArrayObtainStyledAttributes.hasValue(hhc0.f109843v1);
        this.f210875N0 = typedArrayObtainStyledAttributes.hasValue(hhc0.f109624O1) ? t2e.f171743i : this.f210875N0;
        this.f210879P0 = typedArrayObtainStyledAttributes.hasValue(hhc0.f109593J1) ? t2e.f171743i : this.f210879P0;
        int color = typedArrayObtainStyledAttributes.getColor(hhc0.f109780m1, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(hhc0.f109654T1, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.f210852A = new int[]{color2, color};
            } else {
                this.f210852A = new int[]{color2};
            }
        } else if (color != 0) {
            this.f210852A = new int[]{0, color};
        }
        if (this.f210872M && !this.f210890V && !this.f210854C) {
            this.f210854C = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void setDefaultRefreshFooterCreator(@NonNull srd srdVar) {
        f210848q1 = srdVar;
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull trd trdVar) {
        f210849r1 = trdVar;
    }

    public static void setDefaultRefreshInitializer(@NonNull urd urdVar) {
        f210850s1 = urdVar;
    }

    /* JADX INFO: renamed from: A */
    public boolean m224995A(boolean z, @Nullable gvc0 gvc0Var) {
        return z || this.f210872M || gvc0Var == null || gvc0Var.getSpinnerStyle() == wwf0.f191269f;
    }

    /* JADX INFO: renamed from: B */
    public boolean m224996B() {
        return this.f210904d1 == RefreshState.Refreshing;
    }

    /* JADX INFO: renamed from: C */
    public void m224997C(float f) {
        RefreshState refreshState;
        float f2 = (!this.f210865I0 || this.f210878P || f >= 0.0f || this.f210896Z0.mo137316g()) ? f : 0.0f;
        if (f2 > this.f210909g * 5 && getTag() == null && getTag(vcc0.f183374J0) == null) {
            float f3 = this.f210917k;
            int i = this.f210909g;
            if (f3 < i / 6.0f && this.f210915j < i / 16.0f) {
                o1j0.m165651y("你这么死拉，臣妾做不到啊！");
                setTag(vcc0.f183374J0, "你这么死拉，臣妾做不到啊！");
            }
        }
        RefreshState refreshState2 = this.f210904d1;
        if (refreshState2 == RefreshState.TwoLevel && f2 > 0.0f) {
            this.f210902c1.mo155987e(Math.min((int) f2, getMeasuredHeight()), true);
        } else if (refreshState2 == RefreshState.Refreshing && f2 >= 0.0f) {
            int i2 = this.f210873M0;
            if (f2 < i2) {
                this.f210902c1.mo155987e((int) f2, true);
            } else {
                float f4 = this.f210885S0;
                if (f4 < 10.0f) {
                    f4 *= i2;
                }
                double d = f4 - i2;
                int iMax = Math.max((this.f210909g * 4) / 3, getHeight());
                int i3 = this.f210873M0;
                double d2 = iMax - i3;
                double dMax = Math.max(0.0f, (f2 - i3) * this.f210920l);
                double d3 = -dMax;
                if (d2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    d2 = 1.0d;
                }
                this.f210902c1.mo155987e(((int) Math.min(d * (1.0d - Math.pow(100.0d, d3 / d2)), dMax)) + this.f210873M0, true);
            }
        } else if (f2 < 0.0f && (refreshState2 == RefreshState.Loading || ((this.f210862H && this.f210886T && this.f210888U && m225027z(this.f210854C)) || (this.f210870L && !this.f210886T && m225027z(this.f210854C))))) {
            int i4 = this.f210877O0;
            if (f2 > (-i4)) {
                this.f210902c1.mo155987e((int) f2, true);
            } else {
                float f5 = this.f210887T0;
                if (f5 < 10.0f) {
                    f5 *= i4;
                }
                double d4 = f5 - i4;
                int iMax2 = Math.max((this.f210909g * 4) / 3, getHeight());
                int i5 = this.f210877O0;
                double d5 = iMax2 - i5;
                double d6 = -Math.min(0.0f, (i5 + f2) * this.f210920l);
                double d7 = -d6;
                if (d5 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    d5 = 1.0d;
                }
                this.f210902c1.mo155987e(((int) (-Math.min(d4 * (1.0d - Math.pow(100.0d, d7 / d5)), d6))) - this.f210877O0, true);
            }
        } else if (f2 >= 0.0f) {
            float f6 = this.f210885S0;
            double d8 = f6 < 10.0f ? this.f210873M0 * f6 : f6;
            double dMax2 = Math.max(this.f210909g / 2, getHeight());
            double dMax3 = Math.max(0.0f, this.f210920l * f2);
            double d9 = -dMax3;
            if (dMax2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                dMax2 = 1.0d;
            }
            this.f210902c1.mo155987e((int) Math.min(d8 * (1.0d - Math.pow(100.0d, d9 / dMax2)), dMax3), true);
        } else {
            float f7 = this.f210887T0;
            double d10 = f7 < 10.0f ? this.f210877O0 * f7 : f7;
            double dMax4 = Math.max(this.f210909g / 2, getHeight());
            double d11 = -Math.min(0.0f, this.f210920l * f2);
            double d12 = -d11;
            if (dMax4 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                dMax4 = 1.0d;
            }
            this.f210902c1.mo155987e((int) (-Math.min(d10 * (1.0d - Math.pow(100.0d, d12 / dMax4)), d11)), true);
        }
        if (!this.f210870L || this.f210886T || !m225027z(this.f210854C) || f2 >= 0.0f || (refreshState = this.f210904d1) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
            return;
        }
        if (this.f210884S) {
            this.f210927o1 = null;
            this.f210902c1.mo155983a(-this.f210877O0);
        }
        setStateDirectLoading(false);
        this.f210900b1.postDelayed(new RunnableC22756f(), this.f210907f);
    }

    /* JADX INFO: renamed from: D */
    public void m224998D(RefreshState refreshState) {
        RefreshState refreshState2 = this.f210904d1;
        if (refreshState2 == refreshState) {
            if (this.f210906e1 != refreshState2) {
                this.f210906e1 = refreshState2;
                return;
            }
            return;
        }
        this.f210904d1 = refreshState;
        this.f210906e1 = refreshState;
        gvc0 gvc0Var = this.f210894X0;
        gvc0 gvc0Var2 = this.f210895Y0;
        xm50 xm50Var = this.f210859F0;
        if (gvc0Var != null) {
            gvc0Var.mo56941f(this, refreshState2, refreshState);
        }
        if (gvc0Var2 != null) {
            gvc0Var2.mo56941f(this, refreshState2, refreshState);
        }
        if (xm50Var != null) {
            xm50Var.mo56941f(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.f210921l1 = false;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m224999E() {
        RefreshState refreshState = this.f210904d1;
        if (refreshState == RefreshState.TwoLevel) {
            if (this.f210937w <= -1000 || this.f210899b <= getHeight() / 2) {
                if (this.f210924n) {
                    this.f210902c1.mo155986d();
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimatorMo155983a = this.f210902c1.mo155983a(getHeight());
                if (valueAnimatorMo155983a != null) {
                    valueAnimatorMo155983a.setDuration(this.f210905e);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState == refreshState2 || (this.f210862H && this.f210886T && this.f210888U && this.f210899b < 0 && m225027z(this.f210854C))) {
            int i = this.f210899b;
            int i2 = this.f210877O0;
            if (i < (-i2)) {
                this.f210902c1.mo155983a(-i2);
                return;
            } else {
                if (i > 0) {
                    this.f210902c1.mo155983a(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState3 = this.f210904d1;
        RefreshState refreshState4 = RefreshState.Refreshing;
        if (refreshState3 == refreshState4) {
            int i3 = this.f210899b;
            int i4 = this.f210873M0;
            if (i3 > i4) {
                this.f210902c1.mo155983a(i4);
                return;
            } else {
                if (i3 < 0) {
                    this.f210902c1.mo155983a(0);
                    return;
                }
                return;
            }
        }
        if (refreshState3 == RefreshState.PullDownToRefresh) {
            this.f210902c1.mo155988f(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState3 == RefreshState.PullUpToLoad) {
            this.f210902c1.mo155988f(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToRefresh) {
            this.f210902c1.mo155988f(refreshState4);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToLoad) {
            this.f210902c1.mo155988f(refreshState2);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToTwoLevel) {
            this.f210902c1.mo155988f(RefreshState.TwoLevelReleased);
            return;
        }
        if (refreshState3 == RefreshState.RefreshReleased) {
            if (this.f210930p1 == null) {
                this.f210902c1.mo155983a(this.f210873M0);
            }
        } else if (refreshState3 == RefreshState.LoadReleased) {
            if (this.f210930p1 == null) {
                this.f210902c1.mo155983a(-this.f210877O0);
            }
        } else {
            if (refreshState3 == RefreshState.LoadFinish || this.f210899b == 0) {
                return;
            }
            this.f210902c1.mo155983a(0);
        }
    }

    /* JADX INFO: renamed from: F */
    public mvc0 m225000F(boolean z) {
        this.f210870L = z;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public mvc0 m225001G(boolean z) {
        this.f210890V = true;
        this.f210854C = z;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public mvc0 m225002H(boolean z) {
        this.f210878P = z;
        hvc0 hvc0Var = this.f210896Z0;
        if (hvc0Var != null) {
            hvc0Var.mo137311b(z);
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public mvc0 m225003I(boolean z) {
        this.f210853B = z;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public mvc0 m225004J(float f) {
        this.f210887T0 = f;
        gvc0 gvc0Var = this.f210895Y0;
        if (gvc0Var == null || !this.f210919k1) {
            this.f210879P0 = this.f210879P0.m188966c();
            return this;
        }
        if (f < 10.0f) {
            f *= this.f210877O0;
        }
        gvc0Var.mo132531i(this.f210902c1, this.f210877O0, (int) f);
        return this;
    }

    /* JADX INFO: renamed from: K */
    public mvc0 m225005K(float f) {
        this.f210885S0 = f;
        gvc0 gvc0Var = this.f210894X0;
        if (gvc0Var == null || !this.f210919k1) {
            this.f210875N0 = this.f210875N0.m188966c();
            return this;
        }
        if (f < 10.0f) {
            f *= this.f210873M0;
        }
        gvc0Var.mo132531i(this.f210902c1, this.f210873M0, (int) f);
        return this;
    }

    /* JADX INFO: renamed from: L */
    public mvc0 m225006L(boolean z) {
        RefreshState refreshState = this.f210904d1;
        if (refreshState == RefreshState.Refreshing && z) {
            m225025x();
            return this;
        }
        if (refreshState == RefreshState.Loading && z) {
            m225020s();
            return this;
        }
        if (this.f210886T == z) {
            return this;
        }
        this.f210886T = z;
        gvc0 gvc0Var = this.f210895Y0;
        if (!(gvc0Var instanceof jvc0)) {
            return this;
        }
        if (!((jvc0) gvc0Var).m147010b(z)) {
            this.f210888U = false;
            zzq0.m222278a("Footer:", this.f210895Y0, " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])");
            return null;
        }
        this.f210888U = true;
        if (!this.f210886T || !this.f210862H || this.f210899b <= 0 || this.f210895Y0.getSpinnerStyle() != wwf0.f191267d || !m225027z(this.f210854C) || !m224995A(this.f210853B, this.f210894X0)) {
            return this;
        }
        this.f210895Y0.getView().setTranslationY(this.f210899b);
        return this;
    }

    /* JADX INFO: renamed from: M */
    public mvc0 mo224404M(tm50 tm50Var) {
        this.f210857E0 = tm50Var;
        this.f210854C = this.f210854C || !(this.f210890V || tm50Var == null);
        return this;
    }

    /* JADX INFO: renamed from: N */
    public mvc0 m225007N(xm50 xm50Var) {
        this.f210859F0 = xm50Var;
        return this;
    }

    /* JADX INFO: renamed from: O */
    public mvc0 mo224405O(jn50 jn50Var) {
        this.f210929p0 = jn50Var;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public mvc0 mo224406P(kn50 kn50Var) {
        this.f210929p0 = kn50Var;
        this.f210857E0 = kn50Var;
        this.f210854C = this.f210854C || !(this.f210890V || kn50Var == null);
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public mvc0 mo224407Q(@NonNull jvc0 jvc0Var) {
        return mo224408R(jvc0Var, 0, 0);
    }

    /* JADX INFO: renamed from: R */
    public mvc0 mo224408R(@NonNull jvc0 jvc0Var, int i, int i2) {
        gvc0 gvc0Var;
        gvc0 gvc0Var2 = this.f210895Y0;
        if (gvc0Var2 != null) {
            super.removeView(gvc0Var2.getView());
        }
        this.f210895Y0 = jvc0Var;
        this.f210921l1 = false;
        this.f210912h1 = 0;
        this.f210888U = false;
        this.f210916j1 = false;
        this.f210879P0 = t2e.f171737c;
        this.f210854C = !this.f210890V || this.f210854C;
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -2;
        }
        C22763m c22763m = new C22763m(i, i2);
        ViewGroup.LayoutParams layoutParams = jvc0Var.getView().getLayoutParams();
        if (layoutParams instanceof C22763m) {
            c22763m = (C22763m) layoutParams;
        }
        boolean z = this.f210895Y0.getSpinnerStyle().f191274b;
        gvc0 gvc0Var3 = this.f210895Y0;
        if (z) {
            super.addView(gvc0Var3.getView(), getChildCount(), c22763m);
        } else {
            super.addView(gvc0Var3.getView(), 0, c22763m);
        }
        int[] iArr = this.f210852A;
        if (iArr != null && (gvc0Var = this.f210895Y0) != null) {
            gvc0Var.setPrimaryColors(iArr);
        }
        return this;
    }

    /* JADX INFO: renamed from: S */
    public mvc0 mo224409S(@NonNull kvc0 kvc0Var) {
        return mo224410T(kvc0Var, 0, 0);
    }

    /* JADX INFO: renamed from: T */
    public mvc0 mo224410T(@NonNull kvc0 kvc0Var, int i, int i2) {
        gvc0 gvc0Var;
        gvc0 gvc0Var2 = this.f210894X0;
        if (gvc0Var2 != null) {
            super.removeView(gvc0Var2.getView());
        }
        this.f210894X0 = kvc0Var;
        this.f210910g1 = 0;
        this.f210914i1 = false;
        this.f210875N0 = t2e.f171737c;
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -2;
        }
        C22763m c22763m = new C22763m(i, i2);
        ViewGroup.LayoutParams layoutParams = kvc0Var.getView().getLayoutParams();
        if (layoutParams instanceof C22763m) {
            c22763m = (C22763m) layoutParams;
        }
        boolean z = this.f210894X0.getSpinnerStyle().f191274b;
        gvc0 gvc0Var3 = this.f210894X0;
        if (z) {
            super.addView(gvc0Var3.getView(), getChildCount(), c22763m);
        } else {
            super.addView(gvc0Var3.getView(), 0, c22763m);
        }
        int[] iArr = this.f210852A;
        if (iArr != null && (gvc0Var = this.f210894X0) != null) {
            gvc0Var.setPrimaryColors(iArr);
        }
        return this;
    }

    /* JADX INFO: renamed from: U */
    public boolean m225008U(float f) {
        if (f == 0.0f) {
            f = this.f210937w;
        }
        if (Build.VERSION.SDK_INT > 27 && this.f210896Z0 != null) {
            getScaleY();
            View view = this.f210896Z0.getView();
            if (getScaleY() == -1.0f && view.getScaleY() == -1.0f) {
                f = -f;
            }
        }
        if (Math.abs(f) > this.f210935u) {
            int i = this.f210899b;
            if (i * f < 0.0f) {
                RefreshState refreshState = this.f210904d1;
                if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading || (i < 0 && this.f210886T)) {
                    this.f210927o1 = new RunnableC22762l(f).m225028a();
                    return true;
                }
                if (refreshState.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f < 0.0f && ((this.f210866J && (this.f210854C || this.f210868K)) || ((this.f210904d1 == RefreshState.Loading && i >= 0) || (this.f210870L && m225027z(this.f210854C))))) || (f > 0.0f && ((this.f210866J && this.f210853B) || this.f210868K || (this.f210904d1 == RefreshState.Refreshing && this.f210899b <= 0)))) {
                this.f210923m1 = false;
                this.f210938x.fling(0, 0, 0, (int) (-f), 0, 0, -2147483647, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                this.f210938x.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    @Override // p153l.mvc0
    /* JADX INFO: renamed from: a */
    public mvc0 mo160260a(boolean z) {
        setNestedScrollingEnabled(z);
        return this;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f210938x.getCurrY();
        if (this.f210938x.computeScrollOffset()) {
            int finalY = this.f210938x.getFinalY();
            if ((finalY >= 0 || !((this.f210853B || this.f210868K) && this.f210896Z0.mo137319j())) && (finalY <= 0 || !((this.f210854C || this.f210868K) && this.f210896Z0.mo137316g()))) {
                this.f210923m1 = true;
                invalidate();
            } else {
                if (this.f210923m1) {
                    Scroller scroller = this.f210938x;
                    m225010i(finalY > 0 ? -scroller.getCurrVelocity() : scroller.getCurrVelocity());
                }
                this.f210938x.forceFinished(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0163  */
    /* JADX WARN: Code duplicated, block: B:124:0x0169  */
    /* JADX WARN: Code duplicated, block: B:133:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x018b  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:152:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:163:0x01de  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:178:0x020b  */
    /* JADX WARN: Code duplicated, block: B:181:0x023a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0249  */
    /* JADX WARN: Code duplicated, block: B:194:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x0269  */
    /* JADX WARN: Code duplicated, block: B:202:0x0287  */
    /* JADX WARN: Code duplicated, block: B:205:0x028e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x0290  */
    /* JADX WARN: Code duplicated, block: B:211:0x029a  */
    /* JADX WARN: Code duplicated, block: B:215:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:219:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:226:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:229:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:232:0x030b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0313  */
    /* JADX WARN: Code duplicated, block: B:244:0x0353  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:96:0x0105  */
    /* JADX WARN: Code duplicated, block: B:98:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dc, code lost:
    
        if (r2.isFooter != false) goto L247;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RefreshState refreshState;
        RefreshState refreshState2;
        hvc0 hvc0Var;
        MotionEvent motionEvent2;
        float f;
        float f2;
        int i;
        RefreshState refreshState3;
        long eventTime;
        MotionEvent motionEventObtain;
        RefreshState refreshState4;
        char c;
        int i2;
        RefreshState refreshState5;
        ViewParent parent;
        RefreshState refreshState6;
        gvc0 gvc0Var;
        gvc0 gvc0Var2;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 0;
        boolean z = actionMasked == 6;
        int actionIndex = z ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (actionIndex != i4) {
                x += motionEvent.getX(i4);
                y += motionEvent.getY(i4);
            }
        }
        if (z) {
            pointerCount--;
        }
        float f3 = pointerCount;
        float f4 = x / f3;
        float f5 = y / f3;
        if ((actionMasked == 6 || actionMasked == 5) && this.f210924n) {
            this.f210913i += f5 - this.f210917k;
        }
        this.f210915j = f4;
        this.f210917k = f5;
        if (this.f210865I0) {
            int i5 = this.f210863H0;
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked == 2 && i5 == this.f210863H0) {
                int i6 = (int) this.f210915j;
                int width = getWidth();
                float f6 = this.f210915j / (width != 0 ? width : 1);
                if (m225027z(this.f210853B) && this.f210899b > 0 && (gvc0Var2 = this.f210894X0) != null && gvc0Var2.mo132528e()) {
                    this.f210894X0.mo132527d(f6, i6, width);
                    return zDispatchTouchEvent;
                }
                if (m225027z(this.f210854C) && this.f210899b < 0 && (gvc0Var = this.f210895Y0) != null && gvc0Var.mo132528e()) {
                    this.f210895Y0.mo132527d(f6, i6, width);
                }
            }
            return zDispatchTouchEvent;
        }
        if (isEnabled() && (this.f210853B || this.f210854C || this.f210868K)) {
            if (!this.f210914i1) {
                if (this.f210916j1) {
                    refreshState6 = this.f210904d1;
                    if (refreshState6.isOpening) {
                        if (refreshState6.isFinishing) {
                        }
                    }
                }
                if (!m225026y(actionMasked)) {
                    refreshState = this.f210904d1;
                    if (!refreshState.isFinishing) {
                        if (actionMasked != 0) {
                            this.f210937w = 0;
                            this.f210939y.addMovement(motionEvent);
                            this.f210938x.forceFinished(true);
                            this.f210911h = f4;
                            this.f210913i = f5;
                            this.f210901c = 0;
                            this.f210903d = this.f210899b;
                            this.f210924n = false;
                            this.f210928p = false;
                            this.f210926o = super.dispatchTouchEvent(motionEvent);
                            if (this.f210904d1 != RefreshState.TwoLevel) {
                            }
                            hvc0Var = this.f210896Z0;
                            if (hvc0Var != null) {
                                hvc0Var.mo137310a(motionEvent);
                            }
                            return true;
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                f = f4 - this.f210911h;
                                f2 = f5 - this.f210913i;
                                this.f210939y.addMovement(motionEvent);
                                if (!this.f210924n) {
                                    if (c != 'v') {
                                        this.f210922m = 'v';
                                        if (f2 <= 0.0f) {
                                            if (f2 < 0.0f) {
                                                this.f210924n = true;
                                                this.f210913i = this.f210897a + f5;
                                            }
                                        } else if (f2 < 0.0f) {
                                            this.f210924n = true;
                                            this.f210913i = this.f210897a + f5;
                                        }
                                        if (this.f210924n) {
                                            f2 = f5 - this.f210913i;
                                            if (this.f210926o) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            lvc0 lvc0Var = this.f210902c1;
                                            i2 = this.f210899b;
                                            if (i2 <= 0) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            }
                                            lvc0Var.mo155988f(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    } else {
                                        this.f210922m = 'v';
                                        if (f2 <= 0.0f) {
                                            if (f2 < 0.0f) {
                                                this.f210924n = true;
                                                this.f210913i = this.f210897a + f5;
                                            }
                                        } else if (f2 < 0.0f) {
                                            this.f210924n = true;
                                            this.f210913i = this.f210897a + f5;
                                        }
                                        if (this.f210924n) {
                                            f2 = f5 - this.f210913i;
                                            if (this.f210926o) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            lvc0 lvc0Var2 = this.f210902c1;
                                            i2 = this.f210899b;
                                            if (i2 <= 0) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            }
                                            lvc0Var2.mo155988f(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.f210924n) {
                                    i = ((int) f2) + this.f210903d;
                                    refreshState3 = this.f210906e1;
                                    if (refreshState3.isHeader) {
                                        this.f210901c = i;
                                        eventTime = motionEvent.getEventTime();
                                        if (this.f210925n1 == null) {
                                            MotionEvent motionEventObtain2 = MotionEvent.obtain(eventTime, eventTime, 0, this.f210911h + f, this.f210913i, 0);
                                            this.f210925n1 = motionEventObtain2;
                                            super.dispatchTouchEvent(motionEventObtain2);
                                        }
                                        motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.f210911h + f, this.f210913i + i, 0);
                                        super.dispatchTouchEvent(motionEventObtain);
                                        if (this.f210921l1) {
                                            this.f210921l1 = false;
                                        }
                                        if (i <= 0) {
                                            if (i < 0) {
                                                i3 = i;
                                            } else {
                                                i3 = i;
                                            }
                                        } else if (i < 0) {
                                            i3 = i;
                                        } else {
                                            i3 = i;
                                        }
                                        refreshState4 = this.f210906e1;
                                        if (!refreshState4.isHeader) {
                                            if (this.f210925n1 != null) {
                                                this.f210925n1 = null;
                                                motionEventObtain.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            motionEventObtain.recycle();
                                            i = i3;
                                        } else {
                                            if (this.f210925n1 != null) {
                                                this.f210925n1 = null;
                                                motionEventObtain.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            motionEventObtain.recycle();
                                            i = i3;
                                        }
                                        if (this.f210899b != 0) {
                                            m224997C(0.0f);
                                        }
                                        return true;
                                    }
                                    this.f210901c = i;
                                    eventTime = motionEvent.getEventTime();
                                    if (this.f210925n1 == null) {
                                        MotionEvent motionEventObtain3 = MotionEvent.obtain(eventTime, eventTime, 0, this.f210911h + f, this.f210913i, 0);
                                        this.f210925n1 = motionEventObtain3;
                                        super.dispatchTouchEvent(motionEventObtain3);
                                    }
                                    motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.f210911h + f, this.f210913i + i, 0);
                                    super.dispatchTouchEvent(motionEventObtain);
                                    if (this.f210921l1) {
                                        this.f210921l1 = false;
                                    }
                                    if (i <= 0) {
                                        if (i < 0) {
                                            i3 = i;
                                        } else {
                                            i3 = i;
                                        }
                                    } else if (i < 0) {
                                        i3 = i;
                                    } else {
                                        i3 = i;
                                    }
                                    refreshState4 = this.f210906e1;
                                    if (!refreshState4.isHeader) {
                                        if (this.f210925n1 != null) {
                                            this.f210925n1 = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i = i3;
                                    } else {
                                        if (this.f210925n1 != null) {
                                            this.f210925n1 = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i = i3;
                                    }
                                    if (this.f210899b != 0) {
                                        m224997C(0.0f);
                                    }
                                    return true;
                                    m224997C(i);
                                    return true;
                                }
                                if (this.f210921l1) {
                                    this.f210921l1 = false;
                                }
                            } else if (actionMasked == 3) {
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        this.f210939y.addMovement(motionEvent);
                        this.f210939y.computeCurrentVelocity(1000, this.f210936v);
                        this.f210937w = (int) this.f210939y.getYVelocity();
                        m225008U(0.0f);
                        this.f210939y.clear();
                        this.f210922m = 'n';
                        motionEvent2 = this.f210925n1;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.f210925n1 = null;
                            long eventTime2 = motionEvent.getEventTime();
                            MotionEvent motionEventObtain4 = MotionEvent.obtain(eventTime2, eventTime2, actionMasked, this.f210911h, f5, 0);
                            super.dispatchTouchEvent(motionEventObtain4);
                            motionEventObtain4.recycle();
                        }
                        m224999E();
                        if (this.f210924n) {
                            this.f210924n = false;
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                return false;
            }
            RefreshState refreshState7 = this.f210904d1;
            if ((!refreshState7.isOpening && !refreshState7.isFinishing) || !refreshState7.isHeader) {
                if (this.f210916j1) {
                    refreshState6 = this.f210904d1;
                    if (refreshState6.isOpening) {
                        if (refreshState6.isFinishing) {
                        }
                    }
                }
                if (!m225026y(actionMasked)) {
                    refreshState = this.f210904d1;
                    if (!refreshState.isFinishing && ((refreshState != (refreshState2 = RefreshState.Loading) || !this.f210884S) && (refreshState != RefreshState.Refreshing || !this.f210882R))) {
                        if (actionMasked != 0) {
                            this.f210937w = 0;
                            this.f210939y.addMovement(motionEvent);
                            this.f210938x.forceFinished(true);
                            this.f210911h = f4;
                            this.f210913i = f5;
                            this.f210901c = 0;
                            this.f210903d = this.f210899b;
                            this.f210924n = false;
                            this.f210928p = false;
                            this.f210926o = super.dispatchTouchEvent(motionEvent);
                            if (this.f210904d1 != RefreshState.TwoLevel && this.f210913i < getMeasuredHeight() * (1.0f - this.f210893W0)) {
                                this.f210922m = 'h';
                                return this.f210926o;
                            }
                            hvc0Var = this.f210896Z0;
                            if (hvc0Var != null) {
                                hvc0Var.mo137310a(motionEvent);
                            }
                            return true;
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                f = f4 - this.f210911h;
                                f2 = f5 - this.f210913i;
                                this.f210939y.addMovement(motionEvent);
                                if (!this.f210924n && !this.f210928p && (c = this.f210922m) != 'h' && this.f210896Z0 != null) {
                                    if (c != 'v' || (Math.abs(f2) >= this.f210897a && Math.abs(f) < Math.abs(f2))) {
                                        this.f210922m = 'v';
                                        if (f2 <= 0.0f && (this.f210899b < 0 || ((this.f210868K || this.f210853B) && this.f210896Z0.mo137319j()))) {
                                            this.f210924n = true;
                                            this.f210913i = f5 - this.f210897a;
                                        } else if (f2 < 0.0f && (this.f210899b > 0 || ((this.f210868K || this.f210854C) && ((this.f210904d1 == refreshState2 && this.f210921l1) || this.f210896Z0.mo137316g())))) {
                                            this.f210924n = true;
                                            this.f210913i = this.f210897a + f5;
                                        }
                                        if (this.f210924n) {
                                            f2 = f5 - this.f210913i;
                                            if (this.f210926o) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            lvc0 lvc0Var3 = this.f210902c1;
                                            i2 = this.f210899b;
                                            if (i2 <= 0 || (i2 == 0 && f2 > 0.0f)) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullUpToLoad;
                                            }
                                            lvc0Var3.mo155988f(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    } else if (Math.abs(f) >= this.f210897a && Math.abs(f) > Math.abs(f2) && this.f210922m != 'v') {
                                        this.f210922m = 'h';
                                    }
                                }
                                if (this.f210924n) {
                                    i = ((int) f2) + this.f210903d;
                                    refreshState3 = this.f210906e1;
                                    if ((refreshState3.isHeader && (i < 0 || this.f210901c < 0)) || (refreshState3.isFooter && (i > 0 || this.f210901c > 0))) {
                                        this.f210901c = i;
                                        eventTime = motionEvent.getEventTime();
                                        if (this.f210925n1 == null) {
                                            MotionEvent motionEventObtain5 = MotionEvent.obtain(eventTime, eventTime, 0, this.f210911h + f, this.f210913i, 0);
                                            this.f210925n1 = motionEventObtain5;
                                            super.dispatchTouchEvent(motionEventObtain5);
                                        }
                                        motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.f210911h + f, this.f210913i + i, 0);
                                        super.dispatchTouchEvent(motionEventObtain);
                                        if (this.f210921l1 && f2 > this.f210897a && this.f210899b < 0) {
                                            this.f210921l1 = false;
                                        }
                                        if (i <= 0 && ((this.f210868K || this.f210853B) && this.f210896Z0.mo137319j())) {
                                            this.f210917k = f5;
                                            this.f210913i = f5;
                                            this.f210903d = 0;
                                            this.f210902c1.mo155988f(RefreshState.PullDownToRefresh);
                                        } else if (i < 0 || !((this.f210868K || this.f210854C) && this.f210896Z0.mo137316g())) {
                                            i3 = i;
                                        } else {
                                            this.f210917k = f5;
                                            this.f210913i = f5;
                                            this.f210903d = 0;
                                            this.f210902c1.mo155988f(RefreshState.PullUpToLoad);
                                        }
                                        refreshState4 = this.f210906e1;
                                        if ((!refreshState4.isHeader && i3 < 0) || (refreshState4.isFooter && i3 > 0)) {
                                            if (this.f210899b != 0) {
                                                m224997C(0.0f);
                                            }
                                            return true;
                                        }
                                        if (this.f210925n1 != null) {
                                            this.f210925n1 = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i = i3;
                                    }
                                    m224997C(i);
                                    return true;
                                }
                                if (this.f210921l1 && f2 > this.f210897a && this.f210899b < 0) {
                                    this.f210921l1 = false;
                                }
                            } else if (actionMasked == 3) {
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        this.f210939y.addMovement(motionEvent);
                        this.f210939y.computeCurrentVelocity(1000, this.f210936v);
                        this.f210937w = (int) this.f210939y.getYVelocity();
                        m225008U(0.0f);
                        this.f210939y.clear();
                        this.f210922m = 'n';
                        motionEvent2 = this.f210925n1;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.f210925n1 = null;
                            long eventTime3 = motionEvent.getEventTime();
                            MotionEvent motionEventObtain6 = MotionEvent.obtain(eventTime3, eventTime3, actionMasked, this.f210911h, f5, 0);
                            super.dispatchTouchEvent(motionEventObtain6);
                            motionEventObtain6.recycle();
                        }
                        m224999E();
                        if (this.f210924n) {
                            this.f210924n = false;
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Paint paint;
        Paint paint2;
        hvc0 hvc0Var = this.f210896Z0;
        View view2 = hvc0Var != null ? hvc0Var.getView() : null;
        gvc0 gvc0Var = this.f210894X0;
        if (gvc0Var != null && gvc0Var.getView() == view) {
            if (!m225027z(this.f210853B) || (!this.f210864I && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getTop() + view2.getPaddingTop() + this.f210899b, view.getTop());
                int i = this.f210910g1;
                if (i != 0 && (paint2 = this.f210898a1) != null) {
                    paint2.setColor(i);
                    if (this.f210894X0.getSpinnerStyle().f191275c) {
                        iMax = view.getBottom();
                    } else if (this.f210894X0.getSpinnerStyle() == wwf0.f191267d) {
                        iMax = view.getBottom() + this.f210899b;
                    }
                    int i2 = iMax;
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), i2, this.f210898a1);
                    iMax = i2;
                }
                if ((this.f210855D && this.f210894X0.getSpinnerStyle() == wwf0.f191269f) || this.f210894X0.getSpinnerStyle().f191275c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        gvc0 gvc0Var2 = this.f210895Y0;
        if (gvc0Var2 != null && gvc0Var2.getView() == view) {
            if (!m225027z(this.f210854C) || (!this.f210864I && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f210899b, view.getBottom());
                int i3 = this.f210912h1;
                if (i3 != 0 && (paint = this.f210898a1) != null) {
                    paint.setColor(i3);
                    if (this.f210895Y0.getSpinnerStyle().f191275c) {
                        iMin = view.getTop();
                    } else if (this.f210895Y0.getSpinnerStyle() == wwf0.f191267d) {
                        iMin = view.getTop() + this.f210899b;
                    }
                    int i4 = iMin;
                    canvas.drawRect(0.0f, i4, getWidth(), view.getBottom(), this.f210898a1);
                    iMin = i4;
                }
                if ((this.f210856E && this.f210895Y0.getSpinnerStyle() == wwf0.f191269f) || this.f210895Y0.getSpinnerStyle().f191275c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), iMin, view.getRight(), view.getBottom());
                    boolean zDrawChild2 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C22763m(getContext(), attributeSet);
    }

    @Override // p153l.mvc0
    @NonNull
    public ViewGroup getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f210871L0.m125663a();
    }

    @Nullable
    public jvc0 getRefreshFooter() {
        gvc0 gvc0Var = this.f210895Y0;
        if (gvc0Var instanceof jvc0) {
            return (jvc0) gvc0Var;
        }
        return null;
    }

    @Nullable
    public kvc0 getRefreshHeader() {
        gvc0 gvc0Var = this.f210894X0;
        if (gvc0Var instanceof kvc0) {
            return (kvc0) gvc0Var;
        }
        return null;
    }

    @NonNull
    public RefreshState getState() {
        return this.f210904d1;
    }

    /* JADX INFO: renamed from: h */
    public ValueAnimator m225009h(int i, int i2, Interpolator interpolator, int i3) {
        if (this.f210899b == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.f210930p1;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.f210930p1.cancel();
            this.f210930p1 = null;
        }
        this.f210927o1 = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f210899b, i);
        this.f210930p1 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i3);
        this.f210930p1.setInterpolator(interpolator);
        this.f210930p1.addListener(new C22754d());
        this.f210930p1.addUpdateListener(new C22755e());
        this.f210930p1.setStartDelay(i2);
        this.f210930p1.start();
        return this.f210930p1;
    }

    /* JADX INFO: renamed from: i */
    public void m225010i(float f) {
        RefreshState refreshState;
        if (this.f210930p1 == null) {
            if (f > 0.0f && ((refreshState = this.f210904d1) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                this.f210927o1 = new RunnableC22761k(f, this.f210873M0);
                return;
            }
            if (f < 0.0f && (this.f210904d1 == RefreshState.Loading || ((this.f210862H && this.f210886T && this.f210888U && m225027z(this.f210854C)) || (this.f210870L && !this.f210886T && m225027z(this.f210854C) && this.f210904d1 != RefreshState.Refreshing)))) {
                this.f210927o1 = new RunnableC22761k(f, -this.f210877O0);
            } else if (this.f210899b == 0 && this.f210866J) {
                this.f210927o1 = new RunnableC22761k(f, 0);
            }
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        if (this.f210880Q) {
            return this.f210868K || this.f210853B || this.f210854C;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean m225011j(int i, int i2, float f, boolean z) {
        if (this.f210904d1 != RefreshState.None || !m225027z(this.f210854C) || this.f210886T) {
            return false;
        }
        RunnableC22760j runnableC22760j = new RunnableC22760j(f, i2, z);
        setViceState(RefreshState.Loading);
        if (i > 0) {
            this.f210900b1.postDelayed(runnableC22760j, i);
            return true;
        }
        runnableC22760j.run();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public boolean m225012k() {
        return m225011j(0, this.f210907f, (this.f210887T0 + this.f210891V0) / 2.0f, true);
    }

    /* JADX INFO: renamed from: l */
    public boolean m225013l() {
        return m225014m(this.f210919k1 ? 0 : 400, this.f210907f, (this.f210885S0 + this.f210889U0) / 2.0f, false);
    }

    /* JADX INFO: renamed from: m */
    public boolean m225014m(int i, int i2, float f, boolean z) {
        if (this.f210904d1 != RefreshState.None || !m225027z(this.f210853B)) {
            return false;
        }
        this.f210896Z0.mo137318i();
        RunnableC22759i runnableC22759i = new RunnableC22759i(f, i2, z);
        setViceState(RefreshState.Refreshing);
        if (i > 0) {
            this.f210900b1.postDelayed(runnableC22759i, i);
            return true;
        }
        runnableC22759i.run();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m225015n() {
        return m225014m(this.f210919k1 ? 0 : 400, this.f210907f, (this.f210885S0 + this.f210889U0) / 2.0f, true);
    }

    /* JADX INFO: renamed from: o */
    public mvc0 m225016o() {
        return m225019r(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        gvc0 gvc0Var;
        trd trdVar;
        super.onAttachedToWindow();
        boolean z = true;
        this.f210919k1 = true;
        if (!isInEditMode()) {
            if (this.f210894X0 == null && (trdVar = f210849r1) != null) {
                kvc0 kvc0VarMo192470a = trdVar.mo192470a(getContext(), this);
                if (kvc0VarMo192470a == null) {
                    azk0.m101074a("DefaultRefreshHeaderCreator can not return null");
                    return;
                }
                mo224409S(kvc0VarMo192470a);
            }
            if (this.f210895Y0 == null) {
                srd srdVar = f210848q1;
                if (srdVar != null) {
                    jvc0 jvc0VarMo187594a = srdVar.mo187594a(getContext(), this);
                    if (jvc0VarMo187594a == null) {
                        azk0.m101074a("DefaultRefreshFooterCreator can not return null");
                        return;
                    }
                    mo224407Q(jvc0VarMo187594a);
                }
            } else {
                if (!this.f210854C && this.f210890V) {
                    z = false;
                }
                this.f210854C = z;
            }
            if (this.f210896Z0 == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    gvc0 gvc0Var2 = this.f210894X0;
                    if ((gvc0Var2 == null || childAt != gvc0Var2.getView()) && ((gvc0Var = this.f210895Y0) == null || childAt != gvc0Var.getView())) {
                        this.f210896Z0 = new ivc0(childAt);
                    }
                }
            }
            if (this.f210896Z0 == null) {
                int iM182959c = rsf0.m182959c(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText("The content view in SmartRefreshLayout is empty");
                super.addView(textView, 0, new C22763m(-1, -1));
                ivc0 ivc0Var = new ivc0(textView);
                this.f210896Z0 = ivc0Var;
                ivc0Var.getView().setPadding(iM182959c, iM182959c, iM182959c, iM182959c);
            }
            View viewFindViewById = findViewById(this.f210931q);
            View viewFindViewById2 = findViewById(this.f210932r);
            this.f210896Z0.mo137315f(this.f210861G0);
            this.f210896Z0.mo137311b(this.f210878P);
            this.f210896Z0.mo137313d(this.f210902c1, viewFindViewById, viewFindViewById2);
            if (this.f210899b != 0) {
                m224998D(RefreshState.None);
                hvc0 hvc0Var = this.f210896Z0;
                this.f210899b = 0;
                hvc0Var.mo137314e(0, this.f210933s, this.f210934t);
            }
        }
        int[] iArr = this.f210852A;
        if (iArr != null) {
            gvc0 gvc0Var3 = this.f210894X0;
            if (gvc0Var3 != null) {
                gvc0Var3.setPrimaryColors(iArr);
            }
            gvc0 gvc0Var4 = this.f210895Y0;
            if (gvc0Var4 != null) {
                gvc0Var4.setPrimaryColors(this.f210852A);
            }
        }
        hvc0 hvc0Var2 = this.f210896Z0;
        if (hvc0Var2 != null) {
            super.bringChildToFront(hvc0Var2.getView());
        }
        gvc0 gvc0Var5 = this.f210894X0;
        if (gvc0Var5 != null && gvc0Var5.getSpinnerStyle().f191274b) {
            super.bringChildToFront(this.f210894X0.getView());
        }
        gvc0 gvc0Var6 = this.f210895Y0;
        if (gvc0Var6 == null || !gvc0Var6.getSpinnerStyle().f191274b) {
            return;
        }
        super.bringChildToFront(this.f210895Y0.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f210919k1 = false;
        this.f210890V = true;
        this.f210927o1 = null;
        ValueAnimator valueAnimator = this.f210930p1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f210930p1.removeAllUpdateListeners();
            this.f210930p1.setDuration(0L);
            this.f210930p1.cancel();
            this.f210930p1 = null;
        }
        gvc0 gvc0Var = this.f210894X0;
        if (gvc0Var != null && this.f210904d1 == RefreshState.Refreshing) {
            gvc0Var.mo132530h(this, false);
        }
        gvc0 gvc0Var2 = this.f210895Y0;
        if (gvc0Var2 != null && this.f210904d1 == RefreshState.Loading) {
            gvc0Var2.mo132530h(this, false);
        }
        if (this.f210899b != 0) {
            this.f210902c1.mo155987e(0, true);
        }
        RefreshState refreshState = this.f210904d1;
        RefreshState refreshState2 = RefreshState.None;
        if (refreshState != refreshState2) {
            m224998D(refreshState2);
        }
        Handler handler = this.f210900b1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f210921l1 = false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        int i;
        int i2;
        super.onFinishInflate();
        int childCount = super.getChildCount();
        if (childCount > 3) {
            azk0.m101074a("最多只支持3个子View，Most only support three sub view");
            return;
        }
        int i3 = -1;
        int i4 = 0;
        char c = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = super.getChildAt(i4);
            if (rsf0.m182961e(childAt) && (c < 2 || i4 == 1)) {
                i3 = i4;
                c = 2;
            } else if (!(childAt instanceof gvc0) && c < 1) {
                c = i4 > 0 ? (char) 1 : (char) 0;
                i3 = i4;
            }
            i4++;
        }
        if (i3 >= 0) {
            this.f210896Z0 = new ivc0(super.getChildAt(i3));
            if (i3 == 1) {
                i2 = childCount != 3 ? -1 : 2;
                i = 0;
            } else if (childCount == 2) {
                i = -1;
                i2 = 1;
            } else {
                i = -1;
                i2 = -1;
            }
        } else {
            i = -1;
            i2 = -1;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = super.getChildAt(i5);
            if (i5 == i || (i5 != i2 && i == -1 && this.f210894X0 == null && (childAt2 instanceof kvc0))) {
                this.f210894X0 = childAt2 instanceof kvc0 ? (kvc0) childAt2 : new RefreshHeaderWrapper(childAt2);
            } else if (i5 == i2 || (i2 == -1 && (childAt2 instanceof jvc0))) {
                this.f210854C = this.f210854C || !this.f210890V;
                this.f210895Y0 = childAt2 instanceof jvc0 ? (jvc0) childAt2 : new RefreshFooterWrapper(childAt2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = super.getChildAt(i5);
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(vcc0.f183374J0))) {
                hvc0 hvc0Var = this.f210896Z0;
                if (hvc0Var != null && hvc0Var.getView() == childAt) {
                    boolean z2 = isInEditMode() && this.f210864I && m225027z(this.f210853B) && this.f210894X0 != null;
                    View view = this.f210896Z0.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f210851t1;
                    int i6 = marginLayoutParams.leftMargin + paddingLeft;
                    int i7 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i6;
                    int measuredHeight = view.getMeasuredHeight() + i7;
                    if (z2 && m224995A(this.f210858F, this.f210894X0)) {
                        int i8 = this.f210873M0;
                        i7 += i8;
                        measuredHeight += i8;
                    }
                    view.layout(i6, i7, measuredWidth, measuredHeight);
                }
                gvc0 gvc0Var = this.f210894X0;
                if (gvc0Var != null && gvc0Var.getView() == childAt) {
                    boolean z3 = isInEditMode() && this.f210864I && m225027z(this.f210853B);
                    View view2 = this.f210894X0.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : f210851t1;
                    int i9 = marginLayoutParams2.leftMargin;
                    int i10 = marginLayoutParams2.topMargin + this.f210881Q0;
                    int measuredWidth2 = view2.getMeasuredWidth() + i9;
                    int measuredHeight2 = view2.getMeasuredHeight() + i10;
                    if (!z3 && this.f210894X0.getSpinnerStyle() == wwf0.f191267d) {
                        int i11 = this.f210873M0;
                        i10 -= i11;
                        measuredHeight2 -= i11;
                    }
                    view2.layout(i9, i10, measuredWidth2, measuredHeight2);
                }
                gvc0 gvc0Var2 = this.f210895Y0;
                if (gvc0Var2 != null && gvc0Var2.getView() == childAt) {
                    boolean z4 = isInEditMode() && this.f210864I && m225027z(this.f210854C);
                    View view3 = this.f210895Y0.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : f210851t1;
                    wwf0 spinnerStyle = this.f210895Y0.getSpinnerStyle();
                    int i12 = marginLayoutParams3.leftMargin;
                    int measuredHeight3 = (marginLayoutParams3.topMargin + getMeasuredHeight()) - this.f210883R0;
                    if (this.f210886T && this.f210888U && this.f210862H && this.f210896Z0 != null && this.f210895Y0.getSpinnerStyle() == wwf0.f191267d && m225027z(this.f210854C)) {
                        View view4 = this.f210896Z0.getView();
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0);
                    }
                    if (spinnerStyle == wwf0.f191271h) {
                        measuredHeight3 = marginLayoutParams3.topMargin - this.f210883R0;
                    } else {
                        if (z4 || spinnerStyle == wwf0.f191270g || spinnerStyle == wwf0.f191269f) {
                            iMax = this.f210877O0;
                        } else if (spinnerStyle.f191275c && this.f210899b < 0) {
                            iMax = Math.max(m225027z(this.f210854C) ? -this.f210899b : 0, 0);
                        }
                        measuredHeight3 -= iMax;
                    }
                    view3.layout(i12, measuredHeight3, view3.getMeasuredWidth() + i12, view3.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2 = isInEditMode() && this.f210864I;
        int childCount = super.getChildCount();
        int i7 = 0;
        int measuredWidth = 0;
        int measuredHeight = 0;
        while (i7 < childCount) {
            View childAt = super.getChildAt(i7);
            if (childAt.getVisibility() == 8 || "GONE".equals(childAt.getTag(vcc0.f183374J0))) {
                z = z2;
            } else {
                gvc0 gvc0Var = this.f210894X0;
                if (gvc0Var == null || gvc0Var.getView() != childAt) {
                    z = z2;
                    f = 10.0f;
                } else {
                    View view = this.f210894X0.getView();
                    f = 10.0f;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f210851t1;
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, layoutParams.width);
                    int iMax = this.f210873M0;
                    t2e t2eVar = this.f210875N0;
                    z = z2;
                    if (t2eVar.f171750a < t2e.f171743i.f171750a) {
                        int i8 = layoutParams.height;
                        if (i8 > 0) {
                            int i9 = i8 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                            t2e t2eVar2 = t2e.f171741g;
                            if (t2eVar.m188964a(t2eVar2)) {
                                this.f210873M0 = layoutParams.height + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                this.f210875N0 = t2eVar2;
                            }
                            iMax = i9;
                        } else if (i8 == -2 && (this.f210894X0.getSpinnerStyle() != wwf0.f191271h || !this.f210875N0.f171751b)) {
                            int iMax2 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0);
                            view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax2, Integer.MIN_VALUE));
                            int measuredHeight2 = view.getMeasuredHeight();
                            if (measuredHeight2 > 0) {
                                if (measuredHeight2 != iMax2) {
                                    t2e t2eVar3 = this.f210875N0;
                                    t2e t2eVar4 = t2e.f171739e;
                                    if (t2eVar3.m188964a(t2eVar4)) {
                                        this.f210873M0 = measuredHeight2 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                        this.f210875N0 = t2eVar4;
                                    }
                                }
                                iMax = -1;
                            }
                        }
                    }
                    if (this.f210894X0.getSpinnerStyle() == wwf0.f191271h) {
                        iMax = View.MeasureSpec.getSize(i2);
                        i6 = -1;
                        i5 = 0;
                    } else {
                        if (!this.f210894X0.getSpinnerStyle().f191275c || z) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            iMax = Math.max(0, m225027z(this.f210853B) ? this.f210899b : 0);
                        }
                        i6 = -1;
                    }
                    if (iMax != i6) {
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((iMax - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, i5), 1073741824));
                    }
                    t2e t2eVar5 = this.f210875N0;
                    if (!t2eVar5.f171751b) {
                        float f2 = this.f210885S0;
                        if (f2 < 10.0f) {
                            f2 *= this.f210873M0;
                        }
                        this.f210875N0 = t2eVar5.m188965b();
                        this.f210894X0.mo132531i(this.f210902c1, this.f210873M0, (int) f2);
                    }
                    if (z && m225027z(this.f210853B)) {
                        measuredWidth += view.getMeasuredWidth();
                        measuredHeight += view.getMeasuredHeight();
                    }
                }
                gvc0 gvc0Var2 = this.f210895Y0;
                if (gvc0Var2 == null || gvc0Var2.getView() != childAt) {
                    i3 = 0;
                } else {
                    View view2 = this.f210895Y0.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : f210851t1;
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, layoutParams2.width);
                    int iMax3 = this.f210877O0;
                    t2e t2eVar6 = this.f210879P0;
                    if (t2eVar6.f171750a < t2e.f171743i.f171750a) {
                        int i10 = layoutParams2.height;
                        if (i10 > 0) {
                            iMax3 = marginLayoutParams2.bottomMargin + i10 + marginLayoutParams2.topMargin;
                            t2e t2eVar7 = t2e.f171741g;
                            if (t2eVar6.m188964a(t2eVar7)) {
                                this.f210877O0 = layoutParams2.height + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                this.f210879P0 = t2eVar7;
                            }
                        } else if (i10 == -2 && (this.f210895Y0.getSpinnerStyle() != wwf0.f191271h || !this.f210879P0.f171751b)) {
                            int iMax4 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0);
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(iMax4, Integer.MIN_VALUE));
                            int measuredHeight3 = view2.getMeasuredHeight();
                            if (measuredHeight3 > 0) {
                                if (measuredHeight3 != iMax4) {
                                    t2e t2eVar8 = this.f210879P0;
                                    t2e t2eVar9 = t2e.f171739e;
                                    if (t2eVar8.m188964a(t2eVar9)) {
                                        this.f210877O0 = measuredHeight3 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                        this.f210879P0 = t2eVar9;
                                    }
                                }
                                iMax3 = -1;
                            }
                        }
                    }
                    if (this.f210895Y0.getSpinnerStyle() == wwf0.f191271h) {
                        iMax3 = View.MeasureSpec.getSize(i2);
                        i4 = -1;
                        i3 = 0;
                    } else {
                        if (!this.f210895Y0.getSpinnerStyle().f191275c || z) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            iMax3 = Math.max(0, m225027z(this.f210854C) ? -this.f210899b : 0);
                        }
                        i4 = -1;
                    }
                    if (iMax3 != i4) {
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((iMax3 - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i3), 1073741824));
                    }
                    t2e t2eVar10 = this.f210879P0;
                    if (!t2eVar10.f171751b) {
                        float f3 = this.f210887T0;
                        if (f3 < f) {
                            f3 *= this.f210877O0;
                        }
                        this.f210879P0 = t2eVar10.m188965b();
                        this.f210895Y0.mo132531i(this.f210902c1, this.f210877O0, (int) f3);
                    }
                    if (z && m225027z(this.f210854C)) {
                        measuredWidth += view2.getMeasuredWidth();
                        measuredHeight += view2.getMeasuredHeight();
                    }
                }
                hvc0 hvc0Var = this.f210896Z0;
                if (hvc0Var != null && hvc0Var.getView() == childAt) {
                    View view3 = this.f210896Z0.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : f210851t1;
                    view3.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams3.width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin + ((!z || ((this.f210894X0 == null || !m225027z(this.f210853B) || !m224995A(this.f210858F, this.f210894X0)) ? i3 : 1) == 0) ? i3 : this.f210873M0) + ((!z || ((this.f210895Y0 == null || !m225027z(this.f210854C) || !m224995A(this.f210860G, this.f210895Y0)) ? i3 : 1) == 0) ? i3 : this.f210877O0), layoutParams3.height));
                    measuredWidth += view3.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                    measuredHeight += view3.getMeasuredHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                }
            }
            i7++;
            z2 = z;
        }
        super.setMeasuredDimension(View.resolveSize(Math.max(measuredWidth + getPaddingLeft() + getPaddingRight(), super.getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(measuredHeight + getPaddingTop() + getPaddingBottom(), super.getSuggestedMinimumHeight()), i2));
        this.f210915j = getMeasuredWidth() / 2.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return this.f210869K0.m104391a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return (this.f210921l1 && f2 > 0.0f) || m225008U(-f2) || this.f210869K0.m104392b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        int i3 = this.f210863H0;
        int i4 = 0;
        if (i2 * i3 > 0) {
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(this.f210863H0);
            int i5 = this.f210863H0;
            if (iAbs > iAbs2) {
                this.f210863H0 = 0;
                i4 = i5;
            } else {
                this.f210863H0 = i5 - i2;
                i4 = i2;
            }
            m224997C(this.f210863H0);
        } else if (i2 > 0 && this.f210921l1) {
            int i6 = i3 - i2;
            this.f210863H0 = i6;
            m224997C(i6);
            i4 = i2;
        }
        this.f210869K0.m104393c(i, i2 - i4, iArr, null);
        iArr[1] = iArr[1] + i4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        xde0 xde0Var;
        ViewParent parent;
        xde0 xde0Var2;
        boolean zM104396f = this.f210869K0.m104396f(i, i2, i3, i4, this.f210867J0);
        int i5 = i4 + this.f210867J0[1];
        if ((i5 < 0 && ((this.f210853B || this.f210868K) && (this.f210863H0 != 0 || (xde0Var2 = this.f210861G0) == null || xde0Var2.mo182409b(this.f210896Z0.getView())))) || (i5 > 0 && ((this.f210854C || this.f210868K) && (this.f210863H0 != 0 || (xde0Var = this.f210861G0) == null || xde0Var.mo182408a(this.f210896Z0.getView()))))) {
            RefreshState refreshState = this.f210906e1;
            if (refreshState == RefreshState.None || refreshState.isOpening) {
                this.f210902c1.mo155988f(i5 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zM104396f && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            int i6 = this.f210863H0 - i5;
            this.f210863H0 = i6;
            m224997C(i6);
        }
        if (!this.f210921l1 || i2 >= 0) {
            return;
        }
        this.f210921l1 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        this.f210871L0.m125664b(view, view2, i);
        this.f210869K0.m104406p(i & 2);
        this.f210863H0 = this.f210899b;
        this.f210865I0 = true;
        m225026y(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        if (isEnabled() && isNestedScrollingEnabled() && (i & 2) != 0) {
            return this.f210868K || this.f210853B || this.f210854C;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(@NonNull View view) {
        this.f210871L0.m125666d(view);
        this.f210865I0 = false;
        this.f210863H0 = 0;
        m224999E();
        this.f210869K0.m104408r();
    }

    /* JADX INFO: renamed from: p */
    public mvc0 m225017p(int i) {
        return m225018q(i, true, false);
    }

    /* JADX INFO: renamed from: q */
    public mvc0 m225018q(int i, boolean z, boolean z2) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        RunnableC22758h runnableC22758h = new RunnableC22758h(i2, z2, z);
        if (i3 > 0) {
            this.f210900b1.postDelayed(runnableC22758h, i3);
            return this;
        }
        runnableC22758h.run();
        return this;
    }

    /* JADX INFO: renamed from: r */
    public mvc0 m225019r(boolean z) {
        return m225018q(z ? Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f210908f1))), 300) << 16 : 0, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (kkl0.m150135Q(this.f210896Z0.mo137317h())) {
            this.f210928p = z;
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: s */
    public mvc0 m225020s() {
        return m225018q(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f210908f1))), 300) << 16, true, true);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f210880Q = z;
        this.f210869K0.m104404n(z);
    }

    public void setStateDirectLoading(boolean z) {
        RefreshState refreshState = this.f210904d1;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.f210908f1 = System.currentTimeMillis();
            this.f210921l1 = true;
            m224998D(refreshState2);
            tm50 tm50Var = this.f210857E0;
            if (tm50Var != null) {
                if (z) {
                    tm50Var.mo79018a(this);
                }
            } else if (this.f210859F0 == null) {
                m225017p(2000);
            }
            gvc0 gvc0Var = this.f210895Y0;
            if (gvc0Var != null) {
                float f = this.f210887T0;
                if (f < 10.0f) {
                    f *= this.f210877O0;
                }
                gvc0Var.mo132529g(this, this.f210877O0, (int) f);
            }
            xm50 xm50Var = this.f210859F0;
            if (xm50Var == null || !(this.f210895Y0 instanceof jvc0)) {
                return;
            }
            if (z) {
                xm50Var.mo79018a(this);
            }
            float f2 = this.f210887T0;
            if (f2 < 10.0f) {
                f2 *= this.f210877O0;
            }
            this.f210859F0.mo141460m1((jvc0) this.f210895Y0, this.f210877O0, (int) f2);
        }
    }

    public void setStateLoading(boolean z) {
        C22752b c22752b = new C22752b(z);
        m224998D(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorMo155983a = this.f210902c1.mo155983a(-this.f210877O0);
        if (valueAnimatorMo155983a != null) {
            valueAnimatorMo155983a.addListener(c22752b);
        }
        gvc0 gvc0Var = this.f210895Y0;
        if (gvc0Var != null) {
            float f = this.f210887T0;
            if (f < 10.0f) {
                f *= this.f210877O0;
            }
            gvc0Var.mo132526c(this, this.f210877O0, (int) f);
        }
        xm50 xm50Var = this.f210859F0;
        if (xm50Var != null) {
            gvc0 gvc0Var2 = this.f210895Y0;
            if (gvc0Var2 instanceof jvc0) {
                float f2 = this.f210887T0;
                if (f2 < 10.0f) {
                    f2 *= this.f210877O0;
                }
                xm50Var.mo141456W0((jvc0) gvc0Var2, this.f210877O0, (int) f2);
            }
        }
        if (valueAnimatorMo155983a == null) {
            c22752b.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z) {
        C22753c c22753c = new C22753c(z);
        m224998D(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorMo155983a = this.f210902c1.mo155983a(this.f210873M0);
        if (valueAnimatorMo155983a != null) {
            valueAnimatorMo155983a.addListener(c22753c);
        }
        gvc0 gvc0Var = this.f210894X0;
        if (gvc0Var != null) {
            float f = this.f210885S0;
            if (f < 10.0f) {
                f *= this.f210873M0;
            }
            gvc0Var.mo132526c(this, this.f210873M0, (int) f);
        }
        xm50 xm50Var = this.f210859F0;
        if (xm50Var != null) {
            gvc0 gvc0Var2 = this.f210894X0;
            if (gvc0Var2 instanceof kvc0) {
                float f2 = this.f210885S0;
                if (f2 < 10.0f) {
                    f2 *= this.f210873M0;
                }
                xm50Var.mo141457b0((kvc0) gvc0Var2, this.f210873M0, (int) f2);
            }
        }
        if (valueAnimatorMo155983a == null) {
            c22753c.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.f210904d1;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            m224998D(RefreshState.None);
        }
        if (this.f210906e1 != refreshState) {
            this.f210906e1 = refreshState;
        }
    }

    /* JADX INFO: renamed from: t */
    public mvc0 m225021t() {
        return m225024w(true);
    }

    /* JADX INFO: renamed from: u */
    public mvc0 m225022u(int i) {
        return m225023v(i, true, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: v */
    public mvc0 m225023v(int i, boolean z, Boolean bool) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        RunnableC22757g runnableC22757g = new RunnableC22757g(i2, bool, z);
        if (i3 > 0) {
            this.f210900b1.postDelayed(runnableC22757g, i3);
            return this;
        }
        runnableC22757g.run();
        return this;
    }

    /* JADX INFO: renamed from: w */
    public mvc0 m225024w(boolean z) {
        return z ? m225023v(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f210908f1))), 300) << 16, true, Boolean.FALSE) : m225023v(0, false, null);
    }

    /* JADX INFO: renamed from: x */
    public mvc0 m225025x() {
        return m225023v(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f210908f1))), 300) << 16, true, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: y */
    public boolean m225026y(int i) {
        if (i == 0) {
            if (this.f210930p1 != null) {
                RefreshState refreshState = this.f210904d1;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased || refreshState == RefreshState.RefreshReleased || refreshState == RefreshState.LoadReleased) {
                    return true;
                }
                if (refreshState == RefreshState.PullDownCanceled) {
                    this.f210902c1.mo155988f(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    this.f210902c1.mo155988f(RefreshState.PullUpToLoad);
                }
                this.f210930p1.setDuration(0L);
                this.f210930p1.cancel();
                this.f210930p1 = null;
            }
            this.f210927o1 = null;
        }
        return this.f210930p1 != null;
    }

    /* JADX INFO: renamed from: z */
    public boolean m225027z(boolean z) {
        return z && !this.f210872M;
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$m */
    public static class C22763m extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f210989a;

        /* JADX INFO: renamed from: b */
        public wwf0 f210990b;

        public C22763m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f210989a = 0;
            this.f210990b = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109666V1);
            this.f210989a = typedArrayObtainStyledAttributes.getColor(hhc0.f109672W1, this.f210989a);
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109678X1)) {
                this.f210990b = wwf0.f191272i[typedArrayObtainStyledAttributes.getInt(hhc0.f109678X1, wwf0.f191267d.f191273a)];
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public C22763m(int i, int i2) {
            super(i, i2);
            this.f210989a = 0;
            this.f210990b = null;
        }
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }
}
