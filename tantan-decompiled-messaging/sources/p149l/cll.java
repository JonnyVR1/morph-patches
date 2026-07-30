package p149l;

import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okio.Buffer;
import org.eclipse.jetty.util.URIUtil;
import org.java_websocket.WebSocket;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public final class cll {

    /* JADX INFO: renamed from: j */
    public static final char[] f81429j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final String f81430a;

    /* JADX INFO: renamed from: b */
    public final String f81431b;

    /* JADX INFO: renamed from: c */
    public final String f81432c;

    /* JADX INFO: renamed from: d */
    public final String f81433d;

    /* JADX INFO: renamed from: e */
    public final int f81434e;

    /* JADX INFO: renamed from: f */
    public final List<String> f81435f;

    /* JADX INFO: renamed from: g */
    public final List<String> f81436g;

    /* JADX INFO: renamed from: h */
    public final String f81437h;

    /* JADX INFO: renamed from: i */
    public final String f81438i;

    /* JADX INFO: renamed from: l.cll$a */
    public static final class C16188a {

        /* JADX INFO: renamed from: a */
        public String f81439a;

        /* JADX INFO: renamed from: d */
        public String f81442d;

        /* JADX INFO: renamed from: f */
        public final List<String> f81444f;

        /* JADX INFO: renamed from: g */
        public List<String> f81445g;

        /* JADX INFO: renamed from: h */
        public String f81446h;

        /* JADX INFO: renamed from: b */
        public String f81440b = "";

        /* JADX INFO: renamed from: c */
        public String f81441c = "";

        /* JADX INFO: renamed from: e */
        public int f81443e = -1;

        public C16188a() {
            ArrayList arrayList = new ArrayList();
            this.f81444f = arrayList;
            arrayList.add("");
        }

        /* JADX INFO: renamed from: e */
        public static String m107529e(String str, int i, int i2) {
            return tck0.m188003d(cll.m107503t(str, i, i2, false));
        }

        /* JADX INFO: renamed from: l */
        public static int m107530l(String str, int i, int i2) {
            try {
                int i3 = Integer.parseInt(cll.m107494a(str, i, i2, "", false, false, false, true, null));
                if (i3 <= 0 || i3 > 65535) {
                    return -1;
                }
                return i3;
            } catch (NumberFormatException unused) {
            }
        }

        /* JADX INFO: renamed from: p */
        public static int m107531p(String str, int i, int i2) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ':') {
                    return i;
                }
                if (cCharAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* JADX INFO: renamed from: w */
        public static int m107532w(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: x */
        public static int m107533x(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* JADX INFO: renamed from: a */
        public C16188a m107534a(String str, String str2) {
            if (str == null) {
                jfd0.m141176a("encodedName == null");
                return null;
            }
            if (this.f81445g == null) {
                this.f81445g = new ArrayList();
            }
            this.f81445g.add(cll.m107495b(str, " \"'<>#&=", true, false, true, true));
            this.f81445g.add(str2 != null ? cll.m107495b(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C16188a m107535b(String str) {
            if (str != null) {
                m107547q(str, 0, str.length(), false, false);
                return this;
            }
            jfd0.m141176a("pathSegment == null");
            return null;
        }

        /* JADX INFO: renamed from: c */
        public C16188a m107536c(String str, String str2) {
            if (str == null) {
                jfd0.m141176a("name == null");
                return null;
            }
            if (this.f81445g == null) {
                this.f81445g = new ArrayList();
            }
            this.f81445g.add(cll.m107495b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.f81445g.add(str2 != null ? cll.m107495b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public cll m107537d() {
            if (this.f81439a == null) {
                qkq0.m175383a("scheme == null");
                return null;
            }
            if (this.f81442d != null) {
                return new cll(this);
            }
            qkq0.m175383a("host == null");
            return null;
        }

        /* JADX INFO: renamed from: f */
        public int m107538f() {
            int i = this.f81443e;
            return i != -1 ? i : cll.m107498e(this.f81439a);
        }

        /* JADX INFO: renamed from: g */
        public C16188a m107539g(String str) {
            this.f81445g = str != null ? cll.m107493F(cll.m107495b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C16188a m107540h(String str) {
            if (str == null) {
                jfd0.m141176a("host == null");
                return null;
            }
            String strM107529e = m107529e(str, 0, str.length());
            if (strM107529e != null) {
                this.f81442d = strM107529e;
                return this;
            }
            ig3.m135964a("unexpected host: ".concat(str));
            return null;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m107541i(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* JADX INFO: renamed from: j */
        public final boolean m107542j(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* JADX INFO: renamed from: k */
        public C16188a m107543k(cll cllVar, String str) throws EOFException {
            int iM188014o;
            String str2;
            int i;
            String str3;
            String str4 = str;
            int iM187993F = tck0.m187993F(str4, 0, str4.length());
            int iM187994G = tck0.m187994G(str4, iM187993F, str4.length());
            int iM107532w = m107532w(str4, iM187993F, iM187994G);
            C16188a c16188a = null;
            if (iM107532w != -1) {
                if (str4.regionMatches(true, iM187993F, URIUtil.HTTPS_COLON, 0, 6)) {
                    this.f81439a = "https";
                    iM187993F += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (!str4.regionMatches(true, iM187993F, URIUtil.HTTP_COLON, 0, 5)) {
                        all.m97315a("Expected URL scheme 'http' or 'https' but was '", str4.substring(0, iM107532w), "'");
                        return null;
                    }
                    this.f81439a = "http";
                    iM187993F += 5;
                }
            } else {
                if (cllVar == null) {
                    ig3.m135964a("Expected URL scheme 'http' or 'https' but no colon was found");
                    return null;
                }
                this.f81439a = cllVar.f81430a;
            }
            int iM107533x = m107533x(str4, iM187993F, iM187994G);
            if (iM107533x >= 2 || cllVar == null || !cllVar.f81430a.equals(this.f81439a)) {
                int i2 = iM187993F + iM107533x;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iM188014o = tck0.m188014o(str4, i2, iM187994G, "@/\\?#");
                    byte bCharAt = iM188014o != iM187994G ? str4.charAt(iM188014o) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == 35 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt != 64) {
                        str3 = str4;
                        c16188a = c16188a;
                    } else {
                        if (z) {
                            i = iM188014o;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f81441c);
                            sb.append("%40");
                            str3 = str;
                            sb.append(cll.m107494a(str3, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f81441c = sb.toString();
                        } else {
                            int iM188013n = tck0.m188013n(str4, i2, iM188014o, ':');
                            String strM107494a = cll.m107494a(str, i2, iM188013n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strM107494a = this.f81440b + "%40" + strM107494a;
                            }
                            this.f81440b = strM107494a;
                            if (iM188013n != iM188014o) {
                                i = iM188014o;
                                this.f81441c = cll.m107494a(str, iM188013n + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            } else {
                                i = iM188014o;
                            }
                            str3 = str;
                            z2 = true;
                        }
                        i2 = i + 1;
                    }
                    str4 = str3;
                    c16188a = c16188a;
                }
                str2 = str4;
                int i3 = i2;
                C16188a c16188a2 = c16188a;
                int iM107531p = m107531p(str2, i3, iM188014o);
                int i4 = iM107531p + 1;
                if (i4 < iM188014o) {
                    this.f81442d = m107529e(str2, i3, iM107531p);
                    int iM107530l = m107530l(str2, i4, iM188014o);
                    this.f81443e = iM107530l;
                    if (iM107530l == -1) {
                        bll.m102548a("Invalid URL port: \"", str2.substring(i4, iM188014o), 34);
                        return c16188a2;
                    }
                } else {
                    this.f81442d = m107529e(str2, i3, iM107531p);
                    this.f81443e = cll.m107498e(this.f81439a);
                }
                if (this.f81442d == null) {
                    bll.m102548a("Invalid URL host: \"", str2.substring(i3, iM107531p), 34);
                    return c16188a2;
                }
                iM187993F = iM188014o;
            } else {
                this.f81440b = cllVar.m107521k();
                this.f81441c = cllVar.m107517g();
                this.f81442d = cllVar.f81433d;
                this.f81443e = cllVar.f81434e;
                this.f81444f.clear();
                this.f81444f.addAll(cllVar.m107519i());
                if (iM187993F == iM187994G || str4.charAt(iM187993F) == '#') {
                    m107539g(cllVar.m107520j());
                }
                str2 = str4;
            }
            int iM188014o2 = tck0.m188014o(str2, iM187993F, iM187994G, "?#");
            m107551u(str2, iM187993F, iM188014o2);
            if (iM188014o2 < iM187994G && str2.charAt(iM188014o2) == '?') {
                int iM188013n2 = tck0.m188013n(str2, iM188014o2, iM187994G, '#');
                this.f81445g = cll.m107493F(cll.m107494a(str2, iM188014o2 + 1, iM188013n2, " \"'<>#", true, false, true, true, null));
                iM188014o2 = iM188013n2;
            }
            if (iM188014o2 < iM187994G && str2.charAt(iM188014o2) == '#') {
                this.f81446h = cll.m107494a(str2, iM188014o2 + 1, iM187994G, "", true, false, false, false, null);
            }
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C16188a m107544m(String str) {
            if (str != null) {
                this.f81441c = cll.m107495b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            jfd0.m141176a("password == null");
            return null;
        }

        /* JADX INFO: renamed from: n */
        public final void m107545n() {
            List<String> list = this.f81444f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f81444f.isEmpty()) {
                this.f81444f.add("");
            } else {
                List<String> list2 = this.f81444f;
                list2.set(list2.size() - 1, "");
            }
        }

        /* JADX INFO: renamed from: o */
        public C16188a m107546o(int i) {
            if (i <= 0 || i > 65535) {
                k250.m144273a("unexpected port: ", i);
                return null;
            }
            this.f81443e = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public final void m107547q(String str, int i, int i2, boolean z, boolean z2) throws EOFException {
            String strM107494a = cll.m107494a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (m107541i(strM107494a)) {
                return;
            }
            if (m107542j(strM107494a)) {
                m107545n();
                return;
            }
            List<String> list = this.f81444f;
            boolean zIsEmpty = list.get(list.size() - 1).isEmpty();
            List<String> list2 = this.f81444f;
            if (zIsEmpty) {
                list2.set(list2.size() - 1, strM107494a);
            } else {
                list2.add(strM107494a);
            }
            if (z) {
                this.f81444f.add("");
            }
        }

        /* JADX INFO: renamed from: r */
        public C16188a m107548r() {
            int size = this.f81444f.size();
            for (int i = 0; i < size; i++) {
                this.f81444f.set(i, cll.m107495b(this.f81444f.get(i), WeJson.EMPTY_ARR, true, true, false, true));
            }
            List<String> list = this.f81445g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f81445g.get(i2);
                    if (str != null) {
                        this.f81445g.set(i2, cll.m107495b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f81446h;
            if (str2 != null) {
                this.f81446h = cll.m107495b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* JADX INFO: renamed from: s */
        public final void m107549s(String str) {
            for (int size = this.f81445g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.f81445g.get(size))) {
                    this.f81445g.remove(size + 1);
                    this.f81445g.remove(size);
                    if (this.f81445g.isEmpty()) {
                        this.f81445g = null;
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: t */
        public C16188a m107550t(String str) {
            if (str == null) {
                jfd0.m141176a("name == null");
                return null;
            }
            if (this.f81445g == null) {
                return this;
            }
            m107549s(cll.m107495b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f81439a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f81440b.isEmpty() || !this.f81441c.isEmpty()) {
                sb.append(this.f81440b);
                if (!this.f81441c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f81441c);
                }
                sb.append('@');
            }
            String str2 = this.f81442d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f81442d);
                    sb.append(']');
                } else {
                    sb.append(this.f81442d);
                }
            }
            if (this.f81443e != -1 || this.f81439a != null) {
                int iM107538f = m107538f();
                String str3 = this.f81439a;
                if (str3 == null || iM107538f != cll.m107498e(str3)) {
                    sb.append(':');
                    sb.append(iM107538f);
                }
            }
            cll.m107502s(sb, this.f81444f);
            if (this.f81445g != null) {
                sb.append('?');
                cll.m107500o(sb, this.f81445g);
            }
            if (this.f81446h != null) {
                sb.append('#');
                sb.append(this.f81446h);
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: u */
        public final void m107551u(String str, int i, int i2) throws EOFException {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f81444f.clear();
                this.f81444f.add("");
                i++;
            } else {
                List<String> list = this.f81444f;
                list.set(list.size() - 1, "");
            }
            int i3 = i;
            while (i3 < i2) {
                int iM188014o = tck0.m188014o(str, i3, i2, "/\\");
                boolean z = iM188014o < i2;
                C16188a c16188a = this;
                String str2 = str;
                c16188a.m107547q(str2, i3, iM188014o, z, true);
                if (z) {
                    iM188014o++;
                }
                i3 = iM188014o;
                this = c16188a;
                str = str2;
            }
        }

        /* JADX INFO: renamed from: v */
        public C16188a m107552v(String str) {
            if (str == null) {
                jfd0.m141176a("scheme == null");
                return null;
            }
            if (str.equalsIgnoreCase("http")) {
                this.f81439a = "http";
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.f81439a = "https";
                return this;
            }
            ig3.m135964a("unexpected scheme: ".concat(str));
            return null;
        }

        /* JADX INFO: renamed from: y */
        public C16188a m107553y(String str) {
            if (str != null) {
                this.f81440b = cll.m107495b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            jfd0.m141176a("username == null");
            return null;
        }
    }

    public cll(C16188a c16188a) {
        this.f81430a = c16188a.f81439a;
        this.f81431b = m107504u(c16188a.f81440b, false);
        this.f81432c = m107504u(c16188a.f81441c, false);
        this.f81433d = c16188a.f81442d;
        this.f81434e = c16188a.m107538f();
        this.f81435f = m107526v(c16188a.f81444f, false);
        List<String> list = c16188a.f81445g;
        this.f81436g = list != null ? m107526v(list, true) : null;
        String str = c16188a.f81446h;
        this.f81437h = str != null ? m107504u(str, false) : null;
        this.f81438i = c16188a.toString();
    }

    /* JADX INFO: renamed from: F */
    public static List<String> m107493F(String str) {
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

    /* JADX INFO: renamed from: a */
    public static String m107494a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z || (z2 && !m107506x(str, iCharCount, i2)))) || (iCodePointAt == 43 && z3)))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i, iCharCount);
                m107497d(buffer, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static String m107495b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m107494a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* JADX INFO: renamed from: c */
    public static String m107496c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m107494a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* JADX INFO: renamed from: d */
    public static void m107497d(Buffer buffer, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
        Buffer buffer2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    buffer.writeUtf8(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z || (z2 && !m107506x(str, i, i2)))))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        buffer2.writeUtf8CodePoint(iCodePointAt);
                    } else {
                        buffer2.writeString(str, i, Character.charCount(iCodePointAt) + i, charset);
                    }
                    while (!buffer2.exhausted()) {
                        byte b = buffer2.readByte();
                        buffer.writeByte(37);
                        char[] cArr = f81429j;
                        buffer.writeByte((int) cArr[((b & 255) >> 4) & 15]);
                        buffer.writeByte((int) cArr[b & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m107498e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static cll m107499l(String str) {
        return new C16188a().m107543k(null, str).m107537d();
    }

    /* JADX INFO: renamed from: o */
    public static void m107500o(StringBuilder sb, List<String> list) {
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

    /* JADX INFO: renamed from: r */
    public static cll m107501r(String str) {
        try {
            return m107499l(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m107502s(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* JADX INFO: renamed from: t */
    public static String m107503t(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i, i3);
                m107505w(buffer, str, i3, i2, z);
                return buffer.readUtf8();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: u */
    public static String m107504u(String str, boolean z) {
        return m107503t(str, 0, str.length(), z);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX INFO: renamed from: w */
    public static void m107505w(Buffer buffer, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iM188010k = tck0.m188010k(str.charAt(i + 1));
                int iM188010k2 = tck0.m188010k(str.charAt(i3));
                if (iM188010k == -1 || iM188010k2 == -1) {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                } else {
                    buffer.writeByte((iM188010k << 4) + iM188010k2);
                    i = i3;
                }
            } else if (iCodePointAt == 43 && z) {
                buffer.writeByte(32);
            } else {
                buffer.writeUtf8CodePoint(iCodePointAt);
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m107506x(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && tck0.m188010k(str.charAt(i + 1)) != -1 && tck0.m188010k(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: A */
    public String m107507A(String str) {
        List<String> list = this.f81436g;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.f81436g.get(i))) {
                return this.f81436g.get(i + 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public String m107508B(int i) {
        List<String> list = this.f81436g;
        if (list != null) {
            return list.get(i * 2);
        }
        zkl.m219192a();
        return null;
    }

    /* JADX INFO: renamed from: C */
    public Set<String> m107509C() {
        if (this.f81436g == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.f81436g.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.f81436g.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: D */
    public String m107510D(int i) {
        List<String> list = this.f81436g;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        zkl.m219192a();
        return null;
    }

    /* JADX INFO: renamed from: E */
    public int m107511E() {
        List<String> list = this.f81436g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: G */
    public String m107512G() {
        return m107525q("/...").m107553y("").m107544m("").m107537d().toString();
    }

    /* JADX INFO: renamed from: H */
    public cll m107513H(String str) {
        C16188a c16188aM107525q = m107525q(str);
        if (c16188aM107525q != null) {
            return c16188aM107525q.m107537d();
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public String m107514I() {
        return this.f81430a;
    }

    /* JADX INFO: renamed from: J */
    public URI m107515J() {
        String string = m107524p().m107548r().toString();
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

    public boolean equals(Object obj) {
        return (obj instanceof cll) && ((cll) obj).f81438i.equals(this.f81438i);
    }

    /* JADX INFO: renamed from: f */
    public String m107516f() {
        if (this.f81437h == null) {
            return null;
        }
        return this.f81438i.substring(this.f81438i.indexOf(35) + 1);
    }

    /* JADX INFO: renamed from: g */
    public String m107517g() {
        if (this.f81432c.isEmpty()) {
            return "";
        }
        return this.f81438i.substring(this.f81438i.indexOf(58, this.f81430a.length() + 3) + 1, this.f81438i.indexOf(64));
    }

    /* JADX INFO: renamed from: h */
    public String m107518h() {
        int iIndexOf = this.f81438i.indexOf(47, this.f81430a.length() + 3);
        String str = this.f81438i;
        return this.f81438i.substring(iIndexOf, tck0.m188014o(str, iIndexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.f81438i.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public List<String> m107519i() {
        int iIndexOf = this.f81438i.indexOf(47, this.f81430a.length() + 3);
        String str = this.f81438i;
        int iM188014o = tck0.m188014o(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM188014o) {
            int i = iIndexOf + 1;
            int iM188013n = tck0.m188013n(this.f81438i, i, iM188014o, '/');
            arrayList.add(this.f81438i.substring(i, iM188013n));
            iIndexOf = iM188013n;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public String m107520j() {
        if (this.f81436g == null) {
            return null;
        }
        int iIndexOf = this.f81438i.indexOf(63) + 1;
        String str = this.f81438i;
        return this.f81438i.substring(iIndexOf, tck0.m188013n(str, iIndexOf, str.length(), '#'));
    }

    /* JADX INFO: renamed from: k */
    public String m107521k() {
        if (this.f81431b.isEmpty()) {
            return "";
        }
        int length = this.f81430a.length() + 3;
        String str = this.f81438i;
        return this.f81438i.substring(length, tck0.m188014o(str, length, str.length(), ":@"));
    }

    /* JADX INFO: renamed from: m */
    public String m107522m() {
        return this.f81433d;
    }

    /* JADX INFO: renamed from: n */
    public boolean m107523n() {
        return this.f81430a.equals("https");
    }

    /* JADX INFO: renamed from: p */
    public C16188a m107524p() {
        C16188a c16188a = new C16188a();
        c16188a.f81439a = this.f81430a;
        c16188a.f81440b = m107521k();
        c16188a.f81441c = m107517g();
        c16188a.f81442d = this.f81433d;
        c16188a.f81443e = this.f81434e != m107498e(this.f81430a) ? this.f81434e : -1;
        c16188a.f81444f.clear();
        c16188a.f81444f.addAll(m107519i());
        c16188a.m107539g(m107520j());
        c16188a.f81446h = m107516f();
        return c16188a;
    }

    /* JADX INFO: renamed from: q */
    public C16188a m107525q(String str) {
        try {
            return new C16188a().m107543k(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String toString() {
        return this.f81438i;
    }

    /* JADX INFO: renamed from: v */
    public final List<String> m107526v(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m107504u(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: y */
    public int m107527y() {
        return this.f81434e;
    }

    /* JADX INFO: renamed from: z */
    public String m107528z() {
        if (this.f81436g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m107500o(sb, this.f81436g);
        return sb.toString();
    }
}
