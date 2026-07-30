package p149l;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class sy00 implements sqf, hce0 {

    /* JADX INFO: renamed from: y */
    public static final xqf f166851y = new xqf() { // from class: l.ry00
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return sy00.m186569k();
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f166852a;

    /* JADX INFO: renamed from: b */
    public final d860 f166853b;

    /* JADX INFO: renamed from: c */
    public final d860 f166854c;

    /* JADX INFO: renamed from: d */
    public final d860 f166855d;

    /* JADX INFO: renamed from: e */
    public final d860 f166856e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<y21.C21284a> f166857f;

    /* JADX INFO: renamed from: g */
    public final lce0 f166858g;

    /* JADX INFO: renamed from: h */
    public final List<Metadata.Entry> f166859h;

    /* JADX INFO: renamed from: i */
    public int f166860i;

    /* JADX INFO: renamed from: j */
    public int f166861j;

    /* JADX INFO: renamed from: k */
    public long f166862k;

    /* JADX INFO: renamed from: l */
    public int f166863l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public d860 f166864m;

    /* JADX INFO: renamed from: n */
    public int f166865n;

    /* JADX INFO: renamed from: o */
    public int f166866o;

    /* JADX INFO: renamed from: p */
    public int f166867p;

    /* JADX INFO: renamed from: q */
    public int f166868q;

    /* JADX INFO: renamed from: r */
    public uqf f166869r;

    /* JADX INFO: renamed from: s */
    public C20070a[] f166870s;

    /* JADX INFO: renamed from: t */
    public long[][] f166871t;

    /* JADX INFO: renamed from: u */
    public int f166872u;

    /* JADX INFO: renamed from: v */
    public long f166873v;

    /* JADX INFO: renamed from: w */
    public int f166874w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public MotionPhotoMetadata f166875x;

    /* JADX INFO: renamed from: l.sy00$a */
    public static final class C20070a {

        /* JADX INFO: renamed from: a */
        public final u5j0 f166876a;

        /* JADX INFO: renamed from: b */
        public final q6j0 f166877b;

        /* JADX INFO: renamed from: c */
        public final m6j0 f166878c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final yaj0 f166879d;

        /* JADX INFO: renamed from: e */
        public int f166880e;

        public C20070a(u5j0 u5j0Var, q6j0 q6j0Var, m6j0 m6j0Var) {
            this.f166876a = u5j0Var;
            this.f166877b = q6j0Var;
            this.f166878c = m6j0Var;
            this.f166879d = "audio/true-hd".equals(u5j0Var.f174724f.f7748l) ? new yaj0() : null;
        }
    }

    public sy00(int i) {
        this.f166852a = i;
        this.f166860i = (i & 4) != 0 ? 3 : 0;
        this.f166858g = new lce0();
        this.f166859h = new ArrayList();
        this.f166856e = new d860(16);
        this.f166857f = new ArrayDeque<>();
        this.f166853b = new d860(b320.f72762a);
        this.f166854c = new d860(4);
        this.f166855d = new d860();
        this.f166865n = -1;
        this.f166869r = uqf.f177745i0;
        this.f166870s = new C20070a[0];
    }

    /* JADX INFO: renamed from: C */
    public static boolean m186566C(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m186567D(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ u5j0 m186568j(u5j0 u5j0Var) {
        return u5j0Var;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ sqf[] m186569k() {
        return new sqf[]{new sy00()};
    }

    /* JADX INFO: renamed from: l */
    public static int m186570l(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: m */
    public static long[][] m186571m(C20070a[] c20070aArr) {
        long[][] jArr = new long[c20070aArr.length][];
        int[] iArr = new int[c20070aArr.length];
        long[] jArr2 = new long[c20070aArr.length];
        boolean[] zArr = new boolean[c20070aArr.length];
        for (int i = 0; i < c20070aArr.length; i++) {
            jArr[i] = new long[c20070aArr[i].f166877b.f152912b];
            jArr2[i] = c20070aArr[i].f166877b.f152916f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < c20070aArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < c20070aArr.length; i4++) {
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
            q6j0 q6j0Var = c20070aArr[i3].f166877b;
            j += (long) q6j0Var.f152914d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = q6j0Var.f152916f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* JADX INFO: renamed from: p */
    public static int m186572p(q6j0 q6j0Var, long j) {
        int iM173145a = q6j0Var.m173145a(j);
        return iM173145a == -1 ? q6j0Var.m173146b(j) : iM173145a;
    }

    /* JADX INFO: renamed from: r */
    public static long m186573r(q6j0 q6j0Var, long j, long j2) {
        int iM186572p = m186572p(q6j0Var, j);
        return iM186572p == -1 ? j2 : Math.min(q6j0Var.f152913c[iM186572p], j2);
    }

    /* JADX INFO: renamed from: v */
    public static int m186574v(d860 d860Var) {
        d860Var.m110292U(8);
        int iM186570l = m186570l(d860Var.m110311q());
        if (iM186570l != 0) {
            return iM186570l;
        }
        d860Var.m110293V(4);
        while (d860Var.m110295a() > 0) {
            int iM186570l2 = m186570l(d860Var.m110311q());
            if (iM186570l2 != 0) {
                return iM186570l2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: A */
    public final int m186575A(tqf tqfVar, fd80 fd80Var) throws IOException {
        int i;
        long position = tqfVar.getPosition();
        if (this.f166865n == -1) {
            int iM186580q = m186580q(position);
            this.f166865n = iM186580q;
            if (iM186580q == -1) {
                return -1;
            }
        }
        C20070a c20070a = this.f166870s[this.f166865n];
        m6j0 m6j0Var = c20070a.f166878c;
        int i2 = c20070a.f166880e;
        q6j0 q6j0Var = c20070a.f166877b;
        long j = q6j0Var.f152913c[i2];
        int i3 = q6j0Var.f152914d[i2];
        yaj0 yaj0Var = c20070a.f166879d;
        long j2 = (j - position) + ((long) this.f166866o);
        if (j2 < 0 || j2 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            fd80Var.f97018a = j;
            return 1;
        }
        if (c20070a.f166876a.f174725g == 1) {
            j2 += 8;
            i3 -= 8;
        }
        tqfVar.mo150661o((int) j2);
        u5j0 u5j0Var = c20070a.f166876a;
        if (u5j0Var.f174728j == 0) {
            if ("audio/ac4".equals(u5j0Var.f174724f.f7748l)) {
                if (this.f166867p == 0) {
                    C17507i9.m134993a(i3, this.f166855d);
                    m6j0Var.m153238d(this.f166855d, 7);
                    this.f166867p += 7;
                }
                i3 += 7;
            } else if (yaj0Var != null) {
                yaj0Var.m213855d(tqfVar);
            }
            while (true) {
                int i4 = this.f166867p;
                if (i4 >= i3) {
                    break;
                }
                int iM153239e = m6j0Var.m153239e(tqfVar, i3 - i4, false);
                this.f166866o += iM153239e;
                this.f166867p += iM153239e;
                this.f166868q -= iM153239e;
            }
        } else {
            byte[] bArrM110299e = this.f166854c.m110299e();
            bArrM110299e[0] = 0;
            bArrM110299e[1] = 0;
            bArrM110299e[2] = 0;
            int i5 = c20070a.f166876a.f174728j;
            int i6 = 4 - i5;
            while (this.f166867p < i3) {
                int i7 = this.f166868q;
                if (i7 == 0) {
                    tqfVar.readFully(bArrM110299e, i6, i5);
                    this.f166866o += i5;
                    this.f166854c.m110292U(0);
                    int iM110311q = this.f166854c.m110311q();
                    if (iM110311q < 0) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.f166868q = iM110311q;
                    this.f166853b.m110292U(0);
                    m6j0Var.m153238d(this.f166853b, 4);
                    this.f166867p += 4;
                    i3 += i6;
                } else {
                    int iM153239e2 = m6j0Var.m153239e(tqfVar, i7, false);
                    this.f166866o += iM153239e2;
                    this.f166867p += iM153239e2;
                    this.f166868q -= iM153239e2;
                }
            }
        }
        int i8 = i3;
        q6j0 q6j0Var2 = c20070a.f166877b;
        long j3 = q6j0Var2.f152916f[i2];
        int i9 = q6j0Var2.f152917g[i2];
        if (yaj0Var != null) {
            i = 0;
            yaj0Var.m213854c(m6j0Var, j3, i9, i8, 0, null);
            if (i2 + 1 == c20070a.f166877b.f152912b) {
                yaj0Var.m213852a(m6j0Var, null);
            }
        } else {
            i = 0;
            m6j0Var.mo11109a(j3, i9, i8, 0, null);
        }
        c20070a.f166880e++;
        this.f166865n = -1;
        this.f166866o = i;
        this.f166867p = i;
        this.f166868q = i;
        return i;
    }

    /* JADX INFO: renamed from: B */
    public final int m186576B(tqf tqfVar, fd80 fd80Var) throws IOException {
        int iM149290c = this.f166858g.m149290c(tqfVar, fd80Var, this.f166859h);
        if (iM149290c == 1 && fd80Var.f97018a == 0) {
            m186578n();
        }
        return iM149290c;
    }

    /* JADX INFO: renamed from: E */
    public final void m186577E(C20070a c20070a, long j) {
        q6j0 q6j0Var = c20070a.f166877b;
        int iM173145a = q6j0Var.m173145a(j);
        if (iM173145a == -1) {
            iM173145a = q6j0Var.m173146b(j);
        }
        c20070a.f166880e = iM173145a;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        this.f166857f.clear();
        this.f166863l = 0;
        this.f166865n = -1;
        this.f166866o = 0;
        this.f166867p = 0;
        this.f166868q = 0;
        if (j == 0) {
            if (this.f166860i != 3) {
                m186578n();
                return;
            } else {
                this.f166858g.m149293g();
                this.f166859h.clear();
                return;
            }
        }
        for (C20070a c20070a : this.f166870s) {
            m186577E(c20070a, j2);
            yaj0 yaj0Var = c20070a.f166879d;
            if (yaj0Var != null) {
                yaj0Var.m213853b();
            }
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f166869r = uqfVar;
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: d */
    public hce0.C17274a mo98121d(long j) {
        return m186579o(j, -1);
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: e */
    public boolean mo98122e() {
        return true;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        return nkf0.m159839d(tqfVar, (this.f166852a & 2) != 0);
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        while (true) {
            int i = this.f166860i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m186575A(tqfVar, fd80Var);
                    }
                    if (i == 3) {
                        return m186576B(tqfVar, fd80Var);
                    }
                    ohg0.m164364a();
                    return 0;
                }
                if (m186587z(tqfVar, fd80Var)) {
                    return 1;
                }
            } else if (!m186586y(tqfVar)) {
                return -1;
            }
        }
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: i */
    public long mo98123i() {
        return this.f166873v;
    }

    /* JADX INFO: renamed from: n */
    public final void m186578n() {
        this.f166860i = 0;
        this.f166863l = 0;
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
    public hce0.C17274a m186579o(long j, int i) {
        long j2;
        long j3;
        long jM186573r;
        long j4;
        int i2;
        C20070a[] c20070aArr;
        q6j0 q6j0Var;
        int iM173146b;
        C20070a[] c20070aArr2 = this.f166870s;
        if (c20070aArr2.length == 0) {
            return new hce0.C17274a(jce0.f117294c);
        }
        int i3 = i != -1 ? i : this.f166872u;
        if (i3 != -1) {
            q6j0 q6j0Var2 = c20070aArr2[i3].f166877b;
            int iM186572p = m186572p(q6j0Var2, j);
            if (iM186572p == -1) {
                return new hce0.C17274a(jce0.f117294c);
            }
            j3 = q6j0Var2.f152916f[iM186572p];
            j2 = q6j0Var2.f152913c[iM186572p];
            if (j3 < j && iM186572p < q6j0Var2.f152912b - 1 && (iM173146b = q6j0Var2.m173146b(j)) != -1 && iM173146b != iM186572p) {
                j4 = q6j0Var2.f152916f[iM173146b];
                jM186573r = q6j0Var2.f152913c[iM173146b];
            }
            if (i == -1) {
                i2 = 0;
                while (true) {
                    c20070aArr = this.f166870s;
                    if (i2 < c20070aArr.length) {
                        break;
                    }
                    if (i2 != this.f166872u) {
                        q6j0Var = c20070aArr[i2].f166877b;
                        long jM186573r2 = m186573r(q6j0Var, j3, j2);
                        if (j4 != -9223372036854775807L) {
                            jM186573r = m186573r(q6j0Var, j4, jM186573r);
                        }
                        j2 = jM186573r2;
                    }
                    i2++;
                }
            }
            jce0 jce0Var = new jce0(j3, j2);
            return j4 == -9223372036854775807L ? new hce0.C17274a(jce0Var) : new hce0.C17274a(jce0Var, new jce0(j4, jM186573r));
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        jM186573r = -1;
        j4 = -9223372036854775807L;
        if (i == -1) {
            i2 = 0;
            while (true) {
                c20070aArr = this.f166870s;
                if (i2 < c20070aArr.length) {
                    break;
                    break;
                }
                if (i2 != this.f166872u) {
                    q6j0Var = c20070aArr[i2].f166877b;
                    long jM186573r3 = m186573r(q6j0Var, j3, j2);
                    if (j4 != -9223372036854775807L) {
                        jM186573r = m186573r(q6j0Var, j4, jM186573r);
                    }
                    j2 = jM186573r3;
                }
                i2++;
            }
        }
        jce0 jce0Var2 = new jce0(j3, j2);
        if (j4 == -9223372036854775807L) {
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m186580q(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            C20070a[] c20070aArr = this.f166870s;
            if (i3 >= c20070aArr.length) {
                break;
            }
            C20070a c20070a = c20070aArr[i3];
            int i4 = c20070a.f166880e;
            q6j0 q6j0Var = c20070a.f166877b;
            if (i4 != q6j0Var.f152912b) {
                long j5 = q6j0Var.f152913c[i4];
                long j6 = ((long[][]) vck0.m197866j(this.f166871t))[i3][i4];
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
    public final void m186581s(tqf tqfVar) throws IOException {
        this.f166855d.m110288Q(8);
        tqfVar.mo150655f(this.f166855d.m110299e(), 0, 8);
        z21.m216837f(this.f166855d);
        tqfVar.mo150661o(this.f166855d.m110300f());
        tqfVar.mo150657h();
    }

    /* JADX INFO: renamed from: t */
    public final void m186582t(long j) throws ParserException {
        while (!this.f166857f.isEmpty() && this.f166857f.peek().f195477b == j) {
            y21.C21284a c21284aPop = this.f166857f.pop();
            if (c21284aPop.f195476a == 1836019574) {
                m186584w(c21284aPop);
                this.f166857f.clear();
                this.f166860i = 2;
            } else if (!this.f166857f.isEmpty()) {
                this.f166857f.peek().m212344d(c21284aPop);
            }
        }
        if (this.f166860i != 2) {
            m186578n();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m186583u() {
        if (this.f166874w != 2 || (this.f166852a & 2) == 0) {
            return;
        }
        this.f166869r.mo11362b(0, 4).mo11110b(new C1871k.b().m10339Z(this.f166875x == null ? null : new Metadata(this.f166875x)).m10320G());
        this.f166869r.mo11371l();
        this.f166869r.mo11370k(new hce0.C17275b(-9223372036854775807L));
    }

    /* JADX INFO: renamed from: w */
    public final void m186584w(y21.C21284a c21284a) throws ParserException {
        Metadata metadata;
        Metadata metadata2;
        Metadata metadata3;
        long jMax;
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = this.f166874w == 1;
        pij pijVar = new pij();
        y21.C21285b c21285bM212347g = c21284a.m212347g(1969517665);
        if (c21285bM212347g != null) {
            z21.C21604i c21604iM216828C = z21.m216828C(c21285bM212347g);
            Metadata metadata4 = c21604iM216828C.f201147a;
            Metadata metadata5 = c21604iM216828C.f201148b;
            Metadata metadata6 = c21604iM216828C.f201149c;
            if (metadata4 != null) {
                pijVar.m169610c(metadata4);
            }
            metadata = metadata6;
            metadata2 = metadata4;
            metadata3 = metadata5;
        } else {
            metadata = null;
            metadata2 = null;
            metadata3 = null;
        }
        y21.C21284a c21284aM212346f = c21284a.m212346f(1835365473);
        Metadata metadataM216846o = c21284aM212346f != null ? z21.m216846o(c21284aM212346f) : null;
        Metadata metadata7 = z21.m216848q(((y21.C21285b) p11.m167011e(c21284a.m212347g(1836476516))).f195480b).f201130a;
        Metadata metadata8 = metadataM216846o;
        List<q6j0> listM216827B = z21.m216827B(c21284a, pijVar, -9223372036854775807L, null, (this.f166852a & 1) != 0, z2, new gaj() { // from class: l.qy00
            @Override // p149l.gaj
            public final Object apply(Object obj) {
                return sy00.m186568j((u5j0) obj);
            }
        });
        int size = listM216827B.size();
        long j = -9223372036854775807L;
        int i = 0;
        int size2 = -1;
        while (i < size) {
            q6j0 q6j0Var = listM216827B.get(i);
            if (q6j0Var.f152912b == 0) {
                jMax = j;
                z = true;
            } else {
                u5j0 u5j0Var = q6j0Var.f152911a;
                int i2 = size2;
                ArrayList arrayList2 = arrayList;
                long j2 = u5j0Var.f174723e;
                if (j2 == -9223372036854775807L) {
                    j2 = q6j0Var.f152918h;
                }
                jMax = Math.max(j, j2);
                C20070a c20070a = new C20070a(u5j0Var, q6j0Var, this.f166869r.mo11362b(i, u5j0Var.f174720b));
                boolean zEquals = "audio/true-hd".equals(u5j0Var.f174724f.f7748l);
                int i3 = q6j0Var.f152915e;
                int i4 = zEquals ? i3 * 16 : i3 + 30;
                C1871k.b bVarM10282b = u5j0Var.f174724f.m10282b();
                bVarM10282b.m10338Y(i4);
                if (u5j0Var.f174720b != 2 || j2 <= 0) {
                    z = true;
                } else {
                    int i5 = q6j0Var.f152912b;
                    z = true;
                    if (i5 > 1) {
                        bVarM10282b.m10331R(i5 / (j2 / 1000000.0f));
                    }
                }
                n100.m157326k(u5j0Var.f174720b, pijVar, bVarM10282b);
                n100.m157327l(u5j0Var.f174720b, metadata2, metadata8, bVarM10282b, metadata3, this.f166859h.isEmpty() ? null : new Metadata(this.f166859h), metadata, metadata7);
                c20070a.f166878c.mo11110b(bVarM10282b.m10320G());
                size2 = (u5j0Var.f174720b == 2 && i2 == -1) ? arrayList2.size() : i2;
                arrayList = arrayList2;
                arrayList.add(c20070a);
            }
            i++;
            listM216827B = listM216827B;
            size = size;
            j = jMax;
        }
        this.f166872u = size2;
        this.f166873v = j;
        C20070a[] c20070aArr = (C20070a[]) arrayList.toArray(new C20070a[0]);
        this.f166870s = c20070aArr;
        this.f166871t = m186571m(c20070aArr);
        this.f166869r.mo11371l();
        this.f166869r.mo11370k(this);
    }

    /* JADX INFO: renamed from: x */
    public final void m186585x(long j) {
        if (this.f166861j == 1836086884) {
            int i = this.f166863l;
            this.f166875x = new MotionPhotoMetadata(0L, j, -9223372036854775807L, j + ((long) i), this.f166862k - ((long) i));
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m186586y(tqf tqfVar) throws IOException {
        y21.C21284a c21284aPeek;
        if (this.f166863l == 0) {
            if (!tqfVar.mo150653c(this.f166856e.m110299e(), 0, 8, true)) {
                m186583u();
                return false;
            }
            this.f166863l = 8;
            this.f166856e.m110292U(0);
            this.f166862k = this.f166856e.m110281J();
            this.f166861j = this.f166856e.m110311q();
        }
        long j = this.f166862k;
        if (j == 1) {
            tqfVar.readFully(this.f166856e.m110299e(), 8, 8);
            this.f166863l += 8;
            this.f166862k = this.f166856e.m110284M();
        } else if (j == 0) {
            long length = tqfVar.getLength();
            if (length == -1 && (c21284aPeek = this.f166857f.peek()) != null) {
                length = c21284aPeek.f195477b;
            }
            if (length != -1) {
                this.f166862k = (length - tqfVar.getPosition()) + ((long) this.f166863l);
            }
        }
        if (this.f166862k < this.f166863l) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (m186566C(this.f166861j)) {
            long position = tqfVar.getPosition();
            long j2 = this.f166862k;
            int i = this.f166863l;
            long j3 = (position + j2) - ((long) i);
            if (j2 != i && this.f166861j == 1835365473) {
                m186581s(tqfVar);
            }
            this.f166857f.push(new y21.C21284a(this.f166861j, j3));
            if (this.f166862k == this.f166863l) {
                m186582t(j3);
            } else {
                m186578n();
            }
        } else if (m186567D(this.f166861j)) {
            p11.m167013g(this.f166863l == 8);
            p11.m167013g(this.f166862k <= 2147483647L);
            d860 d860Var = new d860((int) this.f166862k);
            System.arraycopy(this.f166856e.m110299e(), 0, d860Var.m110299e(), 0, 8);
            this.f166864m = d860Var;
            this.f166860i = 1;
        } else {
            m186585x(tqfVar.getPosition() - ((long) this.f166863l));
            this.f166864m = null;
            this.f166860i = 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m186587z(tqf tqfVar, fd80 fd80Var) throws IOException {
        boolean z;
        long j = this.f166862k - ((long) this.f166863l);
        long position = tqfVar.getPosition() + j;
        d860 d860Var = this.f166864m;
        if (d860Var == null) {
            if (j < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                tqfVar.mo150661o((int) j);
            } else {
                fd80Var.f97018a = tqfVar.getPosition() + j;
                z = true;
            }
            m186582t(position);
            return (z || this.f166860i == 2) ? false : true;
        }
        tqfVar.readFully(d860Var.m110299e(), this.f166863l, (int) j);
        if (this.f166861j == 1718909296) {
            this.f166874w = m186574v(d860Var);
        } else if (!this.f166857f.isEmpty()) {
            this.f166857f.peek().m212345e(new y21.C21285b(this.f166861j, d860Var));
        }
        z = false;
        m186582t(position);
        if (z) {
        }
    }

    @Override // p149l.sqf
    public void release() {
    }

    public sy00() {
        this(0);
    }
}
