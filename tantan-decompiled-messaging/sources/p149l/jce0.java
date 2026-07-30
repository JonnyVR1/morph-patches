package p149l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jce0 {

    /* JADX INFO: renamed from: c */
    public static final jce0 f117294c = new jce0(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f117295a;

    /* JADX INFO: renamed from: b */
    public final long f117296b;

    public jce0(long j, long j2) {
        this.f117295a = j;
        this.f117296b = j2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jce0.class == obj.getClass()) {
            jce0 jce0Var = (jce0) obj;
            if (this.f117295a == jce0Var.f117295a && this.f117296b == jce0Var.f117296b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f117295a) * 31) + ((int) this.f117296b);
    }

    public String toString() {
        return "[timeUs=" + this.f117295a + ", position=" + this.f117296b + Constants.AES_SUFFIX;
    }
}
