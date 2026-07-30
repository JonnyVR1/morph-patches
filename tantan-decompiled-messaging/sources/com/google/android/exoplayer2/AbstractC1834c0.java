package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import p149l.mi3;
import p149l.ni3;
import p149l.ohg0;
import p149l.p11;
import p149l.v70;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.c0 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1834c0 implements InterfaceC1863e {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1834c0 f7289a = new a();

    /* JADX INFO: renamed from: b */
    public static final String f7290b = vck0.m197903z0(0);

    /* JADX INFO: renamed from: c */
    public static final String f7291c = vck0.m197903z0(1);

    /* JADX INFO: renamed from: d */
    public static final String f7292d = vck0.m197903z0(2);

    /* JADX INFO: renamed from: e */
    public static final InterfaceC1863e.a<AbstractC1834c0> f7293e = new InterfaceC1863e.a() { // from class: l.uqi0
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return AbstractC1834c0.m9712b(bundle);
        }
    };

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c0$a */
    public class a extends AbstractC1834c0 {
        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: f */
        public int mo9396f(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: k */
        public b mo9399k(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: m */
        public int mo9717m() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: q */
        public Object mo9402q(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: s */
        public d mo9403s(int i, d dVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: t */
        public int mo9721t() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c0$b */
    public static final class b implements InterfaceC1863e {

        /* JADX INFO: renamed from: h */
        public static final String f7294h = vck0.m197903z0(0);

        /* JADX INFO: renamed from: i */
        public static final String f7295i = vck0.m197903z0(1);

        /* JADX INFO: renamed from: j */
        public static final String f7296j = vck0.m197903z0(2);

        /* JADX INFO: renamed from: k */
        public static final String f7297k = vck0.m197903z0(3);

        /* JADX INFO: renamed from: l */
        public static final String f7298l = vck0.m197903z0(4);

        /* JADX INFO: renamed from: m */
        public static final InterfaceC1863e.a<b> f7299m = new InterfaceC1863e.a() { // from class: l.vqi0
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return AbstractC1834c0.b.m9726c(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        @Nullable
        public Object f7300a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Object f7301b;

        /* JADX INFO: renamed from: c */
        public int f7302c;

        /* JADX INFO: renamed from: d */
        public long f7303d;

        /* JADX INFO: renamed from: e */
        public long f7304e;

        /* JADX INFO: renamed from: f */
        public boolean f7305f;

        /* JADX INFO: renamed from: g */
        public v70 f7306g = v70.f180250g;

        /* JADX INFO: renamed from: c */
        public static b m9726c(Bundle bundle) {
            int i = bundle.getInt(f7294h, 0);
            long j = bundle.getLong(f7295i, -9223372036854775807L);
            long j2 = bundle.getLong(f7296j, 0L);
            boolean z = bundle.getBoolean(f7297k, false);
            Bundle bundle2 = bundle.getBundle(f7298l);
            v70 v70Var = bundle2 != null ? (v70) v70.f180256m.mo9980a(bundle2) : v70.f180250g;
            b bVar = new b();
            bVar.m9746w(null, null, i, j, j2, v70Var, z);
            return bVar;
        }

        /* JADX INFO: renamed from: d */
        public int m9727d(int i) {
            return this.f7306g.m197293c(i).f180273b;
        }

        /* JADX INFO: renamed from: e */
        public long m9728e(int i, int i2) {
            v70.C20589a c20589aM197293c = this.f7306g.m197293c(i);
            if (c20589aM197293c.f180273b != -1) {
                return c20589aM197293c.f180277f[i2];
            }
            return -9223372036854775807L;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (vck0.m197845c(this.f7300a, bVar.f7300a) && vck0.m197845c(this.f7301b, bVar.f7301b) && this.f7302c == bVar.f7302c && this.f7303d == bVar.f7303d && this.f7304e == bVar.f7304e && this.f7305f == bVar.f7305f && vck0.m197845c(this.f7306g, bVar.f7306g)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public int m9729f() {
            return this.f7306g.f180258b;
        }

        /* JADX INFO: renamed from: g */
        public int m9730g(long j) {
            return this.f7306g.m197294d(j, this.f7303d);
        }

        /* JADX INFO: renamed from: h */
        public int m9731h(long j) {
            return this.f7306g.m197295e(j, this.f7303d);
        }

        public int hashCode() {
            Object obj = this.f7300a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f7301b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f7302c) * 31;
            long j = this.f7303d;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f7304e;
            return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f7305f ? 1 : 0)) * 31) + this.f7306g.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public long m9732i(int i) {
            return this.f7306g.m197293c(i).f180272a;
        }

        /* JADX INFO: renamed from: j */
        public long m9733j() {
            return this.f7306g.f180259c;
        }

        /* JADX INFO: renamed from: k */
        public int m9734k(int i, int i2) {
            v70.C20589a c20589aM197293c = this.f7306g.m197293c(i);
            if (c20589aM197293c.f180273b != -1) {
                return c20589aM197293c.f180276e[i2];
            }
            return 0;
        }

        /* JADX INFO: renamed from: l */
        public long m9735l(int i) {
            return this.f7306g.m197293c(i).f180278g;
        }

        /* JADX INFO: renamed from: m */
        public long m9736m() {
            return this.f7303d;
        }

        /* JADX INFO: renamed from: n */
        public int m9737n(int i) {
            return this.f7306g.m197293c(i).m197303f();
        }

        /* JADX INFO: renamed from: o */
        public int m9738o(int i, int i2) {
            return this.f7306g.m197293c(i).m197304g(i2);
        }

        /* JADX INFO: renamed from: p */
        public long m9739p() {
            return vck0.m197874l1(this.f7304e);
        }

        /* JADX INFO: renamed from: q */
        public long m9740q() {
            return this.f7304e;
        }

        /* JADX INFO: renamed from: r */
        public int m9741r() {
            return this.f7306g.f180261e;
        }

        /* JADX INFO: renamed from: s */
        public boolean m9742s(int i) {
            return !this.f7306g.m197293c(i).m197305h();
        }

        /* JADX INFO: renamed from: t */
        public boolean m9743t(int i) {
            return i == m9729f() - 1 && this.f7306g.m197296f(i);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i = this.f7302c;
            if (i != 0) {
                bundle.putInt(f7294h, i);
            }
            long j = this.f7303d;
            if (j != -9223372036854775807L) {
                bundle.putLong(f7295i, j);
            }
            long j2 = this.f7304e;
            if (j2 != 0) {
                bundle.putLong(f7296j, j2);
            }
            boolean z = this.f7305f;
            if (z) {
                bundle.putBoolean(f7297k, z);
            }
            if (!this.f7306g.equals(v70.f180250g)) {
                bundle.putBundle(f7298l, this.f7306g.toBundle());
            }
            return bundle;
        }

        /* JADX INFO: renamed from: u */
        public boolean m9744u(int i) {
            return this.f7306g.m197293c(i).f180279h;
        }

        /* JADX INFO: renamed from: v */
        public b m9745v(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2) {
            return m9746w(obj, obj2, i, j, j2, v70.f180250g, false);
        }

        /* JADX INFO: renamed from: w */
        public b m9746w(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, v70 v70Var, boolean z) {
            this.f7300a = obj;
            this.f7301b = obj2;
            this.f7302c = i;
            this.f7303d = j;
            this.f7304e = j2;
            this.f7306g = v70Var;
            this.f7305f = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c0$c */
    public static final class c extends AbstractC1834c0 {

        /* JADX INFO: renamed from: f */
        public final ImmutableList<d> f7307f;

        /* JADX INFO: renamed from: g */
        public final ImmutableList<b> f7308g;

        /* JADX INFO: renamed from: h */
        public final int[] f7309h;

        /* JADX INFO: renamed from: i */
        public final int[] f7310i;

        public c(ImmutableList<d> immutableList, ImmutableList<b> immutableList2, int[] iArr) {
            p11.m167007a(immutableList.size() == iArr.length);
            this.f7307f = immutableList;
            this.f7308g = immutableList2;
            this.f7309h = iArr;
            this.f7310i = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f7310i[iArr[i]] = i;
            }
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: e */
        public int mo9395e(boolean z) {
            if (m9722u()) {
                return -1;
            }
            if (z) {
                return this.f7309h[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: f */
        public int mo9396f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: g */
        public int mo9397g(boolean z) {
            if (m9722u()) {
                return -1;
            }
            return z ? this.f7309h[mo9721t() - 1] : mo9721t() - 1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: i */
        public int mo9398i(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo9397g(z)) {
                return z ? this.f7309h[this.f7310i[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return mo9395e(z);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: k */
        public b mo9399k(int i, b bVar, boolean z) {
            b bVar2 = this.f7308g.get(i);
            bVar.m9746w(bVar2.f7300a, bVar2.f7301b, bVar2.f7302c, bVar2.f7303d, bVar2.f7304e, bVar2.f7306g, bVar2.f7305f);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: m */
        public int mo9717m() {
            return this.f7308g.size();
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: p */
        public int mo9401p(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo9395e(z)) {
                return z ? this.f7309h[this.f7310i[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return mo9397g(z);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: q */
        public Object mo9402q(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: s */
        public d mo9403s(int i, d dVar, long j) {
            d dVar2 = this.f7307f.get(i);
            dVar.m9755i(dVar2.f7328a, dVar2.f7330c, dVar2.f7331d, dVar2.f7332e, dVar2.f7333f, dVar2.f7334g, dVar2.f7335h, dVar2.f7336i, dVar2.f7338k, dVar2.f7340m, dVar2.f7341n, dVar2.f7342o, dVar2.f7343p, dVar2.f7344q);
            dVar.f7339l = dVar2.f7339l;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: t */
        public int mo9721t() {
            return this.f7307f.size();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c0$d */
    public static final class d implements InterfaceC1863e {

        /* JADX INFO: renamed from: b */
        @Nullable
        @Deprecated
        public Object f7329b;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Object f7331d;

        /* JADX INFO: renamed from: e */
        public long f7332e;

        /* JADX INFO: renamed from: f */
        public long f7333f;

        /* JADX INFO: renamed from: g */
        public long f7334g;

        /* JADX INFO: renamed from: h */
        public boolean f7335h;

        /* JADX INFO: renamed from: i */
        public boolean f7336i;

        /* JADX INFO: renamed from: j */
        @Deprecated
        public boolean f7337j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public C1921n.g f7338k;

        /* JADX INFO: renamed from: l */
        public boolean f7339l;

        /* JADX INFO: renamed from: m */
        public long f7340m;

        /* JADX INFO: renamed from: n */
        public long f7341n;

        /* JADX INFO: renamed from: o */
        public int f7342o;

        /* JADX INFO: renamed from: p */
        public int f7343p;

        /* JADX INFO: renamed from: q */
        public long f7344q;

        /* JADX INFO: renamed from: r */
        public static final Object f7319r = new Object();

        /* JADX INFO: renamed from: s */
        public static final Object f7320s = new Object();

        /* JADX INFO: renamed from: t */
        public static final C1921n f7321t = new C1921n.c().m10635c("com.google.android.exoplayer2.Timeline").m10638f(Uri.EMPTY).m10633a();

        /* JADX INFO: renamed from: u */
        public static final String f7322u = vck0.m197903z0(1);

        /* JADX INFO: renamed from: v */
        public static final String f7323v = vck0.m197903z0(2);

        /* JADX INFO: renamed from: w */
        public static final String f7324w = vck0.m197903z0(3);

        /* JADX INFO: renamed from: x */
        public static final String f7325x = vck0.m197903z0(4);

        /* JADX INFO: renamed from: y */
        public static final String f7326y = vck0.m197903z0(5);

        /* JADX INFO: renamed from: z */
        public static final String f7327z = vck0.m197903z0(6);

        /* JADX INFO: renamed from: A */
        public static final String f7311A = vck0.m197903z0(7);

        /* JADX INFO: renamed from: B */
        public static final String f7312B = vck0.m197903z0(8);

        /* JADX INFO: renamed from: C */
        public static final String f7313C = vck0.m197903z0(9);

        /* JADX INFO: renamed from: D */
        public static final String f7314D = vck0.m197903z0(10);

        /* JADX INFO: renamed from: E */
        public static final String f7315E = vck0.m197903z0(11);

        /* JADX INFO: renamed from: F */
        public static final String f7316F = vck0.m197903z0(12);

        /* JADX INFO: renamed from: G */
        public static final String f7317G = vck0.m197903z0(13);

        /* JADX INFO: renamed from: H */
        public static final InterfaceC1863e.a<d> f7318H = new InterfaceC1863e.a() { // from class: l.wqi0
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return AbstractC1834c0.d.m9748b(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public Object f7328a = f7319r;

        /* JADX INFO: renamed from: c */
        public C1921n f7330c = f7321t;

        /* JADX INFO: renamed from: b */
        public static d m9748b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f7322u);
            C1921n c1921n = bundle2 != null ? (C1921n) C1921n.f7958p.mo9980a(bundle2) : C1921n.f7951i;
            long j = bundle.getLong(f7323v, -9223372036854775807L);
            long j2 = bundle.getLong(f7324w, -9223372036854775807L);
            long j3 = bundle.getLong(f7325x, -9223372036854775807L);
            boolean z = bundle.getBoolean(f7326y, false);
            boolean z2 = bundle.getBoolean(f7327z, false);
            Bundle bundle3 = bundle.getBundle(f7311A);
            C1921n.g gVar = bundle3 != null ? (C1921n.g) C1921n.g.f8038l.mo9980a(bundle3) : null;
            boolean z3 = bundle.getBoolean(f7312B, false);
            long j4 = bundle.getLong(f7313C, 0L);
            long j5 = bundle.getLong(f7314D, -9223372036854775807L);
            int i = bundle.getInt(f7315E, 0);
            int i2 = bundle.getInt(f7316F, 0);
            long j6 = bundle.getLong(f7317G, 0L);
            d dVar = new d();
            dVar.m9755i(f7320s, c1921n, null, j, j2, j3, z, z2, gVar, j4, j5, i, i2, j6);
            dVar.f7339l = z3;
            return dVar;
        }

        /* JADX INFO: renamed from: c */
        public long m9749c() {
            return vck0.m197852e0(this.f7334g);
        }

        /* JADX INFO: renamed from: d */
        public long m9750d() {
            return vck0.m197874l1(this.f7340m);
        }

        /* JADX INFO: renamed from: e */
        public long m9751e() {
            return this.f7340m;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (vck0.m197845c(this.f7328a, dVar.f7328a) && vck0.m197845c(this.f7330c, dVar.f7330c) && vck0.m197845c(this.f7331d, dVar.f7331d) && vck0.m197845c(this.f7338k, dVar.f7338k) && this.f7332e == dVar.f7332e && this.f7333f == dVar.f7333f && this.f7334g == dVar.f7334g && this.f7335h == dVar.f7335h && this.f7336i == dVar.f7336i && this.f7339l == dVar.f7339l && this.f7340m == dVar.f7340m && this.f7341n == dVar.f7341n && this.f7342o == dVar.f7342o && this.f7343p == dVar.f7343p && this.f7344q == dVar.f7344q) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public long m9752f() {
            return vck0.m197874l1(this.f7341n);
        }

        /* JADX INFO: renamed from: g */
        public long m9753g() {
            return this.f7344q;
        }

        /* JADX INFO: renamed from: h */
        public boolean m9754h() {
            p11.m167013g(this.f7337j == (this.f7338k != null));
            return this.f7338k != null;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f7328a.hashCode()) * 31) + this.f7330c.hashCode()) * 31;
            Object obj = this.f7331d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C1921n.g gVar = this.f7338k;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j = this.f7332e;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f7333f;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f7334g;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f7335h ? 1 : 0)) * 31) + (this.f7336i ? 1 : 0)) * 31) + (this.f7339l ? 1 : 0)) * 31;
            long j4 = this.f7340m;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f7341n;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f7342o) * 31) + this.f7343p) * 31;
            long j6 = this.f7344q;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        /* JADX INFO: renamed from: i */
        public d m9755i(Object obj, @Nullable C1921n c1921n, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable C1921n.g gVar, long j4, long j5, int i, int i2, long j6) {
            C1921n.h hVar;
            this.f7328a = obj;
            this.f7330c = c1921n != null ? c1921n : f7321t;
            this.f7329b = (c1921n == null || (hVar = c1921n.f7960b) == null) ? null : hVar.f8065i;
            this.f7331d = obj2;
            this.f7332e = j;
            this.f7333f = j2;
            this.f7334g = j3;
            this.f7335h = z;
            this.f7336i = z2;
            this.f7337j = gVar != null;
            this.f7338k = gVar;
            this.f7340m = j4;
            this.f7341n = j5;
            this.f7342o = i;
            this.f7343p = i2;
            this.f7344q = j6;
            this.f7339l = false;
            return this;
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!C1921n.f7951i.equals(this.f7330c)) {
                bundle.putBundle(f7322u, this.f7330c.toBundle());
            }
            long j = this.f7332e;
            if (j != -9223372036854775807L) {
                bundle.putLong(f7323v, j);
            }
            long j2 = this.f7333f;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(f7324w, j2);
            }
            long j3 = this.f7334g;
            if (j3 != -9223372036854775807L) {
                bundle.putLong(f7325x, j3);
            }
            boolean z = this.f7335h;
            if (z) {
                bundle.putBoolean(f7326y, z);
            }
            boolean z2 = this.f7336i;
            if (z2) {
                bundle.putBoolean(f7327z, z2);
            }
            C1921n.g gVar = this.f7338k;
            if (gVar != null) {
                bundle.putBundle(f7311A, gVar.toBundle());
            }
            boolean z3 = this.f7339l;
            if (z3) {
                bundle.putBoolean(f7312B, z3);
            }
            long j4 = this.f7340m;
            if (j4 != 0) {
                bundle.putLong(f7313C, j4);
            }
            long j5 = this.f7341n;
            if (j5 != -9223372036854775807L) {
                bundle.putLong(f7314D, j5);
            }
            int i = this.f7342o;
            if (i != 0) {
                bundle.putInt(f7315E, i);
            }
            int i2 = this.f7343p;
            if (i2 != 0) {
                bundle.putInt(f7316F, i2);
            }
            long j6 = this.f7344q;
            if (j6 != 0) {
                bundle.putLong(f7317G, j6);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1834c0 m9712b(Bundle bundle) {
        ImmutableList immutableListM9713c = m9713c(d.f7318H, ni3.m159484a(bundle, f7290b));
        ImmutableList immutableListM9713c2 = m9713c(b.f7299m, ni3.m159484a(bundle, f7291c));
        int[] intArray = bundle.getIntArray(f7292d);
        if (intArray == null) {
            intArray = m9714d(immutableListM9713c.size());
        }
        return new c(immutableListM9713c, immutableListM9713c2, intArray);
    }

    /* JADX INFO: renamed from: c */
    public static <T extends InterfaceC1863e> ImmutableList<T> m9713c(InterfaceC1863e.a<T> aVar, @Nullable IBinder iBinder) {
        if (iBinder == null) {
            return ImmutableList.m15685of();
        }
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a();
        ImmutableList<Bundle> immutableListM154658a = mi3.m154658a(iBinder);
        for (int i = 0; i < immutableListM154658a.size(); i++) {
            c2781a.mo15683a(aVar.mo9980a(immutableListM154658a.get(i)));
        }
        return c2781a.m15702m();
    }

    /* JADX INFO: renamed from: d */
    public static int[] m9714d(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public int mo9395e(boolean z) {
        return m9722u() ? -1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int iMo9397g;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1834c0)) {
            return false;
        }
        AbstractC1834c0 abstractC1834c0 = (AbstractC1834c0) obj;
        if (abstractC1834c0.mo9721t() != mo9721t() || abstractC1834c0.mo9717m() != mo9717m()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i = 0; i < mo9721t(); i++) {
            if (!m9720r(i, dVar).equals(abstractC1834c0.m9720r(i, dVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo9717m(); i2++) {
            if (!mo9399k(i2, bVar, true).equals(abstractC1834c0.mo9399k(i2, bVar2, true))) {
                return false;
            }
        }
        int iMo9395e = mo9395e(true);
        if (iMo9395e != abstractC1834c0.mo9395e(true) || (iMo9397g = mo9397g(true)) != abstractC1834c0.mo9397g(true)) {
            return false;
        }
        while (iMo9395e != iMo9397g) {
            int iMo9398i = mo9398i(iMo9395e, 0, true);
            if (iMo9398i != abstractC1834c0.mo9398i(iMo9395e, 0, true)) {
                return false;
            }
            iMo9395e = iMo9398i;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo9396f(Object obj);

    /* JADX INFO: renamed from: g */
    public int mo9397g(boolean z) {
        if (m9722u()) {
            return -1;
        }
        return mo9721t() - 1;
    }

    /* JADX INFO: renamed from: h */
    public final int m9715h(int i, b bVar, d dVar, int i2, boolean z) {
        int i3 = m9716j(i, bVar).f7302c;
        if (m9720r(i3, dVar).f7343p != i) {
            return i + 1;
        }
        int iMo9398i = mo9398i(i3, i2, z);
        if (iMo9398i == -1) {
            return -1;
        }
        return m9720r(iMo9398i, dVar).f7342o;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iMo9721t = 217 + mo9721t();
        for (int i = 0; i < mo9721t(); i++) {
            iMo9721t = (iMo9721t * 31) + m9720r(i, dVar).hashCode();
        }
        int iMo9717m = (iMo9721t * 31) + mo9717m();
        for (int i2 = 0; i2 < mo9717m(); i2++) {
            iMo9717m = (iMo9717m * 31) + mo9399k(i2, bVar, true).hashCode();
        }
        int iMo9395e = mo9395e(true);
        while (iMo9395e != -1) {
            iMo9717m = (iMo9717m * 31) + iMo9395e;
            iMo9395e = mo9398i(iMo9395e, 0, true);
        }
        return iMo9717m;
    }

    /* JADX INFO: renamed from: i */
    public int mo9398i(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo9397g(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo9397g(z) ? mo9395e(z) : i + 1;
        }
        ohg0.m164364a();
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final b m9716j(int i, b bVar) {
        return mo9399k(i, bVar, false);
    }

    /* JADX INFO: renamed from: k */
    public abstract b mo9399k(int i, b bVar, boolean z);

    /* JADX INFO: renamed from: l */
    public b mo9400l(Object obj, b bVar) {
        return mo9399k(mo9396f(obj), bVar, true);
    }

    /* JADX INFO: renamed from: m */
    public abstract int mo9717m();

    /* JADX INFO: renamed from: n */
    public final Pair<Object, Long> m9718n(d dVar, b bVar, int i, long j) {
        return (Pair) p11.m167011e(m9719o(dVar, bVar, i, j, 0L));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Pair<Object, Long> m9719o(d dVar, b bVar, int i, long j, long j2) {
        p11.m167009c(i, 0, mo9721t());
        mo9403s(i, dVar, j2);
        if (j == -9223372036854775807L) {
            j = dVar.m9751e();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = dVar.f7342o;
        m9716j(i2, bVar);
        while (i2 < dVar.f7343p && bVar.f7304e != j) {
            int i3 = i2 + 1;
            if (m9716j(i3, bVar).f7304e > j) {
                break;
            }
            i2 = i3;
        }
        mo9399k(i2, bVar, true);
        long jMin = j - bVar.f7304e;
        long j3 = bVar.f7303d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        return Pair.create(p11.m167011e(bVar.f7301b), Long.valueOf(Math.max(0L, jMin)));
    }

    /* JADX INFO: renamed from: p */
    public int mo9401p(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo9395e(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo9395e(z) ? mo9397g(z) : i - 1;
        }
        ohg0.m164364a();
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public abstract Object mo9402q(int i);

    /* JADX INFO: renamed from: r */
    public final d m9720r(int i, d dVar) {
        return mo9403s(i, dVar, 0L);
    }

    /* JADX INFO: renamed from: s */
    public abstract d mo9403s(int i, d dVar, long j);

    /* JADX INFO: renamed from: t */
    public abstract int mo9721t();

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int iMo9721t = mo9721t();
        d dVar = new d();
        for (int i = 0; i < iMo9721t; i++) {
            arrayList.add(mo9403s(i, dVar, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int iMo9717m = mo9717m();
        b bVar = new b();
        for (int i2 = 0; i2 < iMo9717m; i2++) {
            arrayList2.add(mo9399k(i2, bVar, false).toBundle());
        }
        int[] iArr = new int[iMo9721t];
        if (iMo9721t > 0) {
            iArr[0] = mo9395e(true);
        }
        for (int i3 = 1; i3 < iMo9721t; i3++) {
            iArr[i3] = mo9398i(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        ni3.m159486c(bundle, f7290b, new mi3(arrayList));
        ni3.m159486c(bundle, f7291c, new mi3(arrayList2));
        bundle.putIntArray(f7292d, iArr);
        return bundle;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m9722u() {
        return mo9721t() == 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m9723v(int i, b bVar, d dVar, int i2, boolean z) {
        return m9715h(i, bVar, dVar, i2, z) == -1;
    }
}
