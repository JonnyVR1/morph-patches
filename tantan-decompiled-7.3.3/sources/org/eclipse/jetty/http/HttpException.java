package org.eclipse.jetty.http;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class HttpException extends IOException {
    String _reason;
    int _status;

    public HttpException(int i, String str, Throwable th) {
        this._status = i;
        this._reason = str;
        initCause(th);
    }

    public String getReason() {
        return this._reason;
    }

    public int getStatus() {
        return this._status;
    }

    public void setReason(String str) {
        this._reason = str;
    }

    public void setStatus(int i) {
        this._status = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "HttpException(" + this._status + Constants.SEPARATOR_COMMA + this._reason + Constants.SEPARATOR_COMMA + super.getCause() + ")";
    }

    public HttpException(int i, String str) {
        this._status = i;
        this._reason = str;
    }

    public HttpException(int i) {
        this._status = i;
        this._reason = null;
    }
}
