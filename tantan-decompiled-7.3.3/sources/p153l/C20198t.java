package p153l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: l.t */
/* JADX INFO: loaded from: classes9.dex */
public class C20198t {
    /* JADX INFO: renamed from: a */
    public static Animator m188689a(View view, long j) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        return gt0.m132180z(gt0.m132166l(view, gt0.f106354i, j, 400L, null, 0.8f, 1.0f), gt0.m132166l(view, View.ALPHA, j, 400L, null, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: b */
    public static Animator m188690b(View view, long j) {
        view.setPivotX(view.getWidth());
        view.setPivotY(view.getHeight());
        return gt0.m132180z(gt0.m132166l(view, gt0.f106354i, j, 400L, null, 0.8f, 1.0f), gt0.m132166l(view, View.ALPHA, j, 400L, null, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: c */
    public static void m188691c(Context context, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(context, v7c0.f182748a));
    }

    /* JADX INFO: renamed from: d */
    public static Animator m188692d(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -4.0f);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(zi60.m219724a(0.25f, 0.1f, 0.25f, 1.0f));
        objectAnimatorOfFloat.setDuration(400L);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: e */
    public static Animator m188693e(long j, View... viewArr) {
        Animator[] animatorArr = new Animator[viewArr.length];
        int i = 0;
        while (i < viewArr.length) {
            long j2 = j;
            animatorArr[i] = gt0.m132166l(viewArr[i], View.ALPHA, j2, 400L, null, 1.0f, 0.0f);
            i++;
            j = j2;
        }
        return gt0.m132180z(animatorArr);
    }
}
