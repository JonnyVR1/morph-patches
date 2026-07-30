package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1872l;
import com.google.android.exoplayer2.InterfaceC1863e;
import p149l.p11;
import p149l.v050;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.l */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1872l extends AbstractC2065w {

    /* JADX INFO: renamed from: e */
    public static final String f7795e = vck0.m197903z0(1);

    /* JADX INFO: renamed from: f */
    public static final String f7796f = vck0.m197903z0(2);

    /* JADX INFO: renamed from: g */
    public static final InterfaceC1863e.a<C1872l> f7797g = new InterfaceC1863e.a() { // from class: l.vxk
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return C1872l.m10355d(bundle);
        }
    };

    /* JADX INFO: renamed from: c */
    public final boolean f7798c;

    /* JADX INFO: renamed from: d */
    public final boolean f7799d;

    public C1872l() {
        this.f7798c = false;
        this.f7799d = false;
    }

    /* JADX INFO: renamed from: d */
    public static C1872l m10355d(Bundle bundle) {
        p11.m167007a(bundle.getInt(AbstractC2065w.f9631a, -1) == 0);
        return bundle.getBoolean(f7795e, false) ? new C1872l(bundle.getBoolean(f7796f, false)) : new C1872l();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C1872l)) {
            return false;
        }
        C1872l c1872l = (C1872l) obj;
        return this.f7799d == c1872l.f7799d && this.f7798c == c1872l.f7798c;
    }

    public int hashCode() {
        return v050.m196471b(Boolean.valueOf(this.f7798c), Boolean.valueOf(this.f7799d));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC2065w.f9631a, 0);
        bundle.putBoolean(f7795e, this.f7798c);
        bundle.putBoolean(f7796f, this.f7799d);
        return bundle;
    }

    public C1872l(boolean z) {
        this.f7798c = true;
        this.f7799d = z;
    }
}
