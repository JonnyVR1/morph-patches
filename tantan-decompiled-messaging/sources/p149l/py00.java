package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class py00 implements sqf {

    /* JADX INFO: renamed from: u */
    public static final xqf f151754u = new xqf() { // from class: l.ny00
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return py00.m171985c();
        }
    };

    /* JADX INFO: renamed from: v */
    public static final uam.InterfaceC20397a f151755v = new uam.InterfaceC20397a() { // from class: l.oy00
        @Override // p149l.uam.InterfaceC20397a
        /* JADX INFO: renamed from: a */
        public final boolean mo166603a(int i, int i2, int i3, int i4, int i5) {
            return py00.m171986d(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f151756a;

    /* JADX INFO: renamed from: b */
    public final long f151757b;

    /* JADX INFO: renamed from: c */
    public final d860 f151758c;

    /* JADX INFO: renamed from: d */
    public final yy00.C21578a f151759d;

    /* JADX INFO: renamed from: e */
    public final pij f151760e;

    /* JADX INFO: renamed from: f */
    public final vam f151761f;

    /* JADX INFO: renamed from: g */
    public final m6j0 f151762g;

    /* JADX INFO: renamed from: h */
    public uqf f151763h;

    /* JADX INFO: renamed from: i */
    public m6j0 f151764i;

    /* JADX INFO: renamed from: j */
    public m6j0 f151765j;

    /* JADX INFO: renamed from: k */
    public int f151766k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Metadata f151767l;

    /* JADX INFO: renamed from: m */
    public long f151768m;

    /* JADX INFO: renamed from: n */
    public long f151769n;

    /* JADX INFO: renamed from: o */
    public long f151770o;

    /* JADX INFO: renamed from: p */
    public int f151771p;

    /* JADX INFO: renamed from: q */
    public kce0 f151772q;

    /* JADX INFO: renamed from: r */
    public boolean f151773r;

    /* JADX INFO: renamed from: s */
    public boolean f151774s;

    /* JADX INFO: renamed from: t */
    public long f151775t;

    public py00(int i, long j) {
        this.f151756a = (i & 2) != 0 ? i | 1 : i;
        this.f151757b = j;
        this.f151758c = new d860(10);
        this.f151759d = new yy00.C21578a();
        this.f151760e = new pij();
        this.f151768m = -9223372036854775807L;
        this.f151761f = new vam();
        nee neeVar = new nee();
        this.f151762g = neeVar;
        this.f151765j = neeVar;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m171985c() {
        return new sqf[]{new py00()};
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m171986d(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    /* JADX INFO: renamed from: e */
    private void m171987e() {
        p11.m167015i(this.f151764i);
        vck0.m197866j(this.f151763h);
    }

    /* JADX INFO: renamed from: l */
    public static long m171988l(@Nullable Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int iM10533e = metadata.m10533e();
        for (int i = 0; i < iM10533e; i++) {
            Metadata.Entry entryM10532d = metadata.m10532d(i);
            if (entryM10532d instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryM10532d;
                if (textInformationFrame.f7931id.equals("TLEN")) {
                    return vck0.m197806J0(Long.parseLong(textInformationFrame.values.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: m */
    public static int m171989m(d860 d860Var, int i) {
        if (d860Var.m110301g() >= i + 4) {
            d860Var.m110292U(i);
            int iM110311q = d860Var.m110311q();
            if (iM110311q == 1483304551 || iM110311q == 1231971951) {
                return iM110311q;
            }
        }
        if (d860Var.m110301g() < 40) {
            return 0;
        }
        d860Var.m110292U(36);
        return d860Var.m110311q() == 1447187017 ? 1447187017 : 0;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m171990n(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static e500 m171991o(@Nullable Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int iM10533e = metadata.m10533e();
        for (int i = 0; i < iM10533e; i++) {
            Metadata.Entry entryM10532d = metadata.m10532d(i);
            if (entryM10532d instanceof MlltFrame) {
                return e500.m114734a(j, (MlltFrame) entryM10532d, m171988l(metadata));
            }
        }
        return null;
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    /* JADX INFO: renamed from: s */
    private int m171992s(tqf tqfVar) throws IOException {
        if (this.f151771p == 0) {
            tqfVar.mo150657h();
            if (m171998q(tqfVar)) {
                return -1;
            }
            this.f151758c.m110292U(0);
            int iM110311q = this.f151758c.m110311q();
            if (!m171990n(iM110311q, this.f151766k) || yy00.m216506j(iM110311q) == -1) {
                tqfVar.mo150661o(1);
                this.f151766k = 0;
                return 0;
            }
            this.f151759d.m216510a(iM110311q);
            if (this.f151768m == -9223372036854775807L) {
                this.f151768m = this.f151772q.mo99379c(tqfVar.getPosition());
                if (this.f151757b != -9223372036854775807L) {
                    this.f151768m += this.f151757b - this.f151772q.mo99379c(0L);
                }
            }
            yy00.C21578a c21578a = this.f151759d;
            this.f151771p = c21578a.f200701c;
            kce0 kce0Var = this.f151772q;
            if (kce0Var instanceof xrm) {
                xrm xrmVar = (xrm) kce0Var;
                xrmVar.m210703b(m171994i(this.f151769n + ((long) c21578a.f200705g)), tqfVar.getPosition() + ((long) this.f151759d.f200701c));
                if (this.f151774s && xrmVar.m210702a(this.f151775t)) {
                    this.f151774s = false;
                    this.f151765j = this.f151764i;
                }
            }
        }
        int iM153239e = this.f151765j.m153239e(tqfVar, this.f151771p, true);
        if (iM153239e == -1) {
            return -1;
        }
        int i = this.f151771p - iM153239e;
        this.f151771p = i;
        if (i > 0) {
            return 0;
        }
        this.f151765j.mo11109a(m171994i(this.f151769n), 1, this.f151759d.f200701c, 0, null);
        this.f151769n += (long) this.f151759d.f200705g;
        this.f151771p = 0;
        return 0;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        this.f151766k = 0;
        this.f151768m = -9223372036854775807L;
        this.f151769n = 0L;
        this.f151771p = 0;
        this.f151775t = j2;
        kce0 kce0Var = this.f151772q;
        if (!(kce0Var instanceof xrm) || ((xrm) kce0Var).m210702a(j2)) {
            return;
        }
        this.f151774s = true;
        this.f151765j = this.f151762g;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f151763h = uqfVar;
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(0, 1);
        this.f151764i = m6j0VarMo11362b;
        this.f151765j = m6j0VarMo11362b;
        this.f151763h.mo11371l();
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        return m172000t(tqfVar, true);
    }

    /* JADX INFO: renamed from: g */
    public final kce0 m171993g(tqf tqfVar) throws IOException {
        long jM171988l;
        long jMo99380g;
        kce0 kce0VarM171997p = m171997p(tqfVar);
        e500 e500VarM171991o = m171991o(this.f151767l, tqfVar.getPosition());
        if (this.f151773r) {
            return new kce0.C17982a();
        }
        if ((this.f151756a & 4) != 0) {
            if (e500VarM171991o != null) {
                jM171988l = e500VarM171991o.mo98123i();
                jMo99380g = e500VarM171991o.mo99380g();
            } else if (kce0VarM171997p != null) {
                jM171988l = kce0VarM171997p.mo98123i();
                jMo99380g = kce0VarM171997p.mo99380g();
            } else {
                jM171988l = m171988l(this.f151767l);
                jMo99380g = -1;
            }
            kce0VarM171997p = new xrm(jM171988l, tqfVar.getPosition(), jMo99380g);
        } else if (e500VarM171991o != null) {
            kce0VarM171997p = e500VarM171991o;
        } else if (kce0VarM171997p == null) {
            kce0VarM171997p = null;
        }
        if (kce0VarM171997p == null || !(kce0VarM171997p.mo98122e() || (this.f151756a & 1) == 0)) {
            return m171996k(tqfVar, (this.f151756a & 2) != 0);
        }
        return kce0VarM171997p;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws Throwable {
        m171987e();
        int iM171999r = m171999r(tqfVar);
        if (iM171999r == -1 && (this.f151772q instanceof xrm)) {
            long jM171994i = m171994i(this.f151769n);
            if (this.f151772q.mo98123i() != jM171994i) {
                ((xrm) this.f151772q).m210704f(jM171994i);
                this.f151763h.mo11370k(this.f151772q);
            }
        }
        return iM171999r;
    }

    /* JADX INFO: renamed from: i */
    public final long m171994i(long j) {
        return this.f151768m + ((j * 1000000) / ((long) this.f151759d.f200702d));
    }

    /* JADX INFO: renamed from: j */
    public void m171995j() {
        this.f151773r = true;
    }

    /* JADX INFO: renamed from: k */
    public final kce0 m171996k(tqf tqfVar, boolean z) throws IOException {
        tqfVar.mo150655f(this.f151758c.m110299e(), 0, 4);
        this.f151758c.m110292U(0);
        this.f151759d.m216510a(this.f151758c.m110311q());
        return new ax5(tqfVar.getLength(), tqfVar.getPosition(), this.f151759d, z);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final kce0 m171997p(tqf tqfVar) throws IOException {
        d860 d860Var = new d860(this.f151759d.f200701c);
        tqfVar.mo150655f(d860Var.m110299e(), 0, this.f151759d.f200701c);
        yy00.C21578a c21578a = this.f151759d;
        int i = 21;
        if ((c21578a.f200699a & 1) != 0) {
            if (c21578a.f200703e != 1) {
                i = 36;
            }
        } else if (c21578a.f200703e == 1) {
            i = 13;
        }
        int i2 = i;
        int iM171989m = m171989m(d860Var, i2);
        if (iM171989m != 1483304551 && iM171989m != 1231971951) {
            if (iM171989m != 1447187017) {
                tqfVar.mo150657h();
                return null;
            }
            msk0 msk0VarM156150a = msk0.m156150a(tqfVar.getLength(), tqfVar.getPosition(), this.f151759d, d860Var);
            tqfVar.mo150661o(this.f151759d.f200701c);
            return msk0VarM156150a;
        }
        bdq0 bdq0VarM101201a = bdq0.m101201a(tqfVar.getLength(), tqfVar.getPosition(), this.f151759d, d860Var);
        if (bdq0VarM101201a != null && !this.f151760e.m169608a()) {
            tqfVar.mo150657h();
            tqfVar.mo150660m(i2 + CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA);
            tqfVar.mo150655f(this.f151758c.m110299e(), 0, 3);
            this.f151758c.m110292U(0);
            this.f151760e.m169611d(this.f151758c.m110282K());
        }
        tqfVar.mo150661o(this.f151759d.f200701c);
        return (bdq0VarM101201a == null || bdq0VarM101201a.mo98122e() || iM171989m != 1231971951) ? bdq0VarM101201a : m171996k(tqfVar, false);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m171998q(tqf tqfVar) throws IOException {
        kce0 kce0Var = this.f151772q;
        if (kce0Var != null) {
            long jMo99380g = kce0Var.mo99380g();
            if (jMo99380g != -1 && tqfVar.mo150659k() > jMo99380g - 4) {
                return true;
            }
        }
        try {
            return !tqfVar.mo150656g(this.f151758c.m110299e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* JADX INFO: renamed from: r */
    public final int m171999r(tqf tqfVar) throws Throwable {
        if (this.f151766k == 0) {
            try {
                m172000t(tqfVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f151772q == null) {
            kce0 kce0VarM171993g = m171993g(tqfVar);
            this.f151772q = kce0VarM171993g;
            this.f151763h.mo11370k(kce0VarM171993g);
            this.f151765j.mo11110b(new C1871k.b().m10346g0(this.f151759d.f200700b).m10338Y(4096).m10323J(this.f151759d.f200703e).m10347h0(this.f151759d.f200702d).m10329P(this.f151760e.f149573a).m10330Q(this.f151760e.f149574b).m10339Z((this.f151756a & 8) != 0 ? null : this.f151767l).m10320G());
            this.f151770o = tqfVar.getPosition();
        } else if (this.f151770o != 0) {
            long position = tqfVar.getPosition();
            long j = this.f151770o;
            if (position < j) {
                tqfVar.mo150661o((int) (j - position));
            }
        }
        return m171992s(tqfVar);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m172000t(tqf tqfVar, boolean z) throws Throwable {
        int iMo150659k;
        int i;
        int iM216506j;
        int i2 = z ? 32768 : 131072;
        tqfVar.mo150657h();
        if (tqfVar.getPosition() == 0) {
            Metadata metadataM197643a = this.f151761f.m197643a(tqfVar, (this.f151756a & 8) == 0 ? null : f151755v);
            this.f151767l = metadataM197643a;
            if (metadataM197643a != null) {
                this.f151760e.m169610c(metadataM197643a);
            }
            iMo150659k = (int) tqfVar.mo150659k();
            if (!z) {
                tqfVar.mo150661o(iMo150659k);
            }
            i = 0;
        } else {
            iMo150659k = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (m171998q(tqfVar)) {
                if (i3 > 0) {
                    break;
                }
                hg3.m130807a();
                return false;
            }
            this.f151758c.m110292U(0);
            int iM110311q = this.f151758c.m110311q();
            if ((i == 0 || m171990n(iM110311q, i)) && (iM216506j = yy00.m216506j(iM110311q)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.f151759d.m216510a(iM110311q);
                    i = iM110311q;
                }
                tqfVar.mo150660m(iM216506j - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    throw ParserException.createForMalformedContainer("Searched too many bytes.", null);
                }
                if (z) {
                    tqfVar.mo150657h();
                    tqfVar.mo150660m(iMo150659k + i5);
                } else {
                    tqfVar.mo150661o(1);
                }
                i3 = 0;
                i4 = i5;
                i = 0;
            }
        }
        if (z) {
            tqfVar.mo150661o(iMo150659k + i4);
        } else {
            tqfVar.mo150657h();
        }
        this.f151766k = i;
        return true;
    }

    @Override // p149l.sqf
    public void release() {
    }

    public py00(int i) {
        this(i, -9223372036854775807L);
    }

    public py00() {
        this(0);
    }
}
