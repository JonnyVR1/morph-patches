package p006l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import l.bt0;
import l.ua60;

/* JADX INFO: renamed from: l.t */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1294t {
    /* JADX INFO: renamed from: a */
    public static Animator m24404a(View view, long j) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        return bt0.z(new Animator[]{bt0.l(view, bt0.i, j, 400L, (Interpolator) null, new float[]{0.8f, 1.0f}), bt0.l(view, View.ALPHA, j, 400L, (Interpolator) null, new float[]{0.0f, 1.0f})});
    }

    /* JADX INFO: renamed from: b */
    public static Animator m24405b(View view, long j) {
        view.setPivotX(view.getWidth());
        view.setPivotY(view.getHeight());
        return bt0.z(new Animator[]{bt0.l(view, bt0.i, j, 400L, (Interpolator) null, new float[]{0.8f, 1.0f}), bt0.l(view, View.ALPHA, j, 400L, (Interpolator) null, new float[]{0.0f, 1.0f})});
    }

    /* JADX INFO: renamed from: c */
    public static void m24406c(Context context, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(context, pzb0.f19461a));
    }

    /* JADX INFO: renamed from: d */
    public static Animator m24407d(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -4.0f);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(ua60.a(0.25f, 0.1f, 0.25f, 1.0f));
        objectAnimatorOfFloat.setDuration(400L);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: e */
    public static Animator m24408e(long j, View... viewArr) {
        Animator[] animatorArr = new Animator[viewArr.length];
        int i = 0;
        while (i < viewArr.length) {
            long j2 = j;
            animatorArr[i] = bt0.l(viewArr[i], View.ALPHA, j2, 400L, (Interpolator) null, new float[]{1.0f, 0.0f});
            i++;
            j = j2;
        }
        return bt0.z(animatorArr);
    }
}
