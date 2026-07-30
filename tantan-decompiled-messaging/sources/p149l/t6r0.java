package p149l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class t6r0 {

    /* JADX INFO: renamed from: a */
    public final w6r0 f168638a;

    /* JADX INFO: renamed from: b */
    public final w6r0 f168639b;

    public t6r0(w6r0 w6r0Var, w6r0 w6r0Var2) {
        this.f168638a = w6r0Var;
        this.f168639b = w6r0Var2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t6r0.class == obj.getClass()) {
            t6r0 t6r0Var = (t6r0) obj;
            if (this.f168638a.equals(t6r0Var.f168638a) && this.f168639b.equals(t6r0Var.f168639b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f168638a.hashCode() * 31) + this.f168639b.hashCode();
    }

    public final String toString() {
        w6r0 w6r0Var = this.f168638a;
        w6r0 w6r0Var2 = this.f168639b;
        return "[" + w6r0Var.toString() + (w6r0Var.equals(w6r0Var2) ? "" : ", ".concat(this.f168639b.toString())) + Constants.AES_SUFFIX;
    }
}
