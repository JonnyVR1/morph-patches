package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class xaj0<A, B, C> {

    /* JADX INFO: renamed from: a */
    public A f191751a;

    /* JADX INFO: renamed from: b */
    public B f191752b;

    /* JADX INFO: renamed from: c */
    public C f191753c;

    public xaj0(A a, B b, C c) {
        this.f191751a = a;
        this.f191752b = b;
        this.f191753c = c;
    }

    /* JADX INFO: renamed from: a */
    public static <A, B, C> xaj0<A, B, C> m207578a(A a, B b, C c) {
        return new xaj0<>(a, b, c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            xaj0 xaj0Var = (xaj0) obj;
            if (Objects.equals(this.f191751a, xaj0Var.f191751a) && Objects.equals(this.f191752b, xaj0Var.f191752b) && Objects.equals(this.f191753c, xaj0Var.f191753c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f191751a, this.f191752b, this.f191753c);
    }

    public String toString() {
        return "(" + this.f191751a + ", " + this.f191752b + Constants.SEPARATOR_COMMA + this.f191753c + " )";
    }
}
