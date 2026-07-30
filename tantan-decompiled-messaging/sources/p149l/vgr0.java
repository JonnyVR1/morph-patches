package p149l;

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
public final class vgr0 implements rfr0 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f181420d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: e */
    public static final Pattern f181421e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a */
    public final StringBuilder f181422a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public final ArrayList f181423b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final v6w0 f181424c = new v6w0();

    @VisibleForTesting(otherwise = 2)
    /* JADX INFO: renamed from: b */
    public static float m198385b(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        x9g0.m207497a();
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public static long m198386c(Matcher matcher, int i) {
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
    @Override // p149l.rfr0
    /* JADX INFO: renamed from: a */
    public final void mo101921a(byte[] bArr, int i, int i2, qfr0 qfr0Var, bbv0 bbv0Var) {
        String str;
        ovu0 ovu0VarM113598p;
        this.f181424c.m197260i(bArr, i + i2);
        this.f181424c.m197262k(i);
        Charset charsetM197253b = this.f181424c.m197253b();
        if (charsetM197253b == null) {
            charsetM197253b = wew0.f185990c;
        }
        while (true) {
            String strM197250N = this.f181424c.m197250N(charsetM197253b);
            if (strM197250N == null) {
                return;
            }
            if (strM197250N.length() != 0) {
                try {
                    Integer.parseInt(strM197250N);
                    String strM197250N2 = this.f181424c.m197250N(charsetM197253b);
                    if (strM197250N2 == null) {
                        svv0.m186111f("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = f181420d.matcher(strM197250N2);
                    if (matcher.matches()) {
                        long jM198386c = m198386c(matcher, 1);
                        long jM198386c2 = m198386c(matcher, 6);
                        int i3 = 0;
                        this.f181422a.setLength(0);
                        this.f181423b.clear();
                        String strM197250N3 = this.f181424c.m197250N(charsetM197253b);
                        while (true) {
                            boolean zIsEmpty = TextUtils.isEmpty(strM197250N3);
                            StringBuilder sb = this.f181422a;
                            if (zIsEmpty) {
                                Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                                int i4 = 0;
                                while (true) {
                                    if (i4 < this.f181423b.size()) {
                                        str = (String) this.f181423b.get(i4);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i4++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                dtu0 dtu0Var = new dtu0();
                                dtu0Var.m113594l(spannedFromHtml);
                                if (str == null) {
                                    ovu0VarM113598p = dtu0Var.m113598p();
                                } else {
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                dtu0Var.m113591i(1);
                                            } else {
                                                dtu0Var.m113591i(0);
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                dtu0Var.m113591i(1);
                                            } else {
                                                dtu0Var.m113591i(2);
                                            }
                                            break;
                                        case -685620617:
                                            if (!str.equals("{\\an4}")) {
                                                dtu0Var.m113591i(1);
                                            } else {
                                                dtu0Var.m113591i(0);
                                            }
                                            break;
                                        case -685620555:
                                            if (!str.equals("{\\an6}")) {
                                                dtu0Var.m113591i(1);
                                            } else {
                                                dtu0Var.m113591i(2);
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                dtu0Var.m113591i(1);
                                            } else {
                                                dtu0Var.m113591i(0);
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                dtu0Var.m113591i(1);
                                            } else {
                                                dtu0Var.m113591i(2);
                                            }
                                            break;
                                        default:
                                            dtu0Var.m113591i(1);
                                            break;
                                    }
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                dtu0Var.m113588f(1);
                                            } else {
                                                dtu0Var.m113588f(2);
                                            }
                                            break;
                                        case -685620679:
                                            if (!str.equals("{\\an2}")) {
                                                dtu0Var.m113588f(1);
                                            } else {
                                                dtu0Var.m113588f(2);
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                dtu0Var.m113588f(1);
                                            } else {
                                                dtu0Var.m113588f(2);
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                dtu0Var.m113588f(1);
                                            } else {
                                                dtu0Var.m113588f(0);
                                            }
                                            break;
                                        case -685620493:
                                            if (!str.equals("{\\an8}")) {
                                                dtu0Var.m113588f(1);
                                            } else {
                                                dtu0Var.m113588f(0);
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                dtu0Var.m113588f(1);
                                            } else {
                                                dtu0Var.m113588f(0);
                                            }
                                            break;
                                        default:
                                            dtu0Var.m113588f(1);
                                            break;
                                    }
                                    dtu0Var.m113590h(m198385b(dtu0Var.m113584b()));
                                    dtu0Var.m113587e(m198385b(dtu0Var.m113583a()), 0);
                                    ovu0VarM113598p = dtu0Var.m113598p();
                                }
                                bbv0Var.zza(new kfr0(zzgaa.zzm(ovu0VarM113598p), jM198386c, jM198386c2 - jM198386c));
                            } else {
                                if (sb.length() > 0) {
                                    this.f181422a.append("<br>");
                                }
                                StringBuilder sb2 = this.f181422a;
                                ArrayList arrayList = this.f181423b;
                                String strTrim = strM197250N3.trim();
                                StringBuilder sb3 = new StringBuilder(strTrim);
                                Matcher matcher2 = f181421e.matcher(strTrim);
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
                                strM197250N3 = this.f181424c.m197250N(charsetM197253b);
                                i3 = 0;
                            }
                        }
                    } else {
                        svv0.m186111f("SubripParser", "Skipping invalid timing: ".concat(strM197250N2));
                    }
                } catch (NumberFormatException unused) {
                    svv0.m186111f("SubripParser", "Skipping invalid index: ".concat(strM197250N));
                }
            }
        }
    }
}
