package p009l;

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
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.aie0;
import l.bt0;
import l.e51;
import l.f0m;
import l.fdb0;
import l.t100;
import l.v9j;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class upf0 extends aie0 {

    /* JADX INFO: renamed from: k */
    public static final int f21284k = t100.d(92.0f);

    /* JADX INFO: renamed from: i */
    public final C1220a f21285i;

    /* JADX INFO: renamed from: j */
    public C1221b f21286j;

    /* JADX INFO: renamed from: l.upf0$a */
    public static class C1220a {

        /* JADX INFO: renamed from: j */
        public static final v9j<String> f21287j = new v9j() { // from class: l.qpf0
            public final Object call() {
                return upf0.C1220a.m23099c();
            }
        };

        /* JADX INFO: renamed from: k */
        public static final w9j<View, Animator> f21288k = new w9j() { // from class: l.rpf0
            public final Object call(Object obj) {
                return upf0.C1220a.m23098b((View) obj);
            }
        };

        /* JADX INFO: renamed from: l */
        public static final w9j<View, Animator> f21289l = new w9j() { // from class: l.spf0
            public final Object call(Object obj) {
                return upf0.C1220a.m23097a((View) obj);
            }
        };

        /* JADX INFO: renamed from: m */
        public static final w9j<View, Animator> f21290m = new w9j() { // from class: l.tpf0
            public final Object call(Object obj) {
                return upf0.C1220a.m23100d((View) obj);
            }
        };

        /* JADX INFO: renamed from: n */
        public static final FrameLayout.LayoutParams f21291n = new FrameLayout.LayoutParams(-2, -2);

        /* JADX INFO: renamed from: a */
        public final Activity f21292a;

        /* JADX INFO: renamed from: b */
        public final View f21293b;

        /* JADX INFO: renamed from: c */
        public String f21294c = (String) f21287j.call();

        /* JADX INFO: renamed from: d */
        public String f21295d = "default";

        /* JADX INFO: renamed from: e */
        public int f21296e = 3000;

        /* JADX INFO: renamed from: f */
        public w9j<View, Animator> f21297f = f21288k;

        /* JADX INFO: renamed from: g */
        public w9j<View, Animator> f21298g = f21289l;

        /* JADX INFO: renamed from: h */
        public w9j<View, Animator> f21299h = f21290m;

        /* JADX INFO: renamed from: i */
        public ViewGroup.LayoutParams f21300i = f21291n;

        public C1220a(@NonNull Activity activity, @NonNull View view) {
            this.f21292a = activity;
            this.f21293b = view;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Animator m23097a(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Animator m23098b(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", -upf0.f21284k, 0.0f);
            objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ String m23099c() {
            return "" + System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ Animator m23100d(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "translationY", 0.0f, -upf0.f21284k));
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: m */
        public upf0 m23109m() {
            return new upf0(this);
        }
    }

    /* JADX INFO: renamed from: l.upf0$b */
    public static class C1221b extends PopupWindow {

        /* JADX INFO: renamed from: a */
        public final Animator f21301a;

        /* JADX INFO: renamed from: b */
        public final Animator f21302b;

        /* JADX INFO: renamed from: c */
        public final C1220a f21303c;

        public C1221b(@NonNull C1220a c1220a) {
            this.f21303c = c1220a;
            this.f21301a = c1220a.f21297f == null ? null : (Animator) c1220a.f21297f.call(c1220a.f21293b);
            this.f21302b = c1220a.f21298g != null ? (Animator) c1220a.f21298g.call(c1220a.f21293b) : null;
            if (c1220a.f21300i.width == -1) {
                setWidth(-1);
            } else {
                setWidth(-2);
            }
            setHeight(-2);
            setContentView(c1220a.f21293b);
        }

        /* JADX INFO: renamed from: c */
        public void m23112c(@Nullable Animator animator) {
            if (animator == null) {
                super.dismiss();
            } else {
                if (animator.isRunning()) {
                    return;
                }
                bt0.f(animator, new Runnable() { // from class: l.vpf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21716a.m23113d();
                    }
                });
                animator.start();
            }
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m23113d() {
            try {
                super.dismiss();
            } catch (IllegalArgumentException unused) {
            }
        }

        @Override // android.widget.PopupWindow
        public void dismiss() {
            m23112c(this.f21302b);
        }

        /* JADX INFO: renamed from: e */
        public void m23114e() {
            Window window;
            Animator animator = this.f21301a;
            if ((animator != null && animator.isRunning()) || (window = this.f21303c.f21292a.getWindow()) == null || window.getDecorView() == null || window.getDecorView().getWindowToken() == null) {
                return;
            }
            Animator animator2 = this.f21301a;
            if (animator2 != null) {
                animator2.start();
            }
            showAtLocation(window.getDecorView(), 49, 0, 0);
        }
    }

    public upf0(@NonNull C1220a c1220a) {
        this.f21285i = c1220a;
    }

    /* JADX INFO: renamed from: A */
    public int m23089A() {
        v9j v9jVar = ((aie0) this).d;
        boolean z = v9jVar == null || ((Boolean) v9jVar.call()).booleanValue();
        Activity activity = this.f21285i.f21292a;
        if (!z || activity.isFinishing()) {
            if (NullChecker.a(((fdb0) this).b)) {
                ((fdb0) this).b.call();
            }
            return 0;
        }
        final C1221b c1221b = new C1221b(this.f21285i);
        this.f21286j = c1221b;
        Objects.requireNonNull(c1221b);
        final Runnable runnable = new Runnable() { // from class: l.opf0
            @Override // java.lang.Runnable
            public final void run() {
                c1221b.dismiss();
            }
        };
        this.f21286j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.ppf0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f18827a.m23090F(runnable);
            }
        });
        this.f21286j.m23114e();
        if (NullChecker.a(((fdb0) this).a)) {
            ((fdb0) this).a.call();
        }
        e51.H(this.f21285i.f21292a, runnable, this.f21285i.f21296e);
        return this.f21285i.f21296e;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m23090F(Runnable runnable) {
        e51.J(runnable);
        if (NullChecker.a(((fdb0) this).b)) {
            ((fdb0) this).b.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m23091f(boolean z) {
        C1221b c1221b = this.f21286j;
        if (c1221b == null || !c1221b.isShowing()) {
            return;
        }
        C1221b c1221b2 = this.f21286j;
        if (z) {
            c1221b2.getContentView().setTranslationY(0.0f);
            this.f21286j.getContentView().setAlpha(1.0f);
        } else {
            c1221b2.getContentView().setTranslationY(-4000.0f);
            this.f21286j.getContentView().setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: j */
    public int m23092j() {
        return this.f21285i.f21292a.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public Act m23093m() {
        return this.f21285i.f21292a;
    }

    /* JADX INFO: renamed from: n */
    public void m23094n(boolean z) {
        C1221b c1221b = this.f21286j;
        if (c1221b != null && c1221b.isShowing()) {
            this.f21286j.dismiss();
            return;
        }
        f0m f0mVar = ((aie0) this).f;
        if (f0mVar != null) {
            f0mVar.a(this);
        }
    }

    /* JADX INFO: renamed from: o */
    public String m23095o() {
        return this.f21285i.f21295d;
    }

    /* JADX INFO: renamed from: p */
    public String m23096p() {
        return this.f21285i.f21294c;
    }
}
