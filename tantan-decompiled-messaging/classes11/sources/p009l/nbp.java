package p009l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nbp {

    /* JADX INFO: renamed from: a */
    public VFrame f17388a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f17389b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f17390c;

    /* JADX INFO: renamed from: d */
    public View f17391d;

    /* JADX INFO: renamed from: l.nbp$a */
    public class C1046a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f17392a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f17393b;

        public C1046a(View view, Runnable runnable) {
            this.f17392a = view;
            this.f17393b = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            nbp.this.m18837k();
            nbp.this.m18838l(this.f17392a);
            if (NullChecker.a(this.f17393b)) {
                this.f17393b.run();
            }
            nbp.this.f17390c = null;
        }
    }

    public nbp(Context context, VFrame vFrame) {
        this.f17388a = vFrame;
        m18832f(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m18830d() {
        if (NullChecker.a(this.f17389b.getParent())) {
            ((ViewGroup) this.f17389b.getParent()).removeView(this.f17389b);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(200.0f), t100.d(200.0f));
        layoutParams.gravity = 17;
        this.f17388a.addView(this.f17389b, layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public final AnimatorSet m18831e(View view, Runnable runnable, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 0.94f);
        objectAnimatorOfFloat.setDuration(350L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.94f, 1.0f);
        objectAnimatorOfFloat2.setDuration(150L);
        objectAnimatorOfFloat2.setStartDelay(350L);
        objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator(1.2f));
        if (z) {
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -view.getHeight());
            objectAnimatorOfFloat3.setDuration(400L);
            objectAnimatorOfFloat3.setStartDelay(450L);
            objectAnimatorOfFloat3.setInterpolator(new AccelerateInterpolator(1.2f));
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat4.setDuration(300L);
            objectAnimatorOfFloat4.setStartDelay(550L);
            objectAnimatorOfFloat4.setInterpolator(new AccelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        } else {
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        animatorSet.addListener(new C1046a(view, runnable));
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    public final void m18832f(Context context) {
        this.f17389b = new SVGAnimationView(context);
    }

    /* JADX INFO: renamed from: g */
    public boolean m18833g() {
        return NullChecker.a(this.f17390c) && this.f17390c.isRunning();
    }

    /* JADX INFO: renamed from: h */
    public final void m18834h(View view, Runnable runnable, boolean z) {
        if (m18833g()) {
            if (NullChecker.a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        this.f17391d = view;
        m18830d();
        mgh0.m18465s();
        m18836j();
        AnimatorSet animatorSetM18831e = m18831e(view, runnable, z);
        this.f17390c = animatorSetM18831e;
        animatorSetM18831e.start();
    }

    /* JADX INFO: renamed from: i */
    public void m18835i(View view, Runnable runnable) {
        m18834h(view, runnable, false);
    }

    /* JADX INFO: renamed from: j */
    public final void m18836j() {
        if (NullChecker.a(this.f17389b)) {
            SVGALoader.with(this.f17389b.getContext()).from("https://fe-static.tancdn.com/v1/raw/56792917-eaab-4d90-9ded-39983fdb6d2f.svga").into(this.f17389b);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m18837k() {
        if (NullChecker.a(this.f17389b) && NullChecker.a(this.f17389b.getParent())) {
            ((ViewGroup) this.f17389b.getParent()).removeView(this.f17389b);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m18838l(View view) {
        if (NullChecker.a(view)) {
            view.setScaleY(1.0f);
            view.setTranslationY(0.0f);
            view.setAlpha(1.0f);
        }
    }
}
