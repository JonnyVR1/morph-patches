package p153l;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class e7y {

    /* JADX INFO: renamed from: e */
    public static final Pattern f92481e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f */
    public static final Pattern f92482f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public final String f92483a;

    /* JADX INFO: renamed from: b */
    public final String f92484b;

    /* JADX INFO: renamed from: c */
    public final String f92485c;

    /* JADX INFO: renamed from: d */
    public final String f92486d;

    public e7y(String str, String str2, String str3, String str4) {
        this.f92483a = str;
        this.f92484b = str2;
        this.f92485c = str3;
        this.f92486d = str4;
    }

    /* JADX INFO: renamed from: c */
    public static e7y m119772c(String str) {
        Matcher matcher = f92481e.matcher(str);
        String str2 = null;
        if (!matcher.lookingAt()) {
            d7y.m114764a("No subtype found for: \"", str, 34);
            return null;
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f92482f.matcher(str);
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
        return new e7y(str, lowerCase, lowerCase2, str2);
    }

    /* JADX INFO: renamed from: d */
    public static e7y m119773d(String str) {
        try {
            return m119772c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Charset m119774a() {
        return m119775b(null);
    }

    /* JADX INFO: renamed from: b */
    public Charset m119775b(Charset charset) {
        try {
            String str = this.f92486d;
            if (str != null) {
                return Charset.forName(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return charset;
    }

    /* JADX INFO: renamed from: e */
    public String m119776e() {
        return this.f92484b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e7y) && ((e7y) obj).f92483a.equals(this.f92483a);
    }

    public int hashCode() {
        return this.f92483a.hashCode();
    }

    public String toString() {
        return this.f92483a;
    }
}
