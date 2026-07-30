package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class pj1 {

    /* JADX INFO: renamed from: a */
    public final int f149706a;

    /* JADX INFO: renamed from: b */
    public final float f149707b;

    public pj1(int i, float f) {
        this.f149706a = i;
        this.f149707b = f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pj1.class == obj.getClass()) {
            pj1 pj1Var = (pj1) obj;
            if (this.f149706a == pj1Var.f149706a && Float.compare(pj1Var.f149707b, this.f149707b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f149706a) * 31) + Float.floatToIntBits(this.f149707b);
    }
}
