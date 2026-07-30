package p153l;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: loaded from: classes.dex */
public class pf60<F, S> {

    /* JADX INFO: renamed from: a */
    public final F f152156a;

    /* JADX INFO: renamed from: b */
    public final S f152157b;

    public pf60(F f, S s) {
        this.f152156a = f;
        this.f152157b = s;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <A, B> pf60<A, B> m172085a(A a, B b) {
        return new pf60<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof pf60)) {
            return false;
        }
        pf60 pf60Var = (pf60) obj;
        return l950.m153327a(pf60Var.f152156a, this.f152156a) && l950.m153327a(pf60Var.f152157b, this.f152157b);
    }

    public int hashCode() {
        F f = this.f152156a;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.f152157b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.f152156a + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f152157b + "}";
    }
}
