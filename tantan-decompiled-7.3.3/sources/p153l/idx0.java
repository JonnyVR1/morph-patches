package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class idx0 {

    /* JADX INFO: renamed from: a */
    public final Object f114535a;

    /* JADX INFO: renamed from: b */
    public final int f114536b;

    public idx0(Object obj, int i) {
        this.f114535a = obj;
        this.f114536b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof idx0)) {
            return false;
        }
        idx0 idx0Var = (idx0) obj;
        return this.f114535a == idx0Var.f114535a && this.f114536b == idx0Var.f114536b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f114535a) * p7f.COLOR_SPACE_UNCALIBRATED) + this.f114536b;
    }
}
