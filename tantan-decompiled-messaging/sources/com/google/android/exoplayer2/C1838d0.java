package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1838d0;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.common.base.C2654a;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Booleans;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p149l.oi3;
import p149l.p11;
import p149l.vck0;
import p149l.z5j0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.d0 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1838d0 implements InterfaceC1863e {

    /* JADX INFO: renamed from: b */
    public static final C1838d0 f7360b = new C1838d0(ImmutableList.m15685of());

    /* JADX INFO: renamed from: c */
    public static final String f7361c = vck0.m197903z0(0);

    /* JADX INFO: renamed from: d */
    public static final InterfaceC1863e.a<C1838d0> f7362d = new InterfaceC1863e.a() { // from class: l.c7j0
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return C1838d0.m9786a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final ImmutableList<a> f7363a;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.d0$a */
    public static final class a implements InterfaceC1863e {

        /* JADX INFO: renamed from: f */
        public static final String f7364f = vck0.m197903z0(0);

        /* JADX INFO: renamed from: g */
        public static final String f7365g = vck0.m197903z0(1);

        /* JADX INFO: renamed from: h */
        public static final String f7366h = vck0.m197903z0(3);

        /* JADX INFO: renamed from: i */
        public static final String f7367i = vck0.m197903z0(4);

        /* JADX INFO: renamed from: j */
        public static final InterfaceC1863e.a<a> f7368j = new InterfaceC1863e.a() { // from class: l.d7j0
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return C1838d0.a.m9792a(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final int f7369a;

        /* JADX INFO: renamed from: b */
        public final z5j0 f7370b;

        /* JADX INFO: renamed from: c */
        public final boolean f7371c;

        /* JADX INFO: renamed from: d */
        public final int[] f7372d;

        /* JADX INFO: renamed from: e */
        public final boolean[] f7373e;

        public a(z5j0 z5j0Var, boolean z, int[] iArr, boolean[] zArr) {
            int i = z5j0Var.f201817a;
            this.f7369a = i;
            boolean z2 = false;
            p11.m167007a(i == iArr.length && i == zArr.length);
            this.f7370b = z5j0Var;
            if (z && i > 1) {
                z2 = true;
            }
            this.f7371c = z2;
            this.f7372d = (int[]) iArr.clone();
            this.f7373e = (boolean[]) zArr.clone();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m9792a(Bundle bundle) {
            z5j0 z5j0Var = (z5j0) z5j0.f201816h.mo9980a((Bundle) p11.m167011e(bundle.getBundle(f7364f)));
            return new a(z5j0Var, bundle.getBoolean(f7367i, false), (int[]) C2654a.m15426a(bundle.getIntArray(f7365g), new int[z5j0Var.f201817a]), (boolean[]) C2654a.m15426a(bundle.getBooleanArray(f7366h), new boolean[z5j0Var.f201817a]));
        }

        /* JADX INFO: renamed from: b */
        public z5j0 m9793b() {
            return this.f7370b;
        }

        /* JADX INFO: renamed from: c */
        public C1871k m9794c(int i) {
            return this.f7370b.m217358c(i);
        }

        /* JADX INFO: renamed from: d */
        public int m9795d() {
            return this.f7370b.f201819c;
        }

        /* JADX INFO: renamed from: e */
        public boolean m9796e() {
            return this.f7371c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7371c == aVar.f7371c && this.f7370b.equals(aVar.f7370b) && Arrays.equals(this.f7372d, aVar.f7372d) && Arrays.equals(this.f7373e, aVar.f7373e)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m9797f() {
            return Booleans.m16382d(this.f7373e, true);
        }

        /* JADX INFO: renamed from: g */
        public boolean m9798g(boolean z) {
            for (int i = 0; i < this.f7372d.length; i++) {
                if (m9801j(i, z)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: h */
        public boolean m9799h(int i) {
            return this.f7373e[i];
        }

        public int hashCode() {
            return (((((this.f7370b.hashCode() * 31) + (this.f7371c ? 1 : 0)) * 31) + Arrays.hashCode(this.f7372d)) * 31) + Arrays.hashCode(this.f7373e);
        }

        /* JADX INFO: renamed from: i */
        public boolean m9800i(int i) {
            return m9801j(i, false);
        }

        /* JADX INFO: renamed from: j */
        public boolean m9801j(int i, boolean z) {
            int i2 = this.f7372d[i];
            if (i2 != 4) {
                return z && i2 == 3;
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f7364f, this.f7370b.toBundle());
            bundle.putIntArray(f7365g, this.f7372d);
            bundle.putBooleanArray(f7366h, this.f7373e);
            bundle.putBoolean(f7367i, this.f7371c);
            return bundle;
        }
    }

    public C1838d0(List<a> list) {
        this.f7363a = ImmutableList.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1838d0 m9786a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f7361c);
        return new C1838d0(parcelableArrayList == null ? ImmutableList.m15685of() : oi3.m164495d(a.f7368j, parcelableArrayList));
    }

    /* JADX INFO: renamed from: b */
    public ImmutableList<a> m9787b() {
        return this.f7363a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m9788c() {
        return this.f7363a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public boolean m9789d(int i) {
        for (int i2 = 0; i2 < this.f7363a.size(); i2++) {
            a aVar = this.f7363a.get(i2);
            if (aVar.m9797f() && aVar.m9795d() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m9790e(int i) {
        return m9791f(i, false);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1838d0.class != obj.getClass()) {
            return false;
        }
        return this.f7363a.equals(((C1838d0) obj).f7363a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m9791f(int i, boolean z) {
        for (int i2 = 0; i2 < this.f7363a.size(); i2++) {
            if (this.f7363a.get(i2).m9795d() == i && this.f7363a.get(i2).m9798g(z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f7363a.hashCode();
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f7361c, oi3.m164500i(this.f7363a));
        return bundle;
    }
}
