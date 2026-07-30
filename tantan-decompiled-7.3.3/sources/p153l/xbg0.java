package p153l;

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
public final class xbg0 extends xpf0 {

    /* JADX INFO: renamed from: q */
    public static final Pattern f193161q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: r */
    public static final Pattern f193162r = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: o */
    public final StringBuilder f193163o;

    /* JADX INFO: renamed from: p */
    public final ArrayList<String> f193164p;

    public xbg0() {
        super("SubripDecoder");
        this.f193163o = new StringBuilder();
        this.f193164p = new ArrayList<>();
    }

    /* JADX INFO: renamed from: C */
    private Charset m209947C(ig60 ig60Var) {
        Charset charsetM139803P = ig60Var.m139803P();
        return charsetM139803P != null ? charsetM139803P : et4.f95689c;
    }

    /* JADX INFO: renamed from: D */
    public static float m209948D(int i) {
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

    /* JADX INFO: renamed from: E */
    public static long m209949E(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) w11.m204369e(matcher.group(i + 2))) * Constants.ONE_MIN_IN_MILLIS) + (Long.parseLong((String) w11.m204369e(matcher.group(i + 3))) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    @Override // p153l.xpf0
    /* JADX INFO: renamed from: A */
    public mdg0 mo122811A(byte[] bArr, int i, boolean z) {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        h1w h1wVar = new h1w();
        ig60 ig60Var = new ig60(bArr, i);
        Charset charsetM209947C = m209947C(ig60Var);
        while (true) {
            String strM139830t = ig60Var.m139830t(charsetM209947C);
            int i2 = 0;
            if (strM139830t == null) {
                break;
            }
            if (strM139830t.length() != 0) {
                try {
                    Integer.parseInt(strM139830t);
                    String strM139830t2 = ig60Var.m139830t(charsetM209947C);
                    if (strM139830t2 == null) {
                        kyv.m152151i("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f193161q.matcher(strM139830t2);
                    if (matcher.matches()) {
                        h1wVar.m133353a(m209949E(matcher, 1));
                        h1wVar.m133353a(m209949E(matcher, 6));
                        this.f193163o.setLength(0);
                        this.f193164p.clear();
                        String strM139830t3 = ig60Var.m139830t(charsetM209947C);
                        while (true) {
                            boolean zIsEmpty = TextUtils.isEmpty(strM139830t3);
                            sb = this.f193163o;
                            if (zIsEmpty) {
                                break;
                            }
                            if (sb.length() > 0) {
                                this.f193163o.append("<br>");
                            }
                            this.f193163o.append(m209951F(strM139830t3, this.f193164p));
                            strM139830t3 = ig60Var.m139830t(charsetM209947C);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        while (true) {
                            if (i2 >= this.f193164p.size()) {
                                str = null;
                                break;
                            }
                            str = this.f193164p.get(i2);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(m209950B(spannedFromHtml, str));
                        arrayList.add(myb.f139358r);
                    } else {
                        kyv.m152151i("SubripDecoder", "Skipping invalid timing: ".concat(strM139830t2));
                    }
                } catch (NumberFormatException unused) {
                    kyv.m152151i("SubripDecoder", "Skipping invalid index: ".concat(strM139830t));
                }
            }
        }
        return new ybg0((myb[]) arrayList.toArray(new myb[0]), h1wVar.m133356d());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    /* JADX INFO: renamed from: B */
    public final myb m209950B(Spanned spanned, @Nullable String str) {
        myb.C18746b c18746bM160768o = new myb.C18746b().m160768o(spanned);
        if (str == null) {
            return c18746bM160768o.m160754a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    c18746bM160768o.m160765l(1);
                } else {
                    c18746bM160768o.m160765l(0);
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                c18746bM160768o.m160765l(1);
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    c18746bM160768o.m160765l(1);
                } else {
                    c18746bM160768o.m160765l(2);
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    c18746bM160768o.m160765l(1);
                } else {
                    c18746bM160768o.m160765l(0);
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                c18746bM160768o.m160765l(1);
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    c18746bM160768o.m160765l(1);
                } else {
                    c18746bM160768o.m160765l(2);
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    c18746bM160768o.m160765l(1);
                } else {
                    c18746bM160768o.m160765l(0);
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                c18746bM160768o.m160765l(1);
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    c18746bM160768o.m160765l(1);
                } else {
                    c18746bM160768o.m160765l(2);
                }
                break;
            default:
                c18746bM160768o.m160765l(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    c18746bM160768o.m160762i(1);
                } else {
                    c18746bM160768o.m160762i(2);
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    c18746bM160768o.m160762i(1);
                } else {
                    c18746bM160768o.m160762i(2);
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    c18746bM160768o.m160762i(1);
                } else {
                    c18746bM160768o.m160762i(2);
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                c18746bM160768o.m160762i(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                c18746bM160768o.m160762i(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                c18746bM160768o.m160762i(1);
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    c18746bM160768o.m160762i(1);
                } else {
                    c18746bM160768o.m160762i(0);
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    c18746bM160768o.m160762i(1);
                } else {
                    c18746bM160768o.m160762i(0);
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    c18746bM160768o.m160762i(1);
                } else {
                    c18746bM160768o.m160762i(0);
                }
                break;
            default:
                c18746bM160768o.m160762i(1);
                break;
        }
        return c18746bM160768o.m160764k(m209948D(c18746bM160768o.m160757d())).m160761h(m209948D(c18746bM160768o.m160756c()), 0).m160754a();
    }

    /* JADX INFO: renamed from: F */
    public final String m209951F(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = f193162r.matcher(strTrim);
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
