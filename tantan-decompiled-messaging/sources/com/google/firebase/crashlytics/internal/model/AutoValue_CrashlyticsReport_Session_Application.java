package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.jfd0;
import p149l.rkq0;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.Session.Application {
    private final String developmentPlatform;
    private final String developmentPlatformVersion;
    private final String displayVersion;
    private final String identifier;
    private final String installationUuid;
    private final CrashlyticsReport.Session.Application.Organization organization;
    private final String version;

    private AutoValue_CrashlyticsReport_Session_Application(String str, String str2, @Nullable String str3, @Nullable CrashlyticsReport.Session.Application.Organization organization, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.identifier = str;
        this.version = str2;
        this.displayVersion = str3;
        this.organization = organization;
        this.installationUuid = str4;
        this.developmentPlatform = str5;
        this.developmentPlatformVersion = str6;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Application.Organization organization;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application) {
            CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
            if (this.identifier.equals(application.getIdentifier()) && this.version.equals(application.getVersion()) && ((str = this.displayVersion) != null ? str.equals(application.getDisplayVersion()) : application.getDisplayVersion() == null) && ((organization = this.organization) != null ? organization.equals(application.getOrganization()) : application.getOrganization() == null) && ((str2 = this.installationUuid) != null ? str2.equals(application.getInstallationUuid()) : application.getInstallationUuid() == null) && ((str3 = this.developmentPlatform) != null ? str3.equals(application.getDevelopmentPlatform()) : application.getDevelopmentPlatform() == null) && ((str4 = this.developmentPlatformVersion) != null ? str4.equals(application.getDevelopmentPlatformVersion()) : application.getDevelopmentPlatformVersion() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public String getDevelopmentPlatform() {
        return this.developmentPlatform;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public String getDevelopmentPlatformVersion() {
        return this.developmentPlatformVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public String getDisplayVersion() {
        return this.displayVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @NonNull
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public String getInstallationUuid() {
        return this.installationUuid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public CrashlyticsReport.Session.Application.Organization getOrganization() {
        return this.organization;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @NonNull
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = (((this.identifier.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode()) * 1000003;
        String str = this.displayVersion;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.Session.Application.Organization organization = this.organization;
        int iHashCode3 = (iHashCode2 ^ (organization == null ? 0 : organization.hashCode())) * 1000003;
        String str2 = this.installationUuid;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.developmentPlatform;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.developmentPlatformVersion;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public CrashlyticsReport.Session.Application.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "Application{identifier=" + this.identifier + ", version=" + this.version + ", displayVersion=" + this.displayVersion + ", organization=" + this.organization + ", installationUuid=" + this.installationUuid + ", developmentPlatform=" + this.developmentPlatform + ", developmentPlatformVersion=" + this.developmentPlatformVersion + "}";
    }

    public static final class Builder extends CrashlyticsReport.Session.Application.Builder {
        private String developmentPlatform;
        private String developmentPlatformVersion;
        private String displayVersion;
        private String identifier;
        private String installationUuid;
        private CrashlyticsReport.Session.Application.Organization organization;
        private String version;

        private Builder(CrashlyticsReport.Session.Application application) {
            this.identifier = application.getIdentifier();
            this.version = application.getVersion();
            this.displayVersion = application.getDisplayVersion();
            this.organization = application.getOrganization();
            this.installationUuid = application.getInstallationUuid();
            this.developmentPlatform = application.getDevelopmentPlatform();
            this.developmentPlatformVersion = application.getDevelopmentPlatformVersion();
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application build() {
            String str;
            String str2 = this.identifier;
            if (str2 != null && (str = this.version) != null) {
                return new AutoValue_CrashlyticsReport_Session_Application(str2, str, this.displayVersion, this.organization, this.installationUuid, this.developmentPlatform, this.developmentPlatformVersion);
            }
            StringBuilder sb = new StringBuilder();
            if (this.identifier == null) {
                sb.append(" identifier");
            }
            if (this.version == null) {
                sb.append(" version");
            }
            rkq0.m179764a("Missing required properties:", sb);
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDevelopmentPlatform(@Nullable String str) {
            this.developmentPlatform = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDevelopmentPlatformVersion(@Nullable String str) {
            this.developmentPlatformVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDisplayVersion(String str) {
            this.displayVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setIdentifier(String str) {
            if (str != null) {
                this.identifier = str;
                return this;
            }
            jfd0.m141176a("Null identifier");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setInstallationUuid(String str) {
            this.installationUuid = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setOrganization(CrashlyticsReport.Session.Application.Organization organization) {
            this.organization = organization;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setVersion(String str) {
            if (str != null) {
                this.version = str;
                return this;
            }
            jfd0.m141176a("Null version");
            return null;
        }

        public Builder() {
        }
    }
}
