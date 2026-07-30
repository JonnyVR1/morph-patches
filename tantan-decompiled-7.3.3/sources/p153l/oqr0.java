package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.data.OMSFontStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class oqr0 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f148640c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f148641d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final bgw0 f148642a = new bgw0();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f148643b = new StringBuilder();

    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m168844a(bgw0 bgw0Var, StringBuilder sb) {
        m168845c(bgw0Var);
        if (bgw0Var.m104275q() == 0) {
            return null;
        }
        String strM168846d = m168846d(bgw0Var, sb);
        if (!"".equals(strM168846d)) {
            return strM168846d;
        }
        char cM104245B = (char) bgw0Var.m104245B();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cM104245B);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m168845c(bgw0 bgw0Var) {
        while (true) {
            for (boolean z = true; bgw0Var.m104275q() > 0 && z; z = false) {
                char c = (char) bgw0Var.m104271m()[bgw0Var.m104277s()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    bgw0Var.m104270l(1);
                } else {
                    int iM104277s = bgw0Var.m104277s();
                    int iM104278t = bgw0Var.m104278t();
                    byte[] bArrM104271m = bgw0Var.m104271m();
                    if (iM104277s + 2 <= iM104278t) {
                        int i = iM104277s + 1;
                        if (bArrM104271m[iM104277s] == 47) {
                            int i2 = iM104277s + 2;
                            if (bArrM104271m[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= iM104278t) {
                                        break;
                                    }
                                    if (((char) bArrM104271m[i2]) == '*' && ((char) bArrM104271m[i3]) == '/') {
                                        iM104278t = i2 + 2;
                                        i2 = iM104278t;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                bgw0Var.m104270l(iM104278t - bgw0Var.m104277s());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m168846d(bgw0 bgw0Var, StringBuilder sb) {
        char c;
        sb.setLength(0);
        int iM104277s = bgw0Var.m104277s();
        int iM104278t = bgw0Var.m104278t();
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (iM104277s < iM104278t && !z) {
                    c = (char) bgw0Var.m104271m()[iM104277s];
                    if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                        break;
                    }
                    z = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c);
            iM104277s++;
        }
        bgw0Var.m104270l(iM104277s - bgw0Var.m104277s());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x0204  */
    /* JADX WARN: Code duplicated, block: B:106:0x020c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0211  */
    /* JADX WARN: Code duplicated, block: B:109:0x0219  */
    /* JADX WARN: Code duplicated, block: B:113:0x0229  */
    /* JADX WARN: Code duplicated, block: B:116:0x0231  */
    /* JADX WARN: Code duplicated, block: B:118:0x0239  */
    /* JADX WARN: Code duplicated, block: B:120:0x0241  */
    /* JADX WARN: Code duplicated, block: B:121:0x0246  */
    /* JADX WARN: Code duplicated, block: B:123:0x024e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0253  */
    /* JADX WARN: Code duplicated, block: B:126:0x025b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0263  */
    /* JADX WARN: Code duplicated, block: B:129:0x0268  */
    /* JADX WARN: Code duplicated, block: B:131:0x0270  */
    /* JADX WARN: Code duplicated, block: B:133:0x0278  */
    /* JADX WARN: Code duplicated, block: B:134:0x027d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0285  */
    /* JADX WARN: Code duplicated, block: B:138:0x0295  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:141:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0160  */
    /* JADX WARN: Code duplicated, block: B:8:0x0044  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ee  */
    /* JADX WARN: Instruction removed from duplicated block: B:138:0x0295, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public final List m168847b(bgw0 bgw0Var) {
        String strTrim;
        List list;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        boolean z;
        int i = 0;
        this.f148643b.setLength(0);
        int iM104277s = bgw0Var.m104277s();
        while (!TextUtils.isEmpty(bgw0Var.m104257N(cow0.f82931c))) {
        }
        this.f148642a.m104267i(bgw0Var.m104271m(), bgw0Var.m104277s());
        this.f148642a.m104269k(iM104277s);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bgw0 bgw0Var2 = this.f148642a;
            StringBuilder sb = this.f148643b;
            m168845c(bgw0Var2);
            if (bgw0Var2.m104275q() >= 5 && "::cue".equals(bgw0Var2.m104259a(5, cow0.f82931c))) {
                int iM104277s2 = bgw0Var2.m104277s();
                String strM168844a = m168844a(bgw0Var2, sb);
                if (strM168844a == null) {
                    strTrim = null;
                } else if ("{".equals(strM168844a)) {
                    bgw0Var2.m104269k(iM104277s2);
                    strTrim = "";
                } else {
                    if ("(".equals(strM168844a)) {
                        int iM104277s3 = bgw0Var2.m104277s();
                        int iM104278t = bgw0Var2.m104278t();
                        int i2 = i;
                        while (iM104277s3 < iM104278t && i2 == 0) {
                            int i3 = iM104277s3 + 1;
                            i2 = ((char) bgw0Var2.m104271m()[iM104277s3]) == ')' ? 1 : i;
                            iM104277s3 = i3;
                        }
                        strTrim = bgw0Var2.m104259a((iM104277s3 - 1) - bgw0Var2.m104277s(), cow0.f82931c).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(m168844a(bgw0Var2, sb))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !"{".equals(m168844a(this.f148642a, this.f148643b))) {
                break;
            }
            pqr0 pqr0Var = new pqr0();
            if (!"".equals(strTrim)) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != -1) {
                    Matcher matcher2 = f148640c.matcher(strTrim.substring(iIndexOf));
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        pqr0Var.m173416w(strGroup2);
                    }
                    strTrim = strTrim.substring(i, iIndexOf);
                }
                int i4 = mpw0.f137957a;
                String[] strArrSplit = strTrim.split("\\.", -1);
                String str = strArrSplit[i];
                int iIndexOf2 = str.indexOf(35);
                if (iIndexOf2 != -1) {
                    pqr0Var.m173415v(str.substring(i, iIndexOf2));
                    pqr0Var.m173414u(str.substring(iIndexOf2 + 1));
                } else {
                    pqr0Var.m173415v(str);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    pqr0Var.m173413t((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i5 = i;
            String strM168844a2 = null;
            while (i5 == 0) {
                bgw0 bgw0Var3 = this.f148642a;
                StringBuilder sb2 = this.f148643b;
                int iM104277s4 = bgw0Var3.m104277s();
                strM168844a2 = m168844a(bgw0Var3, sb2);
                i5 = (strM168844a2 == null || "}".equals(strM168844a2)) ? 1 : i;
                if (i5 == 0) {
                    this.f148642a.m104269k(iM104277s4);
                    bgw0 bgw0Var4 = this.f148642a;
                    StringBuilder sb3 = this.f148643b;
                    m168845c(bgw0Var4);
                    String strM168846d = m168846d(bgw0Var4, sb3);
                    if (!"".equals(strM168846d) && ":".equals(m168844a(bgw0Var4, sb3))) {
                        m168845c(bgw0Var4);
                        StringBuilder sb4 = new StringBuilder();
                        int i6 = i;
                        while (true) {
                            if (i6 != 0) {
                                list = null;
                                string = sb4.toString();
                                break;
                            }
                            int iM104277s5 = bgw0Var4.m104277s();
                            list = null;
                            String strM168844a3 = m168844a(bgw0Var4, sb3);
                            if (strM168844a3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strM168844a3) || Constants.PACKNAME_END.equals(strM168844a3)) {
                                bgw0Var4.m104269k(iM104277s5);
                                i6 = 1;
                            } else {
                                sb4.append(strM168844a3);
                            }
                        }
                        if (string != null && !"".equals(string)) {
                            int iM104277s6 = bgw0Var4.m104277s();
                            String strM168844a4 = m168844a(bgw0Var4, sb3);
                            if (Constants.PACKNAME_END.equals(strM168844a4)) {
                                if ("color".equals(strM168846d)) {
                                    pqr0Var.m173405l(aiv0.m98157a(string));
                                } else if ("background-color".equals(strM168846d)) {
                                    pqr0Var.m173402i(aiv0.m98157a(string));
                                } else if ("ruby-position".equals(strM168846d)) {
                                    if ("over".equals(string)) {
                                        pqr0Var.m173410q(1);
                                    } else if ("under".equals(string)) {
                                        pqr0Var.m173410q(2);
                                    }
                                } else if ("text-combine-upright".equals(strM168846d)) {
                                    if ("all".equals(string)) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    pqr0Var.m173404k(z);
                                } else if ("text-decoration".equals(strM168846d)) {
                                    if ("underline".equals(string)) {
                                        pqr0Var.m173411r(true);
                                    }
                                } else if ("font-family".equals(strM168846d)) {
                                    pqr0Var.m173406m(string);
                                } else if ("font-weight".equals(strM168846d)) {
                                    if (OMSFontStyle.bold.equals(string)) {
                                        pqr0Var.m173403j(true);
                                    }
                                } else if ("font-style".equals(strM168846d)) {
                                    if (OMSFontStyle.italic.equals(string)) {
                                        pqr0Var.m173409p(true);
                                    }
                                } else if ("font-size".equals(strM168846d)) {
                                    matcher = f148641d.matcher(wnw0.m207228a(string));
                                    if (matcher.matches()) {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode == 3592) {
                                                }
                                                wpg0.m207458a();
                                                return list;
                                            }
                                            if (strGroup.equals("em")) {
                                                wpg0.m207458a();
                                                return list;
                                            }
                                            pqr0Var.m173408o(2);
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            pqr0Var.m173407n(Float.parseFloat(strGroup3));
                                        } else {
                                            if (strGroup.equals("%")) {
                                                wpg0.m207458a();
                                                return list;
                                            }
                                            pqr0Var.m173408o(3);
                                            String strGroup4 = matcher.group(1);
                                            strGroup4.getClass();
                                            pqr0Var.m173407n(Float.parseFloat(strGroup4));
                                        }
                                    } else {
                                        y4w0.m214278f("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    }
                                } else {
                                    continue;
                                }
                            } else if ("}".equals(strM168844a4)) {
                                bgw0Var4.m104269k(iM104277s6);
                                if ("color".equals(strM168846d)) {
                                    pqr0Var.m173405l(aiv0.m98157a(string));
                                } else if ("background-color".equals(strM168846d)) {
                                    pqr0Var.m173402i(aiv0.m98157a(string));
                                } else if ("ruby-position".equals(strM168846d)) {
                                    if ("over".equals(string)) {
                                        pqr0Var.m173410q(1);
                                    } else if ("under".equals(string)) {
                                        pqr0Var.m173410q(2);
                                    }
                                } else if ("text-combine-upright".equals(strM168846d)) {
                                    if ("all".equals(string) || string.startsWith("digits")) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    pqr0Var.m173404k(z);
                                } else if ("text-decoration".equals(strM168846d)) {
                                    if ("underline".equals(string)) {
                                        pqr0Var.m173411r(true);
                                    }
                                } else if ("font-family".equals(strM168846d)) {
                                    pqr0Var.m173406m(string);
                                } else if ("font-weight".equals(strM168846d)) {
                                    if (OMSFontStyle.bold.equals(string)) {
                                        pqr0Var.m173403j(true);
                                    }
                                } else if ("font-style".equals(strM168846d)) {
                                    if (OMSFontStyle.italic.equals(string)) {
                                        pqr0Var.m173409p(true);
                                    }
                                } else if ("font-size".equals(strM168846d)) {
                                    matcher = f148641d.matcher(wnw0.m207228a(string));
                                    if (matcher.matches()) {
                                        y4w0.m214278f("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode == 3592 || !strGroup.equals("px")) {
                                                    wpg0.m207458a();
                                                    return list;
                                                }
                                                pqr0Var.m173408o(1);
                                                String strGroup5 = matcher.group(1);
                                                strGroup5.getClass();
                                                pqr0Var.m173407n(Float.parseFloat(strGroup5));
                                            } else {
                                                if (strGroup.equals("em")) {
                                                    wpg0.m207458a();
                                                    return list;
                                                }
                                                pqr0Var.m173408o(2);
                                                String strGroup6 = matcher.group(1);
                                                strGroup6.getClass();
                                                pqr0Var.m173407n(Float.parseFloat(strGroup6));
                                            }
                                        } else {
                                            if (strGroup.equals("%")) {
                                                wpg0.m207458a();
                                                return list;
                                            }
                                            pqr0Var.m173408o(3);
                                            String strGroup7 = matcher.group(1);
                                            strGroup7.getClass();
                                            pqr0Var.m173407n(Float.parseFloat(strGroup7));
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i = 0;
            }
            if ("}".equals(strM168844a2)) {
                arrayList.add(pqr0Var);
            }
            i = 0;
        }
        return arrayList;
    }
}
