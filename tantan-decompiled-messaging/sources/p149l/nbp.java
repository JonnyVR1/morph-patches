package p149l;

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
import p147v.VFrame;

/* JADX INFO: loaded from: classes11.dex */
public class nbp {

    /* JADX INFO: renamed from: a */
    public VFrame f138051a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f138052b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f138053c;

    /* JADX INFO: renamed from: d */
    public View f138054d;

    /* JADX INFO: renamed from: l.nbp$a */
    public class C18666a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f138055a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f138056b;

        public C18666a(View view, Runnable runnable) {
            this.f138055a = view;
            this.f138056b = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            nbp.this.m158828k();
            nbp.this.m158829l(this.f138055a);
            if (NullChecker.m81303a(this.f138056b)) {
                this.f138056b.run();
            }
            nbp.this.f138053c = null;
        }
    }

    public nbp(Context context, VFrame vFrame) {
        this.f138051a = vFrame;
        m158823f(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m158821d() {
        if (NullChecker.m81303a(this.f138052b.getParent())) {
            ((ViewGroup) this.f138052b.getParent()).removeView(this.f138052b);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(200.0f), t100.m186890d(200.0f));
        layoutParams.gravity = 17;
        this.f138051a.addView(this.f138052b, layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public final AnimatorSet m158822e(View view, Runnable runnable, boolean z) {
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
        animatorSet.addListener(new C18666a(view, runnable));
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    public final void m158823f(Context context) {
        this.f138052b = new SVGAnimationView(context);
    }

    /* JADX INFO: renamed from: g */
    public boolean m158824g() {
        return NullChecker.m81303a(this.f138053c) && this.f138053c.isRunning();
    }

    /* JADX INFO: renamed from: h */
    public final void m158825h(View view, Runnable runnable, boolean z) {
        if (m158824g()) {
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        this.f138054d = view;
        m158821d();
        mgh0.m154563s();
        m158827j();
        AnimatorSet animatorSetM158822e = m158822e(view, runnable, z);
        this.f138053c = animatorSetM158822e;
        animatorSetM158822e.start();
    }

    /* JADX INFO: renamed from: i */
    public void m158826i(View view, Runnable runnable) {
        m158825h(view, runnable, false);
    }

    /* JADX INFO: renamed from: j */
    public final void m158827j() {
        if (NullChecker.m81303a(this.f138052b)) {
            SVGALoader.with(this.f138052b.getContext()).from("https://fe-static.tancdn.com/v1/raw/56792917-eaab-4d90-9ded-39983fdb6d2f.svga").into(this.f138052b);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m158828k() {
        if (NullChecker.m81303a(this.f138052b) && NullChecker.m81303a(this.f138052b.getParent())) {
            ((ViewGroup) this.f138052b.getParent()).removeView(this.f138052b);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m158829l(View view) {
        if (NullChecker.m81303a(view)) {
            view.setScaleY(1.0f);
            view.setTranslationY(0.0f);
            view.setAlpha(1.0f);
        }
    }
}
