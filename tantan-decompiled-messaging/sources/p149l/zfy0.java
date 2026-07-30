package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class zfy0 {

    /* JADX INFO: renamed from: d */
    public static final zfy0 f202996d = new vfy0().m198307d();

    /* JADX INFO: renamed from: a */
    public final boolean f202997a;

    /* JADX INFO: renamed from: b */
    public final boolean f202998b;

    /* JADX INFO: renamed from: c */
    public final boolean f202999c;

    public /* synthetic */ zfy0(vfy0 vfy0Var, xfy0 xfy0Var) {
        this.f202997a = vfy0Var.f181336a;
        this.f202998b = vfy0Var.f181337b;
        this.f202999c = vfy0Var.f181338c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zfy0.class == obj.getClass()) {
            zfy0 zfy0Var = (zfy0) obj;
            if (this.f202997a == zfy0Var.f202997a && this.f202998b == zfy0Var.f202998b && this.f202999c == zfy0Var.f202999c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.f202997a;
        boolean z2 = this.f202998b;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.f202999c ? 1 : 0);
    }
}
