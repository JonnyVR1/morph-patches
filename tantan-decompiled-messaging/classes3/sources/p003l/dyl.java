package p003l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface dyl {

    /* JADX INFO: renamed from: j0 */
    public static final w9j<View, Animator> f3168j0 = new w9j() { // from class: l.zxl
        @Override // p003l.w9j
        public final Object call(Object obj) {
            return dyl.m3770e((View) obj);
        }
    };

    /* JADX INFO: renamed from: l0 */
    public static final w9j<View, Animator> f3169l0 = new w9j() { // from class: l.ayl
        @Override // p003l.w9j
        public final Object call(Object obj) {
            return dyl.m3772h((View) obj);
        }
    };

    /* JADX INFO: renamed from: m0 */
    public static final w9j<View, Animator> f3170m0 = new w9j() { // from class: l.byl
        @Override // p003l.w9j
        public final Object call(Object obj) {
            return dyl.m3769d((View) obj);
        }
    };

    /* JADX INFO: renamed from: n0 */
    public static final w9j<View, Animator> f3171n0 = new w9j() { // from class: l.cyl
        @Override // p003l.w9j
        public final Object call(Object obj) {
            return dyl.m3771f((View) obj);
        }
    };

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Animator m3769d(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationX", view.getWidth() + t100.d(8.0f), 0.0f);
        objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator(1.0f));
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ Animator m3770e(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Animator m3771f(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(view, "translationX", 0.0f, view.getWidth() + t100.d(8.0f)));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ Animator m3772h(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Animator m3773a(int i, @NonNull View view);

    @Nullable
    /* JADX INFO: renamed from: b */
    Animator m3774b(int i, @NonNull View view);

    @Nullable
    /* JADX INFO: renamed from: g */
    List<View> m3775g(int i);
}
