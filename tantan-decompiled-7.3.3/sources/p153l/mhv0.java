package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class mhv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public ehv0 f136884a;

    public mhv0(ehv0 ehv0Var) {
        this.f136884a = ehv0Var;
    }

    /* JADX INFO: renamed from: b */
    public static mhv0 m158430b(ehv0 ehv0Var) {
        return new mhv0(ehv0Var);
    }

    /* JADX INFO: renamed from: a */
    public final ehv0 m158431a(Clock clock, ghv0 ghv0Var, tcv0 tcv0Var, yew0 yew0Var) {
        ehv0 ehv0Var = this.f136884a;
        return ehv0Var != null ? ehv0Var : new ehv0(clock, ghv0Var, tcv0Var, yew0Var);
    }

    public mhv0() {
    }
}
