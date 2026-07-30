package org.fourthline.cling.model.meta;

import java.net.InetAddress;
import java.net.URL;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.message.discovery.IncomingNotificationRequest;
import org.fourthline.cling.model.message.discovery.IncomingSearchResponse;
import org.fourthline.cling.model.types.UDN;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RemoteDeviceIdentity extends DeviceIdentity {
    private final URL descriptorURL;
    private final InetAddress discoveredOnLocalAddress;
    private final byte[] interfaceMacAddress;

    public RemoteDeviceIdentity(IncomingNotificationRequest incomingNotificationRequest) {
        this(incomingNotificationRequest.getUDN(), incomingNotificationRequest.getMaxAge(), incomingNotificationRequest.getLocationURL(), incomingNotificationRequest.getInterfaceMacHeader(), incomingNotificationRequest.getLocalAddress());
    }

    public URL getDescriptorURL() {
        return this.descriptorURL;
    }

    public InetAddress getDiscoveredOnLocalAddress() {
        return this.discoveredOnLocalAddress;
    }

    public byte[] getInterfaceMacAddress() {
        return this.interfaceMacAddress;
    }

    public byte[] getWakeOnLANBytes() {
        if (getInterfaceMacAddress() == null) {
            return null;
        }
        int length = 6;
        int length2 = (getInterfaceMacAddress().length * 16) + 6;
        byte[] bArr = new byte[length2];
        for (int i = 0; i < 6; i++) {
            bArr[i] = -1;
        }
        while (length < length2) {
            System.arraycopy(getInterfaceMacAddress(), 0, bArr, length, getInterfaceMacAddress().length);
            length += getInterfaceMacAddress().length;
        }
        return bArr;
    }

    @Override // org.fourthline.cling.model.meta.DeviceIdentity
    public String toString() {
        if (ModelUtil.ANDROID_RUNTIME) {
            return "(RemoteDeviceIdentity) UDN: " + getUdn() + ", Descriptor: " + getDescriptorURL();
        }
        return "(" + getClass().getSimpleName() + ") UDN: " + getUdn() + ", Descriptor: " + getDescriptorURL();
    }

    public RemoteDeviceIdentity(UDN udn, Integer num, URL url, byte[] bArr, InetAddress inetAddress) {
        super(udn, num);
        this.descriptorURL = url;
        this.interfaceMacAddress = bArr;
        this.discoveredOnLocalAddress = inetAddress;
    }

    public RemoteDeviceIdentity(UDN udn, RemoteDeviceIdentity remoteDeviceIdentity) {
        this(udn, remoteDeviceIdentity.getMaxAgeSeconds(), remoteDeviceIdentity.getDescriptorURL(), remoteDeviceIdentity.getInterfaceMacAddress(), remoteDeviceIdentity.getDiscoveredOnLocalAddress());
    }

    public RemoteDeviceIdentity(IncomingSearchResponse incomingSearchResponse) {
        this(incomingSearchResponse.getRootDeviceUDN(), incomingSearchResponse.getMaxAge(), incomingSearchResponse.getLocationURL(), incomingSearchResponse.getInterfaceMacHeader(), incomingSearchResponse.getLocalAddress());
    }
}
