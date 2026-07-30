package p153l;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class iet0 {

    /* JADX INFO: renamed from: d */
    public static final iet0 f114611d = new iet0(1.0f, 1.0f);

    /* JADX INFO: renamed from: e */
    public static final String f114612e = Integer.toString(0, 36);

    /* JADX INFO: renamed from: f */
    public static final String f114613f = Integer.toString(1, 36);

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final mhy0 f114614g = new mhy0() { // from class: l.bdt0
    };

    /* JADX INFO: renamed from: a */
    public final float f114615a;

    /* JADX INFO: renamed from: b */
    public final float f114616b;

    /* JADX INFO: renamed from: c */
    public final int f114617c;

    public iet0(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f2) {
        lev0.m153956d(f > 0.0f);
        lev0.m153956d(f2 > 0.0f);
        this.f114615a = f;
        this.f114616b = f2;
        this.f114617c = Math.round(f * 1000.0f);
    }

    /* JADX INFO: renamed from: a */
    public final long m139648a(long j) {
        return j * ((long) this.f114617c);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iet0.class == obj.getClass()) {
            iet0 iet0Var = (iet0) obj;
            if (this.f114615a == iet0Var.f114615a && this.f114616b == iet0Var.f114616b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f114615a) + 527) * 31) + Float.floatToRawIntBits(this.f114616b);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f114615a), Float.valueOf(this.f114616b));
    }
}
