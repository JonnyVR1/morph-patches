package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import p153l.mnd0;
import p153l.xtq0;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant */
/* JADX INFO: loaded from: classes7.dex */
final class C3195x87204092 extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant {
    private final String rolloutId;
    private final String variantId;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$Builder */
    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder {
        private String rolloutId;
        private String variantId;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant build() {
            String str;
            String str2 = this.rolloutId;
            if (str2 != null && (str = this.variantId) != null) {
                return new C3195x87204092(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.rolloutId == null) {
                sb.append(" rolloutId");
            }
            if (this.variantId == null) {
                sb.append(" variantId");
            }
            xtq0.m213103a("Missing required properties:", sb);
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setRolloutId(String str) {
            if (str != null) {
                this.rolloutId = str;
                return this;
            }
            mnd0.m159157a("Null rolloutId");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setVariantId(String str) {
            if (str != null) {
                this.variantId = str;
                return this;
            }
            mnd0.m159157a("Null variantId");
            return null;
        }
    }

    private C3195x87204092(String str, String str2) {
        this.rolloutId = str;
        this.variantId = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
            if (this.rolloutId.equals(rolloutVariant.getRolloutId()) && this.variantId.equals(rolloutVariant.getVariantId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    @NonNull
    public String getRolloutId() {
        return this.rolloutId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    @NonNull
    public String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        return this.variantId.hashCode() ^ ((this.rolloutId.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.rolloutId + ", variantId=" + this.variantId + "}";
    }
}
