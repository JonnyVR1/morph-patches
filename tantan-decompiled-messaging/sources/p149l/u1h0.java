package p149l;

import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class u1h0 {

    /* JADX INFO: renamed from: a */
    public final Surface f173012a;

    /* JADX INFO: renamed from: b */
    public final int f173013b;

    /* JADX INFO: renamed from: c */
    public final int f173014c;

    /* JADX INFO: renamed from: d */
    public final int f173015d;

    public u1h0(Surface surface, int i, int i2, int i3) {
        p11.m167008b(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f173012a = surface;
        this.f173013b = i;
        this.f173014c = i2;
        this.f173015d = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1h0)) {
            return false;
        }
        u1h0 u1h0Var = (u1h0) obj;
        return this.f173013b == u1h0Var.f173013b && this.f173014c == u1h0Var.f173014c && this.f173015d == u1h0Var.f173015d && this.f173012a.equals(u1h0Var.f173012a);
    }

    public int hashCode() {
        return (((((this.f173012a.hashCode() * 31) + this.f173013b) * 31) + this.f173014c) * 31) + this.f173015d;
    }

    public u1h0(Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }
}
