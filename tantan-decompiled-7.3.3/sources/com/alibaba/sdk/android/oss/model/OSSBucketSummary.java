package com.alibaba.sdk.android.oss.model;

import com.clevertap.android.sdk.Constants;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class OSSBucketSummary {
    private CannedAccessControlList acl;
    public Date createDate;
    public String extranetEndpoint;
    public String intranetEndpoint;
    public String location;
    public String name;
    public Owner owner;
    public String storageClass;

    public String getAcl() {
        CannedAccessControlList cannedAccessControlList = this.acl;
        if (cannedAccessControlList != null) {
            return cannedAccessControlList.toString();
        }
        return null;
    }

    public void setAcl(String str) {
        this.acl = CannedAccessControlList.parseACL(str);
    }

    public String toString() {
        String str = this.storageClass;
        String str2 = this.name;
        if (str == null) {
            return "OSSBucket [name=" + str2 + ", creationDate=" + this.createDate + ", owner=" + this.owner.toString() + ", location=" + this.location + Constants.AES_SUFFIX;
        }
        return "OSSBucket [name=" + str2 + ", creationDate=" + this.createDate + ", owner=" + this.owner.toString() + ", location=" + this.location + ", storageClass=" + this.storageClass + Constants.AES_SUFFIX;
    }
}
