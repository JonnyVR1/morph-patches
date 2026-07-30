package com.p041mm.mmfile.core;

/* JADX INFO: loaded from: classes7.dex */
public class FileWriteConfig {
    private static final long DEFAULT_BUFFER_LENGTH = 307200;
    private static final long DEFAULT_LOG_LENGTH = 1048576;
    private byte bodyWrapperEnd;
    private byte bodyWrapperStart;
    private long bufferLength;
    private String cacheDir;
    private MMLogInfo commonInfo;
    private IMMFileEventListener eventListener;
    private String filePrefix;
    private byte headWrapperEnd;
    private byte headWrapperStart;
    private boolean isCompress;
    private boolean isCrypt;
    private String logDir;
    private long logLengthMax;
    private byte magicCryptCompressStart;
    private byte magicCryptNoCompressStart;
    private byte magicEnd;
    private byte magicNoCryptCompressStart;
    private byte magicNoCryptNoCompressStart;
    private int maxFileCounts;
    private boolean printTipLog2File;

    public static final class Builder {
        private String cacheDir;
        private MMLogInfo commonInfo;
        private IMMFileEventListener eventListener;
        private String filePrefix;
        private boolean isCrypt;
        private String logDir;
        private boolean printTipLog2File;
        private boolean isCompress = true;
        private long bufferLength = FileWriteConfig.DEFAULT_BUFFER_LENGTH;
        private long logLengthMax = 1048576;
        private byte headWrapperStart = 1;
        private byte headWrapperEnd = 4;
        private byte bodyWrapperStart = 2;
        private byte bodyWrapperEnd = 3;
        private byte magicCryptNoCompressStart = 18;
        private byte magicCryptCompressStart = 19;
        private byte magicNoCryptCompressStart = 20;
        private byte magicNoCryptNoCompressStart = 4;
        private byte magicEnd = 0;
        private int maxFileCounts = 0;

        public Builder bodyWrapperEnd(byte b) {
            this.bodyWrapperEnd = b;
            return this;
        }

        public Builder bodyWrapperStart(byte b) {
            this.bodyWrapperStart = b;
            return this;
        }

        public Builder bufferLength(long j) {
            this.bufferLength = j;
            return this;
        }

        public FileWriteConfig build() {
            return new FileWriteConfig(this);
        }

        public Builder cacheDir(String str) {
            this.cacheDir = str;
            return this;
        }

        public Builder commonInfo(MMLogInfo mMLogInfo) {
            this.commonInfo = mMLogInfo;
            return this;
        }

        public Builder eventListener(IMMFileEventListener iMMFileEventListener) {
            this.eventListener = iMMFileEventListener;
            return this;
        }

        public Builder filePrefix(String str) {
            this.filePrefix = str;
            return this;
        }

        public Builder headWrapperEnd(byte b) {
            this.headWrapperEnd = b;
            return this;
        }

        public Builder headWrapperStart(byte b) {
            this.headWrapperStart = b;
            return this;
        }

        public Builder isCompress(boolean z) {
            this.isCompress = z;
            return this;
        }

        public Builder isCrypt(boolean z) {
            this.isCrypt = z;
            return this;
        }

        public Builder logDir(String str) {
            this.logDir = str;
            return this;
        }

        public Builder logLengthMax(long j) {
            this.logLengthMax = j;
            return this;
        }

        public Builder magicCryptCompressStart(byte b) {
            this.magicCryptCompressStart = b;
            return this;
        }

        public Builder magicCryptNoCompressStart(byte b) {
            this.magicCryptNoCompressStart = b;
            return this;
        }

        public Builder magicEnd(byte b) {
            this.magicEnd = b;
            return this;
        }

        public Builder magicNoCryptCompressStart(byte b) {
            this.magicNoCryptCompressStart = b;
            return this;
        }

        public Builder magicNoCryptNoCompressStart(byte b) {
            this.magicNoCryptNoCompressStart = b;
            return this;
        }

        public Builder printTipLog2File(boolean z) {
            this.printTipLog2File = z;
            return this;
        }

        public Builder setMaxFileCounts(int i) {
            this.maxFileCounts = i;
            return this;
        }
    }

    private FileWriteConfig(Builder builder) {
        this.cacheDir = builder.cacheDir;
        this.logDir = builder.logDir;
        this.isCrypt = builder.isCrypt;
        this.isCompress = builder.isCompress;
        this.filePrefix = builder.filePrefix;
        this.bufferLength = builder.bufferLength;
        this.logLengthMax = builder.logLengthMax;
        this.printTipLog2File = builder.printTipLog2File;
        this.headWrapperStart = builder.headWrapperStart;
        this.headWrapperEnd = builder.headWrapperEnd;
        this.bodyWrapperStart = builder.bodyWrapperStart;
        this.bodyWrapperEnd = builder.bodyWrapperEnd;
        this.magicCryptNoCompressStart = builder.magicCryptNoCompressStart;
        this.magicCryptCompressStart = builder.magicCryptCompressStart;
        this.magicNoCryptCompressStart = builder.magicNoCryptCompressStart;
        this.magicNoCryptNoCompressStart = builder.magicNoCryptNoCompressStart;
        this.magicEnd = builder.magicEnd;
        this.commonInfo = builder.commonInfo;
        this.eventListener = builder.eventListener;
        this.maxFileCounts = builder.maxFileCounts;
    }

    public byte getBodyWrapperEnd() {
        return this.bodyWrapperEnd;
    }

    public byte getBodyWrapperStart() {
        return this.bodyWrapperStart;
    }

    public long getBufferLength() {
        return this.bufferLength;
    }

    public String getCacheDir() {
        return this.cacheDir;
    }

    public MMLogInfo getCommonInfo() {
        return this.commonInfo;
    }

    public IMMFileEventListener getEventListener() {
        return this.eventListener;
    }

    public String getFilePrefix() {
        return this.filePrefix;
    }

    public byte getHeadWrapperEnd() {
        return this.headWrapperEnd;
    }

    public byte getHeadWrapperStart() {
        return this.headWrapperStart;
    }

    public String getLogDir() {
        return this.logDir;
    }

    public long getLogLengthMax() {
        return this.logLengthMax;
    }

    public byte getMagicCryptCompressStart() {
        return this.magicCryptCompressStart;
    }

    public byte getMagicCryptNoCompressStart() {
        return this.magicCryptNoCompressStart;
    }

    public byte getMagicEnd() {
        return this.magicEnd;
    }

    public byte getMagicNoCryptCompressStart() {
        return this.magicNoCryptCompressStart;
    }

    public byte getMagicNoCryptNoCompressStart() {
        return this.magicNoCryptNoCompressStart;
    }

    public int getMaxFileCounts() {
        return this.maxFileCounts;
    }

    public boolean isCompress() {
        return this.isCompress;
    }

    public boolean isCrypt() {
        return this.isCrypt;
    }

    public boolean isPrintTipLog2File() {
        return this.printTipLog2File;
    }

    public void updateCommonInfo(MMLogInfo mMLogInfo) {
        this.commonInfo = mMLogInfo;
    }
}
