package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.fourthline.cling.model.Constants;

/* JADX INFO: loaded from: classes2.dex */
public final class at6 {

    /* JADX INFO: renamed from: j */
    public static final Pattern f71563j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k */
    public static final Pattern f71564k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f71565l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f71566m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public final String f71567a;

    /* JADX INFO: renamed from: b */
    public final String f71568b;

    /* JADX INFO: renamed from: c */
    public final long f71569c;

    /* JADX INFO: renamed from: d */
    public final String f71570d;

    /* JADX INFO: renamed from: e */
    public final String f71571e;

    /* JADX INFO: renamed from: f */
    public final boolean f71572f;

    /* JADX INFO: renamed from: g */
    public final boolean f71573g;

    /* JADX INFO: renamed from: h */
    public final boolean f71574h;

    /* JADX INFO: renamed from: i */
    public final boolean f71575i;

    /* JADX INFO: renamed from: l.at6$a */
    public static final class C15711a {

        /* JADX INFO: renamed from: a */
        public String f71576a;

        /* JADX INFO: renamed from: b */
        public String f71577b;

        /* JADX INFO: renamed from: d */
        public String f71579d;

        /* JADX INFO: renamed from: f */
        public boolean f71581f;

        /* JADX INFO: renamed from: g */
        public boolean f71582g;

        /* JADX INFO: renamed from: h */
        public boolean f71583h;

        /* JADX INFO: renamed from: i */
        public boolean f71584i;

        /* JADX INFO: renamed from: c */
        public long f71578c = 253402300799999L;

        /* JADX INFO: renamed from: e */
        public String f71580e = "/";

        /* JADX INFO: renamed from: a */
        public at6 m98781a() {
            return new at6(this);
        }

        /* JADX INFO: renamed from: b */
        public C15711a m98782b(String str) {
            return m98783c(str, false);
        }

