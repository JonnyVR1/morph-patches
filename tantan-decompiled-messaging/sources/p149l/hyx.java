package p149l;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class hyx {

    /* JADX INFO: renamed from: e */
    public static final Pattern f110151e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f */
    public static final Pattern f110152f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public final String f110153a;

    /* JADX INFO: renamed from: b */
    public final String f110154b;

    /* JADX INFO: renamed from: c */
    public final String f110155c;

    /* JADX INFO: renamed from: d */
    public final String f110156d;

    public hyx(String str, String str2, String str3, String str4) {
        this.f110153a = str;
        this.f110154b = str2;
        this.f110155c = str3;
        this.f110156d = str4;
    }

    /* JADX INFO: renamed from: c */
    public static hyx m133627c(String str) {
        Matcher matcher = f110151e.matcher(str);
        String str2 = null;
        if (!matcher.lookingAt()) {
            gyx.m128786a("No subtype found for: \"", str, 34);
            return null;
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f110152f.matcher(str);
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"');
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase("charset")) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + strGroup3 + "\" for: \"" + str + '\"');
                }
                str2 = strGroup3;
            }
        }
        return new hyx(str, lowerCase, lowerCase2, str2);
    }

    /* JADX INFO: renamed from: d */
    public static hyx m133628d(String str) {
        try {
            return m133627c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Charset m133629a() {
        return m133630b(null);
    }

    /* JADX INFO: renamed from: b */
    public Charset m133630b(Charset charset) {
        try {
            String str = this.f110156d;
            if (str != null) {
                return Charset.forName(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return charset;
    }

    /* JADX INFO: renamed from: e */
    public String m133631e() {
        return this.f110154b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof hyx) && ((hyx) obj).f110153a.equals(this.f110153a);
    }

    public int hashCode() {
        return this.f110153a.hashCode();
    }

    public String toString() {
        return this.f110153a;
    }
}
