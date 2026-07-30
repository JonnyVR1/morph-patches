package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzahm;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zzgf;
import com.google.android.gms.internal.ads.zzgi;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class hmr0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f110662a;

    static {
        int i = mpw0.f137957a;
        f110662a = "OpusHead".getBytes(cow0.f82931c);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static zzby m135969a(xlr0 xlr0Var) {
        zzgc zzgcVar;
        ylr0 ylr0VarM211670d = xlr0Var.m211670d(1751411826);
        ylr0 ylr0VarM211670d2 = xlr0Var.m211670d(1801812339);
        ylr0 ylr0VarM211670d3 = xlr0Var.m211670d(1768715124);
        if (ylr0VarM211670d != null && ylr0VarM211670d2 != null && ylr0VarM211670d3 != null && m135975g(ylr0VarM211670d.f200580b) == 1835299937) {
            bgw0 bgw0Var = ylr0VarM211670d2.f200580b;
            bgw0Var.m104269k(12);
            int iM104280v = bgw0Var.m104280v();
            String[] strArr = new String[iM104280v];
            for (int i = 0; i < iM104280v; i++) {
                int iM104280v2 = bgw0Var.m104280v();
                bgw0Var.m104270l(4);
                strArr[i] = bgw0Var.m104259a(iM104280v2 - 8, cow0.f82931c);
            }
            bgw0 bgw0Var2 = ylr0VarM211670d3.f200580b;
            bgw0Var2.m104269k(8);
            ArrayList arrayList = new ArrayList();
            while (bgw0Var2.m104275q() > 8) {
                int iM104277s = bgw0Var2.m104277s() + bgw0Var2.m104280v();
                int iM104280v3 = bgw0Var2.m104280v() - 1;
                if (iM104280v3 < 0 || iM104280v3 >= iM104280v) {
                    y4w0.m214278f("AtomParsers", "Skipped metadata with unknown key index: " + iM104280v3);
                } else {
                    String str = strArr[iM104280v3];
                    String[] strArr2 = ymr0.f200710a;
                    while (true) {
                        int iM104277s2 = bgw0Var2.m104277s();
                        if (iM104277s2 >= iM104277s) {
                            zzgcVar = null;
                            break;
                        }
                        int iM104280v4 = bgw0Var2.m104280v();
                        if (bgw0Var2.m104280v() == 1684108385) {
                            int iM104280v5 = bgw0Var2.m104280v();
                            int iM104280v6 = bgw0Var2.m104280v();
                            int i2 = iM104280v4 - 16;
                            byte[] bArr = new byte[i2];
                            bgw0Var2.m104265g(bArr, 0, i2);
                            zzgcVar = new zzgc(str, bArr, iM104280v6, iM104280v5);
                            break;
                        }
                        bgw0Var2.m104269k(iM104277s2 + iM104280v4);
                    }
                    if (zzgcVar != null) {
                        arrayList.add(zzgcVar);
                    }
                }
                bgw0Var2.m104269k(iM104277s);
            }
            if (!arrayList.isEmpty()) {
                return new zzby(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX INFO: renamed from: b */
    public static zzby m135970b(ylr0 ylr0Var) {
        int iM104246C;
        bgw0 bgw0Var = ylr0Var.f200580b;
        bgw0Var.m104269k(8);
        zzby zzbyVar = new zzby(-9223372036854775807L, new zzbx[0]);
        while (bgw0Var.m104275q() >= 8) {
            int iM104277s = bgw0Var.m104277s();
            int iM104280v = bgw0Var.m104280v() + iM104277s;
            int iM104280v2 = bgw0Var.m104280v();
            zzby zzbyVar2 = null;
            if (iM104280v2 == 1835365473) {
                bgw0Var.m104269k(iM104277s);
                bgw0Var.m104270l(8);
                m135973e(bgw0Var);
                while (bgw0Var.m104277s() < iM104280v) {
                    int iM104277s2 = bgw0Var.m104277s();
                    int iM104280v3 = bgw0Var.m104280v() + iM104277s2;
                    if (bgw0Var.m104280v() == 1768715124) {
                        bgw0Var.m104269k(iM104277s2);
                        bgw0Var.m104270l(8);
                        ArrayList arrayList = new ArrayList();
                        while (bgw0Var.m104277s() < iM104280v3) {
                            zzbx zzbxVarM216733a = ymr0.m216733a(bgw0Var);
                            if (zzbxVarM216733a != null) {
                                arrayList.add(zzbxVarM216733a);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbyVar2 = new zzby(arrayList);
                            break;
                        }
                        break;
                    }
                    bgw0Var.m104269k(iM104280v3);
                }
                zzbyVar = zzbyVar.m13608d(zzbyVar2);
            } else if (iM104280v2 == 1936553057) {
                bgw0Var.m104269k(iM104277s);
                bgw0Var.m104270l(12);
                while (bgw0Var.m104277s() < iM104280v) {
                    int iM104277s3 = bgw0Var.m104277s();
                    int iM104280v4 = bgw0Var.m104280v();
                    if (bgw0Var.m104280v() == 1935766900) {
                        if (iM104280v4 < 16) {
                            break;
                        }
                        bgw0Var.m104270l(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int iM104245B = bgw0Var.m104245B();
                            int iM104245B2 = bgw0Var.m104245B();
                            if (iM104245B == 0) {
                                i = iM104245B2;
                            } else if (iM104245B == 1) {
                                i2 = iM104245B2;
                            }
                        }
                        if (i == 12) {
                            iM104246C = 240;
                        } else if (i == 13) {
                            iM104246C = 120;
                        } else if (i == 21 && bgw0Var.m104275q() >= 8 && bgw0Var.m104277s() + 8 <= iM104280v) {
                            int iM104280v5 = bgw0Var.m104280v();
                            int iM104280v6 = bgw0Var.m104280v();
                            if (iM104280v5 < 12 || iM104280v6 != 1936877170) {
                                iM104246C = -2147483647;
                            } else {
                                iM104246C = bgw0Var.m104246C();
                            }
                        } else {
                            iM104246C = -2147483647;
                        }
                        if (iM104246C == -2147483647) {
                            break;
                        }
                        zzbyVar2 = new zzby(-9223372036854775807L, new zzahm(iM104246C, i2));
                        break;
                    }
                    bgw0Var.m104269k(iM104277s3 + iM104280v4);
                }
                zzbyVar = zzbyVar.m13608d(zzbyVar2);
            } else if (iM104280v2 == -1451722374) {
                zzbyVar = zzbyVar.m13608d(m135977i(bgw0Var));
            }
            bgw0Var.m104269k(iM104280v);
        }
        return zzbyVar;
    }

    /* JADX INFO: renamed from: c */
    public static zzgi m135971c(bgw0 bgw0Var) {
        long jM104252I;
        long jM104252I2;
        bgw0Var.m104269k(8);
        if (zlr0.m220300a(bgw0Var.m104280v()) == 0) {
            jM104252I = bgw0Var.m104253J();
            jM104252I2 = bgw0Var.m104253J();
        } else {
            jM104252I = bgw0Var.m104252I();
            jM104252I2 = bgw0Var.m104252I();
        }
        return new zzgi(jM104252I, jM104252I2, bgw0Var.m104253J());
    }

    /* JADX WARN: Code duplicated, block: B:311:0x0682 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:312:0x0684  */
    /* JADX WARN: Code duplicated, block: B:313:0x0687  */
    /* JADX WARN: Code duplicated, block: B:359:0x0780  */
    /* JADX WARN: Code duplicated, block: B:362:0x078d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:363:0x078f  */
    /* JADX WARN: Code duplicated, block: B:364:0x0793  */
    /* JADX WARN: Code duplicated, block: B:366:0x0796  */
    /* JADX WARN: Code duplicated, block: B:369:0x079f  */
    /* JADX WARN: Code duplicated, block: B:372:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:374:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:376:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:378:0x07bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:379:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:380:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:382:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:386:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:387:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:520:0x0b4c  */
    /* JADX WARN: Code duplicated, block: B:521:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x0125  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129 A[PHI: r9
      0x0129: PHI (r9v4 int) = (r9v2 int), (r9v6 int) binds: [B:60:0x011c, B:66:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0139  */
    /* JADX WARN: Instruction removed from duplicated block: B:369:0x079f, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public static List m135972d(xlr0 xlr0Var, rfr0 rfr0Var, long j, @Nullable zzae zzaeVar, boolean z, boolean z2, eow0 eow0Var) throws zzcc {
        int i;
        long jM159395H;
        long j2;
        int i2;
        int i3;
        long j3;
        ArrayList arrayList;
        int i4;
        xlr0 xlr0Var2;
        long[] jArr;
        long[] jArr2;
        hnr0 hnr0Var;
        Pair pairCreate;
        int i5;
        gmr0 gmr0Var;
        int i6;
        int i7;
        String str;
        int i8;
        int i9;
        zzae zzaeVar2;
        String str2;
        Pair pair;
        ArrayList arrayList2;
        xlr0 xlr0Var3;
        int i10;
        int i11;
        int i12;
        String str3;
        int i13;
        float fM104248E;
        boolean z3;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zM115563o;
        boolean z4;
        wwy0 wwy0VarM117907g;
        int iM115552d;
        int iM115552d2;
        int iM115552d3;
        int i18;
        int iM115552d4;
        int i19;
        int iM208352a;
        boolean z5;
        String str4;
        int i20;
        int i21;
        List list;
        int i22;
        int i23;
        String str5;
        zzae zzaeVarM13591b;
        String str6;
        long j4;
        zzgaa zzgaaVar;
        ArrayList arrayList3;
        ArrayList arrayList4 = new ArrayList();
        int i24 = 0;
        while (i24 < xlr0Var.f195015d.size()) {
            xlr0 xlr0Var4 = (xlr0) xlr0Var.f195015d.get(i24);
            if (xlr0Var4.f205002a != 1953653099) {
                arrayList3 = arrayList4;
                i4 = i24;
            } else {
                ylr0 ylr0VarM211670d = xlr0Var.m211670d(1836476516);
                ylr0VarM211670d.getClass();
                xlr0 xlr0VarM211669c = xlr0Var4.m211669c(1835297121);
                xlr0VarM211669c.getClass();
                ylr0 ylr0VarM211670d2 = xlr0VarM211669c.m211670d(1751411826);
                ylr0VarM211670d2.getClass();
                int iM135975g = m135975g(ylr0VarM211670d2.f200580b);
                if (iM135975g == 1936684398) {
                    i = 1;
                } else if (iM135975g == 1986618469) {
                    i = 2;
                } else if (iM135975g == 1952807028 || iM135975g == 1935832172 || iM135975g == 1937072756 || iM135975g == 1668047728) {
                    i = 3;
                } else {
                    i = iM135975g == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    arrayList = arrayList4;
                    i4 = i24;
                    xlr0Var2 = xlr0Var4;
                    hnr0Var = null;
                } else {
                    ylr0 ylr0VarM211670d3 = xlr0Var4.m211670d(1953196132);
                    ylr0VarM211670d3.getClass();
                    bgw0 bgw0Var = ylr0VarM211670d3.f200580b;
                    int i25 = 8;
                    bgw0Var.m104269k(8);
                    int iM220300a = zlr0.m220300a(bgw0Var.m104280v());
                    bgw0Var.m104270l(iM220300a == 0 ? 8 : 16);
                    int iM104280v = bgw0Var.m104280v();
                    bgw0Var.m104270l(4);
                    int iM104277s = bgw0Var.m104277s();
                    int i26 = 0;
                    while (true) {
                        if (iM220300a == 0) {
                            i25 = 4;
                        }
                        jM159395H = -9223372036854775807L;
                        if (i26 >= i25) {
                            bgw0Var.m104270l(i25);
                        } else {
                            if (bgw0Var.m104271m()[iM104277s + i26] != -1) {
                                long jM104253J = iM220300a == 0 ? bgw0Var.m104253J() : bgw0Var.m104254K();
                                if (jM104253J != 0) {
                                    j2 = jM104253J;
                                    break;
                                }
                                break;
                            }
                            i26++;
                            i25 = 8;
                        }
                        j2 = -9223372036854775807L;
                        break;
                    }
                    bgw0Var.m104270l(16);
                    int iM104280v2 = bgw0Var.m104280v();
                    int iM104280v3 = bgw0Var.m104280v();
                    bgw0Var.m104270l(4);
                    int iM104280v4 = bgw0Var.m104280v();
                    int iM104280v5 = bgw0Var.m104280v();
                    int i27 = 65536;
                    if (iM104280v2 != 0) {
                        if (iM104280v2 == 0) {
                            i27 = iM104280v4;
                            i2 = iM104280v2;
                        } else if (iM104280v3 != -65536) {
                            i27 = iM104280v4;
                            i2 = 0;
                        } else if (iM104280v4 == 65536) {
                            iM104280v3 = -65536;
                            i27 = iM104280v4;
                            i2 = 0;
                        } else if (iM104280v5 == 0) {
                            i3 = 270;
                        } else {
                            iM104280v3 = -65536;
                            i2 = 0;
                        }
                        if (i2 != -65536 && iM104280v3 == 0 && i27 == 0 && iM104280v5 == -65536) {
                            i3 = 180;
                        } else {
                            i3 = 0;
                        }
                    } else {
                        if (iM104280v3 == 65536) {
                            if (iM104280v4 == -65536) {
                                if (iM104280v5 == 0) {
                                    i3 = 90;
                                } else {
                                    iM104280v4 = -65536;
                                }
                            }
                            iM104280v3 = 65536;
                        }
                        iM104280v2 = 0;
                        if (iM104280v2 == 0) {
                            i27 = iM104280v4;
                            i2 = iM104280v2;
                        } else if (iM104280v3 != -65536) {
                            i27 = iM104280v4;
                            i2 = 0;
                        } else if (iM104280v4 == 65536) {
                            iM104280v3 = -65536;
                            i27 = iM104280v4;
                            i2 = 0;
                        } else if (iM104280v5 == 0) {
                            i3 = 270;
                        } else {
                            iM104280v3 = -65536;
                            i2 = 0;
                        }
                        if (i2 != -65536) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                        }
                    }
                    gmr0 gmr0Var2 = new gmr0(iM104280v, j2, i3);
                    long j5 = j == -9223372036854775807L ? gmr0Var2.f105030b : j;
                    long j6 = m135971c(ylr0VarM211670d.f200580b).zzc;
                    if (j5 == -9223372036854775807L) {
                        j3 = j6;
                    } else {
                        j3 = j6;
                        jM159395H = mpw0.m159395H(j5, 1000000L, j3, RoundingMode.FLOOR);
                    }
                    xlr0 xlr0VarM211669c2 = xlr0VarM211669c.m211669c(1835626086);
                    xlr0VarM211669c2.getClass();
                    char c = 25196;
                    xlr0 xlr0VarM211669c3 = xlr0VarM211669c2.m211669c(1937007212);
                    xlr0VarM211669c3.getClass();
                    ylr0 ylr0VarM211670d4 = xlr0VarM211669c.m211670d(1835296868);
                    ylr0VarM211670d4.getClass();
                    bgw0 bgw0Var2 = ylr0VarM211670d4.f200580b;
                    bgw0Var2.m104269k(8);
                    int iM220300a2 = zlr0.m220300a(bgw0Var2.m104280v());
                    bgw0Var2.m104270l(iM220300a2 == 0 ? 8 : 16);
                    int i28 = iM220300a2 == 0 ? 4 : 8;
                    long jM104253J2 = bgw0Var2.m104253J();
                    bgw0Var2.m104270l(i28);
                    int iM104249F = bgw0Var2.m104249F();
                    StringBuilder sb = new StringBuilder();
                    sb.append((char) (((iM104249F >> 10) & 31) + 96));
                    sb.append((char) (((iM104249F >> 5) & 31) + 96));
                    sb.append((char) ((iM104249F & 31) + 96));
                    Pair pairCreate2 = Pair.create(Long.valueOf(jM104253J2), sb.toString());
                    ylr0 ylr0VarM211670d5 = xlr0VarM211669c3.m211670d(1937011556);
                    if (ylr0VarM211670d5 == null) {
                        throw zzcc.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    int i29 = gmr0Var2.f105029a;
                    int i30 = gmr0Var2.f105031c;
                    String str7 = (String) pairCreate2.second;
                    bgw0 bgw0Var3 = ylr0VarM211670d5.f200580b;
                    bgw0Var3.m104269k(12);
                    int iM104280v6 = bgw0Var3.m104280v();
                    dmr0 dmr0Var = new dmr0(iM104280v6);
                    int i31 = 0;
                    while (i31 < iM104280v6) {
                        int i32 = i;
                        int iM104277s2 = bgw0Var3.m104277s();
                        int iM104280v7 = bgw0Var3.m104280v();
                        String str8 = "childAtomSize must be positive";
                        ter0.m190892b(iM104280v7 > 0, "childAtomSize must be positive");
                        int i33 = i30;
                        int iM104280v8 = bgw0Var3.m104280v();
                        if (iM104280v8 == 1635148593 || iM104280v8 == 1635148595 || iM104280v8 == 1701733238 || iM104280v8 == 1831958048 || iM104280v8 == 1836070006 || iM104280v8 == 1752589105 || iM104280v8 == 1751479857 || iM104280v8 == 1932670515 || iM104280v8 == 1211250227 || iM104280v8 == 1987063864 || iM104280v8 == 1987063865 || iM104280v8 == 1635135537 || iM104280v8 == 1685479798 || iM104280v8 == 1685479729 || iM104280v8 == 1685481573 || iM104280v8 == 1685481521) {
                            i5 = iM104280v6;
                            gmr0Var = gmr0Var2;
                            i6 = i24;
                            i7 = iM104277s2;
                            int i34 = i33;
                            bgw0Var3.m104269k(i7 + 16);
                            bgw0Var3.m104270l(16);
                            int iM104249F2 = bgw0Var3.m104249F();
                            int iM104249F3 = bgw0Var3.m104249F();
                            str = str7;
                            bgw0Var3.m104270l(50);
                            int iM104277s3 = bgw0Var3.m104277s();
                            i8 = i31;
                            int iIntValue = 1701733238;
                            if (iM104280v8 == 1701733238) {
                                Pair pairM135976h = m135976h(bgw0Var3, i7, iM104280v7);
                                if (pairM135976h != null) {
                                    iIntValue = ((Integer) pairM135976h.first).intValue();
                                    zzaeVarM13591b = zzaeVar == null ? null : zzaeVar.m13591b(((inr0) pairM135976h.second).f115994b);
                                    dmr0Var.f89722a[i8] = (inr0) pairM135976h.second;
                                } else {
                                    i7 = i7;
                                    zzaeVarM13591b = zzaeVar;
                                }
                                int i35 = iIntValue;
                                bgw0Var3.m104269k(iM104277s3);
                                i9 = i35;
                                zzaeVar2 = zzaeVarM13591b;
                            } else {
                                i7 = i7;
                                i9 = iM104280v8;
                                zzaeVar2 = zzaeVar;
                            }
                            if (i9 == 1831958048) {
                                str2 = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG;
                            } else if (i9 == 1211250227) {
                                i9 = 1211250227;
                                str2 = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP;
                            } else {
                                str2 = null;
                            }
                            int i36 = iM104277s3;
                            pair = pairCreate2;
                            float f = 1.0f;
                            zzae zzaeVar3 = zzaeVar2;
                            arrayList2 = arrayList4;
                            xlr0Var3 = xlr0Var4;
                            boolean z6 = false;
                            String str9 = null;
                            int i37 = -1;
                            int i38 = 8;
                            int i39 = 8;
                            int i40 = -1;
                            List listZzm = null;
                            ByteBuffer byteBufferM135980l = null;
                            bmr0 bmr0Var = null;
                            int i41 = -1;
                            byte[] bArrCopyOfRange = null;
                            String str10 = str2;
                            int iM208353b = -1;
                            while (i36 - i7 < iM104280v7) {
                                bgw0Var3.m104269k(i36);
                                int iM104277s4 = bgw0Var3.m104277s();
                                int iM104280v9 = bgw0Var3.m104280v();
                                if (iM104280v9 != 0) {
                                    i12 = iM104280v9;
                                } else {
                                    if (bgw0Var3.m104277s() - i7 == iM104280v7) {
                                        break;
                                    }
                                    i12 = 0;
                                }
                                ter0.m190892b(i12 > 0, str8);
                                int iM104280v10 = bgw0Var3.m104280v();
                                String str11 = str8;
                                if (iM104280v10 == 1635148611) {
                                    int i42 = iM104277s4 + 8;
                                    ter0.m190892b(str10 == null, null);
                                    bgw0Var3.m104269k(i42);
                                    jdr0 jdr0VarM144500a = jdr0.m144500a(bgw0Var3);
                                    List list2 = jdr0VarM144500a.f120349a;
                                    dmr0Var.f89724c = jdr0VarM144500a.f120350b;
                                    if (z6) {
                                        z5 = true;
                                    } else {
                                        f = jdr0VarM144500a.f120358j;
                                        z5 = false;
                                    }
                                    str4 = jdr0VarM144500a.f120359k;
                                    iM208352a = jdr0VarM144500a.f120355g;
                                    i20 = jdr0VarM144500a.f120356h;
                                    i21 = jdr0VarM144500a.f120357i;
                                    list = list2;
                                    i22 = jdr0VarM144500a.f120353e;
                                    i23 = jdr0VarM144500a.f120354f;
                                    str5 = YtVideoEncoder.MIME_TYPE;
                                } else {
                                    if (iM104280v10 == 1752589123) {
                                        int i43 = iM104277s4 + 8;
                                        ter0.m190892b(str10 == null, null);
                                        bgw0Var3.m104269k(i43);
                                        sfr0 sfr0VarM185662a = sfr0.m185662a(bgw0Var3);
                                        List list3 = sfr0VarM185662a.f167758a;
                                        dmr0Var.f89724c = sfr0VarM185662a.f167759b;
                                        if (z6) {
                                            z5 = true;
                                        } else {
                                            f = sfr0VarM185662a.f167765h;
                                            z5 = false;
                                        }
                                        str4 = sfr0VarM185662a.f167766i;
                                        iM208352a = sfr0VarM185662a.f167762e;
                                        i20 = sfr0VarM185662a.f167763f;
                                        i21 = sfr0VarM185662a.f167764g;
                                        list = list3;
                                        i22 = sfr0VarM185662a.f167760c;
                                        i23 = sfr0VarM185662a.f167761d;
                                        str5 = "video/hevc";
                                    } else if (iM104280v10 == 1685480259 || iM104280v10 == 1685485123) {
                                        str3 = str9;
                                        i13 = i9;
                                        iM208353b = iM208353b;
                                        iM104249F2 = iM104249F2;
                                        dmr0Var = dmr0Var;
                                        i34 = i34;
                                        iM104249F3 = iM104249F3;
                                        fM104248E = f;
                                        ler0 ler0VarM153936a = ler0.m153936a(bgw0Var3);
                                        if (ler0VarM153936a != null) {
                                            str9 = ler0VarM153936a.f131786a;
                                            iM208353b = iM208353b;
                                            str10 = "video/dolby-vision";
                                        } else {
                                            iM208353b = iM208353b;
                                            str9 = str3;
                                        }
                                    } else {
                                        if (iM104280v10 == 1987076931) {
                                            ter0.m190892b(str10 == null, null);
                                            bgw0Var3.m104269k(iM104277s4 + 12);
                                            bgw0Var3.m104270l(2);
                                            int iM104245B = bgw0Var3.m104245B();
                                            int i44 = iM104245B >> 4;
                                            int i45 = iM104245B & 1;
                                            int iM104245B2 = bgw0Var3.m104245B();
                                            int iM104245B3 = bgw0Var3.m104245B();
                                            iM208352a = wwy0.m208352a(iM104245B2);
                                            i40 = 1 != i45 ? 2 : 1;
                                            i13 = i9;
                                            i38 = i44;
                                            i39 = i38;
                                            iM208353b = wwy0.m208353b(iM104245B3);
                                            fM104248E = f;
                                            str10 = i9 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        } else {
                                            i13 = i9;
                                            if (iM104280v10 == 1635135811) {
                                                bgw0Var3.m104269k(iM104277s4 + 8);
                                                dty0 dty0Var = new dty0();
                                                byte[] bArrM104271m = bgw0Var3.m104271m();
                                                dfw0 dfw0Var = new dfw0(bArrM104271m, bArrM104271m.length);
                                                dfw0Var.m115559k(bgw0Var3.m104277s() * 8);
                                                dfw0Var.m115562n(1);
                                                int iM115552d5 = dfw0Var.m115552d(3);
                                                dfw0Var.m115561m(6);
                                                boolean zM115563o2 = dfw0Var.m115563o();
                                                boolean zM115563o3 = dfw0Var.m115563o();
                                                if (iM115552d5 != 2) {
                                                    i14 = 1;
                                                    if (iM115552d5 <= 2) {
                                                        if (true != zM115563o2) {
                                                            i15 = 8;
                                                        } else {
                                                            i15 = 10;
                                                        }
                                                        dty0Var.m117906f(i15);
                                                        dty0Var.m117901a(i15);
                                                    }
                                                } else if (zM115563o2) {
                                                    int i46 = true != zM115563o3 ? 10 : 12;
                                                    dty0Var.m117906f(i46);
                                                    dty0Var.m117901a(i46);
                                                    i14 = 1;
                                                } else {
                                                    iM115552d5 = 2;
                                                    zM115563o2 = false;
                                                    i14 = 1;
                                                    if (iM115552d5 <= 2) {
                                                        if (true != zM115563o2) {
                                                            i15 = 8;
                                                        } else {
                                                            i15 = 10;
                                                        }
                                                        dty0Var.m117906f(i15);
                                                        dty0Var.m117901a(i15);
                                                    }
                                                }
                                                dfw0Var.m115561m(13);
                                                dfw0Var.m115560l();
                                                int iM115552d6 = dfw0Var.m115552d(4);
                                                if (iM115552d6 != i14) {
                                                    y4w0.m214277e("AtomParsers", "Unsupported obu_type: " + iM115552d6);
                                                    wwy0VarM117907g = dty0Var.m117907g();
                                                } else if (dfw0Var.m115563o()) {
                                                    y4w0.m214277e("AtomParsers", "Unsupported obu_extension_flag");
                                                    wwy0VarM117907g = dty0Var.m117907g();
                                                } else {
                                                    boolean zM115563o4 = dfw0Var.m115563o();
                                                    dfw0Var.m115560l();
                                                    if (!zM115563o4 || dfw0Var.m115552d(8) <= 127) {
                                                        int iM115552d7 = dfw0Var.m115552d(3);
                                                        dfw0Var.m115560l();
                                                        if (dfw0Var.m115563o()) {
                                                            y4w0.m214277e("AtomParsers", "Unsupported reduced_still_picture_header");
                                                            wwy0VarM117907g = dty0Var.m117907g();
                                                        } else if (dfw0Var.m115563o()) {
                                                            y4w0.m214277e("AtomParsers", "Unsupported timing_info_present_flag");
                                                            wwy0VarM117907g = dty0Var.m117907g();
                                                        } else {
                                                            if (dfw0Var.m115563o()) {
                                                                y4w0.m214277e("AtomParsers", "Unsupported initial_display_delay_present_flag");
                                                                wwy0VarM117907g = dty0Var.m117907g();
                                                            } else {
                                                                int i47 = 5;
                                                                int iM115552d8 = dfw0Var.m115552d(5);
                                                                int i48 = 0;
                                                                while (i48 <= iM115552d8) {
                                                                    dfw0Var.m115561m(12);
                                                                    if (dfw0Var.m115552d(i47) > 7) {
                                                                        dfw0Var.m115560l();
                                                                    }
                                                                    i48++;
                                                                    i47 = 5;
                                                                }
                                                                int iM115552d9 = dfw0Var.m115552d(4);
                                                                int iM115552d10 = dfw0Var.m115552d(4);
                                                                dfw0Var.m115561m(iM115552d9 + 1);
                                                                dfw0Var.m115561m(iM115552d10 + 1);
                                                                if (dfw0Var.m115563o()) {
                                                                    i16 = 7;
                                                                    dfw0Var.m115561m(7);
                                                                } else {
                                                                    i16 = 7;
                                                                }
                                                                dfw0Var.m115561m(i16);
                                                                boolean zM115563o5 = dfw0Var.m115563o();
                                                                if (zM115563o5) {
                                                                    dfw0Var.m115561m(2);
                                                                }
                                                                if (dfw0Var.m115563o()) {
                                                                    i17 = 1;
                                                                } else {
                                                                    i17 = 1;
                                                                    if (dfw0Var.m115552d(1) > 0) {
                                                                    }
                                                                    if (zM115563o5) {
                                                                        dfw0Var.m115561m(3);
                                                                    }
                                                                    dfw0Var.m115561m(3);
                                                                    zM115563o = dfw0Var.m115563o();
                                                                    if (iM115552d7 == 2) {
                                                                        z4 = iM115552d7 != 1;
                                                                        if (dfw0Var.m115563o()) {
                                                                            iM115552d = dfw0Var.m115552d(8);
                                                                            iM115552d2 = dfw0Var.m115552d(8);
                                                                            iM115552d3 = dfw0Var.m115552d(8);
                                                                            if (z4) {
                                                                                i18 = 1;
                                                                            } else {
                                                                                i18 = 1;
                                                                                if (iM115552d != 1) {
                                                                                    if (iM115552d2 == 13) {
                                                                                        if (iM115552d3 == 0) {
                                                                                            iM115552d2 = 13;
                                                                                            iM115552d4 = 1;
                                                                                            iM115552d = 1;
                                                                                        } else {
                                                                                            iM115552d2 = 13;
                                                                                        }
                                                                                    }
                                                                                    iM115552d = 1;
                                                                                }
                                                                                dty0Var.m117903c(wwy0.m208352a(iM115552d));
                                                                                if (iM115552d4 == i18) {
                                                                                    i19 = 1;
                                                                                } else {
                                                                                    i19 = 2;
                                                                                }
                                                                                dty0Var.m117902b(i19);
                                                                                dty0Var.m117904d(wwy0.m208353b(iM115552d2));
                                                                            }
                                                                            iM115552d4 = dfw0Var.m115552d(i18);
                                                                            dty0Var.m117903c(wwy0.m208352a(iM115552d));
                                                                            if (iM115552d4 == i18) {
                                                                                i19 = 1;
                                                                            } else {
                                                                                i19 = 2;
                                                                            }
                                                                            dty0Var.m117902b(i19);
                                                                            dty0Var.m117904d(wwy0.m208353b(iM115552d2));
                                                                        }
                                                                        wwy0VarM117907g = dty0Var.m117907g();
                                                                    } else if (zM115563o) {
                                                                        dfw0Var.m115560l();
                                                                    }
                                                                    if (dfw0Var.m115563o()) {
                                                                    }
                                                                    if (dfw0Var.m115563o()) {
                                                                        iM115552d = dfw0Var.m115552d(8);
                                                                        iM115552d2 = dfw0Var.m115552d(8);
                                                                        iM115552d3 = dfw0Var.m115552d(8);
                                                                        if (z4) {
                                                                            i18 = 1;
                                                                            if (iM115552d != 1) {
                                                                                if (iM115552d2 == 13) {
                                                                                    if (iM115552d3 == 0) {
                                                                                        iM115552d2 = 13;
                                                                                        iM115552d4 = 1;
                                                                                        iM115552d = 1;
                                                                                    } else {
                                                                                        iM115552d2 = 13;
                                                                                    }
                                                                                }
                                                                                iM115552d = 1;
                                                                            }
                                                                            dty0Var.m117903c(wwy0.m208352a(iM115552d));
                                                                            if (iM115552d4 == i18) {
                                                                                i19 = 1;
                                                                            } else {
                                                                                i19 = 2;
                                                                            }
                                                                            dty0Var.m117902b(i19);
                                                                            dty0Var.m117904d(wwy0.m208353b(iM115552d2));
                                                                        } else {
                                                                            i18 = 1;
                                                                        }
                                                                        iM115552d4 = dfw0Var.m115552d(i18);
                                                                        dty0Var.m117903c(wwy0.m208352a(iM115552d));
                                                                        if (iM115552d4 == i18) {
                                                                            i19 = 1;
                                                                        } else {
                                                                            i19 = 2;
                                                                        }
                                                                        dty0Var.m117902b(i19);
                                                                        dty0Var.m117904d(wwy0.m208353b(iM115552d2));
                                                                    }
                                                                    wwy0VarM117907g = dty0Var.m117907g();
                                                                }
                                                                if (!dfw0Var.m115563o()) {
                                                                    dfw0Var.m115561m(i17);
                                                                }
                                                                if (zM115563o5) {
                                                                    dfw0Var.m115561m(3);
                                                                }
                                                                dfw0Var.m115561m(3);
                                                                zM115563o = dfw0Var.m115563o();
                                                                if (iM115552d7 == 2) {
                                                                    if (iM115552d7 != 1) {
                                                                    }
                                                                    if (dfw0Var.m115563o()) {
                                                                        iM115552d = dfw0Var.m115552d(8);
                                                                        iM115552d2 = dfw0Var.m115552d(8);
                                                                        iM115552d3 = dfw0Var.m115552d(8);
                                                                        if (z4) {
                                                                            i18 = 1;
                                                                            if (iM115552d != 1) {
                                                                                if (iM115552d2 == 13) {
                                                                                    if (iM115552d3 == 0) {
                                                                                        iM115552d2 = 13;
                                                                                        iM115552d4 = 1;
                                                                                        iM115552d = 1;
                                                                                    } else {
                                                                                        iM115552d2 = 13;
                                                                                    }
                                                                                }
                                                                                iM115552d = 1;
                                                                            }
                                                                            dty0Var.m117903c(wwy0.m208352a(iM115552d));
                                                                            if (iM115552d4 == i18) {
                                                                                i19 = 1;
                                                                            } else {
                                                                                i19 = 2;
                                                                            }
                                                                            dty0Var.m117902b(i19);
                                                                            dty0Var.m117904d(wwy0.m208353b(iM115552d2));
                                                                        } else {
                                                                            i18 = 1;
                                                                        }
                                                                        iM115552d4 = dfw0Var.m115552d(i18);
                                                                        dty0Var.m117903c(wwy0.m208352a(iM115552d));
                                                                        if (iM115552d4 == i18) {
                                                                            i19 = 1;
                                                                        } else {
                                                                            i19 = 2;
                                                                        }
                                                                        dty0Var.m117902b(i19);
                                                                        dty0Var.m117904d(wwy0.m208353b(iM115552d2));
                                                                    }
                                                                    wwy0VarM117907g = dty0Var.m117907g();
                                                                } else if (zM115563o) {
                                                                    dfw0Var.m115560l();
                                                                }
                                                                if (dfw0Var.m115563o()) {
                                                                }
                                                                if (dfw0Var.m115563o()) {
                                                                    iM115552d = dfw0Var.m115552d(8);
                                                                    iM115552d2 = dfw0Var.m115552d(8);
                                                                    iM115552d3 = dfw0Var.m115552d(8);
                                                                    if (z4) {
                                                                        i18 = 1;
                                                                        if (iM115552d != 1) {
                                                                            if (iM115552d2 == 13) {
                                                                                if (iM115552d3 == 0) {
                                                                                    iM115552d2 = 13;
                                                                                    iM115552d4 = 1;
                                                                                    iM115552d = 1;
                                                                                } else {
                                                                                    iM115552d2 = 13;
                                                                                }
                                                                            }
                                                                            iM115552d = 1;
                                                                        }
                                                                        dty0Var.m117903c(wwy0.m208352a(iM115552d));
                                                                        if (iM115552d4 == i18) {
                                                                            i19 = 1;
                                                                        } else {
                                                                            i19 = 2;
                                                                        }
                                                                        dty0Var.m117902b(i19);
                                                                        dty0Var.m117904d(wwy0.m208353b(iM115552d2));
                                                                    } else {
                                                                        i18 = 1;
                                                                    }
                                                                    iM115552d4 = dfw0Var.m115552d(i18);
                                                                    dty0Var.m117903c(wwy0.m208352a(iM115552d));
                                                                    if (iM115552d4 == i18) {
                                                                        i19 = 1;
                                                                    } else {
                                                                        i19 = 2;
                                                                    }
                                                                    dty0Var.m117902b(i19);
                                                                    dty0Var.m117904d(wwy0.m208353b(iM115552d2));
                                                                }
                                                                wwy0VarM117907g = dty0Var.m117907g();
                                                            }
                                                            int i49 = wwy0VarM117907g.f191349c;
                                                            int i50 = wwy0VarM117907g.f191348b;
                                                            iM208352a = wwy0VarM117907g.f191347a;
                                                            int i51 = wwy0VarM117907g.f191352f;
                                                            i39 = wwy0VarM117907g.f191351e;
                                                            iM208353b = i49;
                                                            i40 = i50;
                                                            i38 = i51;
                                                            str10 = "video/av01";
                                                            fM104248E = f;
                                                        }
                                                    } else {
                                                        y4w0.m214277e("AtomParsers", "Excessive obu_size");
                                                        wwy0VarM117907g = dty0Var.m117907g();
                                                    }
                                                }
                                                int i410 = wwy0VarM117907g.f191349c;
                                                int i52 = wwy0VarM117907g.f191348b;
                                                iM208352a = wwy0VarM117907g.f191347a;
                                                int i53 = wwy0VarM117907g.f191352f;
                                                i39 = wwy0VarM117907g.f191351e;
                                                iM208353b = i410;
                                                i40 = i52;
                                                i38 = i53;
                                                str10 = "video/av01";
                                                fM104248E = f;
                                            } else {
                                                iM208353b = iM208353b;
                                                if (iM104280v10 == 1668050025) {
                                                    if (byteBufferM135980l == null) {
                                                        byteBufferM135980l = m135980l();
                                                    }
                                                    ByteBuffer byteBuffer = byteBufferM135980l;
                                                    byteBuffer.position(21);
                                                    byteBuffer.putShort(bgw0Var3.m104262d());
                                                    byteBuffer.putShort(bgw0Var3.m104262d());
                                                    iM208353b = iM208353b;
                                                    byteBufferM135980l = byteBuffer;
                                                    iM104249F2 = iM104249F2;
                                                    dmr0Var = dmr0Var;
                                                    i34 = i34;
                                                    iM104249F3 = iM104249F3;
                                                    fM104248E = f;
                                                } else {
                                                    if (iM104280v10 == 1835295606) {
                                                        if (byteBufferM135980l == null) {
                                                            byteBufferM135980l = m135980l();
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBufferM135980l;
                                                        short sM104262d = bgw0Var3.m104262d();
                                                        short sM104262d2 = bgw0Var3.m104262d();
                                                        short sM104262d3 = bgw0Var3.m104262d();
                                                        dmr0Var = dmr0Var;
                                                        short sM104262d4 = bgw0Var3.m104262d();
                                                        i34 = i34;
                                                        short sM104262d5 = bgw0Var3.m104262d();
                                                        fM104248E = f;
                                                        short sM104262d6 = bgw0Var3.m104262d();
                                                        iM104249F3 = iM104249F3;
                                                        short sM104262d7 = bgw0Var3.m104262d();
                                                        iM104249F2 = iM104249F2;
                                                        short sM104262d8 = bgw0Var3.m104262d();
                                                        long jM104253J3 = bgw0Var3.m104253J();
                                                        long jM104253J4 = bgw0Var3.m104253J();
                                                        str3 = str9;
                                                        byteBuffer2.position(1);
                                                        byteBuffer2.putShort(sM104262d5);
                                                        byteBuffer2.putShort(sM104262d6);
                                                        byteBuffer2.putShort(sM104262d);
                                                        byteBuffer2.putShort(sM104262d2);
                                                        byteBuffer2.putShort(sM104262d3);
                                                        byteBuffer2.putShort(sM104262d4);
                                                        byteBuffer2.putShort(sM104262d7);
                                                        byteBuffer2.putShort(sM104262d8);
                                                        byteBuffer2.putShort((short) (jM104253J3 / 10000));
                                                        byteBuffer2.putShort((short) (jM104253J4 / 10000));
                                                        byteBufferM135980l = byteBuffer2;
                                                    } else {
                                                        str3 = str9;
                                                        iM104249F2 = iM104249F2;
                                                        dmr0Var = dmr0Var;
                                                        i34 = i34;
                                                        iM104249F3 = iM104249F3;
                                                        fM104248E = f;
                                                        if (iM104280v10 == 1681012275) {
                                                            ter0.m190892b(str10 == null, null);
                                                            str10 = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP;
                                                        } else if (iM104280v10 == 1702061171) {
                                                            ter0.m190892b(str10 == null, null);
                                                            bmr0 bmr0VarM135978j = m135978j(bgw0Var3, iM104277s4);
                                                            String str12 = bmr0VarM135978j.f77398a;
                                                            byte[] bArr = bmr0VarM135978j.f77399b;
                                                            if (bArr != null) {
                                                                bmr0Var = bmr0VarM135978j;
                                                                str10 = str12;
                                                                listZzm = zzgaa.zzm(bArr);
                                                            } else {
                                                                bmr0Var = bmr0VarM135978j;
                                                                str10 = str12;
                                                            }
                                                        } else if (iM104280v10 == 1885434736) {
                                                            bgw0Var3.m104269k(iM104277s4 + 8);
                                                            iM208353b = iM208353b;
                                                            fM104248E = bgw0Var3.m104248E() / bgw0Var3.m104248E();
                                                            str9 = str3;
                                                            z6 = true;
                                                        } else if (iM104280v10 == 1937126244) {
                                                            int i54 = iM104277s4 + 8;
                                                            while (true) {
                                                                if (i54 - iM104277s4 < i12) {
                                                                    bgw0Var3.m104269k(i54);
                                                                    int iM104280v11 = bgw0Var3.m104280v() + i54;
                                                                    if (bgw0Var3.m104280v() == 1886547818) {
                                                                        bArrCopyOfRange = Arrays.copyOfRange(bgw0Var3.m104271m(), i54, iM104280v11);
                                                                    } else {
                                                                        i54 = iM104280v11;
                                                                    }
                                                                } else {
                                                                    iM208353b = iM208353b;
                                                                    str9 = str3;
                                                                    bArrCopyOfRange = null;
                                                                }
                                                            }
                                                        } else {
                                                            if (iM104280v10 == 1936995172) {
                                                                int iM104245B4 = bgw0Var3.m104245B();
                                                                bgw0Var3.m104270l(3);
                                                                if (iM104245B4 == 0) {
                                                                    int iM104245B5 = bgw0Var3.m104245B();
                                                                    if (iM104245B5 == 0) {
                                                                        i41 = 0;
                                                                    } else if (iM104245B5 == 1) {
                                                                        iM208353b = iM208353b;
                                                                        str9 = str3;
                                                                        i41 = 1;
                                                                    } else if (iM104245B5 == 2) {
                                                                        iM208353b = iM208353b;
                                                                        str9 = str3;
                                                                        i41 = 2;
                                                                    } else if (iM104245B5 == 3) {
                                                                        i41 = 3;
                                                                    }
                                                                    str9 = str3;
                                                                }
                                                            } else {
                                                                if (iM104280v10 == 1668246642) {
                                                                    if (i37 == -1) {
                                                                        if (iM208353b == -1) {
                                                                            int iM104280v12 = bgw0Var3.m104280v();
                                                                            if (iM104280v12 == 1852009592 || iM104280v12 == 1852009571) {
                                                                                int iM104249F4 = bgw0Var3.m104249F();
                                                                                int iM104249F5 = bgw0Var3.m104249F();
                                                                                bgw0Var3.m104270l(2);
                                                                                if (i12 != 19) {
                                                                                    z3 = false;
                                                                                } else if ((bgw0Var3.m104245B() & 128) != 0) {
                                                                                    i12 = 19;
                                                                                    z3 = true;
                                                                                } else {
                                                                                    i12 = 19;
                                                                                    z3 = false;
                                                                                }
                                                                                int iM208352a2 = wwy0.m208352a(iM104249F4);
                                                                                int i55 = true != z3 ? 2 : 1;
                                                                                i37 = iM208352a2;
                                                                                iM208353b = wwy0.m208353b(iM104249F5);
                                                                                i40 = i55;
                                                                            } else {
                                                                                y4w0.m214278f("AtomParsers", "Unsupported color type: ".concat(zlr0.m220301b(iM104280v12)));
                                                                                iM208353b = -1;
                                                                                i37 = -1;
                                                                            }
                                                                        } else {
                                                                            iM208353b = iM208353b;
                                                                            i37 = -1;
                                                                        }
                                                                    }
                                                                    str9 = str3;
                                                                }
                                                                iM208353b = iM208353b;
                                                                str9 = str3;
                                                            }
                                                            iM208353b = iM208353b;
                                                            str9 = str3;
                                                        }
                                                    }
                                                    str9 = str3;
                                                }
                                            }
                                        }
                                        i37 = iM208352a;
                                    }
                                    i36 += i12;
                                    iM104280v7 = iM104280v7;
                                    str8 = str11;
                                    i9 = i13;
                                    dmr0Var = dmr0Var;
                                    i34 = i34;
                                    f = fM104248E;
                                    iM104249F3 = iM104249F3;
                                    iM104249F2 = iM104249F2;
                                }
                                i13 = i9;
                                z6 = z5;
                                i40 = i20;
                                fM104248E = f;
                                listZzm = list;
                                str10 = str5;
                                i38 = i23;
                                i39 = i22;
                                str9 = str4;
                                iM208353b = i21;
                                i37 = iM208352a;
                                i36 += i12;
                                iM104280v7 = iM104280v7;
                                str8 = str11;
                                i9 = i13;
                                dmr0Var = dmr0Var;
                                i34 = i34;
                                f = fM104248E;
                                iM104249F3 = iM104249F3;
                                iM104249F2 = iM104249F2;
                            }
                            String str13 = str9;
                            i10 = iM104280v7;
                            int i56 = iM208353b;
                            int i57 = iM104249F2;
                            dmr0 dmr0Var2 = dmr0Var;
                            int i58 = i34;
                            int i59 = iM104249F3;
                            float f2 = f;
                            if (str10 == null) {
                                dmr0Var = dmr0Var2;
                                i11 = i58;
                            } else {
                                znr0 znr0Var = new znr0();
                                znr0Var.m220656j(i29);
                                znr0Var.m220672w(str10);
                                znr0Var.m220661l0(str13);
                                znr0Var.m220644C(i57);
                                znr0Var.m220654i(i59);
                                znr0Var.m220668s(f2);
                                i11 = i58;
                                znr0Var.m220671v(i11);
                                znr0Var.m220669t(bArrCopyOfRange);
                                znr0Var.m220675z(i41);
                                znr0Var.m220660l(listZzm);
                                znr0Var.m220650e(zzaeVar3);
                                dty0 dty0Var2 = new dty0();
                                dty0Var2.m117903c(i37);
                                dty0Var2.m117902b(i40);
                                dty0Var2.m117904d(i56);
                                dty0Var2.m117905e(byteBufferM135980l != null ? byteBufferM135980l.array() : null);
                                dty0Var2.m117906f(i39);
                                dty0Var2.m117901a(i38);
                                znr0Var.m220646a(dty0Var2.m117907g());
                                if (bmr0Var != null) {
                                    znr0Var.m220657j0(utw0.m198113c(bmr0Var.f77400c));
                                    znr0Var.m220667r(utw0.m198113c(bmr0Var.f77401d));
                                }
                                dmr0Var = dmr0Var2;
                                dmr0Var.f89723b = znr0Var.m220645D();
                            }
                        } else if (iM104280v8 == 1836069985 || iM104280v8 == 1701733217 || iM104280v8 == 1633889587 || iM104280v8 == 1700998451 || iM104280v8 == 1633889588 || iM104280v8 == 1835823201 || iM104280v8 == 1685353315 || iM104280v8 == 1685353317 || iM104280v8 == 1685353320 || iM104280v8 == 1685353324 || iM104280v8 == 1685353336 || iM104280v8 == 1935764850 || iM104280v8 == 1935767394 || iM104280v8 == 1819304813 || iM104280v8 == 1936684916 || iM104280v8 == 1953984371 || iM104280v8 == 778924082 || iM104280v8 == 778924083 || iM104280v8 == 1835557169 || iM104280v8 == 1835560241 || iM104280v8 == 1634492771 || iM104280v8 == 1634492791 || iM104280v8 == 1970037111 || iM104280v8 == 1332770163 || iM104280v8 == 1716281667) {
                            i5 = iM104280v6;
                            gmr0Var = gmr0Var2;
                            i6 = i24;
                            i11 = i33;
                            m135981m(bgw0Var3, iM104280v8, iM104277s2, iM104280v7, i29, str7, z2, zzaeVar, dmr0Var, i31);
                            i7 = iM104277s2;
                            i10 = iM104280v7;
                            i8 = i31;
                            arrayList2 = arrayList4;
                            xlr0Var3 = xlr0Var4;
                            pair = pairCreate2;
                            str = str7;
                        } else if (iM104280v8 == 1414810956 || iM104280v8 == 1954034535 || iM104280v8 == 2004251764 || iM104280v8 == 1937010800 || iM104280v8 == 1664495672) {
                            bgw0Var3.m104269k(iM104277s2 + 16);
                            String str14 = "application/ttml+xml";
                            if (iM104280v8 == 1414810956) {
                                str6 = str14;
                                j4 = Long.MAX_VALUE;
                                zzgaaVar = null;
                            } else if (iM104280v8 == 1954034535) {
                                int i60 = iM104280v7 - 16;
                                byte[] bArr2 = new byte[i60];
                                bgw0Var3.m104265g(bArr2, 0, i60);
                                zzgaa zzgaaVarZzm = zzgaa.zzm(bArr2);
                                str6 = "application/x-quicktime-tx3g";
                                zzgaaVar = zzgaaVarZzm;
                                bgw0Var3 = bgw0Var3;
                                iM104280v7 = iM104280v7;
                                j4 = Long.MAX_VALUE;
                            } else {
                                if (iM104280v8 == 2004251764) {
                                    str14 = "application/x-mp4-vtt";
                                    str6 = str14;
                                    j4 = Long.MAX_VALUE;
                                } else if (iM104280v8 == 1937010800) {
                                    str6 = "application/ttml+xml";
                                    j4 = 0;
                                } else {
                                    dmr0Var.f89725d = 1;
                                    str6 = "application/x-mp4-cea-608";
                                    j4 = Long.MAX_VALUE;
                                }
                                zzgaaVar = null;
                            }
                            znr0 znr0Var2 = new znr0();
                            znr0Var2.m220656j(i29);
                            znr0Var2.m220672w(str6);
                            znr0Var2.m220663n(str7);
                            znr0Var2.m220643B(j4);
                            znr0Var2.m220660l(zzgaaVar);
                            dmr0Var.f89723b = znr0Var2.m220645D();
                            str = str7;
                            i5 = iM104280v6;
                            arrayList2 = arrayList4;
                            gmr0Var = gmr0Var2;
                            i6 = i24;
                            xlr0Var3 = xlr0Var4;
                            pair = pairCreate2;
                            bgw0Var3 = bgw0Var3;
                            i7 = iM104277s2;
                            i10 = iM104280v7;
                            i11 = i33;
                            i8 = i31;
                        } else {
                            if (iM104280v8 == 1835365492) {
                                bgw0Var3.m104269k(iM104277s2 + 16);
                                bgw0Var3.m104256M((char) 0);
                                String strM104256M = bgw0Var3.m104256M((char) 0);
                                if (strM104256M != null) {
                                    znr0 znr0Var3 = new znr0();
                                    znr0Var3.m220656j(i29);
                                    znr0Var3.m220672w(strM104256M);
                                    dmr0Var.f89723b = znr0Var3.m220645D();
                                }
                            } else if (iM104280v8 == 1667329389) {
                                znr0 znr0Var4 = new znr0();
                                znr0Var4.m220656j(i29);
                                znr0Var4.m220672w("application/x-camera-motion");
                                dmr0Var.f89723b = znr0Var4.m220645D();
                            }
                            i10 = iM104280v7;
                            str = str7;
                            i5 = iM104280v6;
                            i8 = i31;
                            arrayList2 = arrayList4;
                            gmr0Var = gmr0Var2;
                            i6 = i24;
                            xlr0Var3 = xlr0Var4;
                            pair = pairCreate2;
                            i7 = iM104277s2;
                            i11 = i33;
                        }
                        bgw0Var3.m104269k(i7 + i10);
                        i31 = i8 + 1;
                        i30 = i11;
                        gmr0Var2 = gmr0Var;
                        iM104280v6 = i5;
                        str7 = str;
                        i = i32;
                        i24 = i6;
                        arrayList4 = arrayList2;
                        pairCreate2 = pair;
                        xlr0Var4 = xlr0Var3;
                        c = 25196;
                    }
                    int i61 = i;
                    arrayList = arrayList4;
                    gmr0 gmr0Var3 = gmr0Var2;
                    i4 = i24;
                    xlr0 xlr0Var5 = xlr0Var4;
                    Pair pair2 = pairCreate2;
                    if (z) {
                        xlr0Var2 = xlr0Var5;
                    } else {
                        xlr0Var2 = xlr0Var5;
                        xlr0 xlr0VarM211669c4 = xlr0Var2.m211669c(1701082227);
                        if (xlr0VarM211669c4 != null) {
                            ylr0 ylr0VarM211670d6 = xlr0VarM211669c4.m211670d(1701606260);
                            if (ylr0VarM211670d6 == null) {
                                pairCreate = null;
                            } else {
                                bgw0 bgw0Var4 = ylr0VarM211670d6.f200580b;
                                bgw0Var4.m104269k(8);
                                int iM220300a3 = zlr0.m220300a(bgw0Var4.m104280v());
                                int iM104248E = bgw0Var4.m104248E();
                                long[] jArr3 = new long[iM104248E];
                                long[] jArr4 = new long[iM104248E];
                                for (int i62 = 0; i62 < iM104248E; i62++) {
                                    jArr3[i62] = iM220300a3 == 1 ? bgw0Var4.m104254K() : bgw0Var4.m104253J();
                                    jArr4[i62] = iM220300a3 == 1 ? bgw0Var4.m104252I() : bgw0Var4.m104280v();
                                    if (bgw0Var4.m104262d() != 1) {
                                        wg3.m206174a("Unsupported media rate.");
                                        return null;
                                    }
                                    bgw0Var4.m104270l(2);
                                }
                                pairCreate = Pair.create(jArr3, jArr4);
                            }
                            if (pairCreate != null) {
                                long[] jArr5 = (long[]) pairCreate.first;
                                jArr = (long[]) pairCreate.second;
                                jArr2 = jArr5;
                            }
                        }
                        if (dmr0Var.f89723b == null) {
                            hnr0Var = null;
                        } else {
                            hnr0Var = new hnr0(gmr0Var3.f105029a, i61, ((Long) pair2.first).longValue(), j3, jM159395H, dmr0Var.f89723b, dmr0Var.f89725d, dmr0Var.f89722a, dmr0Var.f89724c, jArr2, jArr);
                        }
                    }
                    jArr = null;
                    jArr2 = null;
                    if (dmr0Var.f89723b == null) {
                        hnr0Var = null;
                    } else {
                        hnr0Var = new hnr0(gmr0Var3.f105029a, i61, ((Long) pair2.first).longValue(), j3, jM159395H, dmr0Var.f89723b, dmr0Var.f89725d, dmr0Var.f89722a, dmr0Var.f89724c, jArr2, jArr);
                    }
                }
                hnr0 hnr0Var2 = (hnr0) eow0Var.apply(hnr0Var);
                if (hnr0Var2 != null) {
                    xlr0 xlr0VarM211669c5 = xlr0Var2.m211669c(1835297121);
                    xlr0VarM211669c5.getClass();
                    xlr0 xlr0VarM211669c6 = xlr0VarM211669c5.m211669c(1835626086);
                    xlr0VarM211669c6.getClass();
                    xlr0 xlr0VarM211669c7 = xlr0VarM211669c6.m211669c(1937007212);
                    xlr0VarM211669c7.getClass();
                    knr0 knr0VarM135979k = m135979k(hnr0Var2, xlr0VarM211669c7, rfr0Var);
                    arrayList3 = arrayList;
                    arrayList3.add(knr0VarM135979k);
                } else {
                    arrayList3 = arrayList;
                }
            }
            i24 = i4 + 1;
            arrayList4 = arrayList3;
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: e */
    public static void m135973e(bgw0 bgw0Var) {
        int iM104277s = bgw0Var.m104277s();
        bgw0Var.m104270l(4);
        if (bgw0Var.m104280v() != 1751411826) {
            iM104277s += 4;
        }
        bgw0Var.m104269k(iM104277s);
    }

    /* JADX INFO: renamed from: f */
    public static int m135974f(bgw0 bgw0Var) {
        int iM104245B = bgw0Var.m104245B();
        int i = iM104245B & 127;
        while ((iM104245B & 128) == 128) {
            iM104245B = bgw0Var.m104245B();
            i = (i << 7) | (iM104245B & 127);
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public static int m135975g(bgw0 bgw0Var) {
        bgw0Var.m104269k(16);
        return bgw0Var.m104280v();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Pair m135976h(bgw0 bgw0Var, int i, int i2) throws zzcc {
        inr0 inr0Var;
        Pair pairCreate;
        int i3;
        int i4;
        int iM104277s = bgw0Var.m104277s();
        while (iM104277s - i < i2) {
            bgw0Var.m104269k(iM104277s);
            int iM104280v = bgw0Var.m104280v();
            ter0.m190892b(iM104280v > 0, "childAtomSize must be positive");
            if (bgw0Var.m104280v() == 1936289382) {
                int i5 = iM104277s + 8;
                int i6 = 0;
                int i7 = -1;
                Integer numValueOf = null;
                String strM104259a = null;
                while (i5 - iM104277s < iM104280v) {
                    bgw0Var.m104269k(i5);
                    int iM104280v2 = bgw0Var.m104280v();
                    int iM104280v3 = bgw0Var.m104280v();
                    if (iM104280v3 == 1718775137) {
                        numValueOf = Integer.valueOf(bgw0Var.m104280v());
                    } else if (iM104280v3 == 1935894637) {
                        bgw0Var.m104270l(4);
                        strM104259a = bgw0Var.m104259a(4, cow0.f82931c);
                    } else if (iM104280v3 == 1935894633) {
                        i7 = i5;
                        i6 = iM104280v2;
                    }
                    i5 += iM104280v2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strM104259a) || "cbc1".equals(strM104259a) || "cens".equals(strM104259a) || "cbcs".equals(strM104259a)) {
                    ter0.m190892b(numValueOf != null, "frma atom is mandatory");
                    ter0.m190892b(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            inr0Var = null;
                            break;
                        }
                        bgw0Var.m104269k(i8);
                        int iM104280v4 = bgw0Var.m104280v();
                        if (bgw0Var.m104280v() == 1952804451) {
                            int iM220300a = zlr0.m220300a(bgw0Var.m104280v());
                            bgw0Var.m104270l(1);
                            if (iM220300a == 0) {
                                bgw0Var.m104270l(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iM104245B = bgw0Var.m104245B();
                                i3 = iM104245B & 15;
                                i4 = (iM104245B & 240) >> 4;
                            }
                            boolean z = bgw0Var.m104245B() == 1;
                            int iM104245B2 = bgw0Var.m104245B();
                            byte[] bArr2 = new byte[16];
                            bgw0Var.m104265g(bArr2, 0, 16);
                            if (z && iM104245B2 == 0) {
                                int iM104245B3 = bgw0Var.m104245B();
                                byte[] bArr3 = new byte[iM104245B3];
                                bgw0Var.m104265g(bArr3, 0, iM104245B3);
                                bArr = bArr3;
                            }
                            inr0Var = new inr0(z, strM104259a, iM104245B2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i8 += iM104280v4;
                    }
                    ter0.m190892b(inr0Var != null, "tenc atom is mandatory");
                    int i9 = mpw0.f137957a;
                    pairCreate = Pair.create(numValueOf, inr0Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iM104277s += iM104280v;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static zzby m135977i(bgw0 bgw0Var) {
        short sM104262d = bgw0Var.m104262d();
        bgw0Var.m104270l(2);
        String strM104259a = bgw0Var.m104259a(sM104262d, cow0.f82931c);
        int iMax = Math.max(strM104259a.lastIndexOf(43), strM104259a.lastIndexOf(45));
        try {
            return new zzby(-9223372036854775807L, new zzgf(Float.parseFloat(strM104259a.substring(0, iMax)), Float.parseFloat(strM104259a.substring(iMax, strM104259a.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static bmr0 m135978j(bgw0 bgw0Var, int i) {
        bgw0Var.m104269k(i + 12);
        bgw0Var.m104270l(1);
        m135974f(bgw0Var);
        bgw0Var.m104270l(2);
        int iM104245B = bgw0Var.m104245B();
        if ((iM104245B & 128) != 0) {
            bgw0Var.m104270l(2);
        }
        if ((iM104245B & 64) != 0) {
            bgw0Var.m104270l(bgw0Var.m104245B());
        }
        if ((iM104245B & 32) != 0) {
            bgw0Var.m104270l(2);
        }
        bgw0Var.m104270l(1);
        m135974f(bgw0Var);
        String strM96492d = a8t0.m96492d(bgw0Var.m104245B());
        if (DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG.equals(strM96492d) || "audio/vnd.dts".equals(strM96492d) || "audio/vnd.dts.hd".equals(strM96492d)) {
            return new bmr0(strM96492d, null, -1L, -1L);
        }
        bgw0Var.m104270l(4);
        long jM104253J = bgw0Var.m104253J();
        long jM104253J2 = bgw0Var.m104253J();
        bgw0Var.m104270l(1);
        int iM135974f = m135974f(bgw0Var);
        long j = jM104253J2;
        byte[] bArr = new byte[iM135974f];
        bgw0Var.m104265g(bArr, 0, iM135974f);
        if (j <= 0) {
            j = -1;
        }
        return new bmr0(strM96492d, bArr, j, jM104253J > 0 ? jM104253J : -1L);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0246  */
    /* JADX WARN: Code duplicated, block: B:105:0x0263 A[DONT_INVERT, LOOP:12: B:105:0x0263->B:109:0x026e, LOOP_START, PHI: r16
      0x0263: PHI (r16v4 int) = (r16v2 int), (r16v5 int) binds: [B:104:0x0261, B:109:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x0265  */
    /* JADX WARN: Code duplicated, block: B:109:0x026e A[LOOP:12: B:105:0x0263->B:109:0x026e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0274 A[EDGE_INSN: B:110:0x0274->B:111:0x0276 BREAK  A[LOOP:12: B:105:0x0263->B:109:0x026e]] */
    /* JADX WARN: Code duplicated, block: B:112:0x0278 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x027a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x027c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x027e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0280 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0282  */
    /* JADX WARN: Code duplicated, block: B:118:0x028c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0292  */
    /* JADX WARN: Code duplicated, block: B:121:0x029d  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:129:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:130:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:135:0x0326  */
    /* JADX WARN: Code duplicated, block: B:137:0x0336  */
    /* JADX WARN: Code duplicated, block: B:139:0x0342  */
    /* JADX WARN: Code duplicated, block: B:145:0x037d  */
    /* JADX WARN: Code duplicated, block: B:153:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:157:0x03c1 A[PHI: r11
      0x03c1: PHI (r11v25 long) = (r11v24 long), (r11v26 long) binds: [B:152:0x03b4, B:155:0x03ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:166:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:168:0x0405  */
    /* JADX WARN: Code duplicated, block: B:171:0x0410 A[LOOP:4: B:169:0x040d->B:171:0x0410, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x0438  */
    /* JADX WARN: Code duplicated, block: B:177:0x043e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0440  */
    /* JADX WARN: Code duplicated, block: B:182:0x0455  */
    /* JADX WARN: Code duplicated, block: B:184:0x0460  */
    /* JADX WARN: Code duplicated, block: B:187:0x0489  */
    /* JADX WARN: Code duplicated, block: B:192:0x0499  */
    /* JADX WARN: Code duplicated, block: B:193:0x049b  */
    /* JADX WARN: Code duplicated, block: B:195:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:199:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:200:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:203:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:204:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:206:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:208:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:210:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:211:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:213:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:214:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:218:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:220:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:222:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:224:0x0522  */
    /* JADX WARN: Code duplicated, block: B:225:0x052a  */
    /* JADX WARN: Code duplicated, block: B:228:0x0533  */
    /* JADX WARN: Code duplicated, block: B:242:0x04af A[EDGE_INSN: B:242:0x04af->B:197:0x04af BREAK  A[LOOP:5: B:180:0x044e->B:196:0x04a5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0494 A[ADDED_TO_REGION, EDGE_INSN: B:245:0x0494->B:190:0x0494 BREAK  A[LOOP:6: B:185:0x0483->B:189:0x048e], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0539 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ba A[LOOP:10: B:68:0x01b2->B:71:0x01ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01f0 A[ADDED_TO_REGION, LOOP:11: B:79:0x01f0->B:81:0x01f4, LOOP_START, PHI: r0 r16 r26
      0x01f0: PHI (r0v32 int) = (r0v7 int), (r0v33 int) binds: [B:77:0x01ed, B:81:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r16v7 int) = (r16v2 int), (r16v8 int) binds: [B:77:0x01ed, B:81:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r26v3 int) = (r26v1 int), (r26v7 int) binds: [B:77:0x01ed, B:81:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01f4 A[LOOP:11: B:79:0x01f0->B:81:0x01f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x020d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0217  */
    /* JADX WARN: Code duplicated, block: B:90:0x021a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0220  */
    /* JADX WARN: Code duplicated, block: B:95:0x0226  */
    /* JADX WARN: Code duplicated, block: B:98:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0239  */
    /* JADX INFO: renamed from: k */
    public static knr0 m135979k(hnr0 hnr0Var, xlr0 xlr0Var, rfr0 rfr0Var) throws zzcc {
        cmr0 fmr0Var;
        boolean z;
        int iM104248E;
        int iM104248E2;
        int i;
        int iM104248E3;
        int iZza;
        cmr0 cmr0Var;
        long j;
        long[] jArr;
        int[] iArrCopyOf;
        long[] jArr2;
        int[] iArr;
        int i2;
        bgw0 bgw0Var;
        int i3;
        int iM104280v;
        int i4;
        int i5;
        int i6;
        int iM104248E4;
        long j2;
        long j3;
        long[] jArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        long j4;
        String str;
        long j5;
        boolean zM98853a;
        int i13;
        int i14;
        int iZzc;
        int i15;
        long[] jArr3;
        RoundingMode roundingMode;
        long jM159395H;
        long[] jArr4;
        int i16;
        long j6;
        int[] iArr3;
        int[] iArr4;
        long[] jArr5;
        int i17;
        long[] jArr6;
        int length;
        boolean z2;
        long[] jArr7;
        int[] iArr5;
        int[] iArr6;
        int i18;
        boolean z3;
        int i19;
        int i20;
        long[] jArr8;
        int i21;
        int[] iArr7;
        int i22;
        boolean z4;
        boolean z5;
        long[] jArr9;
        int[] iArr8;
        int i23;
        int[] iArr9;
        long[] jArr10;
        int i24;
        long j7;
        long j8;
        int i25;
        int i26;
        boolean z6;
        long jM159395H2;
        long j9;
        int[] iArr10;
        long j10;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z7;
        long j11;
        int i31;
        int length2;
        long j12;
        long jM159395H3;
        long j13;
        long jM159395H4;
        long jM159395H5;
        ylr0 ylr0VarM211670d = xlr0Var.m211670d(1937011578);
        if (ylr0VarM211670d != null) {
            fmr0Var = new emr0(ylr0VarM211670d, hnr0Var.f110820f);
        } else {
            ylr0 ylr0VarM211670d2 = xlr0Var.m211670d(1937013298);
            if (ylr0VarM211670d2 == null) {
                throw zzcc.zza("Track has no sample table size information", null);
            }
            fmr0Var = new fmr0(ylr0VarM211670d2);
        }
        int iZzb = fmr0Var.zzb();
        if (iZzb == 0) {
            return new knr0(hnr0Var, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        ylr0 ylr0VarM211670d3 = xlr0Var.m211670d(1937007471);
        if (ylr0VarM211670d3 == null) {
            ylr0VarM211670d3 = xlr0Var.m211670d(1668232756);
            ylr0VarM211670d3.getClass();
            z = true;
        } else {
            z = false;
        }
        ylr0 ylr0VarM211670d4 = xlr0Var.m211670d(1937011555);
        ylr0VarM211670d4.getClass();
        ylr0 ylr0VarM211670d5 = xlr0Var.m211670d(1937011827);
        ylr0VarM211670d5.getClass();
        ylr0 ylr0VarM211670d6 = xlr0Var.m211670d(1937011571);
        bgw0 bgw0Var2 = ylr0VarM211670d6 != null ? ylr0VarM211670d6.f200580b : null;
        ylr0 ylr0VarM211670d7 = xlr0Var.m211670d(1668576371);
        bgw0 bgw0Var3 = ylr0VarM211670d7 != null ? ylr0VarM211670d7.f200580b : null;
        bgw0 bgw0Var4 = ylr0VarM211670d5.f200580b;
        amr0 amr0Var = new amr0(ylr0VarM211670d4.f200580b, ylr0VarM211670d3.f200580b, z);
        bgw0Var4.m104269k(12);
        int iM104248E5 = bgw0Var4.m104248E() - 1;
        int iM104248E6 = bgw0Var4.m104248E();
        int iM104248E7 = bgw0Var4.m104248E();
        if (bgw0Var3 != null) {
            bgw0Var3.m104269k(12);
            iM104248E = bgw0Var3.m104248E();
        } else {
            iM104248E = 0;
        }
        if (bgw0Var2 != null) {
            bgw0Var2.m104269k(12);
            iM104248E2 = bgw0Var2.m104248E();
            if (iM104248E2 > 0) {
                iM104248E3 = bgw0Var2.m104248E() - 1;
                i = 0;
            } else {
                bgw0Var2 = null;
                i = 0;
            }
            iZza = fmr0Var.zza();
            String str2 = hnr0Var.f110820f.f170251l;
            cmr0Var = fmr0Var;
            int i32 = iM104248E2;
            if (iZza == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iM104248E5 == 0)) {
                if (iM104248E == 0 && i32 == 0) {
                    int i33 = amr0Var.f72249a;
                    long[] jArr11 = new long[i33];
                    int[] iArr11 = new int[i33];
                    while (amr0Var.m98853a()) {
                        int i34 = amr0Var.f72250b;
                        jArr11[i34] = amr0Var.f72252d;
                        iArr11[i34] = amr0Var.f72251c;
                    }
                    long j14 = iM104248E7;
                    int i35 = 8192 / iZza;
                    int i36 = i;
                    int i37 = i36;
                    while (i36 < i33) {
                        int i38 = iArr11[i36];
                        int i39 = mpw0.f137957a;
                        i37 += ((i38 + i35) - 1) / i35;
                        i36++;
                    }
                    jArrCopyOf = new long[i37];
                    iArr2 = new int[i37];
                    jArrCopyOf2 = new long[i37];
                    iArrCopyOf2 = new int[i37];
                    int i40 = i;
                    int i41 = i40;
                    i12 = i41;
                    int i42 = i12;
                    j = 0;
                    while (i40 < i33) {
                        int i43 = iArr11[i40];
                        int i44 = i42;
                        int i45 = i33;
                        int iMax = i12;
                        int i46 = i44;
                        long j15 = jArr11[i40];
                        long[] jArr12 = jArr11;
                        int i47 = i43;
                        while (i47 > 0) {
                            int iMin = Math.min(i35, i47);
                            jArrCopyOf[i46] = j15;
                            int i48 = i47;
                            int i49 = iZza * iMin;
                            iArr2[i46] = i49;
                            iMax = Math.max(iMax, i49);
                            jArrCopyOf2[i46] = ((long) i41) * j14;
                            iArrCopyOf2[i46] = 1;
                            j15 += (long) iArr2[i46];
                            i41 += iMin;
                            i47 = i48 - iMin;
                            i46++;
                            iZza = iZza;
                        }
                        i40++;
                        int i50 = i46;
                        i12 = iMax;
                        i33 = i45;
                        i42 = i50;
                        jArr11 = jArr12;
                    }
                    j4 = j14 * ((long) i41);
                } else {
                    j = 0;
                    iM104248E5 = i;
                }
                jArr3 = jArrCopyOf;
                long j16 = hnr0Var.f110817c;
                roundingMode = RoundingMode.FLOOR;
                jM159395H = mpw0.m159395H(j4, 1000000L, j16, roundingMode);
                jArr4 = hnr0Var.f110822h;
                if (jArr4 == null) {
                    mpw0.m159407e(jArrCopyOf2, 1000000L, hnr0Var.f110817c);
                    return new knr0(hnr0Var, jArr3, iArr2, i12, jArrCopyOf2, iArrCopyOf2, jM159395H);
                }
                i16 = iZzb;
                j6 = j4;
                iArr3 = iArrCopyOf2;
                iArr4 = iArr2;
                jArr5 = jArrCopyOf2;
                i17 = i12;
                if (jArr4.length == 1 && hnr0Var.f110816b == 1 && (length2 = jArr5.length) >= 2) {
                    long[] jArr13 = hnr0Var.f110823i;
                    jArr13.getClass();
                    j12 = jArr13[i];
                    jM159395H3 = mpw0.m159395H(jArr4[i], hnr0Var.f110817c, hnr0Var.f110818d, roundingMode) + j12;
                    int i51 = length2 - 1;
                    int i52 = i;
                    int iMax2 = Math.max(i52, Math.min(4, i51));
                    int iMax3 = Math.max(i52, Math.min(length2 - 4, i51));
                    j13 = jArr5[i52];
                    if (j13 <= j12 && j12 < jArr5[iMax2] && jArr5[iMax3] < jM159395H3 && jM159395H3 <= j6) {
                        jM159395H4 = mpw0.m159395H(j12 - j13, hnr0Var.f110820f.f170265z, hnr0Var.f110817c, roundingMode);
                        jM159395H5 = mpw0.m159395H(j6 - jM159395H3, hnr0Var.f110820f.f170265z, hnr0Var.f110817c, roundingMode);
                        if (jM159395H4 != j) {
                            if (jM159395H4 <= 2147483647L && jM159395H5 <= 2147483647L) {
                                rfr0Var.f162860a = (int) jM159395H4;
                                rfr0Var.f162861b = (int) jM159395H5;
                                mpw0.m159407e(jArr5, 1000000L, hnr0Var.f110817c);
                                return new knr0(hnr0Var, jArr3, iArr4, i17, jArr5, iArr3, mpw0.m159395H(hnr0Var.f110822h[0], 1000000L, hnr0Var.f110818d, roundingMode));
                            }
                        } else if (jM159395H5 != j) {
                            jM159395H4 = j;
                            if (jM159395H4 <= 2147483647L) {
                                rfr0Var.f162860a = (int) jM159395H4;
                                rfr0Var.f162861b = (int) jM159395H5;
                                mpw0.m159407e(jArr5, 1000000L, hnr0Var.f110817c);
                                return new knr0(hnr0Var, jArr3, iArr4, i17, jArr5, iArr3, mpw0.m159395H(hnr0Var.f110822h[0], 1000000L, hnr0Var.f110818d, roundingMode));
                            }
                        }
                        jArr3 = jArr3;
                        iArr4 = iArr4;
                    }
                }
                jArr6 = hnr0Var.f110822h;
                length = jArr6.length;
                if (length == 1) {
                    if (jArr6[0] == j) {
                        long[] jArr14 = hnr0Var.f110823i;
                        jArr14.getClass();
                        j11 = jArr14[0];
                        for (i31 = 0; i31 < jArr5.length; i31++) {
                            jArr5[i31] = mpw0.m159395H(jArr5[i31] - j11, 1000000L, hnr0Var.f110817c, RoundingMode.FLOOR);
                        }
                        return new knr0(hnr0Var, jArr3, iArr4, i17, jArr5, iArr3, mpw0.m159395H(j6 - j11, 1000000L, hnr0Var.f110817c, RoundingMode.FLOOR));
                    }
                    length = 1;
                }
                if (hnr0Var.f110816b == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jArr7 = hnr0Var.f110823i;
                iArr5 = new int[length];
                iArr6 = new int[length];
                jArr7.getClass();
                i18 = 0;
                z3 = false;
                i19 = 0;
                i20 = 0;
                while (true) {
                    jArr8 = hnr0Var.f110822h;
                    i21 = i17;
                    if (i20 < jArr8.length) {
                        break;
                    }
                    iArr10 = iArr6;
                    long[] jArr15 = jArr7;
                    j10 = jArr15[i20];
                    if (j10 != -1) {
                        i27 = i20;
                        long jM159395H6 = mpw0.m159395H(jArr8[i20], hnr0Var.f110817c, hnr0Var.f110818d, RoundingMode.FLOOR);
                        i28 = 1;
                        iArr5[i27] = mpw0.m159420r(jArr5, j10, true, true);
                        iArr10[i27] = mpw0.m159418p(jArr5, j10 + jM159395H6, z2, false);
                        while (true) {
                            i29 = iArr5[i27];
                            i30 = iArr10[i27];
                            if (i29 >= i30 || (iArr3[i29] & i28) != 0) {
                                break;
                            }
                            iArr5[i27] = i29 + 1;
                            i28 = 1;
                        }
                        i18 += i30 - i29;
                        if (i19 != i29) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z3 = z7 | z3;
                        i19 = i30;
                    } else {
                        i27 = i20;
                    }
                    jArr7 = jArr15;
                    i20 = i27 + 1;
                    iArr6 = iArr10;
                    i17 = i21;
                }
                iArr7 = iArr6;
                i22 = 0;
                if (i18 != i16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z4 | z3;
                if (z5) {
                    jArr9 = new long[i18];
                } else {
                    jArr9 = jArr3;
                }
                if (z5) {
                    iArr8 = new int[i18];
                } else {
                    iArr8 = iArr4;
                }
                if (true == z5) {
                    i23 = 0;
                } else {
                    i23 = i21;
                }
                if (z5) {
                    iArr9 = new int[i18];
                } else {
                    iArr9 = iArr3;
                }
                jArr10 = new long[i18];
                int i53 = i23;
                i24 = 0;
                j7 = j;
                while (i22 < hnr0Var.f110822h.length) {
                    j8 = hnr0Var.f110823i[i22];
                    i25 = iArr5[i22];
                    i26 = iArr7[i22];
                    z6 = z5;
                    if (z5) {
                        int i54 = i26 - i25;
                        System.arraycopy(jArr3, i25, jArr9, i24, i54);
                        System.arraycopy(iArr4, i25, iArr8, i24, i54);
                        System.arraycopy(iArr3, i25, iArr9, i24, i54);
                    }
                    while (i25 < i26) {
                        long[] jArr16 = jArr3;
                        int[] iArr12 = iArr4;
                        long j17 = hnr0Var.f110818d;
                        RoundingMode roundingMode2 = RoundingMode.FLOOR;
                        long jM159395H7 = mpw0.m159395H(j7, 1000000L, j17, roundingMode2);
                        jM159395H2 = mpw0.m159395H(jArr5[i25] - j8, 1000000L, hnr0Var.f110817c, roundingMode2);
                        long[] jArr17 = jArr9;
                        if (hnr0Var.f110816b != 1) {
                            j9 = j;
                            jM159395H2 = Math.max(j9, jM159395H2);
                        } else {
                            j9 = j;
                        }
                        jArr10[i24] = jM159395H7 + jM159395H2;
                        if (!z6 && iArr8[i24] > i53) {
                            i53 = iArr12[i25];
                        }
                        i24++;
                        i25++;
                        jArr3 = jArr16;
                        j = j9;
                        iArr4 = iArr12;
                        jArr9 = jArr17;
                        jArr5 = jArr5;
                    }
                    j7 += hnr0Var.f110822h[i22];
                    i22++;
                    jArr3 = jArr3;
                    jArr9 = jArr9;
                    jArr5 = jArr5;
                    z5 = z6;
                }
                return new knr0(hnr0Var, jArr9, iArr8, i53, jArr10, iArr9, mpw0.m159395H(j7, 1000000L, hnr0Var.f110818d, RoundingMode.FLOOR));
            }
            j = 0;
            jArr = new long[iZzb];
            iArrCopyOf = new int[iZzb];
            jArr2 = new long[iZzb];
            iArr = new int[iZzb];
            i2 = i32;
            bgw0Var = bgw0Var3;
            i3 = iM104248E5;
            iM104280v = i;
            i4 = iM104280v;
            i5 = i4;
            i6 = i5;
            iM104248E4 = i6;
            j2 = j;
            j3 = j2;
            while (true) {
                if (i5 >= iZzb) {
                    jArrCopyOf = jArr;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf2 = iArr;
                    break;
                }
                j5 = j2;
                zM98853a = true;
                while (true) {
                    if (i6 != 0) {
                        i13 = i6;
                        break;
                    }
                    zM98853a = amr0Var.m98853a();
                    if (!zM98853a) {
                        i13 = i;
                        break;
                    }
                    j5 = amr0Var.f72252d;
                    i6 = amr0Var.f72251c;
                    iZzb = iZzb;
                }
                i14 = iZzb;
                if (!zM98853a) {
                    y4w0.m214278f("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i5);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i5);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i5);
                    iZzb = i5;
                    break;
                }
                if (bgw0Var != null) {
                    while (iM104248E4 == 0) {
                        if (iM104248E <= 0) {
                            iM104248E4 = i;
                            break;
                        }
                        iM104248E--;
                        iM104248E4 = bgw0Var.m104248E();
                        iM104280v = bgw0Var.m104280v();
                    }
                    iM104248E4--;
                }
                jArr[i5] = j5;
                iZzc = cmr0Var.zzc();
                iArrCopyOf[i5] = iZzc;
                if (iZzc > i4) {
                    i4 = iZzc;
                }
                int i55 = i13;
                jArr2[i5] = j3 + ((long) iM104280v);
                if (bgw0Var2 == null) {
                    i15 = 1;
                } else {
                    i15 = i;
                }
                iArr[i5] = i15;
                if (i5 == iM104248E3) {
                    iArr[i5] = 1;
                    i2--;
                    if (i2 > 0) {
                        bgw0Var2.getClass();
                        iM104248E3 = bgw0Var2.m104248E() - 1;
                    }
                }
                j3 += (long) iM104248E7;
                iM104248E6--;
                if (iM104248E6 == 0) {
                    if (i3 > 0) {
                        i3--;
                        iM104248E6 = bgw0Var4.m104248E();
                        iM104248E7 = bgw0Var4.m104280v();
                    } else {
                        iM104248E6 = i;
                    }
                }
                long j18 = j5 + ((long) iArrCopyOf[i5]);
                i6 = i55 - 1;
                i5++;
                iZzb = i14;
                j2 = j18;
            }
            long j19 = j3 + ((long) iM104280v);
            if (bgw0Var == null) {
                i7 = 1;
                break;
            }
            while (true) {
                if (iM104248E <= 0) {
                    i7 = 1;
                    break;
                }
                if (bgw0Var.m104248E() != 0) {
                    i7 = i;
                    break;
                }
                bgw0Var.m104280v();
                iM104248E--;
            }
            if (i2 == 0) {
                if (iM104248E6 == 0) {
                    if (i6 != 0) {
                        i10 = i;
                        iM104248E6 = i10;
                    } else if (i3 != 0) {
                        i7 = i7;
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        iM104248E6 = i8;
                        i9 = i3;
                    } else if (iM104248E4 != 0) {
                        i7 = i7;
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        i9 = i8;
                        iM104248E6 = i9;
                    } else if (i7 == 0) {
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        i9 = i8;
                        i11 = i9;
                        i7 = i11;
                        iM104248E6 = i7;
                        int i56 = hnr0Var.f110815a;
                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                        sb.append(i56);
                        sb.append(": remainingSynchronizationSamples ");
                        sb.append(i10);
                        sb.append(", remainingSamplesAtTimestampDelta ");
                        sb.append(iM104248E6);
                        sb.append(", remainingSamplesInChunk ");
                        sb.append(i8);
                        sb.append(", remainingTimestampDeltaChanges ");
                        sb.append(i9);
                        sb.append(", remainingSamplesAtTimestampOffset ");
                        sb.append(i11);
                        if (1 != i7) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sb.append(str);
                        y4w0.m214278f("AtomParsers", sb.toString());
                    } else {
                        iZzb = iZzb;
                    }
                    iZzb = iZzb;
                    iArr2 = iArrCopyOf;
                    i12 = i4;
                    j4 = j19;
                    jArr3 = jArrCopyOf;
                    long j110 = hnr0Var.f110817c;
                    roundingMode = RoundingMode.FLOOR;
                    jM159395H = mpw0.m159395H(j4, 1000000L, j110, roundingMode);
                    jArr4 = hnr0Var.f110822h;
                    if (jArr4 == null) {
                        mpw0.m159407e(jArrCopyOf2, 1000000L, hnr0Var.f110817c);
                        return new knr0(hnr0Var, jArr3, iArr2, i12, jArrCopyOf2, iArrCopyOf2, jM159395H);
                    }
                    i16 = iZzb;
                    j6 = j4;
                    iArr3 = iArrCopyOf2;
                    iArr4 = iArr2;
                    jArr5 = jArrCopyOf2;
                    i17 = i12;
                    if (jArr4.length == 1) {
                        long[] jArr18 = hnr0Var.f110823i;
                        jArr18.getClass();
                        j12 = jArr18[i];
                        jM159395H3 = mpw0.m159395H(jArr4[i], hnr0Var.f110817c, hnr0Var.f110818d, roundingMode) + j12;
                        int i57 = length2 - 1;
                        int i58 = i;
                        int iMax4 = Math.max(i58, Math.min(4, i57));
                        int iMax5 = Math.max(i58, Math.min(length2 - 4, i57));
                        j13 = jArr5[i58];
                        if (j13 <= j12) {
                            jM159395H4 = mpw0.m159395H(j12 - j13, hnr0Var.f110820f.f170265z, hnr0Var.f110817c, roundingMode);
                            jM159395H5 = mpw0.m159395H(j6 - jM159395H3, hnr0Var.f110820f.f170265z, hnr0Var.f110817c, roundingMode);
                            if (jM159395H4 != j) {
                                if (jM159395H4 <= 2147483647L) {
                                    rfr0Var.f162860a = (int) jM159395H4;
                                    rfr0Var.f162861b = (int) jM159395H5;
                                    mpw0.m159407e(jArr5, 1000000L, hnr0Var.f110817c);
                                    return new knr0(hnr0Var, jArr3, iArr4, i17, jArr5, iArr3, mpw0.m159395H(hnr0Var.f110822h[0], 1000000L, hnr0Var.f110818d, roundingMode));
                                }
                            } else if (jM159395H5 != j) {
                                jM159395H4 = j;
                                if (jM159395H4 <= 2147483647L) {
                                    rfr0Var.f162860a = (int) jM159395H4;
                                    rfr0Var.f162861b = (int) jM159395H5;
                                    mpw0.m159407e(jArr5, 1000000L, hnr0Var.f110817c);
                                    return new knr0(hnr0Var, jArr3, iArr4, i17, jArr5, iArr3, mpw0.m159395H(hnr0Var.f110822h[0], 1000000L, hnr0Var.f110818d, roundingMode));
                                }
                            }
                            jArr3 = jArr3;
                            iArr4 = iArr4;
                        }
                    }
                    jArr6 = hnr0Var.f110822h;
                    length = jArr6.length;
                    if (length == 1) {
                        if (jArr6[0] == j) {
                            long[] jArr19 = hnr0Var.f110823i;
                            jArr19.getClass();
                            j11 = jArr19[0];
                            while (i31 < jArr5.length) {
                                jArr5[i31] = mpw0.m159395H(jArr5[i31] - j11, 1000000L, hnr0Var.f110817c, RoundingMode.FLOOR);
                            }
                            return new knr0(hnr0Var, jArr3, iArr4, i17, jArr5, iArr3, mpw0.m159395H(j6 - j11, 1000000L, hnr0Var.f110817c, RoundingMode.FLOOR));
                        }
                        length = 1;
                    }
                    if (hnr0Var.f110816b == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jArr7 = hnr0Var.f110823i;
                    iArr5 = new int[length];
                    iArr6 = new int[length];
                    jArr7.getClass();
                    i18 = 0;
                    z3 = false;
                    i19 = 0;
                    i20 = 0;
                    while (true) {
                        jArr8 = hnr0Var.f110822h;
                        i21 = i17;
                        if (i20 < jArr8.length) {
                            break;
                            break;
                        }
                        iArr10 = iArr6;
                        long[] jArr110 = jArr7;
                        j10 = jArr110[i20];
                        if (j10 != -1) {
                            i27 = i20;
                            long jM159395H8 = mpw0.m159395H(jArr8[i20], hnr0Var.f110817c, hnr0Var.f110818d, RoundingMode.FLOOR);
                            i28 = 1;
                            iArr5[i27] = mpw0.m159420r(jArr5, j10, true, true);
                            iArr10[i27] = mpw0.m159418p(jArr5, j10 + jM159395H8, z2, false);
                            while (true) {
                                i29 = iArr5[i27];
                                i30 = iArr10[i27];
                                if (i29 >= i30) {
                                    break;
                                }
                                break;
                                break;
                                iArr5[i27] = i29 + 1;
                                i28 = 1;
                            }
                            i18 += i30 - i29;
                            if (i19 != i29) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z3 = z7 | z3;
                            i19 = i30;
                        } else {
                            i27 = i20;
                        }
                        jArr7 = jArr110;
                        i20 = i27 + 1;
                        iArr6 = iArr10;
                        i17 = i21;
                    }
                    iArr7 = iArr6;
                    i22 = 0;
                    if (i18 != i16) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z4 | z3;
                    if (z5) {
                        jArr9 = new long[i18];
                    } else {
                        jArr9 = jArr3;
                    }
                    if (z5) {
                        iArr8 = new int[i18];
                    } else {
                        iArr8 = iArr4;
                    }
                    if (true == z5) {
                        i23 = 0;
                    } else {
                        i23 = i21;
                    }
                    if (z5) {
                        iArr9 = new int[i18];
                    } else {
                        iArr9 = iArr3;
                    }
                    jArr10 = new long[i18];
                    int i59 = i23;
                    i24 = 0;
                    j7 = j;
                    while (i22 < hnr0Var.f110822h.length) {
                        j8 = hnr0Var.f110823i[i22];
                        i25 = iArr5[i22];
                        i26 = iArr7[i22];
                        z6 = z5;
                        if (z5) {
                            int i510 = i26 - i25;
                            System.arraycopy(jArr3, i25, jArr9, i24, i510);
                            System.arraycopy(iArr4, i25, iArr8, i24, i510);
                            System.arraycopy(iArr3, i25, iArr9, i24, i510);
                        }
                        while (i25 < i26) {
                            long[] jArr111 = jArr3;
                            int[] iArr13 = iArr4;
                            long j111 = hnr0Var.f110818d;
                            RoundingMode roundingMode3 = RoundingMode.FLOOR;
                            long jM159395H9 = mpw0.m159395H(j7, 1000000L, j111, roundingMode3);
                            jM159395H2 = mpw0.m159395H(jArr5[i25] - j8, 1000000L, hnr0Var.f110817c, roundingMode3);
                            long[] jArr112 = jArr9;
                            if (hnr0Var.f110816b != 1) {
                                j9 = j;
                                jM159395H2 = Math.max(j9, jM159395H2);
                            } else {
                                j9 = j;
                            }
                            jArr10[i24] = jM159395H9 + jM159395H2;
                            if (!z6) {
                            }
                            i24++;
                            i25++;
                            jArr3 = jArr111;
                            j = j9;
                            iArr4 = iArr13;
                            jArr9 = jArr112;
                            jArr5 = jArr5;
                        }
                        j7 += hnr0Var.f110822h[i22];
                        i22++;
                        jArr3 = jArr3;
                        jArr9 = jArr9;
                        jArr5 = jArr5;
                        z5 = z6;
                    }
                    return new knr0(hnr0Var, jArr9, iArr8, i59, jArr10, iArr9, mpw0.m159395H(j7, 1000000L, hnr0Var.f110818d, RoundingMode.FLOOR));
                }
                i10 = i;
                i8 = i6;
                i9 = i3;
            } else {
                i7 = i7;
                iZzb = iZzb;
                i8 = i6;
                i9 = i3;
                i10 = i2;
            }
            i11 = iM104248E4;
            int i511 = hnr0Var.f110815a;
            StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
            sb2.append(i511);
            sb2.append(": remainingSynchronizationSamples ");
            sb2.append(i10);
            sb2.append(", remainingSamplesAtTimestampDelta ");
            sb2.append(iM104248E6);
            sb2.append(", remainingSamplesInChunk ");
            sb2.append(i8);
            sb2.append(", remainingTimestampDeltaChanges ");
            sb2.append(i9);
            sb2.append(", remainingSamplesAtTimestampOffset ");
            sb2.append(i11);
            if (1 != i7) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            sb2.append(str);
            y4w0.m214278f("AtomParsers", sb2.toString());
            iZzb = iZzb;
            iArr2 = iArrCopyOf;
            i12 = i4;
            j4 = j19;
            jArr3 = jArrCopyOf;
            long j112 = hnr0Var.f110817c;
            roundingMode = RoundingMode.FLOOR;
            jM159395H = mpw0.m159395H(j4, 1000000L, j112, roundingMode);
            jArr4 = hnr0Var.f110822h;
            if (jArr4 == null) {
                mpw0.m159407e(jArrCopyOf2, 1000000L, hnr0Var.f110817c);
                return new knr0(hnr0Var, jArr3, iArr2, i12, jArrCopyOf2, iArrCopyOf2, jM159395H);
            }
            i16 = iZzb;
            j6 = j4;
            iArr3 = iArrCopyOf2;
            iArr4 = iArr2;
            jArr5 = jArrCopyOf2;
            i17 = i12;
            if (jArr4.length == 1) {
                long[] jArr113 = hnr0Var.f110823i;
                jArr113.getClass();
                j12 = jArr113[i];
                jM159395H3 = mpw0.m159395H(jArr4[i], hnr0Var.f110817c, hnr0Var.f110818d, roundingMode) + j12;
                int i512 = length2 - 1;
                int i513 = i;
                int iMax6 = Math.max(i513, Math.min(4, i512));
                int iMax7 = Math.max(i513, Math.min(length2 - 4, i512));
                j13 = jArr5[i513];
                if (j13 <= j12) {
                    jM159395H4 = mpw0.m159395H(j12 - j13, hnr0Var.f110820f.f170265z, hnr0Var.f110817c, roundingMode);
                    jM159395H5 = mpw0.m159395H(j6 - jM159395H3, hnr0Var.f110820f.f170265z, hnr0Var.f110817c, roundingMode);
                    if (jM159395H4 != j) {
                        if (jM159395H4 <= 2147483647L) {
                            rfr0Var.f162860a = (int) jM159395H4;
                            rfr0Var.f162861b = (int) jM159395H5;
                            mpw0.m159407e(jArr5, 1000000L, hnr0Var.f110817c);
                            return new knr0(hnr0Var, jArr3, iArr4, i17, jArr5, iArr3, mpw0.m159395H(hnr0Var.f110822h[0], 1000000L, hnr0Var.f110818d, roundingMode));
                        }
                    } else if (jM159395H5 != j) {
                        jM159395H4 = j;
                        if (jM159395H4 <= 2147483647L) {
                            rfr0Var.f162860a = (int) jM159395H4;
                            rfr0Var.f162861b = (int) jM159395H5;
                            mpw0.m159407e(jArr5, 1000000L, hnr0Var.f110817c);
                            return new knr0(hnr0Var, jArr3, iArr4, i17, jArr5, iArr3, mpw0.m159395H(hnr0Var.f110822h[0], 1000000L, hnr0Var.f110818d, roundingMode));
                        }
                    }
                    jArr3 = jArr3;
                    iArr4 = iArr4;
                }
            }
            jArr6 = hnr0Var.f110822h;
            length = jArr6.length;
            if (length == 1) {
                if (jArr6[0] == j) {
                    long[] jArr114 = hnr0Var.f110823i;
                    jArr114.getClass();
                    j11 = jArr114[0];
                    while (i31 < jArr5.length) {
                        jArr5[i31] = mpw0.m159395H(jArr5[i31] - j11, 1000000L, hnr0Var.f110817c, RoundingMode.FLOOR);
                    }
                    return new knr0(hnr0Var, jArr3, iArr4, i17, jArr5, iArr3, mpw0.m159395H(j6 - j11, 1000000L, hnr0Var.f110817c, RoundingMode.FLOOR));
                }
                length = 1;
            }
            if (hnr0Var.f110816b == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            jArr7 = hnr0Var.f110823i;
            iArr5 = new int[length];
            iArr6 = new int[length];
            jArr7.getClass();
            i18 = 0;
            z3 = false;
            i19 = 0;
            i20 = 0;
            while (true) {
                jArr8 = hnr0Var.f110822h;
                i21 = i17;
                if (i20 < jArr8.length) {
                    break;
                    break;
                }
                iArr10 = iArr6;
                long[] jArr115 = jArr7;
                j10 = jArr115[i20];
                if (j10 != -1) {
                    i27 = i20;
                    long jM159395H10 = mpw0.m159395H(jArr8[i20], hnr0Var.f110817c, hnr0Var.f110818d, RoundingMode.FLOOR);
                    i28 = 1;
                    iArr5[i27] = mpw0.m159420r(jArr5, j10, true, true);
                    iArr10[i27] = mpw0.m159418p(jArr5, j10 + jM159395H10, z2, false);
                    while (true) {
                        i29 = iArr5[i27];
                        i30 = iArr10[i27];
                        if (i29 >= i30) {
                            break;
                            break;
                        }
                        break;
                        break;
                        iArr5[i27] = i29 + 1;
                        i28 = 1;
                    }
                    i18 += i30 - i29;
                    if (i19 != i29) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z3 = z7 | z3;
                    i19 = i30;
                } else {
                    i27 = i20;
                }
                jArr7 = jArr115;
                i20 = i27 + 1;
                iArr6 = iArr10;
                i17 = i21;
            }
            iArr7 = iArr6;
            i22 = 0;
            if (i18 != i16) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z4 | z3;
            if (z5) {
                jArr9 = new long[i18];
            } else {
                jArr9 = jArr3;
            }
            if (z5) {
                iArr8 = new int[i18];
            } else {
                iArr8 = iArr4;
            }
            if (true == z5) {
                i23 = 0;
            } else {
                i23 = i21;
            }
            if (z5) {
                iArr9 = new int[i18];
            } else {
                iArr9 = iArr3;
            }
            jArr10 = new long[i18];
            int i514 = i23;
            i24 = 0;
            j7 = j;
            while (i22 < hnr0Var.f110822h.length) {
                j8 = hnr0Var.f110823i[i22];
                i25 = iArr5[i22];
                i26 = iArr7[i22];
                z6 = z5;
                if (z5) {
                    int i515 = i26 - i25;
                    System.arraycopy(jArr3, i25, jArr9, i24, i515);
                    System.arraycopy(iArr4, i25, iArr8, i24, i515);
                    System.arraycopy(iArr3, i25, iArr9, i24, i515);
                }
                while (i25 < i26) {
                    long[] jArr116 = jArr3;
                    int[] iArr14 = iArr4;
                    long j113 = hnr0Var.f110818d;
                    RoundingMode roundingMode4 = RoundingMode.FLOOR;
                    long jM159395H11 = mpw0.m159395H(j7, 1000000L, j113, roundingMode4);
                    jM159395H2 = mpw0.m159395H(jArr5[i25] - j8, 1000000L, hnr0Var.f110817c, roundingMode4);
                    long[] jArr117 = jArr9;
                    if (hnr0Var.f110816b != 1) {
                        j9 = j;
                        jM159395H2 = Math.max(j9, jM159395H2);
                    } else {
                        j9 = j;
                    }
                    jArr10[i24] = jM159395H11 + jM159395H2;
                    if (!z6) {
                    }
                    i24++;
                    i25++;
                    jArr3 = jArr116;
                    j = j9;
                    iArr4 = iArr14;
                    jArr9 = jArr117;
                    jArr5 = jArr5;
                }
                j7 += hnr0Var.f110822h[i22];
                i22++;
                jArr3 = jArr3;
                jArr9 = jArr9;
                jArr5 = jArr5;
                z5 = z6;
            }
            return new knr0(hnr0Var, jArr9, iArr8, i514, jArr10, iArr9, mpw0.m159395H(j7, 1000000L, hnr0Var.f110818d, RoundingMode.FLOOR));
        }
        iM104248E2 = 0;
        i = 0;
        iM104248E3 = -1;
        iZza = fmr0Var.zza();
        String str3 = hnr0Var.f110820f.f170251l;
        cmr0Var = fmr0Var;
        int i310 = iM104248E2;
        if (iZza == -1) {
            j = 0;
            jArr = new long[iZzb];
            iArrCopyOf = new int[iZzb];
            jArr2 = new long[iZzb];
            iArr = new int[iZzb];
            i2 = i310;
            bgw0Var = bgw0Var3;
            i3 = iM104248E5;
            iM104280v = i;
            i4 = iM104280v;
            i5 = i4;
            i6 = i5;
            iM104248E4 = i6;
            j2 = j;
            j3 = j2;
            while (true) {
                if (i5 >= iZzb) {
                    jArrCopyOf = jArr;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf2 = iArr;
                    break;
                }
                j5 = j2;
                zM98853a = true;
                while (true) {
                    if (i6 != 0) {
                        i13 = i6;
                        break;
                    }
                    zM98853a = amr0Var.m98853a();
                    if (!zM98853a) {
                        i13 = i;
                        break;
                    }
                    j5 = amr0Var.f72252d;
                    i6 = amr0Var.f72251c;
                    iZzb = iZzb;
                }
                i14 = iZzb;
                if (!zM98853a) {
                    y4w0.m214278f("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i5);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i5);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i5);
                    iZzb = i5;
                    break;
                }
                if (bgw0Var != null) {
                    while (iM104248E4 == 0) {
                        if (iM104248E <= 0) {
                            iM104248E4 = i;
                            break;
                        }
                        iM104248E--;
                        iM104248E4 = bgw0Var.m104248E();
                        iM104280v = bgw0Var.m104280v();
                    }
                    iM104248E4--;
                }
                jArr[i5] = j5;
                iZzc = cmr0Var.zzc();
                iArrCopyOf[i5] = iZzc;
                if (iZzc > i4) {
                    i4 = iZzc;
                }
                int i516 = i13;
                jArr2[i5] = j3 + ((long) iM104280v);
                if (bgw0Var2 == null) {
                    i15 = 1;
                } else {
                    i15 = i;
                }
                iArr[i5] = i15;
                if (i5 == iM104248E3) {
                    iArr[i5] = 1;
                    i2--;
                    if (i2 > 0) {
                        bgw0Var2.getClass();
                        iM104248E3 = bgw0Var2.m104248E() - 1;
                    }
                }
                j3 += (long) iM104248E7;
                iM104248E6--;
                if (iM104248E6 == 0) {
                    if (i3 > 0) {
                        i3--;
                        iM104248E6 = bgw0Var4.m104248E();
                        iM104248E7 = bgw0Var4.m104280v();
                    } else {
                        iM104248E6 = i;
                    }
                }
                long j114 = j5 + ((long) iArrCopyOf[i5]);
                i6 = i516 - 1;
                i5++;
                iZzb = i14;
                j2 = j114;
            }
            long j115 = j3 + ((long) iM104280v);
            if (bgw0Var == null) {
                i7 = 1;
                break;
            }
            while (true) {
                if (iM104248E <= 0) {
                    i7 = 1;
                    break;
                }
                if (bgw0Var.m104248E() != 0) {
                    i7 = i;
                    break;
                }
                bgw0Var.m104280v();
                iM104248E--;
            }
            if (i2 == 0) {
                if (iM104248E6 == 0) {
                    if (i6 != 0) {
                        i10 = i;
                        iM104248E6 = i10;
                    } else if (i3 != 0) {
                        i7 = i7;
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        iM104248E6 = i8;
                        i9 = i3;
                    } else if (iM104248E4 != 0) {
                        i7 = i7;
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        i9 = i8;
                        iM104248E6 = i9;
                    } else if (i7 == 0) {
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        i9 = i8;
                        i11 = i9;
                        i7 = i11;
                        iM104248E6 = i7;
                        int i517 = hnr0Var.f110815a;
                        StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                        sb3.append(i517);
                        sb3.append(": remainingSynchronizationSamples ");
                        sb3.append(i10);
                        sb3.append(", remainingSamplesAtTimestampDelta ");
                        sb3.append(iM104248E6);
                        sb3.append(", remainingSamplesInChunk ");
                        sb3.append(i8);
                        sb3.append(", remainingTimestampDeltaChanges ");
                        sb3.append(i9);
                        sb3.append(", remainingSamplesAtTimestampOffset ");
                        sb3.append(i11);
                        if (1 != i7) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sb3.append(str);
                        y4w0.m214278f("AtomParsers", sb3.toString());
                    } else {
                        iZzb = iZzb;
                    }
                    iZzb = iZzb;
                    iArr2 = iArrCopyOf;
                    i12 = i4;
                    j4 = j115;
                } else {
                    i10 = i;
                }
                i8 = i6;
                i9 = i3;
            } else {
                i7 = i7;
                iZzb = iZzb;
                i8 = i6;
                i9 = i3;
                i10 = i2;
            }
            i11 = iM104248E4;
            int i518 = hnr0Var.f110815a;
            StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
            sb4.append(i518);
            sb4.append(": remainingSynchronizationSamples ");
            sb4.append(i10);
            sb4.append(", remainingSamplesAtTimestampDelta ");
            sb4.append(iM104248E6);
            sb4.append(", remainingSamplesInChunk ");
            sb4.append(i8);
            sb4.append(", remainingTimestampDeltaChanges ");
            sb4.append(i9);
            sb4.append(", remainingSamplesAtTimestampOffset ");
            sb4.append(i11);
            if (1 != i7) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            sb4.append(str);
            y4w0.m214278f("AtomParsers", sb4.toString());
            iZzb = iZzb;
            iArr2 = iArrCopyOf;
            i12 = i4;
            j4 = j115;
        } else {
            j = 0;
            jArr = new long[iZzb];
            iArrCopyOf = new int[iZzb];
            jArr2 = new long[iZzb];
            iArr = new int[iZzb];
            i2 = i310;
            bgw0Var = bgw0Var3;
            i3 = iM104248E5;
            iM104280v = i;
            i4 = iM104280v;
            i5 = i4;
            i6 = i5;
            iM104248E4 = i6;
            j2 = j;
            j3 = j2;
            while (true) {
                if (i5 >= iZzb) {
                    jArrCopyOf = jArr;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf2 = iArr;
                    break;
                }
                j5 = j2;
                zM98853a = true;
                while (true) {
                    if (i6 != 0) {
                        i13 = i6;
                        break;
                    }
                    zM98853a = amr0Var.m98853a();
                    if (!zM98853a) {
                        i13 = i;
                        break;
                    }
                    j5 = amr0Var.f72252d;
                    i6 = amr0Var.f72251c;
                    iZzb = iZzb;
                }
                i14 = iZzb;
                if (!zM98853a) {
                    y4w0.m214278f("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i5);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i5);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i5);
                    iZzb = i5;
                    break;
                }
                if (bgw0Var != null) {
                    while (iM104248E4 == 0) {
                        if (iM104248E <= 0) {
                            iM104248E4 = i;
                            break;
                        }
                        iM104248E--;
                        iM104248E4 = bgw0Var.m104248E();
                        iM104280v = bgw0Var.m104280v();
                    }
                    iM104248E4--;
                }
                jArr[i5] = j5;
                iZzc = cmr0Var.zzc();
                iArrCopyOf[i5] = iZzc;
                if (iZzc > i4) {
                    i4 = iZzc;
                }
                int i519 = i13;
                jArr2[i5] = j3 + ((long) iM104280v);
                if (bgw0Var2 == null) {
                    i15 = 1;
                } else {
                    i15 = i;
                }
                iArr[i5] = i15;
                if (i5 == iM104248E3) {
                    iArr[i5] = 1;
                    i2--;
                    if (i2 > 0) {
                        bgw0Var2.getClass();
                        iM104248E3 = bgw0Var2.m104248E() - 1;
                    }
                }
                j3 += (long) iM104248E7;
                iM104248E6--;
                if (iM104248E6 == 0) {
                    if (i3 > 0) {
                        i3--;
                        iM104248E6 = bgw0Var4.m104248E();
                        iM104248E7 = bgw0Var4.m104280v();
                    } else {
                        iM104248E6 = i;
                    }
                }
                long j116 = j5 + ((long) iArrCopyOf[i5]);
                i6 = i519 - 1;
                i5++;
                iZzb = i14;
                j2 = j116;
            }
            long j117 = j3 + ((long) iM104280v);
            if (bgw0Var == null) {
                i7 = 1;
                break;
            }
            while (true) {
                if (iM104248E <= 0) {
                    i7 = 1;
                    break;
                }
                if (bgw0Var.m104248E() != 0) {
                    i7 = i;
                    break;
                }
                bgw0Var.m104280v();
                iM104248E--;
            }
            if (i2 == 0) {
                if (iM104248E6 == 0) {
                    if (i6 != 0) {
                        i10 = i;
                        iM104248E6 = i10;
                    } else if (i3 != 0) {
                        i7 = i7;
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        iM104248E6 = i8;
                        i9 = i3;
                    } else if (iM104248E4 != 0) {
                        i7 = i7;
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        i9 = i8;
                        iM104248E6 = i9;
                    } else if (i7 == 0) {
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        i9 = i8;
                        i11 = i9;
                        i7 = i11;
                        iM104248E6 = i7;
                        int i5110 = hnr0Var.f110815a;
                        StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                        sb5.append(i5110);
                        sb5.append(": remainingSynchronizationSamples ");
                        sb5.append(i10);
                        sb5.append(", remainingSamplesAtTimestampDelta ");
                        sb5.append(iM104248E6);
                        sb5.append(", remainingSamplesInChunk ");
                        sb5.append(i8);
                        sb5.append(", remainingTimestampDeltaChanges ");
                        sb5.append(i9);
                        sb5.append(", remainingSamplesAtTimestampOffset ");
                        sb5.append(i11);
                        if (1 != i7) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sb5.append(str);
                        y4w0.m214278f("AtomParsers", sb5.toString());
                    } else {
                        iZzb = iZzb;
                    }
                    iZzb = iZzb;
                    iArr2 = iArrCopyOf;
                    i12 = i4;
                    j4 = j117;
                } else {
                    i10 = i;
                }
                i8 = i6;
                i9 = i3;
            } else {
                i7 = i7;
                iZzb = iZzb;
                i8 = i6;
                i9 = i3;
                i10 = i2;
            }
            i11 = iM104248E4;
            int i5111 = hnr0Var.f110815a;
            StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
            sb6.append(i5111);
            sb6.append(": remainingSynchronizationSamples ");
            sb6.append(i10);
            sb6.append(", remainingSamplesAtTimestampDelta ");
            sb6.append(iM104248E6);
            sb6.append(", remainingSamplesInChunk ");
            sb6.append(i8);
            sb6.append(", remainingTimestampDeltaChanges ");
            sb6.append(i9);
            sb6.append(", remainingSamplesAtTimestampOffset ");
            sb6.append(i11);
            if (1 != i7) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            sb6.append(str);
            y4w0.m214278f("AtomParsers", sb6.toString());
            iZzb = iZzb;
            iArr2 = iArrCopyOf;
            i12 = i4;
            j4 = j117;
        }
        jArr3 = jArrCopyOf;
        long j118 = hnr0Var.f110817c;
        roundingMode = RoundingMode.FLOOR;
        jM159395H = mpw0.m159395H(j4, 1000000L, j118, roundingMode);
        jArr4 = hnr0Var.f110822h;
        if (jArr4 == null) {
            mpw0.m159407e(jArrCopyOf2, 1000000L, hnr0Var.f110817c);
            return new knr0(hnr0Var, jArr3, iArr2, i12, jArrCopyOf2, iArrCopyOf2, jM159395H);
        }
        i16 = iZzb;
        j6 = j4;
        iArr3 = iArrCopyOf2;
        iArr4 = iArr2;
        jArr5 = jArrCopyOf2;
        i17 = i12;
        if (jArr4.length == 1) {
            long[] jArr118 = hnr0Var.f110823i;
            jArr118.getClass();
            j12 = jArr118[i];
            jM159395H3 = mpw0.m159395H(jArr4[i], hnr0Var.f110817c, hnr0Var.f110818d, roundingMode) + j12;
            int i5112 = length2 - 1;
            int i5113 = i;
            int iMax8 = Math.max(i5113, Math.min(4, i5112));
            int iMax9 = Math.max(i5113, Math.min(length2 - 4, i5112));
            j13 = jArr5[i5113];
            if (j13 <= j12) {
                jM159395H4 = mpw0.m159395H(j12 - j13, hnr0Var.f110820f.f170265z, hnr0Var.f110817c, roundingMode);
                jM159395H5 = mpw0.m159395H(j6 - jM159395H3, hnr0Var.f110820f.f170265z, hnr0Var.f110817c, roundingMode);
                if (jM159395H4 != j) {
                    if (jM159395H4 <= 2147483647L) {
                        rfr0Var.f162860a = (int) jM159395H4;
                        rfr0Var.f162861b = (int) jM159395H5;
                        mpw0.m159407e(jArr5, 1000000L, hnr0Var.f110817c);
                        return new knr0(hnr0Var, jArr3, iArr4, i17, jArr5, iArr3, mpw0.m159395H(hnr0Var.f110822h[0], 1000000L, hnr0Var.f110818d, roundingMode));
                    }
                } else if (jM159395H5 != j) {
                    jM159395H4 = j;
                    if (jM159395H4 <= 2147483647L) {
                        rfr0Var.f162860a = (int) jM159395H4;
                        rfr0Var.f162861b = (int) jM159395H5;
                        mpw0.m159407e(jArr5, 1000000L, hnr0Var.f110817c);
                        return new knr0(hnr0Var, jArr3, iArr4, i17, jArr5, iArr3, mpw0.m159395H(hnr0Var.f110822h[0], 1000000L, hnr0Var.f110818d, roundingMode));
                    }
                }
                jArr3 = jArr3;
                iArr4 = iArr4;
            }
        }
        jArr6 = hnr0Var.f110822h;
        length = jArr6.length;
        if (length == 1) {
            if (jArr6[0] == j) {
                long[] jArr119 = hnr0Var.f110823i;
                jArr119.getClass();
                j11 = jArr119[0];
                while (i31 < jArr5.length) {
                    jArr5[i31] = mpw0.m159395H(jArr5[i31] - j11, 1000000L, hnr0Var.f110817c, RoundingMode.FLOOR);
                }
                return new knr0(hnr0Var, jArr3, iArr4, i17, jArr5, iArr3, mpw0.m159395H(j6 - j11, 1000000L, hnr0Var.f110817c, RoundingMode.FLOOR));
            }
            length = 1;
        }
        if (hnr0Var.f110816b == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        jArr7 = hnr0Var.f110823i;
        iArr5 = new int[length];
        iArr6 = new int[length];
        jArr7.getClass();
        i18 = 0;
        z3 = false;
        i19 = 0;
        i20 = 0;
        while (true) {
            jArr8 = hnr0Var.f110822h;
            i21 = i17;
            if (i20 < jArr8.length) {
                break;
                break;
            }
            iArr10 = iArr6;
            long[] jArr1110 = jArr7;
            j10 = jArr1110[i20];
            if (j10 != -1) {
                i27 = i20;
                long jM159395H12 = mpw0.m159395H(jArr8[i20], hnr0Var.f110817c, hnr0Var.f110818d, RoundingMode.FLOOR);
                i28 = 1;
                iArr5[i27] = mpw0.m159420r(jArr5, j10, true, true);
                iArr10[i27] = mpw0.m159418p(jArr5, j10 + jM159395H12, z2, false);
                while (true) {
                    i29 = iArr5[i27];
                    i30 = iArr10[i27];
                    if (i29 >= i30) {
                        break;
                        break;
                    }
                    break;
                    break;
                    iArr5[i27] = i29 + 1;
                    i28 = 1;
                }
                i18 += i30 - i29;
                if (i19 != i29) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z3 = z7 | z3;
                i19 = i30;
            } else {
                i27 = i20;
            }
            jArr7 = jArr1110;
            i20 = i27 + 1;
            iArr6 = iArr10;
            i17 = i21;
        }
        iArr7 = iArr6;
        i22 = 0;
        if (i18 != i16) {
            z4 = true;
        } else {
            z4 = false;
        }
        z5 = z4 | z3;
        if (z5) {
            jArr9 = new long[i18];
        } else {
            jArr9 = jArr3;
        }
        if (z5) {
            iArr8 = new int[i18];
        } else {
            iArr8 = iArr4;
        }
        if (true == z5) {
            i23 = 0;
        } else {
            i23 = i21;
        }
        if (z5) {
            iArr9 = new int[i18];
        } else {
            iArr9 = iArr3;
        }
        jArr10 = new long[i18];
        int i5114 = i23;
        i24 = 0;
        j7 = j;
        while (i22 < hnr0Var.f110822h.length) {
            j8 = hnr0Var.f110823i[i22];
            i25 = iArr5[i22];
            i26 = iArr7[i22];
            z6 = z5;
            if (z5) {
                int i5115 = i26 - i25;
                System.arraycopy(jArr3, i25, jArr9, i24, i5115);
                System.arraycopy(iArr4, i25, iArr8, i24, i5115);
                System.arraycopy(iArr3, i25, iArr9, i24, i5115);
            }
            while (i25 < i26) {
                long[] jArr1111 = jArr3;
                int[] iArr15 = iArr4;
                long j119 = hnr0Var.f110818d;
                RoundingMode roundingMode5 = RoundingMode.FLOOR;
                long jM159395H13 = mpw0.m159395H(j7, 1000000L, j119, roundingMode5);
                jM159395H2 = mpw0.m159395H(jArr5[i25] - j8, 1000000L, hnr0Var.f110817c, roundingMode5);
                long[] jArr1112 = jArr9;
                if (hnr0Var.f110816b != 1) {
                    j9 = j;
                    jM159395H2 = Math.max(j9, jM159395H2);
                } else {
                    j9 = j;
                }
                jArr10[i24] = jM159395H13 + jM159395H2;
                if (!z6) {
                }
                i24++;
                i25++;
                jArr3 = jArr1111;
                j = j9;
                iArr4 = iArr15;
                jArr9 = jArr1112;
                jArr5 = jArr5;
            }
            j7 += hnr0Var.f110822h[i22];
            i22++;
            jArr3 = jArr3;
            jArr9 = jArr9;
            jArr5 = jArr5;
            z5 = z6;
        }
        return new knr0(hnr0Var, jArr9, iArr8, i5114, jArr10, iArr9, mpw0.m159395H(j7, 1000000L, hnr0Var.f110818d, RoundingMode.FLOOR));
    }

    /* JADX INFO: renamed from: l */
    public static ByteBuffer m135980l() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:79:0x0144  */
    /* JADX INFO: renamed from: m */
    public static void m135981m(bgw0 bgw0Var, int i, int i2, int i3, int i4, String str, boolean z, @Nullable zzae zzaeVar, dmr0 dmr0Var, int i5) throws zzcc {
        int iM104249F;
        int i6;
        int iM104246C;
        int iM104280v;
        int iM104248E;
        int i7;
        zzae zzaeVarM13591b;
        String str2;
        int i8;
        bgw0 bgw0Var2 = bgw0Var;
        int i9 = i3;
        bgw0Var2.m104269k(i2 + 16);
        if (z) {
            iM104249F = bgw0Var2.m104249F();
            bgw0Var2.m104270l(6);
        } else {
            bgw0Var2.m104270l(8);
            iM104249F = 0;
        }
        if (iM104249F == 0 || iM104249F == 1) {
            i6 = 2;
            int iM104249F2 = bgw0Var2.m104249F();
            bgw0Var2.m104270l(6);
            iM104246C = bgw0Var2.m104246C();
            bgw0Var2.m104269k(bgw0Var2.m104277s() - 4);
            iM104280v = bgw0Var2.m104280v();
            if (iM104249F == 1) {
                bgw0Var2.m104270l(16);
            }
            iM104248E = iM104249F2;
            i7 = -1;
        } else {
            if (iM104249F != 2) {
                return;
            }
            bgw0Var2.m104270l(16);
            i6 = 2;
            iM104246C = (int) Math.round(Double.longBitsToDouble(bgw0Var2.m104252I()));
            iM104248E = bgw0Var2.m104248E();
            bgw0Var2.m104270l(4);
            int iM104248E2 = bgw0Var2.m104248E();
            int iM104248E3 = bgw0Var2.m104248E();
            int i10 = iM104248E3 & 1;
            int i11 = iM104248E3 & 2;
            if (i10 == 0) {
                if (iM104248E2 == 8) {
                    i7 = 3;
                } else if (iM104248E2 == 16) {
                    i7 = i11 != 0 ? SQLiteDatabase.CREATE_IF_NECESSARY : 2;
                } else if (iM104248E2 == 24) {
                    i7 = i11 != 0 ? 1342177280 : 21;
                } else if (iM104248E2 == 32) {
                    i7 = i11 != 0 ? 1610612736 : 22;
                } else {
                    i7 = -1;
                }
            } else if (iM104248E2 == 32) {
                i7 = 4;
            } else {
                i7 = -1;
            }
            bgw0Var2.m104270l(8);
            iM104280v = 0;
        }
        int iM104277s = bgw0Var2.m104277s();
        int iIntValue = 1701733217;
        if (i == 1701733217) {
            Pair pairM135976h = m135976h(bgw0Var2, i2, i9);
            if (pairM135976h != null) {
                iIntValue = ((Integer) pairM135976h.first).intValue();
                zzaeVarM13591b = zzaeVar == null ? null : zzaeVar.m13591b(((inr0) pairM135976h.second).f115994b);
                dmr0Var.f89722a[i5] = (inr0) pairM135976h.second;
            } else {
                zzaeVarM13591b = zzaeVar;
            }
            bgw0Var2.m104269k(iM104277s);
        } else {
            zzaeVarM13591b = zzaeVar;
            iIntValue = i;
        }
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP;
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue == 1936684916) {
            i7 = i6;
            str2 = "audio/raw";
        } else if (iIntValue == 1953984371) {
            str2 = "audio/raw";
            i7 = SQLiteDatabase.CREATE_IF_NECESSARY;
        } else if (iIntValue == 1819304813) {
            if (i7 == -1) {
                i7 = i6;
            }
            str2 = "audio/raw";
        } else if (iIntValue == 778924082 || iIntValue == 778924083) {
            str2 = DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG;
        } else if (iIntValue == 1835557169) {
            str2 = "audio/mha1";
        } else if (iIntValue == 1835560241) {
            str2 = "audio/mhm1";
        } else if (iIntValue == 1634492771) {
            str2 = "audio/alac";
        } else if (iIntValue == 1634492791) {
            str2 = "audio/g711-alaw";
        } else if (iIntValue == 1970037111) {
            str2 = "audio/g711-mlaw";
        } else if (iIntValue == 1332770163) {
            str2 = "audio/opus";
        } else if (iIntValue == 1716281667) {
            str2 = "audio/flac";
        } else {
            str2 = iIntValue == 1835823201 ? "audio/true-hd" : null;
        }
        int i12 = i7;
        List listZzm = null;
        String str3 = null;
        bmr0 bmr0VarM135978j = null;
        while (iM104277s - i2 < i9) {
            bgw0Var2.m104269k(iM104277s);
            int iM104280v2 = bgw0Var2.m104280v();
            String str4 = str3;
            ter0.m190892b(iM104280v2 > 0, "childAtomSize must be positive");
            int iM104280v3 = bgw0Var2.m104280v();
            iM104246C = iM104246C;
            if (iM104280v3 == 1835557187) {
                bgw0Var2.m104269k(iM104277s + 8);
                bgw0Var2.m104270l(1);
                int iM104245B = bgw0Var2.m104245B();
                bgw0Var2.m104270l(1);
                String str5 = Objects.equals(str2, "audio/mhm1") ? String.format("mhm1.%02X", Integer.valueOf(iM104245B)) : String.format("mha1.%02X", Integer.valueOf(iM104245B));
                int iM104249F3 = bgw0Var2.m104249F();
                byte[] bArr = new byte[iM104249F3];
                str4 = str5;
                bgw0Var2.m104265g(bArr, 0, iM104249F3);
                if (listZzm == null) {
                    listZzm = zzgaa.zzm(bArr);
                    str4 = str4;
                    iM104246C = iM104246C;
                    iM104277s = iM104277s;
                    iM104280v2 = iM104280v2;
                } else {
                    listZzm = zzgaa.zzn(bArr, (byte[]) listZzm.get(0));
                    str4 = str4;
                    iM104246C = iM104246C;
                    iM104277s = iM104277s;
                    iM104280v2 = iM104280v2;
                }
            } else if (iM104280v3 == 1835557200) {
                bgw0Var2.m104269k(iM104277s + 8);
                int iM104245B2 = bgw0Var2.m104245B();
                if (iM104245B2 > 0) {
                    byte[] bArr2 = new byte[iM104245B2];
                    bgw0Var2.m104265g(bArr2, 0, iM104245B2);
                    if (listZzm == null) {
                        listZzm = zzgaa.zzm(bArr2);
                        str4 = str4;
                        iM104246C = iM104246C;
                        iM104277s = iM104277s;
                        iM104280v2 = iM104280v2;
                    } else {
                        listZzm = zzgaa.zzn((byte[]) listZzm.get(0), bArr2);
                        str4 = str4;
                        iM104246C = iM104246C;
                        iM104277s = iM104277s;
                        iM104280v2 = iM104280v2;
                    }
                }
                iM104246C = iM104246C;
                str4 = str4;
            } else {
                if (iM104280v3 == 1702061171) {
                    i8 = iM104277s;
                } else if (z && iM104280v3 == 2002876005) {
                    int iM104277s2 = bgw0Var2.m104277s();
                    ter0.m190892b(iM104277s2 >= iM104277s, null);
                    int i13 = iM104277s2;
                    while (true) {
                        if (i13 - iM104277s >= iM104280v2) {
                            i8 = -1;
                            break;
                        }
                        bgw0Var2.m104269k(i13);
                        int iM104280v4 = bgw0Var2.m104280v();
                        ter0.m190892b(iM104280v4 > 0, "childAtomSize must be positive");
                        if (bgw0Var2.m104280v() == 1702061171) {
                            i8 = i13;
                            break;
                        }
                        i13 += iM104280v4;
                    }
                } else {
                    if (iM104280v3 == 1684103987) {
                        bgw0Var2.m104269k(iM104277s + 8);
                        dmr0Var.f89723b = fdr0.m125131c(bgw0Var2, Integer.toString(i4), str, zzaeVarM13591b);
                    } else if (iM104280v3 == 1684366131) {
                        bgw0Var2.m104269k(iM104277s + 8);
                        dmr0Var.f89723b = fdr0.m125132d(bgw0Var2, Integer.toString(i4), str, zzaeVarM13591b);
                    } else if (iM104280v3 == 1684103988) {
                        bgw0Var2.m104269k(iM104277s + 8);
                        String string = Integer.toString(i4);
                        int[] iArr = idr0.f114520a;
                        bgw0Var2.m104270l(1);
                        int iM104245B3 = bgw0Var2.m104245B() & 32;
                        znr0 znr0Var = new znr0();
                        znr0Var.m220658k(string);
                        znr0Var.m220672w("audio/ac4");
                        znr0Var.m220659k0(i6);
                        znr0Var.m220673x(1 != (iM104245B3 >> 5) ? 44100 : 48000);
                        znr0Var.m220650e(zzaeVarM13591b);
                        znr0Var.m220663n(str);
                        dmr0Var.f89723b = znr0Var.m220645D();
                        iM104246C = iM104246C;
                        i6 = 2;
                        str4 = str4;
                    } else {
                        if (iM104280v3 == 1684892784) {
                            if (iM104280v <= 0) {
                                throw zzcc.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + iM104280v, null);
                            }
                            iM104246C = iM104280v;
                            iM104248E = 2;
                        } else if (iM104280v3 == 1684305011 || iM104280v3 == 1969517683) {
                            i6 = 2;
                            znr0 znr0Var2 = new znr0();
                            znr0Var2.m220656j(i4);
                            znr0Var2.m220672w(str2);
                            znr0Var2.m220659k0(iM104248E);
                            iM104246C = iM104246C;
                            znr0Var2.m220673x(iM104246C);
                            znr0Var2.m220650e(zzaeVarM13591b);
                            znr0Var2.m220663n(str);
                            dmr0Var.f89723b = znr0Var2.m220645D();
                            str4 = str4;
                        } else if (iM104280v3 == 1682927731) {
                            int i14 = iM104280v2 - 8;
                            byte[] bArr3 = f110662a;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i14);
                            bgw0Var2.m104269k(iM104277s + 8);
                            bgw0Var2.m104265g(bArrCopyOf, bArr3.length, i14);
                            listZzm = xfr0.m210819e(bArrCopyOf);
                            iM104246C = iM104246C;
                        } else if (iM104280v3 == 1684425825) {
                            byte[] bArr4 = new byte[iM104280v2 - 8];
                            bArr4[0] = 102;
                            bArr4[1] = 76;
                            i6 = 2;
                            bArr4[2] = 97;
                            bArr4[3] = 67;
                            bgw0Var2.m104269k(iM104277s + 12);
                            bgw0Var2.m104265g(bArr4, 4, iM104280v2 - 12);
                            listZzm = zzgaa.zzm(bArr4);
                            str4 = str4;
                            iM104246C = iM104246C;
                            iM104277s = iM104277s;
                            iM104280v2 = iM104280v2;
                        } else {
                            i6 = 2;
                            if (iM104280v3 == 1634492771) {
                                int i15 = iM104280v2 - 12;
                                byte[] bArr5 = new byte[i15];
                                bgw0Var2.m104269k(iM104277s + 12);
                                bgw0Var2.m104265g(bArr5, 0, i15);
                                byte[] bArr6 = rgv0.f163050a;
                                bgw0 bgw0Var3 = new bgw0(bArr5);
                                bgw0Var3.m104269k(9);
                                int iM104245B4 = bgw0Var3.m104245B();
                                bgw0Var3.m104269k(20);
                                Pair pairCreate = Pair.create(Integer.valueOf(bgw0Var3.m104248E()), Integer.valueOf(iM104245B4));
                                int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                int iIntValue3 = ((Integer) pairCreate.second).intValue();
                                zzgaa zzgaaVarZzm = zzgaa.zzm(bArr5);
                                str4 = str4;
                                iM104248E = iIntValue3;
                                listZzm = zzgaaVarZzm;
                                iM104277s = iM104277s;
                                iM104280v2 = iM104280v2;
                                iM104246C = iIntValue2;
                            }
                        }
                        i6 = 2;
                    }
                    iM104246C = iM104246C;
                    str4 = str4;
                }
                if (i8 != -1) {
                    bmr0VarM135978j = m135978j(bgw0Var2, i8);
                    String str6 = bmr0VarM135978j.f77398a;
                    byte[] bArr7 = bmr0VarM135978j.f77399b;
                    if (bArr7 != null) {
                        if ("audio/vorbis".equals(str6)) {
                            bgw0 bgw0Var4 = new bgw0(bArr7);
                            bgw0Var4.m104270l(1);
                            int i16 = 0;
                            while (bgw0Var4.m104275q() > 0 && bgw0Var4.m104279u() == 255) {
                                bgw0Var4.m104270l(1);
                                i16 += 255;
                            }
                            int iM104245B5 = i16 + bgw0Var4.m104245B();
                            int i17 = 0;
                            while (true) {
                                iM104277s = iM104277s;
                                if (bgw0Var4.m104275q() <= 0 || bgw0Var4.m104279u() != 255) {
                                    break;
                                }
                                bgw0Var4.m104270l(1);
                                i17 += 255;
                                iM104277s = iM104277s;
                            }
                            int iM104245B6 = i17 + bgw0Var4.m104245B();
                            byte[] bArr8 = new byte[iM104245B5];
                            int iM104277s3 = bgw0Var4.m104277s();
                            System.arraycopy(bArr7, iM104277s3, bArr8, 0, iM104245B5);
                            int i18 = iM104277s3 + iM104245B5 + iM104245B6;
                            int length = bArr7.length - i18;
                            byte[] bArr9 = new byte[length];
                            System.arraycopy(bArr7, i18, bArr9, 0, length);
                            listZzm = zzgaa.zzn(bArr8, bArr9);
                        } else {
                            iM104277s = iM104277s;
                            iM104280v2 = iM104280v2;
                            if ("audio/mp4a-latm".equals(str6)) {
                                bdr0 bdr0VarM109234a = cdr0.m109234a(bArr7);
                                iM104246C = bdr0VarM109234a.f76291a;
                                iM104248E = bdr0VarM109234a.f76292b;
                                str4 = bdr0VarM109234a.f76293c;
                            } else {
                                str4 = str4;
                            }
                            listZzm = zzgaa.zzm(bArr7);
                        }
                        str2 = str6;
                    } else {
                        iM104277s = iM104277s;
                    }
                    str4 = str4;
                    str2 = str6;
                } else {
                    str4 = str4;
                }
            }
            iM104277s += iM104280v2;
            i9 = i3;
            str3 = str4;
            bgw0Var2 = bgw0Var;
        }
        String str7 = str3;
        if (dmr0Var.f89723b != null || str2 == null) {
            return;
        }
        znr0 znr0Var3 = new znr0();
        znr0Var3.m220656j(i4);
        znr0Var3.m220672w(str2);
        znr0Var3.m220661l0(str7);
        znr0Var3.m220659k0(iM104248E);
        znr0Var3.m220673x(iM104246C);
        znr0Var3.m220666q(i12);
        znr0Var3.m220660l(listZzm);
        znr0Var3.m220650e(zzaeVarM13591b);
        znr0Var3.m220663n(str);
        if (bmr0VarM135978j != null) {
            znr0Var3.m220657j0(utw0.m198113c(bmr0VarM135978j.f77400c));
            znr0Var3.m220667r(utw0.m198113c(bmr0VarM135978j.f77401d));
        }
        dmr0Var.f89723b = znr0Var3.m220645D();
    }
}
