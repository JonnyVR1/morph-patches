package org.fourthline.cling.support.model.container;

import org.fourthline.cling.support.model.DIDLObject;

/* JADX INFO: loaded from: classes3.dex */
public class StorageFolder extends Container {
    public static final DIDLObject.Class CLASS = new DIDLObject.Class("object.container.storageFolder");

    public StorageFolder(String str, String str2, String str3, String str4, Integer num, Long l2) {
        super(str, str2, str3, str4, CLASS, num);
        if (l2 != null) {
            setStorageUsed(l2);
        }
    }

    public Long getStorageUsed() {
        return (Long) getFirstPropertyValue(DIDLObject.Property.UPNP.STORAGE_USED.class);
    }

    public StorageFolder setStorageUsed(Long l2) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.STORAGE_USED(l2));
        return this;
    }

    public StorageFolder(Container container) {
        super(container);
    }

    public StorageFolder(String str, Container container, String str2, String str3, Integer num, Long l2) {
        this(str, container.getId(), str2, str3, num, l2);
    }

    public StorageFolder() {
        setClazz(CLASS);
    }
}
