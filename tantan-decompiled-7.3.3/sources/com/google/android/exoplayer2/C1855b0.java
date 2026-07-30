package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1855b0;
import com.google.android.exoplayer2.InterfaceC1886e;
import p153l.bmk0;
import p153l.k950;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.b0 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1855b0 extends AbstractC2088w {

    /* JADX INFO: renamed from: e */
    public static final String f7320e = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: f */
    public static final String f7321f = bmk0.m105181z0(2);

    /* JADX INFO: renamed from: g */
    public static final InterfaceC1886e.a<C1855b0> f7322g = new InterfaceC1886e.a() { // from class: l.yyi0
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return C1855b0.m9756d(bundle);
        }
    };

    /* JADX INFO: renamed from: c */
    public final boolean f7323c;

    /* JADX INFO: renamed from: d */
    public final boolean f7324d;

    public C1855b0() {
        this.f7323c = false;
        this.f7324d = false;
    }

    /* JADX INFO: renamed from: d */
    public static C1855b0 m9756d(Bundle bundle) {
        w11.m204365a(bundle.getInt(AbstractC2088w.f9668a, -1) == 3);
        return bundle.getBoolean(f7320e, false) ? new C1855b0(bundle.getBoolean(f7321f, false)) : new C1855b0();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C1855b0)) {
            return false;
        }
        C1855b0 c1855b0 = (C1855b0) obj;
        return this.f7324d == c1855b0.f7324d && this.f7323c == c1855b0.f7323c;
    }

    public int hashCode() {
        return k950.m148864b(Boolean.valueOf(this.f7323c), Boolean.valueOf(this.f7324d));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC2088w.f9668a, 3);
        bundle.putBoolean(f7320e, this.f7323c);
        bundle.putBoolean(f7321f, this.f7324d);
        return bundle;
    }

    public C1855b0(boolean z) {
        this.f7323c = true;
        this.f7324d = z;
    }
}
