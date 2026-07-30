package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class o8s0 {

    /* JADX INFO: renamed from: a */
    public final long f145463a;

    /* JADX INFO: renamed from: b */
    public final String f145464b;

    /* JADX INFO: renamed from: c */
    public final int f145465c;

    public o8s0(long j, String str, int i) {
        this.f145463a = j;
        this.f145464b = str;
        this.f145465c = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof o8s0)) {
            o8s0 o8s0Var = (o8s0) obj;
            if (o8s0Var.f145463a == this.f145463a && o8s0Var.f145465c == this.f145465c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f145463a;
    }
}
