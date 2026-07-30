package com.google.firebase.crashlytics.internal.model;

import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {
    private final int arch;
    private final int availableProcessors;
    private final long diskSpace;
    private final boolean isEmulator;
    private final String manufacturer;
    private final String model;
    private final String modelClass;
    private final int state;
    private final long totalRam;

    public AutoValue_StaticSessionData_DeviceData(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.arch = i;
        if (str == null) {
            jfd0.m141176a("Null model");
            throw null;
        }
        this.model = str;
        this.availableProcessors = i2;
        this.totalRam = j;
        this.diskSpace = j2;
        this.isEmulator = z;
        this.state = i3;
        if (str2 == null) {
            jfd0.m141176a("Null manufacturer");
            throw null;
        }
        this.manufacturer = str2;
        if (str3 != null) {
            this.modelClass = str3;
        } else {
            jfd0.m141176a("Null modelClass");
            throw null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int arch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int availableProcessors() {
        return this.availableProcessors;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long diskSpace() {
        return this.diskSpace;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.DeviceData) {
            StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
            if (this.arch == deviceData.arch() && this.model.equals(deviceData.model()) && this.availableProcessors == deviceData.availableProcessors() && this.totalRam == deviceData.totalRam() && this.diskSpace == deviceData.diskSpace() && this.isEmulator == deviceData.isEmulator() && this.state == deviceData.state() && this.manufacturer.equals(deviceData.manufacturer()) && this.modelClass.equals(deviceData.modelClass())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.arch ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.availableProcessors) * 1000003;
        long j = this.totalRam;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.diskSpace;
        return this.modelClass.hashCode() ^ ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.isEmulator ? 1231 : 1237)) * 1000003) ^ this.state) * 1000003) ^ this.manufacturer.hashCode()) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public boolean isEmulator() {
        return this.isEmulator;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String manufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String model() {
        return this.model;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String modelClass() {
        return this.modelClass;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int state() {
        return this.state;
    }

    public String toString() {
        return "DeviceData{arch=" + this.arch + ", model=" + this.model + ", availableProcessors=" + this.availableProcessors + ", totalRam=" + this.totalRam + ", diskSpace=" + this.diskSpace + ", isEmulator=" + this.isEmulator + ", state=" + this.state + ", manufacturer=" + this.manufacturer + ", modelClass=" + this.modelClass + "}";
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long totalRam() {
        return this.totalRam;
    }
}
