package p153l;

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
public final class ikj0 implements zrf {

    /* JADX INFO: renamed from: t */
    public static final esf f115401t = new esf() { // from class: l.hkj0
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return ikj0.m140356c();
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f115402a;

    /* JADX INFO: renamed from: b */
    public final int f115403b;

    /* JADX INFO: renamed from: c */
    public final List<h0j0> f115404c;

    /* JADX INFO: renamed from: d */
    public final ig60 f115405d;

    /* JADX INFO: renamed from: e */
    public final SparseIntArray f115406e;

    /* JADX INFO: renamed from: f */
    public final jkj0.InterfaceC17968c f115407f;

    /* JADX INFO: renamed from: g */
    public final SparseArray<jkj0> f115408g;

    /* JADX INFO: renamed from: h */
    public final SparseBooleanArray f115409h;

    /* JADX INFO: renamed from: i */
    public final SparseBooleanArray f115410i;

    /* JADX INFO: renamed from: j */
    public final gkj0 f115411j;

    /* JADX INFO: renamed from: k */
    public fkj0 f115412k;

    /* JADX INFO: renamed from: l */
    public bsf f115413l;

    /* JADX INFO: renamed from: m */
    public int f115414m;

    /* JADX INFO: renamed from: n */
    public boolean f115415n;

    /* JADX INFO: renamed from: o */
    public boolean f115416o;

    /* JADX INFO: renamed from: p */
    public boolean f115417p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public jkj0 f115418q;

    /* JADX INFO: renamed from: r */
    public int f115419r;

    /* JADX INFO: renamed from: s */
    public int f115420s;

    public ikj0(int i, h0j0 h0j0Var, jkj0.InterfaceC17968c interfaceC17968c, int i2) {
        this.f115407f = (jkj0.InterfaceC17968c) w11.m204369e(interfaceC17968c);
        this.f115403b = i2;
        this.f115402a = i;
        if (i == 1 || i == 2) {
            this.f115404c = Collections.singletonList(h0j0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f115404c = arrayList;
            arrayList.add(h0j0Var);
        }
        this.f115405d = new ig60(new byte[9400], 0);
        this.f115409h = new SparseBooleanArray();
        this.f115410i = new SparseBooleanArray();
        this.f115408g = new SparseArray<>();
        this.f115406e = new SparseIntArray();
        this.f115411j = new gkj0(i2);
        this.f115413l = bsf.f78152i0;
        this.f115420s = -1;
        m140375x();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m140356c() {
        return new zrf[]{new ikj0()};
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m140362k(ikj0 ikj0Var) {
        int i = ikj0Var.f115414m;
        ikj0Var.f115414m = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: w */
    private void m140372w(long j) {
        if (this.f115416o) {
            return;
        }
        this.f115416o = true;
        if (this.f115411j.m130578b() == -9223372036854775807L) {
            this.f115413l.mo11424k(new mke0.C18641b(this.f115411j.m130578b()));
            return;
        }
        fkj0 fkj0Var = new fkj0(this.f115411j.m130579c(), this.f115411j.m130578b(), j, this.f115420s, this.f115403b);
        this.f115412k = fkj0Var;
        this.f115413l.mo11424k(fkj0Var.m123129b());
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        fkj0 fkj0Var;
        w11.m204371g(this.f115402a != 2);
        int size = this.f115404c.size();
        for (int i = 0; i < size; i++) {
            h0j0 h0j0Var = this.f115404c.get(i);
            boolean z = h0j0Var.m133177e() == -9223372036854775807L;
            if (!z) {
                long jM133175c = h0j0Var.m133175c();
                z = (jM133175c == -9223372036854775807L || jM133175c == 0 || jM133175c == j2) ? false : true;
            }
            if (z) {
                h0j0Var.m133179h(j2);
            }
        }
        if (j2 != 0 && (fkj0Var = this.f115412k) != null) {
            fkj0Var.m123135h(j2);
        }
        this.f115405d.m139804Q(0);
        this.f115406e.clear();
        for (int i2 = 0; i2 < this.f115408g.size(); i2++) {
            this.f115408g.valueAt(i2).mo145850b();
        }
        this.f115419r = 0;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f115413l = bsfVar;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        byte[] bArrM139815e = this.f115405d.m139815e();
        asfVar.mo99900f(bArrM139815e, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    asfVar.mo99905o(i);
                    return true;
                }
                if (bArrM139815e[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        long j;
        long length = asfVar.getLength();
        if (this.f115415n) {
            if (length != -1 && this.f115402a != 2 && !this.f115411j.m130580d()) {
                return this.f115411j.m130581e(asfVar, ll80Var, this.f115420s);
            }
            m140372w(length);
            if (this.f115417p) {
                this.f115417p = false;
                mo11029a(0L, 0L);
                if (asfVar.getPosition() != 0) {
                    ll80Var.f132534a = 0L;
                    return 1;
                }
            }
            fkj0 fkj0Var = this.f115412k;
            if (fkj0Var != null && fkj0Var.m123131d()) {
                return this.f115412k.m123130c(asfVar, ll80Var);
            }
        }
        if (!m140373u(asfVar)) {
            return -1;
        }
        int iM140374v = m140374v();
        int iM139817g = this.f115405d.m139817g();
        if (iM140374v > iM139817g) {
            return 0;
        }
        int iM139827q = this.f115405d.m139827q();
        if ((8388608 & iM139827q) != 0) {
            this.f115405d.m139808U(iM140374v);
            return 0;
        }
        int i = (4194304 & iM139827q) != 0 ? 1 : 0;
        int i2 = (2096896 & iM139827q) >> 8;
        boolean z = (iM139827q & 32) != 0;
        jkj0 jkj0Var = (iM139827q & 16) != 0 ? this.f115408g.get(i2) : null;
        if (jkj0Var == null) {
            this.f115405d.m139808U(iM140374v);
            return 0;
        }
        if (this.f115402a != 2) {
            int i3 = iM139827q & 15;
            j = -1;
            int i4 = this.f115406e.get(i2, i3 - 1);
            this.f115406e.put(i2, i3);
            if (i4 == i3) {
                this.f115405d.m139808U(iM140374v);
                return 0;
            }
            if (i3 != ((i4 + 1) & 15)) {
                jkj0Var.mo145850b();
            }
        } else {
            j = -1;
        }
        if (z) {
            int iM139795H = this.f115405d.m139795H();
            i |= (this.f115405d.m139795H() & 64) != 0 ? 2 : 0;
            this.f115405d.m139809V(iM139795H - 1);
        }
        boolean z2 = this.f115415n;
        if (m140376y(i2)) {
            this.f115405d.m139807T(iM140374v);
            jkj0Var.mo145849a(this.f115405d, i);
            this.f115405d.m139807T(iM139817g);
        }
        if (this.f115402a != 2 && !z2 && this.f115415n && length != j) {
            this.f115417p = true;
        }
        this.f115405d.m139808U(iM140374v);
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m140373u(asf asfVar) throws IOException {
        byte[] bArrM139815e = this.f115405d.m139815e();
        if (9400 - this.f115405d.m139816f() < 188) {
            int iM139811a = this.f115405d.m139811a();
            if (iM139811a > 0) {
                System.arraycopy(bArrM139815e, this.f115405d.m139816f(), bArrM139815e, 0, iM139811a);
            }
            this.f115405d.m139806S(bArrM139815e, iM139811a);
        }
        while (this.f115405d.m139811a() < 188) {
            int iM139817g = this.f115405d.m139817g();
            int i = asfVar.read(bArrM139815e, iM139817g, 9400 - iM139817g);
            if (i == -1) {
                return false;
            }
            this.f115405d.m139807T(iM139817g + i);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final int m140374v() throws ParserException {
        int iM139816f = this.f115405d.m139816f();
        int iM139817g = this.f115405d.m139817g();
        int iM150105a = kkj0.m150105a(this.f115405d.m139815e(), iM139816f, iM139817g);
        this.f115405d.m139808U(iM150105a);
        int i = iM150105a + 188;
        if (i <= iM139817g) {
            this.f115419r = 0;
            return i;
        }
        int i2 = this.f115419r + (iM150105a - iM139816f);
        this.f115419r = i2;
        if (this.f115402a != 2 || i2 <= 376) {
            return i;
        }
        throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    /* JADX INFO: renamed from: x */
    public final void m140375x() {
        this.f115409h.clear();
        this.f115408g.clear();
        SparseArray<jkj0> sparseArrayMo145852a = this.f115407f.mo145852a();
        int size = sparseArrayMo145852a.size();
        int i = 0;
        while (true) {
            SparseArray<jkj0> sparseArray = this.f115408g;
            if (i >= size) {
                sparseArray.put(0, new zee0(new C17731a()));
                this.f115418q = null;
                return;
            } else {
                sparseArray.put(sparseArrayMo145852a.keyAt(i), sparseArrayMo145852a.valueAt(i));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m140376y(int i) {
        return this.f115402a == 2 || this.f115415n || !this.f115410i.get(i, false);
    }

    @Override // p153l.zrf
    public void release() {
    }

    /* JADX INFO: renamed from: l.ikj0$a */
    public class C17731a implements yee0 {

        /* JADX INFO: renamed from: a */
        public final hg60 f115421a = new hg60(new byte[4]);

        public C17731a() {
        }

        @Override // p153l.yee0
        /* JADX INFO: renamed from: a */
        public void mo140377a(ig60 ig60Var) {
            if (ig60Var.m139795H() == 0 && (ig60Var.m139795H() & 128) != 0) {
                ig60Var.m139809V(6);
                int iM139811a = ig60Var.m139811a() / 4;
                for (int i = 0; i < iM139811a; i++) {
                    ig60Var.m139821k(this.f115421a, 4);
                    int iM134905h = this.f115421a.m134905h(16);
                    this.f115421a.m134915r(3);
                    hg60 hg60Var = this.f115421a;
                    if (iM134905h == 0) {
                        hg60Var.m134915r(13);
                    } else {
                        int iM134905h2 = hg60Var.m134905h(13);
                        if (ikj0.this.f115408g.get(iM134905h2) == null) {
                            ikj0.this.f115408g.put(iM134905h2, new zee0(ikj0.this.new C17732b(iM134905h2)));
                            ikj0.m140362k(ikj0.this);
                        }
                    }
                }
                if (ikj0.this.f115402a != 2) {
                    ikj0.this.f115408g.remove(0);
                }
            }
        }

        @Override // p153l.yee0
        /* JADX INFO: renamed from: c */
        public void mo140378c(h0j0 h0j0Var, bsf bsfVar, jkj0.C17969d c17969d) {
        }
    }

    /* JADX INFO: renamed from: l.ikj0$b */
    public class C17732b implements yee0 {

        /* JADX INFO: renamed from: a */
        public final hg60 f115423a = new hg60(new byte[5]);

        /* JADX INFO: renamed from: b */
        public final SparseArray<jkj0> f115424b = new SparseArray<>();

        /* JADX INFO: renamed from: c */
        public final SparseIntArray f115425c = new SparseIntArray();

        /* JADX INFO: renamed from: d */
        public final int f115426d;

        public C17732b(int i) {
            this.f115426d = i;
        }

        @Override // p153l.yee0
        /* JADX INFO: renamed from: a */
        public void mo140377a(ig60 ig60Var) {
            h0j0 h0j0Var;
            if (ig60Var.m139795H() != 2) {
                return;
            }
            if (ikj0.this.f115402a == 1 || ikj0.this.f115402a == 2 || ikj0.this.f115414m == 1) {
                h0j0Var = (h0j0) ikj0.this.f115404c.get(0);
            } else {
                h0j0Var = new h0j0(((h0j0) ikj0.this.f115404c.get(0)).m133175c());
                ikj0.this.f115404c.add(h0j0Var);
            }
            if ((ig60Var.m139795H() & 128) == 0) {
                return;
            }
            ig60Var.m139809V(1);
            int iM139801N = ig60Var.m139801N();
            int i = 3;
            ig60Var.m139809V(3);
            ig60Var.m139821k(this.f115423a, 2);
            this.f115423a.m134915r(3);
            int i2 = 13;
            ikj0.this.f115420s = this.f115423a.m134905h(13);
            ig60Var.m139821k(this.f115423a, 2);
            int i3 = 4;
            this.f115423a.m134915r(4);
            ig60Var.m139809V(this.f115423a.m134905h(12));
            if (ikj0.this.f115402a == 2 && ikj0.this.f115418q == null) {
                jkj0.C17967b c17967b = new jkj0.C17967b(21, null, null, bmk0.f77318f);
                ikj0 ikj0Var = ikj0.this;
                ikj0Var.f115418q = ikj0Var.f115407f.mo145853b(21, c17967b);
                if (ikj0.this.f115418q != null) {
                    ikj0.this.f115418q.mo145851c(h0j0Var, ikj0.this.f115413l, new jkj0.C17969d(iM139801N, 21, 8192));
                }
            }
            this.f115424b.clear();
            this.f115425c.clear();
            int iM139811a = ig60Var.m139811a();
            while (iM139811a > 0) {
                ig60Var.m139821k(this.f115423a, 5);
                int iM134905h = this.f115423a.m134905h(8);
                this.f115423a.m134915r(i);
                int iM134905h2 = this.f115423a.m134905h(i2);
                this.f115423a.m134915r(i3);
                int iM134905h3 = this.f115423a.m134905h(12);
                jkj0.C17967b c17967bM140379b = m140379b(ig60Var, iM134905h3);
                if (iM134905h == 6 || iM134905h == 5) {
                    iM134905h = c17967bM140379b.f121413a;
                }
                iM139811a -= iM134905h3 + 5;
                int i4 = ikj0.this.f115402a == 2 ? iM134905h : iM134905h2;
                if (!ikj0.this.f115409h.get(i4)) {
                    jkj0 jkj0VarMo145853b = (ikj0.this.f115402a == 2 && iM134905h == 21) ? ikj0.this.f115418q : ikj0.this.f115407f.mo145853b(iM134905h, c17967bM140379b);
                    if (ikj0.this.f115402a != 2 || iM134905h2 < this.f115425c.get(i4, 8192)) {
                        this.f115425c.put(i4, iM134905h2);
                        this.f115424b.put(i4, jkj0VarMo145853b);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.f115425c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.f115425c.keyAt(i5);
                int iValueAt = this.f115425c.valueAt(i5);
                ikj0.this.f115409h.put(iKeyAt, true);
                ikj0.this.f115410i.put(iValueAt, true);
                jkj0 jkj0VarValueAt = this.f115424b.valueAt(i5);
                if (jkj0VarValueAt != null) {
                    if (jkj0VarValueAt != ikj0.this.f115418q) {
                        jkj0VarValueAt.mo145851c(h0j0Var, ikj0.this.f115413l, new jkj0.C17969d(iM139801N, iKeyAt, 8192));
                    }
                    ikj0.this.f115408g.put(iValueAt, jkj0VarValueAt);
                }
            }
            int i6 = ikj0.this.f115402a;
            ikj0 ikj0Var2 = ikj0.this;
            if (i6 == 2) {
                if (ikj0Var2.f115415n) {
                    return;
                }
                ikj0.this.f115413l.mo11425l();
                ikj0.this.f115414m = 0;
                ikj0.this.f115415n = true;
                return;
            }
            ikj0Var2.f115408g.remove(this.f115426d);
            ikj0 ikj0Var3 = ikj0.this;
            ikj0Var3.f115414m = ikj0Var3.f115402a == 1 ? 0 : ikj0.this.f115414m - 1;
            if (ikj0.this.f115414m == 0) {
                ikj0.this.f115413l.mo11425l();
                ikj0.this.f115415n = true;
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0043  */
        /* JADX WARN: Code duplicated, block: B:24:0x0055  */
        /* JADX WARN: Code duplicated, block: B:27:0x005b  */
        /* JADX INFO: renamed from: b */
        public final jkj0.C17967b m140379b(ig60 ig60Var, int i) {
            int iM139816f = ig60Var.m139816f();
            int i2 = i + iM139816f;
            int i3 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (ig60Var.m139816f() < i2) {
                int iM139795H = ig60Var.m139795H();
                int iM139816f2 = ig60Var.m139816f() + ig60Var.m139795H();
                if (iM139816f2 > i2) {
                    break;
                }
                if (iM139795H == 5) {
                    long jM139797J = ig60Var.m139797J();
                    if (jM139797J == 1094921523) {
                        i3 = 129;
                    } else if (jM139797J == 1161904947) {
                        i3 = 135;
                    } else if (jM139797J == 1094921524) {
                        i3 = 172;
                    } else if (jM139797J == 1212503619) {
                        i3 = 36;
                    }
                } else if (iM139795H == 106) {
                    i3 = 129;
                } else if (iM139795H == 122) {
                    i3 = 135;
                } else if (iM139795H == 127) {
                    if (ig60Var.m139795H() == 21) {
                        i3 = 172;
                    }
                } else if (iM139795H == 123) {
                    i3 = CipherSuite.TLS_PSK_WITH_RC4_128_SHA;
                } else if (iM139795H == 10) {
                    strTrim = ig60Var.m139792E(3).trim();
                } else if (iM139795H == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (ig60Var.m139816f() < iM139816f2) {
                        String strTrim2 = ig60Var.m139792E(3).trim();
                        int iM139795H2 = ig60Var.m139795H();
                        byte[] bArr = new byte[4];
                        ig60Var.m139822l(bArr, 0, 4);
                        arrayList2.add(new jkj0.C17966a(strTrim2, iM139795H2, bArr));
                    }
                    arrayList = arrayList2;
                    i3 = 89;
                } else if (iM139795H == 111) {
                    i3 = 257;
                }
                ig60Var.m139809V(iM139816f2 - ig60Var.m139816f());
            }
            ig60Var.m139808U(i2);
            return new jkj0.C17967b(i3, strTrim, arrayList, Arrays.copyOfRange(ig60Var.m139815e(), iM139816f, i2));
        }

        @Override // p153l.yee0
        /* JADX INFO: renamed from: c */
        public void mo140378c(h0j0 h0j0Var, bsf bsfVar, jkj0.C17969d c17969d) {
        }
    }

    public ikj0(int i) {
        this(1, i, 112800);
    }

    public ikj0(int i, int i2, int i3) {
        this(i, new h0j0(0L), new mtd(i2), i3);
    }

    public ikj0(int i, h0j0 h0j0Var, jkj0.InterfaceC17968c interfaceC17968c) {
        this(i, h0j0Var, interfaceC17968c, 112800);
    }

    public ikj0() {
        this(0);
    }
}
