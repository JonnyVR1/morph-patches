package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class iwa0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f115240a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f115241b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f115242c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f115243d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String f115244e;

    public iwa0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f115240a = str;
        this.f115241b = str2;
        this.f115242c = str3;
        this.f115243d = str4;
        this.f115244e = str5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwa0)) {
            return false;
        }
        iwa0 iwa0Var = (iwa0) obj;
        return vck0.m197845c(this.f115240a, iwa0Var.f115240a) && vck0.m197845c(this.f115241b, iwa0Var.f115241b) && vck0.m197845c(this.f115242c, iwa0Var.f115242c) && vck0.m197845c(this.f115243d, iwa0Var.f115243d) && vck0.m197845c(this.f115244e, iwa0Var.f115244e);
    }

    public int hashCode() {
        String str = this.f115240a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f115241b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f115242c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f115243d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f115244e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
