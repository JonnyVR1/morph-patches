package p149l;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xtk implements dse {

    /* JADX INFO: renamed from: q */
    public static final double[] f194395q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a */
    public String f194396a;

    /* JADX INFO: renamed from: b */
    public m6j0 f194397b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final v4k0 f194398c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final d860 f194399d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final a320 f194400e;

    /* JADX INFO: renamed from: f */
    public final boolean[] f194401f;

    /* JADX INFO: renamed from: g */
    public final C21215a f194402g;

    /* JADX INFO: renamed from: h */
    public long f194403h;

    /* JADX INFO: renamed from: i */
    public boolean f194404i;

    /* JADX INFO: renamed from: j */
    public boolean f194405j;

    /* JADX INFO: renamed from: k */
    public long f194406k;

    /* JADX INFO: renamed from: l */
    public long f194407l;

    /* JADX INFO: renamed from: m */
    public long f194408m;

    /* JADX INFO: renamed from: n */
    public long f194409n;

    /* JADX INFO: renamed from: o */
    public boolean f194410o;

    /* JADX INFO: renamed from: p */
    public boolean f194411p;

    /* JADX INFO: renamed from: l.xtk$a */
    public static final class C21215a {

        /* JADX INFO: renamed from: e */
        public static final byte[] f194412e = {0, 0, 1};

        /* JADX INFO: renamed from: a */
        public boolean f194413a;

        /* JADX INFO: renamed from: b */
        public int f194414b;

        /* JADX INFO: renamed from: c */
        public int f194415c;

        /* JADX INFO: renamed from: d */
        public byte[] f194416d;

        public C21215a(int i) {
            this.f194416d = new byte[i];
        }

        /* JADX INFO: renamed from: a */
        public void m210975a(byte[] bArr, int i, int i2) {
            if (this.f194413a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f194416d;
                int length = bArr2.length;
                int i4 = this.f194414b;
                if (length < i4 + i3) {
                    this.f194416d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f194416d, this.f194414b, i3);
                this.f194414b += i3;
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m210976b(int i, int i2) {
            if (this.f194413a) {
                int i3 = this.f194414b - i2;
                this.f194414b = i3;
                if (this.f194415c != 0 || i != 181) {
                    this.f194413a = false;
                    return true;
                }
                this.f194415c = i3;
            } else if (i == 179) {
                this.f194413a = true;
            }
            byte[] bArr = f194412e;
            m210975a(bArr, 0, bArr.length);
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m210977c() {
            this.f194413a = false;
            this.f194414b = 0;
            this.f194415c = 0;
        }
    }

    public xtk(@Nullable v4k0 v4k0Var) {
        this.f194398c = v4k0Var;
        this.f194401f = new boolean[4];
        this.f194402g = new C21215a(128);
        if (v4k0Var != null) {
            this.f194400e = new a320(178, 128);
            this.f194399d = new d860();
        } else {
            this.f194400e = null;
            this.f194399d = null;
        }
        this.f194407l = -9223372036854775807L;
        this.f194409n = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    /* JADX INFO: renamed from: f */
    public static Pair<C1871k, Long> m210974f(C21215a c21215a, String str) {
        float f;
        int i;
        float f2;
        int i2;
        long j;
        double[] dArr;
        double d;
        int i3;
        int i4;
        byte[] bArrCopyOf = Arrays.copyOf(c21215a.f194416d, c21215a.f194414b);
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
                C1871k c1871kM10320G = new C1871k.b().m10334U(str).m10346g0("video/mpeg2").m10353n0(i6).m10332S(i7).m10342c0(f2).m10335V(Collections.singletonList(bArrCopyOf)).m10320G();
                i2 = (bArrCopyOf[7] & 15) - 1;
                if (i2 >= 0) {
                    dArr = f194395q;
                    if (i2 < dArr.length) {
                        d = dArr[i2];
                        byte b2 = bArrCopyOf[c21215a.f194415c + 9];
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
                return Pair.create(c1871kM10320G, Long.valueOf(j));
            }
            f = i7 * 16;
            i = i6 * 9;
        }
        f2 = f / i;
        C1871k c1871kM10320G2 = new C1871k.b().m10334U(str).m10346g0("video/mpeg2").m10353n0(i6).m10332S(i7).m10342c0(f2).m10335V(Collections.singletonList(bArrCopyOf)).m10320G();
        i2 = (bArrCopyOf[7] & 15) - 1;
        if (i2 >= 0) {
            dArr = f194395q;
            if (i2 < dArr.length) {
                d = dArr[i2];
                byte b3 = bArrCopyOf[c21215a.f194415c + 9];
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
        return Pair.create(c1871kM10320G2, Long.valueOf(j));
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
    @Override // p149l.dse
    /* JADX INFO: renamed from: a */
    public void mo95480a(d860 d860Var) {
        boolean z;
        int i;
        p11.m167015i(this.f194397b);
        int iM110300f = d860Var.m110300f();
        int iM110301g = d860Var.m110301g();
        byte[] bArrM110299e = d860Var.m110299e();
        this.f194403h += (long) d860Var.m110295a();
        this.f194397b.m153238d(d860Var, d860Var.m110295a());
        while (true) {
            int iM100040c = b320.m100040c(bArrM110299e, iM110300f, iM110301g, this.f194401f);
            if (iM100040c == iM110301g) {
                break;
            }
            int i2 = iM100040c + 3;
            int i3 = d860Var.m110299e()[i2] & 255;
            int i4 = iM100040c - iM110300f;
            if (!this.f194405j) {
                if (i4 > 0) {
                    this.f194402g.m210975a(bArrM110299e, iM110300f, iM100040c);
                }
                if (this.f194402g.m210976b(i3, i4 < 0 ? -i4 : 0)) {
                    Pair<C1871k, Long> pairM210974f = m210974f(this.f194402g, (String) p11.m167011e(this.f194396a));
                    this.f194397b.mo11110b((C1871k) pairM210974f.first);
                    this.f194406k = ((Long) pairM210974f.second).longValue();
                    this.f194405j = true;
                }
            }
            a320 a320Var = this.f194400e;
            if (a320Var != null) {
                if (i4 > 0) {
                    a320Var.m94637a(bArrM110299e, iM110300f, iM100040c);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (this.f194400e.m94638b(i)) {
                    a320 a320Var2 = this.f194400e;
                    ((d860) vck0.m197866j(this.f194399d)).m110290S(this.f194400e.f67316d, b320.m100054q(a320Var2.f67316d, a320Var2.f67317e));
                    ((v4k0) vck0.m197866j(this.f194398c)).m196997a(this.f194409n, this.f194399d);
                }
                if (i3 == 178 && d860Var.m110299e()[iM100040c + 2] == 1) {
                    this.f194400e.m94641e(i3);
                }
            }
            if (i3 == 0 || i3 == 179) {
                int i5 = iM110301g - iM100040c;
                if (this.f194411p && this.f194405j) {
                    long j = this.f194409n;
                    if (j != -9223372036854775807L) {
                        this.f194397b.mo11109a(j, this.f194410o ? 1 : 0, ((int) (this.f194403h - this.f194408m)) - i5, i5, null);
                    }
                }
                if (!this.f194404i || this.f194411p) {
                    this.f194408m = this.f194403h - ((long) i5);
                    long j2 = this.f194407l;
                    if (j2 == -9223372036854775807L) {
                        long j3 = this.f194409n;
                        j2 = j3 != -9223372036854775807L ? j3 + this.f194406k : -9223372036854775807L;
                    }
                    this.f194409n = j2;
                    this.f194410o = false;
                    this.f194407l = -9223372036854775807L;
                    z = true;
                    this.f194404i = true;
                } else {
                    z = true;
                }
                this.f194411p = i3 == 0 ? z : false;
            } else {
                if (i3 == 184) {
                    this.f194410o = true;
                }
                iM110301g = iM110301g;
            }
            iM110301g = iM110301g;
            iM110300f = i2;
        }
        if (!this.f194405j) {
            this.f194402g.m210975a(bArrM110299e, iM110300f, iM110301g);
        }
        a320 a320Var3 = this.f194400e;
        if (a320Var3 != null) {
            a320Var3.m94637a(bArrM110299e, iM110300f, iM110301g);
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: b */
    public void mo95481b() {
        b320.m100038a(this.f194401f);
        this.f194402g.m210977c();
        a320 a320Var = this.f194400e;
        if (a320Var != null) {
            a320Var.m94640d();
        }
        this.f194403h = 0L;
        this.f194404i = false;
        this.f194407l = -9223372036854775807L;
        this.f194409n = -9223372036854775807L;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: d */
    public void mo95483d(long j, int i) {
        this.f194407l = j;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: e */
    public void mo95484e(uqf uqfVar, fbj0.C16793d c16793d) {
        c16793d.m120357a();
        this.f194396a = c16793d.m120358b();
        this.f194397b = uqfVar.mo11362b(c16793d.m120359c(), 2);
        v4k0 v4k0Var = this.f194398c;
        if (v4k0Var != null) {
            v4k0Var.m196998b(uqfVar, c16793d);
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: c */
    public void mo95482c() {
    }

    public xtk() {
        this(null);
    }
}
