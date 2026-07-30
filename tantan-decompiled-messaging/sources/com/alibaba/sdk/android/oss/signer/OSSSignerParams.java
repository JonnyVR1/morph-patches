package com.alibaba.sdk.android.oss.signer;

import com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class OSSSignerParams {
    private Set<String> additionalHeaderNames = new HashSet();
    private String cloudBoxId;
    private OSSCredentialProvider credentialProvider;
    private long expiration;
    private String product;
    private String region;
    private String resourcePath;

    public OSSSignerParams(String str, OSSCredentialProvider oSSCredentialProvider) {
        this.resourcePath = str;
        this.credentialProvider = oSSCredentialProvider;
    }

    public Set<String> getAdditionalHeaderNames() {
        return this.additionalHeaderNames;
    }

    public String getCloudBoxId() {
        return this.cloudBoxId;
    }

    public OSSCredentialProvider getCredentialProvider() {
        return this.credentialProvider;
    }

    public long getExpiration() {
        return this.expiration;
    }

    public String getProduct() {
        return this.product;
    }

    public String getRegion() {
        return this.region;
    }

    public String getResourcePath() {
        return this.resourcePath;
    }

    public void setAdditionalHeaderNames(Set<String> set) {
        this.additionalHeaderNames = set;
    }

    public void setCloudBoxId(String str) {
        this.cloudBoxId = str;
    }

    public void setCredentialProvider(OSSCredentialProvider oSSCredentialProvider) {
        this.credentialProvider = oSSCredentialProvider;
    }

    public void setExpiration(long j) {
        this.expiration = j;
    }

    public void setProduct(String str) {
        this.product = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setResourcePath(String str) {
        this.resourcePath = str;
    }
}
