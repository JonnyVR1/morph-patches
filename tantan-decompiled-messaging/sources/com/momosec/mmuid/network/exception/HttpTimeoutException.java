package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p149l.hgw;

/* JADX INFO: loaded from: classes8.dex */
public class HttpTimeoutException extends HttpBaseException {
    private static final long serialVersionUID = 1;

    public HttpTimeoutException() {
        super(hgw.m130927a().getString(R$string.f14775c));
    }

    public HttpTimeoutException(String str) {
        super(str);
    }
}
