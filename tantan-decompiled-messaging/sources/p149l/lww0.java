package p149l;

import com.google.android.gms.internal.ads.zzgvz;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class lww0 extends fow0 {

    /* JADX INFO: renamed from: a */
    public final xxw0 f130313a;

    public lww0(xxw0 xxw0Var) {
        this.f130313a = xxw0Var;
    }

    /* JADX INFO: renamed from: b */
    public final xxw0 m152019b() {
        return this.f130313a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lww0)) {
            return false;
        }
        xxw0 xxw0Var = ((lww0) obj).f130313a;
        return this.f130313a.m211571c().m13350P().equals(xxw0Var.m211571c().m13350P()) && this.f130313a.m211571c().m13352R().equals(xxw0Var.m211571c().m13352R()) && this.f130313a.m211571c().m13351Q().equals(xxw0Var.m211571c().m13351Q());
    }

    public final int hashCode() {
        xxw0 xxw0Var = this.f130313a;
        return Objects.hash(xxw0Var.m211571c(), xxw0Var.zzd());
    }

    public final String toString() {
        String str;
        String strM13352R = this.f130313a.m211571c().m13352R();
        zzgvz zzgvzVarM13350P = this.f130313a.m211571c().m13350P();
        zzgvz zzgvzVar = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVarM13350P.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strM13352R, str);
    }
}
