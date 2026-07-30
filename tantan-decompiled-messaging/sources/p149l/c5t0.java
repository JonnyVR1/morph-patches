package p149l;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class c5t0 {

    /* JADX INFO: renamed from: d */
    public static final c5t0 f79412d = new c5t0(1.0f, 1.0f);

    /* JADX INFO: renamed from: e */
    public static final String f79413e = Integer.toString(0, 36);

    /* JADX INFO: renamed from: f */
    public static final String f79414f = Integer.toString(1, 36);

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final g8y0 f79415g = new g8y0() { // from class: l.v3t0
    };

    /* JADX INFO: renamed from: a */
    public final float f79416a;

    /* JADX INFO: renamed from: b */
    public final float f79417b;

    /* JADX INFO: renamed from: c */
    public final int f79418c;

    public c5t0(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f2) {
        f5v0.m119533d(f > 0.0f);
        f5v0.m119533d(f2 > 0.0f);
        this.f79416a = f;
        this.f79417b = f2;
        this.f79418c = Math.round(f * 1000.0f);
    }

    /* JADX INFO: renamed from: a */
    public final long m105357a(long j) {
        return j * ((long) this.f79418c);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c5t0.class == obj.getClass()) {
            c5t0 c5t0Var = (c5t0) obj;
            if (this.f79416a == c5t0Var.f79416a && this.f79417b == c5t0Var.f79417b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f79416a) + 527) * 31) + Float.floatToRawIntBits(this.f79417b);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f79416a), Float.valueOf(this.f79417b));
    }
}
