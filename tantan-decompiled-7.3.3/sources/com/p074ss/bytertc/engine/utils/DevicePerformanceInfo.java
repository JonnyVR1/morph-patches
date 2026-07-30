package com.p074ss.bytertc.engine.utils;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class DevicePerformanceInfo {
    public int cpuCores;
    public float cpuFrequency;
    public String cpuModel;
    public int cpuThreads;
    public String deviceModel;
    public String gpuModel;
    public float memory;

    /* JADX INFO: renamed from: os */
    public String f56487os;
    public String osVersion;

    public DevicePerformanceInfo(float f, int i, int i2, float f2, String str, String str2, String str3, String str4, String str5) {
        this.memory = f;
        this.cpuCores = i;
        this.cpuThreads = i2;
        this.cpuFrequency = f2;
        this.cpuModel = str;
        this.gpuModel = str2;
        this.f56487os = str3;
        this.osVersion = str4;
        this.deviceModel = str5;
    }

    @CalledByNative
    private static DevicePerformanceInfo create(float f, int i, int i2, float f2, String str, String str2, String str3, String str4, String str5) {
        return new DevicePerformanceInfo(f, i, i2, f2, str, str2, str3, str4, str5);
    }
}
