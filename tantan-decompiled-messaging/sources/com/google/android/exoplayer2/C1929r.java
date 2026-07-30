package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1929r;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.p11;
import p149l.v050;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.r */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1929r extends AbstractC2065w {

    /* JADX INFO: renamed from: d */
    public static final String f8244d = vck0.m197903z0(1);

    /* JADX INFO: renamed from: e */
    public static final InterfaceC1863e.a<C1929r> f8245e = new InterfaceC1863e.a() { // from class: l.aj60
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return C1929r.m10895d(bundle);
        }
    };

    /* JADX INFO: renamed from: c */
    public final float f8246c;

    public C1929r(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f) {
        p11.m167008b(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f8246c = f;
    }

    /* JADX INFO: renamed from: d */
    public static C1929r m10895d(Bundle bundle) {
        p11.m167007a(bundle.getInt(AbstractC2065w.f9631a, -1) == 1);
        float f = bundle.getFloat(f8244d, -1.0f);
        return f == -1.0f ? new C1929r() : new C1929r(f);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C1929r) && this.f8246c == ((C1929r) obj).f8246c;
    }

    public int hashCode() {
        return v050.m196471b(Float.valueOf(this.f8246c));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC2065w.f9631a, 1);
        bundle.putFloat(f8244d, this.f8246c);
        return bundle;
    }

    public C1929r() {
        this.f8246c = -1.0f;
    }
}
