package com.tencent.could.component.common.p079ai.eventreport.api;

/* JADX INFO: loaded from: classes2.dex */
public class EventReportConfig {
    public static String STRING_INIT = "";

    /* JADX INFO: renamed from: a */
    public String f57239a;

    /* JADX INFO: renamed from: b */
    public String f57240b;

    /* JADX INFO: renamed from: c */
    public String f57241c;

    /* JADX INFO: renamed from: d */
    public String f57242d;

    /* JADX INFO: renamed from: e */
    public String f57243e;

    public static class ConfigBuilder {

        /* JADX INFO: renamed from: a */
        public String f57244a;

        /* JADX INFO: renamed from: b */
        public String f57245b;

        /* JADX INFO: renamed from: c */
        public String f57246c;

        /* JADX INFO: renamed from: d */
        public String f57247d;

        /* JADX INFO: renamed from: e */
        public String f57248e;

        public ConfigBuilder() {
            String str = EventReportConfig.STRING_INIT;
            this.f57244a = str;
            this.f57245b = str;
            this.f57246c = str;
            this.f57247d = str;
            this.f57248e = str;
        }

        public EventReportConfig create() {
            return new EventReportConfig(this);
        }

        public ConfigBuilder setBusiness(String str) {
            this.f57244a = str;
            return this;
        }

        public ConfigBuilder setDeviceInfoUrl(String str) {
            this.f57247d = str;
            return this;
        }

        public ConfigBuilder setErrorInfoUrl(String str) {
            this.f57248e = str;
            return this;
        }

        public ConfigBuilder setOrigin(String str) {
            this.f57246c = str;
            return this;
        }

        public ConfigBuilder setSdkVersion(String str) {
            this.f57245b = str;
            return this;
        }
    }

    public EventReportConfig(ConfigBuilder configBuilder) {
        this.f57239a = configBuilder.f57244a;
        this.f57241c = configBuilder.f57246c;
        this.f57240b = configBuilder.f57245b;
        this.f57242d = configBuilder.f57247d;
        this.f57243e = configBuilder.f57248e;
    }

    public static ConfigBuilder builder() {
        return new ConfigBuilder();
    }

    public String getBusiness() {
        return this.f57239a;
    }

    public String getDeviceInfoUrl() {
        return this.f57242d;
    }

    public String getErrorInfoUrl() {
        return this.f57243e;
    }

    public String getOrigin() {
        return this.f57241c;
    }

    public String getSdkVersion() {
        return this.f57240b;
    }
}
