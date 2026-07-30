package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C2068z;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.p11;
import p149l.v050;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.z */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2068z extends AbstractC2065w {

    /* JADX INFO: renamed from: e */
    public static final String f9633e = vck0.m197903z0(1);

    /* JADX INFO: renamed from: f */
    public static final String f9634f = vck0.m197903z0(2);

    /* JADX INFO: renamed from: g */
    public static final InterfaceC1863e.a<C2068z> f9635g = new InterfaceC1863e.a() { // from class: l.auf0
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return C2068z.m12215d(bundle);
        }
    };

    /* JADX INFO: renamed from: c */
    @IntRange(from = 1)
    public final int f9636c;

    /* JADX INFO: renamed from: d */
    public final float f9637d;

    public C2068z(@IntRange(from = 1) int i, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) float f) {
        boolean z = false;
        p11.m167008b(i > 0, "maxStars must be a positive integer");
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        p11.m167008b(z, "starRating is out of range [0, maxStars]");
        this.f9636c = i;
        this.f9637d = f;
    }

    /* JADX INFO: renamed from: d */
    public static C2068z m12215d(Bundle bundle) {
        p11.m167007a(bundle.getInt(AbstractC2065w.f9631a, -1) == 2);
        int i = bundle.getInt(f9633e, 5);
        float f = bundle.getFloat(f9634f, -1.0f);
        return f == -1.0f ? new C2068z(i) : new C2068z(i, f);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C2068z)) {
            return false;
        }
        C2068z c2068z = (C2068z) obj;
        return this.f9636c == c2068z.f9636c && this.f9637d == c2068z.f9637d;
    }

    public int hashCode() {
        return v050.m196471b(Integer.valueOf(this.f9636c), Float.valueOf(this.f9637d));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC2065w.f9631a, 2);
        bundle.putInt(f9633e, this.f9636c);
        bundle.putFloat(f9634f, this.f9637d);
        return bundle;
    }

    public C2068z(@IntRange(from = 1) int i) {
        p11.m167008b(i > 0, "maxStars must be a positive integer");
        this.f9636c = i;
        this.f9637d = -1.0f;
    }
}
