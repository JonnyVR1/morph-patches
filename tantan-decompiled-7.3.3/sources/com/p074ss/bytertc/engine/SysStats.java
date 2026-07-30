package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class SysStats {
    public double cpuAppUsage;
    public int cpuCores;
    public double cpuTotalUsage;
    public long freeMemory;
    public long fullMemory;
    public double memoryRatio;
    public double memoryUsage;
    public double totalMemoryRatio;
    public long totalMemoryUsage;

    public SysStats(int i, double d, double d2, double d3, long j, long j2, long j3, double d4, double d5) {
        this.cpuCores = i;
        this.cpuAppUsage = d;
        this.cpuTotalUsage = d2;
        this.memoryUsage = d3;
        this.fullMemory = j;
        this.totalMemoryUsage = j2;
        this.freeMemory = j3;
        this.memoryRatio = d4;
        this.totalMemoryRatio = d5;
    }

    @CalledByNative
    private static SysStats create(int i, double d, double d2, double d3, long j, long j2, long j3, double d4, double d5) {
        return new SysStats(i, d, d2, d3, j, j2, j3, d4, d5);
    }

    public String toString() {
        return "SysStats{cpu_cores=" + this.cpuCores + "' cpu_app_usage=" + this.cpuAppUsage + "', cpu_total_usage=" + this.cpuTotalUsage + ", memory_usage=" + this.memoryUsage + "full_memory=" + this.fullMemory + "'total_memory_usage=" + this.totalMemoryUsage + "'free_memory=" + this.freeMemory + "'memory_ratio=" + this.memoryRatio + "'total_memory_ratio=" + this.totalMemoryRatio + '}';
    }

    public SysStats() {
    }
}
