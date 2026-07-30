package com.p041mm.mmfile;

import com.p041mm.mmfile.core.FileWriteConfig;

/* JADX INFO: loaded from: classes7.dex */
public class Strategy {
    private String[] businesses;
    private FileUploadConfig fileUploadConfig;
    private FileWriteConfig fileWriteConfig;

    public static final class Builder {
        private String[] businesses;
        private FileUploadConfig fileUploadConfig;
        private FileWriteConfig fileWriteConfig;

        public Strategy build() {
            return new Strategy(this);
        }

        public Builder businesses(String... strArr) {
            this.businesses = strArr;
            return this;
        }

        public Builder fileUploadConfig(FileUploadConfig fileUploadConfig) {
            this.fileUploadConfig = fileUploadConfig;
            return this;
        }

        public Builder fileWriteConfig(FileWriteConfig fileWriteConfig) {
            this.fileWriteConfig = fileWriteConfig;
            return this;
        }
    }

    private Strategy(Builder builder) {
        this.fileUploadConfig = builder.fileUploadConfig;
        this.fileWriteConfig = builder.fileWriteConfig;
        this.businesses = builder.businesses;
    }

    public String[] getBusinesses() {
        return this.businesses;
    }

    public FileUploadConfig getFileUploadConfig() {
        return this.fileUploadConfig;
    }

    public FileWriteConfig getFileWriteConfig() {
        return this.fileWriteConfig;
    }
}
