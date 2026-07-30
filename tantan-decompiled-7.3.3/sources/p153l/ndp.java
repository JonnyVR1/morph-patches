package p153l;

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
import p151v.VFrame;

/* JADX INFO: loaded from: classes11.dex */
public class ndp {

    /* JADX INFO: renamed from: a */
    public VFrame f141515a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f141516b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f141517c;

    /* JADX INFO: renamed from: d */
    public View f141518d;

    /* JADX INFO: renamed from: l.ndp$a */
    public class C18859a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f141519a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f141520b;

        public C18859a(View view, Runnable runnable) {
            this.f141519a = view;
            this.f141520b = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ndp.this.m162728k();
            ndp.this.m162729l(this.f141519a);
            if (NullChecker.m82486a(this.f141520b)) {
                this.f141520b.run();
            }
            ndp.this.f141517c = null;
        }
    }

    public ndp(Context context, VFrame vFrame) {
        this.f141515a = vFrame;
        m162723f(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m162721d() {
        if (NullChecker.m82486a(this.f141516b.getParent())) {
            ((ViewGroup) this.f141516b.getParent()).removeView(this.f141516b);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(200.0f), qa00.m175859d(200.0f));
        layoutParams.gravity = 17;
        this.f141515a.addView(this.f141516b, layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public final AnimatorSet m162722e(View view, Runnable runnable, boolean z) {
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
        animatorSet.addListener(new C18859a(view, runnable));
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    public final void m162723f(Context context) {
        this.f141516b = new SVGAnimationView(context);
    }

    /* JADX INFO: renamed from: g */
    public boolean m162724g() {
        return NullChecker.m82486a(this.f141517c) && this.f141517c.isRunning();
    }

    /* JADX INFO: renamed from: h */
    public final void m162725h(View view, Runnable runnable, boolean z) {
        if (m162724g()) {
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        this.f141518d = view;
        m162721d();
        toh0.m192059s();
        m162727j();
        AnimatorSet animatorSetM162722e = m162722e(view, runnable, z);
        this.f141517c = animatorSetM162722e;
        animatorSetM162722e.start();
    }

    /* JADX INFO: renamed from: i */
    public void m162726i(View view, Runnable runnable) {
        m162725h(view, runnable, false);
    }

    /* JADX INFO: renamed from: j */
    public final void m162727j() {
        if (NullChecker.m82486a(this.f141516b)) {
            SVGALoader.with(this.f141516b.getContext()).from("https://fe-static.tancdn.com/v1/raw/56792917-eaab-4d90-9ded-39983fdb6d2f.svga").into(this.f141516b);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m162728k() {
        if (NullChecker.m82486a(this.f141516b) && NullChecker.m82486a(this.f141516b.getParent())) {
            ((ViewGroup) this.f141516b.getParent()).removeView(this.f141516b);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m162729l(View view) {
        if (NullChecker.m82486a(view)) {
            view.setScaleY(1.0f);
            view.setTranslationY(0.0f);
            view.setAlpha(1.0f);
        }
    }
}
