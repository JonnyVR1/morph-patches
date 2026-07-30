package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class czx0 extends h0y0 {

    /* JADX INFO: renamed from: a */
    public final String f83136a;

    /* JADX INFO: renamed from: b */
    public final boolean f83137b;

    /* JADX INFO: renamed from: c */
    public final int f83138c;

    public /* synthetic */ czx0(String str, boolean z, int i, yyx0 yyx0Var) {
        this.f83136a = str;
        this.f83137b = z;
        this.f83138c = i;
    }

    @Override // p149l.h0y0
    /* JADX INFO: renamed from: a */
    public final int mo109446a() {
        return this.f83138c;
    }

    @Override // p149l.h0y0
    /* JADX INFO: renamed from: b */
    public final String mo109447b() {
        return this.f83136a;
    }

    @Override // p149l.h0y0
    /* JADX INFO: renamed from: c */
    public final boolean mo109448c() {
        return this.f83137b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0y0) {
            h0y0 h0y0Var = (h0y0) obj;
            if (this.f83136a.equals(h0y0Var.mo109447b()) && this.f83137b == h0y0Var.mo109448c() && this.f83138c == h0y0Var.mo109446a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f83138c ^ ((((this.f83136a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f83137b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f83136a + ", enableFirelog=" + this.f83137b + ", firelogEventType=" + this.f83138c + "}";
    }
}
