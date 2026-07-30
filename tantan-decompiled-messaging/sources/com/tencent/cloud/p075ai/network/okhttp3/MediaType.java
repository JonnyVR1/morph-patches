package com.tencent.cloud.p075ai.network.okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p149l.gyx;

/* JADX INFO: loaded from: classes13.dex */
public final class MediaType {

    /* JADX INFO: renamed from: e */
    public static final Pattern f56323e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f */
    public static final Pattern f56324f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public final String f56325a;

    /* JADX INFO: renamed from: b */
    public final String f56326b;

    /* JADX INFO: renamed from: c */
    public final String f56327c;

    /* JADX INFO: renamed from: d */
    public final String f56328d;

    public MediaType(String str, String str2, String str3, String str4) {
        this.f56325a = str;
        this.f56326b = str2;
        this.f56327c = str3;
        this.f56328d = str4;
    }

    public static MediaType get(String str) {
        Matcher matcher = f56323e.matcher(str);
        String str2 = null;
        if (!matcher.lookingAt()) {
            gyx.m128786a("No subtype found for: \"", str, 34);
            return null;
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f56324f.matcher(str);
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
        return new MediaType(str, lowerCase, lowerCase2, str2);
    }

    public static MediaType parse(String str) {
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public Charset charset(Charset charset) {
        try {
            String str = this.f56328d;
            if (str != null) {
                return Charset.forName(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return charset;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && ((MediaType) obj).f56325a.equals(this.f56325a);
    }

    public int hashCode() {
        return this.f56325a.hashCode();
    }

    public String subtype() {
        return this.f56327c;
    }

    public String toString() {
        return this.f56325a;
    }

    public String type() {
        return this.f56326b;
    }

    public Charset charset() {
        return charset(null);
    }
}
