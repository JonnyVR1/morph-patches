package org.fourthline.cling.model;

import org.fourthline.cling.model.types.ServiceId;
import org.fourthline.cling.model.types.UDN;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ServiceReference {
    public static final String DELIMITER = "/";
    private final ServiceId serviceId;
    private final UDN udn;

    public ServiceReference(String str) {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length == 2) {
            this.udn = UDN.valueOf(strArrSplit[0]);
            this.serviceId = ServiceId.valueOf(strArrSplit[1]);
        } else {
            this.udn = null;
            this.serviceId = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceReference serviceReference = (ServiceReference) obj;
        return this.serviceId.equals(serviceReference.serviceId) && this.udn.equals(serviceReference.udn);
    }

    public ServiceId getServiceId() {
        return this.serviceId;
    }

    public UDN getUdn() {
        return this.udn;
    }

    public int hashCode() {
        return (this.udn.hashCode() * 31) + this.serviceId.hashCode();
    }

    public String toString() {
        if (this.udn == null || this.serviceId == null) {
            return "";
        }
        return this.udn.toString() + "/" + this.serviceId.toString();
    }

    public ServiceReference(UDN udn, ServiceId serviceId) {
        this.udn = udn;
        this.serviceId = serviceId;
    }
}
