package p149l;

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
public final class wdr0 implements j5r0, v6r0 {

    /* JADX INFO: renamed from: A */
    @Deprecated
    public static final c6r0 f185831A = new c6r0() { // from class: l.udr0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new wdr0()};
        }
    };

    /* JADX INFO: renamed from: a */
    public final pfr0 f185832a;

    /* JADX INFO: renamed from: b */
    public final int f185833b;

    /* JADX INFO: renamed from: c */
    public final v6w0 f185834c;

    /* JADX INFO: renamed from: d */
    public final v6w0 f185835d;

    /* JADX INFO: renamed from: e */
    public final v6w0 f185836e;

    /* JADX INFO: renamed from: f */
    public final v6w0 f185837f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f185838g;

    /* JADX INFO: renamed from: h */
    public final zdr0 f185839h;

    /* JADX INFO: renamed from: i */
    public final List f185840i;

    /* JADX INFO: renamed from: j */
    public int f185841j;

    /* JADX INFO: renamed from: k */
    public int f185842k;

    /* JADX INFO: renamed from: l */
    public long f185843l;

    /* JADX INFO: renamed from: m */
    public int f185844m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public v6w0 f185845n;

    /* JADX INFO: renamed from: o */
    public int f185846o;

    /* JADX INFO: renamed from: p */
    public int f185847p;

    /* JADX INFO: renamed from: q */
    public int f185848q;

    /* JADX INFO: renamed from: r */
    public int f185849r;

    /* JADX INFO: renamed from: s */
    public boolean f185850s;

    /* JADX INFO: renamed from: t */
    public m5r0 f185851t;

    /* JADX INFO: renamed from: u */
    public vdr0[] f185852u;

    /* JADX INFO: renamed from: v */
    public long[][] f185853v;

    /* JADX INFO: renamed from: w */
    public int f185854w;

    /* JADX INFO: renamed from: x */
    public long f185855x;

    /* JADX INFO: renamed from: y */
    public int f185856y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public zzahe f185857z;

    public wdr0(pfr0 pfr0Var, int i) {
        this.f185832a = pfr0Var;
        this.f185833b = i;
        this.f185841j = (i & 4) != 0 ? 3 : 0;
        this.f185839h = new zdr0();
        this.f185840i = new ArrayList();
        this.f185837f = new v6w0(16);
        this.f185838g = new ArrayDeque();
        this.f185834c = new v6w0(quw0.f156548a);
        this.f185835d = new v6w0(4);
        this.f185836e = new v6w0();
        this.f185846o = -1;
        this.f185851t = m5r0.f131414v0;
        this.f185852u = new vdr0[0];
    }

    /* JADX INFO: renamed from: g */
    public static int m202790g(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: h */
    public static int m202791h(eer0 eer0Var, long j) {
        int iM115988a = eer0Var.m115988a(j);
        return iM115988a == -1 ? eer0Var.m115989b(j) : iM115988a;
    }

    /* JADX INFO: renamed from: i */
    public static long m202792i(eer0 eer0Var, long j, long j2) {
        int iM202791h = m202791h(eer0Var, j);
        return iM202791h == -1 ? j2 : Math.min(eer0Var.f90775c[iM202791h], j2);
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        long j2;
        long j3;
        int iM115989b;
        vdr0[] vdr0VarArr = this.f185852u;
        if (vdr0VarArr.length == 0) {
            w6r0 w6r0Var = w6r0.f184989c;
            return new t6r0(w6r0Var, w6r0Var);
        }
        int i = this.f185854w;
        long jM202792i = -1;
        if (i != -1) {
            eer0 eer0Var = vdr0VarArr[i].f181114b;
            int iM202791h = m202791h(eer0Var, j);
            if (iM202791h == -1) {
                w6r0 w6r0Var2 = w6r0.f184989c;
                return new t6r0(w6r0Var2, w6r0Var2);
            }
            long j4 = eer0Var.f90778f[iM202791h];
            j2 = eer0Var.f90775c[iM202791h];
            if (j4 >= j || iM202791h >= eer0Var.f90774b - 1 || (iM115989b = eer0Var.m115989b(j)) == -1 || iM115989b == iM202791h) {
                j3 = -9223372036854775807L;
            } else {
                j3 = eer0Var.f90778f[iM115989b];
                jM202792i = eer0Var.f90775c[iM115989b];
            }
            j = j4;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            vdr0[] vdr0VarArr2 = this.f185852u;
            if (i2 >= vdr0VarArr2.length) {
                break;
            }
            if (i2 != this.f185854w) {
                eer0 eer0Var2 = vdr0VarArr2[i2].f181114b;
                long jM202792i2 = m202792i(eer0Var2, j, j2);
                if (j3 != -9223372036854775807L) {
                    jM202792i = m202792i(eer0Var2, j3, jM202792i);
                }
                j2 = jM202792i2;
            }
            i2++;
        }
        w6r0 w6r0Var3 = new w6r0(j, j2);
        return j3 == -9223372036854775807L ? new t6r0(w6r0Var3, w6r0Var3) : new t6r0(w6r0Var3, new w6r0(j3, jM202792i));
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        this.f185838g.clear();
        this.f185844m = 0;
        this.f185846o = -1;
        this.f185847p = 0;
        this.f185848q = 0;
        this.f185849r = 0;
        if (j == 0) {
            if (this.f185841j != 3) {
                m202793j();
                return;
            } else {
                this.f185839h.m218194b();
                this.f185840i.clear();
                return;
            }
        }
        for (vdr0 vdr0Var : this.f185852u) {
            eer0 eer0Var = vdr0Var.f181114b;
            int iM115988a = eer0Var.m115988a(j2);
            if (iM115988a == -1) {
                iM115988a = eer0Var.m115989b(j2);
            }
            vdr0Var.f181117e = iM115988a;
            n7r0 n7r0Var = vdr0Var.f181116d;
            if (n7r0Var != null) {
                n7r0Var.m158158b();
            }
        }
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        return aer0.m96125b(k5r0Var, (this.f185833b & 2) != 0);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        if ((this.f185833b & 16) == 0) {
            m5r0Var = new sfr0(m5r0Var, this.f185832a);
        }
        this.f185851t = m5r0Var;
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
    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        long j;
        long j2;
        m7r0 m7r0Var;
        boolean z;
        boolean z2;
        while (true) {
            int i = this.f185841j;
            long j3 = 0;
            if (i == 0) {
                if (this.f185844m == 0) {
                    if (!k5r0Var.mo140050b(this.f185837f.m197264m(), 0, 8, true)) {
                        if (this.f185856y != 2 || (this.f185833b & 2) == 0) {
                            return -1;
                        }
                        m7r0 m7r0VarMo129454i = this.f185851t.mo129454i(0, 4);
                        zzahe zzaheVar = this.f185857z;
                        zzby zzbyVar = zzaheVar == null ? null : new zzby(-9223372036854775807L, zzaheVar);
                        ter0 ter0Var = new ter0();
                        ter0Var.m188611p(zzbyVar);
                        m7r0VarMo129454i.mo134531d(ter0Var.m188591D());
                        this.f185851t.mo129453c();
                        this.f185851t.mo129455j(new u6r0(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.f185844m = 8;
                    this.f185837f.m197262k(0);
                    this.f185843l = this.f185837f.m197246J();
                    this.f185842k = this.f185837f.m197273v();
                }
                long j4 = this.f185843l;
                if (j4 == 1) {
                    k5r0Var.mo140054h(this.f185837f.m197264m(), 8, 8);
                    this.f185844m += 8;
                    this.f185843l = this.f185837f.m197247K();
                } else if (j4 == 0) {
                    long jZzd = k5r0Var.zzd();
                    if (jZzd == -1) {
                        rcr0 rcr0Var = (rcr0) this.f185838g.peek();
                        jZzd = rcr0Var != null ? rcr0Var.f158813b : -1L;
                    }
                    if (jZzd != -1) {
                        this.f185843l = (jZzd - k5r0Var.zzf()) + ((long) this.f185844m);
                    }
                }
                long j5 = this.f185843l;
                int i2 = this.f185844m;
                if (j5 < i2) {
                    throw zzcc.zzc("Atom size less than header length (unsupported).");
                }
                int i3 = this.f185842k;
                if (i3 == 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1701082227 || i3 == 1835365473) {
                    long jZzf = k5r0Var.zzf();
                    long j6 = this.f185843l;
                    long j7 = jZzf + j6;
                    long j8 = this.f185844m;
                    if (j6 != j8 && this.f185842k == 1835365473) {
                        this.f185836e.m197259h(8);
                        k5r0Var.mo140055i(this.f185836e.m197264m(), 0, 8);
                        bdr0.m101214e(this.f185836e);
                        k5r0Var.mo140052d(this.f185836e.m197270s());
                        k5r0Var.zzj();
                    }
                    long j9 = j7 - j8;
                    this.f185838g.push(new rcr0(this.f185842k, j9));
                    if (this.f185843l == this.f185844m) {
                        m202794k(j9);
                    } else {
                        m202793j();
                    }
                } else if (i3 == 1835296868 || i3 == 1836476516 || i3 == 1751411826 || i3 == 1937011556 || i3 == 1937011827 || i3 == 1937011571 || i3 == 1668576371 || i3 == 1701606260 || i3 == 1937011555 || i3 == 1937011578 || i3 == 1937013298 || i3 == 1937007471 || i3 == 1668232756 || i3 == 1953196132 || i3 == 1718909296 || i3 == 1969517665 || i3 == 1801812339 || i3 == 1768715124) {
                    f5v0.m119535f(i2 == 8);
                    f5v0.m119535f(this.f185843l <= 2147483647L);
                    v6w0 v6w0Var = new v6w0((int) this.f185843l);
                    System.arraycopy(this.f185837f.m197264m(), 0, v6w0Var.m197264m(), 0, 8);
                    this.f185845n = v6w0Var;
                    this.f185841j = 1;
                } else {
                    long jZzf2 = k5r0Var.zzf();
                    long j10 = this.f185844m;
                    long j11 = jZzf2 - j10;
                    if (this.f185842k == 1836086884) {
                        this.f185857z = new zzahe(0L, j11, -9223372036854775807L, j11 + j10, this.f185843l - j10);
                    }
                    this.f185845n = null;
                    this.f185841j = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        this.f185839h.m218193a(k5r0Var, s6r0Var, this.f185840i);
                        if (s6r0Var.f162847a == 0) {
                            m202793j();
                        }
                        return 1;
                    }
                    long jZzf3 = k5r0Var.zzf();
                    int i4 = this.f185846o;
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
                            vdr0[] vdr0VarArr = this.f185852u;
                            if (i7 >= vdr0VarArr.length) {
                                break;
                            }
                            vdr0 vdr0Var = vdr0VarArr[i7];
                            int i8 = vdr0Var.f181117e;
                            eer0 eer0Var = vdr0Var.f181114b;
                            long j15 = j3;
                            if (i8 != eer0Var.f90774b) {
                                long j16 = eer0Var.f90775c[i8];
                                long[][] jArr = this.f185853v;
                                int i9 = ggw0.f102568a;
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
                        this.f185846o = i4;
                        if (i4 == -1) {
                            return -1;
                        }
                    } else {
                        j = 0;
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                    }
                    vdr0 vdr0Var2 = this.f185852u[i4];
                    m7r0 m7r0Var2 = vdr0Var2.f181115c;
                    int i10 = vdr0Var2.f181117e;
                    eer0 eer0Var2 = vdr0Var2.f181114b;
                    long j19 = eer0Var2.f90775c[i10];
                    int i11 = eer0Var2.f90776d[i10];
                    n7r0 n7r0Var = vdr0Var2.f181116d;
                    int i12 = 0;
                    long j20 = (j19 - jZzf3) + ((long) this.f185847p);
                    if (j20 < j || j20 >= j2) {
                        s6r0Var.f162847a = j19;
                        return 1;
                    }
                    if (vdr0Var2.f181113a.f75231g == 1) {
                        j20 += 8;
                        i11 -= 8;
                    }
                    k5r0Var.mo140052d((int) j20);
                    ber0 ber0Var = vdr0Var2.f181113a;
                    int i13 = ber0Var.f75234j;
                    if (i13 == 0) {
                        if ("audio/ac4".equals(ber0Var.f75230f.f133892l)) {
                            if (this.f185848q == 0) {
                                m7r0Var = m7r0Var2;
                                c4r0.m105240b(i11, this.f185836e);
                                m7r0Var.mo134533f(this.f185836e, 7);
                                this.f185848q += 7;
                            }
                            m7r0Var = m7r0Var2;
                            i11 += 7;
                        } else if (n7r0Var != null) {
                            n7r0Var.m158160d(k5r0Var);
                        }
                        while (true) {
                            int i14 = this.f185848q;
                            if (i14 >= i11) {
                                break;
                            }
                            int iMo134532e = m7r0Var.mo134532e(k5r0Var, i11 - i14, false);
                            this.f185847p += iMo134532e;
                            this.f185848q += iMo134532e;
                            this.f185849r -= iMo134532e;
                        }
                    } else {
                        byte[] bArrM197264m = this.f185835d.m197264m();
                        bArrM197264m[0] = 0;
                        bArrM197264m[1] = 0;
                        bArrM197264m[2] = 0;
                        int i15 = 4 - i13;
                        while (this.f185848q < i11) {
                            int i16 = this.f185849r;
                            if (i16 == 0) {
                                k5r0Var.mo140054h(bArrM197264m, i15, i13);
                                this.f185847p += i13;
                                int i17 = i12;
                                this.f185835d.m197262k(i17);
                                int iM197273v = this.f185835d.m197273v();
                                if (iM197273v < 0) {
                                    throw zzcc.zza("Invalid NAL length", null);
                                }
                                this.f185849r = iM197273v;
                                this.f185834c.m197262k(i17);
                                m7r0Var2.mo134533f(this.f185834c, 4);
                                this.f185848q += 4;
                                i11 += i15;
                                i12 = i17;
                            } else {
                                int iMo134532e2 = m7r0Var2.mo134532e(k5r0Var, i16, i12);
                                this.f185847p += iMo134532e2;
                                this.f185848q += iMo134532e2;
                                this.f185849r -= iMo134532e2;
                                i12 = 0;
                            }
                        }
                        m7r0Var = m7r0Var2;
                    }
                    int i18 = i11;
                    eer0 eer0Var3 = vdr0Var2.f181114b;
                    long j21 = eer0Var3.f90778f[i10];
                    int i19 = eer0Var3.f90779g[i10];
                    if (n7r0Var != null) {
                        m7r0 m7r0Var3 = m7r0Var;
                        n7r0Var.m158159c(m7r0Var3, j21, i19, i18, 0, null);
                        if (i10 + 1 == vdr0Var2.f181114b.f90774b) {
                            n7r0Var.m158157a(m7r0Var3, null);
                        }
                    } else {
                        m7r0Var.mo134530c(j21, i19, i18, 0, null);
                    }
                    vdr0Var2.f181117e++;
                    this.f185846o = -1;
                    this.f185847p = 0;
                    this.f185848q = 0;
                    this.f185849r = 0;
                    return 0;
                }
                long j22 = this.f185843l - ((long) this.f185844m);
                long jZzf4 = k5r0Var.zzf() + j22;
                v6w0 v6w0Var2 = this.f185845n;
                if (v6w0Var2 != null) {
                    k5r0Var.mo140054h(v6w0Var2.m197264m(), this.f185844m, (int) j22);
                    if (this.f185842k == 1718909296) {
                        this.f185850s = true;
                        v6w0Var2.m197262k(8);
                        int iM202790g = m202790g(v6w0Var2.m197273v());
                        if (iM202790g == 0) {
                            v6w0Var2.m197263l(4);
                            do {
                                if (v6w0Var2.m197268q() <= 0) {
                                    iM202790g = 0;
                                    break;
                                }
                                iM202790g = m202790g(v6w0Var2.m197273v());
                            } while (iM202790g == 0);
                        }
                        this.f185856y = iM202790g;
                    } else if (!this.f185838g.isEmpty()) {
                        ((rcr0) this.f185838g.peek()).m178814f(new scr0(this.f185842k, v6w0Var2));
                    }
                } else {
                    if (!this.f185850s && this.f185842k == 1835295092) {
                        this.f185856y = 1;
                    }
                    if (j22 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        k5r0Var.mo140052d((int) j22);
                    } else {
                        s6r0Var.f162847a = k5r0Var.zzf() + j22;
                        z2 = true;
                    }
                    m202794k(jZzf4);
                    if (z2 && this.f185841j != 2) {
                        return 1;
                    }
                }
                z2 = false;
                m202794k(jZzf4);
                if (z2) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m202793j() {
        this.f185841j = 0;
        this.f185844m = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m202794k(long j) throws zzcc {
        zzby zzbyVar;
        boolean z;
        boolean z2;
        long j2;
        int i;
        while (!this.f185838g.isEmpty() && ((rcr0) this.f185838g.peek()).f158813b == j) {
            rcr0 rcr0Var = (rcr0) this.f185838g.pop();
            if (rcr0Var.f169472a == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i2 = this.f185856y;
                l6r0 l6r0Var = new l6r0();
                scr0 scr0VarM178812d = rcr0Var.m178812d(1969517665);
                if (scr0VarM178812d != null) {
                    zzby zzbyVarM101211b = bdr0.m101211b(scr0VarM178812d);
                    l6r0Var.m148755b(zzbyVarM101211b);
                    zzbyVar = zzbyVarM101211b;
                } else {
                    zzbyVar = null;
                }
                rcr0 rcr0VarM178811c = rcr0Var.m178811c(1835365473);
                zzby zzbyVarM101210a = rcr0VarM178811c != null ? bdr0.m101210a(rcr0VarM178811c) : null;
                scr0 scr0VarM178812d2 = rcr0Var.m178812d(1836476516);
                scr0VarM178812d2.getClass();
                boolean z3 = i2 == 1;
                zzby zzbyVar2 = zzbyVar;
                zzby zzbyVar3 = new zzby(-9223372036854775807L, bdr0.m101212c(scr0VarM178812d2.f163765b));
                if (1 != (this.f185833b & 1)) {
                    z = true;
                    z2 = false;
                } else {
                    z = true;
                    z2 = true;
                }
                long j3 = -9223372036854775807L;
                List listM101213d = bdr0.m101213d(rcr0Var, l6r0Var, -9223372036854775807L, null, z2, z3, new yew0() { // from class: l.tdr0
                    @Override // p149l.yew0
                    public final Object apply(Object obj) {
                        ber0 ber0Var = (ber0) obj;
                        c6r0 c6r0Var = wdr0.f185831A;
                        return ber0Var;
                    }
                });
                int size = listM101213d.size();
                int i3 = 0;
                long j4 = -9223372036854775807L;
                int size2 = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                        break;
                    }
                    eer0 eer0Var = (eer0) listM101213d.get(i3);
                    if (eer0Var.f90774b != 0) {
                        ber0 ber0Var = eer0Var.f90773a;
                        long j5 = ber0Var.f75229e;
                        if (j5 == j3) {
                            j5 = eer0Var.f90780h;
                        }
                        long jMax = Math.max(j4, j5);
                        vdr0 vdr0Var = new vdr0(ber0Var, eer0Var, this.f185851t.mo129454i(i3, ber0Var.f75226b));
                        boolean zEquals = "audio/true-hd".equals(ber0Var.f75230f.f133892l);
                        int i4 = eer0Var.f90777e;
                        int i5 = zEquals ? i4 * 16 : i4 + 30;
                        ter0 ter0VarM154634b = ber0Var.f75230f.m154634b();
                        ter0VarM154634b.m188610o(i5);
                        if (ber0Var.f75226b == 2) {
                            if ((this.f185833b & 8) != 0) {
                                ter0VarM154634b.m188616u(ber0Var.f75230f.f133885e | (size2 == -1 ? 1 : 2));
                            }
                            if (j5 > 0 && (i = eer0Var.f90774b) > 1) {
                                ter0VarM154634b.m188599h(i / (j5 / 1000000.0f));
                            }
                        }
                        int i6 = ber0Var.f75226b;
                        String[] strArr = sdr0.f163874a;
                        if (i6 == 1 && l6r0Var.m148754a()) {
                            ter0VarM154634b.m188597f(l6r0Var.f126657a);
                            ter0VarM154634b.m188598g(l6r0Var.f126658b);
                        }
                        int i7 = ber0Var.f75226b;
                        zzby zzbyVar4 = zzbyVar2;
                        zzby[] zzbyVarArr = {this.f185840i.isEmpty() ? null : new zzby(this.f185840i), zzbyVar4, zzbyVar3};
                        zzbyVar2 = zzbyVar4;
                        zzby zzbyVar5 = new zzby(j3, new zzbx[0]);
                        if (zzbyVarM101210a != null) {
                            for (int i8 = 0; i8 < zzbyVarM101210a.m13551a(); i8++) {
                                zzbx zzbxVarM13552b = zzbyVarM101210a.m13552b(i8);
                                if (zzbxVarM13552b instanceof zzgc) {
                                    zzgc zzgcVar = (zzgc) zzbxVarM13552b;
                                    if (!zzgcVar.zza.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                                        zzbyVar5 = zzbyVar5.m13553c(zzgcVar);
                                    } else if (i7 == 2) {
                                        zzbyVar5 = zzbyVar5.m13553c(zzgcVar);
                                    }
                                }
                            }
                        }
                        for (int i9 = 0; i9 < 3; i9++) {
                            zzbyVar5 = zzbyVar5.m13554d(zzbyVarArr[i9]);
                        }
                        if (zzbyVar5.m13551a() > 0) {
                            ter0VarM154634b.m188611p(zzbyVar5);
                        }
                        vdr0Var.f181115c.mo134531d(ter0VarM154634b.m188591D());
                        if (ber0Var.f75226b == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList.add(vdr0Var);
                        j4 = jMax;
                    }
                    i3++;
                    listM101213d = listM101213d;
                    size = size;
                    j3 = -9223372036854775807L;
                }
                this.f185854w = size2;
                this.f185855x = j4;
                vdr0[] vdr0VarArr = (vdr0[]) arrayList.toArray(new vdr0[0]);
                this.f185852u = vdr0VarArr;
                int length = vdr0VarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i10 = 0; i10 < vdr0VarArr.length; i10++) {
                    jArr[i10] = new long[vdr0VarArr[i10].f181114b.f90774b];
                    jArr2[i10] = vdr0VarArr[i10].f181114b.f90778f[0];
                }
                int i11 = 0;
                while (i11 < vdr0VarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < vdr0VarArr.length; i13++) {
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
                    eer0 eer0Var2 = vdr0VarArr[i12].f181114b;
                    j2 += (long) eer0Var2.f90776d[i14];
                    int i15 = i14 + 1;
                    iArr[i12] = i15;
                    if (i15 < jArr3.length) {
                        jArr2[i12] = eer0Var2.f90778f[i15];
                    } else {
                        zArr[i12] = true;
                        i11++;
                    }
                }
                this.f185853v = jArr;
                this.f185851t.mo129453c();
                this.f185851t.mo129455j(this);
                this.f185838g.clear();
                this.f185841j = 2;
            } else if (!this.f185838g.isEmpty()) {
                ((rcr0) this.f185838g.peek()).m178813e(rcr0Var);
            }
        }
        if (this.f185841j != 2) {
            m202793j();
        }
    }

    @Override // p149l.v6r0
    public final long zza() {
        return this.f185855x;
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return true;
    }

    @Deprecated
    public wdr0() {
        this(pfr0.f148583a, 16);
    }
}
