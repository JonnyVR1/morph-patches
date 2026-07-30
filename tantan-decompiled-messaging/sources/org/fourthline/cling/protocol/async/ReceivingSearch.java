package org.fourthline.cling.protocol.async;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.DiscoveryOptions;
import org.fourthline.cling.model.Location;
import org.fourthline.cling.model.NetworkAddress;
import org.fourthline.cling.model.message.IncomingDatagramMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.discovery.IncomingSearchRequest;
import org.fourthline.cling.model.message.discovery.OutgoingSearchResponse;
import org.fourthline.cling.model.message.discovery.OutgoingSearchResponseDeviceType;
import org.fourthline.cling.model.message.discovery.OutgoingSearchResponseRootDevice;
import org.fourthline.cling.model.message.discovery.OutgoingSearchResponseServiceType;
import org.fourthline.cling.model.message.discovery.OutgoingSearchResponseUDN;
import org.fourthline.cling.model.message.header.DeviceTypeHeader;
import org.fourthline.cling.model.message.header.MXHeader;
import org.fourthline.cling.model.message.header.RootDeviceHeader;
import org.fourthline.cling.model.message.header.STAllHeader;
import org.fourthline.cling.model.message.header.ServiceTypeHeader;
import org.fourthline.cling.model.message.header.UDNHeader;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.model.meta.LocalDevice;
import org.fourthline.cling.model.types.DeviceType;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDN;
import org.fourthline.cling.protocol.ReceivingAsync;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: loaded from: classes3.dex */
public class ReceivingSearch extends ReceivingAsync<IncomingSearchRequest> {
    private static final boolean LOG_ENABLED;
    private static final Logger log;
    protected final Random randomGenerator;

    static {
        Logger logger = Logger.getLogger(ReceivingSearch.class.getName());
        log = logger;
        LOG_ENABLED = logger.isLoggable(Level.FINE);
    }

    public ReceivingSearch(UpnpService upnpService, IncomingDatagramMessage<UpnpRequest> incomingDatagramMessage) {
        super(upnpService, new IncomingSearchRequest(incomingDatagramMessage));
        this.randomGenerator = new Random();
    }

