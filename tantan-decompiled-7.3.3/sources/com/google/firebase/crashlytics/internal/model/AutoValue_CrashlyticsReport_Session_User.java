package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_CrashlyticsReport_Session_User extends CrashlyticsReport.Session.User {
    private final String identifier;

    public static final class Builder extends CrashlyticsReport.Session.User.Builder {
        private String identifier;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public CrashlyticsReport.Session.User build() {
            String str = this.identifier;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_User(str);
            }
            wtq0.m207906a("Missing required properties: identifier");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public CrashlyticsReport.Session.User.Builder setIdentifier(String str) {
            if (str != null) {
                this.identifier = str;
                return this;
            }
            mnd0.m159157a("Null identifier");
            return null;
        }
    }

    private AutoValue_CrashlyticsReport_Session_User(String str) {
        this.identifier = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.identifier.equals(((CrashlyticsReport.Session.User) obj).getIdentifier());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
    @NonNull
    public String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.identifier + "}";
    }
}
