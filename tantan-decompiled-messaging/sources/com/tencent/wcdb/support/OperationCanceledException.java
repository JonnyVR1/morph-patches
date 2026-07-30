package com.tencent.wcdb.support;

/* JADX INFO: loaded from: classes2.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException(String str) {
        super(str == null ? "The operation has been canceled." : str);
    }

    public OperationCanceledException() {
        this(null);
    }
}
