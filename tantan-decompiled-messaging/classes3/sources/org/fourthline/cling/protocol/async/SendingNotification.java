package org.fourthline.cling.protocol.async;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.Location;
import org.fourthline.cling.model.NetworkAddress;
import org.fourthline.cling.model.message.discovery.OutgoingNotificationRequest;
import org.fourthline.cling.model.message.discovery.OutgoingNotificationRequestDeviceType;
import org.fourthline.cling.model.message.discovery.OutgoingNotificationRequestRootDevice;
import org.fourthline.cling.model.message.discovery.OutgoingNotificationRequestServiceType;
import org.fourthline.cling.model.message.discovery.OutgoingNotificationRequestUDN;
import org.fourthline.cling.model.meta.LocalDevice;
import org.fourthline.cling.model.types.NotificationSubtype;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.protocol.SendingAsync;
import org.fourthline.cling.transport.RouterException;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class SendingNotification extends SendingAsync {
    private static final Logger log = Logger.getLogger(SendingNotification.class.getName());
    private LocalDevice device;

    public SendingNotification(UpnpService upnpService, LocalDevice localDevice) {
        super(upnpService);
        this.device = localDevice;
    }

    public List<OutgoingNotificationRequest> createDeviceMessages(LocalDevice localDevice, Location location) {
        ArrayList arrayList = new ArrayList();
        if (localDevice.isRoot()) {
            arrayList.add(new OutgoingNotificationRequestRootDevice(location, localDevice, getNotificationSubtype()));
        }
        arrayList.add(new OutgoingNotificationRequestUDN(location, localDevice, getNotificationSubtype()));
        arrayList.add(new OutgoingNotificationRequestDeviceType(location, localDevice, getNotificationSubtype()));
        return arrayList;
    }

    public List<OutgoingNotificationRequest> createServiceTypeMessages(LocalDevice localDevice, Location location) {
        ArrayList arrayList = new ArrayList();
        for (ServiceType serviceType : localDevice.findServiceTypes()) {
            arrayList.add(new OutgoingNotificationRequestServiceType(location, localDevice, getNotificationSubtype(), serviceType));
        }
        return arrayList;
    }

    @Override // org.fourthline.cling.protocol.SendingAsync
    public void execute() throws RouterException {
        List<NetworkAddress> activeStreamServers = getUpnpService().getRouter().getActiveStreamServers(null);
        if (activeStreamServers.size() == 0) {
            log.fine("Aborting notifications, no active stream servers found (network disabled?)");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkAddress> it = activeStreamServers.iterator();
        while (it.hasNext()) {
            arrayList.add(new Location(it.next(), getUpnpService().getConfiguration().getNamespace().getDescriptorPathString(getDevice())));
        }
        for (int i = 0; i < getBulkRepeat(); i++) {
            try {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    sendMessages((Location) it2.next());
                }
                log.finer("Sleeping " + getBulkIntervalMilliseconds() + " milliseconds");
                Thread.sleep((long) getBulkIntervalMilliseconds());
            } catch (InterruptedException e) {
                log.warning("Advertisement thread was interrupted: " + e);
            }
        }
    }

    public int getBulkIntervalMilliseconds() {
        return CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA;
    }

    public int getBulkRepeat() {
        return 3;
    }

    public LocalDevice getDevice() {
        return this.device;
    }

    public abstract NotificationSubtype getNotificationSubtype();

    public void sendMessages(Location location) throws RouterException {
        log.finer("Sending root device messages: " + getDevice());
        Iterator<OutgoingNotificationRequest> it = createDeviceMessages(getDevice(), location).iterator();
        while (it.hasNext()) {
            getUpnpService().getRouter().send(it.next());
        }
        if (getDevice().hasEmbeddedDevices()) {
            for (LocalDevice localDevice : getDevice().findEmbeddedDevices()) {
                log.finer("Sending embedded device messages: " + localDevice);
                Iterator<OutgoingNotificationRequest> it2 = createDeviceMessages(localDevice, location).iterator();
                while (it2.hasNext()) {
                    getUpnpService().getRouter().send(it2.next());
                }
            }
        }
        List<OutgoingNotificationRequest> listCreateServiceTypeMessages = createServiceTypeMessages(getDevice(), location);
        if (listCreateServiceTypeMessages.size() > 0) {
            log.finer("Sending service type messages");
            Iterator<OutgoingNotificationRequest> it3 = listCreateServiceTypeMessages.iterator();
            while (it3.hasNext()) {
                getUpnpService().getRouter().send(it3.next());
            }
        }
    }
}
