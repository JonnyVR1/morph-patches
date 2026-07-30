package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import p153l.mnd0;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_CrashlyticsReportWithSessionId extends CrashlyticsReportWithSessionId {
    private final CrashlyticsReport report;
    private final File reportFile;
    private final String sessionId;

    public AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport == null) {
            mnd0.m159157a("Null report");
            throw null;
        }
        this.report = crashlyticsReport;
        if (str == null) {
            mnd0.m159157a("Null sessionId");
            throw null;
        }
        this.sessionId = str;
        if (file != null) {
            this.reportFile = file;
        } else {
            mnd0.m159157a("Null reportFile");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReportWithSessionId) {
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
            if (this.report.equals(crashlyticsReportWithSessionId.getReport()) && this.sessionId.equals(crashlyticsReportWithSessionId.getSessionId()) && this.reportFile.equals(crashlyticsReportWithSessionId.getReportFile())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public CrashlyticsReport getReport() {
        return this.report;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public File getReportFile() {
        return this.reportFile;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.reportFile.hashCode() ^ ((((this.report.hashCode() ^ 1000003) * 1000003) ^ this.sessionId.hashCode()) * 1000003);
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.report + ", sessionId=" + this.sessionId + ", reportFile=" + this.reportFile + "}";
    }
}
