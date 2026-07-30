package p153l;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class stu0 implements k7u0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final wit0 f170611a;

    public stu0(@Nullable wit0 wit0Var) {
        this.f170611a = wit0Var;
    }

    @Override // p153l.k7u0
    /* JADX INFO: renamed from: B */
    public final void mo107083B(@Nullable Context context) {
        wit0 wit0Var = this.f170611a;
        if (wit0Var != null) {
            wit0Var.destroy();
        }
    }

    @Override // p153l.k7u0
    /* JADX INFO: renamed from: K */
    public final void mo107084K(@Nullable Context context) {
        wit0 wit0Var = this.f170611a;
        if (wit0Var != null) {
            wit0Var.onPause();
        }
    }

    @Override // p153l.k7u0
    /* JADX INFO: renamed from: P */
    public final void mo107086P(@Nullable Context context) {
        wit0 wit0Var = this.f170611a;
        if (wit0Var != null) {
            wit0Var.onResume();
        }
    }
}
