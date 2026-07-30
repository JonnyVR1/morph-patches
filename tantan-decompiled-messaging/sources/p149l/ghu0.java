package p149l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class ghu0 {

    /* JADX INFO: renamed from: e */
    public static final ghu0 f102815e = new ghu0(-1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f102816a;

    /* JADX INFO: renamed from: b */
    public final int f102817b;

    /* JADX INFO: renamed from: c */
    public final int f102818c;

    /* JADX INFO: renamed from: d */
    public final int f102819d;

    public ghu0(int i, int i2, int i3) {
        this.f102816a = i;
        this.f102817b = i2;
        this.f102818c = i3;
        this.f102819d = ggw0.m126066h(i3) ? ggw0.m126044A(i3, i2) : -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghu0)) {
            return false;
        }
        ghu0 ghu0Var = (ghu0) obj;
        return this.f102816a == ghu0Var.f102816a && this.f102817b == ghu0Var.f102817b && this.f102818c == ghu0Var.f102818c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f102816a), Integer.valueOf(this.f102817b), Integer.valueOf(this.f102818c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f102816a + ", channelCount=" + this.f102817b + ", encoding=" + this.f102818c + Constants.AES_SUFFIX;
    }
}
