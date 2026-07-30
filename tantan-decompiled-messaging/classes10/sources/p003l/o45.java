package p003l;

import android.animation.Animator;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverMiddleCardView;
import com.p1.mobile.android.app.Act;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.bt0;
import l.e51;
import l.eqh0;
import l.szd;
import l.v7c0;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o45 extends szd {

    /* JADX INFO: renamed from: j */
    public VText f6588j;

    /* JADX INFO: renamed from: k */
    public CityCoverMiddleCardView f6589k;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f6590l;

    /* JADX INFO: renamed from: m */
    public final String f6591m;

    /* JADX INFO: renamed from: n */
    public final Act f6592n;

    /* JADX INFO: renamed from: l.o45$b */
    public class RunnableC3388b implements Runnable {
        public RunnableC3388b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SVGALoader.with(o45.this.getContext()).from("https://auto.tancdn.com/v1/raw/0b683e4e-167d-4efe-970a-e08af1ddbe5314.svga").autoPlay(true).repeatCount(1).into(o45.this.f6589k.f1418o);
        }
    }

    /* JADX INFO: renamed from: l.o45$c */
    public class RunnableC3389c implements Runnable {
        public RunnableC3389c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o45.this.dismiss();
        }
    }

    public o45(Act act, String str) {
        super(act, false, v7c0.q);
        this.f6591m = str;
        this.f6592n = act;
    }

    /* JADX INFO: renamed from: E */
    public View m8395E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p45.m8689b(this, layoutInflater, viewGroup);
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        setContentView(m8395E(this.f6592n.getLayoutInflater(), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super.show();
        this.f6588j.setTypeface(eqh0.c(3), 1);
        zvf0.x("e_tag_confirmation", "p_love_signal_guide_tag");
        VText vText = this.f6588j;
        Property property = View.ALPHA;
        bt0.l(vText, property, 0L, 1000L, new LinearInterpolator(), new float[]{0.0f, 1.0f}).start();
        wqf0 wqf0Var = new wqf0(0.8f);
        Animator animatorL = bt0.l(this.f6589k.f1405b, property, 0L, 1000L, new LinearInterpolator(), new float[]{0.0f, 1.0f});
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(this.f6589k.f1405b, View.SCALE_X, 0L, 2000L, wqf0Var, new float[]{0.3f, 1.0f}), bt0.l(this.f6589k.f1405b, View.SCALE_Y, 0L, 2000L, wqf0Var, new float[]{0.3f, 1.0f})});
        animatorZ.addListener(new C3387a());
        animatorZ.start();
        animatorL.start();
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/cec5be75-929f-4965-9aef-85b25bb9c82114.svga").autoPlay(true).repeatCount(1).into(this.f6590l);
        this.f6589k.postDelayed(new RunnableC3388b(), 500L);
        this.f6589k.m2534f();
        e51.H(this.f6592n, new RunnableC3389c(), 6000L);
    }

    /* JADX INFO: renamed from: l.o45$a */
    public class C3387a implements Animator.AnimatorListener {
        public C3387a() {
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
