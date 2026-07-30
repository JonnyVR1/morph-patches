package p149l;

import android.animation.Animator;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverMiddleCardView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o45 extends szd {

    /* JADX INFO: renamed from: j */
    public VText f141738j;

    /* JADX INFO: renamed from: k */
    public CityCoverMiddleCardView f141739k;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f141740l;

    /* JADX INFO: renamed from: m */
    public final String f141741m;

    /* JADX INFO: renamed from: n */
    public final Act f141742n;

    /* JADX INFO: renamed from: l.o45$b */
    public class RunnableC18836b implements Runnable {
        public RunnableC18836b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SVGALoader.with(o45.this.getContext()).from("https://auto.tancdn.com/v1/raw/0b683e4e-167d-4efe-970a-e08af1ddbe5314.svga").autoPlay(true).repeatCount(1).into(o45.this.f141739k.f29024o);
        }
    }

    /* JADX INFO: renamed from: l.o45$c */
    public class RunnableC18837c implements Runnable {
        public RunnableC18837c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o45.this.dismiss();
        }
    }

    public o45(Act act, String str) {
        super(act, false, v7c0.f180370q);
        this.f141741m = str;
        this.f141742n = act;
    }

    /* JADX INFO: renamed from: E */
    public View m162547E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p45.m167364b(this, layoutInflater, viewGroup);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m162547E(this.f141742n.getLayoutInflater(), null));
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        this.f141738j.setTypeface(eqh0.m117752c(3), 1);
        zvf0.m220402x("e_tag_confirmation", "p_love_signal_guide_tag");
        VText vText = this.f141738j;
        Property property = View.ALPHA;
        bt0.m103739l(vText, property, 0L, 1000L, new LinearInterpolator(), 0.0f, 1.0f).start();
        wqf0 wqf0Var = new wqf0(0.8f);
        Animator animatorM103739l = bt0.m103739l(this.f141739k.f29011b, property, 0L, 1000L, new LinearInterpolator(), 0.0f, 1.0f);
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(this.f141739k.f29011b, View.SCALE_X, 0L, 2000L, wqf0Var, 0.3f, 1.0f), bt0.m103739l(this.f141739k.f29011b, View.SCALE_Y, 0L, 2000L, wqf0Var, 0.3f, 1.0f));
        animatorM103753z.addListener(new C18835a());
        animatorM103753z.start();
        animatorM103739l.start();
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/cec5be75-929f-4965-9aef-85b25bb9c82114.svga").autoPlay(true).repeatCount(1).into(this.f141740l);
        this.f141739k.postDelayed(new RunnableC18836b(), 500L);
        this.f141739k.m45217f();
        e51.m114743H(this.f141742n, new RunnableC18837c(), 6000L);
    }

    /* JADX INFO: renamed from: l.o45$a */
    public class C18835a implements Animator.AnimatorListener {
        public C18835a() {
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
