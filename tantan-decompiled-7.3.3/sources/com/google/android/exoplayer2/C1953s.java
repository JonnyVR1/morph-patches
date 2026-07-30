package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1953s;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p153l.bmk0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.s */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1953s implements InterfaceC1886e {

    /* JADX INFO: renamed from: d */
    public static final C1953s f8284d = new C1953s(1.0f);

    /* JADX INFO: renamed from: e */
    public static final String f8285e = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: f */
    public static final String f8286f = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: g */
    public static final InterfaceC1886e.a<C1953s> f8287g = new InterfaceC1886e.a() { // from class: l.ge80
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return C1953s.m10950a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final float f8288a;

    /* JADX INFO: renamed from: b */
    public final float f8289b;

    /* JADX INFO: renamed from: c */
    public final int f8290c;

    public C1953s(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f2) {
        w11.m204365a(f > 0.0f);
        w11.m204365a(f2 > 0.0f);
        this.f8288a = f;
        this.f8289b = f2;
        this.f8290c = Math.round(f * 1000.0f);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1953s m10950a(Bundle bundle) {
        return new C1953s(bundle.getFloat(f8285e, 1.0f), bundle.getFloat(f8286f, 1.0f));
    }

    /* JADX INFO: renamed from: b */
    public long m10951b(long j) {
        return j * ((long) this.f8290c);
    }

    @CheckResult
    /* JADX INFO: renamed from: c */
    public C1953s m10952c(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f) {
        return new C1953s(f, this.f8289b);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1953s.class == obj.getClass()) {
            C1953s c1953s = (C1953s) obj;
            if (this.f8288a == c1953s.f8288a && this.f8289b == c1953s.f8289b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f8288a)) * 31) + Float.floatToRawIntBits(this.f8289b);
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f8285e, this.f8288a);
        bundle.putFloat(f8286f, this.f8289b);
        return bundle;
    }

    public String toString() {
        return bmk0.m105071D("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f8288a), Float.valueOf(this.f8289b));
    }

    public C1953s(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f) {
        this(f, 1.0f);
    }
}
