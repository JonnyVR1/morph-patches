package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.ads.internal.overlay.zzs;

/* JADX INFO: loaded from: classes6.dex */
public final class shy0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzs f164661a;

    public shy0(zzs zzsVar) {
        this.f164661a = zzsVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m184307a(boolean z) {
        this.f164661a.setEnabled(z);
        this.f164661a.f9707a.setEnabled(z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        m184307a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m184307a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        m184307a(false);
    }
}
