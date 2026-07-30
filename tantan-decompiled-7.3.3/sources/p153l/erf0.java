package p153l;

import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes.dex */
public final class erf0 {

    /* JADX INFO: renamed from: a */
    private final int f95471a;

    /* JADX INFO: renamed from: b */
    private final int f95472b;

    public erf0(int i, int i2) {
        this.f95471a = i;
        this.f95472b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m122179a() {
        return this.f95472b;
    }

    /* JADX INFO: renamed from: b */
    public int m122180b() {
        return this.f95471a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof erf0) {
            erf0 erf0Var = (erf0) obj;
            if (this.f95471a == erf0Var.f95471a && this.f95472b == erf0Var.f95472b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f95472b;
        int i2 = this.f95471a;
        return ((i2 >>> 16) | (i2 << 16)) ^ i;
    }

    public String toString() {
        return this.f95471a + BaseSei.f14624X + this.f95472b;
    }
}
