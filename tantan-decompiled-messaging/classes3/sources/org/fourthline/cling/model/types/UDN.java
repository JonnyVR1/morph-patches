package org.fourthline.cling.model.types;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.UUID;
import java.util.logging.Logger;
import l.aag0;
import org.eclipse.jetty.util.StringUtil;
import org.fourthline.cling.model.ModelUtil;
import p003l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class UDN {
    public static final String PREFIX = "uuid:";
    private static final Logger log = Logger.getLogger(UDN.class.getName());
    private String identifierString;

    public UDN(UUID uuid) {
        this.identifierString = uuid.toString();
    }

    public static UDN uniqueSystemIdentifier(String str) {
        if (ModelUtil.ANDROID_RUNTIME) {
            upk0.m8197a("This method does not create a unique identifier on Android, see the Javadoc and use new UDN(UUID) instead!");
            return null;
        }
        try {
            try {
                return new UDN(new UUID(new BigInteger(-1, MessageDigest.getInstance("MD5").digest(new String(ModelUtil.getFirstNetworkInterfaceHardwareAddress(), StringUtil.__UTF8).getBytes(StringUtil.__UTF8))).longValue(), str.hashCode()));
            } catch (Exception e) {
                aag0.a(e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            aag0.a(e2);
            return null;
        }
    }

    public static UDN valueOf(String str) {
        if (str.startsWith("uuid:")) {
            str = str.substring(5);
        }
        return new UDN(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UDN)) {
            return false;
        }
        return this.identifierString.equals(((UDN) obj).identifierString);
    }

    public String getIdentifierString() {
        return this.identifierString;
    }

    public int hashCode() {
        return this.identifierString.hashCode();
    }

    public boolean isUDA11Compliant() {
        try {
            UUID.fromString(this.identifierString);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public String toString() {
        return "uuid:" + getIdentifierString();
    }

    public UDN(String str) {
        this.identifierString = str;
    }
}
