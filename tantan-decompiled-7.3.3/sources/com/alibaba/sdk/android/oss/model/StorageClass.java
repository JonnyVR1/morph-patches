package com.alibaba.sdk.android.oss.model;

import p153l.ypg0;

/* JADX INFO: loaded from: classes.dex */
public enum StorageClass {
    Standard("Standard"),
    IA("IA"),
    Archive("Archive"),
    Unknown("Unknown");

    private String storageClassString;

    StorageClass(String str) {
        this.storageClassString = str;
    }

    public static StorageClass parse(String str) {
        for (StorageClass storageClass : values()) {
            if (storageClass.toString().equals(str)) {
                return storageClass;
            }
        }
        ypg0.m217021a("Unable to parse ", str);
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.storageClassString;
    }
}
