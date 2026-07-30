package com.p046p1.mobile.putong.core.card;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.bt0;
import p149l.d30;
import p149l.e30;
import p149l.i5e;
import p149l.rjj;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class VSwipeCard extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public static long f20274A = 10000;

    /* JADX INFO: renamed from: B */
    public static int f20275B = t100.m186890d(63.0f);

    /* JADX INFO: renamed from: C */
    public static float f20276C = 1.5f;

    /* JADX INFO: renamed from: D */
    public static float f20277D = 1.5f;

    /* JADX INFO: renamed from: E */
    public static float f20278E = 2.0f;

    /* JADX INFO: renamed from: F */
    public static int f20279F = 0;

    /* JADX INFO: renamed from: G */
    public static int f20280G = 2;

    /* JADX INFO: renamed from: H */
    public static int f20281H = 1;

    /* JADX INFO: renamed from: I */
    public static int f20282I = -1;

    /* JADX INFO: renamed from: J */
    public static int f20283J = 3;

    /* JADX INFO: renamed from: K */
    public static int f20284K = 0;

    /* JADX INFO: renamed from: L */
    public static float f20285L = 7.0f;

    /* JADX INFO: renamed from: y */
    public static int f20286y = 30;

    /* JADX INFO: renamed from: z */
    public static int f20287z = 450;

    /* JADX INFO: renamed from: a */
    public boolean f20288a;

    /* JADX INFO: renamed from: b */
    public long f20289b;

    /* JADX INFO: renamed from: c */
    public boolean f20290c;

    /* JADX INFO: renamed from: d */
    public boolean f20291d;

    /* JADX INFO: renamed from: e */
    public List<d30> f20292e;

    /* JADX INFO: renamed from: f */
    public List<d30> f20293f;

    /* JADX INFO: renamed from: g */
    public InterfaceC4763c f20294g;

    /* JADX INFO: renamed from: h */
    public InterfaceC4764d f20295h;

    /* JADX INFO: renamed from: i */
    public int f20296i;

    /* JADX INFO: renamed from: j */
    public int f20297j;

    /* JADX INFO: renamed from: k */
    public boolean f20298k;

    /* JADX INFO: renamed from: l */
    public boolean f20299l;

    /* JADX INFO: renamed from: m */
    public boolean f20300m;

    /* JADX INFO: renamed from: n */
    public boolean f20301n;

    /* JADX INFO: renamed from: o */
    public boolean f20302o;

    /* JADX INFO: renamed from: p */
    public boolean f20303p;

    /* JADX INFO: renamed from: q */
    public boolean f20304q;

    /* JADX INFO: renamed from: r */
    public float f20305r;

    /* JADX INFO: renamed from: s */
    public float f20306s;

    /* JADX INFO: renamed from: t */
    public float f20307t;

    /* JADX INFO: renamed from: u */
    public float f20308u;

    /* JADX INFO: renamed from: v */
    public float f20309v;

    /* JADX INFO: renamed from: w */
    public rjj.InterfaceC19716c f20310w;

    /* JADX INFO: renamed from: x */
    public rjj f20311x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeCard$a */
    public class C4761a implements Animator.AnimatorListener {
        public C4761a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m35177b(d30 d30Var) {
            VSwipeCard.this.f20292e.remove(d30Var);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            VSwipeCard vSwipeCard = VSwipeCard.this;
            vSwipeCard.f20304q = false;
            vSwipeCard.f20288a = true;
            VSwipeCard.this.f20289b = 0L;
            VSwipeCard vSwipeCard2 = VSwipeCard.this;
            vSwipeCard2.f20297j = VSwipeCard.f20279F;
            if (!vSwipeCard2.f20303p) {
                VSwipeCard.this.mo35156W0(true, 0.0f);
                VSwipeCard.this.mo35156W0(false, 0.0f);
            }
            VSwipeCard.this.f20303p = false;
            VSwipeCard vSwipeCard3 = VSwipeCard.this;
            vSwipeCard3.mo35175o1(vSwipeCard3.f20289b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VSwipeCard vSwipeCard = VSwipeCard.this;
            vSwipeCard.f20304q = false;
            vSwipeCard.f20288a = true;
            VSwipeCard.this.f20289b = 0L;
            VSwipeCard vSwipeCard2 = VSwipeCard.this;
            vSwipeCard2.f20297j = VSwipeCard.f20279F;
            if (!vSwipeCard2.f20303p) {
                VSwipeCard.this.mo35156W0(true, 0.0f);
                VSwipeCard.this.mo35156W0(false, 0.0f);
            }
            VSwipeCard.this.f20303p = false;
            if (VSwipeCard.this.f20292e != null) {
                vwb.m200354z(VSwipeCard.this.f20292e, new e30() { // from class: l.lqk0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((d30) obj).call();
                    }
                });
            }
            if (VSwipeCard.this.f20293f != null) {
                vwb.m200354z(VSwipeCard.this.f20293f, new e30() { // from class: l.mqk0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f135268a.m35177b((d30) obj);
                    }
                });
                VSwipeCard.this.f20293f.clear();
            }
            VSwipeCard vSwipeCard3 = VSwipeCard.this;
            vSwipeCard3.mo35175o1(vSwipeCard3.f20289b);
            if (NullChecker.m81303a(VSwipeCard.this.f20295h)) {
                VSwipeCard.this.f20295h.mo35182e(VSwipeCard.this.f20295h.getBgAlpha());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VSwipeCard.this.f20304q = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeCard$b */
    public class C4762b extends rjj.C19717d {
        public C4762b() {
        }

        @Override // p149l.rjj.C19717d, p149l.rjj.InterfaceC19716c
        /* JADX INFO: renamed from: a */
        public boolean mo35178a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            VSwipeCard.this.setPivotX(motionEvent.getRawX());
            VSwipeCard.this.setPivotY(motionEvent.getRawY());
            VSwipeCard.this.m35173m1(motionEvent2.getRawX() - motionEvent.getRawX(), motionEvent2.getRawY() - motionEvent.getRawY(), motionEvent2.getX(), motionEvent2.getY());
            return true;
        }

        /* JADX INFO: renamed from: b */
        public final void m35179b(MotionEvent motionEvent, float f, float f2) {
            float f3 = f / 100.0f;
            if (Math.abs(f3) < t100.m186890d(5.0f)) {
                VSwipeCard.this.m35153T0(motionEvent.getY());
            } else if (Math.abs(f3) >= t100.m186890d(12.0f) || Math.abs(f3) < t100.m186890d(5.0f)) {
                VSwipeCard.this.m35152S0(f / 1000.0f, f2 / 1000.0f, motionEvent.getY());
            } else {
                VSwipeCard.this.mo35149Q0();
            }
        }

        @Override // p149l.rjj.C19717d, p149l.rjj.InterfaceC19715b
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (!VSwipeCard.this.m35168h1()) {
                return false;
            }
            VSwipeCard.this.performClick();
            return false;
        }

        @Override // p149l.rjj.C19717d, p149l.rjj.InterfaceC19716c
        public boolean onDown(MotionEvent motionEvent) {
            Animator animatorM103728a = bt0.m103728a(VSwipeCard.this);
            if (animatorM103728a == null || VSwipeCard.this.f20297j != VSwipeCard.f20279F) {
                return true;
            }
            animatorM103728a.cancel();
            return true;
        }

        @Override // p149l.rjj.C19717d, p149l.rjj.InterfaceC19716c
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (Math.abs(motionEvent2.getRawX() - motionEvent.getRawX()) <= VSwipeCard.this.f20296i && (motionEvent.getRawY() - motionEvent2.getRawY() <= VSwipeCard.f20275B || !VSwipeCard.this.f20295h.mo35181c(true))) {
                VSwipeCard.this.mo35149Q0();
            } else if (VSwipeCard.this.getTranslationX() * f < 0.0f || (VSwipeCard.this.getTranslationY() * f2 < 0.0f && !VSwipeCard.this.mo35158Y0())) {
                m35179b(motionEvent2, f, f2);
            } else {
                VSwipeCard.this.m35152S0(f / 1000.0f, f2 / 1000.0f, motionEvent2.getY());
            }
            return true;
        }

        @Override // p149l.rjj.C19717d, p149l.rjj.InterfaceC19716c
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return VSwipeCard.this.performClick();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeCard$c */
    public interface InterfaceC4763c {
        /* JADX INFO: renamed from: a */
        boolean mo35180a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeCard$d */
    public interface InterfaceC4764d<T extends VSwipeCard> {
        /* JADX INFO: renamed from: c */
        boolean mo35181c(boolean z);

        /* JADX INFO: renamed from: e */
        void mo35182e(float f);

        /* JADX INFO: renamed from: f */
        boolean mo35183f(T t);

        /* JADX INFO: renamed from: g */
        void mo35184g(T t);

        float getBgAlpha();

        /* JADX INFO: renamed from: h */
        void mo35185h(boolean z, float f);

        /* JADX INFO: renamed from: i */
        void mo35186i(T t, SwipeDirection swipeDirection, float f, boolean z);
    }

    public VSwipeCard(Context context) {
        super(context);
        this.f20290c = true;
        this.f20291d = false;
        setOnClickListener(this);
        this.f20296i = t100.m186890d(42.0f);
        this.f20298k = false;
        this.f20299l = false;
        this.f20300m = false;
        this.f20301n = false;
        this.f20302o = false;
        this.f20303p = false;
        this.f20304q = false;
        this.f20306s = 1.0f;
        this.f20308u = 1.0f;
        this.f20310w = new C4762b();
        rjj rjjVar = new rjj(getContext(), this.f20310w, new Handler(Looper.getMainLooper()));
        this.f20311x = rjjVar;
        rjjVar.m179604m(false);
    }

    /* JADX INFO: renamed from: F */
    public boolean m35146F() {
        return this.f20304q;
    }

    /* JADX INFO: renamed from: O0 */
    public void m35147O0(boolean z) {
        this.f20288a = z;
    }

    /* JADX INFO: renamed from: P0 */
    public void m35148P0(d30 d30Var) {
        if (this.f20292e == null) {
            this.f20292e = new ArrayList();
        }
        this.f20292e.add(d30Var);
    }

    /* JADX INFO: renamed from: Q0 */
    public void mo35149Q0() {
        m35151R0(f20287z);
    }

    /* JADX INFO: renamed from: R */
    public boolean m35150R() {
        return this.f20289b != 0;
    }

    /* JADX INFO: renamed from: R0 */
    public void m35151R0(int i) {
        if (m35161b1()) {
            return;
        }
        Animator animatorM103752y = bt0.m103752y(new OvershootInterpolator(), i, bt0.m103744q(this, "translationX", 0.0f), bt0.m103744q(this, "translationY", 0.0f), bt0.m103744q(this, BLiveGiftItem.TYPE_ROTATION, 0.0f));
        animatorM103752y.addListener(new C4761a());
        this.f20303p = false;
        m35159Z0(animatorM103752y);
        bt0.m103729b(this, animatorM103752y);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m35152S0(float f, float f2, float f3) {
        SwipeDirection swipeDirection;
        if (this.f20297j == f20279F) {
            this.f20288a = false;
            this.f20303p = false;
            if ((-f2) <= Math.abs(f) * f20278E || !this.f20295h.mo35181c(true)) {
                swipeDirection = f > 0.0f ? SwipeDirection.RIGHT : SwipeDirection.LEFT;
            } else {
                swipeDirection = SwipeDirection.UP;
            }
            SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
            if (swipeDirection != swipeDirection2 && swipeDirection != SwipeDirection.RIGHT) {
                if (swipeDirection == SwipeDirection.UP && this.f20295h.mo35181c(true)) {
                    float f4 = -xdl0.m208408w0();
                    double dSqrt = f > 0.0f ? Math.sqrt(f) : -Math.sqrt(Math.abs(f));
                    double dSqrt2 = f2 > 0.0f ? Math.sqrt(f2) : -Math.sqrt(Math.abs(f2));
                    float fAbs = (Math.abs(((f4 - getTranslationY()) / f2) * ((float) dSqrt)) * (f > 0.0f ? 1 : -1)) + getTranslationX();
                    long jMin = (long) Math.min(((double) (f4 - getTranslationY())) / (((((double) Math.abs(f2)) * 0.029d) + 1.433d) * dSqrt2), this.f20298k ? 425.0d : 675.0d);
                    if (jMin <= 10) {
                        jMin = 10;
                    }
                    Animator animatorM103752y = bt0.m103752y(new LinearInterpolator(), jMin, bt0.m103744q(this, "translationX", fAbs), bt0.m103744q(this, "translationY", f4), bt0.m103744q(this, BLiveGiftItem.TYPE_ROTATION, 0.0f));
                    m35159Z0(animatorM103752y);
                    this.f20297j = f20280G;
                    bt0.m103729b(this, animatorM103752y);
                    return;
                }
                return;
            }
            int value = f > 0.0f ? SwipeDirection.RIGHT.getValue() : swipeDirection2.getValue();
            float fM208412y0 = xdl0.m208412y0() * value * 2.0f;
            double dSqrt3 = f > 0.0f ? Math.sqrt(f) : -Math.sqrt(Math.abs(f));
            float fAbs2 = (Math.abs(((fM208412y0 - getTranslationX()) / f) * ((float) (f2 > 0.0f ? Math.sqrt(f2) : -Math.sqrt(Math.abs(f2))))) * (f2 > 0.0f ? 1 : -1)) + getTranslationY();
            if (Float.isNaN(fAbs2)) {
                fAbs2 = (getHeight() / 10) * (f2 > 0.0f ? 1 : -1);
            }
            long jMin2 = (long) Math.min(((double) (fM208412y0 - getTranslationX())) / (((((double) Math.abs(f)) * 0.029d) + 1.433d) * dSqrt3), this.f20298k ? 425.0d : 675.0d);
            if (this.f20300m && getHeight() != 0) {
                jMin2 = Math.min((long) (jMin2 * Math.max(1.0f, Math.abs(fAbs2 / getHeight()))), f20274A);
            }
            float fMo35171k1 = mo35171k1(fAbs2);
            if (jMin2 <= 10) {
                jMin2 = 10;
            }
            Animator animatorM103752y2 = bt0.m103752y(new LinearInterpolator(), jMin2, bt0.m103744q(this, "translationX", fM208412y0), bt0.m103744q(this, "translationY", fMo35171k1), bt0.m103744q(this, BLiveGiftItem.TYPE_ROTATION, value * m35164e1(f3)));
            m35159Z0(animatorM103752y2);
            this.f20297j = f20281H * value;
            bt0.m103729b(this, animatorM103752y2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX INFO: renamed from: T0 */
    public final void m35153T0(float f) {
        SwipeDirection swipeDirection;
        if ((-getTranslationY()) > Math.abs(getTranslationX()) * f20278E && this.f20295h.mo35181c(false)) {
            if (Math.abs(getTranslationX()) < (this.f20299l ? getWidth() / 2.4f : mo35165f1())) {
                swipeDirection = SwipeDirection.UP;
            } else if (getTranslationX() > 0.0f) {
                swipeDirection = SwipeDirection.RIGHT;
            } else {
                swipeDirection = SwipeDirection.LEFT;
            }
        } else if (getTranslationX() > 0.0f) {
            swipeDirection = SwipeDirection.RIGHT;
        } else {
            swipeDirection = SwipeDirection.LEFT;
        }
        m35154U0(swipeDirection, f);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0164  */
    /* JADX WARN: Code duplicated, block: B:44:0x016c  */
    /* JADX INFO: renamed from: U0 */
    public final boolean m35154U0(SwipeDirection swipeDirection, float f) {
        int height;
        float translationY;
        long jMin;
        int iM208408w0;
        Animator animatorM103752y;
        VSwipeCard vSwipeCard = this;
        if (vSwipeCard.f20297j != f20279F) {
            return false;
        }
        vSwipeCard.f20288a = false;
        vSwipeCard.f20303p = false;
        boolean z = Math.abs(vSwipeCard.getTranslationX()) > ((float) t100.m186890d(96.0f)) || Math.abs(vSwipeCard.getTranslationY()) > ((float) t100.m186890d(86.0f));
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        if (swipeDirection != SwipeDirection.LEFT && swipeDirection != SwipeDirection.RIGHT) {
            if (swipeDirection != SwipeDirection.UP || !vSwipeCard.f20295h.mo35181c(false)) {
                return true;
            }
            float fM208408w0 = xdl0.m208408w0();
            if (!vSwipeCard.f20298k || vSwipeCard.f20299l) {
                animatorM103752y = bt0.m103752y(linearInterpolator, f20287z, bt0.m103744q(vSwipeCard, "translationX", 0.0f), bt0.m103744q(vSwipeCard, "translationY", -fM208408w0), bt0.m103744q(vSwipeCard, BLiveGiftItem.TYPE_ROTATION, 0.0f));
            } else {
                int i = f20287z;
                int i2 = i / 4;
                int i3 = i - i2;
                long j = i;
                OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
                long j2 = i2;
                Animator animatorM103743p = bt0.m103743p(vSwipeCard, "superLikeIconScale", 0L, j2, null, 1.5f, 1.0f);
                vSwipeCard = this;
                animatorM103752y = bt0.m103748u(false, null, j, bt0.m103752y(overshootInterpolator, j2, animatorM103743p, bt0.m103743p(vSwipeCard, "superLikeIconAlpha", 0L, j2, null, 0.5f, 1.0f)), bt0.m103752y(linearInterpolator, i3, bt0.m103744q(vSwipeCard, "translationX", 0.0f), bt0.m103744q(vSwipeCard, "translationY", -fM208408w0), bt0.m103744q(vSwipeCard, BLiveGiftItem.TYPE_ROTATION, 0.0f)));
            }
            vSwipeCard.m35159Z0(animatorM103752y);
            vSwipeCard.f20297j = f20280G;
            bt0.m103729b(vSwipeCard, animatorM103752y);
            return true;
        }
        float value = swipeDirection.getValue() * xdl0.m208412y0() * 1.5f;
        if (z && Float.compare(vSwipeCard.getTranslationY(), 0.0f) != 0) {
            if (Float.compare(vSwipeCard.getTranslationX(), 0.0f) == 0) {
                height = xdl0.m208408w0() * swipeDirection.getValue();
            } else {
                translationY = (vSwipeCard.getTranslationY() * value) / vSwipeCard.getTranslationX();
            }
            if (Float.isNaN(translationY)) {
                if (z) {
                    iM208408w0 = xdl0.m208408w0() * swipeDirection.getValue();
                } else {
                    iM208408w0 = vSwipeCard.getHeight() / 10;
                }
                translationY = iM208408w0;
            }
            jMin = f20287z;
            if (vSwipeCard.f20300m && vSwipeCard.getHeight() != 0) {
                jMin = Math.min((long) (f20287z * Math.max(1.0f, Math.abs(translationY / vSwipeCard.getHeight()))), f20274A);
            }
            Animator animatorM103752y2 = bt0.m103752y(linearInterpolator, jMin, bt0.m103744q(vSwipeCard, "translationX", value), bt0.m103744q(vSwipeCard, "translationY", translationY), bt0.m103744q(vSwipeCard, BLiveGiftItem.TYPE_ROTATION, swipeDirection.getValue() * vSwipeCard.m35164e1(f)));
            vSwipeCard.m35159Z0(animatorM103752y2);
            vSwipeCard.f20297j = f20281H * swipeDirection.getValue();
            bt0.m103729b(vSwipeCard, animatorM103752y2);
            return true;
        }
        height = vSwipeCard.getHeight() / 10;
        translationY = height;
        if (Float.isNaN(translationY)) {
            if (z) {
                iM208408w0 = vSwipeCard.getHeight() / 10;
            } else {
                iM208408w0 = xdl0.m208408w0() * swipeDirection.getValue();
            }
            translationY = iM208408w0;
        }
        jMin = f20287z;
        if (vSwipeCard.f20300m) {
            jMin = Math.min((long) (f20287z * Math.max(1.0f, Math.abs(translationY / vSwipeCard.getHeight()))), f20274A);
        }
        Animator animatorM103752y3 = bt0.m103752y(linearInterpolator, jMin, bt0.m103744q(vSwipeCard, "translationX", value), bt0.m103744q(vSwipeCard, "translationY", translationY), bt0.m103744q(vSwipeCard, BLiveGiftItem.TYPE_ROTATION, swipeDirection.getValue() * vSwipeCard.m35164e1(f)));
        vSwipeCard.m35159Z0(animatorM103752y3);
        vSwipeCard.f20297j = f20281H * swipeDirection.getValue();
        bt0.m103729b(vSwipeCard, animatorM103752y3);
        return true;
    }

    /* JADX INFO: renamed from: V0 */
    public void m35155V0(float f, float f2) {
        this.f20306s = f;
        this.f20305r = f2;
        setBasedTranslationY(this.f20307t);
        setBasedScale(this.f20308u);
    }

    /* JADX INFO: renamed from: W0 */
    public void mo35156W0(boolean z, float f) {
        if (this.f20289b == 0 && NullChecker.m81303a(this.f20295h)) {
            this.f20295h.mo35185h(z, f);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public boolean mo35157X0() {
        return true;
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean mo35158Y0() {
        return false;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m35159Z0(Animator animator) {
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m35160a1() {
        return this.f20304q || m35161b1();
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m35161b1() {
        return this.f20297j != f20279F;
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m35162c1() {
        return this.f20301n;
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m35163d1() {
        if (NullChecker.m81303a(this.f20295h)) {
            return this.f20295h.mo35183f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: e1 */
    public final float m35164e1(float f) {
        return ((f > ((float) ((getHeight() / 3) * 2)) ? ((getHeight() / 3) * 2) - f : Math.min(((getHeight() / 3) * 2) - f, getHeight() / 3)) / getHeight()) * f20286y * 1.4f;
    }

    /* JADX INFO: renamed from: f1 */
    public float mo35165f1() {
        return getWidth() / 2.4f;
    }

    /* JADX INFO: renamed from: g */
    public boolean m35166g() {
        return this.f20288a;
    }

    /* JADX INFO: renamed from: g1 */
    public float mo35167g1() {
        return getHeight() / 3.0f;
    }

    @i5e
    public float getBasedScale() {
        return this.f20308u;
    }

    @i5e
    public float getBasedTranslationY() {
        return this.f20307t;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m35168h1() {
        return false;
    }

    /* JADX INFO: renamed from: i1 */
    public float m35169i1(float f) {
        float width = getWidth() / f20276C;
        if (width == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / width, 1.0f));
    }

    /* JADX INFO: renamed from: j1 */
    public float m35170j1(float f) {
        float height = getHeight() / f20277D;
        if (height == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / height, 1.0f));
    }

    /* JADX INFO: renamed from: k1 */
    public float mo35171k1(float f) {
        return f;
    }

    /* JADX INFO: renamed from: l1 */
    public void m35172l1(d30 d30Var) {
        if (this.f20293f == null) {
            this.f20293f = new ArrayList();
        }
        this.f20293f.add(d30Var);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m35173m1(float f, float f2, float f3, float f4) {
        setTranslationX(f);
        setTranslationY(f2);
        if (this.f20290c) {
            setRotation(m35169i1(f) * m35164e1(f4));
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void mo35174n1() {
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setScaleX(1.0f);
        setScaleY(1.0f);
        setRotation(0.0f);
        setPivotX(getWidth() / 2);
        setPivotY(getHeight() / 2);
        this.f20297j = f20279F;
        this.f20289b = 0L;
        this.f20303p = false;
        List<d30> list = this.f20293f;
        if (list != null) {
            list.clear();
        }
        List<d30> list2 = this.f20292e;
        if (list2 != null) {
            list2.clear();
        }
        mo35175o1(this.f20289b);
    }

    /* JADX INFO: renamed from: o1 */
    public void mo35175o1(long j) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (NullChecker.m81303a(this.f20295h)) {
            this.f20295h.mo35184g(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!mo35157X0()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (m35160a1() || !m35163d1()) {
            return true;
        }
        if (NullChecker.m81303a(this.f20294g) && this.f20294g.mo35180a()) {
            onTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setPivotX((i3 - i) / 2);
        setPivotY((i4 - i2) / 2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        if (!mo35157X0()) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f20288a || this.f20295h == null) {
            return false;
        }
        if (!this.f20311x.m179603l(motionEvent) && ((actionMasked = motionEvent.getActionMasked()) == 1 || actionMasked == 3)) {
            if (Math.abs(getTranslationX()) / f20278E > (-getTranslationY()) || !this.f20295h.mo35181c(true)) {
                if (Math.abs(getTranslationX()) > mo35165f1()) {
                    m35153T0(motionEvent.getY());
                } else {
                    mo35149Q0();
                }
            } else if (this.f20295h.mo35181c(true)) {
                if ((-getTranslationY()) > mo35167g1()) {
                    m35153T0(motionEvent.getY());
                } else {
                    mo35149Q0();
                }
            }
        }
        return true;
    }

    @i5e
    public void setBasedScale(float f) {
        this.f20308u = f;
        if (xdl0.m208355S(this.f20306s * f)) {
            return;
        }
        super.setScaleX(this.f20306s * f);
        super.setScaleY(this.f20306s * f);
    }

    @i5e
    public void setBasedTranslationY(float f) {
        this.f20307t = f;
        super.setTranslationY(this.f20305r + f);
    }

    public void setCustomClickGesture(InterfaceC4763c interfaceC4763c) {
        this.f20294g = interfaceC4763c;
    }

    public void setMinFlingSwipeX(int i) {
        this.f20296i = i;
    }

    public void setOptStackCard(boolean z) {
        this.f20301n = z;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (m35162c1()) {
            super.setScaleX(f);
        } else {
            if (this.f20297j == f20279F || xdl0.m208355S(f)) {
                return;
            }
            super.setScaleX(f);
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (m35162c1()) {
            super.setScaleY(f);
        } else {
            if (this.f20297j == f20279F || xdl0.m208355S(f)) {
                return;
            }
            super.setScaleY(f);
        }
    }

    public void setShowSuperLikeIcon(boolean z) {
        this.f20302o = z;
    }

    public void setSwipeCardObserver(InterfaceC4764d interfaceC4764d) {
        this.f20295h = interfaceC4764d;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        if (this.f20295h == null || this.f20297j == f20283J) {
            return;
        }
        this.f20309v = m35169i1((this.f20289b != 0 ? -200.0f : 0.0f) + (f20276C * Math.abs(f)) + Math.abs(getTranslationY()));
        if (Math.abs(this.f20297j) == f20281H && this.f20309v >= 1.0f && Math.abs(f) > 0.0f) {
            int i = this.f20297j;
            this.f20297j = f20283J;
            this.f20295h.mo35182e(1.0f);
            this.f20303p = true;
            this.f20295h.mo35186i(this, i >= 0 ? SwipeDirection.RIGHT : SwipeDirection.LEFT, this.f20309v, this.f20289b != 0);
            return;
        }
        this.f20295h.mo35182e(this.f20309v);
        if (Math.abs(f) > (-getTranslationY()) / f20278E || (-getTranslationY()) <= mo35167g1() / 2.0f) {
            float fM35169i1 = m35169i1(Math.abs(f) * 2.0f);
            if (f > 0.0f) {
                mo35156W0(true, fM35169i1);
            } else {
                mo35156W0(true, -fM35169i1);
            }
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        super.setTranslationY(f);
        if (this.f20295h == null || this.f20297j == f20283J) {
            return;
        }
        float fM35169i1 = m35169i1((this.f20289b != 0 ? -200.0f : 0.0f) + (f20276C * Math.abs(getTranslationX())) + Math.abs(f));
        if (this.f20297j == f20280G && ((this.f20309v >= 1.0f || fM35169i1 >= 1.0f) && Float.compare(Math.abs(f), 0.0f) > 0)) {
            this.f20297j = f20283J;
            this.f20295h.mo35182e(1.0f);
            this.f20303p = true;
            this.f20295h.mo35186i(this, SwipeDirection.UP, this.f20309v, this.f20289b != 0);
            return;
        }
        float f2 = -f;
        if (Math.abs(getTranslationX()) <= f2 / f20278E) {
            if (f2 > mo35167g1() / 2.0f || f == 0.0f) {
                if (this.f20298k && !m35150R() && !this.f20299l && !this.f20302o) {
                    mo35156W0(false, 0.0f);
                    return;
                }
                float fM35170j1 = m35150R() ? m35170j1(Math.abs(f) * 2.0f) : m35170j1(Math.abs((mo35167g1() / 2.0f) + f) * 2.0f);
                if (f < 0.0f || (m35150R() && f == 0.0f)) {
                    mo35156W0(false, fM35170j1 * 2.0f);
                }
            }
        }
    }

    public VSwipeCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20290c = true;
        this.f20291d = false;
        setOnClickListener(this);
        this.f20296i = t100.m186890d(42.0f);
        this.f20298k = false;
        this.f20299l = false;
        this.f20300m = false;
        this.f20301n = false;
        this.f20302o = false;
        this.f20303p = false;
        this.f20304q = false;
        this.f20306s = 1.0f;
        this.f20308u = 1.0f;
        this.f20310w = new C4762b();
        rjj rjjVar = new rjj(getContext(), this.f20310w, new Handler(Looper.getMainLooper()));
        this.f20311x = rjjVar;
        rjjVar.m179604m(false);
    }

    public VSwipeCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20290c = true;
        this.f20291d = false;
        setOnClickListener(this);
        this.f20296i = t100.m186890d(42.0f);
        this.f20298k = false;
        this.f20299l = false;
        this.f20300m = false;
        this.f20301n = false;
        this.f20302o = false;
        this.f20303p = false;
        this.f20304q = false;
        this.f20306s = 1.0f;
        this.f20308u = 1.0f;
        this.f20310w = new C4762b();
        rjj rjjVar = new rjj(getContext(), this.f20310w, new Handler(Looper.getMainLooper()));
        this.f20311x = rjjVar;
        rjjVar.m179604m(false);
    }
}
