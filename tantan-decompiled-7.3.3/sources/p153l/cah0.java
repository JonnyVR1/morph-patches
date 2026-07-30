package p153l;

import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class cah0 {

    /* JADX INFO: renamed from: a */
    public final Surface f80590a;

    /* JADX INFO: renamed from: b */
    public final int f80591b;

    /* JADX INFO: renamed from: c */
    public final int f80592c;

    /* JADX INFO: renamed from: d */
    public final int f80593d;

    public cah0(Surface surface, int i, int i2, int i3) {
        w11.m204366b(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f80590a = surface;
        this.f80591b = i;
        this.f80592c = i2;
        this.f80593d = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cah0)) {
            return false;
        }
        cah0 cah0Var = (cah0) obj;
        return this.f80591b == cah0Var.f80591b && this.f80592c == cah0Var.f80592c && this.f80593d == cah0Var.f80593d && this.f80590a.equals(cah0Var.f80590a);
    }

    public int hashCode() {
        return (((((this.f80590a.hashCode() * 31) + this.f80591b) * 31) + this.f80592c) * 31) + this.f80593d;
    }

    public cah0(Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }
}
