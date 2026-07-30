package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import java.util.List;
import p153l.mnd0;
import p153l.xtq0;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
/* JADX INFO: loaded from: classes7.dex */
final class C3189x7e3e3ebd extends CrashlyticsReport.Session.Event.Application.Execution.Thread {
    private final List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
    private final int importance;
    private final String name;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$Builder */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {
        private List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
        private int importance;
        private String name;
        private byte set$0;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread build() {
            String str;
            List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list;
            if (this.set$0 == 1 && (str = this.name) != null && (list = this.frames) != null) {
                return new C3189x7e3e3ebd(str, this.importance, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.name == null) {
                sb.append(" name");
            }
            if ((1 & this.set$0) == 0) {
                sb.append(" importance");
            }
            if (this.frames == null) {
                sb.append(" frames");
            }
            xtq0.m213103a("Missing required properties:", sb);
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setFrames(List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
            if (list != null) {
                this.frames = list;
                return this;
            }
            mnd0.m159157a("Null frames");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setImportance(int i) {
            this.importance = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setName(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            mnd0.m159157a("Null name");
            return null;
        }
    }

    private C3189x7e3e3ebd(String str, int i, List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
        this.name = str;
        this.importance = i;
        this.frames = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
            if (this.name.equals(thread.getName()) && this.importance == thread.getImportance() && this.frames.equals(thread.getFrames())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    @NonNull
    public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.frames;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public int getImportance() {
        return this.importance;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    @NonNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.frames.hashCode() ^ ((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.importance) * 1000003);
    }

    public String toString() {
        return "Thread{name=" + this.name + ", importance=" + this.importance + ", frames=" + this.frames + "}";
    }
}
