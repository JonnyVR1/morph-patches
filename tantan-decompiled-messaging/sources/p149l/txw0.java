package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class txw0 {

    /* JADX INFO: renamed from: a */
    public final Class f172539a;

    /* JADX INFO: renamed from: b */
    public final Class f172540b;

    public /* synthetic */ txw0(Class cls, Class cls2, sxw0 sxw0Var) {
        this.f172539a = cls;
        this.f172540b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof txw0)) {
            return false;
        }
        txw0 txw0Var = (txw0) obj;
        return txw0Var.f172539a.equals(this.f172539a) && txw0Var.f172540b.equals(this.f172540b);
    }

    public final int hashCode() {
        return Objects.hash(this.f172539a, this.f172540b);
    }

    public final String toString() {
        Class cls = this.f172540b;
        return this.f172539a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
