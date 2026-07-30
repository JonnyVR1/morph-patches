package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class nes0 {

    /* JADX INFO: renamed from: a */
    public final String f141679a;

    /* JADX INFO: renamed from: b */
    public final double f141680b;

    /* JADX INFO: renamed from: c */
    public final double f141681c;

    /* JADX INFO: renamed from: d */
    public final double f141682d;

    /* JADX INFO: renamed from: e */
    public final int f141683e;

    public nes0(String str, double d, double d2, double d3, int i) {
        this.f141679a = str;
        this.f141681c = d;
        this.f141680b = d2;
        this.f141682d = d3;
        this.f141683e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nes0)) {
            return false;
        }
        nes0 nes0Var = (nes0) obj;
        return Objects.equal(this.f141679a, nes0Var.f141679a) && this.f141680b == nes0Var.f141680b && this.f141681c == nes0Var.f141681c && this.f141683e == nes0Var.f141683e && Double.compare(this.f141682d, nes0Var.f141682d) == 0;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f141679a, Double.valueOf(this.f141680b), Double.valueOf(this.f141681c), Double.valueOf(this.f141682d), Integer.valueOf(this.f141683e));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AuthenticationTokenClaims.JSON_KEY_NAME, this.f141679a).add("minBound", Double.valueOf(this.f141681c)).add("maxBound", Double.valueOf(this.f141680b)).add("percent", Double.valueOf(this.f141682d)).add("count", Integer.valueOf(this.f141683e)).toString();
    }
}
