package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.model.Constants;

/* JADX INFO: loaded from: classes2.dex */
public final class du6 {

    /* JADX INFO: renamed from: j */
    public static final Pattern f90743j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k */
    public static final Pattern f90744k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f90745l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f90746m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public final String f90747a;

    /* JADX INFO: renamed from: b */
    public final String f90748b;

    /* JADX INFO: renamed from: c */
    public final long f90749c;

    /* JADX INFO: renamed from: d */
    public final String f90750d;

    /* JADX INFO: renamed from: e */
    public final String f90751e;

    /* JADX INFO: renamed from: f */
    public final boolean f90752f;

    /* JADX INFO: renamed from: g */
    public final boolean f90753g;

    /* JADX INFO: renamed from: h */
    public final boolean f90754h;

    /* JADX INFO: renamed from: i */
    public final boolean f90755i;

    public du6(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f90747a = str;
        this.f90748b = str2;
        this.f90749c = j;
        this.f90750d = str3;
        this.f90751e = str4;
        this.f90752f = z;
        this.f90753g = z2;
        this.f90755i = z3;
        this.f90754h = z4;
    }

    /* JADX INFO: renamed from: a */
    public static int m118068a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m118069b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !zlk0.m220238L(str);
    }

    /* JADX INFO: renamed from: d */
    public static du6 m118070d(long j, rnl rnlVar, String str) {
        long j2;
        String str2;
        int length = str.length();
        char c = ';';
        int iM220252n = zlk0.m220252n(str, 0, length, ';');
        int iM220252n2 = zlk0.m220252n(str, 0, iM220252n, '=');
        String strM118073g = null;
        if (iM220252n2 == iM220252n) {
            return null;
        }
        String strM220237K = zlk0.m220237K(str, 0, iM220252n2);
        if (strM220237K.isEmpty() || zlk0.m220262x(strM220237K) != -1) {
            return null;
        }
        String strM220237K2 = zlk0.m220237K(str, iM220252n2 + 1, iM220252n);
        if (zlk0.m220262x(strM220237K2) != -1) {
            return null;
        }
        int i = iM220252n + 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        long jM118074h = 253402300799999L;
        long jM118075i = -1;
        String strSubstring = null;
        while (i < length) {
            int iM220252n3 = zlk0.m220252n(str, i, length, c);
            int iM220252n4 = zlk0.m220252n(str, i, iM220252n3, '=');
            String strM220237K3 = zlk0.m220237K(str, i, iM220252n4);
            String strM220237K4 = iM220252n4 < iM220252n3 ? zlk0.m220237K(str, iM220252n4 + 1, iM220252n3) : "";
            if (strM220237K3.equalsIgnoreCase("expires")) {
                try {
                    jM118074h = m118074h(strM220237K4, 0, strM220237K4.length());
                    z3 = true;
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (strM220237K3.equalsIgnoreCase("max-age")) {
                jM118075i = m118075i(strM220237K4);
                z3 = true;
            } else if (strM220237K3.equalsIgnoreCase("domain")) {
                strM118073g = m118073g(strM220237K4);
                z4 = false;
            } else if (strM220237K3.equalsIgnoreCase("path")) {
                strSubstring = strM220237K4;
            } else if (strM220237K3.equalsIgnoreCase("secure")) {
                z = true;
            } else if (strM220237K3.equalsIgnoreCase("httponly")) {
                z2 = true;
            }
            i = iM220252n3 + 1;
            c = ';';
        }
        if (jM118075i == Long.MIN_VALUE) {
            j2 = Long.MIN_VALUE;
        } else if (jM118075i != -1) {
            long j3 = j + (jM118075i <= 9223372036854775L ? jM118075i * 1000 : Long.MAX_VALUE);
            j2 = (j3 < j || j3 > 253402300799999L) ? 253402300799999L : j3;
        } else {
            j2 = jM118074h;
        }
        String strM182286m = rnlVar.m182286m();
        if (strM118073g == null) {
            str2 = strM182286m;
        } else {
            if (!m118069b(strM182286m, strM118073g)) {
                return null;
            }
            str2 = strM118073g;
        }
        if (strM182286m.length() != str2.length() && PublicSuffixDatabase.m222311c().m222313d(str2) == null) {
            return null;
        }
        if (strSubstring == null || !strSubstring.startsWith("/")) {
            String strM182282h = rnlVar.m182282h();
            int iLastIndexOf = strM182282h.lastIndexOf(47);
            strSubstring = iLastIndexOf != 0 ? strM182282h.substring(0, iLastIndexOf) : "/";
        }
        return new du6(strM220237K, strM220237K2, j2, str2, strSubstring, z, z2, z4, z3);
    }

    /* JADX INFO: renamed from: e */
    public static du6 m118071e(rnl rnlVar, String str) {
        return m118070d(System.currentTimeMillis(), rnlVar, str);
    }

    /* JADX INFO: renamed from: f */
    public static List<du6> m118072f(rnl rnlVar, e0l e0lVar) {
        List<String> listM118881n = e0lVar.m118881n(HttpHeaders.SET_COOKIE);
        int size = listM118881n.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            du6 du6VarM118071e = m118071e(rnlVar, listM118881n.get(i));
            if (du6VarM118071e != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(du6VarM118071e);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: g */
    public static String m118073g(String str) {
        if (str.endsWith(".")) {
            fig0.m125680a();
            return null;
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String strM220242d = zlk0.m220242d(str);
        if (strM220242d != null) {
            return strM220242d;
        }
        fig0.m125680a();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX INFO: renamed from: h */
    public static long m118074h(String str, int i, int i2) {
        int iM118068a = m118068a(str, i, i2, false);
        Matcher matcher = f90746m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iIndexOf = -1;
        int i6 = -1;
        int i7 = -1;
        while (iM118068a < i2) {
            int iM118068a2 = m118068a(str, iM118068a + 1, i2, true);
            matcher.region(iM118068a, iM118068a2);
            if (i4 == -1 && matcher.usePattern(f90746m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f90745l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern = f90744k;
                if (matcher.usePattern(pattern).matches()) {
                    iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i3 != -1 && matcher.usePattern(f90743j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else if (i3 != -1) {
            }
            iM118068a = m118068a(str, iM118068a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += Constants.UPNP_MULTICAST_PORT;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            fig0.m125680a();
            return 0L;
        }
        if (iIndexOf == -1) {
            fig0.m125680a();
            return 0L;
        }
        if (i5 < 1 || i5 > 31) {
            fig0.m125680a();
            return 0L;
        }
        if (i4 < 0 || i4 > 23) {
            fig0.m125680a();
            return 0L;
        }
        if (i6 < 0 || i6 > 59) {
            fig0.m125680a();
            return 0L;
        }
        if (i7 < 0 || i7 > 59) {
            fig0.m125680a();
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(zlk0.f204954i);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, iIndexOf - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: i */
    public static long m118075i(String str) {
        try {
            long j = Long.parseLong(str);
            if (j <= 0) {
                return Long.MIN_VALUE;
            }
            return j;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m118076c() {
        return this.f90747a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof du6)) {
            return false;
        }
        du6 du6Var = (du6) obj;
        return du6Var.f90747a.equals(this.f90747a) && du6Var.f90748b.equals(this.f90748b) && du6Var.f90750d.equals(this.f90750d) && du6Var.f90751e.equals(this.f90751e) && du6Var.f90749c == this.f90749c && du6Var.f90752f == this.f90752f && du6Var.f90753g == this.f90753g && du6Var.f90754h == this.f90754h && du6Var.f90755i == this.f90755i;
    }

    public int hashCode() {
        int iHashCode = (((((((527 + this.f90747a.hashCode()) * 31) + this.f90748b.hashCode()) * 31) + this.f90750d.hashCode()) * 31) + this.f90751e.hashCode()) * 31;
        long j = this.f90749c;
        return ((((((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f90752f ? 1 : 0)) * 31) + (!this.f90753g ? 1 : 0)) * 31) + (!this.f90754h ? 1 : 0)) * 31) + (!this.f90755i ? 1 : 0);
    }

    /* JADX INFO: renamed from: j */
    public String m118077j(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f90747a);
        sb.append('=');
        sb.append(this.f90748b);
        if (this.f90754h) {
            if (this.f90749c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(pml.m172951a(new Date(this.f90749c)));
            }
        }
        if (!this.f90755i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f90750d);
        }
        sb.append("; path=");
        sb.append(this.f90751e);
        if (this.f90752f) {
            sb.append("; secure");
        }
        if (this.f90753g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public String m118078k() {
        return this.f90748b;
    }

    public String toString() {
        return m118077j(false);
    }
}
