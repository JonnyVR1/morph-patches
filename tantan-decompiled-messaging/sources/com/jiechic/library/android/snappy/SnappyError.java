package com.jiechic.library.android.snappy;

/* JADX INFO: loaded from: classes7.dex */
public class SnappyError extends Error {
    private static final long serialVersionUID = 1;
    private final SnappyErrorCode errorCode;

    public SnappyError(SnappyErrorCode snappyErrorCode) {
        this.errorCode = snappyErrorCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return String.format("[%s] %s", this.errorCode.name(), super.getMessage());
    }

    public SnappyError(SnappyErrorCode snappyErrorCode, Error error) {
        super(error);
        this.errorCode = snappyErrorCode;
    }

    public SnappyError(SnappyErrorCode snappyErrorCode, String str) {
        super(str);
        this.errorCode = snappyErrorCode;
    }
}
