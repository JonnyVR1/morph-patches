package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class h5s0 {

    /* JADX INFO: renamed from: a */
    public final String f105979a;

    /* JADX INFO: renamed from: b */
    public final double f105980b;

    /* JADX INFO: renamed from: c */
    public final double f105981c;

    /* JADX INFO: renamed from: d */
    public final double f105982d;

    /* JADX INFO: renamed from: e */
    public final int f105983e;

    public h5s0(String str, double d, double d2, double d3, int i) {
        this.f105979a = str;
        this.f105981c = d;
        this.f105980b = d2;
        this.f105982d = d3;
        this.f105983e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h5s0)) {
            return false;
        }
        h5s0 h5s0Var = (h5s0) obj;
        return Objects.equal(this.f105979a, h5s0Var.f105979a) && this.f105980b == h5s0Var.f105980b && this.f105981c == h5s0Var.f105981c && this.f105983e == h5s0Var.f105983e && Double.compare(this.f105982d, h5s0Var.f105982d) == 0;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f105979a, Double.valueOf(this.f105980b), Double.valueOf(this.f105981c), Double.valueOf(this.f105982d), Integer.valueOf(this.f105983e));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AuthenticationTokenClaims.JSON_KEY_NAME, this.f105979a).add("minBound", Double.valueOf(this.f105981c)).add("maxBound", Double.valueOf(this.f105980b)).add("percent", Double.valueOf(this.f105982d)).add("count", Integer.valueOf(this.f105983e)).toString();
    }
}
