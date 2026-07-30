package p149l;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
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
public class i3j implements sqf {

    /* JADX INFO: renamed from: I */
    public static final xqf f111288I = new xqf() { // from class: l.g3j
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return i3j.m134224c();
        }
    };

    /* JADX INFO: renamed from: J */
    public static final byte[] f111289J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: K */
    public static final C1871k f111290K = new C1871k.b().m10346g0("application/x-emsg").m10320G();

    /* JADX INFO: renamed from: A */
    public int f111291A;

    /* JADX INFO: renamed from: B */
    public int f111292B;

    /* JADX INFO: renamed from: C */
    public int f111293C;

    /* JADX INFO: renamed from: D */
    public boolean f111294D;

    /* JADX INFO: renamed from: E */
    public uqf f111295E;

    /* JADX INFO: renamed from: F */
    public m6j0[] f111296F;

    /* JADX INFO: renamed from: G */
    public m6j0[] f111297G;

    /* JADX INFO: renamed from: H */
    public boolean f111298H;

    /* JADX INFO: renamed from: a */
    public final int f111299a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final u5j0 f111300b;

    /* JADX INFO: renamed from: c */
    public final List<C1871k> f111301c;

    /* JADX INFO: renamed from: d */
    public final SparseArray<C17474b> f111302d;

    /* JADX INFO: renamed from: e */
    public final d860 f111303e;

    /* JADX INFO: renamed from: f */
    public final d860 f111304f;

    /* JADX INFO: renamed from: g */
    public final d860 f111305g;

    /* JADX INFO: renamed from: h */
    public final byte[] f111306h;

    /* JADX INFO: renamed from: i */
    public final d860 f111307i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final eri0 f111308j;

    /* JADX INFO: renamed from: k */
    public final z3f f111309k;

    /* JADX INFO: renamed from: l */
    public final d860 f111310l;

    /* JADX INFO: renamed from: m */
    public final ArrayDeque<y21.C21284a> f111311m;

    /* JADX INFO: renamed from: n */
    public final ArrayDeque<C17473a> f111312n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public final m6j0 f111313o;

    /* JADX INFO: renamed from: p */
    public int f111314p;

    /* JADX INFO: renamed from: q */
    public int f111315q;

    /* JADX INFO: renamed from: r */
    public long f111316r;

    /* JADX INFO: renamed from: s */
    public int f111317s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public d860 f111318t;

    /* JADX INFO: renamed from: u */
    public long f111319u;

    /* JADX INFO: renamed from: v */
    public int f111320v;

    /* JADX INFO: renamed from: w */
    public long f111321w;

    /* JADX INFO: renamed from: x */
    public long f111322x;

    /* JADX INFO: renamed from: y */
    public long f111323y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public C17474b f111324z;

    /* JADX INFO: renamed from: l.i3j$a */
    public static final class C17473a {

        /* JADX INFO: renamed from: a */
        public final long f111325a;

        /* JADX INFO: renamed from: b */
        public final boolean f111326b;

        /* JADX INFO: renamed from: c */
        public final int f111327c;

        public C17473a(long j, boolean z, int i) {
            this.f111325a = j;
            this.f111326b = z;
            this.f111327c = i;
        }
    }

    /* JADX INFO: renamed from: l.i3j$b */
    public static final class C17474b {

        /* JADX INFO: renamed from: a */
        public final m6j0 f111328a;

        /* JADX INFO: renamed from: d */
        public q6j0 f111331d;

        /* JADX INFO: renamed from: e */
        public lqd f111332e;

        /* JADX INFO: renamed from: f */
        public int f111333f;

        /* JADX INFO: renamed from: g */
        public int f111334g;

        /* JADX INFO: renamed from: h */
        public int f111335h;

        /* JADX INFO: renamed from: i */
        public int f111336i;

        /* JADX INFO: renamed from: l */
        public boolean f111339l;

        /* JADX INFO: renamed from: b */
        public final x5j0 f111329b = new x5j0();

        /* JADX INFO: renamed from: c */
        public final d860 f111330c = new d860();

        /* JADX INFO: renamed from: j */
        public final d860 f111337j = new d860(1);

        /* JADX INFO: renamed from: k */
        public final d860 f111338k = new d860();

        public C17474b(m6j0 m6j0Var, q6j0 q6j0Var, lqd lqdVar) {
            this.f111328a = m6j0Var;
            this.f111331d = q6j0Var;
            this.f111332e = lqdVar;
            m134258j(q6j0Var, lqdVar);
        }

        /* JADX INFO: renamed from: c */
        public int m134251c() {
            int i;
            if (this.f111339l) {
                i = this.f111329b.f191161k[this.f111333f] ? 1 : 0;
            } else {
                i = this.f111331d.f152917g[this.f111333f];
            }
            return m134255g() != null ? 1073741824 | i : i;
        }

        /* JADX INFO: renamed from: d */
        public long m134252d() {
            return !this.f111339l ? this.f111331d.f152913c[this.f111333f] : this.f111329b.f191157g[this.f111335h];
        }

        /* JADX INFO: renamed from: e */
        public long m134253e() {
            return !this.f111339l ? this.f111331d.f152916f[this.f111333f] : this.f111329b.m207088c(this.f111333f);
        }

        /* JADX INFO: renamed from: f */
        public int m134254f() {
            return !this.f111339l ? this.f111331d.f152914d[this.f111333f] : this.f111329b.f191159i[this.f111333f];
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public v5j0 m134255g() {
            if (!this.f111339l) {
                return null;
            }
            int i = ((lqd) vck0.m197866j(this.f111329b.f191151a)).f129310a;
            v5j0 v5j0VarM191866a = this.f111329b.f191164n;
            if (v5j0VarM191866a == null) {
                v5j0VarM191866a = this.f111331d.f152911a.m191866a(i);
            }
            if (v5j0VarM191866a == null || !v5j0VarM191866a.f180057a) {
                return null;
            }
            return v5j0VarM191866a;
        }

        /* JADX INFO: renamed from: h */
        public boolean m134256h() {
            this.f111333f++;
            if (!this.f111339l) {
                return false;
            }
            int i = this.f111334g + 1;
            this.f111334g = i;
            int[] iArr = this.f111329b.f191158h;
            int i2 = this.f111335h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f111335h = i2 + 1;
            this.f111334g = 0;
            return false;
        }

        /* JADX INFO: renamed from: i */
        public int m134257i(int i, int i2) {
            d860 d860Var;
            v5j0 v5j0VarM134255g = m134255g();
            if (v5j0VarM134255g == null) {
                return 0;
            }
            int length = v5j0VarM134255g.f180060d;
            if (length != 0) {
                d860Var = this.f111329b.f191165o;
            } else {
                byte[] bArr = (byte[]) vck0.m197866j(v5j0VarM134255g.f180061e);
                this.f111338k.m110290S(bArr, bArr.length);
                d860 d860Var2 = this.f111338k;
                length = bArr.length;
                d860Var = d860Var2;
            }
            boolean zM207092g = this.f111329b.m207092g(this.f111333f);
            boolean z = zM207092g || i2 != 0;
            this.f111337j.m110299e()[0] = (byte) ((z ? 128 : 0) | length);
            this.f111337j.m110292U(0);
            this.f111328a.mo11112f(this.f111337j, 1, 1);
            this.f111328a.mo11112f(d860Var, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zM207092g) {
                this.f111330c.m110288Q(8);
                byte[] bArrM110299e = this.f111330c.m110299e();
                bArrM110299e[0] = 0;
                bArrM110299e[1] = 1;
                bArrM110299e[2] = (byte) ((i2 >> 8) & 255);
                bArrM110299e[3] = (byte) (i2 & 255);
                bArrM110299e[4] = (byte) ((i >> 24) & 255);
                bArrM110299e[5] = (byte) ((i >> 16) & 255);
                bArrM110299e[6] = (byte) ((i >> 8) & 255);
                bArrM110299e[7] = (byte) (i & 255);
                this.f111328a.mo11112f(this.f111330c, 8, 1);
                return length + 9;
            }
            d860 d860Var3 = this.f111329b.f191165o;
            int iM110285N = d860Var3.m110285N();
            d860Var3.m110293V(-2);
            int i3 = (iM110285N * 6) + 2;
            if (i2 != 0) {
                this.f111330c.m110288Q(i3);
                byte[] bArrM110299e2 = this.f111330c.m110299e();
                d860Var3.m110306l(bArrM110299e2, 0, i3);
                int i4 = (((bArrM110299e2[2] & 255) << 8) | (bArrM110299e2[3] & 255)) + i2;
                bArrM110299e2[2] = (byte) ((i4 >> 8) & 255);
                bArrM110299e2[3] = (byte) (i4 & 255);
                d860Var3 = this.f111330c;
            }
            this.f111328a.mo11112f(d860Var3, i3, 1);
            return length + 1 + i3;
        }

        /* JADX INFO: renamed from: j */
        public void m134258j(q6j0 q6j0Var, lqd lqdVar) {
            this.f111331d = q6j0Var;
            this.f111332e = lqdVar;
            this.f111328a.mo11110b(q6j0Var.f152911a.f174724f);
            m134259k();
        }

        /* JADX INFO: renamed from: k */
        public void m134259k() {
            this.f111329b.m207091f();
            this.f111333f = 0;
            this.f111335h = 0;
            this.f111334g = 0;
            this.f111336i = 0;
            this.f111339l = false;
        }

        /* JADX INFO: renamed from: l */
        public void m134260l(long j) {
            int i = this.f111333f;
            while (true) {
                x5j0 x5j0Var = this.f111329b;
                if (i >= x5j0Var.f191156f || x5j0Var.m207088c(i) > j) {
                    return;
                }
                if (this.f111329b.f191161k[i]) {
                    this.f111336i = i;
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: m */
        public void m134261m() {
            v5j0 v5j0VarM134255g = m134255g();
            if (v5j0VarM134255g == null) {
                return;
            }
            d860 d860Var = this.f111329b.f191165o;
            int i = v5j0VarM134255g.f180060d;
            if (i != 0) {
                d860Var.m110293V(i);
            }
            if (this.f111329b.m207092g(this.f111333f)) {
                d860Var.m110293V(d860Var.m110285N() * 6);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m134262n(DrmInitData drmInitData) {
            v5j0 v5j0VarM191866a = this.f111331d.f152911a.m191866a(((lqd) vck0.m197866j(this.f111329b.f191151a)).f129310a);
            this.f111328a.mo11110b(this.f111331d.f152911a.f174724f.m10282b().m10328O(drmInitData.m9898c(v5j0VarM191866a != null ? v5j0VarM191866a.f180058b : null)).m10320G());
        }
    }

    public i3j(int i, @Nullable eri0 eri0Var, @Nullable u5j0 u5j0Var, List<C1871k> list, @Nullable m6j0 m6j0Var) {
        this.f111299a = i;
        this.f111308j = eri0Var;
        this.f111300b = u5j0Var;
        this.f111301c = Collections.unmodifiableList(list);
        this.f111313o = m6j0Var;
        this.f111309k = new z3f();
        this.f111310l = new d860(16);
        this.f111303e = new d860(b320.f72762a);
        this.f111304f = new d860(5);
        this.f111305g = new d860();
        byte[] bArr = new byte[16];
        this.f111306h = bArr;
        this.f111307i = new d860(bArr);
        this.f111311m = new ArrayDeque<>();
        this.f111312n = new ArrayDeque<>();
        this.f111302d = new SparseArray<>();
        this.f111322x = -9223372036854775807L;
        this.f111321w = -9223372036854775807L;
        this.f111323y = -9223372036854775807L;
        this.f111295E = uqf.f177745i0;
        this.f111296F = new m6j0[0];
        this.f111297G = new m6j0[0];
    }

    /* JADX INFO: renamed from: A */
    public static Pair<Long, q35> m134212A(d860 d860Var, long j) throws ParserException {
        long jM110284M;
        long jM110284M2;
        d860Var.m110292U(8);
        int iM212343c = y21.m212343c(d860Var.m110311q());
        d860Var.m110293V(4);
        long jM110281J = d860Var.m110281J();
        if (iM212343c == 0) {
            jM110284M = d860Var.m110281J();
            jM110284M2 = d860Var.m110281J();
        } else {
            jM110284M = d860Var.m110284M();
            jM110284M2 = d860Var.m110284M();
        }
        long j2 = j + jM110284M2;
        long jM197832W0 = vck0.m197832W0(jM110284M, 1000000L, jM110281J);
        d860Var.m110293V(2);
        int iM110285N = d860Var.m110285N();
        int[] iArr = new int[iM110285N];
        long[] jArr = new long[iM110285N];
        long[] jArr2 = new long[iM110285N];
        long[] jArr3 = new long[iM110285N];
        long j3 = j2;
        long jM197832W1 = jM197832W0;
        int i = 0;
        while (i < iM110285N) {
            int iM110311q = d860Var.m110311q();
            if ((Integer.MIN_VALUE & iM110311q) != 0) {
                throw ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long jM110281J2 = d860Var.m110281J();
            iArr[i] = iM110311q & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            jArr[i] = j3;
            jArr3[i] = jM197832W1;
            jM110284M += jM110281J2;
            long[] jArr4 = jArr3;
            jM197832W1 = vck0.m197832W0(jM110284M, 1000000L, jM110281J);
            jArr2[i] = jM197832W1 - jArr4[i];
            d860Var.m110293V(4);
            j3 += (long) iArr[i];
            i++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jM197832W0), new q35(iArr, jArr, jArr2, jArr3));
    }

    /* JADX INFO: renamed from: B */
    public static long m134213B(d860 d860Var) {
        d860Var.m110292U(8);
        return y21.m212343c(d860Var.m110311q()) == 1 ? d860Var.m110284M() : d860Var.m110281J();
    }

    @Nullable
    /* JADX INFO: renamed from: C */
    public static C17474b m134214C(d860 d860Var, SparseArray<C17474b> sparseArray, boolean z) {
        d860Var.m110292U(8);
        int iM212342b = y21.m212342b(d860Var.m110311q());
        C17474b c17474bValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(d860Var.m110311q());
        if (c17474bValueAt == null) {
            return null;
        }
        if ((iM212342b & 1) != 0) {
            long jM110284M = d860Var.m110284M();
            x5j0 x5j0Var = c17474bValueAt.f111329b;
            x5j0Var.f191153c = jM110284M;
            x5j0Var.f191154d = jM110284M;
        }
        lqd lqdVar = c17474bValueAt.f111332e;
        c17474bValueAt.f111329b.f191151a = new lqd((iM212342b & 2) != 0 ? d860Var.m110311q() - 1 : lqdVar.f129310a, (iM212342b & 8) != 0 ? d860Var.m110311q() : lqdVar.f129311b, (iM212342b & 16) != 0 ? d860Var.m110311q() : lqdVar.f129312c, (iM212342b & 32) != 0 ? d860Var.m110311q() : lqdVar.f129313d);
        return c17474bValueAt;
    }

    /* JADX INFO: renamed from: D */
    public static void m134215D(y21.C21284a c21284a, SparseArray<C17474b> sparseArray, boolean z, int i, byte[] bArr) throws ParserException {
        C17474b c17474bM134214C = m134214C(((y21.C21285b) p11.m167011e(c21284a.m212347g(1952868452))).f195480b, sparseArray, z);
        if (c17474bM134214C == null) {
            return;
        }
        x5j0 x5j0Var = c17474bM134214C.f111329b;
        long j = x5j0Var.f191167q;
        boolean z2 = x5j0Var.f191168r;
        c17474bM134214C.m134259k();
        c17474bM134214C.f111339l = true;
        y21.C21285b c21285bM212347g = c21284a.m212347g(1952867444);
        if (c21285bM212347g == null || (i & 2) != 0) {
            x5j0Var.f191167q = j;
            x5j0Var.f191168r = z2;
        } else {
            x5j0Var.f191167q = m134213B(c21285bM212347g.f195480b);
            x5j0Var.f191168r = true;
        }
        m134218G(c21284a, c17474bM134214C, i);
        v5j0 v5j0VarM191866a = c17474bM134214C.f111331d.f152911a.m191866a(((lqd) p11.m167011e(x5j0Var.f191151a)).f129310a);
        y21.C21285b c21285bM212347g2 = c21284a.m212347g(1935763834);
        if (c21285bM212347g2 != null) {
            m134233w((v5j0) p11.m167011e(v5j0VarM191866a), c21285bM212347g2.f195480b, x5j0Var);
        }
        y21.C21285b c21285bM212347g3 = c21284a.m212347g(1935763823);
        if (c21285bM212347g3 != null) {
            m134232v(c21285bM212347g3.f195480b, x5j0Var);
        }
        y21.C21285b c21285bM212347g4 = c21284a.m212347g(1936027235);
        if (c21285bM212347g4 != null) {
            m134236z(c21285bM212347g4.f195480b, x5j0Var);
        }
        m134234x(c21284a, v5j0VarM191866a != null ? v5j0VarM191866a.f180058b : null, x5j0Var);
        int size = c21284a.f195478c.size();
        for (int i2 = 0; i2 < size; i2++) {
            y21.C21285b c21285b = c21284a.f195478c.get(i2);
            if (c21285b.f195476a == 1970628964) {
                m134219H(c21285b.f195480b, x5j0Var, bArr);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public static Pair<Integer, lqd> m134216E(d860 d860Var) {
        d860Var.m110292U(12);
        return Pair.create(Integer.valueOf(d860Var.m110311q()), new lqd(d860Var.m110311q() - 1, d860Var.m110311q(), d860Var.m110311q(), d860Var.m110311q()));
    }

    /* JADX INFO: renamed from: F */
    public static int m134217F(C17474b c17474b, int i, int i2, d860 d860Var, int i3) throws ParserException {
        int iM110311q;
        d860Var.m110292U(8);
        int iM212342b = y21.m212342b(d860Var.m110311q());
        u5j0 u5j0Var = c17474b.f111331d.f152911a;
        x5j0 x5j0Var = c17474b.f111329b;
        lqd lqdVar = (lqd) vck0.m197866j(x5j0Var.f191151a);
        x5j0Var.f191158h[i] = d860Var.m110283L();
        long[] jArr = x5j0Var.f191157g;
        long j = x5j0Var.f191153c;
        jArr[i] = j;
        if ((iM212342b & 1) != 0) {
            jArr[i] = j + ((long) d860Var.m110311q());
        }
        boolean z = (iM212342b & 4) != 0;
        int iM110311q2 = lqdVar.f129313d;
        if (z) {
            iM110311q2 = d860Var.m110311q();
        }
        boolean z2 = (iM212342b & 256) != 0;
        boolean z3 = (iM212342b & 512) != 0;
        boolean z4 = (iM212342b & 1024) != 0;
        boolean z5 = (iM212342b & 2048) != 0;
        long j2 = m134229l(u5j0Var) ? ((long[]) vck0.m197866j(u5j0Var.f174727i))[0] : 0L;
        int[] iArr = x5j0Var.f191159i;
        long[] jArr2 = x5j0Var.f191160j;
        boolean[] zArr = x5j0Var.f191161k;
        boolean z6 = z5;
        boolean z7 = u5j0Var.f174720b == 2 && (i2 & 1) != 0;
        int i4 = i3 + x5j0Var.f191158h[i];
        boolean z8 = z;
        long j3 = u5j0Var.f174721c;
        long j4 = x5j0Var.f191167q;
        int i5 = i3;
        while (i5 < i4) {
            int iM134225d = m134225d(z2 ? d860Var.m110311q() : lqdVar.f129311b);
            int iM134225d2 = m134225d(z3 ? d860Var.m110311q() : lqdVar.f129312c);
            if (z4) {
                iM110311q = d860Var.m110311q();
            } else {
                iM110311q = (i5 == 0 && z8) ? iM110311q2 : lqdVar.f129313d;
            }
            int i6 = i5;
            long jM197832W0 = vck0.m197832W0((((long) (z6 ? d860Var.m110311q() : 0)) + j4) - j2, 1000000L, j3);
            jArr2[i6] = jM197832W0;
            if (!x5j0Var.f191168r) {
                jArr2[i6] = jM197832W0 + c17474b.f111331d.f152918h;
            }
            iArr[i6] = iM134225d2;
            zArr[i6] = ((iM110311q >> 16) & 1) == 0 && (!z7 || i6 == 0);
            j4 += (long) iM134225d;
            i5 = i6 + 1;
            i4 = i4;
            z7 = z7;
        }
        int i7 = i4;
        x5j0Var.f191167q = j4;
        return i7;
    }

    /* JADX INFO: renamed from: G */
    public static void m134218G(y21.C21284a c21284a, C17474b c17474b, int i) throws ParserException {
        List<y21.C21285b> list = c21284a.f195478c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            y21.C21285b c21285b = list.get(i4);
            if (c21285b.f195476a == 1953658222) {
                d860 d860Var = c21285b.f195480b;
                d860Var.m110292U(12);
                int iM110283L = d860Var.m110283L();
                if (iM110283L > 0) {
                    i3 += iM110283L;
                    i2++;
                }
            }
        }
        c17474b.f111335h = 0;
        c17474b.f111334g = 0;
        c17474b.f111333f = 0;
        c17474b.f111329b.m207090e(i2, i3);
        int i5 = 0;
        int iM134217F = 0;
        for (int i6 = 0; i6 < size; i6++) {
            y21.C21285b c21285b2 = list.get(i6);
            if (c21285b2.f195476a == 1953658222) {
                iM134217F = m134217F(c17474b, i5, i, c21285b2.f195480b, iM134217F);
                i5++;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m134219H(d860 d860Var, x5j0 x5j0Var, byte[] bArr) throws ParserException {
        d860Var.m110292U(8);
        d860Var.m110306l(bArr, 0, 16);
        if (Arrays.equals(bArr, f111289J)) {
            m134235y(d860Var, 16, x5j0Var);
        }
    }

    /* JADX INFO: renamed from: I */
    private void m134220I(long j) throws ParserException {
        while (!this.f111311m.isEmpty() && this.f111311m.peek().f195477b == j) {
            m134243n(this.f111311m.pop());
        }
        m134226e();
    }

    /* JADX INFO: renamed from: J */
    private boolean m134221J(tqf tqfVar) throws IOException {
        if (this.f111317s == 0) {
            if (!tqfVar.mo150653c(this.f111310l.m110299e(), 0, 8, true)) {
                return false;
            }
            this.f111317s = 8;
            this.f111310l.m110292U(0);
            this.f111316r = this.f111310l.m110281J();
            this.f111315q = this.f111310l.m110311q();
        }
        long j = this.f111316r;
        if (j == 1) {
            tqfVar.readFully(this.f111310l.m110299e(), 8, 8);
            this.f111317s += 8;
            this.f111316r = this.f111310l.m110284M();
        } else if (j == 0) {
            long length = tqfVar.getLength();
            if (length == -1 && !this.f111311m.isEmpty()) {
                length = this.f111311m.peek().f195477b;
            }
            if (length != -1) {
                this.f111316r = (length - tqfVar.getPosition()) + ((long) this.f111317s);
            }
        }
        if (this.f111316r < this.f111317s) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = tqfVar.getPosition() - ((long) this.f111317s);
        int i = this.f111315q;
        if ((i == 1836019558 || i == 1835295092) && !this.f111298H) {
            this.f111295E.mo11370k(new hce0.C17275b(this.f111322x, position));
            this.f111298H = true;
        }
        if (this.f111315q == 1836019558) {
            int size = this.f111302d.size();
            for (int i2 = 0; i2 < size; i2++) {
                x5j0 x5j0Var = this.f111302d.valueAt(i2).f111329b;
                x5j0Var.f191152b = position;
                x5j0Var.f191154d = position;
                x5j0Var.f191153c = position;
            }
        }
        int i3 = this.f111315q;
        if (i3 == 1835295092) {
            this.f111324z = null;
            this.f111319u = position + this.f111316r;
            this.f111314p = 2;
            return true;
        }
        if (m134222N(i3)) {
            long position2 = (tqfVar.getPosition() + this.f111316r) - 8;
            this.f111311m.push(new y21.C21284a(this.f111315q, position2));
            if (this.f111316r == this.f111317s) {
                m134220I(position2);
            } else {
                m134226e();
            }
        } else if (m134223O(this.f111315q)) {
            if (this.f111317s != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f111316r > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            d860 d860Var = new d860((int) this.f111316r);
            System.arraycopy(this.f111310l.m110299e(), 0, d860Var.m110299e(), 0, 8);
            this.f111318t = d860Var;
            this.f111314p = 1;
        } else {
            if (this.f111316r > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f111318t = null;
            this.f111314p = 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: N */
    private static boolean m134222N(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* JADX INFO: renamed from: O */
    private static boolean m134223O(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m134224c() {
        return new sqf[]{new i3j()};
    }

    /* JADX INFO: renamed from: d */
    public static int m134225d(int i) throws ParserException {
        if (i >= 0) {
            return i;
        }
        throw ParserException.createForMalformedContainer("Unexpected negative value: " + i, null);
    }

    /* JADX INFO: renamed from: e */
    private void m134226e() {
        this.f111314p = 0;
        this.f111317s = 0;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static DrmInitData m134227i(List<y21.C21285b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            y21.C21285b c21285b = list.get(i);
            if (c21285b.f195476a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrM110299e = c21285b.f195480b.m110299e();
                UUID uuidM172220f = pza0.m172220f(bArrM110299e);
                if (uuidM172220f == null) {
                    jwv.m143689i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidM172220f, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, bArrM110299e));
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
    public static C17474b m134228j(SparseArray<C17474b> sparseArray) {
        int size = sparseArray.size();
        C17474b c17474b = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C17474b c17474bValueAt = sparseArray.valueAt(i);
            if ((c17474bValueAt.f111339l || c17474bValueAt.f111333f != c17474bValueAt.f111331d.f152912b) && (!c17474bValueAt.f111339l || c17474bValueAt.f111335h != c17474bValueAt.f111329b.f191155e)) {
                long jM134252d = c17474bValueAt.m134252d();
                if (jM134252d < j) {
                    c17474b = c17474bValueAt;
                    j = jM134252d;
                }
            }
        }
        return c17474b;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m134229l(u5j0 u5j0Var) {
        long[] jArr;
        long[] jArr2 = u5j0Var.f174726h;
        if (jArr2 != null && jArr2.length == 1 && (jArr = u5j0Var.f174727i) != null) {
            long j = jArr2[0];
            if (j == 0 || vck0.m197832W0(j + jArr[0], 1000000L, u5j0Var.f174722d) >= u5j0Var.f174723e) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static long m134230t(d860 d860Var) {
        d860Var.m110292U(8);
        return y21.m212343c(d860Var.m110311q()) == 0 ? d860Var.m110281J() : d860Var.m110284M();
    }

    /* JADX INFO: renamed from: u */
    public static void m134231u(y21.C21284a c21284a, SparseArray<C17474b> sparseArray, boolean z, int i, byte[] bArr) throws ParserException {
        int size = c21284a.f195479d.size();
        for (int i2 = 0; i2 < size; i2++) {
            y21.C21284a c21284a2 = c21284a.f195479d.get(i2);
            if (c21284a2.f195476a == 1953653094) {
                m134215D(c21284a2, sparseArray, z, i, bArr);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m134232v(d860 d860Var, x5j0 x5j0Var) throws ParserException {
        d860Var.m110292U(8);
        int iM110311q = d860Var.m110311q();
        if ((y21.m212342b(iM110311q) & 1) == 1) {
            d860Var.m110293V(8);
        }
        int iM110283L = d860Var.m110283L();
        if (iM110283L == 1) {
            x5j0Var.f191154d += y21.m212343c(iM110311q) == 0 ? d860Var.m110281J() : d860Var.m110284M();
        } else {
            throw ParserException.createForMalformedContainer("Unexpected saio entry count: " + iM110283L, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m134233w(v5j0 v5j0Var, d860 d860Var, x5j0 x5j0Var) throws ParserException {
        int i;
        int i2 = v5j0Var.f180060d;
        d860Var.m110292U(8);
        if ((y21.m212342b(d860Var.m110311q()) & 1) == 1) {
            d860Var.m110293V(8);
        }
        int iM110279H = d860Var.m110279H();
        int iM110283L = d860Var.m110283L();
        if (iM110283L > x5j0Var.f191156f) {
            throw ParserException.createForMalformedContainer("Saiz sample count " + iM110283L + " is greater than fragment sample count" + x5j0Var.f191156f, null);
        }
        if (iM110279H == 0) {
            boolean[] zArr = x5j0Var.f191163m;
            i = 0;
            for (int i3 = 0; i3 < iM110283L; i3++) {
                int iM110279H2 = d860Var.m110279H();
                i += iM110279H2;
                zArr[i3] = iM110279H2 > i2;
            }
        } else {
            i = iM110279H * iM110283L;
            Arrays.fill(x5j0Var.f191163m, 0, iM110283L, iM110279H > i2);
        }
        Arrays.fill(x5j0Var.f191163m, iM110283L, x5j0Var.f191156f, false);
        if (i > 0) {
            x5j0Var.m207089d(i);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m134234x(y21.C21284a c21284a, @Nullable String str, x5j0 x5j0Var) throws ParserException {
        byte[] bArr = null;
        d860 d860Var = null;
        d860 d860Var2 = null;
        for (int i = 0; i < c21284a.f195478c.size(); i++) {
            y21.C21285b c21285b = c21284a.f195478c.get(i);
            d860 d860Var3 = c21285b.f195480b;
            int i2 = c21285b.f195476a;
            if (i2 == 1935828848) {
                d860Var3.m110292U(12);
                if (d860Var3.m110311q() == 1936025959) {
                    d860Var = d860Var3;
                }
            } else if (i2 == 1936158820) {
                d860Var3.m110292U(12);
                if (d860Var3.m110311q() == 1936025959) {
                    d860Var2 = d860Var3;
                }
            }
        }
        if (d860Var == null || d860Var2 == null) {
            return;
        }
        d860Var.m110292U(8);
        int iM212343c = y21.m212343c(d860Var.m110311q());
        d860Var.m110293V(4);
        if (iM212343c == 1) {
            d860Var.m110293V(4);
        }
        if (d860Var.m110311q() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        d860Var2.m110292U(8);
        int iM212343c2 = y21.m212343c(d860Var2.m110311q());
        d860Var2.m110293V(4);
        if (iM212343c2 == 1) {
            if (d860Var2.m110281J() == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (iM212343c2 >= 2) {
            d860Var2.m110293V(4);
        }
        if (d860Var2.m110281J() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        d860Var2.m110293V(1);
        int iM110279H = d860Var2.m110279H();
        int i3 = (iM110279H & 240) >> 4;
        int i4 = iM110279H & 15;
        boolean z = d860Var2.m110279H() == 1;
        if (z) {
            int iM110279H2 = d860Var2.m110279H();
            byte[] bArr2 = new byte[16];
            d860Var2.m110306l(bArr2, 0, 16);
            if (iM110279H2 == 0) {
                int iM110279H3 = d860Var2.m110279H();
                bArr = new byte[iM110279H3];
                d860Var2.m110306l(bArr, 0, iM110279H3);
            }
            x5j0Var.f191162l = true;
            x5j0Var.f191164n = new v5j0(z, str, iM110279H2, bArr2, i3, i4, bArr);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m134235y(d860 d860Var, int i, x5j0 x5j0Var) throws ParserException {
        d860Var.m110292U(i + 8);
        int iM212342b = y21.m212342b(d860Var.m110311q());
        if ((iM212342b & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM212342b & 2) != 0;
        int iM110283L = d860Var.m110283L();
        if (iM110283L == 0) {
            Arrays.fill(x5j0Var.f191163m, 0, x5j0Var.f191156f, false);
            return;
        }
        if (iM110283L == x5j0Var.f191156f) {
            Arrays.fill(x5j0Var.f191163m, 0, iM110283L, z);
            x5j0Var.m207089d(d860Var.m110295a());
            x5j0Var.m207087b(d860Var);
        } else {
            throw ParserException.createForMalformedContainer("Senc sample count " + iM110283L + " is different from fragment sample count" + x5j0Var.f191156f, null);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m134236z(d860 d860Var, x5j0 x5j0Var) throws ParserException {
        m134235y(d860Var, 0, x5j0Var);
    }

    /* JADX INFO: renamed from: K */
    public final void m134237K(tqf tqfVar) throws IOException {
        int i = ((int) this.f111316r) - this.f111317s;
        d860 d860Var = this.f111318t;
        if (d860Var != null) {
            tqfVar.readFully(d860Var.m110299e(), 8, i);
            m134245p(new y21.C21285b(this.f111315q, d860Var), tqfVar.getPosition());
        } else {
            tqfVar.mo150661o(i);
        }
        m134220I(tqfVar.getPosition());
    }

    /* JADX INFO: renamed from: L */
    public final void m134238L(tqf tqfVar) throws IOException {
        int size = this.f111302d.size();
        long j = Long.MAX_VALUE;
        C17474b c17474bValueAt = null;
        for (int i = 0; i < size; i++) {
            x5j0 x5j0Var = this.f111302d.valueAt(i).f111329b;
            if (x5j0Var.f191166p) {
                long j2 = x5j0Var.f191154d;
                if (j2 < j) {
                    c17474bValueAt = this.f111302d.valueAt(i);
                    j = j2;
                }
            }
        }
        if (c17474bValueAt == null) {
            this.f111314p = 3;
            return;
        }
        int position = (int) (j - tqfVar.getPosition());
        if (position < 0) {
            throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        tqfVar.mo150661o(position);
        c17474bValueAt.f111329b.m207086a(tqfVar);
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
    public final boolean m134239M(tqf tqfVar) throws IOException {
        boolean z;
        int iM153239e;
        C17474b c17474bM134228j = this.f111324z;
        Throwable th = null;
        if (c17474bM134228j == null) {
            c17474bM134228j = m134228j(this.f111302d);
            if (c17474bM134228j == null) {
                int position = (int) (this.f111319u - tqfVar.getPosition());
                if (position < 0) {
                    throw ParserException.createForMalformedContainer("Offset to end of mdat was negative.", null);
                }
                tqfVar.mo150661o(position);
                m134226e();
                return false;
            }
            int iM134252d = (int) (c17474bM134228j.m134252d() - tqfVar.getPosition());
            if (iM134252d < 0) {
                jwv.m143689i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iM134252d = 0;
            }
            tqfVar.mo150661o(iM134252d);
            this.f111324z = c17474bM134228j;
        }
        int i = 4;
        int i2 = 1;
        if (this.f111314p == 3) {
            int iM134254f = c17474bM134228j.m134254f();
            this.f111291A = iM134254f;
            if (c17474bM134228j.f111333f < c17474bM134228j.f111336i) {
                tqfVar.mo150661o(iM134254f);
                c17474bM134228j.m134261m();
                if (!c17474bM134228j.m134256h()) {
                    this.f111324z = null;
                }
                this.f111314p = 3;
                return true;
            }
            if (c17474bM134228j.f111331d.f152911a.f174725g == 1) {
                this.f111291A = iM134254f - 8;
                tqfVar.mo150661o(8);
            }
            boolean zEquals = "audio/ac4".equals(c17474bM134228j.f111331d.f152911a.f174724f.f7748l);
            int i3 = this.f111291A;
            if (zEquals) {
                this.f111292B = c17474bM134228j.m134257i(i3, 7);
                C17507i9.m134993a(this.f111291A, this.f111307i);
                c17474bM134228j.f111328a.m153238d(this.f111307i, 7);
                this.f111292B += 7;
            } else {
                this.f111292B = c17474bM134228j.m134257i(i3, 0);
            }
            this.f111291A += this.f111292B;
            this.f111314p = 4;
            this.f111293C = 0;
        }
        u5j0 u5j0Var = c17474bM134228j.f111331d.f152911a;
        m6j0 m6j0Var = c17474bM134228j.f111328a;
        long jM134253e = c17474bM134228j.m134253e();
        eri0 eri0Var = this.f111308j;
        if (eri0Var != null) {
            jM134253e = eri0Var.m117836a(jM134253e);
        }
        if (u5j0Var.f174728j == 0) {
            z = 1;
            while (true) {
                int i4 = this.f111292B;
                int i5 = this.f111291A;
                if (i4 >= i5) {
                    break;
                }
                this.f111292B += m6j0Var.m153239e(tqfVar, i5 - i4, false);
            }
        } else {
            byte[] bArrM110299e = this.f111304f.m110299e();
            bArrM110299e[0] = 0;
            bArrM110299e[1] = 0;
            bArrM110299e[2] = 0;
            int i6 = u5j0Var.f174728j;
            int i7 = i6 + 1;
            int i8 = 4 - i6;
            while (this.f111292B < this.f111291A) {
                int i9 = this.f111293C;
                if (i9 == 0) {
                    tqfVar.readFully(bArrM110299e, i8, i7);
                    this.f111304f.m110292U(0);
                    int iM110311q = this.f111304f.m110311q();
                    if (iM110311q < i2) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", th);
                    }
                    this.f111293C = iM110311q - 1;
                    this.f111303e.m110292U(0);
                    m6j0Var.m153238d(this.f111303e, i);
                    m6j0Var.m153238d(this.f111304f, i2);
                    this.f111294D = (this.f111297G.length <= 0 || !b320.m100044g(u5j0Var.f174724f.f7748l, bArrM110299e[i])) ? 0 : i2;
                    this.f111292B += 5;
                    this.f111291A += i8;
                } else {
                    if (this.f111294D) {
                        this.f111305g.m110288Q(i9);
                        tqfVar.readFully(this.f111305g.m110299e(), 0, this.f111293C);
                        m6j0Var.m153238d(this.f111305g, this.f111293C);
                        iM153239e = this.f111293C;
                        int iM100054q = b320.m100054q(this.f111305g.m110299e(), this.f111305g.m110301g());
                        this.f111305g.m110292U("video/hevc".equals(u5j0Var.f174724f.f7748l) ? 1 : 0);
                        this.f111305g.m110291T(iM100054q);
                        nn4.m160189a(jM134253e, this.f111305g, this.f111297G);
                    } else {
                        iM153239e = m6j0Var.m153239e(tqfVar, i9, false);
                    }
                    this.f111292B += iM153239e;
                    this.f111293C -= iM153239e;
                    i2 = i2;
                    th = null;
                    i = 4;
                }
            }
            z = i2;
        }
        int iM134251c = c17474bM134228j.m134251c();
        v5j0 v5j0VarM134255g = c17474bM134228j.m134255g();
        m6j0Var.mo11109a(jM134253e, iM134251c, this.f111291A, 0, v5j0VarM134255g != null ? v5j0VarM134255g.f180059c : null);
        m134248s(jM134253e);
        if (!c17474bM134228j.m134256h()) {
            this.f111324z = null;
        }
        this.f111314p = 3;
        return z;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        int size = this.f111302d.size();
        for (int i = 0; i < size; i++) {
            this.f111302d.valueAt(i).m134259k();
        }
        this.f111312n.clear();
        this.f111320v = 0;
        this.f111321w = j2;
        this.f111311m.clear();
        m134226e();
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f111295E = uqfVar;
        m134226e();
        m134241k();
        u5j0 u5j0Var = this.f111300b;
        if (u5j0Var != null) {
            this.f111302d.put(0, new C17474b(uqfVar.mo11362b(0, u5j0Var.f174720b), new q6j0(this.f111300b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new lqd(0, 0, 0, 0)));
            this.f111295E.mo11371l();
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        return nkf0.m159837b(tqfVar);
    }

    /* JADX INFO: renamed from: g */
    public final lqd m134240g(SparseArray<lqd> sparseArray, int i) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (lqd) p11.m167011e(sparseArray.get(i));
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        while (true) {
            int i = this.f111314p;
            if (i != 0) {
                if (i == 1) {
                    m134237K(tqfVar);
                } else if (i == 2) {
                    m134238L(tqfVar);
                } else if (m134239M(tqfVar)) {
                    return 0;
                }
            } else if (!m134221J(tqfVar)) {
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m134241k() {
        int i;
        m6j0[] m6j0VarArr = new m6j0[2];
        this.f111296F = m6j0VarArr;
        m6j0 m6j0Var = this.f111313o;
        int i2 = 0;
        if (m6j0Var != null) {
            m6j0VarArr[0] = m6j0Var;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f111299a & 4) != 0) {
            m6j0VarArr[i] = this.f111295E.mo11362b(100, 5);
            i3 = 101;
            i++;
        }
        m6j0[] m6j0VarArr2 = (m6j0[]) vck0.m197816O0(this.f111296F, i);
        this.f111296F = m6j0VarArr2;
        for (m6j0 m6j0Var2 : m6j0VarArr2) {
            m6j0Var2.mo11110b(f111290K);
        }
        this.f111297G = new m6j0[this.f111301c.size()];
        while (i2 < this.f111297G.length) {
            m6j0 m6j0VarMo11362b = this.f111295E.mo11362b(i3, 3);
            m6j0VarMo11362b.mo11110b(this.f111301c.get(i2));
            this.f111297G[i2] = m6j0VarMo11362b;
            i2++;
            i3++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m134243n(y21.C21284a c21284a) throws ParserException {
        int i = c21284a.f195476a;
        if (i == 1836019574) {
            m134247r(c21284a);
        } else if (i == 1836019558) {
            m134246q(c21284a);
        } else {
            if (this.f111311m.isEmpty()) {
                return;
            }
            this.f111311m.peek().m212344d(c21284a);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m134244o(d860 d860Var) {
        String str;
        String str2;
        long jM197832W0;
        long jM197832W1;
        long jM110281J;
        long jM117836a;
        if (this.f111296F.length == 0) {
            return;
        }
        d860Var.m110292U(8);
        int iM212343c = y21.m212343c(d860Var.m110311q());
        if (iM212343c == 0) {
            str = (String) p11.m167011e(d860Var.m110273B());
            str2 = (String) p11.m167011e(d860Var.m110273B());
            long jM110281J2 = d860Var.m110281J();
            jM197832W0 = vck0.m197832W0(d860Var.m110281J(), 1000000L, jM110281J2);
            long j = this.f111323y;
            long j2 = j != -9223372036854775807L ? j + jM197832W0 : -9223372036854775807L;
            jM197832W1 = vck0.m197832W0(d860Var.m110281J(), 1000L, jM110281J2);
            jM110281J = d860Var.m110281J();
            jM117836a = j2;
        } else {
            if (iM212343c != 1) {
                jwv.m143689i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iM212343c);
                return;
            }
            long jM110281J3 = d860Var.m110281J();
            jM117836a = vck0.m197832W0(d860Var.m110284M(), 1000000L, jM110281J3);
            long jM197832W2 = vck0.m197832W0(d860Var.m110281J(), 1000L, jM110281J3);
            long jM110281J4 = d860Var.m110281J();
            str = (String) p11.m167011e(d860Var.m110273B());
            str2 = (String) p11.m167011e(d860Var.m110273B());
            jM197832W1 = jM197832W2;
            jM110281J = jM110281J4;
            jM197832W0 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[d860Var.m110295a()];
        d860Var.m110306l(bArr, 0, d860Var.m110295a());
        d860 d860Var2 = new d860(this.f111309k.m217031a(new EventMessage(str3, str4, jM197832W1, jM110281J, bArr)));
        int iM110295a = d860Var2.m110295a();
        for (m6j0 m6j0Var : this.f111296F) {
            d860Var2.m110292U(0);
            m6j0Var.m153238d(d860Var2, iM110295a);
        }
        ArrayDeque<C17473a> arrayDeque = this.f111312n;
        if (jM117836a == -9223372036854775807L) {
            arrayDeque.addLast(new C17473a(jM197832W0, true, iM110295a));
            this.f111320v += iM110295a;
            return;
        }
        if (!arrayDeque.isEmpty()) {
            this.f111312n.addLast(new C17473a(jM117836a, false, iM110295a));
            this.f111320v += iM110295a;
            return;
        }
        eri0 eri0Var = this.f111308j;
        if (eri0Var != null && !eri0Var.m117841f()) {
            this.f111312n.addLast(new C17473a(jM117836a, false, iM110295a));
            this.f111320v += iM110295a;
            return;
        }
        eri0 eri0Var2 = this.f111308j;
        if (eri0Var2 != null) {
            jM117836a = eri0Var2.m117836a(jM117836a);
        }
        long j3 = jM117836a;
        for (m6j0 m6j0Var2 : this.f111296F) {
            m6j0Var2.mo11109a(j3, 1, iM110295a, 0, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m134245p(y21.C21285b c21285b, long j) throws ParserException {
        if (!this.f111311m.isEmpty()) {
            this.f111311m.peek().m212345e(c21285b);
            return;
        }
        int i = c21285b.f195476a;
        if (i != 1936286840) {
            if (i == 1701671783) {
                m134244o(c21285b.f195480b);
            }
        } else {
            Pair<Long, q35> pairM134212A = m134212A(c21285b.f195480b, j);
            this.f111323y = ((Long) pairM134212A.first).longValue();
            this.f111295E.mo11370k((hce0) pairM134212A.second);
            this.f111298H = true;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m134246q(y21.C21284a c21284a) throws ParserException {
        m134231u(c21284a, this.f111302d, this.f111300b != null, this.f111299a, this.f111306h);
        DrmInitData drmInitDataM134227i = m134227i(c21284a.f195478c);
        if (drmInitDataM134227i != null) {
            int size = this.f111302d.size();
            for (int i = 0; i < size; i++) {
                this.f111302d.valueAt(i).m134262n(drmInitDataM134227i);
            }
        }
        if (this.f111321w != -9223372036854775807L) {
            int size2 = this.f111302d.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f111302d.valueAt(i2).m134260l(this.f111321w);
            }
            this.f111321w = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m134247r(y21.C21284a c21284a) throws ParserException {
        int i = 0;
        p11.m167014h(this.f111300b == null, "Unexpected moov box.");
        DrmInitData drmInitDataM134227i = m134227i(c21284a.f195478c);
        y21.C21284a c21284a2 = (y21.C21284a) p11.m167011e(c21284a.m212346f(1836475768));
        SparseArray<lqd> sparseArray = new SparseArray<>();
        int size = c21284a2.f195478c.size();
        long jM134230t = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            y21.C21285b c21285b = c21284a2.f195478c.get(i2);
            int i3 = c21285b.f195476a;
            if (i3 == 1953654136) {
                Pair<Integer, lqd> pairM134216E = m134216E(c21285b.f195480b);
                sparseArray.put(((Integer) pairM134216E.first).intValue(), (lqd) pairM134216E.second);
            } else if (i3 == 1835362404) {
                jM134230t = m134230t(c21285b.f195480b);
            }
        }
        List<q6j0> listM216827B = z21.m216827B(c21284a, new pij(), jM134230t, drmInitDataM134227i, (this.f111299a & 16) != 0, false, new gaj() { // from class: l.h3j
            @Override // p149l.gaj
            public final Object apply(Object obj) {
                return this.f105743a.m134242m((u5j0) obj);
            }
        });
        int size2 = listM216827B.size();
        if (this.f111302d.size() != 0) {
            p11.m167013g(this.f111302d.size() == size2);
            while (i < size2) {
                q6j0 q6j0Var = listM216827B.get(i);
                u5j0 u5j0Var = q6j0Var.f152911a;
                this.f111302d.get(u5j0Var.f174719a).m134258j(q6j0Var, m134240g(sparseArray, u5j0Var.f174719a));
                i++;
            }
            return;
        }
        while (i < size2) {
            q6j0 q6j0Var2 = listM216827B.get(i);
            u5j0 u5j0Var2 = q6j0Var2.f152911a;
            this.f111302d.put(u5j0Var2.f174719a, new C17474b(this.f111295E.mo11362b(i, u5j0Var2.f174720b), q6j0Var2, m134240g(sparseArray, u5j0Var2.f174719a)));
            this.f111322x = Math.max(this.f111322x, u5j0Var2.f174723e);
            i++;
        }
        this.f111295E.mo11371l();
    }

    /* JADX INFO: renamed from: s */
    public final void m134248s(long j) {
        while (!this.f111312n.isEmpty()) {
            C17473a c17473aRemoveFirst = this.f111312n.removeFirst();
            this.f111320v -= c17473aRemoveFirst.f111327c;
            long jM117836a = c17473aRemoveFirst.f111325a;
            if (c17473aRemoveFirst.f111326b) {
                jM117836a += j;
            }
            eri0 eri0Var = this.f111308j;
            if (eri0Var != null) {
                jM117836a = eri0Var.m117836a(jM117836a);
            }
            long j2 = jM117836a;
            for (m6j0 m6j0Var : this.f111296F) {
                m6j0Var.mo11109a(j2, 1, c17473aRemoveFirst.f111327c, this.f111320v, null);
            }
        }
    }

    @Override // p149l.sqf
    public void release() {
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public u5j0 m134242m(@Nullable u5j0 u5j0Var) {
        return u5j0Var;
    }

    public i3j(int i) {
        this(i, null);
    }

    public i3j(int i, @Nullable eri0 eri0Var) {
        this(i, eri0Var, null, Collections.EMPTY_LIST);
    }

    public i3j(int i, @Nullable eri0 eri0Var, @Nullable u5j0 u5j0Var) {
        this(i, eri0Var, u5j0Var, Collections.EMPTY_LIST);
    }

    public i3j(int i, @Nullable eri0 eri0Var, @Nullable u5j0 u5j0Var, List<C1871k> list) {
        this(i, eri0Var, u5j0Var, list, null);
    }

    public i3j() {
        this(0);
    }
}
