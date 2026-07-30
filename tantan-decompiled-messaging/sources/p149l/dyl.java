package p149l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface dyl {

    /* JADX INFO: renamed from: j0 */
    public static final w9j<View, Animator> f88405j0 = new w9j() { // from class: l.zxl
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return dyl.m114078e((View) obj);
        }
    };

    /* JADX INFO: renamed from: l0 */
    public static final w9j<View, Animator> f88406l0 = new w9j() { // from class: l.ayl
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return dyl.m114080h((View) obj);
        }
    };

    /* JADX INFO: renamed from: m0 */
    public static final w9j<View, Animator> f88407m0 = new w9j() { // from class: l.byl
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return dyl.m114077d((View) obj);
        }
    };

    /* JADX INFO: renamed from: n0 */
    public static final w9j<View, Animator> f88408n0 = new w9j() { // from class: l.cyl
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return dyl.m114079f((View) obj);
        }
    };

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Animator m114077d(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationX", view.getWidth() + t100.m186890d(8.0f), 0.0f);
        objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator(1.0f));
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ Animator m114078e(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Animator m114079f(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(view, "translationX", 0.0f, view.getWidth() + t100.m186890d(8.0f)));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ Animator m114080h(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Animator mo63829a(int i, @NonNull View view);

    @Nullable
    /* JADX INFO: renamed from: b */
    Animator mo63830b(int i, @NonNull View view);

    @Nullable
    /* JADX INFO: renamed from: g */
    List<View> mo63831g(int i);
}
