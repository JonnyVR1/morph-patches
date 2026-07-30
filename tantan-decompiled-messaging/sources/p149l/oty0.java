package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class oty0 {

    /* JADX INFO: renamed from: a */
    public final long f145639a;

    /* JADX INFO: renamed from: b */
    public final long f145640b;

    public oty0(long j, long j2) {
        this.f145639a = j;
        this.f145640b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oty0)) {
            return false;
        }
        oty0 oty0Var = (oty0) obj;
        return this.f145639a == oty0Var.f145639a && this.f145640b == oty0Var.f145640b;
    }

    public final int hashCode() {
        return (((int) this.f145639a) * 31) + ((int) this.f145640b);
    }
}
