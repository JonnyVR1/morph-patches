package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wj1 {

    /* JADX INFO: renamed from: a */
    public final int f189407a;

    /* JADX INFO: renamed from: b */
    public final float f189408b;

    public wj1(int i, float f) {
        this.f189407a = i;
        this.f189408b = f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wj1.class == obj.getClass()) {
            wj1 wj1Var = (wj1) obj;
            if (this.f189407a == wj1Var.f189407a && Float.compare(wj1Var.f189408b, this.f189408b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f189407a) * 31) + Float.floatToIntBits(this.f189408b);
    }
}
