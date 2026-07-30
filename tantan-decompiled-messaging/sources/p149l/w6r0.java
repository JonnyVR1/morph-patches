package p149l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class w6r0 {

    /* JADX INFO: renamed from: c */
    public static final w6r0 f184989c = new w6r0(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f184990a;

    /* JADX INFO: renamed from: b */
    public final long f184991b;

    public w6r0(long j, long j2) {
        this.f184990a = j;
        this.f184991b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w6r0.class == obj.getClass()) {
            w6r0 w6r0Var = (w6r0) obj;
            if (this.f184990a == w6r0Var.f184990a && this.f184991b == w6r0Var.f184991b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f184990a) * 31) + ((int) this.f184991b);
    }

    public final String toString() {
        return "[timeUs=" + this.f184990a + ", position=" + this.f184991b + Constants.AES_SUFFIX;
    }
}
