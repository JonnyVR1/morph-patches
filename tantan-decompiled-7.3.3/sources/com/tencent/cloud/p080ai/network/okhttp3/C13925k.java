package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.C13886b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.publicsuffix.C13917a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.model.Constants;
import p153l.fig0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.k */
/* JADX INFO: loaded from: classes12.dex */
public final class C13925k {

    /* JADX INFO: renamed from: j */
    public static final Pattern f57735j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k */
    public static final Pattern f57736k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f57737l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f57738m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public final String f57739a;

    /* JADX INFO: renamed from: b */
    public final String f57740b;

    /* JADX INFO: renamed from: c */
    public final long f57741c;

    /* JADX INFO: renamed from: d */
    public final String f57742d;

    /* JADX INFO: renamed from: e */
    public final String f57743e;

    /* JADX INFO: renamed from: f */
    public final boolean f57744f;

    /* JADX INFO: renamed from: g */
    public final boolean f57745g;

    /* JADX INFO: renamed from: h */
    public final boolean f57746h;

    /* JADX INFO: renamed from: i */
    public final boolean f57747i;

    public C13925k(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f57739a = str;
        this.f57740b = str2;
        this.f57741c = j;
        this.f57742d = str3;
        this.f57743e = str4;
        this.f57744f = z;
        this.f57745g = z2;
        this.f57747i = z3;
        this.f57746h = z4;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01b0 A[PHI: r17
      0x01b0: PHI (r17v6 int) = (r17v4 int), (r17v7 int) binds: [B:106:0x01ae, B:100:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x0230  */
    /* JADX WARN: Code duplicated, block: B:147:0x0236  */
    /* JADX WARN: Code duplicated, block: B:150:0x023f A[LOOP:5: B:145:0x0232->B:150:0x023f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x0242 A[EDGE_INSN: B:151:0x0242->B:152:0x0244 BREAK  A[LOOP:5: B:145:0x0232->B:150:0x023f]] */
    /* JADX WARN: Code duplicated, block: B:153:0x0246  */
    /* JADX WARN: Code duplicated, block: B:154:0x0253  */
    /* JADX WARN: Code duplicated, block: B:157:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x025c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0263  */
    /* JADX WARN: Code duplicated, block: B:161:0x0267  */
    /* JADX WARN: Code duplicated, block: B:162:0x026e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0275  */
    /* JADX WARN: Code duplicated, block: B:169:0x027c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0286  */
    /* JADX WARN: Code duplicated, block: B:172:0x0289  */
    /* JADX WARN: Code duplicated, block: B:175:0x0293  */
    /* JADX WARN: Code duplicated, block: B:177:0x0297  */
    /* JADX WARN: Code duplicated, block: B:181:0x02aa A[LOOP:6: B:179:0x02a7->B:181:0x02aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x02c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:229:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0244 A[EDGE_INSN: B:230:0x0244->B:152:0x0244 BREAK  A[LOOP:5: B:145:0x0232->B:150:0x023f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX INFO: renamed from: a */
    public static C13925k m83017a(long j, C13930p c13930p, String str) {
        long j2;
        int i;
        String strM82987a;
        String strM82987a2;
        String strM82987a3;
        String[] strArrSplit;
        String[] strArrSplit2;
        int i2;
        int length;
        int length2;
        int i3;
        StringBuilder sb;
        String[] strArrSplit3;
        String string;
        int i4;
        int length3 = str.length();
        int i5 = 0;
        char c = ';';
        int iM82782a = C13869c.m82782a(str, 0, length3, ';');
        int iM82782a2 = C13869c.m82782a(str, 0, iM82782a, '=');
        String str2 = null;
        if (iM82782a2 == iM82782a) {
            return null;
        }
        String strM82810d = C13869c.m82810d(str, 0, iM82782a2);
        if (strM82810d.isEmpty() || C13869c.m82804b(strM82810d) != -1) {
            return null;
        }
        String strM82810d2 = C13869c.m82810d(str, iM82782a2 + 1, iM82782a);
        if (C13869c.m82804b(strM82810d2) != -1) {
            return null;
        }
        int i6 = iM82782a + 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String strSubstring = null;
        boolean z4 = true;
        long j3 = -1;
        long jM83016a = 253402300799999L;
        while (true) {
            if (i6 >= length3) {
                if (j3 == Long.MIN_VALUE) {
                    j2 = Long.MIN_VALUE;
                } else if (j3 != -1) {
                    long j4 = j + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                    j2 = (j4 < j || j4 > 253402300799999L) ? 253402300799999L : j4;
                } else {
                    j2 = jM83016a;
                }
                String str3 = c13930p.f57760d;
                if (str2 == null) {
                    str2 = str3;
                } else if (!str3.equals(str2) && (!str3.endsWith(str2) || str3.charAt((str3.length() - str2.length()) - 1) != '.' || C13869c.f57313k.matcher(str3).matches())) {
                    return null;
                }
                if (str3.length() != str2.length()) {
                    C13917a c13917a = C13917a.f57654h;
                    c13917a.getClass();
                    String[] strArrSplit4 = IDN.toUnicode(str2).split("\\.");
                    if (c13917a.f57655a.get() || !c13917a.f57655a.compareAndSet(false, true)) {
                        i = 0;
                        try {
                            c13917a.f57656b.await();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        boolean z5 = false;
                        while (true) {
                            try {
                                try {
                                    try {
                                        c13917a.m82988a();
                                        break;
                                    } catch (Throwable th) {
                                        if (z5) {
                                            Thread.currentThread().interrupt();
                                        }
                                        throw th;
                                    }
                                } catch (InterruptedIOException unused2) {
                                    int i7 = i5;
                                    Thread.interrupted();
                                    z5 = true;
                                    i5 = i7;
                                }
                            } catch (IOException e) {
                                i = i5;
                                C13915c.f57649a.mo82971a(5, "Failed to read public suffix list", e);
                                if (z5) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                        i = i5;
                        if (z5) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    synchronized (c13917a) {
                        if (c13917a.f57657c == null) {
                            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
                        }
                    }
                    int length4 = strArrSplit4.length;
                    byte[][] bArr = new byte[length4][];
                    for (int i8 = i; i8 < strArrSplit4.length; i8++) {
                        bArr[i8] = strArrSplit4[i8].getBytes(StandardCharsets.UTF_8);
                    }
                    int i9 = i;
                    while (true) {
                        if (i9 >= length4) {
                            strM82987a = null;
                            break;
                        }
                        strM82987a = C13917a.m82987a(c13917a.f57657c, bArr, i9);
                        if (strM82987a != null) {
                            break;
                        }
                        i9++;
                    }
                    if (length4 > 1) {
                        byte[][] bArr2 = (byte[][]) bArr.clone();
                        int i10 = i;
                        while (true) {
                            if (i10 < bArr2.length - 1) {
                                bArr2[i10] = C13917a.f57651e;
                                strM82987a2 = C13917a.m82987a(c13917a.f57657c, bArr2, i10);
                                if (strM82987a2 != null) {
                                    break;
                                }
                                i10++;
                            }
                        }
                        if (strM82987a2 != null) {
                            strM82987a3 = null;
                            break;
                        }
                        i4 = i;
                        while (true) {
                            if (i4 < length4 - 1) {
                                strM82987a3 = null;
                                break;
                            }
                            strM82987a3 = C13917a.m82987a(c13917a.f57658d, bArr, i4);
                            if (strM82987a3 != null) {
                                break;
                            }
                            i4++;
                        }
                        if (strM82987a3 != null) {
                            strArrSplit = "!".concat(strM82987a3).split("\\.");
                        } else if (strM82987a == null || strM82987a2 != null) {
                            if (strM82987a != null) {
                                strArrSplit = strM82987a.split("\\.");
                            } else {
                                strArrSplit = C13917a.f57652f;
                            }
                            if (strM82987a2 != null) {
                                strArrSplit2 = strM82987a2.split("\\.");
                            } else {
                                strArrSplit2 = C13917a.f57652f;
                            }
                            if (strArrSplit.length <= strArrSplit2.length) {
                                strArrSplit = strArrSplit2;
                            }
                        } else {
                            strArrSplit = C13917a.f57653g;
                        }
                        if (strArrSplit4.length == strArrSplit.length) {
                            i2 = i;
                            if (strArrSplit[i].charAt(i2) != '!') {
                                string = null;
                            }
                            if (string == null) {
                                return null;
                            }
                        } else {
                            i2 = i;
                        }
                        if (strArrSplit[i2].charAt(i2) == '!') {
                            length = strArrSplit4.length;
                            length2 = strArrSplit.length;
                        } else {
                            length = strArrSplit4.length;
                            length2 = strArrSplit.length + 1;
                        }
                        sb = new StringBuilder();
                        strArrSplit3 = str2.split("\\.");
                        for (i3 = length - length2; i3 < strArrSplit3.length; i3++) {
                            sb.append(strArrSplit3[i3]);
                            sb.append('.');
                        }
                        sb.deleteCharAt(sb.length() - 1);
                        string = sb.toString();
                        if (string == null) {
                            return null;
                        }
                    }
                    strM82987a2 = null;
                    if (strM82987a2 != null) {
                        strM82987a3 = null;
                        break;
                    }
                    i4 = i;
                    while (true) {
                        if (i4 < length4 - 1) {
                            strM82987a3 = null;
                            break;
                        }
                        strM82987a3 = C13917a.m82987a(c13917a.f57658d, bArr, i4);
                        if (strM82987a3 != null) {
                            break;
                            break;
                        }
                        i4++;
                    }
                    if (strM82987a3 != null) {
                        strArrSplit = "!".concat(strM82987a3).split("\\.");
                    } else if (strM82987a == null) {
                        if (strM82987a != null) {
                            strArrSplit = strM82987a.split("\\.");
                        } else {
                            strArrSplit = C13917a.f57652f;
                        }
                        if (strM82987a2 != null) {
                            strArrSplit2 = strM82987a2.split("\\.");
                        } else {
                            strArrSplit2 = C13917a.f57652f;
                        }
                        if (strArrSplit.length <= strArrSplit2.length) {
                            strArrSplit = strArrSplit2;
                        }
                    } else {
                        if (strM82987a != null) {
                            strArrSplit = strM82987a.split("\\.");
                        } else {
                            strArrSplit = C13917a.f57652f;
                        }
                        if (strM82987a2 != null) {
                            strArrSplit2 = strM82987a2.split("\\.");
                        } else {
                            strArrSplit2 = C13917a.f57652f;
                        }
                        if (strArrSplit.length <= strArrSplit2.length) {
                            strArrSplit = strArrSplit2;
                        }
                    }
                    if (strArrSplit4.length == strArrSplit.length) {
                        i2 = i;
                        if (strArrSplit[i].charAt(i2) != '!') {
                            string = null;
                        }
                        if (string == null) {
                            return null;
                        }
                    } else {
                        i2 = i;
                    }
                    if (strArrSplit[i2].charAt(i2) == '!') {
                        length = strArrSplit4.length;
                        length2 = strArrSplit.length;
                    } else {
                        length = strArrSplit4.length;
                        length2 = strArrSplit.length + 1;
                    }
                    sb = new StringBuilder();
                    strArrSplit3 = str2.split("\\.");
                    while (i3 < strArrSplit3.length) {
                        sb.append(strArrSplit3[i3]);
                        sb.append('.');
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    string = sb.toString();
                    if (string == null) {
                        return null;
                    }
                }
                if (strSubstring == null || !strSubstring.startsWith("/")) {
                    String strM83045b = c13930p.m83045b();
                    int iLastIndexOf = strM83045b.lastIndexOf(47);
                    strSubstring = iLastIndexOf != 0 ? strM83045b.substring(0, iLastIndexOf) : "/";
                }
                return new C13925k(strM82810d, strM82810d2, j2, str2, strSubstring, z2, z3, z4, z);
            }
            int iM82782a3 = C13869c.m82782a(str, i6, length3, c);
            int iM82782a4 = C13869c.m82782a(str, i6, iM82782a3, '=');
            String strM82810d3 = C13869c.m82810d(str, i6, iM82782a4);
            String strM82810d4 = iM82782a4 < iM82782a3 ? C13869c.m82810d(str, iM82782a4 + 1, iM82782a3) : "";
            if (strM82810d3.equalsIgnoreCase("expires")) {
                try {
                    jM83016a = m83016a(strM82810d4, 0, strM82810d4.length());
                    z = true;
                } catch (NumberFormatException | IllegalArgumentException unused3) {
                }
            } else if (strM82810d3.equalsIgnoreCase("max-age")) {
                try {
                    j3 = Long.parseLong(strM82810d4);
                    if (j3 <= 0) {
                        j3 = Long.MIN_VALUE;
                    }
                } catch (NumberFormatException e2) {
                    if (!strM82810d4.matches("-?\\d+")) {
                        throw e2;
                    }
                    if (strM82810d4.startsWith("-")) {
                        j3 = Long.MIN_VALUE;
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                }
                z = true;
            } else if (strM82810d3.equalsIgnoreCase("domain")) {
                if (strM82810d4.endsWith(".")) {
                    throw new IllegalArgumentException();
                }
                if (strM82810d4.startsWith(".")) {
                    strM82810d4 = strM82810d4.substring(1);
                }
                String strM82787a = C13869c.m82787a(strM82810d4);
                if (strM82787a == null) {
                    throw new IllegalArgumentException();
                }
                str2 = strM82787a;
                z4 = false;
            } else if (strM82810d3.equalsIgnoreCase("path")) {
                strSubstring = strM82810d4;
            } else if (strM82810d3.equalsIgnoreCase("secure")) {
                z2 = true;
            } else if (strM82810d3.equalsIgnoreCase("httponly")) {
                z3 = true;
            }
            i6 = iM82782a3 + 1;
            c = ';';
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13925k)) {
            return false;
        }
        C13925k c13925k = (C13925k) obj;
        return c13925k.f57739a.equals(this.f57739a) && c13925k.f57740b.equals(this.f57740b) && c13925k.f57742d.equals(this.f57742d) && c13925k.f57743e.equals(this.f57743e) && c13925k.f57741c == this.f57741c && c13925k.f57744f == this.f57744f && c13925k.f57745g == this.f57745g && c13925k.f57746h == this.f57746h && c13925k.f57747i == this.f57747i;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f57739a.hashCode() + 527) * 31) + this.f57740b.hashCode()) * 31) + this.f57742d.hashCode()) * 31) + this.f57743e.hashCode()) * 31;
        long j = this.f57741c;
        return ((((((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f57744f ? 1 : 0)) * 31) + (!this.f57745g ? 1 : 0)) * 31) + (!this.f57746h ? 1 : 0)) * 31) + (!this.f57747i ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57739a);
        sb.append('=');
        sb.append(this.f57740b);
        if (this.f57746h) {
            if (this.f57741c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C13886b.f57422a.get().format(new Date(this.f57741c)));
            }
        }
        if (!this.f57747i) {
            sb.append("; domain=");
            sb.append(this.f57742d);
        }
        sb.append("; path=");
        sb.append(this.f57743e);
        if (this.f57744f) {
            sb.append("; secure");
        }
        if (this.f57745g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX INFO: renamed from: a */
    public static long m83016a(String str, int i, int i2) {
        int iM83015a = m83015a(str, i, i2, false);
        Matcher matcher = f57738m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iIndexOf = -1;
        int i6 = -1;
        int i7 = -1;
        while (iM83015a < i2) {
            int iM83015a2 = m83015a(str, iM83015a + 1, i2, true);
            matcher.region(iM83015a, iM83015a2);
            if (i4 == -1 && matcher.usePattern(f57738m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f57737l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern = f57736k;
                if (matcher.usePattern(pattern).matches()) {
                    iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i3 != -1 && matcher.usePattern(f57735j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else if (i3 != -1) {
            }
            iM83015a = m83015a(str, iM83015a2 + 1, i2, false);
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
        if (i7 >= 0 && i7 <= 59) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C13869c.f57310h);
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
        fig0.m125680a();
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public static int m83015a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static List<C13925k> m83018a(C13930p c13930p, C13929o c13929o) {
        List<String> listM83031c = c13929o.m83031c(HttpHeaders.SET_COOKIE);
        int size = listM83031c.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C13925k c13925kM83017a = m83017a(System.currentTimeMillis(), c13930p, listM83031c.get(i));
            if (c13925kM83017a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c13925kM83017a);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }
}
