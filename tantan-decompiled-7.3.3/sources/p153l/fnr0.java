package p153l;

import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahj;
import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fnr0 {

    /* JADX INFO: renamed from: d */
    public static final dpw0 f99951d = dpw0.m117427c(bow0.m105711b(':'));

    /* JADX INFO: renamed from: e */
    public static final dpw0 f99952e = dpw0.m117427c(bow0.m105711b('*'));

    /* JADX INFO: renamed from: a */
    public final List f99953a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f99954b = 0;

    /* JADX INFO: renamed from: c */
    public int f99955c;

    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final int m126376a(qer0 qer0Var, yfr0 yfr0Var, List list) throws IOException {
        char c;
        int i;
        ArrayList arrayList;
        List listM117430f;
        int i2;
        List listM117430f2;
        int i3 = this.f99954b;
        if (i3 == 0) {
            long jZzd = qer0Var.zzd();
            yfr0Var.f199649a = (jZzd == -1 || jZzd < 8) ? 0L : jZzd - 8;
            this.f99954b = 1;
            return 1;
        }
        int i4 = 8;
        if (i3 != 1) {
            short s = 2192;
            short s2 = 2819;
            short s3 = 2816;
            short s4 = 2820;
            short s5 = 2817;
            if (i3 != 2) {
                long jZzf = qer0Var.zzf();
                int iZzd = (int) ((qer0Var.zzd() - qer0Var.zzf()) - ((long) this.f99955c));
                bgw0 bgw0Var = new bgw0(iZzd);
                qer0Var.mo125316h(bgw0Var.m104271m(), 0, iZzd);
                for (int i5 = 0; i5 < this.f99953a.size(); i5++) {
                    enr0 enr0Var = (enr0) this.f99953a.get(i5);
                    bgw0Var.m104269k((int) (enr0Var.f94804a - jZzf));
                    bgw0Var.m104270l(4);
                    int iM104282x = bgw0Var.m104282x();
                    Charset charset = cow0.f82931c;
                    String strM104259a = bgw0Var.m104259a(iM104282x, charset);
                    switch (strM104259a.hashCode()) {
                        case -1711564334:
                            if (!strM104259a.equals("SlowMotion_Data")) {
                                throw zzcc.zza("Invalid SEF name", null);
                            }
                            c = 2192;
                            i = enr0Var.f94805b - (iM104282x + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listM117430f = f99952e.m117430f(bgw0Var.m104259a(i, charset));
                                for (i2 = 0; i2 < listM117430f.size(); i2++) {
                                    listM117430f2 = f99951d.m117430f((CharSequence) listM117430f.get(i2));
                                    if (listM117430f2.size() != 3) {
                                        throw zzcc.zza(null, null);
                                    }
                                    try {
                                        arrayList.add(new zzahi(Long.parseLong((String) listM117430f2.get(0)), Long.parseLong((String) listM117430f2.get(1)), 1 << (Integer.parseInt((String) listM117430f2.get(2)) - 1)));
                                    } catch (NumberFormatException e) {
                                        throw zzcc.zza(null, e);
                                    }
                                }
                                list.add(new zzahj(arrayList));
                            } else if (c == 2816 && c != 2817 && c != 2819 && c != 2820) {
                                wpg0.m207458a();
                                return 0;
                            }
                            break;
                            break;
                        case -1332107749:
                            if (!strM104259a.equals("Super_SlowMotion_Edit_Data")) {
                                throw zzcc.zza("Invalid SEF name", null);
                            }
                            c = 2819;
                            i = enr0Var.f94805b - (iM104282x + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listM117430f = f99952e.m117430f(bgw0Var.m104259a(i, charset));
                                while (i2 < listM117430f.size()) {
                                    listM117430f2 = f99951d.m117430f((CharSequence) listM117430f.get(i2));
                                    if (listM117430f2.size() != 3) {
                                        throw zzcc.zza(null, null);
                                    }
                                    arrayList.add(new zzahi(Long.parseLong((String) listM117430f2.get(0)), Long.parseLong((String) listM117430f2.get(1)), 1 << (Integer.parseInt((String) listM117430f2.get(2)) - 1)));
                                }
                                list.add(new zzahj(arrayList));
                            } else if (c == 2816) {
                            }
                            break;
                            break;
                        case -1251387154:
                            if (!strM104259a.equals("Super_SlowMotion_Data")) {
                                throw zzcc.zza("Invalid SEF name", null);
                            }
                            c = 2816;
                            i = enr0Var.f94805b - (iM104282x + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listM117430f = f99952e.m117430f(bgw0Var.m104259a(i, charset));
                                while (i2 < listM117430f.size()) {
                                    listM117430f2 = f99951d.m117430f((CharSequence) listM117430f.get(i2));
                                    if (listM117430f2.size() != 3) {
                                        throw zzcc.zza(null, null);
                                    }
                                    arrayList.add(new zzahi(Long.parseLong((String) listM117430f2.get(0)), Long.parseLong((String) listM117430f2.get(1)), 1 << (Integer.parseInt((String) listM117430f2.get(2)) - 1)));
                                }
                                list.add(new zzahj(arrayList));
                            } else if (c == 2816) {
                            }
                            break;
                            break;
                        case -830665521:
                            if (!strM104259a.equals("Super_SlowMotion_Deflickering_On")) {
                                throw zzcc.zza("Invalid SEF name", null);
                            }
                            c = 2820;
                            i = enr0Var.f94805b - (iM104282x + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listM117430f = f99952e.m117430f(bgw0Var.m104259a(i, charset));
                                while (i2 < listM117430f.size()) {
                                    listM117430f2 = f99951d.m117430f((CharSequence) listM117430f.get(i2));
                                    if (listM117430f2.size() != 3) {
                                        throw zzcc.zza(null, null);
                                    }
                                    arrayList.add(new zzahi(Long.parseLong((String) listM117430f2.get(0)), Long.parseLong((String) listM117430f2.get(1)), 1 << (Integer.parseInt((String) listM117430f2.get(2)) - 1)));
                                }
                                list.add(new zzahj(arrayList));
                            } else if (c == 2816) {
                            }
                            break;
                            break;
                        case 1760745220:
                            if (!strM104259a.equals("Super_SlowMotion_BGM")) {
                                throw zzcc.zza("Invalid SEF name", null);
                            }
                            c = 2817;
                            i = enr0Var.f94805b - (iM104282x + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listM117430f = f99952e.m117430f(bgw0Var.m104259a(i, charset));
                                while (i2 < listM117430f.size()) {
                                    listM117430f2 = f99951d.m117430f((CharSequence) listM117430f.get(i2));
                                    if (listM117430f2.size() != 3) {
                                        throw zzcc.zza(null, null);
                                    }
                                    arrayList.add(new zzahi(Long.parseLong((String) listM117430f2.get(0)), Long.parseLong((String) listM117430f2.get(1)), 1 << (Integer.parseInt((String) listM117430f2.get(2)) - 1)));
                                }
                                list.add(new zzahj(arrayList));
                            } else if (c == 2816) {
                            }
                            break;
                            break;
                        default:
                            throw zzcc.zza("Invalid SEF name", null);
                    }
                }
                yfr0Var.f199649a = 0L;
            } else {
                long jZzd2 = qer0Var.zzd();
                int i6 = this.f99955c - 20;
                bgw0 bgw0Var2 = new bgw0(i6);
                qer0Var.mo125316h(bgw0Var2.m104271m(), 0, i6);
                int i7 = 0;
                while (i7 < i6 / 12) {
                    bgw0Var2.m104270l(2);
                    short sM104261c = bgw0Var2.m104261c();
                    if (sM104261c == s || sM104261c == s3 || sM104261c == s5 || sM104261c == s2 || sM104261c == s4) {
                        this.f99953a.add(new enr0(sM104261c, (jZzd2 - ((long) this.f99955c)) - ((long) bgw0Var2.m104282x()), bgw0Var2.m104282x()));
                    } else {
                        bgw0Var2.m104270l(i4);
                    }
                    i7++;
                    i4 = 8;
                    s = 2192;
                    s2 = 2819;
                    s3 = 2816;
                    s4 = 2820;
                    s5 = 2817;
                }
                if (this.f99953a.isEmpty()) {
                    yfr0Var.f199649a = 0L;
                } else {
                    this.f99954b = 3;
                    yfr0Var.f199649a = ((enr0) this.f99953a.get(0)).f94804a;
                }
            }
        } else {
            bgw0 bgw0Var3 = new bgw0(8);
            qer0Var.mo125316h(bgw0Var3.m104271m(), 0, 8);
            this.f99955c = bgw0Var3.m104282x() + 8;
            if (bgw0Var3.m104280v() != 1397048916) {
                yfr0Var.f199649a = 0L;
            } else {
                yfr0Var.f199649a = qer0Var.zzf() - ((long) (this.f99955c - 12));
                this.f99954b = 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m126377b() {
        this.f99953a.clear();
        this.f99954b = 0;
    }
}
