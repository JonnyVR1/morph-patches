package p149l;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class ehj0 {

    /* JADX INFO: renamed from: a */
    public View f91332a;

    /* JADX INFO: renamed from: b */
    public wsf0 f91333b;

    /* JADX INFO: renamed from: c */
    public Animator f91334c;

    /* JADX INFO: renamed from: d */
    public VImage f91335d;

    /* JADX INFO: renamed from: l.ehj0$a */
    public static /* synthetic */ class C16611a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f91336a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f91336a = iArr;
            try {
                iArr[SwipeDirection.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91336a[SwipeDirection.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91336a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ehj0(Context context, wsf0 wsf0Var, VFrame vFrame) {
        this.f91333b = wsf0Var;
        VImage vImage = new VImage(context);
        this.f91335d = vImage;
        vImage.setScaleX(0.0f);
        this.f91335d.setScaleY(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(96.0f), t100.m186890d(96.0f));
        layoutParams.gravity = 17;
        if (NullChecker.m81303a(this.f91335d.getParent())) {
            ((ViewGroup) this.f91335d.getParent()).removeView(this.f91335d);
        }
        vFrame.addView(this.f91335d, layoutParams);
        xdl0.m208344M(this.f91335d, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m116471b(SwipeDirection swipeDirection) {
        if (this.f91332a == null) {
            return;
        }
        if (this.f91333b.mo38808c(false) || swipeDirection != SwipeDirection.UP) {
            int i = C16611a.f91336a[swipeDirection.ordinal()];
            if (i == 1) {
                this.f91335d.setImageResource(x2c0.f190729xu);
            } else if (i == 2) {
                this.f91335d.setImageResource(x2c0.f190246iq);
            } else if (i == 3) {
                this.f91335d.setImageResource(x2c0.f190697wu);
            }
            Animator animatorM116472c = m116472c();
            this.f91334c = animatorM116472c;
            animatorM116472c.start();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Animator m116472c() {
        this.f91335d.setPivotX(t100.m186890d(48.0f));
        this.f91335d.setPivotY(t100.m186890d(96.0f));
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(this.f91335d, View.SCALE_X, 0L, 500L, null, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f), bt0.m103739l(this.f91335d, View.SCALE_Y, 0L, 500L, null, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f));
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.dhj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f86305a.m116473d();
            }
        });
        return animatorM103753z;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m116473d() {
        xdl0.m208344M(this.f91335d, false);
    }

    /* JADX INFO: renamed from: e */
    public void m116474e(View view, SwipeDirection swipeDirection) {
        if (NullChecker.m81303a(this.f91334c) && this.f91334c.isRunning()) {
            return;
        }
        this.f91332a = view;
        xdl0.m208344M(this.f91335d, true);
        m116471b(swipeDirection);
    }
}
