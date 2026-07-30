package org.fourthline.cling.registry;

import org.fourthline.cling.model.ExpirationDetails;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class RegistryItem<K, I> {
    private ExpirationDetails expirationDetails;
    private I item;
    private K key;

    public RegistryItem(K k, I i, int i2) {
        this.expirationDetails = new ExpirationDetails();
        this.key = k;
        this.item = i;
        this.expirationDetails = new ExpirationDetails(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.key.equals(((RegistryItem) obj).key);
    }

    public ExpirationDetails getExpirationDetails() {
        return this.expirationDetails;
    }

    public I getItem() {
        return this.item;
    }

    public K getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") " + getExpirationDetails() + " KEY: " + getKey() + " ITEM: " + getItem();
    }

    public RegistryItem(K k) {
        this.expirationDetails = new ExpirationDetails();
        this.key = k;
    }
}
