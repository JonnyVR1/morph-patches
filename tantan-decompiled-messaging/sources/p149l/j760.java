package p149l;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: loaded from: classes.dex */
public class j760<F, S> {

    /* JADX INFO: renamed from: a */
    public final F f116564a;

    /* JADX INFO: renamed from: b */
    public final S f116565b;

    public j760(F f, S s) {
        this.f116564a = f;
        this.f116565b = s;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <A, B> j760<A, B> m140076a(A a, B b) {
        return new j760<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j760)) {
            return false;
        }
        j760 j760Var = (j760) obj;
        return w050.m200828a(j760Var.f116564a, this.f116564a) && w050.m200828a(j760Var.f116565b, this.f116565b);
    }

    public int hashCode() {
        F f = this.f116564a;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.f116565b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.f116564a + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f116565b + "}";
    }
}
