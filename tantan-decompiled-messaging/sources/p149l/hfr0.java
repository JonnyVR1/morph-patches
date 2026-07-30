package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
public final class hfr0 extends ffr0 {

    /* JADX INFO: renamed from: n */
    @Nullable
    public gfr0 f107508n;

    /* JADX INFO: renamed from: o */
    public int f107509o;

    /* JADX INFO: renamed from: p */
    public boolean f107510p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public r7r0 f107511q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public p7r0 f107512r;

    @Override // p149l.ffr0
    /* JADX INFO: renamed from: a */
    public final long mo101562a(v6w0 v6w0Var) {
        if ((v6w0Var.m197264m()[0] & 1) == 1) {
            return -1L;
        }
        byte b = v6w0Var.m197264m()[0];
        gfr0 gfr0Var = this.f107508n;
        f5v0.m119531b(gfr0Var);
        boolean z = gfr0Var.f102431d[(b >> 1) & (255 >>> (8 - gfr0Var.f102432e))].f153069a;
        r7r0 r7r0Var = gfr0Var.f102428a;
        int i = !z ? r7r0Var.f158076e : r7r0Var.f158077f;
        int i2 = this.f107510p ? (this.f107509o + i) / 4 : 0;
        if (v6w0Var.m197269r() < v6w0Var.m197271t() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(v6w0Var.m197264m(), v6w0Var.m197271t() + 4);
            v6w0Var.m197260i(bArrCopyOf, bArrCopyOf.length);
        } else {
            v6w0Var.m197261j(v6w0Var.m197271t() + 4);
        }
        long j = i2;
        byte[] bArrM197264m = v6w0Var.m197264m();
        bArrM197264m[v6w0Var.m197271t() - 4] = (byte) (j & 255);
        bArrM197264m[v6w0Var.m197271t() - 3] = (byte) ((j >>> 8) & 255);
        bArrM197264m[v6w0Var.m197271t() - 2] = (byte) ((j >>> 16) & 255);
        bArrM197264m[v6w0Var.m197271t() - 1] = (byte) ((j >>> 24) & 255);
        this.f107510p = true;
        this.f107509o = i;
        return j;
    }

