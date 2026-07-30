package org.fourthline.cling.model.types;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.ModelUtil;
import p149l.f0c;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class SoapActionType {
    public static final String MAGIC_CONTROL_NS = "schemas-upnp-org";
    public static final String MAGIC_CONTROL_TYPE = "control-1-0";
    private String actionName;
    private String namespace;
    private String type;
    private Integer version;
    public static final Pattern PATTERN_MAGIC_CONTROL = Pattern.compile("urn:schemas-upnp-org:control-1-0#([a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*)");
    public static final Pattern PATTERN = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+)#([a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*)");

    public SoapActionType(String str, String str2, Integer num, String str3) {
        this.namespace = str;
        this.type = str2;
        this.version = num;
        this.actionName = str3;
        if (str3 == null || ModelUtil.isValidUDAName(str3)) {
            return;
        }
        ig3.m135964a("Action name contains illegal characters: ".concat(str3));
        throw null;
    }

    public static SoapActionType valueOf(String str) throws InvalidValueException {
        Matcher matcher = PATTERN_MAGIC_CONTROL.matcher(str);
        try {
            if (matcher.matches()) {
                return new SoapActionType("schemas-upnp-org", MAGIC_CONTROL_TYPE, null, matcher.group(1));
            }
            Matcher matcher2 = PATTERN.matcher(str);
            if (matcher2.matches()) {
                return new SoapActionType(matcher2.group(1), matcher2.group(2), Integer.valueOf(matcher2.group(3)), matcher2.group(4));
            }
            f0c.m119036a("Can't parse action type string (namespace/type/version#actionName): ", str);
            return null;
        } catch (RuntimeException e) {
            throw new InvalidValueException(String.format("Can't parse action type string (namespace/type/version#actionName) '%s': %s", str, e.toString()));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SoapActionType)) {
            return false;
        }
        SoapActionType soapActionType = (SoapActionType) obj;
        if (!this.actionName.equals(soapActionType.actionName) || !this.namespace.equals(soapActionType.namespace) || !this.type.equals(soapActionType.type)) {
            return false;
        }
        Integer num = this.version;
        Integer num2 = soapActionType.version;
        return num == null ? num2 == null : num.equals(num2);
    }

    public String getActionName() {
        return this.actionName;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public ServiceType getServiceType() {
        if (this.version == null) {
            return null;
        }
        return new ServiceType(this.namespace, this.type, this.version.intValue());
    }

    public String getType() {
        return this.type;
    }

    public String getTypeString() {
        if (this.version == null) {
            return "urn:" + getNamespace() + ":" + getType();
        }
        return "urn:" + getNamespace() + ":service:" + getType() + ":" + getVersion();
    }

    public Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((((this.namespace.hashCode() * 31) + this.type.hashCode()) * 31) + this.actionName.hashCode()) * 31;
        Integer num = this.version;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return getTypeString() + "#" + getActionName();
    }

    public SoapActionType(ServiceType serviceType, String str) {
        this(serviceType.getNamespace(), serviceType.getType(), Integer.valueOf(serviceType.getVersion()), str);
    }
}
