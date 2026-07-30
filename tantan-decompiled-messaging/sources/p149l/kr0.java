package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class kr0 {
    /* JADX INFO: renamed from: a */
    public static void m146960a(@NonNull Animator animator, @NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* JADX INFO: renamed from: b */
    public static void m146961b(@NonNull Animator animator) {
        animator.pause();
    }

    /* JADX INFO: renamed from: c */
    public static void m146962c(@NonNull Animator animator) {
        animator.resume();
    }
}
