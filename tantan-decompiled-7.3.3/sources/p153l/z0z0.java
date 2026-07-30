package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class z0z0 {

    /* JADX INFO: renamed from: a */
    public final int f202469a;

    /* JADX INFO: renamed from: b */
    public final boolean f202470b;

    public z0z0(int i, boolean z) {
        this.f202469a = i;
        this.f202470b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0z0.class == obj.getClass()) {
            z0z0 z0z0Var = (z0z0) obj;
            if (this.f202469a == z0z0Var.f202469a && this.f202470b == z0z0Var.f202470b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f202469a * 31) + (this.f202470b ? 1 : 0);
    }
}
