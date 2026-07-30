package p153l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class zfr0 {

    /* JADX INFO: renamed from: a */
    public final cgr0 f204191a;

    /* JADX INFO: renamed from: b */
    public final cgr0 f204192b;

    public zfr0(cgr0 cgr0Var, cgr0 cgr0Var2) {
        this.f204191a = cgr0Var;
        this.f204192b = cgr0Var2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zfr0.class == obj.getClass()) {
            zfr0 zfr0Var = (zfr0) obj;
            if (this.f204191a.equals(zfr0Var.f204191a) && this.f204192b.equals(zfr0Var.f204192b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f204191a.hashCode() * 31) + this.f204192b.hashCode();
    }

    public final String toString() {
        cgr0 cgr0Var = this.f204191a;
        cgr0 cgr0Var2 = this.f204192b;
        return "[" + cgr0Var.toString() + (cgr0Var.equals(cgr0Var2) ? "" : ", ".concat(this.f204192b.toString())) + Constants.AES_SUFFIX;
    }
}
