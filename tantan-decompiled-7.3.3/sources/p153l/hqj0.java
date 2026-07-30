package p153l;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class hqj0 {

    /* JADX INFO: renamed from: a */
    public View f111133a;

    /* JADX INFO: renamed from: b */
    public f1g0 f111134b;

    /* JADX INFO: renamed from: c */
    public Animator f111135c;

    /* JADX INFO: renamed from: d */
    public VImage f111136d;

    /* JADX INFO: renamed from: l.hqj0$a */
    public static /* synthetic */ class C17538a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f111137a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f111137a = iArr;
            try {
                iArr[SwipeDirection.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f111137a[SwipeDirection.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f111137a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public hqj0(Context context, f1g0 f1g0Var, VFrame vFrame) {
        this.f111134b = f1g0Var;
        VImage vImage = new VImage(context);
        this.f111136d = vImage;
        vImage.setScaleX(0.0f);
        this.f111136d.setScaleY(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(96.0f), qa00.m175859d(96.0f));
        layoutParams.gravity = 17;
        if (NullChecker.m82486a(this.f111136d.getParent())) {
            ((ViewGroup) this.f111136d.getParent()).removeView(this.f111136d);
        }
        vFrame.addView(this.f111136d, layoutParams);
        bnl0.m105524M(this.f111136d, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m136628b(SwipeDirection swipeDirection) {
        if (this.f111133a == null) {
            return;
        }
        if (this.f111134b.mo39811c(false) || swipeDirection != SwipeDirection.UP) {
            int i = C17538a.f111137a[swipeDirection.ordinal()];
            if (i == 1) {
                this.f111136d.setImageResource(dbc0.f87200lv);
            } else if (i == 2) {
                this.f111136d.setImageResource(dbc0.f86707Wq);
            } else if (i == 3) {
                this.f111136d.setImageResource(dbc0.f87167kv);
            }
            Animator animatorM136629c = m136629c();
            this.f111135c = animatorM136629c;
            animatorM136629c.start();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Animator m136629c() {
        this.f111136d.setPivotX(qa00.m175859d(48.0f));
        this.f111136d.setPivotY(qa00.m175859d(96.0f));
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(this.f111136d, View.SCALE_X, 0L, 500L, null, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f), gt0.m132166l(this.f111136d, View.SCALE_Y, 0L, 500L, null, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f));
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.gqj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f105686a.m136630d();
            }
        });
        return animatorM132180z;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m136630d() {
        bnl0.m105524M(this.f111136d, false);
    }

    /* JADX INFO: renamed from: e */
    public void m136631e(View view, SwipeDirection swipeDirection) {
        if (NullChecker.m82486a(this.f111135c) && this.f111135c.isRunning()) {
            return;
        }
        this.f111133a = view;
        bnl0.m105524M(this.f111136d, true);
        m136628b(swipeDirection);
    }
}
