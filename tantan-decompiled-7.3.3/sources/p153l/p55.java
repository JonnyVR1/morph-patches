package p153l;

import android.animation.Animator;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverMiddleCardView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class p55 extends g1e {

    /* JADX INFO: renamed from: j */
    public VText f150600j;

    /* JADX INFO: renamed from: k */
    public CityCoverMiddleCardView f150601k;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f150602l;

    /* JADX INFO: renamed from: m */
    public final String f150603m;

    /* JADX INFO: renamed from: n */
    public final Act f150604n;

    /* JADX INFO: renamed from: l.p55$b */
    public class RunnableC19298b implements Runnable {
        public RunnableC19298b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SVGALoader.with(p55.this.getContext()).from("https://auto.tancdn.com/v1/raw/0b683e4e-167d-4efe-970a-e08af1ddbe5314.svga").autoPlay(true).repeatCount(1).into(p55.this.f150601k.f29872o);
        }
    }

    /* JADX INFO: renamed from: l.p55$c */
    public class RunnableC19299c implements Runnable {
        public RunnableC19299c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p55.this.dismiss();
        }
    }

    public p55(Act act, String str) {
        super(act, false, agc0.f71131q);
        this.f150603m = str;
        this.f150604n = act;
    }

    /* JADX INFO: renamed from: E */
    public View m170593E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q55.m175292b(this, layoutInflater, viewGroup);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m170593E(this.f150604n.getLayoutInflater(), null));
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        this.f150600j.setTypeface(lyh0.m156283c(3), 1);
        i4g0.m138526x("e_tag_confirmation", "p_love_signal_guide_tag");
        VText vText = this.f150600j;
        Property property = View.ALPHA;
        gt0.m132166l(vText, property, 0L, 1000L, new LinearInterpolator(), 0.0f, 1.0f).start();
        fzf0 fzf0Var = new fzf0(0.8f);
        Animator animatorM132166l = gt0.m132166l(this.f150601k.f29859b, property, 0L, 1000L, new LinearInterpolator(), 0.0f, 1.0f);
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(this.f150601k.f29859b, View.SCALE_X, 0L, 2000L, fzf0Var, 0.3f, 1.0f), gt0.m132166l(this.f150601k.f29859b, View.SCALE_Y, 0L, 2000L, fzf0Var, 0.3f, 1.0f));
        animatorM132180z.addListener(new C19297a());
        animatorM132180z.start();
        animatorM132166l.start();
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/cec5be75-929f-4965-9aef-85b25bb9c82114.svga").autoPlay(true).repeatCount(1).into(this.f150602l);
        this.f150601k.postDelayed(new RunnableC19298b(), 500L);
        this.f150601k.m46400f();
        l51.m152888H(this.f150604n, new RunnableC19299c(), 6000L);
    }

    /* JADX INFO: renamed from: l.p55$a */
    public class C19297a implements Animator.AnimatorListener {
        public C19297a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }
}
