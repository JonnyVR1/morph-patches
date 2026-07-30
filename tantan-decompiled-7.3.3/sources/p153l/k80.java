package p153l;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.MultimapBuilder;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class k80 extends es2 {

    /* JADX INFO: renamed from: h */
    public final md2 f124319h;

    /* JADX INFO: renamed from: i */
    public final long f124320i;

    /* JADX INFO: renamed from: j */
    public final long f124321j;

    /* JADX INFO: renamed from: k */
    public final long f124322k;

    /* JADX INFO: renamed from: l */
    public final int f124323l;

    /* JADX INFO: renamed from: m */
    public final int f124324m;

    /* JADX INFO: renamed from: n */
    public final float f124325n;

    /* JADX INFO: renamed from: o */
    public final float f124326o;

    /* JADX INFO: renamed from: p */
    public final ImmutableList<C18116a> f124327p;

    /* JADX INFO: renamed from: q */
    public final qa5 f124328q;

    /* JADX INFO: renamed from: r */
    public float f124329r;

    /* JADX INFO: renamed from: s */
    public int f124330s;

    /* JADX INFO: renamed from: t */
    public int f124331t;

    /* JADX INFO: renamed from: u */
    public long f124332u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public crx f124333v;

    /* JADX INFO: renamed from: w */
    public long f124334w;

    /* JADX INFO: renamed from: l.k80$a */
    public static final class C18116a {

        /* JADX INFO: renamed from: a */
        public final long f124335a;

        /* JADX INFO: renamed from: b */
        public final long f124336b;

        public C18116a(long j, long j2) {
            this.f124335a = j;
            this.f124336b = j2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18116a)) {
                return false;
            }
            C18116a c18116a = (C18116a) obj;
            return this.f124335a == c18116a.f124335a && this.f124336b == c18116a.f124336b;
        }

        public int hashCode() {
            return (((int) this.f124335a) * 31) + ((int) this.f124336b);
        }
    }

    public k80(dfj0 dfj0Var, int[] iArr, int i, md2 md2Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List<C18116a> list, qa5 qa5Var) {
        long j4;
        super(dfj0Var, iArr, i);
        if (j3 < j) {
            kyv.m152151i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j4 = j;
        } else {
            j4 = j3;
        }
        this.f124319h = md2Var;
        this.f124320i = j * 1000;
        this.f124321j = j2 * 1000;
        this.f124322k = j4 * 1000;
        this.f124323l = i2;
        this.f124324m = i3;
        this.f124325n = f;
        this.f124326o = f2;
        this.f124327p = ImmutableList.copyOf((Collection) list);
        this.f124328q = qa5Var;
        this.f124329r = 1.0f;
        this.f124331t = 0;
        this.f124332u = -9223372036854775807L;
        this.f124334w = Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: D */
    public static long[][] m148647D(u9f.C20527a[] c20527aArr) {
        long[][] jArr = new long[c20527aArr.length][];
        for (int i = 0; i < c20527aArr.length; i++) {
            u9f.C20527a c20527a = c20527aArr[i];
            if (c20527a == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[c20527a.f178113b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = c20527a.f178113b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    long j = c20527a.f178112a.m115519c(iArr[i2]).f7781h;
                    long[] jArr2 = jArr[i];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i2] = j;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    /* JADX INFO: renamed from: E */
    public static ImmutableList<Integer> m148648E(long[][] jArr) {
        ju10 ju10VarMo16127e = MultimapBuilder.m16124c().m16128a().mo16127e();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    int length2 = jArr3.length;
                    double dLog = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (i2 >= length2) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i2] = dLog;
                    i2++;
                }
                int i3 = length - 1;
                double d = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d2 = dArr[i4];
                    i4++;
                    ju10VarMo16127e.put(Double.valueOf(d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((d2 + dArr[i4]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i));
                }
            }
        }
        return ImmutableList.copyOf(ju10VarMo16127e.values());
    }

    /* JADX INFO: renamed from: v */
    public static void m148650v(List<ImmutableList.C2804a<C18116a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            ImmutableList.C2804a<C18116a> c2804a = list.get(i);
            if (c2804a != null) {
                c2804a.mo15737a(new C18116a(j, jArr[i]));
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static ImmutableList<ImmutableList<C18116a>> m148651y(u9f.C20527a[] c20527aArr) {
        ArrayList arrayList = new ArrayList();
        for (u9f.C20527a c20527a : c20527aArr) {
            if (c20527a == null || c20527a.f178113b.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
                c2804aBuilder.mo15737a(new C18116a(0L, 0L));
                arrayList.add(c2804aBuilder);
            }
        }
        long[][] jArrM148647D = m148647D(c20527aArr);
        int[] iArr = new int[jArrM148647D.length];
        long[] jArr = new long[jArrM148647D.length];
        for (int i = 0; i < jArrM148647D.length; i++) {
            long[] jArr2 = jArrM148647D[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        m148650v(arrayList, jArr);
        ImmutableList<Integer> immutableListM148648E = m148648E(jArrM148647D);
        for (int i2 = 0; i2 < immutableListM148648E.size(); i2++) {
            int iIntValue = immutableListM148648E.get(i2).intValue();
            int i3 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i3;
            jArr[iIntValue] = jArrM148647D[iIntValue][i3];
            m148650v(arrayList, jArr);
        }
        for (int i4 = 0; i4 < c20527aArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        m148650v(arrayList, jArr);
        ImmutableList.C2804a c2804aBuilder2 = ImmutableList.builder();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ImmutableList.C2804a c2804a = (ImmutableList.C2804a) arrayList.get(i5);
            c2804aBuilder2.mo15737a(c2804a == null ? ImmutableList.m15739of() : c2804a.m15756m());
        }
        return c2804aBuilder2.m15756m();
    }

    /* JADX INFO: renamed from: A */
    public final long m148652A(List<? extends crx> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        crx crxVar = (crx) akq.m98599g(list);
        long j = crxVar.f144932g;
        if (j != -9223372036854775807L) {
            long j2 = crxVar.f144933h;
            if (j2 != -9223372036854775807L) {
                return j2 - j;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: B */
    public long m148653B() {
        return this.f124322k;
    }

    /* JADX INFO: renamed from: C */
    public final long m148654C(drx[] drxVarArr, List<? extends crx> list) {
        int i = this.f124330s;
        if (i < drxVarArr.length && drxVarArr[i].next()) {
            drx drxVar = drxVarArr[this.f124330s];
            return drxVar.mo11144a() - drxVar.mo11145b();
        }
        for (drx drxVar2 : drxVarArr) {
            if (drxVar2.next()) {
                return drxVar2.mo11144a() - drxVar2.mo11145b();
            }
        }
        return m148652A(list);
    }

    /* JADX INFO: renamed from: F */
    public final long m148655F(long j) {
        long jMo157940c = this.f124319h.mo157940c();
        this.f124334w = jMo157940c;
        long j2 = (long) (jMo157940c * this.f124325n);
        long jM157942e = this.f124319h.m157942e();
        if (jM157942e == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (j2 / this.f124329r);
        }
        float f = j;
        return (long) ((j2 * Math.max((f / this.f124329r) - jM157942e, 0.0f)) / f);
    }

    /* JADX INFO: renamed from: G */
    public final long m148656G(long j, long j2) {
        if (j == -9223372036854775807L) {
            return this.f124320i;
        }
        if (j2 != -9223372036854775807L) {
            j -= j2;
        }
        return Math.min((long) (j * this.f124326o), this.f124320i);
    }

    /* JADX INFO: renamed from: H */
    public boolean m148657H(long j, List<? extends crx> list) {
        long j2 = this.f124332u;
        if (j2 == -9223372036854775807L || j - j2 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((crx) akq.m98599g(list)).equals(this.f124333v)) ? false : true;
    }

    @Override // p153l.u9f
    /* JADX INFO: renamed from: b */
    public int mo11355b() {
        return this.f124330s;
    }

    @Override // p153l.es2, p153l.u9f
    @CallSuper
    public void disable() {
        this.f124333v = null;
    }

    @Override // p153l.es2, p153l.u9f
    @CallSuper
    public void enable() {
        this.f124332u = -9223372036854775807L;
        this.f124333v = null;
    }

    @Override // p153l.u9f
    /* JADX INFO: renamed from: g */
    public void mo11360g(long j, long j2, long j3, List<? extends crx> list, drx[] drxVarArr) {
        long jElapsedRealtime = this.f124328q.elapsedRealtime();
        long jM148654C = m148654C(drxVarArr, list);
        int i = this.f124331t;
        if (i == 0) {
            this.f124331t = 1;
            this.f124330s = m148659x(jElapsedRealtime, jM148654C);
            return;
        }
        int i2 = this.f124330s;
        int iMo11371r = list.isEmpty() ? -1 : mo11371r(((crx) akq.m98599g(list)).f144929d);
        if (iMo11371r != -1) {
            i = ((crx) akq.m98599g(list)).f144930e;
            i2 = iMo11371r;
        }
        int iM148659x = m148659x(jElapsedRealtime, jM148654C);
        if (iM148659x != i2 && !mo11354a(i2, jElapsedRealtime)) {
            C1894k c1894kMo11366m = mo11366m(i2);
            C1894k c1894kMo11366m2 = mo11366m(iM148659x);
            long jM148656G = m148656G(j3, jM148654C);
            int i3 = c1894kMo11366m2.f7781h;
            int i4 = c1894kMo11366m.f7781h;
            if ((i3 > i4 && j2 < jM148656G) || (i3 < i4 && j2 >= this.f124321j)) {
                iM148659x = i2;
            }
        }
        if (iM148659x != i2) {
            i = 3;
        }
        this.f124331t = i;
        this.f124330s = iM148659x;
    }

    @Override // p153l.es2, p153l.u9f
    /* JADX INFO: renamed from: i */
    public int mo11362i(long j, List<? extends crx> list) {
        int i;
        int i2;
        long jElapsedRealtime = this.f124328q.elapsedRealtime();
        if (!m148657H(jElapsedRealtime, list)) {
            return list.size();
        }
        this.f124332u = jElapsedRealtime;
        this.f124333v = list.isEmpty() ? null : (crx) akq.m98599g(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM105142i0 = bmk0.m105142i0(list.get(size - 1).f144932g - j, this.f124329r);
        long jM148653B = m148653B();
        if (jM105142i0 >= jM148653B) {
            C1894k c1894kMo11366m = mo11366m(m148659x(jElapsedRealtime, m148652A(list)));
            for (int i3 = 0; i3 < size; i3++) {
                crx crxVar = list.get(i3);
                C1894k c1894k = crxVar.f144929d;
                if (bmk0.m105142i0(crxVar.f144932g - j, this.f124329r) >= jM148653B && c1894k.f7781h < c1894kMo11366m.f7781h && (i = c1894k.f7791r) != -1 && i <= this.f124324m && (i2 = c1894k.f7790q) != -1 && i2 <= this.f124323l && i < c1894kMo11366m.f7791r) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // p153l.es2, p153l.u9f
    /* JADX INFO: renamed from: n */
    public void mo11367n(float f) {
        this.f124329r = f;
    }

    @Override // p153l.u9f
    @Nullable
    /* JADX INFO: renamed from: o */
    public Object mo11368o() {
        return null;
    }

    @Override // p153l.u9f
    /* JADX INFO: renamed from: s */
    public int mo11372s() {
        return this.f124331t;
    }

    /* JADX INFO: renamed from: w */
    public boolean m148658w(C1894k c1894k, int i, long j) {
        return ((long) i) <= j;
    }

    /* JADX INFO: renamed from: x */
    public final int m148659x(long j, long j2) {
        long jM148660z = m148660z(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.f95556b; i2++) {
            if (j == Long.MIN_VALUE || !mo11354a(i2, j)) {
                C1894k c1894kMo11366m = mo11366m(i2);
                if (m148658w(c1894kMo11366m, c1894kMo11366m.f7781h, jM148660z)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: z */
    public final long m148660z(long j) {
        long jM148655F = m148655F(j);
        if (this.f124327p.isEmpty()) {
            return jM148655F;
        }
        int i = 1;
        while (i < this.f124327p.size() - 1 && this.f124327p.get(i).f124335a < jM148655F) {
            i++;
        }
        C18116a c18116a = this.f124327p.get(i - 1);
        C18116a c18116a2 = this.f124327p.get(i);
        long j2 = c18116a.f124335a;
        float f = (jM148655F - j2) / (c18116a2.f124335a - j2);
        long j3 = c18116a.f124336b;
        return j3 + ((long) (f * (c18116a2.f124336b - j3)));
    }

    /* JADX INFO: renamed from: l.k80$b */
    public static class C18117b implements u9f.InterfaceC20528b {

        /* JADX INFO: renamed from: a */
        public final int f124337a;

        /* JADX INFO: renamed from: b */
        public final int f124338b;

        /* JADX INFO: renamed from: c */
        public final int f124339c;

        /* JADX INFO: renamed from: d */
        public final int f124340d;

        /* JADX INFO: renamed from: e */
        public final int f124341e;

        /* JADX INFO: renamed from: f */
        public final float f124342f;

        /* JADX INFO: renamed from: g */
        public final float f124343g;

        /* JADX INFO: renamed from: h */
        public final qa5 f124344h;

        public C18117b(int i, int i2, int i3, int i4, int i5, float f, float f2, qa5 qa5Var) {
            this.f124337a = i;
            this.f124338b = i2;
            this.f124339c = i3;
            this.f124340d = i4;
            this.f124341e = i5;
            this.f124342f = f;
            this.f124343g = f2;
            this.f124344h = qa5Var;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0015  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.u9f.InterfaceC20528b
        /* JADX INFO: renamed from: a */
        public final u9f[] mo148661a(u9f.C20527a[] c20527aArr, md2 md2Var, InterfaceC1988i.b bVar, AbstractC1857c0 abstractC1857c0) {
            C18117b c18117b;
            md2 md2Var2;
            u9f u9fVarM148662b;
            ImmutableList immutableListM148651y = k80.m148651y(c20527aArr);
            u9f[] u9fVarArr = new u9f[c20527aArr.length];
            int i = 0;
            while (i < c20527aArr.length) {
                u9f.C20527a c20527a = c20527aArr[i];
                if (c20527a != null) {
                    int[] iArr = c20527a.f178113b;
                    if (iArr.length == 0) {
                        c18117b = this;
                        md2Var2 = md2Var;
                    } else {
                        int length = iArr.length;
                        dfj0 dfj0Var = c20527a.f178112a;
                        if (length == 1) {
                            c18117b = this;
                            u9fVarM148662b = new ori(dfj0Var, iArr[0], c20527a.f178114c);
                            md2Var2 = md2Var;
                        } else {
                            c18117b = this;
                            md2Var2 = md2Var;
                            u9fVarM148662b = c18117b.m148662b(dfj0Var, iArr, c20527a.f178114c, md2Var2, (ImmutableList) immutableListM148651y.get(i));
                        }
                        u9fVarArr[i] = u9fVarM148662b;
                    }
                } else {
                    c18117b = this;
                    md2Var2 = md2Var;
                }
                i++;
                this = c18117b;
                md2Var = md2Var2;
            }
            return u9fVarArr;
        }

        /* JADX INFO: renamed from: b */
        public k80 m148662b(dfj0 dfj0Var, int[] iArr, int i, md2 md2Var, ImmutableList<C18116a> immutableList) {
            return new k80(dfj0Var, iArr, i, md2Var, this.f124337a, this.f124338b, this.f124339c, this.f124340d, this.f124341e, this.f124342f, this.f124343g, immutableList, this.f124344h);
        }

        public C18117b(int i, int i2, int i3, float f) {
            this(i, i2, i3, 1279, 719, f, 0.75f, qa5.f156345a);
        }

        public C18117b() {
            this(10000, 25000, 25000, 0.7f);
        }
    }
}
