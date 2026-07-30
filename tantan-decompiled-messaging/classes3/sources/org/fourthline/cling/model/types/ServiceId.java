package org.fourthline.cling.model.types;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.ig3;
import org.fourthline.cling.model.Constants;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ServiceId {
    public static final String UNKNOWN = "UNKNOWN";

    /* JADX INFO: renamed from: id */
    private String f9552id;
    private String namespace;
    private static final Logger log = Logger.getLogger(ServiceId.class.getName());
    public static final Pattern PATTERN = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:([a-zA-Z_0-9\\-:\\.]{1,64})");
    public static final Pattern BROKEN_PATTERN = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-:\\.]{1,64})");

    public ServiceId(String str, String str2) {
        if (str != null && !str.matches(Constants.REGEX_NAMESPACE)) {
            ig3.a("Service ID namespace contains illegal characters");
            throw null;
        }
        this.namespace = str;
        if (str2 == null || str2.matches(Constants.REGEX_ID)) {
            this.f9552id = str2;
        } else {
            ig3.a("Service ID suffix too long (64) or contains illegal characters");
            throw null;
        }
    }

    public static ServiceId valueOf(String str) throws InvalidValueException {
        UDAServiceId uDAServiceIdValueOf;
        try {
            uDAServiceIdValueOf = UDAServiceId.valueOf(str);
        } catch (Exception unused) {
            uDAServiceIdValueOf = null;
        }
        if (uDAServiceIdValueOf != null) {
            return uDAServiceIdValueOf;
        }
        Matcher matcher = PATTERN.matcher(str);
        if (matcher.matches() && matcher.groupCount() >= 2) {
            return new ServiceId(matcher.group(1), matcher.group(2));
        }
        Matcher matcher2 = BROKEN_PATTERN.matcher(str);
        if (matcher2.matches() && matcher2.groupCount() >= 2) {
            return new ServiceId(matcher2.group(1), matcher2.group(2));
        }
        Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:").matcher(str);
        if (!matcher3.matches() || matcher3.groupCount() < 1) {
            String[] strArrSplit = str.split("[:]");
            if (strArrSplit.length != 4) {
                throw new InvalidValueException("Can't parse service ID string (namespace/id): ".concat(str));
            }
            log.warning("UPnP specification violation, trying a simple colon-split of: ".concat(str));
            return new ServiceId(strArrSplit[1], strArrSplit[3]);
        }
        log.warning("UPnP specification violation, no service ID token, defaulting to UNKNOWN: " + str);
        return new ServiceId(matcher3.group(1), "UNKNOWN");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ServiceId)) {
            return false;
        }
        ServiceId serviceId = (ServiceId) obj;
        return this.f9552id.equals(serviceId.f9552id) && this.namespace.equals(serviceId.namespace);
    }

    public String getId() {
        return this.f9552id;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public int hashCode() {
        return (this.namespace.hashCode() * 31) + this.f9552id.hashCode();
    }

    public String toString() {
        return "urn:" + getNamespace() + ":serviceId:" + getId();
    }
}
