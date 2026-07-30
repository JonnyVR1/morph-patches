package p149l;

import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class sif0 {

    /* JADX INFO: renamed from: c */
    public static final sif0 f164712c = new sif0(-1, -1);

    /* JADX INFO: renamed from: d */
    public static final sif0 f164713d = new sif0(0, 0);

    /* JADX INFO: renamed from: a */
    public final int f164714a;

    /* JADX INFO: renamed from: b */
    public final int f164715b;

    public sif0(int i, int i2) {
        p11.m167007a((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f164714a = i;
        this.f164715b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m184337a() {
        return this.f164715b;
    }

    /* JADX INFO: renamed from: b */
    public int m184338b() {
        return this.f164714a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof sif0) {
            sif0 sif0Var = (sif0) obj;
            if (this.f164714a == sif0Var.f164714a && this.f164715b == sif0Var.f164715b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f164715b;
        int i2 = this.f164714a;
        return ((i2 >>> 16) | (i2 << 16)) ^ i;
    }

    public String toString() {
        return this.f164714a + BaseSei.f13930X + this.f164715b;
    }
}
