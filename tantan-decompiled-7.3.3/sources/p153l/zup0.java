package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.data.OMSFontStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zup0 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f206146c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f206147d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final ig60 f206148a = new ig60();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f206149b = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public static boolean m221685b(ig60 ig60Var) {
        int iM139816f = ig60Var.m139816f();
        int iM139817g = ig60Var.m139817g();
        byte[] bArrM139815e = ig60Var.m139815e();
        if (iM139816f + 2 > iM139817g) {
            return false;
        }
        int i = iM139816f + 1;
        if (bArrM139815e[iM139816f] != 47) {
            return false;
        }
        int i2 = iM139816f + 2;
        if (bArrM139815e[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iM139817g) {
                ig60Var.m139809V(iM139817g - ig60Var.m139816f());
                return true;
            }
            if (((char) bArrM139815e[i2]) == '*' && ((char) bArrM139815e[i3]) == '/') {
                i2 += 2;
                iM139817g = i2;
            } else {
                i2 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m221686c(ig60 ig60Var) {
        char cM221693k = m221693k(ig60Var, ig60Var.m139816f());
        if (cM221693k != '\t' && cM221693k != '\n' && cM221693k != '\f' && cM221693k != '\r' && cM221693k != ' ') {
            return false;
        }
        ig60Var.m139809V(1);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m221687e(String str, avp0 avp0Var) {
        Matcher matcher = f206147d.matcher(i11.m138051e(str));
        if (!matcher.matches()) {
            kyv.m152151i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) w11.m204369e(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                avp0Var.m100500t(3);
                break;
            case "em":
                avp0Var.m100500t(2);
                break;
            case "px":
                avp0Var.m100500t(1);
                break;
            default:
                wpg0.m207458a();
                return;
        }
        avp0Var.m100499s(Float.parseFloat((String) w11.m204369e(matcher.group(1))));
    }

    /* JADX INFO: renamed from: f */
    public static String m221688f(ig60 ig60Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iM139816f = ig60Var.m139816f();
        int iM139817g = ig60Var.m139817g();
        while (iM139816f < iM139817g && !z) {
            char c = (char) ig60Var.m139815e()[iM139816f];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                iM139816f++;
                sb.append(c);
            }
        }
        ig60Var.m139809V(iM139816f - ig60Var.m139816f());
        return sb.toString();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static String m221689g(ig60 ig60Var, StringBuilder sb) {
        m221696n(ig60Var);
        if (ig60Var.m139811a() == 0) {
            return null;
        }
        String strM221688f = m221688f(ig60Var, sb);
        if (!"".equals(strM221688f)) {
            return strM221688f;
        }
        return "" + ((char) ig60Var.m139795H());
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static String m221690h(ig60 ig60Var, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iM139816f = ig60Var.m139816f();
            String strM221689g = m221689g(ig60Var, sb);
            if (strM221689g == null) {
                return null;
            }
            if ("}".equals(strM221689g) || Constants.PACKNAME_END.equals(strM221689g)) {
                ig60Var.m139808U(iM139816f);
                z = true;
            } else {
                sb2.append(strM221689g);
            }
        }
        return sb2.toString();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static String m221691i(ig60 ig60Var, StringBuilder sb) {
        m221696n(ig60Var);
        if (ig60Var.m139811a() < 5 || !"::cue".equals(ig60Var.m139792E(5))) {
            return null;
        }
        int iM139816f = ig60Var.m139816f();
        String strM221689g = m221689g(ig60Var, sb);
        if (strM221689g == null) {
            return null;
        }
        if ("{".equals(strM221689g)) {
            ig60Var.m139808U(iM139816f);
            return "";
        }
        String strM221694l = "(".equals(strM221689g) ? m221694l(ig60Var) : null;
        if (")".equals(m221689g(ig60Var, sb))) {
            return strM221694l;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static void m221692j(ig60 ig60Var, avp0 avp0Var, StringBuilder sb) {
        m221696n(ig60Var);
        String strM221688f = m221688f(ig60Var, sb);
        if (!"".equals(strM221688f) && ":".equals(m221689g(ig60Var, sb))) {
            m221696n(ig60Var);
            String strM221690h = m221690h(ig60Var, sb);
            if (strM221690h == null || "".equals(strM221690h)) {
                return;
            }
            int iM139816f = ig60Var.m139816f();
            String strM221689g = m221689g(ig60Var, sb);
            if (!Constants.PACKNAME_END.equals(strM221689g)) {
                if (!"}".equals(strM221689g)) {
                    return;
                } else {
                    ig60Var.m139808U(iM139816f);
                }
            }
            if ("color".equals(strM221688f)) {
                avp0Var.m100497q(ef5.m120586b(strM221690h));
                return;
            }
            if ("background-color".equals(strM221688f)) {
                avp0Var.m100494n(ef5.m120586b(strM221690h));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(strM221688f)) {
                if ("over".equals(strM221690h)) {
                    avp0Var.m100502v(1);
                    return;
                } else {
                    if ("under".equals(strM221690h)) {
                        avp0Var.m100502v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strM221688f)) {
                if (!"all".equals(strM221690h) && !strM221690h.startsWith("digits")) {
                    z = false;
                }
                avp0Var.m100496p(z);
                return;
            }
            if ("text-decoration".equals(strM221688f)) {
                if ("underline".equals(strM221690h)) {
                    avp0Var.m100480A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strM221688f)) {
                avp0Var.m100498r(strM221690h);
                return;
            }
            if ("font-weight".equals(strM221688f)) {
                if (OMSFontStyle.bold.equals(strM221690h)) {
                    avp0Var.m100495o(true);
                }
            } else if ("font-style".equals(strM221688f)) {
                if (OMSFontStyle.italic.equals(strM221690h)) {
                    avp0Var.m100501u(true);
                }
            } else if ("font-size".equals(strM221688f)) {
                m221687e(strM221690h, avp0Var);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static char m221693k(ig60 ig60Var, int i) {
        return (char) ig60Var.m139815e()[i];
    }

    /* JADX INFO: renamed from: l */
    public static String m221694l(ig60 ig60Var) {
        int iM139816f = ig60Var.m139816f();
        int iM139817g = ig60Var.m139817g();
        boolean z = false;
        while (iM139816f < iM139817g && !z) {
            int i = iM139816f + 1;
            z = ((char) ig60Var.m139815e()[iM139816f]) == ')';
            iM139816f = i;
        }
        return ig60Var.m139792E((iM139816f - 1) - ig60Var.m139816f()).trim();
    }

    /* JADX INFO: renamed from: m */
    public static void m221695m(ig60 ig60Var) {
        while (!TextUtils.isEmpty(ig60Var.m139829s())) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m221696n(ig60 ig60Var) {
        while (true) {
            for (boolean z = true; ig60Var.m139811a() > 0 && z; z = false) {
                if (!m221686c(ig60Var) && !m221685b(ig60Var)) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m221697a(avp0 avp0Var, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f206146c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                avp0Var.m100506z((String) w11.m204369e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrM105119a1 = bmk0.m105119a1(str, "\\.");
        String str2 = strArrM105119a1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            avp0Var.m100505y(str2.substring(0, iIndexOf2));
            avp0Var.m100504x(str2.substring(iIndexOf2 + 1));
        } else {
            avp0Var.m100505y(str2);
        }
        if (strArrM105119a1.length > 1) {
            avp0Var.m100503w((String[]) bmk0.m105096P0(strArrM105119a1, 1, strArrM105119a1.length));
        }
    }

    /* JADX INFO: renamed from: d */
    public List<avp0> m221698d(ig60 ig60Var) {
        this.f206149b.setLength(0);
        int iM139816f = ig60Var.m139816f();
        m221695m(ig60Var);
        this.f206148a.m139806S(ig60Var.m139815e(), ig60Var.m139816f());
        this.f206148a.m139808U(iM139816f);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strM221691i = m221691i(this.f206148a, this.f206149b);
            if (strM221691i == null || !"{".equals(m221689g(this.f206148a, this.f206149b))) {
                break;
            }
            avp0 avp0Var = new avp0();
            m221697a(avp0Var, strM221691i);
            String str = null;
            boolean z = false;
            while (!z) {
                int iM139816f2 = this.f206148a.m139816f();
                String strM221689g = m221689g(this.f206148a, this.f206149b);
                boolean z2 = strM221689g == null || "}".equals(strM221689g);
                if (!z2) {
                    this.f206148a.m139808U(iM139816f2);
                    m221692j(this.f206148a, avp0Var, this.f206149b);
                }
                str = strM221689g;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(avp0Var);
            }
        }
        return arrayList;
    }
}
