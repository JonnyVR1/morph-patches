package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ddw0 extends vdw0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f85681a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f85682b;

    public /* synthetic */ ddw0(String str, String str2, zcw0 zcw0Var) {
        this.f85681a = str;
        this.f85682b = str2;
    }

    @Override // p149l.vdw0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final String mo111085a() {
        return this.f85682b;
    }

    @Override // p149l.vdw0
    @Nullable
    /* JADX INFO: renamed from: b */
    public final String mo111086b() {
        return this.f85681a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vdw0) {
            vdw0 vdw0Var = (vdw0) obj;
            String str = this.f85681a;
            if (str != null ? str.equals(vdw0Var.mo111086b()) : vdw0Var.mo111086b() == null) {
                String str2 = this.f85682b;
                if (str2 != null ? str2.equals(vdw0Var.mo111085a()) : vdw0Var.mo111085a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f85681a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f85682b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.f85681a + ", appId=" + this.f85682b + "}";
    }
}
