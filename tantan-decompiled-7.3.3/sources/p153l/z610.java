package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
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
public final class z610 implements zrf {

    /* JADX INFO: renamed from: u */
    public static final esf f203100u = new esf() { // from class: l.x610
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return z610.m218756c();
        }
    };

    /* JADX INFO: renamed from: v */
    public static final kdm.InterfaceC18140a f203101v = new kdm.InterfaceC18140a() { // from class: l.y610
        @Override // p153l.kdm.InterfaceC18140a
        /* JADX INFO: renamed from: a */
        public final boolean mo144428a(int i, int i2, int i3, int i4, int i5) {
            return z610.m218757d(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f203102a;

    /* JADX INFO: renamed from: b */
    public final long f203103b;

    /* JADX INFO: renamed from: c */
    public final ig60 f203104c;

    /* JADX INFO: renamed from: d */
    public final i710.C17660a f203105d;

    /* JADX INFO: renamed from: e */
    public final ilj f203106e;

    /* JADX INFO: renamed from: f */
    public final ldm f203107f;

    /* JADX INFO: renamed from: g */
    public final qfj0 f203108g;

    /* JADX INFO: renamed from: h */
    public bsf f203109h;

    /* JADX INFO: renamed from: i */
    public qfj0 f203110i;

    /* JADX INFO: renamed from: j */
    public qfj0 f203111j;

    /* JADX INFO: renamed from: k */
    public int f203112k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Metadata f203113l;

    /* JADX INFO: renamed from: m */
    public long f203114m;

    /* JADX INFO: renamed from: n */
    public long f203115n;

    /* JADX INFO: renamed from: o */
    public long f203116o;

    /* JADX INFO: renamed from: p */
    public int f203117p;

    /* JADX INFO: renamed from: q */
    public pke0 f203118q;

    /* JADX INFO: renamed from: r */
    public boolean f203119r;

    /* JADX INFO: renamed from: s */
    public boolean f203120s;

    /* JADX INFO: renamed from: t */
    public long f203121t;

    public z610(int i, long j) {
        this.f203102a = (i & 2) != 0 ? i | 1 : i;
        this.f203103b = j;
        this.f203104c = new ig60(10);
        this.f203105d = new i710.C17660a();
        this.f203106e = new ilj();
        this.f203114m = -9223372036854775807L;
        this.f203107f = new ldm();
        rfe rfeVar = new rfe();
        this.f203108g = rfeVar;
        this.f203111j = rfeVar;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m218756c() {
        return new zrf[]{new z610()};
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m218757d(int i, int i2, int i3, int i4, int i5) {
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
    private void m218758e() {
        w11.m204373i(this.f203110i);
        bmk0.m105144j(this.f203109h);
    }

    /* JADX INFO: renamed from: l */
    public static long m218759l(@Nullable Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int iM10587e = metadata.m10587e();
        for (int i = 0; i < iM10587e; i++) {
            Metadata.Entry entryM10586d = metadata.m10586d(i);
            if (entryM10586d instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryM10586d;
                if (textInformationFrame.f7968id.equals("TLEN")) {
                    return bmk0.m105084J0(Long.parseLong(textInformationFrame.values.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: m */
    public static int m218760m(ig60 ig60Var, int i) {
        if (ig60Var.m139817g() >= i + 4) {
            ig60Var.m139808U(i);
            int iM139827q = ig60Var.m139827q();
            if (iM139827q == 1483304551 || iM139827q == 1231971951) {
                return iM139827q;
            }
        }
        if (ig60Var.m139817g() < 40) {
            return 0;
        }
        ig60Var.m139808U(36);
        return ig60Var.m139827q() == 1447187017 ? 1447187017 : 0;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m218761n(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static td00 m218762o(@Nullable Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int iM10587e = metadata.m10587e();
        for (int i = 0; i < iM10587e; i++) {
            Metadata.Entry entryM10586d = metadata.m10586d(i);
            if (entryM10586d instanceof MlltFrame) {
                return td00.m190563a(j, (MlltFrame) entryM10586d, m218759l(metadata));
            }
        }
        return null;
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    /* JADX INFO: renamed from: s */
    private int m218763s(asf asfVar) throws IOException {
        if (this.f203117p == 0) {
            asfVar.mo99902h();
            if (m218769q(asfVar)) {
                return -1;
            }
            this.f203104c.m139808U(0);
            int iM139827q = this.f203104c.m139827q();
            if (!m218761n(iM139827q, this.f203112k) || i710.m138910j(iM139827q) == -1) {
                asfVar.mo99905o(1);
                this.f203112k = 0;
                return 0;
            }
            this.f203105d.m138914a(iM139827q);
            if (this.f203114m == -9223372036854775807L) {
                this.f203114m = this.f203118q.mo128052c(asfVar.getPosition());
                if (this.f203103b != -9223372036854775807L) {
                    this.f203114m += this.f203103b - this.f203118q.mo128052c(0L);
                }
            }
            i710.C17660a c17660a = this.f203105d;
            this.f203117p = c17660a.f113228c;
            pke0 pke0Var = this.f203118q;
            if (pke0Var instanceof ztm) {
                ztm ztmVar = (ztm) pke0Var;
                ztmVar.m221565b(m218765i(this.f203115n + ((long) c17660a.f113232g)), asfVar.getPosition() + ((long) this.f203105d.f113228c));
                if (this.f203120s && ztmVar.m221564a(this.f203121t)) {
                    this.f203120s = false;
                    this.f203111j = this.f203110i;
                }
            }
        }
        int iM176371e = this.f203111j.m176371e(asfVar, this.f203117p, true);
        if (iM176371e == -1) {
            return -1;
        }
        int i = this.f203117p - iM176371e;
        this.f203117p = i;
        if (i > 0) {
            return 0;
        }
        this.f203111j.mo11163a(m218765i(this.f203115n), 1, this.f203105d.f113228c, 0, null);
        this.f203115n += (long) this.f203105d.f113232g;
        this.f203117p = 0;
        return 0;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        this.f203112k = 0;
        this.f203114m = -9223372036854775807L;
        this.f203115n = 0L;
        this.f203117p = 0;
        this.f203121t = j2;
        pke0 pke0Var = this.f203118q;
        if (!(pke0Var instanceof ztm) || ((ztm) pke0Var).m221564a(j2)) {
            return;
        }
        this.f203120s = true;
        this.f203111j = this.f203108g;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f203109h = bsfVar;
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(0, 1);
        this.f203110i = qfj0VarMo11416b;
        this.f203111j = qfj0VarMo11416b;
        this.f203109h.mo11425l();
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        return m218771t(asfVar, true);
    }

    /* JADX INFO: renamed from: g */
    public final pke0 m218764g(asf asfVar) throws IOException {
        long jM218759l;
        long jMo128053g;
        pke0 pke0VarM218768p = m218768p(asfVar);
        td00 td00VarM218762o = m218762o(this.f203113l, asfVar.getPosition());
        if (this.f203119r) {
            return new pke0.C19382a();
        }
        if ((this.f203102a & 4) != 0) {
            if (td00VarM218762o != null) {
                jM218759l = td00VarM218762o.mo107793i();
                jMo128053g = td00VarM218762o.mo128053g();
            } else if (pke0VarM218768p != null) {
                jM218759l = pke0VarM218768p.mo107793i();
                jMo128053g = pke0VarM218768p.mo128053g();
            } else {
                jM218759l = m218759l(this.f203113l);
                jMo128053g = -1;
            }
            pke0VarM218768p = new ztm(jM218759l, asfVar.getPosition(), jMo128053g);
        } else if (td00VarM218762o != null) {
            pke0VarM218768p = td00VarM218762o;
        } else if (pke0VarM218768p == null) {
            pke0VarM218768p = null;
        }
        if (pke0VarM218768p == null || !(pke0VarM218768p.mo107792e() || (this.f203102a & 1) == 0)) {
            return m218767k(asfVar, (this.f203102a & 2) != 0);
        }
        return pke0VarM218768p;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws Throwable {
        m218758e();
        int iM218770r = m218770r(asfVar);
        if (iM218770r == -1 && (this.f203118q instanceof ztm)) {
            long jM218765i = m218765i(this.f203115n);
            if (this.f203118q.mo107793i() != jM218765i) {
                ((ztm) this.f203118q).m221566f(jM218765i);
                this.f203109h.mo11424k(this.f203118q);
            }
        }
        return iM218770r;
    }

    /* JADX INFO: renamed from: i */
    public final long m218765i(long j) {
        return this.f203114m + ((j * 1000000) / ((long) this.f203105d.f113229d));
    }

    /* JADX INFO: renamed from: j */
    public void m218766j() {
        this.f203119r = true;
    }

    /* JADX INFO: renamed from: k */
    public final pke0 m218767k(asf asfVar, boolean z) throws IOException {
        asfVar.mo99900f(this.f203104c.m139815e(), 0, 4);
        this.f203104c.m139808U(0);
        this.f203105d.m138914a(this.f203104c.m139827q());
        return new fy5(asfVar.getLength(), asfVar.getPosition(), this.f203105d, z);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final pke0 m218768p(asf asfVar) throws IOException {
        ig60 ig60Var = new ig60(this.f203105d.f113228c);
        asfVar.mo99900f(ig60Var.m139815e(), 0, this.f203105d.f113228c);
        i710.C17660a c17660a = this.f203105d;
        int i = 21;
        if ((c17660a.f113226a & 1) != 0) {
            if (c17660a.f113230e != 1) {
                i = 36;
            }
        } else if (c17660a.f113230e == 1) {
            i = 13;
        }
        int i2 = i;
        int iM218760m = m218760m(ig60Var, i2);
        if (iM218760m != 1483304551 && iM218760m != 1231971951) {
            if (iM218760m != 1447187017) {
                asfVar.mo99902h();
                return null;
            }
            s1l0 s1l0VarM184055a = s1l0.m184055a(asfVar.getLength(), asfVar.getPosition(), this.f203105d, ig60Var);
            asfVar.mo99905o(this.f203105d.f113228c);
            return s1l0VarM184055a;
        }
        gmq0 gmq0VarM130824a = gmq0.m130824a(asfVar.getLength(), asfVar.getPosition(), this.f203105d, ig60Var);
        if (gmq0VarM130824a != null && !this.f203106e.m140628a()) {
            asfVar.mo99902h();
            asfVar.mo99904m(i2 + CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA);
            asfVar.mo99900f(this.f203104c.m139815e(), 0, 3);
            this.f203104c.m139808U(0);
            this.f203106e.m140631d(this.f203104c.m139798K());
        }
        asfVar.mo99905o(this.f203105d.f113228c);
        return (gmq0VarM130824a == null || gmq0VarM130824a.mo107792e() || iM218760m != 1231971951) ? gmq0VarM130824a : m218767k(asfVar, false);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m218769q(asf asfVar) throws IOException {
        pke0 pke0Var = this.f203118q;
        if (pke0Var != null) {
            long jMo128053g = pke0Var.mo128053g();
            if (jMo128053g != -1 && asfVar.mo99903k() > jMo128053g - 4) {
                return true;
            }
        }
        try {
            return !asfVar.mo99901g(this.f203104c.m139815e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* JADX INFO: renamed from: r */
    public final int m218770r(asf asfVar) throws Throwable {
        if (this.f203112k == 0) {
            try {
                m218771t(asfVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f203118q == null) {
            pke0 pke0VarM218764g = m218764g(asfVar);
            this.f203118q = pke0VarM218764g;
            this.f203109h.mo11424k(pke0VarM218764g);
            this.f203111j.mo11164b(new C1894k.b().m10400g0(this.f203105d.f113227b).m10392Y(4096).m10377J(this.f203105d.f113230e).m10401h0(this.f203105d.f113229d).m10383P(this.f203106e.f115580a).m10384Q(this.f203106e.f115581b).m10393Z((this.f203102a & 8) != 0 ? null : this.f203113l).m10374G());
            this.f203116o = asfVar.getPosition();
        } else if (this.f203116o != 0) {
            long position = asfVar.getPosition();
            long j = this.f203116o;
            if (position < j) {
                asfVar.mo99905o((int) (j - position));
            }
        }
        return m218763s(asfVar);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m218771t(asf asfVar, boolean z) throws Throwable {
        int iMo99903k;
        int i;
        int iM138910j;
        int i2 = z ? 32768 : 131072;
        asfVar.mo99902h();
        if (asfVar.getPosition() == 0) {
            Metadata metadataM153782a = this.f203107f.m153782a(asfVar, (this.f203102a & 8) == 0 ? null : f203101v);
            this.f203113l = metadataM153782a;
            if (metadataM153782a != null) {
                this.f203106e.m140630c(metadataM153782a);
            }
            iMo99903k = (int) asfVar.mo99903k();
            if (!z) {
                asfVar.mo99905o(iMo99903k);
            }
            i = 0;
        } else {
            iMo99903k = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (m218769q(asfVar)) {
                if (i3 > 0) {
                    break;
                }
                vg3.m201207a();
                return false;
            }
            this.f203104c.m139808U(0);
            int iM139827q = this.f203104c.m139827q();
            if ((i == 0 || m218761n(iM139827q, i)) && (iM138910j = i710.m138910j(iM139827q)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.f203105d.m138914a(iM139827q);
                    i = iM139827q;
                }
                asfVar.mo99904m(iM138910j - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    throw ParserException.createForMalformedContainer("Searched too many bytes.", null);
                }
                if (z) {
                    asfVar.mo99902h();
                    asfVar.mo99904m(iMo99903k + i5);
                } else {
                    asfVar.mo99905o(1);
                }
                i3 = 0;
                i4 = i5;
                i = 0;
            }
        }
        if (z) {
            asfVar.mo99905o(iMo99903k + i4);
        } else {
            asfVar.mo99902h();
        }
        this.f203112k = i;
        return true;
    }

    @Override // p153l.zrf
    public void release() {
    }

    public z610(int i) {
        this(i, -9223372036854775807L);
    }

    public z610() {
        this(0);
    }
}
