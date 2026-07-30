package p149l;

import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahj;
import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zdr0 {

    /* JADX INFO: renamed from: d */
    public static final xfw0 f202705d = xfw0.m208616c(vew0.m198261b(':'));

    /* JADX INFO: renamed from: e */
    public static final xfw0 f202706e = xfw0.m208616c(vew0.m198261b('*'));

    /* JADX INFO: renamed from: a */
    public final List f202707a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f202708b = 0;

    /* JADX INFO: renamed from: c */
    public int f202709c;

    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final int m218193a(k5r0 k5r0Var, s6r0 s6r0Var, List list) throws IOException {
        char c;
        int i;
        ArrayList arrayList;
        List listM208619f;
        int i2;
        List listM208619f2;
        int i3 = this.f202708b;
        if (i3 == 0) {
            long jZzd = k5r0Var.zzd();
            s6r0Var.f162847a = (jZzd == -1 || jZzd < 8) ? 0L : jZzd - 8;
            this.f202708b = 1;
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
                long jZzf = k5r0Var.zzf();
                int iZzd = (int) ((k5r0Var.zzd() - k5r0Var.zzf()) - ((long) this.f202709c));
                v6w0 v6w0Var = new v6w0(iZzd);
                k5r0Var.mo140054h(v6w0Var.m197264m(), 0, iZzd);
                for (int i5 = 0; i5 < this.f202707a.size(); i5++) {
                    ydr0 ydr0Var = (ydr0) this.f202707a.get(i5);
                    v6w0Var.m197262k((int) (ydr0Var.f197596a - jZzf));
                    v6w0Var.m197263l(4);
                    int iM197275x = v6w0Var.m197275x();
                    Charset charset = wew0.f185990c;
                    String strM197252a = v6w0Var.m197252a(iM197275x, charset);
                    switch (strM197252a.hashCode()) {
                        case -1711564334:
                            if (!strM197252a.equals("SlowMotion_Data")) {
                                throw zzcc.zza("Invalid SEF name", null);
                            }
                            c = 2192;
                            i = ydr0Var.f197597b - (iM197275x + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listM208619f = f202706e.m208619f(v6w0Var.m197252a(i, charset));
                                for (i2 = 0; i2 < listM208619f.size(); i2++) {
                                    listM208619f2 = f202705d.m208619f((CharSequence) listM208619f.get(i2));
                                    if (listM208619f2.size() != 3) {
                                        throw zzcc.zza(null, null);
                                    }
                                    try {
                                        arrayList.add(new zzahi(Long.parseLong((String) listM208619f2.get(0)), Long.parseLong((String) listM208619f2.get(1)), 1 << (Integer.parseInt((String) listM208619f2.get(2)) - 1)));
                                    } catch (NumberFormatException e) {
                                        throw zzcc.zza(null, e);
                                    }
                                }
                                list.add(new zzahj(arrayList));
                            } else if (c == 2816 && c != 2817 && c != 2819 && c != 2820) {
                                ohg0.m164364a();
                                return 0;
                            }
                            break;
                            break;
                        case -1332107749:
                            if (!strM197252a.equals("Super_SlowMotion_Edit_Data")) {
                                throw zzcc.zza("Invalid SEF name", null);
                            }
                            c = 2819;
                            i = ydr0Var.f197597b - (iM197275x + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listM208619f = f202706e.m208619f(v6w0Var.m197252a(i, charset));
                                while (i2 < listM208619f.size()) {
                                    listM208619f2 = f202705d.m208619f((CharSequence) listM208619f.get(i2));
                                    if (listM208619f2.size() != 3) {
                                        throw zzcc.zza(null, null);
                                    }
                                    arrayList.add(new zzahi(Long.parseLong((String) listM208619f2.get(0)), Long.parseLong((String) listM208619f2.get(1)), 1 << (Integer.parseInt((String) listM208619f2.get(2)) - 1)));
                                }
                                list.add(new zzahj(arrayList));
                            } else if (c == 2816) {
                            }
                            break;
                            break;
                        case -1251387154:
                            if (!strM197252a.equals("Super_SlowMotion_Data")) {
                                throw zzcc.zza("Invalid SEF name", null);
                            }
                            c = 2816;
                            i = ydr0Var.f197597b - (iM197275x + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listM208619f = f202706e.m208619f(v6w0Var.m197252a(i, charset));
                                while (i2 < listM208619f.size()) {
                                    listM208619f2 = f202705d.m208619f((CharSequence) listM208619f.get(i2));
                                    if (listM208619f2.size() != 3) {
                                        throw zzcc.zza(null, null);
                                    }
                                    arrayList.add(new zzahi(Long.parseLong((String) listM208619f2.get(0)), Long.parseLong((String) listM208619f2.get(1)), 1 << (Integer.parseInt((String) listM208619f2.get(2)) - 1)));
                                }
                                list.add(new zzahj(arrayList));
                            } else if (c == 2816) {
                            }
                            break;
                            break;
                        case -830665521:
                            if (!strM197252a.equals("Super_SlowMotion_Deflickering_On")) {
                                throw zzcc.zza("Invalid SEF name", null);
                            }
                            c = 2820;
                            i = ydr0Var.f197597b - (iM197275x + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listM208619f = f202706e.m208619f(v6w0Var.m197252a(i, charset));
                                while (i2 < listM208619f.size()) {
                                    listM208619f2 = f202705d.m208619f((CharSequence) listM208619f.get(i2));
                                    if (listM208619f2.size() != 3) {
                                        throw zzcc.zza(null, null);
                                    }
                                    arrayList.add(new zzahi(Long.parseLong((String) listM208619f2.get(0)), Long.parseLong((String) listM208619f2.get(1)), 1 << (Integer.parseInt((String) listM208619f2.get(2)) - 1)));
                                }
                                list.add(new zzahj(arrayList));
                            } else if (c == 2816) {
                            }
                            break;
                            break;
                        case 1760745220:
                            if (!strM197252a.equals("Super_SlowMotion_BGM")) {
                                throw zzcc.zza("Invalid SEF name", null);
                            }
                            c = 2817;
                            i = ydr0Var.f197597b - (iM197275x + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listM208619f = f202706e.m208619f(v6w0Var.m197252a(i, charset));
                                while (i2 < listM208619f.size()) {
                                    listM208619f2 = f202705d.m208619f((CharSequence) listM208619f.get(i2));
                                    if (listM208619f2.size() != 3) {
                                        throw zzcc.zza(null, null);
                                    }
                                    arrayList.add(new zzahi(Long.parseLong((String) listM208619f2.get(0)), Long.parseLong((String) listM208619f2.get(1)), 1 << (Integer.parseInt((String) listM208619f2.get(2)) - 1)));
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
                s6r0Var.f162847a = 0L;
            } else {
                long jZzd2 = k5r0Var.zzd();
                int i6 = this.f202709c - 20;
                v6w0 v6w0Var2 = new v6w0(i6);
                k5r0Var.mo140054h(v6w0Var2.m197264m(), 0, i6);
                int i7 = 0;
                while (i7 < i6 / 12) {
                    v6w0Var2.m197263l(2);
                    short sM197254c = v6w0Var2.m197254c();
                    if (sM197254c == s || sM197254c == s3 || sM197254c == s5 || sM197254c == s2 || sM197254c == s4) {
                        this.f202707a.add(new ydr0(sM197254c, (jZzd2 - ((long) this.f202709c)) - ((long) v6w0Var2.m197275x()), v6w0Var2.m197275x()));
                    } else {
                        v6w0Var2.m197263l(i4);
                    }
                    i7++;
                    i4 = 8;
                    s = 2192;
                    s2 = 2819;
                    s3 = 2816;
                    s4 = 2820;
                    s5 = 2817;
                }
                if (this.f202707a.isEmpty()) {
                    s6r0Var.f162847a = 0L;
                } else {
                    this.f202708b = 3;
                    s6r0Var.f162847a = ((ydr0) this.f202707a.get(0)).f197596a;
                }
            }
        } else {
            v6w0 v6w0Var3 = new v6w0(8);
            k5r0Var.mo140054h(v6w0Var3.m197264m(), 0, 8);
            this.f202709c = v6w0Var3.m197275x() + 8;
            if (v6w0Var3.m197273v() != 1397048916) {
                s6r0Var.f162847a = 0L;
            } else {
                s6r0Var.f162847a = k5r0Var.zzf() - ((long) (this.f202709c - 12));
                this.f202708b = 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m218194b() {
        this.f202707a.clear();
        this.f202708b = 0;
    }
}
