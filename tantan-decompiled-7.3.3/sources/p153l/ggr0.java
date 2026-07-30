package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class ggr0 {

    /* JADX INFO: renamed from: a */
    public final int f104042a;

    /* JADX INFO: renamed from: b */
    public final byte[] f104043b;

    /* JADX INFO: renamed from: c */
    public final int f104044c;

    /* JADX INFO: renamed from: d */
    public final int f104045d;

    public ggr0(int i, byte[] bArr, int i2, int i3) {
        this.f104042a = i;
        this.f104043b = bArr;
        this.f104044c = i2;
        this.f104045d = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ggr0.class == obj.getClass()) {
            ggr0 ggr0Var = (ggr0) obj;
            if (this.f104042a == ggr0Var.f104042a && this.f104044c == ggr0Var.f104044c && this.f104045d == ggr0Var.f104045d && Arrays.equals(this.f104043b, ggr0Var.f104043b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f104042a * 31) + Arrays.hashCode(this.f104043b)) * 31) + this.f104044c) * 31) + this.f104045d;
    }
}
