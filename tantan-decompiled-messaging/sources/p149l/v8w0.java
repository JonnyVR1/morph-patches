package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class v8w0 extends r8w0 {

    /* JADX INFO: renamed from: a */
    public final String f180596a;

    /* JADX INFO: renamed from: b */
    public final boolean f180597b;

    /* JADX INFO: renamed from: c */
    public final boolean f180598c;

    public /* synthetic */ v8w0(String str, boolean z, boolean z2, u8w0 u8w0Var) {
        this.f180596a = str;
        this.f180597b = z;
        this.f180598c = z2;
    }

    @Override // p149l.r8w0
    /* JADX INFO: renamed from: b */
    public final String mo178287b() {
        return this.f180596a;
    }

    @Override // p149l.r8w0
    /* JADX INFO: renamed from: c */
    public final boolean mo178288c() {
        return this.f180598c;
    }

    @Override // p149l.r8w0
    /* JADX INFO: renamed from: d */
    public final boolean mo178289d() {
        return this.f180597b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r8w0) {
            r8w0 r8w0Var = (r8w0) obj;
            if (this.f180596a.equals(r8w0Var.mo178287b()) && this.f180597b == r8w0Var.mo178289d() && this.f180598c == r8w0Var.mo178288c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f180596a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f180597b ? 1237 : 1231)) * 1000003) ^ (true != this.f180598c ? 1237 : 1231);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f180596a + ", shouldGetAdvertisingId=" + this.f180597b + ", isGooglePlayServicesAvailable=" + this.f180598c + "}";
    }
}
