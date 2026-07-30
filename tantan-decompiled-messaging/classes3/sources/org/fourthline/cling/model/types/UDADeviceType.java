package org.fourthline.cling.model.types;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p003l.f0c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class UDADeviceType extends DeviceType {
    public static final String DEFAULT_NAMESPACE = "schemas-upnp-org";
    public static final Pattern PATTERN = Pattern.compile("urn:schemas-upnp-org:device:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    public UDADeviceType(String str) {
        super("schemas-upnp-org", str, 1);
    }

    public static UDADeviceType valueOf(String str) throws InvalidValueException {
        Matcher matcher = PATTERN.matcher(str);
        try {
            if (matcher.matches()) {
                return new UDADeviceType(matcher.group(1), Integer.valueOf(matcher.group(2)).intValue());
            }
            f0c.m3956a("Can't parse UDA device type string (namespace/type/version): ", str);
            return null;
        } catch (RuntimeException e) {
            throw new InvalidValueException(String.format("Can't parse UDA device type string (namespace/type/version) '%s': %s", str, e.toString()));
        }
    }

    public UDADeviceType(String str, int i) {
        super("schemas-upnp-org", str, i);
    }
}
