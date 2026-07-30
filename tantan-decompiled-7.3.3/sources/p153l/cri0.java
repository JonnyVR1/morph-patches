package p153l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class cri0 {

    /* JADX INFO: renamed from: b */
    public static AnimatorSet f83331b;

    /* JADX INFO: renamed from: a */
    public static final Map<String, AnimatorSet> f83330a = new HashMap(2);

    /* JADX INFO: renamed from: c */
    public static boolean f83332c = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m112071a(TextView textView, CharSequence charSequence) {
        textView.setTranslationY(0.0f);
        textView.setAlpha(1.0f);
        textView.setText(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m112073c(TextView textView, CharSequence charSequence) {
        textView.setTranslationY(qa00.f156321h);
        textView.setText(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m112074d(x20 x20Var, View view) {
        x20Var.call();
        m112077g(view);
        f83332c = false;
        bnl0.m105524M(view, false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m112075e(View view, AnimatorSet animatorSet, x20 x20Var) {
        view.setPivotX(view.getMeasuredWidth());
        view.setPivotY(view.getMeasuredHeight() - qa00.f156323j);
        Objects.requireNonNull(x20Var);
        gt0.m132161g(animatorSet, new bri0(x20Var), new bri0(x20Var));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: f */
    public static AnimatorSet m112076f(String str, View view, float... fArr) {
        Map<String, AnimatorSet> map = f83330a;
        if (!map.containsKey(str)) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", fArr);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleY", fArr);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            map.put(str, animatorSet);
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: g */
    public static void m112077g(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: h */
    public static void m112078h(final View view, @NonNull final x20 x20Var) {
        if (f83332c) {
            return;
        }
        f83332c = true;
        bnl0.m105524M(view, true);
        AnimatorSet animatorSetM112076f = m112076f("in", view, 0.0f, 1.0f);
        view.setPivotX(50.0f);
        view.setPivotY(50.0f);
        gt0.m132160f(animatorSetM112076f, new Runnable() { // from class: l.yqi0
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                cri0.m112080j(view2, new x20() { // from class: l.zqi0
                    @Override // p153l.x20
                    public final void call() {
                        cri0.m112074d(x20Var, view2);
                    }
                });
            }
        });
        animatorSetM112076f.start();
    }

    /* JADX INFO: renamed from: i */
    public static void m112079i(final TextView textView, final CharSequence charSequence, int i) {
        if (NullChecker.m82486a(f83331b) && f83331b.isRunning()) {
            f83331b.cancel();
        }
        f83331b = new AnimatorSet();
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "translationY", -qa00.f156324k);
        long j = i / 2;
        objectAnimatorOfFloat.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(j);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        gt0.m132160f(animatorSet, new Runnable() { // from class: l.wqi0
            @Override // java.lang.Runnable
            public final void run() {
                cri0.m112073c(textView, charSequence);
            }
        });
        Runnable runnable = new Runnable() { // from class: l.xqi0
            @Override // java.lang.Runnable
            public final void run() {
                cri0.m112071a(textView, charSequence);
            }
        };
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView, "translationY", qa00.f156321h, 0.0f);
        objectAnimatorOfFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat3.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat4.setDuration(j);
        animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        f83331b.playSequentially(animatorSet, animatorSet2);
        f83331b.start();
        gt0.m132161g(f83331b, null, runnable);
    }

    /* JADX INFO: renamed from: j */
    public static void m112080j(final View view, final x20 x20Var) {
        final AnimatorSet animatorSetM112076f = m112076f("out", view, 1.0f, 0.0f);
        l51.m152888H(view.getContext(), new Runnable() { // from class: l.ari0
            @Override // java.lang.Runnable
            public final void run() {
                cri0.m112075e(view, animatorSetM112076f, x20Var);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: k */
    public static void m112081k() {
        if (NullChecker.m82486a(f83331b)) {
            if (f83331b.isRunning()) {
                f83331b.cancel();
            }
            f83331b = null;
        }
    }
}
