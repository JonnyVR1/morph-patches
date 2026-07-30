package p149l;

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
public class cii0 {

    /* JADX INFO: renamed from: b */
    public static AnimatorSet f81090b;

    /* JADX INFO: renamed from: a */
    public static final Map<String, AnimatorSet> f81089a = new HashMap(2);

    /* JADX INFO: renamed from: c */
    public static boolean f81091c = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m107071a(TextView textView, CharSequence charSequence) {
        textView.setTranslationY(0.0f);
        textView.setAlpha(1.0f);
        textView.setText(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m107073c(TextView textView, CharSequence charSequence) {
        textView.setTranslationY(t100.f167259h);
        textView.setText(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m107074d(d30 d30Var, View view) {
        d30Var.call();
        m107077g(view);
        f81091c = false;
        xdl0.m208344M(view, false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m107075e(View view, AnimatorSet animatorSet, d30 d30Var) {
        view.setPivotX(view.getMeasuredWidth());
        view.setPivotY(view.getMeasuredHeight() - t100.f167261j);
        Objects.requireNonNull(d30Var);
        bt0.m103734g(animatorSet, new bii0(d30Var), new bii0(d30Var));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: f */
    public static AnimatorSet m107076f(String str, View view, float... fArr) {
        Map<String, AnimatorSet> map = f81089a;
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
    public static void m107077g(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: h */
    public static void m107078h(final View view, @NonNull final d30 d30Var) {
        if (f81091c) {
            return;
        }
        f81091c = true;
        xdl0.m208344M(view, true);
        AnimatorSet animatorSetM107076f = m107076f("in", view, 0.0f, 1.0f);
        view.setPivotX(50.0f);
        view.setPivotY(50.0f);
        bt0.m103733f(animatorSetM107076f, new Runnable() { // from class: l.yhi0
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                cii0.m107080j(view2, new d30() { // from class: l.zhi0
                    @Override // p149l.d30
                    public final void call() {
                        cii0.m107074d(d30Var, view2);
                    }
                });
            }
        });
        animatorSetM107076f.start();
    }

    /* JADX INFO: renamed from: i */
    public static void m107079i(final TextView textView, final CharSequence charSequence, int i) {
        if (NullChecker.m81303a(f81090b) && f81090b.isRunning()) {
            f81090b.cancel();
        }
        f81090b = new AnimatorSet();
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "translationY", -t100.f167262k);
        long j = i / 2;
        objectAnimatorOfFloat.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(j);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        bt0.m103733f(animatorSet, new Runnable() { // from class: l.whi0
            @Override // java.lang.Runnable
            public final void run() {
                cii0.m107073c(textView, charSequence);
            }
        });
        Runnable runnable = new Runnable() { // from class: l.xhi0
            @Override // java.lang.Runnable
            public final void run() {
                cii0.m107071a(textView, charSequence);
            }
        };
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView, "translationY", t100.f167259h, 0.0f);
        objectAnimatorOfFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat3.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat4.setDuration(j);
        animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        f81090b.playSequentially(animatorSet, animatorSet2);
        f81090b.start();
        bt0.m103734g(f81090b, null, runnable);
    }

    /* JADX INFO: renamed from: j */
    public static void m107080j(final View view, final d30 d30Var) {
        final AnimatorSet animatorSetM107076f = m107076f("out", view, 1.0f, 0.0f);
        e51.m114743H(view.getContext(), new Runnable() { // from class: l.aii0
            @Override // java.lang.Runnable
            public final void run() {
                cii0.m107075e(view, animatorSetM107076f, d30Var);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: k */
    public static void m107081k() {
        if (NullChecker.m81303a(f81090b)) {
            if (f81090b.isRunning()) {
                f81090b.cancel();
            }
            f81090b = null;
        }
    }
}
