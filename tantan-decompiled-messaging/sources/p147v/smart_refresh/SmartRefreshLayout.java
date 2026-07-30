package p147v.smart_refresh;

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
import p147v.smart_refresh.constant.RefreshState;
import p147v.smart_refresh.wrapper.RefreshFooterWrapper;
import p147v.smart_refresh.wrapper.RefreshHeaderWrapper;
import p149l.b9c0;
import p149l.bnc0;
import p149l.bqd;
import p149l.cnc0;
import p149l.cqd;
import p149l.df50;
import p149l.dnc0;
import p149l.dqd;
import p149l.ef50;
import p149l.enc0;
import p149l.f1e;
import p149l.fnc0;
import p149l.gbl0;
import p149l.gnc0;
import p149l.hnc0;
import p149l.ikf0;
import p149l.lsi0;
import p149l.me50;
import p149l.nof0;
import p149l.p4c0;
import p149l.qe50;
import p149l.s5e0;
import p149l.t920;
import p149l.tqq0;
import p149l.upk0;
import p149l.w920;
import p149l.x920;

/* JADX INFO: loaded from: classes3.dex */
public class SmartRefreshLayout extends ViewGroup implements hnc0, w920 {

    /* JADX INFO: renamed from: q1 */
    public static bqd f209926q1;

    /* JADX INFO: renamed from: r1 */
    public static cqd f209927r1;

    /* JADX INFO: renamed from: s1 */
    public static dqd f209928s1;

    /* JADX INFO: renamed from: t1 */
    public static ViewGroup.MarginLayoutParams f209929t1 = new ViewGroup.MarginLayoutParams(-1, -1);

    /* JADX INFO: renamed from: A */
    public int[] f209930A;

    /* JADX INFO: renamed from: B */
    public boolean f209931B;

    /* JADX INFO: renamed from: C */
    public boolean f209932C;

    /* JADX INFO: renamed from: D */
    public boolean f209933D;

    /* JADX INFO: renamed from: E */
    public boolean f209934E;

    /* JADX INFO: renamed from: E0 */
    public me50 f209935E0;

    /* JADX INFO: renamed from: F */
    public boolean f209936F;

    /* JADX INFO: renamed from: F0 */
    public qe50 f209937F0;

    /* JADX INFO: renamed from: G */
    public boolean f209938G;

    /* JADX INFO: renamed from: G0 */
    public s5e0 f209939G0;

    /* JADX INFO: renamed from: H */
    public boolean f209940H;

    /* JADX INFO: renamed from: H0 */
    public int f209941H0;

    /* JADX INFO: renamed from: I */
    public boolean f209942I;

    /* JADX INFO: renamed from: I0 */
    public boolean f209943I0;

    /* JADX INFO: renamed from: J */
    public boolean f209944J;

    /* JADX INFO: renamed from: J0 */
    public int[] f209945J0;

    /* JADX INFO: renamed from: K */
    public boolean f209946K;

    /* JADX INFO: renamed from: K0 */
    public t920 f209947K0;

    /* JADX INFO: renamed from: L */
    public boolean f209948L;

    /* JADX INFO: renamed from: L0 */
    public x920 f209949L0;

    /* JADX INFO: renamed from: M */
    public boolean f209950M;

    /* JADX INFO: renamed from: M0 */
    public int f209951M0;

    /* JADX INFO: renamed from: N */
    public boolean f209952N;

    /* JADX INFO: renamed from: N0 */
    public f1e f209953N0;

    /* JADX INFO: renamed from: O */
    public boolean f209954O;

    /* JADX INFO: renamed from: O0 */
    public int f209955O0;

    /* JADX INFO: renamed from: P */
    public boolean f209956P;

    /* JADX INFO: renamed from: P0 */
    public f1e f209957P0;

    /* JADX INFO: renamed from: Q */
    public boolean f209958Q;

    /* JADX INFO: renamed from: Q0 */
    public int f209959Q0;

    /* JADX INFO: renamed from: R */
    public boolean f209960R;

    /* JADX INFO: renamed from: R0 */
    public int f209961R0;

    /* JADX INFO: renamed from: S */
    public boolean f209962S;

    /* JADX INFO: renamed from: S0 */
    public float f209963S0;

    /* JADX INFO: renamed from: T */
    public boolean f209964T;

    /* JADX INFO: renamed from: T0 */
    public float f209965T0;

    /* JADX INFO: renamed from: U */
    public boolean f209966U;

    /* JADX INFO: renamed from: U0 */
    public float f209967U0;

    /* JADX INFO: renamed from: V */
    public boolean f209968V;

    /* JADX INFO: renamed from: V0 */
    public float f209969V0;

    /* JADX INFO: renamed from: W */
    public boolean f209970W;

    /* JADX INFO: renamed from: W0 */
    public float f209971W0;

    /* JADX INFO: renamed from: X0 */
    public bnc0 f209972X0;

    /* JADX INFO: renamed from: Y0 */
    public bnc0 f209973Y0;

    /* JADX INFO: renamed from: Z0 */
    public cnc0 f209974Z0;

    /* JADX INFO: renamed from: a */
    public int f209975a;

    /* JADX INFO: renamed from: a1 */
    public Paint f209976a1;

    /* JADX INFO: renamed from: b */
    public int f209977b;

    /* JADX INFO: renamed from: b1 */
    public Handler f209978b1;

    /* JADX INFO: renamed from: c */
    public int f209979c;

    /* JADX INFO: renamed from: c1 */
    public gnc0 f209980c1;

    /* JADX INFO: renamed from: d */
    public int f209981d;

    /* JADX INFO: renamed from: d1 */
    public RefreshState f209982d1;

    /* JADX INFO: renamed from: e */
    public int f209983e;

    /* JADX INFO: renamed from: e1 */
    public RefreshState f209984e1;

    /* JADX INFO: renamed from: f */
    public int f209985f;

    /* JADX INFO: renamed from: f1 */
    public long f209986f1;

    /* JADX INFO: renamed from: g */
    public int f209987g;

    /* JADX INFO: renamed from: g1 */
    public int f209988g1;

    /* JADX INFO: renamed from: h */
    public float f209989h;

    /* JADX INFO: renamed from: h1 */
    public int f209990h1;

    /* JADX INFO: renamed from: i */
    public float f209991i;

    /* JADX INFO: renamed from: i1 */
    public boolean f209992i1;

    /* JADX INFO: renamed from: j */
    public float f209993j;

    /* JADX INFO: renamed from: j1 */
    public boolean f209994j1;

    /* JADX INFO: renamed from: k */
    public float f209995k;

    /* JADX INFO: renamed from: k0 */
    public boolean f209996k0;

    /* JADX INFO: renamed from: k1 */
    public boolean f209997k1;

    /* JADX INFO: renamed from: l */
    public float f209998l;

    /* JADX INFO: renamed from: l1 */
    public boolean f209999l1;

    /* JADX INFO: renamed from: m */
    public char f210000m;

    /* JADX INFO: renamed from: m1 */
    public boolean f210001m1;

    /* JADX INFO: renamed from: n */
    public boolean f210002n;

    /* JADX INFO: renamed from: n1 */
    public MotionEvent f210003n1;

    /* JADX INFO: renamed from: o */
    public boolean f210004o;

    /* JADX INFO: renamed from: o1 */
    public Runnable f210005o1;

    /* JADX INFO: renamed from: p */
    public boolean f210006p;

    /* JADX INFO: renamed from: p0 */
    public df50 f210007p0;

    /* JADX INFO: renamed from: p1 */
    public ValueAnimator f210008p1;

    /* JADX INFO: renamed from: q */
    public int f210009q;

    /* JADX INFO: renamed from: r */
    public int f210010r;

    /* JADX INFO: renamed from: s */
    public int f210011s;

    /* JADX INFO: renamed from: t */
    public int f210012t;

    /* JADX INFO: renamed from: u */
    public int f210013u;

    /* JADX INFO: renamed from: v */
    public int f210014v;

    /* JADX INFO: renamed from: w */
    public int f210015w;

    /* JADX INFO: renamed from: x */
    public Scroller f210016x;

    /* JADX INFO: renamed from: y */
    public VelocityTracker f210017y;

