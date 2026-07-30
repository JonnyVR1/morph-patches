package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class ovb0<A, B, C, D> {

    /* JADX INFO: renamed from: a */
    public A f149248a;

    /* JADX INFO: renamed from: b */
    public B f149249b;

    /* JADX INFO: renamed from: c */
    public C f149250c;

    /* JADX INFO: renamed from: d */
    public D f149251d;

    public ovb0(A a, B b, C c, D d) {
        this.f149248a = a;
        this.f149249b = b;
        this.f149250c = c;
        this.f149251d = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ovb0 ovb0Var = (ovb0) obj;
            if (Objects.equals(this.f149248a, ovb0Var.f149248a) && Objects.equals(this.f149249b, ovb0Var.f149249b) && Objects.equals(this.f149250c, ovb0Var.f149250c) && Objects.equals(this.f149251d, ovb0Var.f149251d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f149248a, this.f149249b, this.f149250c, this.f149251d);
    }

    public String toString() {
        return "Quadruple{first=" + this.f149248a + ", second=" + this.f149249b + ", third=" + this.f149250c + ", fourth=" + this.f149251d + '}';
    }
}
