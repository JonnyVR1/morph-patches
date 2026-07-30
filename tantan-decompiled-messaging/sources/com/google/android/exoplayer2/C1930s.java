package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1930s;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.s */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1930s implements InterfaceC1863e {

    /* JADX INFO: renamed from: d */
    public static final C1930s f8247d = new C1930s(1.0f);

    /* JADX INFO: renamed from: e */
    public static final String f8248e = vck0.m197903z0(0);

    /* JADX INFO: renamed from: f */
    public static final String f8249f = vck0.m197903z0(1);

    /* JADX INFO: renamed from: g */
    public static final InterfaceC1863e.a<C1930s> f8250g = new InterfaceC1863e.a() { // from class: l.a680
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return C1930s.m10896a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final float f8251a;

    /* JADX INFO: renamed from: b */
    public final float f8252b;

    /* JADX INFO: renamed from: c */
    public final int f8253c;

    public C1930s(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f2) {
        p11.m167007a(f > 0.0f);
        p11.m167007a(f2 > 0.0f);
        this.f8251a = f;
        this.f8252b = f2;
        this.f8253c = Math.round(f * 1000.0f);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1930s m10896a(Bundle bundle) {
        return new C1930s(bundle.getFloat(f8248e, 1.0f), bundle.getFloat(f8249f, 1.0f));
    }

    /* JADX INFO: renamed from: b */
    public long m10897b(long j) {
        return j * ((long) this.f8253c);
    }

    @CheckResult
    /* JADX INFO: renamed from: c */
    public C1930s m10898c(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f) {
        return new C1930s(f, this.f8252b);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1930s.class == obj.getClass()) {
            C1930s c1930s = (C1930s) obj;
            if (this.f8251a == c1930s.f8251a && this.f8252b == c1930s.f8252b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f8251a)) * 31) + Float.floatToRawIntBits(this.f8252b);
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f8248e, this.f8251a);
        bundle.putFloat(f8249f, this.f8252b);
        return bundle;
    }

    public String toString() {
        return vck0.m197793D("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f8251a), Float.valueOf(this.f8252b));
    }

    public C1930s(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f) {
        this(f, 1.0f);
    }
}
