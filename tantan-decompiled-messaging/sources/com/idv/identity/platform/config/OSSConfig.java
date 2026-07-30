package com.idv.identity.platform.config;

/* JADX INFO: loaded from: classes7.dex */
public class OSSConfig {
    public String AccessKeyId;
    public String AccessKeySecret;
    public String BucketName;
    public String FileNamePrefix;
    public String OssEndPoint;
    public String SecurityToken;

    public String toString() {
        return "OSSConfig{OssEndPoint='" + this.OssEndPoint + "', AccessKeyId='" + this.AccessKeyId + "', AccessKeySecret='" + this.AccessKeySecret + "', SecurityToken='" + this.SecurityToken + "', BucketName='" + this.BucketName + "', FileName='" + this.FileNamePrefix + "'}";
    }
}
