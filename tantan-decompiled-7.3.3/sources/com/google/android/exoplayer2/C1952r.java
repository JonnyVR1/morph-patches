package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1952r;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p153l.bmk0;
import p153l.k950;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.r */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1952r extends AbstractC2088w {

    /* JADX INFO: renamed from: d */
    public static final String f8281d = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: e */
    public static final InterfaceC1886e.a<C1952r> f8282e = new InterfaceC1886e.a() { // from class: l.fr60
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return C1952r.m10949d(bundle);
        }
    };

    /* JADX INFO: renamed from: c */
    public final float f8283c;

    public C1952r(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f) {
        w11.m204366b(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f8283c = f;
    }

    /* JADX INFO: renamed from: d */
    public static C1952r m10949d(Bundle bundle) {
        w11.m204365a(bundle.getInt(AbstractC2088w.f9668a, -1) == 1);
        float f = bundle.getFloat(f8281d, -1.0f);
        return f == -1.0f ? new C1952r() : new C1952r(f);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C1952r) && this.f8283c == ((C1952r) obj).f8283c;
    }

    public int hashCode() {
        return k950.m148864b(Float.valueOf(this.f8283c));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC2088w.f9668a, 1);
        bundle.putFloat(f8281d, this.f8283c);
        return bundle;
    }

    public C1952r() {
        this.f8283c = -1.0f;
    }
}
