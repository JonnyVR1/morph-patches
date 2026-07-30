package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1861d0;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.common.base.C2677a;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Booleans;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p153l.bmk0;
import p153l.cj3;
import p153l.dfj0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.d0 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1861d0 implements InterfaceC1886e {

    /* JADX INFO: renamed from: b */
    public static final C1861d0 f7397b = new C1861d0(ImmutableList.m15739of());

    /* JADX INFO: renamed from: c */
    public static final String f7398c = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: d */
    public static final InterfaceC1886e.a<C1861d0> f7399d = new InterfaceC1886e.a() { // from class: l.ggj0
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return C1861d0.m9840a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final ImmutableList<a> f7400a;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.d0$a */
    public static final class a implements InterfaceC1886e {

        /* JADX INFO: renamed from: f */
        public static final String f7401f = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: g */
        public static final String f7402g = bmk0.m105181z0(1);

        /* JADX INFO: renamed from: h */
        public static final String f7403h = bmk0.m105181z0(3);

        /* JADX INFO: renamed from: i */
        public static final String f7404i = bmk0.m105181z0(4);

        /* JADX INFO: renamed from: j */
        public static final InterfaceC1886e.a<a> f7405j = new InterfaceC1886e.a() { // from class: l.hgj0
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return C1861d0.a.m9846a(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final int f7406a;

        /* JADX INFO: renamed from: b */
        public final dfj0 f7407b;

        /* JADX INFO: renamed from: c */
        public final boolean f7408c;

        /* JADX INFO: renamed from: d */
        public final int[] f7409d;

        /* JADX INFO: renamed from: e */
        public final boolean[] f7410e;

        public a(dfj0 dfj0Var, boolean z, int[] iArr, boolean[] zArr) {
            int i = dfj0Var.f88159a;
            this.f7406a = i;
            boolean z2 = false;
            w11.m204365a(i == iArr.length && i == zArr.length);
            this.f7407b = dfj0Var;
            if (z && i > 1) {
                z2 = true;
            }
            this.f7408c = z2;
            this.f7409d = (int[]) iArr.clone();
            this.f7410e = (boolean[]) zArr.clone();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m9846a(Bundle bundle) {
            dfj0 dfj0Var = (dfj0) dfj0.f88158h.mo10034a((Bundle) w11.m204369e(bundle.getBundle(f7401f)));
            return new a(dfj0Var, bundle.getBoolean(f7404i, false), (int[]) C2677a.m15480a(bundle.getIntArray(f7402g), new int[dfj0Var.f88159a]), (boolean[]) C2677a.m15480a(bundle.getBooleanArray(f7403h), new boolean[dfj0Var.f88159a]));
        }

        /* JADX INFO: renamed from: b */
        public dfj0 m9847b() {
            return this.f7407b;
        }

        /* JADX INFO: renamed from: c */
        public C1894k m9848c(int i) {
            return this.f7407b.m115519c(i);
        }

        /* JADX INFO: renamed from: d */
        public int m9849d() {
            return this.f7407b.f88161c;
        }

        /* JADX INFO: renamed from: e */
        public boolean m9850e() {
            return this.f7408c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7408c == aVar.f7408c && this.f7407b.equals(aVar.f7407b) && Arrays.equals(this.f7409d, aVar.f7409d) && Arrays.equals(this.f7410e, aVar.f7410e)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m9851f() {
            return Booleans.m16437d(this.f7410e, true);
        }

        /* JADX INFO: renamed from: g */
        public boolean m9852g(boolean z) {
            for (int i = 0; i < this.f7409d.length; i++) {
                if (m9855j(i, z)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: h */
        public boolean m9853h(int i) {
            return this.f7410e[i];
        }

        public int hashCode() {
            return (((((this.f7407b.hashCode() * 31) + (this.f7408c ? 1 : 0)) * 31) + Arrays.hashCode(this.f7409d)) * 31) + Arrays.hashCode(this.f7410e);
        }

        /* JADX INFO: renamed from: i */
        public boolean m9854i(int i) {
            return m9855j(i, false);
        }

        /* JADX INFO: renamed from: j */
        public boolean m9855j(int i, boolean z) {
            int i2 = this.f7409d[i];
            if (i2 != 4) {
                return z && i2 == 3;
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f7401f, this.f7407b.toBundle());
            bundle.putIntArray(f7402g, this.f7409d);
            bundle.putBooleanArray(f7403h, this.f7410e);
            bundle.putBoolean(f7404i, this.f7408c);
            return bundle;
        }
    }

    public C1861d0(List<a> list) {
        this.f7400a = ImmutableList.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1861d0 m9840a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f7398c);
        return new C1861d0(parcelableArrayList == null ? ImmutableList.m15739of() : cj3.m110054d(a.f7405j, parcelableArrayList));
    }

    /* JADX INFO: renamed from: b */
    public ImmutableList<a> m9841b() {
        return this.f7400a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m9842c() {
        return this.f7400a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public boolean m9843d(int i) {
        for (int i2 = 0; i2 < this.f7400a.size(); i2++) {
            a aVar = this.f7400a.get(i2);
            if (aVar.m9851f() && aVar.m9849d() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m9844e(int i) {
        return m9845f(i, false);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1861d0.class != obj.getClass()) {
            return false;
        }
        return this.f7400a.equals(((C1861d0) obj).f7400a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m9845f(int i, boolean z) {
        for (int i2 = 0; i2 < this.f7400a.size(); i2++) {
            if (this.f7400a.get(i2).m9849d() == i && this.f7400a.get(i2).m9852g(z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f7400a.hashCode();
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f7398c, cj3.m110059i(this.f7400a));
        return bundle;
    }
}
