package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class i8y0 extends n9y0 {

    /* JADX INFO: renamed from: a */
    public final String f113382a;

    /* JADX INFO: renamed from: b */
    public final boolean f113383b;

    /* JADX INFO: renamed from: c */
    public final int f113384c;

    public /* synthetic */ i8y0(String str, boolean z, int i, e8y0 e8y0Var) {
        this.f113382a = str;
        this.f113383b = z;
        this.f113384c = i;
    }

    @Override // p153l.n9y0
    /* JADX INFO: renamed from: a */
    public final int mo139040a() {
        return this.f113384c;
    }

    @Override // p153l.n9y0
    /* JADX INFO: renamed from: b */
    public final String mo139041b() {
        return this.f113382a;
    }

    @Override // p153l.n9y0
    /* JADX INFO: renamed from: c */
    public final boolean mo139042c() {
        return this.f113383b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n9y0) {
            n9y0 n9y0Var = (n9y0) obj;
            if (this.f113382a.equals(n9y0Var.mo139041b()) && this.f113383b == n9y0Var.mo139042c() && this.f113384c == n9y0Var.mo139040a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f113384c ^ ((((this.f113382a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f113383b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f113382a + ", enableFirelog=" + this.f113383b + ", firelogEventType=" + this.f113384c + "}";
    }
}
