package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class fcc0 {

    /* JADX INFO: renamed from: a */
    public final long f96787a;

    /* JADX INFO: renamed from: b */
    public final long f96788b;

    /* JADX INFO: renamed from: c */
    public final String f96789c;

    /* JADX INFO: renamed from: d */
    public int f96790d;

    public fcc0(@Nullable String str, long j, long j2) {
        this.f96789c = str == null ? "" : str;
        this.f96787a = j;
        this.f96788b = j2;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public fcc0 m120421a(@Nullable fcc0 fcc0Var, String str) {
        String strM120423c = m120423c(str);
        fcc0 fcc0Var2 = null;
        if (fcc0Var != null && strM120423c.equals(fcc0Var.m120423c(str))) {
            long j = this.f96788b;
            if (j != -1) {
                long j2 = this.f96787a;
                if (j2 + j == fcc0Var.f96787a) {
                    long j3 = fcc0Var.f96788b;
                    return new fcc0(strM120423c, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = fcc0Var.f96788b;
            if (j4 != -1) {
                long j5 = fcc0Var.f96787a;
                if (j5 + j4 == this.f96787a) {
                    fcc0Var2 = new fcc0(strM120423c, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return fcc0Var2;
    }

    /* JADX INFO: renamed from: b */
    public Uri m120422b(String str) {
        return evj0.m118284e(str, this.f96789c);
    }

    /* JADX INFO: renamed from: c */
    public String m120423c(String str) {
        return evj0.m118283d(str, this.f96789c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fcc0.class == obj.getClass()) {
            fcc0 fcc0Var = (fcc0) obj;
            if (this.f96787a == fcc0Var.f96787a && this.f96788b == fcc0Var.f96788b && this.f96789c.equals(fcc0Var.f96789c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f96790d == 0) {
            this.f96790d = ((((527 + ((int) this.f96787a)) * 31) + ((int) this.f96788b)) * 31) + this.f96789c.hashCode();
        }
        return this.f96790d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f96789c + ", start=" + this.f96787a + ", length=" + this.f96788b + ")";
    }
}
