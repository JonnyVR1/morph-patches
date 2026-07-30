package com.p051p1.mobile.putong.core.card;

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
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.gt0;
import p153l.jyb;
import p153l.kmj;
import p153l.qa00;
import p153l.w6e;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class VSwipeCard extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public static long f21016A = 10000;

    /* JADX INFO: renamed from: B */
    public static int f21017B = qa00.m175859d(63.0f);

    /* JADX INFO: renamed from: C */
    public static float f21018C = 1.5f;

    /* JADX INFO: renamed from: D */
    public static float f21019D = 1.5f;

    /* JADX INFO: renamed from: E */
    public static float f21020E = 2.0f;

    /* JADX INFO: renamed from: F */
    public static int f21021F = 0;

    /* JADX INFO: renamed from: G */
    public static int f21022G = 2;

    /* JADX INFO: renamed from: H */
    public static int f21023H = 1;

    /* JADX INFO: renamed from: I */
    public static int f21024I = -1;

    /* JADX INFO: renamed from: J */
    public static int f21025J = 3;

    /* JADX INFO: renamed from: K */
    public static int f21026K = 0;

    /* JADX INFO: renamed from: L */
    public static float f21027L = 7.0f;

    /* JADX INFO: renamed from: y */
    public static int f21028y = 30;

    /* JADX INFO: renamed from: z */
    public static int f21029z = 450;

    /* JADX INFO: renamed from: a */
    public boolean f21030a;

    /* JADX INFO: renamed from: b */
    public long f21031b;

    /* JADX INFO: renamed from: c */
    public boolean f21032c;

    /* JADX INFO: renamed from: d */
    public boolean f21033d;

    /* JADX INFO: renamed from: e */
    public List<x20> f21034e;

    /* JADX INFO: renamed from: f */
    public List<x20> f21035f;

    /* JADX INFO: renamed from: g */
    public InterfaceC4914c f21036g;

    /* JADX INFO: renamed from: h */
    public InterfaceC4915d f21037h;

    /* JADX INFO: renamed from: i */
    public int f21038i;

    /* JADX INFO: renamed from: j */
    public int f21039j;

    /* JADX INFO: renamed from: k */
    public boolean f21040k;

    /* JADX INFO: renamed from: l */
    public boolean f21041l;

    /* JADX INFO: renamed from: m */
    public boolean f21042m;

    /* JADX INFO: renamed from: n */
    public boolean f21043n;

    /* JADX INFO: renamed from: o */
    public boolean f21044o;

    /* JADX INFO: renamed from: p */
    public boolean f21045p;

    /* JADX INFO: renamed from: q */
    public boolean f21046q;

    /* JADX INFO: renamed from: r */
    public float f21047r;

    /* JADX INFO: renamed from: s */
    public float f21048s;

    /* JADX INFO: renamed from: t */
    public float f21049t;

    /* JADX INFO: renamed from: u */
    public float f21050u;

    /* JADX INFO: renamed from: v */
    public float f21051v;

    /* JADX INFO: renamed from: w */
    public kmj.InterfaceC18209c f21052w;

    /* JADX INFO: renamed from: x */
    public kmj f21053x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeCard$a */
    public class C4912a implements Animator.AnimatorListener {
        public C4912a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m36180b(x20 x20Var) {
            VSwipeCard.this.f21034e.remove(x20Var);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            VSwipeCard vSwipeCard = VSwipeCard.this;
            vSwipeCard.f21046q = false;
            vSwipeCard.f21030a = true;
            VSwipeCard.this.f21031b = 0L;
            VSwipeCard vSwipeCard2 = VSwipeCard.this;
            vSwipeCard2.f21039j = VSwipeCard.f21021F;
            if (!vSwipeCard2.f21045p) {
                VSwipeCard.this.mo36159W0(true, 0.0f);
                VSwipeCard.this.mo36159W0(false, 0.0f);
            }
            VSwipeCard.this.f21045p = false;
            VSwipeCard vSwipeCard3 = VSwipeCard.this;
            vSwipeCard3.mo36178o1(vSwipeCard3.f21031b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VSwipeCard vSwipeCard = VSwipeCard.this;
            vSwipeCard.f21046q = false;
            vSwipeCard.f21030a = true;
            VSwipeCard.this.f21031b = 0L;
            VSwipeCard vSwipeCard2 = VSwipeCard.this;
            vSwipeCard2.f21039j = VSwipeCard.f21021F;
            if (!vSwipeCard2.f21045p) {
                VSwipeCard.this.mo36159W0(true, 0.0f);
                VSwipeCard.this.mo36159W0(false, 0.0f);
            }
            VSwipeCard.this.f21045p = false;
            if (VSwipeCard.this.f21034e != null) {
                jyb.m147537z(VSwipeCard.this.f21034e, new y20() { // from class: l.rzk0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((x20) obj).call();
                    }
                });
            }
            if (VSwipeCard.this.f21035f != null) {
                jyb.m147537z(VSwipeCard.this.f21035f, new y20() { // from class: l.szk0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f171403a.m36180b((x20) obj);
                    }
                });
                VSwipeCard.this.f21035f.clear();
            }
            VSwipeCard vSwipeCard3 = VSwipeCard.this;
            vSwipeCard3.mo36178o1(vSwipeCard3.f21031b);
            if (NullChecker.m82486a(VSwipeCard.this.f21037h)) {
                VSwipeCard.this.f21037h.mo36185e(VSwipeCard.this.f21037h.getBgAlpha());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VSwipeCard.this.f21046q = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeCard$b */
    public class C4913b extends kmj.C18210d {
        public C4913b() {
        }

        @Override // p153l.kmj.C18210d, p153l.kmj.InterfaceC18209c
        /* JADX INFO: renamed from: a */
        public boolean mo36181a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            VSwipeCard.this.setPivotX(motionEvent.getRawX());
            VSwipeCard.this.setPivotY(motionEvent.getRawY());
            VSwipeCard.this.m36176m1(motionEvent2.getRawX() - motionEvent.getRawX(), motionEvent2.getRawY() - motionEvent.getRawY(), motionEvent2.getX(), motionEvent2.getY());
            return true;
        }

        /* JADX INFO: renamed from: b */
        public final void m36182b(MotionEvent motionEvent, float f, float f2) {
            float f3 = f / 100.0f;
            if (Math.abs(f3) < qa00.m175859d(5.0f)) {
                VSwipeCard.this.m36156T0(motionEvent.getY());
            } else if (Math.abs(f3) >= qa00.m175859d(12.0f) || Math.abs(f3) < qa00.m175859d(5.0f)) {
                VSwipeCard.this.m36155S0(f / 1000.0f, f2 / 1000.0f, motionEvent.getY());
            } else {
                VSwipeCard.this.mo36152Q0();
            }
        }

        @Override // p153l.kmj.C18210d, p153l.kmj.InterfaceC18208b
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (!VSwipeCard.this.m36171h1()) {
                return false;
            }
            VSwipeCard.this.performClick();
            return false;
        }

        @Override // p153l.kmj.C18210d, p153l.kmj.InterfaceC18209c
        public boolean onDown(MotionEvent motionEvent) {
            Animator animatorM132155a = gt0.m132155a(VSwipeCard.this);
            if (animatorM132155a == null || VSwipeCard.this.f21039j != VSwipeCard.f21021F) {
                return true;
            }
            animatorM132155a.cancel();
            return true;
        }

        @Override // p153l.kmj.C18210d, p153l.kmj.InterfaceC18209c
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (Math.abs(motionEvent2.getRawX() - motionEvent.getRawX()) <= VSwipeCard.this.f21038i && (motionEvent.getRawY() - motionEvent2.getRawY() <= VSwipeCard.f21017B || !VSwipeCard.this.f21037h.mo36184c(true))) {
                VSwipeCard.this.mo36152Q0();
            } else if (VSwipeCard.this.getTranslationX() * f < 0.0f || (VSwipeCard.this.getTranslationY() * f2 < 0.0f && !VSwipeCard.this.mo36161Y0())) {
                m36182b(motionEvent2, f, f2);
            } else {
                VSwipeCard.this.m36155S0(f / 1000.0f, f2 / 1000.0f, motionEvent2.getY());
            }
            return true;
        }

        @Override // p153l.kmj.C18210d, p153l.kmj.InterfaceC18209c
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return VSwipeCard.this.performClick();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeCard$c */
    public interface InterfaceC4914c {
        /* JADX INFO: renamed from: a */
        boolean mo36183a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeCard$d */
    public interface InterfaceC4915d<T extends VSwipeCard> {
        /* JADX INFO: renamed from: c */
        boolean mo36184c(boolean z);

        /* JADX INFO: renamed from: e */
        void mo36185e(float f);

        /* JADX INFO: renamed from: f */
        boolean mo36186f(T t);

        /* JADX INFO: renamed from: g */
        void mo36187g(T t);

        float getBgAlpha();

        /* JADX INFO: renamed from: h */
        void mo36188h(boolean z, float f);

        /* JADX INFO: renamed from: i */
        void mo36189i(T t, SwipeDirection swipeDirection, float f, boolean z);
    }

    public VSwipeCard(Context context) {
        super(context);
        this.f21032c = true;
        this.f21033d = false;
        setOnClickListener(this);
        this.f21038i = qa00.m175859d(42.0f);
        this.f21040k = false;
        this.f21041l = false;
        this.f21042m = false;
        this.f21043n = false;
        this.f21044o = false;
        this.f21045p = false;
        this.f21046q = false;
        this.f21048s = 1.0f;
        this.f21050u = 1.0f;
        this.f21052w = new C4913b();
        kmj kmjVar = new kmj(getContext(), this.f21052w, new Handler(Looper.getMainLooper()));
        this.f21053x = kmjVar;
        kmjVar.m150482m(false);
    }

    /* JADX INFO: renamed from: F */
    public boolean m36149F() {
        return this.f21046q;
    }

    /* JADX INFO: renamed from: O0 */
    public void m36150O0(boolean z) {
        this.f21030a = z;
    }

    /* JADX INFO: renamed from: P0 */
    public void m36151P0(x20 x20Var) {
        if (this.f21034e == null) {
            this.f21034e = new ArrayList();
        }
        this.f21034e.add(x20Var);
    }

    /* JADX INFO: renamed from: Q0 */
    public void mo36152Q0() {
        m36154R0(f21029z);
    }

    /* JADX INFO: renamed from: R */
    public boolean m36153R() {
        return this.f21031b != 0;
    }

    /* JADX INFO: renamed from: R0 */
    public void m36154R0(int i) {
        if (m36164b1()) {
            return;
        }
        Animator animatorM132179y = gt0.m132179y(new OvershootInterpolator(), i, gt0.m132171q(this, "translationX", 0.0f), gt0.m132171q(this, "translationY", 0.0f), gt0.m132171q(this, BLiveGiftItem.TYPE_ROTATION, 0.0f));
        animatorM132179y.addListener(new C4912a());
        this.f21045p = false;
        m36162Z0(animatorM132179y);
        gt0.m132156b(this, animatorM132179y);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m36155S0(float f, float f2, float f3) {
        SwipeDirection swipeDirection;
        if (this.f21039j == f21021F) {
            this.f21030a = false;
            this.f21045p = false;
            if ((-f2) <= Math.abs(f) * f21020E || !this.f21037h.mo36184c(true)) {
                swipeDirection = f > 0.0f ? SwipeDirection.RIGHT : SwipeDirection.LEFT;
            } else {
                swipeDirection = SwipeDirection.UP;
            }
            SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
            if (swipeDirection != swipeDirection2 && swipeDirection != SwipeDirection.RIGHT) {
                if (swipeDirection == SwipeDirection.UP && this.f21037h.mo36184c(true)) {
                    float f4 = -bnl0.m105588w0();
                    double dSqrt = f > 0.0f ? Math.sqrt(f) : -Math.sqrt(Math.abs(f));
                    double dSqrt2 = f2 > 0.0f ? Math.sqrt(f2) : -Math.sqrt(Math.abs(f2));
                    float fAbs = (Math.abs(((f4 - getTranslationY()) / f2) * ((float) dSqrt)) * (f > 0.0f ? 1 : -1)) + getTranslationX();
                    long jMin = (long) Math.min(((double) (f4 - getTranslationY())) / (((((double) Math.abs(f2)) * 0.029d) + 1.433d) * dSqrt2), this.f21040k ? 425.0d : 675.0d);
                    if (jMin <= 10) {
                        jMin = 10;
                    }
                    Animator animatorM132179y = gt0.m132179y(new LinearInterpolator(), jMin, gt0.m132171q(this, "translationX", fAbs), gt0.m132171q(this, "translationY", f4), gt0.m132171q(this, BLiveGiftItem.TYPE_ROTATION, 0.0f));
                    m36162Z0(animatorM132179y);
                    this.f21039j = f21022G;
                    gt0.m132156b(this, animatorM132179y);
                    return;
                }
                return;
            }
            int value = f > 0.0f ? SwipeDirection.RIGHT.getValue() : swipeDirection2.getValue();
            float fM105592y0 = bnl0.m105592y0() * value * 2.0f;
            double dSqrt3 = f > 0.0f ? Math.sqrt(f) : -Math.sqrt(Math.abs(f));
            float fAbs2 = (Math.abs(((fM105592y0 - getTranslationX()) / f) * ((float) (f2 > 0.0f ? Math.sqrt(f2) : -Math.sqrt(Math.abs(f2))))) * (f2 > 0.0f ? 1 : -1)) + getTranslationY();
            if (Float.isNaN(fAbs2)) {
                fAbs2 = (getHeight() / 10) * (f2 > 0.0f ? 1 : -1);
            }
            long jMin2 = (long) Math.min(((double) (fM105592y0 - getTranslationX())) / (((((double) Math.abs(f)) * 0.029d) + 1.433d) * dSqrt3), this.f21040k ? 425.0d : 675.0d);
            if (this.f21042m && getHeight() != 0) {
                jMin2 = Math.min((long) (jMin2 * Math.max(1.0f, Math.abs(fAbs2 / getHeight()))), f21016A);
            }
            float fMo36174k1 = mo36174k1(fAbs2);
            if (jMin2 <= 10) {
                jMin2 = 10;
            }
            Animator animatorM132179y2 = gt0.m132179y(new LinearInterpolator(), jMin2, gt0.m132171q(this, "translationX", fM105592y0), gt0.m132171q(this, "translationY", fMo36174k1), gt0.m132171q(this, BLiveGiftItem.TYPE_ROTATION, value * m36167e1(f3)));
            m36162Z0(animatorM132179y2);
            this.f21039j = f21023H * value;
            gt0.m132156b(this, animatorM132179y2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX INFO: renamed from: T0 */
    public final void m36156T0(float f) {
        SwipeDirection swipeDirection;
        if ((-getTranslationY()) > Math.abs(getTranslationX()) * f21020E && this.f21037h.mo36184c(false)) {
            if (Math.abs(getTranslationX()) < (this.f21041l ? getWidth() / 2.4f : mo36168f1())) {
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
        m36157U0(swipeDirection, f);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0164  */
    /* JADX WARN: Code duplicated, block: B:44:0x016c  */
    /* JADX INFO: renamed from: U0 */
    public final boolean m36157U0(SwipeDirection swipeDirection, float f) {
        int height;
        float translationY;
        long jMin;
        int iM105588w0;
        Animator animatorM132179y;
        VSwipeCard vSwipeCard = this;
        if (vSwipeCard.f21039j != f21021F) {
            return false;
        }
        vSwipeCard.f21030a = false;
        vSwipeCard.f21045p = false;
        boolean z = Math.abs(vSwipeCard.getTranslationX()) > ((float) qa00.m175859d(96.0f)) || Math.abs(vSwipeCard.getTranslationY()) > ((float) qa00.m175859d(86.0f));
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        if (swipeDirection != SwipeDirection.LEFT && swipeDirection != SwipeDirection.RIGHT) {
            if (swipeDirection != SwipeDirection.UP || !vSwipeCard.f21037h.mo36184c(false)) {
                return true;
            }
            float fM105588w0 = bnl0.m105588w0();
            if (!vSwipeCard.f21040k || vSwipeCard.f21041l) {
                animatorM132179y = gt0.m132179y(linearInterpolator, f21029z, gt0.m132171q(vSwipeCard, "translationX", 0.0f), gt0.m132171q(vSwipeCard, "translationY", -fM105588w0), gt0.m132171q(vSwipeCard, BLiveGiftItem.TYPE_ROTATION, 0.0f));
            } else {
                int i = f21029z;
                int i2 = i / 4;
                int i3 = i - i2;
                long j = i;
                OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
                long j2 = i2;
                Animator animatorM132170p = gt0.m132170p(vSwipeCard, "superLikeIconScale", 0L, j2, null, 1.5f, 1.0f);
                vSwipeCard = this;
                animatorM132179y = gt0.m132175u(false, null, j, gt0.m132179y(overshootInterpolator, j2, animatorM132170p, gt0.m132170p(vSwipeCard, "superLikeIconAlpha", 0L, j2, null, 0.5f, 1.0f)), gt0.m132179y(linearInterpolator, i3, gt0.m132171q(vSwipeCard, "translationX", 0.0f), gt0.m132171q(vSwipeCard, "translationY", -fM105588w0), gt0.m132171q(vSwipeCard, BLiveGiftItem.TYPE_ROTATION, 0.0f)));
            }
            vSwipeCard.m36162Z0(animatorM132179y);
            vSwipeCard.f21039j = f21022G;
            gt0.m132156b(vSwipeCard, animatorM132179y);
            return true;
        }
        float value = swipeDirection.getValue() * bnl0.m105592y0() * 1.5f;
        if (z && Float.compare(vSwipeCard.getTranslationY(), 0.0f) != 0) {
            if (Float.compare(vSwipeCard.getTranslationX(), 0.0f) == 0) {
                height = bnl0.m105588w0() * swipeDirection.getValue();
            } else {
                translationY = (vSwipeCard.getTranslationY() * value) / vSwipeCard.getTranslationX();
            }
            if (Float.isNaN(translationY)) {
                if (z) {
                    iM105588w0 = bnl0.m105588w0() * swipeDirection.getValue();
                } else {
                    iM105588w0 = vSwipeCard.getHeight() / 10;
                }
                translationY = iM105588w0;
            }
            jMin = f21029z;
            if (vSwipeCard.f21042m && vSwipeCard.getHeight() != 0) {
                jMin = Math.min((long) (f21029z * Math.max(1.0f, Math.abs(translationY / vSwipeCard.getHeight()))), f21016A);
            }
            Animator animatorM132179y2 = gt0.m132179y(linearInterpolator, jMin, gt0.m132171q(vSwipeCard, "translationX", value), gt0.m132171q(vSwipeCard, "translationY", translationY), gt0.m132171q(vSwipeCard, BLiveGiftItem.TYPE_ROTATION, swipeDirection.getValue() * vSwipeCard.m36167e1(f)));
            vSwipeCard.m36162Z0(animatorM132179y2);
            vSwipeCard.f21039j = f21023H * swipeDirection.getValue();
            gt0.m132156b(vSwipeCard, animatorM132179y2);
            return true;
        }
        height = vSwipeCard.getHeight() / 10;
        translationY = height;
        if (Float.isNaN(translationY)) {
            if (z) {
                iM105588w0 = vSwipeCard.getHeight() / 10;
            } else {
                iM105588w0 = bnl0.m105588w0() * swipeDirection.getValue();
            }
            translationY = iM105588w0;
        }
        jMin = f21029z;
        if (vSwipeCard.f21042m) {
            jMin = Math.min((long) (f21029z * Math.max(1.0f, Math.abs(translationY / vSwipeCard.getHeight()))), f21016A);
        }
        Animator animatorM132179y3 = gt0.m132179y(linearInterpolator, jMin, gt0.m132171q(vSwipeCard, "translationX", value), gt0.m132171q(vSwipeCard, "translationY", translationY), gt0.m132171q(vSwipeCard, BLiveGiftItem.TYPE_ROTATION, swipeDirection.getValue() * vSwipeCard.m36167e1(f)));
        vSwipeCard.m36162Z0(animatorM132179y3);
        vSwipeCard.f21039j = f21023H * swipeDirection.getValue();
        gt0.m132156b(vSwipeCard, animatorM132179y3);
        return true;
    }

    /* JADX INFO: renamed from: V0 */
    public void m36158V0(float f, float f2) {
        this.f21048s = f;
        this.f21047r = f2;
        setBasedTranslationY(this.f21049t);
        setBasedScale(this.f21050u);
    }

    /* JADX INFO: renamed from: W0 */
    public void mo36159W0(boolean z, float f) {
        if (this.f21031b == 0 && NullChecker.m82486a(this.f21037h)) {
            this.f21037h.mo36188h(z, f);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public boolean mo36160X0() {
        return true;
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean mo36161Y0() {
        return false;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m36162Z0(Animator animator) {
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m36163a1() {
        return this.f21046q || m36164b1();
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m36164b1() {
        return this.f21039j != f21021F;
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m36165c1() {
        return this.f21043n;
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m36166d1() {
        if (NullChecker.m82486a(this.f21037h)) {
            return this.f21037h.mo36186f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: e1 */
    public final float m36167e1(float f) {
        return ((f > ((float) ((getHeight() / 3) * 2)) ? ((getHeight() / 3) * 2) - f : Math.min(((getHeight() / 3) * 2) - f, getHeight() / 3)) / getHeight()) * f21028y * 1.4f;
    }

    /* JADX INFO: renamed from: f1 */
    public float mo36168f1() {
        return getWidth() / 2.4f;
    }

    /* JADX INFO: renamed from: g */
    public boolean m36169g() {
        return this.f21030a;
    }

    /* JADX INFO: renamed from: g1 */
    public float mo36170g1() {
        return getHeight() / 3.0f;
    }

    @w6e
    public float getBasedScale() {
        return this.f21050u;
    }

    @w6e
    public float getBasedTranslationY() {
        return this.f21049t;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m36171h1() {
        return false;
    }

    /* JADX INFO: renamed from: i1 */
    public float m36172i1(float f) {
        float width = getWidth() / f21018C;
        if (width == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / width, 1.0f));
    }

    /* JADX INFO: renamed from: j1 */
    public float m36173j1(float f) {
        float height = getHeight() / f21019D;
        if (height == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / height, 1.0f));
    }

    /* JADX INFO: renamed from: k1 */
    public float mo36174k1(float f) {
        return f;
    }

    /* JADX INFO: renamed from: l1 */
    public void m36175l1(x20 x20Var) {
        if (this.f21035f == null) {
            this.f21035f = new ArrayList();
        }
        this.f21035f.add(x20Var);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m36176m1(float f, float f2, float f3, float f4) {
        setTranslationX(f);
        setTranslationY(f2);
        if (this.f21032c) {
            setRotation(m36172i1(f) * m36167e1(f4));
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void mo36177n1() {
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setScaleX(1.0f);
        setScaleY(1.0f);
        setRotation(0.0f);
        setPivotX(getWidth() / 2);
        setPivotY(getHeight() / 2);
        this.f21039j = f21021F;
        this.f21031b = 0L;
        this.f21045p = false;
        List<x20> list = this.f21035f;
        if (list != null) {
            list.clear();
        }
        List<x20> list2 = this.f21034e;
        if (list2 != null) {
            list2.clear();
        }
        mo36178o1(this.f21031b);
    }

    /* JADX INFO: renamed from: o1 */
    public void mo36178o1(long j) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (NullChecker.m82486a(this.f21037h)) {
            this.f21037h.mo36187g(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!mo36160X0()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (m36163a1() || !m36166d1()) {
            return true;
        }
        if (NullChecker.m82486a(this.f21036g) && this.f21036g.mo36183a()) {
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
        if (!mo36160X0()) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f21030a || this.f21037h == null) {
            return false;
        }
        if (!this.f21053x.m150481l(motionEvent) && ((actionMasked = motionEvent.getActionMasked()) == 1 || actionMasked == 3)) {
            if (Math.abs(getTranslationX()) / f21020E > (-getTranslationY()) || !this.f21037h.mo36184c(true)) {
                if (Math.abs(getTranslationX()) > mo36168f1()) {
                    m36156T0(motionEvent.getY());
                } else {
                    mo36152Q0();
                }
            } else if (this.f21037h.mo36184c(true)) {
                if ((-getTranslationY()) > mo36170g1()) {
                    m36156T0(motionEvent.getY());
                } else {
                    mo36152Q0();
                }
            }
        }
        return true;
    }

    @w6e
    public void setBasedScale(float f) {
        this.f21050u = f;
        if (bnl0.m105535S(this.f21048s * f)) {
            return;
        }
        super.setScaleX(this.f21048s * f);
        super.setScaleY(this.f21048s * f);
    }

    @w6e
    public void setBasedTranslationY(float f) {
        this.f21049t = f;
        super.setTranslationY(this.f21047r + f);
    }

    public void setCustomClickGesture(InterfaceC4914c interfaceC4914c) {
        this.f21036g = interfaceC4914c;
    }

    public void setMinFlingSwipeX(int i) {
        this.f21038i = i;
    }

    public void setOptStackCard(boolean z) {
        this.f21043n = z;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (m36165c1()) {
            super.setScaleX(f);
        } else {
            if (this.f21039j == f21021F || bnl0.m105535S(f)) {
                return;
            }
            super.setScaleX(f);
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (m36165c1()) {
            super.setScaleY(f);
        } else {
            if (this.f21039j == f21021F || bnl0.m105535S(f)) {
                return;
            }
            super.setScaleY(f);
        }
    }

    public void setShowSuperLikeIcon(boolean z) {
        this.f21044o = z;
    }

    public void setSwipeCardObserver(InterfaceC4915d interfaceC4915d) {
        this.f21037h = interfaceC4915d;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        if (this.f21037h == null || this.f21039j == f21025J) {
            return;
        }
        this.f21051v = m36172i1((this.f21031b != 0 ? -200.0f : 0.0f) + (f21018C * Math.abs(f)) + Math.abs(getTranslationY()));
        if (Math.abs(this.f21039j) == f21023H && this.f21051v >= 1.0f && Math.abs(f) > 0.0f) {
            int i = this.f21039j;
            this.f21039j = f21025J;
            this.f21037h.mo36185e(1.0f);
            this.f21045p = true;
            this.f21037h.mo36189i(this, i >= 0 ? SwipeDirection.RIGHT : SwipeDirection.LEFT, this.f21051v, this.f21031b != 0);
            return;
        }
        this.f21037h.mo36185e(this.f21051v);
        if (Math.abs(f) > (-getTranslationY()) / f21020E || (-getTranslationY()) <= mo36170g1() / 2.0f) {
            float fM36172i1 = m36172i1(Math.abs(f) * 2.0f);
            if (f > 0.0f) {
                mo36159W0(true, fM36172i1);
            } else {
                mo36159W0(true, -fM36172i1);
            }
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        super.setTranslationY(f);
        if (this.f21037h == null || this.f21039j == f21025J) {
            return;
        }
        float fM36172i1 = m36172i1((this.f21031b != 0 ? -200.0f : 0.0f) + (f21018C * Math.abs(getTranslationX())) + Math.abs(f));
        if (this.f21039j == f21022G && ((this.f21051v >= 1.0f || fM36172i1 >= 1.0f) && Float.compare(Math.abs(f), 0.0f) > 0)) {
            this.f21039j = f21025J;
            this.f21037h.mo36185e(1.0f);
            this.f21045p = true;
            this.f21037h.mo36189i(this, SwipeDirection.UP, this.f21051v, this.f21031b != 0);
            return;
        }
        float f2 = -f;
        if (Math.abs(getTranslationX()) <= f2 / f21020E) {
            if (f2 > mo36170g1() / 2.0f || f == 0.0f) {
                if (this.f21040k && !m36153R() && !this.f21041l && !this.f21044o) {
                    mo36159W0(false, 0.0f);
                    return;
                }
                float fM36173j1 = m36153R() ? m36173j1(Math.abs(f) * 2.0f) : m36173j1(Math.abs((mo36170g1() / 2.0f) + f) * 2.0f);
                if (f < 0.0f || (m36153R() && f == 0.0f)) {
                    mo36159W0(false, fM36173j1 * 2.0f);
                }
            }
        }
    }

    public VSwipeCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21032c = true;
        this.f21033d = false;
        setOnClickListener(this);
        this.f21038i = qa00.m175859d(42.0f);
        this.f21040k = false;
        this.f21041l = false;
        this.f21042m = false;
        this.f21043n = false;
        this.f21044o = false;
        this.f21045p = false;
        this.f21046q = false;
        this.f21048s = 1.0f;
        this.f21050u = 1.0f;
        this.f21052w = new C4913b();
        kmj kmjVar = new kmj(getContext(), this.f21052w, new Handler(Looper.getMainLooper()));
        this.f21053x = kmjVar;
        kmjVar.m150482m(false);
    }

    public VSwipeCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21032c = true;
        this.f21033d = false;
        setOnClickListener(this);
        this.f21038i = qa00.m175859d(42.0f);
        this.f21040k = false;
        this.f21041l = false;
        this.f21042m = false;
        this.f21043n = false;
        this.f21044o = false;
        this.f21045p = false;
        this.f21046q = false;
        this.f21048s = 1.0f;
        this.f21050u = 1.0f;
        this.f21052w = new C4913b();
        kmj kmjVar = new kmj(getContext(), this.f21052w, new Handler(Looper.getMainLooper()));
        this.f21053x = kmjVar;
        kmjVar.m150482m(false);
    }
}
