package p149l;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.MultimapBuilder;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class o80 extends or2 {

    /* JADX INFO: renamed from: h */
    public final fd2 f142563h;

    /* JADX INFO: renamed from: i */
    public final long f142564i;

    /* JADX INFO: renamed from: j */
    public final long f142565j;

    /* JADX INFO: renamed from: k */
    public final long f142566k;

    /* JADX INFO: renamed from: l */
    public final int f142567l;

    /* JADX INFO: renamed from: m */
    public final int f142568m;

    /* JADX INFO: renamed from: n */
    public final float f142569n;

    /* JADX INFO: renamed from: o */
    public final float f142570o;

    /* JADX INFO: renamed from: p */
    public final ImmutableList<C18869a> f142571p;

    /* JADX INFO: renamed from: q */
    public final p95 f142572q;

    /* JADX INFO: renamed from: r */
    public float f142573r;

    /* JADX INFO: renamed from: s */
    public int f142574s;

    /* JADX INFO: renamed from: t */
    public int f142575t;

    /* JADX INFO: renamed from: u */
    public long f142576u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public fix f142577v;

    /* JADX INFO: renamed from: w */
    public long f142578w;

    /* JADX INFO: renamed from: l.o80$a */
    public static final class C18869a {

        /* JADX INFO: renamed from: a */
        public final long f142579a;

        /* JADX INFO: renamed from: b */
        public final long f142580b;

        public C18869a(long j, long j2) {
            this.f142579a = j;
            this.f142580b = j2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18869a)) {
                return false;
            }
            C18869a c18869a = (C18869a) obj;
            return this.f142579a == c18869a.f142579a && this.f142580b == c18869a.f142580b;
        }

        public int hashCode() {
            return (((int) this.f142579a) * 31) + ((int) this.f142580b);
        }
    }

    public o80(z5j0 z5j0Var, int[] iArr, int i, fd2 fd2Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List<C18869a> list, p95 p95Var) {
        long j4;
        super(z5j0Var, iArr, i);
        if (j3 < j) {
            jwv.m143689i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j4 = j;
        } else {
            j4 = j3;
        }
        this.f142563h = fd2Var;
        this.f142564i = j * 1000;
        this.f142565j = j2 * 1000;
        this.f142566k = j4 * 1000;
        this.f142567l = i2;
        this.f142568m = i3;
        this.f142569n = f;
        this.f142570o = f2;
        this.f142571p = ImmutableList.copyOf((Collection) list);
        this.f142572q = p95Var;
        this.f142573r = 1.0f;
        this.f142575t = 0;
        this.f142576u = -9223372036854775807L;
        this.f142578w = Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: D */
    public static long[][] m163089D(o8f.C18873a[] c18873aArr) {
        long[][] jArr = new long[c18873aArr.length][];
        for (int i = 0; i < c18873aArr.length; i++) {
            o8f.C18873a c18873a = c18873aArr[i];
            if (c18873a == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[c18873a.f142623b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = c18873a.f142623b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    long j = c18873a.f142622a.m217358c(iArr[i2]).f7744h;
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
    public static ImmutableList<Integer> m163090E(long[][] jArr) {
        bm10 bm10VarMo16073e = MultimapBuilder.m16070c().m16074a().mo16073e();
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
                    bm10VarMo16073e.put(Double.valueOf(d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((d2 + dArr[i4]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i));
                }
            }
        }
        return ImmutableList.copyOf(bm10VarMo16073e.values());
    }

    /* JADX INFO: renamed from: v */
    public static void m163092v(List<ImmutableList.C2781a<C18869a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            ImmutableList.C2781a<C18869a> c2781a = list.get(i);
            if (c2781a != null) {
                c2781a.mo15683a(new C18869a(j, jArr[i]));
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static ImmutableList<ImmutableList<C18869a>> m163093y(o8f.C18873a[] c18873aArr) {
        ArrayList arrayList = new ArrayList();
        for (o8f.C18873a c18873a : c18873aArr) {
            if (c18873a == null || c18873a.f142623b.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
                c2781aBuilder.mo15683a(new C18869a(0L, 0L));
                arrayList.add(c2781aBuilder);
            }
        }
        long[][] jArrM163089D = m163089D(c18873aArr);
        int[] iArr = new int[jArrM163089D.length];
        long[] jArr = new long[jArrM163089D.length];
        for (int i = 0; i < jArrM163089D.length; i++) {
            long[] jArr2 = jArrM163089D[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        m163092v(arrayList, jArr);
        ImmutableList<Integer> immutableListM163090E = m163090E(jArrM163089D);
        for (int i2 = 0; i2 < immutableListM163090E.size(); i2++) {
            int iIntValue = immutableListM163090E.get(i2).intValue();
            int i3 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i3;
            jArr[iIntValue] = jArrM163089D[iIntValue][i3];
            m163092v(arrayList, jArr);
        }
        for (int i4 = 0; i4 < c18873aArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        m163092v(arrayList, jArr);
        ImmutableList.C2781a c2781aBuilder2 = ImmutableList.builder();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ImmutableList.C2781a c2781a = (ImmutableList.C2781a) arrayList.get(i5);
            c2781aBuilder2.mo15683a(c2781a == null ? ImmutableList.m15685of() : c2781a.m15702m());
        }
        return c2781aBuilder2.m15702m();
    }

    /* JADX INFO: renamed from: A */
    public final long m163094A(List<? extends fix> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        fix fixVar = (fix) aiq.m96881g(list);
        long j = fixVar.f136917g;
        if (j != -9223372036854775807L) {
            long j2 = fixVar.f136918h;
            if (j2 != -9223372036854775807L) {
                return j2 - j;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: B */
    public long m163095B() {
        return this.f142566k;
    }

    /* JADX INFO: renamed from: C */
    public final long m163096C(gix[] gixVarArr, List<? extends fix> list) {
        int i = this.f142574s;
        if (i < gixVarArr.length && gixVarArr[i].next()) {
            gix gixVar = gixVarArr[this.f142574s];
            return gixVar.mo11090a() - gixVar.mo11091b();
        }
        for (gix gixVar2 : gixVarArr) {
            if (gixVar2.next()) {
                return gixVar2.mo11090a() - gixVar2.mo11091b();
            }
        }
        return m163094A(list);
    }

    /* JADX INFO: renamed from: F */
    public final long m163097F(long j) {
        long jMo120875c = this.f142563h.mo120875c();
        this.f142578w = jMo120875c;
        long j2 = (long) (jMo120875c * this.f142569n);
        long jM120877e = this.f142563h.m120877e();
        if (jM120877e == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (j2 / this.f142573r);
        }
        float f = j;
        return (long) ((j2 * Math.max((f / this.f142573r) - jM120877e, 0.0f)) / f);
    }

    /* JADX INFO: renamed from: G */
    public final long m163098G(long j, long j2) {
        if (j == -9223372036854775807L) {
            return this.f142564i;
        }
        if (j2 != -9223372036854775807L) {
            j -= j2;
        }
        return Math.min((long) (j * this.f142570o), this.f142564i);
    }

    /* JADX INFO: renamed from: H */
    public boolean m163099H(long j, List<? extends fix> list) {
        long j2 = this.f142576u;
        if (j2 == -9223372036854775807L || j - j2 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((fix) aiq.m96881g(list)).equals(this.f142577v)) ? false : true;
    }

    @Override // p149l.o8f
    /* JADX INFO: renamed from: b */
    public int mo11301b() {
        return this.f142574s;
    }

    @Override // p149l.or2, p149l.o8f
    @CallSuper
    public void disable() {
        this.f142577v = null;
    }

    @Override // p149l.or2, p149l.o8f
    @CallSuper
    public void enable() {
        this.f142576u = -9223372036854775807L;
        this.f142577v = null;
    }

    @Override // p149l.o8f
    /* JADX INFO: renamed from: g */
    public void mo11306g(long j, long j2, long j3, List<? extends fix> list, gix[] gixVarArr) {
        long jElapsedRealtime = this.f142572q.elapsedRealtime();
        long jM163096C = m163096C(gixVarArr, list);
        int i = this.f142575t;
        if (i == 0) {
            this.f142575t = 1;
            this.f142574s = m163101x(jElapsedRealtime, jM163096C);
            return;
        }
        int i2 = this.f142574s;
        int iMo11317r = list.isEmpty() ? -1 : mo11317r(((fix) aiq.m96881g(list)).f136914d);
        if (iMo11317r != -1) {
            i = ((fix) aiq.m96881g(list)).f136915e;
            i2 = iMo11317r;
        }
        int iM163101x = m163101x(jElapsedRealtime, jM163096C);
        if (iM163101x != i2 && !mo11300a(i2, jElapsedRealtime)) {
            C1871k c1871kMo11312m = mo11312m(i2);
            C1871k c1871kMo11312m2 = mo11312m(iM163101x);
            long jM163098G = m163098G(j3, jM163096C);
            int i3 = c1871kMo11312m2.f7744h;
            int i4 = c1871kMo11312m.f7744h;
            if ((i3 > i4 && j2 < jM163098G) || (i3 < i4 && j2 >= this.f142565j)) {
                iM163101x = i2;
            }
        }
        if (iM163101x != i2) {
            i = 3;
        }
        this.f142575t = i;
        this.f142574s = iM163101x;
    }

    @Override // p149l.or2, p149l.o8f
    /* JADX INFO: renamed from: i */
    public int mo11308i(long j, List<? extends fix> list) {
        int i;
        int i2;
        long jElapsedRealtime = this.f142572q.elapsedRealtime();
        if (!m163099H(jElapsedRealtime, list)) {
            return list.size();
        }
        this.f142576u = jElapsedRealtime;
        this.f142577v = list.isEmpty() ? null : (fix) aiq.m96881g(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM197864i0 = vck0.m197864i0(list.get(size - 1).f136917g - j, this.f142573r);
        long jM163095B = m163095B();
        if (jM197864i0 >= jM163095B) {
            C1871k c1871kMo11312m = mo11312m(m163101x(jElapsedRealtime, m163094A(list)));
            for (int i3 = 0; i3 < size; i3++) {
                fix fixVar = list.get(i3);
                C1871k c1871k = fixVar.f136914d;
                if (vck0.m197864i0(fixVar.f136917g - j, this.f142573r) >= jM163095B && c1871k.f7744h < c1871kMo11312m.f7744h && (i = c1871k.f7754r) != -1 && i <= this.f142568m && (i2 = c1871k.f7753q) != -1 && i2 <= this.f142567l && i < c1871kMo11312m.f7754r) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // p149l.or2, p149l.o8f
    /* JADX INFO: renamed from: n */
    public void mo11313n(float f) {
        this.f142573r = f;
    }

    @Override // p149l.o8f
    @Nullable
    /* JADX INFO: renamed from: o */
    public Object mo11314o() {
        return null;
    }

    @Override // p149l.o8f
    /* JADX INFO: renamed from: s */
    public int mo11318s() {
        return this.f142575t;
    }

    /* JADX INFO: renamed from: w */
    public boolean m163100w(C1871k c1871k, int i, long j) {
        return ((long) i) <= j;
    }

    /* JADX INFO: renamed from: x */
    public final int m163101x(long j, long j2) {
        long jM163102z = m163102z(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.f145214b; i2++) {
            if (j == Long.MIN_VALUE || !mo11300a(i2, j)) {
                C1871k c1871kMo11312m = mo11312m(i2);
                if (m163100w(c1871kMo11312m, c1871kMo11312m.f7744h, jM163102z)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: z */
    public final long m163102z(long j) {
        long jM163097F = m163097F(j);
        if (this.f142571p.isEmpty()) {
            return jM163097F;
        }
        int i = 1;
        while (i < this.f142571p.size() - 1 && this.f142571p.get(i).f142579a < jM163097F) {
            i++;
        }
        C18869a c18869a = this.f142571p.get(i - 1);
        C18869a c18869a2 = this.f142571p.get(i);
        long j2 = c18869a.f142579a;
        float f = (jM163097F - j2) / (c18869a2.f142579a - j2);
        long j3 = c18869a.f142580b;
        return j3 + ((long) (f * (c18869a2.f142580b - j3)));
    }

    /* JADX INFO: renamed from: l.o80$b */
    public static class C18870b implements o8f.InterfaceC18874b {

        /* JADX INFO: renamed from: a */
        public final int f142581a;

        /* JADX INFO: renamed from: b */
        public final int f142582b;

        /* JADX INFO: renamed from: c */
        public final int f142583c;

        /* JADX INFO: renamed from: d */
        public final int f142584d;

        /* JADX INFO: renamed from: e */
        public final int f142585e;

        /* JADX INFO: renamed from: f */
        public final float f142586f;

        /* JADX INFO: renamed from: g */
        public final float f142587g;

        /* JADX INFO: renamed from: h */
        public final p95 f142588h;

        public C18870b(int i, int i2, int i3, int i4, int i5, float f, float f2, p95 p95Var) {
            this.f142581a = i;
            this.f142582b = i2;
            this.f142583c = i3;
            this.f142584d = i4;
            this.f142585e = i5;
            this.f142586f = f;
            this.f142587g = f2;
            this.f142588h = p95Var;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0015  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.o8f.InterfaceC18874b
        /* JADX INFO: renamed from: a */
        public final o8f[] mo163103a(o8f.C18873a[] c18873aArr, fd2 fd2Var, InterfaceC1965i.b bVar, AbstractC1834c0 abstractC1834c0) {
            C18870b c18870b;
            fd2 fd2Var2;
            o8f o8fVarM163104b;
            ImmutableList immutableListM163093y = o80.m163093y(c18873aArr);
            o8f[] o8fVarArr = new o8f[c18873aArr.length];
            int i = 0;
            while (i < c18873aArr.length) {
                o8f.C18873a c18873a = c18873aArr[i];
                if (c18873a != null) {
                    int[] iArr = c18873a.f142623b;
                    if (iArr.length == 0) {
                        c18870b = this;
                        fd2Var2 = fd2Var;
                    } else {
                        int length = iArr.length;
                        z5j0 z5j0Var = c18873a.f142622a;
                        if (length == 1) {
                            c18870b = this;
                            o8fVarM163104b = new soi(z5j0Var, iArr[0], c18873a.f142624c);
                            fd2Var2 = fd2Var;
                        } else {
                            c18870b = this;
                            fd2Var2 = fd2Var;
                            o8fVarM163104b = c18870b.m163104b(z5j0Var, iArr, c18873a.f142624c, fd2Var2, (ImmutableList) immutableListM163093y.get(i));
                        }
                        o8fVarArr[i] = o8fVarM163104b;
                    }
                } else {
                    c18870b = this;
                    fd2Var2 = fd2Var;
                }
                i++;
                this = c18870b;
                fd2Var = fd2Var2;
            }
            return o8fVarArr;
        }

        /* JADX INFO: renamed from: b */
        public o80 m163104b(z5j0 z5j0Var, int[] iArr, int i, fd2 fd2Var, ImmutableList<C18869a> immutableList) {
            return new o80(z5j0Var, iArr, i, fd2Var, this.f142581a, this.f142582b, this.f142583c, this.f142584d, this.f142585e, this.f142586f, this.f142587g, immutableList, this.f142588h);
        }

        public C18870b(int i, int i2, int i3, float f) {
            this(i, i2, i3, 1279, 719, f, 0.75f, p95.f147671a);
        }

        public C18870b() {
            this(10000, 25000, 25000, 0.7f);
        }
    }
}
