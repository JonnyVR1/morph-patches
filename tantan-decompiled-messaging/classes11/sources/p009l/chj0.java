package p009l;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.t100;
import l.x2c0;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class chj0 {

    /* JADX INFO: renamed from: a */
    public View f10595a;

    /* JADX INFO: renamed from: b */
    public wsf0 f10596b;

    /* JADX INFO: renamed from: c */
    public Animator f10597c;

    /* JADX INFO: renamed from: d */
    public Animator f10598d;

    /* JADX INFO: renamed from: e */
    public VFrame f10599e;

    /* JADX INFO: renamed from: f */
    public VImage f10600f;

    /* JADX INFO: renamed from: l.chj0$a */
    public class RunnableC0809a implements Runnable {
        public RunnableC0809a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            chj0.this.f10596b.mo2806e(1.0f);
        }
    }

    /* JADX INFO: renamed from: l.chj0$b */
    public static /* synthetic */ class C0810b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10602a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10603b;

        static {
            int[] iArr = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f10603b = iArr;
            try {
                iArr[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10603b[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10603b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SwipeDirection.values().length];
            f10602a = iArr2;
            try {
                iArr2[SwipeDirection.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10602a[SwipeDirection.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10602a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public chj0(Context context, wsf0 wsf0Var, VFrame vFrame) {
        this.f10596b = wsf0Var;
        this.f10599e = vFrame;
        VImage vImage = new VImage(context);
        this.f10600f = vImage;
        vImage.setScaleX(0.0f);
        this.f10600f.setScaleY(0.0f);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12554a(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.invalidate();
    }

    /* JADX INFO: renamed from: d */
    public final void m12557d(final SwipeDirection swipeDirection) {
        int height;
        int height2;
        if (this.f10595a == null) {
            return;
        }
        if (this.f10596b.mo2804c(false) || swipeDirection != SwipeDirection.UP) {
            int i = C0810b.f10602a[swipeDirection.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.f10600f.setImageResource(x2c0.iq);
                    height = this.f10595a.getHeight();
                } else if (i != 3) {
                    height2 = 0;
                } else {
                    this.f10600f.setImageResource(x2c0.wu);
                    height2 = this.f10595a.getHeight();
                }
                Animator animatorZ = bt0.z(new Animator[]{m12558e(), bt0.l(this.f10595a, View.TRANSLATION_Y, 200L, 500L, (Interpolator) null, new float[]{0.0f, height2}), bt0.l(this.f10595a, View.ALPHA, 200L, 500L, (Interpolator) null, new float[]{1.0f, 0.0f})});
                this.f10597c = animatorZ;
                bt0.w(animatorZ, new RunnableC0809a(), new Runnable() { // from class: l.ahj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9515a.m12559f(swipeDirection);
                    }
                });
                this.f10597c.start();
            }
            this.f10600f.setImageResource(x2c0.xu);
            height = this.f10595a.getHeight();
            height2 = -height;
            Animator animatorZ2 = bt0.z(new Animator[]{m12558e(), bt0.l(this.f10595a, View.TRANSLATION_Y, 200L, 500L, (Interpolator) null, new float[]{0.0f, height2}), bt0.l(this.f10595a, View.ALPHA, 200L, 500L, (Interpolator) null, new float[]{1.0f, 0.0f})});
            this.f10597c = animatorZ2;
            bt0.w(animatorZ2, new RunnableC0809a(), new Runnable() { // from class: l.ahj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9515a.m12559f(swipeDirection);
                }
            });
            this.f10597c.start();
        }
    }

    /* JADX INFO: renamed from: e */
    public final Animator m12558e() {
        this.f10600f.setPivotX(t100.d(48.0f));
        this.f10600f.setPivotY(t100.d(96.0f));
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(this.f10600f, View.SCALE_X, 0L, 500L, (Interpolator) null, new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f}), bt0.l(this.f10600f, View.SCALE_Y, 0L, 500L, (Interpolator) null, new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f})});
        bt0.f(animatorZ, new Runnable() { // from class: l.bhj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10109a.m12560g();
            }
        });
        return animatorZ;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m12559f(SwipeDirection swipeDirection) {
        this.f10596b.mo2810k(this.f10595a, swipeDirection, 1.0f, false);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m12560g() {
        this.f10599e.removeView(this.f10600f);
    }

    /* JADX INFO: renamed from: h */
    public final void m12561h() {
        if (NullChecker.a(this.f10600f) && NullChecker.a(this.f10600f.getParent())) {
            ((ViewGroup) this.f10600f.getParent()).removeView(this.f10600f);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m12562i(VSwipeStack.OnCardSwipeResult onCardSwipeResult, SwipeDirection swipeDirection) {
        int i = C0810b.f10603b[onCardSwipeResult.ordinal()];
        if (i == 2 || i == 3) {
            m12561h();
            m12564k(this.f10595a);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m12563j(View view, SwipeDirection swipeDirection) {
        if (NullChecker.a(this.f10597c) && this.f10597c.isRunning()) {
            return;
        }
        if (NullChecker.a(this.f10598d) && this.f10598d.isRunning()) {
            return;
        }
        this.f10595a = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(96.0f), t100.d(96.0f));
        layoutParams.gravity = 17;
        if (NullChecker.a(this.f10600f.getParent())) {
            ((ViewGroup) this.f10600f.getParent()).removeView(this.f10600f);
        }
        this.f10599e.addView(this.f10600f, layoutParams);
        m12557d(swipeDirection);
    }

    /* JADX INFO: renamed from: k */
    public void m12564k(final View view) {
        if (NullChecker.a(view)) {
            Animator animatorX = bt0.x(200L, new Animator[]{bt0.n(view, View.TRANSLATION_Y, new float[]{0.0f}), bt0.n(view, View.TRANSLATION_X, new float[]{0.0f}), bt0.n(view, View.ALPHA, new float[]{1.0f})});
            this.f10598d = animatorX;
            bt0.f(animatorX, new Runnable() { // from class: l.zgj0
                @Override // java.lang.Runnable
                public final void run() {
                    chj0.m12554a(view);
                }
            });
            this.f10598d.start();
        }
    }
}
