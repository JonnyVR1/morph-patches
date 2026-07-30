package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class fud {

    /* JADX INFO: renamed from: a */
    public final String f99334a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f99335b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f99336c;

    public fud(String str, @Nullable String str2, @Nullable String str3) {
        this.f99334a = str;
        this.f99335b = str2;
        this.f99336c = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fud.class == obj.getClass()) {
            fud fudVar = (fud) obj;
            if (vck0.m197845c(this.f99334a, fudVar.f99334a) && vck0.m197845c(this.f99335b, fudVar.f99335b) && vck0.m197845c(this.f99336c, fudVar.f99336c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f99334a.hashCode() * 31;
        String str = this.f99335b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f99336c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
