package com.momo.mcamera.mask.batchbean;

import com.google.gson.annotations.SerializedName;
import com.momo.mcamera.mask.BigEyeFilter;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class BatchMeta implements Serializable {

    @SerializedName("app")
    private String app;

    @SerializedName("format")
    private String format;

    @SerializedName("image")
    private String image;

    @SerializedName(BigEyeFilter.UNIFORM_SCALE)
    private String scale;

    @SerializedName("size")
    private BatchSize size;

    @SerializedName("smartupdate")
    private String smartupdate;

    @SerializedName(WBConstants.AUTH_PARAMS_VERSION)
    private String version;

    public String getApp() {
        return this.app;
    }

    public String getFormat() {
        return this.format;
    }

    public String getImage() {
        return this.image;
    }

    public String getScale() {
        return this.scale;
    }

    public BatchSize getSize() {
        return this.size;
    }

    public String getSmartupdate() {
        return this.smartupdate;
    }

    public String getVersion() {
        return this.version;
    }

    public void setApp(String str) {
        this.app = str;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setScale(String str) {
        this.scale = str;
    }

    public void setSize(BatchSize batchSize) {
        this.size = batchSize;
    }

    public void setSmartupdate(String str) {
        this.smartupdate = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
