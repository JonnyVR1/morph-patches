package org.fourthline.cling.model.types;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p153l.s1c;

/* JADX INFO: loaded from: classes3.dex */
public class DLNADoc {
    public static final Pattern PATTERN = Pattern.compile("(.+?)[ -]([0-9].[0-9]{2})");
    private final String devClass;
    private final String version;

    public enum Version {
        V1_0("1.00"),
        V1_5("1.50");


        /* JADX INFO: renamed from: s */
        String f206850s;

        Version(String str) {
            this.f206850s = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f206850s;
        }
    }

    public DLNADoc(String str, Version version) {
        this.devClass = str;
        this.version = version.f206850s;
    }

    public static DLNADoc valueOf(String str) throws InvalidValueException {
        Matcher matcher = PATTERN.matcher(str);
        if (matcher.matches()) {
            return new DLNADoc(matcher.group(1), matcher.group(2));
        }
        s1c.m184023a("Can't parse DLNADoc: ", str);
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DLNADoc dLNADoc = (DLNADoc) obj;
        return this.devClass.equals(dLNADoc.devClass) && this.version.equals(dLNADoc.version);
    }

    public String getDevClass() {
        return this.devClass;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.devClass.hashCode() * 31) + this.version.hashCode();
    }

    public String toString() {
        return getDevClass() + "-" + getVersion();
    }

    public DLNADoc(String str, String str2) {
        this.devClass = str;
        this.version = str2;
    }
}
