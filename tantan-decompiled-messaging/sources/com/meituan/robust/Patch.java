package com.meituan.robust;

import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class Patch implements Cloneable {
    private String appHash;
    private boolean isAppliedSuccess;
    private String localPath;
    private String md5;
    private String name;
    private String patchesInfoImplClassFullName;
    private String tempPath;
    private String url;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Patch m223813clone() {
        try {
            return (Patch) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void delete(String str) {
        new File(str).delete();
    }

    public String getAppHash() {
        return this.appHash;
    }

    public String getLocalPath() {
        return this.localPath + ShareConstants.JAR_SUFFIX;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public String getPatchesInfoImplClassFullName() {
        return this.patchesInfoImplClassFullName;
    }

    public String getTempPath() {
        return this.tempPath + "_temp.jar";
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isAppliedSuccess() {
        return this.isAppliedSuccess;
    }

    public void setAppHash(String str) {
        this.appHash = str;
    }

    public void setAppliedSuccess(boolean z) {
        this.isAppliedSuccess = z;
    }

    public void setLocalPath(String str) {
        this.localPath = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPatchesInfoImplClassFullName(String str) {
        this.patchesInfoImplClassFullName = str;
    }

    public void setTempPath(String str) {
        this.tempPath = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
