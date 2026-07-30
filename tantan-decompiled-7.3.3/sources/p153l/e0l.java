package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class e0l {

    /* JADX INFO: renamed from: a */
    public final String[] f91474a;

    /* JADX INFO: renamed from: l.e0l$a */
    public static final class C16674a {

        /* JADX INFO: renamed from: a */
        public final List<String> f91475a = new ArrayList(20);

        /* JADX INFO: renamed from: a */
        public C16674a m118882a(String str, String str2) {
            e0l.m118868b(str);
            e0l.m118869c(str2, str);
            return m118884c(str, str2);
        }

        /* JADX INFO: renamed from: b */
        public C16674a m118883b(String str) {
            int iIndexOf = str.indexOf(":", 1);
            if (iIndexOf != -1) {
                return m118884c(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
            }
            return str.startsWith(":") ? m118884c("", str.substring(1)) : m118884c("", str);
        }

        /* JADX INFO: renamed from: c */
        public C16674a m118884c(String str, String str2) {
            this.f91475a.add(str);
            this.f91475a.add(str2.trim());
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16674a m118885d(String str, String str2) {
            e0l.m118868b(str);
            return m118884c(str, str2);
        }

        /* JADX INFO: renamed from: e */
        public e0l m118886e() {
            return new e0l(this);
        }

        /* JADX INFO: renamed from: f */
        public String m118887f(String str) {
            for (int size = this.f91475a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f91475a.get(size))) {
                    return this.f91475a.get(size + 1);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public C16674a m118888g(String str) {
            int i = 0;
            while (i < this.f91475a.size()) {
                if (str.equalsIgnoreCase(this.f91475a.get(i))) {
                    this.f91475a.remove(i);
                    this.f91475a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C16674a m118889h(String str, String str2) {
            e0l.m118868b(str);
            e0l.m118869c(str2, str);
            m118888g(str);
            m118884c(str, str2);
            return this;
        }
    }

    public e0l(C16674a c16674a) {
        List<String> list = c16674a.f91475a;
        this.f91474a = (String[]) list.toArray(new String[list.size()]);
    }

    /* JADX INFO: renamed from: b */
    public static void m118868b(String str) {
        if (str == null) {
            mnd0.m159157a("name == null");
            return;
        }
        if (str.isEmpty()) {
            wg3.m206174a("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                wg3.m206174a(zlk0.m220255q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m118869c(String str, String str2) {
        if (str == null) {
            c0l.m107429a("value for name ", str2, " == null");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                wg3.m206174a(zlk0.m220255q("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m118870e(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static e0l m118871i(Map<String, String> map) {
        if (map == null) {
            mnd0.m159157a("headers == null");
            return null;
        }
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                wg3.m206174a("Headers cannot be null");
                return null;
            }
            String strTrim = entry.getKey().trim();
            String strTrim2 = entry.getValue().trim();
            m118868b(strTrim);
            m118869c(strTrim2, strTrim);
            strArr[i] = strTrim;
            strArr[i + 1] = strTrim2;
            i += 2;
        }
        return new e0l(strArr);
    }

    /* JADX INFO: renamed from: j */
    public static e0l m118872j(String... strArr) {
        if (strArr == null) {
            mnd0.m159157a("namesAndValues == null");
            return null;
        }
        if (strArr.length % 2 != 0) {
            wg3.m206174a("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            String str = strArr2[i];
            if (str == null) {
                wg3.m206174a("Headers cannot be null");
                return null;
            }
            strArr2[i] = str.trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str2 = strArr2[i2];
            String str3 = strArr2[i2 + 1];
            m118868b(str2);
            m118869c(str3, str2);
        }
        return new e0l(strArr2);
    }

    /* JADX INFO: renamed from: a */
    public long m118873a() {
        String[] strArr = this.f91474a;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.f91474a[i].length();
        }
        return length;
    }

    /* JADX INFO: renamed from: d */
    public String m118874d(String str) {
        return m118870e(this.f91474a, str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof e0l) && Arrays.equals(((e0l) obj).f91474a, this.f91474a);
    }

    /* JADX INFO: renamed from: f */
    public String m118875f(int i) {
        return this.f91474a[i * 2];
    }

    /* JADX INFO: renamed from: g */
    public Set<String> m118876g() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int iM118878k = m118878k();
        for (int i = 0; i < iM118878k; i++) {
            treeSet.add(m118875f(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    /* JADX INFO: renamed from: h */
    public C16674a m118877h() {
        C16674a c16674a = new C16674a();
        Collections.addAll(c16674a.f91475a, this.f91474a);
        return c16674a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f91474a);
    }

    /* JADX INFO: renamed from: k */
    public int m118878k() {
        return this.f91474a.length / 2;
    }

    /* JADX INFO: renamed from: l */
    public Map<String, List<String>> m118879l() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int iM118878k = m118878k();
        for (int i = 0; i < iM118878k; i++) {
            String lowerCase = m118875f(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m118880m(i));
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: m */
    public String m118880m(int i) {
        return this.f91474a[(i * 2) + 1];
    }

    /* JADX INFO: renamed from: n */
    public List<String> m118881n(String str) {
        int iM118878k = m118878k();
        ArrayList arrayList = null;
        for (int i = 0; i < iM118878k; i++) {
            if (str.equalsIgnoreCase(m118875f(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m118880m(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iM118878k = m118878k();
        for (int i = 0; i < iM118878k; i++) {
            sb.append(m118875f(i));
            sb.append(": ");
            sb.append(m118880m(i));
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }

    public e0l(String[] strArr) {
        this.f91474a = strArr;
    }
}
