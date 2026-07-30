package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class gay0 {

    /* JADX INFO: renamed from: a */
    public final long f103033a;

    /* JADX INFO: renamed from: b */
    public final float f103034b;

    /* JADX INFO: renamed from: c */
    public final long f103035c;

    public /* synthetic */ gay0(z9y0 z9y0Var, cay0 cay0Var) {
        this.f103033a = z9y0Var.f203525a;
        this.f103034b = z9y0Var.f203526b;
        this.f103035c = z9y0Var.f203527c;
    }

    /* JADX INFO: renamed from: a */
    public final z9y0 m129751a() {
        return new z9y0(this, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gay0)) {
            return false;
        }
        gay0 gay0Var = (gay0) obj;
        return this.f103033a == gay0Var.f103033a && this.f103034b == gay0Var.f103034b && this.f103035c == gay0Var.f103035c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f103033a), Float.valueOf(this.f103034b), Long.valueOf(this.f103035c)});
    }
}
