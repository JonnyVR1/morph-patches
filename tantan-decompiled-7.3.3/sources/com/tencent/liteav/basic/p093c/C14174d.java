package com.tencent.liteav.basic.p093c;

import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14174d extends IOException {
    private static final long serialVersionUID = 2723743254380545567L;
    private final int mErrorCode;
    private final String mErrorMessage;

    public C14174d(int i, String str) {
        this.mErrorCode = i;
        this.mErrorMessage = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.mErrorMessage;
        int i = this.mErrorCode;
        if (str == null) {
            return "EGL error code: " + i;
        }
        return "EGL error code: " + i + this.mErrorMessage;
    }

    public C14174d(int i) {
        this(i, null);
    }
}
