package com.tencent.could.huiyansdk.entity;

/* JADX INFO: loaded from: classes2.dex */
public class HostEntity {
    public String backupIp;
    public String mainHost;
    public String secondHost;

    public static class Builder {
        public String backupIp;
        public String mainHost;
        public String secondHost;

        public Builder backupIp(String str) {
            this.backupIp = str;
            return this;
        }

        public HostEntity build() {
            return new HostEntity(this);
        }

        public Builder mainHost(String str) {
            this.mainHost = str;
            return this;
        }

        public Builder secondHost(String str) {
            this.secondHost = str;
            return this;
        }
    }

    public HostEntity(Builder builder) {
        this.mainHost = builder.mainHost;
        this.secondHost = builder.secondHost;
        this.backupIp = builder.backupIp;
    }

    public String getBackupIp() {
        return this.backupIp;
    }

    public String getMainHost() {
        return this.mainHost;
    }

    public String getSecondHost() {
        return this.secondHost;
    }
}
