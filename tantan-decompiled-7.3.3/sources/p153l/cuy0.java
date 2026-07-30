package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class cuy0 extends avy0 {

    /* JADX INFO: renamed from: a */
    public final String f83922a;

    /* JADX INFO: renamed from: b */
    public final boolean f83923b;

    /* JADX INFO: renamed from: c */
    public final int f83924c;

    public /* synthetic */ cuy0(String str, boolean z, int i, auy0 auy0Var) {
        this.f83922a = str;
        this.f83923b = z;
        this.f83924c = i;
    }

    @Override // p153l.avy0
    /* JADX INFO: renamed from: a */
    public final int mo100557a() {
        return this.f83924c;
    }

    @Override // p153l.avy0
    /* JADX INFO: renamed from: b */
    public final String mo100558b() {
        return this.f83922a;
    }

    @Override // p153l.avy0
    /* JADX INFO: renamed from: c */
    public final boolean mo100559c() {
        return this.f83923b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avy0) {
            avy0 avy0Var = (avy0) obj;
            if (this.f83922a.equals(avy0Var.mo100558b()) && this.f83923b == avy0Var.mo100559c() && this.f83924c == avy0Var.mo100557a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f83922a.hashCode() ^ 1000003;
        return this.f83924c ^ (((iHashCode * 1000003) ^ (true != this.f83923b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f83922a + ", enableFirelog=" + this.f83923b + ", firelogEventType=" + this.f83924c + "}";
    }
}
