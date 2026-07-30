package p149l;

import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes7.dex */
public final class tif0 {

    /* JADX INFO: renamed from: a */
    private final int f170576a;

    /* JADX INFO: renamed from: b */
    private final int f170577b;

    public tif0(int i, int i2) {
        this.f170576a = i;
        this.f170577b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m189183a() {
        return this.f170577b;
    }

    /* JADX INFO: renamed from: b */
    public int m189184b() {
        return this.f170576a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof tif0) {
            tif0 tif0Var = (tif0) obj;
            if (this.f170576a == tif0Var.f170576a && this.f170577b == tif0Var.f170577b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f170577b;
        int i2 = this.f170576a;
        return ((i2 >>> 16) | (i2 << 16)) ^ i;
    }

    public String toString() {
        return this.f170576a + BaseSei.f13930X + this.f170577b;
    }
}
