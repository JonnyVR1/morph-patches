package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class nxf extends vem0 {

    /* JADX INFO: renamed from: l.nxf$a */
    public class C18975a extends yhj0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f144117a;

        public C18975a(View view) {
            this.f144117a = view;
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: c */
        public void mo106211c(@NonNull ygj0 ygj0Var) {
            hnl0.m136153g(this.f144117a, 1.0f);
            hnl0.m136147a(this.f144117a);
            ygj0Var.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.nxf$b */
    public static class C18976b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final View f144119a;

        /* JADX INFO: renamed from: b */
        public boolean f144120b = false;

        public C18976b(View view) {
            this.f144119a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            hnl0.m136153g(this.f144119a, 1.0f);
            if (this.f144120b) {
                this.f144119a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (kkl0.m150130L(this.f144119a) && this.f144119a.getLayerType() == 0) {
                this.f144120b = true;
                this.f144119a.setLayerType(2, null);
            }
        }
    }

    public nxf(int i) {
        m201072f(i);
    }

    /* JADX INFO: renamed from: k */
    public static float m165113k(kij0 kij0Var, float f) {
        Float f2;
        return (kij0Var == null || (f2 = (Float) kij0Var.f127000a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // p153l.vem0
    /* JADX INFO: renamed from: b */
    public Animator mo165114b(ViewGroup viewGroup, View view, kij0 kij0Var, kij0 kij0Var2) {
        float fM165113k = m165113k(kij0Var, 0.0f);
        return m165116j(view, fM165113k != 1.0f ? fM165113k : 0.0f, 1.0f);
    }

    @Override // p153l.vem0, p153l.ygj0
    public void captureStartValues(@NonNull kij0 kij0Var) {
        super.captureStartValues(kij0Var);
        kij0Var.f127000a.put("android:fade:transitionAlpha", Float.valueOf(hnl0.m136149c(kij0Var.f127001b)));
    }

    @Override // p153l.vem0
    /* JADX INFO: renamed from: d */
    public Animator mo165115d(ViewGroup viewGroup, View view, kij0 kij0Var, kij0 kij0Var2) {
        hnl0.m136151e(view);
        return m165116j(view, m165113k(kij0Var, 1.0f), 0.0f);
    }

    /* JADX INFO: renamed from: j */
    public final Animator m165116j(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        hnl0.m136153g(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, hnl0.f110798b, f2);
        objectAnimatorOfFloat.addListener(new C18976b(view));
        addListener(new C18975a(view));
        return objectAnimatorOfFloat;
    }

    public nxf() {
    }
}
