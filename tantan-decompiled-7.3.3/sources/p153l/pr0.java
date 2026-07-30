package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class pr0 {
    /* JADX INFO: renamed from: a */
    public static void m173423a(@NonNull Animator animator, @NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* JADX INFO: renamed from: b */
    public static void m173424b(@NonNull Animator animator) {
        animator.pause();
    }

    /* JADX INFO: renamed from: c */
    public static void m173425c(@NonNull Animator animator) {
        animator.resume();
    }
}
