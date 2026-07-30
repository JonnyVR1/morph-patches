package com.alibaba.sdk.android.oss;

/* JADX INFO: loaded from: classes.dex */
public class TaskCancelException extends Exception {
    public TaskCancelException(String str) {
        super("[ErrorMessage]: " + str);
    }

    public TaskCancelException() {
    }

    public TaskCancelException(Throwable th) {
        super(th);
    }
}
