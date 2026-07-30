package org.fourthline.cling.model.types;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.Constants;
import p153l.s1c;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class ServiceType {
    private String namespace;
    private String type;
    private int version;
    private static final Logger log = Logger.getLogger(ServiceType.class.getName());
    public static final Pattern PATTERN = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");
    public static final Pattern BROKEN_PATTERN = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    public ServiceType(String str, String str2, int i) {
        this.version = 1;
        if (str != null && !str.matches(Constants.REGEX_NAMESPACE)) {
            wg3.m206174a("Service type namespace contains illegal characters");
            throw null;
        }
        this.namespace = str;
        if (str2 != null && !str2.matches(Constants.REGEX_TYPE)) {
            wg3.m206174a("Service type suffix too long (64) or contains illegal characters");
            throw null;
        }
        this.type = str2;
        this.version = i;
    }

    public static ServiceType valueOf(String str) throws InvalidValueException {
        UDAServiceType uDAServiceTypeValueOf;
        if (str == null) {
            throw new InvalidValueException("Can't parse null string");
        }
        String strReplaceAll = str.replaceAll("\\s", "");
        try {
            uDAServiceTypeValueOf = UDAServiceType.valueOf(strReplaceAll);
        } catch (Exception unused) {
            uDAServiceTypeValueOf = null;
        }
        if (uDAServiceTypeValueOf != null) {
            return uDAServiceTypeValueOf;
        }
        try {
            Matcher matcher = PATTERN.matcher(strReplaceAll);
            if (matcher.matches() && matcher.groupCount() >= 3) {
                return new ServiceType(matcher.group(1), matcher.group(2), Integer.valueOf(matcher.group(3)).intValue());
            }
            Matcher matcher2 = BROKEN_PATTERN.matcher(strReplaceAll);
            if (matcher2.matches() && matcher2.groupCount() >= 3) {
                return new ServiceType(matcher2.group(1), matcher2.group(2), Integer.valueOf(matcher2.group(3)).intValue());
            }
            Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:(.+?):([0-9]+).*").matcher(strReplaceAll);
            if (matcher3.matches() && matcher3.groupCount() >= 3) {
                String strReplaceAll2 = matcher3.group(2).replaceAll("[^a-zA-Z_0-9\\-]", "-");
                log.warning("UPnP specification violation, replacing invalid service type token '" + matcher3.group(2) + "' with: " + strReplaceAll2);
                return new ServiceType(matcher3.group(1), strReplaceAll2, Integer.valueOf(matcher3.group(3)).intValue());
            }
            Matcher matcher4 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:(.+?):([0-9]+).*").matcher(strReplaceAll);
            if (!matcher4.matches() || matcher4.groupCount() < 3) {
                s1c.m184023a("Can't parse service type string (namespace/type/version): ", strReplaceAll);
                return null;
            }
            String strReplaceAll3 = matcher4.group(2).replaceAll("[^a-zA-Z_0-9\\-]", "-");
            log.warning("UPnP specification violation, replacing invalid service type token '" + matcher4.group(2) + "' with: " + strReplaceAll3);
            return new ServiceType(matcher4.group(1), strReplaceAll3, Integer.valueOf(matcher4.group(3)).intValue());
        } catch (RuntimeException e) {
            throw new InvalidValueException(String.format("Can't parse service type string (namespace/type/version) '%s': %s", strReplaceAll, e.toString()));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ServiceType)) {
            return false;
        }
        ServiceType serviceType = (ServiceType) obj;
        return this.version == serviceType.version && this.namespace.equals(serviceType.namespace) && this.type.equals(serviceType.type);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getType() {
        return this.type;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.namespace.hashCode() * 31) + this.type.hashCode()) * 31) + this.version;
    }

    public boolean implementsVersion(ServiceType serviceType) {
        return serviceType != null && this.namespace.equals(serviceType.namespace) && this.type.equals(serviceType.type) && this.version >= serviceType.version;
    }

    public String toFriendlyString() {
        return getNamespace() + ":" + getType() + ":" + getVersion();
    }

    public String toString() {
        return "urn:" + getNamespace() + ":service:" + getType() + ":" + getVersion();
    }

    public ServiceType(String str, String str2) {
        this(str, str2, 1);
    }
}
