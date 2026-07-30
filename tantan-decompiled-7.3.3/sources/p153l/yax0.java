package p153l;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class yax0 {

    /* JADX INFO: renamed from: a */
    public final nax0 f198264a;

    /* JADX INFO: renamed from: b */
    public final List f198265b;

    /* JADX INFO: renamed from: c */
    public final Integer f198266c;

    public /* synthetic */ yax0(nax0 nax0Var, List list, Integer num, xax0 xax0Var) {
        this.f198264a = nax0Var;
        this.f198265b = list;
        this.f198266c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yax0)) {
            return false;
        }
        yax0 yax0Var = (yax0) obj;
        return this.f198264a.equals(yax0Var.f198264a) && this.f198265b.equals(yax0Var.f198265b) && Objects.equals(this.f198266c, yax0Var.f198266c);
    }

    public final int hashCode() {
        return Objects.hash(this.f198264a, this.f198265b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f198264a, this.f198265b, this.f198266c);
    }
}
