package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class upf0 extends aie0 {

    /* JADX INFO: renamed from: k */
    public static final int f177596k = t100.m186890d(92.0f);

    /* JADX INFO: renamed from: i */
    public final C20477a f177597i;

    /* JADX INFO: renamed from: j */
    public C20478b f177598j;

    /* JADX INFO: renamed from: l.upf0$a */
    public static class C20477a {

        /* JADX INFO: renamed from: j */
        public static final v9j<String> f177599j = new v9j() { // from class: l.qpf0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return upf0.C20477a.m194860c();
            }
        };

        /* JADX INFO: renamed from: k */
        public static final w9j<View, Animator> f177600k = new w9j() { // from class: l.rpf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return upf0.C20477a.m194859b((View) obj);
            }
        };

        /* JADX INFO: renamed from: l */
        public static final w9j<View, Animator> f177601l = new w9j() { // from class: l.spf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return upf0.C20477a.m194858a((View) obj);
            }
        };

        /* JADX INFO: renamed from: m */
        public static final w9j<View, Animator> f177602m = new w9j() { // from class: l.tpf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return upf0.C20477a.m194861d((View) obj);
            }
        };

        /* JADX INFO: renamed from: n */
        public static final FrameLayout.LayoutParams f177603n = new FrameLayout.LayoutParams(-2, -2);

        /* JADX INFO: renamed from: a */
        public final Activity f177604a;

        /* JADX INFO: renamed from: b */
        public final View f177605b;

        /* JADX INFO: renamed from: c */
        public String f177606c = f177599j.call();

        /* JADX INFO: renamed from: d */
        public String f177607d = "default";

        /* JADX INFO: renamed from: e */
        public int f177608e = 3000;

        /* JADX INFO: renamed from: f */
        public w9j<View, Animator> f177609f = f177600k;

        /* JADX INFO: renamed from: g */
        public w9j<View, Animator> f177610g = f177601l;

        /* JADX INFO: renamed from: h */
        public w9j<View, Animator> f177611h = f177602m;

        /* JADX INFO: renamed from: i */
        public ViewGroup.LayoutParams f177612i = f177603n;

        public C20477a(@NonNull Activity activity, @NonNull View view) {
            this.f177604a = activity;
            this.f177605b = view;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Animator m194858a(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Animator m194859b(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", -upf0.f177596k, 0.0f);
            objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ String m194860c() {
            return "" + System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ Animator m194861d(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "translationY", 0.0f, -upf0.f177596k));
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: m */
        public upf0 m194870m() {
            return new upf0(this);
        }
    }

    /* JADX INFO: renamed from: l.upf0$b */
    public static class C20478b extends PopupWindow {

        /* JADX INFO: renamed from: a */
        public final Animator f177613a;

        /* JADX INFO: renamed from: b */
        public final Animator f177614b;

        /* JADX INFO: renamed from: c */
        public final C20477a f177615c;

        public C20478b(@NonNull C20477a c20477a) {
            this.f177615c = c20477a;
            this.f177613a = c20477a.f177609f == null ? null : (Animator) c20477a.f177609f.call(c20477a.f177605b);
            this.f177614b = c20477a.f177610g != null ? (Animator) c20477a.f177610g.call(c20477a.f177605b) : null;
            if (c20477a.f177612i.width == -1) {
                setWidth(-1);
            } else {
                setWidth(-2);
            }
            setHeight(-2);
            setContentView(c20477a.f177605b);
        }

        /* JADX INFO: renamed from: c */
        public void m194873c(@Nullable Animator animator) {
            if (animator == null) {
                super.dismiss();
            } else {
                if (animator.isRunning()) {
                    return;
                }
                bt0.m103733f(animator, new Runnable() { // from class: l.vpf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f182471a.m194874d();
                    }
                });
                animator.start();
            }
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m194874d() {
            try {
                super.dismiss();
            } catch (IllegalArgumentException unused) {
            }
        }

        @Override // android.widget.PopupWindow
        public void dismiss() {
            m194873c(this.f177614b);
        }

        /* JADX INFO: renamed from: e */
        public void m194875e() {
            Window window;
            Animator animator = this.f177613a;
            if ((animator != null && animator.isRunning()) || (window = this.f177615c.f177604a.getWindow()) == null || window.getDecorView() == null || window.getDecorView().getWindowToken() == null) {
                return;
            }
            Animator animator2 = this.f177613a;
            if (animator2 != null) {
                animator2.start();
            }
            showAtLocation(window.getDecorView(), 49, 0, 0);
        }
    }

    public upf0(@NonNull C20477a c20477a) {
        this.f177597i = c20477a;
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: A */
    public int mo21134A() {
        v9j<Boolean> v9jVar = this.f69975d;
        boolean z = v9jVar == null || v9jVar.call().booleanValue();
        Activity activity = this.f177597i.f177604a;
        if (!z || activity.isFinishing()) {
            if (NullChecker.m81303a(this.f97025b)) {
                this.f97025b.call();
            }
            return 0;
        }
        final C20478b c20478b = new C20478b(this.f177597i);
        this.f177598j = c20478b;
        Objects.requireNonNull(c20478b);
        final Runnable runnable = new Runnable() { // from class: l.opf0
            @Override // java.lang.Runnable
            public final void run() {
                c20478b.dismiss();
            }
        };
        this.f177598j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.ppf0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f150644a.m194857F(runnable);
            }
        });
        this.f177598j.m194875e();
        if (NullChecker.m81303a(this.f97024a)) {
            this.f97024a.call();
        }
        e51.m114743H(this.f177597i.f177604a, runnable, this.f177597i.f177608e);
        return this.f177597i.f177608e;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m194857F(Runnable runnable) {
        e51.m114745J(runnable);
        if (NullChecker.m81303a(this.f97025b)) {
            this.f97025b.call();
        }
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
        C20478b c20478b = this.f177598j;
        if (c20478b == null || !c20478b.isShowing()) {
            return;
        }
        C20478b c20478b2 = this.f177598j;
        if (z) {
            c20478b2.getContentView().setTranslationY(0.0f);
            this.f177598j.getContentView().setAlpha(1.0f);
        } else {
            c20478b2.getContentView().setTranslationY(-4000.0f);
            this.f177598j.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo21138j() {
        return this.f177597i.f177604a.hashCode();
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return (Act) this.f177597i.f177604a;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        C20478b c20478b = this.f177598j;
        if (c20478b != null && c20478b.isShowing()) {
            this.f177598j.dismiss();
            return;
        }
        f0m f0mVar = this.f69977f;
        if (f0mVar != null) {
            f0mVar.mo21109a(this);
        }
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: o */
    public String mo21140o() {
        return this.f177597i.f177607d;
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return this.f177597i.f177606c;
    }
}
