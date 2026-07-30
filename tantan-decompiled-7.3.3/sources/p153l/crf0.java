package p153l;

import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes7.dex */
public final class crf0 {

    /* JADX INFO: renamed from: a */
    private final int f83319a;

    /* JADX INFO: renamed from: b */
    private final int f83320b;

    public crf0(int i, int i2) {
        this.f83319a = i;
        this.f83320b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m112049a() {
        return this.f83320b;
    }

    /* JADX INFO: renamed from: b */
    public int m112050b() {
        return this.f83319a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof crf0) {
            crf0 crf0Var = (crf0) obj;
            if (this.f83319a == crf0Var.f83319a && this.f83320b == crf0Var.f83320b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f83320b;
        int i2 = this.f83319a;
        return ((i2 >>> 16) | (i2 << 16)) ^ i;
    }

    public String toString() {
        return this.f83319a + BaseSei.f14624X + this.f83320b;
    }
}
