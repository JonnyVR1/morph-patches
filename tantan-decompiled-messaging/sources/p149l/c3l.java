package p149l;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import com.google.android.exoplayer2.drm.InterfaceC1855c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.C1973q;
import com.google.android.exoplayer2.source.InterfaceC1966j;
import com.google.android.exoplayer2.source.InterfaceC1974r;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
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
public final class c3l implements Loader.InterfaceC2041b<n35>, Loader.InterfaceC2045f, InterfaceC1974r, uqf, C1973q.d {

    /* JADX INFO: renamed from: Y */
    public static final Set<Integer> f78955Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: A */
    public int f78956A;

    /* JADX INFO: renamed from: B */
    public int f78957B;

    /* JADX INFO: renamed from: C */
    public boolean f78958C;

    /* JADX INFO: renamed from: D */
    public boolean f78959D;

    /* JADX INFO: renamed from: E */
    public int f78960E;

    /* JADX INFO: renamed from: F */
    public C1871k f78961F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public C1871k f78962G;

    /* JADX INFO: renamed from: H */
    public boolean f78963H;

    /* JADX INFO: renamed from: I */
    public b6j0 f78964I;

    /* JADX INFO: renamed from: J */
    public Set<z5j0> f78965J;

    /* JADX INFO: renamed from: K */
    public int[] f78966K;

    /* JADX INFO: renamed from: L */
    public int f78967L;

    /* JADX INFO: renamed from: M */
    public boolean f78968M;

    /* JADX INFO: renamed from: N */
    public boolean[] f78969N;

    /* JADX INFO: renamed from: O */
    public boolean[] f78970O;

    /* JADX INFO: renamed from: P */
    public long f78971P;

    /* JADX INFO: renamed from: Q */
    public long f78972Q;

    /* JADX INFO: renamed from: R */
    public boolean f78973R;

    /* JADX INFO: renamed from: S */
    public boolean f78974S;

    /* JADX INFO: renamed from: T */
    public boolean f78975T;

    /* JADX INFO: renamed from: U */
    public boolean f78976U;

    /* JADX INFO: renamed from: V */
    public long f78977V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public DrmInitData f78978W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public t2l f78979X;

    /* JADX INFO: renamed from: a */
    public final String f78980a;

    /* JADX INFO: renamed from: b */
    public final int f78981b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16052b f78982c;

    /* JADX INFO: renamed from: d */
    public final p2l f78983d;

    /* JADX INFO: renamed from: e */
    public final sj0 f78984e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final C1871k f78985f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1855c f78986g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1854b.a f78987h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2049c f78988i;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1966j.a f78990k;

    /* JADX INFO: renamed from: l */
    public final int f78991l;

    /* JADX INFO: renamed from: n */
    public final ArrayList<t2l> f78993n;

    /* JADX INFO: renamed from: o */
    public final List<t2l> f78994o;

    /* JADX INFO: renamed from: p */
    public final Runnable f78995p;

    /* JADX INFO: renamed from: q */
    public final Runnable f78996q;

    /* JADX INFO: renamed from: r */
    public final Handler f78997r;

    /* JADX INFO: renamed from: s */
    public final ArrayList<y2l> f78998s;

    /* JADX INFO: renamed from: t */
    public final Map<String, DrmInitData> f78999t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public n35 f79000u;

    /* JADX INFO: renamed from: v */
    public C16054d[] f79001v;

    /* JADX INFO: renamed from: x */
    public Set<Integer> f79003x;

    /* JADX INFO: renamed from: y */
    public SparseIntArray f79004y;

    /* JADX INFO: renamed from: z */
    public m6j0 f79005z;

