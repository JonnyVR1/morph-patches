package p149l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ebj0 implements sqf {

    /* JADX INFO: renamed from: t */
    public static final xqf f90332t = new xqf() { // from class: l.dbj0
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return ebj0.m115481c();
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f90333a;

    /* JADX INFO: renamed from: b */
    public final int f90334b;

    /* JADX INFO: renamed from: c */
    public final List<eri0> f90335c;

    /* JADX INFO: renamed from: d */
    public final d860 f90336d;

    /* JADX INFO: renamed from: e */
    public final SparseIntArray f90337e;

    /* JADX INFO: renamed from: f */
    public final fbj0.InterfaceC16792c f90338f;

    /* JADX INFO: renamed from: g */
    public final SparseArray<fbj0> f90339g;

    /* JADX INFO: renamed from: h */
    public final SparseBooleanArray f90340h;

    /* JADX INFO: renamed from: i */
    public final SparseBooleanArray f90341i;

    /* JADX INFO: renamed from: j */
    public final cbj0 f90342j;

    /* JADX INFO: renamed from: k */
    public bbj0 f90343k;

    /* JADX INFO: renamed from: l */
    public uqf f90344l;

    /* JADX INFO: renamed from: m */
    public int f90345m;

    /* JADX INFO: renamed from: n */
    public boolean f90346n;

    /* JADX INFO: renamed from: o */
    public boolean f90347o;

    /* JADX INFO: renamed from: p */
    public boolean f90348p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public fbj0 f90349q;

    /* JADX INFO: renamed from: r */
    public int f90350r;

    /* JADX INFO: renamed from: s */
    public int f90351s;

    public ebj0(int i, eri0 eri0Var, fbj0.InterfaceC16792c interfaceC16792c, int i2) {
        this.f90338f = (fbj0.InterfaceC16792c) p11.m167011e(interfaceC16792c);
        this.f90334b = i2;
        this.f90333a = i;
        if (i == 1 || i == 2) {
            this.f90335c = Collections.singletonList(eri0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f90335c = arrayList;
            arrayList.add(eri0Var);
        }
        this.f90336d = new d860(new byte[9400], 0);
        this.f90340h = new SparseBooleanArray();
        this.f90341i = new SparseBooleanArray();
        this.f90339g = new SparseArray<>();
        this.f90337e = new SparseIntArray();
        this.f90342j = new cbj0(i2);
        this.f90344l = uqf.f177745i0;
        this.f90351s = -1;
        m115500x();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m115481c() {
        return new sqf[]{new ebj0()};
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m115487k(ebj0 ebj0Var) {
        int i = ebj0Var.f90345m;
        ebj0Var.f90345m = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: w */
    private void m115497w(long j) {
        if (this.f90347o) {
            return;
        }
        this.f90347o = true;
        if (this.f90342j.m106009b() == -9223372036854775807L) {
            this.f90344l.mo11370k(new hce0.C17275b(this.f90342j.m106009b()));
            return;
        }
        bbj0 bbj0Var = new bbj0(this.f90342j.m106010c(), this.f90342j.m106009b(), j, this.f90351s, this.f90334b);
        this.f90343k = bbj0Var;
        this.f90344l.mo11370k(bbj0Var.m171782b());
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        bbj0 bbj0Var;
        p11.m167013g(this.f90333a != 2);
        int size = this.f90335c.size();
        for (int i = 0; i < size; i++) {
            eri0 eri0Var = this.f90335c.get(i);
            boolean z = eri0Var.m117840e() == -9223372036854775807L;
            if (!z) {
                long jM117838c = eri0Var.m117838c();
                z = (jM117838c == -9223372036854775807L || jM117838c == 0 || jM117838c == j2) ? false : true;
            }
            if (z) {
                eri0Var.m117842h(j2);
            }
        }
        if (j2 != 0 && (bbj0Var = this.f90343k) != null) {
            bbj0Var.m171788h(j2);
        }
        this.f90336d.m110288Q(0);
        this.f90337e.clear();
        for (int i2 = 0; i2 < this.f90339g.size(); i2++) {
            this.f90339g.valueAt(i2).mo120353b();
        }
        this.f90350r = 0;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f90344l = uqfVar;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        byte[] bArrM110299e = this.f90336d.m110299e();
        tqfVar.mo150655f(bArrM110299e, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    tqfVar.mo150661o(i);
                    return true;
                }
                if (bArrM110299e[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        long j;
        long length = tqfVar.getLength();
        if (this.f90346n) {
            if (length != -1 && this.f90333a != 2 && !this.f90342j.m106011d()) {
                return this.f90342j.m106012e(tqfVar, fd80Var, this.f90351s);
            }
            m115497w(length);
            if (this.f90348p) {
                this.f90348p = false;
                mo10975a(0L, 0L);
                if (tqfVar.getPosition() != 0) {
                    fd80Var.f97018a = 0L;
                    return 1;
                }
            }
            bbj0 bbj0Var = this.f90343k;
            if (bbj0Var != null && bbj0Var.m171784d()) {
                return this.f90343k.m171783c(tqfVar, fd80Var);
            }
        }
        if (!m115498u(tqfVar)) {
            return -1;
        }
        int iM115499v = m115499v();
        int iM110301g = this.f90336d.m110301g();
        if (iM115499v > iM110301g) {
            return 0;
        }
        int iM110311q = this.f90336d.m110311q();
        if ((8388608 & iM110311q) != 0) {
            this.f90336d.m110292U(iM115499v);
            return 0;
        }
        int i = (4194304 & iM110311q) != 0 ? 1 : 0;
        int i2 = (2096896 & iM110311q) >> 8;
        boolean z = (iM110311q & 32) != 0;
        fbj0 fbj0Var = (iM110311q & 16) != 0 ? this.f90339g.get(i2) : null;
        if (fbj0Var == null) {
            this.f90336d.m110292U(iM115499v);
            return 0;
        }
        if (this.f90333a != 2) {
            int i3 = iM110311q & 15;
            j = -1;
            int i4 = this.f90337e.get(i2, i3 - 1);
            this.f90337e.put(i2, i3);
            if (i4 == i3) {
                this.f90336d.m110292U(iM115499v);
                return 0;
            }
            if (i3 != ((i4 + 1) & 15)) {
                fbj0Var.mo120353b();
            }
        } else {
            j = -1;
        }
        if (z) {
            int iM110279H = this.f90336d.m110279H();
            i |= (this.f90336d.m110279H() & 64) != 0 ? 2 : 0;
            this.f90336d.m110293V(iM110279H - 1);
        }
        boolean z2 = this.f90346n;
        if (m115501y(i2)) {
            this.f90336d.m110291T(iM115499v);
            fbj0Var.mo120352a(this.f90336d, i);
            this.f90336d.m110291T(iM110301g);
        }
        if (this.f90333a != 2 && !z2 && this.f90346n && length != j) {
            this.f90348p = true;
        }
        this.f90336d.m110292U(iM115499v);
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m115498u(tqf tqfVar) throws IOException {
        byte[] bArrM110299e = this.f90336d.m110299e();
        if (9400 - this.f90336d.m110300f() < 188) {
            int iM110295a = this.f90336d.m110295a();
            if (iM110295a > 0) {
                System.arraycopy(bArrM110299e, this.f90336d.m110300f(), bArrM110299e, 0, iM110295a);
            }
            this.f90336d.m110290S(bArrM110299e, iM110295a);
        }
        while (this.f90336d.m110295a() < 188) {
            int iM110301g = this.f90336d.m110301g();
            int i = tqfVar.read(bArrM110299e, iM110301g, 9400 - iM110301g);
            if (i == -1) {
                return false;
            }
            this.f90336d.m110291T(iM110301g + i);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final int m115499v() throws ParserException {
        int iM110300f = this.f90336d.m110300f();
        int iM110301g = this.f90336d.m110301g();
        int iM125142a = gbj0.m125142a(this.f90336d.m110299e(), iM110300f, iM110301g);
        this.f90336d.m110292U(iM125142a);
        int i = iM125142a + 188;
        if (i <= iM110301g) {
            this.f90350r = 0;
            return i;
        }
        int i2 = this.f90350r + (iM125142a - iM110300f);
        this.f90350r = i2;
        if (this.f90333a != 2 || i2 <= 376) {
            return i;
        }
        throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    /* JADX INFO: renamed from: x */
    public final void m115500x() {
        this.f90340h.clear();
        this.f90339g.clear();
        SparseArray<fbj0> sparseArrayMo120355a = this.f90338f.mo120355a();
        int size = sparseArrayMo120355a.size();
        int i = 0;
        while (true) {
            SparseArray<fbj0> sparseArray = this.f90339g;
            if (i >= size) {
                sparseArray.put(0, new u6e0(new C16569a()));
                this.f90349q = null;
                return;
            } else {
                sparseArray.put(sparseArrayMo120355a.keyAt(i), sparseArrayMo120355a.valueAt(i));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m115501y(int i) {
        return this.f90333a == 2 || this.f90346n || !this.f90341i.get(i, false);
    }

    @Override // p149l.sqf
    public void release() {
    }

    /* JADX INFO: renamed from: l.ebj0$a */
    public class C16569a implements t6e0 {

        /* JADX INFO: renamed from: a */
        public final c860 f90352a = new c860(new byte[4]);

        public C16569a() {
        }

        @Override // p149l.t6e0
        /* JADX INFO: renamed from: a */
        public void mo115502a(d860 d860Var) {
            if (d860Var.m110279H() == 0 && (d860Var.m110279H() & 128) != 0) {
                d860Var.m110293V(6);
                int iM110295a = d860Var.m110295a() / 4;
                for (int i = 0; i < iM110295a; i++) {
                    d860Var.m110305k(this.f90352a, 4);
                    int iM105664h = this.f90352a.m105664h(16);
                    this.f90352a.m105674r(3);
                    c860 c860Var = this.f90352a;
                    if (iM105664h == 0) {
                        c860Var.m105674r(13);
                    } else {
                        int iM105664h2 = c860Var.m105664h(13);
                        if (ebj0.this.f90339g.get(iM105664h2) == null) {
                            ebj0.this.f90339g.put(iM105664h2, new u6e0(ebj0.this.new C16570b(iM105664h2)));
                            ebj0.m115487k(ebj0.this);
                        }
                    }
                }
                if (ebj0.this.f90333a != 2) {
                    ebj0.this.f90339g.remove(0);
                }
            }
        }

        @Override // p149l.t6e0
        /* JADX INFO: renamed from: c */
        public void mo115503c(eri0 eri0Var, uqf uqfVar, fbj0.C16793d c16793d) {
        }
    }

    /* JADX INFO: renamed from: l.ebj0$b */
    public class C16570b implements t6e0 {

        /* JADX INFO: renamed from: a */
        public final c860 f90354a = new c860(new byte[5]);

        /* JADX INFO: renamed from: b */
        public final SparseArray<fbj0> f90355b = new SparseArray<>();

        /* JADX INFO: renamed from: c */
        public final SparseIntArray f90356c = new SparseIntArray();

        /* JADX INFO: renamed from: d */
        public final int f90357d;

        public C16570b(int i) {
            this.f90357d = i;
        }

        @Override // p149l.t6e0
        /* JADX INFO: renamed from: a */
        public void mo115502a(d860 d860Var) {
            eri0 eri0Var;
            if (d860Var.m110279H() != 2) {
                return;
            }
            if (ebj0.this.f90333a == 1 || ebj0.this.f90333a == 2 || ebj0.this.f90345m == 1) {
                eri0Var = (eri0) ebj0.this.f90335c.get(0);
            } else {
                eri0Var = new eri0(((eri0) ebj0.this.f90335c.get(0)).m117838c());
                ebj0.this.f90335c.add(eri0Var);
            }
            if ((d860Var.m110279H() & 128) == 0) {
                return;
            }
            d860Var.m110293V(1);
            int iM110285N = d860Var.m110285N();
            int i = 3;
            d860Var.m110293V(3);
            d860Var.m110305k(this.f90354a, 2);
            this.f90354a.m105674r(3);
            int i2 = 13;
            ebj0.this.f90351s = this.f90354a.m105664h(13);
            d860Var.m110305k(this.f90354a, 2);
            int i3 = 4;
            this.f90354a.m105674r(4);
            d860Var.m110293V(this.f90354a.m105664h(12));
            if (ebj0.this.f90333a == 2 && ebj0.this.f90349q == null) {
                fbj0.C16791b c16791b = new fbj0.C16791b(21, null, null, vck0.f180953f);
                ebj0 ebj0Var = ebj0.this;
                ebj0Var.f90349q = ebj0Var.f90338f.mo120356b(21, c16791b);
                if (ebj0.this.f90349q != null) {
                    ebj0.this.f90349q.mo120354c(eri0Var, ebj0.this.f90344l, new fbj0.C16793d(iM110285N, 21, 8192));
                }
            }
            this.f90355b.clear();
            this.f90356c.clear();
            int iM110295a = d860Var.m110295a();
            while (iM110295a > 0) {
                d860Var.m110305k(this.f90354a, 5);
                int iM105664h = this.f90354a.m105664h(8);
                this.f90354a.m105674r(i);
                int iM105664h2 = this.f90354a.m105664h(i2);
                this.f90354a.m105674r(i3);
                int iM105664h3 = this.f90354a.m105664h(12);
                fbj0.C16791b c16791bM115504b = m115504b(d860Var, iM105664h3);
                if (iM105664h == 6 || iM105664h == 5) {
                    iM105664h = c16791bM115504b.f96725a;
                }
                iM110295a -= iM105664h3 + 5;
                int i4 = ebj0.this.f90333a == 2 ? iM105664h : iM105664h2;
                if (!ebj0.this.f90340h.get(i4)) {
                    fbj0 fbj0VarMo120356b = (ebj0.this.f90333a == 2 && iM105664h == 21) ? ebj0.this.f90349q : ebj0.this.f90338f.mo120356b(iM105664h, c16791bM115504b);
                    if (ebj0.this.f90333a != 2 || iM105664h2 < this.f90356c.get(i4, 8192)) {
                        this.f90356c.put(i4, iM105664h2);
                        this.f90355b.put(i4, fbj0VarMo120356b);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.f90356c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.f90356c.keyAt(i5);
                int iValueAt = this.f90356c.valueAt(i5);
                ebj0.this.f90340h.put(iKeyAt, true);
                ebj0.this.f90341i.put(iValueAt, true);
                fbj0 fbj0VarValueAt = this.f90355b.valueAt(i5);
                if (fbj0VarValueAt != null) {
                    if (fbj0VarValueAt != ebj0.this.f90349q) {
                        fbj0VarValueAt.mo120354c(eri0Var, ebj0.this.f90344l, new fbj0.C16793d(iM110285N, iKeyAt, 8192));
                    }
                    ebj0.this.f90339g.put(iValueAt, fbj0VarValueAt);
                }
            }
            int i6 = ebj0.this.f90333a;
            ebj0 ebj0Var2 = ebj0.this;
            if (i6 == 2) {
                if (ebj0Var2.f90346n) {
                    return;
                }
                ebj0.this.f90344l.mo11371l();
                ebj0.this.f90345m = 0;
                ebj0.this.f90346n = true;
                return;
            }
            ebj0Var2.f90339g.remove(this.f90357d);
            ebj0 ebj0Var3 = ebj0.this;
            ebj0Var3.f90345m = ebj0Var3.f90333a == 1 ? 0 : ebj0.this.f90345m - 1;
            if (ebj0.this.f90345m == 0) {
                ebj0.this.f90344l.mo11371l();
                ebj0.this.f90346n = true;
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0043  */
        /* JADX WARN: Code duplicated, block: B:24:0x0055  */
        /* JADX WARN: Code duplicated, block: B:27:0x005b  */
        /* JADX INFO: renamed from: b */
        public final fbj0.C16791b m115504b(d860 d860Var, int i) {
            int iM110300f = d860Var.m110300f();
            int i2 = i + iM110300f;
            int i3 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (d860Var.m110300f() < i2) {
                int iM110279H = d860Var.m110279H();
                int iM110300f2 = d860Var.m110300f() + d860Var.m110279H();
                if (iM110300f2 > i2) {
                    break;
                }
                if (iM110279H == 5) {
                    long jM110281J = d860Var.m110281J();
                    if (jM110281J == 1094921523) {
                        i3 = 129;
                    } else if (jM110281J == 1161904947) {
                        i3 = 135;
                    } else if (jM110281J == 1094921524) {
                        i3 = 172;
                    } else if (jM110281J == 1212503619) {
                        i3 = 36;
                    }
                } else if (iM110279H == 106) {
                    i3 = 129;
                } else if (iM110279H == 122) {
                    i3 = 135;
                } else if (iM110279H == 127) {
                    if (d860Var.m110279H() == 21) {
                        i3 = 172;
                    }
                } else if (iM110279H == 123) {
                    i3 = CipherSuite.TLS_PSK_WITH_RC4_128_SHA;
                } else if (iM110279H == 10) {
                    strTrim = d860Var.m110276E(3).trim();
                } else if (iM110279H == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (d860Var.m110300f() < iM110300f2) {
                        String strTrim2 = d860Var.m110276E(3).trim();
                        int iM110279H2 = d860Var.m110279H();
                        byte[] bArr = new byte[4];
                        d860Var.m110306l(bArr, 0, 4);
                        arrayList2.add(new fbj0.C16790a(strTrim2, iM110279H2, bArr));
                    }
                    arrayList = arrayList2;
                    i3 = 89;
                } else if (iM110279H == 111) {
                    i3 = 257;
                }
                d860Var.m110293V(iM110300f2 - d860Var.m110300f());
            }
            d860Var.m110292U(i2);
            return new fbj0.C16791b(i3, strTrim, arrayList, Arrays.copyOfRange(d860Var.m110299e(), iM110300f, i2));
        }

        @Override // p149l.t6e0
        /* JADX INFO: renamed from: c */
        public void mo115503c(eri0 eri0Var, uqf uqfVar, fbj0.C16793d c16793d) {
        }
    }

    public ebj0(int i) {
        this(1, i, 112800);
    }

    public ebj0(int i, int i2, int i3) {
        this(i, new eri0(0L), new xrd(i2), i3);
    }

    public ebj0(int i, eri0 eri0Var, fbj0.InterfaceC16792c interfaceC16792c) {
        this(i, eri0Var, interfaceC16792c, 112800);
    }

    public ebj0() {
        this(0);
    }
}
