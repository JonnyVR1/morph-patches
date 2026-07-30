package p149l;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class fjr0 implements sir0 {

    /* JADX INFO: renamed from: q */
    public static final double[] f97846q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a */
    public String f97847a;

    /* JADX INFO: renamed from: b */
    public m7r0 f97848b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final dlr0 f97849c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final v6w0 f97850d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final sjr0 f97851e;

    /* JADX INFO: renamed from: f */
    public final boolean[] f97852f;

    /* JADX INFO: renamed from: g */
    public final tir0 f97853g;

    /* JADX INFO: renamed from: h */
    public long f97854h;

    /* JADX INFO: renamed from: i */
    public boolean f97855i;

    /* JADX INFO: renamed from: j */
    public boolean f97856j;

    /* JADX INFO: renamed from: k */
    public long f97857k;

    /* JADX INFO: renamed from: l */
    public long f97858l;

    /* JADX INFO: renamed from: m */
    public long f97859m;

    /* JADX INFO: renamed from: n */
    public long f97860n;

    /* JADX INFO: renamed from: o */
    public boolean f97861o;

    /* JADX INFO: renamed from: p */
    public boolean f97862p;

    public fjr0(@Nullable dlr0 dlr0Var) {
        v6w0 v6w0Var;
        this.f97849c = dlr0Var;
        this.f97852f = new boolean[4];
        this.f97853g = new tir0(128);
        if (dlr0Var != null) {
            this.f97851e = new sjr0(178, 128);
            v6w0Var = new v6w0();
        } else {
            v6w0Var = null;
            this.f97851e = null;
        }
        this.f97850d = v6w0Var;
        this.f97858l = -9223372036854775807L;
        this.f97860n = -9223372036854775807L;
    }

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
    @Override // p149l.sir0
    /* JADX INFO: renamed from: a */
    public final void mo121625a(boolean z) {
        f5v0.m119531b(this.f97848b);
        if (z) {
            boolean z2 = this.f97861o;
            long j = this.f97854h - this.f97859m;
            this.f97848b.mo134530c(this.f97860n, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
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
    @Override // p149l.sir0
    /* JADX INFO: renamed from: b */
    public final void mo121626b(v6w0 v6w0Var) {
        long j;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        long j2;
        double d;
        int i5;
        int i6;
        f5v0.m119531b(this.f97848b);
        int iM197270s = v6w0Var.m197270s();
        int iM197271t = v6w0Var.m197271t();
        byte[] bArrM197264m = v6w0Var.m197264m();
        this.f97854h += (long) v6w0Var.m197268q();
        this.f97848b.mo134533f(v6w0Var, v6w0Var.m197268q());
        while (true) {
            int iM176658a = quw0.m176658a(bArrM197264m, iM197270s, iM197271t, this.f97852f);
            if (iM176658a == iM197271t) {
                break;
            }
            int i7 = iM176658a + 3;
            int i8 = v6w0Var.m197264m()[i7] & 255;
            int i9 = iM176658a - iM197270s;
            if (!this.f97856j) {
                if (i9 > 0) {
                    this.f97853g.m189216a(bArrM197264m, iM197270s, iM176658a);
                }
                if (this.f97853g.m189218c(i8, i9 < 0 ? -i9 : 0)) {
                    tir0 tir0Var = this.f97853g;
                    String str = this.f97847a;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(tir0Var.f170609d, tir0Var.f170607b);
                    int i10 = bArrCopyOf[4] & 255;
                    byte b = bArrCopyOf[5];
                    int i11 = bArrCopyOf[6] & 255;
                    int i12 = ((b & 255) >> 4) | (i10 << 4);
                    int i13 = (bArrCopyOf[7] & 240) >> 4;
                    int i14 = ((b & 15) << 8) | i11;
                    if (i13 == 2) {
                        i2 = i14 * 4;
                        i3 = i12 * 3;
                    } else if (i13 != 3) {
                        if (i13 != 4) {
                            f = 1.0f;
                        } else {
                            i2 = i14 * 121;
                            i3 = i12 * 100;
                        }
                        ter0 ter0Var = new ter0();
                        ter0Var.m188604k(str);
                        ter0Var.m188618w("video/mpeg2");
                        ter0Var.m188590C(i12);
                        ter0Var.m188600i(i14);
                        ter0Var.m188614s(f);
                        ter0Var.m188606l(Collections.singletonList(bArrCopyOf));
                        mhr0 mhr0VarM188591D = ter0Var.m188591D();
                        i4 = (bArrCopyOf[7] & 15) - 1;
                        j2 = 0;
                        if (i4 >= 0 && i4 < 8) {
                            d = f97846q[i4];
                            byte b2 = bArrCopyOf[tir0Var.f170608c + 9];
                            i5 = (b2 & 96) >> 5;
                            i6 = b2 & 31;
                            if (i5 != i6) {
                                d *= (((double) i5) + 1.0d) / ((double) (i6 + 1));
                            }
                            j2 = (long) (1000000.0d / d);
                        }
                        Pair pairCreate = Pair.create(mhr0VarM188591D, Long.valueOf(j2));
                        this.f97848b.mo134531d((mhr0) pairCreate.first);
                        this.f97857k = ((Long) pairCreate.second).longValue();
                        this.f97856j = true;
                    } else {
                        i2 = i14 * 16;
                        i3 = i12 * 9;
                    }
                    f = i2 / i3;
                    ter0 ter0Var2 = new ter0();
                    ter0Var2.m188604k(str);
                    ter0Var2.m188618w("video/mpeg2");
                    ter0Var2.m188590C(i12);
                    ter0Var2.m188600i(i14);
                    ter0Var2.m188614s(f);
                    ter0Var2.m188606l(Collections.singletonList(bArrCopyOf));
                    mhr0 mhr0VarM188591D2 = ter0Var2.m188591D();
                    i4 = (bArrCopyOf[7] & 15) - 1;
                    j2 = 0;
                    if (i4 >= 0) {
                        d = f97846q[i4];
                        byte b3 = bArrCopyOf[tir0Var.f170608c + 9];
                        i5 = (b3 & 96) >> 5;
                        i6 = b3 & 31;
                        if (i5 != i6) {
                            d *= (((double) i5) + 1.0d) / ((double) (i6 + 1));
                        }
                        j2 = (long) (1000000.0d / d);
                    }
                    Pair pairCreate2 = Pair.create(mhr0VarM188591D2, Long.valueOf(j2));
                    this.f97848b.mo134531d((mhr0) pairCreate2.first);
                    this.f97857k = ((Long) pairCreate2.second).longValue();
                    this.f97856j = true;
                }
            }
            sjr0 sjr0Var = this.f97851e;
            if (sjr0Var != null) {
                if (i9 > 0) {
                    sjr0Var.m184548a(bArrM197264m, iM197270s, iM176658a);
                    i = 0;
                } else {
                    i = -i9;
                }
                if (this.f97851e.m184551d(i)) {
                    sjr0 sjr0Var2 = this.f97851e;
                    int iM176659b = quw0.m176659b(sjr0Var2.f164902d, sjr0Var2.f164903e);
                    v6w0 v6w0Var2 = this.f97850d;
                    int i15 = ggw0.f102568a;
                    v6w0Var2.m197260i(this.f97851e.f164902d, iM176659b);
                    this.f97849c.m112412a(this.f97860n, this.f97850d);
                }
                if (i8 == 178) {
                    if (v6w0Var.m197264m()[iM176658a + 2] == 1) {
                        this.f97851e.m184550c(178);
                    }
                    i8 = 178;
                }
            }
            if (i8 == 0 || i8 == 179) {
                int i16 = iM197271t - iM176658a;
                if (this.f97862p && this.f97856j) {
                    j = -9223372036854775807L;
                    long j3 = this.f97860n;
                    if (j3 != -9223372036854775807L) {
                        j = -9223372036854775807L;
                        this.f97848b.mo134530c(j3, this.f97861o ? 1 : 0, ((int) (this.f97854h - this.f97859m)) - i16, i16, null);
                    }
                } else {
                    j = -9223372036854775807L;
                }
                if (!this.f97855i || this.f97862p) {
                    this.f97859m = this.f97854h - ((long) i16);
                    long j4 = this.f97858l;
                    if (j4 == j) {
                        long j5 = this.f97860n;
                        j4 = j5 != j ? j5 + this.f97857k : j;
                    }
                    this.f97860n = j4;
                    z = false;
                    this.f97861o = false;
                    this.f97858l = j;
                    z2 = true;
                    this.f97855i = true;
                } else {
                    z2 = true;
                    z = false;
                }
                this.f97862p = i8 == 0 ? z2 : z;
            } else if (i8 == 184) {
                this.f97861o = true;
            }
            iM197270s = i7;
            iM197271t = iM197271t;
        }
        if (!this.f97856j) {
            this.f97853g.m189216a(bArrM197264m, iM197270s, iM197271t);
        }
        sjr0 sjr0Var3 = this.f97851e;
        if (sjr0Var3 != null) {
            sjr0Var3.m184548a(bArrM197264m, iM197270s, iM197271t);
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: c */
    public final void mo121627c(long j, int i) {
        this.f97858l = j;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: d */
    public final void mo121628d(m5r0 m5r0Var, alr0 alr0Var) {
        alr0Var.m97444c();
        this.f97847a = alr0Var.m97443b();
        this.f97848b = m5r0Var.mo129454i(alr0Var.m97442a(), 2);
        dlr0 dlr0Var = this.f97849c;
        if (dlr0Var != null) {
            dlr0Var.m112413b(m5r0Var, alr0Var);
        }
    }

    @Override // p149l.sir0
    public final void zze() {
        quw0.m176663f(this.f97852f);
        this.f97853g.m189217b();
        sjr0 sjr0Var = this.f97851e;
        if (sjr0Var != null) {
            sjr0Var.m184549b();
        }
        this.f97854h = 0L;
        this.f97855i = false;
        this.f97858l = -9223372036854775807L;
        this.f97860n = -9223372036854775807L;
    }

    public fjr0() {
        this(null);
    }
}
