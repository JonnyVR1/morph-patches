package p153l;

import android.animation.Animator;
import android.view.View;
import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes12.dex */
public class vie0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m201334a(final View view, final View view2, final View view3) {
        bnl0.m105524M(view, true);
        bnl0.m105524M(view2, true);
        bnl0.m105533Q0(view, new y20() { // from class: l.tie0
            @Override // p153l.y20
            public final void call(Object obj) {
                vie0.m201336c(view, view2, view3, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m201336c(View view, View view2, final View view3, int[] iArr) {
        float f = bnl0.m105560i0(view).f77561c / 2;
        Animator animatorM132180z = gt0.m132180z(gt0.m132171q(view, "translationX", 0.0f, f), gt0.m132171q(view2, "translationX", 0.0f, f), gt0.m132171q(view, "alpha", 0.0f, 1.0f), gt0.m132171q(view2, "alpha", 0.0f, 1.0f));
        animatorM132180z.setDuration(500L);
        Animator animatorM132180z2 = gt0.m132180z(gt0.m132171q(view, "alpha", 1.0f, 0.0f), gt0.m132171q(view2, "alpha", 1.0f, 0.0f));
        animatorM132180z2.setStartDelay(500L);
        animatorM132180z2.setDuration(500L);
        gt0.m132160f(gt0.m132173s(animatorM132180z, animatorM132180z2), new Runnable() { // from class: l.uie0
            @Override // java.lang.Runnable
            public final void run() {
                bnl0.m105524M(view3, false);
            }
        }).start();
    }

    /* JADX INFO: renamed from: d */
    public static void m201337d(Act act, final View view, final View view2, final View view3) {
        l51.m152888H(act, new Runnable() { // from class: l.sie0
            @Override // java.lang.Runnable
            public final void run() {
                vie0.m201334a(view, view2, view3);
            }
        }, 500L);
    }
}
