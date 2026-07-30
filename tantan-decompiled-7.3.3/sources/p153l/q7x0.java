package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class q7x0 {

    /* JADX INFO: renamed from: a */
    public final Class f156009a;

    /* JADX INFO: renamed from: b */
    public final Class f156010b;

    public /* synthetic */ q7x0(Class cls, Class cls2, p7x0 p7x0Var) {
        this.f156009a = cls;
        this.f156010b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q7x0)) {
            return false;
        }
        q7x0 q7x0Var = (q7x0) obj;
        return q7x0Var.f156009a.equals(this.f156009a) && q7x0Var.f156010b.equals(this.f156010b);
    }

    public final int hashCode() {
        return Objects.hash(this.f156009a, this.f156010b);
    }

    public final String toString() {
        Class cls = this.f156010b;
        return this.f156009a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
