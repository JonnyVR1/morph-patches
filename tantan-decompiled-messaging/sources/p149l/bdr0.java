package p149l;

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
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class bdr0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f75062a;

    static {
        int i = ggw0.f102568a;
        f75062a = "OpusHead".getBytes(wew0.f185990c);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static zzby m101210a(rcr0 rcr0Var) {
        zzgc zzgcVar;
        scr0 scr0VarM178812d = rcr0Var.m178812d(1751411826);
        scr0 scr0VarM178812d2 = rcr0Var.m178812d(1801812339);
        scr0 scr0VarM178812d3 = rcr0Var.m178812d(1768715124);
        if (scr0VarM178812d != null && scr0VarM178812d2 != null && scr0VarM178812d3 != null && m101216g(scr0VarM178812d.f163765b) == 1835299937) {
            v6w0 v6w0Var = scr0VarM178812d2.f163765b;
            v6w0Var.m197262k(12);
            int iM197273v = v6w0Var.m197273v();
            String[] strArr = new String[iM197273v];
            for (int i = 0; i < iM197273v; i++) {
                int iM197273v2 = v6w0Var.m197273v();
                v6w0Var.m197263l(4);
                strArr[i] = v6w0Var.m197252a(iM197273v2 - 8, wew0.f185990c);
            }
            v6w0 v6w0Var2 = scr0VarM178812d3.f163765b;
            v6w0Var2.m197262k(8);
            ArrayList arrayList = new ArrayList();
            while (v6w0Var2.m197268q() > 8) {
                int iM197270s = v6w0Var2.m197270s() + v6w0Var2.m197273v();
                int iM197273v3 = v6w0Var2.m197273v() - 1;
                if (iM197273v3 < 0 || iM197273v3 >= iM197273v) {
                    svv0.m186111f("AtomParsers", "Skipped metadata with unknown key index: " + iM197273v3);
                } else {
                    String str = strArr[iM197273v3];
                    String[] strArr2 = sdr0.f163874a;
                    while (true) {
                        int iM197270s2 = v6w0Var2.m197270s();
                        if (iM197270s2 >= iM197270s) {
                            zzgcVar = null;
                            break;
                        }
                        int iM197273v4 = v6w0Var2.m197273v();
                        if (v6w0Var2.m197273v() == 1684108385) {
                            int iM197273v5 = v6w0Var2.m197273v();
                            int iM197273v6 = v6w0Var2.m197273v();
                            int i2 = iM197273v4 - 16;
                            byte[] bArr = new byte[i2];
                            v6w0Var2.m197258g(bArr, 0, i2);
                            zzgcVar = new zzgc(str, bArr, iM197273v6, iM197273v5);
                            break;
                        }
                        v6w0Var2.m197262k(iM197270s2 + iM197273v4);
                    }
                    if (zzgcVar != null) {
                        arrayList.add(zzgcVar);
                    }
                }
                v6w0Var2.m197262k(iM197270s);
            }
            if (!arrayList.isEmpty()) {
                return new zzby(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX INFO: renamed from: b */
    public static zzby m101211b(scr0 scr0Var) {
        int iM197239C;
        v6w0 v6w0Var = scr0Var.f163765b;
        v6w0Var.m197262k(8);
        zzby zzbyVar = new zzby(-9223372036854775807L, new zzbx[0]);
        while (v6w0Var.m197268q() >= 8) {
            int iM197270s = v6w0Var.m197270s();
            int iM197273v = v6w0Var.m197273v() + iM197270s;
            int iM197273v2 = v6w0Var.m197273v();
            zzby zzbyVar2 = null;
            if (iM197273v2 == 1835365473) {
                v6w0Var.m197262k(iM197270s);
                v6w0Var.m197263l(8);
                m101214e(v6w0Var);
                while (v6w0Var.m197270s() < iM197273v) {
                    int iM197270s2 = v6w0Var.m197270s();
                    int iM197273v3 = v6w0Var.m197273v() + iM197270s2;
                    if (v6w0Var.m197273v() == 1768715124) {
                        v6w0Var.m197262k(iM197270s2);
                        v6w0Var.m197263l(8);
                        ArrayList arrayList = new ArrayList();
                        while (v6w0Var.m197270s() < iM197273v3) {
                            zzbx zzbxVarM183526a = sdr0.m183526a(v6w0Var);
                            if (zzbxVarM183526a != null) {
                                arrayList.add(zzbxVarM183526a);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbyVar2 = new zzby(arrayList);
                            break;
                        }
                        break;
                    }
                    v6w0Var.m197262k(iM197273v3);
                }
                zzbyVar = zzbyVar.m13554d(zzbyVar2);
            } else if (iM197273v2 == 1936553057) {
                v6w0Var.m197262k(iM197270s);
                v6w0Var.m197263l(12);
                while (v6w0Var.m197270s() < iM197273v) {
                    int iM197270s3 = v6w0Var.m197270s();
                    int iM197273v4 = v6w0Var.m197273v();
                    if (v6w0Var.m197273v() == 1935766900) {
                        if (iM197273v4 < 16) {
                            break;
                        }
                        v6w0Var.m197263l(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int iM197238B = v6w0Var.m197238B();
                            int iM197238B2 = v6w0Var.m197238B();
                            if (iM197238B == 0) {
                                i = iM197238B2;
                            } else if (iM197238B == 1) {
                                i2 = iM197238B2;
                            }
                        }
                        if (i == 12) {
                            iM197239C = 240;
                        } else if (i == 13) {
                            iM197239C = 120;
                        } else if (i == 21 && v6w0Var.m197268q() >= 8 && v6w0Var.m197270s() + 8 <= iM197273v) {
                            int iM197273v5 = v6w0Var.m197273v();
                            int iM197273v6 = v6w0Var.m197273v();
                            if (iM197273v5 < 12 || iM197273v6 != 1936877170) {
                                iM197239C = -2147483647;
                            } else {
                                iM197239C = v6w0Var.m197239C();
                            }
                        } else {
                            iM197239C = -2147483647;
                        }
                        if (iM197239C == -2147483647) {
                            break;
                        }
                        zzbyVar2 = new zzby(-9223372036854775807L, new zzahm(iM197239C, i2));
                        break;
                    }
                    v6w0Var.m197262k(iM197270s3 + iM197273v4);
                }
                zzbyVar = zzbyVar.m13554d(zzbyVar2);
            } else if (iM197273v2 == -1451722374) {
                zzbyVar = zzbyVar.m13554d(m101218i(v6w0Var));
            }
            v6w0Var.m197262k(iM197273v);
        }
        return zzbyVar;
    }

    /* JADX INFO: renamed from: c */
    public static zzgi m101212c(v6w0 v6w0Var) {
        long jM197245I;
        long jM197245I2;
        v6w0Var.m197262k(8);
        if (tcr0.m188057a(v6w0Var.m197273v()) == 0) {
            jM197245I = v6w0Var.m197246J();
            jM197245I2 = v6w0Var.m197246J();
        } else {
            jM197245I = v6w0Var.m197245I();
            jM197245I2 = v6w0Var.m197245I();
        }
        return new zzgi(jM197245I, jM197245I2, v6w0Var.m197246J());
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
    public static List m101213d(rcr0 rcr0Var, l6r0 l6r0Var, long j, @Nullable zzae zzaeVar, boolean z, boolean z2, yew0 yew0Var) throws zzcc {
        int i;
        long jM126051H;
        long j2;
        int i2;
        int i3;
        long j3;
        ArrayList arrayList;
        int i4;
        rcr0 rcr0Var2;
        long[] jArr;
        long[] jArr2;
        ber0 ber0Var;
        Pair pairCreate;
        int i5;
        adr0 adr0Var;
        int i6;
        int i7;
        String str;
        int i8;
        int i9;
        zzae zzaeVar2;
        String str2;
        Pair pair;
        ArrayList arrayList2;
        rcr0 rcr0Var3;
        int i10;
        int i11;
        int i12;
        String str3;
        int i13;
        float fM197241E;
        boolean z3;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zM207161o;
        boolean z4;
        qny0 qny0VarM209761g;
        int iM207150d;
        int iM207150d2;
        int iM207150d3;
        int i18;
        int iM207150d4;
        int i19;
        int iM175707a;
        boolean z5;
        String str4;
        int i20;
        int i21;
        List list;
        int i22;
        int i23;
        String str5;
        zzae zzaeVarM13537b;
        String str6;
        long j4;
        zzgaa zzgaaVar;
        ArrayList arrayList3;
        ArrayList arrayList4 = new ArrayList();
        int i24 = 0;
        while (i24 < rcr0Var.f158815d.size()) {
            rcr0 rcr0Var4 = (rcr0) rcr0Var.f158815d.get(i24);
            if (rcr0Var4.f169472a != 1953653099) {
                arrayList3 = arrayList4;
                i4 = i24;
            } else {
                scr0 scr0VarM178812d = rcr0Var.m178812d(1836476516);
                scr0VarM178812d.getClass();
                rcr0 rcr0VarM178811c = rcr0Var4.m178811c(1835297121);
                rcr0VarM178811c.getClass();
                scr0 scr0VarM178812d2 = rcr0VarM178811c.m178812d(1751411826);
                scr0VarM178812d2.getClass();
                int iM101216g = m101216g(scr0VarM178812d2.f163765b);
                if (iM101216g == 1936684398) {
                    i = 1;
                } else if (iM101216g == 1986618469) {
                    i = 2;
                } else if (iM101216g == 1952807028 || iM101216g == 1935832172 || iM101216g == 1937072756 || iM101216g == 1668047728) {
                    i = 3;
                } else {
                    i = iM101216g == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    arrayList = arrayList4;
                    i4 = i24;
                    rcr0Var2 = rcr0Var4;
                    ber0Var = null;
                } else {
                    scr0 scr0VarM178812d3 = rcr0Var4.m178812d(1953196132);
                    scr0VarM178812d3.getClass();
                    v6w0 v6w0Var = scr0VarM178812d3.f163765b;
                    int i25 = 8;
                    v6w0Var.m197262k(8);
                    int iM188057a = tcr0.m188057a(v6w0Var.m197273v());
                    v6w0Var.m197263l(iM188057a == 0 ? 8 : 16);
                    int iM197273v = v6w0Var.m197273v();
                    v6w0Var.m197263l(4);
                    int iM197270s = v6w0Var.m197270s();
                    int i26 = 0;
                    while (true) {
                        if (iM188057a == 0) {
                            i25 = 4;
                        }
                        jM126051H = -9223372036854775807L;
                        if (i26 >= i25) {
                            v6w0Var.m197263l(i25);
                        } else {
                            if (v6w0Var.m197264m()[iM197270s + i26] != -1) {
                                long jM197246J = iM188057a == 0 ? v6w0Var.m197246J() : v6w0Var.m197247K();
                                if (jM197246J != 0) {
                                    j2 = jM197246J;
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
                    v6w0Var.m197263l(16);
                    int iM197273v2 = v6w0Var.m197273v();
                    int iM197273v3 = v6w0Var.m197273v();
                    v6w0Var.m197263l(4);
                    int iM197273v4 = v6w0Var.m197273v();
                    int iM197273v5 = v6w0Var.m197273v();
                    int i27 = 65536;
                    if (iM197273v2 != 0) {
                        if (iM197273v2 == 0) {
                            i27 = iM197273v4;
                            i2 = iM197273v2;
                        } else if (iM197273v3 != -65536) {
                            i27 = iM197273v4;
                            i2 = 0;
                        } else if (iM197273v4 == 65536) {
                            iM197273v3 = -65536;
                            i27 = iM197273v4;
                            i2 = 0;
                        } else if (iM197273v5 == 0) {
                            i3 = 270;
                        } else {
                            iM197273v3 = -65536;
                            i2 = 0;
                        }
                        if (i2 != -65536 && iM197273v3 == 0 && i27 == 0 && iM197273v5 == -65536) {
                            i3 = 180;
                        } else {
                            i3 = 0;
                        }
                    } else {
                        if (iM197273v3 == 65536) {
                            if (iM197273v4 == -65536) {
                                if (iM197273v5 == 0) {
                                    i3 = 90;
                                } else {
                                    iM197273v4 = -65536;
                                }
                            }
                            iM197273v3 = 65536;
                        }
                        iM197273v2 = 0;
                        if (iM197273v2 == 0) {
                            i27 = iM197273v4;
                            i2 = iM197273v2;
                        } else if (iM197273v3 != -65536) {
                            i27 = iM197273v4;
                            i2 = 0;
                        } else if (iM197273v4 == 65536) {
                            iM197273v3 = -65536;
                            i27 = iM197273v4;
                            i2 = 0;
                        } else if (iM197273v5 == 0) {
                            i3 = 270;
                        } else {
                            iM197273v3 = -65536;
                            i2 = 0;
                        }
                        if (i2 != -65536) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                        }
                    }
                    adr0 adr0Var2 = new adr0(iM197273v, j2, i3);
                    long j5 = j == -9223372036854775807L ? adr0Var2.f68958b : j;
                    long j6 = m101212c(scr0VarM178812d.f163765b).zzc;
                    if (j5 == -9223372036854775807L) {
                        j3 = j6;
                    } else {
                        j3 = j6;
                        jM126051H = ggw0.m126051H(j5, 1000000L, j3, RoundingMode.FLOOR);
                    }
                    rcr0 rcr0VarM178811c2 = rcr0VarM178811c.m178811c(1835626086);
                    rcr0VarM178811c2.getClass();
                    char c = 25196;
                    rcr0 rcr0VarM178811c3 = rcr0VarM178811c2.m178811c(1937007212);
                    rcr0VarM178811c3.getClass();
                    scr0 scr0VarM178812d4 = rcr0VarM178811c.m178812d(1835296868);
                    scr0VarM178812d4.getClass();
                    v6w0 v6w0Var2 = scr0VarM178812d4.f163765b;
                    v6w0Var2.m197262k(8);
                    int iM188057a2 = tcr0.m188057a(v6w0Var2.m197273v());
                    v6w0Var2.m197263l(iM188057a2 == 0 ? 8 : 16);
                    int i28 = iM188057a2 == 0 ? 4 : 8;
                    long jM197246J2 = v6w0Var2.m197246J();
                    v6w0Var2.m197263l(i28);
                    int iM197242F = v6w0Var2.m197242F();
                    StringBuilder sb = new StringBuilder();
                    sb.append((char) (((iM197242F >> 10) & 31) + 96));
                    sb.append((char) (((iM197242F >> 5) & 31) + 96));
                    sb.append((char) ((iM197242F & 31) + 96));
                    Pair pairCreate2 = Pair.create(Long.valueOf(jM197246J2), sb.toString());
                    scr0 scr0VarM178812d5 = rcr0VarM178811c3.m178812d(1937011556);
                    if (scr0VarM178812d5 == null) {
                        throw zzcc.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    int i29 = adr0Var2.f68957a;
                    int i30 = adr0Var2.f68959c;
                    String str7 = (String) pairCreate2.second;
                    v6w0 v6w0Var3 = scr0VarM178812d5.f163765b;
                    v6w0Var3.m197262k(12);
                    int iM197273v6 = v6w0Var3.m197273v();
                    xcr0 xcr0Var = new xcr0(iM197273v6);
                    int i31 = 0;
                    while (i31 < iM197273v6) {
                        int i32 = i;
                        int iM197270s2 = v6w0Var3.m197270s();
                        int iM197273v7 = v6w0Var3.m197273v();
                        String str8 = "childAtomSize must be positive";
                        n5r0.m157996b(iM197273v7 > 0, "childAtomSize must be positive");
                        int i33 = i30;
                        int iM197273v8 = v6w0Var3.m197273v();
                        if (iM197273v8 == 1635148593 || iM197273v8 == 1635148595 || iM197273v8 == 1701733238 || iM197273v8 == 1831958048 || iM197273v8 == 1836070006 || iM197273v8 == 1752589105 || iM197273v8 == 1751479857 || iM197273v8 == 1932670515 || iM197273v8 == 1211250227 || iM197273v8 == 1987063864 || iM197273v8 == 1987063865 || iM197273v8 == 1635135537 || iM197273v8 == 1685479798 || iM197273v8 == 1685479729 || iM197273v8 == 1685481573 || iM197273v8 == 1685481521) {
                            i5 = iM197273v6;
                            adr0Var = adr0Var2;
                            i6 = i24;
                            i7 = iM197270s2;
                            int i34 = i33;
                            v6w0Var3.m197262k(i7 + 16);
                            v6w0Var3.m197263l(16);
                            int iM197242F2 = v6w0Var3.m197242F();
                            int iM197242F3 = v6w0Var3.m197242F();
                            str = str7;
                            v6w0Var3.m197263l(50);
                            int iM197270s3 = v6w0Var3.m197270s();
                            i8 = i31;
                            int iIntValue = 1701733238;
                            if (iM197273v8 == 1701733238) {
                                Pair pairM101217h = m101217h(v6w0Var3, i7, iM197273v7);
                                if (pairM101217h != null) {
                                    iIntValue = ((Integer) pairM101217h.first).intValue();
                                    zzaeVarM13537b = zzaeVar == null ? null : zzaeVar.m13537b(((cer0) pairM101217h.second).f80486b);
                                    xcr0Var.f192250a[i8] = (cer0) pairM101217h.second;
                                } else {
                                    i7 = i7;
                                    zzaeVarM13537b = zzaeVar;
                                }
                                int i35 = iIntValue;
                                v6w0Var3.m197262k(iM197270s3);
                                i9 = i35;
                                zzaeVar2 = zzaeVarM13537b;
                            } else {
                                i7 = i7;
                                i9 = iM197273v8;
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
                            int i36 = iM197270s3;
                            pair = pairCreate2;
                            float f = 1.0f;
                            zzae zzaeVar3 = zzaeVar2;
                            arrayList2 = arrayList4;
                            rcr0Var3 = rcr0Var4;
                            boolean z6 = false;
                            String str9 = null;
                            int i37 = -1;
                            int i38 = 8;
                            int i39 = 8;
                            int i40 = -1;
                            List listZzm = null;
                            ByteBuffer byteBufferM101221l = null;
                            vcr0 vcr0Var = null;
                            int i41 = -1;
                            byte[] bArrCopyOfRange = null;
                            String str10 = str2;
                            int iM175708b = -1;
                            while (i36 - i7 < iM197273v7) {
                                v6w0Var3.m197262k(i36);
                                int iM197270s4 = v6w0Var3.m197270s();
                                int iM197273v9 = v6w0Var3.m197273v();
                                if (iM197273v9 != 0) {
                                    i12 = iM197273v9;
                                } else {
                                    if (v6w0Var3.m197270s() - i7 == iM197273v7) {
                                        break;
                                    }
                                    i12 = 0;
                                }
                                n5r0.m157996b(i12 > 0, str8);
                                int iM197273v10 = v6w0Var3.m197273v();
                                String str11 = str8;
                                if (iM197273v10 == 1635148611) {
                                    int i42 = iM197270s4 + 8;
                                    n5r0.m157996b(str10 == null, null);
                                    v6w0Var3.m197262k(i42);
                                    d4r0 d4r0VarM109996a = d4r0.m109996a(v6w0Var3);
                                    List list2 = d4r0VarM109996a.f84337a;
                                    xcr0Var.f192252c = d4r0VarM109996a.f84338b;
                                    if (z6) {
                                        z5 = true;
                                    } else {
                                        f = d4r0VarM109996a.f84346j;
                                        z5 = false;
                                    }
                                    str4 = d4r0VarM109996a.f84347k;
                                    iM175707a = d4r0VarM109996a.f84343g;
                                    i20 = d4r0VarM109996a.f84344h;
                                    i21 = d4r0VarM109996a.f84345i;
                                    list = list2;
                                    i22 = d4r0VarM109996a.f84341e;
                                    i23 = d4r0VarM109996a.f84342f;
                                    str5 = YtVideoEncoder.MIME_TYPE;
                                } else {
                                    if (iM197273v10 == 1752589123) {
                                        int i43 = iM197270s4 + 8;
                                        n5r0.m157996b(str10 == null, null);
                                        v6w0Var3.m197262k(i43);
                                        m6r0 m6r0VarM153294a = m6r0.m153294a(v6w0Var3);
                                        List list3 = m6r0VarM153294a.f131752a;
                                        xcr0Var.f192252c = m6r0VarM153294a.f131753b;
                                        if (z6) {
                                            z5 = true;
                                        } else {
                                            f = m6r0VarM153294a.f131759h;
                                            z5 = false;
                                        }
                                        str4 = m6r0VarM153294a.f131760i;
                                        iM175707a = m6r0VarM153294a.f131756e;
                                        i20 = m6r0VarM153294a.f131757f;
                                        i21 = m6r0VarM153294a.f131758g;
                                        list = list3;
                                        i22 = m6r0VarM153294a.f131754c;
                                        i23 = m6r0VarM153294a.f131755d;
                                        str5 = "video/hevc";
                                    } else if (iM197273v10 == 1685480259 || iM197273v10 == 1685485123) {
                                        str3 = str9;
                                        i13 = i9;
                                        iM175708b = iM175708b;
                                        iM197242F2 = iM197242F2;
                                        xcr0Var = xcr0Var;
                                        i34 = i34;
                                        iM197242F3 = iM197242F3;
                                        fM197241E = f;
                                        f5r0 f5r0VarM119516a = f5r0.m119516a(v6w0Var3);
                                        if (f5r0VarM119516a != null) {
                                            str9 = f5r0VarM119516a.f95199a;
                                            iM175708b = iM175708b;
                                            str10 = "video/dolby-vision";
                                        } else {
                                            iM175708b = iM175708b;
                                            str9 = str3;
                                        }
                                    } else {
                                        if (iM197273v10 == 1987076931) {
                                            n5r0.m157996b(str10 == null, null);
                                            v6w0Var3.m197262k(iM197270s4 + 12);
                                            v6w0Var3.m197263l(2);
                                            int iM197238B = v6w0Var3.m197238B();
                                            int i44 = iM197238B >> 4;
                                            int i45 = iM197238B & 1;
                                            int iM197238B2 = v6w0Var3.m197238B();
                                            int iM197238B3 = v6w0Var3.m197238B();
                                            iM175707a = qny0.m175707a(iM197238B2);
                                            i40 = 1 != i45 ? 2 : 1;
                                            i13 = i9;
                                            i38 = i44;
                                            i39 = i38;
                                            iM175708b = qny0.m175708b(iM197238B3);
                                            fM197241E = f;
                                            str10 = i9 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        } else {
                                            i13 = i9;
                                            if (iM197273v10 == 1635135811) {
                                                v6w0Var3.m197262k(iM197270s4 + 8);
                                                xjy0 xjy0Var = new xjy0();
                                                byte[] bArrM197264m = v6w0Var3.m197264m();
                                                x5w0 x5w0Var = new x5w0(bArrM197264m, bArrM197264m.length);
                                                x5w0Var.m207157k(v6w0Var3.m197270s() * 8);
                                                x5w0Var.m207160n(1);
                                                int iM207150d5 = x5w0Var.m207150d(3);
                                                x5w0Var.m207159m(6);
                                                boolean zM207161o2 = x5w0Var.m207161o();
                                                boolean zM207161o3 = x5w0Var.m207161o();
                                                if (iM207150d5 != 2) {
                                                    i14 = 1;
                                                    if (iM207150d5 <= 2) {
                                                        if (true != zM207161o2) {
                                                            i15 = 8;
                                                        } else {
                                                            i15 = 10;
                                                        }
                                                        xjy0Var.m209760f(i15);
                                                        xjy0Var.m209755a(i15);
                                                    }
                                                } else if (zM207161o2) {
                                                    int i46 = true != zM207161o3 ? 10 : 12;
                                                    xjy0Var.m209760f(i46);
                                                    xjy0Var.m209755a(i46);
                                                    i14 = 1;
                                                } else {
                                                    iM207150d5 = 2;
                                                    zM207161o2 = false;
                                                    i14 = 1;
                                                    if (iM207150d5 <= 2) {
                                                        if (true != zM207161o2) {
                                                            i15 = 8;
                                                        } else {
                                                            i15 = 10;
                                                        }
                                                        xjy0Var.m209760f(i15);
                                                        xjy0Var.m209755a(i15);
                                                    }
                                                }
                                                x5w0Var.m207159m(13);
                                                x5w0Var.m207158l();
                                                int iM207150d6 = x5w0Var.m207150d(4);
                                                if (iM207150d6 != i14) {
                                                    svv0.m186110e("AtomParsers", "Unsupported obu_type: " + iM207150d6);
                                                    qny0VarM209761g = xjy0Var.m209761g();
                                                } else if (x5w0Var.m207161o()) {
                                                    svv0.m186110e("AtomParsers", "Unsupported obu_extension_flag");
                                                    qny0VarM209761g = xjy0Var.m209761g();
                                                } else {
                                                    boolean zM207161o4 = x5w0Var.m207161o();
                                                    x5w0Var.m207158l();
                                                    if (!zM207161o4 || x5w0Var.m207150d(8) <= 127) {
                                                        int iM207150d7 = x5w0Var.m207150d(3);
                                                        x5w0Var.m207158l();
                                                        if (x5w0Var.m207161o()) {
                                                            svv0.m186110e("AtomParsers", "Unsupported reduced_still_picture_header");
                                                            qny0VarM209761g = xjy0Var.m209761g();
                                                        } else if (x5w0Var.m207161o()) {
                                                            svv0.m186110e("AtomParsers", "Unsupported timing_info_present_flag");
                                                            qny0VarM209761g = xjy0Var.m209761g();
                                                        } else {
                                                            if (x5w0Var.m207161o()) {
                                                                svv0.m186110e("AtomParsers", "Unsupported initial_display_delay_present_flag");
                                                                qny0VarM209761g = xjy0Var.m209761g();
                                                            } else {
                                                                int i47 = 5;
                                                                int iM207150d8 = x5w0Var.m207150d(5);
                                                                int i48 = 0;
                                                                while (i48 <= iM207150d8) {
                                                                    x5w0Var.m207159m(12);
                                                                    if (x5w0Var.m207150d(i47) > 7) {
                                                                        x5w0Var.m207158l();
                                                                    }
                                                                    i48++;
                                                                    i47 = 5;
                                                                }
                                                                int iM207150d9 = x5w0Var.m207150d(4);
                                                                int iM207150d10 = x5w0Var.m207150d(4);
                                                                x5w0Var.m207159m(iM207150d9 + 1);
                                                                x5w0Var.m207159m(iM207150d10 + 1);
                                                                if (x5w0Var.m207161o()) {
                                                                    i16 = 7;
                                                                    x5w0Var.m207159m(7);
                                                                } else {
                                                                    i16 = 7;
                                                                }
                                                                x5w0Var.m207159m(i16);
                                                                boolean zM207161o5 = x5w0Var.m207161o();
                                                                if (zM207161o5) {
                                                                    x5w0Var.m207159m(2);
                                                                }
                                                                if (x5w0Var.m207161o()) {
                                                                    i17 = 1;
                                                                } else {
                                                                    i17 = 1;
                                                                    if (x5w0Var.m207150d(1) > 0) {
                                                                    }
                                                                    if (zM207161o5) {
                                                                        x5w0Var.m207159m(3);
                                                                    }
                                                                    x5w0Var.m207159m(3);
                                                                    zM207161o = x5w0Var.m207161o();
                                                                    if (iM207150d7 == 2) {
                                                                        z4 = iM207150d7 != 1;
                                                                        if (x5w0Var.m207161o()) {
                                                                            iM207150d = x5w0Var.m207150d(8);
                                                                            iM207150d2 = x5w0Var.m207150d(8);
                                                                            iM207150d3 = x5w0Var.m207150d(8);
                                                                            if (z4) {
                                                                                i18 = 1;
                                                                            } else {
                                                                                i18 = 1;
                                                                                if (iM207150d != 1) {
                                                                                    if (iM207150d2 == 13) {
                                                                                        if (iM207150d3 == 0) {
                                                                                            iM207150d2 = 13;
                                                                                            iM207150d4 = 1;
                                                                                            iM207150d = 1;
                                                                                        } else {
                                                                                            iM207150d2 = 13;
                                                                                        }
                                                                                    }
                                                                                    iM207150d = 1;
                                                                                }
                                                                                xjy0Var.m209757c(qny0.m175707a(iM207150d));
                                                                                if (iM207150d4 == i18) {
                                                                                    i19 = 1;
                                                                                } else {
                                                                                    i19 = 2;
                                                                                }
                                                                                xjy0Var.m209756b(i19);
                                                                                xjy0Var.m209758d(qny0.m175708b(iM207150d2));
                                                                            }
                                                                            iM207150d4 = x5w0Var.m207150d(i18);
                                                                            xjy0Var.m209757c(qny0.m175707a(iM207150d));
                                                                            if (iM207150d4 == i18) {
                                                                                i19 = 1;
                                                                            } else {
                                                                                i19 = 2;
                                                                            }
                                                                            xjy0Var.m209756b(i19);
                                                                            xjy0Var.m209758d(qny0.m175708b(iM207150d2));
                                                                        }
                                                                        qny0VarM209761g = xjy0Var.m209761g();
                                                                    } else if (zM207161o) {
                                                                        x5w0Var.m207158l();
                                                                    }
                                                                    if (x5w0Var.m207161o()) {
                                                                    }
                                                                    if (x5w0Var.m207161o()) {
                                                                        iM207150d = x5w0Var.m207150d(8);
                                                                        iM207150d2 = x5w0Var.m207150d(8);
                                                                        iM207150d3 = x5w0Var.m207150d(8);
                                                                        if (z4) {
                                                                            i18 = 1;
                                                                            if (iM207150d != 1) {
                                                                                if (iM207150d2 == 13) {
                                                                                    if (iM207150d3 == 0) {
                                                                                        iM207150d2 = 13;
                                                                                        iM207150d4 = 1;
                                                                                        iM207150d = 1;
                                                                                    } else {
                                                                                        iM207150d2 = 13;
                                                                                    }
                                                                                }
                                                                                iM207150d = 1;
                                                                            }
                                                                            xjy0Var.m209757c(qny0.m175707a(iM207150d));
                                                                            if (iM207150d4 == i18) {
                                                                                i19 = 1;
                                                                            } else {
                                                                                i19 = 2;
                                                                            }
                                                                            xjy0Var.m209756b(i19);
                                                                            xjy0Var.m209758d(qny0.m175708b(iM207150d2));
                                                                        } else {
                                                                            i18 = 1;
                                                                        }
                                                                        iM207150d4 = x5w0Var.m207150d(i18);
                                                                        xjy0Var.m209757c(qny0.m175707a(iM207150d));
                                                                        if (iM207150d4 == i18) {
                                                                            i19 = 1;
                                                                        } else {
                                                                            i19 = 2;
                                                                        }
                                                                        xjy0Var.m209756b(i19);
                                                                        xjy0Var.m209758d(qny0.m175708b(iM207150d2));
                                                                    }
                                                                    qny0VarM209761g = xjy0Var.m209761g();
                                                                }
                                                                if (!x5w0Var.m207161o()) {
                                                                    x5w0Var.m207159m(i17);
                                                                }
                                                                if (zM207161o5) {
                                                                    x5w0Var.m207159m(3);
                                                                }
                                                                x5w0Var.m207159m(3);
                                                                zM207161o = x5w0Var.m207161o();
                                                                if (iM207150d7 == 2) {
                                                                    if (iM207150d7 != 1) {
                                                                    }
                                                                    if (x5w0Var.m207161o()) {
                                                                        iM207150d = x5w0Var.m207150d(8);
                                                                        iM207150d2 = x5w0Var.m207150d(8);
                                                                        iM207150d3 = x5w0Var.m207150d(8);
                                                                        if (z4) {
                                                                            i18 = 1;
                                                                            if (iM207150d != 1) {
                                                                                if (iM207150d2 == 13) {
                                                                                    if (iM207150d3 == 0) {
                                                                                        iM207150d2 = 13;
                                                                                        iM207150d4 = 1;
                                                                                        iM207150d = 1;
                                                                                    } else {
                                                                                        iM207150d2 = 13;
                                                                                    }
                                                                                }
                                                                                iM207150d = 1;
                                                                            }
                                                                            xjy0Var.m209757c(qny0.m175707a(iM207150d));
                                                                            if (iM207150d4 == i18) {
                                                                                i19 = 1;
                                                                            } else {
                                                                                i19 = 2;
                                                                            }
                                                                            xjy0Var.m209756b(i19);
                                                                            xjy0Var.m209758d(qny0.m175708b(iM207150d2));
                                                                        } else {
                                                                            i18 = 1;
                                                                        }
                                                                        iM207150d4 = x5w0Var.m207150d(i18);
                                                                        xjy0Var.m209757c(qny0.m175707a(iM207150d));
                                                                        if (iM207150d4 == i18) {
                                                                            i19 = 1;
                                                                        } else {
                                                                            i19 = 2;
                                                                        }
                                                                        xjy0Var.m209756b(i19);
                                                                        xjy0Var.m209758d(qny0.m175708b(iM207150d2));
                                                                    }
                                                                    qny0VarM209761g = xjy0Var.m209761g();
                                                                } else if (zM207161o) {
                                                                    x5w0Var.m207158l();
                                                                }
                                                                if (x5w0Var.m207161o()) {
                                                                }
                                                                if (x5w0Var.m207161o()) {
                                                                    iM207150d = x5w0Var.m207150d(8);
                                                                    iM207150d2 = x5w0Var.m207150d(8);
                                                                    iM207150d3 = x5w0Var.m207150d(8);
                                                                    if (z4) {
                                                                        i18 = 1;
                                                                        if (iM207150d != 1) {
                                                                            if (iM207150d2 == 13) {
                                                                                if (iM207150d3 == 0) {
                                                                                    iM207150d2 = 13;
                                                                                    iM207150d4 = 1;
                                                                                    iM207150d = 1;
                                                                                } else {
                                                                                    iM207150d2 = 13;
                                                                                }
                                                                            }
                                                                            iM207150d = 1;
                                                                        }
                                                                        xjy0Var.m209757c(qny0.m175707a(iM207150d));
                                                                        if (iM207150d4 == i18) {
                                                                            i19 = 1;
                                                                        } else {
                                                                            i19 = 2;
                                                                        }
                                                                        xjy0Var.m209756b(i19);
                                                                        xjy0Var.m209758d(qny0.m175708b(iM207150d2));
                                                                    } else {
                                                                        i18 = 1;
                                                                    }
                                                                    iM207150d4 = x5w0Var.m207150d(i18);
                                                                    xjy0Var.m209757c(qny0.m175707a(iM207150d));
                                                                    if (iM207150d4 == i18) {
                                                                        i19 = 1;
                                                                    } else {
                                                                        i19 = 2;
                                                                    }
                                                                    xjy0Var.m209756b(i19);
                                                                    xjy0Var.m209758d(qny0.m175708b(iM207150d2));
                                                                }
                                                                qny0VarM209761g = xjy0Var.m209761g();
                                                            }
                                                            int i49 = qny0VarM209761g.f155510c;
                                                            int i50 = qny0VarM209761g.f155509b;
                                                            iM175707a = qny0VarM209761g.f155508a;
                                                            int i51 = qny0VarM209761g.f155513f;
                                                            i39 = qny0VarM209761g.f155512e;
                                                            iM175708b = i49;
                                                            i40 = i50;
                                                            i38 = i51;
                                                            str10 = "video/av01";
                                                            fM197241E = f;
                                                        }
                                                    } else {
                                                        svv0.m186110e("AtomParsers", "Excessive obu_size");
                                                        qny0VarM209761g = xjy0Var.m209761g();
                                                    }
                                                }
                                                int i410 = qny0VarM209761g.f155510c;
                                                int i52 = qny0VarM209761g.f155509b;
                                                iM175707a = qny0VarM209761g.f155508a;
                                                int i53 = qny0VarM209761g.f155513f;
                                                i39 = qny0VarM209761g.f155512e;
                                                iM175708b = i410;
                                                i40 = i52;
                                                i38 = i53;
                                                str10 = "video/av01";
                                                fM197241E = f;
                                            } else {
                                                iM175708b = iM175708b;
                                                if (iM197273v10 == 1668050025) {
                                                    if (byteBufferM101221l == null) {
                                                        byteBufferM101221l = m101221l();
                                                    }
                                                    ByteBuffer byteBuffer = byteBufferM101221l;
                                                    byteBuffer.position(21);
                                                    byteBuffer.putShort(v6w0Var3.m197255d());
                                                    byteBuffer.putShort(v6w0Var3.m197255d());
                                                    iM175708b = iM175708b;
                                                    byteBufferM101221l = byteBuffer;
                                                    iM197242F2 = iM197242F2;
                                                    xcr0Var = xcr0Var;
                                                    i34 = i34;
                                                    iM197242F3 = iM197242F3;
                                                    fM197241E = f;
                                                } else {
                                                    if (iM197273v10 == 1835295606) {
                                                        if (byteBufferM101221l == null) {
                                                            byteBufferM101221l = m101221l();
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBufferM101221l;
                                                        short sM197255d = v6w0Var3.m197255d();
                                                        short sM197255d2 = v6w0Var3.m197255d();
                                                        short sM197255d3 = v6w0Var3.m197255d();
                                                        xcr0Var = xcr0Var;
                                                        short sM197255d4 = v6w0Var3.m197255d();
                                                        i34 = i34;
                                                        short sM197255d5 = v6w0Var3.m197255d();
                                                        fM197241E = f;
                                                        short sM197255d6 = v6w0Var3.m197255d();
                                                        iM197242F3 = iM197242F3;
                                                        short sM197255d7 = v6w0Var3.m197255d();
                                                        iM197242F2 = iM197242F2;
                                                        short sM197255d8 = v6w0Var3.m197255d();
                                                        long jM197246J3 = v6w0Var3.m197246J();
                                                        long jM197246J4 = v6w0Var3.m197246J();
                                                        str3 = str9;
                                                        byteBuffer2.position(1);
                                                        byteBuffer2.putShort(sM197255d5);
                                                        byteBuffer2.putShort(sM197255d6);
                                                        byteBuffer2.putShort(sM197255d);
                                                        byteBuffer2.putShort(sM197255d2);
                                                        byteBuffer2.putShort(sM197255d3);
                                                        byteBuffer2.putShort(sM197255d4);
                                                        byteBuffer2.putShort(sM197255d7);
                                                        byteBuffer2.putShort(sM197255d8);
                                                        byteBuffer2.putShort((short) (jM197246J3 / 10000));
                                                        byteBuffer2.putShort((short) (jM197246J4 / 10000));
                                                        byteBufferM101221l = byteBuffer2;
                                                    } else {
                                                        str3 = str9;
                                                        iM197242F2 = iM197242F2;
                                                        xcr0Var = xcr0Var;
                                                        i34 = i34;
                                                        iM197242F3 = iM197242F3;
                                                        fM197241E = f;
                                                        if (iM197273v10 == 1681012275) {
                                                            n5r0.m157996b(str10 == null, null);
                                                            str10 = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP;
                                                        } else if (iM197273v10 == 1702061171) {
                                                            n5r0.m157996b(str10 == null, null);
                                                            vcr0 vcr0VarM101219j = m101219j(v6w0Var3, iM197270s4);
                                                            String str12 = vcr0VarM101219j.f180980a;
                                                            byte[] bArr = vcr0VarM101219j.f180981b;
                                                            if (bArr != null) {
                                                                vcr0Var = vcr0VarM101219j;
                                                                str10 = str12;
                                                                listZzm = zzgaa.zzm(bArr);
                                                            } else {
                                                                vcr0Var = vcr0VarM101219j;
                                                                str10 = str12;
                                                            }
                                                        } else if (iM197273v10 == 1885434736) {
                                                            v6w0Var3.m197262k(iM197270s4 + 8);
                                                            iM175708b = iM175708b;
                                                            fM197241E = v6w0Var3.m197241E() / v6w0Var3.m197241E();
                                                            str9 = str3;
                                                            z6 = true;
                                                        } else if (iM197273v10 == 1937126244) {
                                                            int i54 = iM197270s4 + 8;
                                                            while (true) {
                                                                if (i54 - iM197270s4 < i12) {
                                                                    v6w0Var3.m197262k(i54);
                                                                    int iM197273v11 = v6w0Var3.m197273v() + i54;
                                                                    if (v6w0Var3.m197273v() == 1886547818) {
                                                                        bArrCopyOfRange = Arrays.copyOfRange(v6w0Var3.m197264m(), i54, iM197273v11);
                                                                    } else {
                                                                        i54 = iM197273v11;
                                                                    }
                                                                } else {
                                                                    iM175708b = iM175708b;
                                                                    str9 = str3;
                                                                    bArrCopyOfRange = null;
                                                                }
                                                            }
                                                        } else {
                                                            if (iM197273v10 == 1936995172) {
                                                                int iM197238B4 = v6w0Var3.m197238B();
                                                                v6w0Var3.m197263l(3);
                                                                if (iM197238B4 == 0) {
                                                                    int iM197238B5 = v6w0Var3.m197238B();
                                                                    if (iM197238B5 == 0) {
                                                                        i41 = 0;
                                                                    } else if (iM197238B5 == 1) {
                                                                        iM175708b = iM175708b;
                                                                        str9 = str3;
                                                                        i41 = 1;
                                                                    } else if (iM197238B5 == 2) {
                                                                        iM175708b = iM175708b;
                                                                        str9 = str3;
                                                                        i41 = 2;
                                                                    } else if (iM197238B5 == 3) {
                                                                        i41 = 3;
                                                                    }
                                                                    str9 = str3;
                                                                }
                                                            } else {
                                                                if (iM197273v10 == 1668246642) {
                                                                    if (i37 == -1) {
                                                                        if (iM175708b == -1) {
                                                                            int iM197273v12 = v6w0Var3.m197273v();
                                                                            if (iM197273v12 == 1852009592 || iM197273v12 == 1852009571) {
                                                                                int iM197242F4 = v6w0Var3.m197242F();
                                                                                int iM197242F5 = v6w0Var3.m197242F();
                                                                                v6w0Var3.m197263l(2);
                                                                                if (i12 != 19) {
                                                                                    z3 = false;
                                                                                } else if ((v6w0Var3.m197238B() & 128) != 0) {
                                                                                    i12 = 19;
                                                                                    z3 = true;
                                                                                } else {
                                                                                    i12 = 19;
                                                                                    z3 = false;
                                                                                }
                                                                                int iM175707a2 = qny0.m175707a(iM197242F4);
                                                                                int i55 = true != z3 ? 2 : 1;
                                                                                i37 = iM175707a2;
                                                                                iM175708b = qny0.m175708b(iM197242F5);
                                                                                i40 = i55;
                                                                            } else {
                                                                                svv0.m186111f("AtomParsers", "Unsupported color type: ".concat(tcr0.m188058b(iM197273v12)));
                                                                                iM175708b = -1;
                                                                                i37 = -1;
                                                                            }
                                                                        } else {
                                                                            iM175708b = iM175708b;
                                                                            i37 = -1;
                                                                        }
                                                                    }
                                                                    str9 = str3;
                                                                }
                                                                iM175708b = iM175708b;
                                                                str9 = str3;
                                                            }
                                                            iM175708b = iM175708b;
                                                            str9 = str3;
                                                        }
                                                    }
                                                    str9 = str3;
                                                }
                                            }
                                        }
                                        i37 = iM175707a;
                                    }
                                    i36 += i12;
                                    iM197273v7 = iM197273v7;
                                    str8 = str11;
                                    i9 = i13;
                                    xcr0Var = xcr0Var;
                                    i34 = i34;
                                    f = fM197241E;
                                    iM197242F3 = iM197242F3;
                                    iM197242F2 = iM197242F2;
                                }
                                i13 = i9;
                                z6 = z5;
                                i40 = i20;
                                fM197241E = f;
                                listZzm = list;
                                str10 = str5;
                                i38 = i23;
                                i39 = i22;
                                str9 = str4;
                                iM175708b = i21;
                                i37 = iM175707a;
                                i36 += i12;
                                iM197273v7 = iM197273v7;
                                str8 = str11;
                                i9 = i13;
                                xcr0Var = xcr0Var;
                                i34 = i34;
                                f = fM197241E;
                                iM197242F3 = iM197242F3;
                                iM197242F2 = iM197242F2;
                            }
                            String str13 = str9;
                            i10 = iM197273v7;
                            int i56 = iM175708b;
                            int i57 = iM197242F2;
                            xcr0 xcr0Var2 = xcr0Var;
                            int i58 = i34;
                            int i59 = iM197242F3;
                            float f2 = f;
                            if (str10 == null) {
                                xcr0Var = xcr0Var2;
                                i11 = i58;
                            } else {
                                ter0 ter0Var = new ter0();
                                ter0Var.m188602j(i29);
                                ter0Var.m188618w(str10);
                                ter0Var.m188607l0(str13);
                                ter0Var.m188590C(i57);
                                ter0Var.m188600i(i59);
                                ter0Var.m188614s(f2);
                                i11 = i58;
                                ter0Var.m188617v(i11);
                                ter0Var.m188615t(bArrCopyOfRange);
                                ter0Var.m188621z(i41);
                                ter0Var.m188606l(listZzm);
                                ter0Var.m188596e(zzaeVar3);
                                xjy0 xjy0Var2 = new xjy0();
                                xjy0Var2.m209757c(i37);
                                xjy0Var2.m209756b(i40);
                                xjy0Var2.m209758d(i56);
                                xjy0Var2.m209759e(byteBufferM101221l != null ? byteBufferM101221l.array() : null);
                                xjy0Var2.m209760f(i39);
                                xjy0Var2.m209755a(i38);
                                ter0Var.m188592a(xjy0Var2.m209761g());
                                if (vcr0Var != null) {
                                    ter0Var.m188603j0(okw0.m164907c(vcr0Var.f180982c));
                                    ter0Var.m188613r(okw0.m164907c(vcr0Var.f180983d));
                                }
                                xcr0Var = xcr0Var2;
                                xcr0Var.f192251b = ter0Var.m188591D();
                            }
                        } else if (iM197273v8 == 1836069985 || iM197273v8 == 1701733217 || iM197273v8 == 1633889587 || iM197273v8 == 1700998451 || iM197273v8 == 1633889588 || iM197273v8 == 1835823201 || iM197273v8 == 1685353315 || iM197273v8 == 1685353317 || iM197273v8 == 1685353320 || iM197273v8 == 1685353324 || iM197273v8 == 1685353336 || iM197273v8 == 1935764850 || iM197273v8 == 1935767394 || iM197273v8 == 1819304813 || iM197273v8 == 1936684916 || iM197273v8 == 1953984371 || iM197273v8 == 778924082 || iM197273v8 == 778924083 || iM197273v8 == 1835557169 || iM197273v8 == 1835560241 || iM197273v8 == 1634492771 || iM197273v8 == 1634492791 || iM197273v8 == 1970037111 || iM197273v8 == 1332770163 || iM197273v8 == 1716281667) {
                            i5 = iM197273v6;
                            adr0Var = adr0Var2;
                            i6 = i24;
                            i11 = i33;
                            m101222m(v6w0Var3, iM197273v8, iM197270s2, iM197273v7, i29, str7, z2, zzaeVar, xcr0Var, i31);
                            i7 = iM197270s2;
                            i10 = iM197273v7;
                            i8 = i31;
                            arrayList2 = arrayList4;
                            rcr0Var3 = rcr0Var4;
                            pair = pairCreate2;
                            str = str7;
                        } else if (iM197273v8 == 1414810956 || iM197273v8 == 1954034535 || iM197273v8 == 2004251764 || iM197273v8 == 1937010800 || iM197273v8 == 1664495672) {
                            v6w0Var3.m197262k(iM197270s2 + 16);
                            String str14 = "application/ttml+xml";
                            if (iM197273v8 == 1414810956) {
                                str6 = str14;
                                j4 = Long.MAX_VALUE;
                                zzgaaVar = null;
                            } else if (iM197273v8 == 1954034535) {
                                int i60 = iM197273v7 - 16;
                                byte[] bArr2 = new byte[i60];
                                v6w0Var3.m197258g(bArr2, 0, i60);
                                zzgaa zzgaaVarZzm = zzgaa.zzm(bArr2);
                                str6 = "application/x-quicktime-tx3g";
                                zzgaaVar = zzgaaVarZzm;
                                v6w0Var3 = v6w0Var3;
                                iM197273v7 = iM197273v7;
                                j4 = Long.MAX_VALUE;
                            } else {
                                if (iM197273v8 == 2004251764) {
                                    str14 = "application/x-mp4-vtt";
                                    str6 = str14;
                                    j4 = Long.MAX_VALUE;
                                } else if (iM197273v8 == 1937010800) {
                                    str6 = "application/ttml+xml";
                                    j4 = 0;
                                } else {
                                    xcr0Var.f192253d = 1;
                                    str6 = "application/x-mp4-cea-608";
                                    j4 = Long.MAX_VALUE;
                                }
                                zzgaaVar = null;
                            }
                            ter0 ter0Var2 = new ter0();
                            ter0Var2.m188602j(i29);
                            ter0Var2.m188618w(str6);
                            ter0Var2.m188609n(str7);
                            ter0Var2.m188589B(j4);
                            ter0Var2.m188606l(zzgaaVar);
                            xcr0Var.f192251b = ter0Var2.m188591D();
                            str = str7;
                            i5 = iM197273v6;
                            arrayList2 = arrayList4;
                            adr0Var = adr0Var2;
                            i6 = i24;
                            rcr0Var3 = rcr0Var4;
                            pair = pairCreate2;
                            v6w0Var3 = v6w0Var3;
                            i7 = iM197270s2;
                            i10 = iM197273v7;
                            i11 = i33;
                            i8 = i31;
                        } else {
                            if (iM197273v8 == 1835365492) {
                                v6w0Var3.m197262k(iM197270s2 + 16);
                                v6w0Var3.m197249M((char) 0);
                                String strM197249M = v6w0Var3.m197249M((char) 0);
                                if (strM197249M != null) {
                                    ter0 ter0Var3 = new ter0();
                                    ter0Var3.m188602j(i29);
                                    ter0Var3.m188618w(strM197249M);
                                    xcr0Var.f192251b = ter0Var3.m188591D();
                                }
                            } else if (iM197273v8 == 1667329389) {
                                ter0 ter0Var4 = new ter0();
                                ter0Var4.m188602j(i29);
                                ter0Var4.m188618w("application/x-camera-motion");
                                xcr0Var.f192251b = ter0Var4.m188591D();
                            }
                            i10 = iM197273v7;
                            str = str7;
                            i5 = iM197273v6;
                            i8 = i31;
                            arrayList2 = arrayList4;
                            adr0Var = adr0Var2;
                            i6 = i24;
                            rcr0Var3 = rcr0Var4;
                            pair = pairCreate2;
                            i7 = iM197270s2;
                            i11 = i33;
                        }
                        v6w0Var3.m197262k(i7 + i10);
                        i31 = i8 + 1;
                        i30 = i11;
                        adr0Var2 = adr0Var;
                        iM197273v6 = i5;
                        str7 = str;
                        i = i32;
                        i24 = i6;
                        arrayList4 = arrayList2;
                        pairCreate2 = pair;
                        rcr0Var4 = rcr0Var3;
                        c = 25196;
                    }
                    int i61 = i;
                    arrayList = arrayList4;
                    adr0 adr0Var3 = adr0Var2;
                    i4 = i24;
                    rcr0 rcr0Var5 = rcr0Var4;
                    Pair pair2 = pairCreate2;
                    if (z) {
                        rcr0Var2 = rcr0Var5;
                    } else {
                        rcr0Var2 = rcr0Var5;
                        rcr0 rcr0VarM178811c4 = rcr0Var2.m178811c(1701082227);
                        if (rcr0VarM178811c4 != null) {
                            scr0 scr0VarM178812d6 = rcr0VarM178811c4.m178812d(1701606260);
                            if (scr0VarM178812d6 == null) {
                                pairCreate = null;
                            } else {
                                v6w0 v6w0Var4 = scr0VarM178812d6.f163765b;
                                v6w0Var4.m197262k(8);
                                int iM188057a3 = tcr0.m188057a(v6w0Var4.m197273v());
                                int iM197241E = v6w0Var4.m197241E();
                                long[] jArr3 = new long[iM197241E];
                                long[] jArr4 = new long[iM197241E];
                                for (int i62 = 0; i62 < iM197241E; i62++) {
                                    jArr3[i62] = iM188057a3 == 1 ? v6w0Var4.m197247K() : v6w0Var4.m197246J();
                                    jArr4[i62] = iM188057a3 == 1 ? v6w0Var4.m197245I() : v6w0Var4.m197273v();
                                    if (v6w0Var4.m197255d() != 1) {
                                        ig3.m135964a("Unsupported media rate.");
                                        return null;
                                    }
                                    v6w0Var4.m197263l(2);
                                }
                                pairCreate = Pair.create(jArr3, jArr4);
                            }
                            if (pairCreate != null) {
                                long[] jArr5 = (long[]) pairCreate.first;
                                jArr = (long[]) pairCreate.second;
                                jArr2 = jArr5;
                            }
                        }
                        if (xcr0Var.f192251b == null) {
                            ber0Var = null;
                        } else {
                            ber0Var = new ber0(adr0Var3.f68957a, i61, ((Long) pair2.first).longValue(), j3, jM126051H, xcr0Var.f192251b, xcr0Var.f192253d, xcr0Var.f192250a, xcr0Var.f192252c, jArr2, jArr);
                        }
                    }
                    jArr = null;
                    jArr2 = null;
                    if (xcr0Var.f192251b == null) {
                        ber0Var = null;
                    } else {
                        ber0Var = new ber0(adr0Var3.f68957a, i61, ((Long) pair2.first).longValue(), j3, jM126051H, xcr0Var.f192251b, xcr0Var.f192253d, xcr0Var.f192250a, xcr0Var.f192252c, jArr2, jArr);
                    }
                }
                ber0 ber0Var2 = (ber0) yew0Var.apply(ber0Var);
                if (ber0Var2 != null) {
                    rcr0 rcr0VarM178811c5 = rcr0Var2.m178811c(1835297121);
                    rcr0VarM178811c5.getClass();
                    rcr0 rcr0VarM178811c6 = rcr0VarM178811c5.m178811c(1835626086);
                    rcr0VarM178811c6.getClass();
                    rcr0 rcr0VarM178811c7 = rcr0VarM178811c6.m178811c(1937007212);
                    rcr0VarM178811c7.getClass();
                    eer0 eer0VarM101220k = m101220k(ber0Var2, rcr0VarM178811c7, l6r0Var);
                    arrayList3 = arrayList;
                    arrayList3.add(eer0VarM101220k);
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
    public static void m101214e(v6w0 v6w0Var) {
        int iM197270s = v6w0Var.m197270s();
        v6w0Var.m197263l(4);
        if (v6w0Var.m197273v() != 1751411826) {
            iM197270s += 4;
        }
        v6w0Var.m197262k(iM197270s);
    }

    /* JADX INFO: renamed from: f */
    public static int m101215f(v6w0 v6w0Var) {
        int iM197238B = v6w0Var.m197238B();
        int i = iM197238B & 127;
        while ((iM197238B & 128) == 128) {
            iM197238B = v6w0Var.m197238B();
            i = (i << 7) | (iM197238B & 127);
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public static int m101216g(v6w0 v6w0Var) {
        v6w0Var.m197262k(16);
        return v6w0Var.m197273v();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Pair m101217h(v6w0 v6w0Var, int i, int i2) throws zzcc {
        cer0 cer0Var;
        Pair pairCreate;
        int i3;
        int i4;
        int iM197270s = v6w0Var.m197270s();
        while (iM197270s - i < i2) {
            v6w0Var.m197262k(iM197270s);
            int iM197273v = v6w0Var.m197273v();
            n5r0.m157996b(iM197273v > 0, "childAtomSize must be positive");
            if (v6w0Var.m197273v() == 1936289382) {
                int i5 = iM197270s + 8;
                int i6 = 0;
                int i7 = -1;
                Integer numValueOf = null;
                String strM197252a = null;
                while (i5 - iM197270s < iM197273v) {
                    v6w0Var.m197262k(i5);
                    int iM197273v2 = v6w0Var.m197273v();
                    int iM197273v3 = v6w0Var.m197273v();
                    if (iM197273v3 == 1718775137) {
                        numValueOf = Integer.valueOf(v6w0Var.m197273v());
                    } else if (iM197273v3 == 1935894637) {
                        v6w0Var.m197263l(4);
                        strM197252a = v6w0Var.m197252a(4, wew0.f185990c);
                    } else if (iM197273v3 == 1935894633) {
                        i7 = i5;
                        i6 = iM197273v2;
                    }
                    i5 += iM197273v2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strM197252a) || "cbc1".equals(strM197252a) || "cens".equals(strM197252a) || "cbcs".equals(strM197252a)) {
                    n5r0.m157996b(numValueOf != null, "frma atom is mandatory");
                    n5r0.m157996b(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            cer0Var = null;
                            break;
                        }
                        v6w0Var.m197262k(i8);
                        int iM197273v4 = v6w0Var.m197273v();
                        if (v6w0Var.m197273v() == 1952804451) {
                            int iM188057a = tcr0.m188057a(v6w0Var.m197273v());
                            v6w0Var.m197263l(1);
                            if (iM188057a == 0) {
                                v6w0Var.m197263l(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iM197238B = v6w0Var.m197238B();
                                i3 = iM197238B & 15;
                                i4 = (iM197238B & 240) >> 4;
                            }
                            boolean z = v6w0Var.m197238B() == 1;
                            int iM197238B2 = v6w0Var.m197238B();
                            byte[] bArr2 = new byte[16];
                            v6w0Var.m197258g(bArr2, 0, 16);
                            if (z && iM197238B2 == 0) {
                                int iM197238B3 = v6w0Var.m197238B();
                                byte[] bArr3 = new byte[iM197238B3];
                                v6w0Var.m197258g(bArr3, 0, iM197238B3);
                                bArr = bArr3;
                            }
                            cer0Var = new cer0(z, strM197252a, iM197238B2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i8 += iM197273v4;
                    }
                    n5r0.m157996b(cer0Var != null, "tenc atom is mandatory");
                    int i9 = ggw0.f102568a;
                    pairCreate = Pair.create(numValueOf, cer0Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iM197270s += iM197273v;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static zzby m101218i(v6w0 v6w0Var) {
        short sM197255d = v6w0Var.m197255d();
        v6w0Var.m197263l(2);
        String strM197252a = v6w0Var.m197252a(sM197255d, wew0.f185990c);
        int iMax = Math.max(strM197252a.lastIndexOf(43), strM197252a.lastIndexOf(45));
        try {
            return new zzby(-9223372036854775807L, new zzgf(Float.parseFloat(strM197252a.substring(0, iMax)), Float.parseFloat(strM197252a.substring(iMax, strM197252a.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static vcr0 m101219j(v6w0 v6w0Var, int i) {
        v6w0Var.m197262k(i + 12);
        v6w0Var.m197263l(1);
        m101215f(v6w0Var);
        v6w0Var.m197263l(2);
        int iM197238B = v6w0Var.m197238B();
        if ((iM197238B & 128) != 0) {
            v6w0Var.m197263l(2);
        }
        if ((iM197238B & 64) != 0) {
            v6w0Var.m197263l(v6w0Var.m197238B());
        }
        if ((iM197238B & 32) != 0) {
            v6w0Var.m197263l(2);
        }
        v6w0Var.m197263l(1);
        m101215f(v6w0Var);
        String strM196367d = uys0.m196367d(v6w0Var.m197238B());
        if (DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG.equals(strM196367d) || "audio/vnd.dts".equals(strM196367d) || "audio/vnd.dts.hd".equals(strM196367d)) {
            return new vcr0(strM196367d, null, -1L, -1L);
        }
        v6w0Var.m197263l(4);
        long jM197246J = v6w0Var.m197246J();
        long jM197246J2 = v6w0Var.m197246J();
        v6w0Var.m197263l(1);
        int iM101215f = m101215f(v6w0Var);
        long j = jM197246J2;
        byte[] bArr = new byte[iM101215f];
        v6w0Var.m197258g(bArr, 0, iM101215f);
        if (j <= 0) {
            j = -1;
        }
        return new vcr0(strM196367d, bArr, j, jM197246J > 0 ? jM197246J : -1L);
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
    public static eer0 m101220k(ber0 ber0Var, rcr0 rcr0Var, l6r0 l6r0Var) throws zzcc {
        wcr0 zcr0Var;
        boolean z;
        int iM197241E;
        int iM197241E2;
        int i;
        int iM197241E3;
        int iZza;
        wcr0 wcr0Var;
        long j;
        long[] jArr;
        int[] iArrCopyOf;
        long[] jArr2;
        int[] iArr;
        int i2;
        v6w0 v6w0Var;
        int i3;
        int iM197273v;
        int i4;
        int i5;
        int i6;
        int iM197241E4;
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
        boolean zM193103a;
        int i13;
        int i14;
        int iZzc;
        int i15;
        long[] jArr3;
        RoundingMode roundingMode;
        long jM126051H;
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
        long jM126051H2;
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
        long jM126051H3;
        long j13;
        long jM126051H4;
        long jM126051H5;
        scr0 scr0VarM178812d = rcr0Var.m178812d(1937011578);
        if (scr0VarM178812d != null) {
            zcr0Var = new ycr0(scr0VarM178812d, ber0Var.f75230f);
        } else {
            scr0 scr0VarM178812d2 = rcr0Var.m178812d(1937013298);
            if (scr0VarM178812d2 == null) {
                throw zzcc.zza("Track has no sample table size information", null);
            }
            zcr0Var = new zcr0(scr0VarM178812d2);
        }
        int iZzb = zcr0Var.zzb();
        if (iZzb == 0) {
            return new eer0(ber0Var, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        scr0 scr0VarM178812d3 = rcr0Var.m178812d(1937007471);
        if (scr0VarM178812d3 == null) {
            scr0VarM178812d3 = rcr0Var.m178812d(1668232756);
            scr0VarM178812d3.getClass();
            z = true;
        } else {
            z = false;
        }
        scr0 scr0VarM178812d4 = rcr0Var.m178812d(1937011555);
        scr0VarM178812d4.getClass();
        scr0 scr0VarM178812d5 = rcr0Var.m178812d(1937011827);
        scr0VarM178812d5.getClass();
        scr0 scr0VarM178812d6 = rcr0Var.m178812d(1937011571);
        v6w0 v6w0Var2 = scr0VarM178812d6 != null ? scr0VarM178812d6.f163765b : null;
        scr0 scr0VarM178812d7 = rcr0Var.m178812d(1668576371);
        v6w0 v6w0Var3 = scr0VarM178812d7 != null ? scr0VarM178812d7.f163765b : null;
        v6w0 v6w0Var4 = scr0VarM178812d5.f163765b;
        ucr0 ucr0Var = new ucr0(scr0VarM178812d4.f163765b, scr0VarM178812d3.f163765b, z);
        v6w0Var4.m197262k(12);
        int iM197241E5 = v6w0Var4.m197241E() - 1;
        int iM197241E6 = v6w0Var4.m197241E();
        int iM197241E7 = v6w0Var4.m197241E();
        if (v6w0Var3 != null) {
            v6w0Var3.m197262k(12);
            iM197241E = v6w0Var3.m197241E();
        } else {
            iM197241E = 0;
        }
        if (v6w0Var2 != null) {
            v6w0Var2.m197262k(12);
            iM197241E2 = v6w0Var2.m197241E();
            if (iM197241E2 > 0) {
                iM197241E3 = v6w0Var2.m197241E() - 1;
                i = 0;
            } else {
                v6w0Var2 = null;
                i = 0;
            }
            iZza = zcr0Var.zza();
            String str2 = ber0Var.f75230f.f133892l;
            wcr0Var = zcr0Var;
            int i32 = iM197241E2;
            if (iZza == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iM197241E5 == 0)) {
                if (iM197241E == 0 && i32 == 0) {
                    int i33 = ucr0Var.f175852a;
                    long[] jArr11 = new long[i33];
                    int[] iArr11 = new int[i33];
                    while (ucr0Var.m193103a()) {
                        int i34 = ucr0Var.f175853b;
                        jArr11[i34] = ucr0Var.f175855d;
                        iArr11[i34] = ucr0Var.f175854c;
                    }
                    long j14 = iM197241E7;
                    int i35 = 8192 / iZza;
                    int i36 = i;
                    int i37 = i36;
                    while (i36 < i33) {
                        int i38 = iArr11[i36];
                        int i39 = ggw0.f102568a;
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
                    iM197241E5 = i;
                }
                jArr3 = jArrCopyOf;
                long j16 = ber0Var.f75227c;
                roundingMode = RoundingMode.FLOOR;
                jM126051H = ggw0.m126051H(j4, 1000000L, j16, roundingMode);
                jArr4 = ber0Var.f75232h;
                if (jArr4 == null) {
                    ggw0.m126063e(jArrCopyOf2, 1000000L, ber0Var.f75227c);
                    return new eer0(ber0Var, jArr3, iArr2, i12, jArrCopyOf2, iArrCopyOf2, jM126051H);
                }
                i16 = iZzb;
                j6 = j4;
                iArr3 = iArrCopyOf2;
                iArr4 = iArr2;
                jArr5 = jArrCopyOf2;
                i17 = i12;
                if (jArr4.length == 1 && ber0Var.f75226b == 1 && (length2 = jArr5.length) >= 2) {
                    long[] jArr13 = ber0Var.f75233i;
                    jArr13.getClass();
                    j12 = jArr13[i];
                    jM126051H3 = ggw0.m126051H(jArr4[i], ber0Var.f75227c, ber0Var.f75228d, roundingMode) + j12;
                    int i51 = length2 - 1;
                    int i52 = i;
                    int iMax2 = Math.max(i52, Math.min(4, i51));
                    int iMax3 = Math.max(i52, Math.min(length2 - 4, i51));
                    j13 = jArr5[i52];
                    if (j13 <= j12 && j12 < jArr5[iMax2] && jArr5[iMax3] < jM126051H3 && jM126051H3 <= j6) {
                        jM126051H4 = ggw0.m126051H(j12 - j13, ber0Var.f75230f.f133906z, ber0Var.f75227c, roundingMode);
                        jM126051H5 = ggw0.m126051H(j6 - jM126051H3, ber0Var.f75230f.f133906z, ber0Var.f75227c, roundingMode);
                        if (jM126051H4 != j) {
                            if (jM126051H4 <= 2147483647L && jM126051H5 <= 2147483647L) {
                                l6r0Var.f126657a = (int) jM126051H4;
                                l6r0Var.f126658b = (int) jM126051H5;
                                ggw0.m126063e(jArr5, 1000000L, ber0Var.f75227c);
                                return new eer0(ber0Var, jArr3, iArr4, i17, jArr5, iArr3, ggw0.m126051H(ber0Var.f75232h[0], 1000000L, ber0Var.f75228d, roundingMode));
                            }
                        } else if (jM126051H5 != j) {
                            jM126051H4 = j;
                            if (jM126051H4 <= 2147483647L) {
                                l6r0Var.f126657a = (int) jM126051H4;
                                l6r0Var.f126658b = (int) jM126051H5;
                                ggw0.m126063e(jArr5, 1000000L, ber0Var.f75227c);
                                return new eer0(ber0Var, jArr3, iArr4, i17, jArr5, iArr3, ggw0.m126051H(ber0Var.f75232h[0], 1000000L, ber0Var.f75228d, roundingMode));
                            }
                        }
                        jArr3 = jArr3;
                        iArr4 = iArr4;
                    }
                }
                jArr6 = ber0Var.f75232h;
                length = jArr6.length;
                if (length == 1) {
                    if (jArr6[0] == j) {
                        long[] jArr14 = ber0Var.f75233i;
                        jArr14.getClass();
                        j11 = jArr14[0];
                        for (i31 = 0; i31 < jArr5.length; i31++) {
                            jArr5[i31] = ggw0.m126051H(jArr5[i31] - j11, 1000000L, ber0Var.f75227c, RoundingMode.FLOOR);
                        }
                        return new eer0(ber0Var, jArr3, iArr4, i17, jArr5, iArr3, ggw0.m126051H(j6 - j11, 1000000L, ber0Var.f75227c, RoundingMode.FLOOR));
                    }
                    length = 1;
                }
                if (ber0Var.f75226b == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jArr7 = ber0Var.f75233i;
                iArr5 = new int[length];
                iArr6 = new int[length];
                jArr7.getClass();
                i18 = 0;
                z3 = false;
                i19 = 0;
                i20 = 0;
                while (true) {
                    jArr8 = ber0Var.f75232h;
                    i21 = i17;
                    if (i20 < jArr8.length) {
                        break;
                    }
                    iArr10 = iArr6;
                    long[] jArr15 = jArr7;
                    j10 = jArr15[i20];
                    if (j10 != -1) {
                        i27 = i20;
                        long jM126051H6 = ggw0.m126051H(jArr8[i20], ber0Var.f75227c, ber0Var.f75228d, RoundingMode.FLOOR);
                        i28 = 1;
                        iArr5[i27] = ggw0.m126076r(jArr5, j10, true, true);
                        iArr10[i27] = ggw0.m126074p(jArr5, j10 + jM126051H6, z2, false);
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
                while (i22 < ber0Var.f75232h.length) {
                    j8 = ber0Var.f75233i[i22];
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
                        long j17 = ber0Var.f75228d;
                        RoundingMode roundingMode2 = RoundingMode.FLOOR;
                        long jM126051H7 = ggw0.m126051H(j7, 1000000L, j17, roundingMode2);
                        jM126051H2 = ggw0.m126051H(jArr5[i25] - j8, 1000000L, ber0Var.f75227c, roundingMode2);
                        long[] jArr17 = jArr9;
                        if (ber0Var.f75226b != 1) {
                            j9 = j;
                            jM126051H2 = Math.max(j9, jM126051H2);
                        } else {
                            j9 = j;
                        }
                        jArr10[i24] = jM126051H7 + jM126051H2;
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
                    j7 += ber0Var.f75232h[i22];
                    i22++;
                    jArr3 = jArr3;
                    jArr9 = jArr9;
                    jArr5 = jArr5;
                    z5 = z6;
                }
                return new eer0(ber0Var, jArr9, iArr8, i53, jArr10, iArr9, ggw0.m126051H(j7, 1000000L, ber0Var.f75228d, RoundingMode.FLOOR));
            }
            j = 0;
            jArr = new long[iZzb];
            iArrCopyOf = new int[iZzb];
            jArr2 = new long[iZzb];
            iArr = new int[iZzb];
            i2 = i32;
            v6w0Var = v6w0Var3;
            i3 = iM197241E5;
            iM197273v = i;
            i4 = iM197273v;
            i5 = i4;
            i6 = i5;
            iM197241E4 = i6;
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
                zM193103a = true;
                while (true) {
                    if (i6 != 0) {
                        i13 = i6;
                        break;
                    }
                    zM193103a = ucr0Var.m193103a();
                    if (!zM193103a) {
                        i13 = i;
                        break;
                    }
                    j5 = ucr0Var.f175855d;
                    i6 = ucr0Var.f175854c;
                    iZzb = iZzb;
                }
                i14 = iZzb;
                if (!zM193103a) {
                    svv0.m186111f("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i5);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i5);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i5);
                    iZzb = i5;
                    break;
                }
                if (v6w0Var != null) {
                    while (iM197241E4 == 0) {
                        if (iM197241E <= 0) {
                            iM197241E4 = i;
                            break;
                        }
                        iM197241E--;
                        iM197241E4 = v6w0Var.m197241E();
                        iM197273v = v6w0Var.m197273v();
                    }
                    iM197241E4--;
                }
                jArr[i5] = j5;
                iZzc = wcr0Var.zzc();
                iArrCopyOf[i5] = iZzc;
                if (iZzc > i4) {
                    i4 = iZzc;
                }
                int i55 = i13;
                jArr2[i5] = j3 + ((long) iM197273v);
                if (v6w0Var2 == null) {
                    i15 = 1;
                } else {
                    i15 = i;
                }
                iArr[i5] = i15;
                if (i5 == iM197241E3) {
                    iArr[i5] = 1;
                    i2--;
                    if (i2 > 0) {
                        v6w0Var2.getClass();
                        iM197241E3 = v6w0Var2.m197241E() - 1;
                    }
                }
                j3 += (long) iM197241E7;
                iM197241E6--;
                if (iM197241E6 == 0) {
                    if (i3 > 0) {
                        i3--;
                        iM197241E6 = v6w0Var4.m197241E();
                        iM197241E7 = v6w0Var4.m197273v();
                    } else {
                        iM197241E6 = i;
                    }
                }
                long j18 = j5 + ((long) iArrCopyOf[i5]);
                i6 = i55 - 1;
                i5++;
                iZzb = i14;
                j2 = j18;
            }
            long j19 = j3 + ((long) iM197273v);
            if (v6w0Var == null) {
                i7 = 1;
                break;
            }
            while (true) {
                if (iM197241E <= 0) {
                    i7 = 1;
                    break;
                }
                if (v6w0Var.m197241E() != 0) {
                    i7 = i;
                    break;
                }
                v6w0Var.m197273v();
                iM197241E--;
            }
            if (i2 == 0) {
                if (iM197241E6 == 0) {
                    if (i6 != 0) {
                        i10 = i;
                        iM197241E6 = i10;
                    } else if (i3 != 0) {
                        i7 = i7;
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        iM197241E6 = i8;
                        i9 = i3;
                    } else if (iM197241E4 != 0) {
                        i7 = i7;
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        i9 = i8;
                        iM197241E6 = i9;
                    } else if (i7 == 0) {
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        i9 = i8;
                        i11 = i9;
                        i7 = i11;
                        iM197241E6 = i7;
                        int i56 = ber0Var.f75225a;
                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                        sb.append(i56);
                        sb.append(": remainingSynchronizationSamples ");
                        sb.append(i10);
                        sb.append(", remainingSamplesAtTimestampDelta ");
                        sb.append(iM197241E6);
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
                        svv0.m186111f("AtomParsers", sb.toString());
                    } else {
                        iZzb = iZzb;
                    }
                    iZzb = iZzb;
                    iArr2 = iArrCopyOf;
                    i12 = i4;
                    j4 = j19;
                    jArr3 = jArrCopyOf;
                    long j110 = ber0Var.f75227c;
                    roundingMode = RoundingMode.FLOOR;
                    jM126051H = ggw0.m126051H(j4, 1000000L, j110, roundingMode);
                    jArr4 = ber0Var.f75232h;
                    if (jArr4 == null) {
                        ggw0.m126063e(jArrCopyOf2, 1000000L, ber0Var.f75227c);
                        return new eer0(ber0Var, jArr3, iArr2, i12, jArrCopyOf2, iArrCopyOf2, jM126051H);
                    }
                    i16 = iZzb;
                    j6 = j4;
                    iArr3 = iArrCopyOf2;
                    iArr4 = iArr2;
                    jArr5 = jArrCopyOf2;
                    i17 = i12;
                    if (jArr4.length == 1) {
                        long[] jArr18 = ber0Var.f75233i;
                        jArr18.getClass();
                        j12 = jArr18[i];
                        jM126051H3 = ggw0.m126051H(jArr4[i], ber0Var.f75227c, ber0Var.f75228d, roundingMode) + j12;
                        int i57 = length2 - 1;
                        int i58 = i;
                        int iMax4 = Math.max(i58, Math.min(4, i57));
                        int iMax5 = Math.max(i58, Math.min(length2 - 4, i57));
                        j13 = jArr5[i58];
                        if (j13 <= j12) {
                            jM126051H4 = ggw0.m126051H(j12 - j13, ber0Var.f75230f.f133906z, ber0Var.f75227c, roundingMode);
                            jM126051H5 = ggw0.m126051H(j6 - jM126051H3, ber0Var.f75230f.f133906z, ber0Var.f75227c, roundingMode);
                            if (jM126051H4 != j) {
                                if (jM126051H4 <= 2147483647L) {
                                    l6r0Var.f126657a = (int) jM126051H4;
                                    l6r0Var.f126658b = (int) jM126051H5;
                                    ggw0.m126063e(jArr5, 1000000L, ber0Var.f75227c);
                                    return new eer0(ber0Var, jArr3, iArr4, i17, jArr5, iArr3, ggw0.m126051H(ber0Var.f75232h[0], 1000000L, ber0Var.f75228d, roundingMode));
                                }
                            } else if (jM126051H5 != j) {
                                jM126051H4 = j;
                                if (jM126051H4 <= 2147483647L) {
                                    l6r0Var.f126657a = (int) jM126051H4;
                                    l6r0Var.f126658b = (int) jM126051H5;
                                    ggw0.m126063e(jArr5, 1000000L, ber0Var.f75227c);
                                    return new eer0(ber0Var, jArr3, iArr4, i17, jArr5, iArr3, ggw0.m126051H(ber0Var.f75232h[0], 1000000L, ber0Var.f75228d, roundingMode));
                                }
                            }
                            jArr3 = jArr3;
                            iArr4 = iArr4;
                        }
                    }
                    jArr6 = ber0Var.f75232h;
                    length = jArr6.length;
                    if (length == 1) {
                        if (jArr6[0] == j) {
                            long[] jArr19 = ber0Var.f75233i;
                            jArr19.getClass();
                            j11 = jArr19[0];
                            while (i31 < jArr5.length) {
                                jArr5[i31] = ggw0.m126051H(jArr5[i31] - j11, 1000000L, ber0Var.f75227c, RoundingMode.FLOOR);
                            }
                            return new eer0(ber0Var, jArr3, iArr4, i17, jArr5, iArr3, ggw0.m126051H(j6 - j11, 1000000L, ber0Var.f75227c, RoundingMode.FLOOR));
                        }
                        length = 1;
                    }
                    if (ber0Var.f75226b == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jArr7 = ber0Var.f75233i;
                    iArr5 = new int[length];
                    iArr6 = new int[length];
                    jArr7.getClass();
                    i18 = 0;
                    z3 = false;
                    i19 = 0;
                    i20 = 0;
                    while (true) {
                        jArr8 = ber0Var.f75232h;
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
                            long jM126051H8 = ggw0.m126051H(jArr8[i20], ber0Var.f75227c, ber0Var.f75228d, RoundingMode.FLOOR);
                            i28 = 1;
                            iArr5[i27] = ggw0.m126076r(jArr5, j10, true, true);
                            iArr10[i27] = ggw0.m126074p(jArr5, j10 + jM126051H8, z2, false);
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
                    while (i22 < ber0Var.f75232h.length) {
                        j8 = ber0Var.f75233i[i22];
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
                            long j111 = ber0Var.f75228d;
                            RoundingMode roundingMode3 = RoundingMode.FLOOR;
                            long jM126051H9 = ggw0.m126051H(j7, 1000000L, j111, roundingMode3);
                            jM126051H2 = ggw0.m126051H(jArr5[i25] - j8, 1000000L, ber0Var.f75227c, roundingMode3);
                            long[] jArr112 = jArr9;
                            if (ber0Var.f75226b != 1) {
                                j9 = j;
                                jM126051H2 = Math.max(j9, jM126051H2);
                            } else {
                                j9 = j;
                            }
                            jArr10[i24] = jM126051H9 + jM126051H2;
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
                        j7 += ber0Var.f75232h[i22];
                        i22++;
                        jArr3 = jArr3;
                        jArr9 = jArr9;
                        jArr5 = jArr5;
                        z5 = z6;
                    }
                    return new eer0(ber0Var, jArr9, iArr8, i59, jArr10, iArr9, ggw0.m126051H(j7, 1000000L, ber0Var.f75228d, RoundingMode.FLOOR));
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
            i11 = iM197241E4;
            int i511 = ber0Var.f75225a;
            StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
            sb2.append(i511);
            sb2.append(": remainingSynchronizationSamples ");
            sb2.append(i10);
            sb2.append(", remainingSamplesAtTimestampDelta ");
            sb2.append(iM197241E6);
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
            svv0.m186111f("AtomParsers", sb2.toString());
            iZzb = iZzb;
            iArr2 = iArrCopyOf;
            i12 = i4;
            j4 = j19;
            jArr3 = jArrCopyOf;
            long j112 = ber0Var.f75227c;
            roundingMode = RoundingMode.FLOOR;
            jM126051H = ggw0.m126051H(j4, 1000000L, j112, roundingMode);
            jArr4 = ber0Var.f75232h;
            if (jArr4 == null) {
                ggw0.m126063e(jArrCopyOf2, 1000000L, ber0Var.f75227c);
                return new eer0(ber0Var, jArr3, iArr2, i12, jArrCopyOf2, iArrCopyOf2, jM126051H);
            }
            i16 = iZzb;
            j6 = j4;
            iArr3 = iArrCopyOf2;
            iArr4 = iArr2;
            jArr5 = jArrCopyOf2;
            i17 = i12;
            if (jArr4.length == 1) {
                long[] jArr113 = ber0Var.f75233i;
                jArr113.getClass();
                j12 = jArr113[i];
                jM126051H3 = ggw0.m126051H(jArr4[i], ber0Var.f75227c, ber0Var.f75228d, roundingMode) + j12;
                int i512 = length2 - 1;
                int i513 = i;
                int iMax6 = Math.max(i513, Math.min(4, i512));
                int iMax7 = Math.max(i513, Math.min(length2 - 4, i512));
                j13 = jArr5[i513];
                if (j13 <= j12) {
                    jM126051H4 = ggw0.m126051H(j12 - j13, ber0Var.f75230f.f133906z, ber0Var.f75227c, roundingMode);
                    jM126051H5 = ggw0.m126051H(j6 - jM126051H3, ber0Var.f75230f.f133906z, ber0Var.f75227c, roundingMode);
                    if (jM126051H4 != j) {
                        if (jM126051H4 <= 2147483647L) {
                            l6r0Var.f126657a = (int) jM126051H4;
                            l6r0Var.f126658b = (int) jM126051H5;
                            ggw0.m126063e(jArr5, 1000000L, ber0Var.f75227c);
                            return new eer0(ber0Var, jArr3, iArr4, i17, jArr5, iArr3, ggw0.m126051H(ber0Var.f75232h[0], 1000000L, ber0Var.f75228d, roundingMode));
                        }
                    } else if (jM126051H5 != j) {
                        jM126051H4 = j;
                        if (jM126051H4 <= 2147483647L) {
                            l6r0Var.f126657a = (int) jM126051H4;
                            l6r0Var.f126658b = (int) jM126051H5;
                            ggw0.m126063e(jArr5, 1000000L, ber0Var.f75227c);
                            return new eer0(ber0Var, jArr3, iArr4, i17, jArr5, iArr3, ggw0.m126051H(ber0Var.f75232h[0], 1000000L, ber0Var.f75228d, roundingMode));
                        }
                    }
                    jArr3 = jArr3;
                    iArr4 = iArr4;
                }
            }
            jArr6 = ber0Var.f75232h;
            length = jArr6.length;
            if (length == 1) {
                if (jArr6[0] == j) {
                    long[] jArr114 = ber0Var.f75233i;
                    jArr114.getClass();
                    j11 = jArr114[0];
                    while (i31 < jArr5.length) {
                        jArr5[i31] = ggw0.m126051H(jArr5[i31] - j11, 1000000L, ber0Var.f75227c, RoundingMode.FLOOR);
                    }
                    return new eer0(ber0Var, jArr3, iArr4, i17, jArr5, iArr3, ggw0.m126051H(j6 - j11, 1000000L, ber0Var.f75227c, RoundingMode.FLOOR));
                }
                length = 1;
            }
            if (ber0Var.f75226b == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            jArr7 = ber0Var.f75233i;
            iArr5 = new int[length];
            iArr6 = new int[length];
            jArr7.getClass();
            i18 = 0;
            z3 = false;
            i19 = 0;
            i20 = 0;
            while (true) {
                jArr8 = ber0Var.f75232h;
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
                    long jM126051H10 = ggw0.m126051H(jArr8[i20], ber0Var.f75227c, ber0Var.f75228d, RoundingMode.FLOOR);
                    i28 = 1;
                    iArr5[i27] = ggw0.m126076r(jArr5, j10, true, true);
                    iArr10[i27] = ggw0.m126074p(jArr5, j10 + jM126051H10, z2, false);
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
            while (i22 < ber0Var.f75232h.length) {
                j8 = ber0Var.f75233i[i22];
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
                    long j113 = ber0Var.f75228d;
                    RoundingMode roundingMode4 = RoundingMode.FLOOR;
                    long jM126051H11 = ggw0.m126051H(j7, 1000000L, j113, roundingMode4);
                    jM126051H2 = ggw0.m126051H(jArr5[i25] - j8, 1000000L, ber0Var.f75227c, roundingMode4);
                    long[] jArr117 = jArr9;
                    if (ber0Var.f75226b != 1) {
                        j9 = j;
                        jM126051H2 = Math.max(j9, jM126051H2);
                    } else {
                        j9 = j;
                    }
                    jArr10[i24] = jM126051H11 + jM126051H2;
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
                j7 += ber0Var.f75232h[i22];
                i22++;
                jArr3 = jArr3;
                jArr9 = jArr9;
                jArr5 = jArr5;
                z5 = z6;
            }
            return new eer0(ber0Var, jArr9, iArr8, i514, jArr10, iArr9, ggw0.m126051H(j7, 1000000L, ber0Var.f75228d, RoundingMode.FLOOR));
        }
        iM197241E2 = 0;
        i = 0;
        iM197241E3 = -1;
        iZza = zcr0Var.zza();
        String str3 = ber0Var.f75230f.f133892l;
        wcr0Var = zcr0Var;
        int i310 = iM197241E2;
        if (iZza == -1) {
            j = 0;
            jArr = new long[iZzb];
            iArrCopyOf = new int[iZzb];
            jArr2 = new long[iZzb];
            iArr = new int[iZzb];
            i2 = i310;
            v6w0Var = v6w0Var3;
            i3 = iM197241E5;
            iM197273v = i;
            i4 = iM197273v;
            i5 = i4;
            i6 = i5;
            iM197241E4 = i6;
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
                zM193103a = true;
                while (true) {
                    if (i6 != 0) {
                        i13 = i6;
                        break;
                    }
                    zM193103a = ucr0Var.m193103a();
                    if (!zM193103a) {
                        i13 = i;
                        break;
                    }
                    j5 = ucr0Var.f175855d;
                    i6 = ucr0Var.f175854c;
                    iZzb = iZzb;
                }
                i14 = iZzb;
                if (!zM193103a) {
                    svv0.m186111f("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i5);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i5);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i5);
                    iZzb = i5;
                    break;
                }
                if (v6w0Var != null) {
                    while (iM197241E4 == 0) {
                        if (iM197241E <= 0) {
                            iM197241E4 = i;
                            break;
                        }
                        iM197241E--;
                        iM197241E4 = v6w0Var.m197241E();
                        iM197273v = v6w0Var.m197273v();
                    }
                    iM197241E4--;
                }
                jArr[i5] = j5;
                iZzc = wcr0Var.zzc();
                iArrCopyOf[i5] = iZzc;
                if (iZzc > i4) {
                    i4 = iZzc;
                }
                int i516 = i13;
                jArr2[i5] = j3 + ((long) iM197273v);
                if (v6w0Var2 == null) {
                    i15 = 1;
                } else {
                    i15 = i;
                }
                iArr[i5] = i15;
                if (i5 == iM197241E3) {
                    iArr[i5] = 1;
                    i2--;
                    if (i2 > 0) {
                        v6w0Var2.getClass();
                        iM197241E3 = v6w0Var2.m197241E() - 1;
                    }
                }
                j3 += (long) iM197241E7;
                iM197241E6--;
                if (iM197241E6 == 0) {
                    if (i3 > 0) {
                        i3--;
                        iM197241E6 = v6w0Var4.m197241E();
                        iM197241E7 = v6w0Var4.m197273v();
                    } else {
                        iM197241E6 = i;
                    }
                }
                long j114 = j5 + ((long) iArrCopyOf[i5]);
                i6 = i516 - 1;
                i5++;
                iZzb = i14;
                j2 = j114;
            }
            long j115 = j3 + ((long) iM197273v);
            if (v6w0Var == null) {
                i7 = 1;
                break;
            }
            while (true) {
                if (iM197241E <= 0) {
                    i7 = 1;
                    break;
                }
                if (v6w0Var.m197241E() != 0) {
                    i7 = i;
                    break;
                }
                v6w0Var.m197273v();
                iM197241E--;
            }
            if (i2 == 0) {
                if (iM197241E6 == 0) {
                    if (i6 != 0) {
                        i10 = i;
                        iM197241E6 = i10;
                    } else if (i3 != 0) {
                        i7 = i7;
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        iM197241E6 = i8;
                        i9 = i3;
                    } else if (iM197241E4 != 0) {
                        i7 = i7;
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        i9 = i8;
                        iM197241E6 = i9;
                    } else if (i7 == 0) {
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        i9 = i8;
                        i11 = i9;
                        i7 = i11;
                        iM197241E6 = i7;
                        int i517 = ber0Var.f75225a;
                        StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                        sb3.append(i517);
                        sb3.append(": remainingSynchronizationSamples ");
                        sb3.append(i10);
                        sb3.append(", remainingSamplesAtTimestampDelta ");
                        sb3.append(iM197241E6);
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
                        svv0.m186111f("AtomParsers", sb3.toString());
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
            i11 = iM197241E4;
            int i518 = ber0Var.f75225a;
            StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
            sb4.append(i518);
            sb4.append(": remainingSynchronizationSamples ");
            sb4.append(i10);
            sb4.append(", remainingSamplesAtTimestampDelta ");
            sb4.append(iM197241E6);
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
            svv0.m186111f("AtomParsers", sb4.toString());
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
            v6w0Var = v6w0Var3;
            i3 = iM197241E5;
            iM197273v = i;
            i4 = iM197273v;
            i5 = i4;
            i6 = i5;
            iM197241E4 = i6;
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
                zM193103a = true;
                while (true) {
                    if (i6 != 0) {
                        i13 = i6;
                        break;
                    }
                    zM193103a = ucr0Var.m193103a();
                    if (!zM193103a) {
                        i13 = i;
                        break;
                    }
                    j5 = ucr0Var.f175855d;
                    i6 = ucr0Var.f175854c;
                    iZzb = iZzb;
                }
                i14 = iZzb;
                if (!zM193103a) {
                    svv0.m186111f("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i5);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i5);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i5);
                    iZzb = i5;
                    break;
                }
                if (v6w0Var != null) {
                    while (iM197241E4 == 0) {
                        if (iM197241E <= 0) {
                            iM197241E4 = i;
                            break;
                        }
                        iM197241E--;
                        iM197241E4 = v6w0Var.m197241E();
                        iM197273v = v6w0Var.m197273v();
                    }
                    iM197241E4--;
                }
                jArr[i5] = j5;
                iZzc = wcr0Var.zzc();
                iArrCopyOf[i5] = iZzc;
                if (iZzc > i4) {
                    i4 = iZzc;
                }
                int i519 = i13;
                jArr2[i5] = j3 + ((long) iM197273v);
                if (v6w0Var2 == null) {
                    i15 = 1;
                } else {
                    i15 = i;
                }
                iArr[i5] = i15;
                if (i5 == iM197241E3) {
                    iArr[i5] = 1;
                    i2--;
                    if (i2 > 0) {
                        v6w0Var2.getClass();
                        iM197241E3 = v6w0Var2.m197241E() - 1;
                    }
                }
                j3 += (long) iM197241E7;
                iM197241E6--;
                if (iM197241E6 == 0) {
                    if (i3 > 0) {
                        i3--;
                        iM197241E6 = v6w0Var4.m197241E();
                        iM197241E7 = v6w0Var4.m197273v();
                    } else {
                        iM197241E6 = i;
                    }
                }
                long j116 = j5 + ((long) iArrCopyOf[i5]);
                i6 = i519 - 1;
                i5++;
                iZzb = i14;
                j2 = j116;
            }
            long j117 = j3 + ((long) iM197273v);
            if (v6w0Var == null) {
                i7 = 1;
                break;
            }
            while (true) {
                if (iM197241E <= 0) {
                    i7 = 1;
                    break;
                }
                if (v6w0Var.m197241E() != 0) {
                    i7 = i;
                    break;
                }
                v6w0Var.m197273v();
                iM197241E--;
            }
            if (i2 == 0) {
                if (iM197241E6 == 0) {
                    if (i6 != 0) {
                        i10 = i;
                        iM197241E6 = i10;
                    } else if (i3 != 0) {
                        i7 = i7;
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        iM197241E6 = i8;
                        i9 = i3;
                    } else if (iM197241E4 != 0) {
                        i7 = i7;
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        i9 = i8;
                        iM197241E6 = i9;
                    } else if (i7 == 0) {
                        iZzb = iZzb;
                        i10 = i;
                        i8 = i10;
                        i9 = i8;
                        i11 = i9;
                        i7 = i11;
                        iM197241E6 = i7;
                        int i5110 = ber0Var.f75225a;
                        StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                        sb5.append(i5110);
                        sb5.append(": remainingSynchronizationSamples ");
                        sb5.append(i10);
                        sb5.append(", remainingSamplesAtTimestampDelta ");
                        sb5.append(iM197241E6);
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
                        svv0.m186111f("AtomParsers", sb5.toString());
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
            i11 = iM197241E4;
            int i5111 = ber0Var.f75225a;
            StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
            sb6.append(i5111);
            sb6.append(": remainingSynchronizationSamples ");
            sb6.append(i10);
            sb6.append(", remainingSamplesAtTimestampDelta ");
            sb6.append(iM197241E6);
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
            svv0.m186111f("AtomParsers", sb6.toString());
            iZzb = iZzb;
            iArr2 = iArrCopyOf;
            i12 = i4;
            j4 = j117;
        }
        jArr3 = jArrCopyOf;
        long j118 = ber0Var.f75227c;
        roundingMode = RoundingMode.FLOOR;
        jM126051H = ggw0.m126051H(j4, 1000000L, j118, roundingMode);
        jArr4 = ber0Var.f75232h;
        if (jArr4 == null) {
            ggw0.m126063e(jArrCopyOf2, 1000000L, ber0Var.f75227c);
            return new eer0(ber0Var, jArr3, iArr2, i12, jArrCopyOf2, iArrCopyOf2, jM126051H);
        }
        i16 = iZzb;
        j6 = j4;
        iArr3 = iArrCopyOf2;
        iArr4 = iArr2;
        jArr5 = jArrCopyOf2;
        i17 = i12;
        if (jArr4.length == 1) {
            long[] jArr118 = ber0Var.f75233i;
            jArr118.getClass();
            j12 = jArr118[i];
            jM126051H3 = ggw0.m126051H(jArr4[i], ber0Var.f75227c, ber0Var.f75228d, roundingMode) + j12;
            int i5112 = length2 - 1;
            int i5113 = i;
            int iMax8 = Math.max(i5113, Math.min(4, i5112));
            int iMax9 = Math.max(i5113, Math.min(length2 - 4, i5112));
            j13 = jArr5[i5113];
            if (j13 <= j12) {
                jM126051H4 = ggw0.m126051H(j12 - j13, ber0Var.f75230f.f133906z, ber0Var.f75227c, roundingMode);
                jM126051H5 = ggw0.m126051H(j6 - jM126051H3, ber0Var.f75230f.f133906z, ber0Var.f75227c, roundingMode);
                if (jM126051H4 != j) {
                    if (jM126051H4 <= 2147483647L) {
                        l6r0Var.f126657a = (int) jM126051H4;
                        l6r0Var.f126658b = (int) jM126051H5;
                        ggw0.m126063e(jArr5, 1000000L, ber0Var.f75227c);
                        return new eer0(ber0Var, jArr3, iArr4, i17, jArr5, iArr3, ggw0.m126051H(ber0Var.f75232h[0], 1000000L, ber0Var.f75228d, roundingMode));
                    }
                } else if (jM126051H5 != j) {
                    jM126051H4 = j;
                    if (jM126051H4 <= 2147483647L) {
                        l6r0Var.f126657a = (int) jM126051H4;
                        l6r0Var.f126658b = (int) jM126051H5;
                        ggw0.m126063e(jArr5, 1000000L, ber0Var.f75227c);
                        return new eer0(ber0Var, jArr3, iArr4, i17, jArr5, iArr3, ggw0.m126051H(ber0Var.f75232h[0], 1000000L, ber0Var.f75228d, roundingMode));
                    }
                }
                jArr3 = jArr3;
                iArr4 = iArr4;
            }
        }
        jArr6 = ber0Var.f75232h;
        length = jArr6.length;
        if (length == 1) {
            if (jArr6[0] == j) {
                long[] jArr119 = ber0Var.f75233i;
                jArr119.getClass();
                j11 = jArr119[0];
                while (i31 < jArr5.length) {
                    jArr5[i31] = ggw0.m126051H(jArr5[i31] - j11, 1000000L, ber0Var.f75227c, RoundingMode.FLOOR);
                }
                return new eer0(ber0Var, jArr3, iArr4, i17, jArr5, iArr3, ggw0.m126051H(j6 - j11, 1000000L, ber0Var.f75227c, RoundingMode.FLOOR));
            }
            length = 1;
        }
        if (ber0Var.f75226b == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        jArr7 = ber0Var.f75233i;
        iArr5 = new int[length];
        iArr6 = new int[length];
        jArr7.getClass();
        i18 = 0;
        z3 = false;
        i19 = 0;
        i20 = 0;
        while (true) {
            jArr8 = ber0Var.f75232h;
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
                long jM126051H12 = ggw0.m126051H(jArr8[i20], ber0Var.f75227c, ber0Var.f75228d, RoundingMode.FLOOR);
                i28 = 1;
                iArr5[i27] = ggw0.m126076r(jArr5, j10, true, true);
                iArr10[i27] = ggw0.m126074p(jArr5, j10 + jM126051H12, z2, false);
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
        while (i22 < ber0Var.f75232h.length) {
            j8 = ber0Var.f75233i[i22];
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
                long j119 = ber0Var.f75228d;
                RoundingMode roundingMode5 = RoundingMode.FLOOR;
                long jM126051H13 = ggw0.m126051H(j7, 1000000L, j119, roundingMode5);
                jM126051H2 = ggw0.m126051H(jArr5[i25] - j8, 1000000L, ber0Var.f75227c, roundingMode5);
                long[] jArr1112 = jArr9;
                if (ber0Var.f75226b != 1) {
                    j9 = j;
                    jM126051H2 = Math.max(j9, jM126051H2);
                } else {
                    j9 = j;
                }
                jArr10[i24] = jM126051H13 + jM126051H2;
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
            j7 += ber0Var.f75232h[i22];
            i22++;
            jArr3 = jArr3;
            jArr9 = jArr9;
            jArr5 = jArr5;
            z5 = z6;
        }
        return new eer0(ber0Var, jArr9, iArr8, i5114, jArr10, iArr9, ggw0.m126051H(j7, 1000000L, ber0Var.f75228d, RoundingMode.FLOOR));
    }

    /* JADX INFO: renamed from: l */
    public static ByteBuffer m101221l() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:79:0x0144  */
    /* JADX INFO: renamed from: m */
    public static void m101222m(v6w0 v6w0Var, int i, int i2, int i3, int i4, String str, boolean z, @Nullable zzae zzaeVar, xcr0 xcr0Var, int i5) throws zzcc {
        int iM197242F;
        int i6;
        int iM197239C;
        int iM197273v;
        int iM197241E;
        int i7;
        zzae zzaeVarM13537b;
        String str2;
        int i8;
        v6w0 v6w0Var2 = v6w0Var;
        int i9 = i3;
        v6w0Var2.m197262k(i2 + 16);
        if (z) {
            iM197242F = v6w0Var2.m197242F();
            v6w0Var2.m197263l(6);
        } else {
            v6w0Var2.m197263l(8);
            iM197242F = 0;
        }
        if (iM197242F == 0 || iM197242F == 1) {
            i6 = 2;
            int iM197242F2 = v6w0Var2.m197242F();
            v6w0Var2.m197263l(6);
            iM197239C = v6w0Var2.m197239C();
            v6w0Var2.m197262k(v6w0Var2.m197270s() - 4);
            iM197273v = v6w0Var2.m197273v();
            if (iM197242F == 1) {
                v6w0Var2.m197263l(16);
            }
            iM197241E = iM197242F2;
            i7 = -1;
        } else {
            if (iM197242F != 2) {
                return;
            }
            v6w0Var2.m197263l(16);
            i6 = 2;
            iM197239C = (int) Math.round(Double.longBitsToDouble(v6w0Var2.m197245I()));
            iM197241E = v6w0Var2.m197241E();
            v6w0Var2.m197263l(4);
            int iM197241E2 = v6w0Var2.m197241E();
            int iM197241E3 = v6w0Var2.m197241E();
            int i10 = iM197241E3 & 1;
            int i11 = iM197241E3 & 2;
            if (i10 == 0) {
                if (iM197241E2 == 8) {
                    i7 = 3;
                } else if (iM197241E2 == 16) {
                    i7 = i11 != 0 ? 268435456 : 2;
                } else if (iM197241E2 == 24) {
                    i7 = i11 != 0 ? 1342177280 : 21;
                } else if (iM197241E2 == 32) {
                    i7 = i11 != 0 ? 1610612736 : 22;
                } else {
                    i7 = -1;
                }
            } else if (iM197241E2 == 32) {
                i7 = 4;
            } else {
                i7 = -1;
            }
            v6w0Var2.m197263l(8);
            iM197273v = 0;
        }
        int iM197270s = v6w0Var2.m197270s();
        int iIntValue = 1701733217;
        if (i == 1701733217) {
            Pair pairM101217h = m101217h(v6w0Var2, i2, i9);
            if (pairM101217h != null) {
                iIntValue = ((Integer) pairM101217h.first).intValue();
                zzaeVarM13537b = zzaeVar == null ? null : zzaeVar.m13537b(((cer0) pairM101217h.second).f80486b);
                xcr0Var.f192250a[i5] = (cer0) pairM101217h.second;
            } else {
                zzaeVarM13537b = zzaeVar;
            }
            v6w0Var2.m197262k(iM197270s);
        } else {
            zzaeVarM13537b = zzaeVar;
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
            i7 = 268435456;
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
        vcr0 vcr0VarM101219j = null;
        while (iM197270s - i2 < i9) {
            v6w0Var2.m197262k(iM197270s);
            int iM197273v2 = v6w0Var2.m197273v();
            String str4 = str3;
            n5r0.m157996b(iM197273v2 > 0, "childAtomSize must be positive");
            int iM197273v3 = v6w0Var2.m197273v();
            iM197239C = iM197239C;
            if (iM197273v3 == 1835557187) {
                v6w0Var2.m197262k(iM197270s + 8);
                v6w0Var2.m197263l(1);
                int iM197238B = v6w0Var2.m197238B();
                v6w0Var2.m197263l(1);
                String str5 = Objects.equals(str2, "audio/mhm1") ? String.format("mhm1.%02X", Integer.valueOf(iM197238B)) : String.format("mha1.%02X", Integer.valueOf(iM197238B));
                int iM197242F3 = v6w0Var2.m197242F();
                byte[] bArr = new byte[iM197242F3];
                str4 = str5;
                v6w0Var2.m197258g(bArr, 0, iM197242F3);
                if (listZzm == null) {
                    listZzm = zzgaa.zzm(bArr);
                    str4 = str4;
                    iM197239C = iM197239C;
                    iM197270s = iM197270s;
                    iM197273v2 = iM197273v2;
                } else {
                    listZzm = zzgaa.zzn(bArr, (byte[]) listZzm.get(0));
                    str4 = str4;
                    iM197239C = iM197239C;
                    iM197270s = iM197270s;
                    iM197273v2 = iM197273v2;
                }
            } else if (iM197273v3 == 1835557200) {
                v6w0Var2.m197262k(iM197270s + 8);
                int iM197238B2 = v6w0Var2.m197238B();
                if (iM197238B2 > 0) {
                    byte[] bArr2 = new byte[iM197238B2];
                    v6w0Var2.m197258g(bArr2, 0, iM197238B2);
                    if (listZzm == null) {
                        listZzm = zzgaa.zzm(bArr2);
                        str4 = str4;
                        iM197239C = iM197239C;
                        iM197270s = iM197270s;
                        iM197273v2 = iM197273v2;
                    } else {
                        listZzm = zzgaa.zzn((byte[]) listZzm.get(0), bArr2);
                        str4 = str4;
                        iM197239C = iM197239C;
                        iM197270s = iM197270s;
                        iM197273v2 = iM197273v2;
                    }
                }
                iM197239C = iM197239C;
                str4 = str4;
            } else {
                if (iM197273v3 == 1702061171) {
                    i8 = iM197270s;
                } else if (z && iM197273v3 == 2002876005) {
                    int iM197270s2 = v6w0Var2.m197270s();
                    n5r0.m157996b(iM197270s2 >= iM197270s, null);
                    int i13 = iM197270s2;
                    while (true) {
                        if (i13 - iM197270s >= iM197273v2) {
                            i8 = -1;
                            break;
                        }
                        v6w0Var2.m197262k(i13);
                        int iM197273v4 = v6w0Var2.m197273v();
                        n5r0.m157996b(iM197273v4 > 0, "childAtomSize must be positive");
                        if (v6w0Var2.m197273v() == 1702061171) {
                            i8 = i13;
                            break;
                        }
                        i13 += iM197273v4;
                    }
                } else {
                    if (iM197273v3 == 1684103987) {
                        v6w0Var2.m197262k(iM197270s + 8);
                        xcr0Var.f192251b = z3r0.m217056c(v6w0Var2, Integer.toString(i4), str, zzaeVarM13537b);
                    } else if (iM197273v3 == 1684366131) {
                        v6w0Var2.m197262k(iM197270s + 8);
                        xcr0Var.f192251b = z3r0.m217057d(v6w0Var2, Integer.toString(i4), str, zzaeVarM13537b);
                    } else if (iM197273v3 == 1684103988) {
                        v6w0Var2.m197262k(iM197270s + 8);
                        String string = Integer.toString(i4);
                        int[] iArr = c4r0.f79291a;
                        v6w0Var2.m197263l(1);
                        int iM197238B3 = v6w0Var2.m197238B() & 32;
                        ter0 ter0Var = new ter0();
                        ter0Var.m188604k(string);
                        ter0Var.m188618w("audio/ac4");
                        ter0Var.m188605k0(i6);
                        ter0Var.m188619x(1 != (iM197238B3 >> 5) ? 44100 : 48000);
                        ter0Var.m188596e(zzaeVarM13537b);
                        ter0Var.m188609n(str);
                        xcr0Var.f192251b = ter0Var.m188591D();
                        iM197239C = iM197239C;
                        i6 = 2;
                        str4 = str4;
                    } else {
                        if (iM197273v3 == 1684892784) {
                            if (iM197273v <= 0) {
                                throw zzcc.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + iM197273v, null);
                            }
                            iM197239C = iM197273v;
                            iM197241E = 2;
                        } else if (iM197273v3 == 1684305011 || iM197273v3 == 1969517683) {
                            i6 = 2;
                            ter0 ter0Var2 = new ter0();
                            ter0Var2.m188602j(i4);
                            ter0Var2.m188618w(str2);
                            ter0Var2.m188605k0(iM197241E);
                            iM197239C = iM197239C;
                            ter0Var2.m188619x(iM197239C);
                            ter0Var2.m188596e(zzaeVarM13537b);
                            ter0Var2.m188609n(str);
                            xcr0Var.f192251b = ter0Var2.m188591D();
                            str4 = str4;
                        } else if (iM197273v3 == 1682927731) {
                            int i14 = iM197273v2 - 8;
                            byte[] bArr3 = f75062a;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i14);
                            v6w0Var2.m197262k(iM197270s + 8);
                            v6w0Var2.m197258g(bArrCopyOf, bArr3.length, i14);
                            listZzm = r6r0.m178090e(bArrCopyOf);
                            iM197239C = iM197239C;
                        } else if (iM197273v3 == 1684425825) {
                            byte[] bArr4 = new byte[iM197273v2 - 8];
                            bArr4[0] = 102;
                            bArr4[1] = 76;
                            i6 = 2;
                            bArr4[2] = 97;
                            bArr4[3] = 67;
                            v6w0Var2.m197262k(iM197270s + 12);
                            v6w0Var2.m197258g(bArr4, 4, iM197273v2 - 12);
                            listZzm = zzgaa.zzm(bArr4);
                            str4 = str4;
                            iM197239C = iM197239C;
                            iM197270s = iM197270s;
                            iM197273v2 = iM197273v2;
                        } else {
                            i6 = 2;
                            if (iM197273v3 == 1634492771) {
                                int i15 = iM197273v2 - 12;
                                byte[] bArr5 = new byte[i15];
                                v6w0Var2.m197262k(iM197270s + 12);
                                v6w0Var2.m197258g(bArr5, 0, i15);
                                byte[] bArr6 = l7v0.f126751a;
                                v6w0 v6w0Var3 = new v6w0(bArr5);
                                v6w0Var3.m197262k(9);
                                int iM197238B4 = v6w0Var3.m197238B();
                                v6w0Var3.m197262k(20);
                                Pair pairCreate = Pair.create(Integer.valueOf(v6w0Var3.m197241E()), Integer.valueOf(iM197238B4));
                                int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                int iIntValue3 = ((Integer) pairCreate.second).intValue();
                                zzgaa zzgaaVarZzm = zzgaa.zzm(bArr5);
                                str4 = str4;
                                iM197241E = iIntValue3;
                                listZzm = zzgaaVarZzm;
                                iM197270s = iM197270s;
                                iM197273v2 = iM197273v2;
                                iM197239C = iIntValue2;
                            }
                        }
                        i6 = 2;
                    }
                    iM197239C = iM197239C;
                    str4 = str4;
                }
                if (i8 != -1) {
                    vcr0VarM101219j = m101219j(v6w0Var2, i8);
                    String str6 = vcr0VarM101219j.f180980a;
                    byte[] bArr7 = vcr0VarM101219j.f180981b;
                    if (bArr7 != null) {
                        if ("audio/vorbis".equals(str6)) {
                            v6w0 v6w0Var4 = new v6w0(bArr7);
                            v6w0Var4.m197263l(1);
                            int i16 = 0;
                            while (v6w0Var4.m197268q() > 0 && v6w0Var4.m197272u() == 255) {
                                v6w0Var4.m197263l(1);
                                i16 += 255;
                            }
                            int iM197238B5 = i16 + v6w0Var4.m197238B();
                            int i17 = 0;
                            while (true) {
                                iM197270s = iM197270s;
                                if (v6w0Var4.m197268q() <= 0 || v6w0Var4.m197272u() != 255) {
                                    break;
                                }
                                v6w0Var4.m197263l(1);
                                i17 += 255;
                                iM197270s = iM197270s;
                            }
                            int iM197238B6 = i17 + v6w0Var4.m197238B();
                            byte[] bArr8 = new byte[iM197238B5];
                            int iM197270s3 = v6w0Var4.m197270s();
                            System.arraycopy(bArr7, iM197270s3, bArr8, 0, iM197238B5);
                            int i18 = iM197270s3 + iM197238B5 + iM197238B6;
                            int length = bArr7.length - i18;
                            byte[] bArr9 = new byte[length];
                            System.arraycopy(bArr7, i18, bArr9, 0, length);
                            listZzm = zzgaa.zzn(bArr8, bArr9);
                        } else {
                            iM197270s = iM197270s;
                            iM197273v2 = iM197273v2;
                            if ("audio/mp4a-latm".equals(str6)) {
                                v3r0 v3r0VarM201388a = w3r0.m201388a(bArr7);
                                iM197239C = v3r0VarM201388a.f179840a;
                                iM197241E = v3r0VarM201388a.f179841b;
                                str4 = v3r0VarM201388a.f179842c;
                            } else {
                                str4 = str4;
                            }
                            listZzm = zzgaa.zzm(bArr7);
                        }
                        str2 = str6;
                    } else {
                        iM197270s = iM197270s;
                    }
                    str4 = str4;
                    str2 = str6;
                } else {
                    str4 = str4;
                }
            }
            iM197270s += iM197273v2;
            i9 = i3;
            str3 = str4;
            v6w0Var2 = v6w0Var;
        }
        String str7 = str3;
        if (xcr0Var.f192251b != null || str2 == null) {
            return;
        }
        ter0 ter0Var3 = new ter0();
        ter0Var3.m188602j(i4);
        ter0Var3.m188618w(str2);
        ter0Var3.m188607l0(str7);
        ter0Var3.m188605k0(iM197241E);
        ter0Var3.m188619x(iM197239C);
        ter0Var3.m188612q(i12);
        ter0Var3.m188606l(listZzm);
        ter0Var3.m188596e(zzaeVarM13537b);
        ter0Var3.m188609n(str);
        if (vcr0VarM101219j != null) {
            ter0Var3.m188603j0(okw0.m164907c(vcr0VarM101219j.f180982c));
            ter0Var3.m188613r(okw0.m164907c(vcr0VarM101219j.f180983d));
        }
        xcr0Var.f192251b = ter0Var3.m188591D();
    }
}
