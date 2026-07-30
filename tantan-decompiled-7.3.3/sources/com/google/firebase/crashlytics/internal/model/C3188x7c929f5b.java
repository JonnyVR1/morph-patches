package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import p153l.mnd0;
import p153l.xtq0;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
/* JADX INFO: loaded from: classes7.dex */
final class C3188x7c929f5b extends CrashlyticsReport.Session.Event.Application.Execution.Signal {
    private final long address;
    private final String code;
    private final String name;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$Builder */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {
        private long address;
        private String code;
        private String name;
        private byte set$0;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal build() {
            String str;
            String str2;
            if (this.set$0 == 1 && (str = this.name) != null && (str2 = this.code) != null) {
                return new C3188x7c929f5b(str, str2, this.address);
            }
            StringBuilder sb = new StringBuilder();
            if (this.name == null) {
                sb.append(" name");
            }
            if (this.code == null) {
                sb.append(" code");
            }
            if ((this.set$0 & 1) == 0) {
                sb.append(" address");
            }
            xtq0.m213103a("Missing required properties:", sb);
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long j) {
            this.address = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(String str) {
            if (str != null) {
                this.code = str;
                return this;
            }
            mnd0.m159157a("Null code");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            mnd0.m159157a("Null name");
            return null;
        }
    }

    private C3188x7c929f5b(String str, String str2, long j) {
        this.name = str;
        this.code = str2;
        this.address = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal) {
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
            if (this.name.equals(signal.getName()) && this.code.equals(signal.getCode()) && this.address == signal.getAddress()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public long getAddress() {
        return this.address;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public String getCode() {
        return this.code;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = (((this.name.hashCode() ^ 1000003) * 1000003) ^ this.code.hashCode()) * 1000003;
        long j = this.address;
        return ((int) (j ^ (j >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "Signal{name=" + this.name + ", code=" + this.code + ", address=" + this.address + "}";
    }
}
