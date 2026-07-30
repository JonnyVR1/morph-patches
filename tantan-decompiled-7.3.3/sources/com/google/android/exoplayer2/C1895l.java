package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1895l;
import com.google.android.exoplayer2.InterfaceC1886e;
import p153l.bmk0;
import p153l.k950;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.l */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1895l extends AbstractC2088w {

    /* JADX INFO: renamed from: e */
    public static final String f7832e = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: f */
    public static final String f7833f = bmk0.m105181z0(2);

    /* JADX INFO: renamed from: g */
    public static final InterfaceC1886e.a<C1895l> f7834g = new InterfaceC1886e.a() { // from class: l.l0l
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return C1895l.m10409d(bundle);
        }
    };

    /* JADX INFO: renamed from: c */
    public final boolean f7835c;

    /* JADX INFO: renamed from: d */
    public final boolean f7836d;

    public C1895l() {
        this.f7835c = false;
        this.f7836d = false;
    }

    /* JADX INFO: renamed from: d */
    public static C1895l m10409d(Bundle bundle) {
        w11.m204365a(bundle.getInt(AbstractC2088w.f9668a, -1) == 0);
        return bundle.getBoolean(f7832e, false) ? new C1895l(bundle.getBoolean(f7833f, false)) : new C1895l();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C1895l)) {
            return false;
        }
        C1895l c1895l = (C1895l) obj;
        return this.f7836d == c1895l.f7836d && this.f7835c == c1895l.f7835c;
    }

    public int hashCode() {
        return k950.m148864b(Boolean.valueOf(this.f7835c), Boolean.valueOf(this.f7836d));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC2088w.f9668a, 0);
        bundle.putBoolean(f7832e, this.f7835c);
        bundle.putBoolean(f7833f, this.f7836d);
        return bundle;
    }

    public C1895l(boolean z) {
        this.f7835c = true;
        this.f7836d = z;
    }
}
