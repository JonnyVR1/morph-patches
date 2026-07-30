package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import com.google.android.exoplayer2.drm.InterfaceC1855c;
import com.google.android.exoplayer2.source.C1973q;
import com.google.android.exoplayer2.source.InterfaceC1966j;
import com.google.android.exoplayer2.source.InterfaceC1974r;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.t35;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class s35<T extends t35> implements vod0, InterfaceC1974r, Loader.InterfaceC2041b<n35>, Loader.InterfaceC2045f {

    /* JADX INFO: renamed from: a */
    public final int f162042a;

    /* JADX INFO: renamed from: b */
    public final int[] f162043b;

    /* JADX INFO: renamed from: c */
    public final C1871k[] f162044c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f162045d;

    /* JADX INFO: renamed from: e */
    public final T f162046e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1974r.a<s35<T>> f162047f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1966j.a f162048g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2049c f162049h;

    /* JADX INFO: renamed from: i */
    public final Loader f162050i;

    /* JADX INFO: renamed from: j */
    public final p35 f162051j;

    /* JADX INFO: renamed from: k */
    public final ArrayList<lp2> f162052k;

    /* JADX INFO: renamed from: l */
    public final List<lp2> f162053l;

    /* JADX INFO: renamed from: m */
    public final C1973q f162054m;

    /* JADX INFO: renamed from: n */
    public final C1973q[] f162055n;

    /* JADX INFO: renamed from: o */
    public final np2 f162056o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public n35 f162057p;

    /* JADX INFO: renamed from: q */
    public C1871k f162058q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public InterfaceC19837b<T> f162059r;

    /* JADX INFO: renamed from: s */
    public long f162060s;

    /* JADX INFO: renamed from: t */
    public long f162061t;

    /* JADX INFO: renamed from: u */
    public int f162062u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public lp2 f162063v;

    /* JADX INFO: renamed from: w */
    public boolean f162064w;

    /* JADX INFO: renamed from: l.s35$b */
    public interface InterfaceC19837b<T extends t35> {
        /* JADX INFO: renamed from: b */
        void mo11056b(s35<T> s35Var);
    }

    public s35(int i, @Nullable int[] iArr, @Nullable C1871k[] c1871kArr, T t, InterfaceC1974r.a<s35<T>> aVar, sj0 sj0Var, long j, InterfaceC1855c interfaceC1855c, InterfaceC1854b.a aVar2, InterfaceC2049c interfaceC2049c, InterfaceC1966j.a aVar3) {
        this.f162042a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f162043b = iArr;
        this.f162044c = c1871kArr == null ? new C1871k[0] : c1871kArr;
        this.f162046e = t;
        this.f162047f = aVar;
        this.f162048g = aVar3;
        this.f162049h = interfaceC2049c;
        this.f162050i = new Loader("ChunkSampleStream");
        this.f162051j = new p35();
        ArrayList<lp2> arrayList = new ArrayList<>();
        this.f162052k = arrayList;
        this.f162053l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f162055n = new C1973q[length];
        this.f162045d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        C1973q[] c1973qArr = new C1973q[i3];
        C1973q c1973qM11411k = C1973q.m11411k(sj0Var, interfaceC1855c, aVar2);
        this.f162054m = c1973qM11411k;
        iArr2[0] = i;
        c1973qArr[0] = c1973qM11411k;
        while (i2 < length) {
            C1973q c1973qM11412l = C1973q.m11412l(sj0Var);
            this.f162055n[i2] = c1973qM11412l;
            int i4 = i2 + 1;
            c1973qArr[i4] = c1973qM11412l;
            iArr2[i4] = this.f162043b[i2];
            i2 = i4;
        }
        this.f162056o = new np2(iArr2, c1973qArr);
        this.f162060s = j;
        this.f162061t = j;
    }

    /* JADX INFO: renamed from: A */
    public final void m182098A(int i) {
        int iMin = Math.min(m182111N(i, 0), this.f162062u);
        if (iMin > 0) {
            vck0.m197828U0(this.f162052k, 0, iMin);
            this.f162062u -= iMin;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m182099B(int i) {
        p11.m167013g(!this.f162050i.m12088j());
        int size = this.f162052k.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!m182103F(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = m182102E().f136918h;
        lp2 lp2VarM182100C = m182100C(i);
        if (this.f162052k.isEmpty()) {
            this.f162060s = this.f162061t;
        }
        this.f162064w = false;
        this.f162048g.m11293w(this.f162042a, lp2VarM182100C.f136917g, j);
    }

    /* JADX INFO: renamed from: C */
    public final lp2 m182100C(int i) {
        lp2 lp2Var = this.f162052k.get(i);
        ArrayList<lp2> arrayList = this.f162052k;
        vck0.m197828U0(arrayList, i, arrayList.size());
        this.f162062u = Math.max(this.f162062u, this.f162052k.size());
        int i2 = 0;
        this.f162054m.m11456u(lp2Var.m150818i(0));
        while (true) {
            C1973q[] c1973qArr = this.f162055n;
            if (i2 >= c1973qArr.length) {
                return lp2Var;
            }
            C1973q c1973q = c1973qArr[i2];
            i2++;
            c1973q.m11456u(lp2Var.m150818i(i2));
        }
    }

    /* JADX INFO: renamed from: D */
    public T m182101D() {
        return this.f162046e;
    }

    /* JADX INFO: renamed from: E */
    public final lp2 m182102E() {
        ArrayList<lp2> arrayList = this.f162052k;
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m182103F(int i) {
        int iM11415C;
        lp2 lp2Var = this.f162052k.get(i);
        if (this.f162054m.m11415C() > lp2Var.m150818i(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C1973q[] c1973qArr = this.f162055n;
            if (i2 >= c1973qArr.length) {
                return false;
            }
            iM11415C = c1973qArr[i2].m11415C();
            i2++;
        } while (iM11415C <= lp2Var.m150818i(i2));
        return true;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m182104G(n35 n35Var) {
        return n35Var instanceof lp2;
    }

    /* JADX INFO: renamed from: H */
    public boolean m182105H() {
        return this.f162060s != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: I */
    public final void m182106I() {
        int iM182111N = m182111N(this.f162054m.m11415C(), this.f162062u - 1);
        while (true) {
            int i = this.f162062u;
            if (i > iM182111N) {
                return;
            }
            this.f162062u = i + 1;
            m182107J(i);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m182107J(int i) {
        lp2 lp2Var = this.f162052k.get(i);
        C1871k c1871k = lp2Var.f136914d;
        if (!c1871k.equals(this.f162058q)) {
            this.f162048g.m11278h(this.f162042a, c1871k, lp2Var.f136915e, lp2Var.f136916f, lp2Var.f136917g);
        }
        this.f162058q = c1871k;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo11024n(n35 n35Var, long j, long j2, boolean z) {
        this.f162057p = null;
        this.f162063v = null;
        lrv lrvVar = new lrv(n35Var.f136911a, n35Var.f136912b, n35Var.m157727f(), n35Var.m157726e(), j, j2, n35Var.m157724b());
        this.f162049h.m12122c(n35Var.f136911a);
        this.f162048g.m11281k(lrvVar, n35Var.f136913c, this.f162042a, n35Var.f136914d, n35Var.f136915e, n35Var.f136916f, n35Var.f136917g, n35Var.f136918h);
        if (z) {
            return;
        }
        if (m182105H()) {
            m182114Q();
        } else if (m182104G(n35Var)) {
            m182100C(this.f162052k.size() - 1);
            if (this.f162052k.isEmpty()) {
                this.f162060s = this.f162061t;
            }
        }
        this.f162047f.mo10216j(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo11025o(n35 n35Var, long j, long j2) {
        this.f162057p = null;
        this.f162046e.mo11068j(n35Var);
        lrv lrvVar = new lrv(n35Var.f136911a, n35Var.f136912b, n35Var.m157727f(), n35Var.m157726e(), j, j2, n35Var.m157724b());
        this.f162049h.m12122c(n35Var.f136911a);
        this.f162048g.m11284n(lrvVar, n35Var.f136913c, this.f162042a, n35Var.f136914d, n35Var.f136915e, n35Var.f136916f, n35Var.f136917g, n35Var.f136918h);
        this.f162047f.mo10216j(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public Loader.C2042c mo11026q(n35 n35Var, long j, long j2, IOException iOException, int i) {
        Loader.C2042c c2042cM12084h;
        long jM157724b = n35Var.m157724b();
        boolean zM182104G = m182104G(n35Var);
        int size = this.f162052k.size() - 1;
        boolean z = (jM157724b != 0 && zM182104G && m182103F(size)) ? false : true;
        lrv lrvVar = new lrv(n35Var.f136911a, n35Var.f136912b, n35Var.m157727f(), n35Var.m157726e(), j, j2, jM157724b);
        InterfaceC2049c.c cVar = new InterfaceC2049c.c(lrvVar, new nkx(n35Var.f136913c, this.f162042a, n35Var.f136914d, n35Var.f136915e, n35Var.f136916f, vck0.m197874l1(n35Var.f136917g), vck0.m197874l1(n35Var.f136918h)), iOException, i);
        if (!this.f162046e.mo11065e(n35Var, z, cVar, this.f162049h)) {
            c2042cM12084h = null;
        } else if (z) {
            c2042cM12084h = Loader.f9458f;
            if (zM182104G) {
                p11.m167013g(m182100C(size) == n35Var);
                if (this.f162052k.isEmpty()) {
                    this.f162060s = this.f162061t;
                }
            }
        } else {
            jwv.m143689i("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            c2042cM12084h = null;
        }
        if (c2042cM12084h == null) {
            long jMo12118a = this.f162049h.mo12118a(cVar);
            c2042cM12084h = jMo12118a != -9223372036854775807L ? Loader.m12084h(false, jMo12118a) : Loader.f9459g;
        }
        boolean zM12095c = c2042cM12084h.m12095c();
        this.f162048g.m11286p(lrvVar, n35Var.f136913c, this.f162042a, n35Var.f136914d, n35Var.f136915e, n35Var.f136916f, n35Var.f136917g, n35Var.f136918h, iOException, !zM12095c);
        if (!zM12095c) {
            this.f162057p = null;
            this.f162049h.m12122c(n35Var.f136911a);
            this.f162047f.mo10216j(this);
        }
        return c2042cM12084h;
    }

    /* JADX INFO: renamed from: N */
    public final int m182111N(int i, int i2) {
        ArrayList<lp2> arrayList;
        do {
            i2++;
            int size = this.f162052k.size();
            arrayList = this.f162052k;
            if (i2 >= size) {
                return arrayList.size() - 1;
            }
        } while (arrayList.get(i2).m150818i(0) <= i);
        return i2 - 1;
    }

    /* JADX INFO: renamed from: O */
    public void m182112O() {
        m182113P(null);
    }

    /* JADX INFO: renamed from: P */
    public void m182113P(@Nullable InterfaceC19837b<T> interfaceC19837b) {
        this.f162059r = interfaceC19837b;
        this.f162054m.m11429Q();
        for (C1973q c1973q : this.f162055n) {
            c1973q.m11429Q();
        }
        this.f162050i.m12091m(this);
    }

    /* JADX INFO: renamed from: Q */
    public final void m182114Q() {
        this.f162054m.m11433U();
        for (C1973q c1973q : this.f162055n) {
            c1973q.m11433U();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m182115R(long j) throws Throwable {
        lp2 lp2Var;
        boolean zM11437Y;
        this.f162061t = j;
        if (m182105H()) {
            this.f162060s = j;
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < this.f162052k.size()) {
                lp2Var = this.f162052k.get(i2);
                long j2 = lp2Var.f136917g;
                if (j2 == j && lp2Var.f129154k == -9223372036854775807L) {
                    break;
                } else if (j2 <= j) {
                    i2++;
                }
            }
            lp2Var = null;
            break;
        }
        C1973q c1973q = this.f162054m;
        if (lp2Var != null) {
            zM11437Y = c1973q.m11436X(lp2Var.m150818i(0));
        } else {
            zM11437Y = c1973q.m11437Y(j, j < mo10926f());
        }
        if (zM11437Y) {
            this.f162062u = m182111N(this.f162054m.m11415C(), 0);
            C1973q[] c1973qArr = this.f162055n;
            int length = c1973qArr.length;
            while (i < length) {
                c1973qArr[i].m11437Y(j, true);
                i++;
            }
            return;
        }
        this.f162060s = j;
        this.f162064w = false;
        this.f162052k.clear();
        this.f162062u = 0;
        if (!this.f162050i.m12088j()) {
            this.f162050i.m12086g();
            m182114Q();
            return;
        }
        this.f162054m.m11453r();
        C1973q[] c1973qArr2 = this.f162055n;
        int length2 = c1973qArr2.length;
        while (i < length2) {
            c1973qArr2[i].m11453r();
            i++;
        }
        this.f162050i.m12085f();
    }

    /* JADX INFO: renamed from: S */
    public s35<T>.C19836a m182116S(long j, int i) throws Throwable {
        for (int i2 = 0; i2 < this.f162055n.length; i2++) {
            if (this.f162043b[i2] == i) {
                p11.m167013g(!this.f162045d[i2]);
                this.f162045d[i2] = true;
                this.f162055n[i2].m11437Y(j, true);
                return new C19836a(this, this.f162055n[i2], i2);
            }
        }
        ohg0.m164364a();
        return null;
    }

    @Override // p149l.vod0
    /* JADX INFO: renamed from: a */
    public void mo10939a() throws IOException {
        this.f162050i.mo11027a();
        this.f162054m.m11425M();
        if (this.f162050i.m12088j()) {
            return;
        }
        this.f162046e.mo11062a();
    }

    @Override // p149l.vod0
    /* JADX INFO: renamed from: b */
    public boolean mo10940b() {
        return !m182105H() && this.f162054m.m11423K(this.f162064w);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: c */
    public boolean mo10923c(long j) {
        List<lp2> list;
        long j2;
        if (this.f162064w || this.f162050i.m12088j() || this.f162050i.m12087i()) {
            return false;
        }
        boolean zM182105H = m182105H();
        if (zM182105H) {
            list = Collections.EMPTY_LIST;
            j2 = this.f162060s;
        } else {
            list = this.f162053l;
            j2 = m182102E().f136918h;
        }
        this.f162046e.mo11067h(j, j2, list, this.f162051j);
        p35 p35Var = this.f162051j;
        boolean z = p35Var.f146961b;
        n35 n35Var = p35Var.f146960a;
        p35Var.m167243a();
        if (z) {
            this.f162060s = -9223372036854775807L;
            this.f162064w = true;
            return true;
        }
        if (n35Var == null) {
            return false;
        }
        this.f162057p = n35Var;
        if (m182104G(n35Var)) {
            lp2 lp2Var = (lp2) n35Var;
            if (zM182105H) {
                long j3 = lp2Var.f136917g;
                long j4 = this.f162060s;
                if (j3 != j4) {
                    this.f162054m.m11439a0(j4);
                    for (C1973q c1973q : this.f162055n) {
                        c1973q.m11439a0(this.f162060s);
                    }
                }
                this.f162060s = -9223372036854775807L;
            }
            lp2Var.m150820k(this.f162056o);
            this.f162052k.add(lp2Var);
        } else if (n35Var instanceof esm) {
            ((esm) n35Var).m117949g(this.f162056o);
        }
        this.f162048g.m11290t(new lrv(n35Var.f136911a, n35Var.f136912b, this.f162050i.m12092n(n35Var, this, this.f162049h.mo12120d(n35Var.f136913c))), n35Var.f136913c, this.f162042a, n35Var.f136914d, n35Var.f136915e, n35Var.f136916f, n35Var.f136917g, n35Var.f136918h);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: d */
    public long mo10924d() {
        if (this.f162064w) {
            return Long.MIN_VALUE;
        }
        if (m182105H()) {
            return this.f162060s;
        }
        long jMax = this.f162061t;
        lp2 lp2VarM182102E = m182102E();
        if (!lp2VarM182102E.mo111872h()) {
            if (this.f162052k.size() > 1) {
                ArrayList<lp2> arrayList = this.f162052k;
                lp2VarM182102E = arrayList.get(arrayList.size() - 2);
            } else {
                lp2VarM182102E = null;
            }
        }
        if (lp2VarM182102E != null) {
            jMax = Math.max(jMax, lp2VarM182102E.f136918h);
        }
        return Math.max(jMax, this.f162054m.m11461z());
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: e */
    public void mo10925e(long j) {
        if (this.f162050i.m12087i() || m182105H()) {
            return;
        }
        if (!this.f162050i.m12088j()) {
            int iMo11064d = this.f162046e.mo11064d(j, this.f162053l);
            if (iMo11064d < this.f162052k.size()) {
                m182099B(iMo11064d);
                return;
            }
            return;
        }
        n35 n35Var = (n35) p11.m167011e(this.f162057p);
        if (!(m182104G(n35Var) && m182103F(this.f162052k.size() - 1)) && this.f162046e.mo11063c(j, n35Var, this.f162053l)) {
            this.f162050i.m12085f();
            if (m182104G(n35Var)) {
                this.f162063v = (lp2) n35Var;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: f */
    public long mo10926f() {
        if (m182105H()) {
            return this.f162060s;
        }
        if (this.f162064w) {
            return Long.MIN_VALUE;
        }
        return m182102E().f136918h;
    }

    /* JADX INFO: renamed from: g */
    public long m182117g(long j, ice0 ice0Var) {
        return this.f162046e.mo11066g(j, ice0Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    public boolean isLoading() {
        return this.f162050i.m12088j();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2045f
    /* JADX INFO: renamed from: j */
    public void mo11369j() {
        this.f162054m.m11431S();
        for (C1973q c1973q : this.f162055n) {
            c1973q.m11431S();
        }
        this.f162046e.release();
        InterfaceC19837b<T> interfaceC19837b = this.f162059r;
        if (interfaceC19837b != null) {
            interfaceC19837b.mo11056b(this);
        }
    }

    @Override // p149l.vod0
    /* JADX INFO: renamed from: k */
    public int mo10942k(long j) throws Throwable {
        if (m182105H()) {
            return 0;
        }
        int iM11417E = this.f162054m.m11417E(j, this.f162064w);
        lp2 lp2Var = this.f162063v;
        if (lp2Var != null) {
            iM11417E = Math.min(iM11417E, lp2Var.m150818i(0) - this.f162054m.m11415C());
        }
        this.f162054m.m11442d0(iM11417E);
        m182106I();
        return iM11417E;
    }

    @Override // p149l.vod0
    /* JADX INFO: renamed from: l */
    public int mo10943l(uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i) {
        if (m182105H()) {
            return -3;
        }
        lp2 lp2Var = this.f162063v;
        if (lp2Var != null && lp2Var.m150818i(0) <= this.f162054m.m11415C()) {
            return -3;
        }
        m182106I();
        return this.f162054m.m11430R(uyiVar, decoderInputBuffer, i, this.f162064w);
    }

    /* JADX INFO: renamed from: t */
    public void m182118t(long j, boolean z) {
        if (m182105H()) {
            return;
        }
        int iM11459x = this.f162054m.m11459x();
        this.f162054m.m11452q(j, z, true);
        int iM11459x2 = this.f162054m.m11459x();
        if (iM11459x2 > iM11459x) {
            long jM11460y = this.f162054m.m11460y();
            int i = 0;
            while (true) {
                C1973q[] c1973qArr = this.f162055n;
                if (i >= c1973qArr.length) {
                    break;
                }
                c1973qArr[i].m11452q(jM11460y, z, this.f162045d[i]);
                i++;
            }
        }
        m182098A(iM11459x2);
    }

    /* JADX INFO: renamed from: l.s35$a */
    public final class C19836a implements vod0 {

        /* JADX INFO: renamed from: a */
        public final s35<T> f162065a;

        /* JADX INFO: renamed from: b */
        public final C1973q f162066b;

        /* JADX INFO: renamed from: c */
        public final int f162067c;

        /* JADX INFO: renamed from: d */
        public boolean f162068d;

        public C19836a(s35<T> s35Var, C1973q c1973q, int i) {
            this.f162065a = s35Var;
            this.f162066b = c1973q;
            this.f162067c = i;
        }

        /* JADX INFO: renamed from: c */
        private void m182119c() {
            if (this.f162068d) {
                return;
            }
            s35.this.f162048g.m11278h(s35.this.f162043b[this.f162067c], s35.this.f162044c[this.f162067c], 0, null, s35.this.f162061t);
            this.f162068d = true;
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: b */
        public boolean mo10940b() {
            return !s35.this.m182105H() && this.f162066b.m11423K(s35.this.f162064w);
        }

        /* JADX INFO: renamed from: d */
        public void m182120d() {
            p11.m167013g(s35.this.f162045d[this.f162067c]);
            s35.this.f162045d[this.f162067c] = false;
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: k */
        public int mo10942k(long j) throws Throwable {
            if (s35.this.m182105H()) {
                return 0;
            }
            int iM11417E = this.f162066b.m11417E(j, s35.this.f162064w);
            if (s35.this.f162063v != null) {
                iM11417E = Math.min(iM11417E, s35.this.f162063v.m150818i(this.f162067c + 1) - this.f162066b.m11415C());
            }
            this.f162066b.m11442d0(iM11417E);
            if (iM11417E > 0) {
                m182119c();
            }
            return iM11417E;
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: l */
        public int mo10943l(uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i) {
            if (s35.this.m182105H()) {
                return -3;
            }
            if (s35.this.f162063v != null && s35.this.f162063v.m150818i(this.f162067c + 1) <= this.f162066b.m11415C()) {
                return -3;
            }
            m182119c();
            return this.f162066b.m11430R(uyiVar, decoderInputBuffer, i, s35.this.f162064w);
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: a */
        public void mo10939a() {
        }
    }
}
