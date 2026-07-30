package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.ads.internal.overlay.zzs;

/* JADX INFO: loaded from: classes6.dex */
public final class yqy0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzs f201265a;

    public yqy0(zzs zzsVar) {
        this.f201265a = zzsVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m217145a(boolean z) {
        this.f201265a.setEnabled(z);
        this.f201265a.f9744a.setEnabled(z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        m217145a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m217145a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        m217145a(false);
    }
}
