package p153l;

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
public final class rnl {

    /* JADX INFO: renamed from: j */
    public static final char[] f164067j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final String f164068a;

    /* JADX INFO: renamed from: b */
    public final String f164069b;

    /* JADX INFO: renamed from: c */
    public final String f164070c;

    /* JADX INFO: renamed from: d */
    public final String f164071d;

    /* JADX INFO: renamed from: e */
    public final int f164072e;

    /* JADX INFO: renamed from: f */
    public final List<String> f164073f;

    /* JADX INFO: renamed from: g */
    public final List<String> f164074g;

    /* JADX INFO: renamed from: h */
    public final String f164075h;

    /* JADX INFO: renamed from: i */
    public final String f164076i;

    /* JADX INFO: renamed from: l.rnl$a */
    public static final class C19886a {

        /* JADX INFO: renamed from: a */
        public String f164077a;

        /* JADX INFO: renamed from: d */
        public String f164080d;

        /* JADX INFO: renamed from: f */
        public final List<String> f164082f;

        /* JADX INFO: renamed from: g */
        public List<String> f164083g;

        /* JADX INFO: renamed from: h */
        public String f164084h;

        /* JADX INFO: renamed from: b */
        public String f164078b = "";

        /* JADX INFO: renamed from: c */
        public String f164079c = "";

        /* JADX INFO: renamed from: e */
        public int f164081e = -1;

        public C19886a() {
            ArrayList arrayList = new ArrayList();
            this.f164082f = arrayList;
            arrayList.add("");
        }

        /* JADX INFO: renamed from: e */
        public static String m182293e(String str, int i, int i2) {
            return zlk0.m220242d(rnl.m182267t(str, i, i2, false));
        }

        /* JADX INFO: renamed from: l */
        public static int m182294l(String str, int i, int i2) {
            try {
                int i3 = Integer.parseInt(rnl.m182258a(str, i, i2, "", false, false, false, true, null));
                if (i3 <= 0 || i3 > 65535) {
                    return -1;
                }
                return i3;
            } catch (NumberFormatException unused) {
            }
        }

