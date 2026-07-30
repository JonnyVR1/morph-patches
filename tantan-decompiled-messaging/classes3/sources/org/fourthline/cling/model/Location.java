package org.fourthline.cling.model;

import java.net.InetAddress;
import java.net.URL;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Location {
    protected final NetworkAddress networkAddress;
    protected final String path;
    protected final URL url;

    public Location(NetworkAddress networkAddress, String str) {
        this.networkAddress = networkAddress;
        this.path = str;
        this.url = createAbsoluteURL(networkAddress.getAddress(), networkAddress.getPort(), str);
    }

    private static URL createAbsoluteURL(InetAddress inetAddress, int i, String str) {
        try {
            return new URL("http", inetAddress.getHostAddress(), i, str);
        } catch (Exception e) {
            throw new IllegalArgumentException("Address, port, and URI can not be converted to URL", e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Location location = (Location) obj;
        return this.networkAddress.equals(location.networkAddress) && this.path.equals(location.path);
    }

    public NetworkAddress getNetworkAddress() {
        return this.networkAddress;
    }

    public String getPath() {
        return this.path;
    }

    public URL getURL() {
        return this.url;
    }

    public int hashCode() {
        return (this.networkAddress.hashCode() * 31) + this.path.hashCode();
    }
}
