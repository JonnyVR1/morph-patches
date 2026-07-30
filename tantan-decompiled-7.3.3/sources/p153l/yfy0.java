package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class yfy0 {

    /* JADX INFO: renamed from: a */
    public final long f199684a;

    /* JADX INFO: renamed from: b */
    public final d0u0 f199685b;

    /* JADX INFO: renamed from: c */
    public final int f199686c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final kzy0 f199687d;

    /* JADX INFO: renamed from: e */
    public final long f199688e;

    /* JADX INFO: renamed from: f */
    public final d0u0 f199689f;

    /* JADX INFO: renamed from: g */
    public final int f199690g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final kzy0 f199691h;

    /* JADX INFO: renamed from: i */
    public final long f199692i;

    /* JADX INFO: renamed from: j */
    public final long f199693j;

    public yfy0(long j, d0u0 d0u0Var, int i, @Nullable kzy0 kzy0Var, long j2, d0u0 d0u0Var2, int i2, @Nullable kzy0 kzy0Var2, long j3, long j4) {
        this.f199684a = j;
        this.f199685b = d0u0Var;
        this.f199686c = i;
        this.f199687d = kzy0Var;
        this.f199688e = j2;
        this.f199689f = d0u0Var2;
        this.f199690g = i2;
        this.f199691h = kzy0Var2;
        this.f199692i = j3;
        this.f199693j = j4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yfy0.class == obj.getClass()) {
            yfy0 yfy0Var = (yfy0) obj;
            if (this.f199684a == yfy0Var.f199684a && this.f199686c == yfy0Var.f199686c && this.f199688e == yfy0Var.f199688e && this.f199690g == yfy0Var.f199690g && this.f199692i == yfy0Var.f199692i && this.f199693j == yfy0Var.f199693j && kow0.m150688a(this.f199685b, yfy0Var.f199685b) && kow0.m150688a(this.f199687d, yfy0Var.f199687d) && kow0.m150688a(this.f199689f, yfy0Var.f199689f) && kow0.m150688a(this.f199691h, yfy0Var.f199691h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f199684a), this.f199685b, Integer.valueOf(this.f199686c), this.f199687d, Long.valueOf(this.f199688e), this.f199689f, Integer.valueOf(this.f199690g), this.f199691h, Long.valueOf(this.f199692i), Long.valueOf(this.f199693j)});
    }
}
