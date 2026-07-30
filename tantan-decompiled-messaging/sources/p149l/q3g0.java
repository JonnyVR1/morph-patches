package p149l;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class q3g0 extends phf0 {

    /* JADX INFO: renamed from: q */
    public static final Pattern f152434q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: r */
    public static final Pattern f152435r = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: o */
    public final StringBuilder f152436o;

    /* JADX INFO: renamed from: p */
    public final ArrayList<String> f152437p;

    public q3g0() {
        super("SubripDecoder");
        this.f152436o = new StringBuilder();
        this.f152437p = new ArrayList<>();
    }

    /* JADX INFO: renamed from: C */
    private Charset m172806C(d860 d860Var) {
        Charset charsetM110287P = d860Var.m110287P();
        return charsetM110287P != null ? charsetM110287P : fs4.f99036c;
    }

    /* JADX INFO: renamed from: D */
    public static float m172807D(int i) {
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

    /* JADX INFO: renamed from: E */
    public static long m172808E(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) p11.m167011e(matcher.group(i + 2))) * Constants.ONE_MIN_IN_MILLIS) + (Long.parseLong((String) p11.m167011e(matcher.group(i + 3))) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    @Override // p149l.phf0
    /* JADX INFO: renamed from: A */
    public e5g0 mo97681A(byte[] bArr, int i, boolean z) {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        jzv jzvVar = new jzv();
        d860 d860Var = new d860(bArr, i);
        Charset charsetM172806C = m172806C(d860Var);
        while (true) {
            String strM110314t = d860Var.m110314t(charsetM172806C);
            int i2 = 0;
            if (strM110314t == null) {
                break;
            }
            if (strM110314t.length() != 0) {
                try {
                    Integer.parseInt(strM110314t);
                    String strM110314t2 = d860Var.m110314t(charsetM172806C);
                    if (strM110314t2 == null) {
                        jwv.m143689i("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f152434q.matcher(strM110314t2);
                    if (matcher.matches()) {
                        jzvVar.m143948a(m172808E(matcher, 1));
                        jzvVar.m143948a(m172808E(matcher, 6));
                        this.f152436o.setLength(0);
                        this.f152437p.clear();
                        String strM110314t3 = d860Var.m110314t(charsetM172806C);
                        while (true) {
                            boolean zIsEmpty = TextUtils.isEmpty(strM110314t3);
                            sb = this.f152436o;
                            if (zIsEmpty) {
                                break;
                            }
                            if (sb.length() > 0) {
                                this.f152436o.append("<br>");
                            }
                            this.f152436o.append(m172810F(strM110314t3, this.f152437p));
                            strM110314t3 = d860Var.m110314t(charsetM172806C);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        while (true) {
                            if (i2 >= this.f152437p.size()) {
                                str = null;
                                break;
                            }
                            str = this.f152437p.get(i2);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(m172809B(spannedFromHtml, str));
                        arrayList.add(ywb.f200422r);
                    } else {
                        jwv.m143689i("SubripDecoder", "Skipping invalid timing: ".concat(strM110314t2));
                    }
                } catch (NumberFormatException unused) {
                    jwv.m143689i("SubripDecoder", "Skipping invalid index: ".concat(strM110314t));
                }
            }
        }
        return new r3g0((ywb[]) arrayList.toArray(new ywb[0]), jzvVar.m143951d());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    /* JADX INFO: renamed from: B */
    public final ywb m172809B(Spanned spanned, @Nullable String str) {
        ywb.C21557b c21557bM216325o = new ywb.C21557b().m216325o(spanned);
        if (str == null) {
            return c21557bM216325o.m216311a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    c21557bM216325o.m216322l(1);
                } else {
                    c21557bM216325o.m216322l(0);
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                c21557bM216325o.m216322l(1);
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    c21557bM216325o.m216322l(1);
                } else {
                    c21557bM216325o.m216322l(2);
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    c21557bM216325o.m216322l(1);
                } else {
                    c21557bM216325o.m216322l(0);
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                c21557bM216325o.m216322l(1);
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    c21557bM216325o.m216322l(1);
                } else {
                    c21557bM216325o.m216322l(2);
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    c21557bM216325o.m216322l(1);
                } else {
                    c21557bM216325o.m216322l(0);
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                c21557bM216325o.m216322l(1);
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    c21557bM216325o.m216322l(1);
                } else {
                    c21557bM216325o.m216322l(2);
                }
                break;
            default:
                c21557bM216325o.m216322l(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    c21557bM216325o.m216319i(1);
                } else {
                    c21557bM216325o.m216319i(2);
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    c21557bM216325o.m216319i(1);
                } else {
                    c21557bM216325o.m216319i(2);
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    c21557bM216325o.m216319i(1);
                } else {
                    c21557bM216325o.m216319i(2);
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                c21557bM216325o.m216319i(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                c21557bM216325o.m216319i(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                c21557bM216325o.m216319i(1);
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    c21557bM216325o.m216319i(1);
                } else {
                    c21557bM216325o.m216319i(0);
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    c21557bM216325o.m216319i(1);
                } else {
                    c21557bM216325o.m216319i(0);
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    c21557bM216325o.m216319i(1);
                } else {
                    c21557bM216325o.m216319i(0);
                }
                break;
            default:
                c21557bM216325o.m216319i(1);
                break;
        }
        return c21557bM216325o.m216321k(m172807D(c21557bM216325o.m216314d())).m216318h(m172807D(c21557bM216325o.m216313c()), 0).m216311a();
    }

    /* JADX INFO: renamed from: F */
    public final String m172810F(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = f152435r.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }
}
