package p009l;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.t100;
import l.x2c0;
import l.xdl0;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ehj0 {

    /* JADX INFO: renamed from: a */
    public View f12567a;

    /* JADX INFO: renamed from: b */
    public wsf0 f12568b;

    /* JADX INFO: renamed from: c */
    public Animator f12569c;

    /* JADX INFO: renamed from: d */
    public VImage f12570d;

    /* JADX INFO: renamed from: l.ehj0$a */
    public static /* synthetic */ class C0876a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12571a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f12571a = iArr;
            try {
                iArr[SwipeDirection.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12571a[SwipeDirection.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12571a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ehj0(Context context, wsf0 wsf0Var, VFrame vFrame) {
        this.f12568b = wsf0Var;
        VImage vImage = new VImage(context);
        this.f12570d = vImage;
        vImage.setScaleX(0.0f);
        this.f12570d.setScaleY(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(96.0f), t100.d(96.0f));
        layoutParams.gravity = 17;
        if (NullChecker.a(this.f12570d.getParent())) {
            ((ViewGroup) this.f12570d.getParent()).removeView(this.f12570d);
        }
        vFrame.addView(this.f12570d, layoutParams);
        xdl0.M(this.f12570d, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m13946b(SwipeDirection swipeDirection) {
        if (this.f12567a == null) {
            return;
        }
        if (this.f12568b.mo2804c(false) || swipeDirection != SwipeDirection.UP) {
            int i = C0876a.f12571a[swipeDirection.ordinal()];
            if (i == 1) {
                this.f12570d.setImageResource(x2c0.xu);
            } else if (i == 2) {
                this.f12570d.setImageResource(x2c0.iq);
            } else if (i == 3) {
                this.f12570d.setImageResource(x2c0.wu);
            }
            Animator animatorM13947c = m13947c();
            this.f12569c = animatorM13947c;
            animatorM13947c.start();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Animator m13947c() {
        this.f12570d.setPivotX(t100.d(48.0f));
        this.f12570d.setPivotY(t100.d(96.0f));
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(this.f12570d, View.SCALE_X, 0L, 500L, (Interpolator) null, new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f}), bt0.l(this.f12570d, View.SCALE_Y, 0L, 500L, (Interpolator) null, new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f})});
        bt0.f(animatorZ, new Runnable() { // from class: l.dhj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11844a.m13948d();
            }
        });
        return animatorZ;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m13948d() {
        xdl0.M(this.f12570d, false);
    }

    /* JADX INFO: renamed from: e */
    public void m13949e(View view, SwipeDirection swipeDirection) {
        if (NullChecker.a(this.f12569c) && this.f12569c.isRunning()) {
            return;
        }
        this.f12567a = view;
        xdl0.M(this.f12570d, true);
        m13946b(swipeDirection);
    }
}
