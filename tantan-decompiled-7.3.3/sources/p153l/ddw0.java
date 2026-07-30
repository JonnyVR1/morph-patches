package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ddw0 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final String f87969a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final String f87970b;

    public ddw0(@NonNull String str, @NonNull String str2) {
        this.f87969a = str;
        this.f87970b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddw0)) {
            return false;
        }
        ddw0 ddw0Var = (ddw0) obj;
        return this.f87969a.equals(ddw0Var.f87969a) && this.f87970b.equals(ddw0Var.f87970b);
    }

    public final int hashCode() {
        return String.valueOf(this.f87969a).concat(String.valueOf(this.f87970b)).hashCode();
    }
}
