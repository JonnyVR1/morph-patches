package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFh1jSDK extends AFa1mSDK {
    private final boolean copydefault;
    private final boolean hashCode;

    public AFh1jSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.hashCode = bool != null ? bool.booleanValue() : true;
        this.copydefault = true;
    }

    public AFh1jSDK() {
        this(null, null, null);
    }
}
