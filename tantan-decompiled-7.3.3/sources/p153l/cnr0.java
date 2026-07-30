package p153l;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.gms.internal.ads.zzahe;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgc;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class cnr0 implements per0, bgr0 {

    /* JADX INFO: renamed from: A */
    @Deprecated
    public static final ifr0 f82758A = new ifr0() { // from class: l.anr0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new cnr0()};
        }
    };

    /* JADX INFO: renamed from: a */
    public final vor0 f82759a;

    /* JADX INFO: renamed from: b */
    public final int f82760b;

    /* JADX INFO: renamed from: c */
    public final bgw0 f82761c;

    /* JADX INFO: renamed from: d */
    public final bgw0 f82762d;

    /* JADX INFO: renamed from: e */
    public final bgw0 f82763e;

    /* JADX INFO: renamed from: f */
    public final bgw0 f82764f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f82765g;

    /* JADX INFO: renamed from: h */
    public final fnr0 f82766h;

    /* JADX INFO: renamed from: i */
    public final List f82767i;

    /* JADX INFO: renamed from: j */
    public int f82768j;

    /* JADX INFO: renamed from: k */
    public int f82769k;

    /* JADX INFO: renamed from: l */
    public long f82770l;

    /* JADX INFO: renamed from: m */
    public int f82771m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public bgw0 f82772n;

    /* JADX INFO: renamed from: o */
    public int f82773o;

    /* JADX INFO: renamed from: p */
    public int f82774p;

    /* JADX INFO: renamed from: q */
    public int f82775q;

    /* JADX INFO: renamed from: r */
    public int f82776r;

    /* JADX INFO: renamed from: s */
    public boolean f82777s;

    /* JADX INFO: renamed from: t */
    public ser0 f82778t;

    /* JADX INFO: renamed from: u */
    public bnr0[] f82779u;

    /* JADX INFO: renamed from: v */
    public long[][] f82780v;

    /* JADX INFO: renamed from: w */
    public int f82781w;

    /* JADX INFO: renamed from: x */
    public long f82782x;

    /* JADX INFO: renamed from: y */
    public int f82783y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public zzahe f82784z;

    public cnr0(vor0 vor0Var, int i) {
        this.f82759a = vor0Var;
        this.f82760b = i;
        this.f82768j = (i & 4) != 0 ? 3 : 0;
        this.f82766h = new fnr0();
        this.f82767i = new ArrayList();
        this.f82764f = new bgw0(16);
        this.f82765g = new ArrayDeque();
        this.f82761c = new bgw0(w3x0.f187180a);
        this.f82762d = new bgw0(4);
        this.f82763e = new bgw0();
        this.f82773o = -1;
        this.f82778t = ser0.f167641v0;
        this.f82779u = new bnr0[0];
    }

    /* JADX INFO: renamed from: g */
    public static int m111536g(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: h */
    public static int m111537h(knr0 knr0Var, long j) {
        int iM150550a = knr0Var.m150550a(j);
        return iM150550a == -1 ? knr0Var.m150551b(j) : iM150550a;
    }

    /* JADX INFO: renamed from: i */
    public static long m111538i(knr0 knr0Var, long j, long j2) {
        int iM111537h = m111537h(knr0Var, j);
        return iM111537h == -1 ? j2 : Math.min(knr0Var.f127630c[iM111537h], j2);
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        long j2;
        long j3;
        int iM150551b;
        bnr0[] bnr0VarArr = this.f82779u;
        if (bnr0VarArr.length == 0) {
            cgr0 cgr0Var = cgr0.f81725c;
            return new zfr0(cgr0Var, cgr0Var);
        }
        int i = this.f82781w;
        long jM111538i = -1;
        if (i != -1) {
            knr0 knr0Var = bnr0VarArr[i].f77582b;
            int iM111537h = m111537h(knr0Var, j);
            if (iM111537h == -1) {
                cgr0 cgr0Var2 = cgr0.f81725c;
                return new zfr0(cgr0Var2, cgr0Var2);
            }
            long j4 = knr0Var.f127633f[iM111537h];
            j2 = knr0Var.f127630c[iM111537h];
            if (j4 >= j || iM111537h >= knr0Var.f127629b - 1 || (iM150551b = knr0Var.m150551b(j)) == -1 || iM150551b == iM111537h) {
                j3 = -9223372036854775807L;
            } else {
                j3 = knr0Var.f127633f[iM150551b];
                jM111538i = knr0Var.f127630c[iM150551b];
            }
            j = j4;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            bnr0[] bnr0VarArr2 = this.f82779u;
            if (i2 >= bnr0VarArr2.length) {
                break;
            }
            if (i2 != this.f82781w) {
                knr0 knr0Var2 = bnr0VarArr2[i2].f77582b;
                long jM111538i2 = m111538i(knr0Var2, j, j2);
                if (j3 != -9223372036854775807L) {
                    jM111538i = m111538i(knr0Var2, j3, jM111538i);
                }
                j2 = jM111538i2;
            }
            i2++;
        }
        cgr0 cgr0Var3 = new cgr0(j, j2);
        return j3 == -9223372036854775807L ? new zfr0(cgr0Var3, cgr0Var3) : new zfr0(cgr0Var3, new cgr0(j3, jM111538i));
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        this.f82765g.clear();
        this.f82771m = 0;
        this.f82773o = -1;
        this.f82774p = 0;
        this.f82775q = 0;
        this.f82776r = 0;
        if (j == 0) {
            if (this.f82768j != 3) {
                m111539j();
                return;
            } else {
                this.f82766h.m126377b();
                this.f82767i.clear();
                return;
            }
        }
        for (bnr0 bnr0Var : this.f82779u) {
            knr0 knr0Var = bnr0Var.f77582b;
            int iM150550a = knr0Var.m150550a(j2);
            if (iM150550a == -1) {
                iM150550a = knr0Var.m150551b(j2);
            }
            bnr0Var.f77585e = iM150550a;
            tgr0 tgr0Var = bnr0Var.f77584d;
            if (tgr0Var != null) {
                tgr0Var.m191068b();
            }
        }
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        return gnr0.m130979b(qer0Var, (this.f82760b & 2) != 0);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        if ((this.f82760b & 16) == 0) {
            ser0Var = new yor0(ser0Var, this.f82759a);
        }
        this.f82778t = ser0Var;
    }

    /* JADX WARN: Code duplicated, block: B:279:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        long j;
        long j2;
        sgr0 sgr0Var;
        boolean z;
        boolean z2;
        while (true) {
            int i = this.f82768j;
            long j3 = 0;
            if (i == 0) {
                if (this.f82771m == 0) {
                    if (!qer0Var.mo125312b(this.f82764f.m104271m(), 0, 8, true)) {
                        if (this.f82783y != 2 || (this.f82760b & 2) == 0) {
                            return -1;
                        }
                        sgr0 sgr0VarMo101550i = this.f82778t.mo101550i(0, 4);
                        zzahe zzaheVar = this.f82784z;
                        zzby zzbyVar = zzaheVar == null ? null : new zzby(-9223372036854775807L, zzaheVar);
                        znr0 znr0Var = new znr0();
                        znr0Var.m220665p(zzbyVar);
                        sgr0VarMo101550i.mo99373d(znr0Var.m220645D());
                        this.f82778t.mo101544c();
                        this.f82778t.mo101551j(new agr0(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.f82771m = 8;
                    this.f82764f.m104269k(0);
                    this.f82770l = this.f82764f.m104253J();
                    this.f82769k = this.f82764f.m104280v();
                }
                long j4 = this.f82770l;
                if (j4 == 1) {
                    qer0Var.mo125316h(this.f82764f.m104271m(), 8, 8);
                    this.f82771m += 8;
                    this.f82770l = this.f82764f.m104254K();
                } else if (j4 == 0) {
                    long jZzd = qer0Var.zzd();
                    if (jZzd == -1) {
                        xlr0 xlr0Var = (xlr0) this.f82765g.peek();
                        jZzd = xlr0Var != null ? xlr0Var.f195013b : -1L;
                    }
                    if (jZzd != -1) {
                        this.f82770l = (jZzd - qer0Var.zzf()) + ((long) this.f82771m);
                    }
                }
                long j5 = this.f82770l;
                int i2 = this.f82771m;
                if (j5 < i2) {
                    throw zzcc.zzc("Atom size less than header length (unsupported).");
                }
                int i3 = this.f82769k;
                if (i3 == 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1701082227 || i3 == 1835365473) {
                    long jZzf = qer0Var.zzf();
                    long j6 = this.f82770l;
                    long j7 = jZzf + j6;
                    long j8 = this.f82771m;
                    if (j6 != j8 && this.f82769k == 1835365473) {
                        this.f82763e.m104266h(8);
                        qer0Var.mo125317i(this.f82763e.m104271m(), 0, 8);
                        hmr0.m135973e(this.f82763e);
                        qer0Var.mo125314d(this.f82763e.m104277s());
                        qer0Var.zzj();
                    }
                    long j9 = j7 - j8;
                    this.f82765g.push(new xlr0(this.f82769k, j9));
                    if (this.f82770l == this.f82771m) {
                        m111540k(j9);
                    } else {
                        m111539j();
                    }
                } else if (i3 == 1835296868 || i3 == 1836476516 || i3 == 1751411826 || i3 == 1937011556 || i3 == 1937011827 || i3 == 1937011571 || i3 == 1668576371 || i3 == 1701606260 || i3 == 1937011555 || i3 == 1937011578 || i3 == 1937013298 || i3 == 1937007471 || i3 == 1668232756 || i3 == 1953196132 || i3 == 1718909296 || i3 == 1969517665 || i3 == 1801812339 || i3 == 1768715124) {
                    lev0.m153958f(i2 == 8);
                    lev0.m153958f(this.f82770l <= 2147483647L);
                    bgw0 bgw0Var = new bgw0((int) this.f82770l);
                    System.arraycopy(this.f82764f.m104271m(), 0, bgw0Var.m104271m(), 0, 8);
                    this.f82772n = bgw0Var;
                    this.f82768j = 1;
                } else {
                    long jZzf2 = qer0Var.zzf();
                    long j10 = this.f82771m;
                    long j11 = jZzf2 - j10;
                    if (this.f82769k == 1836086884) {
                        this.f82784z = new zzahe(0L, j11, -9223372036854775807L, j11 + j10, this.f82770l - j10);
                    }
                    this.f82772n = null;
                    this.f82768j = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        this.f82766h.m126376a(qer0Var, yfr0Var, this.f82767i);
                        if (yfr0Var.f199649a == 0) {
                            m111539j();
                        }
                        return 1;
                    }
                    long jZzf3 = qer0Var.zzf();
                    int i4 = this.f82773o;
                    if (i4 == -1) {
                        int i5 = -1;
                        int i6 = -1;
                        boolean z3 = true;
                        boolean z4 = true;
                        long j12 = Long.MAX_VALUE;
                        long j13 = Long.MAX_VALUE;
                        long j14 = Long.MAX_VALUE;
                        int i7 = 0;
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        while (true) {
                            bnr0[] bnr0VarArr = this.f82779u;
                            if (i7 >= bnr0VarArr.length) {
                                break;
                            }
                            bnr0 bnr0Var = bnr0VarArr[i7];
                            int i8 = bnr0Var.f77585e;
                            knr0 knr0Var = bnr0Var.f77582b;
                            long j15 = j3;
                            if (i8 != knr0Var.f127629b) {
                                long j16 = knr0Var.f127630c[i8];
                                long[][] jArr = this.f82780v;
                                int i9 = mpw0.f137957a;
                                long j17 = jArr[i7][i8];
                                long j18 = j16 - jZzf3;
                                boolean z5 = j18 < j15 || j18 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                if (z5) {
                                    z = z4;
                                } else {
                                    if (z4) {
                                        z4 = z5;
                                        i6 = i7;
                                        j13 = j17;
                                        j14 = j18;
                                    } else {
                                        z = false;
                                    }
                                    if (j17 < j12) {
                                        z3 = z5;
                                        i5 = i7;
                                        j12 = j17;
                                    }
                                }
                                if (z5 != z || j18 >= j14) {
                                    z4 = z;
                                } else {
                                    z4 = z5;
                                    i6 = i7;
                                    j13 = j17;
                                    j14 = j18;
                                }
                                if (j17 < j12) {
                                    z3 = z5;
                                    i5 = i7;
                                    j12 = j17;
                                }
                            }
                            i7++;
                            j3 = j15;
                        }
                        j = j3;
                        i4 = (j12 == Long.MAX_VALUE || !z3 || j13 < j12 + 10485760) ? i6 : i5;
                        this.f82773o = i4;
                        if (i4 == -1) {
                            return -1;
                        }
                    } else {
                        j = 0;
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                    }
                    bnr0 bnr0Var2 = this.f82779u[i4];
                    sgr0 sgr0Var2 = bnr0Var2.f77583c;
                    int i10 = bnr0Var2.f77585e;
                    knr0 knr0Var2 = bnr0Var2.f77582b;
                    long j19 = knr0Var2.f127630c[i10];
                    int i11 = knr0Var2.f127631d[i10];
                    tgr0 tgr0Var = bnr0Var2.f77584d;
                    int i12 = 0;
                    long j20 = (j19 - jZzf3) + ((long) this.f82774p);
                    if (j20 < j || j20 >= j2) {
                        yfr0Var.f199649a = j19;
                        return 1;
                    }
                    if (bnr0Var2.f77581a.f110821g == 1) {
                        j20 += 8;
                        i11 -= 8;
                    }
                    qer0Var.mo125314d((int) j20);
                    hnr0 hnr0Var = bnr0Var2.f77581a;
                    int i13 = hnr0Var.f110824j;
                    if (i13 == 0) {
                        if ("audio/ac4".equals(hnr0Var.f110820f.f170251l)) {
                            if (this.f82775q == 0) {
                                sgr0Var = sgr0Var2;
                                idr0.m139542b(i11, this.f82763e);
                                sgr0Var.mo99375f(this.f82763e, 7);
                                this.f82775q += 7;
                            }
                            sgr0Var = sgr0Var2;
                            i11 += 7;
                        } else if (tgr0Var != null) {
                            tgr0Var.m191070d(qer0Var);
                        }
                        while (true) {
                            int i14 = this.f82775q;
                            if (i14 >= i11) {
                                break;
                            }
                            int iMo99374e = sgr0Var.mo99374e(qer0Var, i11 - i14, false);
                            this.f82774p += iMo99374e;
                            this.f82775q += iMo99374e;
                            this.f82776r -= iMo99374e;
                        }
                    } else {
                        byte[] bArrM104271m = this.f82762d.m104271m();
                        bArrM104271m[0] = 0;
                        bArrM104271m[1] = 0;
                        bArrM104271m[2] = 0;
                        int i15 = 4 - i13;
                        while (this.f82775q < i11) {
                            int i16 = this.f82776r;
                            if (i16 == 0) {
                                qer0Var.mo125316h(bArrM104271m, i15, i13);
                                this.f82774p += i13;
                                int i17 = i12;
                                this.f82762d.m104269k(i17);
                                int iM104280v = this.f82762d.m104280v();
                                if (iM104280v < 0) {
                                    throw zzcc.zza("Invalid NAL length", null);
                                }
                                this.f82776r = iM104280v;
                                this.f82761c.m104269k(i17);
                                sgr0Var2.mo99375f(this.f82761c, 4);
                                this.f82775q += 4;
                                i11 += i15;
                                i12 = i17;
                            } else {
                                int iMo99374e2 = sgr0Var2.mo99374e(qer0Var, i16, i12);
                                this.f82774p += iMo99374e2;
                                this.f82775q += iMo99374e2;
                                this.f82776r -= iMo99374e2;
                                i12 = 0;
                            }
                        }
                        sgr0Var = sgr0Var2;
                    }
                    int i18 = i11;
                    knr0 knr0Var3 = bnr0Var2.f77582b;
                    long j21 = knr0Var3.f127633f[i10];
                    int i19 = knr0Var3.f127634g[i10];
                    if (tgr0Var != null) {
                        sgr0 sgr0Var3 = sgr0Var;
                        tgr0Var.m191069c(sgr0Var3, j21, i19, i18, 0, null);
                        if (i10 + 1 == bnr0Var2.f77582b.f127629b) {
                            tgr0Var.m191067a(sgr0Var3, null);
                        }
                    } else {
                        sgr0Var.mo99372c(j21, i19, i18, 0, null);
                    }
                    bnr0Var2.f77585e++;
                    this.f82773o = -1;
                    this.f82774p = 0;
                    this.f82775q = 0;
                    this.f82776r = 0;
                    return 0;
                }
                long j22 = this.f82770l - ((long) this.f82771m);
                long jZzf4 = qer0Var.zzf() + j22;
                bgw0 bgw0Var2 = this.f82772n;
                if (bgw0Var2 != null) {
                    qer0Var.mo125316h(bgw0Var2.m104271m(), this.f82771m, (int) j22);
                    if (this.f82769k == 1718909296) {
                        this.f82777s = true;
                        bgw0Var2.m104269k(8);
                        int iM111536g = m111536g(bgw0Var2.m104280v());
                        if (iM111536g == 0) {
                            bgw0Var2.m104270l(4);
                            do {
                                if (bgw0Var2.m104275q() <= 0) {
                                    iM111536g = 0;
                                    break;
                                }
                                iM111536g = m111536g(bgw0Var2.m104280v());
                            } while (iM111536g == 0);
                        }
                        this.f82783y = iM111536g;
                    } else if (!this.f82765g.isEmpty()) {
                        ((xlr0) this.f82765g.peek()).m211672f(new ylr0(this.f82769k, bgw0Var2));
                    }
                } else {
                    if (!this.f82777s && this.f82769k == 1835295092) {
                        this.f82783y = 1;
                    }
                    if (j22 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        qer0Var.mo125314d((int) j22);
                    } else {
                        yfr0Var.f199649a = qer0Var.zzf() + j22;
                        z2 = true;
                    }
                    m111540k(jZzf4);
                    if (z2 && this.f82768j != 2) {
                        return 1;
                    }
                }
                z2 = false;
                m111540k(jZzf4);
                if (z2) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m111539j() {
        this.f82768j = 0;
        this.f82771m = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m111540k(long j) throws zzcc {
        zzby zzbyVar;
        boolean z;
        boolean z2;
        long j2;
        int i;
        while (!this.f82765g.isEmpty() && ((xlr0) this.f82765g.peek()).f195013b == j) {
            xlr0 xlr0Var = (xlr0) this.f82765g.pop();
            if (xlr0Var.f205002a == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i2 = this.f82783y;
                rfr0 rfr0Var = new rfr0();
                ylr0 ylr0VarM211670d = xlr0Var.m211670d(1969517665);
                if (ylr0VarM211670d != null) {
                    zzby zzbyVarM135970b = hmr0.m135970b(ylr0VarM211670d);
                    rfr0Var.m181280b(zzbyVarM135970b);
                    zzbyVar = zzbyVarM135970b;
                } else {
                    zzbyVar = null;
                }
                xlr0 xlr0VarM211669c = xlr0Var.m211669c(1835365473);
                zzby zzbyVarM135969a = xlr0VarM211669c != null ? hmr0.m135969a(xlr0VarM211669c) : null;
                ylr0 ylr0VarM211670d2 = xlr0Var.m211670d(1836476516);
                ylr0VarM211670d2.getClass();
                boolean z3 = i2 == 1;
                zzby zzbyVar2 = zzbyVar;
                zzby zzbyVar3 = new zzby(-9223372036854775807L, hmr0.m135971c(ylr0VarM211670d2.f200580b));
                if (1 != (this.f82760b & 1)) {
                    z = true;
                    z2 = false;
                } else {
                    z = true;
                    z2 = true;
                }
                long j3 = -9223372036854775807L;
                List listM135972d = hmr0.m135972d(xlr0Var, rfr0Var, -9223372036854775807L, null, z2, z3, new eow0() { // from class: l.zmr0
                    @Override // p153l.eow0
                    public final Object apply(Object obj) {
                        hnr0 hnr0Var = (hnr0) obj;
                        ifr0 ifr0Var = cnr0.f82758A;
                        return hnr0Var;
                    }
                });
                int size = listM135972d.size();
                int i3 = 0;
                long j4 = -9223372036854775807L;
                int size2 = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                        break;
                    }
                    knr0 knr0Var = (knr0) listM135972d.get(i3);
                    if (knr0Var.f127629b != 0) {
                        hnr0 hnr0Var = knr0Var.f127628a;
                        long j5 = hnr0Var.f110819e;
                        if (j5 == j3) {
                            j5 = knr0Var.f127635h;
                        }
                        long jMax = Math.max(j4, j5);
                        bnr0 bnr0Var = new bnr0(hnr0Var, knr0Var, this.f82778t.mo101550i(i3, hnr0Var.f110816b));
                        boolean zEquals = "audio/true-hd".equals(hnr0Var.f110820f.f170251l);
                        int i4 = knr0Var.f127632e;
                        int i5 = zEquals ? i4 * 16 : i4 + 30;
                        znr0 znr0VarM187559b = hnr0Var.f110820f.m187559b();
                        znr0VarM187559b.m220664o(i5);
                        if (hnr0Var.f110816b == 2) {
                            if ((this.f82760b & 8) != 0) {
                                znr0VarM187559b.m220670u(hnr0Var.f110820f.f170244e | (size2 == -1 ? 1 : 2));
                            }
                            if (j5 > 0 && (i = knr0Var.f127629b) > 1) {
                                znr0VarM187559b.m220653h(i / (j5 / 1000000.0f));
                            }
                        }
                        int i6 = hnr0Var.f110816b;
                        String[] strArr = ymr0.f200710a;
                        if (i6 == 1 && rfr0Var.m181279a()) {
                            znr0VarM187559b.m220651f(rfr0Var.f162860a);
                            znr0VarM187559b.m220652g(rfr0Var.f162861b);
                        }
                        int i7 = hnr0Var.f110816b;
                        zzby zzbyVar4 = zzbyVar2;
                        zzby[] zzbyVarArr = {this.f82767i.isEmpty() ? null : new zzby(this.f82767i), zzbyVar4, zzbyVar3};
                        zzbyVar2 = zzbyVar4;
                        zzby zzbyVar5 = new zzby(j3, new zzbx[0]);
                        if (zzbyVarM135969a != null) {
                            for (int i8 = 0; i8 < zzbyVarM135969a.m13605a(); i8++) {
                                zzbx zzbxVarM13606b = zzbyVarM135969a.m13606b(i8);
                                if (zzbxVarM13606b instanceof zzgc) {
                                    zzgc zzgcVar = (zzgc) zzbxVarM13606b;
                                    if (!zzgcVar.zza.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                                        zzbyVar5 = zzbyVar5.m13607c(zzgcVar);
                                    } else if (i7 == 2) {
                                        zzbyVar5 = zzbyVar5.m13607c(zzgcVar);
                                    }
                                }
                            }
                        }
                        for (int i9 = 0; i9 < 3; i9++) {
                            zzbyVar5 = zzbyVar5.m13608d(zzbyVarArr[i9]);
                        }
                        if (zzbyVar5.m13605a() > 0) {
                            znr0VarM187559b.m220665p(zzbyVar5);
                        }
                        bnr0Var.f77583c.mo99373d(znr0VarM187559b.m220645D());
                        if (hnr0Var.f110816b == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList.add(bnr0Var);
                        j4 = jMax;
                    }
                    i3++;
                    listM135972d = listM135972d;
                    size = size;
                    j3 = -9223372036854775807L;
                }
                this.f82781w = size2;
                this.f82782x = j4;
                bnr0[] bnr0VarArr = (bnr0[]) arrayList.toArray(new bnr0[0]);
                this.f82779u = bnr0VarArr;
                int length = bnr0VarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i10 = 0; i10 < bnr0VarArr.length; i10++) {
                    jArr[i10] = new long[bnr0VarArr[i10].f77582b.f127629b];
                    jArr2[i10] = bnr0VarArr[i10].f77582b.f127633f[0];
                }
                int i11 = 0;
                while (i11 < bnr0VarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < bnr0VarArr.length; i13++) {
                        if (!zArr[i13]) {
                            long j7 = jArr2[i13];
                            if (j7 <= j6) {
                                i12 = i13;
                                j6 = j7;
                            }
                        }
                    }
                    int i14 = iArr[i12];
                    long[] jArr3 = jArr[i12];
                    jArr3[i14] = j2;
                    knr0 knr0Var2 = bnr0VarArr[i12].f77582b;
                    j2 += (long) knr0Var2.f127631d[i14];
                    int i15 = i14 + 1;
                    iArr[i12] = i15;
                    if (i15 < jArr3.length) {
                        jArr2[i12] = knr0Var2.f127633f[i15];
                    } else {
                        zArr[i12] = true;
                        i11++;
                    }
                }
                this.f82780v = jArr;
                this.f82778t.mo101544c();
                this.f82778t.mo101551j(this);
                this.f82765g.clear();
                this.f82768j = 2;
            } else if (!this.f82765g.isEmpty()) {
                ((xlr0) this.f82765g.peek()).m211671e(xlr0Var);
            }
        }
        if (this.f82768j != 2) {
            m111539j();
        }
    }

    @Override // p153l.bgr0
    public final long zza() {
        return this.f82782x;
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return true;
    }

    @Deprecated
    public cnr0() {
        this(vor0.f185158a, 16);
    }
}
