package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class c8x0 {

    /* JADX INFO: renamed from: a */
    public final Object f79825a;

    /* JADX INFO: renamed from: b */
    public final int f79826b;

    public c8x0(Object obj, int i) {
        this.f79825a = obj;
        this.f79826b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c8x0)) {
            return false;
        }
        c8x0 c8x0Var = (c8x0) obj;
        return this.f79825a == c8x0Var.f79825a && this.f79826b == c8x0Var.f79826b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f79825a) * j6f.COLOR_SPACE_UNCALIBRATED) + this.f79826b;
    }
}
