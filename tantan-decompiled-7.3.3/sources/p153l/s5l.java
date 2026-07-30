package p153l;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import com.google.android.exoplayer2.drm.InterfaceC1878c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.C1996q;
import com.google.android.exoplayer2.source.InterfaceC1989j;
import com.google.android.exoplayer2.source.InterfaceC1997r;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class s5l implements Loader.InterfaceC2064b<o45>, Loader.InterfaceC2068f, InterfaceC1997r, bsf, C1996q.d {

    /* JADX INFO: renamed from: Y */
    public static final Set<Integer> f166376Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: A */
    public int f166377A;

    /* JADX INFO: renamed from: B */
    public int f166378B;

    /* JADX INFO: renamed from: C */
    public boolean f166379C;

    /* JADX INFO: renamed from: D */
    public boolean f166380D;

    /* JADX INFO: renamed from: E */
    public int f166381E;

    /* JADX INFO: renamed from: F */
    public C1894k f166382F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public C1894k f166383G;

    /* JADX INFO: renamed from: H */
    public boolean f166384H;

    /* JADX INFO: renamed from: I */
    public ffj0 f166385I;

    /* JADX INFO: renamed from: J */
    public Set<dfj0> f166386J;

    /* JADX INFO: renamed from: K */
    public int[] f166387K;

    /* JADX INFO: renamed from: L */
    public int f166388L;

    /* JADX INFO: renamed from: M */
    public boolean f166389M;

    /* JADX INFO: renamed from: N */
    public boolean[] f166390N;

    /* JADX INFO: renamed from: O */
    public boolean[] f166391O;

    /* JADX INFO: renamed from: P */
    public long f166392P;

    /* JADX INFO: renamed from: Q */
    public long f166393Q;

    /* JADX INFO: renamed from: R */
    public boolean f166394R;

    /* JADX INFO: renamed from: S */
    public boolean f166395S;

    /* JADX INFO: renamed from: T */
    public boolean f166396T;

    /* JADX INFO: renamed from: U */
    public boolean f166397U;

    /* JADX INFO: renamed from: V */
    public long f166398V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public DrmInitData f166399W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public j5l f166400X;

    /* JADX INFO: renamed from: a */
    public final String f166401a;

    /* JADX INFO: renamed from: b */
    public final int f166402b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC19986b f166403c;

    /* JADX INFO: renamed from: d */
    public final f5l f166404d;

    /* JADX INFO: renamed from: e */
    public final oj0 f166405e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final C1894k f166406f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1878c f166407g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1877b.a f166408h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2072c f166409i;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1989j.a f166411k;

    /* JADX INFO: renamed from: l */
    public final int f166412l;

    /* JADX INFO: renamed from: n */
    public final ArrayList<j5l> f166414n;

    /* JADX INFO: renamed from: o */
    public final List<j5l> f166415o;

    /* JADX INFO: renamed from: p */
    public final Runnable f166416p;

    /* JADX INFO: renamed from: q */
    public final Runnable f166417q;

    /* JADX INFO: renamed from: r */
    public final Handler f166418r;

    /* JADX INFO: renamed from: s */
    public final ArrayList<o5l> f166419s;

    /* JADX INFO: renamed from: t */
    public final Map<String, DrmInitData> f166420t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public o45 f166421u;

    /* JADX INFO: renamed from: v */
    public C19988d[] f166422v;

    /* JADX INFO: renamed from: x */
    public Set<Integer> f166424x;

    /* JADX INFO: renamed from: y */
    public SparseIntArray f166425y;

    /* JADX INFO: renamed from: z */
    public qfj0 f166426z;

    /* JADX INFO: renamed from: j */
    public final Loader f166410j = new Loader("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: m */
    public final f5l.C16902b f166413m = new f5l.C16902b();

    /* JADX INFO: renamed from: w */
    public int[] f166423w = new int[0];

    /* JADX INFO: renamed from: l.s5l$b */
    public interface InterfaceC19986b extends InterfaceC1997r.a<s5l> {
        /* JADX INFO: renamed from: a */
        void mo152971a();

        /* JADX INFO: renamed from: k */
        void mo152973k(Uri uri);
    }

    /* JADX INFO: renamed from: l.s5l$c */
    public static class C19987c implements qfj0 {

        /* JADX INFO: renamed from: g */
        public static final C1894k f166427g = new C1894k.b().m10400g0("application/id3").m10374G();

        /* JADX INFO: renamed from: h */
        public static final C1894k f166428h = new C1894k.b().m10400g0("application/x-emsg").m10374G();

        /* JADX INFO: renamed from: a */
        public final c5f f166429a = new c5f();

        /* JADX INFO: renamed from: b */
        public final qfj0 f166430b;

        /* JADX INFO: renamed from: c */
        public final C1894k f166431c;

        /* JADX INFO: renamed from: d */
        public C1894k f166432d;

        /* JADX INFO: renamed from: e */
        public byte[] f166433e;

        /* JADX INFO: renamed from: f */
        public int f166434f;

        public C19987c(qfj0 qfj0Var, int i) {
            this.f166430b = qfj0Var;
            if (i == 1) {
                this.f166431c = f166427g;
            } else {
                if (i != 3) {
                    za50.m219101a("Unknown metadataType: ", i);
                    throw null;
                }
                this.f166431c = f166428h;
            }
            this.f166433e = new byte[0];
            this.f166434f = 0;
        }

        @Override // p153l.qfj0
        /* JADX INFO: renamed from: a */
        public void mo11163a(long j, int i, int i2, int i3, @Nullable qfj0.C19562a c19562a) {
            w11.m204369e(this.f166432d);
            ig60 ig60VarM184734i = m184734i(i2, i3);
            if (!bmk0.m105123c(this.f166432d.f7785l, this.f166431c.f7785l)) {
                if (!"application/x-emsg".equals(this.f166432d.f7785l)) {
                    kyv.m152151i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f166432d.f7785l);
                    return;
                } else {
                    EventMessage eventMessageM108051c = this.f166429a.m108051c(ig60VarM184734i);
                    if (!m184732g(eventMessageM108051c)) {
                        kyv.m152151i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f166431c.f7785l, eventMessageM108051c.mo10588N()));
                        return;
                    }
                    ig60VarM184734i = new ig60((byte[]) w11.m204369e(eventMessageM108051c.mo10590v()));
                }
            }
            int iM139811a = ig60VarM184734i.m139811a();
            this.f166430b.m176370d(ig60VarM184734i, iM139811a);
            this.f166430b.mo11163a(j, i, iM139811a, i3, c19562a);
        }

        @Override // p153l.qfj0
        /* JADX INFO: renamed from: b */
        public void mo11164b(C1894k c1894k) {
            this.f166432d = c1894k;
            this.f166430b.mo11164b(this.f166431c);
        }

        @Override // p153l.qfj0
        /* JADX INFO: renamed from: c */
        public int mo11165c(e6c e6cVar, int i, boolean z, int i2) throws IOException {
            m184733h(this.f166434f + i);
            int i3 = e6cVar.read(this.f166433e, this.f166434f, i);
            if (i3 != -1) {
                this.f166434f += i3;
                return i3;
            }
            if (z) {
                return -1;
            }
            vg3.m201207a();
            return 0;
        }

        @Override // p153l.qfj0
        /* JADX INFO: renamed from: f */
        public void mo11166f(ig60 ig60Var, int i, int i2) {
            m184733h(this.f166434f + i);
            ig60Var.m139822l(this.f166433e, this.f166434f, i);
            this.f166434f += i;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m184732g(EventMessage eventMessage) {
            C1894k c1894kMo10588N = eventMessage.mo10588N();
            return c1894kMo10588N != null && bmk0.m105123c(this.f166431c.f7785l, c1894kMo10588N.f7785l);
        }

        /* JADX INFO: renamed from: h */
        public final void m184733h(int i) {
            byte[] bArr = this.f166433e;
            if (bArr.length < i) {
                this.f166433e = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        /* JADX INFO: renamed from: i */
        public final ig60 m184734i(int i, int i2) {
            int i3 = this.f166434f - i2;
            ig60 ig60Var = new ig60(Arrays.copyOfRange(this.f166433e, i3 - i, i3));
            byte[] bArr = this.f166433e;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.f166434f = i2;
            return ig60Var;
        }
    }

    /* JADX INFO: renamed from: l.s5l$d */
    public static final class C19988d extends C1996q {

        /* JADX INFO: renamed from: H */
        public final Map<String, DrmInitData> f166435H;

        /* JADX INFO: renamed from: I */
        @Nullable
        public DrmInitData f166436I;

        public C19988d(oj0 oj0Var, InterfaceC1878c interfaceC1878c, InterfaceC1877b.a aVar, Map<String, DrmInitData> map) {
            super(oj0Var, interfaceC1878c, aVar);
            this.f166435H = map;
        }

        @Override // com.google.android.exoplayer2.source.C1996q, p153l.qfj0
        /* JADX INFO: renamed from: a */
        public void mo11163a(long j, int i, int i2, int i3, @Nullable qfj0.C19562a c19562a) {
            super.mo11163a(j, i, i2, i3, c19562a);
        }

        @Nullable
        /* JADX INFO: renamed from: g0 */
        public final Metadata m184735g0(@Nullable Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int iM10587e = metadata.m10587e();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= iM10587e) {
                    i2 = -1;
                    break;
                }
                Metadata.Entry entryM10586d = metadata.m10586d(i2);
                if ((entryM10586d instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entryM10586d).owner)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return metadata;
            }
            if (iM10587e == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[iM10587e - 1];
            while (i < iM10587e) {
                if (i != i2) {
                    entryArr[i < i2 ? i : i - 1] = metadata.m10586d(i);
                }
                i++;
            }
            return new Metadata(entryArr);
        }

        /* JADX INFO: renamed from: h0 */
        public void m184736h0(@Nullable DrmInitData drmInitData) {
            this.f166436I = drmInitData;
            m11475I();
        }

        /* JADX INFO: renamed from: i0 */
        public void m184737i0(j5l j5lVar) {
            m11497e0(j5lVar.f118461k);
        }

        @Override // com.google.android.exoplayer2.source.C1996q
        /* JADX INFO: renamed from: w */
        public C1894k mo11512w(C1894k c1894k) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.f166436I;
            if (drmInitData2 == null) {
                drmInitData2 = c1894k.f7788o;
            }
            if (drmInitData2 != null && (drmInitData = this.f166435H.get(drmInitData2.schemeType)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata metadataM184735g0 = m184735g0(c1894k.f7783j);
            if (drmInitData2 != c1894k.f7788o || metadataM184735g0 != c1894k.f7783j) {
                c1894k = c1894k.m10336b().m10382O(drmInitData2).m10393Z(metadataM184735g0).m10374G();
            }
            return super.mo11512w(c1894k);
        }
    }

    public s5l(String str, int i, InterfaceC19986b interfaceC19986b, f5l f5lVar, Map<String, DrmInitData> map, oj0 oj0Var, long j, @Nullable C1894k c1894k, InterfaceC1878c interfaceC1878c, InterfaceC1877b.a aVar, InterfaceC2072c interfaceC2072c, InterfaceC1989j.a aVar2, int i2) {
        this.f166401a = str;
        this.f166402b = i;
        this.f166403c = interfaceC19986b;
        this.f166404d = f5lVar;
        this.f166420t = map;
        this.f166405e = oj0Var;
        this.f166406f = c1894k;
        this.f166407g = interfaceC1878c;
        this.f166408h = aVar;
        this.f166409i = interfaceC2072c;
        this.f166411k = aVar2;
        this.f166412l = i2;
        Set<Integer> set = f166376Y;
        this.f166424x = new HashSet(set.size());
        this.f166425y = new SparseIntArray(set.size());
        this.f166422v = new C19988d[0];
        this.f166391O = new boolean[0];
        this.f166390N = new boolean[0];
        ArrayList<j5l> arrayList = new ArrayList<>();
        this.f166414n = arrayList;
        this.f166415o = Collections.unmodifiableList(arrayList);
        this.f166419s = new ArrayList<>();
        this.f166416p = new Runnable() { // from class: l.q5l
            @Override // java.lang.Runnable
            public final void run() {
                this.f155731a.m184687S();
            }
        };
        this.f166417q = new Runnable() { // from class: l.r5l
            @Override // java.lang.Runnable
            public final void run() {
                this.f161361a.m184710b0();
            }
        };
        this.f166418r = bmk0.m105174w();
        this.f166392P = j;
        this.f166393Q = j;
    }

    /* JADX INFO: renamed from: B */
    public static rfe m184680B(int i, int i2) {
        kyv.m152151i("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new rfe();
    }

    /* JADX INFO: renamed from: E */
    public static C1894k m184681E(@Nullable C1894k c1894k, C1894k c1894k2, boolean z) {
        String strM149003d;
        String strM149006g;
        if (c1894k == null) {
            return c1894k2;
        }
        int iM149010k = kb00.m149010k(c1894k2.f7785l);
        int iM105087L = bmk0.m105087L(c1894k.f7782i, iM149010k);
        String str = c1894k.f7782i;
        if (iM105087L == 1) {
            strM149003d = bmk0.m105089M(str, iM149010k);
            strM149006g = kb00.m149006g(strM149003d);
        } else {
            strM149003d = kb00.m149003d(str, c1894k2.f7785l);
            strM149006g = c1894k2.f7785l;
        }
        C1894k.b bVarM10378K = c1894k2.m10336b().m10388U(c1894k.f7774a).m10390W(c1894k.f7775b).m10391X(c1894k.f7776c).m10402i0(c1894k.f7777d).m10398e0(c1894k.f7778e).m10376I(z ? c1894k.f7779f : -1).m10395b0(z ? c1894k.f7780g : -1).m10378K(strM149003d);
        if (iM149010k == 2) {
            bVarM10378K.m10407n0(c1894k.f7790q).m10386S(c1894k.f7791r).m10385R(c1894k.f7792s);
        }
        if (strM149006g != null) {
            bVarM10378K.m10400g0(strM149006g);
        }
        int i = c1894k.f7798y;
        if (i != -1 && iM149010k == 1) {
            bVarM10378K.m10377J(i);
        }
        Metadata metadataM10584b = c1894k.f7783j;
        if (metadataM10584b != null) {
            Metadata metadata = c1894k2.f7783j;
            if (metadata != null) {
                metadataM10584b = metadata.m10584b(metadataM10584b);
            }
            bVarM10378K.m10393Z(metadataM10584b);
        }
        return bVarM10378K.m10374G();
    }

    /* JADX INFO: renamed from: F */
    private void m184682F(int i) {
        w11.m204371g(!this.f166410j.m12142j());
        while (true) {
            if (i >= this.f166414n.size()) {
                i = -1;
                break;
            } else if (m184731z(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = m184696J().f144933h;
        j5l j5lVarM184694G = m184694G(i);
        if (this.f166414n.isEmpty()) {
            this.f166393Q = this.f166392P;
        } else {
            ((j5l) akq.m98599g(this.f166414n)).m143536o();
        }
        this.f166396T = false;
        this.f166411k.m11347w(this.f166377A, j5lVarM184694G.f144932g, j);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m184683I(C1894k c1894k, C1894k c1894k2) {
        String str = c1894k.f7785l;
        String str2 = c1894k2.f7785l;
        int iM149010k = kb00.m149010k(str);
        if (iM149010k != 3) {
            return iM149010k == kb00.m149010k(str2);
        }
        if (bmk0.m105123c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c1894k.f7769D == c1894k2.f7769D;
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public static int m184684L(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: renamed from: N */
    private static boolean m184685N(o45 o45Var) {
        return o45Var instanceof j5l;
    }

    /* JADX INFO: renamed from: O */
    private boolean m184686O() {
        return this.f166393Q != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m184687S() {
        if (!this.f166384H && this.f166387K == null && this.f166379C) {
            for (C19988d c19988d : this.f166422v) {
                if (c19988d.m11472F() == null) {
                    return;
                }
            }
            if (this.f166385I != null) {
                m184701R();
                return;
            }
            m184730y();
            m184719k0();
            this.f166403c.mo152971a();
        }
    }

    /* JADX INFO: renamed from: f0 */
    private void m184688f0() {
        for (C19988d c19988d : this.f166422v) {
            c19988d.m11488V(this.f166394R);
        }
        this.f166394R = false;
    }

    /* JADX INFO: renamed from: A */
    public void m184691A() {
        if (this.f166380D) {
            return;
        }
        mo10977c(this.f166392P);
    }

    /* JADX INFO: renamed from: C */
    public final C1996q m184692C(int i, int i2) {
        int length = this.f166422v.length;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        C19988d c19988d = new C19988d(this.f166405e, this.f166407g, this.f166408h, this.f166420t);
        c19988d.m11493a0(this.f166392P);
        if (z) {
            c19988d.m184736h0(this.f166399W);
        }
        c19988d.m11492Z(this.f166398V);
        j5l j5lVar = this.f166400X;
        if (j5lVar != null) {
            c19988d.m184737i0(j5lVar);
        }
        c19988d.m11495c0(this);
        int i3 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f166423w, i3);
        this.f166423w = iArrCopyOf;
        iArrCopyOf[length] = i;
        this.f166422v = (C19988d[]) bmk0.m105090M0(this.f166422v, c19988d);
        boolean[] zArrCopyOf = Arrays.copyOf(this.f166391O, i3);
        this.f166391O = zArrCopyOf;
        zArrCopyOf[length] = z;
        this.f166389M |= z;
        this.f166424x.add(Integer.valueOf(i2));
        this.f166425y.append(i2, length);
        if (m184684L(i2) > m184684L(this.f166377A)) {
            this.f166378B = length;
            this.f166377A = i2;
        }
        this.f166390N = Arrays.copyOf(this.f166390N, i3);
        return c19988d;
    }

    /* JADX INFO: renamed from: D */
    public final ffj0 m184693D(dfj0[] dfj0VarArr) {
        for (int i = 0; i < dfj0VarArr.length; i++) {
            dfj0 dfj0Var = dfj0VarArr[i];
            C1894k[] c1894kArr = new C1894k[dfj0Var.f88159a];
            for (int i2 = 0; i2 < dfj0Var.f88159a; i2++) {
                C1894k c1894kM115519c = dfj0Var.m115519c(i2);
                c1894kArr[i2] = c1894kM115519c.m10337c(this.f166407g.mo9930c(c1894kM115519c));
            }
            dfj0VarArr[i] = new dfj0(dfj0Var.f88160b, c1894kArr);
        }
        return new ffj0(dfj0VarArr);
    }

    /* JADX INFO: renamed from: G */
    public final j5l m184694G(int i) {
        j5l j5lVar = this.f166414n.get(i);
        ArrayList<j5l> arrayList = this.f166414n;
        bmk0.m105106U0(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.f166422v.length; i2++) {
            this.f166422v[i2].m11510u(j5lVar.m143534m(i2));
        }
        return j5lVar;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m184695H(j5l j5lVar) {
        int i = j5lVar.f118461k;
        int length = this.f166422v.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f166390N[i2] && this.f166422v[i2].m11482P() == i) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public final j5l m184696J() {
        ArrayList<j5l> arrayList = this.f166414n;
        return arrayList.get(arrayList.size() - 1);
    }

    @Nullable
    /* JADX INFO: renamed from: K */
    public final qfj0 m184697K(int i, int i2) {
        w11.m204365a(f166376Y.contains(Integer.valueOf(i2)));
        int i3 = this.f166425y.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.f166424x.add(Integer.valueOf(i2))) {
            this.f166423w[i3] = i;
        }
        return this.f166423w[i3] == i ? this.f166422v[i3] : m184680B(i, i2);
    }

    /* JADX INFO: renamed from: M */
    public final void m184698M(j5l j5lVar) {
        this.f166400X = j5lVar;
        this.f166382F = j5lVar.f144929d;
        this.f166393Q = -9223372036854775807L;
        this.f166414n.add(j5lVar);
        ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
        for (C19988d c19988d : this.f166422v) {
            c2804aBuilder.mo15737a(Integer.valueOf(c19988d.m11473G()));
        }
        j5lVar.m143535n(this, c2804aBuilder.m15756m());
        for (C19988d c19988d2 : this.f166422v) {
            c19988d2.m184737i0(j5lVar);
            if (j5lVar.f118464n) {
                c19988d2.m11498f0();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public boolean m184699P(int i) {
        return !m184686O() && this.f166422v[i].m11477K(this.f166396T);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m184700Q() {
        return this.f166377A == 2;
    }

    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @RequiresNonNull({"trackGroups"})
    /* JADX INFO: renamed from: R */
    public final void m184701R() {
        int i = this.f166385I.f98785a;
        int[] iArr = new int[i];
        this.f166387K = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                C19988d[] c19988dArr = this.f166422v;
                if (i3 >= c19988dArr.length) {
                    break;
                }
                if (m184683I((C1894k) w11.m204373i(c19988dArr[i3].m11472F()), this.f166385I.m125387b(i2).m115519c(0))) {
                    this.f166387K[i2] = i3;
                    break;
                }
                i3++;
            }
        }
        Iterator<o5l> it = this.f166419s.iterator();
        while (it.hasNext()) {
            it.next().m166159c();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m184702T() throws IOException {
        this.f166410j.mo11081a();
        this.f166404d.m124145n();
    }

    /* JADX INFO: renamed from: U */
    public void m184703U(int i) throws IOException {
        m184702T();
        this.f166422v[i].m11479M();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo11078n(o45 o45Var, long j, long j2, boolean z) {
        this.f166421u = null;
        mtv mtvVar = new mtv(o45Var.f144926a, o45Var.f144927b, o45Var.m165972f(), o45Var.m165971e(), j, j2, o45Var.m165969b());
        this.f166409i.m12176c(o45Var.f144926a);
        this.f166411k.m11335k(mtvVar, o45Var.f144928c, this.f166402b, o45Var.f144929d, o45Var.f144930e, o45Var.f144931f, o45Var.f144932g, o45Var.f144933h);
        if (z) {
            return;
        }
        if (m184686O() || this.f166381E == 0) {
            m184688f0();
        }
        if (this.f166381E > 0) {
            this.f166403c.mo10270j(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo11079o(o45 o45Var, long j, long j2) {
        this.f166421u = null;
        this.f166404d.m124147p(o45Var);
        mtv mtvVar = new mtv(o45Var.f144926a, o45Var.f144927b, o45Var.m165972f(), o45Var.m165971e(), j, j2, o45Var.m165969b());
        this.f166409i.m12176c(o45Var.f144926a);
        this.f166411k.m11338n(mtvVar, o45Var.f144928c, this.f166402b, o45Var.f144929d, o45Var.f144930e, o45Var.f144931f, o45Var.f144932g, o45Var.f144933h);
        if (this.f166380D) {
            this.f166403c.mo10270j(this);
        } else {
            mo10977c(this.f166392P);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Loader.C2065c mo11080q(o45 o45Var, long j, long j2, IOException iOException, int i) {
        Loader.C2065c c2065cM12138h;
        int i2;
        boolean zM184685N = m184685N(o45Var);
        if (zM184685N && !((j5l) o45Var).m143537q() && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode) == 410 || i2 == 404)) {
            return Loader.f9493d;
        }
        long jM165969b = o45Var.m165969b();
        mtv mtvVar = new mtv(o45Var.f144926a, o45Var.f144927b, o45Var.m165972f(), o45Var.m165971e(), j, j2, jM165969b);
        InterfaceC2072c.c cVar = new InterfaceC2072c.c(mtvVar, new ktx(o45Var.f144928c, this.f166402b, o45Var.f144929d, o45Var.f144930e, o45Var.f144931f, bmk0.m105152l1(o45Var.f144932g), bmk0.m105152l1(o45Var.f144933h)), iOException, i);
        InterfaceC2072c.b bVarMo12173b = this.f166409i.mo12173b(bgj0.m104226c(this.f166404d.m124142k()), cVar);
        boolean zM124144m = (bVarMo12173b == null || bVarMo12173b.f9555a != 2) ? false : this.f166404d.m124144m(o45Var, bVarMo12173b.f9556b);
        if (zM124144m) {
            if (zM184685N && jM165969b == 0) {
                ArrayList<j5l> arrayList = this.f166414n;
                w11.m204371g(arrayList.remove(arrayList.size() - 1) == o45Var);
                if (this.f166414n.isEmpty()) {
                    this.f166393Q = this.f166392P;
                } else {
                    ((j5l) akq.m98599g(this.f166414n)).m143536o();
                }
            }
            c2065cM12138h = Loader.f9495f;
        } else {
            long jMo12172a = this.f166409i.mo12172a(cVar);
            c2065cM12138h = jMo12172a != -9223372036854775807L ? Loader.m12138h(false, jMo12172a) : Loader.f9496g;
        }
        Loader.C2065c c2065c = c2065cM12138h;
        boolean zM12149c = c2065c.m12149c();
        this.f166411k.m11340p(mtvVar, o45Var.f144928c, this.f166402b, o45Var.f144929d, o45Var.f144930e, o45Var.f144931f, o45Var.f144932g, o45Var.f144933h, iOException, !zM12149c);
        if (!zM12149c) {
            this.f166421u = null;
            this.f166409i.m12176c(o45Var.f144926a);
        }
        if (zM124144m) {
            if (!this.f166380D) {
                mo10977c(this.f166392P);
                return c2065c;
            }
            this.f166403c.mo10270j(this);
        }
        return c2065c;
    }

    /* JADX INFO: renamed from: Y */
    public void m184707Y() {
        this.f166424x.clear();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m184708Z(Uri uri, InterfaceC2072c.c cVar, boolean z) {
        InterfaceC2072c.b bVarMo12173b;
        if (!this.f166404d.m124146o(uri)) {
            return true;
        }
        long j = (z || (bVarMo12173b = this.f166409i.mo12173b(bgj0.m104226c(this.f166404d.m124142k()), cVar)) == null || bVarMo12173b.f9555a != 2) ? -9223372036854775807L : bVarMo12173b.f9556b;
        return this.f166404d.m124148q(uri, j) && j != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.C1996q.d
    /* JADX INFO: renamed from: a */
    public void mo11414a(C1894k c1894k) {
        this.f166418r.post(this.f166416p);
    }

    /* JADX INFO: renamed from: a0 */
    public void m184709a0() {
        if (this.f166414n.isEmpty()) {
            return;
        }
        j5l j5lVar = (j5l) akq.m98599g(this.f166414n);
        int iM124137c = this.f166404d.m124137c(j5lVar);
        if (iM124137c == 1) {
            j5lVar.m143542v();
        } else if (iM124137c == 2 && !this.f166396T && this.f166410j.m12142j()) {
            this.f166410j.m12139f();
        }
    }

    @Override // p153l.bsf
    /* JADX INFO: renamed from: b */
    public qfj0 mo11416b(int i, int i2) {
        qfj0 qfj0VarM184692C;
        if (!f166376Y.contains(Integer.valueOf(i2))) {
            int i3 = 0;
            while (true) {
                qfj0[] qfj0VarArr = this.f166422v;
                if (i3 >= qfj0VarArr.length) {
                    qfj0VarM184692C = null;
                    break;
                }
                if (this.f166423w[i3] == i) {
                    qfj0VarM184692C = qfj0VarArr[i3];
                    break;
                }
                i3++;
            }
        } else {
            qfj0VarM184692C = m184697K(i, i2);
        }
        if (qfj0VarM184692C == null) {
            if (this.f166397U) {
                return m184680B(i, i2);
            }
            qfj0VarM184692C = m184692C(i, i2);
        }
        if (i2 != 5) {
            return qfj0VarM184692C;
        }
        if (this.f166426z == null) {
            this.f166426z = new C19987c(qfj0VarM184692C, this.f166412l);
        }
        return this.f166426z;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m184710b0() {
        this.f166379C = true;
        m184687S();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    public boolean mo10977c(long j) {
        List<j5l> list;
        long jMax;
        if (this.f166396T || this.f166410j.m12142j() || this.f166410j.m12141i()) {
            return false;
        }
        if (m184686O()) {
            list = Collections.EMPTY_LIST;
            jMax = this.f166393Q;
            for (C19988d c19988d : this.f166422v) {
                c19988d.m11493a0(this.f166393Q);
            }
        } else {
            list = this.f166415o;
            j5l j5lVarM184696J = m184696J();
            jMax = j5lVarM184696J.mo112090h() ? j5lVarM184696J.f144933h : Math.max(this.f166392P, j5lVarM184696J.f144932g);
        }
        List<j5l> list2 = list;
        long j2 = jMax;
        this.f166413m.m124157a();
        this.f166404d.m124138e(j, j2, list2, this.f166380D || !list2.isEmpty(), this.f166413m);
        f5l.C16902b c16902b = this.f166413m;
        boolean z = c16902b.f97258b;
        o45 o45Var = c16902b.f97257a;
        Uri uri = c16902b.f97259c;
        if (z) {
            this.f166393Q = -9223372036854775807L;
            this.f166396T = true;
            return true;
        }
        if (o45Var == null) {
            if (uri != null) {
                this.f166403c.mo152973k(uri);
            }
            return false;
        }
        if (m184685N(o45Var)) {
            m184698M((j5l) o45Var);
        }
        this.f166421u = o45Var;
        this.f166411k.m11344t(new mtv(o45Var.f144926a, o45Var.f144927b, this.f166410j.m12146n(o45Var, this, this.f166409i.mo12174d(o45Var.f144928c))), o45Var.f144928c, this.f166402b, o45Var.f144929d, o45Var.f144930e, o45Var.f144931f, o45Var.f144932g, o45Var.f144933h);
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public void m184711c0(dfj0[] dfj0VarArr, int i, int... iArr) {
        this.f166385I = m184693D(dfj0VarArr);
        this.f166386J = new HashSet();
        for (int i2 : iArr) {
            this.f166386J.add(this.f166385I.m125387b(i2));
        }
        this.f166388L = i;
        Handler handler = this.f166418r;
        final InterfaceC19986b interfaceC19986b = this.f166403c;
        Objects.requireNonNull(interfaceC19986b);
        handler.post(new Runnable() { // from class: l.p5l
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC19986b.mo152971a();
            }
        });
        m184719k0();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    public long mo10978d() {
        if (this.f166396T) {
            return Long.MIN_VALUE;
        }
        if (m184686O()) {
            return this.f166393Q;
        }
        long jMax = this.f166392P;
        j5l j5lVarM184696J = m184696J();
        if (!j5lVarM184696J.mo112090h()) {
            if (this.f166414n.size() > 1) {
                ArrayList<j5l> arrayList = this.f166414n;
                j5lVarM184696J = arrayList.get(arrayList.size() - 2);
            } else {
                j5lVarM184696J = null;
            }
        }
        if (j5lVarM184696J != null) {
            jMax = Math.max(jMax, j5lVarM184696J.f144933h);
        }
        if (this.f166379C) {
            for (C19988d c19988d : this.f166422v) {
                jMax = Math.max(jMax, c19988d.m11515z());
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: d0 */
    public int m184712d0(int i, p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (m184686O()) {
            return -3;
        }
        int i3 = 0;
        if (!this.f166414n.isEmpty()) {
            int i4 = 0;
            while (i4 < this.f166414n.size() - 1 && m184695H(this.f166414n.get(i4))) {
                i4++;
            }
            bmk0.m105106U0(this.f166414n, 0, i4);
            j5l j5lVar = this.f166414n.get(0);
            C1894k c1894k = j5lVar.f144929d;
            if (!c1894k.equals(this.f166383G)) {
                this.f166411k.m11332h(this.f166402b, c1894k, j5lVar.f144930e, j5lVar.f144931f, j5lVar.f144932g);
            }
            this.f166383G = c1894k;
        }
        if (!this.f166414n.isEmpty() && !this.f166414n.get(0).m143537q()) {
            return -3;
        }
        int iM11484R = this.f166422v[i].m11484R(p1jVar, decoderInputBuffer, i2, this.f166396T);
        if (iM11484R == -5) {
            C1894k c1894kM10341k = (C1894k) w11.m204369e(p1jVar.f150174b);
            if (i == this.f166378B) {
                int iM16514d = Ints.m16514d(this.f166422v[i].m11482P());
                while (i3 < this.f166414n.size() && this.f166414n.get(i3).f118461k != iM16514d) {
                    i3++;
                }
                c1894kM10341k = c1894kM10341k.m10341k(i3 < this.f166414n.size() ? this.f166414n.get(i3).f144929d : (C1894k) w11.m204369e(this.f166382F));
            }
            p1jVar.f150174b = c1894kM10341k;
        }
        return iM11484R;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    public void mo10979e(long j) {
        if (this.f166410j.m12141i() || m184686O()) {
            return;
        }
        if (this.f166410j.m12142j()) {
            w11.m204369e(this.f166421u);
            if (this.f166404d.m124153v(j, this.f166421u, this.f166415o)) {
                this.f166410j.m12139f();
                return;
            }
            return;
        }
        int size = this.f166415o.size();
        while (size > 0 && this.f166404d.m124137c(this.f166415o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f166415o.size()) {
            m184682F(size);
        }
        int iM124140h = this.f166404d.m124140h(j, this.f166415o);
        if (iM124140h < this.f166414n.size()) {
            m184682F(iM124140h);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m184713e0() {
        if (this.f166380D) {
            for (C19988d c19988d : this.f166422v) {
                c19988d.m11483Q();
            }
        }
        this.f166410j.m12145m(this);
        this.f166418r.removeCallbacksAndMessages(null);
        this.f166384H = true;
        this.f166419s.clear();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    public long mo10980f() {
        if (m184686O()) {
            return this.f166393Q;
        }
        if (this.f166396T) {
            return Long.MIN_VALUE;
        }
        return m184696J().f144933h;
    }

    /* JADX INFO: renamed from: g */
    public long m184714g(long j, nke0 nke0Var) {
        return this.f166404d.m124136b(j, nke0Var);
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m184715g0(long j) {
        int length = this.f166422v.length;
        for (int i = 0; i < length; i++) {
            if (!this.f166422v[i].m11491Y(j, false) && (this.f166391O[i] || !this.f166389M)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m184716h0(long j, boolean z) {
        this.f166392P = j;
        if (m184686O()) {
            this.f166393Q = j;
            return true;
        }
        if (this.f166379C && !z && m184715g0(j)) {
            return false;
        }
        this.f166393Q = j;
        this.f166396T = false;
        this.f166414n.clear();
        if (this.f166410j.m12142j()) {
            if (this.f166379C) {
                for (C19988d c19988d : this.f166422v) {
                    c19988d.m11507r();
                }
            }
            this.f166410j.m12139f();
        } else {
            this.f166410j.m12140g();
            m184688f0();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0114  */
    /* JADX INFO: renamed from: i0 */
    public boolean m184717i0(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr, boolean[] zArr2, long j, boolean z) {
        boolean z2;
        m184728w();
        int i = this.f166381E;
        int i2 = 0;
        for (int i3 = 0; i3 < u9fVarArr.length; i3++) {
            o5l o5lVar = (o5l) xwd0VarArr[i3];
            if (o5lVar != null && (u9fVarArr[i3] == null || !zArr[i3])) {
                this.f166381E--;
                o5lVar.m166161e();
                xwd0VarArr[i3] = null;
            }
        }
        boolean z3 = z || (!this.f166395S ? j == this.f166392P : i != 0);
        u9f u9fVarM124142k = this.f166404d.m124142k();
        boolean z4 = z3;
        u9f u9fVar = u9fVarM124142k;
        for (int i4 = 0; i4 < u9fVarArr.length; i4++) {
            u9f u9fVar2 = u9fVarArr[i4];
            if (u9fVar2 != null) {
                int iM125388c = this.f166385I.m125388c(u9fVar2.mo11361h());
                if (iM125388c == this.f166388L) {
                    this.f166404d.m124152u(u9fVar2);
                    u9fVar = u9fVar2;
                }
                if (xwd0VarArr[i4] == null) {
                    this.f166381E++;
                    o5l o5lVar2 = new o5l(this, iM125388c);
                    xwd0VarArr[i4] = o5lVar2;
                    zArr2[i4] = true;
                    if (this.f166387K != null) {
                        o5lVar2.m166159c();
                        if (!z4) {
                            C19988d c19988d = this.f166422v[this.f166387K[iM125388c]];
                            z4 = (c19988d.m11491Y(j, true) || c19988d.m11469C() == 0) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.f166381E == 0) {
            this.f166404d.m124149r();
            this.f166383G = null;
            this.f166394R = true;
            this.f166414n.clear();
            if (this.f166410j.m12142j()) {
                if (this.f166379C) {
                    C19988d[] c19988dArr = this.f166422v;
                    int length = c19988dArr.length;
                    while (i2 < length) {
                        c19988dArr[i2].m11507r();
                        i2++;
                    }
                }
                this.f166410j.m12139f();
            } else {
                m184688f0();
            }
        } else {
            if (this.f166414n.isEmpty() || bmk0.m105123c(u9fVar, u9fVarM124142k)) {
                z2 = z;
            } else {
                if (!this.f166395S) {
                    long j2 = j < 0 ? -j : 0L;
                    j5l j5lVarM184696J = m184696J();
                    u9f u9fVar3 = u9fVar;
                    u9fVar3.mo11360g(j, j2, -9223372036854775807L, this.f166415o, this.f166404d.m124135a(j5lVarM184696J, j));
                    if (u9fVar3.mo11363j() == this.f166404d.m124141j().m115520d(j5lVarM184696J.f144929d)) {
                        z2 = z;
                    }
                }
                this.f166394R = true;
                z2 = true;
                z4 = true;
            }
            if (z4) {
                m184716h0(j, z2);
                while (i2 < xwd0VarArr.length) {
                    if (xwd0VarArr[i2] != null) {
                        zArr2[i2] = true;
                    }
                    i2++;
                }
            }
        }
        m184725p0(xwd0VarArr);
        this.f166395S = true;
        return z4;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    public boolean isLoading() {
        return this.f166410j.m12142j();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2068f
    /* JADX INFO: renamed from: j */
    public void mo11423j() {
        for (C19988d c19988d : this.f166422v) {
            c19988d.m11485S();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m184718j0(@Nullable DrmInitData drmInitData) {
        if (bmk0.m105123c(this.f166399W, drmInitData)) {
            return;
        }
        this.f166399W = drmInitData;
        int i = 0;
        while (true) {
            C19988d[] c19988dArr = this.f166422v;
            if (i >= c19988dArr.length) {
                return;
            }
            if (this.f166391O[i]) {
                c19988dArr[i].m184736h0(drmInitData);
            }
            i++;
        }
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    /* JADX INFO: renamed from: k0 */
    public final void m184719k0() {
        this.f166380D = true;
    }

    @Override // p153l.bsf
    /* JADX INFO: renamed from: l */
    public void mo11425l() {
        this.f166397U = true;
        this.f166418r.post(this.f166417q);
    }

    /* JADX INFO: renamed from: l0 */
    public void m184720l0(boolean z) {
        this.f166404d.m124151t(z);
    }

    /* JADX INFO: renamed from: m */
    public ffj0 m184721m() {
        m184728w();
        return this.f166385I;
    }

    /* JADX INFO: renamed from: m0 */
    public void m184722m0(long j) {
        if (this.f166398V != j) {
            this.f166398V = j;
            for (C19988d c19988d : this.f166422v) {
                c19988d.m11492Z(j);
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public int m184723n0(int i, long j) throws Throwable {
        if (m184686O()) {
            return 0;
        }
        C19988d c19988d = this.f166422v[i];
        int iM11471E = c19988d.m11471E(j, this.f166396T);
        j5l j5lVar = (j5l) akq.m98600h(this.f166414n, null);
        if (j5lVar != null && !j5lVar.m143537q()) {
            iM11471E = Math.min(iM11471E, j5lVar.m143534m(i) - c19988d.m11469C());
        }
        c19988d.m11496d0(iM11471E);
        return iM11471E;
    }

    /* JADX INFO: renamed from: o0 */
    public void m184724o0(int i) {
        m184728w();
        w11.m204369e(this.f166387K);
        int i2 = this.f166387K[i];
        w11.m204371g(this.f166390N[i2]);
        this.f166390N[i2] = false;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m184725p0(xwd0[] xwd0VarArr) {
        this.f166419s.clear();
        for (xwd0 xwd0Var : xwd0VarArr) {
            if (xwd0Var != null) {
                this.f166419s.add((o5l) xwd0Var);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m184726s() throws IOException {
        m184702T();
        if (this.f166396T && !this.f166380D) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m184727t(long j, boolean z) {
        if (!this.f166379C || m184686O()) {
            return;
        }
        int length = this.f166422v.length;
        for (int i = 0; i < length; i++) {
            this.f166422v[i].m11506q(j, z, this.f166390N[i]);
        }
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    /* JADX INFO: renamed from: w */
    public final void m184728w() {
        w11.m204371g(this.f166380D);
        w11.m204369e(this.f166385I);
        w11.m204369e(this.f166386J);
    }

    /* JADX INFO: renamed from: x */
    public int m184729x(int i) {
        m184728w();
        w11.m204369e(this.f166387K);
        int i2 = this.f166387K[i];
        if (i2 == -1) {
            return this.f166386J.contains(this.f166385I.m125387b(i)) ? -3 : -2;
        }
        boolean[] zArr = this.f166390N;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    /* JADX INFO: renamed from: y */
    public final void m184730y() {
        C1894k c1894k;
        int length = this.f166422v.length;
        int i = -2;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            if (i3 >= length) {
                break;
            }
            String str = ((C1894k) w11.m204373i(this.f166422v[i3].m11472F())).f7785l;
            if (!kb00.m149018s(str)) {
                i4 = kb00.m149014o(str) ? 1 : kb00.m149017r(str) ? 3 : -2;
            }
            if (m184684L(i4) > m184684L(i)) {
                i2 = i3;
                i = i4;
            } else if (i4 == i && i2 != -1) {
                i2 = -1;
            }
            i3++;
        }
        dfj0 dfj0VarM124141j = this.f166404d.m124141j();
        int i5 = dfj0VarM124141j.f88159a;
        this.f166388L = -1;
        this.f166387K = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.f166387K[i6] = i6;
        }
        dfj0[] dfj0VarArr = new dfj0[length];
        int i7 = 0;
        while (i7 < length) {
            C1894k c1894k2 = (C1894k) w11.m204373i(this.f166422v[i7].m11472F());
            if (i7 == i2) {
                C1894k[] c1894kArr = new C1894k[i5];
                for (int i8 = 0; i8 < i5; i8++) {
                    C1894k c1894kM115519c = dfj0VarM124141j.m115519c(i8);
                    if (i == 1 && (c1894k = this.f166406f) != null) {
                        c1894kM115519c = c1894kM115519c.m10341k(c1894k);
                    }
                    c1894kArr[i8] = i5 == 1 ? c1894k2.m10341k(c1894kM115519c) : m184681E(c1894kM115519c, c1894k2, true);
                }
                dfj0VarArr[i7] = new dfj0(this.f166401a, c1894kArr);
                this.f166388L = i7;
            } else {
                C1894k c1894k3 = (i == 2 && kb00.m149014o(c1894k2.f7785l)) ? this.f166406f : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f166401a);
                sb.append(":muxed:");
                sb.append(i7 < i2 ? i7 : i7 - 1);
                dfj0VarArr[i7] = new dfj0(sb.toString(), m184681E(c1894k3, c1894k2, false));
            }
            i7++;
        }
        this.f166385I = m184693D(dfj0VarArr);
        w11.m204371g(this.f166386J == null);
        this.f166386J = Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m184731z(int i) {
        int i2 = i;
        while (true) {
            int size = this.f166414n.size();
            ArrayList<j5l> arrayList = this.f166414n;
            if (i2 >= size) {
                j5l j5lVar = arrayList.get(i);
                for (int i3 = 0; i3 < this.f166422v.length; i3++) {
                    if (this.f166422v[i3].m11469C() > j5lVar.m143534m(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (arrayList.get(i2).f118464n) {
                return false;
            }
            i2++;
        }
    }

    @Override // p153l.bsf
    /* JADX INFO: renamed from: k */
    public void mo11424k(mke0 mke0Var) {
    }
}
