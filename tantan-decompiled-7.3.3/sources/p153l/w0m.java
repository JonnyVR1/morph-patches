package p153l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface w0m {

    /* JADX INFO: renamed from: j0 */
    public static final qcj<View, Animator> f186613j0 = new qcj() { // from class: l.s0m
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return w0m.m204204e((View) obj);
        }
    };

    /* JADX INFO: renamed from: l0 */
    public static final qcj<View, Animator> f186614l0 = new qcj() { // from class: l.t0m
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return w0m.m204206h((View) obj);
        }
    };

    /* JADX INFO: renamed from: m0 */
    public static final qcj<View, Animator> f186615m0 = new qcj() { // from class: l.u0m
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return w0m.m204203d((View) obj);
        }
    };

    /* JADX INFO: renamed from: n0 */
    public static final qcj<View, Animator> f186616n0 = new qcj() { // from class: l.v0m
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return w0m.m204205f((View) obj);
        }
    };

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Animator m204203d(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationX", view.getWidth() + qa00.m175859d(8.0f), 0.0f);
        objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator(1.0f));
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ Animator m204204e(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Animator m204205f(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(view, "translationX", 0.0f, view.getWidth() + qa00.m175859d(8.0f)));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ Animator m204206h(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Animator mo65012a(int i, @NonNull View view);

    @Nullable
    /* JADX INFO: renamed from: b */
    Animator mo65013b(int i, @NonNull View view);

    @Nullable
    /* JADX INFO: renamed from: g */
    List<View> mo65014g(int i);
}
