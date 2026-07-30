package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ihx0 {

    /* JADX INFO: renamed from: a */
    public final Object f115028a;

    /* JADX INFO: renamed from: b */
    public final int f115029b;

    public ihx0(Object obj, int i) {
        this.f115028a = obj;
        this.f115029b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ihx0)) {
            return false;
        }
        ihx0 ihx0Var = (ihx0) obj;
        return this.f115028a == ihx0Var.f115028a && this.f115029b == ihx0Var.f115029b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f115028a) * p7f.COLOR_SPACE_UNCALIBRATED) + this.f115029b;
    }
}
