package p028v.smart_refresh;

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
import l.b9c0;
import l.gbl0;
import l.lsi0;
import l.p4c0;
import l.t920;
import l.tqq0;
import l.w920;
import l.x920;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p003l.bnc0;
import p003l.bqd;
import p003l.cnc0;
import p003l.cqd;
import p003l.df50;
import p003l.dnc0;
import p003l.dqd;
import p003l.ef50;
import p003l.enc0;
import p003l.f1e;
import p003l.fnc0;
import p003l.gnc0;
import p003l.hnc0;
import p003l.ikf0;
import p003l.me50;
import p003l.nof0;
import p003l.qe50;
import p003l.s5e0;
import p003l.upk0;
import p028v.smart_refresh.constant.RefreshState;
import p028v.smart_refresh.wrapper.RefreshFooterWrapper;
import p028v.smart_refresh.wrapper.RefreshHeaderWrapper;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SmartRefreshLayout extends ViewGroup implements hnc0, w920 {

    /* JADX INFO: renamed from: q1 */
    public static bqd f13551q1;

    /* JADX INFO: renamed from: r1 */
    public static cqd f13552r1;

    /* JADX INFO: renamed from: s1 */
    public static dqd f13553s1;

    /* JADX INFO: renamed from: t1 */
    public static ViewGroup.MarginLayoutParams f13554t1 = new ViewGroup.MarginLayoutParams(-1, -1);

    /* JADX INFO: renamed from: A */
    public int[] f13555A;

    /* JADX INFO: renamed from: B */
    public boolean f13556B;

    /* JADX INFO: renamed from: C */
    public boolean f13557C;

    /* JADX INFO: renamed from: D */
    public boolean f13558D;

    /* JADX INFO: renamed from: E */
    public boolean f13559E;

    /* JADX INFO: renamed from: E0 */
    public me50 f13560E0;

    /* JADX INFO: renamed from: F */
    public boolean f13561F;

    /* JADX INFO: renamed from: F0 */
    public qe50 f13562F0;

    /* JADX INFO: renamed from: G */
    public boolean f13563G;

    /* JADX INFO: renamed from: G0 */
    public s5e0 f13564G0;

    /* JADX INFO: renamed from: H */
    public boolean f13565H;

    /* JADX INFO: renamed from: H0 */
    public int f13566H0;

    /* JADX INFO: renamed from: I */
    public boolean f13567I;

    /* JADX INFO: renamed from: I0 */
    public boolean f13568I0;

    /* JADX INFO: renamed from: J */
    public boolean f13569J;

    /* JADX INFO: renamed from: J0 */
    public int[] f13570J0;

    /* JADX INFO: renamed from: K */
    public boolean f13571K;

    /* JADX INFO: renamed from: K0 */
    public t920 f13572K0;

    /* JADX INFO: renamed from: L */
    public boolean f13573L;

    /* JADX INFO: renamed from: L0 */
    public x920 f13574L0;

    /* JADX INFO: renamed from: M */
    public boolean f13575M;

    /* JADX INFO: renamed from: M0 */
    public int f13576M0;

    /* JADX INFO: renamed from: N */
    public boolean f13577N;

    /* JADX INFO: renamed from: N0 */
    public f1e f13578N0;

    /* JADX INFO: renamed from: O */
    public boolean f13579O;

    /* JADX INFO: renamed from: O0 */
    public int f13580O0;

    /* JADX INFO: renamed from: P */
    public boolean f13581P;

    /* JADX INFO: renamed from: P0 */
    public f1e f13582P0;

    /* JADX INFO: renamed from: Q */
    public boolean f13583Q;

    /* JADX INFO: renamed from: Q0 */
    public int f13584Q0;

    /* JADX INFO: renamed from: R */
    public boolean f13585R;

    /* JADX INFO: renamed from: R0 */
    public int f13586R0;

    /* JADX INFO: renamed from: S */
    public boolean f13587S;

    /* JADX INFO: renamed from: S0 */
    public float f13588S0;

    /* JADX INFO: renamed from: T */
    public boolean f13589T;

    /* JADX INFO: renamed from: T0 */
    public float f13590T0;

    /* JADX INFO: renamed from: U */
    public boolean f13591U;

    /* JADX INFO: renamed from: U0 */
    public float f13592U0;

    /* JADX INFO: renamed from: V */
    public boolean f13593V;

    /* JADX INFO: renamed from: V0 */
    public float f13594V0;

    /* JADX INFO: renamed from: W */
    public boolean f13595W;

    /* JADX INFO: renamed from: W0 */
    public float f13596W0;

    /* JADX INFO: renamed from: X0 */
    public bnc0 f13597X0;

    /* JADX INFO: renamed from: Y0 */
    public bnc0 f13598Y0;

    /* JADX INFO: renamed from: Z0 */
    public cnc0 f13599Z0;

    /* JADX INFO: renamed from: a */
    public int f13600a;

    /* JADX INFO: renamed from: a1 */
    public Paint f13601a1;

    /* JADX INFO: renamed from: b */
    public int f13602b;

    /* JADX INFO: renamed from: b1 */
    public Handler f13603b1;

    /* JADX INFO: renamed from: c */
    public int f13604c;

    /* JADX INFO: renamed from: c1 */
    public gnc0 f13605c1;

    /* JADX INFO: renamed from: d */
    public int f13606d;

    /* JADX INFO: renamed from: d1 */
    public RefreshState f13607d1;

    /* JADX INFO: renamed from: e */
    public int f13608e;

    /* JADX INFO: renamed from: e1 */
    public RefreshState f13609e1;

    /* JADX INFO: renamed from: f */
    public int f13610f;

    /* JADX INFO: renamed from: f1 */
    public long f13611f1;

    /* JADX INFO: renamed from: g */
    public int f13612g;

    /* JADX INFO: renamed from: g1 */
    public int f13613g1;

    /* JADX INFO: renamed from: h */
    public float f13614h;

    /* JADX INFO: renamed from: h1 */
    public int f13615h1;

    /* JADX INFO: renamed from: i */
    public float f13616i;

    /* JADX INFO: renamed from: i1 */
    public boolean f13617i1;

    /* JADX INFO: renamed from: j */
    public float f13618j;

    /* JADX INFO: renamed from: j1 */
    public boolean f13619j1;

    /* JADX INFO: renamed from: k */
    public float f13620k;

    /* JADX INFO: renamed from: k0 */
    public boolean f13621k0;

    /* JADX INFO: renamed from: k1 */
    public boolean f13622k1;

    /* JADX INFO: renamed from: l */
    public float f13623l;

    /* JADX INFO: renamed from: l1 */
    public boolean f13624l1;

    /* JADX INFO: renamed from: m */
    public char f13625m;

    /* JADX INFO: renamed from: m1 */
    public boolean f13626m1;

    /* JADX INFO: renamed from: n */
    public boolean f13627n;

    /* JADX INFO: renamed from: n1 */
    public MotionEvent f13628n1;

    /* JADX INFO: renamed from: o */
    public boolean f13629o;

    /* JADX INFO: renamed from: o1 */
    public Runnable f13630o1;

    /* JADX INFO: renamed from: p */
    public boolean f13631p;

    /* JADX INFO: renamed from: p0 */
    public df50 f13632p0;

    /* JADX INFO: renamed from: p1 */
    public ValueAnimator f13633p1;

    /* JADX INFO: renamed from: q */
    public int f13634q;

    /* JADX INFO: renamed from: r */
    public int f13635r;

    /* JADX INFO: renamed from: s */
    public int f13636s;

    /* JADX INFO: renamed from: t */
    public int f13637t;

    /* JADX INFO: renamed from: u */
    public int f13638u;

    /* JADX INFO: renamed from: v */
    public int f13639v;

    /* JADX INFO: renamed from: w */
    public int f13640w;

    /* JADX INFO: renamed from: x */
    public Scroller f13641x;

    /* JADX INFO: renamed from: y */
    public VelocityTracker f13642y;

    /* JADX INFO: renamed from: z */
    public Interpolator f13643z;

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$a */
    public static /* synthetic */ class C1429a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13644a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f13644a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13644a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13644a[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13644a[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13644a[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13644a[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13644a[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13644a[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13644a[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13644a[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13644a[RefreshState.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13644a[RefreshState.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$b */
    public class C1430b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f13645a;

        public C1430b(boolean z) {
            this.f13645a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.setStateDirectLoading(this.f13645a);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$c */
    public class C1431c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f13647a;

        public C1431c(boolean z) {
            this.f13647a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.f13611f1 = System.currentTimeMillis();
                SmartRefreshLayout.this.m12258D(RefreshState.Refreshing);
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                df50 df50Var = smartRefreshLayout.f13632p0;
                if (df50Var != null) {
                    if (this.f13647a) {
                        df50Var.mo2880w2(smartRefreshLayout);
                    }
                } else if (smartRefreshLayout.f13562F0 == null) {
                    smartRefreshLayout.m12282u(3000);
                }
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                bnc0 bnc0Var = smartRefreshLayout2.f13597X0;
                if (bnc0Var != null) {
                    float f = smartRefreshLayout2.f13588S0;
                    if (f < 10.0f) {
                        f *= smartRefreshLayout2.f13576M0;
                    }
                    bnc0Var.mo2971g(smartRefreshLayout2, smartRefreshLayout2.f13576M0, (int) f);
                }
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                qe50 qe50Var = smartRefreshLayout3.f13562F0;
                if (qe50Var == null || !(smartRefreshLayout3.f13597X0 instanceof fnc0)) {
                    return;
                }
                if (this.f13647a) {
                    qe50Var.mo2880w2(smartRefreshLayout3);
                }
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                float f2 = smartRefreshLayout4.f13588S0;
                if (f2 < 10.0f) {
                    f2 *= smartRefreshLayout4.f13576M0;
                }
                smartRefreshLayout4.f13562F0.mo2872A2((fnc0) smartRefreshLayout4.f13597X0, smartRefreshLayout4.f13576M0, (int) f2);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$d */
    public class C1432d extends AnimatorListenerAdapter {
        public C1432d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RefreshState refreshState;
            RefreshState refreshState2;
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.f13633p1 = null;
                if (smartRefreshLayout.f13602b == 0 && (refreshState = smartRefreshLayout.f13607d1) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
                    smartRefreshLayout.m12258D(refreshState2);
                    return;
                }
                RefreshState refreshState3 = smartRefreshLayout.f13607d1;
                if (refreshState3 != smartRefreshLayout.f13609e1) {
                    smartRefreshLayout.setViceState(refreshState3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$e */
    public class C1433e implements ValueAnimator.AnimatorUpdateListener {
        public C1433e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout.this.f13605c1.mo4654e(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$f */
    public class RunnableC1434f implements Runnable {
        public RunnableC1434f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            me50 me50Var = smartRefreshLayout.f13560E0;
            if (me50Var != null) {
                me50Var.mo2874a(smartRefreshLayout);
            } else if (smartRefreshLayout.f13562F0 == null) {
                smartRefreshLayout.m12277p(ijkMediaStreamer.MEDIA_RECORDER_TRACK_INFO_LIST_END);
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            qe50 qe50Var = smartRefreshLayout2.f13562F0;
            if (qe50Var != null) {
                qe50Var.mo2874a(smartRefreshLayout2);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$g */
    public class RunnableC1435g implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f13652a = 0;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f13653b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Boolean f13654c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f13655d;

        public RunnableC1435g(int i, Boolean bool, boolean z) {
            this.f13653b = i;
            this.f13654c = bool;
            this.f13655d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f13652a;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (i == 0) {
                RefreshState refreshState = smartRefreshLayout.f13607d1;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.f13609e1 == RefreshState.Refreshing) {
                    smartRefreshLayout.f13609e1 = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.f13633p1;
                    if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.f13633p1.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.f13633p1 = null;
                        ValueAnimator valueAnimatorMo4650a = smartRefreshLayout2.f13605c1.mo4650a(0);
                        SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                        if (valueAnimatorMo4650a == null) {
                            smartRefreshLayout3.m12258D(refreshState2);
                        } else {
                            smartRefreshLayout3.m12258D(RefreshState.PullDownCanceled);
                        }
                    } else if (refreshState == RefreshState.Refreshing && smartRefreshLayout.f13597X0 != null && smartRefreshLayout.f13599Z0 != null) {
                        this.f13652a = i + 1;
                        smartRefreshLayout.f13603b1.postDelayed(this, this.f13653b);
                        SmartRefreshLayout.this.m12258D(RefreshState.RefreshFinish);
                        if (this.f13654c == Boolean.FALSE) {
                            SmartRefreshLayout.this.m12266L(false);
                        }
                    }
                }
                if (this.f13654c == Boolean.TRUE) {
                    SmartRefreshLayout.this.m12266L(true);
                    return;
                }
                return;
            }
            int iMo2972h = smartRefreshLayout.f13597X0.mo2972h(smartRefreshLayout, this.f13655d);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            qe50 qe50Var = smartRefreshLayout4.f13562F0;
            if (qe50Var != null) {
                bnc0 bnc0Var = smartRefreshLayout4.f13597X0;
                if (bnc0Var instanceof fnc0) {
                    qe50Var.mo2881x0((fnc0) bnc0Var, this.f13655d);
                }
            }
            if (iMo2972h < Integer.MAX_VALUE) {
                SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                if (smartRefreshLayout5.f13627n || smartRefreshLayout5.f13568I0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.f13627n) {
                        float f = smartRefreshLayout6.f13620k;
                        smartRefreshLayout6.f13616i = f;
                        smartRefreshLayout6.f13606d = 0;
                        smartRefreshLayout6.f13627n = false;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout6.f13618j, (f + smartRefreshLayout6.f13602b) - (smartRefreshLayout6.f13600a * 2), 0));
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout7.f13618j, smartRefreshLayout7.f13620k + smartRefreshLayout7.f13602b, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.f13568I0) {
                        smartRefreshLayout8.f13566H0 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout8.f13618j, smartRefreshLayout8.f13620k, 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        smartRefreshLayout9.f13568I0 = false;
                        smartRefreshLayout9.f13606d = 0;
                    }
                }
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                int i2 = smartRefreshLayout10.f13602b;
                if (i2 <= 0) {
                    if (i2 < 0) {
                        smartRefreshLayout10.m12269h(0, iMo2972h, smartRefreshLayout10.f13643z, smartRefreshLayout10.f13610f);
                        return;
                    } else {
                        smartRefreshLayout10.f13605c1.mo4654e(0, false);
                        SmartRefreshLayout.this.f13605c1.mo4655f(RefreshState.None);
                        return;
                    }
                }
                ValueAnimator valueAnimatorM12269h = smartRefreshLayout10.m12269h(0, iMo2972h, smartRefreshLayout10.f13643z, smartRefreshLayout10.f13610f);
                SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerMo3399c = smartRefreshLayout11.f13579O ? smartRefreshLayout11.f13599Z0.mo3399c(smartRefreshLayout11.f13602b) : null;
                if (valueAnimatorM12269h == null || animatorUpdateListenerMo3399c == null) {
                    return;
                }
                valueAnimatorM12269h.addUpdateListener(animatorUpdateListenerMo3399c);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$h */
    public class RunnableC1436h implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f13657a = 0;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f13658b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f13659c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f13660d;

        /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$h$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f13662a;

            /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$h$a$a, reason: collision with other inner class name */
            public class C1449a extends AnimatorListenerAdapter {
                public C1449a() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (animator == null || animator.getDuration() != 0) {
                        RunnableC1436h runnableC1436h = RunnableC1436h.this;
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        smartRefreshLayout.f13624l1 = false;
                        if (runnableC1436h.f13659c) {
                            smartRefreshLayout.m12266L(true);
                        }
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        if (smartRefreshLayout2.f13607d1 == RefreshState.LoadFinish) {
                            smartRefreshLayout2.m12258D(RefreshState.None);
                        }
                    }
                }
            }

            public a(int i) {
                this.f13662a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerMo3399c;
                ValueAnimator valueAnimatorMo4650a;
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (!smartRefreshLayout.f13577N || this.f13662a >= 0) {
                    animatorUpdateListenerMo3399c = null;
                } else {
                    animatorUpdateListenerMo3399c = smartRefreshLayout.f13599Z0.mo3399c(smartRefreshLayout.f13602b);
                    if (animatorUpdateListenerMo3399c != null) {
                        animatorUpdateListenerMo3399c.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                    }
                }
                C1449a c1449a = new C1449a();
                RunnableC1436h runnableC1436h = RunnableC1436h.this;
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i = smartRefreshLayout2.f13602b;
                if (i > 0) {
                    valueAnimatorMo4650a = smartRefreshLayout2.f13605c1.mo4650a(0);
                } else {
                    if (animatorUpdateListenerMo3399c != null || i == 0) {
                        ValueAnimator valueAnimator = smartRefreshLayout2.f13633p1;
                        if (valueAnimator != null) {
                            valueAnimator.setDuration(0L);
                            SmartRefreshLayout.this.f13633p1.cancel();
                            SmartRefreshLayout.this.f13633p1 = null;
                        }
                        SmartRefreshLayout.this.f13605c1.mo4654e(0, false);
                        SmartRefreshLayout.this.f13605c1.mo4655f(RefreshState.None);
                    } else if (runnableC1436h.f13659c && smartRefreshLayout2.f13565H) {
                        int i2 = smartRefreshLayout2.f13580O0;
                        if (i >= (-i2)) {
                            smartRefreshLayout2.m12258D(RefreshState.None);
                        } else {
                            valueAnimatorMo4650a = smartRefreshLayout2.f13605c1.mo4650a(-i2);
                        }
                    } else {
                        valueAnimatorMo4650a = smartRefreshLayout2.f13605c1.mo4650a(0);
                    }
                    valueAnimatorMo4650a = null;
                }
                if (valueAnimatorMo4650a != null) {
                    valueAnimatorMo4650a.addListener(c1449a);
                } else {
                    c1449a.onAnimationEnd(null);
                }
            }
        }

        public RunnableC1436h(int i, boolean z, boolean z2) {
            this.f13658b = i;
            this.f13659c = z;
            this.f13660d = z2;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            int i = this.f13657a;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (i == 0) {
                RefreshState refreshState = smartRefreshLayout.f13607d1;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.f13609e1 == RefreshState.Loading) {
                    smartRefreshLayout.f13609e1 = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.f13633p1;
                    if (valueAnimator != null && ((refreshState.isDragging || refreshState == RefreshState.LoadReleased) && refreshState.isFooter)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.f13633p1.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.f13633p1 = null;
                        ValueAnimator valueAnimatorMo4650a = smartRefreshLayout2.f13605c1.mo4650a(0);
                        SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                        if (valueAnimatorMo4650a == null) {
                            smartRefreshLayout3.m12258D(refreshState2);
                        } else {
                            smartRefreshLayout3.m12258D(RefreshState.PullUpCanceled);
                        }
                    } else if (refreshState == RefreshState.Loading && smartRefreshLayout.f13598Y0 != null && smartRefreshLayout.f13599Z0 != null) {
                        this.f13657a = i + 1;
                        smartRefreshLayout.f13603b1.postDelayed(this, this.f13658b);
                        SmartRefreshLayout.this.m12258D(RefreshState.LoadFinish);
                        return;
                    }
                }
                if (this.f13659c) {
                    SmartRefreshLayout.this.m12266L(true);
                    return;
                }
                return;
            }
            int iMo2972h = smartRefreshLayout.f13598Y0.mo2972h(smartRefreshLayout, this.f13660d);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            qe50 qe50Var = smartRefreshLayout4.f13562F0;
            if (qe50Var != null) {
                bnc0 bnc0Var = smartRefreshLayout4.f13598Y0;
                if (bnc0Var instanceof enc0) {
                    qe50Var.mo2877j((enc0) bnc0Var, this.f13660d);
                }
            }
            if (iMo2972h < Integer.MAX_VALUE) {
                if (this.f13659c) {
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    z = smartRefreshLayout5.f13565H && smartRefreshLayout5.f13602b < 0 && smartRefreshLayout5.f13599Z0.mo3403g();
                }
                SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                int i2 = smartRefreshLayout6.f13602b;
                int iMax = i2 - (z ? Math.max(i2, -smartRefreshLayout6.f13580O0) : 0);
                SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                if (smartRefreshLayout7.f13627n || smartRefreshLayout7.f13568I0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.f13627n) {
                        float f = smartRefreshLayout8.f13620k;
                        smartRefreshLayout8.f13616i = f;
                        smartRefreshLayout8.f13606d = smartRefreshLayout8.f13602b - iMax;
                        smartRefreshLayout8.f13627n = false;
                        float f2 = smartRefreshLayout8.f13563G ? iMax : 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout8.f13618j, f + f2 + (smartRefreshLayout8.f13600a * 2), 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout9.f13618j, smartRefreshLayout9.f13620k + f2, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                    if (smartRefreshLayout10.f13568I0) {
                        smartRefreshLayout10.f13566H0 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout10.f13618j, smartRefreshLayout10.f13620k, 0));
                        SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                        smartRefreshLayout11.f13568I0 = false;
                        smartRefreshLayout11.f13606d = 0;
                    }
                }
                SmartRefreshLayout.this.f13603b1.postDelayed(new a(iMax), SmartRefreshLayout.this.f13602b < 0 ? iMo2972h : 0L);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$i */
    public class RunnableC1437i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f13665a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f13666b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f13667c;

        /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$i$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.f13633p1 == null || smartRefreshLayout.f13597X0 == null) {
                    return;
                }
                smartRefreshLayout.f13605c1.mo4654e(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
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
                    smartRefreshLayout.f13633p1 = null;
                    if (smartRefreshLayout.f13597X0 == null) {
                        smartRefreshLayout.f13605c1.mo4655f(RefreshState.None);
                        return;
                    }
                    RefreshState refreshState = smartRefreshLayout.f13607d1;
                    RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
                    if (refreshState != refreshState2) {
                        smartRefreshLayout.f13605c1.mo4655f(refreshState2);
                    }
                    RunnableC1437i runnableC1437i = RunnableC1437i.this;
                    SmartRefreshLayout.this.setStateRefreshing(!runnableC1437i.f13667c);
                }
            }
        }

        public RunnableC1437i(float f, int i, boolean z) {
            this.f13665a = f;
            this.f13666b = i;
            this.f13667c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f13609e1 != RefreshState.Refreshing) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.f13633p1;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.f13633p1.cancel();
                SmartRefreshLayout.this.f13633p1 = null;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.f13618j = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.f13605c1.mo4655f(RefreshState.PullDownToRefresh);
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int i = smartRefreshLayout3.f13576M0;
            float f = i == 0 ? smartRefreshLayout3.f13592U0 : i;
            float f2 = this.f13665a;
            if (f2 < 10.0f) {
                f2 *= f;
            }
            smartRefreshLayout3.f13633p1 = ValueAnimator.ofInt(smartRefreshLayout3.f13602b, (int) f2);
            SmartRefreshLayout.this.f13633p1.setDuration(this.f13666b);
            SmartRefreshLayout.this.f13633p1.setInterpolator(new ikf0(ikf0.f4427b));
            SmartRefreshLayout.this.f13633p1.addUpdateListener(new a());
            SmartRefreshLayout.this.f13633p1.addListener(new b());
            SmartRefreshLayout.this.f13633p1.start();
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$j */
    public class RunnableC1438j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f13671a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f13672b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f13673c;

        /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$j$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.f13633p1 == null || smartRefreshLayout.f13598Y0 == null) {
                    return;
                }
                smartRefreshLayout.f13605c1.mo4654e(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
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
                    smartRefreshLayout.f13633p1 = null;
                    if (smartRefreshLayout.f13598Y0 == null) {
                        smartRefreshLayout.f13605c1.mo4655f(RefreshState.None);
                        return;
                    }
                    RefreshState refreshState = smartRefreshLayout.f13607d1;
                    RefreshState refreshState2 = RefreshState.ReleaseToLoad;
                    if (refreshState != refreshState2) {
                        smartRefreshLayout.f13605c1.mo4655f(refreshState2);
                    }
                    RunnableC1438j runnableC1438j = RunnableC1438j.this;
                    SmartRefreshLayout.this.setStateLoading(!runnableC1438j.f13673c);
                }
            }
        }

        public RunnableC1438j(float f, int i, boolean z) {
            this.f13671a = f;
            this.f13672b = i;
            this.f13673c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f13609e1 != RefreshState.Loading) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.f13633p1;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.f13633p1.cancel();
                SmartRefreshLayout.this.f13633p1 = null;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.f13618j = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.f13605c1.mo4655f(RefreshState.PullUpToLoad);
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int i = smartRefreshLayout3.f13580O0;
            float f = i == 0 ? smartRefreshLayout3.f13594V0 : i;
            float f2 = this.f13671a;
            if (f2 < 10.0f) {
                f2 *= f;
            }
            smartRefreshLayout3.f13633p1 = ValueAnimator.ofInt(smartRefreshLayout3.f13602b, -((int) f2));
            SmartRefreshLayout.this.f13633p1.setDuration(this.f13672b);
            SmartRefreshLayout.this.f13633p1.setInterpolator(new ikf0(ikf0.f4427b));
            SmartRefreshLayout.this.f13633p1.addUpdateListener(new a());
            SmartRefreshLayout.this.f13633p1.addListener(new b());
            SmartRefreshLayout.this.f13633p1.start();
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$k */
    public class RunnableC1439k implements Runnable {

        /* JADX INFO: renamed from: c */
        public int f13679c;

        /* JADX INFO: renamed from: f */
        public float f13682f;

        /* JADX INFO: renamed from: a */
        public int f13677a = 0;

        /* JADX INFO: renamed from: b */
        public int f13678b = 10;

        /* JADX INFO: renamed from: e */
        public float f13681e = 0.0f;

        /* JADX INFO: renamed from: d */
        public long f13680d = AnimationUtils.currentAnimationTimeMillis();

        public RunnableC1439k(float f, int i) {
            this.f13682f = f;
            this.f13679c = i;
            SmartRefreshLayout.this.f13603b1.postDelayed(this, this.f13678b);
            gnc0 gnc0Var = SmartRefreshLayout.this.f13605c1;
            if (f > 0.0f) {
                gnc0Var.mo4655f(RefreshState.PullDownToRefresh);
            } else {
                gnc0Var.mo4655f(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f13630o1 != this || smartRefreshLayout.f13607d1.isFinishing) {
                return;
            }
            if (Math.abs(smartRefreshLayout.f13602b) >= Math.abs(this.f13679c)) {
                int i = this.f13679c;
                float f = this.f13682f;
                if (i != 0) {
                    int i2 = this.f13677a + 1;
                    this.f13677a = i2;
                    this.f13682f = (float) (((double) f) * Math.pow(0.44999998807907104d, i2 * 2));
                } else {
                    int i3 = this.f13677a + 1;
                    this.f13677a = i3;
                    this.f13682f = (float) (((double) f) * Math.pow(0.8500000238418579d, i3 * 2));
                }
            } else {
                double d = this.f13682f;
                int i4 = this.f13677a + 1;
                this.f13677a = i4;
                this.f13682f = (float) (d * Math.pow(0.949999988079071d, i4 * 2));
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f2 = this.f13682f * (((jCurrentAnimationTimeMillis - this.f13680d) * 1.0f) / 1000.0f);
            if (Math.abs(f2) >= 1.0f) {
                this.f13680d = jCurrentAnimationTimeMillis;
                float f3 = this.f13681e + f2;
                this.f13681e = f3;
                SmartRefreshLayout.this.m12257C(f3);
                SmartRefreshLayout.this.f13603b1.postDelayed(this, this.f13678b);
                return;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState = smartRefreshLayout2.f13609e1;
            boolean z = refreshState.isDragging;
            if (z && refreshState.isHeader) {
                smartRefreshLayout2.f13605c1.mo4655f(RefreshState.PullDownCanceled);
            } else if (z && refreshState.isFooter) {
                smartRefreshLayout2.f13605c1.mo4655f(RefreshState.PullUpCanceled);
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.f13630o1 = null;
            if (Math.abs(smartRefreshLayout3.f13602b) >= Math.abs(this.f13679c)) {
                int iMin = Math.min(Math.max((int) ikf0.m5152i(Math.abs(SmartRefreshLayout.this.f13602b - this.f13679c)), 30), 100) * 10;
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                smartRefreshLayout4.m12269h(this.f13679c, 0, smartRefreshLayout4.f13643z, iMin);
            }
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$l */
    public class RunnableC1440l implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f13684a;

        /* JADX INFO: renamed from: d */
        public float f13687d;

        /* JADX INFO: renamed from: b */
        public int f13685b = 0;

        /* JADX INFO: renamed from: c */
        public int f13686c = 10;

        /* JADX INFO: renamed from: e */
        public float f13688e = 0.98f;

        /* JADX INFO: renamed from: f */
        public long f13689f = 0;

        /* JADX INFO: renamed from: g */
        public long f13690g = AnimationUtils.currentAnimationTimeMillis();

        public RunnableC1440l(float f) {
            this.f13687d = f;
            this.f13684a = SmartRefreshLayout.this.f13602b;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x004b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0059  */
        /* JADX WARN: Code duplicated, block: B:36:0x0065  */
        /* JADX WARN: Code duplicated, block: B:40:0x0093  */
        /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[LOOP:0: B:34:0x0061->B:48:0x00a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:52:0x008b A[SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        public Runnable m12288a() {
            SmartRefreshLayout smartRefreshLayout;
            int i;
            float fPow;
            int i2;
            int i3;
            float f;
            RefreshState refreshState;
            RefreshState refreshState2;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState3 = smartRefreshLayout2.f13607d1;
            if (refreshState3.isFinishing) {
                return null;
            }
            if (smartRefreshLayout2.f13602b != 0) {
                if (refreshState3.isOpening || (smartRefreshLayout2.f13589T && smartRefreshLayout2.f13565H && smartRefreshLayout2.f13591U && smartRefreshLayout2.m12287z(smartRefreshLayout2.f13557C))) {
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.f13607d1 == RefreshState.Loading || (smartRefreshLayout3.f13589T && smartRefreshLayout3.f13565H && smartRefreshLayout3.f13591U && smartRefreshLayout3.m12287z(smartRefreshLayout3.f13557C))) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        if (smartRefreshLayout4.f13602b >= (-smartRefreshLayout4.f13580O0)) {
                            smartRefreshLayout = SmartRefreshLayout.this;
                            if (smartRefreshLayout.f13607d1 == RefreshState.Refreshing && smartRefreshLayout.f13602b > smartRefreshLayout.f13576M0) {
                                i = SmartRefreshLayout.this.f13602b;
                                fPow = this.f13687d;
                                i2 = 0;
                                i3 = i;
                                while (i * i3 > 0) {
                                    i2++;
                                    fPow = (float) (((double) fPow) * Math.pow(this.f13688e, (this.f13686c * i2) / 10.0f));
                                    f = ((this.f13686c * 1.0f) / 1000.0f) * fPow;
                                    if (Math.abs(f) < 1.0f) {
                                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                                        refreshState = smartRefreshLayout5.f13607d1;
                                        if (!refreshState.isOpening && ((refreshState != (refreshState2 = RefreshState.Refreshing) || i3 <= smartRefreshLayout5.f13576M0) && (refreshState == refreshState2 || i3 >= (-smartRefreshLayout5.f13580O0)))) {
                                            break;
                                            break;
                                        }
                                        return null;
                                    }
                                    i3 = (int) (i3 + f);
                                }
                            }
                        } else {
                            i = SmartRefreshLayout.this.f13602b;
                            fPow = this.f13687d;
                            i2 = 0;
                            i3 = i;
                            while (i * i3 > 0) {
                                i2++;
                                fPow = (float) (((double) fPow) * Math.pow(this.f13688e, (this.f13686c * i2) / 10.0f));
                                f = ((this.f13686c * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout6.f13607d1;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i3 = (int) (i3 + f);
                            }
                        }
                    } else {
                        smartRefreshLayout = SmartRefreshLayout.this;
                        if (smartRefreshLayout.f13607d1 == RefreshState.Refreshing) {
                            i = SmartRefreshLayout.this.f13602b;
                            fPow = this.f13687d;
                            i2 = 0;
                            i3 = i;
                            while (i * i3 > 0) {
                                i2++;
                                fPow = (float) (((double) fPow) * Math.pow(this.f13688e, (this.f13686c * i2) / 10.0f));
                                f = ((this.f13686c * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout7.f13607d1;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i3 = (int) (i3 + f);
                            }
                        }
                    }
                } else {
                    i = SmartRefreshLayout.this.f13602b;
                    fPow = this.f13687d;
                    i2 = 0;
                    i3 = i;
                    while (i * i3 > 0) {
                        i2++;
                        fPow = (float) (((double) fPow) * Math.pow(this.f13688e, (this.f13686c * i2) / 10.0f));
                        f = ((this.f13686c * 1.0f) / 1000.0f) * fPow;
                        if (Math.abs(f) < 1.0f) {
                            SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                            refreshState = smartRefreshLayout8.f13607d1;
                            if (!refreshState.isOpening) {
                            }
                            return null;
                        }
                        i3 = (int) (i3 + f);
                    }
                }
            }
            this.f13689f = AnimationUtils.currentAnimationTimeMillis();
            SmartRefreshLayout.this.f13603b1.postDelayed(this, this.f13686c);
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f13630o1 != this || smartRefreshLayout.f13607d1.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = jCurrentAnimationTimeMillis - this.f13690g;
            float fPow = (float) (((double) this.f13687d) * Math.pow(this.f13688e, (jCurrentAnimationTimeMillis - this.f13689f) / (1000.0f / this.f13686c)));
            this.f13687d = fPow;
            float f = fPow * ((j * 1.0f) / 1000.0f);
            if (Math.abs(f) <= 1.0f) {
                SmartRefreshLayout.this.f13630o1 = null;
                return;
            }
            this.f13690g = jCurrentAnimationTimeMillis;
            int i = (int) (this.f13684a + f);
            this.f13684a = i;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.f13602b * i > 0) {
                smartRefreshLayout2.f13605c1.mo4654e(i, true);
                SmartRefreshLayout.this.f13603b1.postDelayed(this, this.f13686c);
                return;
            }
            smartRefreshLayout2.f13630o1 = null;
            smartRefreshLayout2.f13605c1.mo4654e(0, true);
            ikf0.m5147d(SmartRefreshLayout.this.f13599Z0.mo3404h(), (int) (-this.f13687d));
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            if (!smartRefreshLayout3.f13624l1 || f <= 0.0f) {
                return;
            }
            smartRefreshLayout3.f13624l1 = false;
        }
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$n */
    public class C1442n implements gnc0 {
        public C1442n() {
        }

        @Override // p003l.gnc0
        /* JADX INFO: renamed from: a */
        public ValueAnimator mo4650a(int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.m12269h(i, 0, smartRefreshLayout.f13643z, smartRefreshLayout.f13610f);
        }

        @Override // p003l.gnc0
        /* JADX INFO: renamed from: b */
        public gnc0 mo4651b(@NonNull bnc0 bnc0Var, int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f13601a1 == null && i != 0) {
                smartRefreshLayout.f13601a1 = new Paint();
            }
            boolean zEquals = bnc0Var.equals(SmartRefreshLayout.this.f13597X0);
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (zEquals) {
                smartRefreshLayout2.f13613g1 = i;
                return this;
            }
            if (bnc0Var.equals(smartRefreshLayout2.f13598Y0)) {
                SmartRefreshLayout.this.f13615h1 = i;
            }
            return this;
        }

        @Override // p003l.gnc0
        @NonNull
        /* JADX INFO: renamed from: c */
        public hnc0 mo4652c() {
            return SmartRefreshLayout.this;
        }

        @Override // p003l.gnc0
        /* JADX INFO: renamed from: d */
        public gnc0 mo4653d() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f13607d1 == RefreshState.TwoLevel) {
                smartRefreshLayout.f13605c1.mo4655f(RefreshState.TwoLevelFinish);
                if (SmartRefreshLayout.this.f13602b == 0) {
                    mo4654e(0, false);
                    SmartRefreshLayout.this.m12258D(RefreshState.None);
                    return this;
                }
                mo4650a(0).setDuration(SmartRefreshLayout.this.f13608e);
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
        @Override // p003l.gnc0
        /* JADX INFO: renamed from: e */
        public gnc0 mo4654e(int i, boolean z) {
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
            if (smartRefreshLayout.f13602b != i || (((bnc0Var3 = smartRefreshLayout.f13597X0) != null && bnc0Var3.mo2970e()) || ((bnc0Var4 = SmartRefreshLayout.this.f13598Y0) != null && bnc0Var4.mo2970e()))) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i6 = smartRefreshLayout2.f13602b;
                smartRefreshLayout2.f13602b = i;
                float f = 10.0f;
                if (z) {
                    RefreshState refreshState = smartRefreshLayout2.f13609e1;
                    if (refreshState.isDragging || refreshState.isOpening) {
                        float f2 = i;
                        float f3 = smartRefreshLayout2.f13592U0;
                        if (f3 < 10.0f) {
                            f3 *= smartRefreshLayout2.f13576M0;
                        }
                        if (f2 <= f3) {
                            float f4 = -i;
                            float f5 = smartRefreshLayout2.f13594V0;
                            if (f5 < 10.0f) {
                                f5 *= smartRefreshLayout2.f13580O0;
                            }
                            if (f4 > f5 && !smartRefreshLayout2.f13589T) {
                                smartRefreshLayout2.f13605c1.mo4655f(RefreshState.ReleaseToLoad);
                            } else if (i < 0 && !smartRefreshLayout2.f13589T) {
                                smartRefreshLayout2.f13605c1.mo4655f(RefreshState.PullUpToLoad);
                            } else if (i > 0) {
                                smartRefreshLayout2.f13605c1.mo4655f(RefreshState.PullDownToRefresh);
                            }
                        } else if (smartRefreshLayout2.f13607d1 != RefreshState.ReleaseToTwoLevel) {
                            smartRefreshLayout2.f13605c1.mo4655f(RefreshState.ReleaseToRefresh);
                        }
                    }
                }
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                if (smartRefreshLayout3.f13599Z0 != null) {
                    if (i < 0) {
                        i5 = 0;
                        z2 = false;
                    } else if (smartRefreshLayout3.m12255A(smartRefreshLayout3.f13561F, smartRefreshLayout3.f13597X0)) {
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
                        if (smartRefreshLayout4.m12255A(smartRefreshLayout4.f13563G, smartRefreshLayout4.f13598Y0)) {
                            i5 = i;
                            z2 = true;
                        } else if (i6 > 0) {
                            z2 = true;
                            i5 = 0;
                        }
                    }
                    if (z2) {
                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                        smartRefreshLayout5.f13599Z0.mo3401e(i5, smartRefreshLayout5.f13636s, smartRefreshLayout5.f13637t);
                        SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                        if (smartRefreshLayout6.f13589T && smartRefreshLayout6.f13591U && smartRefreshLayout6.f13565H) {
                            bnc0 bnc0Var5 = smartRefreshLayout6.f13598Y0;
                            if ((bnc0Var5 instanceof enc0) && bnc0Var5.getSpinnerStyle() == nof0.f5932d) {
                                SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                                if (smartRefreshLayout7.m12287z(smartRefreshLayout7.f13557C)) {
                                    SmartRefreshLayout.this.f13598Y0.getView().setTranslationY(Math.max(0, i5));
                                }
                            }
                        }
                        SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                        boolean z3 = (smartRefreshLayout8.f13558D && (bnc0Var2 = smartRefreshLayout8.f13597X0) != null && bnc0Var2.getSpinnerStyle() == nof0.f5934f) || SmartRefreshLayout.this.f13613g1 != 0;
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        boolean z4 = (smartRefreshLayout9.f13559E && (bnc0Var = smartRefreshLayout9.f13598Y0) != null && bnc0Var.getSpinnerStyle() == nof0.f5934f) || SmartRefreshLayout.this.f13615h1 != 0;
                        if ((z3 && (i5 >= 0 || i6 > 0)) || (z4 && (i5 <= 0 || i6 < 0))) {
                            smartRefreshLayout2.invalidate();
                        }
                    }
                }
                float f6 = 1.0f;
                if ((i >= 0 || i6 > 0) && SmartRefreshLayout.this.f13597X0 != null) {
                    int iMax = Math.max(i, 0);
                    SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                    int i7 = smartRefreshLayout10.f13576M0;
                    float f7 = smartRefreshLayout10.f13588S0;
                    if (f7 < 10.0f) {
                        f7 *= i7;
                    }
                    int i8 = (int) f7;
                    float f8 = iMax * 1.0f;
                    float f9 = smartRefreshLayout10.f13592U0;
                    if (f9 < 10.0f) {
                        f9 *= i7;
                    }
                    float f10 = f8 / f9;
                    if (smartRefreshLayout10.m12287z(smartRefreshLayout10.f13556B) || (SmartRefreshLayout.this.f13607d1 == RefreshState.RefreshFinish && !z)) {
                        SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                        if (i6 != smartRefreshLayout11.f13602b) {
                            nof0 spinnerStyle = smartRefreshLayout11.f13597X0.getSpinnerStyle();
                            nof0 nof0Var = nof0.f5932d;
                            SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                            if (spinnerStyle == nof0Var) {
                                smartRefreshLayout12.f13597X0.getView().setTranslationY(SmartRefreshLayout.this.f13602b);
                                SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                                if (smartRefreshLayout13.f13613g1 != 0 && smartRefreshLayout13.f13601a1 != null && !smartRefreshLayout13.m12255A(smartRefreshLayout13.f13561F, smartRefreshLayout13.f13597X0)) {
                                    smartRefreshLayout2.invalidate();
                                }
                            } else {
                                if (smartRefreshLayout12.f13597X0.getSpinnerStyle().f5940c) {
                                    View view = SmartRefreshLayout.this.f13597X0.getView();
                                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : SmartRefreshLayout.f13554t1;
                                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((SmartRefreshLayout.this.f13602b - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                                    int i9 = marginLayoutParams.leftMargin;
                                    int i10 = marginLayoutParams.topMargin + SmartRefreshLayout.this.f13584Q0;
                                    view.layout(i9, i10, view.getMeasuredWidth() + i9, view.getMeasuredHeight() + i10);
                                }
                                SmartRefreshLayout.this.f13597X0.mo2974l(z, f10, iMax, i7, i8);
                            }
                            SmartRefreshLayout.this.f13597X0.mo2974l(z, f10, iMax, i7, i8);
                        } else {
                            f = 10.0f;
                            f6 = 1.0f;
                        }
                        if (z && SmartRefreshLayout.this.f13597X0.mo2970e()) {
                            int i11 = (int) SmartRefreshLayout.this.f13618j;
                            int width = smartRefreshLayout2.getWidth();
                            SmartRefreshLayout smartRefreshLayout14 = SmartRefreshLayout.this;
                            smartRefreshLayout14.f13597X0.mo2969d(smartRefreshLayout14.f13618j / (width == 0 ? 1 : width), i11, width);
                        }
                    } else {
                        f = 10.0f;
                        f6 = 1.0f;
                    }
                    SmartRefreshLayout smartRefreshLayout15 = SmartRefreshLayout.this;
                    if (i6 != smartRefreshLayout15.f13602b && (qe50Var = smartRefreshLayout15.f13562F0) != null) {
                        bnc0 bnc0Var6 = smartRefreshLayout15.f13597X0;
                        if (bnc0Var6 instanceof fnc0) {
                            qe50Var.mo2871A0((fnc0) bnc0Var6, z, f10, iMax, i7, i8);
                        }
                    }
                } else {
                    f = 10.0f;
                    f6 = 1.0f;
                }
                if ((i <= 0 || i6 < 0) && SmartRefreshLayout.this.f13598Y0 != null) {
                    int i12 = -Math.min(i, 0);
                    SmartRefreshLayout smartRefreshLayout16 = SmartRefreshLayout.this;
                    int i13 = smartRefreshLayout16.f13580O0;
                    float f11 = smartRefreshLayout16.f13590T0;
                    if (f11 < f) {
                        f11 *= i13;
                    }
                    int i14 = (int) f11;
                    float f12 = i12 * f6;
                    float f13 = smartRefreshLayout16.f13594V0;
                    if (f13 < f) {
                        f13 *= i13;
                    }
                    float f14 = f12 / f13;
                    if (smartRefreshLayout16.m12287z(smartRefreshLayout16.f13557C) || (SmartRefreshLayout.this.f13607d1 == RefreshState.LoadFinish && !z)) {
                        SmartRefreshLayout smartRefreshLayout17 = SmartRefreshLayout.this;
                        if (i6 != smartRefreshLayout17.f13602b) {
                            nof0 spinnerStyle2 = smartRefreshLayout17.f13598Y0.getSpinnerStyle();
                            nof0 nof0Var2 = nof0.f5932d;
                            SmartRefreshLayout smartRefreshLayout18 = SmartRefreshLayout.this;
                            if (spinnerStyle2 == nof0Var2) {
                                smartRefreshLayout18.f13598Y0.getView().setTranslationY(SmartRefreshLayout.this.f13602b);
                                SmartRefreshLayout smartRefreshLayout19 = SmartRefreshLayout.this;
                                if (smartRefreshLayout19.f13615h1 != 0 && smartRefreshLayout19.f13601a1 != null && !smartRefreshLayout19.m12255A(smartRefreshLayout19.f13563G, smartRefreshLayout19.f13598Y0)) {
                                    smartRefreshLayout2.invalidate();
                                }
                            } else if (smartRefreshLayout18.f13598Y0.getSpinnerStyle().f5940c) {
                                View view2 = SmartRefreshLayout.this.f13598Y0.getView();
                                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : SmartRefreshLayout.f13554t1;
                                view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(((-SmartRefreshLayout.this.f13602b) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), 1073741824));
                                int i15 = marginLayoutParams2.leftMargin;
                                int measuredHeight = (marginLayoutParams2.topMargin + smartRefreshLayout2.getMeasuredHeight()) - SmartRefreshLayout.this.f13586R0;
                                view2.layout(i15, measuredHeight - view2.getMeasuredHeight(), view2.getMeasuredWidth() + i15, measuredHeight);
                            }
                            i2 = i12;
                            i3 = i13;
                            i4 = i14;
                            SmartRefreshLayout.this.f13598Y0.mo2974l(z, f14, i2, i3, i4);
                        } else {
                            i2 = i12;
                            i3 = i13;
                            i4 = i14;
                        }
                        if (z && SmartRefreshLayout.this.f13598Y0.mo2970e()) {
                            int i16 = (int) SmartRefreshLayout.this.f13618j;
                            int width2 = smartRefreshLayout2.getWidth();
                            SmartRefreshLayout smartRefreshLayout20 = SmartRefreshLayout.this;
                            smartRefreshLayout20.f13598Y0.mo2969d(smartRefreshLayout20.f13618j / (width2 != 0 ? width2 : 1), i16, width2);
                        }
                    } else {
                        i2 = i12;
                        i3 = i13;
                        i4 = i14;
                    }
                    SmartRefreshLayout smartRefreshLayout21 = SmartRefreshLayout.this;
                    if (i6 != smartRefreshLayout21.f13602b && (qe50Var2 = smartRefreshLayout21.f13562F0) != null) {
                        bnc0 bnc0Var7 = smartRefreshLayout21.f13598Y0;
                        if (bnc0Var7 instanceof enc0) {
                            qe50Var2.mo2878k((enc0) bnc0Var7, z, f14, i2, i3, i4);
                        }
                    }
                }
            }
            return this;
        }

        @Override // p003l.gnc0
        /* JADX INFO: renamed from: f */
        public gnc0 mo4655f(@NonNull RefreshState refreshState) {
            switch (C1429a.f13644a[refreshState.ordinal()]) {
                case 1:
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    RefreshState refreshState2 = smartRefreshLayout.f13607d1;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.f13602b == 0) {
                        smartRefreshLayout.m12258D(refreshState3);
                    } else if (smartRefreshLayout.f13602b != 0) {
                        mo4650a(0);
                    }
                    break;
                case 2:
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout2.f13607d1.isOpening && smartRefreshLayout2.m12287z(smartRefreshLayout2.f13556B)) {
                        SmartRefreshLayout.this.m12258D(RefreshState.PullDownToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.m12287z(smartRefreshLayout3.f13557C)) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        RefreshState refreshState4 = smartRefreshLayout4.f13607d1;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!smartRefreshLayout4.f13589T || !smartRefreshLayout4.f13565H || !smartRefreshLayout4.f13591U)) {
                            smartRefreshLayout4.m12258D(RefreshState.PullUpToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout5.f13607d1.isOpening && smartRefreshLayout5.m12287z(smartRefreshLayout5.f13556B)) {
                        SmartRefreshLayout.this.m12258D(RefreshState.PullDownCanceled);
                        mo4655f(RefreshState.None);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.m12287z(smartRefreshLayout6.f13557C)) {
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        if (!smartRefreshLayout7.f13607d1.isOpening && (!smartRefreshLayout7.f13589T || !smartRefreshLayout7.f13565H || !smartRefreshLayout7.f13591U)) {
                            smartRefreshLayout7.m12258D(RefreshState.PullUpCanceled);
                            mo4655f(RefreshState.None);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpCanceled);
                    break;
                case 6:
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout8.f13607d1.isOpening && smartRefreshLayout8.m12287z(smartRefreshLayout8.f13556B)) {
                        SmartRefreshLayout.this.m12258D(RefreshState.ReleaseToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    if (smartRefreshLayout9.m12287z(smartRefreshLayout9.f13557C)) {
                        SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                        RefreshState refreshState5 = smartRefreshLayout10.f13607d1;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!smartRefreshLayout10.f13589T || !smartRefreshLayout10.f13565H || !smartRefreshLayout10.f13591U)) {
                            smartRefreshLayout10.m12258D(RefreshState.ReleaseToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout11.f13607d1.isOpening && smartRefreshLayout11.m12287z(smartRefreshLayout11.f13556B)) {
                        SmartRefreshLayout.this.m12258D(RefreshState.ReleaseToTwoLevel);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout12.f13607d1.isOpening && smartRefreshLayout12.m12287z(smartRefreshLayout12.f13556B)) {
                        SmartRefreshLayout.this.m12258D(RefreshState.RefreshReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout13.f13607d1.isOpening && smartRefreshLayout13.m12287z(smartRefreshLayout13.f13557C)) {
                        SmartRefreshLayout.this.m12258D(RefreshState.LoadReleased);
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
                    SmartRefreshLayout.this.m12258D(refreshState);
                    break;
            }
            return null;
        }
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13608e = HttpStatus.MULTIPLE_CHOICES_300;
        this.f13610f = HttpStatus.MULTIPLE_CHOICES_300;
        this.f13623l = 0.5f;
        this.f13625m = 'n';
        this.f13634q = -1;
        this.f13635r = -1;
        this.f13636s = -1;
        this.f13637t = -1;
        this.f13556B = true;
        this.f13557C = false;
        this.f13558D = true;
        this.f13559E = true;
        this.f13561F = true;
        this.f13563G = true;
        this.f13565H = false;
        this.f13567I = true;
        this.f13569J = true;
        this.f13571K = false;
        this.f13573L = true;
        this.f13575M = false;
        this.f13577N = true;
        this.f13579O = true;
        this.f13581P = true;
        this.f13583Q = true;
        this.f13585R = false;
        this.f13587S = false;
        this.f13589T = false;
        this.f13591U = false;
        this.f13593V = false;
        this.f13595W = false;
        this.f13621k0 = false;
        this.f13570J0 = new int[2];
        this.f13572K0 = new t920(this);
        this.f13574L0 = new x920(this);
        f1e f1eVar = f1e.f3434c;
        this.f13578N0 = f1eVar;
        this.f13582P0 = f1eVar;
        this.f13588S0 = 2.5f;
        this.f13590T0 = 2.5f;
        this.f13592U0 = 1.0f;
        this.f13594V0 = 1.0f;
        this.f13596W0 = 0.16666667f;
        this.f13605c1 = new C1442n();
        RefreshState refreshState = RefreshState.None;
        this.f13607d1 = refreshState;
        this.f13609e1 = refreshState;
        this.f13611f1 = 0L;
        this.f13613g1 = 0;
        this.f13615h1 = 0;
        this.f13624l1 = false;
        this.f13626m1 = false;
        this.f13628n1 = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f13603b1 = new Handler(Looper.getMainLooper());
        this.f13641x = new Scroller(context);
        this.f13642y = VelocityTracker.obtain();
        this.f13612g = context.getResources().getDisplayMetrics().heightPixels;
        this.f13643z = new ikf0(ikf0.f4427b);
        this.f13600a = viewConfiguration.getScaledTouchSlop();
        this.f13638u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f13639v = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f13580O0 = ikf0.m5146c(60.0f);
        this.f13576M0 = ikf0.m5146c(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.j1);
        if (!typedArrayObtainStyledAttributes.hasValue(b9c0.l1)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(b9c0.k1)) {
            super.setClipChildren(false);
        }
        dqd dqdVar = f13553s1;
        if (dqdVar != null) {
            dqdVar.mo3628a(context, this);
        }
        this.f13623l = typedArrayObtainStyledAttributes.getFloat(b9c0.p1, this.f13623l);
        this.f13588S0 = typedArrayObtainStyledAttributes.getFloat(b9c0.Q1, this.f13588S0);
        this.f13590T0 = typedArrayObtainStyledAttributes.getFloat(b9c0.L1, this.f13590T0);
        this.f13592U0 = typedArrayObtainStyledAttributes.getFloat(b9c0.S1, this.f13592U0);
        this.f13594V0 = typedArrayObtainStyledAttributes.getFloat(b9c0.N1, this.f13594V0);
        this.f13556B = typedArrayObtainStyledAttributes.getBoolean(b9c0.E1, this.f13556B);
        this.f13610f = typedArrayObtainStyledAttributes.getInt(b9c0.U1, this.f13610f);
        this.f13557C = typedArrayObtainStyledAttributes.getBoolean(b9c0.x1, this.f13557C);
        this.f13576M0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b9c0.O1, this.f13576M0);
        this.f13580O0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b9c0.J1, this.f13580O0);
        this.f13584Q0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b9c0.P1, this.f13584Q0);
        this.f13586R0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b9c0.K1, this.f13586R0);
        this.f13585R = typedArrayObtainStyledAttributes.getBoolean(b9c0.o1, this.f13585R);
        this.f13587S = typedArrayObtainStyledAttributes.getBoolean(b9c0.n1, this.f13587S);
        this.f13561F = typedArrayObtainStyledAttributes.getBoolean(b9c0.w1, this.f13561F);
        this.f13563G = typedArrayObtainStyledAttributes.getBoolean(b9c0.v1, this.f13563G);
        this.f13567I = typedArrayObtainStyledAttributes.getBoolean(b9c0.C1, this.f13567I);
        this.f13573L = typedArrayObtainStyledAttributes.getBoolean(b9c0.q1, this.f13573L);
        this.f13569J = typedArrayObtainStyledAttributes.getBoolean(b9c0.A1, this.f13569J);
        this.f13575M = typedArrayObtainStyledAttributes.getBoolean(b9c0.D1, this.f13575M);
        this.f13577N = typedArrayObtainStyledAttributes.getBoolean(b9c0.F1, this.f13577N);
        this.f13579O = typedArrayObtainStyledAttributes.getBoolean(b9c0.G1, this.f13579O);
        this.f13581P = typedArrayObtainStyledAttributes.getBoolean(b9c0.y1, this.f13581P);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(b9c0.t1, this.f13565H);
        this.f13565H = z;
        this.f13565H = typedArrayObtainStyledAttributes.getBoolean(b9c0.u1, z);
        this.f13558D = typedArrayObtainStyledAttributes.getBoolean(b9c0.s1, this.f13558D);
        this.f13559E = typedArrayObtainStyledAttributes.getBoolean(b9c0.r1, this.f13559E);
        this.f13571K = typedArrayObtainStyledAttributes.getBoolean(b9c0.B1, this.f13571K);
        this.f13634q = typedArrayObtainStyledAttributes.getResourceId(b9c0.I1, this.f13634q);
        this.f13635r = typedArrayObtainStyledAttributes.getResourceId(b9c0.H1, this.f13635r);
        this.f13636s = typedArrayObtainStyledAttributes.getResourceId(b9c0.R1, this.f13636s);
        this.f13637t = typedArrayObtainStyledAttributes.getResourceId(b9c0.M1, this.f13637t);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(b9c0.z1, this.f13583Q);
        this.f13583Q = z2;
        this.f13572K0.n(z2);
        this.f13593V = this.f13593V || typedArrayObtainStyledAttributes.hasValue(b9c0.x1);
        this.f13595W = this.f13595W || typedArrayObtainStyledAttributes.hasValue(b9c0.w1);
        this.f13621k0 = this.f13621k0 || typedArrayObtainStyledAttributes.hasValue(b9c0.v1);
        this.f13578N0 = typedArrayObtainStyledAttributes.hasValue(b9c0.O1) ? f1e.f3440i : this.f13578N0;
        this.f13582P0 = typedArrayObtainStyledAttributes.hasValue(b9c0.J1) ? f1e.f3440i : this.f13582P0;
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.m1, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(b9c0.T1, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.f13555A = new int[]{color2, color};
            } else {
                this.f13555A = new int[]{color2};
            }
        } else if (color != 0) {
            this.f13555A = new int[]{0, color};
        }
        if (this.f13575M && !this.f13593V && !this.f13557C) {
            this.f13557C = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void setDefaultRefreshFooterCreator(@NonNull bqd bqdVar) {
        f13551q1 = bqdVar;
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull cqd cqdVar) {
        f13552r1 = cqdVar;
    }

    public static void setDefaultRefreshInitializer(@NonNull dqd dqdVar) {
        f13553s1 = dqdVar;
    }

    /* JADX INFO: renamed from: A */
    public boolean m12255A(boolean z, @Nullable bnc0 bnc0Var) {
        return z || this.f13575M || bnc0Var == null || bnc0Var.getSpinnerStyle() == nof0.f5934f;
    }

    /* JADX INFO: renamed from: B */
    public boolean m12256B() {
        return this.f13607d1 == RefreshState.Refreshing;
    }

    /* JADX INFO: renamed from: C */
    public void m12257C(float f) {
        RefreshState refreshState;
        float f2 = (!this.f13568I0 || this.f13581P || f >= 0.0f || this.f13599Z0.mo3403g()) ? f : 0.0f;
        if (f2 > this.f13612g * 5 && getTag() == null && getTag(p4c0.J0) == null) {
            float f3 = this.f13620k;
            int i = this.f13612g;
            if (f3 < i / 6.0f && this.f13618j < i / 16.0f) {
                lsi0.y("你这么死拉，臣妾做不到啊！");
                setTag(p4c0.J0, "你这么死拉，臣妾做不到啊！");
            }
        }
        RefreshState refreshState2 = this.f13607d1;
        if (refreshState2 == RefreshState.TwoLevel && f2 > 0.0f) {
            this.f13605c1.mo4654e(Math.min((int) f2, getMeasuredHeight()), true);
        } else if (refreshState2 == RefreshState.Refreshing && f2 >= 0.0f) {
            int i2 = this.f13576M0;
            if (f2 < i2) {
                this.f13605c1.mo4654e((int) f2, true);
            } else {
                float f4 = this.f13588S0;
                if (f4 < 10.0f) {
                    f4 *= i2;
                }
                double d = f4 - i2;
                int iMax = Math.max((this.f13612g * 4) / 3, getHeight());
                int i3 = this.f13576M0;
                double d2 = iMax - i3;
                double dMax = Math.max(0.0f, (f2 - i3) * this.f13623l);
                double d3 = -dMax;
                if (d2 == 0.0d) {
                    d2 = 1.0d;
                }
                this.f13605c1.mo4654e(((int) Math.min(d * (1.0d - Math.pow(100.0d, d3 / d2)), dMax)) + this.f13576M0, true);
            }
        } else if (f2 < 0.0f && (refreshState2 == RefreshState.Loading || ((this.f13565H && this.f13589T && this.f13591U && m12287z(this.f13557C)) || (this.f13573L && !this.f13589T && m12287z(this.f13557C))))) {
            int i4 = this.f13580O0;
            if (f2 > (-i4)) {
                this.f13605c1.mo4654e((int) f2, true);
            } else {
                float f5 = this.f13590T0;
                if (f5 < 10.0f) {
                    f5 *= i4;
                }
                double d4 = f5 - i4;
                int iMax2 = Math.max((this.f13612g * 4) / 3, getHeight());
                int i5 = this.f13580O0;
                double d5 = iMax2 - i5;
                double d6 = -Math.min(0.0f, (i5 + f2) * this.f13623l);
                double d7 = -d6;
                if (d5 == 0.0d) {
                    d5 = 1.0d;
                }
                this.f13605c1.mo4654e(((int) (-Math.min(d4 * (1.0d - Math.pow(100.0d, d7 / d5)), d6))) - this.f13580O0, true);
            }
        } else if (f2 >= 0.0f) {
            float f6 = this.f13588S0;
            double d8 = f6 < 10.0f ? this.f13576M0 * f6 : f6;
            double dMax2 = Math.max(this.f13612g / 2, getHeight());
            double dMax3 = Math.max(0.0f, this.f13623l * f2);
            double d9 = -dMax3;
            if (dMax2 == 0.0d) {
                dMax2 = 1.0d;
            }
            this.f13605c1.mo4654e((int) Math.min(d8 * (1.0d - Math.pow(100.0d, d9 / dMax2)), dMax3), true);
        } else {
            float f7 = this.f13590T0;
            double d10 = f7 < 10.0f ? this.f13580O0 * f7 : f7;
            double dMax4 = Math.max(this.f13612g / 2, getHeight());
            double d11 = -Math.min(0.0f, this.f13623l * f2);
            double d12 = -d11;
            if (dMax4 == 0.0d) {
                dMax4 = 1.0d;
            }
            this.f13605c1.mo4654e((int) (-Math.min(d10 * (1.0d - Math.pow(100.0d, d12 / dMax4)), d11)), true);
        }
        if (!this.f13573L || this.f13589T || !m12287z(this.f13557C) || f2 >= 0.0f || (refreshState = this.f13607d1) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
            return;
        }
        if (this.f13587S) {
            this.f13630o1 = null;
            this.f13605c1.mo4650a(-this.f13580O0);
        }
        setStateDirectLoading(false);
        this.f13603b1.postDelayed(new RunnableC1434f(), this.f13610f);
    }

    /* JADX INFO: renamed from: D */
    public void m12258D(RefreshState refreshState) {
        RefreshState refreshState2 = this.f13607d1;
        if (refreshState2 == refreshState) {
            if (this.f13609e1 != refreshState2) {
                this.f13609e1 = refreshState2;
                return;
            }
            return;
        }
        this.f13607d1 = refreshState;
        this.f13609e1 = refreshState;
        bnc0 bnc0Var = this.f13597X0;
        bnc0 bnc0Var2 = this.f13598Y0;
        qe50 qe50Var = this.f13562F0;
        if (bnc0Var != null) {
            bnc0Var.mo2876f(this, refreshState2, refreshState);
        }
        if (bnc0Var2 != null) {
            bnc0Var2.mo2876f(this, refreshState2, refreshState);
        }
        if (qe50Var != null) {
            qe50Var.mo2876f(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.f13624l1 = false;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m12259E() {
        RefreshState refreshState = this.f13607d1;
        if (refreshState == RefreshState.TwoLevel) {
            if (this.f13640w <= -1000 || this.f13602b <= getHeight() / 2) {
                if (this.f13627n) {
                    this.f13605c1.mo4653d();
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimatorMo4650a = this.f13605c1.mo4650a(getHeight());
                if (valueAnimatorMo4650a != null) {
                    valueAnimatorMo4650a.setDuration(this.f13608e);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState == refreshState2 || (this.f13565H && this.f13589T && this.f13591U && this.f13602b < 0 && m12287z(this.f13557C))) {
            int i = this.f13602b;
            int i2 = this.f13580O0;
            if (i < (-i2)) {
                this.f13605c1.mo4650a(-i2);
                return;
            } else {
                if (i > 0) {
                    this.f13605c1.mo4650a(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState3 = this.f13607d1;
        RefreshState refreshState4 = RefreshState.Refreshing;
        if (refreshState3 == refreshState4) {
            int i3 = this.f13602b;
            int i4 = this.f13576M0;
            if (i3 > i4) {
                this.f13605c1.mo4650a(i4);
                return;
            } else {
                if (i3 < 0) {
                    this.f13605c1.mo4650a(0);
                    return;
                }
                return;
            }
        }
        if (refreshState3 == RefreshState.PullDownToRefresh) {
            this.f13605c1.mo4655f(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState3 == RefreshState.PullUpToLoad) {
            this.f13605c1.mo4655f(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToRefresh) {
            this.f13605c1.mo4655f(refreshState4);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToLoad) {
            this.f13605c1.mo4655f(refreshState2);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToTwoLevel) {
            this.f13605c1.mo4655f(RefreshState.TwoLevelReleased);
            return;
        }
        if (refreshState3 == RefreshState.RefreshReleased) {
            if (this.f13633p1 == null) {
                this.f13605c1.mo4650a(this.f13576M0);
            }
        } else if (refreshState3 == RefreshState.LoadReleased) {
            if (this.f13633p1 == null) {
                this.f13605c1.mo4650a(-this.f13580O0);
            }
        } else {
            if (refreshState3 == RefreshState.LoadFinish || this.f13602b == 0) {
                return;
            }
            this.f13605c1.mo4650a(0);
        }
    }

    /* JADX INFO: renamed from: F */
    public hnc0 m12260F(boolean z) {
        this.f13573L = z;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public hnc0 m12261G(boolean z) {
        this.f13593V = true;
        this.f13557C = z;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public hnc0 m12262H(boolean z) {
        this.f13581P = z;
        cnc0 cnc0Var = this.f13599Z0;
        if (cnc0Var != null) {
            cnc0Var.mo3398b(z);
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public hnc0 m12263I(boolean z) {
        this.f13556B = z;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public hnc0 m12264J(float f) {
        this.f13590T0 = f;
        bnc0 bnc0Var = this.f13598Y0;
        if (bnc0Var == null || !this.f13622k1) {
            this.f13582P0 = this.f13582P0.m3959c();
            return this;
        }
        if (f < 10.0f) {
            f *= this.f13580O0;
        }
        bnc0Var.mo2973i(this.f13605c1, this.f13580O0, (int) f);
        return this;
    }

    /* JADX INFO: renamed from: K */
    public hnc0 m12265K(float f) {
        this.f13588S0 = f;
        bnc0 bnc0Var = this.f13597X0;
        if (bnc0Var == null || !this.f13622k1) {
            this.f13578N0 = this.f13578N0.m3959c();
            return this;
        }
        if (f < 10.0f) {
            f *= this.f13576M0;
        }
        bnc0Var.mo2973i(this.f13605c1, this.f13576M0, (int) f);
        return this;
    }

    /* JADX INFO: renamed from: L */
    public hnc0 m12266L(boolean z) {
        RefreshState refreshState = this.f13607d1;
        if (refreshState == RefreshState.Refreshing && z) {
            m12285x();
            return this;
        }
        if (refreshState == RefreshState.Loading && z) {
            m12280s();
            return this;
        }
        if (this.f13589T == z) {
            return this;
        }
        this.f13589T = z;
        bnc0 bnc0Var = this.f13598Y0;
        if (!(bnc0Var instanceof enc0)) {
            return this;
        }
        if (!((enc0) bnc0Var).m3911b(z)) {
            this.f13591U = false;
            tqq0.a("Footer:", this.f13598Y0, " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])");
            return null;
        }
        this.f13591U = true;
        if (!this.f13589T || !this.f13565H || this.f13602b <= 0 || this.f13598Y0.getSpinnerStyle() != nof0.f5932d || !m12287z(this.f13557C) || !m12255A(this.f13556B, this.f13597X0)) {
            return this;
        }
        this.f13598Y0.getView().setTranslationY(this.f13602b);
        return this;
    }

    /* JADX INFO: renamed from: M */
    public hnc0 mo11640M(me50 me50Var) {
        this.f13560E0 = me50Var;
        this.f13557C = this.f13557C || !(this.f13593V || me50Var == null);
        return this;
    }

    /* JADX INFO: renamed from: N */
    public hnc0 m12267N(qe50 qe50Var) {
        this.f13562F0 = qe50Var;
        return this;
    }

    /* JADX INFO: renamed from: O */
    public hnc0 mo11641O(df50 df50Var) {
        this.f13632p0 = df50Var;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public hnc0 mo11642P(ef50 ef50Var) {
        this.f13632p0 = ef50Var;
        this.f13560E0 = ef50Var;
        this.f13557C = this.f13557C || !(this.f13593V || ef50Var == null);
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public hnc0 mo11643Q(@NonNull enc0 enc0Var) {
        return mo11644R(enc0Var, 0, 0);
    }

    /* JADX INFO: renamed from: R */
    public hnc0 mo11644R(@NonNull enc0 enc0Var, int i, int i2) {
        bnc0 bnc0Var;
        bnc0 bnc0Var2 = this.f13598Y0;
        if (bnc0Var2 != null) {
            super.removeView(bnc0Var2.getView());
        }
        this.f13598Y0 = enc0Var;
        this.f13624l1 = false;
        this.f13615h1 = 0;
        this.f13591U = false;
        this.f13619j1 = false;
        this.f13582P0 = f1e.f3434c;
        this.f13557C = !this.f13593V || this.f13557C;
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -2;
        }
        C1441m c1441m = new C1441m(i, i2);
        ViewGroup.LayoutParams layoutParams = enc0Var.getView().getLayoutParams();
        if (layoutParams instanceof C1441m) {
            c1441m = (C1441m) layoutParams;
        }
        boolean z = this.f13598Y0.getSpinnerStyle().f5939b;
        bnc0 bnc0Var3 = this.f13598Y0;
        if (z) {
            super.addView(bnc0Var3.getView(), getChildCount(), c1441m);
        } else {
            super.addView(bnc0Var3.getView(), 0, c1441m);
        }
        int[] iArr = this.f13555A;
        if (iArr != null && (bnc0Var = this.f13598Y0) != null) {
            bnc0Var.setPrimaryColors(iArr);
        }
        return this;
    }

    /* JADX INFO: renamed from: S */
    public hnc0 mo11645S(@NonNull fnc0 fnc0Var) {
        return mo11646T(fnc0Var, 0, 0);
    }

    /* JADX INFO: renamed from: T */
    public hnc0 mo11646T(@NonNull fnc0 fnc0Var, int i, int i2) {
        bnc0 bnc0Var;
        bnc0 bnc0Var2 = this.f13597X0;
        if (bnc0Var2 != null) {
            super.removeView(bnc0Var2.getView());
        }
        this.f13597X0 = fnc0Var;
        this.f13613g1 = 0;
        this.f13617i1 = false;
        this.f13578N0 = f1e.f3434c;
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -2;
        }
        C1441m c1441m = new C1441m(i, i2);
        ViewGroup.LayoutParams layoutParams = fnc0Var.getView().getLayoutParams();
        if (layoutParams instanceof C1441m) {
            c1441m = (C1441m) layoutParams;
        }
        boolean z = this.f13597X0.getSpinnerStyle().f5939b;
        bnc0 bnc0Var3 = this.f13597X0;
        if (z) {
            super.addView(bnc0Var3.getView(), getChildCount(), c1441m);
        } else {
            super.addView(bnc0Var3.getView(), 0, c1441m);
        }
        int[] iArr = this.f13555A;
        if (iArr != null && (bnc0Var = this.f13597X0) != null) {
            bnc0Var.setPrimaryColors(iArr);
        }
        return this;
    }

    /* JADX INFO: renamed from: U */
    public boolean m12268U(float f) {
        if (f == 0.0f) {
            f = this.f13640w;
        }
        if (Build.VERSION.SDK_INT > 27 && this.f13599Z0 != null) {
            getScaleY();
            View view = this.f13599Z0.getView();
            if (getScaleY() == -1.0f && view.getScaleY() == -1.0f) {
                f = -f;
            }
        }
        if (Math.abs(f) > this.f13638u) {
            int i = this.f13602b;
            if (i * f < 0.0f) {
                RefreshState refreshState = this.f13607d1;
                if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading || (i < 0 && this.f13589T)) {
                    this.f13630o1 = new RunnableC1440l(f).m12288a();
                    return true;
                }
                if (refreshState.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f < 0.0f && ((this.f13569J && (this.f13557C || this.f13571K)) || ((this.f13607d1 == RefreshState.Loading && i >= 0) || (this.f13573L && m12287z(this.f13557C))))) || (f > 0.0f && ((this.f13569J && this.f13556B) || this.f13571K || (this.f13607d1 == RefreshState.Refreshing && this.f13602b <= 0)))) {
                this.f13626m1 = false;
                this.f13641x.fling(0, 0, 0, (int) (-f), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.f13641x.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    @Override // p003l.hnc0
    /* JADX INFO: renamed from: a */
    public hnc0 mo4989a(boolean z) {
        setNestedScrollingEnabled(z);
        return this;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f13641x.getCurrY();
        if (this.f13641x.computeScrollOffset()) {
            int finalY = this.f13641x.getFinalY();
            if ((finalY >= 0 || !((this.f13556B || this.f13571K) && this.f13599Z0.mo3406j())) && (finalY <= 0 || !((this.f13557C || this.f13571K) && this.f13599Z0.mo3403g()))) {
                this.f13626m1 = true;
                invalidate();
            } else {
                if (this.f13626m1) {
                    Scroller scroller = this.f13641x;
                    m12270i(finalY > 0 ? -scroller.getCurrVelocity() : scroller.getCurrVelocity());
                }
                this.f13641x.forceFinished(true);
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
        throw new UnsupportedOperationException("Method not decompiled: p028v.smart_refresh.SmartRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Paint paint;
        Paint paint2;
        cnc0 cnc0Var = this.f13599Z0;
        View view2 = cnc0Var != null ? cnc0Var.getView() : null;
        bnc0 bnc0Var = this.f13597X0;
        if (bnc0Var != null && bnc0Var.getView() == view) {
            if (!m12287z(this.f13556B) || (!this.f13567I && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getTop() + view2.getPaddingTop() + this.f13602b, view.getTop());
                int i = this.f13613g1;
                if (i != 0 && (paint2 = this.f13601a1) != null) {
                    paint2.setColor(i);
                    if (this.f13597X0.getSpinnerStyle().f5940c) {
                        iMax = view.getBottom();
                    } else if (this.f13597X0.getSpinnerStyle() == nof0.f5932d) {
                        iMax = view.getBottom() + this.f13602b;
                    }
                    int i2 = iMax;
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), i2, this.f13601a1);
                    iMax = i2;
                }
                if ((this.f13558D && this.f13597X0.getSpinnerStyle() == nof0.f5934f) || this.f13597X0.getSpinnerStyle().f5940c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        bnc0 bnc0Var2 = this.f13598Y0;
        if (bnc0Var2 != null && bnc0Var2.getView() == view) {
            if (!m12287z(this.f13557C) || (!this.f13567I && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f13602b, view.getBottom());
                int i3 = this.f13615h1;
                if (i3 != 0 && (paint = this.f13601a1) != null) {
                    paint.setColor(i3);
                    if (this.f13598Y0.getSpinnerStyle().f5940c) {
                        iMin = view.getTop();
                    } else if (this.f13598Y0.getSpinnerStyle() == nof0.f5932d) {
                        iMin = view.getTop() + this.f13602b;
                    }
                    int i4 = iMin;
                    canvas.drawRect(0.0f, i4, getWidth(), view.getBottom(), this.f13601a1);
                    iMin = i4;
                }
                if ((this.f13559E && this.f13598Y0.getSpinnerStyle() == nof0.f5934f) || this.f13598Y0.getSpinnerStyle().f5940c) {
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
        return new C1441m(getContext(), attributeSet);
    }

    @Override // p003l.hnc0
    @NonNull
    public ViewGroup getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f13574L0.a();
    }

    @Nullable
    public enc0 getRefreshFooter() {
        bnc0 bnc0Var = this.f13598Y0;
        if (bnc0Var instanceof enc0) {
            return (enc0) bnc0Var;
        }
        return null;
    }

    @Nullable
    public fnc0 getRefreshHeader() {
        bnc0 bnc0Var = this.f13597X0;
        if (bnc0Var instanceof fnc0) {
            return (fnc0) bnc0Var;
        }
        return null;
    }

    @NonNull
    public RefreshState getState() {
        return this.f13607d1;
    }

    /* JADX INFO: renamed from: h */
    public ValueAnimator m12269h(int i, int i2, Interpolator interpolator, int i3) {
        if (this.f13602b == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.f13633p1;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.f13633p1.cancel();
            this.f13633p1 = null;
        }
        this.f13630o1 = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f13602b, i);
        this.f13633p1 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i3);
        this.f13633p1.setInterpolator(interpolator);
        this.f13633p1.addListener(new C1432d());
        this.f13633p1.addUpdateListener(new C1433e());
        this.f13633p1.setStartDelay(i2);
        this.f13633p1.start();
        return this.f13633p1;
    }

    /* JADX INFO: renamed from: i */
    public void m12270i(float f) {
        RefreshState refreshState;
        if (this.f13633p1 == null) {
            if (f > 0.0f && ((refreshState = this.f13607d1) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                this.f13630o1 = new RunnableC1439k(f, this.f13576M0);
                return;
            }
            if (f < 0.0f && (this.f13607d1 == RefreshState.Loading || ((this.f13565H && this.f13589T && this.f13591U && m12287z(this.f13557C)) || (this.f13573L && !this.f13589T && m12287z(this.f13557C) && this.f13607d1 != RefreshState.Refreshing)))) {
                this.f13630o1 = new RunnableC1439k(f, -this.f13580O0);
            } else if (this.f13602b == 0 && this.f13569J) {
                this.f13630o1 = new RunnableC1439k(f, 0);
            }
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        if (this.f13583Q) {
            return this.f13571K || this.f13556B || this.f13557C;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean m12271j(int i, int i2, float f, boolean z) {
        if (this.f13607d1 != RefreshState.None || !m12287z(this.f13557C) || this.f13589T) {
            return false;
        }
        RunnableC1438j runnableC1438j = new RunnableC1438j(f, i2, z);
        setViceState(RefreshState.Loading);
        if (i > 0) {
            this.f13603b1.postDelayed(runnableC1438j, i);
            return true;
        }
        runnableC1438j.run();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public boolean m12272k() {
        return m12271j(0, this.f13610f, (this.f13590T0 + this.f13594V0) / 2.0f, true);
    }

    /* JADX INFO: renamed from: l */
    public boolean m12273l() {
        return m12274m(this.f13622k1 ? 0 : HttpStatus.BAD_REQUEST_400, this.f13610f, (this.f13588S0 + this.f13592U0) / 2.0f, false);
    }

    /* JADX INFO: renamed from: m */
    public boolean m12274m(int i, int i2, float f, boolean z) {
        if (this.f13607d1 != RefreshState.None || !m12287z(this.f13556B)) {
            return false;
        }
        this.f13599Z0.mo3405i();
        RunnableC1437i runnableC1437i = new RunnableC1437i(f, i2, z);
        setViceState(RefreshState.Refreshing);
        if (i > 0) {
            this.f13603b1.postDelayed(runnableC1437i, i);
            return true;
        }
        runnableC1437i.run();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m12275n() {
        return m12274m(this.f13622k1 ? 0 : HttpStatus.BAD_REQUEST_400, this.f13610f, (this.f13588S0 + this.f13592U0) / 2.0f, true);
    }

    /* JADX INFO: renamed from: o */
    public hnc0 m12276o() {
        return m12279r(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        bnc0 bnc0Var;
        cqd cqdVar;
        super.onAttachedToWindow();
        boolean z = true;
        this.f13622k1 = true;
        if (!isInEditMode()) {
            if (this.f13597X0 == null && (cqdVar = f13552r1) != null) {
                fnc0 fnc0VarMo3416a = cqdVar.mo3416a(getContext(), this);
                if (fnc0VarMo3416a == null) {
                    upk0.m8197a("DefaultRefreshHeaderCreator can not return null");
                    return;
                }
                mo11645S(fnc0VarMo3416a);
            }
            if (this.f13598Y0 == null) {
                bqd bqdVar = f13551q1;
                if (bqdVar != null) {
                    enc0 enc0VarMo3162a = bqdVar.mo3162a(getContext(), this);
                    if (enc0VarMo3162a == null) {
                        upk0.m8197a("DefaultRefreshFooterCreator can not return null");
                        return;
                    }
                    mo11643Q(enc0VarMo3162a);
                }
            } else {
                if (!this.f13557C && this.f13593V) {
                    z = false;
                }
                this.f13557C = z;
            }
            if (this.f13599Z0 == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    bnc0 bnc0Var2 = this.f13597X0;
                    if ((bnc0Var2 == null || childAt != bnc0Var2.getView()) && ((bnc0Var = this.f13598Y0) == null || childAt != bnc0Var.getView())) {
                        this.f13599Z0 = new dnc0(childAt);
                    }
                }
            }
            if (this.f13599Z0 == null) {
                int iM5146c = ikf0.m5146c(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText("The content view in SmartRefreshLayout is empty");
                super.addView(textView, 0, new C1441m(-1, -1));
                dnc0 dnc0Var = new dnc0(textView);
                this.f13599Z0 = dnc0Var;
                dnc0Var.getView().setPadding(iM5146c, iM5146c, iM5146c, iM5146c);
            }
            View viewFindViewById = findViewById(this.f13634q);
            View viewFindViewById2 = findViewById(this.f13635r);
            this.f13599Z0.mo3402f(this.f13564G0);
            this.f13599Z0.mo3398b(this.f13581P);
            this.f13599Z0.mo3400d(this.f13605c1, viewFindViewById, viewFindViewById2);
            if (this.f13602b != 0) {
                m12258D(RefreshState.None);
                cnc0 cnc0Var = this.f13599Z0;
                this.f13602b = 0;
                cnc0Var.mo3401e(0, this.f13636s, this.f13637t);
            }
        }
        int[] iArr = this.f13555A;
        if (iArr != null) {
            bnc0 bnc0Var3 = this.f13597X0;
            if (bnc0Var3 != null) {
                bnc0Var3.setPrimaryColors(iArr);
            }
            bnc0 bnc0Var4 = this.f13598Y0;
            if (bnc0Var4 != null) {
                bnc0Var4.setPrimaryColors(this.f13555A);
            }
        }
        cnc0 cnc0Var2 = this.f13599Z0;
        if (cnc0Var2 != null) {
            super.bringChildToFront(cnc0Var2.getView());
        }
        bnc0 bnc0Var5 = this.f13597X0;
        if (bnc0Var5 != null && bnc0Var5.getSpinnerStyle().f5939b) {
            super.bringChildToFront(this.f13597X0.getView());
        }
        bnc0 bnc0Var6 = this.f13598Y0;
        if (bnc0Var6 == null || !bnc0Var6.getSpinnerStyle().f5939b) {
            return;
        }
        super.bringChildToFront(this.f13598Y0.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13622k1 = false;
        this.f13593V = true;
        this.f13630o1 = null;
        ValueAnimator valueAnimator = this.f13633p1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f13633p1.removeAllUpdateListeners();
            this.f13633p1.setDuration(0L);
            this.f13633p1.cancel();
            this.f13633p1 = null;
        }
        bnc0 bnc0Var = this.f13597X0;
        if (bnc0Var != null && this.f13607d1 == RefreshState.Refreshing) {
            bnc0Var.mo2972h(this, false);
        }
        bnc0 bnc0Var2 = this.f13598Y0;
        if (bnc0Var2 != null && this.f13607d1 == RefreshState.Loading) {
            bnc0Var2.mo2972h(this, false);
        }
        if (this.f13602b != 0) {
            this.f13605c1.mo4654e(0, true);
        }
        RefreshState refreshState = this.f13607d1;
        RefreshState refreshState2 = RefreshState.None;
        if (refreshState != refreshState2) {
            m12258D(refreshState2);
        }
        Handler handler = this.f13603b1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f13624l1 = false;
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
            upk0.m8197a("最多只支持3个子View，Most only support three sub view");
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
            if (ikf0.m5148e(childAt) && (c < 2 || i4 == 1)) {
                i3 = i4;
                c = 2;
            } else if (!(childAt instanceof bnc0) && c < 1) {
                c = i4 > 0 ? (char) 1 : (char) 0;
                i3 = i4;
            }
            i4++;
        }
        if (i3 >= 0) {
            this.f13599Z0 = new dnc0(super.getChildAt(i3));
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
            if (i5 == i || (i5 != i2 && i == -1 && this.f13597X0 == null && (childAt2 instanceof fnc0))) {
                this.f13597X0 = childAt2 instanceof fnc0 ? (fnc0) childAt2 : new RefreshHeaderWrapper(childAt2);
            } else if (i5 == i2 || (i2 == -1 && (childAt2 instanceof enc0))) {
                this.f13557C = this.f13557C || !this.f13593V;
                this.f13598Y0 = childAt2 instanceof enc0 ? (enc0) childAt2 : new RefreshFooterWrapper(childAt2);
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
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(p4c0.J0))) {
                cnc0 cnc0Var = this.f13599Z0;
                if (cnc0Var != null && cnc0Var.getView() == childAt) {
                    boolean z2 = isInEditMode() && this.f13567I && m12287z(this.f13556B) && this.f13597X0 != null;
                    View view = this.f13599Z0.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f13554t1;
                    int i6 = marginLayoutParams.leftMargin + paddingLeft;
                    int i7 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i6;
                    int measuredHeight = view.getMeasuredHeight() + i7;
                    if (z2 && m12255A(this.f13561F, this.f13597X0)) {
                        int i8 = this.f13576M0;
                        i7 += i8;
                        measuredHeight += i8;
                    }
                    view.layout(i6, i7, measuredWidth, measuredHeight);
                }
                bnc0 bnc0Var = this.f13597X0;
                if (bnc0Var != null && bnc0Var.getView() == childAt) {
                    boolean z3 = isInEditMode() && this.f13567I && m12287z(this.f13556B);
                    View view2 = this.f13597X0.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : f13554t1;
                    int i9 = marginLayoutParams2.leftMargin;
                    int i10 = marginLayoutParams2.topMargin + this.f13584Q0;
                    int measuredWidth2 = view2.getMeasuredWidth() + i9;
                    int measuredHeight2 = view2.getMeasuredHeight() + i10;
                    if (!z3 && this.f13597X0.getSpinnerStyle() == nof0.f5932d) {
                        int i11 = this.f13576M0;
                        i10 -= i11;
                        measuredHeight2 -= i11;
                    }
                    view2.layout(i9, i10, measuredWidth2, measuredHeight2);
                }
                bnc0 bnc0Var2 = this.f13598Y0;
                if (bnc0Var2 != null && bnc0Var2.getView() == childAt) {
                    boolean z4 = isInEditMode() && this.f13567I && m12287z(this.f13557C);
                    View view3 = this.f13598Y0.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : f13554t1;
                    nof0 spinnerStyle = this.f13598Y0.getSpinnerStyle();
                    int i12 = marginLayoutParams3.leftMargin;
                    int measuredHeight3 = (marginLayoutParams3.topMargin + getMeasuredHeight()) - this.f13586R0;
                    if (this.f13589T && this.f13591U && this.f13565H && this.f13599Z0 != null && this.f13598Y0.getSpinnerStyle() == nof0.f5932d && m12287z(this.f13557C)) {
                        View view4 = this.f13599Z0.getView();
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0);
                    }
                    if (spinnerStyle == nof0.f5936h) {
                        measuredHeight3 = marginLayoutParams3.topMargin - this.f13586R0;
                    } else {
                        if (z4 || spinnerStyle == nof0.f5935g || spinnerStyle == nof0.f5934f) {
                            iMax = this.f13580O0;
                        } else if (spinnerStyle.f5940c && this.f13602b < 0) {
                            iMax = Math.max(m12287z(this.f13557C) ? -this.f13602b : 0, 0);
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
        boolean z2 = isInEditMode() && this.f13567I;
        int childCount = super.getChildCount();
        int i7 = 0;
        int measuredWidth = 0;
        int measuredHeight = 0;
        while (i7 < childCount) {
            View childAt = super.getChildAt(i7);
            if (childAt.getVisibility() == 8 || "GONE".equals(childAt.getTag(p4c0.J0))) {
                z = z2;
            } else {
                bnc0 bnc0Var = this.f13597X0;
                if (bnc0Var == null || bnc0Var.getView() != childAt) {
                    z = z2;
                    f = 10.0f;
                } else {
                    View view = this.f13597X0.getView();
                    f = 10.0f;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f13554t1;
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, layoutParams.width);
                    int iMax = this.f13576M0;
                    f1e f1eVar = this.f13578N0;
                    z = z2;
                    if (f1eVar.f3447a < f1e.f3440i.f3447a) {
                        int i8 = layoutParams.height;
                        if (i8 > 0) {
                            int i9 = i8 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                            f1e f1eVar2 = f1e.f3438g;
                            if (f1eVar.m3957a(f1eVar2)) {
                                this.f13576M0 = layoutParams.height + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                this.f13578N0 = f1eVar2;
                            }
                            iMax = i9;
                        } else if (i8 == -2 && (this.f13597X0.getSpinnerStyle() != nof0.f5936h || !this.f13578N0.f3448b)) {
                            int iMax2 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0);
                            view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax2, PKIFailureInfo.systemUnavail));
                            int measuredHeight2 = view.getMeasuredHeight();
                            if (measuredHeight2 > 0) {
                                if (measuredHeight2 != iMax2) {
                                    f1e f1eVar3 = this.f13578N0;
                                    f1e f1eVar4 = f1e.f3436e;
                                    if (f1eVar3.m3957a(f1eVar4)) {
                                        this.f13576M0 = measuredHeight2 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                        this.f13578N0 = f1eVar4;
                                    }
                                }
                                iMax = -1;
                            }
                        }
                    }
                    if (this.f13597X0.getSpinnerStyle() == nof0.f5936h) {
                        iMax = View.MeasureSpec.getSize(i2);
                        i6 = -1;
                        i5 = 0;
                    } else {
                        if (!this.f13597X0.getSpinnerStyle().f5940c || z) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            iMax = Math.max(0, m12287z(this.f13556B) ? this.f13602b : 0);
                        }
                        i6 = -1;
                    }
                    if (iMax != i6) {
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((iMax - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, i5), 1073741824));
                    }
                    f1e f1eVar5 = this.f13578N0;
                    if (!f1eVar5.f3448b) {
                        float f2 = this.f13588S0;
                        if (f2 < 10.0f) {
                            f2 *= this.f13576M0;
                        }
                        this.f13578N0 = f1eVar5.m3958b();
                        this.f13597X0.mo2973i(this.f13605c1, this.f13576M0, (int) f2);
                    }
                    if (z && m12287z(this.f13556B)) {
                        measuredWidth += view.getMeasuredWidth();
                        measuredHeight += view.getMeasuredHeight();
                    }
                }
                bnc0 bnc0Var2 = this.f13598Y0;
                if (bnc0Var2 == null || bnc0Var2.getView() != childAt) {
                    i3 = 0;
                } else {
                    View view2 = this.f13598Y0.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : f13554t1;
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, layoutParams2.width);
                    int iMax3 = this.f13580O0;
                    f1e f1eVar6 = this.f13582P0;
                    if (f1eVar6.f3447a < f1e.f3440i.f3447a) {
                        int i10 = layoutParams2.height;
                        if (i10 > 0) {
                            iMax3 = marginLayoutParams2.bottomMargin + i10 + marginLayoutParams2.topMargin;
                            f1e f1eVar7 = f1e.f3438g;
                            if (f1eVar6.m3957a(f1eVar7)) {
                                this.f13580O0 = layoutParams2.height + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                this.f13582P0 = f1eVar7;
                            }
                        } else if (i10 == -2 && (this.f13598Y0.getSpinnerStyle() != nof0.f5936h || !this.f13582P0.f3448b)) {
                            int iMax4 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0);
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(iMax4, PKIFailureInfo.systemUnavail));
                            int measuredHeight3 = view2.getMeasuredHeight();
                            if (measuredHeight3 > 0) {
                                if (measuredHeight3 != iMax4) {
                                    f1e f1eVar8 = this.f13582P0;
                                    f1e f1eVar9 = f1e.f3436e;
                                    if (f1eVar8.m3957a(f1eVar9)) {
                                        this.f13580O0 = measuredHeight3 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                        this.f13582P0 = f1eVar9;
                                    }
                                }
                                iMax3 = -1;
                            }
                        }
                    }
                    if (this.f13598Y0.getSpinnerStyle() == nof0.f5936h) {
                        iMax3 = View.MeasureSpec.getSize(i2);
                        i4 = -1;
                        i3 = 0;
                    } else {
                        if (!this.f13598Y0.getSpinnerStyle().f5940c || z) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            iMax3 = Math.max(0, m12287z(this.f13557C) ? -this.f13602b : 0);
                        }
                        i4 = -1;
                    }
                    if (iMax3 != i4) {
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((iMax3 - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i3), 1073741824));
                    }
                    f1e f1eVar10 = this.f13582P0;
                    if (!f1eVar10.f3448b) {
                        float f3 = this.f13590T0;
                        if (f3 < f) {
                            f3 *= this.f13580O0;
                        }
                        this.f13582P0 = f1eVar10.m3958b();
                        this.f13598Y0.mo2973i(this.f13605c1, this.f13580O0, (int) f3);
                    }
                    if (z && m12287z(this.f13557C)) {
                        measuredWidth += view2.getMeasuredWidth();
                        measuredHeight += view2.getMeasuredHeight();
                    }
                }
                cnc0 cnc0Var = this.f13599Z0;
                if (cnc0Var != null && cnc0Var.getView() == childAt) {
                    View view3 = this.f13599Z0.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : f13554t1;
                    view3.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams3.width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin + ((!z || ((this.f13597X0 == null || !m12287z(this.f13556B) || !m12255A(this.f13561F, this.f13597X0)) ? i3 : 1) == 0) ? i3 : this.f13576M0) + ((!z || ((this.f13598Y0 == null || !m12287z(this.f13557C) || !m12255A(this.f13563G, this.f13598Y0)) ? i3 : 1) == 0) ? i3 : this.f13580O0), layoutParams3.height));
                    measuredWidth += view3.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                    measuredHeight += view3.getMeasuredHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                }
            }
            i7++;
            z2 = z;
        }
        super.setMeasuredDimension(View.resolveSize(Math.max(measuredWidth + getPaddingLeft() + getPaddingRight(), super.getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(measuredHeight + getPaddingTop() + getPaddingBottom(), super.getSuggestedMinimumHeight()), i2));
        this.f13618j = getMeasuredWidth() / 2.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return this.f13572K0.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return (this.f13624l1 && f2 > 0.0f) || m12268U(-f2) || this.f13572K0.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        int i3 = this.f13566H0;
        int i4 = 0;
        if (i2 * i3 > 0) {
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(this.f13566H0);
            int i5 = this.f13566H0;
            if (iAbs > iAbs2) {
                this.f13566H0 = 0;
                i4 = i5;
            } else {
                this.f13566H0 = i5 - i2;
                i4 = i2;
            }
            m12257C(this.f13566H0);
        } else if (i2 > 0 && this.f13624l1) {
            int i6 = i3 - i2;
            this.f13566H0 = i6;
            m12257C(i6);
            i4 = i2;
        }
        this.f13572K0.c(i, i2 - i4, iArr, (int[]) null);
        iArr[1] = iArr[1] + i4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        s5e0 s5e0Var;
        ViewParent parent;
        s5e0 s5e0Var2;
        boolean zF = this.f13572K0.f(i, i2, i3, i4, this.f13570J0);
        int i5 = i4 + this.f13570J0[1];
        if ((i5 < 0 && ((this.f13556B || this.f13571K) && (this.f13566H0 != 0 || (s5e0Var2 = this.f13564G0) == null || s5e0Var2.mo5653b(this.f13599Z0.getView())))) || (i5 > 0 && ((this.f13557C || this.f13571K) && (this.f13566H0 != 0 || (s5e0Var = this.f13564G0) == null || s5e0Var.mo5652a(this.f13599Z0.getView()))))) {
            RefreshState refreshState = this.f13609e1;
            if (refreshState == RefreshState.None || refreshState.isOpening) {
                this.f13605c1.mo4655f(i5 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zF && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            int i6 = this.f13566H0 - i5;
            this.f13566H0 = i6;
            m12257C(i6);
        }
        if (!this.f13624l1 || i2 >= 0) {
            return;
        }
        this.f13624l1 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        this.f13574L0.b(view, view2, i);
        this.f13572K0.p(i & 2);
        this.f13566H0 = this.f13602b;
        this.f13568I0 = true;
        m12286y(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        if (isEnabled() && isNestedScrollingEnabled() && (i & 2) != 0) {
            return this.f13571K || this.f13556B || this.f13557C;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(@NonNull View view) {
        this.f13574L0.d(view);
        this.f13568I0 = false;
        this.f13566H0 = 0;
        m12259E();
        this.f13572K0.r();
    }

    /* JADX INFO: renamed from: p */
    public hnc0 m12277p(int i) {
        return m12278q(i, true, false);
    }

    /* JADX INFO: renamed from: q */
    public hnc0 m12278q(int i, boolean z, boolean z2) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        RunnableC1436h runnableC1436h = new RunnableC1436h(i2, z2, z);
        if (i3 > 0) {
            this.f13603b1.postDelayed(runnableC1436h, i3);
            return this;
        }
        runnableC1436h.run();
        return this;
    }

    /* JADX INFO: renamed from: r */
    public hnc0 m12279r(boolean z) {
        return m12278q(z ? Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f13611f1))), HttpStatus.MULTIPLE_CHOICES_300) << 16 : 0, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (gbl0.Q(this.f13599Z0.mo3404h())) {
            this.f13631p = z;
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: s */
    public hnc0 m12280s() {
        return m12278q(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f13611f1))), HttpStatus.MULTIPLE_CHOICES_300) << 16, true, true);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f13583Q = z;
        this.f13572K0.n(z);
    }

    public void setStateDirectLoading(boolean z) {
        RefreshState refreshState = this.f13607d1;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.f13611f1 = System.currentTimeMillis();
            this.f13624l1 = true;
            m12258D(refreshState2);
            me50 me50Var = this.f13560E0;
            if (me50Var != null) {
                if (z) {
                    me50Var.mo2874a(this);
                }
            } else if (this.f13562F0 == null) {
                m12277p(ijkMediaStreamer.MEDIA_RECORDER_TRACK_INFO_LIST_END);
            }
            bnc0 bnc0Var = this.f13598Y0;
            if (bnc0Var != null) {
                float f = this.f13590T0;
                if (f < 10.0f) {
                    f *= this.f13580O0;
                }
                bnc0Var.mo2971g(this, this.f13580O0, (int) f);
            }
            qe50 qe50Var = this.f13562F0;
            if (qe50Var == null || !(this.f13598Y0 instanceof enc0)) {
                return;
            }
            if (z) {
                qe50Var.mo2874a(this);
            }
            float f2 = this.f13590T0;
            if (f2 < 10.0f) {
                f2 *= this.f13580O0;
            }
            this.f13562F0.mo2879m1((enc0) this.f13598Y0, this.f13580O0, (int) f2);
        }
    }

    public void setStateLoading(boolean z) {
        C1430b c1430b = new C1430b(z);
        m12258D(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorMo4650a = this.f13605c1.mo4650a(-this.f13580O0);
        if (valueAnimatorMo4650a != null) {
            valueAnimatorMo4650a.addListener(c1430b);
        }
        bnc0 bnc0Var = this.f13598Y0;
        if (bnc0Var != null) {
            float f = this.f13590T0;
            if (f < 10.0f) {
                f *= this.f13580O0;
            }
            bnc0Var.mo2968c(this, this.f13580O0, (int) f);
        }
        qe50 qe50Var = this.f13562F0;
        if (qe50Var != null) {
            bnc0 bnc0Var2 = this.f13598Y0;
            if (bnc0Var2 instanceof enc0) {
                float f2 = this.f13590T0;
                if (f2 < 10.0f) {
                    f2 *= this.f13580O0;
                }
                qe50Var.mo2873W0((enc0) bnc0Var2, this.f13580O0, (int) f2);
            }
        }
        if (valueAnimatorMo4650a == null) {
            c1430b.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z) {
        C1431c c1431c = new C1431c(z);
        m12258D(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorMo4650a = this.f13605c1.mo4650a(this.f13576M0);
        if (valueAnimatorMo4650a != null) {
            valueAnimatorMo4650a.addListener(c1431c);
        }
        bnc0 bnc0Var = this.f13597X0;
        if (bnc0Var != null) {
            float f = this.f13588S0;
            if (f < 10.0f) {
                f *= this.f13576M0;
            }
            bnc0Var.mo2968c(this, this.f13576M0, (int) f);
        }
        qe50 qe50Var = this.f13562F0;
        if (qe50Var != null) {
            bnc0 bnc0Var2 = this.f13597X0;
            if (bnc0Var2 instanceof fnc0) {
                float f2 = this.f13588S0;
                if (f2 < 10.0f) {
                    f2 *= this.f13576M0;
                }
                qe50Var.mo2875b0((fnc0) bnc0Var2, this.f13576M0, (int) f2);
            }
        }
        if (valueAnimatorMo4650a == null) {
            c1431c.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.f13607d1;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            m12258D(RefreshState.None);
        }
        if (this.f13609e1 != refreshState) {
            this.f13609e1 = refreshState;
        }
    }

    /* JADX INFO: renamed from: t */
    public hnc0 m12281t() {
        return m12284w(true);
    }

    /* JADX INFO: renamed from: u */
    public hnc0 m12282u(int i) {
        return m12283v(i, true, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: v */
    public hnc0 m12283v(int i, boolean z, Boolean bool) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        RunnableC1435g runnableC1435g = new RunnableC1435g(i2, bool, z);
        if (i3 > 0) {
            this.f13603b1.postDelayed(runnableC1435g, i3);
            return this;
        }
        runnableC1435g.run();
        return this;
    }

    /* JADX INFO: renamed from: w */
    public hnc0 m12284w(boolean z) {
        return z ? m12283v(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f13611f1))), HttpStatus.MULTIPLE_CHOICES_300) << 16, true, Boolean.FALSE) : m12283v(0, false, null);
    }

    /* JADX INFO: renamed from: x */
    public hnc0 m12285x() {
        return m12283v(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f13611f1))), HttpStatus.MULTIPLE_CHOICES_300) << 16, true, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: y */
    public boolean m12286y(int i) {
        if (i == 0) {
            if (this.f13633p1 != null) {
                RefreshState refreshState = this.f13607d1;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased || refreshState == RefreshState.RefreshReleased || refreshState == RefreshState.LoadReleased) {
                    return true;
                }
                if (refreshState == RefreshState.PullDownCanceled) {
                    this.f13605c1.mo4655f(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    this.f13605c1.mo4655f(RefreshState.PullUpToLoad);
                }
                this.f13633p1.setDuration(0L);
                this.f13633p1.cancel();
                this.f13633p1 = null;
            }
            this.f13630o1 = null;
        }
        return this.f13633p1 != null;
    }

    /* JADX INFO: renamed from: z */
    public boolean m12287z(boolean z) {
        return z && !this.f13575M;
    }

    /* JADX INFO: renamed from: v.smart_refresh.SmartRefreshLayout$m */
    public static class C1441m extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f13692a;

        /* JADX INFO: renamed from: b */
        public nof0 f13693b;

        public C1441m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13692a = 0;
            this.f13693b = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.V1);
            this.f13692a = typedArrayObtainStyledAttributes.getColor(b9c0.W1, this.f13692a);
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.X1)) {
                this.f13693b = nof0.f5937i[typedArrayObtainStyledAttributes.getInt(b9c0.X1, nof0.f5932d.f5938a)];
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public C1441m(int i, int i2) {
            super(i, i2);
            this.f13692a = 0;
            this.f13693b = null;
        }
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }
}
