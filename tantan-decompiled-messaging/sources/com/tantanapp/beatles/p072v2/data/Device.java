package com.tantanapp.beatles.p072v2.data;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class Device {
    private String[] arch;

    @SerializedName("boot_time")
    private String bootTime;
    private String brand;

    @SerializedName("connection_type")
    private String connectionType;

    @SerializedName("arch_active")
    private String currentArch;
    private Long externalFreeStorage;
    private Long externalStorageSize;
    private String family;

    @SerializedName("free_memory")
    private Long freeMemory;

    @SerializedName("free_storage")
    private Long freeStorage;

    /* JADX INFO: renamed from: id */
    private String f56005id;
    private Boolean lowMemory;
    private String manufacturer;

    @SerializedName("memory_size")
    private Long memorySize;
    private String model;

    @SerializedName("model_id")
    private String modelId;
    private Float screenDensity;
    private Integer screenDpi;

    @SerializedName("screen_height")
    private Integer screenHeightPixels;

    @SerializedName("screen_width")
    private Integer screenWidthPixels;

    @SerializedName("storage_size")
    private Long storageSize;

    @SerializedName("usable_memory")
    private Long usableMemory;

    public String[] getArch() {
        return this.arch;
    }

    public String getBootTime() {
        return this.bootTime;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getConnectionType() {
        return this.connectionType;
    }

    public String getCurrentArch() {
        return this.currentArch;
    }

    public Long getExternalFreeStorage() {
        return this.externalFreeStorage;
    }

    public Long getExternalStorageSize() {
        return this.externalStorageSize;
    }

    public String getFamily() {
        return this.family;
    }

    public Long getFreeMemory() {
        return this.freeMemory;
    }

    public Long getFreeStorage() {
        return this.freeStorage;
    }

    public String getId() {
        return this.f56005id;
    }

    public Boolean getLowMemory() {
        return this.lowMemory;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public Long getMemorySize() {
        return this.memorySize;
    }

    public String getModel() {
        return this.model;
    }

    public String getModelId() {
        return this.modelId;
    }

    public Float getScreenDensity() {
        return this.screenDensity;
    }

    public Integer getScreenDpi() {
        return this.screenDpi;
    }

    public Integer getScreenHeightPixels() {
        return this.screenHeightPixels;
    }

    public Integer getScreenWidthPixels() {
        return this.screenWidthPixels;
    }

    public Long getStorageSize() {
        return this.storageSize;
    }

    public Long getUsableMemory() {
        return this.usableMemory;
    }

    public void setArch(String[] strArr) {
        this.arch = strArr;
    }

    public void setBootTime(String str) {
        this.bootTime = str;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setConnectionType(String str) {
        this.connectionType = str;
    }

    public void setCurrentArch(String str) {
        this.currentArch = str;
    }

    public void setExternalFreeStorage(Long l2) {
        this.externalFreeStorage = l2;
    }

    public void setExternalStorageSize(Long l2) {
        this.externalStorageSize = l2;
    }

    public void setFamily(String str) {
        this.family = str;
    }

    public void setFreeMemory(Long l2) {
        this.freeMemory = l2;
    }

    public void setFreeStorage(Long l2) {
        this.freeStorage = l2;
    }

    public void setId(String str) {
        this.f56005id = str;
    }

    public void setLowMemory(Boolean bool) {
        this.lowMemory = bool;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setMemorySize(Long l2) {
        this.memorySize = l2;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setModelId(String str) {
        this.modelId = str;
    }

    public void setScreenDensity(float f) {
        this.screenDensity = Float.valueOf(f);
    }

    public void setScreenDpi(int i) {
        this.screenDpi = Integer.valueOf(i);
    }

    public void setScreenHeightPixels(Integer num) {
        this.screenHeightPixels = num;
    }

    public void setScreenWidthPixels(Integer num) {
        this.screenWidthPixels = num;
    }

    public void setStorageSize(Long l2) {
        this.storageSize = l2;
    }

    public void setUsableMemory(Long l2) {
        this.usableMemory = l2;
    }
}
