package com.p000p1.mobile.putong.core.card;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.d30;
import l.e30;
import l.i5e;
import l.rjj;
import l.t100;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VSwipeCard extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public static long f4263A = 10000;

    /* JADX INFO: renamed from: B */
    public static int f4264B = t100.d(63.0f);

    /* JADX INFO: renamed from: C */
    public static float f4265C = 1.5f;

    /* JADX INFO: renamed from: D */
    public static float f4266D = 1.5f;

    /* JADX INFO: renamed from: E */
    public static float f4267E = 2.0f;

    /* JADX INFO: renamed from: F */
    public static int f4268F = 0;

    /* JADX INFO: renamed from: G */
    public static int f4269G = 2;

    /* JADX INFO: renamed from: H */
    public static int f4270H = 1;

    /* JADX INFO: renamed from: I */
    public static int f4271I = -1;

    /* JADX INFO: renamed from: J */
    public static int f4272J = 3;

    /* JADX INFO: renamed from: K */
    public static int f4273K = 0;

    /* JADX INFO: renamed from: L */
    public static float f4274L = 7.0f;

    /* JADX INFO: renamed from: y */
    public static int f4275y = 30;

    /* JADX INFO: renamed from: z */
    public static int f4276z = 450;

    /* JADX INFO: renamed from: a */
    public boolean f4277a;

    /* JADX INFO: renamed from: b */
    public long f4278b;

    /* JADX INFO: renamed from: c */
    public boolean f4279c;

    /* JADX INFO: renamed from: d */
    public boolean f4280d;

    /* JADX INFO: renamed from: e */
    public List<d30> f4281e;

    /* JADX INFO: renamed from: f */
    public List<d30> f4282f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0189c f4283g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0190d f4284h;

    /* JADX INFO: renamed from: i */
    public int f4285i;

    /* JADX INFO: renamed from: j */
    public int f4286j;

    /* JADX INFO: renamed from: k */
    public boolean f4287k;

    /* JADX INFO: renamed from: l */
    public boolean f4288l;

    /* JADX INFO: renamed from: m */
    public boolean f4289m;

    /* JADX INFO: renamed from: n */
    public boolean f4290n;

    /* JADX INFO: renamed from: o */
    public boolean f4291o;

    /* JADX INFO: renamed from: p */
    public boolean f4292p;

    /* JADX INFO: renamed from: q */
    public boolean f4293q;

    /* JADX INFO: renamed from: r */
    public float f4294r;

    /* JADX INFO: renamed from: s */
    public float f4295s;

    /* JADX INFO: renamed from: t */
    public float f4296t;

    /* JADX INFO: renamed from: u */
    public float f4297u;

    /* JADX INFO: renamed from: v */
    public float f4298v;

    /* JADX INFO: renamed from: w */
    public rjj.c f4299w;

    /* JADX INFO: renamed from: x */
    public rjj f4300x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeCard$a */
    public class C0187a implements Animator.AnimatorListener {
        public C0187a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m7119b(d30 d30Var) {
            VSwipeCard.this.f4281e.remove(d30Var);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            VSwipeCard vSwipeCard = VSwipeCard.this;
            vSwipeCard.f4293q = false;
            vSwipeCard.f4277a = true;
            VSwipeCard.this.f4278b = 0L;
            VSwipeCard vSwipeCard2 = VSwipeCard.this;
            vSwipeCard2.f4286j = VSwipeCard.f4268F;
            if (!vSwipeCard2.f4292p) {
                VSwipeCard.this.m7098W0(true, 0.0f);
                VSwipeCard.this.m7098W0(false, 0.0f);
            }
            VSwipeCard.this.f4292p = false;
            VSwipeCard vSwipeCard3 = VSwipeCard.this;
            vSwipeCard3.m7117o1(vSwipeCard3.f4278b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VSwipeCard vSwipeCard = VSwipeCard.this;
            vSwipeCard.f4293q = false;
            vSwipeCard.f4277a = true;
            VSwipeCard.this.f4278b = 0L;
            VSwipeCard vSwipeCard2 = VSwipeCard.this;
            vSwipeCard2.f4286j = VSwipeCard.f4268F;
            if (!vSwipeCard2.f4292p) {
                VSwipeCard.this.m7098W0(true, 0.0f);
                VSwipeCard.this.m7098W0(false, 0.0f);
            }
            VSwipeCard.this.f4292p = false;
            if (VSwipeCard.this.f4281e != null) {
                vwb.z(VSwipeCard.this.f4281e, new e30() { // from class: l.lqk0
                    public final void call(Object obj) {
                        ((d30) obj).call();
                    }
                });
            }
            if (VSwipeCard.this.f4282f != null) {
                vwb.z(VSwipeCard.this.f4282f, new e30() { // from class: l.mqk0
                    public final void call(Object obj) {
                        this.f17188a.m7119b((d30) obj);
                    }
                });
                VSwipeCard.this.f4282f.clear();
            }
            VSwipeCard vSwipeCard3 = VSwipeCard.this;
            vSwipeCard3.m7117o1(vSwipeCard3.f4278b);
            if (NullChecker.a(VSwipeCard.this.f4284h)) {
                VSwipeCard.this.f4284h.mo7124e(VSwipeCard.this.f4284h.getBgAlpha());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VSwipeCard.this.f4293q = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeCard$b */
    public class C0188b extends rjj.d {
        public C0188b() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m7120a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            VSwipeCard.this.setPivotX(motionEvent.getRawX());
            VSwipeCard.this.setPivotY(motionEvent.getRawY());
            VSwipeCard.this.m7115m1(motionEvent2.getRawX() - motionEvent.getRawX(), motionEvent2.getRawY() - motionEvent.getRawY(), motionEvent2.getX(), motionEvent2.getY());
            return true;
        }

        /* JADX INFO: renamed from: b */
        public final void m7121b(MotionEvent motionEvent, float f, float f2) {
            float f3 = f / 100.0f;
            if (Math.abs(f3) < t100.d(5.0f)) {
                VSwipeCard.this.m7095T0(motionEvent.getY());
            } else if (Math.abs(f3) >= t100.d(12.0f) || Math.abs(f3) < t100.d(5.0f)) {
                VSwipeCard.this.m7094S0(f / 1000.0f, f2 / 1000.0f, motionEvent.getY());
            } else {
                VSwipeCard.this.m7091Q0();
            }
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (!VSwipeCard.this.m7110h1()) {
                return false;
            }
            VSwipeCard.this.performClick();
            return false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            Animator animatorA = bt0.a(VSwipeCard.this);
            if (animatorA == null || VSwipeCard.this.f4286j != VSwipeCard.f4268F) {
                return true;
            }
            animatorA.cancel();
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (Math.abs(motionEvent2.getRawX() - motionEvent.getRawX()) <= VSwipeCard.this.f4285i && (motionEvent.getRawY() - motionEvent2.getRawY() <= VSwipeCard.f4264B || !VSwipeCard.this.f4284h.mo7123c(true))) {
                VSwipeCard.this.m7091Q0();
            } else if (VSwipeCard.this.getTranslationX() * f < 0.0f || (VSwipeCard.this.getTranslationY() * f2 < 0.0f && !VSwipeCard.this.m7100Y0())) {
                m7121b(motionEvent2, f, f2);
            } else {
                VSwipeCard.this.m7094S0(f / 1000.0f, f2 / 1000.0f, motionEvent2.getY());
            }
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return VSwipeCard.this.performClick();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeCard$c */
    public interface InterfaceC0189c {
        /* JADX INFO: renamed from: a */
        boolean mo7122a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeCard$d */
    public interface InterfaceC0190d<T extends VSwipeCard> {
        /* JADX INFO: renamed from: c */
        boolean mo7123c(boolean z);

        /* JADX INFO: renamed from: e */
        void mo7124e(float f);

        /* JADX INFO: renamed from: f */
        boolean mo7125f(T t);

        /* JADX INFO: renamed from: g */
        void mo7126g(T t);

        float getBgAlpha();

        /* JADX INFO: renamed from: h */
        void mo7127h(boolean z, float f);

        /* JADX INFO: renamed from: i */
        void mo7128i(T t, SwipeDirection swipeDirection, float f, boolean z);
    }

    public VSwipeCard(Context context) {
        super(context);
        this.f4279c = true;
        this.f4280d = false;
        setOnClickListener(this);
        this.f4285i = t100.d(42.0f);
        this.f4287k = false;
        this.f4288l = false;
        this.f4289m = false;
        this.f4290n = false;
        this.f4291o = false;
        this.f4292p = false;
        this.f4293q = false;
        this.f4295s = 1.0f;
        this.f4297u = 1.0f;
        this.f4299w = new C0188b();
        rjj rjjVar = new rjj(getContext(), this.f4299w, new Handler(Looper.getMainLooper()));
        this.f4300x = rjjVar;
        rjjVar.m(false);
    }

    /* JADX INFO: renamed from: F */
    public boolean m7088F() {
        return this.f4293q;
    }

    /* JADX INFO: renamed from: O0 */
    public void m7089O0(boolean z) {
        this.f4277a = z;
    }

    /* JADX INFO: renamed from: P0 */
    public void m7090P0(d30 d30Var) {
        if (this.f4281e == null) {
            this.f4281e = new ArrayList();
        }
        this.f4281e.add(d30Var);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m7091Q0() {
        m7093R0(f4276z);
    }

    /* JADX INFO: renamed from: R */
    public boolean m7092R() {
        return this.f4278b != 0;
    }

    /* JADX INFO: renamed from: R0 */
    public void m7093R0(int i) {
        if (m7103b1()) {
            return;
        }
        Animator animatorY = bt0.y(new OvershootInterpolator(), i, new Animator[]{bt0.q(this, "translationX", new float[]{0.0f}), bt0.q(this, "translationY", new float[]{0.0f}), bt0.q(this, "rotation", new float[]{0.0f})});
        animatorY.addListener(new C0187a());
        this.f4292p = false;
        m7101Z0(animatorY);
        bt0.b(this, animatorY);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m7094S0(float f, float f2, float f3) {
        SwipeDirection swipeDirection;
        if (this.f4286j == f4268F) {
            this.f4277a = false;
            this.f4292p = false;
            if ((-f2) <= Math.abs(f) * f4267E || !this.f4284h.mo7123c(true)) {
                swipeDirection = f > 0.0f ? SwipeDirection.RIGHT : SwipeDirection.LEFT;
            } else {
                swipeDirection = SwipeDirection.UP;
            }
            SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
            if (swipeDirection != swipeDirection2 && swipeDirection != SwipeDirection.RIGHT) {
                if (swipeDirection == SwipeDirection.UP && this.f4284h.mo7123c(true)) {
                    float f4 = -xdl0.w0();
                    double dSqrt = f > 0.0f ? Math.sqrt(f) : -Math.sqrt(Math.abs(f));
                    double dSqrt2 = f2 > 0.0f ? Math.sqrt(f2) : -Math.sqrt(Math.abs(f2));
                    float fAbs = (Math.abs(((f4 - getTranslationY()) / f2) * ((float) dSqrt)) * (f > 0.0f ? 1 : -1)) + getTranslationX();
                    long jMin = (long) Math.min(((double) (f4 - getTranslationY())) / (((((double) Math.abs(f2)) * 0.029d) + 1.433d) * dSqrt2), this.f4287k ? 425.0d : 675.0d);
                    if (jMin <= 10) {
                        jMin = 10;
                    }
                    Animator animatorY = bt0.y(new LinearInterpolator(), jMin, new Animator[]{bt0.q(this, "translationX", new float[]{fAbs}), bt0.q(this, "translationY", new float[]{f4}), bt0.q(this, "rotation", new float[]{0.0f})});
                    m7101Z0(animatorY);
                    this.f4286j = f4269G;
                    bt0.b(this, animatorY);
                    return;
                }
                return;
            }
            int value = f > 0.0f ? SwipeDirection.RIGHT.getValue() : swipeDirection2.getValue();
            float fY0 = xdl0.y0() * value * 2.0f;
            double dSqrt3 = f > 0.0f ? Math.sqrt(f) : -Math.sqrt(Math.abs(f));
            float fAbs2 = (Math.abs(((fY0 - getTranslationX()) / f) * ((float) (f2 > 0.0f ? Math.sqrt(f2) : -Math.sqrt(Math.abs(f2))))) * (f2 > 0.0f ? 1 : -1)) + getTranslationY();
            if (Float.isNaN(fAbs2)) {
                fAbs2 = (getHeight() / 10) * (f2 > 0.0f ? 1 : -1);
            }
            long jMin2 = (long) Math.min(((double) (fY0 - getTranslationX())) / (((((double) Math.abs(f)) * 0.029d) + 1.433d) * dSqrt3), this.f4287k ? 425.0d : 675.0d);
            if (this.f4289m && getHeight() != 0) {
                jMin2 = Math.min((long) (jMin2 * Math.max(1.0f, Math.abs(fAbs2 / getHeight()))), f4263A);
            }
            float fM7113k1 = m7113k1(fAbs2);
            if (jMin2 <= 10) {
                jMin2 = 10;
            }
            Animator animatorY2 = bt0.y(new LinearInterpolator(), jMin2, new Animator[]{bt0.q(this, "translationX", new float[]{fY0}), bt0.q(this, "translationY", new float[]{fM7113k1}), bt0.q(this, "rotation", new float[]{value * m7106e1(f3)})});
            m7101Z0(animatorY2);
            this.f4286j = f4270H * value;
            bt0.b(this, animatorY2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX INFO: renamed from: T0 */
    public final void m7095T0(float f) {
        SwipeDirection swipeDirection;
        if ((-getTranslationY()) > Math.abs(getTranslationX()) * f4267E && this.f4284h.mo7123c(false)) {
            if (Math.abs(getTranslationX()) < (this.f4288l ? getWidth() / 2.4f : m7107f1())) {
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
        m7096U0(swipeDirection, f);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0164  */
    /* JADX WARN: Code duplicated, block: B:44:0x016c  */
    /* JADX INFO: renamed from: U0 */
    public final boolean m7096U0(SwipeDirection swipeDirection, float f) {
        int height;
        float translationY;
        long jMin;
        int iW0;
        Animator animatorY;
        VSwipeCard vSwipeCard = this;
        if (vSwipeCard.f4286j != f4268F) {
            return false;
        }
        vSwipeCard.f4277a = false;
        vSwipeCard.f4292p = false;
        boolean z = Math.abs(vSwipeCard.getTranslationX()) > ((float) t100.d(96.0f)) || Math.abs(vSwipeCard.getTranslationY()) > ((float) t100.d(86.0f));
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        if (swipeDirection != SwipeDirection.LEFT && swipeDirection != SwipeDirection.RIGHT) {
            if (swipeDirection != SwipeDirection.UP || !vSwipeCard.f4284h.mo7123c(false)) {
                return true;
            }
            float fW0 = xdl0.w0();
            if (!vSwipeCard.f4287k || vSwipeCard.f4288l) {
                animatorY = bt0.y(linearInterpolator, f4276z, new Animator[]{bt0.q(vSwipeCard, "translationX", new float[]{0.0f}), bt0.q(vSwipeCard, "translationY", new float[]{-fW0}), bt0.q(vSwipeCard, "rotation", new float[]{0.0f})});
            } else {
                int i = f4276z;
                int i2 = i / 4;
                int i3 = i - i2;
                long j = i;
                OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
                long j2 = i2;
                Animator animatorP = bt0.p(vSwipeCard, "superLikeIconScale", 0L, j2, (Interpolator) null, new float[]{1.5f, 1.0f});
                vSwipeCard = this;
                animatorY = bt0.u(false, (Interpolator) null, j, new Animator[]{bt0.y(overshootInterpolator, j2, new Animator[]{animatorP, bt0.p(vSwipeCard, "superLikeIconAlpha", 0L, j2, (Interpolator) null, new float[]{0.5f, 1.0f})}), bt0.y(linearInterpolator, i3, new Animator[]{bt0.q(vSwipeCard, "translationX", new float[]{0.0f}), bt0.q(vSwipeCard, "translationY", new float[]{-fW0}), bt0.q(vSwipeCard, "rotation", new float[]{0.0f})})});
            }
            vSwipeCard.m7101Z0(animatorY);
            vSwipeCard.f4286j = f4269G;
            bt0.b(vSwipeCard, animatorY);
            return true;
        }
        float value = swipeDirection.getValue() * xdl0.y0() * 1.5f;
        if (z && Float.compare(vSwipeCard.getTranslationY(), 0.0f) != 0) {
            if (Float.compare(vSwipeCard.getTranslationX(), 0.0f) == 0) {
                height = xdl0.w0() * swipeDirection.getValue();
            } else {
                translationY = (vSwipeCard.getTranslationY() * value) / vSwipeCard.getTranslationX();
            }
            if (Float.isNaN(translationY)) {
                if (z) {
                    iW0 = xdl0.w0() * swipeDirection.getValue();
                } else {
                    iW0 = vSwipeCard.getHeight() / 10;
                }
                translationY = iW0;
            }
            jMin = f4276z;
            if (vSwipeCard.f4289m && vSwipeCard.getHeight() != 0) {
                jMin = Math.min((long) (f4276z * Math.max(1.0f, Math.abs(translationY / vSwipeCard.getHeight()))), f4263A);
            }
            Animator animatorY2 = bt0.y(linearInterpolator, jMin, new Animator[]{bt0.q(vSwipeCard, "translationX", new float[]{value}), bt0.q(vSwipeCard, "translationY", new float[]{translationY}), bt0.q(vSwipeCard, "rotation", new float[]{swipeDirection.getValue() * vSwipeCard.m7106e1(f)})});
            vSwipeCard.m7101Z0(animatorY2);
            vSwipeCard.f4286j = f4270H * swipeDirection.getValue();
            bt0.b(vSwipeCard, animatorY2);
            return true;
        }
        height = vSwipeCard.getHeight() / 10;
        translationY = height;
        if (Float.isNaN(translationY)) {
            if (z) {
                iW0 = vSwipeCard.getHeight() / 10;
            } else {
                iW0 = xdl0.w0() * swipeDirection.getValue();
            }
            translationY = iW0;
        }
        jMin = f4276z;
        if (vSwipeCard.f4289m) {
            jMin = Math.min((long) (f4276z * Math.max(1.0f, Math.abs(translationY / vSwipeCard.getHeight()))), f4263A);
        }
        Animator animatorY3 = bt0.y(linearInterpolator, jMin, new Animator[]{bt0.q(vSwipeCard, "translationX", new float[]{value}), bt0.q(vSwipeCard, "translationY", new float[]{translationY}), bt0.q(vSwipeCard, "rotation", new float[]{swipeDirection.getValue() * vSwipeCard.m7106e1(f)})});
        vSwipeCard.m7101Z0(animatorY3);
        vSwipeCard.f4286j = f4270H * swipeDirection.getValue();
        bt0.b(vSwipeCard, animatorY3);
        return true;
    }

    /* JADX INFO: renamed from: V0 */
    public void m7097V0(float f, float f2) {
        this.f4295s = f;
        this.f4294r = f2;
        setBasedTranslationY(this.f4296t);
        setBasedScale(this.f4297u);
    }

    /* JADX INFO: renamed from: W0 */
    public void m7098W0(boolean z, float f) {
        if (this.f4278b == 0 && NullChecker.a(this.f4284h)) {
            this.f4284h.mo7127h(z, f);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m7099X0() {
        return true;
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m7100Y0() {
        return false;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m7101Z0(Animator animator) {
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m7102a1() {
        return this.f4293q || m7103b1();
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m7103b1() {
        return this.f4286j != f4268F;
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m7104c1() {
        return this.f4290n;
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m7105d1() {
        if (NullChecker.a(this.f4284h)) {
            return this.f4284h.mo7125f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: e1 */
    public final float m7106e1(float f) {
        return ((f > ((float) ((getHeight() / 3) * 2)) ? ((getHeight() / 3) * 2) - f : Math.min(((getHeight() / 3) * 2) - f, getHeight() / 3)) / getHeight()) * f4275y * 1.4f;
    }

    /* JADX INFO: renamed from: f1 */
    public float m7107f1() {
        return getWidth() / 2.4f;
    }

    /* JADX INFO: renamed from: g */
    public boolean m7108g() {
        return this.f4277a;
    }

    /* JADX INFO: renamed from: g1 */
    public float m7109g1() {
        return getHeight() / 3.0f;
    }

    @i5e
    public float getBasedScale() {
        return this.f4297u;
    }

    @i5e
    public float getBasedTranslationY() {
        return this.f4296t;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m7110h1() {
        return false;
    }

    /* JADX INFO: renamed from: i1 */
    public float m7111i1(float f) {
        float width = getWidth() / f4265C;
        if (width == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / width, 1.0f));
    }

    /* JADX INFO: renamed from: j1 */
    public float m7112j1(float f) {
        float height = getHeight() / f4266D;
        if (height == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / height, 1.0f));
    }

    /* JADX INFO: renamed from: k1 */
    public float m7113k1(float f) {
        return f;
    }

    /* JADX INFO: renamed from: l1 */
    public void m7114l1(d30 d30Var) {
        if (this.f4282f == null) {
            this.f4282f = new ArrayList();
        }
        this.f4282f.add(d30Var);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m7115m1(float f, float f2, float f3, float f4) {
        setTranslationX(f);
        setTranslationY(f2);
        if (this.f4279c) {
            setRotation(m7111i1(f) * m7106e1(f4));
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m7116n1() {
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setScaleX(1.0f);
        setScaleY(1.0f);
        setRotation(0.0f);
        setPivotX(getWidth() / 2);
        setPivotY(getHeight() / 2);
        this.f4286j = f4268F;
        this.f4278b = 0L;
        this.f4292p = false;
        List<d30> list = this.f4282f;
        if (list != null) {
            list.clear();
        }
        List<d30> list2 = this.f4281e;
        if (list2 != null) {
            list2.clear();
        }
        m7117o1(this.f4278b);
    }

    /* JADX INFO: renamed from: o1 */
    public void m7117o1(long j) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (NullChecker.a(this.f4284h)) {
            this.f4284h.mo7126g(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!m7099X0()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (m7102a1() || !m7105d1()) {
            return true;
        }
        if (NullChecker.a(this.f4283g) && this.f4283g.mo7122a()) {
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
        if (!m7099X0()) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f4277a || this.f4284h == null) {
            return false;
        }
        if (!this.f4300x.l(motionEvent) && ((actionMasked = motionEvent.getActionMasked()) == 1 || actionMasked == 3)) {
            if (Math.abs(getTranslationX()) / f4267E > (-getTranslationY()) || !this.f4284h.mo7123c(true)) {
                if (Math.abs(getTranslationX()) > m7107f1()) {
                    m7095T0(motionEvent.getY());
                } else {
                    m7091Q0();
                }
            } else if (this.f4284h.mo7123c(true)) {
                if ((-getTranslationY()) > m7109g1()) {
                    m7095T0(motionEvent.getY());
                } else {
                    m7091Q0();
                }
            }
        }
        return true;
    }

    @i5e
    public void setBasedScale(float f) {
        this.f4297u = f;
        if (xdl0.S(this.f4295s * f)) {
            return;
        }
        super.setScaleX(this.f4295s * f);
        super.setScaleY(this.f4295s * f);
    }

    @i5e
    public void setBasedTranslationY(float f) {
        this.f4296t = f;
        super.setTranslationY(this.f4294r + f);
    }

    public void setCustomClickGesture(InterfaceC0189c interfaceC0189c) {
        this.f4283g = interfaceC0189c;
    }

    public void setMinFlingSwipeX(int i) {
        this.f4285i = i;
    }

    public void setOptStackCard(boolean z) {
        this.f4290n = z;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (m7104c1()) {
            super.setScaleX(f);
        } else {
            if (this.f4286j == f4268F || xdl0.S(f)) {
                return;
            }
            super.setScaleX(f);
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (m7104c1()) {
            super.setScaleY(f);
        } else {
            if (this.f4286j == f4268F || xdl0.S(f)) {
                return;
            }
            super.setScaleY(f);
        }
    }

    public void setShowSuperLikeIcon(boolean z) {
        this.f4291o = z;
    }

    public void setSwipeCardObserver(InterfaceC0190d interfaceC0190d) {
        this.f4284h = interfaceC0190d;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        if (this.f4284h == null || this.f4286j == f4272J) {
            return;
        }
        this.f4298v = m7111i1((this.f4278b != 0 ? -200.0f : 0.0f) + (f4265C * Math.abs(f)) + Math.abs(getTranslationY()));
        if (Math.abs(this.f4286j) == f4270H && this.f4298v >= 1.0f && Math.abs(f) > 0.0f) {
            int i = this.f4286j;
            this.f4286j = f4272J;
            this.f4284h.mo7124e(1.0f);
            this.f4292p = true;
            this.f4284h.mo7128i(this, i >= 0 ? SwipeDirection.RIGHT : SwipeDirection.LEFT, this.f4298v, this.f4278b != 0);
            return;
        }
        this.f4284h.mo7124e(this.f4298v);
        if (Math.abs(f) > (-getTranslationY()) / f4267E || (-getTranslationY()) <= m7109g1() / 2.0f) {
            float fM7111i1 = m7111i1(Math.abs(f) * 2.0f);
            if (f > 0.0f) {
                m7098W0(true, fM7111i1);
            } else {
                m7098W0(true, -fM7111i1);
            }
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        super.setTranslationY(f);
        if (this.f4284h == null || this.f4286j == f4272J) {
            return;
        }
        float fM7111i1 = m7111i1((this.f4278b != 0 ? -200.0f : 0.0f) + (f4265C * Math.abs(getTranslationX())) + Math.abs(f));
        if (this.f4286j == f4269G && ((this.f4298v >= 1.0f || fM7111i1 >= 1.0f) && Float.compare(Math.abs(f), 0.0f) > 0)) {
            this.f4286j = f4272J;
            this.f4284h.mo7124e(1.0f);
            this.f4292p = true;
            this.f4284h.mo7128i(this, SwipeDirection.UP, this.f4298v, this.f4278b != 0);
            return;
        }
        float f2 = -f;
        if (Math.abs(getTranslationX()) <= f2 / f4267E) {
            if (f2 > m7109g1() / 2.0f || f == 0.0f) {
                if (this.f4287k && !m7092R() && !this.f4288l && !this.f4291o) {
                    m7098W0(false, 0.0f);
                    return;
                }
                float fM7112j1 = m7092R() ? m7112j1(Math.abs(f) * 2.0f) : m7112j1(Math.abs((m7109g1() / 2.0f) + f) * 2.0f);
                if (f < 0.0f || (m7092R() && f == 0.0f)) {
                    m7098W0(false, fM7112j1 * 2.0f);
                }
            }
        }
    }

    public VSwipeCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4279c = true;
        this.f4280d = false;
        setOnClickListener(this);
        this.f4285i = t100.d(42.0f);
        this.f4287k = false;
        this.f4288l = false;
        this.f4289m = false;
        this.f4290n = false;
        this.f4291o = false;
        this.f4292p = false;
        this.f4293q = false;
        this.f4295s = 1.0f;
        this.f4297u = 1.0f;
        this.f4299w = new C0188b();
        rjj rjjVar = new rjj(getContext(), this.f4299w, new Handler(Looper.getMainLooper()));
        this.f4300x = rjjVar;
        rjjVar.m(false);
    }

    public VSwipeCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4279c = true;
        this.f4280d = false;
        setOnClickListener(this);
        this.f4285i = t100.d(42.0f);
        this.f4287k = false;
        this.f4288l = false;
        this.f4289m = false;
        this.f4290n = false;
        this.f4291o = false;
        this.f4292p = false;
        this.f4293q = false;
        this.f4295s = 1.0f;
        this.f4297u = 1.0f;
        this.f4299w = new C0188b();
        rjj rjjVar = new rjj(getContext(), this.f4299w, new Handler(Looper.getMainLooper()));
        this.f4300x = rjjVar;
        rjjVar.m(false);
    }
}
