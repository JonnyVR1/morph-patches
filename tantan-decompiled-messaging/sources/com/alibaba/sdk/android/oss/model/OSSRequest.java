package com.alibaba.sdk.android.oss.model;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class OSSRequest {
    private boolean isAuthorizationRequired = true;
    private Enum CRC64 = CRC64Config.NULL;
    private Set<String> additionalHeaderNames = new HashSet();

    public enum CRC64Config {
        NULL,
        YES,
        NO
    }

    public Set<String> getAdditionalHeaderNames() {
        return this.additionalHeaderNames;
    }

    public Enum getCRC64() {
        return this.CRC64;
    }

    public boolean isAuthorizationRequired() {
        return this.isAuthorizationRequired;
    }

    public void setAdditionalHeaderNames(Set<String> set) {
        this.additionalHeaderNames = set;
    }

    public void setCRC64(Enum r1) {
        this.CRC64 = r1;
    }

    public void setIsAuthorizationRequired(boolean z) {
        this.isAuthorizationRequired = z;
    }
}
