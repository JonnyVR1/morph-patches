package com.immomo.http.exception;

import com.clevertap.android.sdk.Constants;
import com.immomo.android.httpbase.R$string;
import p149l.ev0;

/* JADX INFO: loaded from: classes7.dex */
public class HttpResponseStatusErrorException extends HttpBaseException {
    private static final long serialVersionUID = 1;
    public int statusCode;

    public HttpResponseStatusErrorException(int i) {
        super(ev0.m118233a().getString(R$string.f12833a) + "(" + i + ")");
        this.statusCode = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String localizedMessage = getLocalizedMessage();
        return getClass().getName() + ": " + localizedMessage + "[" + this.statusCode + Constants.AES_SUFFIX;
    }

    public HttpResponseStatusErrorException(int i, String str) {
        super(str + "(" + i + ")");
        this.statusCode = i;
    }
}
