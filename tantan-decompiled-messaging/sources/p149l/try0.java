package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class try0 {

    /* JADX INFO: renamed from: a */
    public final int f171883a;

    /* JADX INFO: renamed from: b */
    public final boolean f171884b;

    public try0(int i, boolean z) {
        this.f171883a = i;
        this.f171884b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && try0.class == obj.getClass()) {
            try0 try0Var = (try0) obj;
            if (this.f171883a == try0Var.f171883a && this.f171884b == try0Var.f171884b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f171883a * 31) + (this.f171884b ? 1 : 0);
    }
}
