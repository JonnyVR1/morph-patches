package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import p153l.aj3;
import p153l.bj3;
import p153l.bmk0;
import p153l.r70;
import p153l.w11;
import p153l.wpg0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.c0 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1857c0 implements InterfaceC1886e {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1857c0 f7326a = new a();

    /* JADX INFO: renamed from: b */
    public static final String f7327b = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: c */
    public static final String f7328c = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: d */
    public static final String f7329d = bmk0.m105181z0(2);

    /* JADX INFO: renamed from: e */
    public static final InterfaceC1886e.a<AbstractC1857c0> f7330e = new InterfaceC1886e.a() { // from class: l.xzi0
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return AbstractC1857c0.m9766b(bundle);
        }
    };

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c0$a */
    public class a extends AbstractC1857c0 {
        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: f */
        public int mo9450f(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: k */
        public b mo9453k(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: m */
        public int mo9771m() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: q */
        public Object mo9456q(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: s */
        public d mo9457s(int i, d dVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: t */
        public int mo9775t() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c0$b */
    public static final class b implements InterfaceC1886e {

        /* JADX INFO: renamed from: h */
        public static final String f7331h = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: i */
        public static final String f7332i = bmk0.m105181z0(1);

        /* JADX INFO: renamed from: j */
        public static final String f7333j = bmk0.m105181z0(2);

        /* JADX INFO: renamed from: k */
        public static final String f7334k = bmk0.m105181z0(3);

        /* JADX INFO: renamed from: l */
        public static final String f7335l = bmk0.m105181z0(4);

        /* JADX INFO: renamed from: m */
        public static final InterfaceC1886e.a<b> f7336m = new InterfaceC1886e.a() { // from class: l.yzi0
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return AbstractC1857c0.b.m9780c(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        @Nullable
        public Object f7337a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Object f7338b;

        /* JADX INFO: renamed from: c */
        public int f7339c;

        /* JADX INFO: renamed from: d */
        public long f7340d;

        /* JADX INFO: renamed from: e */
        public long f7341e;

        /* JADX INFO: renamed from: f */
        public boolean f7342f;

        /* JADX INFO: renamed from: g */
        public r70 f7343g = r70.f161545g;

        /* JADX INFO: renamed from: c */
        public static b m9780c(Bundle bundle) {
            int i = bundle.getInt(f7331h, 0);
            long j = bundle.getLong(f7332i, -9223372036854775807L);
            long j2 = bundle.getLong(f7333j, 0L);
            boolean z = bundle.getBoolean(f7334k, false);
            Bundle bundle2 = bundle.getBundle(f7335l);
            r70 r70Var = bundle2 != null ? (r70) r70.f161551m.mo10034a(bundle2) : r70.f161545g;
            b bVar = new b();
            bVar.m9800w(null, null, i, j, j2, r70Var, z);
            return bVar;
        }

        /* JADX INFO: renamed from: d */
        public int m9781d(int i) {
            return this.f7343g.m180068c(i).f161568b;
        }

        /* JADX INFO: renamed from: e */
        public long m9782e(int i, int i2) {
            r70.C19783a c19783aM180068c = this.f7343g.m180068c(i);
            if (c19783aM180068c.f161568b != -1) {
                return c19783aM180068c.f161572f[i2];
            }
            return -9223372036854775807L;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (bmk0.m105123c(this.f7337a, bVar.f7337a) && bmk0.m105123c(this.f7338b, bVar.f7338b) && this.f7339c == bVar.f7339c && this.f7340d == bVar.f7340d && this.f7341e == bVar.f7341e && this.f7342f == bVar.f7342f && bmk0.m105123c(this.f7343g, bVar.f7343g)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public int m9783f() {
            return this.f7343g.f161553b;
        }

        /* JADX INFO: renamed from: g */
        public int m9784g(long j) {
            return this.f7343g.m180069d(j, this.f7340d);
        }

        /* JADX INFO: renamed from: h */
        public int m9785h(long j) {
            return this.f7343g.m180070e(j, this.f7340d);
        }

        public int hashCode() {
            Object obj = this.f7337a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f7338b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f7339c) * 31;
            long j = this.f7340d;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f7341e;
            return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f7342f ? 1 : 0)) * 31) + this.f7343g.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public long m9786i(int i) {
            return this.f7343g.m180068c(i).f161567a;
        }

        /* JADX INFO: renamed from: j */
        public long m9787j() {
            return this.f7343g.f161554c;
        }

        /* JADX INFO: renamed from: k */
        public int m9788k(int i, int i2) {
            r70.C19783a c19783aM180068c = this.f7343g.m180068c(i);
            if (c19783aM180068c.f161568b != -1) {
                return c19783aM180068c.f161571e[i2];
            }
            return 0;
        }

        /* JADX INFO: renamed from: l */
        public long m9789l(int i) {
            return this.f7343g.m180068c(i).f161573g;
        }

        /* JADX INFO: renamed from: m */
        public long m9790m() {
            return this.f7340d;
        }

        /* JADX INFO: renamed from: n */
        public int m9791n(int i) {
            return this.f7343g.m180068c(i).m180078f();
        }

        /* JADX INFO: renamed from: o */
        public int m9792o(int i, int i2) {
            return this.f7343g.m180068c(i).m180079g(i2);
        }

        /* JADX INFO: renamed from: p */
        public long m9793p() {
            return bmk0.m105152l1(this.f7341e);
        }

        /* JADX INFO: renamed from: q */
        public long m9794q() {
            return this.f7341e;
        }

        /* JADX INFO: renamed from: r */
        public int m9795r() {
            return this.f7343g.f161556e;
        }

        /* JADX INFO: renamed from: s */
        public boolean m9796s(int i) {
            return !this.f7343g.m180068c(i).m180080h();
        }

        /* JADX INFO: renamed from: t */
        public boolean m9797t(int i) {
            return i == m9783f() - 1 && this.f7343g.m180071f(i);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i = this.f7339c;
            if (i != 0) {
                bundle.putInt(f7331h, i);
            }
            long j = this.f7340d;
            if (j != -9223372036854775807L) {
                bundle.putLong(f7332i, j);
            }
            long j2 = this.f7341e;
            if (j2 != 0) {
                bundle.putLong(f7333j, j2);
            }
            boolean z = this.f7342f;
            if (z) {
                bundle.putBoolean(f7334k, z);
            }
            if (!this.f7343g.equals(r70.f161545g)) {
                bundle.putBundle(f7335l, this.f7343g.toBundle());
            }
            return bundle;
        }

        /* JADX INFO: renamed from: u */
        public boolean m9798u(int i) {
            return this.f7343g.m180068c(i).f161574h;
        }

        /* JADX INFO: renamed from: v */
        public b m9799v(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2) {
            return m9800w(obj, obj2, i, j, j2, r70.f161545g, false);
        }

        /* JADX INFO: renamed from: w */
        public b m9800w(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, r70 r70Var, boolean z) {
            this.f7337a = obj;
            this.f7338b = obj2;
            this.f7339c = i;
            this.f7340d = j;
            this.f7341e = j2;
            this.f7343g = r70Var;
            this.f7342f = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c0$c */
    public static final class c extends AbstractC1857c0 {

        /* JADX INFO: renamed from: f */
        public final ImmutableList<d> f7344f;

        /* JADX INFO: renamed from: g */
        public final ImmutableList<b> f7345g;

        /* JADX INFO: renamed from: h */
        public final int[] f7346h;

        /* JADX INFO: renamed from: i */
        public final int[] f7347i;

        public c(ImmutableList<d> immutableList, ImmutableList<b> immutableList2, int[] iArr) {
            w11.m204365a(immutableList.size() == iArr.length);
            this.f7344f = immutableList;
            this.f7345g = immutableList2;
            this.f7346h = iArr;
            this.f7347i = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f7347i[iArr[i]] = i;
            }
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: e */
        public int mo9449e(boolean z) {
            if (m9776u()) {
                return -1;
            }
            if (z) {
                return this.f7346h[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: f */
        public int mo9450f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: g */
        public int mo9451g(boolean z) {
            if (m9776u()) {
                return -1;
            }
            return z ? this.f7346h[mo9775t() - 1] : mo9775t() - 1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: i */
        public int mo9452i(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo9451g(z)) {
                return z ? this.f7346h[this.f7347i[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return mo9449e(z);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: k */
        public b mo9453k(int i, b bVar, boolean z) {
            b bVar2 = this.f7345g.get(i);
            bVar.m9800w(bVar2.f7337a, bVar2.f7338b, bVar2.f7339c, bVar2.f7340d, bVar2.f7341e, bVar2.f7343g, bVar2.f7342f);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: m */
        public int mo9771m() {
            return this.f7345g.size();
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: p */
        public int mo9455p(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo9449e(z)) {
                return z ? this.f7346h[this.f7347i[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return mo9451g(z);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: q */
        public Object mo9456q(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: s */
        public d mo9457s(int i, d dVar, long j) {
            d dVar2 = this.f7344f.get(i);
            dVar.m9809i(dVar2.f7365a, dVar2.f7367c, dVar2.f7368d, dVar2.f7369e, dVar2.f7370f, dVar2.f7371g, dVar2.f7372h, dVar2.f7373i, dVar2.f7375k, dVar2.f7377m, dVar2.f7378n, dVar2.f7379o, dVar2.f7380p, dVar2.f7381q);
            dVar.f7376l = dVar2.f7376l;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: t */
        public int mo9775t() {
            return this.f7344f.size();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c0$d */
    public static final class d implements InterfaceC1886e {

        /* JADX INFO: renamed from: b */
        @Nullable
        @Deprecated
        public Object f7366b;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Object f7368d;

        /* JADX INFO: renamed from: e */
        public long f7369e;

        /* JADX INFO: renamed from: f */
        public long f7370f;

        /* JADX INFO: renamed from: g */
        public long f7371g;

        /* JADX INFO: renamed from: h */
        public boolean f7372h;

        /* JADX INFO: renamed from: i */
        public boolean f7373i;

        /* JADX INFO: renamed from: j */
        @Deprecated
        public boolean f7374j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public C1944n.g f7375k;

        /* JADX INFO: renamed from: l */
        public boolean f7376l;

        /* JADX INFO: renamed from: m */
        public long f7377m;

        /* JADX INFO: renamed from: n */
        public long f7378n;

        /* JADX INFO: renamed from: o */
        public int f7379o;

        /* JADX INFO: renamed from: p */
        public int f7380p;

        /* JADX INFO: renamed from: q */
        public long f7381q;

        /* JADX INFO: renamed from: r */
        public static final Object f7356r = new Object();

        /* JADX INFO: renamed from: s */
        public static final Object f7357s = new Object();

        /* JADX INFO: renamed from: t */
        public static final C1944n f7358t = new C1944n.c().m10689c("com.google.android.exoplayer2.Timeline").m10692f(Uri.EMPTY).m10687a();

        /* JADX INFO: renamed from: u */
        public static final String f7359u = bmk0.m105181z0(1);

        /* JADX INFO: renamed from: v */
        public static final String f7360v = bmk0.m105181z0(2);

        /* JADX INFO: renamed from: w */
        public static final String f7361w = bmk0.m105181z0(3);

        /* JADX INFO: renamed from: x */
        public static final String f7362x = bmk0.m105181z0(4);

        /* JADX INFO: renamed from: y */
        public static final String f7363y = bmk0.m105181z0(5);

        /* JADX INFO: renamed from: z */
        public static final String f7364z = bmk0.m105181z0(6);

        /* JADX INFO: renamed from: A */
        public static final String f7348A = bmk0.m105181z0(7);

        /* JADX INFO: renamed from: B */
        public static final String f7349B = bmk0.m105181z0(8);

        /* JADX INFO: renamed from: C */
        public static final String f7350C = bmk0.m105181z0(9);

        /* JADX INFO: renamed from: D */
        public static final String f7351D = bmk0.m105181z0(10);

        /* JADX INFO: renamed from: E */
        public static final String f7352E = bmk0.m105181z0(11);

        /* JADX INFO: renamed from: F */
        public static final String f7353F = bmk0.m105181z0(12);

        /* JADX INFO: renamed from: G */
        public static final String f7354G = bmk0.m105181z0(13);

        /* JADX INFO: renamed from: H */
        public static final InterfaceC1886e.a<d> f7355H = new InterfaceC1886e.a() { // from class: l.zzi0
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return AbstractC1857c0.d.m9802b(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public Object f7365a = f7356r;

        /* JADX INFO: renamed from: c */
        public C1944n f7367c = f7358t;

        /* JADX INFO: renamed from: b */
        public static d m9802b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f7359u);
            C1944n c1944n = bundle2 != null ? (C1944n) C1944n.f7995p.mo10034a(bundle2) : C1944n.f7988i;
            long j = bundle.getLong(f7360v, -9223372036854775807L);
            long j2 = bundle.getLong(f7361w, -9223372036854775807L);
            long j3 = bundle.getLong(f7362x, -9223372036854775807L);
            boolean z = bundle.getBoolean(f7363y, false);
            boolean z2 = bundle.getBoolean(f7364z, false);
            Bundle bundle3 = bundle.getBundle(f7348A);
            C1944n.g gVar = bundle3 != null ? (C1944n.g) C1944n.g.f8075l.mo10034a(bundle3) : null;
            boolean z3 = bundle.getBoolean(f7349B, false);
            long j4 = bundle.getLong(f7350C, 0L);
            long j5 = bundle.getLong(f7351D, -9223372036854775807L);
            int i = bundle.getInt(f7352E, 0);
            int i2 = bundle.getInt(f7353F, 0);
            long j6 = bundle.getLong(f7354G, 0L);
            d dVar = new d();
            dVar.m9809i(f7357s, c1944n, null, j, j2, j3, z, z2, gVar, j4, j5, i, i2, j6);
            dVar.f7376l = z3;
            return dVar;
        }

        /* JADX INFO: renamed from: c */
        public long m9803c() {
            return bmk0.m105130e0(this.f7371g);
        }

        /* JADX INFO: renamed from: d */
        public long m9804d() {
            return bmk0.m105152l1(this.f7377m);
        }

        /* JADX INFO: renamed from: e */
        public long m9805e() {
            return this.f7377m;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (bmk0.m105123c(this.f7365a, dVar.f7365a) && bmk0.m105123c(this.f7367c, dVar.f7367c) && bmk0.m105123c(this.f7368d, dVar.f7368d) && bmk0.m105123c(this.f7375k, dVar.f7375k) && this.f7369e == dVar.f7369e && this.f7370f == dVar.f7370f && this.f7371g == dVar.f7371g && this.f7372h == dVar.f7372h && this.f7373i == dVar.f7373i && this.f7376l == dVar.f7376l && this.f7377m == dVar.f7377m && this.f7378n == dVar.f7378n && this.f7379o == dVar.f7379o && this.f7380p == dVar.f7380p && this.f7381q == dVar.f7381q) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public long m9806f() {
            return bmk0.m105152l1(this.f7378n);
        }

        /* JADX INFO: renamed from: g */
        public long m9807g() {
            return this.f7381q;
        }

        /* JADX INFO: renamed from: h */
        public boolean m9808h() {
            w11.m204371g(this.f7374j == (this.f7375k != null));
            return this.f7375k != null;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f7365a.hashCode()) * 31) + this.f7367c.hashCode()) * 31;
            Object obj = this.f7368d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C1944n.g gVar = this.f7375k;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j = this.f7369e;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f7370f;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f7371g;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f7372h ? 1 : 0)) * 31) + (this.f7373i ? 1 : 0)) * 31) + (this.f7376l ? 1 : 0)) * 31;
            long j4 = this.f7377m;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f7378n;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f7379o) * 31) + this.f7380p) * 31;
            long j6 = this.f7381q;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        /* JADX INFO: renamed from: i */
        public d m9809i(Object obj, @Nullable C1944n c1944n, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable C1944n.g gVar, long j4, long j5, int i, int i2, long j6) {
            C1944n.h hVar;
            this.f7365a = obj;
            this.f7367c = c1944n != null ? c1944n : f7358t;
            this.f7366b = (c1944n == null || (hVar = c1944n.f7997b) == null) ? null : hVar.f8102i;
            this.f7368d = obj2;
            this.f7369e = j;
            this.f7370f = j2;
            this.f7371g = j3;
            this.f7372h = z;
            this.f7373i = z2;
            this.f7374j = gVar != null;
            this.f7375k = gVar;
            this.f7377m = j4;
            this.f7378n = j5;
            this.f7379o = i;
            this.f7380p = i2;
            this.f7381q = j6;
            this.f7376l = false;
            return this;
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!C1944n.f7988i.equals(this.f7367c)) {
                bundle.putBundle(f7359u, this.f7367c.toBundle());
            }
            long j = this.f7369e;
            if (j != -9223372036854775807L) {
                bundle.putLong(f7360v, j);
            }
            long j2 = this.f7370f;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(f7361w, j2);
            }
            long j3 = this.f7371g;
            if (j3 != -9223372036854775807L) {
                bundle.putLong(f7362x, j3);
            }
            boolean z = this.f7372h;
            if (z) {
                bundle.putBoolean(f7363y, z);
            }
            boolean z2 = this.f7373i;
            if (z2) {
                bundle.putBoolean(f7364z, z2);
            }
            C1944n.g gVar = this.f7375k;
            if (gVar != null) {
                bundle.putBundle(f7348A, gVar.toBundle());
            }
            boolean z3 = this.f7376l;
            if (z3) {
                bundle.putBoolean(f7349B, z3);
            }
            long j4 = this.f7377m;
            if (j4 != 0) {
                bundle.putLong(f7350C, j4);
            }
            long j5 = this.f7378n;
            if (j5 != -9223372036854775807L) {
                bundle.putLong(f7351D, j5);
            }
            int i = this.f7379o;
            if (i != 0) {
                bundle.putInt(f7352E, i);
            }
            int i2 = this.f7380p;
            if (i2 != 0) {
                bundle.putInt(f7353F, i2);
            }
            long j6 = this.f7381q;
            if (j6 != 0) {
                bundle.putLong(f7354G, j6);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1857c0 m9766b(Bundle bundle) {
        ImmutableList immutableListM9767c = m9767c(d.f7355H, bj3.m104588a(bundle, f7327b));
        ImmutableList immutableListM9767c2 = m9767c(b.f7336m, bj3.m104588a(bundle, f7328c));
        int[] intArray = bundle.getIntArray(f7329d);
        if (intArray == null) {
            intArray = m9768d(immutableListM9767c.size());
        }
        return new c(immutableListM9767c, immutableListM9767c2, intArray);
    }

    /* JADX INFO: renamed from: c */
    public static <T extends InterfaceC1886e> ImmutableList<T> m9767c(InterfaceC1886e.a<T> aVar, @Nullable IBinder iBinder) {
        if (iBinder == null) {
            return ImmutableList.m15739of();
        }
        ImmutableList.C2804a c2804a = new ImmutableList.C2804a();
        ImmutableList<Bundle> immutableListM98348a = aj3.m98348a(iBinder);
        for (int i = 0; i < immutableListM98348a.size(); i++) {
            c2804a.mo15737a(aVar.mo10034a(immutableListM98348a.get(i)));
        }
        return c2804a.m15756m();
    }

    /* JADX INFO: renamed from: d */
    public static int[] m9768d(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public int mo9449e(boolean z) {
        return m9776u() ? -1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int iMo9451g;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1857c0)) {
            return false;
        }
        AbstractC1857c0 abstractC1857c0 = (AbstractC1857c0) obj;
        if (abstractC1857c0.mo9775t() != mo9775t() || abstractC1857c0.mo9771m() != mo9771m()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i = 0; i < mo9775t(); i++) {
            if (!m9774r(i, dVar).equals(abstractC1857c0.m9774r(i, dVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo9771m(); i2++) {
            if (!mo9453k(i2, bVar, true).equals(abstractC1857c0.mo9453k(i2, bVar2, true))) {
                return false;
            }
        }
        int iMo9449e = mo9449e(true);
        if (iMo9449e != abstractC1857c0.mo9449e(true) || (iMo9451g = mo9451g(true)) != abstractC1857c0.mo9451g(true)) {
            return false;
        }
        while (iMo9449e != iMo9451g) {
            int iMo9452i = mo9452i(iMo9449e, 0, true);
            if (iMo9452i != abstractC1857c0.mo9452i(iMo9449e, 0, true)) {
                return false;
            }
            iMo9449e = iMo9452i;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo9450f(Object obj);

    /* JADX INFO: renamed from: g */
    public int mo9451g(boolean z) {
        if (m9776u()) {
            return -1;
        }
        return mo9775t() - 1;
    }

    /* JADX INFO: renamed from: h */
    public final int m9769h(int i, b bVar, d dVar, int i2, boolean z) {
        int i3 = m9770j(i, bVar).f7339c;
        if (m9774r(i3, dVar).f7380p != i) {
            return i + 1;
        }
        int iMo9452i = mo9452i(i3, i2, z);
        if (iMo9452i == -1) {
            return -1;
        }
        return m9774r(iMo9452i, dVar).f7379o;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iMo9775t = 217 + mo9775t();
        for (int i = 0; i < mo9775t(); i++) {
            iMo9775t = (iMo9775t * 31) + m9774r(i, dVar).hashCode();
        }
        int iMo9771m = (iMo9775t * 31) + mo9771m();
        for (int i2 = 0; i2 < mo9771m(); i2++) {
            iMo9771m = (iMo9771m * 31) + mo9453k(i2, bVar, true).hashCode();
        }
        int iMo9449e = mo9449e(true);
        while (iMo9449e != -1) {
            iMo9771m = (iMo9771m * 31) + iMo9449e;
            iMo9449e = mo9452i(iMo9449e, 0, true);
        }
        return iMo9771m;
    }

    /* JADX INFO: renamed from: i */
    public int mo9452i(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo9451g(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo9451g(z) ? mo9449e(z) : i + 1;
        }
        wpg0.m207458a();
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final b m9770j(int i, b bVar) {
        return mo9453k(i, bVar, false);
    }

    /* JADX INFO: renamed from: k */
    public abstract b mo9453k(int i, b bVar, boolean z);

    /* JADX INFO: renamed from: l */
    public b mo9454l(Object obj, b bVar) {
        return mo9453k(mo9450f(obj), bVar, true);
    }

    /* JADX INFO: renamed from: m */
    public abstract int mo9771m();

    /* JADX INFO: renamed from: n */
    public final Pair<Object, Long> m9772n(d dVar, b bVar, int i, long j) {
        return (Pair) w11.m204369e(m9773o(dVar, bVar, i, j, 0L));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Pair<Object, Long> m9773o(d dVar, b bVar, int i, long j, long j2) {
        w11.m204367c(i, 0, mo9775t());
        mo9457s(i, dVar, j2);
        if (j == -9223372036854775807L) {
            j = dVar.m9805e();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = dVar.f7379o;
        m9770j(i2, bVar);
        while (i2 < dVar.f7380p && bVar.f7341e != j) {
            int i3 = i2 + 1;
            if (m9770j(i3, bVar).f7341e > j) {
                break;
            }
            i2 = i3;
        }
        mo9453k(i2, bVar, true);
        long jMin = j - bVar.f7341e;
        long j3 = bVar.f7340d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        return Pair.create(w11.m204369e(bVar.f7338b), Long.valueOf(Math.max(0L, jMin)));
    }

    /* JADX INFO: renamed from: p */
    public int mo9455p(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo9449e(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo9449e(z) ? mo9451g(z) : i - 1;
        }
        wpg0.m207458a();
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public abstract Object mo9456q(int i);

    /* JADX INFO: renamed from: r */
    public final d m9774r(int i, d dVar) {
        return mo9457s(i, dVar, 0L);
    }

    /* JADX INFO: renamed from: s */
    public abstract d mo9457s(int i, d dVar, long j);

    /* JADX INFO: renamed from: t */
    public abstract int mo9775t();

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int iMo9775t = mo9775t();
        d dVar = new d();
        for (int i = 0; i < iMo9775t; i++) {
            arrayList.add(mo9457s(i, dVar, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int iMo9771m = mo9771m();
        b bVar = new b();
        for (int i2 = 0; i2 < iMo9771m; i2++) {
            arrayList2.add(mo9453k(i2, bVar, false).toBundle());
        }
        int[] iArr = new int[iMo9775t];
        if (iMo9775t > 0) {
            iArr[0] = mo9449e(true);
        }
        for (int i3 = 1; i3 < iMo9775t; i3++) {
            iArr[i3] = mo9452i(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        bj3.m104590c(bundle, f7327b, new aj3(arrayList));
        bj3.m104590c(bundle, f7328c, new aj3(arrayList2));
        bundle.putIntArray(f7329d, iArr);
        return bundle;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m9776u() {
        return mo9775t() == 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m9777v(int i, b bVar, d dVar, int i2, boolean z) {
        return m9769h(i, bVar, dVar, i2, z) == -1;
    }
}
