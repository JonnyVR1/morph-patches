package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class z6x0 {

    /* JADX INFO: renamed from: a */
    public final Class f203203a;

    /* JADX INFO: renamed from: b */
    public final Class f203204b;

    public /* synthetic */ z6x0(Class cls, Class cls2, y6x0 y6x0Var) {
        this.f203203a = cls;
        this.f203204b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z6x0)) {
            return false;
        }
        z6x0 z6x0Var = (z6x0) obj;
        return z6x0Var.f203203a.equals(this.f203203a) && z6x0Var.f203204b.equals(this.f203204b);
    }

    public final int hashCode() {
        return Objects.hash(this.f203203a, this.f203204b);
    }

    public final String toString() {
        Class cls = this.f203204b;
        return this.f203203a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