    /* JADX INFO: renamed from: z */
    public Interpolator f210018z;

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$a */
    public static /* synthetic */ class C22636a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f210019a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f210019a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f210019a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f210019a[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f210019a[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f210019a[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f210019a[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f210019a[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f210019a[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f210019a[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f210019a[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f210019a[RefreshState.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f210019a[RefreshState.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$b */
    public class C22637b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f210020a;

        public C22637b(boolean z) {
            this.f210020a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.setStateDirectLoading(this.f210020a);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$c */
    public class C22638c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f210022a;

        public C22638c(boolean z) {
            this.f210022a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.f209986f1 = System.currentTimeMillis();
                SmartRefreshLayout.this.m223752D(RefreshState.Refreshing);
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                df50 df50Var = smartRefreshLayout.f210007p0;
                if (df50Var != null) {
                    if (this.f210022a) {
                        df50Var.mo57954w2(smartRefreshLayout);
                    }
                } else if (smartRefreshLayout.f209937F0 == null) {
                    smartRefreshLayout.m223776u(3000);
                }
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                bnc0 bnc0Var = smartRefreshLayout2.f209972X0;
                if (bnc0Var != null) {
                    float f = smartRefreshLayout2.f209963S0;
                    if (f < 10.0f) {
                        f *= smartRefreshLayout2.f209951M0;
                    }
                    bnc0Var.mo102768g(smartRefreshLayout2, smartRefreshLayout2.f209951M0, (int) f);
                }
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                qe50 qe50Var = smartRefreshLayout3.f209937F0;
                if (qe50Var == null || !(smartRefreshLayout3.f209972X0 instanceof fnc0)) {
                    return;
                }
                if (this.f210022a) {
                    qe50Var.mo57954w2(smartRefreshLayout3);
                }
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                float f2 = smartRefreshLayout4.f209963S0;
                if (f2 < 10.0f) {
                    f2 *= smartRefreshLayout4.f209951M0;
                }
                smartRefreshLayout4.f209937F0.mo96447A2((fnc0) smartRefreshLayout4.f209972X0, smartRefreshLayout4.f209951M0, (int) f2);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$d */
    public class C22639d extends AnimatorListenerAdapter {
        public C22639d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RefreshState refreshState;
            RefreshState refreshState2;
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.f210008p1 = null;
                if (smartRefreshLayout.f209977b == 0 && (refreshState = smartRefreshLayout.f209982d1) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
                    smartRefreshLayout.m223752D(refreshState2);
                    return;
                }
                RefreshState refreshState3 = smartRefreshLayout.f209982d1;
                if (refreshState3 != smartRefreshLayout.f209984e1) {
                    smartRefreshLayout.setViceState(refreshState3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$e */
    public class C22640e implements ValueAnimator.AnimatorUpdateListener {
        public C22640e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout.this.f209980c1.mo127125e(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$f */
    public class RunnableC22641f implements Runnable {
        public RunnableC22641f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            me50 me50Var = smartRefreshLayout.f209935E0;
            if (me50Var != null) {
                me50Var.mo77835a(smartRefreshLayout);
            } else if (smartRefreshLayout.f209937F0 == null) {
                smartRefreshLayout.m223771p(2000);
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            qe50 qe50Var = smartRefreshLayout2.f209937F0;
            if (qe50Var != null) {
                qe50Var.mo77835a(smartRefreshLayout2);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$g */
    public class RunnableC22642g implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f210027a = 0;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f210028b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Boolean f210029c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f210030d;

        public RunnableC22642g(int i, Boolean bool, boolean z) {
            this.f210028b = i;
            this.f210029c = bool;
            this.f210030d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f210027a;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (i == 0) {
                RefreshState refreshState = smartRefreshLayout.f209982d1;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.f209984e1 == RefreshState.Refreshing) {
                    smartRefreshLayout.f209984e1 = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.f210008p1;
                    if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.f210008p1.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.f210008p1 = null;
                        ValueAnimator valueAnimatorMo127121a = smartRefreshLayout2.f209980c1.mo127121a(0);
                        SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                        if (valueAnimatorMo127121a == null) {
                            smartRefreshLayout3.m223752D(refreshState2);
                        } else {
                            smartRefreshLayout3.m223752D(RefreshState.PullDownCanceled);
                        }
                    } else if (refreshState == RefreshState.Refreshing && smartRefreshLayout.f209972X0 != null && smartRefreshLayout.f209974Z0 != null) {
                        this.f210027a = i + 1;
                        smartRefreshLayout.f209978b1.postDelayed(this, this.f210028b);
                        SmartRefreshLayout.this.m223752D(RefreshState.RefreshFinish);
                        if (this.f210029c == Boolean.FALSE) {
                            SmartRefreshLayout.this.m223760L(false);
                        }
                    }
                }
                if (this.f210029c == Boolean.TRUE) {
                    SmartRefreshLayout.this.m223760L(true);
                    return;
                }
                return;
            }
            int iMo102769h = smartRefreshLayout.f209972X0.mo102769h(smartRefreshLayout, this.f210030d);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            qe50 qe50Var = smartRefreshLayout4.f209937F0;
            if (qe50Var != null) {
                bnc0 bnc0Var = smartRefreshLayout4.f209972X0;
                if (bnc0Var instanceof fnc0) {
                    qe50Var.mo96453x0((fnc0) bnc0Var, this.f210030d);
                }
            }
            if (iMo102769h < Integer.MAX_VALUE) {
                SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                if (smartRefreshLayout5.f210002n || smartRefreshLayout5.f209943I0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.f210002n) {
                        float f = smartRefreshLayout6.f209995k;
                        smartRefreshLayout6.f209991i = f;
                        smartRefreshLayout6.f209981d = 0;
                        smartRefreshLayout6.f210002n = false;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout6.f209993j, (f + smartRefreshLayout6.f209977b) - (smartRefreshLayout6.f209975a * 2), 0));
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout7.f209993j, smartRefreshLayout7.f209995k + smartRefreshLayout7.f209977b, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.f209943I0) {
                        smartRefreshLayout8.f209941H0 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout8.f209993j, smartRefreshLayout8.f209995k, 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        smartRefreshLayout9.f209943I0 = false;
                        smartRefreshLayout9.f209981d = 0;
                    }
                }
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                int i2 = smartRefreshLayout10.f209977b;
                if (i2 <= 0) {
                    if (i2 < 0) {
                        smartRefreshLayout10.m223763h(0, iMo102769h, smartRefreshLayout10.f210018z, smartRefreshLayout10.f209985f);
                        return;
                    } else {
                        smartRefreshLayout10.f209980c1.mo127125e(0, false);
                        SmartRefreshLayout.this.f209980c1.mo127126f(RefreshState.None);
                        return;
                    }
                }
                ValueAnimator valueAnimatorM223763h = smartRefreshLayout10.m223763h(0, iMo102769h, smartRefreshLayout10.f210018z, smartRefreshLayout10.f209985f);
                SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerMo107751c = smartRefreshLayout11.f209954O ? smartRefreshLayout11.f209974Z0.mo107751c(smartRefreshLayout11.f209977b) : null;
                if (valueAnimatorM223763h == null || animatorUpdateListenerMo107751c == null) {
                    return;
                }
                valueAnimatorM223763h.addUpdateListener(animatorUpdateListenerMo107751c);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$h */
    public class RunnableC22643h implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f210032a = 0;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f210033b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f210034c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f210035d;

        /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$h$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f210037a;

            /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$h$a$a, reason: collision with other inner class name */
            public class C22733a extends AnimatorListenerAdapter {
                public C22733a() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (animator == null || animator.getDuration() != 0) {
                        RunnableC22643h runnableC22643h = RunnableC22643h.this;
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        smartRefreshLayout.f209999l1 = false;
                        if (runnableC22643h.f210034c) {
                            smartRefreshLayout.m223760L(true);
                        }
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        if (smartRefreshLayout2.f209982d1 == RefreshState.LoadFinish) {
                            smartRefreshLayout2.m223752D(RefreshState.None);
                        }
                    }
                }
            }

            public a(int i) {
                this.f210037a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerMo107751c;
                ValueAnimator valueAnimatorMo127121a;
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (!smartRefreshLayout.f209952N || this.f210037a >= 0) {
                    animatorUpdateListenerMo107751c = null;
                } else {
                    animatorUpdateListenerMo107751c = smartRefreshLayout.f209974Z0.mo107751c(smartRefreshLayout.f209977b);
                    if (animatorUpdateListenerMo107751c != null) {
                        animatorUpdateListenerMo107751c.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                    }
                }
                C22733a c22733a = new C22733a();
                RunnableC22643h runnableC22643h = RunnableC22643h.this;
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i = smartRefreshLayout2.f209977b;
                if (i > 0) {
                    valueAnimatorMo127121a = smartRefreshLayout2.f209980c1.mo127121a(0);
                } else {
                    if (animatorUpdateListenerMo107751c != null || i == 0) {
                        ValueAnimator valueAnimator = smartRefreshLayout2.f210008p1;
                        if (valueAnimator != null) {
                            valueAnimator.setDuration(0L);
                            SmartRefreshLayout.this.f210008p1.cancel();
                            SmartRefreshLayout.this.f210008p1 = null;
                        }
                        SmartRefreshLayout.this.f209980c1.mo127125e(0, false);
                        SmartRefreshLayout.this.f209980c1.mo127126f(RefreshState.None);
                    } else if (runnableC22643h.f210034c && smartRefreshLayout2.f209940H) {
                        int i2 = smartRefreshLayout2.f209955O0;
                        if (i >= (-i2)) {
                            smartRefreshLayout2.m223752D(RefreshState.None);
                        } else {
                            valueAnimatorMo127121a = smartRefreshLayout2.f209980c1.mo127121a(-i2);
                        }
                    } else {
                        valueAnimatorMo127121a = smartRefreshLayout2.f209980c1.mo127121a(0);
                    }
                    valueAnimatorMo127121a = null;
                }
                if (valueAnimatorMo127121a != null) {
                    valueAnimatorMo127121a.addListener(c22733a);
                } else {
                    c22733a.onAnimationEnd(null);
                }
            }
        }

        public RunnableC22643h(int i, boolean z, boolean z2) {
            this.f210033b = i;
            this.f210034c = z;
            this.f210035d = z2;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            int i = this.f210032a;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (i == 0) {
                RefreshState refreshState = smartRefreshLayout.f209982d1;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.f209984e1 == RefreshState.Loading) {
                    smartRefreshLayout.f209984e1 = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.f210008p1;
                    if (valueAnimator != null && ((refreshState.isDragging || refreshState == RefreshState.LoadReleased) && refreshState.isFooter)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.f210008p1.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.f210008p1 = null;
                        ValueAnimator valueAnimatorMo127121a = smartRefreshLayout2.f209980c1.mo127121a(0);
                        SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                        if (valueAnimatorMo127121a == null) {
                            smartRefreshLayout3.m223752D(refreshState2);
                        } else {
                            smartRefreshLayout3.m223752D(RefreshState.PullUpCanceled);
                        }
                    } else if (refreshState == RefreshState.Loading && smartRefreshLayout.f209973Y0 != null && smartRefreshLayout.f209974Z0 != null) {
                        this.f210032a = i + 1;
                        smartRefreshLayout.f209978b1.postDelayed(this, this.f210033b);
                        SmartRefreshLayout.this.m223752D(RefreshState.LoadFinish);
                        return;
                    }
                }
                if (this.f210034c) {
                    SmartRefreshLayout.this.m223760L(true);
                    return;
                }
                return;
            }
            int iMo102769h = smartRefreshLayout.f209973Y0.mo102769h(smartRefreshLayout, this.f210035d);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            qe50 qe50Var = smartRefreshLayout4.f209937F0;
            if (qe50Var != null) {
                bnc0 bnc0Var = smartRefreshLayout4.f209973Y0;
                if (bnc0Var instanceof enc0) {
                    qe50Var.mo96450j((enc0) bnc0Var, this.f210035d);
                }
            }
            if (iMo102769h < Integer.MAX_VALUE) {
                if (this.f210034c) {
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    z = smartRefreshLayout5.f209940H && smartRefreshLayout5.f209977b < 0 && smartRefreshLayout5.f209974Z0.mo107755g();
                }
                SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                int i2 = smartRefreshLayout6.f209977b;
                int iMax = i2 - (z ? Math.max(i2, -smartRefreshLayout6.f209955O0) : 0);
                SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                if (smartRefreshLayout7.f210002n || smartRefreshLayout7.f209943I0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.f210002n) {
                        float f = smartRefreshLayout8.f209995k;
                        smartRefreshLayout8.f209991i = f;
                        smartRefreshLayout8.f209981d = smartRefreshLayout8.f209977b - iMax;
                        smartRefreshLayout8.f210002n = false;
                        float f2 = smartRefreshLayout8.f209938G ? iMax : 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout8.f209993j, f + f2 + (smartRefreshLayout8.f209975a * 2), 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout9.f209993j, smartRefreshLayout9.f209995k + f2, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                    if (smartRefreshLayout10.f209943I0) {
                        smartRefreshLayout10.f209941H0 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout10.f209993j, smartRefreshLayout10.f209995k, 0));
                        SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                        smartRefreshLayout11.f209943I0 = false;
                        smartRefreshLayout11.f209981d = 0;
                    }
                }
                SmartRefreshLayout.this.f209978b1.postDelayed(new a(iMax), SmartRefreshLayout.this.f209977b < 0 ? iMo102769h : 0L);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$i */
    public class RunnableC22644i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f210040a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f210041b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f210042c;

        /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$i$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.f210008p1 == null || smartRefreshLayout.f209972X0 == null) {
                    return;
                }
                smartRefreshLayout.f209980c1.mo127125e(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
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
                    smartRefreshLayout.f210008p1 = null;
                    if (smartRefreshLayout.f209972X0 == null) {
                        smartRefreshLayout.f209980c1.mo127126f(RefreshState.None);
                        return;
                    }
                    RefreshState refreshState = smartRefreshLayout.f209982d1;
                    RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
                    if (refreshState != refreshState2) {
                        smartRefreshLayout.f209980c1.mo127126f(refreshState2);
                    }
                    RunnableC22644i runnableC22644i = RunnableC22644i.this;
                    SmartRefreshLayout.this.setStateRefreshing(!runnableC22644i.f210042c);
                }
            }
        }

        public RunnableC22644i(float f, int i, boolean z) {
            this.f210040a = f;
            this.f210041b = i;
            this.f210042c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f209984e1 != RefreshState.Refreshing) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.f210008p1;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.f210008p1.cancel();
                SmartRefreshLayout.this.f210008p1 = null;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.f209993j = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.f209980c1.mo127126f(RefreshState.PullDownToRefresh);
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int i = smartRefreshLayout3.f209951M0;
            float f = i == 0 ? smartRefreshLayout3.f209967U0 : i;
            float f2 = this.f210040a;
            if (f2 < 10.0f) {
                f2 *= f;
            }
            smartRefreshLayout3.f210008p1 = ValueAnimator.ofInt(smartRefreshLayout3.f209977b, (int) f2);
            SmartRefreshLayout.this.f210008p1.setDuration(this.f210041b);
            SmartRefreshLayout.this.f210008p1.setInterpolator(new ikf0(ikf0.f113664b));
            SmartRefreshLayout.this.f210008p1.addUpdateListener(new a());
            SmartRefreshLayout.this.f210008p1.addListener(new b());
            SmartRefreshLayout.this.f210008p1.start();
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$j */
    public class RunnableC22645j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f210046a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f210047b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f210048c;

        /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$j$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.f210008p1 == null || smartRefreshLayout.f209973Y0 == null) {
                    return;
                }
                smartRefreshLayout.f209980c1.mo127125e(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
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
                    smartRefreshLayout.f210008p1 = null;
                    if (smartRefreshLayout.f209973Y0 == null) {
                        smartRefreshLayout.f209980c1.mo127126f(RefreshState.None);
                        return;
                    }
                    RefreshState refreshState = smartRefreshLayout.f209982d1;
                    RefreshState refreshState2 = RefreshState.ReleaseToLoad;
                    if (refreshState != refreshState2) {
                        smartRefreshLayout.f209980c1.mo127126f(refreshState2);
                    }
                    RunnableC22645j runnableC22645j = RunnableC22645j.this;
                    SmartRefreshLayout.this.setStateLoading(!runnableC22645j.f210048c);
                }
            }
        }

        public RunnableC22645j(float f, int i, boolean z) {
            this.f210046a = f;
            this.f210047b = i;
            this.f210048c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f209984e1 != RefreshState.Loading) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.f210008p1;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.f210008p1.cancel();
                SmartRefreshLayout.this.f210008p1 = null;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.f209993j = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.f209980c1.mo127126f(RefreshState.PullUpToLoad);
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int i = smartRefreshLayout3.f209955O0;
            float f = i == 0 ? smartRefreshLayout3.f209969V0 : i;
            float f2 = this.f210046a;
            if (f2 < 10.0f) {
                f2 *= f;
            }
            smartRefreshLayout3.f210008p1 = ValueAnimator.ofInt(smartRefreshLayout3.f209977b, -((int) f2));
            SmartRefreshLayout.this.f210008p1.setDuration(this.f210047b);
            SmartRefreshLayout.this.f210008p1.setInterpolator(new ikf0(ikf0.f113664b));
            SmartRefreshLayout.this.f210008p1.addUpdateListener(new a());
            SmartRefreshLayout.this.f210008p1.addListener(new b());
            SmartRefreshLayout.this.f210008p1.start();
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$k */
    public class RunnableC22646k implements Runnable {

        /* JADX INFO: renamed from: c */
        public int f210054c;

        /* JADX INFO: renamed from: f */
        public float f210057f;

        /* JADX INFO: renamed from: a */
        public int f210052a = 0;

        /* JADX INFO: renamed from: b */
        public int f210053b = 10;

        /* JADX INFO: renamed from: e */
        public float f210056e = 0.0f;

        /* JADX INFO: renamed from: d */
        public long f210055d = AnimationUtils.currentAnimationTimeMillis();

        public RunnableC22646k(float f, int i) {
            this.f210057f = f;
            this.f210054c = i;
            SmartRefreshLayout.this.f209978b1.postDelayed(this, this.f210053b);
            gnc0 gnc0Var = SmartRefreshLayout.this.f209980c1;
            if (f > 0.0f) {
                gnc0Var.mo127126f(RefreshState.PullDownToRefresh);
            } else {
                gnc0Var.mo127126f(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f210005o1 != this || smartRefreshLayout.f209982d1.isFinishing) {
                return;
            }
            if (Math.abs(smartRefreshLayout.f209977b) >= Math.abs(this.f210054c)) {
                int i = this.f210054c;
                float f = this.f210057f;
                if (i != 0) {
                    int i2 = this.f210052a + 1;
                    this.f210052a = i2;
                    this.f210057f = (float) (((double) f) * Math.pow(0.44999998807907104d, i2 * 2));
                } else {
                    int i3 = this.f210052a + 1;
                    this.f210052a = i3;
                    this.f210057f = (float) (((double) f) * Math.pow(0.8500000238418579d, i3 * 2));
                }
            } else {
                double d = this.f210057f;
                int i4 = this.f210052a + 1;
                this.f210052a = i4;
                this.f210057f = (float) (d * Math.pow(0.949999988079071d, i4 * 2));
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f2 = this.f210057f * (((jCurrentAnimationTimeMillis - this.f210055d) * 1.0f) / 1000.0f);
            if (Math.abs(f2) >= 1.0f) {
                this.f210055d = jCurrentAnimationTimeMillis;
                float f3 = this.f210056e + f2;
                this.f210056e = f3;
                SmartRefreshLayout.this.m223751C(f3);
                SmartRefreshLayout.this.f209978b1.postDelayed(this, this.f210053b);
                return;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState = smartRefreshLayout2.f209984e1;
            boolean z = refreshState.isDragging;
            if (z && refreshState.isHeader) {
                smartRefreshLayout2.f209980c1.mo127126f(RefreshState.PullDownCanceled);
            } else if (z && refreshState.isFooter) {
                smartRefreshLayout2.f209980c1.mo127126f(RefreshState.PullUpCanceled);
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.f210005o1 = null;
            if (Math.abs(smartRefreshLayout3.f209977b) >= Math.abs(this.f210054c)) {
                int iMin = Math.min(Math.max((int) ikf0.m136795i(Math.abs(SmartRefreshLayout.this.f209977b - this.f210054c)), 30), 100) * 10;
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                smartRefreshLayout4.m223763h(this.f210054c, 0, smartRefreshLayout4.f210018z, iMin);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$l */
    public class RunnableC22647l implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f210059a;

        /* JADX INFO: renamed from: d */
        public float f210062d;

        /* JADX INFO: renamed from: b */
        public int f210060b = 0;

        /* JADX INFO: renamed from: c */
        public int f210061c = 10;

        /* JADX INFO: renamed from: e */
        public float f210063e = 0.98f;

        /* JADX INFO: renamed from: f */
        public long f210064f = 0;

        /* JADX INFO: renamed from: g */
        public long f210065g = AnimationUtils.currentAnimationTimeMillis();

        public RunnableC22647l(float f) {
            this.f210062d = f;
            this.f210059a = SmartRefreshLayout.this.f209977b;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x004b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0059  */
        /* JADX WARN: Code duplicated, block: B:36:0x0065  */
        /* JADX WARN: Code duplicated, block: B:40:0x0093  */
        /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[LOOP:0: B:34:0x0061->B:48:0x00a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:52:0x008b A[SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        public Runnable m223782a() {
            SmartRefreshLayout smartRefreshLayout;
            int i;
            float fPow;
            int i2;
            int i3;
            float f;
            RefreshState refreshState;
            RefreshState refreshState2;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState3 = smartRefreshLayout2.f209982d1;
            if (refreshState3.isFinishing) {
                return null;
            }
            if (smartRefreshLayout2.f209977b != 0) {
                if (refreshState3.isOpening || (smartRefreshLayout2.f209964T && smartRefreshLayout2.f209940H && smartRefreshLayout2.f209966U && smartRefreshLayout2.m223781z(smartRefreshLayout2.f209932C))) {
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.f209982d1 == RefreshState.Loading || (smartRefreshLayout3.f209964T && smartRefreshLayout3.f209940H && smartRefreshLayout3.f209966U && smartRefreshLayout3.m223781z(smartRefreshLayout3.f209932C))) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        if (smartRefreshLayout4.f209977b >= (-smartRefreshLayout4.f209955O0)) {
                            smartRefreshLayout = SmartRefreshLayout.this;
                            if (smartRefreshLayout.f209982d1 == RefreshState.Refreshing && smartRefreshLayout.f209977b > smartRefreshLayout.f209951M0) {
                                i = SmartRefreshLayout.this.f209977b;
                                fPow = this.f210062d;
                                i2 = 0;
                                i3 = i;
                                while (i * i3 > 0) {
                                    i2++;
                                    fPow = (float) (((double) fPow) * Math.pow(this.f210063e, (this.f210061c * i2) / 10.0f));
                                    f = ((this.f210061c * 1.0f) / 1000.0f) * fPow;
                                    if (Math.abs(f) < 1.0f) {
                                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                                        refreshState = smartRefreshLayout5.f209982d1;
                                        if (!refreshState.isOpening && ((refreshState != (refreshState2 = RefreshState.Refreshing) || i3 <= smartRefreshLayout5.f209951M0) && (refreshState == refreshState2 || i3 >= (-smartRefreshLayout5.f209955O0)))) {
                                            break;
                                            break;
                                        }
                                        return null;
                                    }
                                    i3 = (int) (i3 + f);
                                }
                            }
                        } else {
                            i = SmartRefreshLayout.this.f209977b;
                            fPow = this.f210062d;
                            i2 = 0;
                            i3 = i;
                            while (i * i3 > 0) {
                                i2++;
                                fPow = (float) (((double) fPow) * Math.pow(this.f210063e, (this.f210061c * i2) / 10.0f));
                                f = ((this.f210061c * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout6.f209982d1;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i3 = (int) (i3 + f);
                            }
                        }
                    } else {
                        smartRefreshLayout = SmartRefreshLayout.this;
                        if (smartRefreshLayout.f209982d1 == RefreshState.Refreshing) {
                            i = SmartRefreshLayout.this.f209977b;
                            fPow = this.f210062d;
                            i2 = 0;
                            i3 = i;
                            while (i * i3 > 0) {
                                i2++;
                                fPow = (float) (((double) fPow) * Math.pow(this.f210063e, (this.f210061c * i2) / 10.0f));
                                f = ((this.f210061c * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout7.f209982d1;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i3 = (int) (i3 + f);
                            }
                        }
                    }
                } else {
                    i = SmartRefreshLayout.this.f209977b;
                    fPow = this.f210062d;
                    i2 = 0;
                    i3 = i;
                    while (i * i3 > 0) {
                        i2++;
                        fPow = (float) (((double) fPow) * Math.pow(this.f210063e, (this.f210061c * i2) / 10.0f));
                        f = ((this.f210061c * 1.0f) / 1000.0f) * fPow;
                        if (Math.abs(f) < 1.0f) {
                            SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                            refreshState = smartRefreshLayout8.f209982d1;
                            if (!refreshState.isOpening) {
                            }
                            return null;
                        }
                        i3 = (int) (i3 + f);
                    }
                }
            }
            this.f210064f = AnimationUtils.currentAnimationTimeMillis();
            SmartRefreshLayout.this.f209978b1.postDelayed(this, this.f210061c);
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f210005o1 != this || smartRefreshLayout.f209982d1.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = jCurrentAnimationTimeMillis - this.f210065g;
            float fPow = (float) (((double) this.f210062d) * Math.pow(this.f210063e, (jCurrentAnimationTimeMillis - this.f210064f) / (1000.0f / this.f210061c)));
            this.f210062d = fPow;
            float f = fPow * ((j * 1.0f) / 1000.0f);
            if (Math.abs(f) <= 1.0f) {
                SmartRefreshLayout.this.f210005o1 = null;
                return;
            }
            this.f210065g = jCurrentAnimationTimeMillis;
            int i = (int) (this.f210059a + f);
            this.f210059a = i;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.f209977b * i > 0) {
                smartRefreshLayout2.f209980c1.mo127125e(i, true);
                SmartRefreshLayout.this.f209978b1.postDelayed(this, this.f210061c);
                return;
            }
            smartRefreshLayout2.f210005o1 = null;
            smartRefreshLayout2.f209980c1.mo127125e(0, true);
            ikf0.m136790d(SmartRefreshLayout.this.f209974Z0.mo107756h(), (int) (-this.f210062d));
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            if (!smartRefreshLayout3.f209999l1 || f <= 0.0f) {
                return;
            }
            smartRefreshLayout3.f209999l1 = false;
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$n */
    public class C22649n implements gnc0 {
        public C22649n() {
        }

        @Override // p149l.gnc0
        /* JADX INFO: renamed from: a */
        public ValueAnimator mo127121a(int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.m223763h(i, 0, smartRefreshLayout.f210018z, smartRefreshLayout.f209985f);
        }

        @Override // p149l.gnc0
        /* JADX INFO: renamed from: b */
        public gnc0 mo127122b(@NonNull bnc0 bnc0Var, int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f209976a1 == null && i != 0) {
                smartRefreshLayout.f209976a1 = new Paint();
            }
            boolean zEquals = bnc0Var.equals(SmartRefreshLayout.this.f209972X0);
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (zEquals) {
                smartRefreshLayout2.f209988g1 = i;
                return this;
            }
            if (bnc0Var.equals(smartRefreshLayout2.f209973Y0)) {
                SmartRefreshLayout.this.f209990h1 = i;
            }
            return this;
        }

        @Override // p149l.gnc0
        @NonNull
        /* JADX INFO: renamed from: c */
        public hnc0 mo127123c() {
            return SmartRefreshLayout.this;
        }

        @Override // p149l.gnc0
        /* JADX INFO: renamed from: d */
        public gnc0 mo127124d() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f209982d1 == RefreshState.TwoLevel) {
                smartRefreshLayout.f209980c1.mo127126f(RefreshState.TwoLevelFinish);
                if (SmartRefreshLayout.this.f209977b == 0) {
                    mo127125e(0, false);
                    SmartRefreshLayout.this.m223752D(RefreshState.None);
                    return this;
                }
                mo127121a(0).setDuration(SmartRefreshLayout.this.f209983e);
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
        @Override // p149l.gnc0
        /* JADX INFO: renamed from: e */
        public gnc0 mo127125e(int i, boolean z) {
            qe50 qe50Var;
            int i2;
            int i3;
            int i4;
            qe50 qe50Var2;
            int i5;
            boolean z2;
            bnc0 bnc0Var;
            bnc0 bnc0Var2;
            bnc0 bnc0Var3;
            bnc0 bnc0Var4;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f209977b != i || (((bnc0Var3 = smartRefreshLayout.f209972X0) != null && bnc0Var3.mo102767e()) || ((bnc0Var4 = SmartRefreshLayout.this.f209973Y0) != null && bnc0Var4.mo102767e()))) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i6 = smartRefreshLayout2.f209977b;
                smartRefreshLayout2.f209977b = i;
                float f = 10.0f;
                if (z) {
                    RefreshState refreshState = smartRefreshLayout2.f209984e1;
                    if (refreshState.isDragging || refreshState.isOpening) {
                        float f2 = i;
                        float f3 = smartRefreshLayout2.f209967U0;
                        if (f3 < 10.0f) {
                            f3 *= smartRefreshLayout2.f209951M0;
                        }
                        if (f2 <= f3) {
                            float f4 = -i;
                            float f5 = smartRefreshLayout2.f209969V0;
                            if (f5 < 10.0f) {
                                f5 *= smartRefreshLayout2.f209955O0;
                            }
                            if (f4 > f5 && !smartRefreshLayout2.f209964T) {
                                smartRefreshLayout2.f209980c1.mo127126f(RefreshState.ReleaseToLoad);
                            } else if (i < 0 && !smartRefreshLayout2.f209964T) {
                                smartRefreshLayout2.f209980c1.mo127126f(RefreshState.PullUpToLoad);
                            } else if (i > 0) {
                                smartRefreshLayout2.f209980c1.mo127126f(RefreshState.PullDownToRefresh);
                            }
                        } else if (smartRefreshLayout2.f209982d1 != RefreshState.ReleaseToTwoLevel) {
                            smartRefreshLayout2.f209980c1.mo127126f(RefreshState.ReleaseToRefresh);
                        }
                    }
                }
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                if (smartRefreshLayout3.f209974Z0 != null) {
                    if (i < 0) {
                        i5 = 0;
                        z2 = false;
                    } else if (smartRefreshLayout3.m223749A(smartRefreshLayout3.f209936F, smartRefreshLayout3.f209972X0)) {
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
                        if (smartRefreshLayout4.m223749A(smartRefreshLayout4.f209938G, smartRefreshLayout4.f209973Y0)) {
                            i5 = i;
                            z2 = true;
                        } else if (i6 > 0) {
                            z2 = true;
                            i5 = 0;
                        }
                    }
                    if (z2) {
                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                        smartRefreshLayout5.f209974Z0.mo107753e(i5, smartRefreshLayout5.f210011s, smartRefreshLayout5.f210012t);
                        SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                        if (smartRefreshLayout6.f209964T && smartRefreshLayout6.f209966U && smartRefreshLayout6.f209940H) {
                            bnc0 bnc0Var5 = smartRefreshLayout6.f209973Y0;
                            if ((bnc0Var5 instanceof enc0) && bnc0Var5.getSpinnerStyle() == nof0.f139831d) {
                                SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                                if (smartRefreshLayout7.m223781z(smartRefreshLayout7.f209932C)) {
                                    SmartRefreshLayout.this.f209973Y0.getView().setTranslationY(Math.max(0, i5));
                                }
                            }
                        }
                        SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                        boolean z3 = (smartRefreshLayout8.f209933D && (bnc0Var2 = smartRefreshLayout8.f209972X0) != null && bnc0Var2.getSpinnerStyle() == nof0.f139833f) || SmartRefreshLayout.this.f209988g1 != 0;
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        boolean z4 = (smartRefreshLayout9.f209934E && (bnc0Var = smartRefreshLayout9.f209973Y0) != null && bnc0Var.getSpinnerStyle() == nof0.f139833f) || SmartRefreshLayout.this.f209990h1 != 0;
                        if ((z3 && (i5 >= 0 || i6 > 0)) || (z4 && (i5 <= 0 || i6 < 0))) {
                            smartRefreshLayout2.invalidate();
                        }
                    }
                }
                float f6 = 1.0f;
                if ((i >= 0 || i6 > 0) && SmartRefreshLayout.this.f209972X0 != null) {
                    int iMax = Math.max(i, 0);
                    SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                    int i7 = smartRefreshLayout10.f209951M0;
                    float f7 = smartRefreshLayout10.f209963S0;
                    if (f7 < 10.0f) {
                        f7 *= i7;
                    }
                    int i8 = (int) f7;
                    float f8 = iMax * 1.0f;
                    float f9 = smartRefreshLayout10.f209967U0;
                    if (f9 < 10.0f) {
                        f9 *= i7;
                    }
                    float f10 = f8 / f9;
                    if (smartRefreshLayout10.m223781z(smartRefreshLayout10.f209931B) || (SmartRefreshLayout.this.f209982d1 == RefreshState.RefreshFinish && !z)) {
                        SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                        if (i6 != smartRefreshLayout11.f209977b) {
                            nof0 spinnerStyle = smartRefreshLayout11.f209972X0.getSpinnerStyle();
                            nof0 nof0Var = nof0.f139831d;
                            SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                            if (spinnerStyle == nof0Var) {
                                smartRefreshLayout12.f209972X0.getView().setTranslationY(SmartRefreshLayout.this.f209977b);
                                SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                                if (smartRefreshLayout13.f209988g1 != 0 && smartRefreshLayout13.f209976a1 != null && !smartRefreshLayout13.m223749A(smartRefreshLayout13.f209936F, smartRefreshLayout13.f209972X0)) {
                                    smartRefreshLayout2.invalidate();
                                }
                            } else {
                                if (smartRefreshLayout12.f209972X0.getSpinnerStyle().f139839c) {
                                    View view = SmartRefreshLayout.this.f209972X0.getView();
                                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : SmartRefreshLayout.f209929t1;
                                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((SmartRefreshLayout.this.f209977b - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                                    int i9 = marginLayoutParams.leftMargin;
                                    int i10 = marginLayoutParams.topMargin + SmartRefreshLayout.this.f209959Q0;
                                    view.layout(i9, i10, view.getMeasuredWidth() + i9, view.getMeasuredHeight() + i10);
                                }
                                SmartRefreshLayout.this.f209972X0.mo102771l(z, f10, iMax, i7, i8);
                            }
                            SmartRefreshLayout.this.f209972X0.mo102771l(z, f10, iMax, i7, i8);
                        } else {
                            f = 10.0f;
                            f6 = 1.0f;
                        }
                        if (z && SmartRefreshLayout.this.f209972X0.mo102767e()) {
                            int i11 = (int) SmartRefreshLayout.this.f209993j;
                            int width = smartRefreshLayout2.getWidth();
                            SmartRefreshLayout smartRefreshLayout14 = SmartRefreshLayout.this;
                            smartRefreshLayout14.f209972X0.mo102766d(smartRefreshLayout14.f209993j / (width == 0 ? 1 : width), i11, width);
                        }
                    } else {
                        f = 10.0f;
                        f6 = 1.0f;
                    }
                    SmartRefreshLayout smartRefreshLayout15 = SmartRefreshLayout.this;
                    if (i6 != smartRefreshLayout15.f209977b && (qe50Var = smartRefreshLayout15.f209937F0) != null) {
                        bnc0 bnc0Var6 = smartRefreshLayout15.f209972X0;
                        if (bnc0Var6 instanceof fnc0) {
                            qe50Var.mo96446A0((fnc0) bnc0Var6, z, f10, iMax, i7, i8);
                        }
                    }
                } else {
                    f = 10.0f;
                    f6 = 1.0f;
                }
                if ((i <= 0 || i6 < 0) && SmartRefreshLayout.this.f209973Y0 != null) {
                    int i12 = -Math.min(i, 0);
                    SmartRefreshLayout smartRefreshLayout16 = SmartRefreshLayout.this;
                    int i13 = smartRefreshLayout16.f209955O0;
                    float f11 = smartRefreshLayout16.f209965T0;
                    if (f11 < f) {
                        f11 *= i13;
                    }
                    int i14 = (int) f11;
                    float f12 = i12 * f6;
                    float f13 = smartRefreshLayout16.f209969V0;
                    if (f13 < f) {
                        f13 *= i13;
                    }
                    float f14 = f12 / f13;
                    if (smartRefreshLayout16.m223781z(smartRefreshLayout16.f209932C) || (SmartRefreshLayout.this.f209982d1 == RefreshState.LoadFinish && !z)) {
                        SmartRefreshLayout smartRefreshLayout17 = SmartRefreshLayout.this;
                        if (i6 != smartRefreshLayout17.f209977b) {
                            nof0 spinnerStyle2 = smartRefreshLayout17.f209973Y0.getSpinnerStyle();
                            nof0 nof0Var2 = nof0.f139831d;
                            SmartRefreshLayout smartRefreshLayout18 = SmartRefreshLayout.this;
                            if (spinnerStyle2 == nof0Var2) {
                                smartRefreshLayout18.f209973Y0.getView().setTranslationY(SmartRefreshLayout.this.f209977b);
                                SmartRefreshLayout smartRefreshLayout19 = SmartRefreshLayout.this;
                                if (smartRefreshLayout19.f209990h1 != 0 && smartRefreshLayout19.f209976a1 != null && !smartRefreshLayout19.m223749A(smartRefreshLayout19.f209938G, smartRefreshLayout19.f209973Y0)) {
                                    smartRefreshLayout2.invalidate();
                                }
                            } else if (smartRefreshLayout18.f209973Y0.getSpinnerStyle().f139839c) {
                                View view2 = SmartRefreshLayout.this.f209973Y0.getView();
                                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : SmartRefreshLayout.f209929t1;
                                view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(((-SmartRefreshLayout.this.f209977b) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), 1073741824));
                                int i15 = marginLayoutParams2.leftMargin;
                                int measuredHeight = (marginLayoutParams2.topMargin + smartRefreshLayout2.getMeasuredHeight()) - SmartRefreshLayout.this.f209961R0;
                                view2.layout(i15, measuredHeight - view2.getMeasuredHeight(), view2.getMeasuredWidth() + i15, measuredHeight);
                            }
                            i2 = i12;
                            i3 = i13;
                            i4 = i14;
                            SmartRefreshLayout.this.f209973Y0.mo102771l(z, f14, i2, i3, i4);
                        } else {
                            i2 = i12;
                            i3 = i13;
                            i4 = i14;
                        }
                        if (z && SmartRefreshLayout.this.f209973Y0.mo102767e()) {
                            int i16 = (int) SmartRefreshLayout.this.f209993j;
                            int width2 = smartRefreshLayout2.getWidth();
                            SmartRefreshLayout smartRefreshLayout20 = SmartRefreshLayout.this;
                            smartRefreshLayout20.f209973Y0.mo102766d(smartRefreshLayout20.f209993j / (width2 != 0 ? width2 : 1), i16, width2);
                        }
                    } else {
                        i2 = i12;
                        i3 = i13;
                        i4 = i14;
                    }
                    SmartRefreshLayout smartRefreshLayout21 = SmartRefreshLayout.this;
                    if (i6 != smartRefreshLayout21.f209977b && (qe50Var2 = smartRefreshLayout21.f209937F0) != null) {
                        bnc0 bnc0Var7 = smartRefreshLayout21.f209973Y0;
                        if (bnc0Var7 instanceof enc0) {
                            qe50Var2.mo96451k((enc0) bnc0Var7, z, f14, i2, i3, i4);
                        }
                    }
                }
            }
            return this;
        }

        @Override // p149l.gnc0
        /* JADX INFO: renamed from: f */
        public gnc0 mo127126f(@NonNull RefreshState refreshState) {
            switch (C22636a.f210019a[refreshState.ordinal()]) {
                case 1:
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    RefreshState refreshState2 = smartRefreshLayout.f209982d1;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.f209977b == 0) {
                        smartRefreshLayout.m223752D(refreshState3);
                    } else if (smartRefreshLayout.f209977b != 0) {
                        mo127121a(0);
                    }
                    break;
                case 2:
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout2.f209982d1.isOpening && smartRefreshLayout2.m223781z(smartRefreshLayout2.f209931B)) {
                        SmartRefreshLayout.this.m223752D(RefreshState.PullDownToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.m223781z(smartRefreshLayout3.f209932C)) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        RefreshState refreshState4 = smartRefreshLayout4.f209982d1;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!smartRefreshLayout4.f209964T || !smartRefreshLayout4.f209940H || !smartRefreshLayout4.f209966U)) {
                            smartRefreshLayout4.m223752D(RefreshState.PullUpToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout5.f209982d1.isOpening && smartRefreshLayout5.m223781z(smartRefreshLayout5.f209931B)) {
                        SmartRefreshLayout.this.m223752D(RefreshState.PullDownCanceled);
                        mo127126f(RefreshState.None);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.m223781z(smartRefreshLayout6.f209932C)) {
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        if (!smartRefreshLayout7.f209982d1.isOpening && (!smartRefreshLayout7.f209964T || !smartRefreshLayout7.f209940H || !smartRefreshLayout7.f209966U)) {
                            smartRefreshLayout7.m223752D(RefreshState.PullUpCanceled);
                            mo127126f(RefreshState.None);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpCanceled);
                    break;
                case 6:
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout8.f209982d1.isOpening && smartRefreshLayout8.m223781z(smartRefreshLayout8.f209931B)) {
                        SmartRefreshLayout.this.m223752D(RefreshState.ReleaseToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    if (smartRefreshLayout9.m223781z(smartRefreshLayout9.f209932C)) {
                        SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                        RefreshState refreshState5 = smartRefreshLayout10.f209982d1;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!smartRefreshLayout10.f209964T || !smartRefreshLayout10.f209940H || !smartRefreshLayout10.f209966U)) {
                            smartRefreshLayout10.m223752D(RefreshState.ReleaseToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout11.f209982d1.isOpening && smartRefreshLayout11.m223781z(smartRefreshLayout11.f209931B)) {
                        SmartRefreshLayout.this.m223752D(RefreshState.ReleaseToTwoLevel);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout12.f209982d1.isOpening && smartRefreshLayout12.m223781z(smartRefreshLayout12.f209931B)) {
                        SmartRefreshLayout.this.m223752D(RefreshState.RefreshReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout13.f209982d1.isOpening && smartRefreshLayout13.m223781z(smartRefreshLayout13.f209932C)) {
                        SmartRefreshLayout.this.m223752D(RefreshState.LoadReleased);
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
                    SmartRefreshLayout.this.m223752D(refreshState);
                    break;
            }
            return null;
        }
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209983e = 300;
        this.f209985f = 300;
        this.f209998l = 0.5f;
        this.f210000m = 'n';
        this.f210009q = -1;
        this.f210010r = -1;
        this.f210011s = -1;
        this.f210012t = -1;
        this.f209931B = true;
        this.f209932C = false;
        this.f209933D = true;
        this.f209934E = true;
        this.f209936F = true;
        this.f209938G = true;
        this.f209940H = false;
        this.f209942I = true;
        this.f209944J = true;
        this.f209946K = false;
        this.f209948L = true;
        this.f209950M = false;
        this.f209952N = true;
        this.f209954O = true;
        this.f209956P = true;
        this.f209958Q = true;
        this.f209960R = false;
        this.f209962S = false;
        this.f209964T = false;
        this.f209966U = false;
        this.f209968V = false;
        this.f209970W = false;
        this.f209996k0 = false;
        this.f209945J0 = new int[2];
        this.f209947K0 = new t920(this);
        this.f209949L0 = new x920(this);
        f1e f1eVar = f1e.f94079c;
        this.f209953N0 = f1eVar;
        this.f209957P0 = f1eVar;
        this.f209963S0 = 2.5f;
        this.f209965T0 = 2.5f;
        this.f209967U0 = 1.0f;
        this.f209969V0 = 1.0f;
        this.f209971W0 = 0.16666667f;
        this.f209980c1 = new C22649n();
        RefreshState refreshState = RefreshState.None;
        this.f209982d1 = refreshState;
        this.f209984e1 = refreshState;
        this.f209986f1 = 0L;
        this.f209988g1 = 0;
        this.f209990h1 = 0;
        this.f209999l1 = false;
        this.f210001m1 = false;
        this.f210003n1 = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f209978b1 = new Handler(Looper.getMainLooper());
        this.f210016x = new Scroller(context);
        this.f210017y = VelocityTracker.obtain();
        this.f209987g = context.getResources().getDisplayMetrics().heightPixels;
        this.f210018z = new ikf0(ikf0.f113664b);
        this.f209975a = viewConfiguration.getScaledTouchSlop();
        this.f210013u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f210014v = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f209955O0 = ikf0.m136789c(60.0f);
        this.f209951M0 = ikf0.m136789c(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74450j1);
        if (!typedArrayObtainStyledAttributes.hasValue(b9c0.f74464l1)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(b9c0.f74457k1)) {
            super.setClipChildren(false);
        }
        dqd dqdVar = f209928s1;
        if (dqdVar != null) {
            dqdVar.mo112999a(context, this);
        }
        this.f209998l = typedArrayObtainStyledAttributes.getFloat(b9c0.f74492p1, this.f209998l);
        this.f209963S0 = typedArrayObtainStyledAttributes.getFloat(b9c0.f74327Q1, this.f209963S0);
        this.f209965T0 = typedArrayObtainStyledAttributes.getFloat(b9c0.f74297L1, this.f209965T0);
        this.f209967U0 = typedArrayObtainStyledAttributes.getFloat(b9c0.f74339S1, this.f209967U0);
        this.f209969V0 = typedArrayObtainStyledAttributes.getFloat(b9c0.f74309N1, this.f209969V0);
        this.f209931B = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74249E1, this.f209931B);
        this.f209985f = typedArrayObtainStyledAttributes.getInt(b9c0.f74351U1, this.f209985f);
        this.f209932C = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74548x1, this.f209932C);
        this.f209951M0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b9c0.f74315O1, this.f209951M0);
        this.f209955O0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b9c0.f74284J1, this.f209955O0);
        this.f209959Q0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b9c0.f74321P1, this.f209959Q0);
        this.f209961R0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b9c0.f74291K1, this.f209961R0);
        this.f209960R = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74485o1, this.f209960R);
        this.f209962S = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74478n1, this.f209962S);
        this.f209936F = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74541w1, this.f209936F);
        this.f209938G = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74534v1, this.f209938G);
        this.f209942I = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74235C1, this.f209942I);
        this.f209948L = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74499q1, this.f209948L);
        this.f209944J = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74221A1, this.f209944J);
        this.f209950M = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74242D1, this.f209950M);
        this.f209952N = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74256F1, this.f209952N);
        this.f209954O = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74263G1, this.f209954O);
        this.f209956P = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74555y1, this.f209956P);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74520t1, this.f209940H);
        this.f209940H = z;
        this.f209940H = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74527u1, z);
        this.f209933D = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74513s1, this.f209933D);
        this.f209934E = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74506r1, this.f209934E);
        this.f209946K = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74228B1, this.f209946K);
        this.f210009q = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74277I1, this.f210009q);
        this.f210010r = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74270H1, this.f210010r);
        this.f210011s = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74333R1, this.f210011s);
        this.f210012t = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74303M1, this.f210012t);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74562z1, this.f209958Q);
        this.f209958Q = z2;
        this.f209947K0.m187594n(z2);
        this.f209968V = this.f209968V || typedArrayObtainStyledAttributes.hasValue(b9c0.f74548x1);
        this.f209970W = this.f209970W || typedArrayObtainStyledAttributes.hasValue(b9c0.f74541w1);
        this.f209996k0 = this.f209996k0 || typedArrayObtainStyledAttributes.hasValue(b9c0.f74534v1);
        this.f209953N0 = typedArrayObtainStyledAttributes.hasValue(b9c0.f74315O1) ? f1e.f94085i : this.f209953N0;
        this.f209957P0 = typedArrayObtainStyledAttributes.hasValue(b9c0.f74284J1) ? f1e.f94085i : this.f209957P0;
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.f74471m1, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(b9c0.f74345T1, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.f209930A = new int[]{color2, color};
            } else {
                this.f209930A = new int[]{color2};
            }
        } else if (color != 0) {
            this.f209930A = new int[]{0, color};
        }
        if (this.f209950M && !this.f209968V && !this.f209932C) {
            this.f209932C = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void setDefaultRefreshFooterCreator(@NonNull bqd bqdVar) {
        f209926q1 = bqdVar;
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull cqd cqdVar) {
        f209927r1 = cqdVar;
    }

    public static void setDefaultRefreshInitializer(@NonNull dqd dqdVar) {
        f209928s1 = dqdVar;
    }

    /* JADX INFO: renamed from: A */
    public boolean m223749A(boolean z, @Nullable bnc0 bnc0Var) {
        return z || this.f209950M || bnc0Var == null || bnc0Var.getSpinnerStyle() == nof0.f139833f;
    }

    /* JADX INFO: renamed from: B */
    public boolean m223750B() {
        return this.f209982d1 == RefreshState.Refreshing;
    }

    /* JADX INFO: renamed from: C */
    public void m223751C(float f) {
        RefreshState refreshState;
        float f2 = (!this.f209943I0 || this.f209956P || f >= 0.0f || this.f209974Z0.mo107755g()) ? f : 0.0f;
        if (f2 > this.f209987g * 5 && getTag() == null && getTag(p4c0.f147074J0) == null) {
            float f3 = this.f209995k;
            int i = this.f209987g;
            if (f3 < i / 6.0f && this.f209993j < i / 16.0f) {
                lsi0.m151595y("你这么死拉，臣妾做不到啊！");
                setTag(p4c0.f147074J0, "你这么死拉，臣妾做不到啊！");
            }
        }
        RefreshState refreshState2 = this.f209982d1;
        if (refreshState2 == RefreshState.TwoLevel && f2 > 0.0f) {
            this.f209980c1.mo127125e(Math.min((int) f2, getMeasuredHeight()), true);
        } else if (refreshState2 == RefreshState.Refreshing && f2 >= 0.0f) {
            int i2 = this.f209951M0;
            if (f2 < i2) {
                this.f209980c1.mo127125e((int) f2, true);
            } else {
                float f4 = this.f209963S0;
                if (f4 < 10.0f) {
                    f4 *= i2;
                }
                double d = f4 - i2;
                int iMax = Math.max((this.f209987g * 4) / 3, getHeight());
                int i3 = this.f209951M0;
                double d2 = iMax - i3;
                double dMax = Math.max(0.0f, (f2 - i3) * this.f209998l);
                double d3 = -dMax;
                if (d2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    d2 = 1.0d;
                }
                this.f209980c1.mo127125e(((int) Math.min(d * (1.0d - Math.pow(100.0d, d3 / d2)), dMax)) + this.f209951M0, true);
            }
        } else if (f2 < 0.0f && (refreshState2 == RefreshState.Loading || ((this.f209940H && this.f209964T && this.f209966U && m223781z(this.f209932C)) || (this.f209948L && !this.f209964T && m223781z(this.f209932C))))) {
            int i4 = this.f209955O0;
            if (f2 > (-i4)) {
                this.f209980c1.mo127125e((int) f2, true);
            } else {
                float f5 = this.f209965T0;
                if (f5 < 10.0f) {
                    f5 *= i4;
                }
                double d4 = f5 - i4;
                int iMax2 = Math.max((this.f209987g * 4) / 3, getHeight());
                int i5 = this.f209955O0;
                double d5 = iMax2 - i5;
                double d6 = -Math.min(0.0f, (i5 + f2) * this.f209998l);
                double d7 = -d6;
                if (d5 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    d5 = 1.0d;
                }
                this.f209980c1.mo127125e(((int) (-Math.min(d4 * (1.0d - Math.pow(100.0d, d7 / d5)), d6))) - this.f209955O0, true);
            }
        } else if (f2 >= 0.0f) {
            float f6 = this.f209963S0;
            double d8 = f6 < 10.0f ? this.f209951M0 * f6 : f6;
            double dMax2 = Math.max(this.f209987g / 2, getHeight());
            double dMax3 = Math.max(0.0f, this.f209998l * f2);
            double d9 = -dMax3;
            if (dMax2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                dMax2 = 1.0d;
            }
            this.f209980c1.mo127125e((int) Math.min(d8 * (1.0d - Math.pow(100.0d, d9 / dMax2)), dMax3), true);
        } else {
            float f7 = this.f209965T0;
            double d10 = f7 < 10.0f ? this.f209955O0 * f7 : f7;
            double dMax4 = Math.max(this.f209987g / 2, getHeight());
            double d11 = -Math.min(0.0f, this.f209998l * f2);
            double d12 = -d11;
            if (dMax4 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                dMax4 = 1.0d;
            }
            this.f209980c1.mo127125e((int) (-Math.min(d10 * (1.0d - Math.pow(100.0d, d12 / dMax4)), d11)), true);
        }
        if (!this.f209948L || this.f209964T || !m223781z(this.f209932C) || f2 >= 0.0f || (refreshState = this.f209982d1) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
            return;
        }
        if (this.f209962S) {
            this.f210005o1 = null;
            this.f209980c1.mo127121a(-this.f209955O0);
        }
        setStateDirectLoading(false);
        this.f209978b1.postDelayed(new RunnableC22641f(), this.f209985f);
    }

    /* JADX INFO: renamed from: D */
    public void m223752D(RefreshState refreshState) {
        RefreshState refreshState2 = this.f209982d1;
        if (refreshState2 == refreshState) {
            if (this.f209984e1 != refreshState2) {
                this.f209984e1 = refreshState2;
                return;
            }
            return;
        }
        this.f209982d1 = refreshState;
        this.f209984e1 = refreshState;
        bnc0 bnc0Var = this.f209972X0;
        bnc0 bnc0Var2 = this.f209973Y0;
        qe50 qe50Var = this.f209937F0;
        if (bnc0Var != null) {
            bnc0Var.mo55758f(this, refreshState2, refreshState);
        }
        if (bnc0Var2 != null) {
            bnc0Var2.mo55758f(this, refreshState2, refreshState);
        }
        if (qe50Var != null) {
            qe50Var.mo55758f(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.f209999l1 = false;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m223753E() {
        RefreshState refreshState = this.f209982d1;
        if (refreshState == RefreshState.TwoLevel) {
            if (this.f210015w <= -1000 || this.f209977b <= getHeight() / 2) {
                if (this.f210002n) {
                    this.f209980c1.mo127124d();
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimatorMo127121a = this.f209980c1.mo127121a(getHeight());
                if (valueAnimatorMo127121a != null) {
                    valueAnimatorMo127121a.setDuration(this.f209983e);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState == refreshState2 || (this.f209940H && this.f209964T && this.f209966U && this.f209977b < 0 && m223781z(this.f209932C))) {
            int i = this.f209977b;
            int i2 = this.f209955O0;
            if (i < (-i2)) {
                this.f209980c1.mo127121a(-i2);
                return;
            } else {
                if (i > 0) {
                    this.f209980c1.mo127121a(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState3 = this.f209982d1;
        RefreshState refreshState4 = RefreshState.Refreshing;
        if (refreshState3 == refreshState4) {
            int i3 = this.f209977b;
            int i4 = this.f209951M0;
            if (i3 > i4) {
                this.f209980c1.mo127121a(i4);
                return;
            } else {
                if (i3 < 0) {
                    this.f209980c1.mo127121a(0);
                    return;
                }
                return;
            }
        }
        if (refreshState3 == RefreshState.PullDownToRefresh) {
            this.f209980c1.mo127126f(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState3 == RefreshState.PullUpToLoad) {
            this.f209980c1.mo127126f(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToRefresh) {
            this.f209980c1.mo127126f(refreshState4);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToLoad) {
            this.f209980c1.mo127126f(refreshState2);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToTwoLevel) {
            this.f209980c1.mo127126f(RefreshState.TwoLevelReleased);
            return;
        }
        if (refreshState3 == RefreshState.RefreshReleased) {
            if (this.f210008p1 == null) {
                this.f209980c1.mo127121a(this.f209951M0);
            }
        } else if (refreshState3 == RefreshState.LoadReleased) {
            if (this.f210008p1 == null) {
                this.f209980c1.mo127121a(-this.f209955O0);
            }
        } else {
            if (refreshState3 == RefreshState.LoadFinish || this.f209977b == 0) {
                return;
            }
            this.f209980c1.mo127121a(0);
        }
    }

    /* JADX INFO: renamed from: F */
    public hnc0 m223754F(boolean z) {
        this.f209948L = z;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public hnc0 m223755G(boolean z) {
        this.f209968V = true;
        this.f209932C = z;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public hnc0 m223756H(boolean z) {
        this.f209956P = z;
        cnc0 cnc0Var = this.f209974Z0;
        if (cnc0Var != null) {
            cnc0Var.mo107750b(z);
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public hnc0 m223757I(boolean z) {
        this.f209931B = z;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public hnc0 m223758J(float f) {
        this.f209965T0 = f;
        bnc0 bnc0Var = this.f209973Y0;
        if (bnc0Var == null || !this.f209997k1) {
            this.f209957P0 = this.f209957P0.m119112c();
            return this;
        }
        if (f < 10.0f) {
            f *= this.f209955O0;
        }
        bnc0Var.mo102770i(this.f209980c1, this.f209955O0, (int) f);
        return this;
    }

    /* JADX INFO: renamed from: K */
    public hnc0 m223759K(float f) {
        this.f209963S0 = f;
        bnc0 bnc0Var = this.f209972X0;
        if (bnc0Var == null || !this.f209997k1) {
            this.f209953N0 = this.f209953N0.m119112c();
            return this;
        }
        if (f < 10.0f) {
            f *= this.f209951M0;
        }
        bnc0Var.mo102770i(this.f209980c1, this.f209951M0, (int) f);
        return this;
    }

    /* JADX INFO: renamed from: L */
    public hnc0 m223760L(boolean z) {
        RefreshState refreshState = this.f209982d1;
        if (refreshState == RefreshState.Refreshing && z) {
            m223779x();
            return this;
        }
        if (refreshState == RefreshState.Loading && z) {
            m223774s();
            return this;
        }
        if (this.f209964T == z) {
            return this;
        }
        this.f209964T = z;
        bnc0 bnc0Var = this.f209973Y0;
        if (!(bnc0Var instanceof enc0)) {
            return this;
        }
        if (!((enc0) bnc0Var).m117257b(z)) {
            this.f209966U = false;
            tqq0.m190155a("Footer:", this.f209973Y0, " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])");
            return null;
        }
        this.f209966U = true;
        if (!this.f209964T || !this.f209940H || this.f209977b <= 0 || this.f209973Y0.getSpinnerStyle() != nof0.f139831d || !m223781z(this.f209932C) || !m223749A(this.f209931B, this.f209972X0)) {
            return this;
        }
        this.f209973Y0.getView().setTranslationY(this.f209977b);
        return this;
    }

    /* JADX INFO: renamed from: M */
    public hnc0 mo223158M(me50 me50Var) {
        this.f209935E0 = me50Var;
        this.f209932C = this.f209932C || !(this.f209968V || me50Var == null);
        return this;
    }

    /* JADX INFO: renamed from: N */
    public hnc0 m223761N(qe50 qe50Var) {
        this.f209937F0 = qe50Var;
        return this;
    }

    /* JADX INFO: renamed from: O */
    public hnc0 mo223159O(df50 df50Var) {
        this.f210007p0 = df50Var;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public hnc0 mo223160P(ef50 ef50Var) {
        this.f210007p0 = ef50Var;
        this.f209935E0 = ef50Var;
        this.f209932C = this.f209932C || !(this.f209968V || ef50Var == null);
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public hnc0 mo223161Q(@NonNull enc0 enc0Var) {
        return mo223162R(enc0Var, 0, 0);
    }

    /* JADX INFO: renamed from: R */
    public hnc0 mo223162R(@NonNull enc0 enc0Var, int i, int i2) {
        bnc0 bnc0Var;
        bnc0 bnc0Var2 = this.f209973Y0;
        if (bnc0Var2 != null) {
            super.removeView(bnc0Var2.getView());
        }
        this.f209973Y0 = enc0Var;
        this.f209999l1 = false;
        this.f209990h1 = 0;
        this.f209966U = false;
        this.f209994j1 = false;
        this.f209957P0 = f1e.f94079c;
        this.f209932C = !this.f209968V || this.f209932C;
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -2;
        }
        C22648m c22648m = new C22648m(i, i2);
        ViewGroup.LayoutParams layoutParams = enc0Var.getView().getLayoutParams();
        if (layoutParams instanceof C22648m) {
            c22648m = (C22648m) layoutParams;
        }
        boolean z = this.f209973Y0.getSpinnerStyle().f139838b;
        bnc0 bnc0Var3 = this.f209973Y0;
        if (z) {
            super.addView(bnc0Var3.getView(), getChildCount(), c22648m);
        } else {
            super.addView(bnc0Var3.getView(), 0, c22648m);
        }
        int[] iArr = this.f209930A;
        if (iArr != null && (bnc0Var = this.f209973Y0) != null) {
            bnc0Var.setPrimaryColors(iArr);
        }
        return this;
    }

    /* JADX INFO: renamed from: S */
    public hnc0 mo223163S(@NonNull fnc0 fnc0Var) {
        return mo223164T(fnc0Var, 0, 0);
    }

    /* JADX INFO: renamed from: T */
    public hnc0 mo223164T(@NonNull fnc0 fnc0Var, int i, int i2) {
        bnc0 bnc0Var;
        bnc0 bnc0Var2 = this.f209972X0;
        if (bnc0Var2 != null) {
            super.removeView(bnc0Var2.getView());
        }
        this.f209972X0 = fnc0Var;
        this.f209988g1 = 0;
        this.f209992i1 = false;
        this.f209953N0 = f1e.f94079c;
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -2;
        }
        C22648m c22648m = new C22648m(i, i2);
        ViewGroup.LayoutParams layoutParams = fnc0Var.getView().getLayoutParams();
        if (layoutParams instanceof C22648m) {
            c22648m = (C22648m) layoutParams;
        }
        boolean z = this.f209972X0.getSpinnerStyle().f139838b;
        bnc0 bnc0Var3 = this.f209972X0;
        if (z) {
            super.addView(bnc0Var3.getView(), getChildCount(), c22648m);
        } else {
            super.addView(bnc0Var3.getView(), 0, c22648m);
        }
        int[] iArr = this.f209930A;
        if (iArr != null && (bnc0Var = this.f209972X0) != null) {
            bnc0Var.setPrimaryColors(iArr);
        }
        return this;
    }

    /* JADX INFO: renamed from: U */
    public boolean m223762U(float f) {
        if (f == 0.0f) {
            f = this.f210015w;
        }
        if (Build.VERSION.SDK_INT > 27 && this.f209974Z0 != null) {
            getScaleY();
            View view = this.f209974Z0.getView();
            if (getScaleY() == -1.0f && view.getScaleY() == -1.0f) {
                f = -f;
            }
        }
        if (Math.abs(f) > this.f210013u) {
            int i = this.f209977b;
            if (i * f < 0.0f) {
                RefreshState refreshState = this.f209982d1;
                if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading || (i < 0 && this.f209964T)) {
                    this.f210005o1 = new RunnableC22647l(f).m223782a();
                    return true;
                }
                if (refreshState.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f < 0.0f && ((this.f209944J && (this.f209932C || this.f209946K)) || ((this.f209982d1 == RefreshState.Loading && i >= 0) || (this.f209948L && m223781z(this.f209932C))))) || (f > 0.0f && ((this.f209944J && this.f209931B) || this.f209946K || (this.f209982d1 == RefreshState.Refreshing && this.f209977b <= 0)))) {
                this.f210001m1 = false;
                this.f210016x.fling(0, 0, 0, (int) (-f), 0, 0, -2147483647, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                this.f210016x.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    @Override // p149l.hnc0
    /* JADX INFO: renamed from: a */
    public hnc0 mo131887a(boolean z) {
        setNestedScrollingEnabled(z);
        return this;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f210016x.getCurrY();
        if (this.f210016x.computeScrollOffset()) {
            int finalY = this.f210016x.getFinalY();
            if ((finalY >= 0 || !((this.f209931B || this.f209946K) && this.f209974Z0.mo107758j())) && (finalY <= 0 || !((this.f209932C || this.f209946K) && this.f209974Z0.mo107755g()))) {
                this.f210001m1 = true;
                invalidate();
            } else {
                if (this.f210001m1) {
                    Scroller scroller = this.f210016x;
                    m223764i(finalY > 0 ? -scroller.getCurrVelocity() : scroller.getCurrVelocity());
                }
                this.f210016x.forceFinished(true);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instruction units count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p147v.smart_refresh.SmartRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Paint paint;
        Paint paint2;
        cnc0 cnc0Var = this.f209974Z0;
        View view2 = cnc0Var != null ? cnc0Var.getView() : null;
        bnc0 bnc0Var = this.f209972X0;
        if (bnc0Var != null && bnc0Var.getView() == view) {
            if (!m223781z(this.f209931B) || (!this.f209942I && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getTop() + view2.getPaddingTop() + this.f209977b, view.getTop());
                int i = this.f209988g1;
                if (i != 0 && (paint2 = this.f209976a1) != null) {
                    paint2.setColor(i);
                    if (this.f209972X0.getSpinnerStyle().f139839c) {
                        iMax = view.getBottom();
                    } else if (this.f209972X0.getSpinnerStyle() == nof0.f139831d) {
                        iMax = view.getBottom() + this.f209977b;
                    }
                    int i2 = iMax;
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), i2, this.f209976a1);
                    iMax = i2;
                }
                if ((this.f209933D && this.f209972X0.getSpinnerStyle() == nof0.f139833f) || this.f209972X0.getSpinnerStyle().f139839c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        bnc0 bnc0Var2 = this.f209973Y0;
        if (bnc0Var2 != null && bnc0Var2.getView() == view) {
            if (!m223781z(this.f209932C) || (!this.f209942I && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f209977b, view.getBottom());
                int i3 = this.f209990h1;
                if (i3 != 0 && (paint = this.f209976a1) != null) {
                    paint.setColor(i3);
                    if (this.f209973Y0.getSpinnerStyle().f139839c) {
                        iMin = view.getTop();
                    } else if (this.f209973Y0.getSpinnerStyle() == nof0.f139831d) {
                        iMin = view.getTop() + this.f209977b;
                    }
                    int i4 = iMin;
                    canvas.drawRect(0.0f, i4, getWidth(), view.getBottom(), this.f209976a1);
                    iMin = i4;
                }
                if ((this.f209934E && this.f209973Y0.getSpinnerStyle() == nof0.f139833f) || this.f209973Y0.getSpinnerStyle().f139839c) {
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
        return new C22648m(getContext(), attributeSet);
    }

    @Override // p149l.hnc0
    @NonNull
    public ViewGroup getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f209949L0.m207460a();
    }

    @Nullable
    public enc0 getRefreshFooter() {
        bnc0 bnc0Var = this.f209973Y0;
        if (bnc0Var instanceof enc0) {
            return (enc0) bnc0Var;
        }
        return null;
    }

    @Nullable
    public fnc0 getRefreshHeader() {
        bnc0 bnc0Var = this.f209972X0;
        if (bnc0Var instanceof fnc0) {
            return (fnc0) bnc0Var;
        }
        return null;
    }

    @NonNull
    public RefreshState getState() {
        return this.f209982d1;
    }

    /* JADX INFO: renamed from: h */
    public ValueAnimator m223763h(int i, int i2, Interpolator interpolator, int i3) {
        if (this.f209977b == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.f210008p1;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.f210008p1.cancel();
            this.f210008p1 = null;
        }
        this.f210005o1 = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f209977b, i);
        this.f210008p1 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i3);
        this.f210008p1.setInterpolator(interpolator);
        this.f210008p1.addListener(new C22639d());
        this.f210008p1.addUpdateListener(new C22640e());
        this.f210008p1.setStartDelay(i2);
        this.f210008p1.start();
        return this.f210008p1;
    }

    /* JADX INFO: renamed from: i */
    public void m223764i(float f) {
        RefreshState refreshState;
        if (this.f210008p1 == null) {
            if (f > 0.0f && ((refreshState = this.f209982d1) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                this.f210005o1 = new RunnableC22646k(f, this.f209951M0);
                return;
            }
            if (f < 0.0f && (this.f209982d1 == RefreshState.Loading || ((this.f209940H && this.f209964T && this.f209966U && m223781z(this.f209932C)) || (this.f209948L && !this.f209964T && m223781z(this.f209932C) && this.f209982d1 != RefreshState.Refreshing)))) {
                this.f210005o1 = new RunnableC22646k(f, -this.f209955O0);
            } else if (this.f209977b == 0 && this.f209944J) {
                this.f210005o1 = new RunnableC22646k(f, 0);
            }
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        if (this.f209958Q) {
            return this.f209946K || this.f209931B || this.f209932C;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean m223765j(int i, int i2, float f, boolean z) {
        if (this.f209982d1 != RefreshState.None || !m223781z(this.f209932C) || this.f209964T) {
            return false;
        }
        RunnableC22645j runnableC22645j = new RunnableC22645j(f, i2, z);
        setViceState(RefreshState.Loading);
        if (i > 0) {
            this.f209978b1.postDelayed(runnableC22645j, i);
            return true;
        }
        runnableC22645j.run();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public boolean m223766k() {
        return m223765j(0, this.f209985f, (this.f209965T0 + this.f209969V0) / 2.0f, true);
    }

    /* JADX INFO: renamed from: l */
    public boolean m223767l() {
        return m223768m(this.f209997k1 ? 0 : 400, this.f209985f, (this.f209963S0 + this.f209967U0) / 2.0f, false);
    }

    /* JADX INFO: renamed from: m */
    public boolean m223768m(int i, int i2, float f, boolean z) {
        if (this.f209982d1 != RefreshState.None || !m223781z(this.f209931B)) {
            return false;
        }
        this.f209974Z0.mo107757i();
        RunnableC22644i runnableC22644i = new RunnableC22644i(f, i2, z);
        setViceState(RefreshState.Refreshing);
        if (i > 0) {
            this.f209978b1.postDelayed(runnableC22644i, i);
            return true;
        }
        runnableC22644i.run();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m223769n() {
        return m223768m(this.f209997k1 ? 0 : 400, this.f209985f, (this.f209963S0 + this.f209967U0) / 2.0f, true);
    }

    /* JADX INFO: renamed from: o */
    public hnc0 m223770o() {
        return m223773r(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        bnc0 bnc0Var;
        cqd cqdVar;
        super.onAttachedToWindow();
        boolean z = true;
        this.f209997k1 = true;
        if (!isInEditMode()) {
            if (this.f209972X0 == null && (cqdVar = f209927r1) != null) {
                fnc0 fnc0VarMo108247a = cqdVar.mo108247a(getContext(), this);
                if (fnc0VarMo108247a == null) {
                    upk0.m194883a("DefaultRefreshHeaderCreator can not return null");
                    return;
                }
                mo223163S(fnc0VarMo108247a);
            }
            if (this.f209973Y0 == null) {
                bqd bqdVar = f209926q1;
                if (bqdVar != null) {
                    enc0 enc0VarMo103366a = bqdVar.mo103366a(getContext(), this);
                    if (enc0VarMo103366a == null) {
                        upk0.m194883a("DefaultRefreshFooterCreator can not return null");
                        return;
                    }
                    mo223161Q(enc0VarMo103366a);
                }
            } else {
                if (!this.f209932C && this.f209968V) {
                    z = false;
                }
                this.f209932C = z;
            }
            if (this.f209974Z0 == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    bnc0 bnc0Var2 = this.f209972X0;
                    if ((bnc0Var2 == null || childAt != bnc0Var2.getView()) && ((bnc0Var = this.f209973Y0) == null || childAt != bnc0Var.getView())) {
                        this.f209974Z0 = new dnc0(childAt);
                    }
                }
            }
            if (this.f209974Z0 == null) {
                int iM136789c = ikf0.m136789c(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText("The content view in SmartRefreshLayout is empty");
                super.addView(textView, 0, new C22648m(-1, -1));
                dnc0 dnc0Var = new dnc0(textView);
                this.f209974Z0 = dnc0Var;
                dnc0Var.getView().setPadding(iM136789c, iM136789c, iM136789c, iM136789c);
            }
            View viewFindViewById = findViewById(this.f210009q);
            View viewFindViewById2 = findViewById(this.f210010r);
            this.f209974Z0.mo107754f(this.f209939G0);
            this.f209974Z0.mo107750b(this.f209956P);
            this.f209974Z0.mo107752d(this.f209980c1, viewFindViewById, viewFindViewById2);
            if (this.f209977b != 0) {
                m223752D(RefreshState.None);
                cnc0 cnc0Var = this.f209974Z0;
                this.f209977b = 0;
                cnc0Var.mo107753e(0, this.f210011s, this.f210012t);
            }
        }
        int[] iArr = this.f209930A;
        if (iArr != null) {
            bnc0 bnc0Var3 = this.f209972X0;
            if (bnc0Var3 != null) {
                bnc0Var3.setPrimaryColors(iArr);
            }
            bnc0 bnc0Var4 = this.f209973Y0;
            if (bnc0Var4 != null) {
                bnc0Var4.setPrimaryColors(this.f209930A);
            }
        }
        cnc0 cnc0Var2 = this.f209974Z0;
        if (cnc0Var2 != null) {
            super.bringChildToFront(cnc0Var2.getView());
        }
        bnc0 bnc0Var5 = this.f209972X0;
        if (bnc0Var5 != null && bnc0Var5.getSpinnerStyle().f139838b) {
            super.bringChildToFront(this.f209972X0.getView());
        }
        bnc0 bnc0Var6 = this.f209973Y0;
        if (bnc0Var6 == null || !bnc0Var6.getSpinnerStyle().f139838b) {
            return;
        }
        super.bringChildToFront(this.f209973Y0.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f209997k1 = false;
        this.f209968V = true;
        this.f210005o1 = null;
        ValueAnimator valueAnimator = this.f210008p1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f210008p1.removeAllUpdateListeners();
            this.f210008p1.setDuration(0L);
            this.f210008p1.cancel();
            this.f210008p1 = null;
        }
        bnc0 bnc0Var = this.f209972X0;
        if (bnc0Var != null && this.f209982d1 == RefreshState.Refreshing) {
            bnc0Var.mo102769h(this, false);
        }
        bnc0 bnc0Var2 = this.f209973Y0;
        if (bnc0Var2 != null && this.f209982d1 == RefreshState.Loading) {
            bnc0Var2.mo102769h(this, false);
        }
        if (this.f209977b != 0) {
            this.f209980c1.mo127125e(0, true);
        }
        RefreshState refreshState = this.f209982d1;
        RefreshState refreshState2 = RefreshState.None;
        if (refreshState != refreshState2) {
            m223752D(refreshState2);
        }
        Handler handler = this.f209978b1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f209999l1 = false;
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
            upk0.m194883a("最多只支持3个子View，Most only support three sub view");
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
            if (ikf0.m136791e(childAt) && (c < 2 || i4 == 1)) {
                i3 = i4;
                c = 2;
            } else if (!(childAt instanceof bnc0) && c < 1) {
                c = i4 > 0 ? (char) 1 : (char) 0;
                i3 = i4;
            }
            i4++;
        }
        if (i3 >= 0) {
            this.f209974Z0 = new dnc0(super.getChildAt(i3));
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
            if (i5 == i || (i5 != i2 && i == -1 && this.f209972X0 == null && (childAt2 instanceof fnc0))) {
                this.f209972X0 = childAt2 instanceof fnc0 ? (fnc0) childAt2 : new RefreshHeaderWrapper(childAt2);
            } else if (i5 == i2 || (i2 == -1 && (childAt2 instanceof enc0))) {
                this.f209932C = this.f209932C || !this.f209968V;
                this.f209973Y0 = childAt2 instanceof enc0 ? (enc0) childAt2 : new RefreshFooterWrapper(childAt2);
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
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(p4c0.f147074J0))) {
                cnc0 cnc0Var = this.f209974Z0;
                if (cnc0Var != null && cnc0Var.getView() == childAt) {
                    boolean z2 = isInEditMode() && this.f209942I && m223781z(this.f209931B) && this.f209972X0 != null;
                    View view = this.f209974Z0.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f209929t1;
                    int i6 = marginLayoutParams.leftMargin + paddingLeft;
                    int i7 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i6;
                    int measuredHeight = view.getMeasuredHeight() + i7;
                    if (z2 && m223749A(this.f209936F, this.f209972X0)) {
                        int i8 = this.f209951M0;
                        i7 += i8;
                        measuredHeight += i8;
                    }
                    view.layout(i6, i7, measuredWidth, measuredHeight);
                }
                bnc0 bnc0Var = this.f209972X0;
                if (bnc0Var != null && bnc0Var.getView() == childAt) {
                    boolean z3 = isInEditMode() && this.f209942I && m223781z(this.f209931B);
                    View view2 = this.f209972X0.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : f209929t1;
                    int i9 = marginLayoutParams2.leftMargin;
                    int i10 = marginLayoutParams2.topMargin + this.f209959Q0;
                    int measuredWidth2 = view2.getMeasuredWidth() + i9;
                    int measuredHeight2 = view2.getMeasuredHeight() + i10;
                    if (!z3 && this.f209972X0.getSpinnerStyle() == nof0.f139831d) {
                        int i11 = this.f209951M0;
                        i10 -= i11;
                        measuredHeight2 -= i11;
                    }
                    view2.layout(i9, i10, measuredWidth2, measuredHeight2);
                }
                bnc0 bnc0Var2 = this.f209973Y0;
                if (bnc0Var2 != null && bnc0Var2.getView() == childAt) {
                    boolean z4 = isInEditMode() && this.f209942I && m223781z(this.f209932C);
                    View view3 = this.f209973Y0.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : f209929t1;
                    nof0 spinnerStyle = this.f209973Y0.getSpinnerStyle();
                    int i12 = marginLayoutParams3.leftMargin;
                    int measuredHeight3 = (marginLayoutParams3.topMargin + getMeasuredHeight()) - this.f209961R0;
                    if (this.f209964T && this.f209966U && this.f209940H && this.f209974Z0 != null && this.f209973Y0.getSpinnerStyle() == nof0.f139831d && m223781z(this.f209932C)) {
                        View view4 = this.f209974Z0.getView();
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0);
                    }
                    if (spinnerStyle == nof0.f139835h) {
                        measuredHeight3 = marginLayoutParams3.topMargin - this.f209961R0;
                    } else {
                        if (z4 || spinnerStyle == nof0.f139834g || spinnerStyle == nof0.f139833f) {
                            iMax = this.f209955O0;
                        } else if (spinnerStyle.f139839c && this.f209977b < 0) {
                            iMax = Math.max(m223781z(this.f209932C) ? -this.f209977b : 0, 0);
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
        boolean z2 = isInEditMode() && this.f209942I;
        int childCount = super.getChildCount();
        int i7 = 0;
        int measuredWidth = 0;
        int measuredHeight = 0;
        while (i7 < childCount) {
            View childAt = super.getChildAt(i7);
            if (childAt.getVisibility() == 8 || "GONE".equals(childAt.getTag(p4c0.f147074J0))) {
                z = z2;
            } else {
                bnc0 bnc0Var = this.f209972X0;
                if (bnc0Var == null || bnc0Var.getView() != childAt) {
                    z = z2;
                    f = 10.0f;
                } else {
                    View view = this.f209972X0.getView();
                    f = 10.0f;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f209929t1;
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, layoutParams.width);
                    int iMax = this.f209951M0;
                    f1e f1eVar = this.f209953N0;
                    z = z2;
                    if (f1eVar.f94092a < f1e.f94085i.f94092a) {
                        int i8 = layoutParams.height;
                        if (i8 > 0) {
                            int i9 = i8 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                            f1e f1eVar2 = f1e.f94083g;
                            if (f1eVar.m119110a(f1eVar2)) {
                                this.f209951M0 = layoutParams.height + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                this.f209953N0 = f1eVar2;
                            }
                            iMax = i9;
                        } else if (i8 == -2 && (this.f209972X0.getSpinnerStyle() != nof0.f139835h || !this.f209953N0.f94093b)) {
                            int iMax2 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0);
                            view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax2, Integer.MIN_VALUE));
                            int measuredHeight2 = view.getMeasuredHeight();
                            if (measuredHeight2 > 0) {
                                if (measuredHeight2 != iMax2) {
                                    f1e f1eVar3 = this.f209953N0;
                                    f1e f1eVar4 = f1e.f94081e;
                                    if (f1eVar3.m119110a(f1eVar4)) {
                                        this.f209951M0 = measuredHeight2 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                        this.f209953N0 = f1eVar4;
                                    }
                                }
                                iMax = -1;
                            }
                        }
                    }
                    if (this.f209972X0.getSpinnerStyle() == nof0.f139835h) {
                        iMax = View.MeasureSpec.getSize(i2);
                        i6 = -1;
                        i5 = 0;
                    } else {
                        if (!this.f209972X0.getSpinnerStyle().f139839c || z) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            iMax = Math.max(0, m223781z(this.f209931B) ? this.f209977b : 0);
                        }
                        i6 = -1;
                    }
                    if (iMax != i6) {
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((iMax - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, i5), 1073741824));
                    }
                    f1e f1eVar5 = this.f209953N0;
                    if (!f1eVar5.f94093b) {
                        float f2 = this.f209963S0;
                        if (f2 < 10.0f) {
                            f2 *= this.f209951M0;
                        }
                        this.f209953N0 = f1eVar5.m119111b();
                        this.f209972X0.mo102770i(this.f209980c1, this.f209951M0, (int) f2);
                    }
                    if (z && m223781z(this.f209931B)) {
                        measuredWidth += view.getMeasuredWidth();
                        measuredHeight += view.getMeasuredHeight();
                    }
                }
                bnc0 bnc0Var2 = this.f209973Y0;
                if (bnc0Var2 == null || bnc0Var2.getView() != childAt) {
                    i3 = 0;
                } else {
                    View view2 = this.f209973Y0.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : f209929t1;
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, layoutParams2.width);
                    int iMax3 = this.f209955O0;
                    f1e f1eVar6 = this.f209957P0;
                    if (f1eVar6.f94092a < f1e.f94085i.f94092a) {
                        int i10 = layoutParams2.height;
                        if (i10 > 0) {
                            iMax3 = marginLayoutParams2.bottomMargin + i10 + marginLayoutParams2.topMargin;
                            f1e f1eVar7 = f1e.f94083g;
                            if (f1eVar6.m119110a(f1eVar7)) {
                                this.f209955O0 = layoutParams2.height + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                this.f209957P0 = f1eVar7;
                            }
                        } else if (i10 == -2 && (this.f209973Y0.getSpinnerStyle() != nof0.f139835h || !this.f209957P0.f94093b)) {
                            int iMax4 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0);
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(iMax4, Integer.MIN_VALUE));
                            int measuredHeight3 = view2.getMeasuredHeight();
                            if (measuredHeight3 > 0) {
                                if (measuredHeight3 != iMax4) {
                                    f1e f1eVar8 = this.f209957P0;
                                    f1e f1eVar9 = f1e.f94081e;
                                    if (f1eVar8.m119110a(f1eVar9)) {
                                        this.f209955O0 = measuredHeight3 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                        this.f209957P0 = f1eVar9;
                                    }
                                }
                                iMax3 = -1;
                            }
                        }
                    }
                    if (this.f209973Y0.getSpinnerStyle() == nof0.f139835h) {
                        iMax3 = View.MeasureSpec.getSize(i2);
                        i4 = -1;
                        i3 = 0;
                    } else {
                        if (!this.f209973Y0.getSpinnerStyle().f139839c || z) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            iMax3 = Math.max(0, m223781z(this.f209932C) ? -this.f209977b : 0);
                        }
                        i4 = -1;
                    }
                    if (iMax3 != i4) {
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((iMax3 - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i3), 1073741824));
                    }
                    f1e f1eVar10 = this.f209957P0;
                    if (!f1eVar10.f94093b) {
                        float f3 = this.f209965T0;
                        if (f3 < f) {
                            f3 *= this.f209955O0;
                        }
                        this.f209957P0 = f1eVar10.m119111b();
                        this.f209973Y0.mo102770i(this.f209980c1, this.f209955O0, (int) f3);
                    }
                    if (z && m223781z(this.f209932C)) {
                        measuredWidth += view2.getMeasuredWidth();
                        measuredHeight += view2.getMeasuredHeight();
                    }
                }
                cnc0 cnc0Var = this.f209974Z0;
                if (cnc0Var != null && cnc0Var.getView() == childAt) {
                    View view3 = this.f209974Z0.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : f209929t1;
                    view3.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams3.width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin + ((!z || ((this.f209972X0 == null || !m223781z(this.f209931B) || !m223749A(this.f209936F, this.f209972X0)) ? i3 : 1) == 0) ? i3 : this.f209951M0) + ((!z || ((this.f209973Y0 == null || !m223781z(this.f209932C) || !m223749A(this.f209938G, this.f209973Y0)) ? i3 : 1) == 0) ? i3 : this.f209955O0), layoutParams3.height));
                    measuredWidth += view3.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                    measuredHeight += view3.getMeasuredHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                }
            }
            i7++;
            z2 = z;
        }
        super.setMeasuredDimension(View.resolveSize(Math.max(measuredWidth + getPaddingLeft() + getPaddingRight(), super.getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(measuredHeight + getPaddingTop() + getPaddingBottom(), super.getSuggestedMinimumHeight()), i2));
        this.f209993j = getMeasuredWidth() / 2.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p149l.w920
    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return this.f209947K0.m187581a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p149l.w920
    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return (this.f209999l1 && f2 > 0.0f) || m223762U(-f2) || this.f209947K0.m187582b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        int i3 = this.f209941H0;
        int i4 = 0;
        if (i2 * i3 > 0) {
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(this.f209941H0);
            int i5 = this.f209941H0;
            if (iAbs > iAbs2) {
                this.f209941H0 = 0;
                i4 = i5;
            } else {
                this.f209941H0 = i5 - i2;
                i4 = i2;
            }
            m223751C(this.f209941H0);
        } else if (i2 > 0 && this.f209999l1) {
            int i6 = i3 - i2;
            this.f209941H0 = i6;
            m223751C(i6);
            i4 = i2;
        }
        this.f209947K0.m187583c(i, i2 - i4, iArr, null);
        iArr[1] = iArr[1] + i4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p149l.w920
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        s5e0 s5e0Var;
        ViewParent parent;
        s5e0 s5e0Var2;
        boolean zM187586f = this.f209947K0.m187586f(i, i2, i3, i4, this.f209945J0);
        int i5 = i4 + this.f209945J0[1];
        if ((i5 < 0 && ((this.f209931B || this.f209946K) && (this.f209941H0 != 0 || (s5e0Var2 = this.f209939G0) == null || s5e0Var2.mo145889b(this.f209974Z0.getView())))) || (i5 > 0 && ((this.f209932C || this.f209946K) && (this.f209941H0 != 0 || (s5e0Var = this.f209939G0) == null || s5e0Var.mo145888a(this.f209974Z0.getView()))))) {
            RefreshState refreshState = this.f209984e1;
            if (refreshState == RefreshState.None || refreshState.isOpening) {
                this.f209980c1.mo127126f(i5 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zM187586f && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            int i6 = this.f209941H0 - i5;
            this.f209941H0 = i6;
            m223751C(i6);
        }
        if (!this.f209999l1 || i2 >= 0) {
            return;
        }
        this.f209999l1 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        this.f209949L0.m207461b(view, view2, i);
        this.f209947K0.m187596p(i & 2);
        this.f209941H0 = this.f209977b;
        this.f209943I0 = true;
        m223780y(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        if (isEnabled() && isNestedScrollingEnabled() && (i & 2) != 0) {
            return this.f209946K || this.f209931B || this.f209932C;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(@NonNull View view) {
        this.f209949L0.m207463d(view);
        this.f209943I0 = false;
        this.f209941H0 = 0;
        m223753E();
        this.f209947K0.m187598r();
    }

    /* JADX INFO: renamed from: p */
    public hnc0 m223771p(int i) {
        return m223772q(i, true, false);
    }

    /* JADX INFO: renamed from: q */
    public hnc0 m223772q(int i, boolean z, boolean z2) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        RunnableC22643h runnableC22643h = new RunnableC22643h(i2, z2, z);
        if (i3 > 0) {
            this.f209978b1.postDelayed(runnableC22643h, i3);
            return this;
        }
        runnableC22643h.run();
        return this;
    }

    /* JADX INFO: renamed from: r */
    public hnc0 m223773r(boolean z) {
        return m223772q(z ? Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f209986f1))), 300) << 16 : 0, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (gbl0.m125172Q(this.f209974Z0.mo107756h())) {
            this.f210006p = z;
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: s */
    public hnc0 m223774s() {
        return m223772q(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f209986f1))), 300) << 16, true, true);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f209958Q = z;
        this.f209947K0.m187594n(z);
    }

    public void setStateDirectLoading(boolean z) {
        RefreshState refreshState = this.f209982d1;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.f209986f1 = System.currentTimeMillis();
            this.f209999l1 = true;
            m223752D(refreshState2);
            me50 me50Var = this.f209935E0;
            if (me50Var != null) {
                if (z) {
                    me50Var.mo77835a(this);
                }
            } else if (this.f209937F0 == null) {
                m223771p(2000);
            }
            bnc0 bnc0Var = this.f209973Y0;
            if (bnc0Var != null) {
                float f = this.f209965T0;
                if (f < 10.0f) {
                    f *= this.f209955O0;
                }
                bnc0Var.mo102768g(this, this.f209955O0, (int) f);
            }
            qe50 qe50Var = this.f209937F0;
            if (qe50Var == null || !(this.f209973Y0 instanceof enc0)) {
                return;
            }
            if (z) {
                qe50Var.mo77835a(this);
            }
            float f2 = this.f209965T0;
            if (f2 < 10.0f) {
                f2 *= this.f209955O0;
            }
            this.f209937F0.mo96452m1((enc0) this.f209973Y0, this.f209955O0, (int) f2);
        }
    }

    public void setStateLoading(boolean z) {
        C22637b c22637b = new C22637b(z);
        m223752D(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorMo127121a = this.f209980c1.mo127121a(-this.f209955O0);
        if (valueAnimatorMo127121a != null) {
            valueAnimatorMo127121a.addListener(c22637b);
        }
        bnc0 bnc0Var = this.f209973Y0;
        if (bnc0Var != null) {
            float f = this.f209965T0;
            if (f < 10.0f) {
                f *= this.f209955O0;
            }
            bnc0Var.mo102765c(this, this.f209955O0, (int) f);
        }
        qe50 qe50Var = this.f209937F0;
        if (qe50Var != null) {
            bnc0 bnc0Var2 = this.f209973Y0;
            if (bnc0Var2 instanceof enc0) {
                float f2 = this.f209965T0;
                if (f2 < 10.0f) {
                    f2 *= this.f209955O0;
                }
                qe50Var.mo96448W0((enc0) bnc0Var2, this.f209955O0, (int) f2);
            }
        }
        if (valueAnimatorMo127121a == null) {
            c22637b.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z) {
        C22638c c22638c = new C22638c(z);
        m223752D(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorMo127121a = this.f209980c1.mo127121a(this.f209951M0);
        if (valueAnimatorMo127121a != null) {
            valueAnimatorMo127121a.addListener(c22638c);
        }
        bnc0 bnc0Var = this.f209972X0;
        if (bnc0Var != null) {
            float f = this.f209963S0;
            if (f < 10.0f) {
                f *= this.f209951M0;
            }
            bnc0Var.mo102765c(this, this.f209951M0, (int) f);
        }
        qe50 qe50Var = this.f209937F0;
        if (qe50Var != null) {
            bnc0 bnc0Var2 = this.f209972X0;
            if (bnc0Var2 instanceof fnc0) {
                float f2 = this.f209963S0;
                if (f2 < 10.0f) {
                    f2 *= this.f209951M0;
                }
                qe50Var.mo96449b0((fnc0) bnc0Var2, this.f209951M0, (int) f2);
            }
        }
        if (valueAnimatorMo127121a == null) {
            c22638c.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.f209982d1;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            m223752D(RefreshState.None);
        }
        if (this.f209984e1 != refreshState) {
            this.f209984e1 = refreshState;
        }
    }

    /* JADX INFO: renamed from: t */
    public hnc0 m223775t() {
        return m223778w(true);
    }

    /* JADX INFO: renamed from: u */
    public hnc0 m223776u(int i) {
        return m223777v(i, true, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: v */
    public hnc0 m223777v(int i, boolean z, Boolean bool) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        RunnableC22642g runnableC22642g = new RunnableC22642g(i2, bool, z);
        if (i3 > 0) {
            this.f209978b1.postDelayed(runnableC22642g, i3);
            return this;
        }
        runnableC22642g.run();
        return this;
    }

    /* JADX INFO: renamed from: w */
    public hnc0 m223778w(boolean z) {
        return z ? m223777v(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f209986f1))), 300) << 16, true, Boolean.FALSE) : m223777v(0, false, null);
    }

    /* JADX INFO: renamed from: x */
    public hnc0 m223779x() {
        return m223777v(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f209986f1))), 300) << 16, true, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: y */
    public boolean m223780y(int i) {
        if (i == 0) {
            if (this.f210008p1 != null) {
                RefreshState refreshState = this.f209982d1;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased || refreshState == RefreshState.RefreshReleased || refreshState == RefreshState.LoadReleased) {
                    return true;
                }
                if (refreshState == RefreshState.PullDownCanceled) {
                    this.f209980c1.mo127126f(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    this.f209980c1.mo127126f(RefreshState.PullUpToLoad);
                }
                this.f210008p1.setDuration(0L);
                this.f210008p1.cancel();
                this.f210008p1 = null;
            }
            this.f210005o1 = null;
        }
        return this.f210008p1 != null;
    }

    /* JADX INFO: renamed from: z */
    public boolean m223781z(boolean z) {
        return z && !this.f209950M;
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$m */
    public static class C22648m extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f210067a;

        /* JADX INFO: renamed from: b */
        public nof0 f210068b;

        public C22648m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f210067a = 0;
            this.f210068b = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74357V1);
            this.f210067a = typedArrayObtainStyledAttributes.getColor(b9c0.f74363W1, this.f210067a);
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74369X1)) {
                this.f210068b = nof0.f139836i[typedArrayObtainStyledAttributes.getInt(b9c0.f74369X1, nof0.f139831d.f139837a)];
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public C22648m(int i, int i2) {
            super(i, i2);
            this.f210067a = 0;
            this.f210068b = null;
        }
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }
}
