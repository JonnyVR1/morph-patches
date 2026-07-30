package org.fourthline.cling.support.model.container;

import org.fourthline.cling.support.model.DIDLObject;
import org.fourthline.cling.support.model.StorageMedium;

/* JADX INFO: loaded from: classes3.dex */
public class StorageSystem extends Container {
    public static final DIDLObject.Class CLASS = new DIDLObject.Class("object.container.storageSystem");

    public StorageSystem(String str, String str2, String str3, String str4, Integer num, Long l2, Long l3, Long l4, Long l5, StorageMedium storageMedium) {
        super(str, str2, str3, str4, CLASS, num);
        if (l2 != null) {
            setStorageTotal(l2);
        }
        if (l3 != null) {
            setStorageUsed(l3);
        }
        if (l4 != null) {
            setStorageFree(l4);
        }
        if (l5 != null) {
            setStorageMaxPartition(l5);
        }
        if (storageMedium != null) {
            setStorageMedium(storageMedium);
        }
    }

    public Long getStorageFree() {
        return (Long) getFirstPropertyValue(DIDLObject.Property.UPNP.STORAGE_FREE.class);
    }

    public Long getStorageMaxPartition() {
        return (Long) getFirstPropertyValue(DIDLObject.Property.UPNP.STORAGE_MAX_PARTITION.class);
    }

    public StorageMedium getStorageMedium() {
        return (StorageMedium) getFirstPropertyValue(DIDLObject.Property.UPNP.STORAGE_MEDIUM.class);
    }

    public Long getStorageTotal() {
        return (Long) getFirstPropertyValue(DIDLObject.Property.UPNP.STORAGE_TOTAL.class);
    }

    public Long getStorageUsed() {
        return (Long) getFirstPropertyValue(DIDLObject.Property.UPNP.STORAGE_USED.class);
    }

    public StorageSystem setStorageFree(Long l2) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.STORAGE_FREE(l2));
        return this;
    }

    public StorageSystem setStorageMaxPartition(Long l2) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.STORAGE_MAX_PARTITION(l2));
        return this;
    }

    public StorageSystem setStorageMedium(StorageMedium storageMedium) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.STORAGE_MEDIUM(storageMedium));
        return this;
    }

    public StorageSystem setStorageTotal(Long l2) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.STORAGE_TOTAL(l2));
        return this;
    }

    public StorageSystem setStorageUsed(Long l2) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.STORAGE_USED(l2));
        return this;
    }

    public StorageSystem(Container container) {
        super(container);
    }

    public StorageSystem(String str, Container container, String str2, String str3, Integer num, Long l2, Long l3, Long l4, Long l5, StorageMedium storageMedium) {
        this(str, container.getId(), str2, str3, num, l2, l3, l4, l5, storageMedium);
    }

    public StorageSystem() {
        setClazz(CLASS);
    }
}
