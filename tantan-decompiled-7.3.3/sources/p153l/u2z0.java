package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class u2z0 {

    /* JADX INFO: renamed from: a */
    public final long f177271a;

    /* JADX INFO: renamed from: b */
    public final long f177272b;

    public u2z0(long j, long j2) {
        this.f177271a = j;
        this.f177272b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2z0)) {
            return false;
        }
        u2z0 u2z0Var = (u2z0) obj;
        return this.f177271a == u2z0Var.f177271a && this.f177272b == u2z0Var.f177272b;
    }

    public final int hashCode() {
        return (((int) this.f177271a) * 31) + ((int) this.f177272b);
    }
}
