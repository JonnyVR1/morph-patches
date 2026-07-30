package p153l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class dyf0 extends fqe0 {

    /* JADX INFO: renamed from: k */
    public static final int f91204k = qa00.m175859d(92.0f);

    /* JADX INFO: renamed from: i */
    public final C16658a f91205i;

    /* JADX INFO: renamed from: j */
    public C16659b f91206j;

    /* JADX INFO: renamed from: l.dyf0$a */
    public static class C16658a {

        /* JADX INFO: renamed from: j */
        public static final pcj<String> f91207j = new pcj() { // from class: l.zxf0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dyf0.C16658a.m118679c();
            }
        };

        /* JADX INFO: renamed from: k */
        public static final qcj<View, Animator> f91208k = new qcj() { // from class: l.ayf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dyf0.C16658a.m118678b((View) obj);
            }
        };

        /* JADX INFO: renamed from: l */
        public static final qcj<View, Animator> f91209l = new qcj() { // from class: l.byf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dyf0.C16658a.m118677a((View) obj);
            }
        };

        /* JADX INFO: renamed from: m */
        public static final qcj<View, Animator> f91210m = new qcj() { // from class: l.cyf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dyf0.C16658a.m118680d((View) obj);
            }
        };

        /* JADX INFO: renamed from: n */
        public static final FrameLayout.LayoutParams f91211n = new FrameLayout.LayoutParams(-2, -2);

        /* JADX INFO: renamed from: a */
        public final Activity f91212a;

        /* JADX INFO: renamed from: b */
        public final View f91213b;

        /* JADX INFO: renamed from: c */
        public String f91214c = f91207j.call();

        /* JADX INFO: renamed from: d */
        public String f91215d = "default";

        /* JADX INFO: renamed from: e */
        public int f91216e = 3000;

        /* JADX INFO: renamed from: f */
        public qcj<View, Animator> f91217f = f91208k;

        /* JADX INFO: renamed from: g */
        public qcj<View, Animator> f91218g = f91209l;

        /* JADX INFO: renamed from: h */
        public qcj<View, Animator> f91219h = f91210m;

        /* JADX INFO: renamed from: i */
        public ViewGroup.LayoutParams f91220i = f91211n;

        public C16658a(@NonNull Activity activity, @NonNull View view) {
            this.f91212a = activity;
            this.f91213b = view;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Animator m118677a(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Animator m118678b(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", -dyf0.f91204k, 0.0f);
            objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ String m118679c() {
            return "" + System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ Animator m118680d(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "translationY", 0.0f, -dyf0.f91204k));
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: m */
        public dyf0 m118689m() {
            return new dyf0(this);
        }
    }

    /* JADX INFO: renamed from: l.dyf0$b */
    public static class C16659b extends PopupWindow {

        /* JADX INFO: renamed from: a */
        public final Animator f91221a;

        /* JADX INFO: renamed from: b */
        public final Animator f91222b;

        /* JADX INFO: renamed from: c */
        public final C16658a f91223c;

        public C16659b(@NonNull C16658a c16658a) {
            this.f91223c = c16658a;
            this.f91221a = c16658a.f91217f == null ? null : (Animator) c16658a.f91217f.call(c16658a.f91213b);
            this.f91222b = c16658a.f91218g != null ? (Animator) c16658a.f91218g.call(c16658a.f91213b) : null;
            if (c16658a.f91220i.width == -1) {
                setWidth(-1);
            } else {
                setWidth(-2);
            }
            setHeight(-2);
            setContentView(c16658a.f91213b);
        }

        /* JADX INFO: renamed from: c */
        public void m118692c(@Nullable Animator animator) {
            if (animator == null) {
                super.dismiss();
            } else {
                if (animator.isRunning()) {
                    return;
                }
                gt0.m132160f(animator, new Runnable() { // from class: l.eyf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f96425a.m118693d();
                    }
                });
                animator.start();
            }
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m118693d() {
            try {
                super.dismiss();
            } catch (IllegalArgumentException unused) {
            }
        }

        @Override // android.widget.PopupWindow
        public void dismiss() {
            m118692c(this.f91222b);
        }

        /* JADX INFO: renamed from: e */
        public void m118694e() {
            Window window;
            Animator animator = this.f91221a;
            if ((animator != null && animator.isRunning()) || (window = this.f91223c.f91212a.getWindow()) == null || window.getDecorView() == null || window.getDecorView().getWindowToken() == null) {
                return;
            }
            Animator animator2 = this.f91221a;
            if (animator2 != null) {
                animator2.start();
            }
            showAtLocation(window.getDecorView(), 49, 0, 0);
        }
    }

    public dyf0(@NonNull C16658a c16658a) {
        this.f91205i = c16658a;
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: A */
    public int mo22133A() {
        pcj<Boolean> pcjVar = this.f100279d;
        boolean z = pcjVar == null || pcjVar.call().booleanValue();
        Activity activity = this.f91205i.f91212a;
        if (!z || activity.isFinishing()) {
            if (NullChecker.m82486a(this.f121543b)) {
                this.f121543b.call();
            }
            return 0;
        }
        final C16659b c16659b = new C16659b(this.f91205i);
        this.f91206j = c16659b;
        Objects.requireNonNull(c16659b);
        final Runnable runnable = new Runnable() { // from class: l.xxf0
            @Override // java.lang.Runnable
            public final void run() {
                c16659b.dismiss();
            }
        };
        this.f91206j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.yxf0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f201966a.m118676F(runnable);
            }
        });
        this.f91206j.m118694e();
        if (NullChecker.m82486a(this.f121542a)) {
            this.f121542a.call();
        }
        l51.m152888H(this.f91205i.f91212a, runnable, this.f91205i.f91216e);
        return this.f91205i.f91216e;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m118676F(Runnable runnable) {
        l51.m152890J(runnable);
        if (NullChecker.m82486a(this.f121543b)) {
            this.f121543b.call();
        }
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
        C16659b c16659b = this.f91206j;
        if (c16659b == null || !c16659b.isShowing()) {
            return;
        }
        C16659b c16659b2 = this.f91206j;
        if (z) {
            c16659b2.getContentView().setTranslationY(0.0f);
            this.f91206j.getContentView().setAlpha(1.0f);
        } else {
            c16659b2.getContentView().setTranslationY(-4000.0f);
            this.f91206j.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: j */
    public int mo22137j() {
        return this.f91205i.f91212a.hashCode();
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return (Act) this.f91205i.f91212a;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        C16659b c16659b = this.f91206j;
        if (c16659b != null && c16659b.isShowing()) {
            this.f91206j.dismiss();
            return;
        }
        z2m z2mVar = this.f100281f;
        if (z2mVar != null) {
            z2mVar.mo22108a(this);
        }
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: o */
    public String mo22139o() {
        return this.f91205i.f91215d;
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return this.f91205i.f91214c;
    }
}
