package p153l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class cgr0 {

    /* JADX INFO: renamed from: c */
    public static final cgr0 f81725c = new cgr0(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f81726a;

    /* JADX INFO: renamed from: b */
    public final long f81727b;

    public cgr0(long j, long j2) {
        this.f81726a = j;
        this.f81727b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cgr0.class == obj.getClass()) {
            cgr0 cgr0Var = (cgr0) obj;
            if (this.f81726a == cgr0Var.f81726a && this.f81727b == cgr0Var.f81727b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f81726a) * 31) + ((int) this.f81727b);
    }

    public final String toString() {
        return "[timeUs=" + this.f81726a + ", position=" + this.f81727b + Constants.AES_SUFFIX;
    }
}
