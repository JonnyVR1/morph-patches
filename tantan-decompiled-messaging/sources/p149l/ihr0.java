package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.data.OMSFontStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class ihr0 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f113322c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f113323d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final v6w0 f113324a = new v6w0();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f113325b = new StringBuilder();

    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m136271a(v6w0 v6w0Var, StringBuilder sb) {
        m136272c(v6w0Var);
        if (v6w0Var.m197268q() == 0) {
            return null;
        }
        String strM136273d = m136273d(v6w0Var, sb);
        if (!"".equals(strM136273d)) {
            return strM136273d;
        }
        char cM197238B = (char) v6w0Var.m197238B();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cM197238B);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m136272c(v6w0 v6w0Var) {
        while (true) {
            for (boolean z = true; v6w0Var.m197268q() > 0 && z; z = false) {
                char c = (char) v6w0Var.m197264m()[v6w0Var.m197270s()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    v6w0Var.m197263l(1);
                } else {
                    int iM197270s = v6w0Var.m197270s();
                    int iM197271t = v6w0Var.m197271t();
                    byte[] bArrM197264m = v6w0Var.m197264m();
                    if (iM197270s + 2 <= iM197271t) {
                        int i = iM197270s + 1;
                        if (bArrM197264m[iM197270s] == 47) {
                            int i2 = iM197270s + 2;
                            if (bArrM197264m[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= iM197271t) {
                                        break;
                                    }
                                    if (((char) bArrM197264m[i2]) == '*' && ((char) bArrM197264m[i3]) == '/') {
                                        iM197271t = i2 + 2;
                                        i2 = iM197271t;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                v6w0Var.m197263l(iM197271t - v6w0Var.m197270s());
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
    public static String m136273d(v6w0 v6w0Var, StringBuilder sb) {
        char c;
        sb.setLength(0);
        int iM197270s = v6w0Var.m197270s();
        int iM197271t = v6w0Var.m197271t();
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (iM197270s < iM197271t && !z) {
                    c = (char) v6w0Var.m197264m()[iM197270s];
                    if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                        break;
                    }
                    z = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c);
            iM197270s++;
        }
        v6w0Var.m197263l(iM197270s - v6w0Var.m197270s());
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
    public final List m136274b(v6w0 v6w0Var) {
        String strTrim;
        List list;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        boolean z;
        int i = 0;
        this.f113325b.setLength(0);
        int iM197270s = v6w0Var.m197270s();
        while (!TextUtils.isEmpty(v6w0Var.m197250N(wew0.f185990c))) {
        }
        this.f113324a.m197260i(v6w0Var.m197264m(), v6w0Var.m197270s());
        this.f113324a.m197262k(iM197270s);
        ArrayList arrayList = new ArrayList();
        while (true) {
            v6w0 v6w0Var2 = this.f113324a;
            StringBuilder sb = this.f113325b;
            m136272c(v6w0Var2);
            if (v6w0Var2.m197268q() >= 5 && "::cue".equals(v6w0Var2.m197252a(5, wew0.f185990c))) {
                int iM197270s2 = v6w0Var2.m197270s();
                String strM136271a = m136271a(v6w0Var2, sb);
                if (strM136271a == null) {
                    strTrim = null;
                } else if ("{".equals(strM136271a)) {
                    v6w0Var2.m197262k(iM197270s2);
                    strTrim = "";
                } else {
                    if ("(".equals(strM136271a)) {
                        int iM197270s3 = v6w0Var2.m197270s();
                        int iM197271t = v6w0Var2.m197271t();
                        int i2 = i;
                        while (iM197270s3 < iM197271t && i2 == 0) {
                            int i3 = iM197270s3 + 1;
                            i2 = ((char) v6w0Var2.m197264m()[iM197270s3]) == ')' ? 1 : i;
                            iM197270s3 = i3;
                        }
                        strTrim = v6w0Var2.m197252a((iM197270s3 - 1) - v6w0Var2.m197270s(), wew0.f185990c).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(m136271a(v6w0Var2, sb))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !"{".equals(m136271a(this.f113324a, this.f113325b))) {
                break;
            }
            jhr0 jhr0Var = new jhr0();
            if (!"".equals(strTrim)) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != -1) {
                    Matcher matcher2 = f113322c.matcher(strTrim.substring(iIndexOf));
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        jhr0Var.m141592w(strGroup2);
                    }
                    strTrim = strTrim.substring(i, iIndexOf);
                }
                int i4 = ggw0.f102568a;
                String[] strArrSplit = strTrim.split("\\.", -1);
                String str = strArrSplit[i];
                int iIndexOf2 = str.indexOf(35);
                if (iIndexOf2 != -1) {
                    jhr0Var.m141591v(str.substring(i, iIndexOf2));
                    jhr0Var.m141590u(str.substring(iIndexOf2 + 1));
                } else {
                    jhr0Var.m141591v(str);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    jhr0Var.m141589t((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i5 = i;
            String strM136271a2 = null;
            while (i5 == 0) {
                v6w0 v6w0Var3 = this.f113324a;
                StringBuilder sb2 = this.f113325b;
                int iM197270s4 = v6w0Var3.m197270s();
                strM136271a2 = m136271a(v6w0Var3, sb2);
                i5 = (strM136271a2 == null || "}".equals(strM136271a2)) ? 1 : i;
                if (i5 == 0) {
                    this.f113324a.m197262k(iM197270s4);
                    v6w0 v6w0Var4 = this.f113324a;
                    StringBuilder sb3 = this.f113325b;
                    m136272c(v6w0Var4);
                    String strM136273d = m136273d(v6w0Var4, sb3);
                    if (!"".equals(strM136273d) && ":".equals(m136271a(v6w0Var4, sb3))) {
                        m136272c(v6w0Var4);
                        StringBuilder sb4 = new StringBuilder();
                        int i6 = i;
                        while (true) {
                            if (i6 != 0) {
                                list = null;
                                string = sb4.toString();
                                break;
                            }
                            int iM197270s5 = v6w0Var4.m197270s();
                            list = null;
                            String strM136271a3 = m136271a(v6w0Var4, sb3);
                            if (strM136271a3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strM136271a3) || Constants.PACKNAME_END.equals(strM136271a3)) {
                                v6w0Var4.m197262k(iM197270s5);
                                i6 = 1;
                            } else {
                                sb4.append(strM136271a3);
                            }
                        }
                        if (string != null && !"".equals(string)) {
                            int iM197270s6 = v6w0Var4.m197270s();
                            String strM136271a4 = m136271a(v6w0Var4, sb3);
                            if (Constants.PACKNAME_END.equals(strM136271a4)) {
                                if ("color".equals(strM136273d)) {
                                    jhr0Var.m141581l(u8v0.m192259a(string));
                                } else if ("background-color".equals(strM136273d)) {
                                    jhr0Var.m141578i(u8v0.m192259a(string));
                                } else if ("ruby-position".equals(strM136273d)) {
                                    if ("over".equals(string)) {
                                        jhr0Var.m141586q(1);
                                    } else if ("under".equals(string)) {
                                        jhr0Var.m141586q(2);
                                    }
                                } else if ("text-combine-upright".equals(strM136273d)) {
                                    if ("all".equals(string)) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    jhr0Var.m141580k(z);
                                } else if ("text-decoration".equals(strM136273d)) {
                                    if ("underline".equals(string)) {
                                        jhr0Var.m141587r(true);
                                    }
                                } else if ("font-family".equals(strM136273d)) {
                                    jhr0Var.m141582m(string);
                                } else if ("font-weight".equals(strM136273d)) {
                                    if (OMSFontStyle.bold.equals(string)) {
                                        jhr0Var.m141579j(true);
                                    }
                                } else if ("font-style".equals(strM136273d)) {
                                    if (OMSFontStyle.italic.equals(string)) {
                                        jhr0Var.m141585p(true);
                                    }
                                } else if ("font-size".equals(strM136273d)) {
                                    matcher = f113323d.matcher(qew0.m174257a(string));
                                    if (matcher.matches()) {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode == 3592) {
                                                }
                                                ohg0.m164364a();
                                                return list;
                                            }
                                            if (strGroup.equals("em")) {
                                                ohg0.m164364a();
                                                return list;
                                            }
                                            jhr0Var.m141584o(2);
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            jhr0Var.m141583n(Float.parseFloat(strGroup3));
                                        } else {
                                            if (strGroup.equals("%")) {
                                                ohg0.m164364a();
                                                return list;
                                            }
                                            jhr0Var.m141584o(3);
                                            String strGroup4 = matcher.group(1);
                                            strGroup4.getClass();
                                            jhr0Var.m141583n(Float.parseFloat(strGroup4));
                                        }
                                    } else {
                                        svv0.m186111f("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    }
                                } else {
                                    continue;
                                }
                            } else if ("}".equals(strM136271a4)) {
                                v6w0Var4.m197262k(iM197270s6);
                                if ("color".equals(strM136273d)) {
                                    jhr0Var.m141581l(u8v0.m192259a(string));
                                } else if ("background-color".equals(strM136273d)) {
                                    jhr0Var.m141578i(u8v0.m192259a(string));
                                } else if ("ruby-position".equals(strM136273d)) {
                                    if ("over".equals(string)) {
                                        jhr0Var.m141586q(1);
                                    } else if ("under".equals(string)) {
                                        jhr0Var.m141586q(2);
                                    }
                                } else if ("text-combine-upright".equals(strM136273d)) {
                                    if ("all".equals(string) || string.startsWith("digits")) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    jhr0Var.m141580k(z);
                                } else if ("text-decoration".equals(strM136273d)) {
                                    if ("underline".equals(string)) {
                                        jhr0Var.m141587r(true);
                                    }
                                } else if ("font-family".equals(strM136273d)) {
                                    jhr0Var.m141582m(string);
                                } else if ("font-weight".equals(strM136273d)) {
                                    if (OMSFontStyle.bold.equals(string)) {
                                        jhr0Var.m141579j(true);
                                    }
                                } else if ("font-style".equals(strM136273d)) {
                                    if (OMSFontStyle.italic.equals(string)) {
                                        jhr0Var.m141585p(true);
                                    }
                                } else if ("font-size".equals(strM136273d)) {
                                    matcher = f113323d.matcher(qew0.m174257a(string));
                                    if (matcher.matches()) {
                                        svv0.m186111f("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode == 3592 || !strGroup.equals("px")) {
                                                    ohg0.m164364a();
                                                    return list;
                                                }
                                                jhr0Var.m141584o(1);
                                                String strGroup5 = matcher.group(1);
                                                strGroup5.getClass();
                                                jhr0Var.m141583n(Float.parseFloat(strGroup5));
                                            } else {
                                                if (strGroup.equals("em")) {
                                                    ohg0.m164364a();
                                                    return list;
                                                }
                                                jhr0Var.m141584o(2);
                                                String strGroup6 = matcher.group(1);
                                                strGroup6.getClass();
                                                jhr0Var.m141583n(Float.parseFloat(strGroup6));
                                            }
                                        } else {
                                            if (strGroup.equals("%")) {
                                                ohg0.m164364a();
                                                return list;
                                            }
                                            jhr0Var.m141584o(3);
                                            String strGroup7 = matcher.group(1);
                                            strGroup7.getClass();
                                            jhr0Var.m141583n(Float.parseFloat(strGroup7));
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
            if ("}".equals(strM136271a2)) {
                arrayList.add(jhr0Var);
            }
            i = 0;
        }
        return arrayList;
    }
}