        /* JADX INFO: renamed from: p */
        public static int m182295p(String str, int i, int i2) {
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
        public static int m182296w(String str, int i, int i2) {
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
        public static int m182297x(String str, int i, int i2) {
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
        public C19886a m182298a(String str, String str2) {
            if (str == null) {
                mnd0.m159157a("encodedName == null");
                return null;
            }
            if (this.f164083g == null) {
                this.f164083g = new ArrayList();
            }
            this.f164083g.add(rnl.m182259b(str, " \"'<>#&=", true, false, true, true));
            this.f164083g.add(str2 != null ? rnl.m182259b(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C19886a m182299b(String str) {
            if (str != null) {
                m182311q(str, 0, str.length(), false, false);
                return this;
            }
            mnd0.m159157a("pathSegment == null");
            return null;
        }

        /* JADX INFO: renamed from: c */
        public C19886a m182300c(String str, String str2) {
            if (str == null) {
                mnd0.m159157a("name == null");
                return null;
            }
            if (this.f164083g == null) {
                this.f164083g = new ArrayList();
            }
            this.f164083g.add(rnl.m182259b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.f164083g.add(str2 != null ? rnl.m182259b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public rnl m182301d() {
            if (this.f164077a == null) {
                wtq0.m207906a("scheme == null");
                return null;
            }
            if (this.f164080d != null) {
                return new rnl(this);
            }
            wtq0.m207906a("host == null");
            return null;
        }

        /* JADX INFO: renamed from: f */
        public int m182302f() {
            int i = this.f164081e;
            return i != -1 ? i : rnl.m182262e(this.f164077a);
        }

        /* JADX INFO: renamed from: g */
        public C19886a m182303g(String str) {
            this.f164083g = str != null ? rnl.m182257F(rnl.m182259b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C19886a m182304h(String str) {
            if (str == null) {
                mnd0.m159157a("host == null");
                return null;
            }
            String strM182293e = m182293e(str, 0, str.length());
            if (strM182293e != null) {
                this.f164080d = strM182293e;
                return this;
            }
            wg3.m206174a("unexpected host: ".concat(str));
            return null;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m182305i(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* JADX INFO: renamed from: j */
        public final boolean m182306j(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* JADX INFO: renamed from: k */
        public C19886a m182307k(rnl rnlVar, String str) throws EOFException {
            int iM220253o;
            String str2;
            int i;
            String str3;
            String str4 = str;
            int iM220232F = zlk0.m220232F(str4, 0, str4.length());
            int iM220233G = zlk0.m220233G(str4, iM220232F, str4.length());
            int iM182296w = m182296w(str4, iM220232F, iM220233G);
            C19886a c19886a = null;
            if (iM182296w != -1) {
                if (str4.regionMatches(true, iM220232F, URIUtil.HTTPS_COLON, 0, 6)) {
                    this.f164077a = "https";
                    iM220232F += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (!str4.regionMatches(true, iM220232F, URIUtil.HTTP_COLON, 0, 5)) {
                        pnl.m173070a("Expected URL scheme 'http' or 'https' but was '", str4.substring(0, iM182296w), "'");
                        return null;
                    }
                    this.f164077a = "http";
                    iM220232F += 5;
                }
            } else {
                if (rnlVar == null) {
                    wg3.m206174a("Expected URL scheme 'http' or 'https' but no colon was found");
                    return null;
                }
                this.f164077a = rnlVar.f164068a;
            }
            int iM182297x = m182297x(str4, iM220232F, iM220233G);
            if (iM182297x >= 2 || rnlVar == null || !rnlVar.f164068a.equals(this.f164077a)) {
                int i2 = iM220232F + iM182297x;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iM220253o = zlk0.m220253o(str4, i2, iM220233G, "@/\\?#");
                    byte bCharAt = iM220253o != iM220233G ? str4.charAt(iM220253o) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == 35 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt != 64) {
                        str3 = str4;
                        c19886a = c19886a;
                    } else {
                        if (z) {
                            i = iM220253o;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f164079c);
                            sb.append("%40");
                            str3 = str;
                            sb.append(rnl.m182258a(str3, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f164079c = sb.toString();
                        } else {
                            int iM220252n = zlk0.m220252n(str4, i2, iM220253o, ':');
                            String strM182258a = rnl.m182258a(str, i2, iM220252n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strM182258a = this.f164078b + "%40" + strM182258a;
                            }
                            this.f164078b = strM182258a;
                            if (iM220252n != iM220253o) {
                                i = iM220253o;
                                this.f164079c = rnl.m182258a(str, iM220252n + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            } else {
                                i = iM220253o;
                            }
                            str3 = str;
                            z2 = true;
                        }
                        i2 = i + 1;
                    }
                    str4 = str3;
                    c19886a = c19886a;
                }
                str2 = str4;
                int i3 = i2;
                C19886a c19886a2 = c19886a;
                int iM182295p = m182295p(str2, i3, iM220253o);
                int i4 = iM182295p + 1;
                if (i4 < iM220253o) {
                    this.f164080d = m182293e(str2, i3, iM182295p);
                    int iM182294l = m182294l(str2, i4, iM220253o);
                    this.f164081e = iM182294l;
                    if (iM182294l == -1) {
                        qnl.m177230a("Invalid URL port: \"", str2.substring(i4, iM220253o), 34);
                        return c19886a2;
                    }
                } else {
                    this.f164080d = m182293e(str2, i3, iM182295p);
                    this.f164081e = rnl.m182262e(this.f164077a);
                }
                if (this.f164080d == null) {
                    qnl.m177230a("Invalid URL host: \"", str2.substring(i3, iM182295p), 34);
                    return c19886a2;
                }
                iM220232F = iM220253o;
            } else {
                this.f164078b = rnlVar.m182285k();
                this.f164079c = rnlVar.m182281g();
                this.f164080d = rnlVar.f164071d;
                this.f164081e = rnlVar.f164072e;
                this.f164082f.clear();
                this.f164082f.addAll(rnlVar.m182283i());
                if (iM220232F == iM220233G || str4.charAt(iM220232F) == '#') {
                    m182303g(rnlVar.m182284j());
                }
                str2 = str4;
            }
            int iM220253o2 = zlk0.m220253o(str2, iM220232F, iM220233G, "?#");
            m182315u(str2, iM220232F, iM220253o2);
            if (iM220253o2 < iM220233G && str2.charAt(iM220253o2) == '?') {
                int iM220252n2 = zlk0.m220252n(str2, iM220253o2, iM220233G, '#');
                this.f164083g = rnl.m182257F(rnl.m182258a(str2, iM220253o2 + 1, iM220252n2, " \"'<>#", true, false, true, true, null));
                iM220253o2 = iM220252n2;
            }
            if (iM220253o2 < iM220233G && str2.charAt(iM220253o2) == '#') {
                this.f164084h = rnl.m182258a(str2, iM220253o2 + 1, iM220233G, "", true, false, false, false, null);
            }
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C19886a m182308m(String str) {
            if (str != null) {
                this.f164079c = rnl.m182259b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            mnd0.m159157a("password == null");
            return null;
        }

        /* JADX INFO: renamed from: n */
        public final void m182309n() {
            List<String> list = this.f164082f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f164082f.isEmpty()) {
                this.f164082f.add("");
            } else {
                List<String> list2 = this.f164082f;
                list2.set(list2.size() - 1, "");
            }
        }

        /* JADX INFO: renamed from: o */
        public C19886a m182310o(int i) {
            if (i <= 0 || i > 65535) {
                za50.m219101a("unexpected port: ", i);
                return null;
            }
            this.f164081e = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public final void m182311q(String str, int i, int i2, boolean z, boolean z2) throws EOFException {
            String strM182258a = rnl.m182258a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (m182305i(strM182258a)) {
                return;
            }
            if (m182306j(strM182258a)) {
                m182309n();
                return;
            }
            List<String> list = this.f164082f;
            boolean zIsEmpty = list.get(list.size() - 1).isEmpty();
            List<String> list2 = this.f164082f;
            if (zIsEmpty) {
                list2.set(list2.size() - 1, strM182258a);
            } else {
                list2.add(strM182258a);
            }
            if (z) {
                this.f164082f.add("");
            }
        }

        /* JADX INFO: renamed from: r */
        public C19886a m182312r() {
            int size = this.f164082f.size();
            for (int i = 0; i < size; i++) {
                this.f164082f.set(i, rnl.m182259b(this.f164082f.get(i), WeJson.EMPTY_ARR, true, true, false, true));
            }
            List<String> list = this.f164083g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f164083g.get(i2);
                    if (str != null) {
                        this.f164083g.set(i2, rnl.m182259b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f164084h;
            if (str2 != null) {
                this.f164084h = rnl.m182259b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* JADX INFO: renamed from: s */
        public final void m182313s(String str) {
            for (int size = this.f164083g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.f164083g.get(size))) {
                    this.f164083g.remove(size + 1);
                    this.f164083g.remove(size);
                    if (this.f164083g.isEmpty()) {
                        this.f164083g = null;
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: t */
        public C19886a m182314t(String str) {
            if (str == null) {
                mnd0.m159157a("name == null");
                return null;
            }
            if (this.f164083g == null) {
                return this;
            }
            m182313s(rnl.m182259b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f164077a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f164078b.isEmpty() || !this.f164079c.isEmpty()) {
                sb.append(this.f164078b);
                if (!this.f164079c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f164079c);
                }
                sb.append('@');
            }
            String str2 = this.f164080d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f164080d);
                    sb.append(']');
                } else {
                    sb.append(this.f164080d);
                }
            }
            if (this.f164081e != -1 || this.f164077a != null) {
                int iM182302f = m182302f();
                String str3 = this.f164077a;
                if (str3 == null || iM182302f != rnl.m182262e(str3)) {
                    sb.append(':');
                    sb.append(iM182302f);
                }
            }
            rnl.m182266s(sb, this.f164082f);
            if (this.f164083g != null) {
                sb.append('?');
                rnl.m182264o(sb, this.f164083g);
            }
            if (this.f164084h != null) {
                sb.append('#');
                sb.append(this.f164084h);
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: u */
        public final void m182315u(String str, int i, int i2) throws EOFException {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f164082f.clear();
                this.f164082f.add("");
                i++;
            } else {
                List<String> list = this.f164082f;
                list.set(list.size() - 1, "");
            }
            int i3 = i;
            while (i3 < i2) {
                int iM220253o = zlk0.m220253o(str, i3, i2, "/\\");
                boolean z = iM220253o < i2;
                C19886a c19886a = this;
                String str2 = str;
                c19886a.m182311q(str2, i3, iM220253o, z, true);
                if (z) {
                    iM220253o++;
                }
                i3 = iM220253o;
                this = c19886a;
                str = str2;
            }
        }

        /* JADX INFO: renamed from: v */
        public C19886a m182316v(String str) {
            if (str == null) {
                mnd0.m159157a("scheme == null");
                return null;
            }
            if (str.equalsIgnoreCase("http")) {
                this.f164077a = "http";
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.f164077a = "https";
                return this;
            }
            wg3.m206174a("unexpected scheme: ".concat(str));
            return null;
        }

        /* JADX INFO: renamed from: y */
        public C19886a m182317y(String str) {
            if (str != null) {
                this.f164078b = rnl.m182259b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            mnd0.m159157a("username == null");
            return null;
        }
    }

    public rnl(C19886a c19886a) {
        this.f164068a = c19886a.f164077a;
        this.f164069b = m182268u(c19886a.f164078b, false);
        this.f164070c = m182268u(c19886a.f164079c, false);
        this.f164071d = c19886a.f164080d;
        this.f164072e = c19886a.m182302f();
        this.f164073f = m182290v(c19886a.f164082f, false);
        List<String> list = c19886a.f164083g;
        this.f164074g = list != null ? m182290v(list, true) : null;
        String str = c19886a.f164084h;
        this.f164075h = str != null ? m182268u(str, false) : null;
        this.f164076i = c19886a.toString();
    }

    /* JADX INFO: renamed from: F */
    public static List<String> m182257F(String str) {
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
    public static String m182258a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z || (z2 && !m182270x(str, iCharCount, i2)))) || (iCodePointAt == 43 && z3)))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i, iCharCount);
                m182261d(buffer, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static String m182259b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m182258a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* JADX INFO: renamed from: c */
    public static String m182260c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m182258a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* JADX INFO: renamed from: d */
    public static void m182261d(Buffer buffer, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
        Buffer buffer2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    buffer.writeUtf8(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z || (z2 && !m182270x(str, i, i2)))))) {
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
                        char[] cArr = f164067j;
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
    public static int m182262e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static rnl m182263l(String str) {
        return new C19886a().m182307k(null, str).m182301d();
    }

    /* JADX INFO: renamed from: o */
    public static void m182264o(StringBuilder sb, List<String> list) {
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
    public static rnl m182265r(String str) {
        try {
            return m182263l(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m182266s(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* JADX INFO: renamed from: t */
    public static String m182267t(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i, i3);
                m182269w(buffer, str, i3, i2, z);
                return buffer.readUtf8();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: u */
    public static String m182268u(String str, boolean z) {
        return m182267t(str, 0, str.length(), z);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX INFO: renamed from: w */
    public static void m182269w(Buffer buffer, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iM220249k = zlk0.m220249k(str.charAt(i + 1));
                int iM220249k2 = zlk0.m220249k(str.charAt(i3));
                if (iM220249k == -1 || iM220249k2 == -1) {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                } else {
                    buffer.writeByte((iM220249k << 4) + iM220249k2);
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
    public static boolean m182270x(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && zlk0.m220249k(str.charAt(i + 1)) != -1 && zlk0.m220249k(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: A */
    public String m182271A(String str) {
        List<String> list = this.f164074g;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.f164074g.get(i))) {
                return this.f164074g.get(i + 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public String m182272B(int i) {
        List<String> list = this.f164074g;
        if (list != null) {
            return list.get(i * 2);
        }
        onl.m168333a();
        return null;
    }

    /* JADX INFO: renamed from: C */
    public Set<String> m182273C() {
        if (this.f164074g == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.f164074g.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.f164074g.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: D */
    public String m182274D(int i) {
        List<String> list = this.f164074g;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        onl.m168333a();
        return null;
    }

    /* JADX INFO: renamed from: E */
    public int m182275E() {
        List<String> list = this.f164074g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: G */
    public String m182276G() {
        return m182289q("/...").m182317y("").m182308m("").m182301d().toString();
    }

    /* JADX INFO: renamed from: H */
    public rnl m182277H(String str) {
        C19886a c19886aM182289q = m182289q(str);
        if (c19886aM182289q != null) {
            return c19886aM182289q.m182301d();
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public String m182278I() {
        return this.f164068a;
    }

    /* JADX INFO: renamed from: J */
    public URI m182279J() {
        String string = m182288p().m182312r().toString();
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

    public boolean equals(Object obj) {
        return (obj instanceof rnl) && ((rnl) obj).f164076i.equals(this.f164076i);
    }

    /* JADX INFO: renamed from: f */
    public String m182280f() {
        if (this.f164075h == null) {
            return null;
        }
        return this.f164076i.substring(this.f164076i.indexOf(35) + 1);
    }

    /* JADX INFO: renamed from: g */
    public String m182281g() {
        if (this.f164070c.isEmpty()) {
            return "";
        }
        return this.f164076i.substring(this.f164076i.indexOf(58, this.f164068a.length() + 3) + 1, this.f164076i.indexOf(64));
    }

    /* JADX INFO: renamed from: h */
    public String m182282h() {
        int iIndexOf = this.f164076i.indexOf(47, this.f164068a.length() + 3);
        String str = this.f164076i;
        return this.f164076i.substring(iIndexOf, zlk0.m220253o(str, iIndexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.f164076i.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public List<String> m182283i() {
        int iIndexOf = this.f164076i.indexOf(47, this.f164068a.length() + 3);
        String str = this.f164076i;
        int iM220253o = zlk0.m220253o(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM220253o) {
            int i = iIndexOf + 1;
            int iM220252n = zlk0.m220252n(this.f164076i, i, iM220253o, '/');
            arrayList.add(this.f164076i.substring(i, iM220252n));
            iIndexOf = iM220252n;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public String m182284j() {
        if (this.f164074g == null) {
            return null;
        }
        int iIndexOf = this.f164076i.indexOf(63) + 1;
        String str = this.f164076i;
        return this.f164076i.substring(iIndexOf, zlk0.m220252n(str, iIndexOf, str.length(), '#'));
    }

    /* JADX INFO: renamed from: k */
    public String m182285k() {
        if (this.f164069b.isEmpty()) {
            return "";
        }
        int length = this.f164068a.length() + 3;
        String str = this.f164076i;
        return this.f164076i.substring(length, zlk0.m220253o(str, length, str.length(), ":@"));
    }

    /* JADX INFO: renamed from: m */
    public String m182286m() {
        return this.f164071d;
    }

    /* JADX INFO: renamed from: n */
    public boolean m182287n() {
        return this.f164068a.equals("https");
    }

    /* JADX INFO: renamed from: p */
    public C19886a m182288p() {
        C19886a c19886a = new C19886a();
        c19886a.f164077a = this.f164068a;
        c19886a.f164078b = m182285k();
        c19886a.f164079c = m182281g();
        c19886a.f164080d = this.f164071d;
        c19886a.f164081e = this.f164072e != m182262e(this.f164068a) ? this.f164072e : -1;
        c19886a.f164082f.clear();
        c19886a.f164082f.addAll(m182283i());
        c19886a.m182303g(m182284j());
        c19886a.f164084h = m182280f();
        return c19886a;
    }

    /* JADX INFO: renamed from: q */
    public C19886a m182289q(String str) {
        try {
            return new C19886a().m182307k(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String toString() {
        return this.f164076i;
    }

    /* JADX INFO: renamed from: v */
    public final List<String> m182290v(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m182268u(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: y */
    public int m182291y() {
        return this.f164072e;
    }

    /* JADX INFO: renamed from: z */
    public String m182292z() {
        if (this.f164074g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m182264o(sb, this.f164074g);
        return sb.toString();
    }
}
