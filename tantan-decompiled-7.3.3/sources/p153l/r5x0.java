package p153l;

import com.google.android.gms.internal.ads.zzgvz;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class r5x0 extends lxw0 {

    /* JADX INFO: renamed from: a */
    public final d7x0 f161414a;

    public r5x0(d7x0 d7x0Var) {
        this.f161414a = d7x0Var;
    }

    /* JADX INFO: renamed from: b */
    public final d7x0 m179959b() {
        return this.f161414a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r5x0)) {
            return false;
        }
        d7x0 d7x0Var = ((r5x0) obj).f161414a;
        return this.f161414a.m114763c().m13404P().equals(d7x0Var.m114763c().m13404P()) && this.f161414a.m114763c().m13406R().equals(d7x0Var.m114763c().m13406R()) && this.f161414a.m114763c().m13405Q().equals(d7x0Var.m114763c().m13405Q());
    }

    public final int hashCode() {
        d7x0 d7x0Var = this.f161414a;
        return Objects.hash(d7x0Var.m114763c(), d7x0Var.zzd());
    }

    public final String toString() {
        String str;
        String strM13406R = this.f161414a.m114763c().m13406R();
        zzgvz zzgvzVarM13404P = this.f161414a.m114763c().m13404P();
        zzgvz zzgvzVar = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVarM13404P.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strM13406R, str);
    }
}
