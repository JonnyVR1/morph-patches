package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
public final class nor0 extends lor0 {

    /* JADX INFO: renamed from: n */
    @Nullable
    public mor0 f143020n;

    /* JADX INFO: renamed from: o */
    public int f143021o;

    /* JADX INFO: renamed from: p */
    public boolean f143022p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public xgr0 f143023q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public vgr0 f143024r;

    @Override // p153l.lor0
    /* JADX INFO: renamed from: a */
    public final long mo136457a(bgw0 bgw0Var) {
        if ((bgw0Var.m104271m()[0] & 1) == 1) {
            return -1L;
        }
        byte b = bgw0Var.m104271m()[0];
        mor0 mor0Var = this.f143020n;
        lev0.m153954b(mor0Var);
        boolean z = mor0Var.f137850d[(b >> 1) & (255 >>> (8 - mor0Var.f137851e))].f189003a;
        xgr0 xgr0Var = mor0Var.f137847a;
        int i = !z ? xgr0Var.f194228e : xgr0Var.f194229f;
        int i2 = this.f143022p ? (this.f143021o + i) / 4 : 0;
        if (bgw0Var.m104276r() < bgw0Var.m104278t() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(bgw0Var.m104271m(), bgw0Var.m104278t() + 4);
            bgw0Var.m104267i(bArrCopyOf, bArrCopyOf.length);
        } else {
            bgw0Var.m104268j(bgw0Var.m104278t() + 4);
        }
        long j = i2;
        byte[] bArrM104271m = bgw0Var.m104271m();
        bArrM104271m[bgw0Var.m104278t() - 4] = (byte) (j & 255);
        bArrM104271m[bgw0Var.m104278t() - 3] = (byte) ((j >>> 8) & 255);
        bArrM104271m[bgw0Var.m104278t() - 2] = (byte) ((j >>> 16) & 255);
        bArrM104271m[bgw0Var.m104278t() - 1] = (byte) ((j >>> 24) & 255);
        this.f143022p = true;
        this.f143021o = i;
        return j;
    }

