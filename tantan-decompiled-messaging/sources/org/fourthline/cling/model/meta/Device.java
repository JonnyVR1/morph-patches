package org.fourthline.cling.model.meta;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.Namespace;
import org.fourthline.cling.model.Validatable;
import org.fourthline.cling.model.ValidationError;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.model.meta.DeviceIdentity;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.profile.RemoteClientInfo;
import org.fourthline.cling.model.resource.Resource;
import org.fourthline.cling.model.types.DeviceType;
import org.fourthline.cling.model.types.ServiceId;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDN;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Device<DI extends DeviceIdentity, D extends Device, S extends Service> implements Validatable {
    private static final Logger log = Logger.getLogger(Device.class.getName());
    private final DeviceDetails details;
    protected final D[] embeddedDevices;
    private final Icon[] icons;
    private final DI identity;
    private D parentDevice;
    protected final S[] services;
    private final DeviceType type;
    private final UDAVersion version;

    public Device(DI di, UDAVersion uDAVersion, DeviceType deviceType, DeviceDetails deviceDetails, Icon[] iconArr, S[] sArr, D[] dArr) throws ValidationException {
        boolean z;
        this.identity = di;
        this.version = uDAVersion == null ? new UDAVersion() : uDAVersion;
        this.type = deviceType;
        this.details = deviceDetails;
        ArrayList arrayList = new ArrayList();
        if (iconArr != null) {
            for (Icon icon : iconArr) {
                if (icon != null) {
                    icon.setDevice(this);
                    List<ValidationError> listValidate = icon.validate();
                    if (listValidate.isEmpty()) {
                        arrayList.add(icon);
                    } else {
                        log.warning("Discarding invalid '" + icon + "': " + listValidate);
                    }
                }
            }
        }
        this.icons = (Icon[]) arrayList.toArray(new Icon[arrayList.size()]);
        boolean z2 = true;
        if (sArr != null) {
            z = true;
            for (S s : sArr) {
                if (s != null) {
                    s.setDevice(this);
                    z = false;
                }
            }
        } else {
            z = true;
        }
        this.services = (sArr == null || z) ? null : sArr;
        if (dArr != null) {
            for (D d : dArr) {
                if (d != null) {
                    d.setParentDevice(this);
                    z2 = false;
                }
            }
        }
        this.embeddedDevices = (dArr == null || z2) ? null : dArr;
        List<ValidationError> listValidate2 = validate();
        if (listValidate2.size() > 0) {
            if (log.isLoggable(Level.FINEST)) {
                Iterator<ValidationError> it = listValidate2.iterator();
                while (it.hasNext()) {
                    log.finest(it.next().toString());
                }
            }
            throw new ValidationException("Validation of device graph failed, call getErrors() on exception", listValidate2);
        }
    }

    private boolean isMatch(Service service, ServiceType serviceType, ServiceId serviceId) {
        return (serviceType == null || service.getServiceType().implementsVersion(serviceType)) && (serviceId == null || service.getServiceId().equals(serviceId));
    }

    public abstract Resource[] discoverResources(Namespace namespace);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.identity.equals(((Device) obj).identity);
    }

    public D find(UDN udn, D d) {
        if (d.getIdentity() != null && d.getIdentity().getUdn() != null && d.getIdentity().getUdn().equals(udn)) {
            return d;
        }
        if (!d.hasEmbeddedDevices()) {
            return null;
        }
        for (Device device : d.getEmbeddedDevices()) {
            D d2 = (D) find(udn, device);
            if (d2 != null) {
                return d2;
            }
        }
        return null;
    }

    public abstract D findDevice(UDN udn);

    public D[] findDevices(DeviceType deviceType) {
        return (D[]) toDeviceArray(find(deviceType, this));
    }

    public Collection<D> findEmbeddedDevices(D d) {
        HashSet hashSet = new HashSet();
        if (!d.isRoot() && d.getIdentity().getUdn() != null) {
            hashSet.add(d);
        }
        if (d.hasEmbeddedDevices()) {
            for (Device device : d.getEmbeddedDevices()) {
                hashSet.addAll(findEmbeddedDevices(device));
            }
        }
        return hashSet;
    }

    public Icon[] findIcons() {
        ArrayList arrayList = new ArrayList();
        if (hasIcons()) {
            arrayList.addAll(Arrays.asList(getIcons()));
        }
        for (Device device : findEmbeddedDevices()) {
            if (device.hasIcons()) {
                arrayList.addAll(Arrays.asList(device.getIcons()));
            }
        }
        return (Icon[]) arrayList.toArray(new Icon[arrayList.size()]);
    }

    public S findService(ServiceId serviceId) {
        Collection<S> collectionFindServices = findServices(null, serviceId, this);
        if (collectionFindServices.size() == 1) {
            return collectionFindServices.iterator().next();
        }
        return null;
    }

    public ServiceType[] findServiceTypes() {
        Collection<S> collectionFindServices = findServices(null, null, this);
        HashSet hashSet = new HashSet();
        Iterator<S> it = collectionFindServices.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getServiceType());
        }
        return (ServiceType[]) hashSet.toArray(new ServiceType[hashSet.size()]);
    }

    public Collection<S> findServices(ServiceType serviceType, ServiceId serviceId, D d) {
        HashSet hashSet = new HashSet();
        if (d.hasServices()) {
            for (Service service : d.getServices()) {
                if (isMatch(service, serviceType, serviceId)) {
                    hashSet.add(service);
                }
            }
        }
        Collection<D> collectionFindEmbeddedDevices = findEmbeddedDevices(d);
        if (collectionFindEmbeddedDevices != null) {
            for (D d2 : collectionFindEmbeddedDevices) {
                if (d2.hasServices()) {
                    for (Service service2 : d2.getServices()) {
                        if (isMatch(service2, serviceType, serviceId)) {
                            hashSet.add(service2);
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    public DeviceDetails getDetails(RemoteClientInfo remoteClientInfo) {
        return getDetails();
    }

    public String getDisplayString() {
        String modelNumber;
        String str = "";
        String strTrim = null;
        if (getDetails() == null || getDetails().getModelDetails() == null) {
            modelNumber = null;
        } else {
            ModelDetails modelDetails = getDetails().getModelDetails();
            if (modelDetails.getModelName() != null) {
                strTrim = (modelDetails.getModelNumber() == null || !modelDetails.getModelName().endsWith(modelDetails.getModelNumber())) ? modelDetails.getModelName() : modelDetails.getModelName().substring(0, modelDetails.getModelName().length() - modelDetails.getModelNumber().length());
            }
            if (strTrim != null) {
                modelNumber = (modelDetails.getModelNumber() == null || strTrim.startsWith(modelDetails.getModelNumber())) ? "" : modelDetails.getModelNumber();
            } else {
                modelNumber = modelDetails.getModelNumber();
            }
        }
        StringBuilder sb = new StringBuilder();
        if (getDetails() != null && getDetails().getManufacturerDetails() != null) {
            if (strTrim != null && getDetails().getManufacturerDetails().getManufacturer() != null) {
                strTrim = strTrim.startsWith(getDetails().getManufacturerDetails().getManufacturer()) ? strTrim.substring(getDetails().getManufacturerDetails().getManufacturer().length()).trim() : strTrim.trim();
            }
            if (getDetails().getManufacturerDetails().getManufacturer() != null) {
                sb.append(getDetails().getManufacturerDetails().getManufacturer());
            }
        }
        sb.append((strTrim == null || strTrim.length() <= 0) ? "" : MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR.concat(strTrim));
        if (modelNumber != null && modelNumber.length() > 0) {
            str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + modelNumber.trim();
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract D[] getEmbeddedDevices();

    public Icon[] getIcons() {
        return this.icons;
    }

    public DI getIdentity() {
        return this.identity;
    }

    public D getParentDevice() {
        return this.parentDevice;
    }

    public abstract D getRoot();

    public abstract S[] getServices();

    public DeviceType getType() {
        return this.type;
    }

    public UDAVersion getVersion() {
        return this.version;
    }

    public boolean hasEmbeddedDevices() {
        return getEmbeddedDevices() != null && getEmbeddedDevices().length > 0;
    }

    public boolean hasIcons() {
        return getIcons() != null && getIcons().length > 0;
    }

    public boolean hasServices() {
        return getServices() != null && getServices().length > 0;
    }

    public int hashCode() {
        return this.identity.hashCode();
    }

    public boolean isFullyHydrated() {
        for (Service service : findServices()) {
            if (service.hasStateVariables()) {
                return true;
            }
        }
        return false;
    }

    public boolean isRoot() {
        return getParentDevice() == null;
    }

    public abstract D newInstance(UDN udn, UDAVersion uDAVersion, DeviceType deviceType, DeviceDetails deviceDetails, Icon[] iconArr, S[] sArr, List<D> list) throws ValidationException;

    public abstract S newInstance(ServiceType serviceType, ServiceId serviceId, URI uri, URI uri2, URI uri3, Action<S>[] actionArr, StateVariable<S>[] stateVariableArr) throws ValidationException;

    public abstract S[] newServiceArray(int i);

    public void setParentDevice(D d) {
        if (this.parentDevice == null) {
            this.parentDevice = d;
        } else {
            qkq0.m175383a("Final value has been set already, model is immutable");
        }
    }

    public abstract D[] toDeviceArray(Collection<D> collection);

    public abstract S[] toServiceArray(Collection<S> collection);

    public String toString() {
        return "(" + getClass().getSimpleName() + ") Identity: " + getIdentity().toString() + ", Root: " + isRoot();
    }

    @Override // org.fourthline.cling.model.Validatable
    public List<ValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (getType() != null) {
            arrayList.addAll(getVersion().validate());
            if (getIdentity() != null) {
                arrayList.addAll(getIdentity().validate());
            }
            if (getDetails() != null) {
                arrayList.addAll(getDetails().validate());
            }
            if (hasServices()) {
                for (Service service : getServices()) {
                    if (service != null) {
                        arrayList.addAll(service.validate());
                    }
                }
            }
            if (hasEmbeddedDevices()) {
                for (Device device : getEmbeddedDevices()) {
                    if (device != null) {
                        arrayList.addAll(device.validate());
                    }
                }
            }
        }
        return arrayList;
    }

    public DeviceDetails getDetails() {
        return this.details;
    }

    public D[] findDevices(ServiceType serviceType) {
        return (D[]) toDeviceArray(find(serviceType, this));
    }

    public S findService(ServiceType serviceType) {
        Collection<S> collectionFindServices = findServices(serviceType, null, this);
        if (collectionFindServices.size() > 0) {
            return collectionFindServices.iterator().next();
        }
        return null;
    }

    public D[] findEmbeddedDevices() {
        return (D[]) toDeviceArray(findEmbeddedDevices(this));
    }

    public Collection<D> find(DeviceType deviceType, D d) {
        HashSet hashSet = new HashSet();
        if (d.getType() != null && d.getType().implementsVersion(deviceType)) {
            hashSet.add(d);
        }
        if (d.hasEmbeddedDevices()) {
            for (Device device : d.getEmbeddedDevices()) {
                hashSet.addAll(find(deviceType, device));
            }
        }
        return hashSet;
    }

    public Collection<D> find(ServiceType serviceType, D d) {
        Collection<S> collectionFindServices = findServices(serviceType, null, d);
        HashSet hashSet = new HashSet();
        Iterator<S> it = collectionFindServices.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getDevice());
        }
        return hashSet;
    }

    public S[] findServices(ServiceType serviceType) {
        return (S[]) toServiceArray(findServices(serviceType, null, this));
    }

    public S[] findServices() {
        return (S[]) toServiceArray(findServices(null, null, this));
    }

    public Device(DI di, DeviceType deviceType, DeviceDetails deviceDetails, Icon[] iconArr, S[] sArr) throws ValidationException {
        this(di, null, deviceType, deviceDetails, iconArr, sArr, null);
    }

    public Device(DI di, DeviceType deviceType, DeviceDetails deviceDetails, Icon[] iconArr, S[] sArr, D[] dArr) throws ValidationException {
        this(di, null, deviceType, deviceDetails, iconArr, sArr, dArr);
    }

    public Device(DI di) throws ValidationException {
        this(di, null, null, null, null, null);
    }
}
