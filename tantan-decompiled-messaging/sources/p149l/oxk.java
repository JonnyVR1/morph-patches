package p149l;

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
public final class oxk {

    /* JADX INFO: renamed from: a */
    public final String[] f146218a;

    /* JADX INFO: renamed from: l.oxk$a */
    public static final class C19066a {

        /* JADX INFO: renamed from: a */
        public final List<String> f146219a = new ArrayList(20);

        /* JADX INFO: renamed from: a */
        public C19066a m166563a(String str, String str2) {
            oxk.m166549b(str);
            oxk.m166550c(str2, str);
            return m166565c(str, str2);
        }

        /* JADX INFO: renamed from: b */
        public C19066a m166564b(String str) {
            int iIndexOf = str.indexOf(":", 1);
            if (iIndexOf != -1) {
                return m166565c(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
            }
            return str.startsWith(":") ? m166565c("", str.substring(1)) : m166565c("", str);
        }

        /* JADX INFO: renamed from: c */
        public C19066a m166565c(String str, String str2) {
            this.f146219a.add(str);
            this.f146219a.add(str2.trim());
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C19066a m166566d(String str, String str2) {
            oxk.m166549b(str);
            return m166565c(str, str2);
        }

        /* JADX INFO: renamed from: e */
        public oxk m166567e() {
            return new oxk(this);
        }

        /* JADX INFO: renamed from: f */
        public String m166568f(String str) {
            for (int size = this.f146219a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f146219a.get(size))) {
                    return this.f146219a.get(size + 1);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public C19066a m166569g(String str) {
            int i = 0;
            while (i < this.f146219a.size()) {
                if (str.equalsIgnoreCase(this.f146219a.get(i))) {
                    this.f146219a.remove(i);
                    this.f146219a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C19066a m166570h(String str, String str2) {
            oxk.m166549b(str);
            oxk.m166550c(str2, str);
            m166569g(str);
            m166565c(str, str2);
            return this;
        }
    }

    public oxk(C19066a c19066a) {
        List<String> list = c19066a.f146219a;
        this.f146218a = (String[]) list.toArray(new String[list.size()]);
    }

    /* JADX INFO: renamed from: b */
    public static void m166549b(String str) {
        if (str == null) {
            jfd0.m141176a("name == null");
            return;
        }
        if (str.isEmpty()) {
            ig3.m135964a("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                ig3.m135964a(tck0.m188016q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m166550c(String str, String str2) {
        if (str == null) {
            mxk.m156912a("value for name ", str2, " == null");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                ig3.m135964a(tck0.m188016q("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m166551e(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static oxk m166552i(Map<String, String> map) {
        if (map == null) {
            jfd0.m141176a("headers == null");
            return null;
        }
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                ig3.m135964a("Headers cannot be null");
                return null;
            }
            String strTrim = entry.getKey().trim();
            String strTrim2 = entry.getValue().trim();
            m166549b(strTrim);
            m166550c(strTrim2, strTrim);
            strArr[i] = strTrim;
            strArr[i + 1] = strTrim2;
            i += 2;
        }
        return new oxk(strArr);
    }

    /* JADX INFO: renamed from: j */
    public static oxk m166553j(String... strArr) {
        if (strArr == null) {
            jfd0.m141176a("namesAndValues == null");
            return null;
        }
        if (strArr.length % 2 != 0) {
            ig3.m135964a("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            String str = strArr2[i];
            if (str == null) {
                ig3.m135964a("Headers cannot be null");
                return null;
            }
            strArr2[i] = str.trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str2 = strArr2[i2];
            String str3 = strArr2[i2 + 1];
            m166549b(str2);
            m166550c(str3, str2);
        }
        return new oxk(strArr2);
    }

    /* JADX INFO: renamed from: a */
    public long m166554a() {
        String[] strArr = this.f146218a;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.f146218a[i].length();
        }
        return length;
    }

    /* JADX INFO: renamed from: d */
    public String m166555d(String str) {
        return m166551e(this.f146218a, str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof oxk) && Arrays.equals(((oxk) obj).f146218a, this.f146218a);
    }

    /* JADX INFO: renamed from: f */
    public String m166556f(int i) {
        return this.f146218a[i * 2];
    }

    /* JADX INFO: renamed from: g */
    public Set<String> m166557g() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int iM166559k = m166559k();
        for (int i = 0; i < iM166559k; i++) {
            treeSet.add(m166556f(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    /* JADX INFO: renamed from: h */
    public C19066a m166558h() {
        C19066a c19066a = new C19066a();
        Collections.addAll(c19066a.f146219a, this.f146218a);
        return c19066a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f146218a);
    }

    /* JADX INFO: renamed from: k */
    public int m166559k() {
        return this.f146218a.length / 2;
    }

    /* JADX INFO: renamed from: l */
    public Map<String, List<String>> m166560l() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int iM166559k = m166559k();
        for (int i = 0; i < iM166559k; i++) {
            String lowerCase = m166556f(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m166561m(i));
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: m */
    public String m166561m(int i) {
        return this.f146218a[(i * 2) + 1];
    }

    /* JADX INFO: renamed from: n */
    public List<String> m166562n(String str) {
        int iM166559k = m166559k();
        ArrayList arrayList = null;
        for (int i = 0; i < iM166559k; i++) {
            if (str.equalsIgnoreCase(m166556f(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m166561m(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iM166559k = m166559k();
        for (int i = 0; i < iM166559k; i++) {
            sb.append(m166556f(i));
            sb.append(": ");
            sb.append(m166561m(i));
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }

    public oxk(String[] strArr) {
        this.f146218a = strArr;
    }
}
