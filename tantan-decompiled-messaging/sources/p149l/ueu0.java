package p149l;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class ueu0 {

    /* JADX INFO: renamed from: e */
    public static final ueu0 f176200e = new ueu0(0, 0, 0, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final String f176201f = Integer.toString(0, 36);

    /* JADX INFO: renamed from: g */
    public static final String f176202g = Integer.toString(1, 36);

    /* JADX INFO: renamed from: h */
    public static final String f176203h = Integer.toString(2, 36);

    /* JADX INFO: renamed from: i */
    public static final String f176204i = Integer.toString(3, 36);

    /* JADX INFO: renamed from: j */
    @Deprecated
    public static final g8y0 f176205j = new g8y0() { // from class: l.odu0
    };

    /* JADX INFO: renamed from: a */
    @IntRange(from = 0)
    public final int f176206a;

    /* JADX INFO: renamed from: b */
    @IntRange(from = 0)
    public final int f176207b;

    /* JADX INFO: renamed from: c */
    @IntRange(from = 0, to = 359)
    public final int f176208c = 0;

    /* JADX INFO: renamed from: d */
    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false)
    public final float f176209d;

    public ueu0(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0, to = 359) int i3, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f) {
        this.f176206a = i;
        this.f176207b = i2;
        this.f176209d = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ueu0) {
            ueu0 ueu0Var = (ueu0) obj;
            if (this.f176206a == ueu0Var.f176206a && this.f176207b == ueu0Var.f176207b && this.f176209d == ueu0Var.f176209d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f176206a + 217) * 31) + this.f176207b) * 961) + Float.floatToRawIntBits(this.f176209d);
    }
}
