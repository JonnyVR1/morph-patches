package p009l;

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
import l.bt0;
import l.d30;
import l.e51;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cii0 {

    /* JADX INFO: renamed from: b */
    public static AnimatorSet f10615b;

    /* JADX INFO: renamed from: a */
    public static final Map<String, AnimatorSet> f10614a = new HashMap(2);

    /* JADX INFO: renamed from: c */
    public static boolean f10616c = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12597a(TextView textView, CharSequence charSequence) {
        textView.setTranslationY(0.0f);
        textView.setAlpha(1.0f);
        textView.setText(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12599c(TextView textView, CharSequence charSequence) {
        textView.setTranslationY(t100.h);
        textView.setText(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m12600d(d30 d30Var, View view) {
        d30Var.call();
        m12603g(view);
        f10616c = false;
        xdl0.M(view, false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m12601e(View view, AnimatorSet animatorSet, d30 d30Var) {
        view.setPivotX(view.getMeasuredWidth());
        view.setPivotY(view.getMeasuredHeight() - t100.j);
        Objects.requireNonNull(d30Var);
        bt0.g(animatorSet, new bii0(d30Var), new bii0(d30Var));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: f */
    public static AnimatorSet m12602f(String str, View view, float... fArr) {
        Map<String, AnimatorSet> map = f10614a;
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
    public static void m12603g(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: h */
    public static void m12604h(final View view, @NonNull final d30 d30Var) {
        if (f10616c) {
            return;
        }
        f10616c = true;
        xdl0.M(view, true);
        AnimatorSet animatorSetM12602f = m12602f("in", view, 0.0f, 1.0f);
        view.setPivotX(50.0f);
        view.setPivotY(50.0f);
        bt0.f(animatorSetM12602f, new Runnable() { // from class: l.yhi0
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                cii0.m12606j(view2, new d30() { // from class: l.zhi0
                    public final void call() {
                        cii0.m12600d(d30Var, view2);
                    }
                });
            }
        });
        animatorSetM12602f.start();
    }

    /* JADX INFO: renamed from: i */
    public static void m12605i(final TextView textView, final CharSequence charSequence, int i) {
        if (NullChecker.a(f10615b) && f10615b.isRunning()) {
            f10615b.cancel();
        }
        f10615b = new AnimatorSet();
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "translationY", -t100.k);
        long j = i / 2;
        objectAnimatorOfFloat.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(j);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        bt0.f(animatorSet, new Runnable() { // from class: l.whi0
            @Override // java.lang.Runnable
            public final void run() {
                cii0.m12599c(textView, charSequence);
            }
        });
        Runnable runnable = new Runnable() { // from class: l.xhi0
            @Override // java.lang.Runnable
            public final void run() {
                cii0.m12597a(textView, charSequence);
            }
        };
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView, "translationY", t100.h, 0.0f);
        objectAnimatorOfFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat3.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat4.setDuration(j);
        animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        f10615b.playSequentially(animatorSet, animatorSet2);
        f10615b.start();
        bt0.g(f10615b, (Runnable) null, runnable);
    }

    /* JADX INFO: renamed from: j */
    public static void m12606j(final View view, final d30 d30Var) {
        final AnimatorSet animatorSetM12602f = m12602f("out", view, 1.0f, 0.0f);
        e51.H(view.getContext(), new Runnable() { // from class: l.aii0
            @Override // java.lang.Runnable
            public final void run() {
                cii0.m12601e(view, animatorSetM12602f, d30Var);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: k */
    public static void m12607k() {
        if (NullChecker.a(f10615b)) {
            if (f10615b.isRunning()) {
                f10615b.cancel();
            }
            f10615b = null;
        }
    }
}
