package p153l;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zjl0 implements InterfaceC1886e {

    /* JADX INFO: renamed from: e */
    public static final zjl0 f204676e = new zjl0(0, 0);

    /* JADX INFO: renamed from: f */
    public static final String f204677f = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: g */
    public static final String f204678g = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: h */
    public static final String f204679h = bmk0.m105181z0(2);

    /* JADX INFO: renamed from: i */
    public static final String f204680i = bmk0.m105181z0(3);

    /* JADX INFO: renamed from: j */
    public static final InterfaceC1886e.a<zjl0> f204681j = new InterfaceC1886e.a() { // from class: l.yjl0
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return zjl0.m219976a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    @IntRange(from = 0)
    public final int f204682a;

    /* JADX INFO: renamed from: b */
    @IntRange(from = 0)
    public final int f204683b;

    /* JADX INFO: renamed from: c */
    @IntRange(from = 0, to = 359)
    public final int f204684c;

    /* JADX INFO: renamed from: d */
    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false)
    public final float f204685d;

    public zjl0(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0, to = 359) int i3, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f) {
        this.f204682a = i;
        this.f204683b = i2;
        this.f204684c = i3;
        this.f204685d = f;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ zjl0 m219976a(Bundle bundle) {
        return new zjl0(bundle.getInt(f204677f, 0), bundle.getInt(f204678g, 0), bundle.getInt(f204679h, 0), bundle.getFloat(f204680i, 1.0f));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zjl0) {
            zjl0 zjl0Var = (zjl0) obj;
            if (this.f204682a == zjl0Var.f204682a && this.f204683b == zjl0Var.f204683b && this.f204684c == zjl0Var.f204684c && this.f204685d == zjl0Var.f204685d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f204682a) * 31) + this.f204683b) * 31) + this.f204684c) * 31) + Float.floatToRawIntBits(this.f204685d);
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f204677f, this.f204682a);
        bundle.putInt(f204678g, this.f204683b);
        bundle.putInt(f204679h, this.f204684c);
        bundle.putFloat(f204680i, this.f204685d);
        return bundle;
    }

    public zjl0(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        this(i, i2, 0, 1.0f);
    }
}
