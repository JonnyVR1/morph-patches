package p149l;

import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes.dex */
public final class vif0 {

    /* JADX INFO: renamed from: a */
    private final int f181605a;

    /* JADX INFO: renamed from: b */
    private final int f181606b;

    public vif0(int i, int i2) {
        this.f181605a = i;
        this.f181606b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m198561a() {
        return this.f181606b;
    }

    /* JADX INFO: renamed from: b */
    public int m198562b() {
        return this.f181605a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof vif0) {
            vif0 vif0Var = (vif0) obj;
            if (this.f181605a == vif0Var.f181605a && this.f181606b == vif0Var.f181606b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f181606b;
        int i2 = this.f181605a;
        return ((i2 >>> 16) | (i2 << 16)) ^ i;
    }

    public String toString() {
        return this.f181605a + BaseSei.f13930X + this.f181606b;
    }
}
