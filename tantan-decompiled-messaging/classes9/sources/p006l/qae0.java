package p006l;

import android.animation.Animator;
import android.view.View;
import com.p1.mobile.android.app.Act;
import l.bt0;
import l.e30;
import l.e51;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qae0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21999a(final View view, final View view2, final View view3) {
        xdl0.M(view, true);
        xdl0.M(view2, true);
        xdl0.Q0(view, new e30() { // from class: l.oae0
            public final void call(Object obj) {
                qae0.m22001c(view, view2, view3, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m22001c(View view, View view2, final View view3, int[] iArr) {
        float f = xdl0.i0(view).c / 2;
        Animator animatorZ = bt0.z(new Animator[]{bt0.q(view, "translationX", new float[]{0.0f, f}), bt0.q(view2, "translationX", new float[]{0.0f, f}), bt0.q(view, "alpha", new float[]{0.0f, 1.0f}), bt0.q(view2, "alpha", new float[]{0.0f, 1.0f})});
        animatorZ.setDuration(500L);
        Animator animatorZ2 = bt0.z(new Animator[]{bt0.q(view, "alpha", new float[]{1.0f, 0.0f}), bt0.q(view2, "alpha", new float[]{1.0f, 0.0f})});
        animatorZ2.setStartDelay(500L);
        animatorZ2.setDuration(500L);
        bt0.f(bt0.s(new Animator[]{animatorZ, animatorZ2}), new Runnable() { // from class: l.pae0
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.M(view3, false);
            }
        }).start();
    }

    /* JADX INFO: renamed from: d */
    public static void m22002d(Act act, final View view, final View view2, final View view3) {
        e51.H(act, new Runnable() { // from class: l.nae0
            @Override // java.lang.Runnable
            public final void run() {
                qae0.m21999a(view, view2, view3);
            }
        }, 500L);
    }
}