        /* JADX INFO: renamed from: c */
        public final C15711a m98783c(String str, boolean z) {
            if (str == null) {
                jfd0.m141176a("domain == null");
                return null;
            }
            String strM188003d = tck0.m188003d(str);
            if (strM188003d == null) {
                ig3.m135964a("unexpected domain: ".concat(str));
                return null;
            }
            this.f71579d = strM188003d;
            this.f71584i = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C15711a m98784d(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > 253402300799999L) {
                j = 253402300799999L;
            }
            this.f71578c = j;
            this.f71583h = true;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C15711a m98785e(String str) {
            return m98783c(str, true);
        }

        /* JADX INFO: renamed from: f */
        public C15711a m98786f() {
            this.f71582g = true;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C15711a m98787g(String str) {
            if (str == null) {
                jfd0.m141176a("name == null");
                return null;
            }
            if (str.trim().equals(str)) {
                this.f71576a = str;
                return this;
            }
            ig3.m135964a("name is not trimmed");
            return null;
        }

        /* JADX INFO: renamed from: h */
        public C15711a m98788h(String str) {
            if (str.startsWith("/")) {
                this.f71580e = str;
                return this;
            }
            ig3.m135964a("path must start with '/'");
            return null;
        }

        /* JADX INFO: renamed from: i */
        public C15711a m98789i() {
            this.f71581f = true;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C15711a m98790j(String str) {
            if (str == null) {
                jfd0.m141176a("value == null");
                return null;
            }
            if (str.trim().equals(str)) {
                this.f71577b = str;
                return this;
            }
            ig3.m135964a("value is not trimmed");
            return null;
        }
    }

    public at6(C15711a c15711a) {
        String str = c15711a.f71576a;
        if (str == null) {
            jfd0.m141176a("builder.name == null");
            throw null;
        }
        String str2 = c15711a.f71577b;
        if (str2 == null) {
            jfd0.m141176a("builder.value == null");
            throw null;
        }
        String str3 = c15711a.f71579d;
        if (str3 == null) {
            jfd0.m141176a("builder.domain == null");
            throw null;
        }
        this.f71567a = str;
        this.f71568b = str2;
        this.f71569c = c15711a.f71578c;
        this.f71570d = str3;
        this.f71571e = c15711a.f71580e;
        this.f71572f = c15711a.f71581f;
        this.f71573g = c15711a.f71582g;
        this.f71574h = c15711a.f71583h;
        this.f71575i = c15711a.f71584i;
    }

    /* JADX INFO: renamed from: a */
    public static int m98763a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m98764c(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !tck0.m187999L(str);
    }

    /* JADX INFO: renamed from: h */
    public static at6 m98765h(long j, cll cllVar, String str) {
        long j2;
        String str2;
        int length = str.length();
        char c = ';';
        int iM188013n = tck0.m188013n(str, 0, length, ';');
        int iM188013n2 = tck0.m188013n(str, 0, iM188013n, '=');
        String strM98768k = null;
        if (iM188013n2 == iM188013n) {
            return null;
        }
        String strM187998K = tck0.m187998K(str, 0, iM188013n2);
        if (strM187998K.isEmpty() || tck0.m188023x(strM187998K) != -1) {
            return null;
        }
        String strM187998K2 = tck0.m187998K(str, iM188013n2 + 1, iM188013n);
        if (tck0.m188023x(strM187998K2) != -1) {
            return null;
        }
        int i = iM188013n + 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        long jM98769l = 253402300799999L;
        long jM98770m = -1;
        String strSubstring = null;
        while (i < length) {
            int iM188013n3 = tck0.m188013n(str, i, length, c);
            int iM188013n4 = tck0.m188013n(str, i, iM188013n3, '=');
            String strM187998K3 = tck0.m187998K(str, i, iM188013n4);
            String strM187998K4 = iM188013n4 < iM188013n3 ? tck0.m187998K(str, iM188013n4 + 1, iM188013n3) : "";
            if (strM187998K3.equalsIgnoreCase("expires")) {
                try {
                    jM98769l = m98769l(strM187998K4, 0, strM187998K4.length());
                    z3 = true;
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (strM187998K3.equalsIgnoreCase("max-age")) {
                jM98770m = m98770m(strM187998K4);
                z3 = true;
            } else if (strM187998K3.equalsIgnoreCase("domain")) {
                strM98768k = m98768k(strM187998K4);
                z4 = false;
            } else if (strM187998K3.equalsIgnoreCase("path")) {
                strSubstring = strM187998K4;
            } else if (strM187998K3.equalsIgnoreCase("secure")) {
                z = true;
            } else if (strM187998K3.equalsIgnoreCase("httponly")) {
                z2 = true;
            }
            i = iM188013n3 + 1;
            c = ';';
        }
        if (jM98770m == Long.MIN_VALUE) {
            j2 = Long.MIN_VALUE;
        } else if (jM98770m != -1) {
            long j3 = j + (jM98770m <= 9223372036854775L ? jM98770m * 1000 : Long.MAX_VALUE);
            j2 = (j3 < j || j3 > 253402300799999L) ? 253402300799999L : j3;
        } else {
            j2 = jM98769l;
        }
        String strM107522m = cllVar.m107522m();
        if (strM98768k == null) {
            str2 = strM107522m;
        } else {
            if (!m98764c(strM107522m, strM98768k)) {
                return null;
            }
            str2 = strM98768k;
        }
        if (strM107522m.length() != str2.length() && PublicSuffixDatabase.m221044c().m221046d(str2) == null) {
            return null;
        }
        if (strSubstring == null || !strSubstring.startsWith("/")) {
            String strM107518h = cllVar.m107518h();
            int iLastIndexOf = strM107518h.lastIndexOf(47);
            strSubstring = iLastIndexOf != 0 ? strM107518h.substring(0, iLastIndexOf) : "/";
        }
        return new at6(strM187998K, strM187998K2, j2, str2, strSubstring, z, z2, z4, z3);
    }

    /* JADX INFO: renamed from: i */
    public static at6 m98766i(cll cllVar, String str) {
        return m98765h(System.currentTimeMillis(), cllVar, str);
    }

    /* JADX INFO: renamed from: j */
    public static List<at6> m98767j(cll cllVar, oxk oxkVar) {
        List<String> listM166562n = oxkVar.m166562n("Set-Cookie");
        int size = listM166562n.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            at6 at6VarM98766i = m98766i(cllVar, listM166562n.get(i));
            if (at6VarM98766i != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(at6VarM98766i);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: k */
    public static String m98768k(String str) {
        if (str.endsWith(".")) {
            x9g0.m207497a();
            return null;
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String strM188003d = tck0.m188003d(str);
        if (strM188003d != null) {
            return strM188003d;
        }
        x9g0.m207497a();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX INFO: renamed from: l */
    public static long m98769l(String str, int i, int i2) {
        int iM98763a = m98763a(str, i, i2, false);
        Matcher matcher = f71566m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iIndexOf = -1;
        int i6 = -1;
        int i7 = -1;
        while (iM98763a < i2) {
            int iM98763a2 = m98763a(str, iM98763a + 1, i2, true);
            matcher.region(iM98763a, iM98763a2);
            if (i4 == -1 && matcher.usePattern(f71566m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f71565l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern = f71564k;
                if (matcher.usePattern(pattern).matches()) {
                    iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i3 != -1 && matcher.usePattern(f71563j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else if (i3 != -1) {
            }
            iM98763a = m98763a(str, iM98763a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += Constants.UPNP_MULTICAST_PORT;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            x9g0.m207497a();
            return 0L;
        }
        if (iIndexOf == -1) {
            x9g0.m207497a();
            return 0L;
        }
        if (i5 < 1 || i5 > 31) {
            x9g0.m207497a();
            return 0L;
        }
        if (i4 < 0 || i4 > 23) {
            x9g0.m207497a();
            return 0L;
        }
        if (i6 < 0 || i6 > 59) {
            x9g0.m207497a();
            return 0L;
        }
        if (i7 < 0 || i7 > 59) {
            x9g0.m207497a();
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(tck0.f169458i);
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

    /* JADX INFO: renamed from: m */
    public static long m98770m(String str) {
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

    /* JADX INFO: renamed from: b */
    public String m98771b() {
        return this.f71570d;
    }

    /* JADX INFO: renamed from: d */
    public long m98772d() {
        return this.f71569c;
    }

    /* JADX INFO: renamed from: e */
    public boolean m98773e() {
        return this.f71575i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof at6)) {
            return false;
        }
        at6 at6Var = (at6) obj;
        return at6Var.f71567a.equals(this.f71567a) && at6Var.f71568b.equals(this.f71568b) && at6Var.f71570d.equals(this.f71570d) && at6Var.f71571e.equals(this.f71571e) && at6Var.f71569c == this.f71569c && at6Var.f71572f == this.f71572f && at6Var.f71573g == this.f71573g && at6Var.f71574h == this.f71574h && at6Var.f71575i == this.f71575i;
    }

    /* JADX INFO: renamed from: f */
    public boolean m98774f() {
        return this.f71573g;
    }

    /* JADX INFO: renamed from: g */
    public String m98775g() {
        return this.f71567a;
    }

    public int hashCode() {
        int iHashCode = (((((((527 + this.f71567a.hashCode()) * 31) + this.f71568b.hashCode()) * 31) + this.f71570d.hashCode()) * 31) + this.f71571e.hashCode()) * 31;
        long j = this.f71569c;
        return ((((((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f71572f ? 1 : 0)) * 31) + (!this.f71573g ? 1 : 0)) * 31) + (!this.f71574h ? 1 : 0)) * 31) + (!this.f71575i ? 1 : 0);
    }

    /* JADX INFO: renamed from: n */
    public String m98776n() {
        return this.f71571e;
    }

    /* JADX INFO: renamed from: o */
    public boolean m98777o() {
        return this.f71574h;
    }

    /* JADX INFO: renamed from: p */
    public boolean m98778p() {
        return this.f71572f;
    }

    /* JADX INFO: renamed from: q */
    public String m98779q(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f71567a);
        sb.append('=');
        sb.append(this.f71568b);
        if (this.f71574h) {
            if (this.f71569c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(bkl.m102412a(new Date(this.f71569c)));
            }
        }
        if (!this.f71575i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f71570d);
        }
        sb.append("; path=");
        sb.append(this.f71571e);
        if (this.f71572f) {
            sb.append("; secure");
        }
        if (this.f71573g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public String m98780r() {
        return this.f71568b;
    }

    public String toString() {
        return m98779q(false);
    }

    public at6(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f71567a = str;
        this.f71568b = str2;
        this.f71569c = j;
        this.f71570d = str3;
        this.f71571e = str4;
        this.f71572f = z;
        this.f71573g = z2;
        this.f71575i = z3;
        this.f71574h = z4;
    }
}
