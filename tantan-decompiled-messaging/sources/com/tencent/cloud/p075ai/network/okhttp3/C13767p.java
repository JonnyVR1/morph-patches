package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.jetty.util.URIUtil;
import org.java_websocket.WebSocket;
import org.slf4j.Marker;
import org.spongycastle.pqc.math.linearalgebra.Matrix;
import p149l.aag0;
import p149l.all;
import p149l.bll;
import p149l.ig3;
import p149l.jfd0;
import p149l.k250;
import p149l.qkq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.p */
/* JADX INFO: loaded from: classes13.dex */
public final class C13767p {

    /* JADX INFO: renamed from: i */
    public static final char[] f56908i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final String f56909a;

    /* JADX INFO: renamed from: b */
    public final String f56910b;

    /* JADX INFO: renamed from: c */
    public final String f56911c;

    /* JADX INFO: renamed from: d */
    public final String f56912d;

    /* JADX INFO: renamed from: e */
    public final int f56913e;

    /* JADX INFO: renamed from: f */
    public final List<String> f56914f;

    /* JADX INFO: renamed from: g */
    public final String f56915g;

    /* JADX INFO: renamed from: h */
    public final String f56916h;

    public C13767p(a aVar) {
        this.f56909a = aVar.f56917a;
        this.f56910b = m81856a(aVar.f56918b, false);
        this.f56911c = m81856a(aVar.f56919c, false);
        this.f56912d = aVar.f56920d;
        this.f56913e = aVar.m81873b();
        m81861a(aVar.f56922f, false);
        List<String> list = aVar.f56923g;
        this.f56914f = list != null ? m81861a(list, true) : null;
        String str = aVar.f56924h;
        this.f56915g = str != null ? m81856a(str, false) : null;
        this.f56916h = aVar.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m81853a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z || (z2 && !m81858a(str, iCharCount, i2)))) || (iCodePointAt == 43 && z3)))) {
                C13776e c13776e = new C13776e();
                c13776e.m81906a(str, i, iCharCount);
                C13776e c13776e2 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            c13776e.mo81909a(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z4) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z || (z2 && !m81858a(str, iCharCount, i2)))))) {
                            if (c13776e2 == null) {
                                c13776e2 = new C13776e();
                            }
                            c13776e2.m81938h(iCodePointAt2);
                            while (!c13776e2.mo81935g()) {
                                byte b = c13776e2.readByte();
                                c13776e.mo81923c(37);
                                char[] cArr = f56908i;
                                c13776e.mo81923c((int) cArr[((b & 255) >> 4) & 15]);
                                c13776e.mo81923c((int) cArr[b & 15]);
                            }
                        } else {
                            c13776e.m81938h(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return c13776e.m81947n();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m81859b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public List<String> m81863c() {
        int iIndexOf = this.f56916h.indexOf(47, this.f56909a.length() + 3);
        String str = this.f56916h;
        int iM81600a = C13706c.m81600a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM81600a) {
            int i = iIndexOf + 1;
            int iM81599a = C13706c.m81599a(this.f56916h, i, iM81600a, '/');
            arrayList.add(this.f56916h.substring(i, iM81599a));
            iIndexOf = iM81599a;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public String m81864d() {
        if (this.f56914f == null) {
            return null;
        }
        int iIndexOf = this.f56916h.indexOf(63) + 1;
        String str = this.f56916h;
        return this.f56916h.substring(iIndexOf, C13706c.m81599a(str, iIndexOf, str.length(), '#'));
    }

    /* JADX INFO: renamed from: e */
    public String m81865e() {
        if (this.f56910b.isEmpty()) {
            return "";
        }
        int length = this.f56909a.length() + 3;
        String str = this.f56916h;
        return this.f56916h.substring(length, C13706c.m81600a(str, length, str.length(), ":@"));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13767p) && ((C13767p) obj).f56916h.equals(this.f56916h);
    }

    /* JADX INFO: renamed from: f */
    public String m81866f() {
        a aVarM81870a;
        try {
            aVarM81870a = new a().m81870a(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVarM81870a = null;
        }
        aVarM81870a.getClass();
        aVarM81870a.f56918b = m81853a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true, null);
        aVarM81870a.f56919c = m81853a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true, null);
        return aVarM81870a.m81872a().f56916h;
    }

    /* JADX INFO: renamed from: g */
    public URI m81867g() {
        a aVar = new a();
        aVar.f56917a = this.f56909a;
        aVar.f56918b = m81865e();
        aVar.f56919c = m81860a();
        aVar.f56920d = this.f56912d;
        aVar.f56921e = this.f56913e != m81852a(this.f56909a) ? this.f56913e : -1;
        aVar.f56922f.clear();
        aVar.f56922f.addAll(m81863c());
        aVar.m81871a(m81864d());
        aVar.f56924h = this.f56915g == null ? null : this.f56916h.substring(this.f56916h.indexOf(35) + 1);
        int size = aVar.f56922f.size();
        for (int i = 0; i < size; i++) {
            aVar.f56922f.set(i, m81855a(aVar.f56922f.get(i), WeJson.EMPTY_ARR, true, true, false, true));
        }
        List<String> list = aVar.f56923g;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = aVar.f56923g.get(i2);
                if (str != null) {
                    aVar.f56923g.set(i2, m81853a(str, 0, str.length(), "\\^`{|}", true, true, true, true, null));
                }
            }
        }
        String str2 = aVar.f56924h;
        if (str2 != null) {
            aVar.f56924h = m81855a(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String string = aVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                aag0.m95543a(e);
                return null;
            }
        }
    }

    public int hashCode() {
        return this.f56916h.hashCode();
    }

    public String toString() {
        return this.f56916h;
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.p$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f56917a;

        /* JADX INFO: renamed from: d */
        public String f56920d;

        /* JADX INFO: renamed from: f */
        public final List<String> f56922f;

        /* JADX INFO: renamed from: g */
        public List<String> f56923g;

        /* JADX INFO: renamed from: h */
        public String f56924h;

        /* JADX INFO: renamed from: b */
        public String f56918b = "";

        /* JADX INFO: renamed from: c */
        public String f56919c = "";

        /* JADX INFO: renamed from: e */
        public int f56921e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f56922f = arrayList;
            arrayList.add("");
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0062  */
        /* JADX INFO: renamed from: a */
        public a m81870a(C13767p c13767p, String str) {
            int i;
            char c;
            char c2;
            int iM81600a;
            String str2;
            boolean z;
            int i2;
            int i3;
            int i4;
            boolean z2;
            String str3;
            char c3;
            char cCharAt;
            String str4 = str;
            int iM81622b = C13706c.m81622b(str4, 0, str4.length());
            int iM81626c = C13706c.m81626c(str4, iM81622b, str4.length());
            boolean z3 = true;
            if (iM81626c - iM81622b >= 2) {
                char cCharAt2 = str4.charAt(iM81622b);
                char c4 = Matrix.MATRIX_TYPE_ZERO;
                if ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || (cCharAt2 >= 'A' && cCharAt2 <= 'Z')) {
                    int i5 = iM81622b;
                    while (true) {
                        i5++;
                        if (i5 < iM81626c) {
                            char cCharAt3 = str4.charAt(i5);
                            if ((cCharAt3 >= 'a' && cCharAt3 <= 'z') || ((cCharAt3 >= 'A' && cCharAt3 <= c4) || ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                                c4 = Matrix.MATRIX_TYPE_ZERO;
                            } else if (cCharAt3 == ':') {
                                i = i5;
                                break;
                            }
                        }
                        i = -1;
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
            a aVar = null;
            if (i != -1) {
                if (str4.regionMatches(true, iM81622b, URIUtil.HTTPS_COLON, 0, 6)) {
                    this.f56917a = "https";
                    iM81622b += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (!str4.regionMatches(true, iM81622b, URIUtil.HTTP_COLON, 0, 5)) {
                        all.m97315a("Expected URL scheme 'http' or 'https' but was '", str4.substring(0, i), "'");
                        return null;
                    }
                    this.f56917a = "http";
                    iM81622b += 5;
                }
            } else {
                if (c13767p == null) {
                    ig3.m135964a("Expected URL scheme 'http' or 'https' but no colon was found");
                    return null;
                }
                this.f56917a = c13767p.f56909a;
            }
            int i6 = iM81622b;
            int i7 = 0;
            while (true) {
                c = '/';
                c2 = '\\';
                if (i6 >= iM81626c || !((cCharAt = str4.charAt(i6)) == '\\' || cCharAt == '/')) {
                    break;
                }
                i7++;
                i6++;
            }
            char c5 = '?';
            char c6 = '#';
            if (i7 >= 2 || c13767p == null || !c13767p.f56909a.equals(this.f56917a)) {
                int i8 = iM81622b + i7;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    iM81600a = C13706c.m81600a(str4, i8, iM81626c, "@/\\?#");
                    byte bCharAt = iM81600a != iM81626c ? str4.charAt(iM81600a) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c6 || bCharAt == c || bCharAt == c2 || bCharAt == c5) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z4) {
                            i4 = iM81600a;
                            z2 = z3;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f56919c);
                            sb.append("%40");
                            str3 = str;
                            sb.append(C13767p.m81853a(str3, i8, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f56919c = sb.toString();
                        } else {
                            int iM81599a = C13706c.m81599a(str4, i8, iM81600a, ':');
                            z2 = z3;
                            String strM81853a = C13767p.m81853a(str, i8, iM81599a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z5) {
                                strM81853a = this.f56918b + "%40" + strM81853a;
                            }
                            this.f56918b = strM81853a;
                            if (iM81599a != iM81600a) {
                                int i9 = iM81599a + 1;
                                i4 = iM81600a;
                                this.f56919c = C13767p.m81853a(str, i9, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z4 = z2;
                            } else {
                                i4 = iM81600a;
                            }
                            str3 = str;
                            z5 = z2;
                        }
                        i8 = i4 + 1;
                        str4 = str3;
                        aVar = aVar;
                        z3 = z2;
                        c5 = '?';
                        c = '/';
                        c2 = '\\';
                        c6 = '#';
                    }
                }
                str2 = str4;
                int i10 = i8;
                z = z3;
                a aVar2 = aVar;
                int i11 = i10;
                while (true) {
                    if (i11 < iM81600a) {
                        char cCharAt4 = str2.charAt(i11);
                        if (cCharAt4 == ':') {
                            i2 = i11;
                            break;
                        }
                        if (cCharAt4 == '[') {
                            do {
                                i11++;
                                if (i11 >= iM81600a) {
                                    break;
                                }
                            } while (str2.charAt(i11) != ']');
                        }
                        i11++;
                    } else {
                        i2 = iM81600a;
                        break;
                    }
                }
                int i12 = i2 + 1;
                if (i12 < iM81600a) {
                    this.f56920d = m81868a(str2, i10, i2);
                    try {
                        i3 = Integer.parseInt(C13767p.m81853a(str2, i12, iM81600a, "", false, false, false, true, null));
                        if (i3 <= 0 || i3 > 65535) {
                            i3 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.f56921e = i3;
                    if (i3 == -1) {
                        bll.m102548a("Invalid URL port: \"", str2.substring(i12, iM81600a), 34);
                        return aVar2;
                    }
                } else {
                    this.f56920d = m81868a(str2, i10, i2);
                    this.f56921e = C13767p.m81852a(this.f56917a);
                }
                if (this.f56920d == null) {
                    bll.m102548a("Invalid URL host: \"", str2.substring(i10, i2), 34);
                    return aVar2;
                }
                iM81622b = iM81600a;
            } else {
                this.f56918b = c13767p.m81865e();
                this.f56919c = c13767p.m81860a();
                this.f56920d = c13767p.f56912d;
                this.f56921e = c13767p.f56913e;
                this.f56922f.clear();
                this.f56922f.addAll(c13767p.m81863c());
                if (iM81622b == iM81626c || str4.charAt(iM81622b) == '#') {
                    m81871a(c13767p.m81864d());
                }
                str2 = str4;
                z = true;
            }
            int iM81600a2 = C13706c.m81600a(str2, iM81622b, iM81626c, "?#");
            if (iM81622b != iM81600a2) {
                char cCharAt5 = str2.charAt(iM81622b);
                if (cCharAt5 == '/' || cCharAt5 == '\\') {
                    this.f56922f.clear();
                    this.f56922f.add("");
                    iM81622b++;
                } else {
                    List<String> list = this.f56922f;
                    list.set(list.size() - 1, "");
                }
                int i13 = iM81622b;
                while (i13 < iM81600a2) {
                    int iM81600a3 = C13706c.m81600a(str2, i13, iM81600a2, "/\\");
                    boolean z6 = iM81600a3 < iM81600a2 ? z : false;
                    String strM81853a2 = C13767p.m81853a(str2, i13, iM81600a3, " \"<>^`{}|/\\?#", true, false, false, true, null);
                    if (!strM81853a2.equals(".") && !strM81853a2.equalsIgnoreCase("%2e")) {
                        if (strM81853a2.equals("..") || strM81853a2.equalsIgnoreCase("%2e.") || strM81853a2.equalsIgnoreCase(".%2e") || strM81853a2.equalsIgnoreCase("%2e%2e")) {
                            List<String> list2 = this.f56922f;
                            if (!list2.remove(list2.size() - 1).isEmpty() || this.f56922f.isEmpty()) {
                                this.f56922f.add("");
                            } else {
                                List<String> list3 = this.f56922f;
                                list3.set(list3.size() - 1, "");
                            }
                        } else {
                            List<String> list4 = this.f56922f;
                            boolean zIsEmpty = list4.get(list4.size() - 1).isEmpty();
                            List<String> list5 = this.f56922f;
                            if (zIsEmpty) {
                                list5.set(list5.size() - 1, strM81853a2);
                            } else {
                                list5.add(strM81853a2);
                            }
                            if (z6) {
                                this.f56922f.add("");
                            }
                        }
                    }
                    if (z6) {
                        iM81600a3++;
                    }
                    i13 = iM81600a3;
                }
            }
            if (iM81600a2 >= iM81626c || str2.charAt(iM81600a2) != '?') {
                c3 = '#';
            } else {
                c3 = '#';
                int iM81599a2 = C13706c.m81599a(str2, iM81600a2, iM81626c, '#');
                this.f56923g = C13767p.m81859b(C13767p.m81853a(str2, iM81600a2 + 1, iM81599a2, " \"'<>#", true, false, true, true, null));
                iM81600a2 = iM81599a2;
            }
            if (iM81600a2 < iM81626c && str2.charAt(iM81600a2) == c3) {
                this.f56924h = C13767p.m81853a(str2, iM81600a2 + 1, iM81626c, "", true, false, false, false, null);
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m81874b(String str) {
            if (str == null) {
                jfd0.m141176a("host == null");
                return null;
            }
            String strM81868a = m81868a(str, 0, str.length());
            if (strM81868a != null) {
                this.f56920d = strM81868a;
                return this;
            }
            ig3.m135964a("unexpected host: ".concat(str));
            return null;
        }

        /* JADX INFO: renamed from: c */
        public a m81875c(String str) {
            if (str.equalsIgnoreCase("http")) {
                this.f56917a = "http";
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.f56917a = "https";
                return this;
            }
            ig3.m135964a("unexpected scheme: ".concat(str));
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f56917a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f56918b.isEmpty() || !this.f56919c.isEmpty()) {
                sb.append(this.f56918b);
                if (!this.f56919c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f56919c);
                }
                sb.append('@');
            }
            String str2 = this.f56920d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f56920d);
                    sb.append(']');
                } else {
                    sb.append(this.f56920d);
                }
            }
            int iM81852a = this.f56921e;
            if (iM81852a != -1 || this.f56917a != null) {
                if (iM81852a == -1) {
                    iM81852a = C13767p.m81852a(this.f56917a);
                }
                String str3 = this.f56917a;
                if (str3 == null || iM81852a != C13767p.m81852a(str3)) {
                    sb.append(':');
                    sb.append(iM81852a);
                }
            }
            List<String> list = this.f56922f;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
            if (this.f56923g != null) {
                sb.append('?');
                C13767p.m81857a(sb, this.f56923g);
            }
            if (this.f56924h != null) {
                sb.append('#');
                sb.append(this.f56924h);
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: b */
        public int m81873b() {
            int i = this.f56921e;
            return i != -1 ? i : C13767p.m81852a(this.f56917a);
        }

        /* JADX INFO: renamed from: a */
        public C13767p m81872a() {
            if (this.f56917a != null) {
                if (this.f56920d != null) {
                    return new C13767p(this);
                }
                qkq0.m175383a("host == null");
                return null;
            }
            qkq0.m175383a("scheme == null");
            return null;
        }

        /* JADX INFO: renamed from: a */
        public a m81869a(int i) {
            if (i > 0 && i <= 65535) {
                this.f56921e = i;
                return this;
            }
            k250.m144273a("unexpected port: ", i);
            return null;
        }

        /* JADX INFO: renamed from: a */
        public static String m81868a(String str, int i, int i2) {
            return C13706c.m81604a(C13767p.m81854a(str, i, i2, false));
        }

        /* JADX INFO: renamed from: a */
        public a m81871a(String str) {
            this.f56923g = str != null ? C13767p.m81859b(C13767p.m81853a(str, 0, str.length(), " \"'<>#", true, false, true, true, null)) : null;
            return this;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m81862b() {
        int iIndexOf = this.f56916h.indexOf(47, this.f56909a.length() + 3);
        String str = this.f56916h;
        return this.f56916h.substring(iIndexOf, C13706c.m81600a(str, iIndexOf, str.length(), "?#"));
    }

    /* JADX INFO: renamed from: a */
    public static int m81852a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m81857a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m81856a(String str, boolean z) {
        return m81854a(str, 0, str.length(), z);
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m81861a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m81854a(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX INFO: renamed from: a */
    public static String m81854a(String str, int i, int i2, boolean z) {
        int i3;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C13776e c13776e = new C13776e();
                c13776e.m81906a(str, i, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i3 = iCharCount + 2) < i2) {
                        int iM81598a = C13706c.m81598a(str.charAt(iCharCount + 1));
                        int iM81598a2 = C13706c.m81598a(str.charAt(i3));
                        if (iM81598a != -1 && iM81598a2 != -1) {
                            c13776e.mo81923c((iM81598a << 4) + iM81598a2);
                            iCharCount = i3;
                        } else {
                            c13776e.m81938h(iCodePointAt);
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c13776e.mo81923c(32);
                    } else {
                        c13776e.m81938h(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return c13776e.m81947n();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m81858a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C13706c.m81598a(str.charAt(i + 1)) != -1 && C13706c.m81598a(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: a */
    public String m81860a() {
        if (this.f56911c.isEmpty()) {
            return "";
        }
        return this.f56916h.substring(this.f56916h.indexOf(58, this.f56909a.length() + 3) + 1, this.f56916h.indexOf(64));
    }

    /* JADX INFO: renamed from: a */
    public static String m81855a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m81853a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
