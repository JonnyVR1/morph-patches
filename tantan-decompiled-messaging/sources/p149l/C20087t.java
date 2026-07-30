package p149l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: l.t */
/* JADX INFO: loaded from: classes9.dex */
public class C20087t {
    /* JADX INFO: renamed from: a */
    public static Animator m186802a(View view, long j) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        return bt0.m103753z(bt0.m103739l(view, bt0.f77162i, j, 400L, null, 0.8f, 1.0f), bt0.m103739l(view, View.ALPHA, j, 400L, null, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: b */
    public static Animator m186803b(View view, long j) {
        view.setPivotX(view.getWidth());
        view.setPivotY(view.getHeight());
        return bt0.m103753z(bt0.m103739l(view, bt0.f77162i, j, 400L, null, 0.8f, 1.0f), bt0.m103739l(view, View.ALPHA, j, 400L, null, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: c */
    public static void m186804c(Context context, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(context, pzb0.f151936a));
    }

    /* JADX INFO: renamed from: d */
    public static Animator m186805d(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -4.0f);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(ua60.m192732a(0.25f, 0.1f, 0.25f, 1.0f));
        objectAnimatorOfFloat.setDuration(400L);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: e */
    public static Animator m186806e(long j, View... viewArr) {
        Animator[] animatorArr = new Animator[viewArr.length];
        int i = 0;
        while (i < viewArr.length) {
            long j2 = j;
            animatorArr[i] = bt0.m103739l(viewArr[i], View.ALPHA, j2, 400L, null, 1.0f, 0.0f);
            i++;
            j = j2;
        }
        return bt0.m103753z(animatorArr);
    }
}
