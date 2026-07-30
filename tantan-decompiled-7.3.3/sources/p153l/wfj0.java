package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wfj0 {

    /* JADX INFO: renamed from: a */
    public final int f188856a;

    /* JADX INFO: renamed from: b */
    public final vfj0[] f188857b;

    /* JADX INFO: renamed from: c */
    public int f188858c;

    public wfj0(vfj0... vfj0VarArr) {
        this.f188857b = vfj0VarArr;
        this.f188856a = vfj0VarArr.length;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wfj0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f188857b, ((wfj0) obj).f188857b);
    }

    public int hashCode() {
        if (this.f188858c == 0) {
            this.f188858c = 527 + Arrays.hashCode(this.f188857b);
        }
        return this.f188858c;
    }
}
