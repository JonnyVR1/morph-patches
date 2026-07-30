package p153l;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class fqj0 {

    /* JADX INFO: renamed from: a */
    public View f100300a;

    /* JADX INFO: renamed from: b */
    public f1g0 f100301b;

    /* JADX INFO: renamed from: c */
    public Animator f100302c;

    /* JADX INFO: renamed from: d */
    public Animator f100303d;

    /* JADX INFO: renamed from: e */
    public VFrame f100304e;

    /* JADX INFO: renamed from: f */
    public VImage f100305f;

    /* JADX INFO: renamed from: l.fqj0$a */
    public class RunnableC17032a implements Runnable {
        public RunnableC17032a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            fqj0.this.f100301b.mo39813e(1.0f);
        }
    }

    /* JADX INFO: renamed from: l.fqj0$b */
    public static /* synthetic */ class C17033b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100307a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f100308b;

        static {
            int[] iArr = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f100308b = iArr;
            try {
                iArr[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100308b[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100308b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SwipeDirection.values().length];
            f100307a = iArr2;
            try {
                iArr2[SwipeDirection.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f100307a[SwipeDirection.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f100307a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public fqj0(Context context, f1g0 f1g0Var, VFrame vFrame) {
        this.f100301b = f1g0Var;
        this.f100304e = vFrame;
        VImage vImage = new VImage(context);
        this.f100305f = vImage;
        vImage.setScaleX(0.0f);
        this.f100305f.setScaleY(0.0f);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m126763a(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.invalidate();
    }

    /* JADX INFO: renamed from: d */
    public final void m126766d(final SwipeDirection swipeDirection) {
        int height;
        int height2;
        if (this.f100300a == null) {
            return;
        }
        if (this.f100301b.mo39811c(false) || swipeDirection != SwipeDirection.UP) {
            int i = C17033b.f100307a[swipeDirection.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.f100305f.setImageResource(dbc0.f86707Wq);
                    height = this.f100300a.getHeight();
                } else if (i != 3) {
                    height2 = 0;
                } else {
                    this.f100305f.setImageResource(dbc0.f87167kv);
                    height2 = this.f100300a.getHeight();
                }
                Animator animatorM132180z = gt0.m132180z(m126767e(), gt0.m132166l(this.f100300a, View.TRANSLATION_Y, 200L, 500L, null, 0.0f, height2), gt0.m132166l(this.f100300a, View.ALPHA, 200L, 500L, null, 1.0f, 0.0f));
                this.f100302c = animatorM132180z;
                gt0.m132177w(animatorM132180z, new RunnableC17032a(), new Runnable() { // from class: l.dqj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f90255a.m126768f(swipeDirection);
                    }
                });
                this.f100302c.start();
            }
            this.f100305f.setImageResource(dbc0.f87200lv);
            height = this.f100300a.getHeight();
            height2 = -height;
            Animator animatorM132180z2 = gt0.m132180z(m126767e(), gt0.m132166l(this.f100300a, View.TRANSLATION_Y, 200L, 500L, null, 0.0f, height2), gt0.m132166l(this.f100300a, View.ALPHA, 200L, 500L, null, 1.0f, 0.0f));
            this.f100302c = animatorM132180z2;
            gt0.m132177w(animatorM132180z2, new RunnableC17032a(), new Runnable() { // from class: l.dqj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f90255a.m126768f(swipeDirection);
                }
            });
            this.f100302c.start();
        }
    }

    /* JADX INFO: renamed from: e */
    public final Animator m126767e() {
        this.f100305f.setPivotX(qa00.m175859d(48.0f));
        this.f100305f.setPivotY(qa00.m175859d(96.0f));
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(this.f100305f, View.SCALE_X, 0L, 500L, null, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f), gt0.m132166l(this.f100305f, View.SCALE_Y, 0L, 500L, null, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f));
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.eqj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f95347a.m126769g();
            }
        });
        return animatorM132180z;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m126768f(SwipeDirection swipeDirection) {
        this.f100301b.mo39817k(this.f100300a, swipeDirection, 1.0f, false);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m126769g() {
        this.f100304e.removeView(this.f100305f);
    }

    /* JADX INFO: renamed from: h */
    public final void m126770h() {
        if (NullChecker.m82486a(this.f100305f) && NullChecker.m82486a(this.f100305f.getParent())) {
            ((ViewGroup) this.f100305f.getParent()).removeView(this.f100305f);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m126771i(VSwipeStack.OnCardSwipeResult onCardSwipeResult, SwipeDirection swipeDirection) {
        int i = C17033b.f100308b[onCardSwipeResult.ordinal()];
        if (i == 2 || i == 3) {
            m126770h();
            m126773k(this.f100300a);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m126772j(View view, SwipeDirection swipeDirection) {
        if (NullChecker.m82486a(this.f100302c) && this.f100302c.isRunning()) {
            return;
        }
        if (NullChecker.m82486a(this.f100303d) && this.f100303d.isRunning()) {
            return;
        }
        this.f100300a = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(96.0f), qa00.m175859d(96.0f));
        layoutParams.gravity = 17;
        if (NullChecker.m82486a(this.f100305f.getParent())) {
            ((ViewGroup) this.f100305f.getParent()).removeView(this.f100305f);
        }
        this.f100304e.addView(this.f100305f, layoutParams);
        m126766d(swipeDirection);
    }

    /* JADX INFO: renamed from: k */
    public void m126773k(final View view) {
        if (NullChecker.m82486a(view)) {
            Animator animatorM132178x = gt0.m132178x(200L, gt0.m132168n(view, View.TRANSLATION_Y, 0.0f), gt0.m132168n(view, View.TRANSLATION_X, 0.0f), gt0.m132168n(view, View.ALPHA, 1.0f));
            this.f100303d = animatorM132178x;
            gt0.m132160f(animatorM132178x, new Runnable() { // from class: l.cqj0
                @Override // java.lang.Runnable
                public final void run() {
                    fqj0.m126763a(view);
                }
            });
            this.f100303d.start();
        }
    }
}
