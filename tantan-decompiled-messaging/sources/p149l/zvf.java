package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class zvf extends r5m0 {

    /* JADX INFO: renamed from: l.zvf$a */
    public class C21784a extends u8j0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f204995a;

        public C21784a(View view) {
            this.f204995a = view;
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: c */
        public void mo95445c(@NonNull u7j0 u7j0Var) {
            del0.m111274g(this.f204995a, 1.0f);
            del0.m111268a(this.f204995a);
            u7j0Var.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.zvf$b */
    public static class C21785b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final View f204997a;

        /* JADX INFO: renamed from: b */
        public boolean f204998b = false;

        public C21785b(View view) {
            this.f204997a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            del0.m111274g(this.f204997a, 1.0f);
            if (this.f204998b) {
                this.f204997a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (gbl0.m125167L(this.f204997a) && this.f204997a.getLayerType() == 0) {
                this.f204998b = true;
                this.f204997a.setLayerType(2, null);
            }
        }
    }

    public zvf(int i) {
        m177952f(i);
    }

    /* JADX INFO: renamed from: k */
    public static float m220366k(g9j0 g9j0Var, float f) {
        Float f2;
        return (g9j0Var == null || (f2 = (Float) g9j0Var.f101570a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // p149l.r5m0
    /* JADX INFO: renamed from: b */
    public Animator mo177948b(ViewGroup viewGroup, View view, g9j0 g9j0Var, g9j0 g9j0Var2) {
        float fM220366k = m220366k(g9j0Var, 0.0f);
        return m220367j(view, fM220366k != 1.0f ? fM220366k : 0.0f, 1.0f);
    }

    @Override // p149l.r5m0, p149l.u7j0
    public void captureStartValues(@NonNull g9j0 g9j0Var) {
        super.captureStartValues(g9j0Var);
        g9j0Var.f101570a.put("android:fade:transitionAlpha", Float.valueOf(del0.m111270c(g9j0Var.f101571b)));
    }

    @Override // p149l.r5m0
    /* JADX INFO: renamed from: d */
    public Animator mo177950d(ViewGroup viewGroup, View view, g9j0 g9j0Var, g9j0 g9j0Var2) {
        del0.m111272e(view);
        return m220367j(view, m220366k(g9j0Var, 1.0f), 0.0f);
    }

    /* JADX INFO: renamed from: j */
    public final Animator m220367j(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        del0.m111274g(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, del0.f85806b, f2);
        objectAnimatorOfFloat.addListener(new C21785b(view));
        addListener(new C21784a(view));
        return objectAnimatorOfFloat;
    }

    public zvf() {
    }
}
