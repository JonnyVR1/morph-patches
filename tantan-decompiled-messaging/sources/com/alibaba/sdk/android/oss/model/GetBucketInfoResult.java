package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes.dex */
public class GetBucketInfoResult extends OSSResult {
    private OSSBucketSummary bucket;

    public OSSBucketSummary getBucket() {
        return this.bucket;
    }

    public void setBucket(OSSBucketSummary oSSBucketSummary) {
        this.bucket = oSSBucketSummary;
    }

    @Override // com.alibaba.sdk.android.oss.model.OSSResult
    public String toString() {
        return String.format("GetBucketInfoResult<%s>:\n bucket:%s", super.toString(), this.bucket.toString());
    }
}
