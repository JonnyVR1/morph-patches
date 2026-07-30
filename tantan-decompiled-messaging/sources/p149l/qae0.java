package p149l;

import android.animation.Animator;
import android.view.View;
import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes9.dex */
public class qae0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m173729a(final View view, final View view2, final View view3) {
        xdl0.m208344M(view, true);
        xdl0.m208344M(view2, true);
        xdl0.m208353Q0(view, new e30() { // from class: l.oae0
            @Override // p149l.e30
            public final void call(Object obj) {
                qae0.m173731c(view, view2, view3, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m173731c(View view, View view2, final View view3, int[] iArr) {
        float f = xdl0.m208380i0(view).f192420c / 2;
        Animator animatorM103753z = bt0.m103753z(bt0.m103744q(view, "translationX", 0.0f, f), bt0.m103744q(view2, "translationX", 0.0f, f), bt0.m103744q(view, "alpha", 0.0f, 1.0f), bt0.m103744q(view2, "alpha", 0.0f, 1.0f));
        animatorM103753z.setDuration(500L);
        Animator animatorM103753z2 = bt0.m103753z(bt0.m103744q(view, "alpha", 1.0f, 0.0f), bt0.m103744q(view2, "alpha", 1.0f, 0.0f));
        animatorM103753z2.setStartDelay(500L);
        animatorM103753z2.setDuration(500L);
        bt0.m103733f(bt0.m103746s(animatorM103753z, animatorM103753z2), new Runnable() { // from class: l.pae0
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.m208344M(view3, false);
            }
        }).start();
    }

    /* JADX INFO: renamed from: d */
    public static void m173732d(Act act, final View view, final View view2, final View view3) {
        e51.m114743H(act, new Runnable() { // from class: l.nae0
            @Override // java.lang.Runnable
            public final void run() {
                qae0.m173729a(view, view2, view3);
            }
        }, 500L);
    }
}
