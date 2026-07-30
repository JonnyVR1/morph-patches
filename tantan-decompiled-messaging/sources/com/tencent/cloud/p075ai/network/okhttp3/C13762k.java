package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.C13723b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.publicsuffix.C13754a;
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
import org.fourthline.cling.model.Constants;
import p149l.x9g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.k */
/* JADX INFO: loaded from: classes13.dex */
public final class C13762k {

    /* JADX INFO: renamed from: j */
    public static final Pattern f56887j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k */
    public static final Pattern f56888k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f56889l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f56890m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public final String f56891a;

    /* JADX INFO: renamed from: b */
    public final String f56892b;

    /* JADX INFO: renamed from: c */
    public final long f56893c;

    /* JADX INFO: renamed from: d */
    public final String f56894d;

    /* JADX INFO: renamed from: e */
    public final String f56895e;

    /* JADX INFO: renamed from: f */
    public final boolean f56896f;

    /* JADX INFO: renamed from: g */
    public final boolean f56897g;

    /* JADX INFO: renamed from: h */
    public final boolean f56898h;

    /* JADX INFO: renamed from: i */
    public final boolean f56899i;

    public C13762k(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f56891a = str;
        this.f56892b = str2;
        this.f56893c = j;
        this.f56894d = str3;
        this.f56895e = str4;
        this.f56896f = z;
        this.f56897g = z2;
        this.f56899i = z3;
        this.f56898h = z4;
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
    public static C13762k m81834a(long j, C13767p c13767p, String str) {
        long j2;
        int i;
        String strM81804a;
        String strM81804a2;
        String strM81804a3;
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
        int iM81599a = C13706c.m81599a(str, 0, length3, ';');
        int iM81599a2 = C13706c.m81599a(str, 0, iM81599a, '=');
        String str2 = null;
        if (iM81599a2 == iM81599a) {
            return null;
        }
        String strM81627d = C13706c.m81627d(str, 0, iM81599a2);
        if (strM81627d.isEmpty() || C13706c.m81621b(strM81627d) != -1) {
            return null;
        }
        String strM81627d2 = C13706c.m81627d(str, iM81599a2 + 1, iM81599a);
        if (C13706c.m81621b(strM81627d2) != -1) {
            return null;
        }
        int i6 = iM81599a + 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String strSubstring = null;
        boolean z4 = true;
        long j3 = -1;
        long jM81833a = 253402300799999L;
        while (true) {
            if (i6 >= length3) {
                if (j3 == Long.MIN_VALUE) {
                    j2 = Long.MIN_VALUE;
                } else if (j3 != -1) {
                    long j4 = j + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                    j2 = (j4 < j || j4 > 253402300799999L) ? 253402300799999L : j4;
                } else {
                    j2 = jM81833a;
                }
                String str3 = c13767p.f56912d;
                if (str2 == null) {
                    str2 = str3;
                } else if (!str3.equals(str2) && (!str3.endsWith(str2) || str3.charAt((str3.length() - str2.length()) - 1) != '.' || C13706c.f56465k.matcher(str3).matches())) {
                    return null;
                }
                if (str3.length() != str2.length()) {
                    C13754a c13754a = C13754a.f56806h;
                    c13754a.getClass();
                    String[] strArrSplit4 = IDN.toUnicode(str2).split("\\.");
                    if (c13754a.f56807a.get() || !c13754a.f56807a.compareAndSet(false, true)) {
                        i = 0;
                        try {
                            c13754a.f56808b.await();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        boolean z5 = false;
                        while (true) {
                            try {
                                try {
                                    try {
                                        c13754a.m81805a();
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
                                C13752c.f56801a.mo81788a(5, "Failed to read public suffix list", e);
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
                    synchronized (c13754a) {
                        if (c13754a.f56809c == null) {
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
                            strM81804a = null;
                            break;
                        }
                        strM81804a = C13754a.m81804a(c13754a.f56809c, bArr, i9);
                        if (strM81804a != null) {
                            break;
                        }
                        i9++;
                    }
                    if (length4 > 1) {
                        byte[][] bArr2 = (byte[][]) bArr.clone();
                        int i10 = i;
                        while (true) {
                            if (i10 < bArr2.length - 1) {
                                bArr2[i10] = C13754a.f56803e;
                                strM81804a2 = C13754a.m81804a(c13754a.f56809c, bArr2, i10);
                                if (strM81804a2 != null) {
                                    break;
                                }
                                i10++;
                            }
                        }
                        if (strM81804a2 != null) {
                            strM81804a3 = null;
                            break;
                        }
                        i4 = i;
                        while (true) {
                            if (i4 < length4 - 1) {
                                strM81804a3 = null;
                                break;
                            }
                            strM81804a3 = C13754a.m81804a(c13754a.f56810d, bArr, i4);
                            if (strM81804a3 != null) {
                                break;
                            }
                            i4++;
                        }
                        if (strM81804a3 != null) {
                            strArrSplit = "!".concat(strM81804a3).split("\\.");
                        } else if (strM81804a == null || strM81804a2 != null) {
                            if (strM81804a != null) {
                                strArrSplit = strM81804a.split("\\.");
                            } else {
                                strArrSplit = C13754a.f56804f;
                            }
                            if (strM81804a2 != null) {
                                strArrSplit2 = strM81804a2.split("\\.");
                            } else {
                                strArrSplit2 = C13754a.f56804f;
                            }
                            if (strArrSplit.length <= strArrSplit2.length) {
                                strArrSplit = strArrSplit2;
                            }
                        } else {
                            strArrSplit = C13754a.f56805g;
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
                    strM81804a2 = null;
                    if (strM81804a2 != null) {
                        strM81804a3 = null;
                        break;
                    }
                    i4 = i;
                    while (true) {
                        if (i4 < length4 - 1) {
                            strM81804a3 = null;
                            break;
                        }
                        strM81804a3 = C13754a.m81804a(c13754a.f56810d, bArr, i4);
                        if (strM81804a3 != null) {
                            break;
                            break;
                        }
                        i4++;
                    }
                    if (strM81804a3 != null) {
                        strArrSplit = "!".concat(strM81804a3).split("\\.");
                    } else if (strM81804a == null) {
                        if (strM81804a != null) {
                            strArrSplit = strM81804a.split("\\.");
                        } else {
                            strArrSplit = C13754a.f56804f;
                        }
                        if (strM81804a2 != null) {
                            strArrSplit2 = strM81804a2.split("\\.");
                        } else {
                            strArrSplit2 = C13754a.f56804f;
                        }
                        if (strArrSplit.length <= strArrSplit2.length) {
                            strArrSplit = strArrSplit2;
                        }
                    } else {
                        if (strM81804a != null) {
                            strArrSplit = strM81804a.split("\\.");
                        } else {
                            strArrSplit = C13754a.f56804f;
                        }
                        if (strM81804a2 != null) {
                            strArrSplit2 = strM81804a2.split("\\.");
                        } else {
                            strArrSplit2 = C13754a.f56804f;
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
                    String strM81862b = c13767p.m81862b();
                    int iLastIndexOf = strM81862b.lastIndexOf(47);
                    strSubstring = iLastIndexOf != 0 ? strM81862b.substring(0, iLastIndexOf) : "/";
                }
                return new C13762k(strM81627d, strM81627d2, j2, str2, strSubstring, z2, z3, z4, z);
            }
            int iM81599a3 = C13706c.m81599a(str, i6, length3, c);
            int iM81599a4 = C13706c.m81599a(str, i6, iM81599a3, '=');
            String strM81627d3 = C13706c.m81627d(str, i6, iM81599a4);
            String strM81627d4 = iM81599a4 < iM81599a3 ? C13706c.m81627d(str, iM81599a4 + 1, iM81599a3) : "";
            if (strM81627d3.equalsIgnoreCase("expires")) {
                try {
                    jM81833a = m81833a(strM81627d4, 0, strM81627d4.length());
                    z = true;
                } catch (NumberFormatException | IllegalArgumentException unused3) {
                }
            } else if (strM81627d3.equalsIgnoreCase("max-age")) {
                try {
                    j3 = Long.parseLong(strM81627d4);
                    if (j3 <= 0) {
                        j3 = Long.MIN_VALUE;
                    }
                } catch (NumberFormatException e2) {
                    if (!strM81627d4.matches("-?\\d+")) {
                        throw e2;
                    }
                    if (strM81627d4.startsWith("-")) {
                        j3 = Long.MIN_VALUE;
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                }
                z = true;
            } else if (strM81627d3.equalsIgnoreCase("domain")) {
                if (strM81627d4.endsWith(".")) {
                    throw new IllegalArgumentException();
                }
                if (strM81627d4.startsWith(".")) {
                    strM81627d4 = strM81627d4.substring(1);
                }
                String strM81604a = C13706c.m81604a(strM81627d4);
                if (strM81604a == null) {
                    throw new IllegalArgumentException();
                }
                str2 = strM81604a;
                z4 = false;
            } else if (strM81627d3.equalsIgnoreCase("path")) {
                strSubstring = strM81627d4;
            } else if (strM81627d3.equalsIgnoreCase("secure")) {
                z2 = true;
            } else if (strM81627d3.equalsIgnoreCase("httponly")) {
                z3 = true;
            }
            i6 = iM81599a3 + 1;
            c = ';';
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13762k)) {
            return false;
        }
        C13762k c13762k = (C13762k) obj;
        return c13762k.f56891a.equals(this.f56891a) && c13762k.f56892b.equals(this.f56892b) && c13762k.f56894d.equals(this.f56894d) && c13762k.f56895e.equals(this.f56895e) && c13762k.f56893c == this.f56893c && c13762k.f56896f == this.f56896f && c13762k.f56897g == this.f56897g && c13762k.f56898h == this.f56898h && c13762k.f56899i == this.f56899i;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f56891a.hashCode() + 527) * 31) + this.f56892b.hashCode()) * 31) + this.f56894d.hashCode()) * 31) + this.f56895e.hashCode()) * 31;
        long j = this.f56893c;
        return ((((((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f56896f ? 1 : 0)) * 31) + (!this.f56897g ? 1 : 0)) * 31) + (!this.f56898h ? 1 : 0)) * 31) + (!this.f56899i ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56891a);
        sb.append('=');
        sb.append(this.f56892b);
        if (this.f56898h) {
            if (this.f56893c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C13723b.f56574a.get().format(new Date(this.f56893c)));
            }
        }
        if (!this.f56899i) {
            sb.append("; domain=");
            sb.append(this.f56894d);
        }
        sb.append("; path=");
        sb.append(this.f56895e);
        if (this.f56896f) {
            sb.append("; secure");
        }
        if (this.f56897g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX INFO: renamed from: a */
    public static long m81833a(String str, int i, int i2) {
        int iM81832a = m81832a(str, i, i2, false);
        Matcher matcher = f56890m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iIndexOf = -1;
        int i6 = -1;
        int i7 = -1;
        while (iM81832a < i2) {
            int iM81832a2 = m81832a(str, iM81832a + 1, i2, true);
            matcher.region(iM81832a, iM81832a2);
            if (i4 == -1 && matcher.usePattern(f56890m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f56889l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern = f56888k;
                if (matcher.usePattern(pattern).matches()) {
                    iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i3 != -1 && matcher.usePattern(f56887j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else if (i3 != -1) {
            }
            iM81832a = m81832a(str, iM81832a2 + 1, i2, false);
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
        if (i7 >= 0 && i7 <= 59) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C13706c.f56462h);
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
        x9g0.m207497a();
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public static int m81832a(String str, int i, int i2, boolean z) {
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
    public static List<C13762k> m81835a(C13767p c13767p, C13766o c13766o) {
        List<String> listM81848c = c13766o.m81848c("Set-Cookie");
        int size = listM81848c.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C13762k c13762kM81834a = m81834a(System.currentTimeMillis(), c13767p, listM81848c.get(i));
            if (c13762kM81834a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c13762kM81834a);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }
}
