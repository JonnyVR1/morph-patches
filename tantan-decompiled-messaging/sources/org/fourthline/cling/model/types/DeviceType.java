package org.fourthline.cling.model.types;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.Constants;
import p149l.f0c;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceType {
    public static final String UNKNOWN = "UNKNOWN";
    private String namespace;
    private String type;
    private int version;
    private static final Logger log = Logger.getLogger(DeviceType.class.getName());
    public static final Pattern PATTERN = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):device:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    public DeviceType(String str, String str2, int i) {
        this.version = 1;
        if (str != null && !str.matches(Constants.REGEX_NAMESPACE)) {
            ig3.m135964a("Device type namespace contains illegal characters");
            throw null;
        }
        this.namespace = str;
        if (str2 != null && !str2.matches(Constants.REGEX_TYPE)) {
            ig3.m135964a("Device type suffix too long (64) or contains illegal characters");
            throw null;
        }
        this.type = str2;
        this.version = i;
    }

    public static DeviceType valueOf(String str) throws InvalidValueException {
        UDADeviceType uDADeviceTypeValueOf;
        String strReplaceAll = str.replaceAll("\\s", "");
        try {
            uDADeviceTypeValueOf = UDADeviceType.valueOf(strReplaceAll);
        } catch (Exception unused) {
            uDADeviceTypeValueOf = null;
        }
        if (uDADeviceTypeValueOf != null) {
            return uDADeviceTypeValueOf;
        }
        try {
            Matcher matcher = PATTERN.matcher(strReplaceAll);
            if (matcher.matches()) {
                return new DeviceType(matcher.group(1), matcher.group(2), Integer.valueOf(matcher.group(3)).intValue());
            }
            Matcher matcher2 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):device::([0-9]+).*").matcher(strReplaceAll);
            if (matcher2.matches() && matcher2.groupCount() >= 2) {
                log.warning("UPnP specification violation, no device type token, defaulting to UNKNOWN: " + strReplaceAll);
                return new DeviceType(matcher2.group(1), "UNKNOWN", Integer.valueOf(matcher2.group(2)).intValue());
            }
            Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):device:(.+?):([0-9]+).*").matcher(strReplaceAll);
            if (!matcher3.matches() || matcher3.groupCount() < 3) {
                f0c.m119036a("Can't parse device type string (namespace/type/version): ", strReplaceAll);
                return null;
            }
            String strReplaceAll2 = matcher3.group(2).replaceAll("[^a-zA-Z_0-9\\-]", "-");
            log.warning("UPnP specification violation, replacing invalid device type token '" + matcher3.group(2) + "' with: " + strReplaceAll2);
            return new DeviceType(matcher3.group(1), strReplaceAll2, Integer.valueOf(matcher3.group(3)).intValue());
        } catch (RuntimeException e) {
            throw new InvalidValueException(String.format("Can't parse device type string (namespace/type/version) '%s': %s", strReplaceAll, e.toString()));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeviceType)) {
            return false;
        }
        DeviceType deviceType = (DeviceType) obj;
        return this.version == deviceType.version && this.namespace.equals(deviceType.namespace) && this.type.equals(deviceType.type);
    }

    public String getDisplayString() {
        return getType();
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

    public boolean implementsVersion(DeviceType deviceType) {
        return this.namespace.equals(deviceType.namespace) && this.type.equals(deviceType.type) && this.version >= deviceType.version;
    }

    public String toString() {
        return "urn:" + getNamespace() + ":device:" + getType() + ":" + getVersion();
    }

    public DeviceType(String str, String str2) {
        this(str, str2, 1);
    }
}
