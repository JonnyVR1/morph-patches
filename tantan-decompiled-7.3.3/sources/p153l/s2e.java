package p153l;

import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes7.dex */
public final class s2e {

    /* JADX INFO: renamed from: a */
    public final int f165880a;

    /* JADX INFO: renamed from: b */
    public final int f165881b;

    /* JADX INFO: renamed from: a */
    public int m184116a() {
        return this.f165881b;
    }

    /* JADX INFO: renamed from: b */
    public int m184117b() {
        return this.f165880a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s2e) {
            s2e s2eVar = (s2e) obj;
            if (this.f165880a == s2eVar.f165880a && this.f165881b == s2eVar.f165881b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f165880a * 32713) + this.f165881b;
    }

    public String toString() {
        return this.f165880a + BaseSei.f14624X + this.f165881b;
    }
}
