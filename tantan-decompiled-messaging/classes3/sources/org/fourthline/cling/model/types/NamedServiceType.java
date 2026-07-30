package org.fourthline.cling.model.types;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NamedServiceType {
    private ServiceType serviceType;
    private UDN udn;

    public NamedServiceType(UDN udn, ServiceType serviceType) {
        this.udn = udn;
        this.serviceType = serviceType;
    }

    public static NamedServiceType valueOf(String str) throws InvalidValueException {
        String[] strArrSplit = str.split("::");
        if (strArrSplit.length != 2) {
            throw new InvalidValueException("Can't parse UDN::ServiceType from: ".concat(str));
        }
        try {
            return new NamedServiceType(UDN.valueOf(strArrSplit[0]), ServiceType.valueOf(strArrSplit[1]));
        } catch (Exception unused) {
            throw new InvalidValueException("Can't parse UDN: " + strArrSplit[0]);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NamedServiceType)) {
            return false;
        }
        NamedServiceType namedServiceType = (NamedServiceType) obj;
        return this.serviceType.equals(namedServiceType.serviceType) && this.udn.equals(namedServiceType.udn);
    }

    public ServiceType getServiceType() {
        return this.serviceType;
    }

    public UDN getUdn() {
        return this.udn;
    }

    public int hashCode() {
        return (this.udn.hashCode() * 31) + this.serviceType.hashCode();
    }

    public String toString() {
        return getUdn().toString() + "::" + getServiceType().toString();
    }
}
