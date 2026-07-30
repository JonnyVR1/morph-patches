package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okio.C13939e;
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
import p153l.iig0;
import p153l.mnd0;
import p153l.pnl;
import p153l.qnl;
import p153l.wg3;
import p153l.wtq0;
import p153l.za50;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.p */
/* JADX INFO: loaded from: classes12.dex */
public final class C13930p {

    /* JADX INFO: renamed from: i */
    public static final char[] f57756i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final String f57757a;

    /* JADX INFO: renamed from: b */
    public final String f57758b;

    /* JADX INFO: renamed from: c */
    public final String f57759c;

    /* JADX INFO: renamed from: d */
    public final String f57760d;

    /* JADX INFO: renamed from: e */
    public final int f57761e;

    /* JADX INFO: renamed from: f */
    public final List<String> f57762f;

    /* JADX INFO: renamed from: g */
    public final String f57763g;

    /* JADX INFO: renamed from: h */
    public final String f57764h;

    public C13930p(a aVar) {
        this.f57757a = aVar.f57765a;
        this.f57758b = m83039a(aVar.f57766b, false);
        this.f57759c = m83039a(aVar.f57767c, false);
        this.f57760d = aVar.f57768d;
        this.f57761e = aVar.m83056b();
        m83044a(aVar.f57770f, false);
        List<String> list = aVar.f57771g;
        this.f57762f = list != null ? m83044a(list, true) : null;
        String str = aVar.f57772h;
        this.f57763g = str != null ? m83039a(str, false) : null;
        this.f57764h = aVar.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m83036a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z || (z2 && !m83041a(str, iCharCount, i2)))) || (iCodePointAt == 43 && z3)))) {
                C13939e c13939e = new C13939e();
                c13939e.m83089a(str, i, iCharCount);
                C13939e c13939e2 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            c13939e.mo83092a(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z4) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z || (z2 && !m83041a(str, iCharCount, i2)))))) {
                            if (c13939e2 == null) {
                                c13939e2 = new C13939e();
                            }
                            c13939e2.m83121h(iCodePointAt2);
                            while (!c13939e2.mo83118g()) {
                                byte b = c13939e2.readByte();
                                c13939e.mo83106c(37);
                                char[] cArr = f57756i;
                                c13939e.mo83106c((int) cArr[((b & 255) >> 4) & 15]);
                                c13939e.mo83106c((int) cArr[b & 15]);
                            }
                        } else {
                            c13939e.m83121h(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return c13939e.m83130n();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m83042b(String str) {
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
    public List<String> m83046c() {
        int iIndexOf = this.f57764h.indexOf(47, this.f57757a.length() + 3);
        String str = this.f57764h;
        int iM82783a = C13869c.m82783a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM82783a) {
            int i = iIndexOf + 1;
            int iM82782a = C13869c.m82782a(this.f57764h, i, iM82783a, '/');
            arrayList.add(this.f57764h.substring(i, iM82782a));
            iIndexOf = iM82782a;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public String m83047d() {
        if (this.f57762f == null) {
            return null;
        }
        int iIndexOf = this.f57764h.indexOf(63) + 1;
        String str = this.f57764h;
        return this.f57764h.substring(iIndexOf, C13869c.m82782a(str, iIndexOf, str.length(), '#'));
    }

    /* JADX INFO: renamed from: e */
    public String m83048e() {
        if (this.f57758b.isEmpty()) {
            return "";
        }
        int length = this.f57757a.length() + 3;
        String str = this.f57764h;
        return this.f57764h.substring(length, C13869c.m82783a(str, length, str.length(), ":@"));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13930p) && ((C13930p) obj).f57764h.equals(this.f57764h);
    }

    /* JADX INFO: renamed from: f */
    public String m83049f() {
        a aVarM83053a;
        try {
            aVarM83053a = new a().m83053a(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVarM83053a = null;
        }
        aVarM83053a.getClass();
        aVarM83053a.f57766b = m83036a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true, null);
        aVarM83053a.f57767c = m83036a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true, null);
        return aVarM83053a.m83055a().f57764h;
    }

    /* JADX INFO: renamed from: g */
    public URI m83050g() {
        a aVar = new a();
        aVar.f57765a = this.f57757a;
        aVar.f57766b = m83048e();
        aVar.f57767c = m83043a();
        aVar.f57768d = this.f57760d;
        aVar.f57769e = this.f57761e != m83035a(this.f57757a) ? this.f57761e : -1;
        aVar.f57770f.clear();
        aVar.f57770f.addAll(m83046c());
        aVar.m83054a(m83047d());
        aVar.f57772h = this.f57763g == null ? null : this.f57764h.substring(this.f57764h.indexOf(35) + 1);
        int size = aVar.f57770f.size();
        for (int i = 0; i < size; i++) {
            aVar.f57770f.set(i, m83038a(aVar.f57770f.get(i), WeJson.EMPTY_ARR, true, true, false, true));
        }
        List<String> list = aVar.f57771g;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = aVar.f57771g.get(i2);
                if (str != null) {
                    aVar.f57771g.set(i2, m83036a(str, 0, str.length(), "\\^`{|}", true, true, true, true, null));
                }
            }
        }
        String str2 = aVar.f57772h;
        if (str2 != null) {
            aVar.f57772h = m83038a(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String string = aVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                iig0.m140070a(e);
                return null;
            }
        }
    }

    public int hashCode() {
        return this.f57764h.hashCode();
    }

    public String toString() {
        return this.f57764h;
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.p$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f57765a;

        /* JADX INFO: renamed from: d */
        public String f57768d;

        /* JADX INFO: renamed from: f */
        public final List<String> f57770f;

        /* JADX INFO: renamed from: g */
        public List<String> f57771g;

        /* JADX INFO: renamed from: h */
        public String f57772h;

        /* JADX INFO: renamed from: b */
        public String f57766b = "";

        /* JADX INFO: renamed from: c */
        public String f57767c = "";

        /* JADX INFO: renamed from: e */
        public int f57769e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f57770f = arrayList;
            arrayList.add("");
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0062  */
        /* JADX INFO: renamed from: a */
        public a m83053a(C13930p c13930p, String str) {
            int i;
            char c;
            char c2;
            int iM82783a;
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
            int iM82805b = C13869c.m82805b(str4, 0, str4.length());
            int iM82809c = C13869c.m82809c(str4, iM82805b, str4.length());
            boolean z3 = true;
            if (iM82809c - iM82805b >= 2) {
                char cCharAt2 = str4.charAt(iM82805b);
                char c4 = Matrix.MATRIX_TYPE_ZERO;
                if ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || (cCharAt2 >= 'A' && cCharAt2 <= 'Z')) {
                    int i5 = iM82805b;
                    while (true) {
                        i5++;
                        if (i5 < iM82809c) {
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
                if (str4.regionMatches(true, iM82805b, URIUtil.HTTPS_COLON, 0, 6)) {
                    this.f57765a = "https";
                    iM82805b += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (!str4.regionMatches(true, iM82805b, URIUtil.HTTP_COLON, 0, 5)) {
                        pnl.m173070a("Expected URL scheme 'http' or 'https' but was '", str4.substring(0, i), "'");
                        return null;
                    }
                    this.f57765a = "http";
                    iM82805b += 5;
                }
            } else {
                if (c13930p == null) {
                    wg3.m206174a("Expected URL scheme 'http' or 'https' but no colon was found");
                    return null;
                }
                this.f57765a = c13930p.f57757a;
            }
            int i6 = iM82805b;
            int i7 = 0;
            while (true) {
                c = '/';
                c2 = '\\';
                if (i6 >= iM82809c || !((cCharAt = str4.charAt(i6)) == '\\' || cCharAt == '/')) {
                    break;
                }
                i7++;
                i6++;
            }
            char c5 = '?';
            char c6 = '#';
            if (i7 >= 2 || c13930p == null || !c13930p.f57757a.equals(this.f57765a)) {
                int i8 = iM82805b + i7;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    iM82783a = C13869c.m82783a(str4, i8, iM82809c, "@/\\?#");
                    byte bCharAt = iM82783a != iM82809c ? str4.charAt(iM82783a) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c6 || bCharAt == c || bCharAt == c2 || bCharAt == c5) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z4) {
                            i4 = iM82783a;
                            z2 = z3;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f57767c);
                            sb.append("%40");
                            str3 = str;
                            sb.append(C13930p.m83036a(str3, i8, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f57767c = sb.toString();
                        } else {
                            int iM82782a = C13869c.m82782a(str4, i8, iM82783a, ':');
                            z2 = z3;
                            String strM83036a = C13930p.m83036a(str, i8, iM82782a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z5) {
                                strM83036a = this.f57766b + "%40" + strM83036a;
                            }
                            this.f57766b = strM83036a;
                            if (iM82782a != iM82783a) {
                                int i9 = iM82782a + 1;
                                i4 = iM82783a;
                                this.f57767c = C13930p.m83036a(str, i9, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z4 = z2;
                            } else {
                                i4 = iM82783a;
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
                    if (i11 < iM82783a) {
                        char cCharAt4 = str2.charAt(i11);
                        if (cCharAt4 == ':') {
                            i2 = i11;
                            break;
                        }
                        if (cCharAt4 == '[') {
                            do {
                                i11++;
                                if (i11 >= iM82783a) {
                                    break;
                                }
                            } while (str2.charAt(i11) != ']');
                        }
                        i11++;
                    } else {
                        i2 = iM82783a;
                        break;
                    }
                }
                int i12 = i2 + 1;
                if (i12 < iM82783a) {
                    this.f57768d = m83051a(str2, i10, i2);
                    try {
                        i3 = Integer.parseInt(C13930p.m83036a(str2, i12, iM82783a, "", false, false, false, true, null));
                        if (i3 <= 0 || i3 > 65535) {
                            i3 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.f57769e = i3;
                    if (i3 == -1) {
                        qnl.m177230a("Invalid URL port: \"", str2.substring(i12, iM82783a), 34);
                        return aVar2;
                    }
                } else {
                    this.f57768d = m83051a(str2, i10, i2);
                    this.f57769e = C13930p.m83035a(this.f57765a);
                }
                if (this.f57768d == null) {
                    qnl.m177230a("Invalid URL host: \"", str2.substring(i10, i2), 34);
                    return aVar2;
                }
                iM82805b = iM82783a;
            } else {
                this.f57766b = c13930p.m83048e();
                this.f57767c = c13930p.m83043a();
                this.f57768d = c13930p.f57760d;
                this.f57769e = c13930p.f57761e;
                this.f57770f.clear();
                this.f57770f.addAll(c13930p.m83046c());
                if (iM82805b == iM82809c || str4.charAt(iM82805b) == '#') {
                    m83054a(c13930p.m83047d());
                }
                str2 = str4;
                z = true;
            }
            int iM82783a2 = C13869c.m82783a(str2, iM82805b, iM82809c, "?#");
            if (iM82805b != iM82783a2) {
                char cCharAt5 = str2.charAt(iM82805b);
                if (cCharAt5 == '/' || cCharAt5 == '\\') {
                    this.f57770f.clear();
                    this.f57770f.add("");
                    iM82805b++;
                } else {
                    List<String> list = this.f57770f;
                    list.set(list.size() - 1, "");
                }
                int i13 = iM82805b;
                while (i13 < iM82783a2) {
                    int iM82783a3 = C13869c.m82783a(str2, i13, iM82783a2, "/\\");
                    boolean z6 = iM82783a3 < iM82783a2 ? z : false;
                    String strM83036a2 = C13930p.m83036a(str2, i13, iM82783a3, " \"<>^`{}|/\\?#", true, false, false, true, null);
                    if (!strM83036a2.equals(".") && !strM83036a2.equalsIgnoreCase("%2e")) {
                        if (strM83036a2.equals("..") || strM83036a2.equalsIgnoreCase("%2e.") || strM83036a2.equalsIgnoreCase(".%2e") || strM83036a2.equalsIgnoreCase("%2e%2e")) {
                            List<String> list2 = this.f57770f;
                            if (!list2.remove(list2.size() - 1).isEmpty() || this.f57770f.isEmpty()) {
                                this.f57770f.add("");
                            } else {
                                List<String> list3 = this.f57770f;
                                list3.set(list3.size() - 1, "");
                            }
                        } else {
                            List<String> list4 = this.f57770f;
                            boolean zIsEmpty = list4.get(list4.size() - 1).isEmpty();
                            List<String> list5 = this.f57770f;
                            if (zIsEmpty) {
                                list5.set(list5.size() - 1, strM83036a2);
                            } else {
                                list5.add(strM83036a2);
                            }
                            if (z6) {
                                this.f57770f.add("");
                            }
                        }
                    }
                    if (z6) {
                        iM82783a3++;
                    }
                    i13 = iM82783a3;
                }
            }
            if (iM82783a2 >= iM82809c || str2.charAt(iM82783a2) != '?') {
                c3 = '#';
            } else {
                c3 = '#';
                int iM82782a2 = C13869c.m82782a(str2, iM82783a2, iM82809c, '#');
                this.f57771g = C13930p.m83042b(C13930p.m83036a(str2, iM82783a2 + 1, iM82782a2, " \"'<>#", true, false, true, true, null));
                iM82783a2 = iM82782a2;
            }
            if (iM82783a2 < iM82809c && str2.charAt(iM82783a2) == c3) {
                this.f57772h = C13930p.m83036a(str2, iM82783a2 + 1, iM82809c, "", true, false, false, false, null);
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m83057b(String str) {
            if (str == null) {
                mnd0.m159157a("host == null");
                return null;
            }
            String strM83051a = m83051a(str, 0, str.length());
            if (strM83051a != null) {
                this.f57768d = strM83051a;
                return this;
            }
            wg3.m206174a("unexpected host: ".concat(str));
            return null;
        }

        /* JADX INFO: renamed from: c */
        public a m83058c(String str) {
            if (str.equalsIgnoreCase("http")) {
                this.f57765a = "http";
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.f57765a = "https";
                return this;
            }
            wg3.m206174a("unexpected scheme: ".concat(str));
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f57765a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f57766b.isEmpty() || !this.f57767c.isEmpty()) {
                sb.append(this.f57766b);
                if (!this.f57767c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f57767c);
                }
                sb.append('@');
            }
            String str2 = this.f57768d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f57768d);
                    sb.append(']');
                } else {
                    sb.append(this.f57768d);
                }
            }
            int iM83035a = this.f57769e;
            if (iM83035a != -1 || this.f57765a != null) {
                if (iM83035a == -1) {
                    iM83035a = C13930p.m83035a(this.f57765a);
                }
                String str3 = this.f57765a;
                if (str3 == null || iM83035a != C13930p.m83035a(str3)) {
                    sb.append(':');
                    sb.append(iM83035a);
                }
            }
            List<String> list = this.f57770f;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
            if (this.f57771g != null) {
                sb.append('?');
                C13930p.m83040a(sb, this.f57771g);
            }
            if (this.f57772h != null) {
                sb.append('#');
                sb.append(this.f57772h);
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: b */
        public int m83056b() {
            int i = this.f57769e;
            return i != -1 ? i : C13930p.m83035a(this.f57765a);
        }

        /* JADX INFO: renamed from: a */
        public C13930p m83055a() {
            if (this.f57765a != null) {
                if (this.f57768d != null) {
                    return new C13930p(this);
                }
                wtq0.m207906a("host == null");
                return null;
            }
            wtq0.m207906a("scheme == null");
            return null;
        }

        /* JADX INFO: renamed from: a */
        public a m83052a(int i) {
            if (i > 0 && i <= 65535) {
                this.f57769e = i;
                return this;
            }
            za50.m219101a("unexpected port: ", i);
            return null;
        }

        /* JADX INFO: renamed from: a */
        public static String m83051a(String str, int i, int i2) {
            return C13869c.m82787a(C13930p.m83037a(str, i, i2, false));
        }

        /* JADX INFO: renamed from: a */
        public a m83054a(String str) {
            this.f57771g = str != null ? C13930p.m83042b(C13930p.m83036a(str, 0, str.length(), " \"'<>#", true, false, true, true, null)) : null;
            return this;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m83045b() {
        int iIndexOf = this.f57764h.indexOf(47, this.f57757a.length() + 3);
        String str = this.f57764h;
        return this.f57764h.substring(iIndexOf, C13869c.m82783a(str, iIndexOf, str.length(), "?#"));
    }

    /* JADX INFO: renamed from: a */
    public static int m83035a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m83040a(StringBuilder sb, List<String> list) {
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
    public static String m83039a(String str, boolean z) {
        return m83037a(str, 0, str.length(), z);
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m83044a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m83037a(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX INFO: renamed from: a */
    public static String m83037a(String str, int i, int i2, boolean z) {
        int i3;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C13939e c13939e = new C13939e();
                c13939e.m83089a(str, i, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i3 = iCharCount + 2) < i2) {
                        int iM82781a = C13869c.m82781a(str.charAt(iCharCount + 1));
                        int iM82781a2 = C13869c.m82781a(str.charAt(i3));
                        if (iM82781a != -1 && iM82781a2 != -1) {
                            c13939e.mo83106c((iM82781a << 4) + iM82781a2);
                            iCharCount = i3;
                        } else {
                            c13939e.m83121h(iCodePointAt);
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c13939e.mo83106c(32);
                    } else {
                        c13939e.m83121h(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return c13939e.m83130n();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m83041a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C13869c.m82781a(str.charAt(i + 1)) != -1 && C13869c.m82781a(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: a */
    public String m83043a() {
        if (this.f57759c.isEmpty()) {
            return "";
        }
        return this.f57764h.substring(this.f57764h.indexOf(58, this.f57757a.length() + 3) + 1, this.f57764h.indexOf(64));
    }

    /* JADX INFO: renamed from: a */
    public static String m83038a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m83036a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
