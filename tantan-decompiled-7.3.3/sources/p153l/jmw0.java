package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class jmw0 extends bnw0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f121715a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f121716b;

    public /* synthetic */ jmw0(String str, String str2, fmw0 fmw0Var) {
        this.f121715a = str;
        this.f121716b = str2;
    }

    @Override // p153l.bnw0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final String mo105630a() {
        return this.f121716b;
    }

    @Override // p153l.bnw0
    @Nullable
    /* JADX INFO: renamed from: b */
    public final String mo105631b() {
        return this.f121715a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnw0) {
            bnw0 bnw0Var = (bnw0) obj;
            String str = this.f121715a;
            if (str != null ? str.equals(bnw0Var.mo105631b()) : bnw0Var.mo105631b() == null) {
                String str2 = this.f121716b;
                if (str2 != null ? str2.equals(bnw0Var.mo105630a()) : bnw0Var.mo105630a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f121715a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f121716b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.f121715a + ", appId=" + this.f121716b + "}";
    }
}
