package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class a1y0 {

    /* JADX INFO: renamed from: a */
    public final long f67207a;

    /* JADX INFO: renamed from: b */
    public final float f67208b;

    /* JADX INFO: renamed from: c */
    public final long f67209c;

    public /* synthetic */ a1y0(t0y0 t0y0Var, w0y0 w0y0Var) {
        this.f67207a = t0y0Var.f167217a;
        this.f67208b = t0y0Var.f167218b;
        this.f67209c = t0y0Var.f167219c;
    }

    /* JADX INFO: renamed from: a */
    public final t0y0 m94584a() {
        return new t0y0(this, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1y0)) {
            return false;
        }
        a1y0 a1y0Var = (a1y0) obj;
        return this.f67207a == a1y0Var.f67207a && this.f67208b == a1y0Var.f67208b && this.f67209c == a1y0Var.f67209c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f67207a), Float.valueOf(this.f67208b), Long.valueOf(this.f67209c)});
    }
}
