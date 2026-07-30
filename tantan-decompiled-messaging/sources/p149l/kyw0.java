package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class kyw0 {

    /* JADX INFO: renamed from: a */
    public final Class f125340a;

    /* JADX INFO: renamed from: b */
    public final Class f125341b;

    public /* synthetic */ kyw0(Class cls, Class cls2, jyw0 jyw0Var) {
        this.f125340a = cls;
        this.f125341b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kyw0)) {
            return false;
        }
        kyw0 kyw0Var = (kyw0) obj;
        return kyw0Var.f125340a.equals(this.f125340a) && kyw0Var.f125341b.equals(this.f125341b);
    }

    public final int hashCode() {
        return Objects.hash(this.f125340a, this.f125341b);
    }

    public final String toString() {
        Class cls = this.f125341b;
        return this.f125340a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