    @Override // p153l.lor0
    /* JADX INFO: renamed from: b */
    public final void mo136458b(boolean z) {
        super.mo136458b(z);
        if (z) {
            this.f143020n = null;
            this.f143023q = null;
            this.f143024r = null;
        }
        this.f143021o = 0;
        this.f143022p = false;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x03b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:170:0x03b7  */
    @Override // p153l.lor0
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: c */
    public final boolean mo136459c(bgw0 bgw0Var, long j, ior0 ior0Var) throws IOException {
        mor0 mor0Var;
        int i;
        int iM195936b;
        int i2;
        int[] iArr;
        if (this.f143020n != null) {
            ior0Var.f116196a.getClass();
            return false;
        }
        xgr0 xgr0Var = this.f143023q;
        int i3 = 1;
        if (xgr0Var != null) {
            int i4 = 4;
            vgr0 vgr0Var = this.f143024r;
            if (vgr0Var == null) {
                this.f143024r = ygr0.m215875c(bgw0Var, true, true);
            } else {
                byte[] bArr = new byte[bgw0Var.m104278t()];
                System.arraycopy(bgw0Var.m104271m(), 0, bArr, 0, bgw0Var.m104278t());
                int i5 = xgr0Var.f194224a;
                int i6 = 5;
                ygr0.m215876d(5, bgw0Var, false);
                int iM104245B = bgw0Var.m104245B() + 1;
                ugr0 ugr0Var = new ugr0(bgw0Var.m104271m());
                ugr0Var.m195937c(bgw0Var.m104277s() * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    if (i7 >= iM104245B) {
                        int i10 = i3;
                        int i11 = 6;
                        int iM195936b2 = ugr0Var.m195936b(6) + i10;
                        for (int i12 = 0; i12 < iM195936b2; i12++) {
                            if (ugr0Var.m195936b(16) != 0) {
                                throw zzcc.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iM195936b3 = ugr0Var.m195936b(6) + i10;
                        int i13 = 0;
                        while (true) {
                            int i14 = 3;
                            if (i13 >= iM195936b3) {
                                int i15 = 1;
                                int iM195936b4 = ugr0Var.m195936b(i11) + 1;
                                int i16 = 0;
                                while (i16 < iM195936b4) {
                                    if (ugr0Var.m195936b(16) > 2) {
                                        throw zzcc.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    ugr0Var.m195937c(24);
                                    ugr0Var.m195937c(24);
                                    ugr0Var.m195937c(24);
                                    int iM195936b5 = ugr0Var.m195936b(i11) + i15;
                                    int i17 = 8;
                                    ugr0Var.m195937c(8);
                                    int[] iArr2 = new int[iM195936b5];
                                    for (int i18 = 0; i18 < iM195936b5; i18++) {
                                        iArr2[i18] = ((ugr0Var.m195938d() ? ugr0Var.m195936b(5) : 0) * 8) + ugr0Var.m195936b(3);
                                    }
                                    int i19 = 0;
                                    while (i19 < iM195936b5) {
                                        int i20 = 0;
                                        while (i20 < i17) {
                                            if ((iArr2[i19] & (1 << i20)) != 0) {
                                                ugr0Var.m195937c(i17);
                                            }
                                            i20++;
                                            i17 = 8;
                                        }
                                        i19++;
                                        i17 = 8;
                                    }
                                    i16++;
                                    i11 = 6;
                                    i15 = 1;
                                }
                                int iM195936b6 = ugr0Var.m195936b(i11) + 1;
                                for (int i21 = 0; i21 < iM195936b6; i21++) {
                                    int iM195936b7 = ugr0Var.m195936b(16);
                                    if (iM195936b7 != 0) {
                                        y4w0.m214275c("VorbisUtil", "mapping type other than 0 not supported: " + iM195936b7);
                                    } else {
                                        if (ugr0Var.m195938d()) {
                                            i = 1;
                                            iM195936b = ugr0Var.m195936b(4) + 1;
                                        } else {
                                            i = 1;
                                            iM195936b = 1;
                                        }
                                        if (ugr0Var.m195938d()) {
                                            int iM195936b8 = ugr0Var.m195936b(8) + i;
                                            for (int i22 = 0; i22 < iM195936b8; i22++) {
                                                int i23 = i5 - 1;
                                                ugr0Var.m195937c(ygr0.m215873a(i23));
                                                ugr0Var.m195937c(ygr0.m215873a(i23));
                                            }
                                        }
                                        if (ugr0Var.m195936b(2) != 0) {
                                            throw zzcc.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iM195936b > 1) {
                                            for (int i24 = 0; i24 < i5; i24++) {
                                                ugr0Var.m195937c(4);
                                            }
                                        }
                                        for (int i25 = 0; i25 < iM195936b; i25++) {
                                            ugr0Var.m195937c(8);
                                            ugr0Var.m195937c(8);
                                            ugr0Var.m195937c(8);
                                        }
                                    }
                                }
                                int iM195936b9 = ugr0Var.m195936b(6);
                                int i26 = iM195936b9 + 1;
                                wgr0[] wgr0VarArr = new wgr0[i26];
                                for (int i27 = 0; i27 < i26; i27++) {
                                    wgr0VarArr[i27] = new wgr0(ugr0Var.m195938d(), ugr0Var.m195936b(16), ugr0Var.m195936b(16), ugr0Var.m195936b(8));
                                }
                                if (!ugr0Var.m195938d()) {
                                    throw zzcc.zza("framing bit after modes not set as expected", null);
                                }
                                mor0Var = new mor0(xgr0Var, vgr0Var, bArr, wgr0VarArr, ygr0.m215873a(iM195936b9));
                                break;
                            }
                            int iM195936b10 = ugr0Var.m195936b(i9);
                            if (iM195936b10 == 0) {
                                int i28 = 8;
                                ugr0Var.m195937c(8);
                                ugr0Var.m195937c(16);
                                ugr0Var.m195937c(16);
                                ugr0Var.m195937c(6);
                                ugr0Var.m195937c(8);
                                int iM195936b11 = ugr0Var.m195936b(4) + 1;
                                int i29 = 0;
                                while (i29 < iM195936b11) {
                                    ugr0Var.m195937c(i28);
                                    i29++;
                                    i28 = 8;
                                }
                            } else {
                                if (iM195936b10 != i10) {
                                    throw zzcc.zza("floor type greater than 1 not decodable: " + iM195936b10, null);
                                }
                                int iM195936b12 = ugr0Var.m195936b(5);
                                int[] iArr3 = new int[iM195936b12];
                                int i30 = -1;
                                for (int i31 = 0; i31 < iM195936b12; i31++) {
                                    int iM195936b13 = ugr0Var.m195936b(4);
                                    iArr3[i31] = iM195936b13;
                                    if (iM195936b13 > i30) {
                                        i30 = iM195936b13;
                                    }
                                }
                                int i32 = i30 + 1;
                                int[] iArr4 = new int[i32];
                                int i33 = 0;
                                while (i33 < i32) {
                                    int i34 = 1;
                                    iArr4[i33] = ugr0Var.m195936b(i14) + 1;
                                    int iM195936b14 = ugr0Var.m195936b(2);
                                    if (iM195936b14 > 0) {
                                        i2 = 8;
                                        ugr0Var.m195937c(8);
                                    } else {
                                        i2 = 8;
                                    }
                                    int i35 = i32;
                                    int i36 = 0;
                                    while (true) {
                                        int i37 = i34 << iM195936b14;
                                        iArr = iArr3;
                                        if (i36 < i37) {
                                            ugr0Var.m195937c(i2);
                                            i36++;
                                            iArr3 = iArr;
                                            i2 = 8;
                                            i34 = 1;
                                        }
                                    }
                                    i33++;
                                    iArr3 = iArr;
                                    i32 = i35;
                                    i14 = 3;
                                }
                                int[] iArr5 = iArr3;
                                ugr0Var.m195937c(2);
                                int iM195936b15 = ugr0Var.m195936b(4);
                                int i38 = 0;
                                int i39 = 0;
                                for (int i40 = 0; i40 < iM195936b12; i40++) {
                                    i38 += iArr4[iArr5[i40]];
                                    while (i39 < i38) {
                                        ugr0Var.m195937c(iM195936b15);
                                        i39++;
                                    }
                                }
                            }
                            i13++;
                            i11 = 6;
                            i9 = 16;
                            i10 = 1;
                        }
                    } else {
                        if (ugr0Var.m195936b(24) != 5653314) {
                            throw zzcc.zza("expected code book to start with [0x56, 0x43, 0x42] at " + ugr0Var.m195935a(), null);
                        }
                        int iM195936b16 = ugr0Var.m195936b(16);
                        int iM195936b17 = ugr0Var.m195936b(24);
                        if (ugr0Var.m195938d()) {
                            ugr0Var.m195937c(i6);
                            for (int iM195936b18 = 0; iM195936b18 < iM195936b17; iM195936b18 += ugr0Var.m195936b(ygr0.m215873a(iM195936b17 - iM195936b18))) {
                            }
                        } else {
                            boolean zM195938d = ugr0Var.m195938d();
                            for (int i41 = 0; i41 < iM195936b17; i41++) {
                                if (!zM195938d) {
                                    ugr0Var.m195937c(i6);
                                } else if (ugr0Var.m195938d()) {
                                    ugr0Var.m195937c(i6);
                                }
                            }
                        }
                        int i42 = i4;
                        int iM195936b19 = ugr0Var.m195936b(i42);
                        if (iM195936b19 > 2) {
                            throw zzcc.zza("lookup type greater than 2 not decodable: " + iM195936b19, null);
                        }
                        if (iM195936b19 != i3) {
                            if (iM195936b19 != 2) {
                                i3 = i3;
                            }
                            i7++;
                            i3 = i3;
                            i4 = 4;
                            i6 = 5;
                        } else {
                            i8 = iM195936b19;
                        }
                        ugr0Var.m195937c(32);
                        ugr0Var.m195937c(32);
                        int iM195936b20 = ugr0Var.m195936b(i42) + i3;
                        ugr0Var.m195937c(i3);
                        ugr0Var.m195937c((int) ((i8 == i3 ? iM195936b16 != 0 ? (long) Math.floor(Math.pow(iM195936b17, 1.0d / ((double) iM195936b16))) : 0L : ((long) iM195936b16) * ((long) iM195936b17)) * ((long) iM195936b20)));
                        i7++;
                        i3 = i3;
                        i4 = 4;
                        i6 = 5;
                    }
                }
            }
            this.f143020n = mor0Var;
            if (mor0Var == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            xgr0 xgr0Var2 = mor0Var.f137847a;
            arrayList.add(xgr0Var2.f194230g);
            arrayList.add(mor0Var.f137849c);
            zzby zzbyVarM215874b = ygr0.m215874b(zzgaa.zzk(mor0Var.f137848b.f184059b));
            znr0 znr0Var = new znr0();
            znr0Var.m220672w("audio/vorbis");
            znr0Var.m220657j0(xgr0Var2.f194227d);
            znr0Var.m220667r(xgr0Var2.f194226c);
            znr0Var.m220659k0(xgr0Var2.f194224a);
            znr0Var.m220673x(xgr0Var2.f194225b);
            znr0Var.m220660l(arrayList);
            znr0Var.m220665p(zzbyVarM215874b);
            ior0Var.f116196a = znr0Var.m220645D();
            return true;
        }
        ygr0.m215876d(1, bgw0Var, false);
        int iM104283y = bgw0Var.m104283y();
        int iM104245B2 = bgw0Var.m104245B();
        int iM104283y2 = bgw0Var.m104283y();
        int iM104282x = bgw0Var.m104282x();
        int i43 = iM104282x <= 0 ? -1 : iM104282x;
        int iM104282x2 = bgw0Var.m104282x();
        int i44 = iM104282x2 <= 0 ? -1 : iM104282x2;
        int iM104282x3 = bgw0Var.m104282x();
        int i45 = iM104282x3 <= 0 ? -1 : iM104282x3;
        int iM104245B3 = bgw0Var.m104245B();
        this.f143023q = new xgr0(iM104283y, iM104245B2, iM104283y2, i43, i44, i45, (int) Math.pow(2.0d, iM104245B3 & 15), (int) Math.pow(2.0d, (iM104245B3 & 240) >> 4), 1 == (bgw0Var.m104245B() & 1), Arrays.copyOf(bgw0Var.m104271m(), bgw0Var.m104278t()));
        mor0Var = null;
        this.f143020n = mor0Var;
        if (mor0Var == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        xgr0 xgr0Var3 = mor0Var.f137847a;
        arrayList2.add(xgr0Var3.f194230g);
        arrayList2.add(mor0Var.f137849c);
        zzby zzbyVarM215874b2 = ygr0.m215874b(zzgaa.zzk(mor0Var.f137848b.f184059b));
        znr0 znr0Var2 = new znr0();
        znr0Var2.m220672w("audio/vorbis");
        znr0Var2.m220657j0(xgr0Var3.f194227d);
        znr0Var2.m220667r(xgr0Var3.f194226c);
        znr0Var2.m220659k0(xgr0Var3.f194224a);
        znr0Var2.m220673x(xgr0Var3.f194225b);
        znr0Var2.m220660l(arrayList2);
        znr0Var2.m220665p(zzbyVarM215874b2);
        ior0Var.f116196a = znr0Var2.m220645D();
        return true;
    }

    @Override // p153l.lor0
    /* JADX INFO: renamed from: h */
    public final void mo155100h(long j) {
        super.mo155100h(j);
        this.f143022p = j != 0;
        xgr0 xgr0Var = this.f143023q;
        this.f143021o = xgr0Var != null ? xgr0Var.f194228e : 0;
    }
}
