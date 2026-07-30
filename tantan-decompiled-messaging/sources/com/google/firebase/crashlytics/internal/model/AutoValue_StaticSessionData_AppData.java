package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_StaticSessionData_AppData extends StaticSessionData.AppData {
    private final String appIdentifier;
    private final int deliveryMechanism;
    private final DevelopmentPlatformProvider developmentPlatformProvider;
    private final String installUuid;
    private final String versionCode;
    private final String versionName;

    public AutoValue_StaticSessionData_AppData(String str, String str2, String str3, String str4, int i, DevelopmentPlatformProvider developmentPlatformProvider) {
        if (str == null) {
            jfd0.m141176a("Null appIdentifier");
            throw null;
        }
        this.appIdentifier = str;
        if (str2 == null) {
            jfd0.m141176a("Null versionCode");
            throw null;
        }
        this.versionCode = str2;
        if (str3 == null) {
            jfd0.m141176a("Null versionName");
            throw null;
        }
        this.versionName = str3;
        if (str4 == null) {
            jfd0.m141176a("Null installUuid");
            throw null;
        }
        this.installUuid = str4;
        this.deliveryMechanism = i;
        if (developmentPlatformProvider != null) {
            this.developmentPlatformProvider = developmentPlatformProvider;
        } else {
            jfd0.m141176a("Null developmentPlatformProvider");
            throw null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String appIdentifier() {
        return this.appIdentifier;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public int deliveryMechanism() {
        return this.deliveryMechanism;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public DevelopmentPlatformProvider developmentPlatformProvider() {
        return this.developmentPlatformProvider;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.AppData) {
            StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
            if (this.appIdentifier.equals(appData.appIdentifier()) && this.versionCode.equals(appData.versionCode()) && this.versionName.equals(appData.versionName()) && this.installUuid.equals(appData.installUuid()) && this.deliveryMechanism == appData.deliveryMechanism() && this.developmentPlatformProvider.equals(appData.developmentPlatformProvider())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.developmentPlatformProvider.hashCode() ^ ((((((((((this.appIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.versionCode.hashCode()) * 1000003) ^ this.versionName.hashCode()) * 1000003) ^ this.installUuid.hashCode()) * 1000003) ^ this.deliveryMechanism) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String installUuid() {
        return this.installUuid;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.appIdentifier + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ", installUuid=" + this.installUuid + ", deliveryMechanism=" + this.deliveryMechanism + ", developmentPlatformProvider=" + this.developmentPlatformProvider + "}";
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionCode() {
        return this.versionCode;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionName() {
        return this.versionName;
    }
}
