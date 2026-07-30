package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.data.OMSFontStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vlp0 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f181973c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f181974d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final d860 f181975a = new d860();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f181976b = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public static boolean m198823b(d860 d860Var) {
        int iM110300f = d860Var.m110300f();
        int iM110301g = d860Var.m110301g();
        byte[] bArrM110299e = d860Var.m110299e();
        if (iM110300f + 2 > iM110301g) {
            return false;
        }
        int i = iM110300f + 1;
        if (bArrM110299e[iM110300f] != 47) {
            return false;
        }
        int i2 = iM110300f + 2;
        if (bArrM110299e[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iM110301g) {
                d860Var.m110293V(iM110301g - d860Var.m110300f());
                return true;
            }
            if (((char) bArrM110299e[i2]) == '*' && ((char) bArrM110299e[i3]) == '/') {
                i2 += 2;
                iM110301g = i2;
            } else {
                i2 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m198824c(d860 d860Var) {
        char cM198831k = m198831k(d860Var, d860Var.m110300f());
        if (cM198831k != '\t' && cM198831k != '\n' && cM198831k != '\f' && cM198831k != '\r' && cM198831k != ' ') {
            return false;
        }
        d860Var.m110293V(1);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m198825e(String str, wlp0 wlp0Var) {
        Matcher matcher = f181974d.matcher(b11.m99804e(str));
        if (!matcher.matches()) {
            jwv.m143689i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) p11.m167011e(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                wlp0Var.m203866t(3);
                break;
            case "em":
                wlp0Var.m203866t(2);
                break;
            case "px":
                wlp0Var.m203866t(1);
                break;
            default:
                ohg0.m164364a();
                return;
        }
        wlp0Var.m203865s(Float.parseFloat((String) p11.m167011e(matcher.group(1))));
    }

    /* JADX INFO: renamed from: f */
    public static String m198826f(d860 d860Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iM110300f = d860Var.m110300f();
        int iM110301g = d860Var.m110301g();
        while (iM110300f < iM110301g && !z) {
            char c = (char) d860Var.m110299e()[iM110300f];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                iM110300f++;
                sb.append(c);
            }
        }
        d860Var.m110293V(iM110300f - d860Var.m110300f());
        return sb.toString();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static String m198827g(d860 d860Var, StringBuilder sb) {
        m198834n(d860Var);
        if (d860Var.m110295a() == 0) {
            return null;
        }
        String strM198826f = m198826f(d860Var, sb);
        if (!"".equals(strM198826f)) {
            return strM198826f;
        }
        return "" + ((char) d860Var.m110279H());
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static String m198828h(d860 d860Var, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iM110300f = d860Var.m110300f();
            String strM198827g = m198827g(d860Var, sb);
            if (strM198827g == null) {
                return null;
            }
            if ("}".equals(strM198827g) || Constants.PACKNAME_END.equals(strM198827g)) {
                d860Var.m110292U(iM110300f);
                z = true;
            } else {
                sb2.append(strM198827g);
            }
        }
        return sb2.toString();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static String m198829i(d860 d860Var, StringBuilder sb) {
        m198834n(d860Var);
        if (d860Var.m110295a() < 5 || !"::cue".equals(d860Var.m110276E(5))) {
            return null;
        }
        int iM110300f = d860Var.m110300f();
        String strM198827g = m198827g(d860Var, sb);
        if (strM198827g == null) {
            return null;
        }
        if ("{".equals(strM198827g)) {
            d860Var.m110292U(iM110300f);
            return "";
        }
        String strM198832l = "(".equals(strM198827g) ? m198832l(d860Var) : null;
        if (")".equals(m198827g(d860Var, sb))) {
            return strM198832l;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static void m198830j(d860 d860Var, wlp0 wlp0Var, StringBuilder sb) {
        m198834n(d860Var);
        String strM198826f = m198826f(d860Var, sb);
        if (!"".equals(strM198826f) && ":".equals(m198827g(d860Var, sb))) {
            m198834n(d860Var);
            String strM198828h = m198828h(d860Var, sb);
            if (strM198828h == null || "".equals(strM198828h)) {
                return;
            }
            int iM110300f = d860Var.m110300f();
            String strM198827g = m198827g(d860Var, sb);
            if (!Constants.PACKNAME_END.equals(strM198827g)) {
                if (!"}".equals(strM198827g)) {
                    return;
                } else {
                    d860Var.m110292U(iM110300f);
                }
            }
            if ("color".equals(strM198826f)) {
                wlp0Var.m203863q(ee5.m115847b(strM198828h));
                return;
            }
            if ("background-color".equals(strM198826f)) {
                wlp0Var.m203860n(ee5.m115847b(strM198828h));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(strM198826f)) {
                if ("over".equals(strM198828h)) {
                    wlp0Var.m203868v(1);
                    return;
                } else {
                    if ("under".equals(strM198828h)) {
                        wlp0Var.m203868v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strM198826f)) {
                if (!"all".equals(strM198828h) && !strM198828h.startsWith("digits")) {
                    z = false;
                }
                wlp0Var.m203862p(z);
                return;
            }
            if ("text-decoration".equals(strM198826f)) {
                if ("underline".equals(strM198828h)) {
                    wlp0Var.m203846A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strM198826f)) {
                wlp0Var.m203864r(strM198828h);
                return;
            }
            if ("font-weight".equals(strM198826f)) {
                if (OMSFontStyle.bold.equals(strM198828h)) {
                    wlp0Var.m203861o(true);
                }
            } else if ("font-style".equals(strM198826f)) {
                if (OMSFontStyle.italic.equals(strM198828h)) {
                    wlp0Var.m203867u(true);
                }
            } else if ("font-size".equals(strM198826f)) {
                m198825e(strM198828h, wlp0Var);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static char m198831k(d860 d860Var, int i) {
        return (char) d860Var.m110299e()[i];
    }

    /* JADX INFO: renamed from: l */
    public static String m198832l(d860 d860Var) {
        int iM110300f = d860Var.m110300f();
        int iM110301g = d860Var.m110301g();
        boolean z = false;
        while (iM110300f < iM110301g && !z) {
            int i = iM110300f + 1;
            z = ((char) d860Var.m110299e()[iM110300f]) == ')';
            iM110300f = i;
        }
        return d860Var.m110276E((iM110300f - 1) - d860Var.m110300f()).trim();
    }

    /* JADX INFO: renamed from: m */
    public static void m198833m(d860 d860Var) {
        while (!TextUtils.isEmpty(d860Var.m110313s())) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m198834n(d860 d860Var) {
        while (true) {
            for (boolean z = true; d860Var.m110295a() > 0 && z; z = false) {
                if (!m198824c(d860Var) && !m198823b(d860Var)) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m198835a(wlp0 wlp0Var, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f181973c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                wlp0Var.m203872z((String) p11.m167011e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrM197841a1 = vck0.m197841a1(str, "\\.");
        String str2 = strArrM197841a1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            wlp0Var.m203871y(str2.substring(0, iIndexOf2));
            wlp0Var.m203870x(str2.substring(iIndexOf2 + 1));
        } else {
            wlp0Var.m203871y(str2);
        }
        if (strArrM197841a1.length > 1) {
            wlp0Var.m203869w((String[]) vck0.m197818P0(strArrM197841a1, 1, strArrM197841a1.length));
        }
    }

    /* JADX INFO: renamed from: d */
    public List<wlp0> m198836d(d860 d860Var) {
        this.f181976b.setLength(0);
        int iM110300f = d860Var.m110300f();
        m198833m(d860Var);
        this.f181975a.m110290S(d860Var.m110299e(), d860Var.m110300f());
        this.f181975a.m110292U(iM110300f);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strM198829i = m198829i(this.f181975a, this.f181976b);
            if (strM198829i == null || !"{".equals(m198827g(this.f181975a, this.f181976b))) {
                break;
            }
            wlp0 wlp0Var = new wlp0();
            m198835a(wlp0Var, strM198829i);
            String str = null;
            boolean z = false;
            while (!z) {
                int iM110300f2 = this.f181975a.m110300f();
                String strM198827g = m198827g(this.f181975a, this.f181976b);
                boolean z2 = strM198827g == null || "}".equals(strM198827g);
                if (!z2) {
                    this.f181975a.m110292U(iM110300f2);
                    m198830j(this.f181975a, wlp0Var, this.f181976b);
                }
                str = strM198827g;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(wlp0Var);
            }
        }
        return arrayList;
    }
}
