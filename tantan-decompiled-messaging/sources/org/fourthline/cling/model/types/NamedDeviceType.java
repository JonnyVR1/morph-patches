package org.fourthline.cling.model.types;

/* JADX INFO: loaded from: classes3.dex */
public class NamedDeviceType {
    private DeviceType deviceType;
    private UDN udn;

    public NamedDeviceType(UDN udn, DeviceType deviceType) {
        this.udn = udn;
        this.deviceType = deviceType;
    }

    public static NamedDeviceType valueOf(String str) throws InvalidValueException {
        String[] strArrSplit = str.split("::");
        if (strArrSplit.length != 2) {
            throw new InvalidValueException("Can't parse UDN::DeviceType from: ".concat(str));
        }
        try {
            return new NamedDeviceType(UDN.valueOf(strArrSplit[0]), DeviceType.valueOf(strArrSplit[1]));
        } catch (Exception unused) {
            throw new InvalidValueException("Can't parse UDN: " + strArrSplit[0]);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NamedDeviceType)) {
            return false;
        }
        NamedDeviceType namedDeviceType = (NamedDeviceType) obj;
        return this.deviceType.equals(namedDeviceType.deviceType) && this.udn.equals(namedDeviceType.udn);
    }

    public DeviceType getDeviceType() {
        return this.deviceType;
    }

    public UDN getUdn() {
        return this.udn;
    }

    public int hashCode() {
        return (this.udn.hashCode() * 31) + this.deviceType.hashCode();
    }

    public String toString() {
        return getUdn().toString() + "::" + getDeviceType().toString();
    }
}
