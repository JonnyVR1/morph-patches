package p153l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class mqu0 {

    /* JADX INFO: renamed from: e */
    public static final mqu0 f138275e = new mqu0(-1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f138276a;

    /* JADX INFO: renamed from: b */
    public final int f138277b;

    /* JADX INFO: renamed from: c */
    public final int f138278c;

    /* JADX INFO: renamed from: d */
    public final int f138279d;

    public mqu0(int i, int i2, int i3) {
        this.f138276a = i;
        this.f138277b = i2;
        this.f138278c = i3;
        this.f138279d = mpw0.m159410h(i3) ? mpw0.m159388A(i3, i2) : -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqu0)) {
            return false;
        }
        mqu0 mqu0Var = (mqu0) obj;
        return this.f138276a == mqu0Var.f138276a && this.f138277b == mqu0Var.f138277b && this.f138278c == mqu0Var.f138278c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f138276a), Integer.valueOf(this.f138277b), Integer.valueOf(this.f138278c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f138276a + ", channelCount=" + this.f138277b + ", encoding=" + this.f138278c + Constants.AES_SUFFIX;
    }
}
