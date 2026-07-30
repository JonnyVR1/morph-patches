package p153l;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class vns0 {

    /* JADX INFO: renamed from: a */
    public final yqw0 f184910a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final byv0 f184911b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @GuardedBy("this")
    public cms0 f184912c;

    public vns0(yqw0 yqw0Var, @Nullable byv0 byv0Var) {
        this.f184910a = yqw0Var;
        this.f184911b = byv0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final lms0 m202008c() {
        rns0 rns0Var = null;
        if (this.f184911b == null) {
            return null;
        }
        return new sns0(this, rns0Var);
    }

    /* JADX INFO: renamed from: d */
    public final oms0 m202009d() {
        return new uns0(this, null);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized cms0 m202010f(bms0 bms0Var) {
        cms0 cms0Var = this.f184912c;
        if (cms0Var != null) {
            return cms0Var;
        }
        cms0 cms0Var2 = new cms0(bms0Var);
        this.f184912c = cms0Var2;
        return cms0Var2;
    }
}
