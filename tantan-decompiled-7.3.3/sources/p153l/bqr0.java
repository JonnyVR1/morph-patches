package p153l;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzgaa;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class bqr0 implements xor0 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f77924d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: e */
    public static final Pattern f77925e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a */
    public final StringBuilder f77926a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public final ArrayList f77927b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final bgw0 f77928c = new bgw0();

    @VisibleForTesting(otherwise = 2)
    /* JADX INFO: renamed from: b */
    public static float m105971b(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        fig0.m125680a();
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public static long m105972c(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = j + (Long.parseLong(strGroup2) * Constants.ONE_MIN_IN_MILLIS);
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = j2 + (Long.parseLong(strGroup3) * 1000);
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:46:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:63:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0152  */
    /* JADX WARN: Code duplicated, block: B:82:0x017e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.xor0
    /* JADX INFO: renamed from: a */
    public final void mo105973a(byte[] bArr, int i, int i2, wor0 wor0Var, hkv0 hkv0Var) {
        String str;
        u4v0 u4v0VarM143281p;
        this.f77928c.m104267i(bArr, i + i2);
        this.f77928c.m104269k(i);
        Charset charsetM104260b = this.f77928c.m104260b();
        if (charsetM104260b == null) {
            charsetM104260b = cow0.f82931c;
        }
        while (true) {
            String strM104257N = this.f77928c.m104257N(charsetM104260b);
            if (strM104257N == null) {
                return;
            }
            if (strM104257N.length() != 0) {
                try {
                    Integer.parseInt(strM104257N);
                    String strM104257N2 = this.f77928c.m104257N(charsetM104260b);
                    if (strM104257N2 == null) {
                        y4w0.m214278f("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = f77924d.matcher(strM104257N2);
                    if (matcher.matches()) {
                        long jM105972c = m105972c(matcher, 1);
                        long jM105972c2 = m105972c(matcher, 6);
                        int i3 = 0;
                        this.f77926a.setLength(0);
                        this.f77927b.clear();
                        String strM104257N3 = this.f77928c.m104257N(charsetM104260b);
                        while (true) {
                            boolean zIsEmpty = TextUtils.isEmpty(strM104257N3);
                            StringBuilder sb = this.f77926a;
                            if (zIsEmpty) {
                                Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                                int i4 = 0;
                                while (true) {
                                    if (i4 < this.f77927b.size()) {
                                        str = (String) this.f77927b.get(i4);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i4++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                j2v0 j2v0Var = new j2v0();
                                j2v0Var.m143277l(spannedFromHtml);
                                if (str == null) {
                                    u4v0VarM143281p = j2v0Var.m143281p();
                                } else {
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                j2v0Var.m143274i(1);
                                            } else {
                                                j2v0Var.m143274i(0);
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                j2v0Var.m143274i(1);
                                            } else {
                                                j2v0Var.m143274i(2);
                                            }
                                            break;
                                        case -685620617:
                                            if (!str.equals("{\\an4}")) {
                                                j2v0Var.m143274i(1);
                                            } else {
                                                j2v0Var.m143274i(0);
                                            }
                                            break;
                                        case -685620555:
                                            if (!str.equals("{\\an6}")) {
                                                j2v0Var.m143274i(1);
                                            } else {
                                                j2v0Var.m143274i(2);
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                j2v0Var.m143274i(1);
                                            } else {
                                                j2v0Var.m143274i(0);
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                j2v0Var.m143274i(1);
                                            } else {
                                                j2v0Var.m143274i(2);
                                            }
                                            break;
                                        default:
                                            j2v0Var.m143274i(1);
                                            break;
                                    }
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                j2v0Var.m143271f(1);
                                            } else {
                                                j2v0Var.m143271f(2);
                                            }
                                            break;
                                        case -685620679:
                                            if (!str.equals("{\\an2}")) {
                                                j2v0Var.m143271f(1);
                                            } else {
                                                j2v0Var.m143271f(2);
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                j2v0Var.m143271f(1);
                                            } else {
                                                j2v0Var.m143271f(2);
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                j2v0Var.m143271f(1);
                                            } else {
                                                j2v0Var.m143271f(0);
                                            }
                                            break;
                                        case -685620493:
                                            if (!str.equals("{\\an8}")) {
                                                j2v0Var.m143271f(1);
                                            } else {
                                                j2v0Var.m143271f(0);
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                j2v0Var.m143271f(1);
                                            } else {
                                                j2v0Var.m143271f(0);
                                            }
                                            break;
                                        default:
                                            j2v0Var.m143271f(1);
                                            break;
                                    }
                                    j2v0Var.m143273h(m105971b(j2v0Var.m143267b()));
                                    j2v0Var.m143270e(m105971b(j2v0Var.m143266a()), 0);
                                    u4v0VarM143281p = j2v0Var.m143281p();
                                }
                                hkv0Var.zza(new qor0(zzgaa.zzm(u4v0VarM143281p), jM105972c, jM105972c2 - jM105972c));
                            } else {
                                if (sb.length() > 0) {
                                    this.f77926a.append("<br>");
                                }
                                StringBuilder sb2 = this.f77926a;
                                ArrayList arrayList = this.f77927b;
                                String strTrim = strM104257N3.trim();
                                StringBuilder sb3 = new StringBuilder(strTrim);
                                Matcher matcher2 = f77925e.matcher(strTrim);
                                int i5 = i3;
                                while (matcher2.find()) {
                                    String strGroup = matcher2.group();
                                    arrayList.add(strGroup);
                                    int iStart = matcher2.start() - i5;
                                    int length = strGroup.length();
                                    sb3.replace(iStart, iStart + length, "");
                                    i5 += length;
                                }
                                sb2.append(sb3.toString());
                                strM104257N3 = this.f77928c.m104257N(charsetM104260b);
                                i3 = 0;
                            }
                        }
                    } else {
                        y4w0.m214278f("SubripParser", "Skipping invalid timing: ".concat(strM104257N2));
                    }
                } catch (NumberFormatException unused) {
                    y4w0.m214278f("SubripParser", "Skipping invalid index: ".concat(strM104257N));
                }
            }
        }
    }
}
