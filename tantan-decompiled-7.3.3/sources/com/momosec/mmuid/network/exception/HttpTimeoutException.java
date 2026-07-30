package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p153l.fiw;

/* JADX INFO: loaded from: classes8.dex */
public class HttpTimeoutException extends HttpBaseException {
    private static final long serialVersionUID = 1;

    public HttpTimeoutException() {
        super(fiw.m125761a().getString(R$string.f15494c));
    }

    public HttpTimeoutException(String str) {
        super(str);
    }
}
