package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class erc0 {

    /* JADX INFO: renamed from: b */
    public static final erc0 f92902b = new erc0(false);

    /* JADX INFO: renamed from: a */
    public final boolean f92903a;

    public erc0(boolean z) {
        this.f92903a = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && erc0.class == obj.getClass() && this.f92903a == ((erc0) obj).f92903a;
    }

    public int hashCode() {
        return !this.f92903a ? 1 : 0;
    }
}
