package com.tencent.could.component.common.p084ai.log;

/* JADX INFO: loaded from: classes12.dex */
public class AiLogConfig {
    public static final String DEFAULT_STRING = "aiLog";
    public String defaultTag;
    public String dirLog;
    public long fileOutTime;
    public boolean isLogCat;
    public boolean isOpen;
    public boolean isUseExternalFile;
    public String logName;
    public int minLevel;
    public boolean recordLogContentOnly;
    public boolean useOriginFileName;

    public static class AiLogConfigBuilder {
        public String defaultTag = AiLogConfig.DEFAULT_STRING;
        public String dirLog = AiLogConfig.DEFAULT_STRING;
        public String logName = AiLogConfig.DEFAULT_STRING;
        public boolean isLogCat = true;
        public boolean isOpen = true;
        public int minLevel = 2;
        public long fileOutTime = 259200000;
        public boolean isUseExternalFile = false;
        public boolean recordLogContentOnly = false;
        public boolean useOriginFileName = false;

        public AiLogConfig create() {
            return new AiLogConfig(this);
        }

        public AiLogConfigBuilder setDefaultTag(String str) {
            this.defaultTag = str;
            return this;
        }

        public AiLogConfigBuilder setDirLog(String str) {
            this.dirLog = str;
            return this;
        }

        public AiLogConfigBuilder setFileOutTime(long j) {
            this.fileOutTime = j;
            return this;
        }

        public AiLogConfigBuilder setLogCat(boolean z) {
            this.isLogCat = z;
            return this;
        }

        public AiLogConfigBuilder setLogName(String str) {
            this.logName = str;
            return this;
        }

        public AiLogConfigBuilder setMinLevel(int i) {
            this.minLevel = i;
            return this;
        }

        public AiLogConfigBuilder setOpen(boolean z) {
            this.isOpen = z;
            return this;
        }

        public AiLogConfigBuilder setRecordLogContentOnly(boolean z) {
            this.recordLogContentOnly = z;
            return this;
        }

        public AiLogConfigBuilder setUseExternalFile(boolean z) {
            this.isUseExternalFile = z;
            return this;
        }

        public AiLogConfigBuilder setUseOriginFileName(boolean z) {
            this.useOriginFileName = z;
            return this;
        }
    }

    public AiLogConfig(AiLogConfigBuilder aiLogConfigBuilder) {
        this.isUseExternalFile = false;
        this.recordLogContentOnly = false;
        this.useOriginFileName = false;
        this.defaultTag = aiLogConfigBuilder.defaultTag;
        this.dirLog = aiLogConfigBuilder.dirLog;
        this.isLogCat = aiLogConfigBuilder.isLogCat;
        this.isOpen = aiLogConfigBuilder.isOpen;
        this.fileOutTime = aiLogConfigBuilder.fileOutTime;
        this.minLevel = aiLogConfigBuilder.minLevel;
        this.logName = aiLogConfigBuilder.logName;
        this.isUseExternalFile = aiLogConfigBuilder.isUseExternalFile;
        this.recordLogContentOnly = aiLogConfigBuilder.recordLogContentOnly;
        this.useOriginFileName = aiLogConfigBuilder.useOriginFileName;
    }

    public String getDefaultTag() {
        return this.defaultTag;
    }

    public String getDirLog() {
        return this.dirLog;
    }

    public long getFileOutTime() {
        return this.fileOutTime;
    }

    public String getLogName() {
        return this.logName;
    }

    public int getMinLevel() {
        return this.minLevel;
    }

    public boolean isLogCat() {
        return this.isLogCat;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public boolean isRecordLogContentOnly() {
        return this.recordLogContentOnly;
    }

    public boolean isUseExternalFile() {
        return this.isUseExternalFile;
    }

    public boolean isUseOriginFileName() {
        return this.useOriginFileName;
    }
}