    /* JADX INFO: renamed from: j */
    public final Loader f78989j = new Loader("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: m */
    public final p2l.C19118b f78992m = new p2l.C19118b();

    /* JADX INFO: renamed from: w */
    public int[] f79002w = new int[0];

    /* JADX INFO: renamed from: l.c3l$b */
    public interface InterfaceC16052b extends InterfaceC1974r.a<c3l> {
        /* JADX INFO: renamed from: a */
        void mo105084a();

        /* JADX INFO: renamed from: k */
        void mo105085k(Uri uri);
    }

    /* JADX INFO: renamed from: l.c3l$c */
    public static class C16053c implements m6j0 {

        /* JADX INFO: renamed from: g */
        public static final C1871k f79006g = new C1871k.b().m10346g0("application/id3").m10320G();

        /* JADX INFO: renamed from: h */
        public static final C1871k f79007h = new C1871k.b().m10346g0("application/x-emsg").m10320G();

        /* JADX INFO: renamed from: a */
        public final y3f f79008a = new y3f();

        /* JADX INFO: renamed from: b */
        public final m6j0 f79009b;

        /* JADX INFO: renamed from: c */
        public final C1871k f79010c;

        /* JADX INFO: renamed from: d */
        public C1871k f79011d;

        /* JADX INFO: renamed from: e */
        public byte[] f79012e;

        /* JADX INFO: renamed from: f */
        public int f79013f;

        public C16053c(m6j0 m6j0Var, int i) {
            this.f79009b = m6j0Var;
            if (i == 1) {
                this.f79010c = f79006g;
            } else {
                if (i != 3) {
                    k250.m144273a("Unknown metadataType: ", i);
                    throw null;
                }
                this.f79010c = f79007h;
            }
            this.f79012e = new byte[0];
            this.f79013f = 0;
        }

        @Override // p149l.m6j0
        /* JADX INFO: renamed from: a */
        public void mo11109a(long j, int i, int i2, int i3, @Nullable m6j0.C18401a c18401a) {
            p11.m167011e(this.f79011d);
            d860 d860VarM105088i = m105088i(i2, i3);
            if (!vck0.m197845c(this.f79011d.f7748l, this.f79010c.f7748l)) {
                if (!"application/x-emsg".equals(this.f79011d.f7748l)) {
                    jwv.m143689i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f79011d.f7748l);
                    return;
                } else {
                    EventMessage eventMessageM212801c = this.f79008a.m212801c(d860VarM105088i);
                    if (!m105086g(eventMessageM212801c)) {
                        jwv.m143689i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f79010c.f7748l, eventMessageM212801c.mo10534N()));
                        return;
                    }
                    d860VarM105088i = new d860((byte[]) p11.m167011e(eventMessageM212801c.mo10536v()));
                }
            }
            int iM110295a = d860VarM105088i.m110295a();
            this.f79009b.m153238d(d860VarM105088i, iM110295a);
            this.f79009b.mo11109a(j, i, iM110295a, i3, c18401a);
        }

        @Override // p149l.m6j0
        /* JADX INFO: renamed from: b */
        public void mo11110b(C1871k c1871k) {
            this.f79011d = c1871k;
            this.f79009b.mo11110b(this.f79010c);
        }

        @Override // p149l.m6j0
        /* JADX INFO: renamed from: c */
        public int mo11111c(w4c w4cVar, int i, boolean z, int i2) throws IOException {
            m105087h(this.f79013f + i);
            int i3 = w4cVar.read(this.f79012e, this.f79013f, i);
            if (i3 != -1) {
                this.f79013f += i3;
                return i3;
            }
            if (z) {
                return -1;
            }
            hg3.m130807a();
            return 0;
        }

        @Override // p149l.m6j0
        /* JADX INFO: renamed from: f */
        public void mo11112f(d860 d860Var, int i, int i2) {
            m105087h(this.f79013f + i);
            d860Var.m110306l(this.f79012e, this.f79013f, i);
            this.f79013f += i;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m105086g(EventMessage eventMessage) {
            C1871k c1871kMo10534N = eventMessage.mo10534N();
            return c1871kMo10534N != null && vck0.m197845c(this.f79010c.f7748l, c1871kMo10534N.f7748l);
        }

        /* JADX INFO: renamed from: h */
        public final void m105087h(int i) {
            byte[] bArr = this.f79012e;
            if (bArr.length < i) {
                this.f79012e = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        /* JADX INFO: renamed from: i */
        public final d860 m105088i(int i, int i2) {
            int i3 = this.f79013f - i2;
            d860 d860Var = new d860(Arrays.copyOfRange(this.f79012e, i3 - i, i3));
            byte[] bArr = this.f79012e;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.f79013f = i2;
            return d860Var;
        }
    }

    /* JADX INFO: renamed from: l.c3l$d */
    public static final class C16054d extends C1973q {

        /* JADX INFO: renamed from: H */
        public final Map<String, DrmInitData> f79014H;

        /* JADX INFO: renamed from: I */
        @Nullable
        public DrmInitData f79015I;

        public C16054d(sj0 sj0Var, InterfaceC1855c interfaceC1855c, InterfaceC1854b.a aVar, Map<String, DrmInitData> map) {
            super(sj0Var, interfaceC1855c, aVar);
            this.f79014H = map;
        }

        @Override // com.google.android.exoplayer2.source.C1973q, p149l.m6j0
        /* JADX INFO: renamed from: a */
        public void mo11109a(long j, int i, int i2, int i3, @Nullable m6j0.C18401a c18401a) {
            super.mo11109a(j, i, i2, i3, c18401a);
        }

        @Nullable
        /* JADX INFO: renamed from: g0 */
        public final Metadata m105089g0(@Nullable Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int iM10533e = metadata.m10533e();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= iM10533e) {
                    i2 = -1;
                    break;
                }
                Metadata.Entry entryM10532d = metadata.m10532d(i2);
                if ((entryM10532d instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entryM10532d).owner)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return metadata;
            }
            if (iM10533e == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[iM10533e - 1];
            while (i < iM10533e) {
                if (i != i2) {
                    entryArr[i < i2 ? i : i - 1] = metadata.m10532d(i);
                }
                i++;
            }
            return new Metadata(entryArr);
        }

        /* JADX INFO: renamed from: h0 */
        public void m105090h0(@Nullable DrmInitData drmInitData) {
            this.f79015I = drmInitData;
            m11421I();
        }

        /* JADX INFO: renamed from: i0 */
        public void m105091i0(t2l t2lVar) {
            m11443e0(t2lVar.f167501k);
        }

        @Override // com.google.android.exoplayer2.source.C1973q
        /* JADX INFO: renamed from: w */
        public C1871k mo11458w(C1871k c1871k) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.f79015I;
            if (drmInitData2 == null) {
                drmInitData2 = c1871k.f7751o;
            }
            if (drmInitData2 != null && (drmInitData = this.f79014H.get(drmInitData2.schemeType)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata metadataM105089g0 = m105089g0(c1871k.f7746j);
            if (drmInitData2 != c1871k.f7751o || metadataM105089g0 != c1871k.f7746j) {
                c1871k = c1871k.m10282b().m10328O(drmInitData2).m10339Z(metadataM105089g0).m10320G();
            }
            return super.mo11458w(c1871k);
        }
    }

    public c3l(String str, int i, InterfaceC16052b interfaceC16052b, p2l p2lVar, Map<String, DrmInitData> map, sj0 sj0Var, long j, @Nullable C1871k c1871k, InterfaceC1855c interfaceC1855c, InterfaceC1854b.a aVar, InterfaceC2049c interfaceC2049c, InterfaceC1966j.a aVar2, int i2) {
        this.f78980a = str;
        this.f78981b = i;
        this.f78982c = interfaceC16052b;
        this.f78983d = p2lVar;
        this.f78999t = map;
        this.f78984e = sj0Var;
        this.f78985f = c1871k;
        this.f78986g = interfaceC1855c;
        this.f78987h = aVar;
        this.f78988i = interfaceC2049c;
        this.f78990k = aVar2;
        this.f78991l = i2;
        Set<Integer> set = f78955Y;
        this.f79003x = new HashSet(set.size());
        this.f79004y = new SparseIntArray(set.size());
        this.f79001v = new C16054d[0];
        this.f78970O = new boolean[0];
        this.f78969N = new boolean[0];
        ArrayList<t2l> arrayList = new ArrayList<>();
        this.f78993n = arrayList;
        this.f78994o = Collections.unmodifiableList(arrayList);
        this.f78998s = new ArrayList<>();
        this.f78995p = new Runnable() { // from class: l.a3l
            @Override // java.lang.Runnable
            public final void run() {
                this.f67387a.m105039S();
            }
        };
        this.f78996q = new Runnable() { // from class: l.b3l
            @Override // java.lang.Runnable
            public final void run() {
                this.f73244a.m105062b0();
            }
        };
        this.f78997r = vck0.m197896w();
        this.f78971P = j;
        this.f78972Q = j;
    }

    /* JADX INFO: renamed from: B */
    public static nee m105032B(int i, int i2) {
        jwv.m143689i("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new nee();
    }

    /* JADX INFO: renamed from: E */
    public static C1871k m105033E(@Nullable C1871k c1871k, C1871k c1871k2, boolean z) {
        String strM157522d;
        String strM157525g;
        if (c1871k == null) {
            return c1871k2;
        }
        int iM157529k = n200.m157529k(c1871k2.f7748l);
        int iM197809L = vck0.m197809L(c1871k.f7745i, iM157529k);
        String str = c1871k.f7745i;
        if (iM197809L == 1) {
            strM157522d = vck0.m197811M(str, iM157529k);
            strM157525g = n200.m157525g(strM157522d);
        } else {
            strM157522d = n200.m157522d(str, c1871k2.f7748l);
            strM157525g = c1871k2.f7748l;
        }
        C1871k.b bVarM10324K = c1871k2.m10282b().m10334U(c1871k.f7737a).m10336W(c1871k.f7738b).m10337X(c1871k.f7739c).m10348i0(c1871k.f7740d).m10344e0(c1871k.f7741e).m10322I(z ? c1871k.f7742f : -1).m10341b0(z ? c1871k.f7743g : -1).m10324K(strM157522d);
        if (iM157529k == 2) {
            bVarM10324K.m10353n0(c1871k.f7753q).m10332S(c1871k.f7754r).m10331R(c1871k.f7755s);
        }
        if (strM157525g != null) {
            bVarM10324K.m10346g0(strM157525g);
        }
        int i = c1871k.f7761y;
        if (i != -1 && iM157529k == 1) {
            bVarM10324K.m10323J(i);
        }
        Metadata metadataM10530b = c1871k.f7746j;
        if (metadataM10530b != null) {
            Metadata metadata = c1871k2.f7746j;
            if (metadata != null) {
                metadataM10530b = metadata.m10530b(metadataM10530b);
            }
            bVarM10324K.m10339Z(metadataM10530b);
        }
        return bVarM10324K.m10320G();
    }

    /* JADX INFO: renamed from: F */
    private void m105034F(int i) {
        p11.m167013g(!this.f78989j.m12088j());
        while (true) {
            if (i >= this.f78993n.size()) {
                i = -1;
                break;
            } else if (m105083z(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = m105048J().f136918h;
        t2l t2lVarM105046G = m105046G(i);
        if (this.f78993n.isEmpty()) {
            this.f78972Q = this.f78971P;
        } else {
            ((t2l) aiq.m96881g(this.f78993n)).m187005o();
        }
        this.f78975T = false;
        this.f78990k.m11293w(this.f78956A, t2lVarM105046G.f136917g, j);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m105035I(C1871k c1871k, C1871k c1871k2) {
        String str = c1871k.f7748l;
        String str2 = c1871k2.f7748l;
        int iM157529k = n200.m157529k(str);
        if (iM157529k != 3) {
            return iM157529k == n200.m157529k(str2);
        }
        if (vck0.m197845c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c1871k.f7732D == c1871k2.f7732D;
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public static int m105036L(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: renamed from: N */
    private static boolean m105037N(n35 n35Var) {
        return n35Var instanceof t2l;
    }

    /* JADX INFO: renamed from: O */
    private boolean m105038O() {
        return this.f78972Q != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m105039S() {
        if (!this.f78963H && this.f78966K == null && this.f78958C) {
            for (C16054d c16054d : this.f79001v) {
                if (c16054d.m11418F() == null) {
                    return;
                }
            }
            if (this.f78964I != null) {
                m105053R();
                return;
            }
            m105082y();
            m105071k0();
            this.f78982c.mo105084a();
        }
    }

    /* JADX INFO: renamed from: f0 */
    private void m105040f0() {
        for (C16054d c16054d : this.f79001v) {
            c16054d.m11434V(this.f78973R);
        }
        this.f78973R = false;
    }

    /* JADX INFO: renamed from: A */
    public void m105043A() {
        if (this.f78959D) {
            return;
        }
        mo10923c(this.f78971P);
    }

    /* JADX INFO: renamed from: C */
    public final C1973q m105044C(int i, int i2) {
        int length = this.f79001v.length;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        C16054d c16054d = new C16054d(this.f78984e, this.f78986g, this.f78987h, this.f78999t);
        c16054d.m11439a0(this.f78971P);
        if (z) {
            c16054d.m105090h0(this.f78978W);
        }
        c16054d.m11438Z(this.f78977V);
        t2l t2lVar = this.f78979X;
        if (t2lVar != null) {
            c16054d.m105091i0(t2lVar);
        }
        c16054d.m11441c0(this);
        int i3 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f79002w, i3);
        this.f79002w = iArrCopyOf;
        iArrCopyOf[length] = i;
        this.f79001v = (C16054d[]) vck0.m197812M0(this.f79001v, c16054d);
        boolean[] zArrCopyOf = Arrays.copyOf(this.f78970O, i3);
        this.f78970O = zArrCopyOf;
        zArrCopyOf[length] = z;
        this.f78968M |= z;
        this.f79003x.add(Integer.valueOf(i2));
        this.f79004y.append(i2, length);
        if (m105036L(i2) > m105036L(this.f78956A)) {
            this.f78957B = length;
            this.f78956A = i2;
        }
        this.f78969N = Arrays.copyOf(this.f78969N, i3);
        return c16054d;
    }

    /* JADX INFO: renamed from: D */
    public final b6j0 m105045D(z5j0[] z5j0VarArr) {
        for (int i = 0; i < z5j0VarArr.length; i++) {
            z5j0 z5j0Var = z5j0VarArr[i];
            C1871k[] c1871kArr = new C1871k[z5j0Var.f201817a];
            for (int i2 = 0; i2 < z5j0Var.f201817a; i2++) {
                C1871k c1871kM217358c = z5j0Var.m217358c(i2);
                c1871kArr[i2] = c1871kM217358c.m10283c(this.f78986g.mo9876c(c1871kM217358c));
            }
            z5j0VarArr[i] = new z5j0(z5j0Var.f201818b, c1871kArr);
        }
        return new b6j0(z5j0VarArr);
    }

    /* JADX INFO: renamed from: G */
    public final t2l m105046G(int i) {
        t2l t2lVar = this.f78993n.get(i);
        ArrayList<t2l> arrayList = this.f78993n;
        vck0.m197828U0(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.f79001v.length; i2++) {
            this.f79001v[i2].m11456u(t2lVar.m187003m(i2));
        }
        return t2lVar;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m105047H(t2l t2lVar) {
        int i = t2lVar.f167501k;
        int length = this.f79001v.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f78969N[i2] && this.f79001v[i2].m11428P() == i) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public final t2l m105048J() {
        ArrayList<t2l> arrayList = this.f78993n;
        return arrayList.get(arrayList.size() - 1);
    }

    @Nullable
    /* JADX INFO: renamed from: K */
    public final m6j0 m105049K(int i, int i2) {
        p11.m167007a(f78955Y.contains(Integer.valueOf(i2)));
        int i3 = this.f79004y.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.f79003x.add(Integer.valueOf(i2))) {
            this.f79002w[i3] = i;
        }
        return this.f79002w[i3] == i ? this.f79001v[i3] : m105032B(i, i2);
    }

    /* JADX INFO: renamed from: M */
    public final void m105050M(t2l t2lVar) {
        this.f78979X = t2lVar;
        this.f78961F = t2lVar.f136914d;
        this.f78972Q = -9223372036854775807L;
        this.f78993n.add(t2lVar);
        ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
        for (C16054d c16054d : this.f79001v) {
            c2781aBuilder.mo15683a(Integer.valueOf(c16054d.m11419G()));
        }
        t2lVar.m187004n(this, c2781aBuilder.m15702m());
        for (C16054d c16054d2 : this.f79001v) {
            c16054d2.m105091i0(t2lVar);
            if (t2lVar.f167504n) {
                c16054d2.m11444f0();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public boolean m105051P(int i) {
        return !m105038O() && this.f79001v[i].m11423K(this.f78975T);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m105052Q() {
        return this.f78956A == 2;
    }

    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @RequiresNonNull({"trackGroups"})
    /* JADX INFO: renamed from: R */
    public final void m105053R() {
        int i = this.f78964I.f73826a;
        int[] iArr = new int[i];
        this.f78966K = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                C16054d[] c16054dArr = this.f79001v;
                if (i3 >= c16054dArr.length) {
                    break;
                }
                if (m105035I((C1871k) p11.m167015i(c16054dArr[i3].m11418F()), this.f78964I.m100410b(i2).m217358c(0))) {
                    this.f78966K[i2] = i3;
                    break;
                }
                i3++;
            }
        }
        Iterator<y2l> it = this.f78998s.iterator();
        while (it.hasNext()) {
            it.next().m212378c();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m105054T() throws IOException {
        this.f78989j.mo11027a();
        this.f78983d.m167195n();
    }

    /* JADX INFO: renamed from: U */
    public void m105055U(int i) throws IOException {
        m105054T();
        this.f79001v[i].m11425M();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo11024n(n35 n35Var, long j, long j2, boolean z) {
        this.f79000u = null;
        lrv lrvVar = new lrv(n35Var.f136911a, n35Var.f136912b, n35Var.m157727f(), n35Var.m157726e(), j, j2, n35Var.m157724b());
        this.f78988i.m12122c(n35Var.f136911a);
        this.f78990k.m11281k(lrvVar, n35Var.f136913c, this.f78981b, n35Var.f136914d, n35Var.f136915e, n35Var.f136916f, n35Var.f136917g, n35Var.f136918h);
        if (z) {
            return;
        }
        if (m105038O() || this.f78960E == 0) {
            m105040f0();
        }
        if (this.f78960E > 0) {
            this.f78982c.mo10216j(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo11025o(n35 n35Var, long j, long j2) {
        this.f79000u = null;
        this.f78983d.m167197p(n35Var);
        lrv lrvVar = new lrv(n35Var.f136911a, n35Var.f136912b, n35Var.m157727f(), n35Var.m157726e(), j, j2, n35Var.m157724b());
        this.f78988i.m12122c(n35Var.f136911a);
        this.f78990k.m11284n(lrvVar, n35Var.f136913c, this.f78981b, n35Var.f136914d, n35Var.f136915e, n35Var.f136916f, n35Var.f136917g, n35Var.f136918h);
        if (this.f78959D) {
            this.f78982c.mo10216j(this);
        } else {
            mo10923c(this.f78971P);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Loader.C2042c mo11026q(n35 n35Var, long j, long j2, IOException iOException, int i) {
        Loader.C2042c c2042cM12084h;
        int i2;
        boolean zM105037N = m105037N(n35Var);
        if (zM105037N && !((t2l) n35Var).m187006q() && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode) == 410 || i2 == 404)) {
            return Loader.f9456d;
        }
        long jM157724b = n35Var.m157724b();
        lrv lrvVar = new lrv(n35Var.f136911a, n35Var.f136912b, n35Var.m157727f(), n35Var.m157726e(), j, j2, jM157724b);
        InterfaceC2049c.c cVar = new InterfaceC2049c.c(lrvVar, new nkx(n35Var.f136913c, this.f78981b, n35Var.f136914d, n35Var.f136915e, n35Var.f136916f, vck0.m197874l1(n35Var.f136917g), vck0.m197874l1(n35Var.f136918h)), iOException, i);
        InterfaceC2049c.b bVarMo12119b = this.f78988i.mo12119b(x6j0.m207178c(this.f78983d.m167192k()), cVar);
        boolean zM167194m = (bVarMo12119b == null || bVarMo12119b.f9518a != 2) ? false : this.f78983d.m167194m(n35Var, bVarMo12119b.f9519b);
        if (zM167194m) {
            if (zM105037N && jM157724b == 0) {
                ArrayList<t2l> arrayList = this.f78993n;
                p11.m167013g(arrayList.remove(arrayList.size() - 1) == n35Var);
                if (this.f78993n.isEmpty()) {
                    this.f78972Q = this.f78971P;
                } else {
                    ((t2l) aiq.m96881g(this.f78993n)).m187005o();
                }
            }
            c2042cM12084h = Loader.f9458f;
        } else {
            long jMo12118a = this.f78988i.mo12118a(cVar);
            c2042cM12084h = jMo12118a != -9223372036854775807L ? Loader.m12084h(false, jMo12118a) : Loader.f9459g;
        }
        Loader.C2042c c2042c = c2042cM12084h;
        boolean zM12095c = c2042c.m12095c();
        this.f78990k.m11286p(lrvVar, n35Var.f136913c, this.f78981b, n35Var.f136914d, n35Var.f136915e, n35Var.f136916f, n35Var.f136917g, n35Var.f136918h, iOException, !zM12095c);
        if (!zM12095c) {
            this.f79000u = null;
            this.f78988i.m12122c(n35Var.f136911a);
        }
        if (zM167194m) {
            if (!this.f78959D) {
                mo10923c(this.f78971P);
                return c2042c;
            }
            this.f78982c.mo10216j(this);
        }
        return c2042c;
    }

    /* JADX INFO: renamed from: Y */
    public void m105059Y() {
        this.f79003x.clear();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m105060Z(Uri uri, InterfaceC2049c.c cVar, boolean z) {
        InterfaceC2049c.b bVarMo12119b;
        if (!this.f78983d.m167196o(uri)) {
            return true;
        }
        long j = (z || (bVarMo12119b = this.f78988i.mo12119b(x6j0.m207178c(this.f78983d.m167192k()), cVar)) == null || bVarMo12119b.f9518a != 2) ? -9223372036854775807L : bVarMo12119b.f9519b;
        return this.f78983d.m167198q(uri, j) && j != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.C1973q.d
    /* JADX INFO: renamed from: a */
    public void mo11360a(C1871k c1871k) {
        this.f78997r.post(this.f78995p);
    }

    /* JADX INFO: renamed from: a0 */
    public void m105061a0() {
        if (this.f78993n.isEmpty()) {
            return;
        }
        t2l t2lVar = (t2l) aiq.m96881g(this.f78993n);
        int iM167187c = this.f78983d.m167187c(t2lVar);
        if (iM167187c == 1) {
            t2lVar.m187011v();
        } else if (iM167187c == 2 && !this.f78975T && this.f78989j.m12088j()) {
            this.f78989j.m12085f();
        }
    }

    @Override // p149l.uqf
    /* JADX INFO: renamed from: b */
    public m6j0 mo11362b(int i, int i2) {
        m6j0 m6j0VarM105044C;
        if (!f78955Y.contains(Integer.valueOf(i2))) {
            int i3 = 0;
            while (true) {
                m6j0[] m6j0VarArr = this.f79001v;
                if (i3 >= m6j0VarArr.length) {
                    m6j0VarM105044C = null;
                    break;
                }
                if (this.f79002w[i3] == i) {
                    m6j0VarM105044C = m6j0VarArr[i3];
                    break;
                }
                i3++;
            }
        } else {
            m6j0VarM105044C = m105049K(i, i2);
        }
        if (m6j0VarM105044C == null) {
            if (this.f78976U) {
                return m105032B(i, i2);
            }
            m6j0VarM105044C = m105044C(i, i2);
        }
        if (i2 != 5) {
            return m6j0VarM105044C;
        }
        if (this.f79005z == null) {
            this.f79005z = new C16053c(m6j0VarM105044C, this.f78991l);
        }
        return this.f79005z;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m105062b0() {
        this.f78958C = true;
        m105039S();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: c */
    public boolean mo10923c(long j) {
        List<t2l> list;
        long jMax;
        if (this.f78975T || this.f78989j.m12088j() || this.f78989j.m12087i()) {
            return false;
        }
        if (m105038O()) {
            list = Collections.EMPTY_LIST;
            jMax = this.f78972Q;
            for (C16054d c16054d : this.f79001v) {
                c16054d.m11439a0(this.f78972Q);
            }
        } else {
            list = this.f78994o;
            t2l t2lVarM105048J = m105048J();
            jMax = t2lVarM105048J.mo111872h() ? t2lVarM105048J.f136918h : Math.max(this.f78971P, t2lVarM105048J.f136917g);
        }
        List<t2l> list2 = list;
        long j2 = jMax;
        this.f78992m.m167206a();
        this.f78983d.m167188e(j, j2, list2, this.f78959D || !list2.isEmpty(), this.f78992m);
        p2l.C19118b c19118b = this.f78992m;
        boolean z = c19118b.f146891b;
        n35 n35Var = c19118b.f146890a;
        Uri uri = c19118b.f146892c;
        if (z) {
            this.f78972Q = -9223372036854775807L;
            this.f78975T = true;
            return true;
        }
        if (n35Var == null) {
            if (uri != null) {
                this.f78982c.mo105085k(uri);
            }
            return false;
        }
        if (m105037N(n35Var)) {
            m105050M((t2l) n35Var);
        }
        this.f79000u = n35Var;
        this.f78990k.m11290t(new lrv(n35Var.f136911a, n35Var.f136912b, this.f78989j.m12092n(n35Var, this, this.f78988i.mo12120d(n35Var.f136913c))), n35Var.f136913c, this.f78981b, n35Var.f136914d, n35Var.f136915e, n35Var.f136916f, n35Var.f136917g, n35Var.f136918h);
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public void m105063c0(z5j0[] z5j0VarArr, int i, int... iArr) {
        this.f78964I = m105045D(z5j0VarArr);
        this.f78965J = new HashSet();
        for (int i2 : iArr) {
            this.f78965J.add(this.f78964I.m100410b(i2));
        }
        this.f78967L = i;
        Handler handler = this.f78997r;
        final InterfaceC16052b interfaceC16052b = this.f78982c;
        Objects.requireNonNull(interfaceC16052b);
        handler.post(new Runnable() { // from class: l.z2l
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC16052b.mo105084a();
            }
        });
        m105071k0();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: d */
    public long mo10924d() {
        if (this.f78975T) {
            return Long.MIN_VALUE;
        }
        if (m105038O()) {
            return this.f78972Q;
        }
        long jMax = this.f78971P;
        t2l t2lVarM105048J = m105048J();
        if (!t2lVarM105048J.mo111872h()) {
            if (this.f78993n.size() > 1) {
                ArrayList<t2l> arrayList = this.f78993n;
                t2lVarM105048J = arrayList.get(arrayList.size() - 2);
            } else {
                t2lVarM105048J = null;
            }
        }
        if (t2lVarM105048J != null) {
            jMax = Math.max(jMax, t2lVarM105048J.f136918h);
        }
        if (this.f78958C) {
            for (C16054d c16054d : this.f79001v) {
                jMax = Math.max(jMax, c16054d.m11461z());
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: d0 */
    public int m105064d0(int i, uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (m105038O()) {
            return -3;
        }
        int i3 = 0;
        if (!this.f78993n.isEmpty()) {
            int i4 = 0;
            while (i4 < this.f78993n.size() - 1 && m105047H(this.f78993n.get(i4))) {
                i4++;
            }
            vck0.m197828U0(this.f78993n, 0, i4);
            t2l t2lVar = this.f78993n.get(0);
            C1871k c1871k = t2lVar.f136914d;
            if (!c1871k.equals(this.f78962G)) {
                this.f78990k.m11278h(this.f78981b, c1871k, t2lVar.f136915e, t2lVar.f136916f, t2lVar.f136917g);
            }
            this.f78962G = c1871k;
        }
        if (!this.f78993n.isEmpty() && !this.f78993n.get(0).m187006q()) {
            return -3;
        }
        int iM11430R = this.f79001v[i].m11430R(uyiVar, decoderInputBuffer, i2, this.f78975T);
        if (iM11430R == -5) {
            C1871k c1871kM10287k = (C1871k) p11.m167011e(uyiVar.f178866b);
            if (i == this.f78957B) {
                int iM16459d = Ints.m16459d(this.f79001v[i].m11428P());
                while (i3 < this.f78993n.size() && this.f78993n.get(i3).f167501k != iM16459d) {
                    i3++;
                }
                c1871kM10287k = c1871kM10287k.m10287k(i3 < this.f78993n.size() ? this.f78993n.get(i3).f136914d : (C1871k) p11.m167011e(this.f78961F));
            }
            uyiVar.f178866b = c1871kM10287k;
        }
        return iM11430R;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: e */
    public void mo10925e(long j) {
        if (this.f78989j.m12087i() || m105038O()) {
            return;
        }
        if (this.f78989j.m12088j()) {
            p11.m167011e(this.f79000u);
            if (this.f78983d.m167203v(j, this.f79000u, this.f78994o)) {
                this.f78989j.m12085f();
                return;
            }
            return;
        }
        int size = this.f78994o.size();
        while (size > 0 && this.f78983d.m167187c(this.f78994o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f78994o.size()) {
            m105034F(size);
        }
        int iM167190h = this.f78983d.m167190h(j, this.f78994o);
        if (iM167190h < this.f78993n.size()) {
            m105034F(iM167190h);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m105065e0() {
        if (this.f78959D) {
            for (C16054d c16054d : this.f79001v) {
                c16054d.m11429Q();
            }
        }
        this.f78989j.m12091m(this);
        this.f78997r.removeCallbacksAndMessages(null);
        this.f78963H = true;
        this.f78998s.clear();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: f */
    public long mo10926f() {
        if (m105038O()) {
            return this.f78972Q;
        }
        if (this.f78975T) {
            return Long.MIN_VALUE;
        }
        return m105048J().f136918h;
    }

    /* JADX INFO: renamed from: g */
    public long m105066g(long j, ice0 ice0Var) {
        return this.f78983d.m167186b(j, ice0Var);
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m105067g0(long j) {
        int length = this.f79001v.length;
        for (int i = 0; i < length; i++) {
            if (!this.f79001v[i].m11437Y(j, false) && (this.f78970O[i] || !this.f78968M)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m105068h0(long j, boolean z) {
        this.f78971P = j;
        if (m105038O()) {
            this.f78972Q = j;
            return true;
        }
        if (this.f78958C && !z && m105067g0(j)) {
            return false;
        }
        this.f78972Q = j;
        this.f78975T = false;
        this.f78993n.clear();
        if (this.f78989j.m12088j()) {
            if (this.f78958C) {
                for (C16054d c16054d : this.f79001v) {
                    c16054d.m11453r();
                }
            }
            this.f78989j.m12085f();
        } else {
            this.f78989j.m12086g();
            m105040f0();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0114  */
    /* JADX INFO: renamed from: i0 */
    public boolean m105069i0(o8f[] o8fVarArr, boolean[] zArr, vod0[] vod0VarArr, boolean[] zArr2, long j, boolean z) {
        boolean z2;
        m105080w();
        int i = this.f78960E;
        int i2 = 0;
        for (int i3 = 0; i3 < o8fVarArr.length; i3++) {
            y2l y2lVar = (y2l) vod0VarArr[i3];
            if (y2lVar != null && (o8fVarArr[i3] == null || !zArr[i3])) {
                this.f78960E--;
                y2lVar.m212380e();
                vod0VarArr[i3] = null;
            }
        }
        boolean z3 = z || (!this.f78974S ? j == this.f78971P : i != 0);
        o8f o8fVarM167192k = this.f78983d.m167192k();
        boolean z4 = z3;
        o8f o8fVar = o8fVarM167192k;
        for (int i4 = 0; i4 < o8fVarArr.length; i4++) {
            o8f o8fVar2 = o8fVarArr[i4];
            if (o8fVar2 != null) {
                int iM100411c = this.f78964I.m100411c(o8fVar2.mo11307h());
                if (iM100411c == this.f78967L) {
                    this.f78983d.m167202u(o8fVar2);
                    o8fVar = o8fVar2;
                }
                if (vod0VarArr[i4] == null) {
                    this.f78960E++;
                    y2l y2lVar2 = new y2l(this, iM100411c);
                    vod0VarArr[i4] = y2lVar2;
                    zArr2[i4] = true;
                    if (this.f78966K != null) {
                        y2lVar2.m212378c();
                        if (!z4) {
                            C16054d c16054d = this.f79001v[this.f78966K[iM100411c]];
                            z4 = (c16054d.m11437Y(j, true) || c16054d.m11415C() == 0) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.f78960E == 0) {
            this.f78983d.m167199r();
            this.f78962G = null;
            this.f78973R = true;
            this.f78993n.clear();
            if (this.f78989j.m12088j()) {
                if (this.f78958C) {
                    C16054d[] c16054dArr = this.f79001v;
                    int length = c16054dArr.length;
                    while (i2 < length) {
                        c16054dArr[i2].m11453r();
                        i2++;
                    }
                }
                this.f78989j.m12085f();
            } else {
                m105040f0();
            }
        } else {
            if (this.f78993n.isEmpty() || vck0.m197845c(o8fVar, o8fVarM167192k)) {
                z2 = z;
            } else {
                if (!this.f78974S) {
                    long j2 = j < 0 ? -j : 0L;
                    t2l t2lVarM105048J = m105048J();
                    o8f o8fVar3 = o8fVar;
                    o8fVar3.mo11306g(j, j2, -9223372036854775807L, this.f78994o, this.f78983d.m167185a(t2lVarM105048J, j));
                    if (o8fVar3.mo11309j() == this.f78983d.m167191j().m217359d(t2lVarM105048J.f136914d)) {
                        z2 = z;
                    }
                }
                this.f78973R = true;
                z2 = true;
                z4 = true;
            }
            if (z4) {
                m105068h0(j, z2);
                while (i2 < vod0VarArr.length) {
                    if (vod0VarArr[i2] != null) {
                        zArr2[i2] = true;
                    }
                    i2++;
                }
            }
        }
        m105077p0(vod0VarArr);
        this.f78974S = true;
        return z4;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    public boolean isLoading() {
        return this.f78989j.m12088j();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2045f
    /* JADX INFO: renamed from: j */
    public void mo11369j() {
        for (C16054d c16054d : this.f79001v) {
            c16054d.m11431S();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m105070j0(@Nullable DrmInitData drmInitData) {
        if (vck0.m197845c(this.f78978W, drmInitData)) {
            return;
        }
        this.f78978W = drmInitData;
        int i = 0;
        while (true) {
            C16054d[] c16054dArr = this.f79001v;
            if (i >= c16054dArr.length) {
                return;
            }
            if (this.f78970O[i]) {
                c16054dArr[i].m105090h0(drmInitData);
            }
            i++;
        }
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    /* JADX INFO: renamed from: k0 */
    public final void m105071k0() {
        this.f78959D = true;
    }

    @Override // p149l.uqf
    /* JADX INFO: renamed from: l */
    public void mo11371l() {
        this.f78976U = true;
        this.f78997r.post(this.f78996q);
    }

    /* JADX INFO: renamed from: l0 */
    public void m105072l0(boolean z) {
        this.f78983d.m167201t(z);
    }

    /* JADX INFO: renamed from: m */
    public b6j0 m105073m() {
        m105080w();
        return this.f78964I;
    }

    /* JADX INFO: renamed from: m0 */
    public void m105074m0(long j) {
        if (this.f78977V != j) {
            this.f78977V = j;
            for (C16054d c16054d : this.f79001v) {
                c16054d.m11438Z(j);
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public int m105075n0(int i, long j) throws Throwable {
        if (m105038O()) {
            return 0;
        }
        C16054d c16054d = this.f79001v[i];
        int iM11417E = c16054d.m11417E(j, this.f78975T);
        t2l t2lVar = (t2l) aiq.m96882h(this.f78993n, null);
        if (t2lVar != null && !t2lVar.m187006q()) {
            iM11417E = Math.min(iM11417E, t2lVar.m187003m(i) - c16054d.m11415C());
        }
        c16054d.m11442d0(iM11417E);
        return iM11417E;
    }

    /* JADX INFO: renamed from: o0 */
    public void m105076o0(int i) {
        m105080w();
        p11.m167011e(this.f78966K);
        int i2 = this.f78966K[i];
        p11.m167013g(this.f78969N[i2]);
        this.f78969N[i2] = false;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m105077p0(vod0[] vod0VarArr) {
        this.f78998s.clear();
        for (vod0 vod0Var : vod0VarArr) {
            if (vod0Var != null) {
                this.f78998s.add((y2l) vod0Var);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m105078s() throws IOException {
        m105054T();
        if (this.f78975T && !this.f78959D) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m105079t(long j, boolean z) {
        if (!this.f78958C || m105038O()) {
            return;
        }
        int length = this.f79001v.length;
        for (int i = 0; i < length; i++) {
            this.f79001v[i].m11452q(j, z, this.f78969N[i]);
        }
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    /* JADX INFO: renamed from: w */
    public final void m105080w() {
        p11.m167013g(this.f78959D);
        p11.m167011e(this.f78964I);
        p11.m167011e(this.f78965J);
    }

    /* JADX INFO: renamed from: x */
    public int m105081x(int i) {
        m105080w();
        p11.m167011e(this.f78966K);
        int i2 = this.f78966K[i];
        if (i2 == -1) {
            return this.f78965J.contains(this.f78964I.m100410b(i)) ? -3 : -2;
        }
        boolean[] zArr = this.f78969N;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    /* JADX INFO: renamed from: y */
    public final void m105082y() {
        C1871k c1871k;
        int length = this.f79001v.length;
        int i = -2;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            if (i3 >= length) {
                break;
            }
            String str = ((C1871k) p11.m167015i(this.f79001v[i3].m11418F())).f7748l;
            if (!n200.m157537s(str)) {
                i4 = n200.m157533o(str) ? 1 : n200.m157536r(str) ? 3 : -2;
            }
            if (m105036L(i4) > m105036L(i)) {
                i2 = i3;
                i = i4;
            } else if (i4 == i && i2 != -1) {
                i2 = -1;
            }
            i3++;
        }
        z5j0 z5j0VarM167191j = this.f78983d.m167191j();
        int i5 = z5j0VarM167191j.f201817a;
        this.f78967L = -1;
        this.f78966K = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.f78966K[i6] = i6;
        }
        z5j0[] z5j0VarArr = new z5j0[length];
        int i7 = 0;
        while (i7 < length) {
            C1871k c1871k2 = (C1871k) p11.m167015i(this.f79001v[i7].m11418F());
            if (i7 == i2) {
                C1871k[] c1871kArr = new C1871k[i5];
                for (int i8 = 0; i8 < i5; i8++) {
                    C1871k c1871kM217358c = z5j0VarM167191j.m217358c(i8);
                    if (i == 1 && (c1871k = this.f78985f) != null) {
                        c1871kM217358c = c1871kM217358c.m10287k(c1871k);
                    }
                    c1871kArr[i8] = i5 == 1 ? c1871k2.m10287k(c1871kM217358c) : m105033E(c1871kM217358c, c1871k2, true);
                }
                z5j0VarArr[i7] = new z5j0(this.f78980a, c1871kArr);
                this.f78967L = i7;
            } else {
                C1871k c1871k3 = (i == 2 && n200.m157533o(c1871k2.f7748l)) ? this.f78985f : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f78980a);
                sb.append(":muxed:");
                sb.append(i7 < i2 ? i7 : i7 - 1);
                z5j0VarArr[i7] = new z5j0(sb.toString(), m105033E(c1871k3, c1871k2, false));
            }
            i7++;
        }
        this.f78964I = m105045D(z5j0VarArr);
        p11.m167013g(this.f78965J == null);
        this.f78965J = Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m105083z(int i) {
        int i2 = i;
        while (true) {
            int size = this.f78993n.size();
            ArrayList<t2l> arrayList = this.f78993n;
            if (i2 >= size) {
                t2l t2lVar = arrayList.get(i);
                for (int i3 = 0; i3 < this.f79001v.length; i3++) {
                    if (this.f79001v[i3].m11415C() > t2lVar.m187003m(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (arrayList.get(i2).f167504n) {
                return false;
            }
            i2++;
        }
    }

    @Override // p149l.uqf
    /* JADX INFO: renamed from: k */
    public void mo11370k(hce0 hce0Var) {
    }
}
