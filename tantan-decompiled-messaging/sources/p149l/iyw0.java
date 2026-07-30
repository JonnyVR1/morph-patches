package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class iyw0 {

    /* JADX INFO: renamed from: a */
    public final Class f115509a;

    /* JADX INFO: renamed from: b */
    public final q6x0 f115510b;

    public /* synthetic */ iyw0(Class cls, q6x0 q6x0Var, hyw0 hyw0Var) {
        this.f115509a = cls;
        this.f115510b = q6x0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iyw0)) {
            return false;
        }
        iyw0 iyw0Var = (iyw0) obj;
        return iyw0Var.f115509a.equals(this.f115509a) && iyw0Var.f115510b.equals(this.f115510b);
    }

    public final int hashCode() {
        return Objects.hash(this.f115509a, this.f115510b);
    }

    public final String toString() {
        q6x0 q6x0Var = this.f115510b;
        return this.f115509a.getSimpleName() + ", object identifier: " + String.valueOf(q6x0Var);
    }
}
