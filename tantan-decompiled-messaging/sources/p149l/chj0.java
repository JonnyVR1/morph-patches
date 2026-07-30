package p149l;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class chj0 {

    /* JADX INFO: renamed from: a */
    public View f80886a;

    /* JADX INFO: renamed from: b */
    public wsf0 f80887b;

    /* JADX INFO: renamed from: c */
    public Animator f80888c;

    /* JADX INFO: renamed from: d */
    public Animator f80889d;

    /* JADX INFO: renamed from: e */
    public VFrame f80890e;

    /* JADX INFO: renamed from: f */
    public VImage f80891f;

    /* JADX INFO: renamed from: l.chj0$a */
    public class RunnableC16151a implements Runnable {
        public RunnableC16151a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            chj0.this.f80887b.mo38810e(1.0f);
        }
    }

    /* JADX INFO: renamed from: l.chj0$b */
    public static /* synthetic */ class C16152b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f80893a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f80894b;

        static {
            int[] iArr = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f80894b = iArr;
            try {
                iArr[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80894b[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80894b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SwipeDirection.values().length];
            f80893a = iArr2;
            try {
                iArr2[SwipeDirection.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f80893a[SwipeDirection.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f80893a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public chj0(Context context, wsf0 wsf0Var, VFrame vFrame) {
        this.f80887b = wsf0Var;
        this.f80890e = vFrame;
        VImage vImage = new VImage(context);
        this.f80891f = vImage;
        vImage.setScaleX(0.0f);
        this.f80891f.setScaleY(0.0f);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m106888a(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.invalidate();
    }

    /* JADX INFO: renamed from: d */
    public final void m106891d(final SwipeDirection swipeDirection) {
        int height;
        int height2;
        if (this.f80886a == null) {
            return;
        }
        if (this.f80887b.mo38808c(false) || swipeDirection != SwipeDirection.UP) {
            int i = C16152b.f80893a[swipeDirection.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.f80891f.setImageResource(x2c0.f190246iq);
                    height = this.f80886a.getHeight();
                } else if (i != 3) {
                    height2 = 0;
                } else {
                    this.f80891f.setImageResource(x2c0.f190697wu);
                    height2 = this.f80886a.getHeight();
                }
                Animator animatorM103753z = bt0.m103753z(m106892e(), bt0.m103739l(this.f80886a, View.TRANSLATION_Y, 200L, 500L, null, 0.0f, height2), bt0.m103739l(this.f80886a, View.ALPHA, 200L, 500L, null, 1.0f, 0.0f));
                this.f80888c = animatorM103753z;
                bt0.m103750w(animatorM103753z, new RunnableC16151a(), new Runnable() { // from class: l.ahj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f69607a.m106893f(swipeDirection);
                    }
                });
                this.f80888c.start();
            }
            this.f80891f.setImageResource(x2c0.f190729xu);
            height = this.f80886a.getHeight();
            height2 = -height;
            Animator animatorM103753z2 = bt0.m103753z(m106892e(), bt0.m103739l(this.f80886a, View.TRANSLATION_Y, 200L, 500L, null, 0.0f, height2), bt0.m103739l(this.f80886a, View.ALPHA, 200L, 500L, null, 1.0f, 0.0f));
            this.f80888c = animatorM103753z2;
            bt0.m103750w(animatorM103753z2, new RunnableC16151a(), new Runnable() { // from class: l.ahj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69607a.m106893f(swipeDirection);
                }
            });
            this.f80888c.start();
        }
    }

    /* JADX INFO: renamed from: e */
    public final Animator m106892e() {
        this.f80891f.setPivotX(t100.m186890d(48.0f));
        this.f80891f.setPivotY(t100.m186890d(96.0f));
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(this.f80891f, View.SCALE_X, 0L, 500L, null, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f), bt0.m103739l(this.f80891f, View.SCALE_Y, 0L, 500L, null, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f));
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.bhj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f75617a.m106894g();
            }
        });
        return animatorM103753z;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m106893f(SwipeDirection swipeDirection) {
        this.f80887b.mo38814k(this.f80886a, swipeDirection, 1.0f, false);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m106894g() {
        this.f80890e.removeView(this.f80891f);
    }

    /* JADX INFO: renamed from: h */
    public final void m106895h() {
        if (NullChecker.m81303a(this.f80891f) && NullChecker.m81303a(this.f80891f.getParent())) {
            ((ViewGroup) this.f80891f.getParent()).removeView(this.f80891f);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m106896i(VSwipeStack.OnCardSwipeResult onCardSwipeResult, SwipeDirection swipeDirection) {
        int i = C16152b.f80894b[onCardSwipeResult.ordinal()];
        if (i == 2 || i == 3) {
            m106895h();
            m106898k(this.f80886a);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m106897j(View view, SwipeDirection swipeDirection) {
        if (NullChecker.m81303a(this.f80888c) && this.f80888c.isRunning()) {
            return;
        }
        if (NullChecker.m81303a(this.f80889d) && this.f80889d.isRunning()) {
            return;
        }
        this.f80886a = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(96.0f), t100.m186890d(96.0f));
        layoutParams.gravity = 17;
        if (NullChecker.m81303a(this.f80891f.getParent())) {
            ((ViewGroup) this.f80891f.getParent()).removeView(this.f80891f);
        }
        this.f80890e.addView(this.f80891f, layoutParams);
        m106891d(swipeDirection);
    }

    /* JADX INFO: renamed from: k */
    public void m106898k(final View view) {
        if (NullChecker.m81303a(view)) {
            Animator animatorM103751x = bt0.m103751x(200L, bt0.m103741n(view, View.TRANSLATION_Y, 0.0f), bt0.m103741n(view, View.TRANSLATION_X, 0.0f), bt0.m103741n(view, View.ALPHA, 1.0f));
            this.f80889d = animatorM103751x;
            bt0.m103733f(animatorM103751x, new Runnable() { // from class: l.zgj0
                @Override // java.lang.Runnable
                public final void run() {
                    chj0.m106888a(view);
                }
            });
            this.f80889d.start();
        }
    }
}
