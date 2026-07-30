package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nwk implements hte {

    /* JADX INFO: renamed from: q */
    public static final double[] f143962q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a */
    public String f143963a;

    /* JADX INFO: renamed from: b */
    public qfj0 f143964b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final bek0 f143965c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final ig60 f143966d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final ib20 f143967e;

    /* JADX INFO: renamed from: f */
    public final boolean[] f143968f;

    /* JADX INFO: renamed from: g */
    public final C18966a f143969g;

    /* JADX INFO: renamed from: h */
    public long f143970h;

    /* JADX INFO: renamed from: i */
    public boolean f143971i;

    /* JADX INFO: renamed from: j */
    public boolean f143972j;

    /* JADX INFO: renamed from: k */
    public long f143973k;

    /* JADX INFO: renamed from: l */
    public long f143974l;

    /* JADX INFO: renamed from: m */
    public long f143975m;

    /* JADX INFO: renamed from: n */
    public long f143976n;

    /* JADX INFO: renamed from: o */
    public boolean f143977o;

    /* JADX INFO: renamed from: p */
    public boolean f143978p;

    /* JADX INFO: renamed from: l.nwk$a */
    public static final class C18966a {

        /* JADX INFO: renamed from: e */
        public static final byte[] f143979e = {0, 0, 1};

        /* JADX INFO: renamed from: a */
        public boolean f143980a;

        /* JADX INFO: renamed from: b */
        public int f143981b;

        /* JADX INFO: renamed from: c */
        public int f143982c;

        /* JADX INFO: renamed from: d */
        public byte[] f143983d;

        public C18966a(int i) {
            this.f143983d = new byte[i];
        }

        /* JADX INFO: renamed from: a */
        public void m164994a(byte[] bArr, int i, int i2) {
            if (this.f143980a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f143983d;
                int length = bArr2.length;
                int i4 = this.f143981b;
                if (length < i4 + i3) {
                    this.f143983d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f143983d, this.f143981b, i3);
                this.f143981b += i3;
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m164995b(int i, int i2) {
            if (this.f143980a) {
                int i3 = this.f143981b - i2;
                this.f143981b = i3;
                if (this.f143982c != 0 || i != 181) {
                    this.f143980a = false;
                    return true;
                }
                this.f143982c = i3;
            } else if (i == 179) {
                this.f143980a = true;
            }
            byte[] bArr = f143979e;
            m164994a(bArr, 0, bArr.length);
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m164996c() {
            this.f143980a = false;
            this.f143981b = 0;
            this.f143982c = 0;
        }
    }

    public nwk(@Nullable bek0 bek0Var) {
        this.f143965c = bek0Var;
        this.f143968f = new boolean[4];
        this.f143969g = new C18966a(128);
        if (bek0Var != null) {
            this.f143967e = new ib20(178, 128);
            this.f143966d = new ig60();
        } else {
            this.f143967e = null;
            this.f143966d = null;
        }
        this.f143974l = -9223372036854775807L;
        this.f143976n = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    /* JADX INFO: renamed from: f */
    public static Pair<C1894k, Long> m164993f(C18966a c18966a, String str) {
        float f;
        int i;
        float f2;
        int i2;
        long j;
        double[] dArr;
        double d;
        int i3;
        int i4;
        byte[] bArrCopyOf = Arrays.copyOf(c18966a.f143983d, c18966a.f143981b);
        int i5 = bArrCopyOf[4] & 255;
        byte b = bArrCopyOf[5];
        int i6 = (i5 << 4) | ((b & 255) >> 4);
        int i7 = ((b & 15) << 8) | (bArrCopyOf[6] & 255);
        int i8 = (bArrCopyOf[7] & 240) >> 4;
        if (i8 == 2) {
            f = i7 * 4;
            i = i6 * 3;
        } else {
            if (i8 != 3) {
                if (i8 != 4) {
                    f2 = 1.0f;
                } else {
                    f = i7 * 121;
                    i = i6 * 100;
                }
                C1894k c1894kM10374G = new C1894k.b().m10388U(str).m10400g0("video/mpeg2").m10407n0(i6).m10386S(i7).m10396c0(f2).m10389V(Collections.singletonList(bArrCopyOf)).m10374G();
                i2 = (bArrCopyOf[7] & 15) - 1;
                if (i2 >= 0) {
                    dArr = f143962q;
                    if (i2 < dArr.length) {
                        d = dArr[i2];
                        byte b2 = bArrCopyOf[c18966a.f143982c + 9];
                        i3 = (b2 & 96) >> 5;
                        i4 = b2 & 31;
                        if (i3 != i4) {
                            d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                        }
                        j = (long) (1000000.0d / d);
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                return Pair.create(c1894kM10374G, Long.valueOf(j));
            }
            f = i7 * 16;
            i = i6 * 9;
        }
        f2 = f / i;
        C1894k c1894kM10374G2 = new C1894k.b().m10388U(str).m10400g0("video/mpeg2").m10407n0(i6).m10386S(i7).m10396c0(f2).m10389V(Collections.singletonList(bArrCopyOf)).m10374G();
        i2 = (bArrCopyOf[7] & 15) - 1;
        if (i2 >= 0) {
            dArr = f143962q;
            if (i2 < dArr.length) {
                d = dArr[i2];
                byte b3 = bArrCopyOf[c18966a.f143982c + 9];
                i3 = (b3 & 96) >> 5;
                i4 = b3 & 31;
                if (i3 != i4) {
                    d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                }
                j = (long) (1000000.0d / d);
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        return Pair.create(c1894kM10374G2, Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p153l.hte
    /* JADX INFO: renamed from: a */
    public void mo108399a(ig60 ig60Var) {
        boolean z;
        int i;
        w11.m204373i(this.f143964b);
        int iM139816f = ig60Var.m139816f();
        int iM139817g = ig60Var.m139817g();
        byte[] bArrM139815e = ig60Var.m139815e();
        this.f143970h += (long) ig60Var.m139811a();
        this.f143964b.m176370d(ig60Var, ig60Var.m139811a());
        while (true) {
            int iM144185c = jb20.m144185c(bArrM139815e, iM139816f, iM139817g, this.f143968f);
            if (iM144185c == iM139817g) {
                break;
            }
            int i2 = iM144185c + 3;
            int i3 = ig60Var.m139815e()[i2] & 255;
            int i4 = iM144185c - iM139816f;
            if (!this.f143972j) {
                if (i4 > 0) {
                    this.f143969g.m164994a(bArrM139815e, iM139816f, iM144185c);
                }
                if (this.f143969g.m164995b(i3, i4 < 0 ? -i4 : 0)) {
                    Pair<C1894k, Long> pairM164993f = m164993f(this.f143969g, (String) w11.m204369e(this.f143963a));
                    this.f143964b.mo11164b((C1894k) pairM164993f.first);
                    this.f143973k = ((Long) pairM164993f.second).longValue();
                    this.f143972j = true;
                }
            }
            ib20 ib20Var = this.f143967e;
            if (ib20Var != null) {
                if (i4 > 0) {
                    ib20Var.m139234a(bArrM139815e, iM139816f, iM144185c);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (this.f143967e.m139235b(i)) {
                    ib20 ib20Var2 = this.f143967e;
                    ((ig60) bmk0.m105144j(this.f143966d)).m139806S(this.f143967e.f113652d, jb20.m144199q(ib20Var2.f113652d, ib20Var2.f113653e));
                    ((bek0) bmk0.m105144j(this.f143965c)).m103710a(this.f143976n, this.f143966d);
                }
                if (i3 == 178 && ig60Var.m139815e()[iM144185c + 2] == 1) {
                    this.f143967e.m139238e(i3);
                }
            }
            if (i3 == 0 || i3 == 179) {
                int i5 = iM139817g - iM144185c;
                if (this.f143978p && this.f143972j) {
                    long j = this.f143976n;
                    if (j != -9223372036854775807L) {
                        this.f143964b.mo11163a(j, this.f143977o ? 1 : 0, ((int) (this.f143970h - this.f143975m)) - i5, i5, null);
                    }
                }
                if (!this.f143971i || this.f143978p) {
                    this.f143975m = this.f143970h - ((long) i5);
                    long j2 = this.f143974l;
                    if (j2 == -9223372036854775807L) {
                        long j3 = this.f143976n;
                        j2 = j3 != -9223372036854775807L ? j3 + this.f143973k : -9223372036854775807L;
                    }
                    this.f143976n = j2;
                    this.f143977o = false;
                    this.f143974l = -9223372036854775807L;
                    z = true;
                    this.f143971i = true;
                } else {
                    z = true;
                }
                this.f143978p = i3 == 0 ? z : false;
            } else {
                if (i3 == 184) {
                    this.f143977o = true;
                }
                iM139817g = iM139817g;
            }
            iM139817g = iM139817g;
            iM139816f = i2;
        }
        if (!this.f143972j) {
            this.f143969g.m164994a(bArrM139815e, iM139816f, iM139817g);
        }
        ib20 ib20Var3 = this.f143967e;
        if (ib20Var3 != null) {
            ib20Var3.m139234a(bArrM139815e, iM139816f, iM139817g);
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: b */
    public void mo108400b() {
        jb20.m144183a(this.f143968f);
        this.f143969g.m164996c();
        ib20 ib20Var = this.f143967e;
        if (ib20Var != null) {
            ib20Var.m139237d();
        }
        this.f143970h = 0L;
        this.f143971i = false;
        this.f143974l = -9223372036854775807L;
        this.f143976n = -9223372036854775807L;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: d */
    public void mo108402d(long j, int i) {
        this.f143974l = j;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: e */
    public void mo108403e(bsf bsfVar, jkj0.C17969d c17969d) {
        c17969d.m145854a();
        this.f143963a = c17969d.m145855b();
        this.f143964b = bsfVar.mo11416b(c17969d.m145856c(), 2);
        bek0 bek0Var = this.f143965c;
        if (bek0Var != null) {
            bek0Var.m103711b(bsfVar, c17969d);
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: c */
    public void mo108401c() {
    }

    public nwk() {
        this(null);
    }
}
