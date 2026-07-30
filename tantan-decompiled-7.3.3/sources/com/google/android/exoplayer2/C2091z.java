package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C2091z;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p153l.bmk0;
import p153l.k950;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.z */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2091z extends AbstractC2088w {

    /* JADX INFO: renamed from: e */
    public static final String f9670e = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: f */
    public static final String f9671f = bmk0.m105181z0(2);

    /* JADX INFO: renamed from: g */
    public static final InterfaceC1886e.a<C2091z> f9672g = new InterfaceC1886e.a() { // from class: l.j2g0
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return C2091z.m12269d(bundle);
        }
    };

    /* JADX INFO: renamed from: c */
    @IntRange(from = 1)
    public final int f9673c;

    /* JADX INFO: renamed from: d */
    public final float f9674d;

    public C2091z(@IntRange(from = 1) int i, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) float f) {
        boolean z = false;
        w11.m204366b(i > 0, "maxStars must be a positive integer");
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        w11.m204366b(z, "starRating is out of range [0, maxStars]");
        this.f9673c = i;
        this.f9674d = f;
    }

    /* JADX INFO: renamed from: d */
    public static C2091z m12269d(Bundle bundle) {
        w11.m204365a(bundle.getInt(AbstractC2088w.f9668a, -1) == 2);
        int i = bundle.getInt(f9670e, 5);
        float f = bundle.getFloat(f9671f, -1.0f);
        return f == -1.0f ? new C2091z(i) : new C2091z(i, f);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C2091z)) {
            return false;
        }
        C2091z c2091z = (C2091z) obj;
        return this.f9673c == c2091z.f9673c && this.f9674d == c2091z.f9674d;
    }

    public int hashCode() {
        return k950.m148864b(Integer.valueOf(this.f9673c), Float.valueOf(this.f9674d));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC2088w.f9668a, 2);
        bundle.putInt(f9670e, this.f9673c);
        bundle.putFloat(f9671f, this.f9674d);
        return bundle;
    }

    public C2091z(@IntRange(from = 1) int i) {
        w11.m204366b(i > 0, "maxStars must be a positive integer");
        this.f9673c = i;
        this.f9674d = -1.0f;
    }
}
