package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class rcw0 extends fdw0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f158830a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f158831b;

    public /* synthetic */ rcw0(String str, String str2, qcw0 qcw0Var) {
        this.f158830a = str;
        this.f158831b = str2;
    }

    @Override // p149l.fdw0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final String mo121011a() {
        return this.f158831b;
    }

    @Override // p149l.fdw0
    @Nullable
    /* JADX INFO: renamed from: b */
    public final String mo121012b() {
        return this.f158830a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fdw0) {
            fdw0 fdw0Var = (fdw0) obj;
            String str = this.f158830a;
            if (str != null ? str.equals(fdw0Var.mo121012b()) : fdw0Var.mo121012b() == null) {
                String str2 = this.f158831b;
                if (str2 != null ? str2.equals(fdw0Var.mo121011a()) : fdw0Var.mo121011a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f158830a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f158831b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.f158830a + ", appId=" + this.f158831b + "}";
    }
}
