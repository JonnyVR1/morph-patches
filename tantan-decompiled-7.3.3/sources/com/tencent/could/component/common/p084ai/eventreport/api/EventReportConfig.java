package com.tencent.could.component.common.p084ai.eventreport.api;

/* JADX INFO: loaded from: classes12.dex */
public class EventReportConfig {
    public static String STRING_INIT = "";

    /* JADX INFO: renamed from: a */
    public String f58087a;

    /* JADX INFO: renamed from: b */
    public String f58088b;

    /* JADX INFO: renamed from: c */
    public String f58089c;

    /* JADX INFO: renamed from: d */
    public String f58090d;

    /* JADX INFO: renamed from: e */
    public String f58091e;

    public static class ConfigBuilder {

        /* JADX INFO: renamed from: a */
        public String f58092a;

        /* JADX INFO: renamed from: b */
        public String f58093b;

        /* JADX INFO: renamed from: c */
        public String f58094c;

        /* JADX INFO: renamed from: d */
        public String f58095d;

        /* JADX INFO: renamed from: e */
        public String f58096e;

        public ConfigBuilder() {
            String str = EventReportConfig.STRING_INIT;
            this.f58092a = str;
            this.f58093b = str;
            this.f58094c = str;
            this.f58095d = str;
            this.f58096e = str;
        }

        public EventReportConfig create() {
            return new EventReportConfig(this);
        }

        public ConfigBuilder setBusiness(String str) {
            this.f58092a = str;
            return this;
        }

        public ConfigBuilder setDeviceInfoUrl(String str) {
            this.f58095d = str;
            return this;
        }

        public ConfigBuilder setErrorInfoUrl(String str) {
            this.f58096e = str;
            return this;
        }

        public ConfigBuilder setOrigin(String str) {
            this.f58094c = str;
            return this;
        }

        public ConfigBuilder setSdkVersion(String str) {
            this.f58093b = str;
            return this;
        }
    }

    public EventReportConfig(ConfigBuilder configBuilder) {
        this.f58087a = configBuilder.f58092a;
        this.f58089c = configBuilder.f58094c;
        this.f58088b = configBuilder.f58093b;
        this.f58090d = configBuilder.f58095d;
        this.f58091e = configBuilder.f58096e;
    }

    public static ConfigBuilder builder() {
        return new ConfigBuilder();
    }

    public String getBusiness() {
        return this.f58087a;
    }

    public String getDeviceInfoUrl() {
        return this.f58090d;
    }

    public String getErrorInfoUrl() {
        return this.f58091e;
    }

    public String getOrigin() {
        return this.f58089c;
    }

    public String getSdkVersion() {
        return this.f58088b;
    }
}
