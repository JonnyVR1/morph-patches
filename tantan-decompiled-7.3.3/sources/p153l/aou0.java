package p153l;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class aou0 {

    /* JADX INFO: renamed from: e */
    public static final aou0 f72640e = new aou0(0, 0, 0, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final String f72641f = Integer.toString(0, 36);

    /* JADX INFO: renamed from: g */
    public static final String f72642g = Integer.toString(1, 36);

    /* JADX INFO: renamed from: h */
    public static final String f72643h = Integer.toString(2, 36);

    /* JADX INFO: renamed from: i */
    public static final String f72644i = Integer.toString(3, 36);

    /* JADX INFO: renamed from: j */
    @Deprecated
    public static final mhy0 f72645j = new mhy0() { // from class: l.umu0
    };

    /* JADX INFO: renamed from: a */
    @IntRange(from = 0)
    public final int f72646a;

    /* JADX INFO: renamed from: b */
    @IntRange(from = 0)
    public final int f72647b;

    /* JADX INFO: renamed from: c */
    @IntRange(from = 0, to = 359)
    public final int f72648c = 0;

    /* JADX INFO: renamed from: d */
    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false)
    public final float f72649d;

    public aou0(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0, to = 359) int i3, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f) {
        this.f72646a = i;
        this.f72647b = i2;
        this.f72649d = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aou0) {
            aou0 aou0Var = (aou0) obj;
            if (this.f72646a == aou0Var.f72646a && this.f72647b == aou0Var.f72647b && this.f72649d == aou0Var.f72649d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f72646a + 217) * 31) + this.f72647b) * 961) + Float.floatToRawIntBits(this.f72649d);
    }
}
