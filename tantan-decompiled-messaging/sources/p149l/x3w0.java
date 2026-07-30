package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class x3w0 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final String f190923a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final String f190924b;

    public x3w0(@NonNull String str, @NonNull String str2) {
        this.f190923a = str;
        this.f190924b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3w0)) {
            return false;
        }
        x3w0 x3w0Var = (x3w0) obj;
        return this.f190923a.equals(x3w0Var.f190923a) && this.f190924b.equals(x3w0Var.f190924b);
    }

    public final int hashCode() {
        return String.valueOf(this.f190923a).concat(String.valueOf(this.f190924b)).hashCode();
    }
}
