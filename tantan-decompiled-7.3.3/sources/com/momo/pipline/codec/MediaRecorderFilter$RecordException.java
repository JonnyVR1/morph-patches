package com.momo.pipline.codec;

/* JADX INFO: loaded from: classes8.dex */
public class MediaRecorderFilter$RecordException extends Exception {
    private ExceptionType exceptionType;

    public enum ExceptionType {
        STOP,
        RECORD,
        PREPARE
    }

    public MediaRecorderFilter$RecordException(Exception exc, ExceptionType exceptionType) {
        super(exc);
        this.exceptionType = exceptionType;
    }

    public ExceptionType getExceptionType() {
        return this.exceptionType;
    }

    public void setExceptionType(ExceptionType exceptionType) {
        this.exceptionType = exceptionType;
    }
}
