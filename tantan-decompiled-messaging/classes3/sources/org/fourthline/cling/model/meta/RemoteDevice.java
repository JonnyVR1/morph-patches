package org.fourthline.cling.model.meta;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.fourthline.cling.model.Namespace;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.resource.Resource;
import org.fourthline.cling.model.resource.ServiceEventCallbackResource;
import org.fourthline.cling.model.types.DeviceType;
import org.fourthline.cling.model.types.ServiceId;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDN;
import org.seamless.util.URIUtil;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RemoteDevice extends Device<RemoteDeviceIdentity, RemoteDevice, RemoteService> {
    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, DeviceType deviceType, DeviceDetails deviceDetails, RemoteService remoteService, RemoteDevice remoteDevice) throws ValidationException {
        super(remoteDeviceIdentity, deviceType, deviceDetails, null, new RemoteService[]{remoteService}, new RemoteDevice[]{remoteDevice});
    }

    @Override // org.fourthline.cling.model.meta.Device
    public Resource[] discoverResources(Namespace namespace) {
        ArrayList arrayList = new ArrayList();
        for (RemoteService remoteService : getServices()) {
            if (remoteService != null) {
                arrayList.add(new ServiceEventCallbackResource(namespace.getEventCallbackPath(remoteService), remoteService));
            }
        }
        if (hasEmbeddedDevices()) {
            for (RemoteDevice remoteDevice : getEmbeddedDevices()) {
                if (remoteDevice != null) {
                    arrayList.addAll(Arrays.asList(remoteDevice.discoverResources(namespace)));
                }
            }
        }
        return (Resource[]) arrayList.toArray(new Resource[arrayList.size()]);
    }

    @Override // org.fourthline.cling.model.meta.Device
    public RemoteDevice findDevice(UDN udn) {
        return find(udn, this);
    }

    @Override // org.fourthline.cling.model.meta.Device
    public RemoteDevice[] getEmbeddedDevices() {
        D[] dArr = this.embeddedDevices;
        return dArr != 0 ? (RemoteDevice[]) dArr : new RemoteDevice[0];
    }

    @Override // org.fourthline.cling.model.meta.Device
    public RemoteDevice getRoot() {
        if (isRoot()) {
            return this;
        }
        while (this.getParentDevice() != null) {
            this = this.getParentDevice();
        }
        return this;
    }

    @Override // org.fourthline.cling.model.meta.Device
    public RemoteService[] getServices() {
        S[] sArr = this.services;
        return sArr != 0 ? (RemoteService[]) sArr : new RemoteService[0];
    }

    public RemoteDevice newInstance(UDN udn, UDAVersion uDAVersion, DeviceType deviceType, DeviceDetails deviceDetails, Icon[] iconArr, RemoteService[] remoteServiceArr, List<RemoteDevice> list) throws ValidationException {
        return new RemoteDevice(new RemoteDeviceIdentity(udn, getIdentity()), uDAVersion, deviceType, deviceDetails, iconArr, remoteServiceArr, list.size() > 0 ? (RemoteDevice[]) list.toArray(new RemoteDevice[list.size()]) : null);
    }

    public URL normalizeURI(URI uri) {
        return (getDetails() == null || getDetails().getBaseURL() == null) ? URIUtil.createAbsoluteURL(getIdentity().getDescriptorURL(), uri) : URIUtil.createAbsoluteURL(getDetails().getBaseURL(), uri);
    }

    @Override // org.fourthline.cling.model.meta.Device
    public RemoteDevice[] toDeviceArray(Collection<RemoteDevice> collection) {
        return (RemoteDevice[]) collection.toArray(new RemoteDevice[collection.size()]);
    }

    @Override // org.fourthline.cling.model.meta.Device
    public RemoteService[] toServiceArray(Collection<RemoteService> collection) {
        return (RemoteService[]) collection.toArray(new RemoteService[collection.size()]);
    }

    @Override // org.fourthline.cling.model.meta.Device
    public RemoteService[] newServiceArray(int i) {
        return new RemoteService[i];
    }

    @Override // org.fourthline.cling.model.meta.Device
    public /* bridge */ /* synthetic */ Device[] toDeviceArray(Collection collection) {
        return toDeviceArray((Collection<RemoteDevice>) collection);
    }

    @Override // org.fourthline.cling.model.meta.Device
    public /* bridge */ /* synthetic */ Service[] toServiceArray(Collection collection) {
        return toServiceArray((Collection<RemoteService>) collection);
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, DeviceType deviceType, DeviceDetails deviceDetails, RemoteService remoteService) throws ValidationException {
        super(remoteDeviceIdentity, deviceType, deviceDetails, null, new RemoteService[]{remoteService});
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity) throws ValidationException {
        super(remoteDeviceIdentity);
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, DeviceType deviceType, DeviceDetails deviceDetails, RemoteService[] remoteServiceArr) throws ValidationException {
        super(remoteDeviceIdentity, deviceType, deviceDetails, null, remoteServiceArr);
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, DeviceType deviceType, DeviceDetails deviceDetails, RemoteService[] remoteServiceArr, RemoteDevice[] remoteDeviceArr) throws ValidationException {
        super(remoteDeviceIdentity, deviceType, deviceDetails, null, remoteServiceArr, remoteDeviceArr);
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, DeviceType deviceType, DeviceDetails deviceDetails, Icon icon, RemoteService remoteService) throws ValidationException {
        super(remoteDeviceIdentity, deviceType, deviceDetails, new Icon[]{icon}, new RemoteService[]{remoteService});
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, DeviceType deviceType, DeviceDetails deviceDetails, Icon icon, RemoteService remoteService, RemoteDevice remoteDevice) throws ValidationException {
        super(remoteDeviceIdentity, deviceType, deviceDetails, new Icon[]{icon}, new RemoteService[]{remoteService}, new RemoteDevice[]{remoteDevice});
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, DeviceType deviceType, DeviceDetails deviceDetails, Icon icon, RemoteService[] remoteServiceArr) throws ValidationException {
        super(remoteDeviceIdentity, deviceType, deviceDetails, new Icon[]{icon}, remoteServiceArr);
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, DeviceType deviceType, DeviceDetails deviceDetails, Icon icon, RemoteService[] remoteServiceArr, RemoteDevice[] remoteDeviceArr) throws ValidationException {
        super(remoteDeviceIdentity, deviceType, deviceDetails, new Icon[]{icon}, remoteServiceArr, remoteDeviceArr);
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, DeviceType deviceType, DeviceDetails deviceDetails, Icon[] iconArr, RemoteService remoteService) throws ValidationException {
        super(remoteDeviceIdentity, deviceType, deviceDetails, iconArr, new RemoteService[]{remoteService});
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, DeviceType deviceType, DeviceDetails deviceDetails, Icon[] iconArr, RemoteService remoteService, RemoteDevice remoteDevice) throws ValidationException {
        super(remoteDeviceIdentity, deviceType, deviceDetails, iconArr, new RemoteService[]{remoteService}, new RemoteDevice[]{remoteDevice});
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, DeviceType deviceType, DeviceDetails deviceDetails, Icon[] iconArr, RemoteService[] remoteServiceArr) throws ValidationException {
        super(remoteDeviceIdentity, deviceType, deviceDetails, iconArr, remoteServiceArr);
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, DeviceType deviceType, DeviceDetails deviceDetails, Icon[] iconArr, RemoteService[] remoteServiceArr, RemoteDevice[] remoteDeviceArr) throws ValidationException {
        super(remoteDeviceIdentity, deviceType, deviceDetails, iconArr, remoteServiceArr, remoteDeviceArr);
    }

    public RemoteDevice(RemoteDeviceIdentity remoteDeviceIdentity, UDAVersion uDAVersion, DeviceType deviceType, DeviceDetails deviceDetails, Icon[] iconArr, RemoteService[] remoteServiceArr, RemoteDevice[] remoteDeviceArr) throws ValidationException {
        super(remoteDeviceIdentity, uDAVersion, deviceType, deviceDetails, iconArr, remoteServiceArr, remoteDeviceArr);
    }

    @Override // org.fourthline.cling.model.meta.Device
    public /* bridge */ /* synthetic */ Service newInstance(ServiceType serviceType, ServiceId serviceId, URI uri, URI uri2, URI uri3, Action[] actionArr, StateVariable[] stateVariableArr) throws ValidationException {
        return newInstance(serviceType, serviceId, uri, uri2, uri3, (Action<RemoteService>[]) actionArr, (StateVariable<RemoteService>[]) stateVariableArr);
    }

    @Override // org.fourthline.cling.model.meta.Device
    public /* bridge */ /* synthetic */ Device newInstance(UDN udn, UDAVersion uDAVersion, DeviceType deviceType, DeviceDetails deviceDetails, Icon[] iconArr, Service[] serviceArr, List list) throws ValidationException {
        return newInstance(udn, uDAVersion, deviceType, deviceDetails, iconArr, (RemoteService[]) serviceArr, (List<RemoteDevice>) list);
    }

    @Override // org.fourthline.cling.model.meta.Device
    public RemoteService newInstance(ServiceType serviceType, ServiceId serviceId, URI uri, URI uri2, URI uri3, Action<RemoteService>[] actionArr, StateVariable<RemoteService>[] stateVariableArr) throws ValidationException {
        return new RemoteService(serviceType, serviceId, uri, uri2, uri3, actionArr, stateVariableArr);
    }
}
