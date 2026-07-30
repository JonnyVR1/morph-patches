package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jzc0 {

    /* JADX INFO: renamed from: b */
    public static final jzc0 f123254b = new jzc0(false);

    /* JADX INFO: renamed from: a */
    public final boolean f123255a;

    public jzc0(boolean z) {
        this.f123255a = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && jzc0.class == obj.getClass() && this.f123255a == ((jzc0) obj).f123255a;
    }

    public int hashCode() {
        return !this.f123255a ? 1 : 0;
    }
}
