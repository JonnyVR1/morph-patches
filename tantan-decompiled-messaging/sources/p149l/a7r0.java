package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class a7r0 {

    /* JADX INFO: renamed from: a */
    public final int f67946a;

    /* JADX INFO: renamed from: b */
    public final byte[] f67947b;

    /* JADX INFO: renamed from: c */
    public final int f67948c;

    /* JADX INFO: renamed from: d */
    public final int f67949d;

    public a7r0(int i, byte[] bArr, int i2, int i3) {
        this.f67946a = i;
        this.f67947b = bArr;
        this.f67948c = i2;
        this.f67949d = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a7r0.class == obj.getClass()) {
            a7r0 a7r0Var = (a7r0) obj;
            if (this.f67946a == a7r0Var.f67946a && this.f67948c == a7r0Var.f67948c && this.f67949d == a7r0Var.f67949d && Arrays.equals(this.f67947b, a7r0Var.f67947b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f67946a * 31) + Arrays.hashCode(this.f67947b)) * 31) + this.f67948c) * 31) + this.f67949d;
    }
}
