package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class m4b0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f134777a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f134778b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f134779c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f134780d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String f134781e;

    public m4b0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f134777a = str;
        this.f134778b = str2;
        this.f134779c = str3;
        this.f134780d = str4;
        this.f134781e = str5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4b0)) {
            return false;
        }
        m4b0 m4b0Var = (m4b0) obj;
        return bmk0.m105123c(this.f134777a, m4b0Var.f134777a) && bmk0.m105123c(this.f134778b, m4b0Var.f134778b) && bmk0.m105123c(this.f134779c, m4b0Var.f134779c) && bmk0.m105123c(this.f134780d, m4b0Var.f134780d) && bmk0.m105123c(this.f134781e, m4b0Var.f134781e);
    }

    public int hashCode() {
        String str = this.f134777a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f134778b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f134779c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f134780d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f134781e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
