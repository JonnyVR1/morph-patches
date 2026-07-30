package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1832b0;
import com.google.android.exoplayer2.InterfaceC1863e;
import p149l.p11;
import p149l.v050;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.b0 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1832b0 extends AbstractC2065w {

    /* JADX INFO: renamed from: e */
    public static final String f7283e = vck0.m197903z0(1);

    /* JADX INFO: renamed from: f */
    public static final String f7284f = vck0.m197903z0(2);

    /* JADX INFO: renamed from: g */
    public static final InterfaceC1863e.a<C1832b0> f7285g = new InterfaceC1863e.a() { // from class: l.vpi0
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return C1832b0.m9702d(bundle);
        }
    };

    /* JADX INFO: renamed from: c */
    public final boolean f7286c;

    /* JADX INFO: renamed from: d */
    public final boolean f7287d;

    public C1832b0() {
        this.f7286c = false;
        this.f7287d = false;
    }

    /* JADX INFO: renamed from: d */
    public static C1832b0 m9702d(Bundle bundle) {
        p11.m167007a(bundle.getInt(AbstractC2065w.f9631a, -1) == 3);
        return bundle.getBoolean(f7283e, false) ? new C1832b0(bundle.getBoolean(f7284f, false)) : new C1832b0();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C1832b0)) {
            return false;
        }
        C1832b0 c1832b0 = (C1832b0) obj;
        return this.f7287d == c1832b0.f7287d && this.f7286c == c1832b0.f7286c;
    }

    public int hashCode() {
        return v050.m196471b(Boolean.valueOf(this.f7286c), Boolean.valueOf(this.f7287d));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC2065w.f9631a, 3);
        bundle.putBoolean(f7283e, this.f7286c);
        bundle.putBoolean(f7284f, this.f7287d);
        return bundle;
    }

    public C1832b0(boolean z) {
        this.f7286c = true;
        this.f7287d = z;
    }
}
