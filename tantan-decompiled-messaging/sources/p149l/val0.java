package p149l;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class val0 implements InterfaceC1863e {

    /* JADX INFO: renamed from: e */
    public static final val0 f180759e = new val0(0, 0);

    /* JADX INFO: renamed from: f */
    public static final String f180760f = vck0.m197903z0(0);

    /* JADX INFO: renamed from: g */
    public static final String f180761g = vck0.m197903z0(1);

    /* JADX INFO: renamed from: h */
    public static final String f180762h = vck0.m197903z0(2);

    /* JADX INFO: renamed from: i */
    public static final String f180763i = vck0.m197903z0(3);

    /* JADX INFO: renamed from: j */
    public static final InterfaceC1863e.a<val0> f180764j = new InterfaceC1863e.a() { // from class: l.ual0
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return val0.m197642a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    @IntRange(from = 0)
    public final int f180765a;

    /* JADX INFO: renamed from: b */
    @IntRange(from = 0)
    public final int f180766b;

    /* JADX INFO: renamed from: c */
    @IntRange(from = 0, to = 359)
    public final int f180767c;

    /* JADX INFO: renamed from: d */
    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false)
    public final float f180768d;

    public val0(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0, to = 359) int i3, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f) {
        this.f180765a = i;
        this.f180766b = i2;
        this.f180767c = i3;
        this.f180768d = f;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ val0 m197642a(Bundle bundle) {
        return new val0(bundle.getInt(f180760f, 0), bundle.getInt(f180761g, 0), bundle.getInt(f180762h, 0), bundle.getFloat(f180763i, 1.0f));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof val0) {
            val0 val0Var = (val0) obj;
            if (this.f180765a == val0Var.f180765a && this.f180766b == val0Var.f180766b && this.f180767c == val0Var.f180767c && this.f180768d == val0Var.f180768d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f180765a) * 31) + this.f180766b) * 31) + this.f180767c) * 31) + Float.floatToRawIntBits(this.f180768d);
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f180760f, this.f180765a);
        bundle.putInt(f180761g, this.f180766b);
        bundle.putInt(f180762h, this.f180767c);
        bundle.putFloat(f180763i, this.f180768d);
        return bundle;
    }

    public val0(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        this(i, i2, 0, 1.0f);
    }
}
