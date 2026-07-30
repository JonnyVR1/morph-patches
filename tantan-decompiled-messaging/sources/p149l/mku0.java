package p149l;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class mku0 implements eyt0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final q9t0 f134381a;

    public mku0(@Nullable q9t0 q9t0Var) {
        this.f134381a = q9t0Var;
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: B */
    public final void mo102676B(@Nullable Context context) {
        q9t0 q9t0Var = this.f134381a;
        if (q9t0Var != null) {
            q9t0Var.destroy();
        }
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: K */
    public final void mo102677K(@Nullable Context context) {
        q9t0 q9t0Var = this.f134381a;
        if (q9t0Var != null) {
            q9t0Var.onPause();
        }
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: P */
    public final void mo102680P(@Nullable Context context) {
        q9t0 q9t0Var = this.f134381a;
        if (q9t0Var != null) {
            q9t0Var.onResume();
        }
    }
}
