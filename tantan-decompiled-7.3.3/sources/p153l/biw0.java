package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class biw0 extends xhw0 {

    /* JADX INFO: renamed from: a */
    public final String f76941a;

    /* JADX INFO: renamed from: b */
    public final boolean f76942b;

    /* JADX INFO: renamed from: c */
    public final boolean f76943c;

    public /* synthetic */ biw0(String str, boolean z, boolean z2, aiw0 aiw0Var) {
        this.f76941a = str;
        this.f76942b = z;
        this.f76943c = z2;
    }

    @Override // p153l.xhw0
    /* JADX INFO: renamed from: b */
    public final String mo104576b() {
        return this.f76941a;
    }

    @Override // p153l.xhw0
    /* JADX INFO: renamed from: c */
    public final boolean mo104577c() {
        return this.f76943c;
    }

    @Override // p153l.xhw0
    /* JADX INFO: renamed from: d */
    public final boolean mo104578d() {
        return this.f76942b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xhw0) {
            xhw0 xhw0Var = (xhw0) obj;
            if (this.f76941a.equals(xhw0Var.mo104576b()) && this.f76942b == xhw0Var.mo104578d() && this.f76943c == xhw0Var.mo104577c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f76941a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f76942b ? 1237 : 1231)) * 1000003) ^ (true != this.f76943c ? 1237 : 1231);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f76941a + ", shouldGetAdvertisingId=" + this.f76942b + ", isGooglePlayServicesAvailable=" + this.f76943c + "}";
    }
}
