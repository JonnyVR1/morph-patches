package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class xlw0 extends lmw0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f195020a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f195021b;

    public /* synthetic */ xlw0(String str, String str2, wlw0 wlw0Var) {
        this.f195020a = str;
        this.f195021b = str2;
    }

    @Override // p153l.lmw0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final String mo154893a() {
        return this.f195021b;
    }

    @Override // p153l.lmw0
    @Nullable
    /* JADX INFO: renamed from: b */
    public final String mo154894b() {
        return this.f195020a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lmw0) {
            lmw0 lmw0Var = (lmw0) obj;
            String str = this.f195020a;
            if (str != null ? str.equals(lmw0Var.mo154894b()) : lmw0Var.mo154894b() == null) {
                String str2 = this.f195021b;
                if (str2 != null ? str2.equals(lmw0Var.mo154893a()) : lmw0Var.mo154893a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f195020a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f195021b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.f195020a + ", appId=" + this.f195021b + "}";
    }
}
