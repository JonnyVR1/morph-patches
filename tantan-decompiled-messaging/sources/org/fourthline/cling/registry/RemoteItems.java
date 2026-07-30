package org.fourthline.cling.registry;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.gena.RemoteGENASubscription;
import org.fourthline.cling.model.meta.LocalDevice;
import org.fourthline.cling.model.meta.RemoteDevice;
import org.fourthline.cling.model.meta.RemoteDeviceIdentity;
import org.fourthline.cling.model.resource.Resource;
import org.fourthline.cling.model.types.UDN;

/* JADX INFO: loaded from: classes3.dex */
class RemoteItems extends RegistryItems<RemoteDevice, RemoteGENASubscription> {
    private static Logger log = Logger.getLogger(Registry.class.getName());

    public RemoteItems(RegistryImpl registryImpl) {
        super(registryImpl);
    }

    @Override // org.fourthline.cling.registry.RegistryItems
    public void add(final RemoteDevice remoteDevice) {
        if (update(remoteDevice.getIdentity())) {
            log.fine("Ignoring addition, device already registered: " + remoteDevice);
            return;
        }
        Resource[] resources = getResources(remoteDevice);
        for (Resource resource : resources) {
            log.fine("Validating remote device resource; " + resource);
            if (this.registry.getResource(resource.getPathQuery()) != null) {
                throw new RegistrationException("URI namespace conflict with already registered resource: " + resource);
            }
        }
        for (Resource resource2 : resources) {
            this.registry.addResource(resource2);
            log.fine("Added remote device resource: " + resource2);
        }
        RegistryItem<UDN, RemoteDevice> registryItem = new RegistryItem<>(remoteDevice.getIdentity().getUdn(), remoteDevice, (this.registry.getConfiguration().getRemoteDeviceMaxAgeSeconds() != null ? this.registry.getConfiguration().getRemoteDeviceMaxAgeSeconds() : remoteDevice.getIdentity().getMaxAgeSeconds()).intValue());
        log.fine("Adding hydrated remote device to registry with " + registryItem.getExpirationDetails().getMaxAgeSeconds() + " seconds expiration: " + remoteDevice);
        getDeviceItems().add(registryItem);
        if (log.isLoggable(Level.FINEST)) {
            StringBuilder sb = new StringBuilder("\n-------------------------- START Registry Namespace -----------------------------------\n");
            Iterator<Resource> it = this.registry.getResources().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(SignParameters.NEW_LINE);
            }
            sb.append("-------------------------- END Registry Namespace -----------------------------------");
            log.finest(sb.toString());
        }
        log.fine("Completely hydrated remote device graph available, calling listeners: " + remoteDevice);
        for (final RegistryListener registryListener : this.registry.getListeners()) {
            this.registry.getConfiguration().getRegistryListenerExecutor().execute(new Runnable() { // from class: org.fourthline.cling.registry.RemoteItems.1
                @Override // java.lang.Runnable
                public void run() {
                    registryListener.remoteDeviceAdded(RemoteItems.this.registry, remoteDevice);
                }
            });
        }
    }

    @Override // org.fourthline.cling.registry.RegistryItems
    public void maintain() {
        if (getDeviceItems().isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        for (RegistryItem<UDN, RemoteDevice> registryItem : getDeviceItems()) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Device '" + registryItem.getItem() + "' expires in seconds: " + registryItem.getExpirationDetails().getSecondsUntilExpiration());
            }
            if (registryItem.getExpirationDetails().hasExpired(false)) {
                map.put(registryItem.getKey(), registryItem.getItem());
            }
        }
        for (RemoteDevice remoteDevice : map.values()) {
            if (log.isLoggable(Level.FINE)) {
                log.fine("Removing expired: " + remoteDevice);
            }
            remove(remoteDevice);
        }
        HashSet<RemoteGENASubscription> hashSet = new HashSet();
        for (RegistryItem<String, RemoteGENASubscription> registryItem2 : getSubscriptionItems()) {
            if (registryItem2.getExpirationDetails().hasExpired(true)) {
                hashSet.add(registryItem2.getItem());
            }
        }
        for (RemoteGENASubscription remoteGENASubscription : hashSet) {
            if (log.isLoggable(Level.FINEST)) {
                log.fine("Renewing outgoing subscription: " + remoteGENASubscription);
            }
            renewOutgoingSubscription(remoteGENASubscription);
        }
    }

    public boolean remove(RemoteDevice remoteDevice, boolean z) throws RegistrationException {
        final RemoteDevice remoteDevice2 = (RemoteDevice) get(remoteDevice.getIdentity().getUdn(), true);
        if (remoteDevice2 == null) {
            return false;
        }
        log.fine("Removing remote device from registry: " + remoteDevice);
        for (Resource resource : getResources(remoteDevice2)) {
            if (this.registry.removeResource(resource)) {
                log.fine("Unregistered resource: " + resource);
            }
        }
        Iterator it = getSubscriptionItems().iterator();
        while (it.hasNext()) {
            final RegistryItem registryItem = (RegistryItem) it.next();
            if (((RemoteGENASubscription) registryItem.getItem()).getService().getDevice().getIdentity().getUdn().equals(remoteDevice2.getIdentity().getUdn())) {
                log.fine("Removing outgoing subscription: " + ((String) registryItem.getKey()));
                it.remove();
                if (!z) {
                    this.registry.getConfiguration().getRegistryListenerExecutor().execute(new Runnable() { // from class: org.fourthline.cling.registry.RemoteItems.3
                        @Override // java.lang.Runnable
                        public void run() {
                            ((RemoteGENASubscription) registryItem.getItem()).end(CancelReason.DEVICE_WAS_REMOVED, null);
                        }
                    });
                }
            }
        }
        if (!z) {
            for (final RegistryListener registryListener : this.registry.getListeners()) {
                this.registry.getConfiguration().getRegistryListenerExecutor().execute(new Runnable() { // from class: org.fourthline.cling.registry.RemoteItems.4
                    @Override // java.lang.Runnable
                    public void run() {
                        registryListener.remoteDeviceRemoved(RemoteItems.this.registry, remoteDevice2);
                    }
                });
            }
        }
        getDeviceItems().remove(new RegistryItem(remoteDevice2.getIdentity().getUdn()));
        return true;
    }

    public void removeAll(boolean z) {
        for (RemoteDevice remoteDevice : (RemoteDevice[]) get().toArray(new RemoteDevice[get().size()])) {
            remove(remoteDevice, z);
        }
    }

    public void renewOutgoingSubscription(RemoteGENASubscription remoteGENASubscription) {
        RegistryImpl registryImpl = this.registry;
        registryImpl.executeAsyncProtocol(registryImpl.getProtocolFactory().createSendingRenewal(remoteGENASubscription));
    }

    public void resume() {
        log.fine("Updating remote device expiration timestamps on resume");
        ArrayList arrayList = new ArrayList();
        Iterator<RegistryItem<UDN, RemoteDevice>> it = getDeviceItems().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getItem().getIdentity());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            update((RemoteDeviceIdentity) it2.next());
        }
    }

    @Override // org.fourthline.cling.registry.RegistryItems
    public void shutdown() {
        log.fine("Cancelling all outgoing subscriptions to remote devices during shutdown");
        ArrayList arrayList = new ArrayList();
        Iterator<RegistryItem<String, RemoteGENASubscription>> it = getSubscriptionItems().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getItem());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.registry.getProtocolFactory().createSendingUnsubscribe((RemoteGENASubscription) it2.next()).run();
        }
        log.fine("Removing all remote devices from registry during shutdown");
        removeAll(true);
    }

    public void start() {
    }

    public boolean update(RemoteDeviceIdentity remoteDeviceIdentity) {
        Iterator<LocalDevice> it = this.registry.getLocalDevices().iterator();
        while (it.hasNext()) {
            if (it.next().findDevice(remoteDeviceIdentity.getUdn()) != null) {
                log.fine("Ignoring update, a local device graph contains UDN");
                return true;
            }
        }
        RemoteDevice root = get(remoteDeviceIdentity.getUdn(), false);
        if (root == null) {
            return false;
        }
        if (!root.isRoot()) {
            log.fine("Updating root device of embedded: " + root);
            root = root.getRoot();
        }
        final RegistryItem<UDN, RemoteDevice> registryItem = new RegistryItem<>(root.getIdentity().getUdn(), root, (this.registry.getConfiguration().getRemoteDeviceMaxAgeSeconds() != null ? this.registry.getConfiguration().getRemoteDeviceMaxAgeSeconds() : remoteDeviceIdentity.getMaxAgeSeconds()).intValue());
        log.fine("Updating expiration of: " + root);
        getDeviceItems().remove(registryItem);
        getDeviceItems().add(registryItem);
        log.fine("Remote device updated, calling listeners: " + root);
        for (final RegistryListener registryListener : this.registry.getListeners()) {
            this.registry.getConfiguration().getRegistryListenerExecutor().execute(new Runnable() { // from class: org.fourthline.cling.registry.RemoteItems.2
                @Override // java.lang.Runnable
                public void run() {
                    registryListener.remoteDeviceUpdated(RemoteItems.this.registry, (RemoteDevice) registryItem.getItem());
                }
            });
        }
        return true;
    }

    @Override // org.fourthline.cling.registry.RegistryItems
    public void removeAll() {
        removeAll(false);
    }

    @Override // org.fourthline.cling.registry.RegistryItems
    public boolean remove(RemoteDevice remoteDevice) {
        return remove(remoteDevice, false);
    }
}
