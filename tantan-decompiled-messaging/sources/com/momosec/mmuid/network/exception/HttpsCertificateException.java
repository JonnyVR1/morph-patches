package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p149l.hgw;

/* JADX INFO: loaded from: classes8.dex */
public class HttpsCertificateException extends HttpBaseException {
    private static final long serialVersionUID = 1;

    public HttpsCertificateException(Throwable th) {
        super(hgw.m130927a().getString(R$string.f14777e), th);
    }

    public HttpsCertificateException(Throwable th, String str) {
        super(str, th);
    }
}