    public List<OutgoingSearchResponse> createDeviceMessages(LocalDevice localDevice, NetworkAddress networkAddress) {
        ArrayList arrayList = new ArrayList();
        if (localDevice.isRoot()) {
            arrayList.add(new OutgoingSearchResponseRootDevice(getInputMessage(), getDescriptorLocation(networkAddress, localDevice), localDevice));
        }
        arrayList.add(new OutgoingSearchResponseUDN(getInputMessage(), getDescriptorLocation(networkAddress, localDevice), localDevice));
        arrayList.add(new OutgoingSearchResponseDeviceType(getInputMessage(), getDescriptorLocation(networkAddress, localDevice), localDevice));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            prepareOutgoingSearchResponse((OutgoingSearchResponse) it.next());
        }
        return arrayList;
    }

    public List<OutgoingSearchResponse> createServiceTypeMessages(LocalDevice localDevice, NetworkAddress networkAddress) {
        ArrayList arrayList = new ArrayList();
        for (ServiceType serviceType : localDevice.findServiceTypes()) {
            OutgoingSearchResponseServiceType outgoingSearchResponseServiceType = new OutgoingSearchResponseServiceType(getInputMessage(), getDescriptorLocation(networkAddress, localDevice), localDevice, serviceType);
            prepareOutgoingSearchResponse(outgoingSearchResponseServiceType);
            arrayList.add(outgoingSearchResponseServiceType);
        }
        return arrayList;
    }

    @Override // org.fourthline.cling.protocol.ReceivingAsync
    public void execute() throws RouterException {
        if (getUpnpService().getRouter() == null) {
            log.fine("Router hasn't completed initialization, ignoring received search message");
            return;
        }
        if (!getInputMessage().isMANSSDPDiscover()) {
            log.fine("Invalid search request, no or invalid MAN ssdp:discover header: " + getInputMessage());
            return;
        }
        UpnpHeader searchTarget = getInputMessage().getSearchTarget();
        if (searchTarget == null) {
            log.fine("Invalid search request, did not contain ST header: " + getInputMessage());
            return;
        }
        List<NetworkAddress> activeStreamServers = getUpnpService().getRouter().getActiveStreamServers(getInputMessage().getLocalAddress());
        if (activeStreamServers.size() == 0) {
            log.fine("Aborting search response, no active stream servers found (network disabled?)");
            return;
        }
        Iterator<NetworkAddress> it = activeStreamServers.iterator();
        while (it.hasNext()) {
            sendResponses(searchTarget, it.next());
        }
    }

    public Location getDescriptorLocation(NetworkAddress networkAddress, LocalDevice localDevice) {
        return new Location(networkAddress, getUpnpService().getConfiguration().getNamespace().getDescriptorPathString(localDevice));
    }

    public boolean isAdvertisementDisabled(LocalDevice localDevice) {
        DiscoveryOptions discoveryOptions = getUpnpService().getRegistry().getDiscoveryOptions(localDevice.getIdentity().getUdn());
        return (discoveryOptions == null || discoveryOptions.isAdvertised()) ? false : true;
    }

    public void prepareOutgoingSearchResponse(OutgoingSearchResponse outgoingSearchResponse) {
    }

    public void sendResponses(UpnpHeader upnpHeader, NetworkAddress networkAddress) throws RouterException {
        if (upnpHeader instanceof STAllHeader) {
            sendSearchResponseAll(networkAddress);
            return;
        }
        if (upnpHeader instanceof RootDeviceHeader) {
            sendSearchResponseRootDevices(networkAddress);
            return;
        }
        if (upnpHeader instanceof UDNHeader) {
            sendSearchResponseUDN((UDN) upnpHeader.getValue(), networkAddress);
            return;
        }
        if (upnpHeader instanceof DeviceTypeHeader) {
            sendSearchResponseDeviceType((DeviceType) upnpHeader.getValue(), networkAddress);
            return;
        }
        if (upnpHeader instanceof ServiceTypeHeader) {
            sendSearchResponseServiceType((ServiceType) upnpHeader.getValue(), networkAddress);
            return;
        }
        log.warning("Non-implemented search request target: " + upnpHeader.getClass());
    }

    public void sendSearchResponseAll(NetworkAddress networkAddress) throws RouterException {
        if (LOG_ENABLED) {
            log.fine("Responding to 'all' search with advertisement messages for all local devices");
        }
        for (LocalDevice localDevice : getUpnpService().getRegistry().getLocalDevices()) {
            if (!isAdvertisementDisabled(localDevice)) {
                if (LOG_ENABLED) {
                    log.finer("Sending root device messages: " + localDevice);
                }
                Iterator<OutgoingSearchResponse> it = createDeviceMessages(localDevice, networkAddress).iterator();
                while (it.hasNext()) {
                    getUpnpService().getRouter().send(it.next());
                }
                if (localDevice.hasEmbeddedDevices()) {
                    for (LocalDevice localDevice2 : localDevice.findEmbeddedDevices()) {
                        if (LOG_ENABLED) {
                            log.finer("Sending embedded device messages: " + localDevice2);
                        }
                        Iterator<OutgoingSearchResponse> it2 = createDeviceMessages(localDevice2, networkAddress).iterator();
                        while (it2.hasNext()) {
                            getUpnpService().getRouter().send(it2.next());
                        }
                    }
                }
                List<OutgoingSearchResponse> listCreateServiceTypeMessages = createServiceTypeMessages(localDevice, networkAddress);
                if (listCreateServiceTypeMessages.size() > 0) {
                    if (LOG_ENABLED) {
                        log.finer("Sending service type messages");
                    }
                    Iterator<OutgoingSearchResponse> it3 = listCreateServiceTypeMessages.iterator();
                    while (it3.hasNext()) {
                        getUpnpService().getRouter().send(it3.next());
                    }
                }
            }
        }
    }

    public void sendSearchResponseDeviceType(DeviceType deviceType, NetworkAddress networkAddress) throws RouterException {
        log.fine("Responding to device type search: " + deviceType);
        for (Device device : getUpnpService().getRegistry().getDevices(deviceType)) {
            if (device instanceof LocalDevice) {
                LocalDevice localDevice = (LocalDevice) device;
                if (!isAdvertisementDisabled(localDevice)) {
                    log.finer("Sending matching device type search result for: " + device);
                    OutgoingSearchResponseDeviceType outgoingSearchResponseDeviceType = new OutgoingSearchResponseDeviceType(getInputMessage(), getDescriptorLocation(networkAddress, localDevice), localDevice);
                    prepareOutgoingSearchResponse(outgoingSearchResponseDeviceType);
                    getUpnpService().getRouter().send(outgoingSearchResponseDeviceType);
                }
            }
        }
    }

    public void sendSearchResponseRootDevices(NetworkAddress networkAddress) throws RouterException {
        log.fine("Responding to root device search with advertisement messages for all local root devices");
        for (LocalDevice localDevice : getUpnpService().getRegistry().getLocalDevices()) {
            if (!isAdvertisementDisabled(localDevice)) {
                OutgoingSearchResponseRootDevice outgoingSearchResponseRootDevice = new OutgoingSearchResponseRootDevice(getInputMessage(), getDescriptorLocation(networkAddress, localDevice), localDevice);
                prepareOutgoingSearchResponse(outgoingSearchResponseRootDevice);
                getUpnpService().getRouter().send(outgoingSearchResponseRootDevice);
            }
        }
    }

    public void sendSearchResponseServiceType(ServiceType serviceType, NetworkAddress networkAddress) throws RouterException {
        log.fine("Responding to service type search: " + serviceType);
        for (Device device : getUpnpService().getRegistry().getDevices(serviceType)) {
            if (device instanceof LocalDevice) {
                LocalDevice localDevice = (LocalDevice) device;
                if (!isAdvertisementDisabled(localDevice)) {
                    log.finer("Sending matching service type search result: " + device);
                    OutgoingSearchResponseServiceType outgoingSearchResponseServiceType = new OutgoingSearchResponseServiceType(getInputMessage(), getDescriptorLocation(networkAddress, localDevice), localDevice, serviceType);
                    prepareOutgoingSearchResponse(outgoingSearchResponseServiceType);
                    getUpnpService().getRouter().send(outgoingSearchResponseServiceType);
                }
            }
        }
    }

    public void sendSearchResponseUDN(UDN udn, NetworkAddress networkAddress) throws RouterException {
        Device device = getUpnpService().getRegistry().getDevice(udn, false);
        if (device == null || !(device instanceof LocalDevice)) {
            return;
        }
        LocalDevice localDevice = (LocalDevice) device;
        if (isAdvertisementDisabled(localDevice)) {
            return;
        }
        log.fine("Responding to UDN device search: " + udn);
        OutgoingSearchResponseUDN outgoingSearchResponseUDN = new OutgoingSearchResponseUDN(getInputMessage(), getDescriptorLocation(networkAddress, localDevice), localDevice);
        prepareOutgoingSearchResponse(outgoingSearchResponseUDN);
        getUpnpService().getRouter().send(outgoingSearchResponseUDN);
    }

    @Override // org.fourthline.cling.protocol.ReceivingAsync
    public boolean waitBeforeExecution() throws InterruptedException {
        Integer mx = getInputMessage().getMX();
        if (mx == null) {
            log.fine("Invalid search request, did not contain MX header: " + getInputMessage());
            return false;
        }
        if (mx.intValue() > 120 || mx.intValue() <= 0) {
            mx = MXHeader.DEFAULT_VALUE;
        }
        if (getUpnpService().getRegistry().getLocalDevices().size() <= 0) {
            return true;
        }
        int iNextInt = this.randomGenerator.nextInt(mx.intValue() * 1000);
        log.fine("Sleeping " + iNextInt + " milliseconds to avoid flooding with search responses");
        Thread.sleep((long) iNextInt);
        return true;
    }
}
