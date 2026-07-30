package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class g8v0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public y7v0 f101522a;

    public g8v0(y7v0 y7v0Var) {
        this.f101522a = y7v0Var;
    }

    /* JADX INFO: renamed from: b */
    public static g8v0 m124771b(y7v0 y7v0Var) {
        return new g8v0(y7v0Var);
    }

    /* JADX INFO: renamed from: a */
    public final y7v0 m124772a(Clock clock, a8v0 a8v0Var, n3v0 n3v0Var, s5w0 s5w0Var) {
        y7v0 y7v0Var = this.f101522a;
        return y7v0Var != null ? y7v0Var : new y7v0(clock, a8v0Var, n3v0Var, s5w0Var);
    }

    public g8v0() {
    }
}
