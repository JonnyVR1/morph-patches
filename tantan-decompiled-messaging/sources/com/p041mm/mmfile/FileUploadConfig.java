package com.p041mm.mmfile;

/* JADX INFO: loaded from: classes7.dex */
public class FileUploadConfig {
    private static final long DEFAULT_UPLOAD_TIME_SECONDS = 900;
    private boolean deleteAfterUploaded;
    private long uploadClockTimeSeconds;
    private IMMFileUploader uploader;

    public static final class Builder {
        private boolean deleteAfterUploaded = true;
        private long uploadClockTimeSeconds = FileUploadConfig.DEFAULT_UPLOAD_TIME_SECONDS;
        private IMMFileUploader uploader;

        public FileUploadConfig build() {
            return new FileUploadConfig(this);
        }

        public Builder deleteAfterUploaded(boolean z) {
            this.deleteAfterUploaded = z;
            return this;
        }

        public Builder uploadClockTimeSeconds(long j) {
            this.uploadClockTimeSeconds = j;
            return this;
        }

        public Builder uploader(IMMFileUploader iMMFileUploader) {
            this.uploader = iMMFileUploader;
            return this;
        }
    }

    private FileUploadConfig(Builder builder) {
        this.uploader = builder.uploader;
        this.deleteAfterUploaded = builder.deleteAfterUploaded;
        this.uploadClockTimeSeconds = builder.uploadClockTimeSeconds;
    }

    public static long getDefaultUploadTimeSeconds() {
        return DEFAULT_UPLOAD_TIME_SECONDS;
    }

    public long getUploadClockTimeSeconds() {
        return this.uploadClockTimeSeconds;
    }

    public IMMFileUploader getUploader() {
        return this.uploader;
    }

    public boolean isDeleteAfterUploaded() {
        return this.deleteAfterUploaded;
    }

    public void setUploadClockTimeSeconds(long j) {
        this.uploadClockTimeSeconds = j;
    }
}
