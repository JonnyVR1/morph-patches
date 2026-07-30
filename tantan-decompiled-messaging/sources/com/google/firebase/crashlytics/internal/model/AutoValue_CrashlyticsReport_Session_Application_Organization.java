package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_CrashlyticsReport_Session_Application_Organization extends CrashlyticsReport.Session.Application.Organization {
    private final String clsId;

    private AutoValue_CrashlyticsReport_Session_Application_Organization(String str) {
        this.clsId = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application.Organization) {
            return this.clsId.equals(((CrashlyticsReport.Session.Application.Organization) obj).getClsId());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    @NonNull
    public String getClsId() {
        return this.clsId;
    }

    public int hashCode() {
        return this.clsId.hashCode() ^ 1000003;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    public CrashlyticsReport.Session.Application.Organization.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "Organization{clsId=" + this.clsId + "}";
    }

    public static final class Builder extends CrashlyticsReport.Session.Application.Organization.Builder {
        private String clsId;

        private Builder(CrashlyticsReport.Session.Application.Organization organization) {
            this.clsId = organization.getClsId();
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public CrashlyticsReport.Session.Application.Organization build() {
            String str = this.clsId;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_Application_Organization(str);
            }
            qkq0.m175383a("Missing required properties: clsId");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public CrashlyticsReport.Session.Application.Organization.Builder setClsId(String str) {
            if (str != null) {
                this.clsId = str;
                return this;
            }
            jfd0.m141176a("Null clsId");
            return null;
        }

        public Builder() {
        }
    }
}