    @Override // p149l.ffr0
    /* JADX INFO: renamed from: b */
    public final void mo101563b(boolean z) {
        super.mo101563b(z);
        if (z) {
            this.f107508n = null;
            this.f107511q = null;
            this.f107512r = null;
        }
        this.f107509o = 0;
        this.f107510p = false;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x03b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:170:0x03b7  */
    @Override // p149l.ffr0
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: c */
    public final boolean mo101564c(v6w0 v6w0Var, long j, cfr0 cfr0Var) throws IOException {
        gfr0 gfr0Var;
        int i;
        int iM163039b;
        int i2;
        int[] iArr;
        if (this.f107508n != null) {
            cfr0Var.f80650a.getClass();
            return false;
        }
        r7r0 r7r0Var = this.f107511q;
        int i3 = 1;
        if (r7r0Var != null) {
            int i4 = 4;
            p7r0 p7r0Var = this.f107512r;
            if (p7r0Var == null) {
                this.f107512r = s7r0.m182516c(v6w0Var, true, true);
            } else {
                byte[] bArr = new byte[v6w0Var.m197271t()];
                System.arraycopy(v6w0Var.m197264m(), 0, bArr, 0, v6w0Var.m197271t());
                int i5 = r7r0Var.f158072a;
                int i6 = 5;
                s7r0.m182517d(5, v6w0Var, false);
                int iM197238B = v6w0Var.m197238B() + 1;
                o7r0 o7r0Var = new o7r0(v6w0Var.m197264m());
                o7r0Var.m163040c(v6w0Var.m197270s() * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    if (i7 >= iM197238B) {
                        int i10 = i3;
                        int i11 = 6;
                        int iM163039b2 = o7r0Var.m163039b(6) + i10;
                        for (int i12 = 0; i12 < iM163039b2; i12++) {
                            if (o7r0Var.m163039b(16) != 0) {
                                throw zzcc.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iM163039b3 = o7r0Var.m163039b(6) + i10;
                        int i13 = 0;
                        while (true) {
                            int i14 = 3;
                            if (i13 >= iM163039b3) {
                                int i15 = 1;
                                int iM163039b4 = o7r0Var.m163039b(i11) + 1;
                                int i16 = 0;
                                while (i16 < iM163039b4) {
                                    if (o7r0Var.m163039b(16) > 2) {
                                        throw zzcc.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    o7r0Var.m163040c(24);
                                    o7r0Var.m163040c(24);
                                    o7r0Var.m163040c(24);
                                    int iM163039b5 = o7r0Var.m163039b(i11) + i15;
                                    int i17 = 8;
                                    o7r0Var.m163040c(8);
                                    int[] iArr2 = new int[iM163039b5];
                                    for (int i18 = 0; i18 < iM163039b5; i18++) {
                                        iArr2[i18] = ((o7r0Var.m163041d() ? o7r0Var.m163039b(5) : 0) * 8) + o7r0Var.m163039b(3);
                                    }
                                    int i19 = 0;
                                    while (i19 < iM163039b5) {
                                        int i20 = 0;
                                        while (i20 < i17) {
                                            if ((iArr2[i19] & (1 << i20)) != 0) {
                                                o7r0Var.m163040c(i17);
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
                                int iM163039b6 = o7r0Var.m163039b(i11) + 1;
                                for (int i21 = 0; i21 < iM163039b6; i21++) {
                                    int iM163039b7 = o7r0Var.m163039b(16);
                                    if (iM163039b7 != 0) {
                                        svv0.m186108c("VorbisUtil", "mapping type other than 0 not supported: " + iM163039b7);
                                    } else {
                                        if (o7r0Var.m163041d()) {
                                            i = 1;
                                            iM163039b = o7r0Var.m163039b(4) + 1;
                                        } else {
                                            i = 1;
                                            iM163039b = 1;
                                        }
                                        if (o7r0Var.m163041d()) {
                                            int iM163039b8 = o7r0Var.m163039b(8) + i;
                                            for (int i22 = 0; i22 < iM163039b8; i22++) {
                                                int i23 = i5 - 1;
                                                o7r0Var.m163040c(s7r0.m182514a(i23));
                                                o7r0Var.m163040c(s7r0.m182514a(i23));
                                            }
                                        }
                                        if (o7r0Var.m163039b(2) != 0) {
                                            throw zzcc.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iM163039b > 1) {
                                            for (int i24 = 0; i24 < i5; i24++) {
                                                o7r0Var.m163040c(4);
                                            }
                                        }
                                        for (int i25 = 0; i25 < iM163039b; i25++) {
                                            o7r0Var.m163040c(8);
                                            o7r0Var.m163040c(8);
                                            o7r0Var.m163040c(8);
                                        }
                                    }
                                }
                                int iM163039b9 = o7r0Var.m163039b(6);
                                int i26 = iM163039b9 + 1;
                                q7r0[] q7r0VarArr = new q7r0[i26];
                                for (int i27 = 0; i27 < i26; i27++) {
                                    q7r0VarArr[i27] = new q7r0(o7r0Var.m163041d(), o7r0Var.m163039b(16), o7r0Var.m163039b(16), o7r0Var.m163039b(8));
                                }
                                if (!o7r0Var.m163041d()) {
                                    throw zzcc.zza("framing bit after modes not set as expected", null);
                                }
                                gfr0Var = new gfr0(r7r0Var, p7r0Var, bArr, q7r0VarArr, s7r0.m182514a(iM163039b9));
                                break;
                            }
                            int iM163039b10 = o7r0Var.m163039b(i9);
                            if (iM163039b10 == 0) {
                                int i28 = 8;
                                o7r0Var.m163040c(8);
                                o7r0Var.m163040c(16);
                                o7r0Var.m163040c(16);
                                o7r0Var.m163040c(6);
                                o7r0Var.m163040c(8);
                                int iM163039b11 = o7r0Var.m163039b(4) + 1;
                                int i29 = 0;
                                while (i29 < iM163039b11) {
                                    o7r0Var.m163040c(i28);
                                    i29++;
                                    i28 = 8;
                                }
                            } else {
                                if (iM163039b10 != i10) {
                                    throw zzcc.zza("floor type greater than 1 not decodable: " + iM163039b10, null);
                                }
                                int iM163039b12 = o7r0Var.m163039b(5);
                                int[] iArr3 = new int[iM163039b12];
                                int i30 = -1;
                                for (int i31 = 0; i31 < iM163039b12; i31++) {
                                    int iM163039b13 = o7r0Var.m163039b(4);
                                    iArr3[i31] = iM163039b13;
                                    if (iM163039b13 > i30) {
                                        i30 = iM163039b13;
                                    }
                                }
                                int i32 = i30 + 1;
                                int[] iArr4 = new int[i32];
                                int i33 = 0;
                                while (i33 < i32) {
                                    int i34 = 1;
                                    iArr4[i33] = o7r0Var.m163039b(i14) + 1;
                                    int iM163039b14 = o7r0Var.m163039b(2);
                                    if (iM163039b14 > 0) {
                                        i2 = 8;
                                        o7r0Var.m163040c(8);
                                    } else {
                                        i2 = 8;
                                    }
                                    int i35 = i32;
                                    int i36 = 0;
                                    while (true) {
                                        int i37 = i34 << iM163039b14;
                                        iArr = iArr3;
                                        if (i36 < i37) {
                                            o7r0Var.m163040c(i2);
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
                                o7r0Var.m163040c(2);
                                int iM163039b15 = o7r0Var.m163039b(4);
                                int i38 = 0;
                                int i39 = 0;
                                for (int i40 = 0; i40 < iM163039b12; i40++) {
                                    i38 += iArr4[iArr5[i40]];
                                    while (i39 < i38) {
                                        o7r0Var.m163040c(iM163039b15);
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
                        if (o7r0Var.m163039b(24) != 5653314) {
                            throw zzcc.zza("expected code book to start with [0x56, 0x43, 0x42] at " + o7r0Var.m163038a(), null);
                        }
                        int iM163039b16 = o7r0Var.m163039b(16);
                        int iM163039b17 = o7r0Var.m163039b(24);
                        if (o7r0Var.m163041d()) {
                            o7r0Var.m163040c(i6);
                            for (int iM163039b18 = 0; iM163039b18 < iM163039b17; iM163039b18 += o7r0Var.m163039b(s7r0.m182514a(iM163039b17 - iM163039b18))) {
                            }
                        } else {
                            boolean zM163041d = o7r0Var.m163041d();
                            for (int i41 = 0; i41 < iM163039b17; i41++) {
                                if (!zM163041d) {
                                    o7r0Var.m163040c(i6);
                                } else if (o7r0Var.m163041d()) {
                                    o7r0Var.m163040c(i6);
                                }
                            }
                        }
                        int i42 = i4;
                        int iM163039b19 = o7r0Var.m163039b(i42);
                        if (iM163039b19 > 2) {
                            throw zzcc.zza("lookup type greater than 2 not decodable: " + iM163039b19, null);
                        }
                        if (iM163039b19 != i3) {
                            if (iM163039b19 != 2) {
                                i3 = i3;
                            }
                            i7++;
                            i3 = i3;
                            i4 = 4;
                            i6 = 5;
                        } else {
                            i8 = iM163039b19;
                        }
                        o7r0Var.m163040c(32);
                        o7r0Var.m163040c(32);
                        int iM163039b20 = o7r0Var.m163039b(i42) + i3;
                        o7r0Var.m163040c(i3);
                        o7r0Var.m163040c((int) ((i8 == i3 ? iM163039b16 != 0 ? (long) Math.floor(Math.pow(iM163039b17, 1.0d / ((double) iM163039b16))) : 0L : ((long) iM163039b16) * ((long) iM163039b17)) * ((long) iM163039b20)));
                        i7++;
                        i3 = i3;
                        i4 = 4;
                        i6 = 5;
                    }
                }
            }
            this.f107508n = gfr0Var;
            if (gfr0Var == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            r7r0 r7r0Var2 = gfr0Var.f102428a;
            arrayList.add(r7r0Var2.f158078g);
            arrayList.add(gfr0Var.f102430c);
            zzby zzbyVarM182515b = s7r0.m182515b(zzgaa.zzk(gfr0Var.f102429b.f147538b));
            ter0 ter0Var = new ter0();
            ter0Var.m188618w("audio/vorbis");
            ter0Var.m188603j0(r7r0Var2.f158075d);
            ter0Var.m188613r(r7r0Var2.f158074c);
            ter0Var.m188605k0(r7r0Var2.f158072a);
            ter0Var.m188619x(r7r0Var2.f158073b);
            ter0Var.m188606l(arrayList);
            ter0Var.m188611p(zzbyVarM182515b);
            cfr0Var.f80650a = ter0Var.m188591D();
            return true;
        }
        s7r0.m182517d(1, v6w0Var, false);
        int iM197276y = v6w0Var.m197276y();
        int iM197238B2 = v6w0Var.m197238B();
        int iM197276y2 = v6w0Var.m197276y();
        int iM197275x = v6w0Var.m197275x();
        int i43 = iM197275x <= 0 ? -1 : iM197275x;
        int iM197275x2 = v6w0Var.m197275x();
        int i44 = iM197275x2 <= 0 ? -1 : iM197275x2;
        int iM197275x3 = v6w0Var.m197275x();
        int i45 = iM197275x3 <= 0 ? -1 : iM197275x3;
        int iM197238B3 = v6w0Var.m197238B();
        this.f107511q = new r7r0(iM197276y, iM197238B2, iM197276y2, i43, i44, i45, (int) Math.pow(2.0d, iM197238B3 & 15), (int) Math.pow(2.0d, (iM197238B3 & 240) >> 4), 1 == (v6w0Var.m197238B() & 1), Arrays.copyOf(v6w0Var.m197264m(), v6w0Var.m197271t()));
        gfr0Var = null;
        this.f107508n = gfr0Var;
        if (gfr0Var == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        r7r0 r7r0Var3 = gfr0Var.f102428a;
        arrayList2.add(r7r0Var3.f158078g);
        arrayList2.add(gfr0Var.f102430c);
        zzby zzbyVarM182515b2 = s7r0.m182515b(zzgaa.zzk(gfr0Var.f102429b.f147538b));
        ter0 ter0Var2 = new ter0();
        ter0Var2.m188618w("audio/vorbis");
        ter0Var2.m188603j0(r7r0Var3.f158075d);
        ter0Var2.m188613r(r7r0Var3.f158074c);
        ter0Var2.m188605k0(r7r0Var3.f158072a);
        ter0Var2.m188619x(r7r0Var3.f158073b);
        ter0Var2.m188606l(arrayList2);
        ter0Var2.m188611p(zzbyVarM182515b2);
        cfr0Var.f80650a = ter0Var2.m188591D();
        return true;
    }

    @Override // p149l.ffr0
    /* JADX INFO: renamed from: h */
    public final void mo121187h(long j) {
        super.mo121187h(j);
        this.f107510p = j != 0;
        r7r0 r7r0Var = this.f107511q;
        this.f107509o = r7r0Var != null ? r7r0Var.f158076e : 0;
    }
}
