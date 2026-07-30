package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class knb0<A, B, C, D> {

    /* JADX INFO: renamed from: a */
    public A f123873a;

    /* JADX INFO: renamed from: b */
    public B f123874b;

    /* JADX INFO: renamed from: c */
    public C f123875c;

    /* JADX INFO: renamed from: d */
    public D f123876d;

    public knb0(A a, B b, C c, D d) {
        this.f123873a = a;
        this.f123874b = b;
        this.f123875c = c;
        this.f123876d = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            knb0 knb0Var = (knb0) obj;
            if (Objects.equals(this.f123873a, knb0Var.f123873a) && Objects.equals(this.f123874b, knb0Var.f123874b) && Objects.equals(this.f123875c, knb0Var.f123875c) && Objects.equals(this.f123876d, knb0Var.f123876d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f123873a, this.f123874b, this.f123875c, this.f123876d);
    }

    public String toString() {
        return "Quadruple{first=" + this.f123873a + ", second=" + this.f123874b + ", third=" + this.f123875c + ", fourth=" + this.f123876d + '}';
    }
}
