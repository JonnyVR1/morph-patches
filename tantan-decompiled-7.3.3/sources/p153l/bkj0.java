package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class bkj0<A, B, C> {

    /* JADX INFO: renamed from: a */
    public A f77081a;

    /* JADX INFO: renamed from: b */
    public B f77082b;

    /* JADX INFO: renamed from: c */
    public C f77083c;

    public bkj0(A a, B b, C c) {
        this.f77081a = a;
        this.f77082b = b;
        this.f77083c = c;
    }

    /* JADX INFO: renamed from: a */
    public static <A, B, C> bkj0<A, B, C> m104818a(A a, B b, C c) {
        return new bkj0<>(a, b, c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bkj0 bkj0Var = (bkj0) obj;
            if (Objects.equals(this.f77081a, bkj0Var.f77081a) && Objects.equals(this.f77082b, bkj0Var.f77082b) && Objects.equals(this.f77083c, bkj0Var.f77083c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f77081a, this.f77082b, this.f77083c);
    }

    public String toString() {
        return "(" + this.f77081a + ", " + this.f77082b + Constants.SEPARATOR_COMMA + this.f77083c + " )";
    }
}
