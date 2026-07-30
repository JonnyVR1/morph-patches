package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class c4x0 {

    /* JADX INFO: renamed from: a */
    public final Object f79305a;

    /* JADX INFO: renamed from: b */
    public final int f79306b;

    public c4x0(Object obj, int i) {
        this.f79305a = obj;
        this.f79306b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c4x0)) {
            return false;
        }
        c4x0 c4x0Var = (c4x0) obj;
        return this.f79305a == c4x0Var.f79305a && this.f79306b == c4x0Var.f79306b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f79305a) * j6f.COLOR_SPACE_UNCALIBRATED) + this.f79306b;
    }
}
