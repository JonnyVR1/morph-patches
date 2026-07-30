package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class wky0 extends uly0 {

    /* JADX INFO: renamed from: a */
    public final String f186849a;

    /* JADX INFO: renamed from: b */
    public final boolean f186850b;

    /* JADX INFO: renamed from: c */
    public final int f186851c;

    public /* synthetic */ wky0(String str, boolean z, int i, uky0 uky0Var) {
        this.f186849a = str;
        this.f186850b = z;
        this.f186851c = i;
    }

    @Override // p149l.uly0
    /* JADX INFO: renamed from: a */
    public final int mo194285a() {
        return this.f186851c;
    }

    @Override // p149l.uly0
    /* JADX INFO: renamed from: b */
    public final String mo194286b() {
        return this.f186849a;
    }

    @Override // p149l.uly0
    /* JADX INFO: renamed from: c */
    public final boolean mo194287c() {
        return this.f186850b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uly0) {
            uly0 uly0Var = (uly0) obj;
            if (this.f186849a.equals(uly0Var.mo194286b()) && this.f186850b == uly0Var.mo194287c() && this.f186851c == uly0Var.mo194285a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f186849a.hashCode() ^ 1000003;
        return this.f186851c ^ (((iHashCode * 1000003) ^ (true != this.f186850b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f186849a + ", enableFirelog=" + this.f186850b + ", firelogEventType=" + this.f186851c + "}";
    }
}
