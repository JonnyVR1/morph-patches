package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p007l.hgw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class HttpTimeoutException extends HttpBaseException {
    private static final long serialVersionUID = 1;

    public HttpTimeoutException() {
        super(hgw.m9333a().getString(R$string.f474c));
    }

    public HttpTimeoutException(String str) {
        super(str);
    }
}
