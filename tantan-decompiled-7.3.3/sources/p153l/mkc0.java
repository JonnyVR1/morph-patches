package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mkc0 {

    /* JADX INFO: renamed from: a */
    public final long f137275a;

    /* JADX INFO: renamed from: b */
    public final long f137276b;

    /* JADX INFO: renamed from: c */
    public final String f137277c;

    /* JADX INFO: renamed from: d */
    public int f137278d;

    public mkc0(@Nullable String str, long j, long j2) {
        this.f137277c = str == null ? "" : str;
        this.f137275a = j;
        this.f137276b = j2;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public mkc0 m158752a(@Nullable mkc0 mkc0Var, String str) {
        String strM158754c = m158754c(str);
        mkc0 mkc0Var2 = null;
        if (mkc0Var != null && strM158754c.equals(mkc0Var.m158754c(str))) {
            long j = this.f137276b;
            if (j != -1) {
                long j2 = this.f137275a;
                if (j2 + j == mkc0Var.f137275a) {
                    long j3 = mkc0Var.f137276b;
                    return new mkc0(strM158754c, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = mkc0Var.f137276b;
            if (j4 != -1) {
                long j5 = mkc0Var.f137275a;
                if (j5 + j4 == this.f137275a) {
                    mkc0Var2 = new mkc0(strM158754c, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return mkc0Var2;
    }

    /* JADX INFO: renamed from: b */
    public Uri m158753b(String str) {
        return h4k0.m133582e(str, this.f137277c);
    }

    /* JADX INFO: renamed from: c */
    public String m158754c(String str) {
        return h4k0.m133581d(str, this.f137277c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mkc0.class == obj.getClass()) {
            mkc0 mkc0Var = (mkc0) obj;
            if (this.f137275a == mkc0Var.f137275a && this.f137276b == mkc0Var.f137276b && this.f137277c.equals(mkc0Var.f137277c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f137278d == 0) {
            this.f137278d = ((((527 + ((int) this.f137275a)) * 31) + ((int) this.f137276b)) * 31) + this.f137277c.hashCode();
        }
        return this.f137278d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f137277c + ", start=" + this.f137275a + ", length=" + this.f137276b + ")";
    }
}
