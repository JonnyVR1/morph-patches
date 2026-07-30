package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class o7x0 {

    /* JADX INFO: renamed from: a */
    public final Class f145334a;

    /* JADX INFO: renamed from: b */
    public final wfx0 f145335b;

    public /* synthetic */ o7x0(Class cls, wfx0 wfx0Var, n7x0 n7x0Var) {
        this.f145334a = cls;
        this.f145335b = wfx0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o7x0)) {
            return false;
        }
        o7x0 o7x0Var = (o7x0) obj;
        return o7x0Var.f145334a.equals(this.f145334a) && o7x0Var.f145335b.equals(this.f145335b);
    }

    public final int hashCode() {
        return Objects.hash(this.f145334a, this.f145335b);
    }

    public final String toString() {
        wfx0 wfx0Var = this.f145335b;
        return this.f145334a.getSimpleName() + ", object identifier: " + String.valueOf(wfx0Var);
    }
}
