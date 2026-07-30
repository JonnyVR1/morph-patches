package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class s6j0 {

    /* JADX INFO: renamed from: a */
    public final int f162829a;

    /* JADX INFO: renamed from: b */
    public final r6j0[] f162830b;

    /* JADX INFO: renamed from: c */
    public int f162831c;

    public s6j0(r6j0... r6j0VarArr) {
        this.f162830b = r6j0VarArr;
        this.f162829a = r6j0VarArr.length;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s6j0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f162830b, ((s6j0) obj).f162830b);
    }

    public int hashCode() {
        if (this.f162831c == 0) {
            this.f162831c = 527 + Arrays.hashCode(this.f162830b);
        }
        return this.f162831c;
    }
}
