package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes.dex */
public class GetObjectMetaResult extends OSSResult {
    private ObjectMetadata metadata = new ObjectMetadata();

    public ObjectMetadata getMetadata() {
        return this.metadata;
    }

    public void setMetadata(ObjectMetadata objectMetadata) {
        this.metadata = objectMetadata;
    }
}
