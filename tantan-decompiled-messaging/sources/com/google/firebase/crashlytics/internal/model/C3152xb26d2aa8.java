package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import p149l.jfd0;
import p149l.rkq0;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch */
/* JADX INFO: loaded from: classes7.dex */
final class C3152xb26d2aa8 extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {
    private final String arch;
    private final String buildId;
    private final String libraryName;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$Builder */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {
        private String arch;
        private String buildId;
        private String libraryName;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch build() {
            String str;
            String str2;
            String str3 = this.arch;
            if (str3 != null && (str = this.libraryName) != null && (str2 = this.buildId) != null) {
                return new C3152xb26d2aa8(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.arch == null) {
                sb.append(" arch");
            }
            if (this.libraryName == null) {
                sb.append(" libraryName");
            }
            if (this.buildId == null) {
                sb.append(" buildId");
            }
            rkq0.m179764a("Missing required properties:", sb);
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setArch(String str) {
            if (str != null) {
                this.arch = str;
                return this;
            }
            jfd0.m141176a("Null arch");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setBuildId(String str) {
            if (str != null) {
                this.buildId = str;
                return this;
            }
            jfd0.m141176a("Null buildId");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setLibraryName(String str) {
            if (str != null) {
                this.libraryName = str;
                return this;
            }
            jfd0.m141176a("Null libraryName");
            return null;
        }
    }

    private C3152xb26d2aa8(String str, String str2, String str3) {
        this.arch = str;
        this.libraryName = str2;
        this.buildId = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) {
            CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
            if (this.arch.equals(buildIdMappingForArch.getArch()) && this.libraryName.equals(buildIdMappingForArch.getLibraryName()) && this.buildId.equals(buildIdMappingForArch.getBuildId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public String getArch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public String getBuildId() {
        return this.buildId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public String getLibraryName() {
        return this.libraryName;
    }

    public int hashCode() {
        return this.buildId.hashCode() ^ ((((this.arch.hashCode() ^ 1000003) * 1000003) ^ this.libraryName.hashCode()) * 1000003);
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.arch + ", libraryName=" + this.libraryName + ", buildId=" + this.buildId + "}";
    }
}
