package p003l;

import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface bnc0 extends nf50 {
    /* JADX INFO: renamed from: c */
    void mo2968c(@NonNull hnc0 hnc0Var, int i, int i2);

    /* JADX INFO: renamed from: d */
    void mo2969d(float f, int i, int i2);

    /* JADX INFO: renamed from: e */
    boolean mo2970e();

    /* JADX INFO: renamed from: g */
    void mo2971g(@NonNull hnc0 hnc0Var, int i, int i2);

    @NonNull
    nof0 getSpinnerStyle();

    @NonNull
    View getView();

    /* JADX INFO: renamed from: h */
    int mo2972h(@NonNull hnc0 hnc0Var, boolean z);

    /* JADX INFO: renamed from: i */
    void mo2973i(@NonNull gnc0 gnc0Var, int i, int i2);

    /* JADX INFO: renamed from: l */
    void mo2974l(boolean z, float f, int i, int i2, int i3);

    void setPrimaryColors(@ColorInt int... iArr);
}
