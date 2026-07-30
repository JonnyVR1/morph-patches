package org.fourthline.cling.registry;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.gena.GENASubscription;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.model.resource.Resource;
import org.fourthline.cling.model.types.DeviceType;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDN;

/* JADX INFO: loaded from: classes3.dex */
abstract class RegistryItems<D extends Device, S extends GENASubscription> {
    protected final RegistryImpl registry;
    protected final Set<RegistryItem<UDN, D>> deviceItems = new HashSet();
    protected final Set<RegistryItem<String, S>> subscriptionItems = new HashSet();

    public RegistryItems(RegistryImpl registryImpl) {
        this.registry = registryImpl;
    }

    public abstract void add(D d);

    public void addSubscription(S s) {
        this.subscriptionItems.add(new RegistryItem<>(s.getSubscriptionId(), s, s.getActualDurationSeconds()));
    }

    public boolean contains(D d) {
        return contains(d.getIdentity().getUdn());
    }

    public D get(UDN udn, boolean z) {
        D d;
        for (RegistryItem<UDN, D> registryItem : this.deviceItems) {
            D item = registryItem.getItem();
            if (item.getIdentity().getUdn().equals(udn)) {
                return item;
            }
            if (!z && (d = (D) registryItem.getItem().findDevice(udn)) != null) {
                return d;
            }
        }
        return null;
    }

    public Set<RegistryItem<UDN, D>> getDeviceItems() {
        return this.deviceItems;
    }

    public Resource[] getResources(Device device) throws RegistrationException {
        try {
            return this.registry.getConfiguration().getNamespace().getResources(device);
        } catch (ValidationException e) {
            throw new RegistrationException("Resource discover error: " + e.toString(), e);
        }
    }

    public S getSubscription(String str) {
        for (RegistryItem<String, S> registryItem : this.subscriptionItems) {
            if (registryItem.getKey().equals(str)) {
                return registryItem.getItem();
            }
        }
        return null;
    }

    public Set<RegistryItem<String, S>> getSubscriptionItems() {
        return this.subscriptionItems;
    }

    public abstract void maintain();

    public abstract boolean remove(D d);

    public abstract void removeAll();

    public boolean removeSubscription(S s) {
        return this.subscriptionItems.remove(new RegistryItem(s.getSubscriptionId()));
    }

    public abstract void shutdown();

    public boolean updateSubscription(S s) {
        if (!removeSubscription(s)) {
            return false;
        }
        addSubscription(s);
        return true;
    }

    public boolean contains(UDN udn) {
        return this.deviceItems.contains(new RegistryItem(udn));
    }

    public Collection<D> get(DeviceType deviceType) {
        HashSet hashSet = new HashSet();
        Iterator<RegistryItem<UDN, D>> it = this.deviceItems.iterator();
        while (it.hasNext()) {
            Device[] deviceArrFindDevices = it.next().getItem().findDevices(deviceType);
            if (deviceArrFindDevices != null) {
                hashSet.addAll(Arrays.asList(deviceArrFindDevices));
            }
        }
        return hashSet;
    }

    public Collection<D> get(ServiceType serviceType) {
        HashSet hashSet = new HashSet();
        Iterator<RegistryItem<UDN, D>> it = this.deviceItems.iterator();
        while (it.hasNext()) {
            Device[] deviceArrFindDevices = it.next().getItem().findDevices(serviceType);
            if (deviceArrFindDevices != null) {
                hashSet.addAll(Arrays.asList(deviceArrFindDevices));
            }
        }
        return hashSet;
    }

    public Collection<D> get() {
        HashSet hashSet = new HashSet();
        Iterator<RegistryItem<UDN, D>> it = this.deviceItems.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getItem());
        }
        return hashSet;
    }
}
