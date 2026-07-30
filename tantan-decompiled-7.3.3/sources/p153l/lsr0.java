package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class lsr0 implements yrr0 {

    /* JADX INFO: renamed from: q */
    public static final double[] f133444q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a */
    public String f133445a;

    /* JADX INFO: renamed from: b */
    public sgr0 f133446b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final jur0 f133447c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final bgw0 f133448d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final ysr0 f133449e;

    /* JADX INFO: renamed from: f */
    public final boolean[] f133450f;

    /* JADX INFO: renamed from: g */
    public final zrr0 f133451g;

    /* JADX INFO: renamed from: h */
    public long f133452h;

    /* JADX INFO: renamed from: i */
    public boolean f133453i;

    /* JADX INFO: renamed from: j */
    public boolean f133454j;

    /* JADX INFO: renamed from: k */
    public long f133455k;

    /* JADX INFO: renamed from: l */
    public long f133456l;

    /* JADX INFO: renamed from: m */
    public long f133457m;

    /* JADX INFO: renamed from: n */
    public long f133458n;

    /* JADX INFO: renamed from: o */
    public boolean f133459o;

    /* JADX INFO: renamed from: p */
    public boolean f133460p;

    public lsr0(@Nullable jur0 jur0Var) {
        bgw0 bgw0Var;
        this.f133447c = jur0Var;
        this.f133450f = new boolean[4];
        this.f133451g = new zrr0(128);
        if (jur0Var != null) {
            this.f133449e = new ysr0(178, 128);
            bgw0Var = new bgw0();
        } else {
            bgw0Var = null;
            this.f133449e = null;
        }
        this.f133448d = bgw0Var;
        this.f133456l = -9223372036854775807L;
        this.f133458n = -9223372036854775807L;
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
    @Override // p153l.yrr0
    /* JADX INFO: renamed from: a */
    public final void mo155728a(boolean z) {
        lev0.m153954b(this.f133446b);
        if (z) {
            boolean z2 = this.f133459o;
            long j = this.f133452h - this.f133457m;
            this.f133446b.mo99372c(this.f133458n, z2 ? 1 : 0, (int) j, 0, null);
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
    @Override // p153l.yrr0
    /* JADX INFO: renamed from: b */
    public final void mo155729b(bgw0 bgw0Var) {
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
        lev0.m153954b(this.f133446b);
        int iM104277s = bgw0Var.m104277s();
        int iM104278t = bgw0Var.m104278t();
        byte[] bArrM104271m = bgw0Var.m104271m();
        this.f133452h += (long) bgw0Var.m104275q();
        this.f133446b.mo99375f(bgw0Var, bgw0Var.m104275q());
        while (true) {
            int iM204791a = w3x0.m204791a(bArrM104271m, iM104277s, iM104278t, this.f133450f);
            if (iM204791a == iM104278t) {
                break;
            }
            int i7 = iM204791a + 3;
            int i8 = bgw0Var.m104271m()[i7] & 255;
            int i9 = iM204791a - iM104277s;
            if (!this.f133454j) {
                if (i9 > 0) {
                    this.f133451g.m221184a(bArrM104271m, iM104277s, iM204791a);
                }
                if (this.f133451g.m221186c(i8, i9 < 0 ? -i9 : 0)) {
                    zrr0 zrr0Var = this.f133451g;
                    String str = this.f133445a;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zrr0Var.f205793d, zrr0Var.f205791b);
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
                        znr0 znr0Var = new znr0();
                        znr0Var.m220658k(str);
                        znr0Var.m220672w("video/mpeg2");
                        znr0Var.m220644C(i12);
                        znr0Var.m220654i(i14);
                        znr0Var.m220668s(f);
                        znr0Var.m220660l(Collections.singletonList(bArrCopyOf));
                        sqr0 sqr0VarM220645D = znr0Var.m220645D();
                        i4 = (bArrCopyOf[7] & 15) - 1;
                        j2 = 0;
                        if (i4 >= 0 && i4 < 8) {
                            d = f133444q[i4];
                            byte b2 = bArrCopyOf[zrr0Var.f205792c + 9];
                            i5 = (b2 & 96) >> 5;
                            i6 = b2 & 31;
                            if (i5 != i6) {
                                d *= (((double) i5) + 1.0d) / ((double) (i6 + 1));
                            }
                            j2 = (long) (1000000.0d / d);
                        }
                        Pair pairCreate = Pair.create(sqr0VarM220645D, Long.valueOf(j2));
                        this.f133446b.mo99373d((sqr0) pairCreate.first);
                        this.f133455k = ((Long) pairCreate.second).longValue();
                        this.f133454j = true;
                    } else {
                        i2 = i14 * 16;
                        i3 = i12 * 9;
                    }
                    f = i2 / i3;
                    znr0 znr0Var2 = new znr0();
                    znr0Var2.m220658k(str);
                    znr0Var2.m220672w("video/mpeg2");
                    znr0Var2.m220644C(i12);
                    znr0Var2.m220654i(i14);
                    znr0Var2.m220668s(f);
                    znr0Var2.m220660l(Collections.singletonList(bArrCopyOf));
                    sqr0 sqr0VarM220645D2 = znr0Var2.m220645D();
                    i4 = (bArrCopyOf[7] & 15) - 1;
                    j2 = 0;
                    if (i4 >= 0) {
                        d = f133444q[i4];
                        byte b3 = bArrCopyOf[zrr0Var.f205792c + 9];
                        i5 = (b3 & 96) >> 5;
                        i6 = b3 & 31;
                        if (i5 != i6) {
                            d *= (((double) i5) + 1.0d) / ((double) (i6 + 1));
                        }
                        j2 = (long) (1000000.0d / d);
                    }
                    Pair pairCreate2 = Pair.create(sqr0VarM220645D2, Long.valueOf(j2));
                    this.f133446b.mo99373d((sqr0) pairCreate2.first);
                    this.f133455k = ((Long) pairCreate2.second).longValue();
                    this.f133454j = true;
                }
            }
            ysr0 ysr0Var = this.f133449e;
            if (ysr0Var != null) {
                if (i9 > 0) {
                    ysr0Var.m217273a(bArrM104271m, iM104277s, iM204791a);
                    i = 0;
                } else {
                    i = -i9;
                }
                if (this.f133449e.m217276d(i)) {
                    ysr0 ysr0Var2 = this.f133449e;
                    int iM204792b = w3x0.m204792b(ysr0Var2.f201447d, ysr0Var2.f201448e);
                    bgw0 bgw0Var2 = this.f133448d;
                    int i15 = mpw0.f137957a;
                    bgw0Var2.m104267i(this.f133449e.f201447d, iM204792b);
                    this.f133447c.m146995a(this.f133458n, this.f133448d);
                }
                if (i8 == 178) {
                    if (bgw0Var.m104271m()[iM204791a + 2] == 1) {
                        this.f133449e.m217275c(178);
                    }
                    i8 = 178;
                }
            }
            if (i8 == 0 || i8 == 179) {
                int i16 = iM104278t - iM204791a;
                if (this.f133460p && this.f133454j) {
                    j = -9223372036854775807L;
                    long j3 = this.f133458n;
                    if (j3 != -9223372036854775807L) {
                        j = -9223372036854775807L;
                        this.f133446b.mo99372c(j3, this.f133459o ? 1 : 0, ((int) (this.f133452h - this.f133457m)) - i16, i16, null);
                    }
                } else {
                    j = -9223372036854775807L;
                }
                if (!this.f133453i || this.f133460p) {
                    this.f133457m = this.f133452h - ((long) i16);
                    long j4 = this.f133456l;
                    if (j4 == j) {
                        long j5 = this.f133458n;
                        j4 = j5 != j ? j5 + this.f133455k : j;
                    }
                    this.f133458n = j4;
                    z = false;
                    this.f133459o = false;
                    this.f133456l = j;
                    z2 = true;
                    this.f133453i = true;
                } else {
                    z2 = true;
                    z = false;
                }
                this.f133460p = i8 == 0 ? z2 : z;
            } else if (i8 == 184) {
                this.f133459o = true;
            }
            iM104277s = i7;
            iM104278t = iM104278t;
        }
        if (!this.f133454j) {
            this.f133451g.m221184a(bArrM104271m, iM104277s, iM104278t);
        }
        ysr0 ysr0Var3 = this.f133449e;
        if (ysr0Var3 != null) {
            ysr0Var3.m217273a(bArrM104271m, iM104277s, iM104278t);
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: c */
    public final void mo155730c(long j, int i) {
        this.f133456l = j;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: d */
    public final void mo155731d(ser0 ser0Var, gur0 gur0Var) {
        gur0Var.m132386c();
        this.f133445a = gur0Var.m132385b();
        this.f133446b = ser0Var.mo101550i(gur0Var.m132384a(), 2);
        jur0 jur0Var = this.f133447c;
        if (jur0Var != null) {
            jur0Var.m146996b(ser0Var, gur0Var);
        }
    }

    @Override // p153l.yrr0
    public final void zze() {
        w3x0.m204796f(this.f133450f);
        this.f133451g.m221185b();
        ysr0 ysr0Var = this.f133449e;
        if (ysr0Var != null) {
            ysr0Var.m217274b();
        }
        this.f133452h = 0L;
        this.f133453i = false;
        this.f133456l = -9223372036854775807L;
        this.f133458n = -9223372036854775807L;
    }

    public lsr0() {
        this(null);
    }
}
