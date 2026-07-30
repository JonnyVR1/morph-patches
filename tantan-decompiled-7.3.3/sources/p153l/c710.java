package p153l;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class c710 implements zrf, mke0 {

    /* JADX INFO: renamed from: y */
    public static final esf f80050y = new esf() { // from class: l.b710
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return c710.m108266k();
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f80051a;

    /* JADX INFO: renamed from: b */
    public final ig60 f80052b;

    /* JADX INFO: renamed from: c */
    public final ig60 f80053c;

    /* JADX INFO: renamed from: d */
    public final ig60 f80054d;

    /* JADX INFO: renamed from: e */
    public final ig60 f80055e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<f31.C16879a> f80056f;

    /* JADX INFO: renamed from: g */
    public final qke0 f80057g;

    /* JADX INFO: renamed from: h */
    public final List<Metadata.Entry> f80058h;

    /* JADX INFO: renamed from: i */
    public int f80059i;

    /* JADX INFO: renamed from: j */
    public int f80060j;

    /* JADX INFO: renamed from: k */
    public long f80061k;

    /* JADX INFO: renamed from: l */
    public int f80062l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public ig60 f80063m;

    /* JADX INFO: renamed from: n */
    public int f80064n;

    /* JADX INFO: renamed from: o */
    public int f80065o;

    /* JADX INFO: renamed from: p */
    public int f80066p;

    /* JADX INFO: renamed from: q */
    public int f80067q;

    /* JADX INFO: renamed from: r */
    public bsf f80068r;

    /* JADX INFO: renamed from: s */
    public C16204a[] f80069s;

    /* JADX INFO: renamed from: t */
    public long[][] f80070t;

    /* JADX INFO: renamed from: u */
    public int f80071u;

    /* JADX INFO: renamed from: v */
    public long f80072v;

    /* JADX INFO: renamed from: w */
    public int f80073w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public MotionPhotoMetadata f80074x;

    /* JADX INFO: renamed from: l.c710$a */
    public static final class C16204a {

        /* JADX INFO: renamed from: a */
        public final yej0 f80075a;

        /* JADX INFO: renamed from: b */
        public final ufj0 f80076b;

        /* JADX INFO: renamed from: c */
        public final qfj0 f80077c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final ckj0 f80078d;

        /* JADX INFO: renamed from: e */
        public int f80079e;

        public C16204a(yej0 yej0Var, ufj0 ufj0Var, qfj0 qfj0Var) {
            this.f80075a = yej0Var;
            this.f80076b = ufj0Var;
            this.f80077c = qfj0Var;
            this.f80078d = "audio/true-hd".equals(yej0Var.f199371f.f7785l) ? new ckj0() : null;
        }
    }

    public c710(int i) {
        this.f80051a = i;
        this.f80059i = (i & 4) != 0 ? 3 : 0;
        this.f80057g = new qke0();
        this.f80058h = new ArrayList();
        this.f80055e = new ig60(16);
        this.f80056f = new ArrayDeque<>();
        this.f80052b = new ig60(jb20.f119084a);
        this.f80053c = new ig60(4);
        this.f80054d = new ig60();
        this.f80064n = -1;
        this.f80068r = bsf.f78152i0;
        this.f80069s = new C16204a[0];
    }

    /* JADX INFO: renamed from: C */
    public static boolean m108263C(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m108264D(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ yej0 m108265j(yej0 yej0Var) {
        return yej0Var;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ zrf[] m108266k() {
        return new zrf[]{new c710()};
    }

    /* JADX INFO: renamed from: l */
    public static int m108267l(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: m */
    public static long[][] m108268m(C16204a[] c16204aArr) {
        long[][] jArr = new long[c16204aArr.length][];
        int[] iArr = new int[c16204aArr.length];
        long[] jArr2 = new long[c16204aArr.length];
        boolean[] zArr = new boolean[c16204aArr.length];
        for (int i = 0; i < c16204aArr.length; i++) {
            jArr[i] = new long[c16204aArr[i].f80076b.f178774b];
            jArr2[i] = c16204aArr[i].f80076b.f178778f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < c16204aArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < c16204aArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            ufj0 ufj0Var = c16204aArr[i3].f80076b;
            j += (long) ufj0Var.f178776d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = ufj0Var.f178778f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* JADX INFO: renamed from: p */
    public static int m108269p(ufj0 ufj0Var, long j) {
        int iM195842a = ufj0Var.m195842a(j);
        return iM195842a == -1 ? ufj0Var.m195843b(j) : iM195842a;
    }

    /* JADX INFO: renamed from: r */
    public static long m108270r(ufj0 ufj0Var, long j, long j2) {
        int iM108269p = m108269p(ufj0Var, j);
        return iM108269p == -1 ? j2 : Math.min(ufj0Var.f178775c[iM108269p], j2);
    }

    /* JADX INFO: renamed from: v */
    public static int m108271v(ig60 ig60Var) {
        ig60Var.m139808U(8);
        int iM108267l = m108267l(ig60Var.m139827q());
        if (iM108267l != 0) {
            return iM108267l;
        }
        ig60Var.m139809V(4);
        while (ig60Var.m139811a() > 0) {
            int iM108267l2 = m108267l(ig60Var.m139827q());
            if (iM108267l2 != 0) {
                return iM108267l2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: A */
    public final int m108272A(asf asfVar, ll80 ll80Var) throws IOException {
        int i;
        long position = asfVar.getPosition();
        if (this.f80064n == -1) {
            int iM108277q = m108277q(position);
            this.f80064n = iM108277q;
            if (iM108277q == -1) {
                return -1;
            }
        }
        C16204a c16204a = this.f80069s[this.f80064n];
        qfj0 qfj0Var = c16204a.f80077c;
        int i2 = c16204a.f80079e;
        ufj0 ufj0Var = c16204a.f80076b;
        long j = ufj0Var.f178775c[i2];
        int i3 = ufj0Var.f178776d[i2];
        ckj0 ckj0Var = c16204a.f80078d;
        long j2 = (j - position) + ((long) this.f80065o);
        if (j2 < 0 || j2 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            ll80Var.f132534a = j;
            return 1;
        }
        if (c16204a.f80075a.f199372g == 1) {
            j2 += 8;
            i3 -= 8;
        }
        asfVar.mo99905o((int) j2);
        yej0 yej0Var = c16204a.f80075a;
        if (yej0Var.f199375j == 0) {
            if ("audio/ac4".equals(yej0Var.f199371f.f7785l)) {
                if (this.f80066p == 0) {
                    C16484d9.m114988a(i3, this.f80054d);
                    qfj0Var.m176370d(this.f80054d, 7);
                    this.f80066p += 7;
                }
                i3 += 7;
            } else if (ckj0Var != null) {
                ckj0Var.m110344d(asfVar);
            }
            while (true) {
                int i4 = this.f80066p;
                if (i4 >= i3) {
                    break;
                }
                int iM176371e = qfj0Var.m176371e(asfVar, i3 - i4, false);
                this.f80065o += iM176371e;
                this.f80066p += iM176371e;
                this.f80067q -= iM176371e;
            }
        } else {
            byte[] bArrM139815e = this.f80053c.m139815e();
            bArrM139815e[0] = 0;
            bArrM139815e[1] = 0;
            bArrM139815e[2] = 0;
            int i5 = c16204a.f80075a.f199375j;
            int i6 = 4 - i5;
            while (this.f80066p < i3) {
                int i7 = this.f80067q;
                if (i7 == 0) {
                    asfVar.readFully(bArrM139815e, i6, i5);
                    this.f80065o += i5;
                    this.f80053c.m139808U(0);
                    int iM139827q = this.f80053c.m139827q();
                    if (iM139827q < 0) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.f80067q = iM139827q;
                    this.f80052b.m139808U(0);
                    qfj0Var.m176370d(this.f80052b, 4);
                    this.f80066p += 4;
                    i3 += i6;
                } else {
                    int iM176371e2 = qfj0Var.m176371e(asfVar, i7, false);
                    this.f80065o += iM176371e2;
                    this.f80066p += iM176371e2;
                    this.f80067q -= iM176371e2;
                }
            }
        }
        int i8 = i3;
        ufj0 ufj0Var2 = c16204a.f80076b;
        long j3 = ufj0Var2.f178778f[i2];
        int i9 = ufj0Var2.f178779g[i2];
        if (ckj0Var != null) {
            i = 0;
            ckj0Var.m110343c(qfj0Var, j3, i9, i8, 0, null);
            if (i2 + 1 == c16204a.f80076b.f178774b) {
                ckj0Var.m110341a(qfj0Var, null);
            }
        } else {
            i = 0;
            qfj0Var.mo11163a(j3, i9, i8, 0, null);
        }
        c16204a.f80079e++;
        this.f80064n = -1;
        this.f80065o = i;
        this.f80066p = i;
        this.f80067q = i;
        return i;
    }

    /* JADX INFO: renamed from: B */
    public final int m108273B(asf asfVar, ll80 ll80Var) throws IOException {
        int iM176946c = this.f80057g.m176946c(asfVar, ll80Var, this.f80058h);
        if (iM176946c == 1 && ll80Var.f132534a == 0) {
            m108275n();
        }
        return iM176946c;
    }

    /* JADX INFO: renamed from: E */
    public final void m108274E(C16204a c16204a, long j) {
        ufj0 ufj0Var = c16204a.f80076b;
        int iM195842a = ufj0Var.m195842a(j);
        if (iM195842a == -1) {
            iM195842a = ufj0Var.m195843b(j);
        }
        c16204a.f80079e = iM195842a;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        this.f80056f.clear();
        this.f80062l = 0;
        this.f80064n = -1;
        this.f80065o = 0;
        this.f80066p = 0;
        this.f80067q = 0;
        if (j == 0) {
            if (this.f80059i != 3) {
                m108275n();
                return;
            } else {
                this.f80057g.m176949g();
                this.f80058h.clear();
                return;
            }
        }
        for (C16204a c16204a : this.f80069s) {
            m108274E(c16204a, j2);
            ckj0 ckj0Var = c16204a.f80078d;
            if (ckj0Var != null) {
                ckj0Var.m110342b();
            }
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f80068r = bsfVar;
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: d */
    public mke0.C18640a mo107791d(long j) {
        return m108276o(j, -1);
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: e */
    public boolean mo107792e() {
        return true;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        return wsf0.m207768d(asfVar, (this.f80051a & 2) != 0);
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        while (true) {
            int i = this.f80059i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m108272A(asfVar, ll80Var);
                    }
                    if (i == 3) {
                        return m108273B(asfVar, ll80Var);
                    }
                    wpg0.m207458a();
                    return 0;
                }
                if (m108284z(asfVar, ll80Var)) {
                    return 1;
                }
            } else if (!m108283y(asfVar)) {
                return -1;
            }
        }
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: i */
    public long mo107793i() {
        return this.f80072v;
    }

    /* JADX INFO: renamed from: n */
    public final void m108275n() {
        this.f80059i = 0;
        this.f80062l = 0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080 A[EDGE_INSN: B:43:0x0080->B:37:0x0080 BREAK  A[LOOP:0: B:28:0x0063->B:36:0x007d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007d A[SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public mke0.C18640a m108276o(long j, int i) {
        long j2;
        long j3;
        long jM108270r;
        long j4;
        int i2;
        C16204a[] c16204aArr;
        ufj0 ufj0Var;
        int iM195843b;
        C16204a[] c16204aArr2 = this.f80069s;
        if (c16204aArr2.length == 0) {
            return new mke0.C18640a(oke0.f147750c);
        }
        int i3 = i != -1 ? i : this.f80071u;
        if (i3 != -1) {
            ufj0 ufj0Var2 = c16204aArr2[i3].f80076b;
            int iM108269p = m108269p(ufj0Var2, j);
            if (iM108269p == -1) {
                return new mke0.C18640a(oke0.f147750c);
            }
            j3 = ufj0Var2.f178778f[iM108269p];
            j2 = ufj0Var2.f178775c[iM108269p];
            if (j3 < j && iM108269p < ufj0Var2.f178774b - 1 && (iM195843b = ufj0Var2.m195843b(j)) != -1 && iM195843b != iM108269p) {
                j4 = ufj0Var2.f178778f[iM195843b];
                jM108270r = ufj0Var2.f178775c[iM195843b];
            }
            if (i == -1) {
                i2 = 0;
                while (true) {
                    c16204aArr = this.f80069s;
                    if (i2 < c16204aArr.length) {
                        break;
                    }
                    if (i2 != this.f80071u) {
                        ufj0Var = c16204aArr[i2].f80076b;
                        long jM108270r2 = m108270r(ufj0Var, j3, j2);
                        if (j4 != -9223372036854775807L) {
                            jM108270r = m108270r(ufj0Var, j4, jM108270r);
                        }
                        j2 = jM108270r2;
                    }
                    i2++;
                }
            }
            oke0 oke0Var = new oke0(j3, j2);
            return j4 == -9223372036854775807L ? new mke0.C18640a(oke0Var) : new mke0.C18640a(oke0Var, new oke0(j4, jM108270r));
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        jM108270r = -1;
        j4 = -9223372036854775807L;
        if (i == -1) {
            i2 = 0;
            while (true) {
                c16204aArr = this.f80069s;
                if (i2 < c16204aArr.length) {
                    break;
                    break;
                }
                if (i2 != this.f80071u) {
                    ufj0Var = c16204aArr[i2].f80076b;
                    long jM108270r3 = m108270r(ufj0Var, j3, j2);
                    if (j4 != -9223372036854775807L) {
                        jM108270r = m108270r(ufj0Var, j4, jM108270r);
                    }
                    j2 = jM108270r3;
                }
                i2++;
            }
        }
        oke0 oke0Var2 = new oke0(j3, j2);
        if (j4 == -9223372036854775807L) {
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m108277q(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            C16204a[] c16204aArr = this.f80069s;
            if (i3 >= c16204aArr.length) {
                break;
            }
            C16204a c16204a = c16204aArr[i3];
            int i4 = c16204a.f80079e;
            ufj0 ufj0Var = c16204a.f80076b;
            if (i4 != ufj0Var.f178774b) {
                long j5 = ufj0Var.f178775c[i4];
                long j6 = ((long[][]) bmk0.m105144j(this.f80070t))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j3 = j6;
                    i2 = i3;
                    j4 = j7;
                }
                if (j6 < j2) {
                    z = z3;
                    j2 = j6;
                    i = i3;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    /* JADX INFO: renamed from: s */
    public final void m108278s(asf asfVar) throws IOException {
        this.f80054d.m139804Q(8);
        asfVar.mo99900f(this.f80054d.m139815e(), 0, 8);
        g31.m128679f(this.f80054d);
        asfVar.mo99905o(this.f80054d.m139816f());
        asfVar.mo99902h();
    }

    /* JADX INFO: renamed from: t */
    public final void m108279t(long j) throws ParserException {
        while (!this.f80056f.isEmpty() && this.f80056f.peek().f96941b == j) {
            f31.C16879a c16879aPop = this.f80056f.pop();
            if (c16879aPop.f96940a == 1836019574) {
                m108281w(c16879aPop);
                this.f80056f.clear();
                this.f80059i = 2;
            } else if (!this.f80056f.isEmpty()) {
                this.f80056f.peek().m123700d(c16879aPop);
            }
        }
        if (this.f80059i != 2) {
            m108275n();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m108280u() {
        if (this.f80073w != 2 || (this.f80051a & 2) == 0) {
            return;
        }
        this.f80068r.mo11416b(0, 4).mo11164b(new C1894k.b().m10393Z(this.f80074x == null ? null : new Metadata(this.f80074x)).m10374G());
        this.f80068r.mo11425l();
        this.f80068r.mo11424k(new mke0.C18641b(-9223372036854775807L));
    }

    /* JADX INFO: renamed from: w */
    public final void m108281w(f31.C16879a c16879a) throws ParserException {
        Metadata metadata;
        Metadata metadata2;
        Metadata metadata3;
        long jMax;
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = this.f80073w == 1;
        ilj iljVar = new ilj();
        f31.C16880b c16880bM123703g = c16879a.m123703g(1969517665);
        if (c16880bM123703g != null) {
            g31.C17124i c17124iM128670C = g31.m128670C(c16880bM123703g);
            Metadata metadata4 = c17124iM128670C.f101938a;
            Metadata metadata5 = c17124iM128670C.f101939b;
            Metadata metadata6 = c17124iM128670C.f101940c;
            if (metadata4 != null) {
                iljVar.m140630c(metadata4);
            }
            metadata = metadata6;
            metadata2 = metadata4;
            metadata3 = metadata5;
        } else {
            metadata = null;
            metadata2 = null;
            metadata3 = null;
        }
        f31.C16879a c16879aM123702f = c16879a.m123702f(1835365473);
        Metadata metadataM128688o = c16879aM123702f != null ? g31.m128688o(c16879aM123702f) : null;
        Metadata metadata7 = g31.m128690q(((f31.C16880b) w11.m204369e(c16879a.m123703g(1836476516))).f96944b).f101921a;
        Metadata metadata8 = metadataM128688o;
        List<ufj0> listM128669B = g31.m128669B(c16879a, iljVar, -9223372036854775807L, null, (this.f80051a & 1) != 0, z2, new adj() { // from class: l.a710
            @Override // p153l.adj
            public final Object apply(Object obj) {
                return c710.m108265j((yej0) obj);
            }
        });
        int size = listM128669B.size();
        long j = -9223372036854775807L;
        int i = 0;
        int size2 = -1;
        while (i < size) {
            ufj0 ufj0Var = listM128669B.get(i);
            if (ufj0Var.f178774b == 0) {
                jMax = j;
                z = true;
            } else {
                yej0 yej0Var = ufj0Var.f178773a;
                int i2 = size2;
                ArrayList arrayList2 = arrayList;
                long j2 = yej0Var.f199370e;
                if (j2 == -9223372036854775807L) {
                    j2 = ufj0Var.f178780h;
                }
                jMax = Math.max(j, j2);
                C16204a c16204a = new C16204a(yej0Var, ufj0Var, this.f80068r.mo11416b(i, yej0Var.f199367b));
                boolean zEquals = "audio/true-hd".equals(yej0Var.f199371f.f7785l);
                int i3 = ufj0Var.f178777e;
                int i4 = zEquals ? i3 * 16 : i3 + 30;
                C1894k.b bVarM10336b = yej0Var.f199371f.m10336b();
                bVarM10336b.m10392Y(i4);
                if (yej0Var.f199367b != 2 || j2 <= 0) {
                    z = true;
                } else {
                    int i5 = ufj0Var.f178774b;
                    z = true;
                    if (i5 > 1) {
                        bVarM10336b.m10385R(i5 / (j2 / 1000000.0f));
                    }
                }
                ka00.m148916k(yej0Var.f199367b, iljVar, bVarM10336b);
                ka00.m148917l(yej0Var.f199367b, metadata2, metadata8, bVarM10336b, metadata3, this.f80058h.isEmpty() ? null : new Metadata(this.f80058h), metadata, metadata7);
                c16204a.f80077c.mo11164b(bVarM10336b.m10374G());
                size2 = (yej0Var.f199367b == 2 && i2 == -1) ? arrayList2.size() : i2;
                arrayList = arrayList2;
                arrayList.add(c16204a);
            }
            i++;
            listM128669B = listM128669B;
            size = size;
            j = jMax;
        }
        this.f80071u = size2;
        this.f80072v = j;
        C16204a[] c16204aArr = (C16204a[]) arrayList.toArray(new C16204a[0]);
        this.f80069s = c16204aArr;
        this.f80070t = m108268m(c16204aArr);
        this.f80068r.mo11425l();
        this.f80068r.mo11424k(this);
    }

    /* JADX INFO: renamed from: x */
    public final void m108282x(long j) {
        if (this.f80060j == 1836086884) {
            int i = this.f80062l;
            this.f80074x = new MotionPhotoMetadata(0L, j, -9223372036854775807L, j + ((long) i), this.f80061k - ((long) i));
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m108283y(asf asfVar) throws IOException {
        f31.C16879a c16879aPeek;
        if (this.f80062l == 0) {
            if (!asfVar.mo99898b(this.f80055e.m139815e(), 0, 8, true)) {
                m108280u();
                return false;
            }
            this.f80062l = 8;
            this.f80055e.m139808U(0);
            this.f80061k = this.f80055e.m139797J();
            this.f80060j = this.f80055e.m139827q();
        }
        long j = this.f80061k;
        if (j == 1) {
            asfVar.readFully(this.f80055e.m139815e(), 8, 8);
            this.f80062l += 8;
            this.f80061k = this.f80055e.m139800M();
        } else if (j == 0) {
            long length = asfVar.getLength();
            if (length == -1 && (c16879aPeek = this.f80056f.peek()) != null) {
                length = c16879aPeek.f96941b;
            }
            if (length != -1) {
                this.f80061k = (length - asfVar.getPosition()) + ((long) this.f80062l);
            }
        }
        if (this.f80061k < this.f80062l) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (m108263C(this.f80060j)) {
            long position = asfVar.getPosition();
            long j2 = this.f80061k;
            int i = this.f80062l;
            long j3 = (position + j2) - ((long) i);
            if (j2 != i && this.f80060j == 1835365473) {
                m108278s(asfVar);
            }
            this.f80056f.push(new f31.C16879a(this.f80060j, j3));
            if (this.f80061k == this.f80062l) {
                m108279t(j3);
            } else {
                m108275n();
            }
        } else if (m108264D(this.f80060j)) {
            w11.m204371g(this.f80062l == 8);
            w11.m204371g(this.f80061k <= 2147483647L);
            ig60 ig60Var = new ig60((int) this.f80061k);
            System.arraycopy(this.f80055e.m139815e(), 0, ig60Var.m139815e(), 0, 8);
            this.f80063m = ig60Var;
            this.f80059i = 1;
        } else {
            m108282x(asfVar.getPosition() - ((long) this.f80062l));
            this.f80063m = null;
            this.f80059i = 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m108284z(asf asfVar, ll80 ll80Var) throws IOException {
        boolean z;
        long j = this.f80061k - ((long) this.f80062l);
        long position = asfVar.getPosition() + j;
        ig60 ig60Var = this.f80063m;
        if (ig60Var == null) {
            if (j < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                asfVar.mo99905o((int) j);
            } else {
                ll80Var.f132534a = asfVar.getPosition() + j;
                z = true;
            }
            m108279t(position);
            return (z || this.f80059i == 2) ? false : true;
        }
        asfVar.readFully(ig60Var.m139815e(), this.f80062l, (int) j);
        if (this.f80060j == 1718909296) {
            this.f80073w = m108271v(ig60Var);
        } else if (!this.f80056f.isEmpty()) {
            this.f80056f.peek().m123701e(new f31.C16880b(this.f80060j, ig60Var));
        }
        z = false;
        m108279t(position);
        if (z) {
        }
    }

    @Override // p153l.zrf
    public void release() {
    }

    public c710() {
        this(0);
    }
}
