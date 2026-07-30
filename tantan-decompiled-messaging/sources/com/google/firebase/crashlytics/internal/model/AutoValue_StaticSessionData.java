package com.google.firebase.crashlytics.internal.model;

import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_StaticSessionData extends StaticSessionData {
    private final StaticSessionData.AppData appData;
    private final StaticSessionData.DeviceData deviceData;
    private final StaticSessionData.OsData osData;

    public AutoValue_StaticSessionData(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        if (appData == null) {
            jfd0.m141176a("Null appData");
            throw null;
        }
        this.appData = appData;
        if (osData == null) {
            jfd0.m141176a("Null osData");
            throw null;
        }
        this.osData = osData;
        if (deviceData != null) {
            this.deviceData = deviceData;
        } else {
            jfd0.m141176a("Null deviceData");
            throw null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.AppData appData() {
        return this.appData;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.DeviceData deviceData() {
        return this.deviceData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData) {
            StaticSessionData staticSessionData = (StaticSessionData) obj;
            if (this.appData.equals(staticSessionData.appData()) && this.osData.equals(staticSessionData.osData()) && this.deviceData.equals(staticSessionData.deviceData())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.deviceData.hashCode() ^ ((((this.appData.hashCode() ^ 1000003) * 1000003) ^ this.osData.hashCode()) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.OsData osData() {
        return this.osData;
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.appData + ", osData=" + this.osData + ", deviceData=" + this.deviceData + "}";
    }
}
