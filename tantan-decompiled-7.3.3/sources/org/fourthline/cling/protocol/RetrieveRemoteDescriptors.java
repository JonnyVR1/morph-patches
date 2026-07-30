package org.fourthline.cling.protocol;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationError;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.meta.Icon;
import org.fourthline.cling.model.meta.RemoteDevice;
import org.fourthline.cling.model.meta.RemoteDeviceIdentity;
import org.fourthline.cling.model.meta.RemoteService;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDN;
import org.fourthline.cling.registry.RegistrationException;
import org.fourthline.cling.transport.RouterException;
import org.seamless.util.Exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class RetrieveRemoteDescriptors implements Runnable {
    protected List<UDN> errorsAlreadyLogged = new ArrayList();

    /* JADX INFO: renamed from: rd */
    private RemoteDevice f206857rd;
    private final UpnpService upnpService;
    private static final Logger log = Logger.getLogger(RetrieveRemoteDescriptors.class.getName());
    private static final Set<URL> activeRetrievals = new CopyOnWriteArraySet();

    public RetrieveRemoteDescriptors(UpnpService upnpService, RemoteDevice remoteDevice) {
        this.upnpService = upnpService;
        this.f206857rd = remoteDevice;
    }

    public void describe(String str) throws RouterException {
        RemoteDevice remoteDevice = null;
        try {
            RemoteDevice remoteDevice2 = (RemoteDevice) getUpnpService().getConfiguration().getDeviceDescriptorBinderUDA10().describe(this.f206857rd, str);
            try {
                Logger logger = log;
                logger.fine("Remote device described (without services) notifying listeners: " + remoteDevice2);
                boolean zNotifyDiscoveryStart = getUpnpService().getRegistry().notifyDiscoveryStart(remoteDevice2);
                logger.fine("Hydrating described device's services: " + remoteDevice2);
                RemoteDevice remoteDeviceDescribeServices = describeServices(remoteDevice2);
                if (remoteDeviceDescribeServices != null) {
                    logger.fine("Adding fully hydrated remote device to registry: " + remoteDeviceDescribeServices);
                    getUpnpService().getRegistry().addDevice(remoteDeviceDescribeServices);
                    return;
                }
                if (!this.errorsAlreadyLogged.contains(this.f206857rd.getIdentity().getUdn())) {
                    this.errorsAlreadyLogged.add(this.f206857rd.getIdentity().getUdn());
                    logger.warning("Device service description failed: " + this.f206857rd);
                }
                if (zNotifyDiscoveryStart) {
                    getUpnpService().getRegistry().notifyDiscoveryFailure(remoteDevice2, new DescriptorBindingException("Device service description failed: " + this.f206857rd));
                }
            } catch (DescriptorBindingException e) {
                e = e;
                remoteDevice = remoteDevice2;
                Logger logger2 = log;
                logger2.warning("Could not hydrate device or its services from descriptor: " + this.f206857rd);
                logger2.warning("Cause was: " + Exceptions.unwrap(e));
                if (remoteDevice == null || 0 == 0) {
                    return;
                }
                getUpnpService().getRegistry().notifyDiscoveryFailure(remoteDevice, e);
            } catch (ValidationException e2) {
                e = e2;
                remoteDevice = remoteDevice2;
                if (this.errorsAlreadyLogged.contains(this.f206857rd.getIdentity().getUdn())) {
                    return;
                }
                this.errorsAlreadyLogged.add(this.f206857rd.getIdentity().getUdn());
                log.warning("Could not validate device model: " + this.f206857rd);
                Iterator<ValidationError> it = e.getErrors().iterator();
                while (it.hasNext()) {
                    log.warning(it.next().toString());
                }
                if (remoteDevice == null || 0 == 0) {
                    return;
                }
                getUpnpService().getRegistry().notifyDiscoveryFailure(remoteDevice, e);
            } catch (RegistrationException e3) {
                e = e3;
                remoteDevice = remoteDevice2;
                Logger logger3 = log;
                logger3.warning("Adding hydrated device to registry failed: " + this.f206857rd);
                logger3.warning("Cause was: " + e.toString());
                if (remoteDevice == 0 || 0 == 0) {
                    return;
                }
                getUpnpService().getRegistry().notifyDiscoveryFailure(remoteDevice, e);
            }
        } catch (DescriptorBindingException e4) {
            e = e4;
        } catch (ValidationException e5) {
            e = e5;
        } catch (RegistrationException e6) {
            e = e6;
        }
    }

    public RemoteService describeService(RemoteService remoteService) throws RouterException, ValidationException, DescriptorBindingException {
        try {
            URL urlNormalizeURI = remoteService.getDevice().normalizeURI(remoteService.getDescriptorURI());
            StreamRequestMessage streamRequestMessage = new StreamRequestMessage(UpnpRequest.Method.GET, urlNormalizeURI);
            UpnpHeaders descriptorRetrievalHeaders = getUpnpService().getConfiguration().getDescriptorRetrievalHeaders(remoteService.getDevice().getIdentity());
            if (descriptorRetrievalHeaders != null) {
                streamRequestMessage.getHeaders().putAll(descriptorRetrievalHeaders);
            }
            Logger logger = log;
            logger.fine("Sending service descriptor retrieval message: " + streamRequestMessage);
            StreamResponseMessage streamResponseMessageSend = getUpnpService().getRouter().send(streamRequestMessage);
            if (streamResponseMessageSend == null) {
                logger.warning("Could not retrieve service descriptor, no response: " + remoteService);
                return null;
            }
            if (streamResponseMessageSend.getOperation().isFailed()) {
                logger.warning("Service descriptor retrieval failed: " + urlNormalizeURI + ", " + streamResponseMessageSend.getOperation().getResponseDetails());
                return null;
            }
            if (!streamResponseMessageSend.isContentTypeTextUDA()) {
                logger.fine("Received service descriptor without or with invalid Content-Type: " + urlNormalizeURI);
            }
            String bodyString = streamResponseMessageSend.getBodyString();
            if (bodyString == null || bodyString.length() == 0) {
                logger.warning("Received empty service descriptor:" + urlNormalizeURI);
                return null;
            }
            logger.fine("Received service descriptor, hydrating service model: " + streamResponseMessageSend);
            return (RemoteService) getUpnpService().getConfiguration().getServiceDescriptorBinderUDA10().describe(remoteService, bodyString);
        } catch (IllegalArgumentException unused) {
            log.warning("Could not normalize service descriptor URL: " + remoteService.getDescriptorURI());
            return null;
        }
    }

    public RemoteDevice describeServices(RemoteDevice remoteDevice) throws RouterException, ValidationException, DescriptorBindingException {
        RemoteDevice remoteDeviceDescribeServices;
        ArrayList arrayList = new ArrayList();
        if (remoteDevice.hasServices()) {
            for (RemoteService remoteService : filterExclusiveServices(remoteDevice.getServices())) {
                RemoteService remoteServiceDescribeService = describeService(remoteService);
                if (remoteServiceDescribeService != null) {
                    arrayList.add(remoteServiceDescribeService);
                } else {
                    log.warning("Skipping invalid service '" + remoteService + "' of: " + remoteDevice);
                }
            }
        }
        List<RemoteDevice> arrayList2 = new ArrayList<>();
        if (remoteDevice.hasEmbeddedDevices()) {
            for (RemoteDevice remoteDevice2 : remoteDevice.getEmbeddedDevices()) {
                if (remoteDevice2 != null && (remoteDeviceDescribeServices = describeServices(remoteDevice2)) != null) {
                    arrayList2.add(remoteDeviceDescribeServices);
                }
            }
        }
        Icon[] iconArr = new Icon[remoteDevice.getIcons().length];
        for (int i = 0; i < remoteDevice.getIcons().length; i++) {
            iconArr[i] = remoteDevice.getIcons()[i].deepCopy();
        }
        return remoteDevice.newInstance(((RemoteDeviceIdentity) remoteDevice.getIdentity()).getUdn(), remoteDevice.getVersion(), remoteDevice.getType(), remoteDevice.getDetails(), iconArr, remoteDevice.toServiceArray((Collection<RemoteService>) arrayList), arrayList2);
    }

    public List<RemoteService> filterExclusiveServices(RemoteService[] remoteServiceArr) {
        ServiceType[] exclusiveServiceTypes = getUpnpService().getConfiguration().getExclusiveServiceTypes();
        if (exclusiveServiceTypes == null || exclusiveServiceTypes.length == 0) {
            return Arrays.asList(remoteServiceArr);
        }
        ArrayList arrayList = new ArrayList();
        for (RemoteService remoteService : remoteServiceArr) {
            for (ServiceType serviceType : exclusiveServiceTypes) {
                if (remoteService.getServiceType().implementsVersion(serviceType)) {
                    log.fine("Including exclusive service: " + remoteService);
                    arrayList.add(remoteService);
                } else {
                    log.fine("Excluding unwanted service: " + serviceType);
                }
            }
        }
        return arrayList;
    }

    public UpnpService getUpnpService() {
        return this.upnpService;
    }

    @Override // java.lang.Runnable
    public void run() {
        URL descriptorURL = this.f206857rd.getIdentity().getDescriptorURL();
        Set<URL> set = activeRetrievals;
        if (set.contains(descriptorURL)) {
            log.finer("Exiting early, active retrieval for URL already in progress: " + descriptorURL);
            return;
        }
        if (getUpnpService().getRegistry().getRemoteDevice(this.f206857rd.getIdentity().getUdn(), true) != null) {
            log.finer("Exiting early, already discovered: " + descriptorURL);
            return;
        }
        try {
            try {
                set.add(descriptorURL);
                describe();
                set.remove(descriptorURL);
            } catch (RouterException e) {
                log.log(Level.WARNING, "Descriptor retrieval failed: " + descriptorURL, (Throwable) e);
                activeRetrievals.remove(descriptorURL);
            }
        } catch (Throwable th) {
            activeRetrievals.remove(descriptorURL);
            throw th;
        }
    }

    public void describe() throws RouterException {
        if (getUpnpService().getRouter() == null) {
            log.warning("Router not yet initialized");
            return;
        }
        try {
            StreamRequestMessage streamRequestMessage = new StreamRequestMessage(UpnpRequest.Method.GET, this.f206857rd.getIdentity().getDescriptorURL());
            UpnpHeaders descriptorRetrievalHeaders = getUpnpService().getConfiguration().getDescriptorRetrievalHeaders(this.f206857rd.getIdentity());
            if (descriptorRetrievalHeaders != null) {
                streamRequestMessage.getHeaders().putAll(descriptorRetrievalHeaders);
            }
            Logger logger = log;
            logger.fine("Sending device descriptor retrieval message: " + streamRequestMessage);
            StreamResponseMessage streamResponseMessageSend = getUpnpService().getRouter().send(streamRequestMessage);
            if (streamResponseMessageSend == null) {
                logger.warning("Device descriptor retrieval failed, no response: " + this.f206857rd.getIdentity().getDescriptorURL());
                return;
            }
            if (streamResponseMessageSend.getOperation().isFailed()) {
                logger.warning("Device descriptor retrieval failed: " + this.f206857rd.getIdentity().getDescriptorURL() + ", " + streamResponseMessageSend.getOperation().getResponseDetails());
                return;
            }
            if (!streamResponseMessageSend.isContentTypeTextUDA()) {
                logger.fine("Received device descriptor without or with invalid Content-Type: " + this.f206857rd.getIdentity().getDescriptorURL());
            }
            String bodyString = streamResponseMessageSend.getBodyString();
            if (bodyString != null && bodyString.length() != 0) {
                logger.fine("Received root device descriptor: " + streamResponseMessageSend);
                describe(bodyString);
                return;
            }
            logger.warning("Received empty device descriptor:" + this.f206857rd.getIdentity().getDescriptorURL());
        } catch (IllegalArgumentException e) {
            log.warning("Device descriptor retrieval failed: " + this.f206857rd.getIdentity().getDescriptorURL() + ", possibly invalid URL: " + e);
        }
    }
}
