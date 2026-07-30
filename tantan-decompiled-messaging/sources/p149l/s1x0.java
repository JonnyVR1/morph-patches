package p149l;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class s1x0 {

    /* JADX INFO: renamed from: a */
    public final h1x0 f161950a;

    /* JADX INFO: renamed from: b */
    public final List f161951b;

    /* JADX INFO: renamed from: c */
    public final Integer f161952c;

    public /* synthetic */ s1x0(h1x0 h1x0Var, List list, Integer num, r1x0 r1x0Var) {
        this.f161950a = h1x0Var;
        this.f161951b = list;
        this.f161952c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s1x0)) {
            return false;
        }
        s1x0 s1x0Var = (s1x0) obj;
        return this.f161950a.equals(s1x0Var.f161950a) && this.f161951b.equals(s1x0Var.f161951b) && Objects.equals(this.f161952c, s1x0Var.f161952c);
    }

    public final int hashCode() {
        return Objects.hash(this.f161950a, this.f161951b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f161950a, this.f161951b, this.f161952c);
    }
}
