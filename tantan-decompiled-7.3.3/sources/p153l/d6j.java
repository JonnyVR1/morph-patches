package p153l;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class d6j implements zrf {

    /* JADX INFO: renamed from: I */
    public static final esf f85330I = new esf() { // from class: l.b6j
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return d6j.m114457c();
        }
    };

    /* JADX INFO: renamed from: J */
    public static final byte[] f85331J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: K */
    public static final C1894k f85332K = new C1894k.b().m10400g0("application/x-emsg").m10374G();

    /* JADX INFO: renamed from: A */
    public int f85333A;

    /* JADX INFO: renamed from: B */
    public int f85334B;

    /* JADX INFO: renamed from: C */
    public int f85335C;

    /* JADX INFO: renamed from: D */
    public boolean f85336D;

    /* JADX INFO: renamed from: E */
    public bsf f85337E;

    /* JADX INFO: renamed from: F */
    public qfj0[] f85338F;

    /* JADX INFO: renamed from: G */
    public qfj0[] f85339G;

    /* JADX INFO: renamed from: H */
    public boolean f85340H;

    /* JADX INFO: renamed from: a */
    public final int f85341a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final yej0 f85342b;

    /* JADX INFO: renamed from: c */
    public final List<C1894k> f85343c;

    /* JADX INFO: renamed from: d */
    public final SparseArray<C16465b> f85344d;

    /* JADX INFO: renamed from: e */
    public final ig60 f85345e;

    /* JADX INFO: renamed from: f */
    public final ig60 f85346f;

    /* JADX INFO: renamed from: g */
    public final ig60 f85347g;

    /* JADX INFO: renamed from: h */
    public final byte[] f85348h;

    /* JADX INFO: renamed from: i */
    public final ig60 f85349i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final h0j0 f85350j;

    /* JADX INFO: renamed from: k */
    public final d5f f85351k;

    /* JADX INFO: renamed from: l */
    public final ig60 f85352l;

    /* JADX INFO: renamed from: m */
    public final ArrayDeque<f31.C16879a> f85353m;

    /* JADX INFO: renamed from: n */
    public final ArrayDeque<C16464a> f85354n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public final qfj0 f85355o;

    /* JADX INFO: renamed from: p */
    public int f85356p;

    /* JADX INFO: renamed from: q */
    public int f85357q;

    /* JADX INFO: renamed from: r */
    public long f85358r;

    /* JADX INFO: renamed from: s */
    public int f85359s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public ig60 f85360t;

    /* JADX INFO: renamed from: u */
    public long f85361u;

    /* JADX INFO: renamed from: v */
    public int f85362v;

    /* JADX INFO: renamed from: w */
    public long f85363w;

    /* JADX INFO: renamed from: x */
    public long f85364x;

    /* JADX INFO: renamed from: y */
    public long f85365y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public C16465b f85366z;

    /* JADX INFO: renamed from: l.d6j$a */
    public static final class C16464a {

        /* JADX INFO: renamed from: a */
        public final long f85367a;

        /* JADX INFO: renamed from: b */
        public final boolean f85368b;

        /* JADX INFO: renamed from: c */
        public final int f85369c;

        public C16464a(long j, boolean z, int i) {
            this.f85367a = j;
            this.f85368b = z;
            this.f85369c = i;
        }
    }

    /* JADX INFO: renamed from: l.d6j$b */
    public static final class C16465b {

        /* JADX INFO: renamed from: a */
        public final qfj0 f85370a;

        /* JADX INFO: renamed from: d */
        public ufj0 f85373d;

        /* JADX INFO: renamed from: e */
        public asd f85374e;

        /* JADX INFO: renamed from: f */
        public int f85375f;

        /* JADX INFO: renamed from: g */
        public int f85376g;

        /* JADX INFO: renamed from: h */
        public int f85377h;

        /* JADX INFO: renamed from: i */
        public int f85378i;

        /* JADX INFO: renamed from: l */
        public boolean f85381l;

        /* JADX INFO: renamed from: b */
        public final bfj0 f85371b = new bfj0();

        /* JADX INFO: renamed from: c */
        public final ig60 f85372c = new ig60();

        /* JADX INFO: renamed from: j */
        public final ig60 f85379j = new ig60(1);

        /* JADX INFO: renamed from: k */
        public final ig60 f85380k = new ig60();

        public C16465b(qfj0 qfj0Var, ufj0 ufj0Var, asd asdVar) {
            this.f85370a = qfj0Var;
            this.f85373d = ufj0Var;
            this.f85374e = asdVar;
            m114491j(ufj0Var, asdVar);
        }

        /* JADX INFO: renamed from: c */
        public int m114484c() {
            int i;
            if (this.f85381l) {
                i = this.f85371b.f76505k[this.f85375f] ? 1 : 0;
            } else {
                i = this.f85373d.f178779g[this.f85375f];
            }
            return m114488g() != null ? 1073741824 | i : i;
        }

        /* JADX INFO: renamed from: d */
        public long m114485d() {
            return !this.f85381l ? this.f85373d.f178775c[this.f85375f] : this.f85371b.f76501g[this.f85377h];
        }

        /* JADX INFO: renamed from: e */
        public long m114486e() {
            return !this.f85381l ? this.f85373d.f178778f[this.f85375f] : this.f85371b.m103908c(this.f85375f);
        }

        /* JADX INFO: renamed from: f */
        public int m114487f() {
            return !this.f85381l ? this.f85373d.f178776d[this.f85375f] : this.f85371b.f76503i[this.f85375f];
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public zej0 m114488g() {
            if (!this.f85381l) {
                return null;
            }
            int i = ((asd) bmk0.m105144j(this.f85371b.f76495a)).f73102a;
            zej0 zej0VarM215416a = this.f85371b.f76508n;
            if (zej0VarM215416a == null) {
                zej0VarM215416a = this.f85373d.f178773a.m215416a(i);
            }
            if (zej0VarM215416a == null || !zej0VarM215416a.f204030a) {
                return null;
            }
            return zej0VarM215416a;
        }

        /* JADX INFO: renamed from: h */
        public boolean m114489h() {
            this.f85375f++;
            if (!this.f85381l) {
                return false;
            }
            int i = this.f85376g + 1;
            this.f85376g = i;
            int[] iArr = this.f85371b.f76502h;
            int i2 = this.f85377h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f85377h = i2 + 1;
            this.f85376g = 0;
            return false;
        }

        /* JADX INFO: renamed from: i */
        public int m114490i(int i, int i2) {
            ig60 ig60Var;
            zej0 zej0VarM114488g = m114488g();
            if (zej0VarM114488g == null) {
                return 0;
            }
            int length = zej0VarM114488g.f204033d;
            if (length != 0) {
                ig60Var = this.f85371b.f76509o;
            } else {
                byte[] bArr = (byte[]) bmk0.m105144j(zej0VarM114488g.f204034e);
                this.f85380k.m139806S(bArr, bArr.length);
                ig60 ig60Var2 = this.f85380k;
                length = bArr.length;
                ig60Var = ig60Var2;
            }
            boolean zM103912g = this.f85371b.m103912g(this.f85375f);
            boolean z = zM103912g || i2 != 0;
            this.f85379j.m139815e()[0] = (byte) ((z ? 128 : 0) | length);
            this.f85379j.m139808U(0);
            this.f85370a.mo11166f(this.f85379j, 1, 1);
            this.f85370a.mo11166f(ig60Var, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zM103912g) {
                this.f85372c.m139804Q(8);
                byte[] bArrM139815e = this.f85372c.m139815e();
                bArrM139815e[0] = 0;
                bArrM139815e[1] = 1;
                bArrM139815e[2] = (byte) ((i2 >> 8) & 255);
                bArrM139815e[3] = (byte) (i2 & 255);
                bArrM139815e[4] = (byte) ((i >> 24) & 255);
                bArrM139815e[5] = (byte) ((i >> 16) & 255);
                bArrM139815e[6] = (byte) ((i >> 8) & 255);
                bArrM139815e[7] = (byte) (i & 255);
                this.f85370a.mo11166f(this.f85372c, 8, 1);
                return length + 9;
            }
            ig60 ig60Var3 = this.f85371b.f76509o;
            int iM139801N = ig60Var3.m139801N();
            ig60Var3.m139809V(-2);
            int i3 = (iM139801N * 6) + 2;
            if (i2 != 0) {
                this.f85372c.m139804Q(i3);
                byte[] bArrM139815e2 = this.f85372c.m139815e();
                ig60Var3.m139822l(bArrM139815e2, 0, i3);
                int i4 = (((bArrM139815e2[2] & 255) << 8) | (bArrM139815e2[3] & 255)) + i2;
                bArrM139815e2[2] = (byte) ((i4 >> 8) & 255);
                bArrM139815e2[3] = (byte) (i4 & 255);
                ig60Var3 = this.f85372c;
            }
            this.f85370a.mo11166f(ig60Var3, i3, 1);
            return length + 1 + i3;
        }

        /* JADX INFO: renamed from: j */
        public void m114491j(ufj0 ufj0Var, asd asdVar) {
            this.f85373d = ufj0Var;
            this.f85374e = asdVar;
            this.f85370a.mo11164b(ufj0Var.f178773a.f199371f);
            m114492k();
        }

        /* JADX INFO: renamed from: k */
        public void m114492k() {
            this.f85371b.m103911f();
            this.f85375f = 0;
            this.f85377h = 0;
            this.f85376g = 0;
            this.f85378i = 0;
            this.f85381l = false;
        }

        /* JADX INFO: renamed from: l */
        public void m114493l(long j) {
            int i = this.f85375f;
            while (true) {
                bfj0 bfj0Var = this.f85371b;
                if (i >= bfj0Var.f76500f || bfj0Var.m103908c(i) > j) {
                    return;
                }
                if (this.f85371b.f76505k[i]) {
                    this.f85378i = i;
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: m */
        public void m114494m() {
            zej0 zej0VarM114488g = m114488g();
            if (zej0VarM114488g == null) {
                return;
            }
            ig60 ig60Var = this.f85371b.f76509o;
            int i = zej0VarM114488g.f204033d;
            if (i != 0) {
                ig60Var.m139809V(i);
            }
            if (this.f85371b.m103912g(this.f85375f)) {
                ig60Var.m139809V(ig60Var.m139801N() * 6);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m114495n(DrmInitData drmInitData) {
            zej0 zej0VarM215416a = this.f85373d.f178773a.m215416a(((asd) bmk0.m105144j(this.f85371b.f76495a)).f73102a);
            this.f85370a.mo11164b(this.f85373d.f178773a.f199371f.m10336b().m10382O(drmInitData.m9952c(zej0VarM215416a != null ? zej0VarM215416a.f204031b : null)).m10374G());
        }
    }

    public d6j(int i, @Nullable h0j0 h0j0Var, @Nullable yej0 yej0Var, List<C1894k> list, @Nullable qfj0 qfj0Var) {
        this.f85341a = i;
        this.f85350j = h0j0Var;
        this.f85342b = yej0Var;
        this.f85343c = Collections.unmodifiableList(list);
        this.f85355o = qfj0Var;
        this.f85351k = new d5f();
        this.f85352l = new ig60(16);
        this.f85345e = new ig60(jb20.f119084a);
        this.f85346f = new ig60(5);
        this.f85347g = new ig60();
        byte[] bArr = new byte[16];
        this.f85348h = bArr;
        this.f85349i = new ig60(bArr);
        this.f85353m = new ArrayDeque<>();
        this.f85354n = new ArrayDeque<>();
        this.f85344d = new SparseArray<>();
        this.f85364x = -9223372036854775807L;
        this.f85363w = -9223372036854775807L;
        this.f85365y = -9223372036854775807L;
        this.f85337E = bsf.f78152i0;
        this.f85338F = new qfj0[0];
        this.f85339G = new qfj0[0];
    }

    /* JADX INFO: renamed from: A */
    public static Pair<Long, r45> m114445A(ig60 ig60Var, long j) throws ParserException {
        long jM139800M;
        long jM139800M2;
        ig60Var.m139808U(8);
        int iM123699c = f31.m123699c(ig60Var.m139827q());
        ig60Var.m139809V(4);
        long jM139797J = ig60Var.m139797J();
        if (iM123699c == 0) {
            jM139800M = ig60Var.m139797J();
            jM139800M2 = ig60Var.m139797J();
        } else {
            jM139800M = ig60Var.m139800M();
            jM139800M2 = ig60Var.m139800M();
        }
        long j2 = j + jM139800M2;
        long jM105110W0 = bmk0.m105110W0(jM139800M, 1000000L, jM139797J);
        ig60Var.m139809V(2);
        int iM139801N = ig60Var.m139801N();
        int[] iArr = new int[iM139801N];
        long[] jArr = new long[iM139801N];
        long[] jArr2 = new long[iM139801N];
        long[] jArr3 = new long[iM139801N];
        long j3 = j2;
        long jM105110W1 = jM105110W0;
        int i = 0;
        while (i < iM139801N) {
            int iM139827q = ig60Var.m139827q();
            if ((Integer.MIN_VALUE & iM139827q) != 0) {
                throw ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long jM139797J2 = ig60Var.m139797J();
            iArr[i] = iM139827q & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            jArr[i] = j3;
            jArr3[i] = jM105110W1;
            jM139800M += jM139797J2;
            long[] jArr4 = jArr3;
            jM105110W1 = bmk0.m105110W0(jM139800M, 1000000L, jM139797J);
            jArr2[i] = jM105110W1 - jArr4[i];
            ig60Var.m139809V(4);
            j3 += (long) iArr[i];
            i++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jM105110W0), new r45(iArr, jArr, jArr2, jArr3));
    }

    /* JADX INFO: renamed from: B */
    public static long m114446B(ig60 ig60Var) {
        ig60Var.m139808U(8);
        return f31.m123699c(ig60Var.m139827q()) == 1 ? ig60Var.m139800M() : ig60Var.m139797J();
    }

    @Nullable
    /* JADX INFO: renamed from: C */
    public static C16465b m114447C(ig60 ig60Var, SparseArray<C16465b> sparseArray, boolean z) {
        ig60Var.m139808U(8);
        int iM123698b = f31.m123698b(ig60Var.m139827q());
        C16465b c16465bValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(ig60Var.m139827q());
        if (c16465bValueAt == null) {
            return null;
        }
        if ((iM123698b & 1) != 0) {
            long jM139800M = ig60Var.m139800M();
            bfj0 bfj0Var = c16465bValueAt.f85371b;
            bfj0Var.f76497c = jM139800M;
            bfj0Var.f76498d = jM139800M;
        }
        asd asdVar = c16465bValueAt.f85374e;
        c16465bValueAt.f85371b.f76495a = new asd((iM123698b & 2) != 0 ? ig60Var.m139827q() - 1 : asdVar.f73102a, (iM123698b & 8) != 0 ? ig60Var.m139827q() : asdVar.f73103b, (iM123698b & 16) != 0 ? ig60Var.m139827q() : asdVar.f73104c, (iM123698b & 32) != 0 ? ig60Var.m139827q() : asdVar.f73105d);
        return c16465bValueAt;
    }

    /* JADX INFO: renamed from: D */
    public static void m114448D(f31.C16879a c16879a, SparseArray<C16465b> sparseArray, boolean z, int i, byte[] bArr) throws ParserException {
        C16465b c16465bM114447C = m114447C(((f31.C16880b) w11.m204369e(c16879a.m123703g(1952868452))).f96944b, sparseArray, z);
        if (c16465bM114447C == null) {
            return;
        }
        bfj0 bfj0Var = c16465bM114447C.f85371b;
        long j = bfj0Var.f76511q;
        boolean z2 = bfj0Var.f76512r;
        c16465bM114447C.m114492k();
        c16465bM114447C.f85381l = true;
        f31.C16880b c16880bM123703g = c16879a.m123703g(1952867444);
        if (c16880bM123703g == null || (i & 2) != 0) {
            bfj0Var.f76511q = j;
            bfj0Var.f76512r = z2;
        } else {
            bfj0Var.f76511q = m114446B(c16880bM123703g.f96944b);
            bfj0Var.f76512r = true;
        }
        m114451G(c16879a, c16465bM114447C, i);
        zej0 zej0VarM215416a = c16465bM114447C.f85373d.f178773a.m215416a(((asd) w11.m204369e(bfj0Var.f76495a)).f73102a);
        f31.C16880b c16880bM123703g2 = c16879a.m123703g(1935763834);
        if (c16880bM123703g2 != null) {
            m114466w((zej0) w11.m204369e(zej0VarM215416a), c16880bM123703g2.f96944b, bfj0Var);
        }
        f31.C16880b c16880bM123703g3 = c16879a.m123703g(1935763823);
        if (c16880bM123703g3 != null) {
            m114465v(c16880bM123703g3.f96944b, bfj0Var);
        }
        f31.C16880b c16880bM123703g4 = c16879a.m123703g(1936027235);
        if (c16880bM123703g4 != null) {
            m114469z(c16880bM123703g4.f96944b, bfj0Var);
        }
        m114467x(c16879a, zej0VarM215416a != null ? zej0VarM215416a.f204031b : null, bfj0Var);
        int size = c16879a.f96942c.size();
        for (int i2 = 0; i2 < size; i2++) {
            f31.C16880b c16880b = c16879a.f96942c.get(i2);
            if (c16880b.f96940a == 1970628964) {
                m114452H(c16880b.f96944b, bfj0Var, bArr);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public static Pair<Integer, asd> m114449E(ig60 ig60Var) {
        ig60Var.m139808U(12);
        return Pair.create(Integer.valueOf(ig60Var.m139827q()), new asd(ig60Var.m139827q() - 1, ig60Var.m139827q(), ig60Var.m139827q(), ig60Var.m139827q()));
    }

    /* JADX INFO: renamed from: F */
    public static int m114450F(C16465b c16465b, int i, int i2, ig60 ig60Var, int i3) throws ParserException {
        int iM139827q;
        ig60Var.m139808U(8);
        int iM123698b = f31.m123698b(ig60Var.m139827q());
        yej0 yej0Var = c16465b.f85373d.f178773a;
        bfj0 bfj0Var = c16465b.f85371b;
        asd asdVar = (asd) bmk0.m105144j(bfj0Var.f76495a);
        bfj0Var.f76502h[i] = ig60Var.m139799L();
        long[] jArr = bfj0Var.f76501g;
        long j = bfj0Var.f76497c;
        jArr[i] = j;
        if ((iM123698b & 1) != 0) {
            jArr[i] = j + ((long) ig60Var.m139827q());
        }
        boolean z = (iM123698b & 4) != 0;
        int iM139827q2 = asdVar.f73105d;
        if (z) {
            iM139827q2 = ig60Var.m139827q();
        }
        boolean z2 = (iM123698b & 256) != 0;
        boolean z3 = (iM123698b & 512) != 0;
        boolean z4 = (iM123698b & 1024) != 0;
        boolean z5 = (iM123698b & 2048) != 0;
        long j2 = m114462l(yej0Var) ? ((long[]) bmk0.m105144j(yej0Var.f199374i))[0] : 0L;
        int[] iArr = bfj0Var.f76503i;
        long[] jArr2 = bfj0Var.f76504j;
        boolean[] zArr = bfj0Var.f76505k;
        boolean z6 = z5;
        boolean z7 = yej0Var.f199367b == 2 && (i2 & 1) != 0;
        int i4 = i3 + bfj0Var.f76502h[i];
        boolean z8 = z;
        long j3 = yej0Var.f199368c;
        long j4 = bfj0Var.f76511q;
        int i5 = i3;
        while (i5 < i4) {
            int iM114458d = m114458d(z2 ? ig60Var.m139827q() : asdVar.f73103b);
            int iM114458d2 = m114458d(z3 ? ig60Var.m139827q() : asdVar.f73104c);
            if (z4) {
                iM139827q = ig60Var.m139827q();
            } else {
                iM139827q = (i5 == 0 && z8) ? iM139827q2 : asdVar.f73105d;
            }
            int i6 = i5;
            long jM105110W0 = bmk0.m105110W0((((long) (z6 ? ig60Var.m139827q() : 0)) + j4) - j2, 1000000L, j3);
            jArr2[i6] = jM105110W0;
            if (!bfj0Var.f76512r) {
                jArr2[i6] = jM105110W0 + c16465b.f85373d.f178780h;
            }
            iArr[i6] = iM114458d2;
            zArr[i6] = ((iM139827q >> 16) & 1) == 0 && (!z7 || i6 == 0);
            j4 += (long) iM114458d;
            i5 = i6 + 1;
            i4 = i4;
            z7 = z7;
        }
        int i7 = i4;
        bfj0Var.f76511q = j4;
        return i7;
    }

    /* JADX INFO: renamed from: G */
    public static void m114451G(f31.C16879a c16879a, C16465b c16465b, int i) throws ParserException {
        List<f31.C16880b> list = c16879a.f96942c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            f31.C16880b c16880b = list.get(i4);
            if (c16880b.f96940a == 1953658222) {
                ig60 ig60Var = c16880b.f96944b;
                ig60Var.m139808U(12);
                int iM139799L = ig60Var.m139799L();
                if (iM139799L > 0) {
                    i3 += iM139799L;
                    i2++;
                }
            }
        }
        c16465b.f85377h = 0;
        c16465b.f85376g = 0;
        c16465b.f85375f = 0;
        c16465b.f85371b.m103910e(i2, i3);
        int i5 = 0;
        int iM114450F = 0;
        for (int i6 = 0; i6 < size; i6++) {
            f31.C16880b c16880b2 = list.get(i6);
            if (c16880b2.f96940a == 1953658222) {
                iM114450F = m114450F(c16465b, i5, i, c16880b2.f96944b, iM114450F);
                i5++;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m114452H(ig60 ig60Var, bfj0 bfj0Var, byte[] bArr) throws ParserException {
        ig60Var.m139808U(8);
        ig60Var.m139822l(bArr, 0, 16);
        if (Arrays.equals(bArr, f85331J)) {
            m114468y(ig60Var, 16, bfj0Var);
        }
    }

    /* JADX INFO: renamed from: I */
    private void m114453I(long j) throws ParserException {
        while (!this.f85353m.isEmpty() && this.f85353m.peek().f96941b == j) {
            m114476n(this.f85353m.pop());
        }
        m114459e();
    }

    /* JADX INFO: renamed from: J */
    private boolean m114454J(asf asfVar) throws IOException {
        if (this.f85359s == 0) {
            if (!asfVar.mo99898b(this.f85352l.m139815e(), 0, 8, true)) {
                return false;
            }
            this.f85359s = 8;
            this.f85352l.m139808U(0);
            this.f85358r = this.f85352l.m139797J();
            this.f85357q = this.f85352l.m139827q();
        }
        long j = this.f85358r;
        if (j == 1) {
            asfVar.readFully(this.f85352l.m139815e(), 8, 8);
            this.f85359s += 8;
            this.f85358r = this.f85352l.m139800M();
        } else if (j == 0) {
            long length = asfVar.getLength();
            if (length == -1 && !this.f85353m.isEmpty()) {
                length = this.f85353m.peek().f96941b;
            }
            if (length != -1) {
                this.f85358r = (length - asfVar.getPosition()) + ((long) this.f85359s);
            }
        }
        if (this.f85358r < this.f85359s) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = asfVar.getPosition() - ((long) this.f85359s);
        int i = this.f85357q;
        if ((i == 1836019558 || i == 1835295092) && !this.f85340H) {
            this.f85337E.mo11424k(new mke0.C18641b(this.f85364x, position));
            this.f85340H = true;
        }
        if (this.f85357q == 1836019558) {
            int size = this.f85344d.size();
            for (int i2 = 0; i2 < size; i2++) {
                bfj0 bfj0Var = this.f85344d.valueAt(i2).f85371b;
                bfj0Var.f76496b = position;
                bfj0Var.f76498d = position;
                bfj0Var.f76497c = position;
            }
        }
        int i3 = this.f85357q;
        if (i3 == 1835295092) {
            this.f85366z = null;
            this.f85361u = position + this.f85358r;
            this.f85356p = 2;
            return true;
        }
        if (m114455N(i3)) {
            long position2 = (asfVar.getPosition() + this.f85358r) - 8;
            this.f85353m.push(new f31.C16879a(this.f85357q, position2));
            if (this.f85358r == this.f85359s) {
                m114453I(position2);
            } else {
                m114459e();
            }
        } else if (m114456O(this.f85357q)) {
            if (this.f85359s != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f85358r > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            ig60 ig60Var = new ig60((int) this.f85358r);
            System.arraycopy(this.f85352l.m139815e(), 0, ig60Var.m139815e(), 0, 8);
            this.f85360t = ig60Var;
            this.f85356p = 1;
        } else {
            if (this.f85358r > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f85360t = null;
            this.f85356p = 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: N */
    private static boolean m114455N(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* JADX INFO: renamed from: O */
    private static boolean m114456O(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m114457c() {
        return new zrf[]{new d6j()};
    }

    /* JADX INFO: renamed from: d */
    public static int m114458d(int i) throws ParserException {
        if (i >= 0) {
            return i;
        }
        throw ParserException.createForMalformedContainer("Unexpected negative value: " + i, null);
    }

    /* JADX INFO: renamed from: e */
    private void m114459e() {
        this.f85356p = 0;
        this.f85359s = 0;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static DrmInitData m114460i(List<f31.C16880b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            f31.C16880b c16880b = list.get(i);
            if (c16880b.f96940a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrM139815e = c16880b.f96944b.m139815e();
                UUID uuidM189559f = t7b0.m189559f(bArrM139815e);
                if (uuidM189559f == null) {
                    kyv.m152151i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidM189559f, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, bArrM139815e));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static C16465b m114461j(SparseArray<C16465b> sparseArray) {
        int size = sparseArray.size();
        C16465b c16465b = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C16465b c16465bValueAt = sparseArray.valueAt(i);
            if ((c16465bValueAt.f85381l || c16465bValueAt.f85375f != c16465bValueAt.f85373d.f178774b) && (!c16465bValueAt.f85381l || c16465bValueAt.f85377h != c16465bValueAt.f85371b.f76499e)) {
                long jM114485d = c16465bValueAt.m114485d();
                if (jM114485d < j) {
                    c16465b = c16465bValueAt;
                    j = jM114485d;
                }
            }
        }
        return c16465b;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m114462l(yej0 yej0Var) {
        long[] jArr;
        long[] jArr2 = yej0Var.f199373h;
        if (jArr2 != null && jArr2.length == 1 && (jArr = yej0Var.f199374i) != null) {
            long j = jArr2[0];
            if (j == 0 || bmk0.m105110W0(j + jArr[0], 1000000L, yej0Var.f199369d) >= yej0Var.f199370e) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static long m114463t(ig60 ig60Var) {
        ig60Var.m139808U(8);
        return f31.m123699c(ig60Var.m139827q()) == 0 ? ig60Var.m139797J() : ig60Var.m139800M();
    }

    /* JADX INFO: renamed from: u */
    public static void m114464u(f31.C16879a c16879a, SparseArray<C16465b> sparseArray, boolean z, int i, byte[] bArr) throws ParserException {
        int size = c16879a.f96943d.size();
        for (int i2 = 0; i2 < size; i2++) {
            f31.C16879a c16879a2 = c16879a.f96943d.get(i2);
            if (c16879a2.f96940a == 1953653094) {
                m114448D(c16879a2, sparseArray, z, i, bArr);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m114465v(ig60 ig60Var, bfj0 bfj0Var) throws ParserException {
        ig60Var.m139808U(8);
        int iM139827q = ig60Var.m139827q();
        if ((f31.m123698b(iM139827q) & 1) == 1) {
            ig60Var.m139809V(8);
        }
        int iM139799L = ig60Var.m139799L();
        if (iM139799L == 1) {
            bfj0Var.f76498d += f31.m123699c(iM139827q) == 0 ? ig60Var.m139797J() : ig60Var.m139800M();
        } else {
            throw ParserException.createForMalformedContainer("Unexpected saio entry count: " + iM139799L, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m114466w(zej0 zej0Var, ig60 ig60Var, bfj0 bfj0Var) throws ParserException {
        int i;
        int i2 = zej0Var.f204033d;
        ig60Var.m139808U(8);
        if ((f31.m123698b(ig60Var.m139827q()) & 1) == 1) {
            ig60Var.m139809V(8);
        }
        int iM139795H = ig60Var.m139795H();
        int iM139799L = ig60Var.m139799L();
        if (iM139799L > bfj0Var.f76500f) {
            throw ParserException.createForMalformedContainer("Saiz sample count " + iM139799L + " is greater than fragment sample count" + bfj0Var.f76500f, null);
        }
        if (iM139795H == 0) {
            boolean[] zArr = bfj0Var.f76507m;
            i = 0;
            for (int i3 = 0; i3 < iM139799L; i3++) {
                int iM139795H2 = ig60Var.m139795H();
                i += iM139795H2;
                zArr[i3] = iM139795H2 > i2;
            }
        } else {
            i = iM139795H * iM139799L;
            Arrays.fill(bfj0Var.f76507m, 0, iM139799L, iM139795H > i2);
        }
        Arrays.fill(bfj0Var.f76507m, iM139799L, bfj0Var.f76500f, false);
        if (i > 0) {
            bfj0Var.m103909d(i);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m114467x(f31.C16879a c16879a, @Nullable String str, bfj0 bfj0Var) throws ParserException {
        byte[] bArr = null;
        ig60 ig60Var = null;
        ig60 ig60Var2 = null;
        for (int i = 0; i < c16879a.f96942c.size(); i++) {
            f31.C16880b c16880b = c16879a.f96942c.get(i);
            ig60 ig60Var3 = c16880b.f96944b;
            int i2 = c16880b.f96940a;
            if (i2 == 1935828848) {
                ig60Var3.m139808U(12);
                if (ig60Var3.m139827q() == 1936025959) {
                    ig60Var = ig60Var3;
                }
            } else if (i2 == 1936158820) {
                ig60Var3.m139808U(12);
                if (ig60Var3.m139827q() == 1936025959) {
                    ig60Var2 = ig60Var3;
                }
            }
        }
        if (ig60Var == null || ig60Var2 == null) {
            return;
        }
        ig60Var.m139808U(8);
        int iM123699c = f31.m123699c(ig60Var.m139827q());
        ig60Var.m139809V(4);
        if (iM123699c == 1) {
            ig60Var.m139809V(4);
        }
        if (ig60Var.m139827q() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        ig60Var2.m139808U(8);
        int iM123699c2 = f31.m123699c(ig60Var2.m139827q());
        ig60Var2.m139809V(4);
        if (iM123699c2 == 1) {
            if (ig60Var2.m139797J() == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (iM123699c2 >= 2) {
            ig60Var2.m139809V(4);
        }
        if (ig60Var2.m139797J() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        ig60Var2.m139809V(1);
        int iM139795H = ig60Var2.m139795H();
        int i3 = (iM139795H & 240) >> 4;
        int i4 = iM139795H & 15;
        boolean z = ig60Var2.m139795H() == 1;
        if (z) {
            int iM139795H2 = ig60Var2.m139795H();
            byte[] bArr2 = new byte[16];
            ig60Var2.m139822l(bArr2, 0, 16);
            if (iM139795H2 == 0) {
                int iM139795H3 = ig60Var2.m139795H();
                bArr = new byte[iM139795H3];
                ig60Var2.m139822l(bArr, 0, iM139795H3);
            }
            bfj0Var.f76506l = true;
            bfj0Var.f76508n = new zej0(z, str, iM139795H2, bArr2, i3, i4, bArr);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m114468y(ig60 ig60Var, int i, bfj0 bfj0Var) throws ParserException {
        ig60Var.m139808U(i + 8);
        int iM123698b = f31.m123698b(ig60Var.m139827q());
        if ((iM123698b & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM123698b & 2) != 0;
        int iM139799L = ig60Var.m139799L();
        if (iM139799L == 0) {
            Arrays.fill(bfj0Var.f76507m, 0, bfj0Var.f76500f, false);
            return;
        }
        if (iM139799L == bfj0Var.f76500f) {
            Arrays.fill(bfj0Var.f76507m, 0, iM139799L, z);
            bfj0Var.m103909d(ig60Var.m139811a());
            bfj0Var.m103907b(ig60Var);
        } else {
            throw ParserException.createForMalformedContainer("Senc sample count " + iM139799L + " is different from fragment sample count" + bfj0Var.f76500f, null);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m114469z(ig60 ig60Var, bfj0 bfj0Var) throws ParserException {
        m114468y(ig60Var, 0, bfj0Var);
    }

    /* JADX INFO: renamed from: K */
    public final void m114470K(asf asfVar) throws IOException {
        int i = ((int) this.f85358r) - this.f85359s;
        ig60 ig60Var = this.f85360t;
        if (ig60Var != null) {
            asfVar.readFully(ig60Var.m139815e(), 8, i);
            m114478p(new f31.C16880b(this.f85357q, ig60Var), asfVar.getPosition());
        } else {
            asfVar.mo99905o(i);
        }
        m114453I(asfVar.getPosition());
    }

    /* JADX INFO: renamed from: L */
    public final void m114471L(asf asfVar) throws IOException {
        int size = this.f85344d.size();
        long j = Long.MAX_VALUE;
        C16465b c16465bValueAt = null;
        for (int i = 0; i < size; i++) {
            bfj0 bfj0Var = this.f85344d.valueAt(i).f85371b;
            if (bfj0Var.f76510p) {
                long j2 = bfj0Var.f76498d;
                if (j2 < j) {
                    c16465bValueAt = this.f85344d.valueAt(i);
                    j = j2;
                }
            }
        }
        if (c16465bValueAt == null) {
            this.f85356p = 3;
            return;
        }
        int position = (int) (j - asfVar.getPosition());
        if (position < 0) {
            throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        asfVar.mo99905o(position);
        c16465bValueAt.f85371b.m103906a(asfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: M */
    public final boolean m114472M(asf asfVar) throws IOException {
        boolean z;
        int iM176371e;
        C16465b c16465bM114461j = this.f85366z;
        Throwable th = null;
        if (c16465bM114461j == null) {
            c16465bM114461j = m114461j(this.f85344d);
            if (c16465bM114461j == null) {
                int position = (int) (this.f85361u - asfVar.getPosition());
                if (position < 0) {
                    throw ParserException.createForMalformedContainer("Offset to end of mdat was negative.", null);
                }
                asfVar.mo99905o(position);
                m114459e();
                return false;
            }
            int iM114485d = (int) (c16465bM114461j.m114485d() - asfVar.getPosition());
            if (iM114485d < 0) {
                kyv.m152151i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iM114485d = 0;
            }
            asfVar.mo99905o(iM114485d);
            this.f85366z = c16465bM114461j;
        }
        int i = 4;
        int i2 = 1;
        if (this.f85356p == 3) {
            int iM114487f = c16465bM114461j.m114487f();
            this.f85333A = iM114487f;
            if (c16465bM114461j.f85375f < c16465bM114461j.f85378i) {
                asfVar.mo99905o(iM114487f);
                c16465bM114461j.m114494m();
                if (!c16465bM114461j.m114489h()) {
                    this.f85366z = null;
                }
                this.f85356p = 3;
                return true;
            }
            if (c16465bM114461j.f85373d.f178773a.f199372g == 1) {
                this.f85333A = iM114487f - 8;
                asfVar.mo99905o(8);
            }
            boolean zEquals = "audio/ac4".equals(c16465bM114461j.f85373d.f178773a.f199371f.f7785l);
            int i3 = this.f85333A;
            if (zEquals) {
                this.f85334B = c16465bM114461j.m114490i(i3, 7);
                C16484d9.m114988a(this.f85333A, this.f85349i);
                c16465bM114461j.f85370a.m176370d(this.f85349i, 7);
                this.f85334B += 7;
            } else {
                this.f85334B = c16465bM114461j.m114490i(i3, 0);
            }
            this.f85333A += this.f85334B;
            this.f85356p = 4;
            this.f85335C = 0;
        }
        yej0 yej0Var = c16465bM114461j.f85373d.f178773a;
        qfj0 qfj0Var = c16465bM114461j.f85370a;
        long jM114486e = c16465bM114461j.m114486e();
        h0j0 h0j0Var = this.f85350j;
        if (h0j0Var != null) {
            jM114486e = h0j0Var.m133173a(jM114486e);
        }
        if (yej0Var.f199375j == 0) {
            z = 1;
            while (true) {
                int i4 = this.f85334B;
                int i5 = this.f85333A;
                if (i4 >= i5) {
                    break;
                }
                this.f85334B += qfj0Var.m176371e(asfVar, i5 - i4, false);
            }
        } else {
            byte[] bArrM139815e = this.f85346f.m139815e();
            bArrM139815e[0] = 0;
            bArrM139815e[1] = 0;
            bArrM139815e[2] = 0;
            int i6 = yej0Var.f199375j;
            int i7 = i6 + 1;
            int i8 = 4 - i6;
            while (this.f85334B < this.f85333A) {
                int i9 = this.f85335C;
                if (i9 == 0) {
                    asfVar.readFully(bArrM139815e, i8, i7);
                    this.f85346f.m139808U(0);
                    int iM139827q = this.f85346f.m139827q();
                    if (iM139827q < i2) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", th);
                    }
                    this.f85335C = iM139827q - 1;
                    this.f85345e.m139808U(0);
                    qfj0Var.m176370d(this.f85345e, i);
                    qfj0Var.m176370d(this.f85346f, i2);
                    this.f85336D = (this.f85339G.length <= 0 || !jb20.m144189g(yej0Var.f199371f.f7785l, bArrM139815e[i])) ? 0 : i2;
                    this.f85334B += 5;
                    this.f85333A += i8;
                } else {
                    if (this.f85336D) {
                        this.f85347g.m139804Q(i9);
                        asfVar.readFully(this.f85347g.m139815e(), 0, this.f85335C);
                        qfj0Var.m176370d(this.f85347g, this.f85335C);
                        iM176371e = this.f85335C;
                        int iM144199q = jb20.m144199q(this.f85347g.m139815e(), this.f85347g.m139817g());
                        this.f85347g.m139808U("video/hevc".equals(yej0Var.f199371f.f7785l) ? 1 : 0);
                        this.f85347g.m139807T(iM144199q);
                        mo4.m159233a(jM114486e, this.f85347g, this.f85339G);
                    } else {
                        iM176371e = qfj0Var.m176371e(asfVar, i9, false);
                    }
                    this.f85334B += iM176371e;
                    this.f85335C -= iM176371e;
                    i2 = i2;
                    th = null;
                    i = 4;
                }
            }
            z = i2;
        }
        int iM114484c = c16465bM114461j.m114484c();
        zej0 zej0VarM114488g = c16465bM114461j.m114488g();
        qfj0Var.mo11163a(jM114486e, iM114484c, this.f85333A, 0, zej0VarM114488g != null ? zej0VarM114488g.f204032c : null);
        m114481s(jM114486e);
        if (!c16465bM114461j.m114489h()) {
            this.f85366z = null;
        }
        this.f85356p = 3;
        return z;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        int size = this.f85344d.size();
        for (int i = 0; i < size; i++) {
            this.f85344d.valueAt(i).m114492k();
        }
        this.f85354n.clear();
        this.f85362v = 0;
        this.f85363w = j2;
        this.f85353m.clear();
        m114459e();
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f85337E = bsfVar;
        m114459e();
        m114474k();
        yej0 yej0Var = this.f85342b;
        if (yej0Var != null) {
            this.f85344d.put(0, new C16465b(bsfVar.mo11416b(0, yej0Var.f199367b), new ufj0(this.f85342b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new asd(0, 0, 0, 0)));
            this.f85337E.mo11425l();
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        return wsf0.m207766b(asfVar);
    }

    /* JADX INFO: renamed from: g */
    public final asd m114473g(SparseArray<asd> sparseArray, int i) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (asd) w11.m204369e(sparseArray.get(i));
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        while (true) {
            int i = this.f85356p;
            if (i != 0) {
                if (i == 1) {
                    m114470K(asfVar);
                } else if (i == 2) {
                    m114471L(asfVar);
                } else if (m114472M(asfVar)) {
                    return 0;
                }
            } else if (!m114454J(asfVar)) {
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m114474k() {
        int i;
        qfj0[] qfj0VarArr = new qfj0[2];
        this.f85338F = qfj0VarArr;
        qfj0 qfj0Var = this.f85355o;
        int i2 = 0;
        if (qfj0Var != null) {
            qfj0VarArr[0] = qfj0Var;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f85341a & 4) != 0) {
            qfj0VarArr[i] = this.f85337E.mo11416b(100, 5);
            i3 = 101;
            i++;
        }
        qfj0[] qfj0VarArr2 = (qfj0[]) bmk0.m105094O0(this.f85338F, i);
        this.f85338F = qfj0VarArr2;
        for (qfj0 qfj0Var2 : qfj0VarArr2) {
            qfj0Var2.mo11164b(f85332K);
        }
        this.f85339G = new qfj0[this.f85343c.size()];
        while (i2 < this.f85339G.length) {
            qfj0 qfj0VarMo11416b = this.f85337E.mo11416b(i3, 3);
            qfj0VarMo11416b.mo11164b(this.f85343c.get(i2));
            this.f85339G[i2] = qfj0VarMo11416b;
            i2++;
            i3++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m114476n(f31.C16879a c16879a) throws ParserException {
        int i = c16879a.f96940a;
        if (i == 1836019574) {
            m114480r(c16879a);
        } else if (i == 1836019558) {
            m114479q(c16879a);
        } else {
            if (this.f85353m.isEmpty()) {
                return;
            }
            this.f85353m.peek().m123700d(c16879a);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m114477o(ig60 ig60Var) {
        String str;
        String str2;
        long jM105110W0;
        long jM105110W1;
        long jM139797J;
        long jM133173a;
        if (this.f85338F.length == 0) {
            return;
        }
        ig60Var.m139808U(8);
        int iM123699c = f31.m123699c(ig60Var.m139827q());
        if (iM123699c == 0) {
            str = (String) w11.m204369e(ig60Var.m139789B());
            str2 = (String) w11.m204369e(ig60Var.m139789B());
            long jM139797J2 = ig60Var.m139797J();
            jM105110W0 = bmk0.m105110W0(ig60Var.m139797J(), 1000000L, jM139797J2);
            long j = this.f85365y;
            long j2 = j != -9223372036854775807L ? j + jM105110W0 : -9223372036854775807L;
            jM105110W1 = bmk0.m105110W0(ig60Var.m139797J(), 1000L, jM139797J2);
            jM139797J = ig60Var.m139797J();
            jM133173a = j2;
        } else {
            if (iM123699c != 1) {
                kyv.m152151i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iM123699c);
                return;
            }
            long jM139797J3 = ig60Var.m139797J();
            jM133173a = bmk0.m105110W0(ig60Var.m139800M(), 1000000L, jM139797J3);
            long jM105110W2 = bmk0.m105110W0(ig60Var.m139797J(), 1000L, jM139797J3);
            long jM139797J4 = ig60Var.m139797J();
            str = (String) w11.m204369e(ig60Var.m139789B());
            str2 = (String) w11.m204369e(ig60Var.m139789B());
            jM105110W1 = jM105110W2;
            jM139797J = jM139797J4;
            jM105110W0 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[ig60Var.m139811a()];
        ig60Var.m139822l(bArr, 0, ig60Var.m139811a());
        ig60 ig60Var2 = new ig60(this.f85351k.m114297a(new EventMessage(str3, str4, jM105110W1, jM139797J, bArr)));
        int iM139811a = ig60Var2.m139811a();
        for (qfj0 qfj0Var : this.f85338F) {
            ig60Var2.m139808U(0);
            qfj0Var.m176370d(ig60Var2, iM139811a);
        }
        ArrayDeque<C16464a> arrayDeque = this.f85354n;
        if (jM133173a == -9223372036854775807L) {
            arrayDeque.addLast(new C16464a(jM105110W0, true, iM139811a));
            this.f85362v += iM139811a;
            return;
        }
        if (!arrayDeque.isEmpty()) {
            this.f85354n.addLast(new C16464a(jM133173a, false, iM139811a));
            this.f85362v += iM139811a;
            return;
        }
        h0j0 h0j0Var = this.f85350j;
        if (h0j0Var != null && !h0j0Var.m133178f()) {
            this.f85354n.addLast(new C16464a(jM133173a, false, iM139811a));
            this.f85362v += iM139811a;
            return;
        }
        h0j0 h0j0Var2 = this.f85350j;
        if (h0j0Var2 != null) {
            jM133173a = h0j0Var2.m133173a(jM133173a);
        }
        long j3 = jM133173a;
        for (qfj0 qfj0Var2 : this.f85338F) {
            qfj0Var2.mo11163a(j3, 1, iM139811a, 0, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m114478p(f31.C16880b c16880b, long j) throws ParserException {
        if (!this.f85353m.isEmpty()) {
            this.f85353m.peek().m123701e(c16880b);
            return;
        }
        int i = c16880b.f96940a;
        if (i != 1936286840) {
            if (i == 1701671783) {
                m114477o(c16880b.f96944b);
            }
        } else {
            Pair<Long, r45> pairM114445A = m114445A(c16880b.f96944b, j);
            this.f85365y = ((Long) pairM114445A.first).longValue();
            this.f85337E.mo11424k((mke0) pairM114445A.second);
            this.f85340H = true;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m114479q(f31.C16879a c16879a) throws ParserException {
        m114464u(c16879a, this.f85344d, this.f85342b != null, this.f85341a, this.f85348h);
        DrmInitData drmInitDataM114460i = m114460i(c16879a.f96942c);
        if (drmInitDataM114460i != null) {
            int size = this.f85344d.size();
            for (int i = 0; i < size; i++) {
                this.f85344d.valueAt(i).m114495n(drmInitDataM114460i);
            }
        }
        if (this.f85363w != -9223372036854775807L) {
            int size2 = this.f85344d.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f85344d.valueAt(i2).m114493l(this.f85363w);
            }
            this.f85363w = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m114480r(f31.C16879a c16879a) throws ParserException {
        int i = 0;
        w11.m204372h(this.f85342b == null, "Unexpected moov box.");
        DrmInitData drmInitDataM114460i = m114460i(c16879a.f96942c);
        f31.C16879a c16879a2 = (f31.C16879a) w11.m204369e(c16879a.m123702f(1836475768));
        SparseArray<asd> sparseArray = new SparseArray<>();
        int size = c16879a2.f96942c.size();
        long jM114463t = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            f31.C16880b c16880b = c16879a2.f96942c.get(i2);
            int i3 = c16880b.f96940a;
            if (i3 == 1953654136) {
                Pair<Integer, asd> pairM114449E = m114449E(c16880b.f96944b);
                sparseArray.put(((Integer) pairM114449E.first).intValue(), (asd) pairM114449E.second);
            } else if (i3 == 1835362404) {
                jM114463t = m114463t(c16880b.f96944b);
            }
        }
        List<ufj0> listM128669B = g31.m128669B(c16879a, new ilj(), jM114463t, drmInitDataM114460i, (this.f85341a & 16) != 0, false, new adj() { // from class: l.c6j
            @Override // p153l.adj
            public final Object apply(Object obj) {
                return this.f79974a.m114475m((yej0) obj);
            }
        });
        int size2 = listM128669B.size();
        if (this.f85344d.size() != 0) {
            w11.m204371g(this.f85344d.size() == size2);
            while (i < size2) {
                ufj0 ufj0Var = listM128669B.get(i);
                yej0 yej0Var = ufj0Var.f178773a;
                this.f85344d.get(yej0Var.f199366a).m114491j(ufj0Var, m114473g(sparseArray, yej0Var.f199366a));
                i++;
            }
            return;
        }
        while (i < size2) {
            ufj0 ufj0Var2 = listM128669B.get(i);
            yej0 yej0Var2 = ufj0Var2.f178773a;
            this.f85344d.put(yej0Var2.f199366a, new C16465b(this.f85337E.mo11416b(i, yej0Var2.f199367b), ufj0Var2, m114473g(sparseArray, yej0Var2.f199366a)));
            this.f85364x = Math.max(this.f85364x, yej0Var2.f199370e);
            i++;
        }
        this.f85337E.mo11425l();
    }

    /* JADX INFO: renamed from: s */
    public final void m114481s(long j) {
        while (!this.f85354n.isEmpty()) {
            C16464a c16464aRemoveFirst = this.f85354n.removeFirst();
            this.f85362v -= c16464aRemoveFirst.f85369c;
            long jM133173a = c16464aRemoveFirst.f85367a;
            if (c16464aRemoveFirst.f85368b) {
                jM133173a += j;
            }
            h0j0 h0j0Var = this.f85350j;
            if (h0j0Var != null) {
                jM133173a = h0j0Var.m133173a(jM133173a);
            }
            long j2 = jM133173a;
            for (qfj0 qfj0Var : this.f85338F) {
                qfj0Var.mo11163a(j2, 1, c16464aRemoveFirst.f85369c, this.f85362v, null);
            }
        }
    }

    @Override // p153l.zrf
    public void release() {
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public yej0 m114475m(@Nullable yej0 yej0Var) {
        return yej0Var;
    }

    public d6j(int i) {
        this(i, null);
    }

    public d6j(int i, @Nullable h0j0 h0j0Var) {
        this(i, h0j0Var, null, Collections.EMPTY_LIST);
    }

    public d6j(int i, @Nullable h0j0 h0j0Var, @Nullable yej0 yej0Var) {
        this(i, h0j0Var, yej0Var, Collections.EMPTY_LIST);
    }

    public d6j(int i, @Nullable h0j0 h0j0Var, @Nullable yej0 yej0Var, List<C1894k> list) {
        this(i, h0j0Var, yej0Var, list, null);
    }

    public d6j() {
        this(0);
    }
}
